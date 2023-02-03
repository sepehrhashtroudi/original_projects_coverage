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

package com.google.gson.functional;

import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.google.gson.*;
import junit.framework.TestCase;

import com.google.gson.common.TestTypes.CrazyLongTypeAdapter;

/**
 * Functional tests for Json primitive values: integers, and floating point numbers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrimitiveTest extends TestCase {static class __CLR4_4_16au6aulck0y9bp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8516,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_16au6aulck0y9bp.R.inc(8166);
    __CLR4_4_16au6aulck0y9bp.R.inc(8167);super.setUp();
    __CLR4_4_16au6aulck0y9bp.R.inc(8168);gson = new Gson();
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveIntegerAutoboxedSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmpfi36ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveIntegerAutoboxedSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmpfi36ax(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8169);
    __CLR4_4_16au6aulck0y9bp.R.inc(8170);assertEquals("1", gson.toJson(1));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveIntegerAutoboxedDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ym1kw46az();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveIntegerAutoboxedDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ym1kw46az(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8171);
    __CLR4_4_16au6aulck0y9bp.R.inc(8172);int expected = 1;
    __CLR4_4_16au6aulck0y9bp.R.inc(8173);int actual = gson.fromJson("1", int.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8174);assertEquals(expected, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8175);actual = gson.fromJson("1", Integer.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8176);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveIntegerAutoboxedInASingleElementArraySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sg3trs6b5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveIntegerAutoboxedInASingleElementArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sg3trs6b5(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8177);
    __CLR4_4_16au6aulck0y9bp.R.inc(8178);int target[] = {-9332};
    __CLR4_4_16au6aulck0y9bp.R.inc(8179);assertEquals("[-9332]", gson.toJson(target));
    __CLR4_4_16au6aulck0y9bp.R.inc(8180);assertEquals("[-9332]", gson.toJson(target, int[].class));
    __CLR4_4_16au6aulck0y9bp.R.inc(8181);assertEquals("[-9332]", gson.toJson(target, Integer[].class));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161bjif6ba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161bjif6ba(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8182);
    __CLR4_4_16au6aulck0y9bp.R.inc(8183);int expected = 1;
    __CLR4_4_16au6aulck0y9bp.R.inc(8184);int actual = gson.fromJson("[1]", int.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8185);assertEquals(expected, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8186);actual = gson.fromJson("[1]", Integer.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8187);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testReallyLongValuesSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iazf186bg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testReallyLongValuesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iazf186bg(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8188);
    __CLR4_4_16au6aulck0y9bp.R.inc(8189);long value = 333961828784581L;
    __CLR4_4_16au6aulck0y9bp.R.inc(8190);assertEquals("333961828784581", gson.toJson(value));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testReallyLongValuesDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdd4px6bj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testReallyLongValuesDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdd4px6bj(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8191);
    __CLR4_4_16au6aulck0y9bp.R.inc(8192);String json = "333961828784581";
    __CLR4_4_16au6aulck0y9bp.R.inc(8193);long value = gson.fromJson(json, Long.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8194);assertEquals(333961828784581L, value);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveLongAutoboxedSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obavqr6bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveLongAutoboxedSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obavqr6bn(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8195);
    __CLR4_4_16au6aulck0y9bp.R.inc(8196);assertEquals("1", gson.toJson(1L, long.class));
    __CLR4_4_16au6aulck0y9bp.R.inc(8197);assertEquals("1", gson.toJson(1L, Long.class));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveLongAutoboxedDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1joubw6bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveLongAutoboxedDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1joubw6bq(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8198);
    __CLR4_4_16au6aulck0y9bp.R.inc(8199);long expected = 1L;
    __CLR4_4_16au6aulck0y9bp.R.inc(8200);long actual = gson.fromJson("1", long.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8201);assertEquals(expected, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8202);actual = gson.fromJson("1", Long.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8203);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveLongAutoboxedInASingleElementArraySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qdp8g6bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveLongAutoboxedInASingleElementArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qdp8g6bw(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8204);
    __CLR4_4_16au6aulck0y9bp.R.inc(8205);long[] target = {-23L};
    __CLR4_4_16au6aulck0y9bp.R.inc(8206);assertEquals("[-23]", gson.toJson(target));
    __CLR4_4_16au6aulck0y9bp.R.inc(8207);assertEquals("[-23]", gson.toJson(target, long[].class));
    __CLR4_4_16au6aulck0y9bp.R.inc(8208);assertEquals("[-23]", gson.toJson(target, Long[].class));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveLongAutoboxedInASingleElementArrayDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhbzsx6c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveLongAutoboxedInASingleElementArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhbzsx6c1(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8209);
    __CLR4_4_16au6aulck0y9bp.R.inc(8210);long expected = 1L;
    __CLR4_4_16au6aulck0y9bp.R.inc(8211);long actual = gson.fromJson("[1]", long.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8212);assertEquals(expected, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8213);actual = gson.fromJson("[1]", Long.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8214);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveBooleanAutoboxedSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0d20f6c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveBooleanAutoboxedSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0d20f6c7(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8215);
    __CLR4_4_16au6aulck0y9bp.R.inc(8216);assertEquals("true", gson.toJson(true));
    __CLR4_4_16au6aulck0y9bp.R.inc(8217);assertEquals("false", gson.toJson(false));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveBooleanAutoboxedDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15u5bo26ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveBooleanAutoboxedDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15u5bo26ca(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8218);
    __CLR4_4_16au6aulck0y9bp.R.inc(8219);assertEquals(Boolean.FALSE, gson.fromJson("[false]", Boolean.class));
    __CLR4_4_16au6aulck0y9bp.R.inc(8220);assertEquals(Boolean.TRUE, gson.fromJson("[true]", Boolean.class));

    __CLR4_4_16au6aulck0y9bp.R.inc(8221);boolean value = gson.fromJson("false", boolean.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8222);assertEquals(false, value);
    __CLR4_4_16au6aulck0y9bp.R.inc(8223);value = gson.fromJson("true", boolean.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8224);assertEquals(true, value);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveBooleanAutoboxedInASingleElementArraySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8vula6ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveBooleanAutoboxedInASingleElementArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8vula6ch(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8225);
    __CLR4_4_16au6aulck0y9bp.R.inc(8226);boolean target[] = {false};
    __CLR4_4_16au6aulck0y9bp.R.inc(8227);assertEquals("[false]", gson.toJson(target));
    __CLR4_4_16au6aulck0y9bp.R.inc(8228);assertEquals("[false]", gson.toJson(target, boolean[].class));
    __CLR4_4_16au6aulck0y9bp.R.inc(8229);assertEquals("[false]", gson.toJson(target, Boolean[].class));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1bv1f6cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1bv1f6cm(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8230);
    __CLR4_4_16au6aulck0y9bp.R.inc(8231);assertEquals(Boolean.FALSE, gson.fromJson("[false]", Boolean.class));
    __CLR4_4_16au6aulck0y9bp.R.inc(8232);assertEquals(Boolean.TRUE, gson.fromJson("[true]", Boolean.class));

    __CLR4_4_16au6aulck0y9bp.R.inc(8233);boolean value = gson.fromJson("[false]", boolean.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8234);assertEquals(false, value);
    __CLR4_4_16au6aulck0y9bp.R.inc(8235);value = gson.fromJson("[true]", boolean.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8236);assertEquals(true, value);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testNumberSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zciwbo6ct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zciwbo6ct(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8237);
    __CLR4_4_16au6aulck0y9bp.R.inc(8238);Number expected = 1L;
    __CLR4_4_16au6aulck0y9bp.R.inc(8239);String json = gson.toJson(expected);
    __CLR4_4_16au6aulck0y9bp.R.inc(8240);assertEquals(expected.toString(), json);
    
    __CLR4_4_16au6aulck0y9bp.R.inc(8241);json = gson.toJson(expected, Number.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8242);assertEquals(expected.toString(), json);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testNumberDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhihph6cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhihph6cz(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8243);
    __CLR4_4_16au6aulck0y9bp.R.inc(8244);String json = "1";
    __CLR4_4_16au6aulck0y9bp.R.inc(8245);Number expected = new Integer(json);
    __CLR4_4_16au6aulck0y9bp.R.inc(8246);Number actual = gson.fromJson(json, Number.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8247);assertEquals(expected.intValue(), actual.intValue());
    
    __CLR4_4_16au6aulck0y9bp.R.inc(8248);json = String.valueOf(Long.MAX_VALUE);
    __CLR4_4_16au6aulck0y9bp.R.inc(8249);expected = new Long(json);
    __CLR4_4_16au6aulck0y9bp.R.inc(8250);actual = gson.fromJson(json, Number.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8251);assertEquals(expected.longValue(), actual.longValue());
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveDoubleAutoboxedSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gf7u666d8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveDoubleAutoboxedSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gf7u666d8(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8252);
    __CLR4_4_16au6aulck0y9bp.R.inc(8253);assertEquals("-122.08234335", gson.toJson(-122.08234335));
    __CLR4_4_16au6aulck0y9bp.R.inc(8254);assertEquals("122.08112002", gson.toJson(new Double(122.08112002)));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveDoubleAutoboxedDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga42kf6db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveDoubleAutoboxedDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga42kf6db(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8255);
    __CLR4_4_16au6aulck0y9bp.R.inc(8256);double actual = gson.fromJson("-122.08858585", double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8257);assertEquals(-122.08858585, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8258);actual = gson.fromJson("122.023900008000", Double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8259);assertEquals(122.023900008, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveDoubleAutoboxedInASingleElementArraySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgh1ez6dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveDoubleAutoboxedInASingleElementArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgh1ez6dg(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8260);
    __CLR4_4_16au6aulck0y9bp.R.inc(8261);double[] target = {-122.08D};
    __CLR4_4_16au6aulck0y9bp.R.inc(8262);assertEquals("[-122.08]", gson.toJson(target));
    __CLR4_4_16au6aulck0y9bp.R.inc(8263);assertEquals("[-122.08]", gson.toJson(target, double[].class));
    __CLR4_4_16au6aulck0y9bp.R.inc(8264);assertEquals("[-122.08]", gson.toJson(target, Double[].class));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testDoubleAsStringRepresentationDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejvcwt6dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleAsStringRepresentationDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejvcwt6dl(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8265);
    __CLR4_4_16au6aulck0y9bp.R.inc(8266);String doubleValue = "1.0043E+5";
    __CLR4_4_16au6aulck0y9bp.R.inc(8267);Double expected = Double.valueOf(doubleValue);
    __CLR4_4_16au6aulck0y9bp.R.inc(8268);Double actual = gson.fromJson(doubleValue, Double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8269);assertEquals(expected, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8270);double actual1 = gson.fromJson(doubleValue, double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8271);assertEquals(expected.doubleValue(), actual1);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testDoubleNoFractAsStringRepresentationDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyhm786ds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNoFractAsStringRepresentationDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyhm786ds(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8272);
    __CLR4_4_16au6aulck0y9bp.R.inc(8273);String doubleValue = "1E+5";
    __CLR4_4_16au6aulck0y9bp.R.inc(8274);Double expected = Double.valueOf(doubleValue);
    __CLR4_4_16au6aulck0y9bp.R.inc(8275);Double actual = gson.fromJson(doubleValue, Double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8276);assertEquals(expected, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8277);double actual1 = gson.fromJson(doubleValue, double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8278);assertEquals(expected.doubleValue(), actual1);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testLargeDoubleDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1708yn06dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testLargeDoubleDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1708yn06dz(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8279);
    __CLR4_4_16au6aulck0y9bp.R.inc(8280);String doubleValue = "1.234567899E8";
    __CLR4_4_16au6aulck0y9bp.R.inc(8281);Double expected = Double.valueOf(doubleValue);
    __CLR4_4_16au6aulck0y9bp.R.inc(8282);Double actual = gson.fromJson(doubleValue, Double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8283);assertEquals(expected, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8284);double actual1 = gson.fromJson(doubleValue, double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8285);assertEquals(expected.doubleValue(), actual1);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169iv1m6e6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169iv1m6e6(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8286);
    __CLR4_4_16au6aulck0y9bp.R.inc(8287);double expected = -122.08;
    __CLR4_4_16au6aulck0y9bp.R.inc(8288);double actual = gson.fromJson("[-122.08]", double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8289);assertEquals(expected, actual);

    __CLR4_4_16au6aulck0y9bp.R.inc(8290);actual = gson.fromJson("[-122.08]", Double.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8291);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigDecimalSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4czqs6ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4czqs6ec(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8292);
    __CLR4_4_16au6aulck0y9bp.R.inc(8293);BigDecimal target = new BigDecimal("-122.0e-21");
    __CLR4_4_16au6aulck0y9bp.R.inc(8294);String json = gson.toJson(target);
    __CLR4_4_16au6aulck0y9bp.R.inc(8295);assertEquals(target, new BigDecimal(json));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigDecimalDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1so6ex96eg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1so6ex96eg(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8296);
    __CLR4_4_16au6aulck0y9bp.R.inc(8297);BigDecimal target = new BigDecimal("-122.0e-21");
    __CLR4_4_16au6aulck0y9bp.R.inc(8298);String json = "-122.0e-21";
    __CLR4_4_16au6aulck0y9bp.R.inc(8299);assertEquals(target, gson.fromJson(json, BigDecimal.class));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigDecimalInASingleElementArraySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2sav6ek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalInASingleElementArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2sav6ek(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8300);
    __CLR4_4_16au6aulck0y9bp.R.inc(8301);BigDecimal[] target = {new BigDecimal("-122.08e-21")};
    __CLR4_4_16au6aulck0y9bp.R.inc(8302);String json = gson.toJson(target);
    __CLR4_4_16au6aulck0y9bp.R.inc(8303);String actual = extractElementFromArray(json);
    __CLR4_4_16au6aulck0y9bp.R.inc(8304);assertEquals(target[0], new BigDecimal(actual));

    __CLR4_4_16au6aulck0y9bp.R.inc(8305);json = gson.toJson(target, BigDecimal[].class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8306);actual = extractElementFromArray(json);
    __CLR4_4_16au6aulck0y9bp.R.inc(8307);assertEquals(target[0], new BigDecimal(actual));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigDecimalInASingleElementArrayDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yea1oo6es();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalInASingleElementArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yea1oo6es(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8308);
    __CLR4_4_16au6aulck0y9bp.R.inc(8309);BigDecimal expected = new BigDecimal("-122.08e-21");
    __CLR4_4_16au6aulck0y9bp.R.inc(8310);BigDecimal actual = gson.fromJson("[-122.08e-21]", BigDecimal.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8311);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testSmallValueForBigDecimalSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19cewjd6ew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testSmallValueForBigDecimalSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19cewjd6ew(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8312);
    __CLR4_4_16au6aulck0y9bp.R.inc(8313);BigDecimal target = new BigDecimal("1.55");
    __CLR4_4_16au6aulck0y9bp.R.inc(8314);String actual = gson.toJson(target);
    __CLR4_4_16au6aulck0y9bp.R.inc(8315);assertEquals(target.toString(), actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testSmallValueForBigDecimalDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkrth46f0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testSmallValueForBigDecimalDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkrth46f0(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8316);
    __CLR4_4_16au6aulck0y9bp.R.inc(8317);BigDecimal expected = new BigDecimal("1.55");
    __CLR4_4_16au6aulck0y9bp.R.inc(8318);BigDecimal actual = gson.fromJson("1.55", BigDecimal.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8319);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testBigDecimalPreservePrecisionSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psoowo6f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalPreservePrecisionSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psoowo6f4(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8320);
    __CLR4_4_16au6aulck0y9bp.R.inc(8321);String expectedValue = "1.000";
    __CLR4_4_16au6aulck0y9bp.R.inc(8322);BigDecimal obj = new BigDecimal(expectedValue);
    __CLR4_4_16au6aulck0y9bp.R.inc(8323);String actualValue = gson.toJson(obj);
    
    __CLR4_4_16au6aulck0y9bp.R.inc(8324);assertEquals(expectedValue, actualValue);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testBigDecimalPreservePrecisionDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13vpl3t6f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalPreservePrecisionDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13vpl3t6f9(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8325);
    __CLR4_4_16au6aulck0y9bp.R.inc(8326);String json = "1.000";
    __CLR4_4_16au6aulck0y9bp.R.inc(8327);BigDecimal expected = new BigDecimal(json);
    __CLR4_4_16au6aulck0y9bp.R.inc(8328);BigDecimal actual = gson.fromJson(json, BigDecimal.class);
    
    __CLR4_4_16au6aulck0y9bp.R.inc(8329);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigDecimalAsStringRepresentationDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m89nr76fe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalAsStringRepresentationDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m89nr76fe(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8330);
    __CLR4_4_16au6aulck0y9bp.R.inc(8331);String doubleValue = "0.05E+5";
    __CLR4_4_16au6aulck0y9bp.R.inc(8332);BigDecimal expected = new BigDecimal(doubleValue);
    __CLR4_4_16au6aulck0y9bp.R.inc(8333);BigDecimal actual = gson.fromJson(doubleValue, BigDecimal.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8334);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testBigDecimalNoFractAsStringRepresentationDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i7dh86fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalNoFractAsStringRepresentationDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i7dh86fj(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8335);
    __CLR4_4_16au6aulck0y9bp.R.inc(8336);String doubleValue = "5E+5";
    __CLR4_4_16au6aulck0y9bp.R.inc(8337);BigDecimal expected = new BigDecimal(doubleValue);
    __CLR4_4_16au6aulck0y9bp.R.inc(8338);BigDecimal actual = gson.fromJson(doubleValue, BigDecimal.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8339);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigIntegerSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rjc5kp6fo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigIntegerSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rjc5kp6fo(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8340);
    __CLR4_4_16au6aulck0y9bp.R.inc(8341);BigInteger target = new BigInteger("12121211243123245845384534687435634558945453489543985435");
    __CLR4_4_16au6aulck0y9bp.R.inc(8342);assertEquals(target.toString(), gson.toJson(target));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigIntegerDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sensw66fr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigIntegerDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sensw66fr(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8343);
    __CLR4_4_16au6aulck0y9bp.R.inc(8344);String json = "12121211243123245845384534687435634558945453489543985435";
    __CLR4_4_16au6aulck0y9bp.R.inc(8345);BigInteger target = new BigInteger(json);
    __CLR4_4_16au6aulck0y9bp.R.inc(8346);assertEquals(target, gson.fromJson(json, BigInteger.class));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigIntegerInASingleElementArraySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9ksl66fv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigIntegerInASingleElementArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9ksl66fv(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8347);
    __CLR4_4_16au6aulck0y9bp.R.inc(8348);BigInteger[] target = {new BigInteger("1212121243434324323254365345367456456456465464564564")};
    __CLR4_4_16au6aulck0y9bp.R.inc(8349);String json = gson.toJson(target);
    __CLR4_4_16au6aulck0y9bp.R.inc(8350);String actual = extractElementFromArray(json);
    __CLR4_4_16au6aulck0y9bp.R.inc(8351);assertEquals(target[0], new BigInteger(actual));

    __CLR4_4_16au6aulck0y9bp.R.inc(8352);json = gson.toJson(target, BigInteger[].class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8353);actual = extractElementFromArray(json);
    __CLR4_4_16au6aulck0y9bp.R.inc(8354);assertEquals(target[0], new BigInteger(actual));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigIntegerInASingleElementArrayDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1prah1h6g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigIntegerInASingleElementArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1prah1h6g3(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8355);
    __CLR4_4_16au6aulck0y9bp.R.inc(8356);BigInteger expected = new BigInteger("34343434343424242423432323243243242");
    __CLR4_4_16au6aulck0y9bp.R.inc(8357);BigInteger actual = gson.fromJson("[34343434343424242423432323243243242]", BigInteger.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8358);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testSmallValueForBigIntegerSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zba8s46g7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testSmallValueForBigIntegerSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zba8s46g7(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8359);
    __CLR4_4_16au6aulck0y9bp.R.inc(8360);BigInteger target = new BigInteger("15");
    __CLR4_4_16au6aulck0y9bp.R.inc(8361);String actual = gson.toJson(target);
    __CLR4_4_16au6aulck0y9bp.R.inc(8362);assertEquals(target.toString(), actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testSmallValueForBigIntegerDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmhzbf6gb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testSmallValueForBigIntegerDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmhzbf6gb(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8363);
    __CLR4_4_16au6aulck0y9bp.R.inc(8364);BigInteger expected = new BigInteger("15");
    __CLR4_4_16au6aulck0y9bp.R.inc(8365);BigInteger actual = gson.fromJson("15", BigInteger.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8366);assertEquals(expected, actual);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBadValueForBigIntegerDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nb9596gf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBadValueForBigIntegerDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nb9596gf(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8367);
    __CLR4_4_16au6aulck0y9bp.R.inc(8368);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8369);gson.fromJson("15.099", BigInteger.class);
      __CLR4_4_16au6aulck0y9bp.R.inc(8370);fail("BigInteger can not be decimal values.");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testOverridingDefaultPrimitiveSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y189xy6gj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testOverridingDefaultPrimitiveSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y189xy6gj(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8371);
    __CLR4_4_16au6aulck0y9bp.R.inc(8372);CrazyLongTypeAdapter typeAdapter = new CrazyLongTypeAdapter();
    __CLR4_4_16au6aulck0y9bp.R.inc(8373);gson = new GsonBuilder()
        .registerTypeAdapter(long.class, typeAdapter)
        .registerTypeAdapter(Long.class, typeAdapter)
        .create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8374);long value = 1L;
    __CLR4_4_16au6aulck0y9bp.R.inc(8375);String serializedValue = gson.toJson(value);
    __CLR4_4_16au6aulck0y9bp.R.inc(8376);assertEquals(String.valueOf(value + CrazyLongTypeAdapter.DIFFERENCE), serializedValue);
    
    __CLR4_4_16au6aulck0y9bp.R.inc(8377);long deserializedValue = gson.fromJson(serializedValue, long.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8378);assertEquals(value, deserializedValue);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  private String extractElementFromArray(String json) {try{__CLR4_4_16au6aulck0y9bp.R.inc(8379);
    __CLR4_4_16au6aulck0y9bp.R.inc(8380);return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testDoubleNaNSerializationNotSupportedByDefault() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0szum6gt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNaNSerializationNotSupportedByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0szum6gt(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8381);
    __CLR4_4_16au6aulck0y9bp.R.inc(8382);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8383);double nan = Double.NaN;
      __CLR4_4_16au6aulck0y9bp.R.inc(8384);gson.toJson(nan);
      __CLR4_4_16au6aulck0y9bp.R.inc(8385);fail("Gson should not accept NaN for serialization");
    } catch (IllegalArgumentException expected) {      
    }
    __CLR4_4_16au6aulck0y9bp.R.inc(8386);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8387);gson.toJson(Double.NaN);
      __CLR4_4_16au6aulck0y9bp.R.inc(8388);fail("Gson should not accept NaN for serialization");
    } catch (IllegalArgumentException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
    
  public void testDoubleNaNSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd2w9t6h1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNaNSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd2w9t6h1(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8389);
    __CLR4_4_16au6aulck0y9bp.R.inc(8390);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8391);double nan = Double.NaN;
    __CLR4_4_16au6aulck0y9bp.R.inc(8392);assertEquals("NaN", gson.toJson(nan));
    __CLR4_4_16au6aulck0y9bp.R.inc(8393);assertEquals("NaN", gson.toJson(Double.NaN));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testDoubleNaNDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1369jz26h6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNaNDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1369jz26h6(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8394);
    __CLR4_4_16au6aulck0y9bp.R.inc(8395);assertTrue(Double.isNaN(gson.fromJson("NaN", Double.class)));
    __CLR4_4_16au6aulck0y9bp.R.inc(8396);assertTrue(Double.isNaN(gson.fromJson("NaN", double.class)));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testFloatNaNSerializationNotSupportedByDefault() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m7lesp6h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatNaNSerializationNotSupportedByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m7lesp6h9(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8397);
    __CLR4_4_16au6aulck0y9bp.R.inc(8398);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8399);float nan = Float.NaN;
      __CLR4_4_16au6aulck0y9bp.R.inc(8400);gson.toJson(nan);
      __CLR4_4_16au6aulck0y9bp.R.inc(8401);fail("Gson should not accept NaN for serialization");
    } catch (IllegalArgumentException expected) {      
    }
    __CLR4_4_16au6aulck0y9bp.R.inc(8402);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8403);gson.toJson(Float.NaN);
      __CLR4_4_16au6aulck0y9bp.R.inc(8404);fail("Gson should not accept NaN for serialization");
    } catch (IllegalArgumentException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testFloatNaNSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134r4re6hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatNaNSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134r4re6hh(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8405);
    __CLR4_4_16au6aulck0y9bp.R.inc(8406);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8407);float nan = Float.NaN;
    __CLR4_4_16au6aulck0y9bp.R.inc(8408);assertEquals("NaN", gson.toJson(nan));
    __CLR4_4_16au6aulck0y9bp.R.inc(8409);assertEquals("NaN", gson.toJson(Float.NaN));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testFloatNaNDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tifmmz6hm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatNaNDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tifmmz6hm(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8410);
    __CLR4_4_16au6aulck0y9bp.R.inc(8411);assertTrue(Float.isNaN(gson.fromJson("NaN", Float.class)));
    __CLR4_4_16au6aulck0y9bp.R.inc(8412);assertTrue(Float.isNaN(gson.fromJson("NaN", float.class)));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testBigDecimalNaNDeserializationNotSupported() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1654ie16hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalNaNDeserializationNotSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1654ie16hp(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8413);
    __CLR4_4_16au6aulck0y9bp.R.inc(8414);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8415);gson.fromJson("NaN", BigDecimal.class);
      __CLR4_4_16au6aulck0y9bp.R.inc(8416);fail("Gson should not accept NaN for deserialization by default.");
    } catch (JsonParseException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testDoubleInfinitySerializationNotSupportedByDefault() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hy3zl6ht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleInfinitySerializationNotSupportedByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hy3zl6ht(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8417);
    __CLR4_4_16au6aulck0y9bp.R.inc(8418);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8419);double infinity = Double.POSITIVE_INFINITY;
      __CLR4_4_16au6aulck0y9bp.R.inc(8420);gson.toJson(infinity);
      __CLR4_4_16au6aulck0y9bp.R.inc(8421);fail("Gson should not accept positive infinity for serialization by default.");
    } catch (IllegalArgumentException expected) {      
    }
    __CLR4_4_16au6aulck0y9bp.R.inc(8422);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8423);gson.toJson(Double.POSITIVE_INFINITY);
      __CLR4_4_16au6aulck0y9bp.R.inc(8424);fail("Gson should not accept positive infinity for serialization by default.");
    } catch (IllegalArgumentException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testDoubleInfinitySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w7izn86i1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleInfinitySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w7izn86i1(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8425);
    __CLR4_4_16au6aulck0y9bp.R.inc(8426);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8427);double infinity = Double.POSITIVE_INFINITY;
    __CLR4_4_16au6aulck0y9bp.R.inc(8428);assertEquals("Infinity", gson.toJson(infinity));
    __CLR4_4_16au6aulck0y9bp.R.inc(8429);assertEquals("Infinity", gson.toJson(Double.POSITIVE_INFINITY));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testDoubleInfinityDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmajuz6i6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleInfinityDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmajuz6i6(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8430);
    __CLR4_4_16au6aulck0y9bp.R.inc(8431);assertTrue(Double.isInfinite(gson.fromJson("Infinity", Double.class)));
    __CLR4_4_16au6aulck0y9bp.R.inc(8432);assertTrue(Double.isInfinite(gson.fromJson("Infinity", double.class)));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testFloatInfinitySerializationNotSupportedByDefault() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qw30u06i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatInfinitySerializationNotSupportedByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qw30u06i9(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8433);
    __CLR4_4_16au6aulck0y9bp.R.inc(8434);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8435);float infinity = Float.POSITIVE_INFINITY;
      __CLR4_4_16au6aulck0y9bp.R.inc(8436);gson.toJson(infinity);
      __CLR4_4_16au6aulck0y9bp.R.inc(8437);fail("Gson should not accept positive infinity for serialization by default");
    } catch (IllegalArgumentException expected) {      
    }
    __CLR4_4_16au6aulck0y9bp.R.inc(8438);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8439);gson.toJson(Float.POSITIVE_INFINITY);
      __CLR4_4_16au6aulck0y9bp.R.inc(8440);fail("Gson should not accept positive infinity for serialization by default");
    } catch (IllegalArgumentException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testFloatInfinitySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2laqj6ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatInfinitySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2laqj6ih(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8441);
    __CLR4_4_16au6aulck0y9bp.R.inc(8442);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8443);float infinity = Float.POSITIVE_INFINITY;
    __CLR4_4_16au6aulck0y9bp.R.inc(8444);assertEquals("Infinity", gson.toJson(infinity));
    __CLR4_4_16au6aulck0y9bp.R.inc(8445);assertEquals("Infinity", gson.toJson(Float.POSITIVE_INFINITY));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testFloatInfinityDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19abtng6im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatInfinityDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19abtng6im(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8446);
    __CLR4_4_16au6aulck0y9bp.R.inc(8447);assertTrue(Float.isInfinite(gson.fromJson("Infinity", Float.class)));
    __CLR4_4_16au6aulck0y9bp.R.inc(8448);assertTrue(Float.isInfinite(gson.fromJson("Infinity", float.class)));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testBigDecimalInfinityDeserializationNotSupported() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsq4qu6ip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalInfinityDeserializationNotSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsq4qu6ip(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8449);
    __CLR4_4_16au6aulck0y9bp.R.inc(8450);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8451);gson.fromJson("Infinity", BigDecimal.class);
      __CLR4_4_16au6aulck0y9bp.R.inc(8452);fail("Gson should not accept positive infinity for deserialization with BigDecimal");
    } catch (JsonParseException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testNegativeInfinitySerializationNotSupportedByDefault() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1clcu1h6it();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinitySerializationNotSupportedByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1clcu1h6it(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8453);
    __CLR4_4_16au6aulck0y9bp.R.inc(8454);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8455);double negativeInfinity = Double.NEGATIVE_INFINITY;
      __CLR4_4_16au6aulck0y9bp.R.inc(8456);gson.toJson(negativeInfinity);
      __CLR4_4_16au6aulck0y9bp.R.inc(8457);fail("Gson should not accept negative infinity for serialization by default");
    } catch (IllegalArgumentException expected) {      
    }
    __CLR4_4_16au6aulck0y9bp.R.inc(8458);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8459);gson.toJson(Double.NEGATIVE_INFINITY);
      __CLR4_4_16au6aulck0y9bp.R.inc(8460);fail("Gson should not accept negative infinity for serialization by default");
    } catch (IllegalArgumentException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testNegativeInfinitySerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0nc2g6j1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinitySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0nc2g6j1(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8461);
    __CLR4_4_16au6aulck0y9bp.R.inc(8462);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8463);double negativeInfinity = Double.NEGATIVE_INFINITY;
    __CLR4_4_16au6aulck0y9bp.R.inc(8464);assertEquals("-Infinity", gson.toJson(negativeInfinity));
    __CLR4_4_16au6aulck0y9bp.R.inc(8465);assertEquals("-Infinity", gson.toJson(Double.NEGATIVE_INFINITY));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testNegativeInfinityDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfteqh6j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinityDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfteqh6j6(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8466);
    __CLR4_4_16au6aulck0y9bp.R.inc(8467);assertTrue(Double.isInfinite(gson.fromJson("-Infinity", double.class)));
    __CLR4_4_16au6aulck0y9bp.R.inc(8468);assertTrue(Double.isInfinite(gson.fromJson("-Infinity", Double.class)));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testNegativeInfinityFloatSerializationNotSupportedByDefault() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d71afn6j9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinityFloatSerializationNotSupportedByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d71afn6j9(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8469);
    __CLR4_4_16au6aulck0y9bp.R.inc(8470);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8471);float negativeInfinity = Float.NEGATIVE_INFINITY;
      __CLR4_4_16au6aulck0y9bp.R.inc(8472);gson.toJson(negativeInfinity);
      __CLR4_4_16au6aulck0y9bp.R.inc(8473);fail("Gson should not accept negative infinity for serialization by default");
    } catch (IllegalArgumentException expected) {      
    }
    __CLR4_4_16au6aulck0y9bp.R.inc(8474);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8475);gson.toJson(Float.NEGATIVE_INFINITY);
      __CLR4_4_16au6aulck0y9bp.R.inc(8476);fail("Gson should not accept negative infinity for serialization by default");
    } catch (IllegalArgumentException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testNegativeInfinityFloatSerialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2i2cq6jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinityFloatSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2i2cq6jh(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8477);
    __CLR4_4_16au6aulck0y9bp.R.inc(8478);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8479);float negativeInfinity = Float.NEGATIVE_INFINITY;
    __CLR4_4_16au6aulck0y9bp.R.inc(8480);assertEquals("-Infinity", gson.toJson(negativeInfinity));
    __CLR4_4_16au6aulck0y9bp.R.inc(8481);assertEquals("-Infinity", gson.toJson(Float.NEGATIVE_INFINITY));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testNegativeInfinityFloatDeserialization() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hu01616jm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinityFloatDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hu01616jm(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8482);
    __CLR4_4_16au6aulck0y9bp.R.inc(8483);assertTrue(Float.isInfinite(gson.fromJson("-Infinity", float.class)));
    __CLR4_4_16au6aulck0y9bp.R.inc(8484);assertTrue(Float.isInfinite(gson.fromJson("-Infinity", Float.class)));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testBigDecimalNegativeInfinityDeserializationNotSupported() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vcng16jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalNegativeInfinityDeserializationNotSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vcng16jp(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8485);
    __CLR4_4_16au6aulck0y9bp.R.inc(8486);try {
      __CLR4_4_16au6aulck0y9bp.R.inc(8487);gson.fromJson("-Infinity", BigDecimal.class);
      __CLR4_4_16au6aulck0y9bp.R.inc(8488);fail("Gson should not accept positive infinity for deserialization");
    } catch (JsonParseException expected) {      
    }
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}  
  
  public void testLongAsStringSerialization() throws Exception {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pya8nu6jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testLongAsStringSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pya8nu6jt() throws Exception{try{__CLR4_4_16au6aulck0y9bp.R.inc(8489);
    __CLR4_4_16au6aulck0y9bp.R.inc(8490);gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8491);String result = gson.toJson(15L);
    __CLR4_4_16au6aulck0y9bp.R.inc(8492);assertEquals("\"15\"", result);
    
    // Test with an integer and ensure its still a number
    __CLR4_4_16au6aulck0y9bp.R.inc(8493);result = gson.toJson(2);
    __CLR4_4_16au6aulck0y9bp.R.inc(8494);assertEquals("2", result);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testLongAsStringDeserialization() throws Exception {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ptcr6jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testLongAsStringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ptcr6jz() throws Exception{try{__CLR4_4_16au6aulck0y9bp.R.inc(8495);
    __CLR4_4_16au6aulck0y9bp.R.inc(8496);long value = gson.fromJson("\"15\"", long.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8497);assertEquals(15, value);

    __CLR4_4_16au6aulck0y9bp.R.inc(8498);gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8499);value = gson.fromJson("\"25\"", long.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8500);assertEquals(25, value);
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  public void testHtmlCharacterSerialization() throws Exception {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bm827p6k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testHtmlCharacterSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bm827p6k5() throws Exception{try{__CLR4_4_16au6aulck0y9bp.R.inc(8501);
    __CLR4_4_16au6aulck0y9bp.R.inc(8502);String target = "<script>var a = 12;</script>";
    __CLR4_4_16au6aulck0y9bp.R.inc(8503);String result = gson.toJson(target);
    __CLR4_4_16au6aulck0y9bp.R.inc(8504);assertFalse(result.equals('"' + target + '"'));
    
    __CLR4_4_16au6aulck0y9bp.R.inc(8505);gson = new GsonBuilder().disableHtmlEscaping().create();
    __CLR4_4_16au6aulck0y9bp.R.inc(8506);result = gson.toJson(target);
    __CLR4_4_16au6aulck0y9bp.R.inc(8507);assertTrue(result.equals('"' + target + '"'));
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}

  public void testDeserializePrimitiveWrapperAsObjectField() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4z6096kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDeserializePrimitiveWrapperAsObjectField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4z6096kc(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8508);
    __CLR4_4_16au6aulck0y9bp.R.inc(8509);String json = "{i:10}";
    __CLR4_4_16au6aulck0y9bp.R.inc(8510);ClassWithIntegerField target = gson.fromJson(json, ClassWithIntegerField.class);
    __CLR4_4_16au6aulck0y9bp.R.inc(8511);assertEquals(10, target.i.intValue());
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
  
  private static class ClassWithIntegerField {
    Integer i;
  }
  
  public void testPrimitiveClassLiteral() {__CLR4_4_16au6aulck0y9bp.R.globalSliceStart(getClass().getName(),8512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wz16gj6kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16au6aulck0y9bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16au6aulck0y9bp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveClassLiteral",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wz16gj6kg(){try{__CLR4_4_16au6aulck0y9bp.R.inc(8512);
    __CLR4_4_16au6aulck0y9bp.R.inc(8513);assertEquals(1, gson.fromJson("1", int.class).intValue());
    __CLR4_4_16au6aulck0y9bp.R.inc(8514);assertEquals(1, gson.fromJson(new StringReader("1"), int.class).intValue());
    __CLR4_4_16au6aulck0y9bp.R.inc(8515);assertEquals(1, gson.fromJson(new JsonPrimitive(1), int.class).intValue());
  }finally{__CLR4_4_16au6aulck0y9bp.R.flushNeeded();}}
}
