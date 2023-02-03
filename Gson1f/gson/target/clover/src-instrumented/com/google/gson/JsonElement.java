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
 * A class representing an element of Json. It could either be a {@link JsonObject}, a
 * {@link JsonArray}, a {@link JsonPrimitive} or a {@link JsonNull}.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public abstract class JsonElement {public static class __CLR4_4_1zezelck0y89u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1340,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final Escaper BASIC_ESCAPER = new Escaper(false);

  /**
   * provides check for verifying if this element is an array or not.
   *
   * @return true if this element is of type {@link JsonArray}, false otherwise.
   */
  public boolean isJsonArray() {try{__CLR4_4_1zezelck0y89u.R.inc(1274);
    __CLR4_4_1zezelck0y89u.R.inc(1275);return this instanceof JsonArray;
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * provides check for verifying if this element is a Json object or not.
   *
   * @return true if this element is of type {@link JsonObject}, false otherwise.
   */
  public boolean isJsonObject() {try{__CLR4_4_1zezelck0y89u.R.inc(1276);
    __CLR4_4_1zezelck0y89u.R.inc(1277);return this instanceof JsonObject;
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * provides check for verifying if this element is a primitive or not.
   *
   * @return true if this element is of type {@link JsonPrimitive}, false otherwise.
   */
  public boolean isJsonPrimitive() {try{__CLR4_4_1zezelck0y89u.R.inc(1278);
    __CLR4_4_1zezelck0y89u.R.inc(1279);return this instanceof JsonPrimitive;
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * provides check for verifying if this element represents a null value or not.
   *
   * @return true if this element is of type {@link JsonNull}, false otherwise.
   * @since 1.2
   */
  public boolean isJsonNull() {try{__CLR4_4_1zezelck0y89u.R.inc(1280);
    __CLR4_4_1zezelck0y89u.R.inc(1281);return this instanceof JsonNull;
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link JsonObject}. If the element is of some
   * other type, a {@link ClassCastException} will result. Hence it is best to use this method
   * after ensuring that this element is of the desired type by calling {@link #isJsonObject()}
   * first.
   *
   * @return get this element as a {@link JsonObject}.
   * @throws IllegalStateException if the element is of another type.
   */
  public JsonObject getAsJsonObject() {try{__CLR4_4_1zezelck0y89u.R.inc(1282);
    __CLR4_4_1zezelck0y89u.R.inc(1283);if ((((isJsonObject())&&(__CLR4_4_1zezelck0y89u.R.iget(1284)!=0|true))||(__CLR4_4_1zezelck0y89u.R.iget(1285)==0&false))) {{
      __CLR4_4_1zezelck0y89u.R.inc(1286);return (JsonObject) this;
    }
    }__CLR4_4_1zezelck0y89u.R.inc(1287);throw new IllegalStateException("This is not a JSON Object.");
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link JsonArray}. If the element is of some
   * other type, a {@link ClassCastException} will result. Hence it is best to use this method
   * after ensuring that this element is of the desired type by calling {@link #isJsonArray()}
   * first.
   *
   * @return get this element as a {@link JsonArray}.
   * @throws IllegalStateException if the element is of another type.
   */
  public JsonArray getAsJsonArray() {try{__CLR4_4_1zezelck0y89u.R.inc(1288);
    __CLR4_4_1zezelck0y89u.R.inc(1289);if ((((isJsonArray())&&(__CLR4_4_1zezelck0y89u.R.iget(1290)!=0|true))||(__CLR4_4_1zezelck0y89u.R.iget(1291)==0&false))) {{
      __CLR4_4_1zezelck0y89u.R.inc(1292);return (JsonArray) this;
    }
    }__CLR4_4_1zezelck0y89u.R.inc(1293);throw new IllegalStateException("This is not a JSON Array.");
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link JsonPrimitive}. If the element is of some
   * other type, a {@link ClassCastException} will result. Hence it is best to use this method
   * after ensuring that this element is of the desired type by calling {@link #isJsonPrimitive()}
   * first.
   *
   * @return get this element as a {@link JsonPrimitive}.
   * @throws IllegalStateException if the element is of another type.
   */
  public JsonPrimitive getAsJsonPrimitive() {try{__CLR4_4_1zezelck0y89u.R.inc(1294);
    __CLR4_4_1zezelck0y89u.R.inc(1295);if ((((isJsonPrimitive())&&(__CLR4_4_1zezelck0y89u.R.iget(1296)!=0|true))||(__CLR4_4_1zezelck0y89u.R.iget(1297)==0&false))) {{
      __CLR4_4_1zezelck0y89u.R.inc(1298);return (JsonPrimitive) this;
    }
    }__CLR4_4_1zezelck0y89u.R.inc(1299);throw new IllegalStateException("This is not a JSON Primitive.");
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link JsonNull}. If the element is of some
   * other type, a {@link ClassCastException} will result. Hence it is best to use this method
   * after ensuring that this element is of the desired type by calling {@link #isJsonNull()}
   * first.
   *
   * @return get this element as a {@link JsonNull}.
   * @throws IllegalStateException if the element is of another type.
   * @since 1.2
   */
  public JsonNull getAsJsonNull() {try{__CLR4_4_1zezelck0y89u.R.inc(1300);
    __CLR4_4_1zezelck0y89u.R.inc(1301);if ((((isJsonNull())&&(__CLR4_4_1zezelck0y89u.R.iget(1302)!=0|true))||(__CLR4_4_1zezelck0y89u.R.iget(1303)==0&false))) {{
      __CLR4_4_1zezelck0y89u.R.inc(1304);return (JsonNull) this;
    }
    }__CLR4_4_1zezelck0y89u.R.inc(1305);throw new IllegalStateException("This is not a JSON Null.");
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a boolean value.
   *
   * @return get this element as a primitive boolean value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * boolean value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  public boolean getAsBoolean() {try{__CLR4_4_1zezelck0y89u.R.inc(1306);
    __CLR4_4_1zezelck0y89u.R.inc(1307);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link Boolean} value.
   *
   * @return get this element as a {@link Boolean} value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * boolean value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  Boolean getAsBooleanWrapper() {try{__CLR4_4_1zezelck0y89u.R.inc(1308);
    __CLR4_4_1zezelck0y89u.R.inc(1309);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link Number}.
   *
   * @return get this element as a {@link Number}.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * number.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  public Number getAsNumber() {try{__CLR4_4_1zezelck0y89u.R.inc(1310);
    __CLR4_4_1zezelck0y89u.R.inc(1311);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a string value.
   *
   * @return get this element as a string value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * string value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  public String getAsString() {try{__CLR4_4_1zezelck0y89u.R.inc(1312);
    __CLR4_4_1zezelck0y89u.R.inc(1313);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a primitive double value.
   *
   * @return get this element as a primitive double value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * double value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  public double getAsDouble() {try{__CLR4_4_1zezelck0y89u.R.inc(1314);
    __CLR4_4_1zezelck0y89u.R.inc(1315);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a primitive float value.
   *
   * @return get this element as a primitive float value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * float value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  public float getAsFloat() {try{__CLR4_4_1zezelck0y89u.R.inc(1316);
    __CLR4_4_1zezelck0y89u.R.inc(1317);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a primitive long value.
   *
   * @return get this element as a primitive long value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * long value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  public long getAsLong() {try{__CLR4_4_1zezelck0y89u.R.inc(1318);
    __CLR4_4_1zezelck0y89u.R.inc(1319);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a primitive integer value.
   *
   * @return get this element as a primitive integer value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * integer value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  public int getAsInt() {try{__CLR4_4_1zezelck0y89u.R.inc(1320);
    __CLR4_4_1zezelck0y89u.R.inc(1321);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}
  
  /**
   * convenience method to get this element as a primitive byte value.
   *
   * @return get this element as a primitive byte value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * byte value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   * @since 1.3
   */
  public byte getAsByte() {try{__CLR4_4_1zezelck0y89u.R.inc(1322);
    __CLR4_4_1zezelck0y89u.R.inc(1323);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}
  
  /**
   * convenience method to get this element as a primitive character value.
   *
   * @return get this element as a primitive char value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * char value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   * @since 1.3
   */
  public char getAsCharacter() {try{__CLR4_4_1zezelck0y89u.R.inc(1324);
    __CLR4_4_1zezelck0y89u.R.inc(1325);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link BigDecimal}.
   *
   * @return get this element as a {@link BigDecimal}.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive}.
   * * @throws NumberFormatException if the element is not a valid {@link BigDecimal}.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   * @since 1.2
   */
  public BigDecimal getAsBigDecimal() {try{__CLR4_4_1zezelck0y89u.R.inc(1326);
    __CLR4_4_1zezelck0y89u.R.inc(1327);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a {@link BigInteger}.
   *
   * @return get this element as a {@link BigInteger}.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive}.
   * @throws NumberFormatException if the element is not a valid {@link BigInteger}.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   * @since 1.2
   */
  public BigInteger getAsBigInteger() {try{__CLR4_4_1zezelck0y89u.R.inc(1328);
    __CLR4_4_1zezelck0y89u.R.inc(1329);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as a primitive short value.
   *
   * @return get this element as a primitive short value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * short value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  public short getAsShort() {try{__CLR4_4_1zezelck0y89u.R.inc(1330);
    __CLR4_4_1zezelck0y89u.R.inc(1331);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * convenience method to get this element as an {@link Object} value.
   *
   * @return get this element as an Object value.
   * @throws ClassCastException if the element is of not a {@link JsonPrimitive} and is not a valid
   * Object value.
   * @throws IllegalStateException if the element is of the type {@link JsonArray} but contains
   * more than a single element.
   */
  Object getAsObject() {try{__CLR4_4_1zezelck0y89u.R.inc(1332);
    __CLR4_4_1zezelck0y89u.R.inc(1333);throw new UnsupportedOperationException();
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  /**
   * Returns a String representation of this element.
   *
   * @return String the string representation of this element.
   */
  @Override
  public String toString() {try{__CLR4_4_1zezelck0y89u.R.inc(1334);
    __CLR4_4_1zezelck0y89u.R.inc(1335);try {
      __CLR4_4_1zezelck0y89u.R.inc(1336);StringBuilder sb = new StringBuilder();
      __CLR4_4_1zezelck0y89u.R.inc(1337);toString(sb, BASIC_ESCAPER);
      __CLR4_4_1zezelck0y89u.R.inc(1338);return sb.toString();
    } catch (IOException e) {
      __CLR4_4_1zezelck0y89u.R.inc(1339);throw new RuntimeException(e);
    }
  }finally{__CLR4_4_1zezelck0y89u.R.flushNeeded();}}

  protected abstract void toString(Appendable sb, Escaper escaper) throws IOException;
}
