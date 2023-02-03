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

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.DefaultTypeAdapters.DefaultDateTypeAdapter;

/**
 * <p>Use this builder to construct a {@link Gson} instance when you need to set configuration
 * options other than the default. For {@link Gson} with default configuration, it is simpler to
 * use {@code new Gson()}. {@code GsonBuilder} is best used by creating it, and then invoking its
 * various configuration methods, and finally calling create.</p>
 *
 * <p>The following is an example shows how to use the {@code GsonBuilder} to construct a Gson
 * instance:
 *
 * <pre>
 * Gson gson = new GsonBuilder()
 *     .registerTypeAdapter(Id.class, new IdTypeAdapter())
 *     .serializeNulls()
 *     .setDateFormat(DateFormat.LONG)
 *     .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
 *     .setPrettyPrinting()
 *     .setVersion(1.0)
 *     .create();
 * </pre></p>
 *
 * <p>NOTE: the order of invocation of configuration methods does not matter.</p>
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public final class GsonBuilder {public static class __CLR4_4_1n2n2lck0y858{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1006,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final InnerClassExclusionStrategy innerClassExclusionStrategy =
      new InnerClassExclusionStrategy();
  private static final ExposeAnnotationSerializationExclusionStrategy
    exposeAnnotationSerializationExclusionStrategy =
      new ExposeAnnotationSerializationExclusionStrategy();
  private static final ExposeAnnotationDeserializationExclusionStrategy
    exposeAnnotationDeserializationExclusionStrategy =
      new ExposeAnnotationDeserializationExclusionStrategy();

  private final Collection<ExclusionStrategy> exclusionStrategies =
      new HashSet<ExclusionStrategy>();

  private double ignoreVersionsAfter;
  private ModifierBasedExclusionStrategy modifierBasedExclusionStrategy;
  private boolean serializeInnerClasses;
  private boolean excludeFieldsWithoutExposeAnnotation;
  private LongSerializationPolicy longSerializationPolicy;
  private FieldNamingStrategy2 fieldNamingPolicy;
  private final ParameterizedTypeHandlerMap<InstanceCreator<?>> instanceCreators;
  private final ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers;
  private final ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers;
  private boolean serializeNulls;
  private String datePattern;
  private int dateStyle;
  private int timeStyle;
  private boolean serializeSpecialFloatingPointValues;
  private boolean escapeHtmlChars;
  private boolean prettyPrinting;
  private boolean generateNonExecutableJson;

  /**
   * Creates a GsonBuilder instance that can be used to build Gson with various configuration
   * settings. GsonBuilder follows the builder pattern, and it is typically used by first
   * invoking various configuration methods to set desired options, and finally calling
   * {@link #create()}.
   */
  public GsonBuilder() {try{__CLR4_4_1n2n2lck0y858.R.inc(830);
    // add default exclusion strategies
    __CLR4_4_1n2n2lck0y858.R.inc(831);exclusionStrategies.add(Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY);
    __CLR4_4_1n2n2lck0y858.R.inc(832);exclusionStrategies.add(Gson.DEFAULT_SYNTHETIC_FIELD_EXCLUSION_STRATEGY);

    // setup default values
    __CLR4_4_1n2n2lck0y858.R.inc(833);ignoreVersionsAfter = VersionConstants.IGNORE_VERSIONS;
    __CLR4_4_1n2n2lck0y858.R.inc(834);serializeInnerClasses = true;
    __CLR4_4_1n2n2lck0y858.R.inc(835);prettyPrinting = false;
    __CLR4_4_1n2n2lck0y858.R.inc(836);escapeHtmlChars = true;
    __CLR4_4_1n2n2lck0y858.R.inc(837);modifierBasedExclusionStrategy = Gson.DEFAULT_MODIFIER_BASED_EXCLUSION_STRATEGY;
    __CLR4_4_1n2n2lck0y858.R.inc(838);excludeFieldsWithoutExposeAnnotation = false;
    __CLR4_4_1n2n2lck0y858.R.inc(839);longSerializationPolicy = LongSerializationPolicy.DEFAULT;
    __CLR4_4_1n2n2lck0y858.R.inc(840);fieldNamingPolicy = Gson.DEFAULT_NAMING_POLICY;
    __CLR4_4_1n2n2lck0y858.R.inc(841);instanceCreators = new ParameterizedTypeHandlerMap<InstanceCreator<?>>();
    __CLR4_4_1n2n2lck0y858.R.inc(842);serializers = new ParameterizedTypeHandlerMap<JsonSerializer<?>>();
    __CLR4_4_1n2n2lck0y858.R.inc(843);deserializers = new ParameterizedTypeHandlerMap<JsonDeserializer<?>>();
    __CLR4_4_1n2n2lck0y858.R.inc(844);serializeNulls = false;
    __CLR4_4_1n2n2lck0y858.R.inc(845);dateStyle = DateFormat.DEFAULT;
    __CLR4_4_1n2n2lck0y858.R.inc(846);timeStyle = DateFormat.DEFAULT;
    __CLR4_4_1n2n2lck0y858.R.inc(847);serializeSpecialFloatingPointValues = false;
    __CLR4_4_1n2n2lck0y858.R.inc(848);generateNonExecutableJson = false;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to enable versioning support.
   *
   * @param ignoreVersionsAfter any field or type marked with a version higher than this value
   * are ignored during serialization or deserialization.
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  public GsonBuilder setVersion(double ignoreVersionsAfter) {try{__CLR4_4_1n2n2lck0y858.R.inc(849);
    __CLR4_4_1n2n2lck0y858.R.inc(850);this.ignoreVersionsAfter = ignoreVersionsAfter;
    __CLR4_4_1n2n2lck0y858.R.inc(851);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to excludes all class fields that have the specified modifiers. By default,
   * Gson will exclude all fields marked transient or static. This method will override that
   * behavior.
   *
   * @param modifiers the field modifiers. You must use the modifiers specified in the
   * {@link java.lang.reflect.Modifier} class. For example,
   * {@link java.lang.reflect.Modifier#TRANSIENT},
   * {@link java.lang.reflect.Modifier#STATIC}.
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  public GsonBuilder excludeFieldsWithModifiers(int... modifiers) {try{__CLR4_4_1n2n2lck0y858.R.inc(852);
    __CLR4_4_1n2n2lck0y858.R.inc(853);modifierBasedExclusionStrategy = new ModifierBasedExclusionStrategy(modifiers);
    __CLR4_4_1n2n2lck0y858.R.inc(854);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Makes the output JSON non-executable in Javascript by prefixing the generated JSON with some
   * special text. This prevents attacks from third-party sites through script sourcing. See
   * <a href="http://code.google.com/p/google-gson/issues/detail?id=42">Gson Issue 42</a>
   * for details.
   *
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.3
   */
  public GsonBuilder generateNonExecutableJson() {try{__CLR4_4_1n2n2lck0y858.R.inc(855);
    __CLR4_4_1n2n2lck0y858.R.inc(856);this.generateNonExecutableJson = true;
    __CLR4_4_1n2n2lck0y858.R.inc(857);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to exclude all fields from consideration for serialization or deserialization
   * that do not have the {@link com.google.gson.annotations.Expose} annotation.
   *
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  public GsonBuilder excludeFieldsWithoutExposeAnnotation() {try{__CLR4_4_1n2n2lck0y858.R.inc(858);
    __CLR4_4_1n2n2lck0y858.R.inc(859);excludeFieldsWithoutExposeAnnotation = true;
    __CLR4_4_1n2n2lck0y858.R.inc(860);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configure Gson to serialize null fields. By default, Gson omits all fields that are null
   * during serialization.
   *
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.2
   */
  public GsonBuilder serializeNulls() {try{__CLR4_4_1n2n2lck0y858.R.inc(861);
    __CLR4_4_1n2n2lck0y858.R.inc(862);this.serializeNulls = true;
    __CLR4_4_1n2n2lck0y858.R.inc(863);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to exclude inner classes during serialization.
   *
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.3
   */
  public GsonBuilder disableInnerClassSerialization() {try{__CLR4_4_1n2n2lck0y858.R.inc(864);
    __CLR4_4_1n2n2lck0y858.R.inc(865);serializeInnerClasses = false;
    __CLR4_4_1n2n2lck0y858.R.inc(866);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to apply a specific serialization policy for {@code Long} and {@code long}
   * objects.
   *
   * @param serializationPolicy the particular policy to use for serializing longs.
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.3
   */
  public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy serializationPolicy) {try{__CLR4_4_1n2n2lck0y858.R.inc(867);
    __CLR4_4_1n2n2lck0y858.R.inc(868);this.longSerializationPolicy = serializationPolicy;
    __CLR4_4_1n2n2lck0y858.R.inc(869);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to apply a specific naming policy to an object's field during serialization
   * and deserialization.
   *
   * @param namingConvention the JSON field naming convention to use for serialization and
   * deserialization.
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy namingConvention) {try{__CLR4_4_1n2n2lck0y858.R.inc(870);
    __CLR4_4_1n2n2lck0y858.R.inc(871);return setFieldNamingStrategy(namingConvention.getFieldNamingPolicy());
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to apply a specific naming policy strategy to an object's field during
   * serialization and deserialization.
   *
   * @param fieldNamingStrategy the actual naming strategy to apply to the fields
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.3
   */
  public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {try{__CLR4_4_1n2n2lck0y858.R.inc(872);
    __CLR4_4_1n2n2lck0y858.R.inc(873);return setFieldNamingStrategy(new FieldNamingStrategy2Adapter(fieldNamingStrategy));
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to apply a specific naming policy strategy to an object's field during
   * serialization and deserialization.
   *
   * @param fieldNamingStrategy the actual naming strategy to apply to the fields
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  GsonBuilder setFieldNamingStrategy(FieldNamingStrategy2 fieldNamingStrategy) {try{__CLR4_4_1n2n2lck0y858.R.inc(874);
    __CLR4_4_1n2n2lck0y858.R.inc(875);this.fieldNamingPolicy =
        new SerializedNameAnnotationInterceptingNamingPolicy(fieldNamingStrategy);
    __CLR4_4_1n2n2lck0y858.R.inc(876);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to apply a set of exclusion strategies during both serialization and
   * deserialization. Each of the {@code strategies} will be applied as a disjunction rule.
   * This means that if one of the {@code strategies} suggests that a field (or class) should be
   * skipped then that field (or object) is skipped during serializaiton/deserialization.
   *
   * @param strategies the set of strategy object to apply during object (de)serialization.
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.4
   */
  public GsonBuilder setExclusionStrategies(ExclusionStrategy... strategies) {try{__CLR4_4_1n2n2lck0y858.R.inc(877);
    __CLR4_4_1n2n2lck0y858.R.inc(878);for (ExclusionStrategy strategy : strategies) {{
      __CLR4_4_1n2n2lck0y858.R.inc(879);exclusionStrategies.add(strategy);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(880);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to output Json that fits in a page for pretty printing. This option only
   * affects Json serialization.
   *
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  public GsonBuilder setPrettyPrinting() {try{__CLR4_4_1n2n2lck0y858.R.inc(881);
    __CLR4_4_1n2n2lck0y858.R.inc(882);prettyPrinting = true;
    __CLR4_4_1n2n2lck0y858.R.inc(883);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * By default, Gson escapes HTML characters such as &lt; &gt; etc. Use this option to configure
   * Gson to pass-through HTML characters as is.
   *
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.3
   */
  public GsonBuilder disableHtmlEscaping() {try{__CLR4_4_1n2n2lck0y858.R.inc(884);
    __CLR4_4_1n2n2lck0y858.R.inc(885);this.escapeHtmlChars = false;
    __CLR4_4_1n2n2lck0y858.R.inc(886);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to serialize {@code Date} objects according to the pattern provided. You can
   * call this method or {@link #setDateFormat(int)} multiple times, but only the last invocation
   * will be used to decide the serialization format.
   *
   * <p>Note that this pattern must abide by the convention provided by {@code SimpleDateFormat}
   * class. See the documentation in {@link java.text.SimpleDateFormat} for more information on
   * valid date and time patterns.</p>
   *
   * @param pattern the pattern that dates will be serialized/deserialized to/from
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.2
   */
  public GsonBuilder setDateFormat(String pattern) {try{__CLR4_4_1n2n2lck0y858.R.inc(887);
    // TODO(Joel): Make this fail fast if it is an invalid date format
    __CLR4_4_1n2n2lck0y858.R.inc(888);this.datePattern = pattern;
    __CLR4_4_1n2n2lck0y858.R.inc(889);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to to serialize {@code Date} objects according to the style value provided.
   * You can call this method or {@link #setDateFormat(String)} multiple times, but only the last
   * invocation will be used to decide the serialization format.
   *
   * <p>Note that this style value should be one of the predefined constants in the
   * {@code DateFormat} class. See the documentation in {@link java.text.DateFormat} for more
   * information on the valid style constants.</p>
   *
   * @param style the predefined date style that date objects will be serialized/deserialized
   * to/from
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.2
   */
  public GsonBuilder setDateFormat(int style) {try{__CLR4_4_1n2n2lck0y858.R.inc(890);
    __CLR4_4_1n2n2lck0y858.R.inc(891);this.dateStyle = style;
    __CLR4_4_1n2n2lck0y858.R.inc(892);this.datePattern = null;
    __CLR4_4_1n2n2lck0y858.R.inc(893);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to to serialize {@code Date} objects according to the style value provided.
   * You can call this method or {@link #setDateFormat(String)} multiple times, but only the last
   * invocation will be used to decide the serialization format.
   *
   * <p>Note that this style value should be one of the predefined constants in the
   * {@code DateFormat} class. See the documentation in {@link java.text.DateFormat} for more
   * information on the valid style constants.</p>
   *
   * @param dateStyle the predefined date style that date objects will be serialized/deserialized
   * to/from
   * @param timeStyle the predefined style for the time portion of the date objects
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.2
   */
  public GsonBuilder setDateFormat(int dateStyle, int timeStyle) {try{__CLR4_4_1n2n2lck0y858.R.inc(894);
    __CLR4_4_1n2n2lck0y858.R.inc(895);this.dateStyle = dateStyle;
    __CLR4_4_1n2n2lck0y858.R.inc(896);this.timeStyle = timeStyle;
    __CLR4_4_1n2n2lck0y858.R.inc(897);this.datePattern = null;
    __CLR4_4_1n2n2lck0y858.R.inc(898);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson for custom serialization or deserialization. This method combines the
   * registration of an {@link InstanceCreator}, {@link JsonSerializer}, and a
   * {@link JsonDeserializer}. It is best used when a single object {@code typeAdapter} implements
   * all the required interfaces for custom serialization with Gson. If an instance creator,
   * serializer or deserializer was previously registered for the specified {@code type}, it is
   * overwritten.
   *
   * @param type the type definition for the type adapter being registered
   * @param typeAdapter This object must implement at least one of the {@link InstanceCreator},
   * {@link JsonSerializer}, and a {@link JsonDeserializer} interfaces.
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  public GsonBuilder registerTypeAdapter(Type type, Object typeAdapter) {try{__CLR4_4_1n2n2lck0y858.R.inc(899);
    __CLR4_4_1n2n2lck0y858.R.inc(900);Preconditions.checkArgument(typeAdapter instanceof JsonSerializer<?>
        || typeAdapter instanceof JsonDeserializer<?> || typeAdapter instanceof InstanceCreator<?>);
    __CLR4_4_1n2n2lck0y858.R.inc(901);if ((((typeAdapter instanceof InstanceCreator<?>)&&(__CLR4_4_1n2n2lck0y858.R.iget(902)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(903)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(904);registerInstanceCreator(type, (InstanceCreator<?>) typeAdapter);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(905);if ((((typeAdapter instanceof JsonSerializer<?>)&&(__CLR4_4_1n2n2lck0y858.R.iget(906)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(907)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(908);registerSerializer(type, (JsonSerializer<?>) typeAdapter);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(909);if ((((typeAdapter instanceof JsonDeserializer<?>)&&(__CLR4_4_1n2n2lck0y858.R.iget(910)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(911)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(912);registerDeserializer(type, (JsonDeserializer<?>) typeAdapter);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(913);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to use a custom {@link InstanceCreator} for the specified type. If an instance
   * creator was previously registered for the specified class, it is overwritten. Since this method
   * takes a type instead of a Class object, it can be used to register a specific handler for a
   * generic type corresponding to a raw type.
   *
   * @param <T> the type for which instance creator is being registered
   * @param typeOfT The Type definition for T
   * @param instanceCreator the instance creator for T
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  private <T> GsonBuilder registerInstanceCreator(Type typeOfT,
      InstanceCreator<? extends T> instanceCreator) {try{__CLR4_4_1n2n2lck0y858.R.inc(914);
    __CLR4_4_1n2n2lck0y858.R.inc(915);instanceCreators.register(typeOfT, instanceCreator);
    __CLR4_4_1n2n2lck0y858.R.inc(916);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to use a custom JSON serializer for the specified type. You should use this
   * method if you want to register different serializers for different generic types corresponding
   * to a raw type.
   *
   * @param <T> the type for which the serializer is being registered
   * @param typeOfT The type definition for T
   * @param serializer the custom serializer
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  private <T> GsonBuilder registerSerializer(Type typeOfT, final JsonSerializer<T> serializer) {try{__CLR4_4_1n2n2lck0y858.R.inc(917);
    __CLR4_4_1n2n2lck0y858.R.inc(918);serializers.register(typeOfT, serializer);
    __CLR4_4_1n2n2lck0y858.R.inc(919);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson to use a custom JSON deserializer for the specified type. You should use this
   * method if you want to register different deserializers for different generic types
   * corresponding to a raw type.
   *
   * @param <T> the type for which the deserializer is being registered
   * @param typeOfT The type definition for T
   * @param deserializer the custom deserializer
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   */
  private <T> GsonBuilder registerDeserializer(Type typeOfT, JsonDeserializer<T> deserializer) {try{__CLR4_4_1n2n2lck0y858.R.inc(920);
    __CLR4_4_1n2n2lck0y858.R.inc(921);deserializers.register(typeOfT, new JsonDeserializerExceptionWrapper<T>(deserializer));
    __CLR4_4_1n2n2lck0y858.R.inc(922);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Configures Gson for custom serialization or deserialization for an inheritance type hierarchy.
   * This method combines the registration of an {@link InstanceCreator}, {@link JsonSerializer},
   * and a {@link JsonDeserializer}. It is best used when a single object {@code typeAdapter}
   * implements all the required interfaces for custom serialization with Gson.
   * If an instance creator, serializer or deserializer was previously registered for the specified
   * type hierarchy, it is overwritten. If an instance creator, serializer or deserializer is
   * registered for a specific type in the type hierarchy, it will be invoked instead of the one
   * registered for the type hierarchy.
   *
   * @param baseType the class definition for the type adapter being registered for the base class
   *        or interface
   * @param typeAdapter This object must implement at least one of the {@link InstanceCreator},
   * {@link JsonSerializer}, and a {@link JsonDeserializer} interfaces.
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.6
   */
  public GsonBuilder registerTypeHierarchyAdapter(Class<?> baseType, Object typeAdapter) {try{__CLR4_4_1n2n2lck0y858.R.inc(923);
    __CLR4_4_1n2n2lck0y858.R.inc(924);Preconditions.checkArgument(typeAdapter instanceof JsonSerializer<?>
    || typeAdapter instanceof JsonDeserializer<?> || typeAdapter instanceof InstanceCreator<?>);
    __CLR4_4_1n2n2lck0y858.R.inc(925);if ((((typeAdapter instanceof InstanceCreator<?>)&&(__CLR4_4_1n2n2lck0y858.R.iget(926)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(927)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(928);registerInstanceCreatorForTypeHierarchy(baseType, (InstanceCreator<?>) typeAdapter);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(929);if ((((typeAdapter instanceof JsonSerializer<?>)&&(__CLR4_4_1n2n2lck0y858.R.iget(930)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(931)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(932);registerSerializerForTypeHierarchy(baseType, (JsonSerializer<?>) typeAdapter);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(933);if ((((typeAdapter instanceof JsonDeserializer<?>)&&(__CLR4_4_1n2n2lck0y858.R.iget(934)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(935)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(936);registerDeserializerForTypeHierarchy(baseType, (JsonDeserializer<?>) typeAdapter);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(937);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  private <T> GsonBuilder registerInstanceCreatorForTypeHierarchy(Class<?> classOfT,
      InstanceCreator<? extends T> instanceCreator) {try{__CLR4_4_1n2n2lck0y858.R.inc(938);
    __CLR4_4_1n2n2lck0y858.R.inc(939);instanceCreators.registerForTypeHierarchy(classOfT, instanceCreator);
    __CLR4_4_1n2n2lck0y858.R.inc(940);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  private <T> GsonBuilder registerSerializerForTypeHierarchy(Class<?> classOfT,
      final JsonSerializer<T> serializer) {try{__CLR4_4_1n2n2lck0y858.R.inc(941);
    __CLR4_4_1n2n2lck0y858.R.inc(942);serializers.registerForTypeHierarchy(classOfT, serializer);
    __CLR4_4_1n2n2lck0y858.R.inc(943);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  private <T> GsonBuilder registerDeserializerForTypeHierarchy(Class<?> classOfT,
      JsonDeserializer<T> deserializer) {try{__CLR4_4_1n2n2lck0y858.R.inc(944);
    __CLR4_4_1n2n2lck0y858.R.inc(945);deserializers.registerForTypeHierarchy(classOfT,
        new JsonDeserializerExceptionWrapper<T>(deserializer));
    __CLR4_4_1n2n2lck0y858.R.inc(946);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Section 2.4 of <a href="http://www.ietf.org/rfc/rfc4627.txt">JSON specification</a> disallows
   * special double values (NaN, Infinity, -Infinity). However,
   * <a href="http://www.ecma-international.org/publications/files/ECMA-ST/Ecma-262.pdf">Javascript
   * specification</a> (see section 4.3.20, 4.3.22, 4.3.23) allows these values as valid Javascript
   * values. Moreover, most JavaScript engines will accept these special values in JSON without
   * problem. So, at a practical level, it makes sense to accept these values as valid JSON even
   * though JSON specification disallows them.
   *
   * <p>Gson always accepts these special values during deserialization. However, it outputs
   * strictly compliant JSON. Hence, if it encounters a float value {@link Float#NaN},
   * {@link Float#POSITIVE_INFINITY}, {@link Float#NEGATIVE_INFINITY}, or a double value
   * {@link Double#NaN}, {@link Double#POSITIVE_INFINITY}, {@link Double#NEGATIVE_INFINITY}, it
   * will throw an {@link IllegalArgumentException}. This method provides a way to override the
   * default behavior when you know that the JSON receiver will be able to handle these special
   * values.
   *
   * @return a reference to this {@code GsonBuilder} object to fulfill the "Builder" pattern
   * @since 1.3
   */
  public GsonBuilder serializeSpecialFloatingPointValues() {try{__CLR4_4_1n2n2lck0y858.R.inc(947);
    __CLR4_4_1n2n2lck0y858.R.inc(948);this.serializeSpecialFloatingPointValues = true;
    __CLR4_4_1n2n2lck0y858.R.inc(949);return this;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  /**
   * Creates a {@link Gson} instance based on the current configuration. This method is free of
   * side-effects to this {@code GsonBuilder} instance and hence can be called multiple times.
   *
   * @return an instance of Gson configured with the options currently set in this builder
   */
  public Gson create() {try{__CLR4_4_1n2n2lck0y858.R.inc(950);
    __CLR4_4_1n2n2lck0y858.R.inc(951);List<ExclusionStrategy> serializationStrategies =
        new LinkedList<ExclusionStrategy>(exclusionStrategies);
    __CLR4_4_1n2n2lck0y858.R.inc(952);List<ExclusionStrategy> deserializationStrategies =
        new LinkedList<ExclusionStrategy>(exclusionStrategies);

    __CLR4_4_1n2n2lck0y858.R.inc(953);serializationStrategies.add(modifierBasedExclusionStrategy);
    __CLR4_4_1n2n2lck0y858.R.inc(954);deserializationStrategies.add(modifierBasedExclusionStrategy);

    __CLR4_4_1n2n2lck0y858.R.inc(955);if ((((!serializeInnerClasses)&&(__CLR4_4_1n2n2lck0y858.R.iget(956)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(957)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(958);serializationStrategies.add(innerClassExclusionStrategy);
      __CLR4_4_1n2n2lck0y858.R.inc(959);deserializationStrategies.add(innerClassExclusionStrategy);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(960);if ((((ignoreVersionsAfter != VersionConstants.IGNORE_VERSIONS)&&(__CLR4_4_1n2n2lck0y858.R.iget(961)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(962)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(963);serializationStrategies.add(new VersionExclusionStrategy(ignoreVersionsAfter));
      __CLR4_4_1n2n2lck0y858.R.inc(964);deserializationStrategies.add(new VersionExclusionStrategy(ignoreVersionsAfter));
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(965);if ((((excludeFieldsWithoutExposeAnnotation)&&(__CLR4_4_1n2n2lck0y858.R.iget(966)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(967)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(968);serializationStrategies.add(exposeAnnotationSerializationExclusionStrategy);
      __CLR4_4_1n2n2lck0y858.R.inc(969);deserializationStrategies.add(exposeAnnotationDeserializationExclusionStrategy);
    }
    }__CLR4_4_1n2n2lck0y858.R.inc(970);ExclusionStrategy serializationExclusionStrategy =
      new DisjunctionExclusionStrategy(serializationStrategies);
    __CLR4_4_1n2n2lck0y858.R.inc(971);ExclusionStrategy deserializationExclusionStrategy =
      new DisjunctionExclusionStrategy(deserializationStrategies);

    __CLR4_4_1n2n2lck0y858.R.inc(972);ParameterizedTypeHandlerMap<JsonSerializer<?>> customSerializers = serializers.copyOf();
    __CLR4_4_1n2n2lck0y858.R.inc(973);ParameterizedTypeHandlerMap<JsonDeserializer<?>> customDeserializers = deserializers.copyOf();
    __CLR4_4_1n2n2lck0y858.R.inc(974);addTypeAdaptersForDate(datePattern, dateStyle, timeStyle, customSerializers,
        customDeserializers);

    __CLR4_4_1n2n2lck0y858.R.inc(975);customSerializers.registerIfAbsent(DefaultTypeAdapters.getDefaultSerializers(
        serializeSpecialFloatingPointValues, longSerializationPolicy));

    __CLR4_4_1n2n2lck0y858.R.inc(976);customDeserializers.registerIfAbsent(DefaultTypeAdapters.getDefaultDeserializers());

    __CLR4_4_1n2n2lck0y858.R.inc(977);ParameterizedTypeHandlerMap<InstanceCreator<?>> customInstanceCreators =
        instanceCreators.copyOf();
    __CLR4_4_1n2n2lck0y858.R.inc(978);customInstanceCreators.registerIfAbsent(DefaultTypeAdapters.getDefaultInstanceCreators());

    __CLR4_4_1n2n2lck0y858.R.inc(979);customSerializers.makeUnmodifiable();
    __CLR4_4_1n2n2lck0y858.R.inc(980);customDeserializers.makeUnmodifiable();
    __CLR4_4_1n2n2lck0y858.R.inc(981);instanceCreators.makeUnmodifiable();

    __CLR4_4_1n2n2lck0y858.R.inc(982);MappedObjectConstructor objConstructor = new MappedObjectConstructor(customInstanceCreators);

    __CLR4_4_1n2n2lck0y858.R.inc(983);Gson gson = new Gson(serializationExclusionStrategy, deserializationExclusionStrategy,
        fieldNamingPolicy, objConstructor, serializeNulls, customSerializers,
        customDeserializers, generateNonExecutableJson, escapeHtmlChars, prettyPrinting);
    __CLR4_4_1n2n2lck0y858.R.inc(984);return gson;
  }finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}

  private static void addTypeAdaptersForDate(String datePattern, int dateStyle, int timeStyle,
      ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers,
      ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers) {try{__CLR4_4_1n2n2lck0y858.R.inc(985);
    __CLR4_4_1n2n2lck0y858.R.inc(986);DefaultDateTypeAdapter dateTypeAdapter = null;
    __CLR4_4_1n2n2lck0y858.R.inc(987);if ((((datePattern != null && !"".equals(datePattern.trim()))&&(__CLR4_4_1n2n2lck0y858.R.iget(988)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(989)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(990);dateTypeAdapter = new DefaultDateTypeAdapter(datePattern);
    } }else {__CLR4_4_1n2n2lck0y858.R.inc(991);if ((((dateStyle != DateFormat.DEFAULT && timeStyle != DateFormat.DEFAULT)&&(__CLR4_4_1n2n2lck0y858.R.iget(992)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(993)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(994);dateTypeAdapter = new DefaultDateTypeAdapter(dateStyle, timeStyle);
    }

    }}__CLR4_4_1n2n2lck0y858.R.inc(995);if ((((dateTypeAdapter != null)&&(__CLR4_4_1n2n2lck0y858.R.iget(996)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(997)==0&false))) {{
      __CLR4_4_1n2n2lck0y858.R.inc(998);if ((((!serializers.hasSpecificHandlerFor(Date.class))&&(__CLR4_4_1n2n2lck0y858.R.iget(999)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(1000)==0&false))) {{
        __CLR4_4_1n2n2lck0y858.R.inc(1001);serializers.register(Date.class, dateTypeAdapter);
      }
      }__CLR4_4_1n2n2lck0y858.R.inc(1002);if ((((!deserializers.hasSpecificHandlerFor(Date.class))&&(__CLR4_4_1n2n2lck0y858.R.iget(1003)!=0|true))||(__CLR4_4_1n2n2lck0y858.R.iget(1004)==0&false))) {{
        __CLR4_4_1n2n2lck0y858.R.inc(1005);deserializers.register(Date.class, dateTypeAdapter);
      }
    }}
  }}finally{__CLR4_4_1n2n2lck0y858.R.flushNeeded();}}
}
