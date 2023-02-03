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
 * A visitor that populates fields of an object with data from its equivalent
 * JSON representation
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class JsonObjectDeserializationVisitor<T> extends JsonDeserializationVisitor<T> {public static class __CLR4_4_113g13glck0y8bt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1503,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  JsonObjectDeserializationVisitor(JsonElement json, Type type,
      ObjectNavigatorFactory factory, ObjectConstructor objectConstructor,
      ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers,
      JsonDeserializationContext context) {
    super(json, type, factory, objectConstructor, deserializers, context);__CLR4_4_113g13glck0y8bt.R.inc(1421);try{__CLR4_4_113g13glck0y8bt.R.inc(1420);
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}

  @Override
  @SuppressWarnings("unchecked")
  protected T constructTarget() {try{__CLR4_4_113g13glck0y8bt.R.inc(1422);
    __CLR4_4_113g13glck0y8bt.R.inc(1423);return (T) objectConstructor.construct(targetType);
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}

  public void startVisitingObject(Object node) {try{__CLR4_4_113g13glck0y8bt.R.inc(1424);
    // do nothing
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}

  public void visitArray(Object array, Type componentType) {try{__CLR4_4_113g13glck0y8bt.R.inc(1425);
    // should not be called since this case should invoke JsonArrayDeserializationVisitor
    __CLR4_4_113g13glck0y8bt.R.inc(1426);throw new JsonParseException("Expecting object but found array: " + array);
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}

  public void visitObjectField(FieldAttributes f, Type typeOfF, Object obj) {try{__CLR4_4_113g13glck0y8bt.R.inc(1427);
    __CLR4_4_113g13glck0y8bt.R.inc(1428);try {
      __CLR4_4_113g13glck0y8bt.R.inc(1429);if ((((!json.isJsonObject())&&(__CLR4_4_113g13glck0y8bt.R.iget(1430)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1431)==0&false))) {{
        __CLR4_4_113g13glck0y8bt.R.inc(1432);throw new JsonParseException("Expecting object found: " + json); 
      }
      }__CLR4_4_113g13glck0y8bt.R.inc(1433);JsonObject jsonObject = json.getAsJsonObject();
      __CLR4_4_113g13glck0y8bt.R.inc(1434);String fName = getFieldName(f);
      __CLR4_4_113g13glck0y8bt.R.inc(1435);JsonElement jsonChild = jsonObject.get(fName);
      __CLR4_4_113g13glck0y8bt.R.inc(1436);if ((((jsonChild != null)&&(__CLR4_4_113g13glck0y8bt.R.iget(1437)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1438)==0&false))) {{
        __CLR4_4_113g13glck0y8bt.R.inc(1439);Object child = visitChildAsObject(typeOfF, jsonChild);
        __CLR4_4_113g13glck0y8bt.R.inc(1440);f.set(obj, child);
      } }else {{
        __CLR4_4_113g13glck0y8bt.R.inc(1441);f.set(obj, null);
      }
    }} catch (IllegalAccessException e) {
      __CLR4_4_113g13glck0y8bt.R.inc(1442);throw new RuntimeException(e);
    }
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}

  public void visitArrayField(FieldAttributes f, Type typeOfF, Object obj) {try{__CLR4_4_113g13glck0y8bt.R.inc(1443);
    __CLR4_4_113g13glck0y8bt.R.inc(1444);try {
      __CLR4_4_113g13glck0y8bt.R.inc(1445);if ((((!json.isJsonObject())&&(__CLR4_4_113g13glck0y8bt.R.iget(1446)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1447)==0&false))) {{
        __CLR4_4_113g13glck0y8bt.R.inc(1448);throw new JsonParseException("Expecting object found: " + json); 
      }
      }__CLR4_4_113g13glck0y8bt.R.inc(1449);JsonObject jsonObject = json.getAsJsonObject();
      __CLR4_4_113g13glck0y8bt.R.inc(1450);String fName = getFieldName(f);
      __CLR4_4_113g13glck0y8bt.R.inc(1451);JsonArray jsonChild = (JsonArray) jsonObject.get(fName);
      __CLR4_4_113g13glck0y8bt.R.inc(1452);if ((((jsonChild != null)&&(__CLR4_4_113g13glck0y8bt.R.iget(1453)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1454)==0&false))) {{
        __CLR4_4_113g13glck0y8bt.R.inc(1455);Object array = visitChildAsArray(typeOfF, jsonChild);
        __CLR4_4_113g13glck0y8bt.R.inc(1456);f.set(obj, array);
      } }else {{
        __CLR4_4_113g13glck0y8bt.R.inc(1457);f.set(obj, null);
      }
    }} catch (IllegalAccessException e) {
      __CLR4_4_113g13glck0y8bt.R.inc(1458);throw new RuntimeException(e);
    }
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}

  private String getFieldName(FieldAttributes f) {try{__CLR4_4_113g13glck0y8bt.R.inc(1459);
    __CLR4_4_113g13glck0y8bt.R.inc(1460);FieldNamingStrategy2 namingPolicy = factory.getFieldNamingPolicy();
    __CLR4_4_113g13glck0y8bt.R.inc(1461);return namingPolicy.translateName(f);
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}

  public boolean visitFieldUsingCustomHandler(FieldAttributes f, Type declaredTypeOfField, Object parent) {try{__CLR4_4_113g13glck0y8bt.R.inc(1462);
    __CLR4_4_113g13glck0y8bt.R.inc(1463);try {
      __CLR4_4_113g13glck0y8bt.R.inc(1464);String fName = getFieldName(f);
      __CLR4_4_113g13glck0y8bt.R.inc(1465);if ((((!json.isJsonObject())&&(__CLR4_4_113g13glck0y8bt.R.iget(1466)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1467)==0&false))) {{
        __CLR4_4_113g13glck0y8bt.R.inc(1468);throw new JsonParseException("Expecting object found: " + json); 
      }
      }__CLR4_4_113g13glck0y8bt.R.inc(1469);JsonElement child = json.getAsJsonObject().get(fName);
      __CLR4_4_113g13glck0y8bt.R.inc(1470);TypeInfo typeInfo = new TypeInfo(declaredTypeOfField);
      __CLR4_4_113g13glck0y8bt.R.inc(1471);if ((((child == null)&&(__CLR4_4_113g13glck0y8bt.R.iget(1472)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1473)==0&false))) {{ // Child will be null if the field wasn't present in Json
        __CLR4_4_113g13glck0y8bt.R.inc(1474);return true;
      } }else {__CLR4_4_113g13glck0y8bt.R.inc(1475);if ((((child.isJsonNull())&&(__CLR4_4_113g13glck0y8bt.R.iget(1476)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1477)==0&false))) {{
        __CLR4_4_113g13glck0y8bt.R.inc(1478);if ((((!typeInfo.isPrimitive())&&(__CLR4_4_113g13glck0y8bt.R.iget(1479)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1480)==0&false))) {{
          __CLR4_4_113g13glck0y8bt.R.inc(1481);f.set(parent, null);
        }
        }__CLR4_4_113g13glck0y8bt.R.inc(1482);return true;
      }
      }}__CLR4_4_113g13glck0y8bt.R.inc(1483);ObjectTypePair objTypePair = new ObjectTypePair(null, declaredTypeOfField, false);
      __CLR4_4_113g13glck0y8bt.R.inc(1484);Pair<JsonDeserializer<?>, ObjectTypePair> pair = objTypePair.getMatchingHandler(deserializers);
      __CLR4_4_113g13glck0y8bt.R.inc(1485);if ((((pair == null)&&(__CLR4_4_113g13glck0y8bt.R.iget(1486)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1487)==0&false))) {{
        __CLR4_4_113g13glck0y8bt.R.inc(1488);return false;
      }      
      }__CLR4_4_113g13glck0y8bt.R.inc(1489);Object value = invokeCustomDeserializer(child, pair);
      __CLR4_4_113g13glck0y8bt.R.inc(1490);if ((((value != null || !typeInfo.isPrimitive())&&(__CLR4_4_113g13glck0y8bt.R.iget(1491)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1492)==0&false))) {{
        __CLR4_4_113g13glck0y8bt.R.inc(1493);f.set(parent, value);
      }
      }__CLR4_4_113g13glck0y8bt.R.inc(1494);return true;
    } catch (IllegalAccessException e) {
      __CLR4_4_113g13glck0y8bt.R.inc(1495);throw new RuntimeException();
    }
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public void visitPrimitive(Object primitive) {try{__CLR4_4_113g13glck0y8bt.R.inc(1496);
    __CLR4_4_113g13glck0y8bt.R.inc(1497);if ((((!json.isJsonPrimitive())&&(__CLR4_4_113g13glck0y8bt.R.iget(1498)!=0|true))||(__CLR4_4_113g13glck0y8bt.R.iget(1499)==0&false))) {{
      __CLR4_4_113g13glck0y8bt.R.inc(1500);throw new JsonParseException(
          "Type information is unavailable, and the target object is not a primitive: " + json);
    }
    }__CLR4_4_113g13glck0y8bt.R.inc(1501);JsonPrimitive prim = json.getAsJsonPrimitive();
    __CLR4_4_113g13glck0y8bt.R.inc(1502);target = (T) prim.getAsObject();
  }finally{__CLR4_4_113g13glck0y8bt.R.flushNeeded();}}
}
