/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * This is the main class for using Gson. Gson is typically used by first constructing a
 * Gson instance and then invoking {@link #toJson(Object)} or {@link #fromJson(String, Class)}
 * methods on it.
 *
 * <p>You can create a Gson instance by invoking {@code new Gson()} if the default configuration
 * is all you need. You can also use {@link GsonBuilder} to build a Gson instance with various
 * configuration options such as versioning support, pretty printing, custom
 * {@link JsonSerializer}s, {@link JsonDeserializer}s, and {@link InstanceCreator}s.</p>
 *
 * <p>Here is an example of how Gson is used for a simple Class:
 *
 * <pre>
 * Gson gson = new Gson(); // Or use new GsonBuilder().create();
 * MyType target = new MyType();
 * String json = gson.toJson(target); // serializes target to Json
 * MyType target2 = gson.fromJson(json, MyType.class); // deserializes json into target2
 * </pre></p>
 *
 * <p>If the object that your are serializing/deserializing is a {@code ParameterizedType}
 * (i.e. contains at least one type parameter and may be an array) then you must use the
 * {@link #toJson(Object, Type)} or {@link #fromJson(String, Type)} method.  Here is an
 * example for serializing and deserialing a {@code ParameterizedType}:
 *
 * <pre>
 * Type listType = new TypeToken&lt;List&lt;String&gt;&gt;() {}.getType();
 * List&lt;String&gt; target = new LinkedList&lt;String&gt;();
 * target.add("blah");
 *
 * Gson gson = new Gson();
 * String json = gson.toJson(target, listType);
 * List&lt;String&gt; target2 = gson.fromJson(json, listType);
 * </pre></p>
 *
 * <p>See the <a href="https://sites.google.com/site/gson/gson-user-guide">Gson User Guide</a>
 * for a more complete set of examples.</p>
 *
 * @see com.google.gson.reflect.TypeToken
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public final class Gson {public static class __CLR4_4_1jejelck0y845{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  //TODO(inder): get rid of all the registerXXX methods and take all such parameters in the
  // constructor instead. At the minimum, mark those methods private.

  private static final String NULL_STRING = "null";

  static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;

  // Default instances of plug-ins
  static final AnonymousAndLocalClassExclusionStrategy DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY =
      new AnonymousAndLocalClassExclusionStrategy();
  static final SyntheticFieldExclusionStrategy DEFAULT_SYNTHETIC_FIELD_EXCLUSION_STRATEGY =
      new SyntheticFieldExclusionStrategy(true);
  static final ModifierBasedExclusionStrategy DEFAULT_MODIFIER_BASED_EXCLUSION_STRATEGY =
      new ModifierBasedExclusionStrategy(new int[] { Modifier.TRANSIENT, Modifier.STATIC });
  static final FieldNamingStrategy2 DEFAULT_NAMING_POLICY =
      new SerializedNameAnnotationInterceptingNamingPolicy(new JavaFieldNamingPolicy());

  private static final ExclusionStrategy DEFAULT_EXCLUSION_STRATEGY =
      createExclusionStrategy(VersionConstants.IGNORE_VERSIONS);

  private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";

  private final ExclusionStrategy serializationStrategy;

  private final ExclusionStrategy deserializationStrategy;

  private final FieldNamingStrategy2 fieldNamingPolicy;
  private final MappedObjectConstructor objectConstructor;

  /** Map containing Type or Class objects as keys */
  private final ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers;

  /** Map containing Type or Class objects as keys */
  private final ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers;

  private final boolean serializeNulls;
  private final boolean htmlSafe;
  private final boolean generateNonExecutableJson;
  private final boolean prettyPrinting;

  /**
   * Constructs a Gson object with default configuration. The default configuration has the
   * following settings:
   * <ul>
   *   <li>The JSON generated by <code>toJson</code> methods is in compact representation. This
   *   means that all the unneeded white-space is removed. You can change this behavior with
   *   {@link GsonBuilder#setPrettyPrinting()}. </li>
   *   <li>The generated JSON omits all the fields that are null. Note that nulls in arrays are
   *   kept as is since an array is an ordered list. Moreover, if a field is not null, but its
   *   generated JSON is empty, the field is kept. You can configure Gson to serialize null values
   *   by setting {@link GsonBuilder#serializeNulls()}.</li>
   *   <li>Gson provides default serialization and deserialization for Enums, {@link Map},
   *   {@link java.net.URL}, {@link java.net.URI}, {@link java.util.Locale}, {@link java.util.Date},
   *   {@link java.math.BigDecimal}, and {@link java.math.BigInteger} classes. If you would prefer
   *   to change the default representation, you can do so by registering a type adapter through
   *   {@link GsonBuilder#registerTypeAdapter(Type, Object)}. </li>
   *   <li>The default Date format is same as {@link java.text.DateFormat#DEFAULT}. This format
   *   ignores the millisecond portion of the date during serialization. You can change
   *   this by invoking {@link GsonBuilder#setDateFormat(int)} or
   *   {@link GsonBuilder#setDateFormat(String)}. </li>
   *   <li>By default, Gson ignores the {@link com.google.gson.annotations.Expose} annotation.
   *   You can enable Gson to serialize/deserialize only those fields marked with this annotation
   *   through {@link GsonBuilder#excludeFieldsWithoutExposeAnnotation()}. </li>
   *   <li>By default, Gson ignores the {@link com.google.gson.annotations.Since} annotation. You
   *   can enable Gson to use this annotation through {@link GsonBuilder#setVersion(double)}.</li>
   *   <li>The default field naming policy for the output Json is same as in Java. So, a Java class
   *   field <code>versionNumber</code> will be output as <code>&quot;versionNumber@quot;</code> in
   *   Json. The same rules are applied for mapping incoming Json to the Java classes. You can
   *   change this policy through {@link GsonBuilder#setFieldNamingPolicy(FieldNamingPolicy)}.</li>
   *   <li>By default, Gson excludes <code>transient</code> or <code>static</code> fields from
   *   consideration for serialization and deserialization. You can change this behavior through
   *   {@link GsonBuilder#excludeFieldsWithModifiers(int...)}.</li>
   * </ul>
   */
  public Gson() {
    this(DEFAULT_EXCLUSION_STRATEGY, DEFAULT_EXCLUSION_STRATEGY, DEFAULT_NAMING_POLICY,
    new MappedObjectConstructor(DefaultTypeAdapters.getDefaultInstanceCreators()),
    false, DefaultTypeAdapters.getDefaultSerializers(),
    DefaultTypeAdapters.getDefaultDeserializers(), DEFAULT_JSON_NON_EXECUTABLE, true, false);__CLR4_4_1jejelck0y845.R.inc(699);try{__CLR4_4_1jejelck0y845.R.inc(698);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  Gson(ExclusionStrategy serializationStrategy, ExclusionStrategy deserializationStrategy,
       FieldNamingStrategy2 fieldNamingPolicy, MappedObjectConstructor objectConstructor,
       boolean serializeNulls, ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers,
       ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers,
       boolean generateNonExecutableGson, boolean htmlSafe, boolean prettyPrinting) {try{__CLR4_4_1jejelck0y845.R.inc(700);
    __CLR4_4_1jejelck0y845.R.inc(701);this.serializationStrategy = serializationStrategy;
    __CLR4_4_1jejelck0y845.R.inc(702);this.deserializationStrategy = deserializationStrategy;
    __CLR4_4_1jejelck0y845.R.inc(703);this.fieldNamingPolicy = fieldNamingPolicy;
    __CLR4_4_1jejelck0y845.R.inc(704);this.objectConstructor = objectConstructor;
    __CLR4_4_1jejelck0y845.R.inc(705);this.serializeNulls = serializeNulls;
    __CLR4_4_1jejelck0y845.R.inc(706);this.serializers = serializers;
    __CLR4_4_1jejelck0y845.R.inc(707);this.deserializers = deserializers;
    __CLR4_4_1jejelck0y845.R.inc(708);this.generateNonExecutableJson = generateNonExecutableGson;
    __CLR4_4_1jejelck0y845.R.inc(709);this.htmlSafe = htmlSafe;
    __CLR4_4_1jejelck0y845.R.inc(710);this.prettyPrinting = prettyPrinting;
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  private ObjectNavigatorFactory createDefaultObjectNavigatorFactory(ExclusionStrategy strategy) {try{__CLR4_4_1jejelck0y845.R.inc(711);
    __CLR4_4_1jejelck0y845.R.inc(712);return new ObjectNavigatorFactory(strategy, fieldNamingPolicy);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  private static ExclusionStrategy createExclusionStrategy(double version) {try{__CLR4_4_1jejelck0y845.R.inc(713);
    __CLR4_4_1jejelck0y845.R.inc(714);List<ExclusionStrategy> strategies = new LinkedList<ExclusionStrategy>();
    __CLR4_4_1jejelck0y845.R.inc(715);strategies.add(DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY);
    __CLR4_4_1jejelck0y845.R.inc(716);strategies.add(DEFAULT_SYNTHETIC_FIELD_EXCLUSION_STRATEGY);
    __CLR4_4_1jejelck0y845.R.inc(717);strategies.add(DEFAULT_MODIFIER_BASED_EXCLUSION_STRATEGY);
    __CLR4_4_1jejelck0y845.R.inc(718);if ((((version != VersionConstants.IGNORE_VERSIONS)&&(__CLR4_4_1jejelck0y845.R.iget(719)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(720)==0&false))) {{
      __CLR4_4_1jejelck0y845.R.inc(721);strategies.add(new VersionExclusionStrategy(version));
    }
    }__CLR4_4_1jejelck0y845.R.inc(722);return new DisjunctionExclusionStrategy(strategies);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method serializes the specified object into its equivalent representation as a tree of
   * {@link JsonElement}s. This method should be used when the specified object is not a generic
   * type. This method uses {@link Class#getClass()} to get the type for the specified object, but
   * the {@code getClass()} loses the generic type information because of the Type Erasure feature
   * of Java. Note that this method works fine if the any of the object fields are of generic type,
   * just the object itself should not be of a generic type. If the object is of generic type, use
   * {@link #toJsonTree(Object, Type)} instead.
   *
   * @param src the object for which Json representation is to be created setting for Gson
   * @return Json representation of {@code src}.
   * @since 1.4
   */
  public JsonElement toJsonTree(Object src) {try{__CLR4_4_1jejelck0y845.R.inc(723);
    __CLR4_4_1jejelck0y845.R.inc(724);if ((((src == null)&&(__CLR4_4_1jejelck0y845.R.iget(725)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(726)==0&false))) {{
      __CLR4_4_1jejelck0y845.R.inc(727);return JsonNull.createJsonNull();
    }
    }__CLR4_4_1jejelck0y845.R.inc(728);return toJsonTree(src, src.getClass());
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method serializes the specified object, including those of generic types, into its
   * equivalent representation as a tree of {@link JsonElement}s. This method must be used if the
   * specified object is a generic type. For non-generic objects, use {@link #toJsonTree(Object)}
   * instead.
   *
   * @param src the object for which JSON representation is to be created
   * @param typeOfSrc The specific genericized type of src. You can obtain
   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,
   * to get the type for {@code Collection<Foo>}, you should use:
   * <pre>
   * Type typeOfSrc = new TypeToken&lt;Collection&lt;Foo&gt;&gt;(){}.getType();
   * </pre>
   * @return Json representation of {@code src}
   * @since 1.4
   */
  public JsonElement toJsonTree(Object src, Type typeOfSrc) {try{__CLR4_4_1jejelck0y845.R.inc(729);
    __CLR4_4_1jejelck0y845.R.inc(730);if ((((src == null)&&(__CLR4_4_1jejelck0y845.R.iget(731)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(732)==0&false))) {{
      __CLR4_4_1jejelck0y845.R.inc(733);return JsonNull.createJsonNull();
    }
    }__CLR4_4_1jejelck0y845.R.inc(734);JsonSerializationContextDefault context = new JsonSerializationContextDefault(
        createDefaultObjectNavigatorFactory(serializationStrategy), serializeNulls, serializers);
    __CLR4_4_1jejelck0y845.R.inc(735);return context.serialize(src, typeOfSrc, true);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method serializes the specified object into its equivalent Json representation.
   * This method should be used when the specified object is not a generic type. This method uses
   * {@link Class#getClass()} to get the type for the specified object, but the
   * {@code getClass()} loses the generic type information because of the Type Erasure feature
   * of Java. Note that this method works fine if the any of the object fields are of generic type,
   * just the object itself should not be of a generic type. If the object is of generic type, use
   * {@link #toJson(Object, Type)} instead. If you want to write out the object to a
   * {@link Writer}, use {@link #toJson(Object, Appendable)} instead.
   *
   * @param src the object for which Json representation is to be created setting for Gson
   * @return Json representation of {@code src}.
   */
  public String toJson(Object src) {try{__CLR4_4_1jejelck0y845.R.inc(736);
    __CLR4_4_1jejelck0y845.R.inc(737);if ((((src == null)&&(__CLR4_4_1jejelck0y845.R.iget(738)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(739)==0&false))) {{
      __CLR4_4_1jejelck0y845.R.inc(740);return (((serializeNulls )&&(__CLR4_4_1jejelck0y845.R.iget(741)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(742)==0&false))? NULL_STRING : "";
    }
    }__CLR4_4_1jejelck0y845.R.inc(743);return toJson(src, src.getClass());
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method serializes the specified object, including those of generic types, into its
   * equivalent Json representation. This method must be used if the specified object is a generic
   * type. For non-generic objects, use {@link #toJson(Object)} instead. If you want to write out
   * the object to a {@link Appendable}, use {@link #toJson(Object, Type, Appendable)} instead.
   *
   * @param src the object for which JSON representation is to be created
   * @param typeOfSrc The specific genericized type of src. You can obtain
   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,
   * to get the type for {@code Collection<Foo>}, you should use:
   * <pre>
   * Type typeOfSrc = new TypeToken&lt;Collection&lt;Foo&gt;&gt;(){}.getType();
   * </pre>
   * @return Json representation of {@code src}
   */
  public String toJson(Object src, Type typeOfSrc) {try{__CLR4_4_1jejelck0y845.R.inc(744);
    __CLR4_4_1jejelck0y845.R.inc(745);StringWriter writer = new StringWriter();
    __CLR4_4_1jejelck0y845.R.inc(746);toJson(toJsonTree(src, typeOfSrc), writer);
    __CLR4_4_1jejelck0y845.R.inc(747);return writer.toString();
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method serializes the specified object into its equivalent Json representation.
   * This method should be used when the specified object is not a generic type. This method uses
   * {@link Class#getClass()} to get the type for the specified object, but the
   * {@code getClass()} loses the generic type information because of the Type Erasure feature
   * of Java. Note that this method works fine if the any of the object fields are of generic type,
   * just the object itself should not be of a generic type. If the object is of generic type, use
   * {@link #toJson(Object, Type, Appendable)} instead.
   *
   * @param src the object for which Json representation is to be created setting for Gson
   * @param writer Writer to which the Json representation needs to be written
   * @since 1.2
   */
  public void toJson(Object src, Appendable writer) {try{__CLR4_4_1jejelck0y845.R.inc(748);
    __CLR4_4_1jejelck0y845.R.inc(749);try {
      __CLR4_4_1jejelck0y845.R.inc(750);if ((((src != null)&&(__CLR4_4_1jejelck0y845.R.iget(751)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(752)==0&false))) {{
        __CLR4_4_1jejelck0y845.R.inc(753);toJson(src, src.getClass(), writer);
      } }else {__CLR4_4_1jejelck0y845.R.inc(754);if ((((serializeNulls)&&(__CLR4_4_1jejelck0y845.R.iget(755)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(756)==0&false))) {{
        __CLR4_4_1jejelck0y845.R.inc(757);writeOutNullString(writer);
      }
    }}} catch (IOException ioe) {
      __CLR4_4_1jejelck0y845.R.inc(758);throw new RuntimeException(ioe);
    }
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method serializes the specified object, including those of generic types, into its
   * equivalent Json representation. This method must be used if the specified object is a generic
   * type. For non-generic objects, use {@link #toJson(Object, Appendable)} instead.
   *
   * @param src the object for which JSON representation is to be created
   * @param typeOfSrc The specific genericized type of src. You can obtain
   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,
   * to get the type for {@code Collection<Foo>}, you should use:
   * <pre>
   * Type typeOfSrc = new TypeToken&lt;Collection&lt;Foo&gt;&gt;(){}.getType();
   * </pre>
   * @param writer Writer to which the Json representation of src needs to be written.
   * @since 1.2
   */
  public void toJson(Object src, Type typeOfSrc, Appendable writer) {try{__CLR4_4_1jejelck0y845.R.inc(759);
    __CLR4_4_1jejelck0y845.R.inc(760);JsonElement jsonElement = toJsonTree(src, typeOfSrc);
    __CLR4_4_1jejelck0y845.R.inc(761);toJson(jsonElement, writer);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * Writes the JSON representation of {@code src} of type {@code typeOfSrc} to
   * {@code writer}.
   */
  public void toJson(Object src, Type typeOfSrc, JsonWriter writer) {try{__CLR4_4_1jejelck0y845.R.inc(762);
    __CLR4_4_1jejelck0y845.R.inc(763);toJson(toJsonTree(src, typeOfSrc), writer);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * Converts a tree of {@link JsonElement}s into its equivalent JSON representation.
   *
   * @param jsonElement root of a tree of {@link JsonElement}s
   * @return JSON String representation of the tree
   * @since 1.4
   */
  public String toJson(JsonElement jsonElement) {try{__CLR4_4_1jejelck0y845.R.inc(764);
    __CLR4_4_1jejelck0y845.R.inc(765);StringWriter writer = new StringWriter();
    __CLR4_4_1jejelck0y845.R.inc(766);toJson(jsonElement, writer);
    __CLR4_4_1jejelck0y845.R.inc(767);return writer.toString();
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * Writes out the equivalent JSON for a tree of {@link JsonElement}s.
   *
   * @param jsonElement root of a tree of {@link JsonElement}s
   * @param writer Writer to which the Json representation needs to be written
   * @since 1.4
   */
  public void toJson(JsonElement jsonElement, Appendable writer) {try{__CLR4_4_1jejelck0y845.R.inc(768);
    __CLR4_4_1jejelck0y845.R.inc(769);try {
      __CLR4_4_1jejelck0y845.R.inc(770);if ((((generateNonExecutableJson)&&(__CLR4_4_1jejelck0y845.R.iget(771)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(772)==0&false))) {{
        __CLR4_4_1jejelck0y845.R.inc(773);writer.append(JSON_NON_EXECUTABLE_PREFIX);
      }
      }__CLR4_4_1jejelck0y845.R.inc(774);JsonWriter jsonWriter = new JsonWriter(Streams.writerForAppendable(writer));
      __CLR4_4_1jejelck0y845.R.inc(775);if ((((prettyPrinting)&&(__CLR4_4_1jejelck0y845.R.iget(776)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(777)==0&false))) {{
        __CLR4_4_1jejelck0y845.R.inc(778);jsonWriter.setIndent("  ");
      }
      }__CLR4_4_1jejelck0y845.R.inc(779);toJson(jsonElement, jsonWriter);
    } catch (IOException e) {
      __CLR4_4_1jejelck0y845.R.inc(780);throw new RuntimeException(e);
    }
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * Writes the JSON for {@code jsonElement} to {@code writer}.
   */
  public void toJson(JsonElement jsonElement, JsonWriter writer) {try{__CLR4_4_1jejelck0y845.R.inc(781);
    __CLR4_4_1jejelck0y845.R.inc(782);boolean oldLenient = writer.isLenient();
    __CLR4_4_1jejelck0y845.R.inc(783);writer.setLenient(true);
    __CLR4_4_1jejelck0y845.R.inc(784);boolean oldHtmlSafe = writer.isHtmlSafe();
    __CLR4_4_1jejelck0y845.R.inc(785);writer.setHtmlSafe(htmlSafe);
    __CLR4_4_1jejelck0y845.R.inc(786);try {
      __CLR4_4_1jejelck0y845.R.inc(787);Streams.write(jsonElement, serializeNulls, writer);
    } catch (IOException e) {
      __CLR4_4_1jejelck0y845.R.inc(788);throw new JsonIOException(e);
    } finally {
      __CLR4_4_1jejelck0y845.R.inc(789);writer.setLenient(oldLenient);
      __CLR4_4_1jejelck0y845.R.inc(790);writer.setHtmlSafe(oldHtmlSafe);
    }
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method deserializes the specified Json into an object of the specified class. It is not
   * suitable to use if the specified class is a generic type since it will not have the generic
   * type information because of the Type Erasure feature of Java. Therefore, this method should not
   * be used if the desired type is a generic type. Note that this method works fine if the any of
   * the fields of the specified object are generics, just the object itself should not be a
   * generic type. For the cases when the object is of generic type, invoke
   * {@link #fromJson(String, Type)}. If you have the Json in a {@link Reader} instead of
   * a String, use {@link #fromJson(Reader, Class)} instead.
   *
   * @param <T> the type of the desired object
   * @param json the string from which the object is to be deserialized
   * @param classOfT the class of T
   * @return an object of type T from the string
   * @throws JsonParseException if json is not a valid representation for an object of type
   * classOfT
   */
  @SuppressWarnings("unchecked")
  public <T> T fromJson(String json, Class<T> classOfT) throws JsonParseException {try{__CLR4_4_1jejelck0y845.R.inc(791);
    __CLR4_4_1jejelck0y845.R.inc(792);Object object = fromJson(json, (Type) classOfT);
    __CLR4_4_1jejelck0y845.R.inc(793);return Primitives.wrap(classOfT).cast(object);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method deserializes the specified Json into an object of the specified type. This method
   * is useful if the specified object is a generic type. For non-generic objects, use
   * {@link #fromJson(String, Class)} instead. If you have the Json in a {@link Reader} instead of
   * a String, use {@link #fromJson(Reader, Type)} instead.
   *
   * @param <T> the type of the desired object
   * @param json the string from which the object is to be deserialized
   * @param typeOfT The specific genericized type of src. You can obtain this type by using the
   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for
   * {@code Collection<Foo>}, you should use:
   * <pre>
   * Type typeOfT = new TypeToken&lt;Collection&lt;Foo&gt;&gt;(){}.getType();
   * </pre>
   * @return an object of type T from the string
   * @throws JsonParseException if json is not a valid representation for an object of type typeOfT
   */
  @SuppressWarnings("unchecked")
  public <T> T fromJson(String json, Type typeOfT) throws JsonParseException {try{__CLR4_4_1jejelck0y845.R.inc(794);
    __CLR4_4_1jejelck0y845.R.inc(795);if ((((json == null)&&(__CLR4_4_1jejelck0y845.R.iget(796)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(797)==0&false))) {{
      __CLR4_4_1jejelck0y845.R.inc(798);return null;
    }
    }__CLR4_4_1jejelck0y845.R.inc(799);StringReader reader = new StringReader(json);
    __CLR4_4_1jejelck0y845.R.inc(800);T target = (T) fromJson(reader, typeOfT);
    __CLR4_4_1jejelck0y845.R.inc(801);return target;
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method deserializes the Json read from the specified reader into an object of the
   * specified class. It is not suitable to use if the specified class is a generic type since it
   * will not have the generic type information because of the Type Erasure feature of Java.
   * Therefore, this method should not be used if the desired type is a generic type. Note that
   * this method works fine if the any of the fields of the specified object are generics, just the
   * object itself should not be a generic type. For the cases when the object is of generic type,
   * invoke {@link #fromJson(Reader, Type)}. If you have the Json in a String form instead of a
   * {@link Reader}, use {@link #fromJson(String, Class)} instead.
   *
   * @param <T> the type of the desired object
   * @param json the reader producing the Json from which the object is to be deserialized.
   * @param classOfT the class of T
   * @return an object of type T from the string
   * @throws JsonParseException if json is not a valid representation for an object of type
   * classOfT
   * @since 1.2
   */
  public <T> T fromJson(Reader json, Class<T> classOfT) throws JsonParseException {try{__CLR4_4_1jejelck0y845.R.inc(802);
    __CLR4_4_1jejelck0y845.R.inc(803);Object object = fromJson(new JsonReader(json), classOfT);
    __CLR4_4_1jejelck0y845.R.inc(804);return Primitives.wrap(classOfT).cast(object);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method deserializes the Json read from the specified reader into an object of the
   * specified type. This method is useful if the specified object is a generic type. For
   * non-generic objects, use {@link #fromJson(Reader, Class)} instead. If you have the Json in a
   * String form instead of a {@link Reader}, use {@link #fromJson(String, Type)} instead.
   *
   * @param <T> the type of the desired object
   * @param json the reader producing Json from which the object is to be deserialized
   * @param typeOfT The specific genericized type of src. You can obtain this type by using the
   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for
   * {@code Collection<Foo>}, you should use:
   * <pre>
   * Type typeOfT = new TypeToken&lt;Collection&lt;Foo&gt;&gt;(){}.getType();
   * </pre>
   * @return an object of type T from the json
   * @throws JsonParseException if json is not a valid representation for an object of type typeOfT
   * @since 1.2
   */
  public <T> T fromJson(Reader json, Type typeOfT) throws JsonParseException {try{__CLR4_4_1jejelck0y845.R.inc(805);
    __CLR4_4_1jejelck0y845.R.inc(806);return this.<T>fromJson(new JsonReader(json), typeOfT);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * Reads the next JSON value from {@code reader} and convert it to an object
   * of type {@code typeOfT}.
   */
  @SuppressWarnings("unchecked") // this method is unsafe and should be used very carefully
  public <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonParseException {try{__CLR4_4_1jejelck0y845.R.inc(807);
    __CLR4_4_1jejelck0y845.R.inc(808);boolean oldLenient = reader.isLenient();
    __CLR4_4_1jejelck0y845.R.inc(809);reader.setLenient(true);
    __CLR4_4_1jejelck0y845.R.inc(810);try {
      __CLR4_4_1jejelck0y845.R.inc(811);JsonElement root = Streams.parse(reader);
      __CLR4_4_1jejelck0y845.R.inc(812);return (T) fromJson(root, typeOfT);
    } finally {
      __CLR4_4_1jejelck0y845.R.inc(813);reader.setLenient(oldLenient);
    }
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method deserializes the Json read from the specified parse tree into an object of the
   * specified type. It is not suitable to use if the specified class is a generic type since it
   * will not have the generic type information because of the Type Erasure feature of Java.
   * Therefore, this method should not be used if the desired type is a generic type. Note that
   * this method works fine if the any of the fields of the specified object are generics, just the
   * object itself should not be a generic type. For the cases when the object is of generic type,
   * invoke {@link #fromJson(JsonElement, Type)}.
   * @param <T> the type of the desired object
   * @param json the root of the parse tree of {@link JsonElement}s from which the object is to
   * be deserialized
   * @param classOfT The class of T
   * @return an object of type T from the json
   * @throws JsonParseException if json is not a valid representation for an object of type typeOfT
   * @since 1.3
   */
  public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonParseException {try{__CLR4_4_1jejelck0y845.R.inc(814);
    __CLR4_4_1jejelck0y845.R.inc(815);Object object = fromJson(json, (Type) classOfT);
    __CLR4_4_1jejelck0y845.R.inc(816);return Primitives.wrap(classOfT).cast(object);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * This method deserializes the Json read from the specified parse tree into an object of the
   * specified type. This method is useful if the specified object is a generic type. For
   * non-generic objects, use {@link #fromJson(JsonElement, Class)} instead.
   *
   * @param <T> the type of the desired object
   * @param json the root of the parse tree of {@link JsonElement}s from which the object is to
   * be deserialized
   * @param typeOfT The specific genericized type of src. You can obtain this type by using the
   * {@link com.google.gson.reflect.TypeToken} class. For example, to get the type for
   * {@code Collection<Foo>}, you should use:
   * <pre>
   * Type typeOfT = new TypeToken&lt;Collection&lt;Foo&gt;&gt;(){}.getType();
   * </pre>
   * @return an object of type T from the json
   * @throws JsonParseException if json is not a valid representation for an object of type typeOfT
   * @since 1.3
   */
  @SuppressWarnings("unchecked")
  public <T> T fromJson(JsonElement json, Type typeOfT) throws JsonParseException {try{__CLR4_4_1jejelck0y845.R.inc(817);
    __CLR4_4_1jejelck0y845.R.inc(818);if ((((json == null)&&(__CLR4_4_1jejelck0y845.R.iget(819)!=0|true))||(__CLR4_4_1jejelck0y845.R.iget(820)==0&false))) {{
      __CLR4_4_1jejelck0y845.R.inc(821);return null;
    }
    }__CLR4_4_1jejelck0y845.R.inc(822);JsonDeserializationContext context = new JsonDeserializationContextDefault(
        createDefaultObjectNavigatorFactory(deserializationStrategy), deserializers,
        objectConstructor);
    __CLR4_4_1jejelck0y845.R.inc(823);T target = (T) context.deserialize(json, typeOfT);
    __CLR4_4_1jejelck0y845.R.inc(824);return target;
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  /**
   * Appends the {@link #NULL_STRING} to the {@code writer} object.
   *
   * @param writer the object to append the null value to
   */
  private void writeOutNullString(Appendable writer) throws IOException {try{__CLR4_4_1jejelck0y845.R.inc(825);
    __CLR4_4_1jejelck0y845.R.inc(826);writer.append(NULL_STRING);
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}

  @Override
  public String toString() {try{__CLR4_4_1jejelck0y845.R.inc(827);
  	__CLR4_4_1jejelck0y845.R.inc(828);StringBuilder sb = new StringBuilder("{")
  	    .append("serializeNulls:").append(serializeNulls)
  	    .append(",serializers:").append(serializers)
  	    .append(",deserializers:").append(deserializers)

      	// using the name instanceCreator instead of ObjectConstructor since the users of Gson are
      	// more familiar with the concept of Instance Creators. Moreover, the objectConstructor is
      	// just a utility class around instance creators, and its toString() only displays them.
        .append(",instanceCreators:").append(objectConstructor)
        .append("}");
  	__CLR4_4_1jejelck0y845.R.inc(829);return sb.toString();
  }finally{__CLR4_4_1jejelck0y845.R.flushNeeded();}}
}
