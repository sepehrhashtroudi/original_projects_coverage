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
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Writes a JSON (<a href="http://www.ietf.org/rfc/rfc4627.txt">RFC 4627</a>)
 * encoded value to a stream, one token at a time. The stream includes both
 * literal values (strings, numbers, booleans and nulls) as well as the begin
 * and end delimiters of objects and arrays.
 *
 * <h3>Encoding JSON</h3>
 * To encode your data as JSON, create a new {@code JsonWriter}. Each JSON
 * document must contain one top-level array or object. Call methods on the
 * writer as you walk the structure's contents, nesting arrays and objects as
 * necessary:
 * <ul>
 *   <li>To write <strong>arrays</strong>, first call {@link #beginArray()}.
 *       Write each of the array's elements with the appropriate {@link #value}
 *       methods or by nesting other arrays and objects. Finally close the array
 *       using {@link #endArray()}.
 *   <li>To write <strong>objects</strong>, first call {@link #beginObject()}.
 *       Write each of the object's properties by alternating calls to
 *       {@link #name} with the property's value. Write property values with the
 *       appropriate {@link #value} method or by nesting other objects or arrays.
 *       Finally close the object using {@link #endObject()}.
 * </ul>
 *
 * <h3>Example</h3>
 * Suppose we'd like to encode a stream of messages such as the following: <pre> {@code
 * [
 *   {
 *     "id": 912345678901,
 *     "text": "How do I stream JSON in Java?",
 *     "geo": null,
 *     "user": {
 *       "name": "json_newb",
 *       "followers_count": 41
 *      }
 *   },
 *   {
 *     "id": 912345678902,
 *     "text": "@json_newb just use JsonWriter!",
 *     "geo": [50.454722, -104.606667],
 *     "user": {
 *       "name": "jesse",
 *       "followers_count": 2
 *     }
 *   }
 * ]}</pre>
 * This code encodes the above structure: <pre>   {@code
 *   public void writeJsonStream(OutputStream out, List<Message> messages) throws IOException {
 *     JsonWriter writer = new JsonWriter(new OutputStreamWriter(out, "UTF-8"));
 *     writer.setIndentSpaces(4);
 *     writeMessagesArray(writer, messages);
 *     writer.close();
 *   }
 *
 *   public void writeMessagesArray(JsonWriter writer, List<Message> messages) throws IOException {
 *     writer.beginArray();
 *     for (Message message : messages) {
 *       writeMessage(writer, message);
 *     }
 *     writer.endArray();
 *   }
 *
 *   public void writeMessage(JsonWriter writer, Message message) throws IOException {
 *     writer.beginObject();
 *     writer.name("id").value(message.getId());
 *     writer.name("text").value(message.getText());
 *     if (message.getGeo() != null) {
 *       writer.name("geo");
 *       writeDoublesArray(writer, message.getGeo());
 *     } else {
 *       writer.name("geo").nullValue();
 *     }
 *     writer.name("user");
 *     writeUser(writer, message.getUser());
 *     writer.endObject();
 *   }
 *
 *   public void writeUser(JsonWriter writer, User user) throws IOException {
 *     writer.beginObject();
 *     writer.name("name").value(user.getName());
 *     writer.name("followers_count").value(user.getFollowersCount());
 *     writer.endObject();
 *   }
 *
 *   public void writeDoublesArray(JsonWriter writer, List<Double> doubles) throws IOException {
 *     writer.beginArray();
 *     for (Double value : doubles) {
 *       writer.value(value);
 *     }
 *     writer.endArray();
 *   }}</pre>
 *
 * <p>Each {@code JsonWriter} may be used to write a single JSON stream.
 * Instances of this class are not thread safe. Calls that would result in a
 * malformed JSON string will fail with an {@link IllegalStateException}.
 *
 * @author Jesse Wilson
 * @since 1.6
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class JsonWriter implements Closeable {public static class __CLR4_4_12un2unlck0y8m6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,3901,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** The output data, containing at most one top-level array or object. */
  private final Writer out;

  private final List<JsonScope> stack = new ArrayList<JsonScope>();
  {try{__CLR4_4_12un2unlck0y8m6.R.inc(3695);
    __CLR4_4_12un2unlck0y8m6.R.inc(3696);stack.add(JsonScope.EMPTY_DOCUMENT);
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * A string containing a full set of spaces for a single level of
   * indentation, or null for no pretty printing.
   */
  private String indent;

  /**
   * The name/value separator; either ":" or ": ".
   */
  private String separator = ":";

  private boolean lenient;

  private boolean htmlSafe;

  /**
   * Creates a new instance that writes a JSON-encoded stream to {@code out}.
   * For best performance, ensure {@link Writer} is buffered; wrapping in
   * {@link java.io.BufferedWriter BufferedWriter} if necessary.
   */
  public JsonWriter(Writer out) {try{__CLR4_4_12un2unlck0y8m6.R.inc(3697);
    __CLR4_4_12un2unlck0y8m6.R.inc(3698);if ((((out == null)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3699)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3700)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3701);throw new NullPointerException("out == null");
    }
    }__CLR4_4_12un2unlck0y8m6.R.inc(3702);this.out = out;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Sets the indentation string to be repeated for each level of indentation
   * in the encoded document. If {@code indent.isEmpty()} the encoded document
   * will be compact. Otherwise the encoded document will be more
   * human-readable.
   *
   * @param indent a string containing only whitespace.
   */
  public void setIndent(String indent) {try{__CLR4_4_12un2unlck0y8m6.R.inc(3703);
    __CLR4_4_12un2unlck0y8m6.R.inc(3704);if ((((indent.length() == 0)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3705)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3706)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3707);this.indent = null;
      __CLR4_4_12un2unlck0y8m6.R.inc(3708);this.separator = ":";
    } }else {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3709);this.indent = indent;
      __CLR4_4_12un2unlck0y8m6.R.inc(3710);this.separator = ": ";
    }
  }}finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Configure this writer to relax its syntax rules. By default, this writer
   * only emits well-formed JSON as specified by <a
   * href="http://www.ietf.org/rfc/rfc4627.txt">RFC 4627</a>. Setting the writer
   * to lenient permits the following:
   * <ul>
   *   <li>Top-level values of any type. With strict writing, the top-level
   *       value must be an object or an array.
   *   <li>Numbers may be {@link Double#isNaN() NaNs} or {@link
   *       Double#isInfinite() infinities}.
   * </ul>
   */
  public void setLenient(boolean lenient) {try{__CLR4_4_12un2unlck0y8m6.R.inc(3711);
    __CLR4_4_12un2unlck0y8m6.R.inc(3712);this.lenient = lenient;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Returns true if this writer has relaxed syntax rules.
   */
  public boolean isLenient() {try{__CLR4_4_12un2unlck0y8m6.R.inc(3713);
    __CLR4_4_12un2unlck0y8m6.R.inc(3714);return lenient;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Configure this writer to emit JSON that's safe for direct inclusion in HTML
   * and XML documents. This escapes the HTML characters {@code <}, {@code >},
   * {@code &} and {@code =} before writing them to the stream. Without this
   * setting, your XML/HTML encoder should replace these characters with the
   * corresponding escape sequences.
   */
  public void setHtmlSafe(boolean htmlSafe) {try{__CLR4_4_12un2unlck0y8m6.R.inc(3715);
    __CLR4_4_12un2unlck0y8m6.R.inc(3716);this.htmlSafe = htmlSafe;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Returns true if this writer writes JSON that's safe for inclusion in HTML
   * and XML documents.
   */
  public boolean isHtmlSafe() {try{__CLR4_4_12un2unlck0y8m6.R.inc(3717);
    __CLR4_4_12un2unlck0y8m6.R.inc(3718);return htmlSafe;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Begins encoding a new array. Each call to this method must be paired with
   * a call to {@link #endArray}.
   *
   * @return this writer.
   */
  public JsonWriter beginArray() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3719);
    __CLR4_4_12un2unlck0y8m6.R.inc(3720);return open(JsonScope.EMPTY_ARRAY, "[");
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Ends encoding the current array.
   *
   * @return this writer.
   */
  public JsonWriter endArray() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3721);
    __CLR4_4_12un2unlck0y8m6.R.inc(3722);return close(JsonScope.EMPTY_ARRAY, JsonScope.NONEMPTY_ARRAY, "]");
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Begins encoding a new object. Each call to this method must be paired
   * with a call to {@link #endObject}.
   *
   * @return this writer.
   */
  public JsonWriter beginObject() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3723);
    __CLR4_4_12un2unlck0y8m6.R.inc(3724);return open(JsonScope.EMPTY_OBJECT, "{");
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Ends encoding the current object.
   *
   * @return this writer.
   */
  public JsonWriter endObject() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3725);
    __CLR4_4_12un2unlck0y8m6.R.inc(3726);return close(JsonScope.EMPTY_OBJECT, JsonScope.NONEMPTY_OBJECT, "}");
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Enters a new scope by appending any necessary whitespace and the given
   * bracket.
   */
  private JsonWriter open(JsonScope empty, String openBracket) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3727);
    __CLR4_4_12un2unlck0y8m6.R.inc(3728);beforeValue(true);
    __CLR4_4_12un2unlck0y8m6.R.inc(3729);stack.add(empty);
    __CLR4_4_12un2unlck0y8m6.R.inc(3730);out.write(openBracket);
    __CLR4_4_12un2unlck0y8m6.R.inc(3731);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Closes the current scope by appending any necessary whitespace and the
   * given bracket.
   */
  private JsonWriter close(JsonScope empty, JsonScope nonempty, String closeBracket)
      throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3732);
    __CLR4_4_12un2unlck0y8m6.R.inc(3733);JsonScope context = peek();
    __CLR4_4_12un2unlck0y8m6.R.inc(3734);if ((((context != nonempty && context != empty)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3735)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3736)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3737);throw new IllegalStateException("Nesting problem: " + stack);
    }

    }__CLR4_4_12un2unlck0y8m6.R.inc(3738);stack.remove(stack.size() - 1);
    __CLR4_4_12un2unlck0y8m6.R.inc(3739);if ((((context == nonempty)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3740)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3741)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3742);newline();
    }
    }__CLR4_4_12un2unlck0y8m6.R.inc(3743);out.write(closeBracket);
    __CLR4_4_12un2unlck0y8m6.R.inc(3744);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Returns the value on the top of the stack.
   */
  private JsonScope peek() {try{__CLR4_4_12un2unlck0y8m6.R.inc(3745);
    __CLR4_4_12un2unlck0y8m6.R.inc(3746);return stack.get(stack.size() - 1);
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Replace the value on the top of the stack with the given value.
   */
  private void replaceTop(JsonScope topOfStack) {try{__CLR4_4_12un2unlck0y8m6.R.inc(3747);
    __CLR4_4_12un2unlck0y8m6.R.inc(3748);stack.set(stack.size() - 1, topOfStack);
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Encodes the property name.
   *
   * @param name the name of the forthcoming value. May not be null.
   * @return this writer.
   */
  public JsonWriter name(String name) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3749);
    __CLR4_4_12un2unlck0y8m6.R.inc(3750);if ((((name == null)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3751)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3752)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3753);throw new NullPointerException("name == null");
    }
    }__CLR4_4_12un2unlck0y8m6.R.inc(3754);beforeName();
    __CLR4_4_12un2unlck0y8m6.R.inc(3755);string(name);
    __CLR4_4_12un2unlck0y8m6.R.inc(3756);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Encodes {@code value}.
   *
   * @param value the literal string value, or null to encode a null literal.
   * @return this writer.
   */
  public JsonWriter value(String value) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3757);
    __CLR4_4_12un2unlck0y8m6.R.inc(3758);if ((((value == null)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3759)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3760)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3761);return nullValue();
    }
    }__CLR4_4_12un2unlck0y8m6.R.inc(3762);beforeValue(false);
    __CLR4_4_12un2unlck0y8m6.R.inc(3763);string(value);
    __CLR4_4_12un2unlck0y8m6.R.inc(3764);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Encodes {@code null}.
   *
   * @return this writer.
   */
  public JsonWriter nullValue() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3765);
    __CLR4_4_12un2unlck0y8m6.R.inc(3766);beforeValue(false);
    __CLR4_4_12un2unlck0y8m6.R.inc(3767);out.write("null");
    __CLR4_4_12un2unlck0y8m6.R.inc(3768);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Encodes {@code value}.
   *
   * @return this writer.
   */
  public JsonWriter value(boolean value) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3769);
    __CLR4_4_12un2unlck0y8m6.R.inc(3770);beforeValue(false);
    __CLR4_4_12un2unlck0y8m6.R.inc(3771);out.write((((value )&&(__CLR4_4_12un2unlck0y8m6.R.iget(3772)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3773)==0&false))? "true" : "false");
    __CLR4_4_12un2unlck0y8m6.R.inc(3774);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Encodes {@code value}.
   *
   * @param value a finite value. May not be {@link Double#isNaN() NaNs} or
   *     {@link Double#isInfinite() infinities}.
   * @return this writer.
   */
  public JsonWriter value(double value) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3775);
    __CLR4_4_12un2unlck0y8m6.R.inc(3776);if ((((Double.isNaN(value) || Double.isInfinite(value))&&(__CLR4_4_12un2unlck0y8m6.R.iget(3777)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3778)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3779);throw new IllegalArgumentException("Numeric values must be finite, but was " + value);
    }
    }__CLR4_4_12un2unlck0y8m6.R.inc(3780);beforeValue(false);
    __CLR4_4_12un2unlck0y8m6.R.inc(3781);out.append(Double.toString(value));
    __CLR4_4_12un2unlck0y8m6.R.inc(3782);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Encodes {@code value}.
   *
   * @return this writer.
   */
  public JsonWriter value(long value) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3783);
    __CLR4_4_12un2unlck0y8m6.R.inc(3784);beforeValue(false);
    __CLR4_4_12un2unlck0y8m6.R.inc(3785);out.write(Long.toString(value));
    __CLR4_4_12un2unlck0y8m6.R.inc(3786);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Encodes {@code value}.
   *
   * @param value a finite value. May not be {@link Double#isNaN() NaNs} or
   *     {@link Double#isInfinite() infinities}.
   * @return this writer.
   */
  public JsonWriter value(Number value) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3787);
    __CLR4_4_12un2unlck0y8m6.R.inc(3788);if ((((value == null)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3789)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3790)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3791);return nullValue();
    }

    }__CLR4_4_12un2unlck0y8m6.R.inc(3792);String string = value.toString();
    __CLR4_4_12un2unlck0y8m6.R.inc(3793);if ((((!lenient
        && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")))&&(__CLR4_4_12un2unlck0y8m6.R.iget(3794)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3795)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3796);throw new IllegalArgumentException("Numeric values must be finite, but was " + value);
    }
    }__CLR4_4_12un2unlck0y8m6.R.inc(3797);beforeValue(false);
    __CLR4_4_12un2unlck0y8m6.R.inc(3798);out.append(string);
    __CLR4_4_12un2unlck0y8m6.R.inc(3799);return this;
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Ensures all buffered data is written to the underlying {@link Writer}
   * and flushes that writer.
   */
  public void flush() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3800);
    __CLR4_4_12un2unlck0y8m6.R.inc(3801);out.flush();
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Flushes and closes this writer and the underlying {@link Writer}.
   *
   * @throws IOException if the JSON document is incomplete.
   */
  public void close() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3802);
    __CLR4_4_12un2unlck0y8m6.R.inc(3803);out.close();

    __CLR4_4_12un2unlck0y8m6.R.inc(3804);if ((((peek() != JsonScope.NONEMPTY_DOCUMENT)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3805)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3806)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3807);throw new IOException("Incomplete document");
    }
  }}finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  private void string(String value) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3808);
    __CLR4_4_12un2unlck0y8m6.R.inc(3809);out.write("\"");
    __CLR4_4_12un2unlck0y8m6.R.inc(3810);for (int i = 0, length = value.length(); (((i < length)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3811)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3812)==0&false)); i++) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3813);char c = value.charAt(i);

      /*
       * From RFC 4627, "All Unicode characters may be placed within the
       * quotation marks except for the characters that must be escaped:
       * quotation mark, reverse solidus, and the control characters
       * (U+0000 through U+001F)."
       */
      boolean __CLB4_4_1_bool0=false;__CLR4_4_12un2unlck0y8m6.R.inc(3814);switch (c) {
      case '"':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3815);__CLB4_4_1_bool0=true;}
      case '\\':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3816);__CLB4_4_1_bool0=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3817);out.write('\\');
        __CLR4_4_12un2unlck0y8m6.R.inc(3818);out.write(c);
        __CLR4_4_12un2unlck0y8m6.R.inc(3819);break;

      case '\t':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3820);__CLB4_4_1_bool0=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3821);out.write("\\t");
        __CLR4_4_12un2unlck0y8m6.R.inc(3822);break;

      case '\b':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3823);__CLB4_4_1_bool0=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3824);out.write("\\b");
        __CLR4_4_12un2unlck0y8m6.R.inc(3825);break;

      case '\n':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3826);__CLB4_4_1_bool0=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3827);out.write("\\n");
        __CLR4_4_12un2unlck0y8m6.R.inc(3828);break;

      case '\r':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3829);__CLB4_4_1_bool0=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3830);out.write("\\r");
        __CLR4_4_12un2unlck0y8m6.R.inc(3831);break;

      case '\f':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3832);__CLB4_4_1_bool0=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3833);out.write("\\f");
        __CLR4_4_12un2unlck0y8m6.R.inc(3834);break;

      case '<':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3835);__CLB4_4_1_bool0=true;}
      case '>':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3836);__CLB4_4_1_bool0=true;}
      case '&':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3837);__CLB4_4_1_bool0=true;}
      case '=':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3838);__CLB4_4_1_bool0=true;}
      case '\'':if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3839);__CLB4_4_1_bool0=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3840);if ((((htmlSafe)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3841)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3842)==0&false))) {{
          __CLR4_4_12un2unlck0y8m6.R.inc(3843);out.write(String.format("\\u%04x", (int) c));
        } }else {{
          __CLR4_4_12un2unlck0y8m6.R.inc(3844);out.write(c);
        }
        }__CLR4_4_12un2unlck0y8m6.R.inc(3845);break;

      default:if (!__CLB4_4_1_bool0) {__CLR4_4_12un2unlck0y8m6.R.inc(3846);__CLB4_4_1_bool0=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3847);if ((((c <= 0x1F)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3848)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3849)==0&false))) {{
          __CLR4_4_12un2unlck0y8m6.R.inc(3850);out.write(String.format("\\u%04x", (int) c));
        } }else {{
          __CLR4_4_12un2unlck0y8m6.R.inc(3851);out.write(c);
        }
        }__CLR4_4_12un2unlck0y8m6.R.inc(3852);break;
      }
    }
    }__CLR4_4_12un2unlck0y8m6.R.inc(3853);out.write("\"");
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  private void newline() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3854);
    __CLR4_4_12un2unlck0y8m6.R.inc(3855);if ((((indent == null)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3856)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3857)==0&false))) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3858);return;
    }

    }__CLR4_4_12un2unlck0y8m6.R.inc(3859);out.write("\n");
    __CLR4_4_12un2unlck0y8m6.R.inc(3860);for (int i = 1; (((i < stack.size())&&(__CLR4_4_12un2unlck0y8m6.R.iget(3861)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3862)==0&false)); i++) {{
      __CLR4_4_12un2unlck0y8m6.R.inc(3863);out.write(indent);
    }
  }}finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Inserts any necessary separators and whitespace before a name. Also
   * adjusts the stack to expect the name's value.
   */
  private void beforeName() throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3864);
    __CLR4_4_12un2unlck0y8m6.R.inc(3865);JsonScope context = peek();
    __CLR4_4_12un2unlck0y8m6.R.inc(3866);if ((((context == JsonScope.NONEMPTY_OBJECT)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3867)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3868)==0&false))) {{ // first in object
      __CLR4_4_12un2unlck0y8m6.R.inc(3869);out.write(',');
    } }else {__CLR4_4_12un2unlck0y8m6.R.inc(3870);if ((((context != JsonScope.EMPTY_OBJECT)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3871)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3872)==0&false))) {{ // not in an object!
      __CLR4_4_12un2unlck0y8m6.R.inc(3873);throw new IllegalStateException("Nesting problem: " + stack);
    }
    }}__CLR4_4_12un2unlck0y8m6.R.inc(3874);newline();
    __CLR4_4_12un2unlck0y8m6.R.inc(3875);replaceTop(JsonScope.DANGLING_NAME);
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}

  /**
   * Inserts any necessary separators and whitespace before a literal value,
   * inline array, or inline object. Also adjusts the stack to expect either a
   * closing bracket or another element.
   *
   * @param root true if the value is a new array or object, the two values
   *     permitted as top-level elements.
   */
  private void beforeValue(boolean root) throws IOException {try{__CLR4_4_12un2unlck0y8m6.R.inc(3876);
    boolean __CLB4_4_1_bool1=false;__CLR4_4_12un2unlck0y8m6.R.inc(3877);switch (peek()) {
    case EMPTY_DOCUMENT:if (!__CLB4_4_1_bool1) {__CLR4_4_12un2unlck0y8m6.R.inc(3878);__CLB4_4_1_bool1=true;} // first in document
      __CLR4_4_12un2unlck0y8m6.R.inc(3879);if ((((!lenient && !root)&&(__CLR4_4_12un2unlck0y8m6.R.iget(3880)!=0|true))||(__CLR4_4_12un2unlck0y8m6.R.iget(3881)==0&false))) {{
        __CLR4_4_12un2unlck0y8m6.R.inc(3882);throw new IllegalStateException(
            "JSON must start with an array or an object.");
      }
      }__CLR4_4_12un2unlck0y8m6.R.inc(3883);replaceTop(JsonScope.NONEMPTY_DOCUMENT);
      __CLR4_4_12un2unlck0y8m6.R.inc(3884);break;

    case EMPTY_ARRAY:if (!__CLB4_4_1_bool1) {__CLR4_4_12un2unlck0y8m6.R.inc(3885);__CLB4_4_1_bool1=true;} // first in array
      __CLR4_4_12un2unlck0y8m6.R.inc(3886);replaceTop(JsonScope.NONEMPTY_ARRAY);
      __CLR4_4_12un2unlck0y8m6.R.inc(3887);newline();
      __CLR4_4_12un2unlck0y8m6.R.inc(3888);break;

    case NONEMPTY_ARRAY:if (!__CLB4_4_1_bool1) {__CLR4_4_12un2unlck0y8m6.R.inc(3889);__CLB4_4_1_bool1=true;} // another in array
      __CLR4_4_12un2unlck0y8m6.R.inc(3890);out.append(',');
      __CLR4_4_12un2unlck0y8m6.R.inc(3891);newline();
      __CLR4_4_12un2unlck0y8m6.R.inc(3892);break;

    case DANGLING_NAME:if (!__CLB4_4_1_bool1) {__CLR4_4_12un2unlck0y8m6.R.inc(3893);__CLB4_4_1_bool1=true;} // value for name
      __CLR4_4_12un2unlck0y8m6.R.inc(3894);out.append(separator);
      __CLR4_4_12un2unlck0y8m6.R.inc(3895);replaceTop(JsonScope.NONEMPTY_OBJECT);
      __CLR4_4_12un2unlck0y8m6.R.inc(3896);break;

    case NONEMPTY_DOCUMENT:if (!__CLB4_4_1_bool1) {__CLR4_4_12un2unlck0y8m6.R.inc(3897);__CLB4_4_1_bool1=true;}
        __CLR4_4_12un2unlck0y8m6.R.inc(3898);throw new IllegalStateException(
            "JSON must have only one top-level value.");

    default:if (!__CLB4_4_1_bool1) {__CLR4_4_12un2unlck0y8m6.R.inc(3899);__CLB4_4_1_bool1=true;}
      __CLR4_4_12un2unlck0y8m6.R.inc(3900);throw new IllegalStateException("Nesting problem: " + stack);
    }
  }finally{__CLR4_4_12un2unlck0y8m6.R.flushNeeded();}}
}
