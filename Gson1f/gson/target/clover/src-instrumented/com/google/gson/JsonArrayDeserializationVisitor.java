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

import java.lang.reflect.Array;
import java.lang.reflect.Type;

/**
 * A visitor that populates fields of an object with data from its equivalent
 * JSON representation
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class JsonArrayDeserializationVisitor<T> extends JsonDeserializationVisitor<T> {public static class __CLR4_4_1v7v7lck0y878{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  JsonArrayDeserializationVisitor(JsonArray jsonArray, Type arrayType,
      ObjectNavigatorFactory factory, ObjectConstructor objectConstructor,
      ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers,
      JsonDeserializationContext context) {
    super(jsonArray, arrayType, factory, objectConstructor, deserializers, context);__CLR4_4_1v7v7lck0y878.R.inc(1124);try{__CLR4_4_1v7v7lck0y878.R.inc(1123);
  }finally{__CLR4_4_1v7v7lck0y878.R.flushNeeded();}}

  @Override
  @SuppressWarnings("unchecked")
  protected T constructTarget() {try{__CLR4_4_1v7v7lck0y878.R.inc(1125);

    __CLR4_4_1v7v7lck0y878.R.inc(1126);TypeInfo typeInfo = new TypeInfo(targetType);

    __CLR4_4_1v7v7lck0y878.R.inc(1127);if ((((!json.isJsonArray())&&(__CLR4_4_1v7v7lck0y878.R.iget(1128)!=0|true))||(__CLR4_4_1v7v7lck0y878.R.iget(1129)==0&false))) {{
      __CLR4_4_1v7v7lck0y878.R.inc(1130);throw new JsonParseException("Expecting array found: " + json); 
    }
    }__CLR4_4_1v7v7lck0y878.R.inc(1131);JsonArray jsonArray = json.getAsJsonArray();
    __CLR4_4_1v7v7lck0y878.R.inc(1132);if ((((typeInfo.isArray())&&(__CLR4_4_1v7v7lck0y878.R.iget(1133)!=0|true))||(__CLR4_4_1v7v7lck0y878.R.iget(1134)==0&false))) {{
      __CLR4_4_1v7v7lck0y878.R.inc(1135);TypeInfoArray arrayTypeInfo = TypeInfoFactory.getTypeInfoForArray(targetType);
      // We know that we are getting back an array of the required type, so
      // this typecasting is safe.
      __CLR4_4_1v7v7lck0y878.R.inc(1136);return (T) objectConstructor.constructArray(arrayTypeInfo.getSecondLevelType(),
          jsonArray.size());
    }
    // is a collection
    }__CLR4_4_1v7v7lck0y878.R.inc(1137);return (T) objectConstructor.construct(typeInfo.getRawClass());
  }finally{__CLR4_4_1v7v7lck0y878.R.flushNeeded();}}

  public void visitArray(Object array, Type arrayType) {try{__CLR4_4_1v7v7lck0y878.R.inc(1138);
    __CLR4_4_1v7v7lck0y878.R.inc(1139);if ((((!json.isJsonArray())&&(__CLR4_4_1v7v7lck0y878.R.iget(1140)!=0|true))||(__CLR4_4_1v7v7lck0y878.R.iget(1141)==0&false))) {{
      __CLR4_4_1v7v7lck0y878.R.inc(1142);throw new JsonParseException("Expecting array found: " + json); 
    }
    }__CLR4_4_1v7v7lck0y878.R.inc(1143);JsonArray jsonArray = json.getAsJsonArray();
    __CLR4_4_1v7v7lck0y878.R.inc(1144);TypeInfoArray arrayTypeInfo = TypeInfoFactory.getTypeInfoForArray(arrayType);
    __CLR4_4_1v7v7lck0y878.R.inc(1145);for (int i = 0; (((i < jsonArray.size())&&(__CLR4_4_1v7v7lck0y878.R.iget(1146)!=0|true))||(__CLR4_4_1v7v7lck0y878.R.iget(1147)==0&false)); i++) {{
      __CLR4_4_1v7v7lck0y878.R.inc(1148);JsonElement jsonChild = jsonArray.get(i);
      __CLR4_4_1v7v7lck0y878.R.inc(1149);Object child;

      __CLR4_4_1v7v7lck0y878.R.inc(1150);if ((((jsonChild == null || jsonChild.isJsonNull())&&(__CLR4_4_1v7v7lck0y878.R.iget(1151)!=0|true))||(__CLR4_4_1v7v7lck0y878.R.iget(1152)==0&false))) {{
        __CLR4_4_1v7v7lck0y878.R.inc(1153);child = null;
      } }else {__CLR4_4_1v7v7lck0y878.R.inc(1154);if ((((jsonChild instanceof JsonObject)&&(__CLR4_4_1v7v7lck0y878.R.iget(1155)!=0|true))||(__CLR4_4_1v7v7lck0y878.R.iget(1156)==0&false))) {{
        __CLR4_4_1v7v7lck0y878.R.inc(1157);child = visitChildAsObject(arrayTypeInfo.getComponentRawType(), jsonChild);
      } }else {__CLR4_4_1v7v7lck0y878.R.inc(1158);if ((((jsonChild instanceof JsonArray)&&(__CLR4_4_1v7v7lck0y878.R.iget(1159)!=0|true))||(__CLR4_4_1v7v7lck0y878.R.iget(1160)==0&false))) {{
        __CLR4_4_1v7v7lck0y878.R.inc(1161);child = visitChildAsArray(arrayTypeInfo.getSecondLevelType(), jsonChild.getAsJsonArray());
      } }else {__CLR4_4_1v7v7lck0y878.R.inc(1162);if ((((jsonChild instanceof JsonPrimitive)&&(__CLR4_4_1v7v7lck0y878.R.iget(1163)!=0|true))||(__CLR4_4_1v7v7lck0y878.R.iget(1164)==0&false))) {{
        __CLR4_4_1v7v7lck0y878.R.inc(1165);child = visitChildAsObject(arrayTypeInfo.getComponentRawType(),
            jsonChild.getAsJsonPrimitive());
      } }else {{
        __CLR4_4_1v7v7lck0y878.R.inc(1166);throw new IllegalStateException();
      }
      }}}}__CLR4_4_1v7v7lck0y878.R.inc(1167);Array.set(array, i, child);
    }
  }}finally{__CLR4_4_1v7v7lck0y878.R.flushNeeded();}}

  // We should not implement any other method from Visitor interface since
  // all other methods should be invoked on JsonObjectDeserializationVisitor
  // instead.

  public void startVisitingObject(Object node) {try{__CLR4_4_1v7v7lck0y878.R.inc(1168);
    __CLR4_4_1v7v7lck0y878.R.inc(1169);throw new JsonParseException("Expecting array but found object: " + node);
  }finally{__CLR4_4_1v7v7lck0y878.R.flushNeeded();}}

  public void visitArrayField(FieldAttributes f, Type typeOfF, Object obj) {try{__CLR4_4_1v7v7lck0y878.R.inc(1170);
    __CLR4_4_1v7v7lck0y878.R.inc(1171);throw new JsonParseException("Expecting array but found array field " + f.getName() + ": "
        + obj);
  }finally{__CLR4_4_1v7v7lck0y878.R.flushNeeded();}}

  public void visitObjectField(FieldAttributes f, Type typeOfF, Object obj) {try{__CLR4_4_1v7v7lck0y878.R.inc(1172);
    __CLR4_4_1v7v7lck0y878.R.inc(1173);throw new JsonParseException("Expecting array but found object field " + f.getName() + ": " 
        + obj);
  }finally{__CLR4_4_1v7v7lck0y878.R.flushNeeded();}}

  public boolean visitFieldUsingCustomHandler(FieldAttributes f, Type actualTypeOfField, Object parent) {try{__CLR4_4_1v7v7lck0y878.R.inc(1174);
    __CLR4_4_1v7v7lck0y878.R.inc(1175);throw new JsonParseException("Expecting array but found field " + f.getName() + ": " 
        + parent);
  }finally{__CLR4_4_1v7v7lck0y878.R.flushNeeded();}}

  public void visitPrimitive(Object primitive) {try{__CLR4_4_1v7v7lck0y878.R.inc(1176);
    __CLR4_4_1v7v7lck0y878.R.inc(1177);throw new JsonParseException(
        "Type information is unavailable, and the target is not a primitive: " + json);
  }finally{__CLR4_4_1v7v7lck0y878.R.flushNeeded();}}
}
