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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.UUID;

/**
 * List of all the default type adapters ({@link JsonSerializer}s, {@link JsonDeserializer}s,
 * and {@link InstanceCreator}s.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class DefaultTypeAdapters {public static class __CLR4_4_11a1alck0y808{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final DefaultDateTypeAdapter DATE_TYPE_ADAPTER = new DefaultDateTypeAdapter();
  private static final DefaultJavaSqlDateTypeAdapter JAVA_SQL_DATE_TYPE_ADAPTER =
    new DefaultJavaSqlDateTypeAdapter();
  private static final DefaultTimeTypeAdapter TIME_TYPE_ADAPTER =
    new DefaultTimeTypeAdapter();
  private static final DefaultTimestampDeserializer TIMESTAMP_DESERIALIZER =
    new DefaultTimestampDeserializer();

  @SuppressWarnings({ "rawtypes" })
  private static final EnumTypeAdapter ENUM_TYPE_ADAPTER = new EnumTypeAdapter();
  private static final UrlTypeAdapter URL_TYPE_ADAPTER = new UrlTypeAdapter();
  private static final UriTypeAdapter URI_TYPE_ADAPTER = new UriTypeAdapter();
  private static final UuidTypeAdapter UUUID_TYPE_ADAPTER = new UuidTypeAdapter();
  private static final LocaleTypeAdapter LOCALE_TYPE_ADAPTER = new LocaleTypeAdapter();
  private static final CollectionTypeAdapter COLLECTION_TYPE_ADAPTER = new CollectionTypeAdapter();
  private static final MapTypeAdapter MAP_TYPE_ADAPTER = new MapTypeAdapter();
  private static final BigDecimalTypeAdapter BIG_DECIMAL_TYPE_ADAPTER = new BigDecimalTypeAdapter();
  private static final BigIntegerTypeAdapter BIG_INTEGER_TYPE_ADAPTER = new BigIntegerTypeAdapter();

  private static final BooleanTypeAdapter BOOLEAN_TYPE_ADAPTER = new BooleanTypeAdapter();
  private static final ByteTypeAdapter BYTE_TYPE_ADAPTER = new ByteTypeAdapter();
  private static final CharacterTypeAdapter CHARACTER_TYPE_ADAPTER = new CharacterTypeAdapter();
  private static final DoubleDeserializer DOUBLE_TYPE_ADAPTER = new DoubleDeserializer();
  private static final FloatDeserializer FLOAT_TYPE_ADAPTER = new FloatDeserializer();
  private static final IntegerTypeAdapter INTEGER_TYPE_ADAPTER = new IntegerTypeAdapter();
  private static final LongDeserializer LONG_DESERIALIZER = new LongDeserializer();
  private static final NumberTypeAdapter NUMBER_TYPE_ADAPTER = new NumberTypeAdapter();
  private static final ShortTypeAdapter SHORT_TYPE_ADAPTER = new ShortTypeAdapter();
  private static final StringTypeAdapter STRING_TYPE_ADAPTER = new StringTypeAdapter();

  private static final PropertiesCreator PROPERTIES_CREATOR = new PropertiesCreator();
  private static final TreeSetCreator TREE_SET_CREATOR = new TreeSetCreator();
  private static final HashSetCreator HASH_SET_CREATOR = new HashSetCreator();
  private static final GregorianCalendarTypeAdapter GREGORIAN_CALENDAR_TYPE_ADAPTER = 
    new GregorianCalendarTypeAdapter();

  // The constants DEFAULT_SERIALIZERS, DEFAULT_DESERIALIZERS, and DEFAULT_INSTANCE_CREATORS
  // must be defined after the constants for the type adapters. Otherwise, the type adapter
  // constants will appear as nulls.
  private static final ParameterizedTypeHandlerMap<JsonSerializer<?>> DEFAULT_SERIALIZERS =
      createDefaultSerializers();
  private static final ParameterizedTypeHandlerMap<JsonDeserializer<?>> DEFAULT_DESERIALIZERS =
      createDefaultDeserializers();
  private static final ParameterizedTypeHandlerMap<InstanceCreator<?>> DEFAULT_INSTANCE_CREATORS =
      createDefaultInstanceCreators();

  private static ParameterizedTypeHandlerMap<JsonSerializer<?>> createDefaultSerializers() {try{__CLR4_4_11a1alck0y808.R.inc(46);
    __CLR4_4_11a1alck0y808.R.inc(47);ParameterizedTypeHandlerMap<JsonSerializer<?>> map =
        new ParameterizedTypeHandlerMap<JsonSerializer<?>>();

    __CLR4_4_11a1alck0y808.R.inc(48);map.registerForTypeHierarchy(Enum.class, ENUM_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(49);map.register(URL.class, URL_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(50);map.register(URI.class, URI_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(51);map.register(UUID.class, UUUID_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(52);map.register(Locale.class, LOCALE_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(53);map.registerForTypeHierarchy(Collection.class, COLLECTION_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(54);map.registerForTypeHierarchy(Map.class, MAP_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(55);map.register(Date.class, DATE_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(56);map.register(java.sql.Date.class, JAVA_SQL_DATE_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(57);map.register(Timestamp.class, DATE_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(58);map.register(Time.class, TIME_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(59);map.register(Calendar.class, GREGORIAN_CALENDAR_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(60);map.register(GregorianCalendar.class, GREGORIAN_CALENDAR_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(61);map.register(BigDecimal.class, BIG_DECIMAL_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(62);map.register(BigInteger.class, BIG_INTEGER_TYPE_ADAPTER);
    
    // Add primitive serializers
    __CLR4_4_11a1alck0y808.R.inc(63);map.register(Boolean.class, BOOLEAN_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(64);map.register(boolean.class, BOOLEAN_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(65);map.register(Byte.class, BYTE_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(66);map.register(byte.class, BYTE_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(67);map.register(Character.class, CHARACTER_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(68);map.register(char.class, CHARACTER_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(69);map.register(Integer.class, INTEGER_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(70);map.register(int.class, INTEGER_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(71);map.register(Number.class, NUMBER_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(72);map.register(Short.class, SHORT_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(73);map.register(short.class, SHORT_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(74);map.register(String.class, STRING_TYPE_ADAPTER);

    __CLR4_4_11a1alck0y808.R.inc(75);map.makeUnmodifiable();
    __CLR4_4_11a1alck0y808.R.inc(76);return map;
  }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

  private static ParameterizedTypeHandlerMap<JsonDeserializer<?>> createDefaultDeserializers() {try{__CLR4_4_11a1alck0y808.R.inc(77);
    __CLR4_4_11a1alck0y808.R.inc(78);ParameterizedTypeHandlerMap<JsonDeserializer<?>> map =
        new ParameterizedTypeHandlerMap<JsonDeserializer<?>>();
    __CLR4_4_11a1alck0y808.R.inc(79);map.registerForTypeHierarchy(Enum.class, wrapDeserializer(ENUM_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(80);map.register(URL.class, wrapDeserializer(URL_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(81);map.register(URI.class, wrapDeserializer(URI_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(82);map.register(UUID.class, wrapDeserializer(UUUID_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(83);map.register(Locale.class, wrapDeserializer(LOCALE_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(84);map.registerForTypeHierarchy(Collection.class, wrapDeserializer(COLLECTION_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(85);map.registerForTypeHierarchy(Map.class, wrapDeserializer(MAP_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(86);map.register(Date.class, wrapDeserializer(DATE_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(87);map.register(java.sql.Date.class, wrapDeserializer(JAVA_SQL_DATE_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(88);map.register(Timestamp.class, wrapDeserializer(TIMESTAMP_DESERIALIZER));
    __CLR4_4_11a1alck0y808.R.inc(89);map.register(Time.class, wrapDeserializer(TIME_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(90);map.register(Calendar.class, GREGORIAN_CALENDAR_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(91);map.register(GregorianCalendar.class, GREGORIAN_CALENDAR_TYPE_ADAPTER);
    __CLR4_4_11a1alck0y808.R.inc(92);map.register(BigDecimal.class, wrapDeserializer(BIG_DECIMAL_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(93);map.register(BigInteger.class, wrapDeserializer(BIG_INTEGER_TYPE_ADAPTER));
    
    // Add primitive deserializers
    __CLR4_4_11a1alck0y808.R.inc(94);map.register(Boolean.class, wrapDeserializer(BOOLEAN_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(95);map.register(boolean.class, wrapDeserializer(BOOLEAN_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(96);map.register(Byte.class, wrapDeserializer(BYTE_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(97);map.register(byte.class, wrapDeserializer(BYTE_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(98);map.register(Character.class, wrapDeserializer(CHARACTER_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(99);map.register(char.class, wrapDeserializer(CHARACTER_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(100);map.register(Double.class, wrapDeserializer(DOUBLE_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(101);map.register(double.class, wrapDeserializer(DOUBLE_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(102);map.register(Float.class, wrapDeserializer(FLOAT_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(103);map.register(float.class, wrapDeserializer(FLOAT_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(104);map.register(Integer.class, wrapDeserializer(INTEGER_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(105);map.register(int.class, wrapDeserializer(INTEGER_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(106);map.register(Long.class, wrapDeserializer(LONG_DESERIALIZER));
    __CLR4_4_11a1alck0y808.R.inc(107);map.register(long.class, wrapDeserializer(LONG_DESERIALIZER));
    __CLR4_4_11a1alck0y808.R.inc(108);map.register(Number.class, wrapDeserializer(NUMBER_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(109);map.register(Short.class, wrapDeserializer(SHORT_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(110);map.register(short.class, wrapDeserializer(SHORT_TYPE_ADAPTER));
    __CLR4_4_11a1alck0y808.R.inc(111);map.register(String.class, wrapDeserializer(STRING_TYPE_ADAPTER));

    __CLR4_4_11a1alck0y808.R.inc(112);map.makeUnmodifiable();
    __CLR4_4_11a1alck0y808.R.inc(113);return map;
  }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

  private static ParameterizedTypeHandlerMap<InstanceCreator<?>> createDefaultInstanceCreators() {try{__CLR4_4_11a1alck0y808.R.inc(114);
    __CLR4_4_11a1alck0y808.R.inc(115);ParameterizedTypeHandlerMap<InstanceCreator<?>> map =
        new ParameterizedTypeHandlerMap<InstanceCreator<?>>();
    __CLR4_4_11a1alck0y808.R.inc(116);map.registerForTypeHierarchy(Map.class, MAP_TYPE_ADAPTER);

    // Add Collection type instance creators
    __CLR4_4_11a1alck0y808.R.inc(117);map.registerForTypeHierarchy(Collection.class, COLLECTION_TYPE_ADAPTER);

    __CLR4_4_11a1alck0y808.R.inc(118);map.registerForTypeHierarchy(Set.class, HASH_SET_CREATOR);
    __CLR4_4_11a1alck0y808.R.inc(119);map.registerForTypeHierarchy(SortedSet.class, TREE_SET_CREATOR);
    __CLR4_4_11a1alck0y808.R.inc(120);map.register(Properties.class, PROPERTIES_CREATOR);
    __CLR4_4_11a1alck0y808.R.inc(121);map.makeUnmodifiable();
    __CLR4_4_11a1alck0y808.R.inc(122);return map;
  }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

  @SuppressWarnings({ "unchecked", "rawtypes" })
  private static JsonDeserializer<?> wrapDeserializer(JsonDeserializer<?> deserializer) {try{__CLR4_4_11a1alck0y808.R.inc(123);
    __CLR4_4_11a1alck0y808.R.inc(124);return new JsonDeserializerExceptionWrapper(deserializer);
  }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

  static ParameterizedTypeHandlerMap<JsonSerializer<?>> getDefaultSerializers() {try{__CLR4_4_11a1alck0y808.R.inc(125);
    __CLR4_4_11a1alck0y808.R.inc(126);return getDefaultSerializers(false, LongSerializationPolicy.DEFAULT);
  }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
      
  static ParameterizedTypeHandlerMap<JsonSerializer<?>> getDefaultSerializers(
      boolean serializeSpecialFloatingPointValues, LongSerializationPolicy longSerializationPolicy) {try{__CLR4_4_11a1alck0y808.R.inc(127);
    __CLR4_4_11a1alck0y808.R.inc(128);ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers =
        new ParameterizedTypeHandlerMap<JsonSerializer<?>>();
    
    // Double primitive
    __CLR4_4_11a1alck0y808.R.inc(129);DefaultTypeAdapters.DoubleSerializer doubleSerializer = 
        new DefaultTypeAdapters.DoubleSerializer(serializeSpecialFloatingPointValues);
    __CLR4_4_11a1alck0y808.R.inc(130);serializers.registerIfAbsent(Double.class, doubleSerializer);
    __CLR4_4_11a1alck0y808.R.inc(131);serializers.registerIfAbsent(double.class, doubleSerializer);

    // Float primitive
    __CLR4_4_11a1alck0y808.R.inc(132);DefaultTypeAdapters.FloatSerializer floatSerializer = 
        new DefaultTypeAdapters.FloatSerializer(serializeSpecialFloatingPointValues);
    __CLR4_4_11a1alck0y808.R.inc(133);serializers.registerIfAbsent(Float.class, floatSerializer);
    __CLR4_4_11a1alck0y808.R.inc(134);serializers.registerIfAbsent(float.class, floatSerializer);

    // Long primitive
    __CLR4_4_11a1alck0y808.R.inc(135);DefaultTypeAdapters.LongSerializer longSerializer = 
        new DefaultTypeAdapters.LongSerializer(longSerializationPolicy);
    __CLR4_4_11a1alck0y808.R.inc(136);serializers.registerIfAbsent(Long.class, longSerializer);
    __CLR4_4_11a1alck0y808.R.inc(137);serializers.registerIfAbsent(long.class, longSerializer);

    __CLR4_4_11a1alck0y808.R.inc(138);serializers.registerIfAbsent(DEFAULT_SERIALIZERS);
    __CLR4_4_11a1alck0y808.R.inc(139);return serializers;
  }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  
  static ParameterizedTypeHandlerMap<JsonDeserializer<?>> getDefaultDeserializers() {try{__CLR4_4_11a1alck0y808.R.inc(140);
    __CLR4_4_11a1alck0y808.R.inc(141);return DEFAULT_DESERIALIZERS;
  }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  
  static ParameterizedTypeHandlerMap<InstanceCreator<?>> getDefaultInstanceCreators() {try{__CLR4_4_11a1alck0y808.R.inc(142);
    __CLR4_4_11a1alck0y808.R.inc(143);return DEFAULT_INSTANCE_CREATORS;
  }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

  static class DefaultDateTypeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {
    private final DateFormat format;

    DefaultDateTypeAdapter() {try{__CLR4_4_11a1alck0y808.R.inc(144);
      __CLR4_4_11a1alck0y808.R.inc(145);this.format = DateFormat.getDateTimeInstance();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    DefaultDateTypeAdapter(final String datePattern) {try{__CLR4_4_11a1alck0y808.R.inc(146);
      __CLR4_4_11a1alck0y808.R.inc(147);this.format = new SimpleDateFormat(datePattern);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    DefaultDateTypeAdapter(final int style) {try{__CLR4_4_11a1alck0y808.R.inc(148);
      __CLR4_4_11a1alck0y808.R.inc(149);this.format = DateFormat.getDateInstance(style);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public DefaultDateTypeAdapter(final int dateStyle, final int timeStyle) {try{__CLR4_4_11a1alck0y808.R.inc(150);
      __CLR4_4_11a1alck0y808.R.inc(151);this.format = DateFormat.getDateTimeInstance(dateStyle, timeStyle);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    // These methods need to be synchronized since JDK DateFormat classes are not thread-safe
    // See issue 162
    public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(152);
      __CLR4_4_11a1alck0y808.R.inc(153);synchronized (format) {
        __CLR4_4_11a1alck0y808.R.inc(154);String dateFormatAsString = format.format(src);
        __CLR4_4_11a1alck0y808.R.inc(155);return new JsonPrimitive(dateFormatAsString);
      }
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(156);
      __CLR4_4_11a1alck0y808.R.inc(157);if ((((!(json instanceof JsonPrimitive))&&(__CLR4_4_11a1alck0y808.R.iget(158)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(159)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(160);throw new JsonParseException("The date should be a string value");
      }
      }__CLR4_4_11a1alck0y808.R.inc(161);try {
        __CLR4_4_11a1alck0y808.R.inc(162);synchronized (format) {
          __CLR4_4_11a1alck0y808.R.inc(163);return format.parse(json.getAsString());
        }
      } catch (ParseException e) {
        __CLR4_4_11a1alck0y808.R.inc(164);throw new JsonSyntaxException(e);
      }
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(165);
      __CLR4_4_11a1alck0y808.R.inc(166);StringBuilder sb = new StringBuilder();
      __CLR4_4_11a1alck0y808.R.inc(167);sb.append(DefaultDateTypeAdapter.class.getSimpleName());
      __CLR4_4_11a1alck0y808.R.inc(168);sb.append('(').append(format.getClass().getSimpleName()).append(')');
      __CLR4_4_11a1alck0y808.R.inc(169);return sb.toString();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  static class DefaultJavaSqlDateTypeAdapter implements JsonSerializer<java.sql.Date>,
      JsonDeserializer<java.sql.Date> {
    private final DateFormat format;
    DefaultJavaSqlDateTypeAdapter() {try{__CLR4_4_11a1alck0y808.R.inc(170);
      __CLR4_4_11a1alck0y808.R.inc(171);this.format = new SimpleDateFormat("MMM d, yyyy");
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public JsonElement serialize(java.sql.Date src, Type typeOfSrc,
        JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(172);
      __CLR4_4_11a1alck0y808.R.inc(173);synchronized (format) {
        __CLR4_4_11a1alck0y808.R.inc(174);String dateFormatAsString = format.format(src);
        __CLR4_4_11a1alck0y808.R.inc(175);return new JsonPrimitive(dateFormatAsString);
      }
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}    
    public java.sql.Date deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(176);
      __CLR4_4_11a1alck0y808.R.inc(177);if ((((!(json instanceof JsonPrimitive))&&(__CLR4_4_11a1alck0y808.R.iget(178)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(179)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(180);throw new JsonParseException("The date should be a string value");
      }
      }__CLR4_4_11a1alck0y808.R.inc(181);try {
        __CLR4_4_11a1alck0y808.R.inc(182);synchronized (format) {
          __CLR4_4_11a1alck0y808.R.inc(183);Date date = format.parse(json.getAsString());
          __CLR4_4_11a1alck0y808.R.inc(184);return new java.sql.Date(date.getTime());
        }
      } catch (ParseException e) {
        __CLR4_4_11a1alck0y808.R.inc(185);throw new JsonSyntaxException(e);
      }
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  static class DefaultTimestampDeserializer implements JsonDeserializer<Timestamp> {
    public Timestamp deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(186);
      __CLR4_4_11a1alck0y808.R.inc(187);Date date = context.deserialize(json, Date.class);
      __CLR4_4_11a1alck0y808.R.inc(188);return new Timestamp(date.getTime());
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  static class DefaultTimeTypeAdapter implements JsonSerializer<Time>, JsonDeserializer<Time> {
    private final DateFormat format;
    DefaultTimeTypeAdapter() {try{__CLR4_4_11a1alck0y808.R.inc(189);
      __CLR4_4_11a1alck0y808.R.inc(190);this.format = new SimpleDateFormat("hh:mm:ss a");
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    public JsonElement serialize(Time src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(191);
      __CLR4_4_11a1alck0y808.R.inc(192);synchronized (format) {
        __CLR4_4_11a1alck0y808.R.inc(193);String dateFormatAsString = format.format(src);
        __CLR4_4_11a1alck0y808.R.inc(194);return new JsonPrimitive(dateFormatAsString);
      }
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    public Time deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(195);
      __CLR4_4_11a1alck0y808.R.inc(196);if ((((!(json instanceof JsonPrimitive))&&(__CLR4_4_11a1alck0y808.R.iget(197)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(198)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(199);throw new JsonParseException("The date should be a string value");
      }
      }__CLR4_4_11a1alck0y808.R.inc(200);try {
        __CLR4_4_11a1alck0y808.R.inc(201);synchronized (format) {
          __CLR4_4_11a1alck0y808.R.inc(202);Date date = format.parse(json.getAsString());
          __CLR4_4_11a1alck0y808.R.inc(203);return new Time(date.getTime());
        }
      } catch (ParseException e) {
        __CLR4_4_11a1alck0y808.R.inc(204);throw new JsonSyntaxException(e);
      }
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class GregorianCalendarTypeAdapter 
      implements JsonSerializer<GregorianCalendar>, JsonDeserializer<GregorianCalendar> {

    private static final String YEAR = "year";
    private static final String MONTH = "month";
    private static final String DAY_OF_MONTH = "dayOfMonth";
    private static final String HOUR_OF_DAY = "hourOfDay";
    private static final String MINUTE = "minute";
    private static final String SECOND = "second";

    public JsonElement serialize(GregorianCalendar src, Type typeOfSrc,
        JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(205);
      __CLR4_4_11a1alck0y808.R.inc(206);JsonObject obj = new JsonObject();
      __CLR4_4_11a1alck0y808.R.inc(207);obj.addProperty(YEAR, src.get(Calendar.YEAR));
      __CLR4_4_11a1alck0y808.R.inc(208);obj.addProperty(MONTH, src.get(Calendar.MONTH));
      __CLR4_4_11a1alck0y808.R.inc(209);obj.addProperty(DAY_OF_MONTH, src.get(Calendar.DAY_OF_MONTH));
      __CLR4_4_11a1alck0y808.R.inc(210);obj.addProperty(HOUR_OF_DAY, src.get(Calendar.HOUR_OF_DAY));
      __CLR4_4_11a1alck0y808.R.inc(211);obj.addProperty(MINUTE, src.get(Calendar.MINUTE));      
      __CLR4_4_11a1alck0y808.R.inc(212);obj.addProperty(SECOND, src.get(Calendar.SECOND));      
      __CLR4_4_11a1alck0y808.R.inc(213);return obj;
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    public GregorianCalendar deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(214);
      __CLR4_4_11a1alck0y808.R.inc(215);JsonObject obj = json.getAsJsonObject();
      __CLR4_4_11a1alck0y808.R.inc(216);int year = obj.get(YEAR).getAsInt();
      __CLR4_4_11a1alck0y808.R.inc(217);int month = obj.get(MONTH).getAsInt();
      __CLR4_4_11a1alck0y808.R.inc(218);int dayOfMonth = obj.get(DAY_OF_MONTH).getAsInt();
      __CLR4_4_11a1alck0y808.R.inc(219);int hourOfDay = obj.get(HOUR_OF_DAY).getAsInt();
      __CLR4_4_11a1alck0y808.R.inc(220);int minute = obj.get(MINUTE).getAsInt();      
      __CLR4_4_11a1alck0y808.R.inc(221);int second = obj.get(SECOND).getAsInt();      
      __CLR4_4_11a1alck0y808.R.inc(222);return new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(223);
      __CLR4_4_11a1alck0y808.R.inc(224);return GregorianCalendarTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }
  
  @SuppressWarnings("unchecked")
  private static class EnumTypeAdapter<T extends Enum<T>>
      implements JsonSerializer<T>, JsonDeserializer<T> {
    public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(225);
      __CLR4_4_11a1alck0y808.R.inc(226);return new JsonPrimitive(src.name());
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @SuppressWarnings("cast")
    public T deserialize(JsonElement json, Type classOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(227);
      __CLR4_4_11a1alck0y808.R.inc(228);return (T) Enum.valueOf((Class<T>) classOfT, json.getAsString());
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(229);
      __CLR4_4_11a1alck0y808.R.inc(230);return EnumTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class UrlTypeAdapter implements JsonSerializer<URL>, JsonDeserializer<URL> {
    public JsonElement serialize(URL src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(231);
      __CLR4_4_11a1alck0y808.R.inc(232);return new JsonPrimitive(src.toExternalForm());
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public URL deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(233);
      __CLR4_4_11a1alck0y808.R.inc(234);try {
        __CLR4_4_11a1alck0y808.R.inc(235);return new URL(json.getAsString());
      } catch (MalformedURLException e) {
        __CLR4_4_11a1alck0y808.R.inc(236);throw new JsonSyntaxException(e);
      }
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(237);
      __CLR4_4_11a1alck0y808.R.inc(238);return UrlTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}    
  }

  private static class UriTypeAdapter implements JsonSerializer<URI>, JsonDeserializer<URI> {
    public JsonElement serialize(URI src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(239);
      __CLR4_4_11a1alck0y808.R.inc(240);return new JsonPrimitive(src.toASCIIString());
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    public URI deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
    throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(241);
      __CLR4_4_11a1alck0y808.R.inc(242);try {
        __CLR4_4_11a1alck0y808.R.inc(243);return new URI(json.getAsString());
      } catch (URISyntaxException e) {
        __CLR4_4_11a1alck0y808.R.inc(244);throw new JsonSyntaxException(e);
      }
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(245);
      __CLR4_4_11a1alck0y808.R.inc(246);return UriTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }
  
  private static class UuidTypeAdapter implements JsonSerializer<UUID>, JsonDeserializer<UUID> {
    public JsonElement serialize(UUID src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(247);
      __CLR4_4_11a1alck0y808.R.inc(248);return new JsonPrimitive(src.toString());
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public UUID deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) 
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(249);     
      __CLR4_4_11a1alck0y808.R.inc(250);return UUID.fromString(json.getAsString());
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(251);
        __CLR4_4_11a1alck0y808.R.inc(252);return UuidTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class LocaleTypeAdapter 
      implements JsonSerializer<Locale>, JsonDeserializer<Locale> {
    public JsonElement serialize(Locale src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(253);
      __CLR4_4_11a1alck0y808.R.inc(254);return new JsonPrimitive(src.toString());
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Locale deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(255);
      __CLR4_4_11a1alck0y808.R.inc(256);String locale = json.getAsString();
      __CLR4_4_11a1alck0y808.R.inc(257);StringTokenizer tokenizer = new StringTokenizer(locale, "_");
      __CLR4_4_11a1alck0y808.R.inc(258);String language = null;
      __CLR4_4_11a1alck0y808.R.inc(259);String country = null;
      __CLR4_4_11a1alck0y808.R.inc(260);String variant = null;
      __CLR4_4_11a1alck0y808.R.inc(261);if ((((tokenizer.hasMoreElements())&&(__CLR4_4_11a1alck0y808.R.iget(262)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(263)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(264);language = tokenizer.nextToken();
      }
      }__CLR4_4_11a1alck0y808.R.inc(265);if ((((tokenizer.hasMoreElements())&&(__CLR4_4_11a1alck0y808.R.iget(266)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(267)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(268);country = tokenizer.nextToken();
      }
      }__CLR4_4_11a1alck0y808.R.inc(269);if ((((tokenizer.hasMoreElements())&&(__CLR4_4_11a1alck0y808.R.iget(270)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(271)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(272);variant = tokenizer.nextToken();
      }
      }__CLR4_4_11a1alck0y808.R.inc(273);if ((((country == null && variant == null)&&(__CLR4_4_11a1alck0y808.R.iget(274)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(275)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(276);return new Locale(language);
      } }else {__CLR4_4_11a1alck0y808.R.inc(277);if ((((variant == null)&&(__CLR4_4_11a1alck0y808.R.iget(278)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(279)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(280);return new Locale(language, country);
      } }else {{
        __CLR4_4_11a1alck0y808.R.inc(281);return new Locale(language, country, variant);
      }
    }}}finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(282);
      __CLR4_4_11a1alck0y808.R.inc(283);return LocaleTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  private static class CollectionTypeAdapter implements JsonSerializer<Collection>, 
      JsonDeserializer<Collection>, InstanceCreator<Collection> {
    public JsonElement serialize(Collection src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(284);
      __CLR4_4_11a1alck0y808.R.inc(285);if ((((src == null)&&(__CLR4_4_11a1alck0y808.R.iget(286)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(287)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(288);return JsonNull.createJsonNull();
      }
      }__CLR4_4_11a1alck0y808.R.inc(289);JsonArray array = new JsonArray();
      __CLR4_4_11a1alck0y808.R.inc(290);Type childGenericType = null;
      __CLR4_4_11a1alck0y808.R.inc(291);if ((((typeOfSrc instanceof ParameterizedType)&&(__CLR4_4_11a1alck0y808.R.iget(292)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(293)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(294);childGenericType = new TypeInfoCollection(typeOfSrc).getElementType();        
      }
      }__CLR4_4_11a1alck0y808.R.inc(295);for (Object child : src) {{
        __CLR4_4_11a1alck0y808.R.inc(296);if ((((child == null)&&(__CLR4_4_11a1alck0y808.R.iget(297)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(298)==0&false))) {{
          __CLR4_4_11a1alck0y808.R.inc(299);array.add(JsonNull.createJsonNull());
        } }else {{
          __CLR4_4_11a1alck0y808.R.inc(300);Type childType = ((((childGenericType == null || childGenericType == Object.class)
              )&&(__CLR4_4_11a1alck0y808.R.iget(301)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(302)==0&false))? child.getClass() : childGenericType;
          __CLR4_4_11a1alck0y808.R.inc(303);JsonElement element = context.serialize(child, childType);
          __CLR4_4_11a1alck0y808.R.inc(304);array.add(element);
        }
      }}
      }__CLR4_4_11a1alck0y808.R.inc(305);return array;
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Collection deserialize(JsonElement json, Type typeOfT, 
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(306);
      __CLR4_4_11a1alck0y808.R.inc(307);if ((((json.isJsonNull())&&(__CLR4_4_11a1alck0y808.R.iget(308)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(309)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(310);return null;
      }
      // Use ObjectConstructor to create instance instead of hard-coding a specific type. 
      // This handles cases where users are using their own subclass of Collection.
      }__CLR4_4_11a1alck0y808.R.inc(311);Collection collection = constructCollectionType(typeOfT, context);
      __CLR4_4_11a1alck0y808.R.inc(312);Type childType = new TypeInfoCollection(typeOfT).getElementType();
      __CLR4_4_11a1alck0y808.R.inc(313);for (JsonElement childElement : json.getAsJsonArray()) {{
        __CLR4_4_11a1alck0y808.R.inc(314);if ((((childElement == null || childElement.isJsonNull())&&(__CLR4_4_11a1alck0y808.R.iget(315)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(316)==0&false))) {{
          __CLR4_4_11a1alck0y808.R.inc(317);collection.add(null);
        } }else {{
          __CLR4_4_11a1alck0y808.R.inc(318);Object value = context.deserialize(childElement, childType);
          __CLR4_4_11a1alck0y808.R.inc(319);collection.add(value);
        }
      }}
      }__CLR4_4_11a1alck0y808.R.inc(320);return collection;
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    private Collection constructCollectionType(Type collectionType, 
        JsonDeserializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(321);      
      __CLR4_4_11a1alck0y808.R.inc(322);JsonDeserializationContextDefault contextImpl = (JsonDeserializationContextDefault) context;
      __CLR4_4_11a1alck0y808.R.inc(323);ObjectConstructor objectConstructor = contextImpl.getObjectConstructor();
      __CLR4_4_11a1alck0y808.R.inc(324);return (Collection) objectConstructor.construct(collectionType);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Collection createInstance(Type type) {try{__CLR4_4_11a1alck0y808.R.inc(325);
      __CLR4_4_11a1alck0y808.R.inc(326);return new LinkedList();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}    
  }

  private static class PropertiesCreator implements InstanceCreator<Properties> {
    public Properties createInstance(Type type) {try{__CLR4_4_11a1alck0y808.R.inc(327);
      __CLR4_4_11a1alck0y808.R.inc(328);return new Properties();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}    
  }
  
  @SuppressWarnings({ "unchecked", "rawtypes" })
  static class MapTypeAdapter implements JsonSerializer<Map>, JsonDeserializer<Map>,
      InstanceCreator<Map> {
    
    public JsonElement serialize(Map src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(329);
      __CLR4_4_11a1alck0y808.R.inc(330);JsonObject map = new JsonObject();
      __CLR4_4_11a1alck0y808.R.inc(331);Type childGenericType = null;
      __CLR4_4_11a1alck0y808.R.inc(332);if ((((typeOfSrc instanceof ParameterizedType)&&(__CLR4_4_11a1alck0y808.R.iget(333)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(334)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(335);childGenericType = new TypeInfoMap(typeOfSrc).getValueType();        
      }

      }__CLR4_4_11a1alck0y808.R.inc(336);for (Map.Entry entry : (Set<Map.Entry>) src.entrySet()) {{
        __CLR4_4_11a1alck0y808.R.inc(337);Object value = entry.getValue();

        __CLR4_4_11a1alck0y808.R.inc(338);JsonElement valueElement;
        __CLR4_4_11a1alck0y808.R.inc(339);if ((((value == null)&&(__CLR4_4_11a1alck0y808.R.iget(340)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(341)==0&false))) {{
          __CLR4_4_11a1alck0y808.R.inc(342);valueElement = JsonNull.createJsonNull();
        } }else {{
          __CLR4_4_11a1alck0y808.R.inc(343);Type childType = ((((childGenericType == null)
              )&&(__CLR4_4_11a1alck0y808.R.iget(344)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(345)==0&false))? value.getClass() : childGenericType;
          __CLR4_4_11a1alck0y808.R.inc(346);valueElement = context.serialize(value, childType);
        }
        }__CLR4_4_11a1alck0y808.R.inc(347);map.add(String.valueOf(entry.getKey()), valueElement);
      }
      }__CLR4_4_11a1alck0y808.R.inc(348);return map;
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Map deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(349);
      // Use ObjectConstructor to create instance instead of hard-coding a specific type. 
      // This handles cases where users are using their own subclass of Map.
      __CLR4_4_11a1alck0y808.R.inc(350);Map<Object, Object> map = constructMapType(typeOfT, context);
      __CLR4_4_11a1alck0y808.R.inc(351);TypeInfoMap mapTypeInfo = new TypeInfoMap(typeOfT);
      __CLR4_4_11a1alck0y808.R.inc(352);for (Map.Entry<String, JsonElement> entry : json.getAsJsonObject().entrySet()) {{
        __CLR4_4_11a1alck0y808.R.inc(353);Object key = context.deserialize(new JsonPrimitive(entry.getKey()), mapTypeInfo.getKeyType());
        __CLR4_4_11a1alck0y808.R.inc(354);Object value = context.deserialize(entry.getValue(), mapTypeInfo.getValueType());
        __CLR4_4_11a1alck0y808.R.inc(355);map.put(key, value);
      }
      }__CLR4_4_11a1alck0y808.R.inc(356);return map;
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    private Map constructMapType(Type mapType, JsonDeserializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(357);      
      __CLR4_4_11a1alck0y808.R.inc(358);JsonDeserializationContextDefault contextImpl = (JsonDeserializationContextDefault) context;
      __CLR4_4_11a1alck0y808.R.inc(359);ObjectConstructor objectConstructor = contextImpl.getObjectConstructor();
      __CLR4_4_11a1alck0y808.R.inc(360);return (Map) objectConstructor.construct(mapType);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    public Map createInstance(Type type) {try{__CLR4_4_11a1alck0y808.R.inc(361);
      __CLR4_4_11a1alck0y808.R.inc(362);return new LinkedHashMap();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(363);
      __CLR4_4_11a1alck0y808.R.inc(364);return MapTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class BigDecimalTypeAdapter
      implements JsonSerializer<BigDecimal>, JsonDeserializer<BigDecimal> {
    public JsonElement serialize(BigDecimal src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(365);
      __CLR4_4_11a1alck0y808.R.inc(366);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public BigDecimal deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(367);
      __CLR4_4_11a1alck0y808.R.inc(368);return json.getAsBigDecimal();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(369);
      __CLR4_4_11a1alck0y808.R.inc(370);return BigDecimalTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class BigIntegerTypeAdapter 
      implements JsonSerializer<BigInteger>, JsonDeserializer<BigInteger> {

    public JsonElement serialize(BigInteger src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(371);
      __CLR4_4_11a1alck0y808.R.inc(372);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public BigInteger deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(373);
      __CLR4_4_11a1alck0y808.R.inc(374);return json.getAsBigInteger();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(375);
      __CLR4_4_11a1alck0y808.R.inc(376);return BigIntegerTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }
  
  private static class NumberTypeAdapter
      implements JsonSerializer<Number>, JsonDeserializer<Number> {
    public JsonElement serialize(Number src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(377);
      __CLR4_4_11a1alck0y808.R.inc(378);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    public Number deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(379);
      __CLR4_4_11a1alck0y808.R.inc(380);return json.getAsNumber();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(381);
      __CLR4_4_11a1alck0y808.R.inc(382);return NumberTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }
  
  private static class LongSerializer implements JsonSerializer<Long> {
    private final LongSerializationPolicy longSerializationPolicy;
    
    private LongSerializer(LongSerializationPolicy longSerializationPolicy) {try{__CLR4_4_11a1alck0y808.R.inc(383);
      __CLR4_4_11a1alck0y808.R.inc(384);this.longSerializationPolicy = longSerializationPolicy;
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public JsonElement serialize(Long src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(385);
      __CLR4_4_11a1alck0y808.R.inc(386);return longSerializationPolicy.serialize(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(387);
      __CLR4_4_11a1alck0y808.R.inc(388);return LongSerializer.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class LongDeserializer implements JsonDeserializer<Long> {
    public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(389);
      __CLR4_4_11a1alck0y808.R.inc(390);return json.getAsLong();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(391);
      __CLR4_4_11a1alck0y808.R.inc(392);return LongDeserializer.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class IntegerTypeAdapter 
      implements JsonSerializer<Integer>, JsonDeserializer<Integer> {
    public JsonElement serialize(Integer src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(393);
      __CLR4_4_11a1alck0y808.R.inc(394);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Integer deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(395);
      __CLR4_4_11a1alck0y808.R.inc(396);return json.getAsInt();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(397);
      __CLR4_4_11a1alck0y808.R.inc(398);return IntegerTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class ShortTypeAdapter
      implements JsonSerializer<Short>, JsonDeserializer<Short> {
    public JsonElement serialize(Short src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(399);
      __CLR4_4_11a1alck0y808.R.inc(400);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Short deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(401);
      __CLR4_4_11a1alck0y808.R.inc(402);return json.getAsShort();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(403);
      __CLR4_4_11a1alck0y808.R.inc(404);return ShortTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class ByteTypeAdapter implements JsonSerializer<Byte>, JsonDeserializer<Byte> {
    public JsonElement serialize(Byte src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(405);
      __CLR4_4_11a1alck0y808.R.inc(406);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Byte deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(407);
      __CLR4_4_11a1alck0y808.R.inc(408);return json.getAsByte();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(409);
      __CLR4_4_11a1alck0y808.R.inc(410);return ByteTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  static class FloatSerializer implements JsonSerializer<Float> {
    private final boolean serializeSpecialFloatingPointValues;

    FloatSerializer(boolean serializeSpecialDoubleValues) {try{__CLR4_4_11a1alck0y808.R.inc(411);
      __CLR4_4_11a1alck0y808.R.inc(412);this.serializeSpecialFloatingPointValues = serializeSpecialDoubleValues;
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public JsonElement serialize(Float src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(413);
      __CLR4_4_11a1alck0y808.R.inc(414);if ((((!serializeSpecialFloatingPointValues)&&(__CLR4_4_11a1alck0y808.R.iget(415)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(416)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(417);if ((((Float.isNaN(src) || Float.isInfinite(src))&&(__CLR4_4_11a1alck0y808.R.iget(418)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(419)==0&false))) {{
          __CLR4_4_11a1alck0y808.R.inc(420);throw new IllegalArgumentException(src 
              + " is not a valid float value as per JSON specification. To override this"
              + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
      }}
      }__CLR4_4_11a1alck0y808.R.inc(421);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }
  
  private static class FloatDeserializer implements JsonDeserializer<Float> {
    public Float deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(422);
      __CLR4_4_11a1alck0y808.R.inc(423);return json.getAsFloat();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(424);
      __CLR4_4_11a1alck0y808.R.inc(425);return FloatDeserializer.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  static class DoubleSerializer implements JsonSerializer<Double> {
    private final boolean serializeSpecialFloatingPointValues;

    DoubleSerializer(boolean serializeSpecialDoubleValues) {try{__CLR4_4_11a1alck0y808.R.inc(426);
      __CLR4_4_11a1alck0y808.R.inc(427);this.serializeSpecialFloatingPointValues = serializeSpecialDoubleValues;
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public JsonElement serialize(Double src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(428);
      __CLR4_4_11a1alck0y808.R.inc(429);if ((((!serializeSpecialFloatingPointValues)&&(__CLR4_4_11a1alck0y808.R.iget(430)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(431)==0&false))) {{
        __CLR4_4_11a1alck0y808.R.inc(432);if ((((Double.isNaN(src) || Double.isInfinite(src))&&(__CLR4_4_11a1alck0y808.R.iget(433)!=0|true))||(__CLR4_4_11a1alck0y808.R.iget(434)==0&false))) {{
          __CLR4_4_11a1alck0y808.R.inc(435);throw new IllegalArgumentException(src 
              + " is not a valid double value as per JSON specification. To override this"
              + " behavior, use GsonBuilder.serializeSpecialDoubleValues() method.");
        }
      }}
      }__CLR4_4_11a1alck0y808.R.inc(436);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class DoubleDeserializer implements JsonDeserializer<Double> {
    public Double deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(437);
      __CLR4_4_11a1alck0y808.R.inc(438);return json.getAsDouble();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(439);
      __CLR4_4_11a1alck0y808.R.inc(440);return DoubleDeserializer.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class CharacterTypeAdapter 
      implements JsonSerializer<Character>, JsonDeserializer<Character> {
    public JsonElement serialize(Character src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(441);
      __CLR4_4_11a1alck0y808.R.inc(442);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Character deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(443);
      __CLR4_4_11a1alck0y808.R.inc(444);return json.getAsCharacter();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(445);
      __CLR4_4_11a1alck0y808.R.inc(446);return CharacterTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }
  
  private static class StringTypeAdapter
      implements JsonSerializer<String>, JsonDeserializer<String> {
    public JsonElement serialize(String src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(447);
      __CLR4_4_11a1alck0y808.R.inc(448);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(449);
      __CLR4_4_11a1alck0y808.R.inc(450);return json.getAsString();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(451);
      __CLR4_4_11a1alck0y808.R.inc(452);return StringTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class BooleanTypeAdapter 
      implements JsonSerializer<Boolean>, JsonDeserializer<Boolean> {
    public JsonElement serialize(Boolean src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_11a1alck0y808.R.inc(453);
      __CLR4_4_11a1alck0y808.R.inc(454);return new JsonPrimitive(src);
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    public Boolean deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_11a1alck0y808.R.inc(455);
      __CLR4_4_11a1alck0y808.R.inc(456);return json.getAsBoolean();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(457);
      __CLR4_4_11a1alck0y808.R.inc(458);return BooleanTypeAdapter.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class TreeSetCreator implements InstanceCreator<TreeSet<?>> {
    public TreeSet<?> createInstance(Type type) {try{__CLR4_4_11a1alck0y808.R.inc(459);
      __CLR4_4_11a1alck0y808.R.inc(460);return new TreeSet<Object>();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(461);
      __CLR4_4_11a1alck0y808.R.inc(462);return TreeSetCreator.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }

  private static class HashSetCreator implements InstanceCreator<HashSet<?>> {
    public HashSet<?> createInstance(Type type) {try{__CLR4_4_11a1alck0y808.R.inc(463);
      __CLR4_4_11a1alck0y808.R.inc(464);return new HashSet<Object>();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
    @Override
    public String toString() {try{__CLR4_4_11a1alck0y808.R.inc(465);
      __CLR4_4_11a1alck0y808.R.inc(466);return HashSetCreator.class.getSimpleName();
    }finally{__CLR4_4_11a1alck0y808.R.flushNeeded();}}
  }
}
