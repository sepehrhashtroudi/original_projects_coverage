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
 * Abstract data value container for the {@link ObjectNavigator.Visitor}
 * implementations.  This class exposes the {@link #getTarget()} method
 * which returns the class that was visited by this object.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
abstract class JsonDeserializationVisitor<T> implements ObjectNavigator.Visitor {public static class __CLR4_4_1xuxulck0y88u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  protected final ObjectNavigatorFactory factory;
  protected final ObjectConstructor objectConstructor;
  protected final ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers;
  protected T target;
  protected final JsonElement json;
  protected final Type targetType;
  protected final JsonDeserializationContext context;
  protected boolean constructed;

  public JsonDeserializationVisitor(JsonElement json, Type targetType,
      ObjectNavigatorFactory factory, ObjectConstructor objectConstructor,
      ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers,
      JsonDeserializationContext context) {try{__CLR4_4_1xuxulck0y88u.R.inc(1218);
    __CLR4_4_1xuxulck0y88u.R.inc(1219);Preconditions.checkNotNull(json);
    __CLR4_4_1xuxulck0y88u.R.inc(1220);this.targetType = targetType;
    __CLR4_4_1xuxulck0y88u.R.inc(1221);this.factory = factory;
    __CLR4_4_1xuxulck0y88u.R.inc(1222);this.objectConstructor = objectConstructor;
    __CLR4_4_1xuxulck0y88u.R.inc(1223);this.deserializers = deserializers;
    __CLR4_4_1xuxulck0y88u.R.inc(1224);this.json = json;
    __CLR4_4_1xuxulck0y88u.R.inc(1225);this.context = context;
    __CLR4_4_1xuxulck0y88u.R.inc(1226);this.constructed = false;
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}

  public T getTarget() {try{__CLR4_4_1xuxulck0y88u.R.inc(1227);
    __CLR4_4_1xuxulck0y88u.R.inc(1228);if ((((!constructed)&&(__CLR4_4_1xuxulck0y88u.R.iget(1229)!=0|true))||(__CLR4_4_1xuxulck0y88u.R.iget(1230)==0&false))) {{
      __CLR4_4_1xuxulck0y88u.R.inc(1231);target = constructTarget();
      __CLR4_4_1xuxulck0y88u.R.inc(1232);constructed = true;
    }
    }__CLR4_4_1xuxulck0y88u.R.inc(1233);return target;
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}

  protected abstract T constructTarget();

  public void start(ObjectTypePair node) {try{__CLR4_4_1xuxulck0y88u.R.inc(1234);
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}

  public void end(ObjectTypePair node) {try{__CLR4_4_1xuxulck0y88u.R.inc(1235);
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public final boolean visitUsingCustomHandler(ObjectTypePair objTypePair) {try{__CLR4_4_1xuxulck0y88u.R.inc(1236);
    __CLR4_4_1xuxulck0y88u.R.inc(1237);Pair<JsonDeserializer<?>, ObjectTypePair> pair = objTypePair.getMatchingHandler(deserializers);
    __CLR4_4_1xuxulck0y88u.R.inc(1238);if ((((pair == null)&&(__CLR4_4_1xuxulck0y88u.R.iget(1239)!=0|true))||(__CLR4_4_1xuxulck0y88u.R.iget(1240)==0&false))) {{
      __CLR4_4_1xuxulck0y88u.R.inc(1241);return false;
    }    
    }__CLR4_4_1xuxulck0y88u.R.inc(1242);Object value = invokeCustomDeserializer(json, pair);
    __CLR4_4_1xuxulck0y88u.R.inc(1243);target = (T) value;
    __CLR4_4_1xuxulck0y88u.R.inc(1244);constructed = true;
    __CLR4_4_1xuxulck0y88u.R.inc(1245);return true;
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}

  protected Object invokeCustomDeserializer(JsonElement element, 
      Pair<JsonDeserializer<?>, ObjectTypePair> pair) {try{__CLR4_4_1xuxulck0y88u.R.inc(1246);
    __CLR4_4_1xuxulck0y88u.R.inc(1247);if ((((element == null || element.isJsonNull())&&(__CLR4_4_1xuxulck0y88u.R.iget(1248)!=0|true))||(__CLR4_4_1xuxulck0y88u.R.iget(1249)==0&false))) {{
      __CLR4_4_1xuxulck0y88u.R.inc(1250);return null;
    }
    }__CLR4_4_1xuxulck0y88u.R.inc(1251);Type objType = pair.second.type;
    __CLR4_4_1xuxulck0y88u.R.inc(1252);return (pair.first).deserialize(element, objType, context);
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}

  final Object visitChildAsObject(Type childType, JsonElement jsonChild) {try{__CLR4_4_1xuxulck0y88u.R.inc(1253);
    __CLR4_4_1xuxulck0y88u.R.inc(1254);JsonDeserializationVisitor<?> childVisitor =
        new JsonObjectDeserializationVisitor<Object>(jsonChild, childType,
            factory, objectConstructor, deserializers, context);
    __CLR4_4_1xuxulck0y88u.R.inc(1255);return visitChild(childType, childVisitor);
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}

  final Object visitChildAsArray(Type childType, JsonArray jsonChild) {try{__CLR4_4_1xuxulck0y88u.R.inc(1256);
    __CLR4_4_1xuxulck0y88u.R.inc(1257);JsonDeserializationVisitor<?> childVisitor =
        new JsonArrayDeserializationVisitor<Object>(jsonChild.getAsJsonArray(), childType,
            factory, objectConstructor, deserializers, context);
    __CLR4_4_1xuxulck0y88u.R.inc(1258);return visitChild(childType, childVisitor);
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}

  private Object visitChild(Type type, JsonDeserializationVisitor<?> childVisitor) {try{__CLR4_4_1xuxulck0y88u.R.inc(1259);
    __CLR4_4_1xuxulck0y88u.R.inc(1260);ObjectNavigator on = factory.create(new ObjectTypePair(null, type, false));
    __CLR4_4_1xuxulck0y88u.R.inc(1261);on.accept(childVisitor);
    // the underlying object may have changed during the construction phase
    // This happens primarily because of custom deserializers
    __CLR4_4_1xuxulck0y88u.R.inc(1262);return childVisitor.getTarget();
  }finally{__CLR4_4_1xuxulck0y88u.R.flushNeeded();}}
}
