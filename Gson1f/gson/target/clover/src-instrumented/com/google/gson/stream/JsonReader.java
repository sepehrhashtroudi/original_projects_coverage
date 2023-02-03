/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads a JSON (<a href="http://www.ietf.org/rfc/rfc4627.txt">RFC 4627</a>)
 * encoded value as a stream of tokens. This stream includes both literal
 * values (strings, numbers, booleans, and nulls) as well as the begin and
 * end delimiters of objects and arrays. The tokens are traversed in
 * depth-first order, the same order that they appear in the JSON document.
 * Within JSON objects, name/value pairs are represented by a single token.
 *
 * <h3>Parsing JSON</h3>
 * To create a recursive descent parser your own JSON streams, first create an
 * entry point method that creates a {@code JsonReader}.
 *
 * <p>Next, create handler methods for each structure in your JSON text. You'll
 * need a method for each object type and for each array type.
 * <ul>
 *   <li>Within <strong>array handling</strong> methods, first call {@link
 *       #beginArray} to consume the array's opening bracket. Then create a
 *       while loop that accumulates values, terminating when {@link #hasNext}
 *       is false. Finally, read the array's closing bracket by calling {@link
 *       #endArray}.
 *   <li>Within <strong>object handling</strong> methods, first call {@link
 *       #beginObject} to consume the object's opening brace. Then create a
 *       while loop that assigns values to local variables based on their name.
 *       This loop should terminate when {@link #hasNext} is false. Finally,
 *       read the object's closing brace by calling {@link #endObject}.
 * </ul>
 * <p>When a nested object or array is encountered, delegate to the
 * corresponding handler method.
 *
 * <p>When an unknown name is encountered, strict parsers should fail with an
 * exception. Lenient parsers should call {@link #skipValue()} to recursively
 * skip the value's nested tokens, which may otherwise conflict.
 *
 * <p>If a value may be null, you should first check using {@link #peek()}.
 * Null literals can be consumed using either {@link #nextNull()} or {@link
 * #skipValue()}.
 *
 * <h3>Example</h3>
 * Suppose we'd like to parse a stream of messages such as the following: <pre> {@code
 * [
 *   {
 *     "id": 912345678901,
 *     "text": "How do I read a JSON stream in Java?",
 *     "geo": null,
 *     "user": {
 *       "name": "json_newb",
 *       "followers_count": 41
 *      }
 *   },
 *   {
 *     "id": 912345678902,
 *     "text": "@json_newb just use JsonReader!",
 *     "geo": [50.454722, -104.606667],
 *     "user": {
 *       "name": "jesse",
 *       "followers_count": 2
 *     }
 *   }
 * ]}</pre>
 * This code implements the parser for the above structure: <pre>   {@code
 *
 *   public List<Message> readJsonStream(InputStream in) throws IOException {
 *     JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
 *     return readMessagesArray(reader);
 *   }
 *
 *   public List<Message> readMessagesArray(JsonReader reader) throws IOException {
 *     List<Message> messages = new ArrayList<Message>();
 *
 *     reader.beginArray();
 *     while (reader.hasNext()) {
 *       messages.add(readMessage(reader));
 *     }
 *     reader.endArray();
 *     return messages;
 *   }
 *
 *   public Message readMessage(JsonReader reader) throws IOException {
 *     long id = -1;
 *     String text = null;
 *     User user = null;
 *     List<Double> geo = null;
 *
 *     reader.beginObject();
 *     while (reader.hasNext()) {
 *       String name = reader.nextName();
 *       if (name.equals("id")) {
 *         id = reader.nextLong();
 *       } else if (name.equals("text")) {
 *         text = reader.nextString();
 *       } else if (name.equals("geo") && reader.peek() != JsonToken.NULL) {
 *         geo = readDoublesArray(reader);
 *       } else if (name.equals("user")) {
 *         user = readUser(reader);
 *       } else {
 *         reader.skipValue();
 *       }
 *     }
 *     reader.endObject();
 *     return new Message(id, text, user, geo);
 *   }
 *
 *   public List<Double> readDoublesArray(JsonReader reader) throws IOException {
 *     List<Double> doubles = new ArrayList<Double>();
 *
 *     reader.beginArray();
 *     while (reader.hasNext()) {
 *       doubles.add(reader.nextDouble());
 *     }
 *     reader.endArray();
 *     return doubles;
 *   }
 *
 *   public User readUser(JsonReader reader) throws IOException {
 *     String username = null;
 *     int followersCount = -1;
 *
 *     reader.beginObject();
 *     while (reader.hasNext()) {
 *       String name = reader.nextName();
 *       if (name.equals("name")) {
 *         username = reader.nextString();
 *       } else if (name.equals("followers_count")) {
 *         followersCount = reader.nextInt();
 *       } else {
 *         reader.skipValue();
 *       }
 *     }
 *     reader.endObject();
 *     return new User(username, followersCount);
 *   }}</pre>
 *
 * <h3>Number Handling</h3>
 * This reader permits numeric values to be read as strings and string values to
 * be read as numbers. For example, both elements of the JSON array {@code
 * [1, "1"]} may be read using either {@link #nextInt} or {@link #nextString}.
 * This behavior is intended to prevent lossy numeric conversions: double is
 * JavaScript's only numeric type and very large values like {@code
 * 9007199254740993} cannot be represented exactly on that platform. To minimize
 * precision loss, extremely large values should be written and read as strings
 * in JSON.
 *
 * <a name="nonexecuteprefix"/><h3>Non-Execute Prefix</h3>
 * Web servers that serve private data using JSON may be vulnerable to <a
 * href="http://en.wikipedia.org/wiki/JSON#Cross-site_request_forgery">Cross-site
 * request forgery</a> attacks. In such an attack, a malicious site gains access
 * to a private JSON file by executing it with an HTML {@code <script>} tag.
 *
 * <p>Prefixing JSON files with <code>")]}'\n"</code> makes them non-executable
 * by {@code <script>} tags, disarming the attack. Since the prefix is malformed
 * JSON, strict parsing fails when it is encountered. This class permits the
 * non-execute prefix when {@link #setLenient(boolean) lenient parsing} is
 * enabled.
 *
 * <p>Each {@code JsonReader} may be used to read a single JSON stream. Instances
 * of this class are not thread safe.
 *
 * @author Jesse Wilson
 * @since 1.6
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class JsonReader implements Closeable {public static class __CLR4_4_12ei2eilck0y8le{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,3695,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** The only non-execute prefix this parser permits */
  private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();

  /** The input JSON. */
  private final Reader in;

  /** True to accept non-spec compliant JSON */
  private boolean lenient = false;

  /**
   * Use a manual buffer to easily read and unread upcoming characters, and
   * also so we can create strings without an intermediate StringBuilder.
   */
  private final char[] buffer = new char[1024];
  private int pos = 0;
  private int limit = 0;

  private final List<JsonScope> stack = new ArrayList<JsonScope>();
  {try{__CLR4_4_12ei2eilck0y8le.R.inc(3114);
    __CLR4_4_12ei2eilck0y8le.R.inc(3115);push(JsonScope.EMPTY_DOCUMENT);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * True if we've already read the next token. If we have, the string value
   * for that token will be assigned to {@code value} if such a string value
   * exists. And the token type will be assigned to {@code token} if the token
   * type is known. The token type may be null for literals, since we derive
   * that lazily.
   */
  private boolean hasToken;

  /**
   * The type of the next token to be returned by {@link #peek} and {@link
   * #advance}, or {@code null} if it is unknown and must first be derived
   * from {@code value}. This value is undefined if {@code hasToken} is false.
   */
  private JsonToken token;

  /** The text of the next name. */
  private String name;

  /** The text of the next literal value. */
  private String value;

  /** True if we're currently handling a skipValue() call. */
  private boolean skipping = false;

  /**
   * Creates a new instance that reads a JSON-encoded stream from {@code in}.
   */
  public JsonReader(Reader in) {try{__CLR4_4_12ei2eilck0y8le.R.inc(3116);
    __CLR4_4_12ei2eilck0y8le.R.inc(3117);if ((((in == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3118)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3119)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3120);throw new NullPointerException("in == null");
    }
    }__CLR4_4_12ei2eilck0y8le.R.inc(3121);this.in = in;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Configure this parser to be  be liberal in what it accepts. By default,
   * this parser is strict and only accepts JSON as specified by <a
   * href="http://www.ietf.org/rfc/rfc4627.txt">RFC 4627</a>. Setting the
   * parser to lenient causes it to ignore the following syntax errors:
   *
   * <ul>
   *   <li>Streams that start with the <a href="#nonexecuteprefix">non-execute
   *       prefix</a>, <code>")]}'\n"</code>.
   *   <li>Streams that include multiple top-level values. With strict parsing,
   *       each stream must contain exactly one top-level value.
   *   <li>Top-level values of any type. With strict parsing, the top-level
   *       value must be an object or an array.
   *   <li>Numbers may be {@link Double#isNaN() NaNs} or {@link
   *       Double#isInfinite() infinities}.
   *   <li>End of line comments starting with {@code //} or {@code #} and
   *       ending with a newline character.
   *   <li>C-style comments starting with {@code /*} and ending with
   *       {@code *}{@code /}. Such comments may not be nested.
   *   <li>Names that are unquoted or {@code 'single quoted'}.
   *   <li>Strings that are unquoted or {@code 'single quoted'}.
   *   <li>Array elements separated by {@code ;} instead of {@code ,}.
   *   <li>Unnecessary array separators. These are interpreted as if null
   *       was the omitted value.
   *   <li>Names and values separated by {@code =} or {@code =>} instead of
   *       {@code :}.
   *   <li>Name/value pairs separated by {@code ;} instead of {@code ,}.
   * </ul>
   */
  public void setLenient(boolean lenient) {try{__CLR4_4_12ei2eilck0y8le.R.inc(3122);
    __CLR4_4_12ei2eilck0y8le.R.inc(3123);this.lenient = lenient;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns true if this parser is liberal in what it accepts.
   */
  public boolean isLenient() {try{__CLR4_4_12ei2eilck0y8le.R.inc(3124);
    __CLR4_4_12ei2eilck0y8le.R.inc(3125);return lenient;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Consumes the next token from the JSON stream and asserts that it is the
   * beginning of a new array.
   */
  public void beginArray() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3126);
    __CLR4_4_12ei2eilck0y8le.R.inc(3127);expect(JsonToken.BEGIN_ARRAY);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Consumes the next token from the JSON stream and asserts that it is the
   * end of the current array.
   */
  public void endArray() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3128);
    __CLR4_4_12ei2eilck0y8le.R.inc(3129);expect(JsonToken.END_ARRAY);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Consumes the next token from the JSON stream and asserts that it is the
   * beginning of a new object.
   */
  public void beginObject() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3130);
    __CLR4_4_12ei2eilck0y8le.R.inc(3131);expect(JsonToken.BEGIN_OBJECT);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Consumes the next token from the JSON stream and asserts that it is the
   * end of the current array.
   */
  public void endObject() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3132);
    __CLR4_4_12ei2eilck0y8le.R.inc(3133);expect(JsonToken.END_OBJECT);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Consumes {@code expected}.
   */
  private void expect(JsonToken expected) throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3134);
    __CLR4_4_12ei2eilck0y8le.R.inc(3135);quickPeek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3136);if ((((token != expected)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3137)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3138)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3139);throw new IllegalStateException("Expected " + expected + " but was " + peek());
    }
    }__CLR4_4_12ei2eilck0y8le.R.inc(3140);advance();
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns true if the current array or object has another element.
   */
  public boolean hasNext() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3141);
    __CLR4_4_12ei2eilck0y8le.R.inc(3142);quickPeek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3143);return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the type of the next token without consuming it.
   */
  public JsonToken peek() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3144);
    __CLR4_4_12ei2eilck0y8le.R.inc(3145);quickPeek();

    __CLR4_4_12ei2eilck0y8le.R.inc(3146);if ((((token == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3147)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3148)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3149);decodeLiteral();
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3150);return token;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Ensures that a token is ready. After this call either {@code token} or
   * {@code value} will be non-null. To ensure {@code token} has a definitive
   * value, use {@link #peek()}
   */
  private JsonToken quickPeek() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3151);
    __CLR4_4_12ei2eilck0y8le.R.inc(3152);if ((((hasToken)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3153)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3154)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3155);return token;
    }

    }boolean __CLB4_4_1_bool0=false;__CLR4_4_12ei2eilck0y8le.R.inc(3156);switch (peekStack()) {
    case EMPTY_DOCUMENT:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3157);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3158);if ((((lenient)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3159)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3160)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3161);consumeNonExecutePrefix();
      }
      }__CLR4_4_12ei2eilck0y8le.R.inc(3162);replaceTop(JsonScope.NONEMPTY_DOCUMENT);
      __CLR4_4_12ei2eilck0y8le.R.inc(3163);JsonToken firstToken = nextValue();
      __CLR4_4_12ei2eilck0y8le.R.inc(3164);if ((((!lenient && firstToken != JsonToken.BEGIN_ARRAY && firstToken != JsonToken.BEGIN_OBJECT)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3165)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3166)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3167);syntaxError("Expected JSON document to start with '[' or '{'");
      }
      }__CLR4_4_12ei2eilck0y8le.R.inc(3168);return firstToken;
    case EMPTY_ARRAY:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3169);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3170);return nextInArray(true);
    case NONEMPTY_ARRAY:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3171);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3172);return nextInArray(false);
    case EMPTY_OBJECT:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3173);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3174);return nextInObject(true);
    case DANGLING_NAME:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3175);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3176);return objectValue();
    case NONEMPTY_OBJECT:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3177);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3178);return nextInObject(false);
    case NONEMPTY_DOCUMENT:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3179);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3180);try {
        __CLR4_4_12ei2eilck0y8le.R.inc(3181);JsonToken token = nextValue();
        __CLR4_4_12ei2eilck0y8le.R.inc(3182);if ((((lenient)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3183)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3184)==0&false))) {{
          __CLR4_4_12ei2eilck0y8le.R.inc(3185);return token;
        }
        }__CLR4_4_12ei2eilck0y8le.R.inc(3186);throw syntaxError("Expected EOF");
      } catch (EOFException e) {
        __CLR4_4_12ei2eilck0y8le.R.inc(3187);hasToken = true; // TODO: avoid throwing here?
        __CLR4_4_12ei2eilck0y8le.R.inc(3188);return token = JsonToken.END_DOCUMENT;
      }
    case CLOSED:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3189);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3190);throw new IllegalStateException("JsonReader is closed");
    default:if (!__CLB4_4_1_bool0) {__CLR4_4_12ei2eilck0y8le.R.inc(3191);__CLB4_4_1_bool0=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3192);throw new AssertionError();
    }
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Consumes the non-execute prefix if it exists.
   */
  private void consumeNonExecutePrefix() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3193);
    // fast forward through the leading whitespace
    __CLR4_4_12ei2eilck0y8le.R.inc(3194);nextNonWhitespace();
    __CLR4_4_12ei2eilck0y8le.R.inc(3195);pos--;
    
    __CLR4_4_12ei2eilck0y8le.R.inc(3196);if ((((pos + NON_EXECUTE_PREFIX.length > limit && !fillBuffer(NON_EXECUTE_PREFIX.length))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3197)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3198)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3199);return;
    }
    
    }__CLR4_4_12ei2eilck0y8le.R.inc(3200);for (int i = 0; (((i < NON_EXECUTE_PREFIX.length)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3201)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3202)==0&false)); i++) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3203);if ((((buffer[pos + i] != NON_EXECUTE_PREFIX[i])&&(__CLR4_4_12ei2eilck0y8le.R.iget(3204)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3205)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3206);return; // not a security token!
      }
    }}
    
    // we consumed a security token!
    }__CLR4_4_12ei2eilck0y8le.R.inc(3207);pos += NON_EXECUTE_PREFIX.length;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Advances the cursor in the JSON stream to the next token.
   */
  private JsonToken advance() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3208);
    __CLR4_4_12ei2eilck0y8le.R.inc(3209);quickPeek();

    __CLR4_4_12ei2eilck0y8le.R.inc(3210);JsonToken result = token;
    __CLR4_4_12ei2eilck0y8le.R.inc(3211);hasToken = false;
    __CLR4_4_12ei2eilck0y8le.R.inc(3212);token = null;
    __CLR4_4_12ei2eilck0y8le.R.inc(3213);value = null;
    __CLR4_4_12ei2eilck0y8le.R.inc(3214);name = null;
    __CLR4_4_12ei2eilck0y8le.R.inc(3215);return result;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the next token, a {@link JsonToken#NAME property name}, and
   * consumes it.
   *
   * @throws IOException if the next token in the stream is not a property
   *     name.
   */
  public String nextName() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3216);
    __CLR4_4_12ei2eilck0y8le.R.inc(3217);quickPeek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3218);if ((((token != JsonToken.NAME)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3219)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3220)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3221);throw new IllegalStateException("Expected a name but was " + peek());
    }
    }__CLR4_4_12ei2eilck0y8le.R.inc(3222);String result = name;
    __CLR4_4_12ei2eilck0y8le.R.inc(3223);advance();
    __CLR4_4_12ei2eilck0y8le.R.inc(3224);return result;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the {@link JsonToken#STRING string} value of the next token,
   * consuming it. If the next token is a number, this method will return its
   * string form.
   *
   * @throws IllegalStateException if the next token is not a string or if
   *     this reader is closed.
   */
  public String nextString() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3225);
    __CLR4_4_12ei2eilck0y8le.R.inc(3226);peek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3227);if ((((value == null || (token != JsonToken.STRING && token != JsonToken.NUMBER))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3228)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3229)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3230);throw new IllegalStateException("Expected a string but was " + peek());
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3231);String result = value;
    __CLR4_4_12ei2eilck0y8le.R.inc(3232);advance();
    __CLR4_4_12ei2eilck0y8le.R.inc(3233);return result;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the {@link JsonToken#BOOLEAN boolean} value of the next token,
   * consuming it.
   *
   * @throws IllegalStateException if the next token is not a boolean or if
   *     this reader is closed.
   */
  public boolean nextBoolean() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3234);
    __CLR4_4_12ei2eilck0y8le.R.inc(3235);quickPeek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3236);if ((((value == null || token == JsonToken.STRING)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3237)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3238)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3239);throw new IllegalStateException("Expected a boolean but was " + peek());
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3240);boolean result;
    __CLR4_4_12ei2eilck0y8le.R.inc(3241);if ((((value.equalsIgnoreCase("true"))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3242)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3243)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3244);result = true;
    } }else {__CLR4_4_12ei2eilck0y8le.R.inc(3245);if ((((value.equalsIgnoreCase("false"))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3246)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3247)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3248);result = false;
    } }else {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3249);throw new IllegalStateException("Not a boolean: " + value);
    }

    }}__CLR4_4_12ei2eilck0y8le.R.inc(3250);advance();
    __CLR4_4_12ei2eilck0y8le.R.inc(3251);return result;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Consumes the next token from the JSON stream and asserts that it is a
   * literal null.
   *
   * @throws IllegalStateException if the next token is not null or if this
   *     reader is closed.
   */
  public void nextNull() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3252);
    __CLR4_4_12ei2eilck0y8le.R.inc(3253);quickPeek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3254);if ((((value == null || token == JsonToken.STRING)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3255)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3256)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3257);throw new IllegalStateException("Expected null but was " + peek());
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3258);if ((((!value.equalsIgnoreCase("null"))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3259)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3260)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3261);throw new IllegalStateException("Not a null: " + value);
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3262);advance();
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the {@link JsonToken#NUMBER double} value of the next token,
   * consuming it. If the next token is a string, this method will attempt to
   * parse it as a double.
   *
   * @throws IllegalStateException if the next token is not a literal value.
   * @throws NumberFormatException if the next literal value cannot be parsed
   *     as a double, or is non-finite.
   */
  public double nextDouble() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3263);
    __CLR4_4_12ei2eilck0y8le.R.inc(3264);quickPeek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3265);if ((((value == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3266)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3267)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3268);throw new IllegalStateException("Expected a double but was " + peek());
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3269);double result = Double.parseDouble(value);

    __CLR4_4_12ei2eilck0y8le.R.inc(3270);if (((((result >= 1.0d && value.startsWith("0")))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3271)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3272)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3273);throw new NumberFormatException("JSON forbids octal prefixes: " + value);
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3274);if ((((!lenient && (Double.isNaN(result) || Double.isInfinite(result)))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3275)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3276)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3277);throw new NumberFormatException("JSON forbids NaN and infinities: " + value);
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3278);advance();
    __CLR4_4_12ei2eilck0y8le.R.inc(3279);return result;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the {@link JsonToken#NUMBER long} value of the next token,
   * consuming it. If the next token is a string, this method will attempt to
   * parse it as a long. If the next token's numeric value cannot be exactly
   * represented by a Java {@code long}, this method throws.
   *
   * @throws IllegalStateException if the next token is not a literal value.
   * @throws NumberFormatException if the next literal value cannot be parsed
   *     as a number, or exactly represented as a long.
   */
  public long nextLong() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3280);
    __CLR4_4_12ei2eilck0y8le.R.inc(3281);quickPeek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3282);if ((((value == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3283)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3284)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3285);throw new IllegalStateException("Expected a long but was " + peek());
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3286);long result;
    __CLR4_4_12ei2eilck0y8le.R.inc(3287);try {
      __CLR4_4_12ei2eilck0y8le.R.inc(3288);result = Long.parseLong(value);
    } catch (NumberFormatException ignored) {
      __CLR4_4_12ei2eilck0y8le.R.inc(3289);double asDouble = Double.parseDouble(value); // don't catch this NumberFormatException
      __CLR4_4_12ei2eilck0y8le.R.inc(3290);result = (long) asDouble;
      __CLR4_4_12ei2eilck0y8le.R.inc(3291);if (((((double) result != asDouble)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3292)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3293)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3294);throw new NumberFormatException(value);
      }
    }}

    __CLR4_4_12ei2eilck0y8le.R.inc(3295);if ((((result >= 1L && value.startsWith("0"))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3296)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3297)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3298);throw new NumberFormatException("JSON forbids octal prefixes: " + value);
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3299);advance();
    __CLR4_4_12ei2eilck0y8le.R.inc(3300);return result;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the {@link JsonToken#NUMBER int} value of the next token,
   * consuming it. If the next token is a string, this method will attempt to
   * parse it as an int. If the next token's numeric value cannot be exactly
   * represented by a Java {@code int}, this method throws.
   *
   * @throws IllegalStateException if the next token is not a literal value.
   * @throws NumberFormatException if the next literal value cannot be parsed
   *     as a number, or exactly represented as an int.
   */
  public int nextInt() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3301);
    __CLR4_4_12ei2eilck0y8le.R.inc(3302);quickPeek();
    __CLR4_4_12ei2eilck0y8le.R.inc(3303);if ((((value == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3304)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3305)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3306);throw new IllegalStateException("Expected an int but was " + peek());
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3307);int result;
    __CLR4_4_12ei2eilck0y8le.R.inc(3308);try {
      __CLR4_4_12ei2eilck0y8le.R.inc(3309);result = Integer.parseInt(value);
    } catch (NumberFormatException ignored) {
      __CLR4_4_12ei2eilck0y8le.R.inc(3310);double asDouble = Double.parseDouble(value); // don't catch this NumberFormatException
      __CLR4_4_12ei2eilck0y8le.R.inc(3311);result = (int) asDouble;
      __CLR4_4_12ei2eilck0y8le.R.inc(3312);if (((((double) result != asDouble)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3313)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3314)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3315);throw new NumberFormatException(value);
      }
    }}

    __CLR4_4_12ei2eilck0y8le.R.inc(3316);if ((((result >= 1L && value.startsWith("0"))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3317)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3318)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3319);throw new NumberFormatException("JSON forbids octal prefixes: " + value);
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3320);advance();
    __CLR4_4_12ei2eilck0y8le.R.inc(3321);return result;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Closes this JSON reader and the underlying {@link Reader}.
   */
  public void close() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3322);
    __CLR4_4_12ei2eilck0y8le.R.inc(3323);hasToken = false;
    __CLR4_4_12ei2eilck0y8le.R.inc(3324);value = null;
    __CLR4_4_12ei2eilck0y8le.R.inc(3325);token = null;
    __CLR4_4_12ei2eilck0y8le.R.inc(3326);stack.clear();
    __CLR4_4_12ei2eilck0y8le.R.inc(3327);stack.add(JsonScope.CLOSED);
    __CLR4_4_12ei2eilck0y8le.R.inc(3328);in.close();
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Skips the next value recursively. If it is an object or array, all nested
   * elements are skipped. This method is intended for use when the JSON token
   * stream contains unrecognized or unhandled values.
   */
  public void skipValue() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3329);
    __CLR4_4_12ei2eilck0y8le.R.inc(3330);skipping = true;
    __CLR4_4_12ei2eilck0y8le.R.inc(3331);try {
      __CLR4_4_12ei2eilck0y8le.R.inc(3332);int count = 0;
      __CLR4_4_12ei2eilck0y8le.R.inc(3333);do {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3334);JsonToken token = advance();
        __CLR4_4_12ei2eilck0y8le.R.inc(3335);if ((((token == JsonToken.BEGIN_ARRAY || token == JsonToken.BEGIN_OBJECT)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3336)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3337)==0&false))) {{
          __CLR4_4_12ei2eilck0y8le.R.inc(3338);count++;
        } }else {__CLR4_4_12ei2eilck0y8le.R.inc(3339);if ((((token == JsonToken.END_ARRAY || token == JsonToken.END_OBJECT)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3340)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3341)==0&false))) {{
          __CLR4_4_12ei2eilck0y8le.R.inc(3342);count--;
        }
      }}} }while ((((count != 0)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3343)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3344)==0&false)));
    } finally {
      __CLR4_4_12ei2eilck0y8le.R.inc(3345);skipping = false;
    }
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private JsonScope peekStack() {try{__CLR4_4_12ei2eilck0y8le.R.inc(3346);
    __CLR4_4_12ei2eilck0y8le.R.inc(3347);return stack.get(stack.size() - 1);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private JsonScope pop() {try{__CLR4_4_12ei2eilck0y8le.R.inc(3348);
    __CLR4_4_12ei2eilck0y8le.R.inc(3349);return stack.remove(stack.size() - 1);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private void push(JsonScope newTop) {try{__CLR4_4_12ei2eilck0y8le.R.inc(3350);
    __CLR4_4_12ei2eilck0y8le.R.inc(3351);stack.add(newTop);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Replace the value on the top of the stack with the given value.
   */
  private void replaceTop(JsonScope newTop) {try{__CLR4_4_12ei2eilck0y8le.R.inc(3352);
    __CLR4_4_12ei2eilck0y8le.R.inc(3353);stack.set(stack.size() - 1, newTop);
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private JsonToken nextInArray(boolean firstElement) throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3354);
    __CLR4_4_12ei2eilck0y8le.R.inc(3355);if ((((firstElement)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3356)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3357)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3358);replaceTop(JsonScope.NONEMPTY_ARRAY);
    } }else {{
      /* Look for a comma before each element after the first element. */
      boolean __CLB4_4_1_bool1=false;__CLR4_4_12ei2eilck0y8le.R.inc(3359);switch (nextNonWhitespace()) {
      case ']':if (!__CLB4_4_1_bool1) {__CLR4_4_12ei2eilck0y8le.R.inc(3360);__CLB4_4_1_bool1=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3361);pop();
        __CLR4_4_12ei2eilck0y8le.R.inc(3362);hasToken = true;
        __CLR4_4_12ei2eilck0y8le.R.inc(3363);return token = JsonToken.END_ARRAY;
      case ';':if (!__CLB4_4_1_bool1) {__CLR4_4_12ei2eilck0y8le.R.inc(3364);__CLB4_4_1_bool1=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3365);checkLenient(); // fall-through
      case ',':if (!__CLB4_4_1_bool1) {__CLR4_4_12ei2eilck0y8le.R.inc(3366);__CLB4_4_1_bool1=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3367);break;
      default:if (!__CLB4_4_1_bool1) {__CLR4_4_12ei2eilck0y8le.R.inc(3368);__CLB4_4_1_bool1=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3369);throw syntaxError("Unterminated array");
      }
    }

    }boolean __CLB4_4_1_bool2=false;__CLR4_4_12ei2eilck0y8le.R.inc(3370);switch (nextNonWhitespace()) {
    case ']':if (!__CLB4_4_1_bool2) {__CLR4_4_12ei2eilck0y8le.R.inc(3371);__CLB4_4_1_bool2=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3372);if ((((firstElement)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3373)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3374)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3375);pop();
        __CLR4_4_12ei2eilck0y8le.R.inc(3376);hasToken = true;
        __CLR4_4_12ei2eilck0y8le.R.inc(3377);return token = JsonToken.END_ARRAY;
      }
      // fall-through to handle ",]"
    }case ';':if (!__CLB4_4_1_bool2) {__CLR4_4_12ei2eilck0y8le.R.inc(3378);__CLB4_4_1_bool2=true;}
    case ',':if (!__CLB4_4_1_bool2) {__CLR4_4_12ei2eilck0y8le.R.inc(3379);__CLB4_4_1_bool2=true;}
      /* In lenient mode, a 0-length literal means 'null' */
      __CLR4_4_12ei2eilck0y8le.R.inc(3380);checkLenient();
      __CLR4_4_12ei2eilck0y8le.R.inc(3381);pos--;
      __CLR4_4_12ei2eilck0y8le.R.inc(3382);hasToken = true;
      __CLR4_4_12ei2eilck0y8le.R.inc(3383);value = "null";
      __CLR4_4_12ei2eilck0y8le.R.inc(3384);return token = JsonToken.NULL;
    default:if (!__CLB4_4_1_bool2) {__CLR4_4_12ei2eilck0y8le.R.inc(3385);__CLB4_4_1_bool2=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3386);pos--;
      __CLR4_4_12ei2eilck0y8le.R.inc(3387);return nextValue();
    }
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private JsonToken nextInObject(boolean firstElement) throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3388);
    /*
     * Read delimiters. Either a comma/semicolon separating this and the
     * previous name-value pair, or a close brace to denote the end of the
     * object.
     */
    __CLR4_4_12ei2eilck0y8le.R.inc(3389);if ((((firstElement)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3390)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3391)==0&false))) {{
      /* Peek to see if this is the empty object. */
      boolean __CLB4_4_1_bool3=false;__CLR4_4_12ei2eilck0y8le.R.inc(3392);switch (nextNonWhitespace()) {
      case '}':if (!__CLB4_4_1_bool3) {__CLR4_4_12ei2eilck0y8le.R.inc(3393);__CLB4_4_1_bool3=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3394);pop();
        __CLR4_4_12ei2eilck0y8le.R.inc(3395);hasToken = true;
        __CLR4_4_12ei2eilck0y8le.R.inc(3396);return token = JsonToken.END_OBJECT;
      default:if (!__CLB4_4_1_bool3) {__CLR4_4_12ei2eilck0y8le.R.inc(3397);__CLB4_4_1_bool3=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3398);pos--;
      }
    } }else {{
      boolean __CLB4_4_1_bool4=false;__CLR4_4_12ei2eilck0y8le.R.inc(3399);switch (nextNonWhitespace()) {
      case '}':if (!__CLB4_4_1_bool4) {__CLR4_4_12ei2eilck0y8le.R.inc(3400);__CLB4_4_1_bool4=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3401);pop();
        __CLR4_4_12ei2eilck0y8le.R.inc(3402);hasToken = true;
        __CLR4_4_12ei2eilck0y8le.R.inc(3403);return token = JsonToken.END_OBJECT;
      case ';':if (!__CLB4_4_1_bool4) {__CLR4_4_12ei2eilck0y8le.R.inc(3404);__CLB4_4_1_bool4=true;}
      case ',':if (!__CLB4_4_1_bool4) {__CLR4_4_12ei2eilck0y8le.R.inc(3405);__CLB4_4_1_bool4=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3406);break;
      default:if (!__CLB4_4_1_bool4) {__CLR4_4_12ei2eilck0y8le.R.inc(3407);__CLB4_4_1_bool4=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3408);throw syntaxError("Unterminated object");
      }
    }

    /* Read the name. */
    }__CLR4_4_12ei2eilck0y8le.R.inc(3409);int quote = nextNonWhitespace();
    boolean __CLB4_4_1_bool5=false;__CLR4_4_12ei2eilck0y8le.R.inc(3410);switch (quote) {
    case '\'':if (!__CLB4_4_1_bool5) {__CLR4_4_12ei2eilck0y8le.R.inc(3411);__CLB4_4_1_bool5=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3412);checkLenient(); // fall-through
    case '"':if (!__CLB4_4_1_bool5) {__CLR4_4_12ei2eilck0y8le.R.inc(3413);__CLB4_4_1_bool5=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3414);name = nextString((char) quote);
      __CLR4_4_12ei2eilck0y8le.R.inc(3415);break;
    default:if (!__CLB4_4_1_bool5) {__CLR4_4_12ei2eilck0y8le.R.inc(3416);__CLB4_4_1_bool5=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3417);checkLenient();
      __CLR4_4_12ei2eilck0y8le.R.inc(3418);pos--;
      __CLR4_4_12ei2eilck0y8le.R.inc(3419);name = nextLiteral();
      __CLR4_4_12ei2eilck0y8le.R.inc(3420);if ((((name.length() == 0)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3421)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3422)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3423);throw syntaxError("Expected name");
      }
    }}

    __CLR4_4_12ei2eilck0y8le.R.inc(3424);replaceTop(JsonScope.DANGLING_NAME);
    __CLR4_4_12ei2eilck0y8le.R.inc(3425);hasToken = true;
    __CLR4_4_12ei2eilck0y8le.R.inc(3426);return token = JsonToken.NAME;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private JsonToken objectValue() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3427);
    /*
     * Read the name/value separator. Usually a colon ':'. In lenient mode
     * we also accept an equals sign '=', or an arrow "=>".
     */
    boolean __CLB4_4_1_bool6=false;__CLR4_4_12ei2eilck0y8le.R.inc(3428);switch (nextNonWhitespace()) {
    case ':':if (!__CLB4_4_1_bool6) {__CLR4_4_12ei2eilck0y8le.R.inc(3429);__CLB4_4_1_bool6=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3430);break;
    case '=':if (!__CLB4_4_1_bool6) {__CLR4_4_12ei2eilck0y8le.R.inc(3431);__CLB4_4_1_bool6=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3432);checkLenient();
      __CLR4_4_12ei2eilck0y8le.R.inc(3433);if (((((pos < limit || fillBuffer(1)) && buffer[pos] == '>')&&(__CLR4_4_12ei2eilck0y8le.R.iget(3434)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3435)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3436);pos++;
      }
      }__CLR4_4_12ei2eilck0y8le.R.inc(3437);break;
    default:if (!__CLB4_4_1_bool6) {__CLR4_4_12ei2eilck0y8le.R.inc(3438);__CLB4_4_1_bool6=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3439);throw syntaxError("Expected ':'");
    }

    __CLR4_4_12ei2eilck0y8le.R.inc(3440);replaceTop(JsonScope.NONEMPTY_OBJECT);
    __CLR4_4_12ei2eilck0y8le.R.inc(3441);return nextValue();
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private JsonToken nextValue() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3442);
    __CLR4_4_12ei2eilck0y8le.R.inc(3443);int c = nextNonWhitespace();
    boolean __CLB4_4_1_bool7=false;__CLR4_4_12ei2eilck0y8le.R.inc(3444);switch (c) {
    case '{':if (!__CLB4_4_1_bool7) {__CLR4_4_12ei2eilck0y8le.R.inc(3445);__CLB4_4_1_bool7=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3446);push(JsonScope.EMPTY_OBJECT);
      __CLR4_4_12ei2eilck0y8le.R.inc(3447);hasToken = true;
      __CLR4_4_12ei2eilck0y8le.R.inc(3448);return token = JsonToken.BEGIN_OBJECT;

    case '[':if (!__CLB4_4_1_bool7) {__CLR4_4_12ei2eilck0y8le.R.inc(3449);__CLB4_4_1_bool7=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3450);push(JsonScope.EMPTY_ARRAY);
      __CLR4_4_12ei2eilck0y8le.R.inc(3451);hasToken = true;
      __CLR4_4_12ei2eilck0y8le.R.inc(3452);return token = JsonToken.BEGIN_ARRAY;

    case '\'':if (!__CLB4_4_1_bool7) {__CLR4_4_12ei2eilck0y8le.R.inc(3453);__CLB4_4_1_bool7=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3454);checkLenient(); // fall-through
    case '"':if (!__CLB4_4_1_bool7) {__CLR4_4_12ei2eilck0y8le.R.inc(3455);__CLB4_4_1_bool7=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3456);value = nextString((char) c);
      __CLR4_4_12ei2eilck0y8le.R.inc(3457);hasToken = true;
      __CLR4_4_12ei2eilck0y8le.R.inc(3458);return token = JsonToken.STRING;

    default:if (!__CLB4_4_1_bool7) {__CLR4_4_12ei2eilck0y8le.R.inc(3459);__CLB4_4_1_bool7=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3460);pos--;
      __CLR4_4_12ei2eilck0y8le.R.inc(3461);return readLiteral();
    }
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns true once {@code limit - pos >= minimum}. If the data is
   * exhausted before that many characters are available, this returns
   * false.
   */
  private boolean fillBuffer(int minimum) throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3462);
    __CLR4_4_12ei2eilck0y8le.R.inc(3463);if ((((limit != pos)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3464)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3465)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3466);limit -= pos;
      __CLR4_4_12ei2eilck0y8le.R.inc(3467);System.arraycopy(buffer, pos, buffer, 0, limit);
    } }else {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3468);limit = 0;
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3469);pos = 0;
    __CLR4_4_12ei2eilck0y8le.R.inc(3470);int total;
    __CLR4_4_12ei2eilck0y8le.R.inc(3471);while ((total = in.read(buffer, limit, buffer.length - limit)) != -1) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3474);limit += total;
      __CLR4_4_12ei2eilck0y8le.R.inc(3475);if ((((limit >= minimum)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3476)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3477)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3478);return true;
      }
    }}
    }__CLR4_4_12ei2eilck0y8le.R.inc(3479);return false;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private int nextNonWhitespace() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3480);
    __CLR4_4_12ei2eilck0y8le.R.inc(3481);while ((((pos < limit || fillBuffer(1))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3482)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3483)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3484);int c = buffer[pos++];
      boolean __CLB4_4_1_bool8=false;__CLR4_4_12ei2eilck0y8le.R.inc(3485);switch (c) {
      case '\t':if (!__CLB4_4_1_bool8) {__CLR4_4_12ei2eilck0y8le.R.inc(3486);__CLB4_4_1_bool8=true;}
      case ' ':if (!__CLB4_4_1_bool8) {__CLR4_4_12ei2eilck0y8le.R.inc(3487);__CLB4_4_1_bool8=true;}
      case '\n':if (!__CLB4_4_1_bool8) {__CLR4_4_12ei2eilck0y8le.R.inc(3488);__CLB4_4_1_bool8=true;}
      case '\r':if (!__CLB4_4_1_bool8) {__CLR4_4_12ei2eilck0y8le.R.inc(3489);__CLB4_4_1_bool8=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3490);continue;

      case '/':if (!__CLB4_4_1_bool8) {__CLR4_4_12ei2eilck0y8le.R.inc(3491);__CLB4_4_1_bool8=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3492);if ((((pos == limit && !fillBuffer(1))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3493)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3494)==0&false))) {{
          __CLR4_4_12ei2eilck0y8le.R.inc(3495);return c;
        }

        }__CLR4_4_12ei2eilck0y8le.R.inc(3496);checkLenient();
        __CLR4_4_12ei2eilck0y8le.R.inc(3497);char peek = buffer[pos];
        boolean __CLB4_4_1_bool9=false;__CLR4_4_12ei2eilck0y8le.R.inc(3498);switch (peek) {
        case '*':if (!__CLB4_4_1_bool9) {__CLR4_4_12ei2eilck0y8le.R.inc(3499);__CLB4_4_1_bool9=true;}
          // skip a /* c-style comment */
          __CLR4_4_12ei2eilck0y8le.R.inc(3500);pos++;
          __CLR4_4_12ei2eilck0y8le.R.inc(3501);if ((((!skipTo("*/"))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3502)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3503)==0&false))) {{
            __CLR4_4_12ei2eilck0y8le.R.inc(3504);throw syntaxError("Unterminated comment");
          }
          }__CLR4_4_12ei2eilck0y8le.R.inc(3505);pos += 2;
          __CLR4_4_12ei2eilck0y8le.R.inc(3506);continue;

        case '/':if (!__CLB4_4_1_bool9) {__CLR4_4_12ei2eilck0y8le.R.inc(3507);__CLB4_4_1_bool9=true;}
          // skip a // end-of-line comment
          __CLR4_4_12ei2eilck0y8le.R.inc(3508);pos++;
          __CLR4_4_12ei2eilck0y8le.R.inc(3509);skipToEndOfLine();
          __CLR4_4_12ei2eilck0y8le.R.inc(3510);continue;

        default:if (!__CLB4_4_1_bool9) {__CLR4_4_12ei2eilck0y8le.R.inc(3511);__CLB4_4_1_bool9=true;}
          __CLR4_4_12ei2eilck0y8le.R.inc(3512);return c;
        }

      case '#':if (!__CLB4_4_1_bool8) {__CLR4_4_12ei2eilck0y8le.R.inc(3513);__CLB4_4_1_bool8=true;}
        /*
         * Skip a # hash end-of-line comment. The JSON RFC doesn't
         * specify this behaviour, but it's required to parse
         * existing documents. See http://b/2571423.
         */
        __CLR4_4_12ei2eilck0y8le.R.inc(3514);checkLenient();
        __CLR4_4_12ei2eilck0y8le.R.inc(3515);skipToEndOfLine();
        __CLR4_4_12ei2eilck0y8le.R.inc(3516);continue;

      default:if (!__CLB4_4_1_bool8) {__CLR4_4_12ei2eilck0y8le.R.inc(3517);__CLB4_4_1_bool8=true;}
        __CLR4_4_12ei2eilck0y8le.R.inc(3518);return c;
      }
    }
    }__CLR4_4_12ei2eilck0y8le.R.inc(3519);throw new EOFException("End of input");
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private void checkLenient() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3520);
    __CLR4_4_12ei2eilck0y8le.R.inc(3521);if ((((!lenient)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3522)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3523)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3524);throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
  }}finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Advances the position until after the next newline character. If the line
   * is terminated by "\r\n", the '\n' must be consumed as whitespace by the
   * caller.
   */
  private void skipToEndOfLine() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3525);
    __CLR4_4_12ei2eilck0y8le.R.inc(3526);while ((((pos < limit || fillBuffer(1))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3527)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3528)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3529);char c = buffer[pos++];
      __CLR4_4_12ei2eilck0y8le.R.inc(3530);if ((((c == '\r' || c == '\n')&&(__CLR4_4_12ei2eilck0y8le.R.iget(3531)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3532)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3533);break;
      }
    }}
  }}finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private boolean skipTo(String toFind) throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3534);
    __CLR4_4_12ei2eilck0y8le.R.inc(3535);outer:
    for (; (((pos + toFind.length() < limit || fillBuffer(toFind.length()))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3536)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3537)==0&false)); pos++) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3538);for (int c = 0; (((c < toFind.length())&&(__CLR4_4_12ei2eilck0y8le.R.iget(3539)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3540)==0&false)); c++) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3541);if ((((buffer[pos + c] != toFind.charAt(c))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3542)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3543)==0&false))) {{
          __CLR4_4_12ei2eilck0y8le.R.inc(3544);continue outer;
        }
      }}
      }__CLR4_4_12ei2eilck0y8le.R.inc(3545);return true;
    }
    }__CLR4_4_12ei2eilck0y8le.R.inc(3546);return false;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the string up to but not including {@code quote}, unescaping any
   * character escape sequences encountered along the way. The opening quote
   * should have already been read. This consumes the closing quote, but does
   * not include it in the returned string.
   *
   * @param quote either ' or ".
   * @throws NumberFormatException if any unicode escape sequences are
   *     malformed.
   */
  private String nextString(char quote) throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3547);
    __CLR4_4_12ei2eilck0y8le.R.inc(3548);StringBuilder builder = null;
    __CLR4_4_12ei2eilck0y8le.R.inc(3549);do {{
      /* the index of the first character not yet appended to the builder. */
      __CLR4_4_12ei2eilck0y8le.R.inc(3550);int start = pos;
      __CLR4_4_12ei2eilck0y8le.R.inc(3551);while ((((pos < limit)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3552)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3553)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3554);int c = buffer[pos++];

        __CLR4_4_12ei2eilck0y8le.R.inc(3555);if ((((c == quote)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3556)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3557)==0&false))) {{
          __CLR4_4_12ei2eilck0y8le.R.inc(3558);if ((((skipping)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3559)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3560)==0&false))) {{
            __CLR4_4_12ei2eilck0y8le.R.inc(3561);return "skipped!";
          } }else {__CLR4_4_12ei2eilck0y8le.R.inc(3562);if ((((builder == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3563)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3564)==0&false))) {{
            __CLR4_4_12ei2eilck0y8le.R.inc(3565);return new String(buffer, start, pos - start - 1);
          } }else {{
            __CLR4_4_12ei2eilck0y8le.R.inc(3566);builder.append(buffer, start, pos - start - 1);
            __CLR4_4_12ei2eilck0y8le.R.inc(3567);return builder.toString();
          }

        }}} }else {__CLR4_4_12ei2eilck0y8le.R.inc(3568);if ((((c == '\\')&&(__CLR4_4_12ei2eilck0y8le.R.iget(3569)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3570)==0&false))) {{
          __CLR4_4_12ei2eilck0y8le.R.inc(3571);if ((((builder == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3572)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3573)==0&false))) {{
            __CLR4_4_12ei2eilck0y8le.R.inc(3574);builder = new StringBuilder();
          }
          }__CLR4_4_12ei2eilck0y8le.R.inc(3575);builder.append(buffer, start, pos - start - 1);
          __CLR4_4_12ei2eilck0y8le.R.inc(3576);builder.append(readEscapeCharacter());
          __CLR4_4_12ei2eilck0y8le.R.inc(3577);start = pos;
        }
      }}}

      }__CLR4_4_12ei2eilck0y8le.R.inc(3578);if ((((builder == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3579)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3580)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3581);builder = new StringBuilder();
      }
      }__CLR4_4_12ei2eilck0y8le.R.inc(3582);builder.append(buffer, start, pos - start);
    } }while ((((fillBuffer(1))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3583)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3584)==0&false)));

    __CLR4_4_12ei2eilck0y8le.R.inc(3585);throw syntaxError("Unterminated string");
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Returns the string up to but not including any delimiter characters. This
   * does not consume the delimiter character.
   */
  private String nextLiteral() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3586);
    __CLR4_4_12ei2eilck0y8le.R.inc(3587);StringBuilder builder = null;
    __CLR4_4_12ei2eilck0y8le.R.inc(3588);do {{
      /* the index of the first character not yet appended to the builder. */
      __CLR4_4_12ei2eilck0y8le.R.inc(3589);int start = pos;
      __CLR4_4_12ei2eilck0y8le.R.inc(3590);while ((((pos < limit)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3591)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3592)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3593);int c = buffer[pos++];
        boolean __CLB4_4_1_bool10=false;__CLR4_4_12ei2eilck0y8le.R.inc(3594);switch (c) {
        case '/':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3595);__CLB4_4_1_bool10=true;}
        case '\\':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3596);__CLB4_4_1_bool10=true;}
        case ';':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3597);__CLB4_4_1_bool10=true;}
        case '#':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3598);__CLB4_4_1_bool10=true;}
        case '=':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3599);__CLB4_4_1_bool10=true;}
          __CLR4_4_12ei2eilck0y8le.R.inc(3600);checkLenient(); // fall-through

        case '{':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3601);__CLB4_4_1_bool10=true;}
        case '}':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3602);__CLB4_4_1_bool10=true;}
        case '[':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3603);__CLB4_4_1_bool10=true;}
        case ']':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3604);__CLB4_4_1_bool10=true;}
        case ':':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3605);__CLB4_4_1_bool10=true;}
        case ',':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3606);__CLB4_4_1_bool10=true;}
        case ' ':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3607);__CLB4_4_1_bool10=true;}
        case '\t':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3608);__CLB4_4_1_bool10=true;}
        case '\f':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3609);__CLB4_4_1_bool10=true;}
        case '\r':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3610);__CLB4_4_1_bool10=true;}
        case '\n':if (!__CLB4_4_1_bool10) {__CLR4_4_12ei2eilck0y8le.R.inc(3611);__CLB4_4_1_bool10=true;}
          __CLR4_4_12ei2eilck0y8le.R.inc(3612);pos--;
          __CLR4_4_12ei2eilck0y8le.R.inc(3613);if ((((skipping)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3614)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3615)==0&false))) {{
            __CLR4_4_12ei2eilck0y8le.R.inc(3616);return "skipped!";
          } }else {__CLR4_4_12ei2eilck0y8le.R.inc(3617);if ((((builder == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3618)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3619)==0&false))) {{
            __CLR4_4_12ei2eilck0y8le.R.inc(3620);return new String(buffer, start, pos - start);
          } }else {{
            __CLR4_4_12ei2eilck0y8le.R.inc(3621);builder.append(buffer, start, pos - start);
            __CLR4_4_12ei2eilck0y8le.R.inc(3622);return builder.toString();
          }
        }}}
      }

      }__CLR4_4_12ei2eilck0y8le.R.inc(3623);if ((((builder == null)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3624)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3625)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3626);builder = new StringBuilder();
      }
      }__CLR4_4_12ei2eilck0y8le.R.inc(3627);builder.append(buffer, start, pos - start);
    } }while ((((fillBuffer(1))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3628)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3629)==0&false)));

    __CLR4_4_12ei2eilck0y8le.R.inc(3630);return builder.toString();
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  @Override public String toString() {try{__CLR4_4_12ei2eilck0y8le.R.inc(3631);
    __CLR4_4_12ei2eilck0y8le.R.inc(3632);return getClass().getSimpleName() + " near " + getSnippet();
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Unescapes the character identified by the character or characters that
   * immediately follow a backslash. The backslash '\' should have already
   * been read. This supports both unicode escapes "u000A" and two-character
   * escapes "\n".
   *
   * @throws NumberFormatException if any unicode escape sequences are
   *     malformed.
   */
  private char readEscapeCharacter() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3633);
    __CLR4_4_12ei2eilck0y8le.R.inc(3634);if ((((pos == limit && !fillBuffer(1))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3635)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3636)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3637);throw syntaxError("Unterminated escape sequence");
    }

    }__CLR4_4_12ei2eilck0y8le.R.inc(3638);char escaped = buffer[pos++];
    boolean __CLB4_4_1_bool11=false;__CLR4_4_12ei2eilck0y8le.R.inc(3639);switch (escaped) {
    case 'u':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3640);__CLB4_4_1_bool11=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3641);if ((((pos + 4 > limit && !fillBuffer(4))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3642)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3643)==0&false))) {{
        __CLR4_4_12ei2eilck0y8le.R.inc(3644);throw syntaxError("Unterminated escape sequence");
      }
      }__CLR4_4_12ei2eilck0y8le.R.inc(3645);String hex = new String(buffer, pos, 4);
      __CLR4_4_12ei2eilck0y8le.R.inc(3646);pos += 4;
      __CLR4_4_12ei2eilck0y8le.R.inc(3647);return (char) Integer.parseInt(hex, 16);

    case 't':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3648);__CLB4_4_1_bool11=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3649);return '\t';

    case 'b':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3650);__CLB4_4_1_bool11=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3651);return '\b';

    case 'n':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3652);__CLB4_4_1_bool11=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3653);return '\n';

    case 'r':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3654);__CLB4_4_1_bool11=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3655);return '\r';

    case 'f':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3656);__CLB4_4_1_bool11=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3657);return '\f';

    case '\'':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3658);__CLB4_4_1_bool11=true;}
    case '"':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3659);__CLB4_4_1_bool11=true;}
    case '\\':if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3660);__CLB4_4_1_bool11=true;}
    default:if (!__CLB4_4_1_bool11) {__CLR4_4_12ei2eilck0y8le.R.inc(3661);__CLB4_4_1_bool11=true;}
      __CLR4_4_12ei2eilck0y8le.R.inc(3662);return escaped;
    }
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Reads a null, boolean, numeric or unquoted string literal value.
   */
  private JsonToken readLiteral() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3663);
    __CLR4_4_12ei2eilck0y8le.R.inc(3664);String literal = nextLiteral();
    __CLR4_4_12ei2eilck0y8le.R.inc(3665);if ((((literal.length() == 0)&&(__CLR4_4_12ei2eilck0y8le.R.iget(3666)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3667)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3668);throw syntaxError("Expected literal value");
    }
    }__CLR4_4_12ei2eilck0y8le.R.inc(3669);value = literal;
    __CLR4_4_12ei2eilck0y8le.R.inc(3670);hasToken = true;
    __CLR4_4_12ei2eilck0y8le.R.inc(3671);return token = null; // use decodeLiteral() to get the token type
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Assigns {@code nextToken} based on the value of {@code nextValue}.
   */
  private void decodeLiteral() throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3672);
    __CLR4_4_12ei2eilck0y8le.R.inc(3673);if ((((value.equalsIgnoreCase("null"))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3674)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3675)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3676);token = JsonToken.NULL;
    } }else {__CLR4_4_12ei2eilck0y8le.R.inc(3677);if ((((value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false"))&&(__CLR4_4_12ei2eilck0y8le.R.iget(3678)!=0|true))||(__CLR4_4_12ei2eilck0y8le.R.iget(3679)==0&false))) {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3680);token = JsonToken.BOOLEAN;
    } }else {{
      __CLR4_4_12ei2eilck0y8le.R.inc(3681);try {
        __CLR4_4_12ei2eilck0y8le.R.inc(3682);Double.parseDouble(value); // this work could potentially be cached
        __CLR4_4_12ei2eilck0y8le.R.inc(3683);token = JsonToken.NUMBER;
      } catch (NumberFormatException ignored) {
        // this must be an unquoted string
        __CLR4_4_12ei2eilck0y8le.R.inc(3684);checkLenient();
        __CLR4_4_12ei2eilck0y8le.R.inc(3685);token = JsonToken.STRING;
      }
    }
  }}}finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  /**
   * Throws a new IO exception with the given message and a context snippet
   * with this reader's content.
   */
  private IOException syntaxError(String message) throws IOException {try{__CLR4_4_12ei2eilck0y8le.R.inc(3686);
    __CLR4_4_12ei2eilck0y8le.R.inc(3687);throw new MalformedJsonException(message + " near " + getSnippet());
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}

  private CharSequence getSnippet() {try{__CLR4_4_12ei2eilck0y8le.R.inc(3688);
    __CLR4_4_12ei2eilck0y8le.R.inc(3689);StringBuilder snippet = new StringBuilder();
    __CLR4_4_12ei2eilck0y8le.R.inc(3690);int beforePos = Math.min(pos, 20);
    __CLR4_4_12ei2eilck0y8le.R.inc(3691);snippet.append(buffer, pos - beforePos, beforePos);
    __CLR4_4_12ei2eilck0y8le.R.inc(3692);int afterPos = Math.min(limit - pos, 20);
    __CLR4_4_12ei2eilck0y8le.R.inc(3693);snippet.append(buffer, pos, afterPos);
    __CLR4_4_12ei2eilck0y8le.R.inc(3694);return snippet;
  }finally{__CLR4_4_12ei2eilck0y8le.R.flushNeeded();}}
}
