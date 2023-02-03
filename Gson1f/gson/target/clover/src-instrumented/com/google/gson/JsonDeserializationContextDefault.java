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

/**
 * implementation of a deserialization context for Gson
 *
 * @author Inderjeet Singh
 */
final class JsonDeserializationContextDefault implements JsonDeserializationContext {public static class __CLR4_4_1wqwqlck0y87t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1218,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private final ObjectNavigatorFactory navigatorFactory;
  private final ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers;
  private final MappedObjectConstructor objectConstructor;

  JsonDeserializationContextDefault(ObjectNavigatorFactory navigatorFactory,
      ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers,
      MappedObjectConstructor objectConstructor) {try{__CLR4_4_1wqwqlck0y87t.R.inc(1178);
    __CLR4_4_1wqwqlck0y87t.R.inc(1179);this.navigatorFactory = navigatorFactory;
    __CLR4_4_1wqwqlck0y87t.R.inc(1180);this.deserializers = deserializers;
    __CLR4_4_1wqwqlck0y87t.R.inc(1181);this.objectConstructor = objectConstructor;
  }finally{__CLR4_4_1wqwqlck0y87t.R.flushNeeded();}}

  ObjectConstructor getObjectConstructor() {try{__CLR4_4_1wqwqlck0y87t.R.inc(1182);
    __CLR4_4_1wqwqlck0y87t.R.inc(1183);return objectConstructor;
  }finally{__CLR4_4_1wqwqlck0y87t.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public <T> T deserialize(JsonElement json, Type typeOfT) throws JsonParseException {try{__CLR4_4_1wqwqlck0y87t.R.inc(1184);
    __CLR4_4_1wqwqlck0y87t.R.inc(1185);if ((((json == null || json.isJsonNull())&&(__CLR4_4_1wqwqlck0y87t.R.iget(1186)!=0|true))||(__CLR4_4_1wqwqlck0y87t.R.iget(1187)==0&false))) {{
      __CLR4_4_1wqwqlck0y87t.R.inc(1188);return null;
    } }else {__CLR4_4_1wqwqlck0y87t.R.inc(1189);if ((((json.isJsonArray())&&(__CLR4_4_1wqwqlck0y87t.R.iget(1190)!=0|true))||(__CLR4_4_1wqwqlck0y87t.R.iget(1191)==0&false))) {{
      __CLR4_4_1wqwqlck0y87t.R.inc(1192);return (T) fromJsonArray(typeOfT, json.getAsJsonArray(), this);
    } }else {__CLR4_4_1wqwqlck0y87t.R.inc(1193);if ((((json.isJsonObject())&&(__CLR4_4_1wqwqlck0y87t.R.iget(1194)!=0|true))||(__CLR4_4_1wqwqlck0y87t.R.iget(1195)==0&false))) {{
      __CLR4_4_1wqwqlck0y87t.R.inc(1196);return (T) fromJsonObject(typeOfT, json.getAsJsonObject(), this);
    } }else {__CLR4_4_1wqwqlck0y87t.R.inc(1197);if ((((json.isJsonPrimitive())&&(__CLR4_4_1wqwqlck0y87t.R.iget(1198)!=0|true))||(__CLR4_4_1wqwqlck0y87t.R.iget(1199)==0&false))) {{
      __CLR4_4_1wqwqlck0y87t.R.inc(1200);return (T) fromJsonPrimitive(typeOfT, json.getAsJsonPrimitive(), this);
    } }else {{
      __CLR4_4_1wqwqlck0y87t.R.inc(1201);throw new JsonParseException("Failed parsing JSON source: " + json + " to Json");
    }
  }}}}}finally{__CLR4_4_1wqwqlck0y87t.R.flushNeeded();}}

  private <T> T fromJsonArray(Type arrayType, JsonArray jsonArray,
      JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_1wqwqlck0y87t.R.inc(1202);
    __CLR4_4_1wqwqlck0y87t.R.inc(1203);JsonArrayDeserializationVisitor<T> visitor = new JsonArrayDeserializationVisitor<T>(
        jsonArray, arrayType, navigatorFactory, objectConstructor, deserializers, context);
    __CLR4_4_1wqwqlck0y87t.R.inc(1204);ObjectNavigator on = navigatorFactory.create(new ObjectTypePair(null, arrayType, true));
    __CLR4_4_1wqwqlck0y87t.R.inc(1205);on.accept(visitor);
    __CLR4_4_1wqwqlck0y87t.R.inc(1206);return visitor.getTarget();
  }finally{__CLR4_4_1wqwqlck0y87t.R.flushNeeded();}}

  private <T> T fromJsonObject(Type typeOfT, JsonObject jsonObject,
      JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_1wqwqlck0y87t.R.inc(1207);
    __CLR4_4_1wqwqlck0y87t.R.inc(1208);JsonObjectDeserializationVisitor<T> visitor = new JsonObjectDeserializationVisitor<T>(
        jsonObject, typeOfT, navigatorFactory, objectConstructor, deserializers, context);
    __CLR4_4_1wqwqlck0y87t.R.inc(1209);ObjectNavigator on = navigatorFactory.create(new ObjectTypePair(null, typeOfT, true));
    __CLR4_4_1wqwqlck0y87t.R.inc(1210);on.accept(visitor);
    __CLR4_4_1wqwqlck0y87t.R.inc(1211);return visitor.getTarget();
  }finally{__CLR4_4_1wqwqlck0y87t.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  private <T> T fromJsonPrimitive(Type typeOfT, JsonPrimitive json,
      JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_1wqwqlck0y87t.R.inc(1212);
    __CLR4_4_1wqwqlck0y87t.R.inc(1213);JsonObjectDeserializationVisitor<T> visitor = new JsonObjectDeserializationVisitor<T>(
        json, typeOfT, navigatorFactory, objectConstructor, deserializers, context);
    __CLR4_4_1wqwqlck0y87t.R.inc(1214);ObjectNavigator on = 
      navigatorFactory.create(new ObjectTypePair(json.getAsObject(), typeOfT, true));
    __CLR4_4_1wqwqlck0y87t.R.inc(1215);on.accept(visitor);
    __CLR4_4_1wqwqlck0y87t.R.inc(1216);Object target = visitor.getTarget();
    __CLR4_4_1wqwqlck0y87t.R.inc(1217);return (T) target;
  }finally{__CLR4_4_1wqwqlck0y87t.R.flushNeeded();}}
}
