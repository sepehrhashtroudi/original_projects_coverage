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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A class representing an array type in Json. An array is a list of {@link JsonElement}s each of
 * which can be of a different type. This is an ordered list, meaning that the order in which
 * elements are added is preserved.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {public static class __CLR4_4_1s8s8lck0y869{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1123,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private final List<JsonElement> elements;

  /**
   * Creates an empty JsonArray.
   */
  public JsonArray() {try{__CLR4_4_1s8s8lck0y869.R.inc(1016);
    __CLR4_4_1s8s8lck0y869.R.inc(1017);elements = new ArrayList<JsonElement>();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * Adds the specified element to self.
   *
   * @param element the element that needs to be added to the array.
   */
  public void add(JsonElement element) {try{__CLR4_4_1s8s8lck0y869.R.inc(1018);
    __CLR4_4_1s8s8lck0y869.R.inc(1019);if ((((element == null)&&(__CLR4_4_1s8s8lck0y869.R.iget(1020)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1021)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1022);element = JsonNull.createJsonNull();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1023);elements.add(element);
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * Adds all the elements of the specified array to self.
   *
   * @param array the array whose elements need to be added to the array.
   */
  public void addAll(JsonArray array) {try{__CLR4_4_1s8s8lck0y869.R.inc(1024);
    __CLR4_4_1s8s8lck0y869.R.inc(1025);elements.addAll(array.elements);
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * Reverses the elements of the array.
   */
  void reverse() {try{__CLR4_4_1s8s8lck0y869.R.inc(1026);
    __CLR4_4_1s8s8lck0y869.R.inc(1027);Collections.reverse(elements);
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * Returns the number of elements in the array.
   *
   * @return the number of elements in the array.
   */
  public int size() {try{__CLR4_4_1s8s8lck0y869.R.inc(1028);
    __CLR4_4_1s8s8lck0y869.R.inc(1029);return elements.size();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * Returns an iterator to navigate the elemetns of the array. Since the array is an ordered list,
   * the iterator navigates the elements in the order they were inserted.
   *
   * @return an iterator to navigate the elements of the array.
   */
  public Iterator<JsonElement> iterator() {try{__CLR4_4_1s8s8lck0y869.R.inc(1030);
    __CLR4_4_1s8s8lck0y869.R.inc(1031);return elements.iterator();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * Returns the ith element of the array.
   *
   * @param i the index of the element that is being sought.
   * @return the element present at the ith index.
   * @throws IndexOutOfBoundsException if i is negative or greater than or equal to the
   * {@link #size()} of the array.
   */
  public JsonElement get(int i) {try{__CLR4_4_1s8s8lck0y869.R.inc(1032);
    __CLR4_4_1s8s8lck0y869.R.inc(1033);return elements.get(i);
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a {@link Number} if it contains a single element.
   *
   * @return get this element as a number if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid Number.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  public Number getAsNumber() {try{__CLR4_4_1s8s8lck0y869.R.inc(1034);
    __CLR4_4_1s8s8lck0y869.R.inc(1035);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1036)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1037)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1038);return elements.get(0).getAsNumber();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1039);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a {@link String} if it contains a single element.
   *
   * @return get this element as a String if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid String.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  public String getAsString() {try{__CLR4_4_1s8s8lck0y869.R.inc(1040);
    __CLR4_4_1s8s8lck0y869.R.inc(1041);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1042)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1043)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1044);return elements.get(0).getAsString();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1045);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a double if it contains a single element.
   *
   * @return get this element as a double if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid double.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  public double getAsDouble() {try{__CLR4_4_1s8s8lck0y869.R.inc(1046);
    __CLR4_4_1s8s8lck0y869.R.inc(1047);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1048)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1049)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1050);return elements.get(0).getAsDouble();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1051);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a {@link BigDecimal} if it contains a single element.
   *
   * @return get this element as a {@link BigDecimal} if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive}.
   * @throws NumberFormatException if the element at index 0 is not a valid {@link BigDecimal}.
   * @throws IllegalStateException if the array has more than one element.
   * @since 1.2
   */
  @Override
  public BigDecimal getAsBigDecimal() {try{__CLR4_4_1s8s8lck0y869.R.inc(1052);
    __CLR4_4_1s8s8lck0y869.R.inc(1053);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1054)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1055)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1056);return elements.get(0).getAsBigDecimal();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1057);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a {@link BigInteger} if it contains a single element.
   *
   * @return get this element as a {@link BigInteger} if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive}.
   * @throws NumberFormatException if the element at index 0 is not a valid {@link BigInteger}.
   * @throws IllegalStateException if the array has more than one element.
   * @since 1.2
   */
  @Override
  public BigInteger getAsBigInteger() {try{__CLR4_4_1s8s8lck0y869.R.inc(1058);
    __CLR4_4_1s8s8lck0y869.R.inc(1059);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1060)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1061)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1062);return elements.get(0).getAsBigInteger();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1063);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a float if it contains a single element.
   *
   * @return get this element as a float if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid float.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  public float getAsFloat() {try{__CLR4_4_1s8s8lck0y869.R.inc(1064);
    __CLR4_4_1s8s8lck0y869.R.inc(1065);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1066)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1067)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1068);return elements.get(0).getAsFloat();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1069);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a long if it contains a single element.
   *
   * @return get this element as a long if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid long.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  public long getAsLong() {try{__CLR4_4_1s8s8lck0y869.R.inc(1070);
    __CLR4_4_1s8s8lck0y869.R.inc(1071);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1072)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1073)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1074);return elements.get(0).getAsLong();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1075);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as an integer if it contains a single element.
   *
   * @return get this element as an integer if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid integer.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  public int getAsInt() {try{__CLR4_4_1s8s8lck0y869.R.inc(1076);
    __CLR4_4_1s8s8lck0y869.R.inc(1077);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1078)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1079)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1080);return elements.get(0).getAsInt();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1081);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  @Override
  public byte getAsByte() {try{__CLR4_4_1s8s8lck0y869.R.inc(1082);
    __CLR4_4_1s8s8lck0y869.R.inc(1083);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1084)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1085)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1086);return elements.get(0).getAsByte();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1087);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  @Override
  public char getAsCharacter() {try{__CLR4_4_1s8s8lck0y869.R.inc(1088);
    __CLR4_4_1s8s8lck0y869.R.inc(1089);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1090)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1091)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1092);return elements.get(0).getAsCharacter();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1093);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a primitive short if it contains a single element.
   *
   * @return get this element as a primitive short if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid short.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  public short getAsShort() {try{__CLR4_4_1s8s8lck0y869.R.inc(1094);
    __CLR4_4_1s8s8lck0y869.R.inc(1095);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1096)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1097)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1098);return elements.get(0).getAsShort();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1099);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as a boolean if it contains a single element.
   *
   * @return get this element as a boolean if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid boolean.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  public boolean getAsBoolean() {try{__CLR4_4_1s8s8lck0y869.R.inc(1100);
    __CLR4_4_1s8s8lck0y869.R.inc(1101);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1102)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1103)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1104);return elements.get(0).getAsBoolean();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1105);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  /**
   * convenience method to get this array as an Object if it contains a single element.
   *
   * @return get this element as an Object if it is single element array.
   * @throws ClassCastException if the element in the array is of not a {@link JsonPrimitive} and
   * is not a valid Object.
   * @throws IllegalStateException if the array has more than one element.
   */
  @Override
  Object getAsObject() {try{__CLR4_4_1s8s8lck0y869.R.inc(1106);
    __CLR4_4_1s8s8lck0y869.R.inc(1107);if ((((elements.size() == 1)&&(__CLR4_4_1s8s8lck0y869.R.iget(1108)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1109)==0&false))) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1110);return elements.get(0).getAsObject();
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1111);throw new IllegalStateException();
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}

  @Override
  protected void toString(Appendable sb, Escaper escaper) throws IOException {try{__CLR4_4_1s8s8lck0y869.R.inc(1112);
    __CLR4_4_1s8s8lck0y869.R.inc(1113);sb.append('[');
    __CLR4_4_1s8s8lck0y869.R.inc(1114);boolean first = true;
    __CLR4_4_1s8s8lck0y869.R.inc(1115);for (JsonElement element : elements) {{
      __CLR4_4_1s8s8lck0y869.R.inc(1116);if ((((first)&&(__CLR4_4_1s8s8lck0y869.R.iget(1117)!=0|true))||(__CLR4_4_1s8s8lck0y869.R.iget(1118)==0&false))) {{
        __CLR4_4_1s8s8lck0y869.R.inc(1119);first = false;
      } }else {{
        __CLR4_4_1s8s8lck0y869.R.inc(1120);sb.append(',');
      }
      }__CLR4_4_1s8s8lck0y869.R.inc(1121);element.toString(sb, escaper);
    }
    }__CLR4_4_1s8s8lck0y869.R.inc(1122);sb.append(']');
  }finally{__CLR4_4_1s8s8lck0y869.R.flushNeeded();}}
}
