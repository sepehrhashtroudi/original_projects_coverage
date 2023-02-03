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

/**
 * A class representing a Json primitive value. A primitive value
 * is either a String, a Java primitive, or a Java primitive
 * wrapper type.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public final class JsonPrimitive extends JsonElement {public static class __CLR4_4_116e16elck0y8cn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final Class<?>[] PRIMITIVE_TYPES = { int.class, long.class, short.class,
      float.class, double.class, byte.class, boolean.class, char.class, Integer.class, Long.class,
      Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };

  private static final BigInteger INTEGER_MAX = BigInteger.valueOf(Integer.MAX_VALUE);
  private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);

  private Object value;

  /**
   * Create a primitive containing a boolean value.
   *
   * @param bool the value to create the primitive with.
   */
  public JsonPrimitive(Boolean bool) {try{__CLR4_4_116e16elck0y8cn.R.inc(1526);
    __CLR4_4_116e16elck0y8cn.R.inc(1527);setValue(bool);
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Create a primitive containing a {@link Number}.
   *
   * @param number the value to create the primitive with.
   */
  public JsonPrimitive(Number number) {try{__CLR4_4_116e16elck0y8cn.R.inc(1528);
    __CLR4_4_116e16elck0y8cn.R.inc(1529);setValue(number);
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Create a primitive containing a String value.
   *
   * @param string the value to create the primitive with.
   */
  public JsonPrimitive(String string) {try{__CLR4_4_116e16elck0y8cn.R.inc(1530);
    __CLR4_4_116e16elck0y8cn.R.inc(1531);setValue(string);
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Create a primitive containing a character. The character is turned into a one character String
   * since Json only supports String.
   *
   * @param c the value to create the primitive with.
   */
  public JsonPrimitive(Character c) {try{__CLR4_4_116e16elck0y8cn.R.inc(1532);
    __CLR4_4_116e16elck0y8cn.R.inc(1533);setValue(c);
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Create a primitive using the specified Object. It must be an instance of {@link Number}, a
   * Java primitive type, or a String.
   *
   * @param primitive the value to create the primitive with.
   */
  JsonPrimitive(Object primitive) {try{__CLR4_4_116e16elck0y8cn.R.inc(1534);
    __CLR4_4_116e16elck0y8cn.R.inc(1535);setValue(primitive);
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  void setValue(Object primitive) {try{__CLR4_4_116e16elck0y8cn.R.inc(1536);
    __CLR4_4_116e16elck0y8cn.R.inc(1537);if ((((primitive instanceof Character)&&(__CLR4_4_116e16elck0y8cn.R.iget(1538)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1539)==0&false))) {{
      // convert characters to strings since in JSON, characters are represented as a single
      // character string
      __CLR4_4_116e16elck0y8cn.R.inc(1540);char c = ((Character) primitive).charValue();
      __CLR4_4_116e16elck0y8cn.R.inc(1541);this.value = String.valueOf(c);
    } }else {{
      __CLR4_4_116e16elck0y8cn.R.inc(1542);Preconditions.checkArgument(primitive instanceof Number
          || isPrimitiveOrString(primitive));
      __CLR4_4_116e16elck0y8cn.R.inc(1543);this.value = primitive;
    }
  }}finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Check whether this primitive contains a boolean value.
   *
   * @return true if this primitive contains a boolean value, false otherwise.
   */
  public boolean isBoolean() {try{__CLR4_4_116e16elck0y8cn.R.inc(1544);
    __CLR4_4_116e16elck0y8cn.R.inc(1545);return value instanceof Boolean;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link Boolean}.
   *
   * @return get this element as a {@link Boolean}.
   * @throws ClassCastException if the value contained is not a valid boolean value.
   */
  @Override
  Boolean getAsBooleanWrapper() {try{__CLR4_4_116e16elck0y8cn.R.inc(1546);
    __CLR4_4_116e16elck0y8cn.R.inc(1547);return (Boolean) value;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a boolean value.
   *
   * @return get this element as a primitive boolean value.
   * @throws ClassCastException if the value contained is not a valid boolean value.
   */
  @Override
  public boolean getAsBoolean() {try{__CLR4_4_116e16elck0y8cn.R.inc(1548);
    __CLR4_4_116e16elck0y8cn.R.inc(1549);return (((isBoolean() )&&(__CLR4_4_116e16elck0y8cn.R.iget(1550)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1551)==0&false))? getAsBooleanWrapper().booleanValue() : Boolean.parseBoolean(getAsString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Check whether this primitive contains a Number.
   *
   * @return true if this primitive contains a Number, false otherwise.
   */
  public boolean isNumber() {try{__CLR4_4_116e16elck0y8cn.R.inc(1552);
    __CLR4_4_116e16elck0y8cn.R.inc(1553);return value instanceof Number;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a Number.
   *
   * @return get this element as a Number.
   * @throws ClassCastException if the value contained is not a valid Number.
   */
  @Override
  public Number getAsNumber() {try{__CLR4_4_116e16elck0y8cn.R.inc(1554);
    __CLR4_4_116e16elck0y8cn.R.inc(1555);return (((value instanceof String )&&(__CLR4_4_116e16elck0y8cn.R.iget(1556)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1557)==0&false))? stringToNumber((String) value) : (Number) value;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  static Number stringToNumber(String value) {try{__CLR4_4_116e16elck0y8cn.R.inc(1558);
    __CLR4_4_116e16elck0y8cn.R.inc(1559);try {
      __CLR4_4_116e16elck0y8cn.R.inc(1560);long longValue = Long.parseLong(value);
      __CLR4_4_116e16elck0y8cn.R.inc(1561);if ((((longValue >= Integer.MIN_VALUE && longValue <= Integer.MAX_VALUE)&&(__CLR4_4_116e16elck0y8cn.R.iget(1562)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1563)==0&false))) {{
        __CLR4_4_116e16elck0y8cn.R.inc(1564);return (int) longValue;
      }
      }__CLR4_4_116e16elck0y8cn.R.inc(1565);return longValue;
    } catch (NumberFormatException ignored) {
    }

    __CLR4_4_116e16elck0y8cn.R.inc(1566);try {
      __CLR4_4_116e16elck0y8cn.R.inc(1567);return new BigDecimal(value);
    } catch (NumberFormatException ignored) {
      __CLR4_4_116e16elck0y8cn.R.inc(1568);return Double.parseDouble(value); // probably NaN, -Infinity or Infinity
    }
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Check whether this primitive contains a String value.
   *
   * @return true if this primitive contains a String value, false otherwise.
   */
  public boolean isString() {try{__CLR4_4_116e16elck0y8cn.R.inc(1569);
    __CLR4_4_116e16elck0y8cn.R.inc(1570);return value instanceof String;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a String.
   *
   * @return get this element as a String.
   * @throws ClassCastException if the value contained is not a valid String.
   */
  @Override
  public String getAsString() {try{__CLR4_4_116e16elck0y8cn.R.inc(1571);
    __CLR4_4_116e16elck0y8cn.R.inc(1572);if ((((isNumber())&&(__CLR4_4_116e16elck0y8cn.R.iget(1573)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1574)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1575);return getAsNumber().toString();
    } }else {__CLR4_4_116e16elck0y8cn.R.inc(1576);if ((((isBoolean())&&(__CLR4_4_116e16elck0y8cn.R.iget(1577)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1578)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1579);return getAsBooleanWrapper().toString();
    } }else {{
      __CLR4_4_116e16elck0y8cn.R.inc(1580);return (String) value;
    }
  }}}finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a primitive double.
   *
   * @return get this element as a primitive double.
   * @throws ClassCastException if the value contained is not a valid double.
   */
  @Override
  public double getAsDouble() {try{__CLR4_4_116e16elck0y8cn.R.inc(1581);
    __CLR4_4_116e16elck0y8cn.R.inc(1582);return (((isNumber() )&&(__CLR4_4_116e16elck0y8cn.R.iget(1583)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1584)==0&false))? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link BigDecimal}.
   *
   * @return get this element as a {@link BigDecimal}.
   * @throws NumberFormatException if the value contained is not a valid {@link BigDecimal}.
   */
  @Override
  public BigDecimal getAsBigDecimal() {try{__CLR4_4_116e16elck0y8cn.R.inc(1585);
    __CLR4_4_116e16elck0y8cn.R.inc(1586);return (((value instanceof BigDecimal )&&(__CLR4_4_116e16elck0y8cn.R.iget(1587)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1588)==0&false))? (BigDecimal) value : new BigDecimal(value.toString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link BigInteger}.
   *
   * @return get this element as a {@link BigInteger}.
   * @throws NumberFormatException if the value contained is not a valid {@link BigInteger}.
   */
  @Override
  public BigInteger getAsBigInteger() {try{__CLR4_4_116e16elck0y8cn.R.inc(1589);
    __CLR4_4_116e16elck0y8cn.R.inc(1590);return (((value instanceof BigInteger )&&(__CLR4_4_116e16elck0y8cn.R.iget(1591)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1592)==0&false))? (BigInteger) value : new BigInteger(value.toString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a float.
   *
   * @return get this element as a float.
   * @throws ClassCastException if the value contained is not a valid float.
   */
  @Override
  public float getAsFloat() {try{__CLR4_4_116e16elck0y8cn.R.inc(1593);
    __CLR4_4_116e16elck0y8cn.R.inc(1594);return (((isNumber() )&&(__CLR4_4_116e16elck0y8cn.R.iget(1595)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1596)==0&false))? getAsNumber().floatValue() : Float.parseFloat(getAsString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a primitive long.
   *
   * @return get this element as a primitive long.
   * @throws ClassCastException if the value contained is not a valid long.
   */
  @Override
  public long getAsLong() {try{__CLR4_4_116e16elck0y8cn.R.inc(1597);
    __CLR4_4_116e16elck0y8cn.R.inc(1598);return (((isNumber() )&&(__CLR4_4_116e16elck0y8cn.R.iget(1599)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1600)==0&false))? getAsNumber().longValue() : Long.parseLong(getAsString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as a primitive short.
   *
   * @return get this element as a primitive short.
   * @throws ClassCastException if the value contained is not a valid short value.
   */
  @Override
  public short getAsShort() {try{__CLR4_4_116e16elck0y8cn.R.inc(1601);
    __CLR4_4_116e16elck0y8cn.R.inc(1602);return (((isNumber() )&&(__CLR4_4_116e16elck0y8cn.R.iget(1603)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1604)==0&false))? getAsNumber().shortValue() : Short.parseShort(getAsString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

 /**
  * convenience method to get this element as a primitive integer.
  *
  * @return get this element as a primitive integer.
  * @throws ClassCastException if the value contained is not a valid integer.
  */
  @Override
  public int getAsInt() {try{__CLR4_4_116e16elck0y8cn.R.inc(1605);
    __CLR4_4_116e16elck0y8cn.R.inc(1606);return (((isNumber() )&&(__CLR4_4_116e16elck0y8cn.R.iget(1607)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1608)==0&false))? getAsNumber().intValue() : Integer.parseInt(getAsString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  @Override
  public byte getAsByte() {try{__CLR4_4_116e16elck0y8cn.R.inc(1609);
    __CLR4_4_116e16elck0y8cn.R.inc(1610);return (((isNumber() )&&(__CLR4_4_116e16elck0y8cn.R.iget(1611)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1612)==0&false))? getAsNumber().byteValue() : Byte.parseByte(getAsString());
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  @Override
  public char getAsCharacter() {try{__CLR4_4_116e16elck0y8cn.R.inc(1613);
    __CLR4_4_116e16elck0y8cn.R.inc(1614);return getAsString().charAt(0);
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * convenience method to get this element as an Object.
   *
   * @return get this element as an Object that can be converted to a suitable value.
   */
  @Override
  Object getAsObject() {try{__CLR4_4_116e16elck0y8cn.R.inc(1615);
    __CLR4_4_116e16elck0y8cn.R.inc(1616);if ((((value instanceof BigInteger)&&(__CLR4_4_116e16elck0y8cn.R.iget(1617)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1618)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1619);BigInteger big = (BigInteger) value;
      __CLR4_4_116e16elck0y8cn.R.inc(1620);if ((((big.compareTo(INTEGER_MAX) < 0)&&(__CLR4_4_116e16elck0y8cn.R.iget(1621)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1622)==0&false))) {{
        __CLR4_4_116e16elck0y8cn.R.inc(1623);return big.intValue();
      } }else {__CLR4_4_116e16elck0y8cn.R.inc(1624);if ((((big.compareTo(LONG_MAX) < 0)&&(__CLR4_4_116e16elck0y8cn.R.iget(1625)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1626)==0&false))) {{
        __CLR4_4_116e16elck0y8cn.R.inc(1627);return big.longValue();
      }
    }}}
    // No need to convert to float or double since those lose precision
    }__CLR4_4_116e16elck0y8cn.R.inc(1628);return value;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  @Override
  protected void toString(Appendable sb, Escaper escaper) throws IOException {try{__CLR4_4_116e16elck0y8cn.R.inc(1629);
    __CLR4_4_116e16elck0y8cn.R.inc(1630);if ((((isString())&&(__CLR4_4_116e16elck0y8cn.R.iget(1631)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1632)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1633);sb.append('"');
      __CLR4_4_116e16elck0y8cn.R.inc(1634);sb.append(escaper.escapeJsonString(value.toString()));
      __CLR4_4_116e16elck0y8cn.R.inc(1635);sb.append('"');
    } }else {{
      __CLR4_4_116e16elck0y8cn.R.inc(1636);sb.append(value.toString());
    }
  }}finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  private static boolean isPrimitiveOrString(Object target) {try{__CLR4_4_116e16elck0y8cn.R.inc(1637);
    __CLR4_4_116e16elck0y8cn.R.inc(1638);if ((((target instanceof String)&&(__CLR4_4_116e16elck0y8cn.R.iget(1639)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1640)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1641);return true;
    }

    }__CLR4_4_116e16elck0y8cn.R.inc(1642);Class<?> classOfPrimitive = target.getClass();
    __CLR4_4_116e16elck0y8cn.R.inc(1643);for (Class<?> standardPrimitive : PRIMITIVE_TYPES) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1644);if ((((standardPrimitive.isAssignableFrom(classOfPrimitive))&&(__CLR4_4_116e16elck0y8cn.R.iget(1645)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1646)==0&false))) {{
        __CLR4_4_116e16elck0y8cn.R.inc(1647);return true;
      }
    }}
    }__CLR4_4_116e16elck0y8cn.R.inc(1648);return false;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  @Override
  public int hashCode() {try{__CLR4_4_116e16elck0y8cn.R.inc(1649);
    __CLR4_4_116e16elck0y8cn.R.inc(1650);if ((((value == null)&&(__CLR4_4_116e16elck0y8cn.R.iget(1651)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1652)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1653);return 31;
    }
    // Using recommended hashing algorithm from Effective Java for longs and doubles
    }__CLR4_4_116e16elck0y8cn.R.inc(1654);if ((((isIntegral(this))&&(__CLR4_4_116e16elck0y8cn.R.iget(1655)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1656)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1657);long value = getAsNumber().longValue();
      __CLR4_4_116e16elck0y8cn.R.inc(1658);return (int) (value ^ (value >>> 32));
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1659);if ((((isFloatingPoint(this))&&(__CLR4_4_116e16elck0y8cn.R.iget(1660)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1661)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1662);long value = Double.doubleToLongBits(getAsNumber().doubleValue());
      __CLR4_4_116e16elck0y8cn.R.inc(1663);return (int) (value ^ (value >>> 32));
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1664);return value.hashCode();
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  @Override
  public boolean equals(Object obj) {try{__CLR4_4_116e16elck0y8cn.R.inc(1665);
    __CLR4_4_116e16elck0y8cn.R.inc(1666);if ((((this == obj)&&(__CLR4_4_116e16elck0y8cn.R.iget(1667)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1668)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1669);return true;
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1670);if ((((obj == null || getClass() != obj.getClass())&&(__CLR4_4_116e16elck0y8cn.R.iget(1671)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1672)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1673);return false;
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1674);JsonPrimitive other = (JsonPrimitive)obj;
    __CLR4_4_116e16elck0y8cn.R.inc(1675);if ((((value == null)&&(__CLR4_4_116e16elck0y8cn.R.iget(1676)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1677)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1678);return other.value == null;
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1679);if ((((isIntegral(this) && isIntegral(other))&&(__CLR4_4_116e16elck0y8cn.R.iget(1680)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1681)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1682);return getAsNumber().longValue() == other.getAsNumber().longValue();
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1683);if ((((isFloatingPoint(this) && isFloatingPoint(other))&&(__CLR4_4_116e16elck0y8cn.R.iget(1684)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1685)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1686);return getAsNumber().doubleValue() == other.getAsNumber().doubleValue();
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1687);return value.equals(other.value);
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Returns true if the specified number is an integral type
   * (Long, Integer, Short, Byte, BigInteger)
   */
  private static boolean isIntegral(JsonPrimitive primitive) {try{__CLR4_4_116e16elck0y8cn.R.inc(1688);
    __CLR4_4_116e16elck0y8cn.R.inc(1689);if ((((primitive.value instanceof Number)&&(__CLR4_4_116e16elck0y8cn.R.iget(1690)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1691)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1692);Number number = (Number) primitive.value;
      __CLR4_4_116e16elck0y8cn.R.inc(1693);return number instanceof BigInteger || number instanceof Long || number instanceof Integer
      || number instanceof Short || number instanceof Byte;
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1694);return false;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}

  /**
   * Returns true if the specified number is a floating point type (BigDecimal, double, float)
   */
  private static boolean isFloatingPoint(JsonPrimitive primitive) {try{__CLR4_4_116e16elck0y8cn.R.inc(1695);
    __CLR4_4_116e16elck0y8cn.R.inc(1696);if ((((primitive.value instanceof Number)&&(__CLR4_4_116e16elck0y8cn.R.iget(1697)!=0|true))||(__CLR4_4_116e16elck0y8cn.R.iget(1698)==0&false))) {{
      __CLR4_4_116e16elck0y8cn.R.inc(1699);Number number = (Number) primitive.value;
      __CLR4_4_116e16elck0y8cn.R.inc(1700);return number instanceof BigDecimal || number instanceof Double || number instanceof Float;
    }
    }__CLR4_4_116e16elck0y8cn.R.inc(1701);return false;
  }finally{__CLR4_4_116e16elck0y8cn.R.flushNeeded();}}
}
