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

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A class representing an object type in Json. An object consists of name-value pairs where names
 * are strings, and values are any other type of {@link JsonElement}. This allows for a creating a
 * tree of JsonElements. The member elements of this object are maintained in order they were added.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public final class JsonObject extends JsonElement {public static class __CLR4_4_111w11wlck0y8b8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1420,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  // We are using a linked hash map because it is important to preserve
  // the order in which elements are inserted. This is needed to ensure
  // that the fields of an object are inserted in the order they were
  // defined in the class.
  private final Map<String, JsonElement> members;

  /**
   * Creates an empty JsonObject.
   */
  public JsonObject() {try{__CLR4_4_111w11wlck0y8b8.R.inc(1364);
    __CLR4_4_111w11wlck0y8b8.R.inc(1365);members = new LinkedHashMap<String, JsonElement>();
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Adds a member, which is a name-value pair, to self. The name must be a String, but the value
   * can be an arbitrary JsonElement, thereby allowing you to build a full tree of JsonElements
   * rooted at this node.
   *
   * @param property name of the member.
   * @param value the member object.
   */
  public void add(String property, JsonElement value) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1366);
    __CLR4_4_111w11wlck0y8b8.R.inc(1367);Preconditions.checkArgument(property != null);
    __CLR4_4_111w11wlck0y8b8.R.inc(1368);if ((((value == null)&&(__CLR4_4_111w11wlck0y8b8.R.iget(1369)!=0|true))||(__CLR4_4_111w11wlck0y8b8.R.iget(1370)==0&false))) {{
      __CLR4_4_111w11wlck0y8b8.R.inc(1371);value = JsonNull.createJsonNull();
    }
    }__CLR4_4_111w11wlck0y8b8.R.inc(1372);members.put(property, value);
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Removes the {@code property} from this {@link JsonObject}.
   *
   * @param property name of the member that should be removed.
   * @return the {@link JsonElement} object that is being removed.
   * @since 1.3
   */
  public JsonElement remove(String property) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1373);
    __CLR4_4_111w11wlck0y8b8.R.inc(1374);return members.remove(property);
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Convenience method to add a primitive member. The specified value is converted to a
   * JsonPrimitive of String.
   *
   * @param property name of the member.
   * @param value the string value associated with the member.
   */
  public void addProperty(String property, String value) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1375);
    __CLR4_4_111w11wlck0y8b8.R.inc(1376);add(property, createJsonElement(value));
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Convenience method to add a primitive member. The specified value is converted to a
   * JsonPrimitive of Number.
   *
   * @param property name of the member.
   * @param value the number value associated with the member.
   */
  public void addProperty(String property, Number value) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1377);
    __CLR4_4_111w11wlck0y8b8.R.inc(1378);add(property, createJsonElement(value));
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Convenience method to add a boolean member. The specified value is converted to a
   * JsonPrimitive of Boolean.
   *
   * @param property name of the member.
   * @param value the number value associated with the member.
   */
  public void addProperty(String property, Boolean value) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1379);
    __CLR4_4_111w11wlck0y8b8.R.inc(1380);add(property, createJsonElement(value));
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Convenience method to add a char member. The specified value is converted to a
   * JsonPrimitive of Character.
   *
   * @param property name of the member.
   * @param value the number value associated with the member.
   */
  public void addProperty(String property, Character value) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1381);
    __CLR4_4_111w11wlck0y8b8.R.inc(1382);add(property, createJsonElement(value));
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Creates the proper {@link JsonElement} object from the given {@code value} object.
   *
   * @param value the object to generate the {@link JsonElement} for
   * @return a {@link JsonPrimitive} if the {@code value} is not null, otherwise a {@link JsonNull}
   */
  private JsonElement createJsonElement(Object value) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1383);
    __CLR4_4_111w11wlck0y8b8.R.inc(1384);return (((value == null )&&(__CLR4_4_111w11wlck0y8b8.R.iget(1385)!=0|true))||(__CLR4_4_111w11wlck0y8b8.R.iget(1386)==0&false))? JsonNull.createJsonNull() : new JsonPrimitive(value);
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Returns a set of members of this object. The set is ordered, and the order is in which the
   * elements were added.
   *
   * @return a set of members of this object.
   */
  public Set<Map.Entry<String, JsonElement>> entrySet() {try{__CLR4_4_111w11wlck0y8b8.R.inc(1387);
    __CLR4_4_111w11wlck0y8b8.R.inc(1388);return members.entrySet();
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Convenience method to check if a member with the specified name is present in this object.
   *
   * @param memberName name of the member that is being checked for presence.
   * @return true if there is a member with the specified name, false otherwise.
   */
  public boolean has(String memberName) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1389);
    __CLR4_4_111w11wlck0y8b8.R.inc(1390);return members.containsKey(memberName);
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Returns the member with the specified name.
   *
   * @param memberName name of the member that is being requested.
   * @return the member matching the name. Null if no such member exists.
   */
  public JsonElement get(String memberName) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1391);
    __CLR4_4_111w11wlck0y8b8.R.inc(1392);if ((((members.containsKey(memberName))&&(__CLR4_4_111w11wlck0y8b8.R.iget(1393)!=0|true))||(__CLR4_4_111w11wlck0y8b8.R.iget(1394)==0&false))) {{
      __CLR4_4_111w11wlck0y8b8.R.inc(1395);JsonElement member = members.get(memberName);
      __CLR4_4_111w11wlck0y8b8.R.inc(1396);return (((member == null )&&(__CLR4_4_111w11wlck0y8b8.R.iget(1397)!=0|true))||(__CLR4_4_111w11wlck0y8b8.R.iget(1398)==0&false))? JsonNull.createJsonNull() : member;
    }
    }__CLR4_4_111w11wlck0y8b8.R.inc(1399);return null;
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Convenience method to get the specified member as a JsonPrimitive element.
   *
   * @param memberName name of the member being requested.
   * @return the JsonPrimitive corresponding to the specified member.
   */
  public JsonPrimitive getAsJsonPrimitive(String memberName) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1400);
    __CLR4_4_111w11wlck0y8b8.R.inc(1401);return (JsonPrimitive) members.get(memberName);
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Convenience method to get the specified member as a JsonArray.
   *
   * @param memberName name of the member being requested.
   * @return the JsonArray corresponding to the specified member.
   */
  public JsonArray getAsJsonArray(String memberName) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1402);
    __CLR4_4_111w11wlck0y8b8.R.inc(1403);return (JsonArray) members.get(memberName);
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  /**
   * Convenience method to get the specified member as a JsonObject.
   *
   * @param memberName name of the member being requested.
   * @return the JsonObject corresponding to the specified member.
   */
  public JsonObject getAsJsonObject(String memberName) {try{__CLR4_4_111w11wlck0y8b8.R.inc(1404);
    __CLR4_4_111w11wlck0y8b8.R.inc(1405);return (JsonObject) members.get(memberName);
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}

  @Override
  protected void toString(Appendable sb, Escaper escaper) throws IOException {try{__CLR4_4_111w11wlck0y8b8.R.inc(1406);
    __CLR4_4_111w11wlck0y8b8.R.inc(1407);sb.append('{');
    __CLR4_4_111w11wlck0y8b8.R.inc(1408);boolean first = true;
    __CLR4_4_111w11wlck0y8b8.R.inc(1409);for (Map.Entry<String, JsonElement> entry : members.entrySet()) {{
      __CLR4_4_111w11wlck0y8b8.R.inc(1410);if ((((first)&&(__CLR4_4_111w11wlck0y8b8.R.iget(1411)!=0|true))||(__CLR4_4_111w11wlck0y8b8.R.iget(1412)==0&false))) {{
        __CLR4_4_111w11wlck0y8b8.R.inc(1413);first = false;
      } }else {{
        __CLR4_4_111w11wlck0y8b8.R.inc(1414);sb.append(',');
      }
      }__CLR4_4_111w11wlck0y8b8.R.inc(1415);sb.append('\"');
      __CLR4_4_111w11wlck0y8b8.R.inc(1416);sb.append(escaper.escapeJsonString(entry.getKey()));
      __CLR4_4_111w11wlck0y8b8.R.inc(1417);sb.append("\":");
      __CLR4_4_111w11wlck0y8b8.R.inc(1418);entry.getValue().toString(sb, escaper);
    }
    }__CLR4_4_111w11wlck0y8b8.R.inc(1419);sb.append('}');
  }finally{__CLR4_4_111w11wlck0y8b8.R.flushNeeded();}}
}
