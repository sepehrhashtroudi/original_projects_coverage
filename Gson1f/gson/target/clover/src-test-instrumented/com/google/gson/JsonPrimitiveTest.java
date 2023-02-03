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

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;

/**
 * Unit test for the {@link JsonPrimitive} class.
 * 
 * @author Joel Leitch
 */
public class JsonPrimitiveTest extends TestCase {static class __CLR4_4_13f33f3lck0y8tc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4537,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testBoolean() throws Exception {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9awn13f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testBoolean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9awn13f3() throws Exception{try{__CLR4_4_13f33f3lck0y8tc.R.inc(4431);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4432);JsonPrimitive json = new JsonPrimitive(Boolean.TRUE);
    
    __CLR4_4_13f33f3lck0y8tc.R.inc(4433);assertTrue(json.isBoolean());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4434);assertTrue(json.getAsBoolean());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}
  
  public void testParsingStringAsBoolean() throws Exception {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1ji323f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testParsingStringAsBoolean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1ji323f7() throws Exception{try{__CLR4_4_13f33f3lck0y8tc.R.inc(4435);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4436);JsonPrimitive json = new JsonPrimitive("true");
    
    __CLR4_4_13f33f3lck0y8tc.R.inc(4437);assertFalse(json.isBoolean());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4438);assertTrue(json.getAsBoolean());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}
  
  public void testParsingStringAsNumber() throws Exception {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0bakv3fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testParsingStringAsNumber",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0bakv3fb() throws Exception{try{__CLR4_4_13f33f3lck0y8tc.R.inc(4439);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4440);JsonPrimitive json = new JsonPrimitive("1");

    __CLR4_4_13f33f3lck0y8tc.R.inc(4441);assertFalse(json.isNumber());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4442);assertEquals(1D, json.getAsDouble(), 0.00001);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4443);assertEquals(1F, json.getAsFloat(), 0.00001);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4444);assertEquals(1, json.getAsInt());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4445);assertEquals(1L, json.getAsLong());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4446);assertEquals((short) 1, json.getAsShort());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4447);assertEquals((byte) 1, json.getAsByte());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4448);assertEquals(new BigInteger("1"), json.getAsBigInteger());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4449);assertEquals(new BigDecimal("1"), json.getAsBigDecimal());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}
  
  public void testStringsAndChar() throws Exception {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0f4fw3fm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testStringsAndChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0f4fw3fm() throws Exception{try{__CLR4_4_13f33f3lck0y8tc.R.inc(4450);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4451);JsonPrimitive json = new JsonPrimitive("abc");
    __CLR4_4_13f33f3lck0y8tc.R.inc(4452);assertTrue(json.isString());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4453);assertEquals('a', json.getAsCharacter());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4454);assertEquals("abc", json.getAsString());
    
    __CLR4_4_13f33f3lck0y8tc.R.inc(4455);json = new JsonPrimitive('z');
    __CLR4_4_13f33f3lck0y8tc.R.inc(4456);assertTrue(json.isString());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4457);assertEquals('z', json.getAsCharacter());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4458);assertEquals("z", json.getAsString());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}
  
  public void testExponential() throws Exception {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pe6ime3fv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testExponential",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pe6ime3fv() throws Exception{try{__CLR4_4_13f33f3lck0y8tc.R.inc(4459);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4460);JsonPrimitive json = new JsonPrimitive("1E+7");

    __CLR4_4_13f33f3lck0y8tc.R.inc(4461);assertEquals(new BigDecimal("1E+7"), json.getAsBigDecimal());
    __CLR4_4_13f33f3lck0y8tc.R.inc(4462);assertEquals(new Double("1E+7"), json.getAsDouble(), 0.00001);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4463);assertEquals(new Float("1E+7"), json.getAsDouble(), 0.00001);
    
    __CLR4_4_13f33f3lck0y8tc.R.inc(4464);try {
      __CLR4_4_13f33f3lck0y8tc.R.inc(4465);json.getAsInt();
      __CLR4_4_13f33f3lck0y8tc.R.inc(4466);fail("Integers can not handle exponents like this.");
    } catch (NumberFormatException expected) { }
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}
  
  public void testByteEqualsShort() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bg68qy3g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testByteEqualsShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bg68qy3g3(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4467);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4468);JsonPrimitive p1 = new JsonPrimitive(new Byte((byte)10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4469);JsonPrimitive p2 = new JsonPrimitive(new Short((short)10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4470);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4471);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testByteEqualsInteger() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h32tu43g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testByteEqualsInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h32tu43g8(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4472);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4473);JsonPrimitive p1 = new JsonPrimitive(new Byte((byte)10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4474);JsonPrimitive p2 = new JsonPrimitive(new Integer(10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4475);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4476);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testByteEqualsLong() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1em6p0k3gd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testByteEqualsLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1em6p0k3gd(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4477);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4478);JsonPrimitive p1 = new JsonPrimitive(new Byte((byte)10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4479);JsonPrimitive p2 = new JsonPrimitive(new Long(10L));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4480);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4481);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testByteEqualsBigInteger() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogvgqm3gi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testByteEqualsBigInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogvgqm3gi(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4482);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4483);JsonPrimitive p1 = new JsonPrimitive(new Byte((byte)10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4484);JsonPrimitive p2 = new JsonPrimitive(new BigInteger("10"));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4485);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4486);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testShortEqualsInteger() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6ft8k3gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testShortEqualsInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6ft8k3gn(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4487);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4488);JsonPrimitive p1 = new JsonPrimitive(new Short((short)10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4489);JsonPrimitive p2 = new JsonPrimitive(new Integer(10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4490);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4491);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testShortEqualsLong() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkh2ac3gs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testShortEqualsLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkh2ac3gs(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4492);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4493);JsonPrimitive p1 = new JsonPrimitive(new Short((short)10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4494);JsonPrimitive p2 = new JsonPrimitive(new Long(10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4495);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4496);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testShortEqualsBigInteger() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doxrri3gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testShortEqualsBigInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doxrri3gx(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4497);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4498);JsonPrimitive p1 = new JsonPrimitive(new Short((short)10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4499);JsonPrimitive p2 = new JsonPrimitive(new BigInteger("10"));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4500);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4501);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testIntegerEqualsLong() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1615lta3h2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testIntegerEqualsLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1615lta3h2(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4502);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4503);JsonPrimitive p1 = new JsonPrimitive(new Integer(10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4504);JsonPrimitive p2 = new JsonPrimitive(new Long(10L));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4505);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4506);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testIntegerEqualsBigInteger() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yp9sk03h7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testIntegerEqualsBigInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yp9sk03h7(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4507);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4508);JsonPrimitive p1 = new JsonPrimitive(new Integer(10));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4509);JsonPrimitive p2 = new JsonPrimitive(new BigInteger("10"));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4510);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4511);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testLongEqualsBigInteger() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4zipe3hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testLongEqualsBigInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4zipe3hc(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4512);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4513);JsonPrimitive p1 = new JsonPrimitive(new Long(10L));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4514);JsonPrimitive p2 = new JsonPrimitive(new BigInteger("10"));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4515);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4516);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testFloatEqualsDouble() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfh9xd3hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testFloatEqualsDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfh9xd3hh(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4517);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4518);JsonPrimitive p1 = new JsonPrimitive(new Float(10.25F));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4519);JsonPrimitive p2 = new JsonPrimitive(new Double(10.25D));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4520);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4521);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testFloatEqualsBigDecimal() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tzwpt3hm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testFloatEqualsBigDecimal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tzwpt3hm(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4522);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4523);JsonPrimitive p1 = new JsonPrimitive(new Float(10.25F));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4524);JsonPrimitive p2 = new JsonPrimitive(new BigDecimal("10.25"));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4525);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4526);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}

  public void testDoubleEqualsBigDecimal() {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ebusm3hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testDoubleEqualsBigDecimal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ebusm3hr(){try{__CLR4_4_13f33f3lck0y8tc.R.inc(4527);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4528);JsonPrimitive p1 = new JsonPrimitive(new Double(10.25D));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4529);JsonPrimitive p2 = new JsonPrimitive(new BigDecimal("10.25"));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4530);assertEquals(p1, p2);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4531);assertEquals(p1.hashCode(), p2.hashCode());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}
  
  public void testValidJsonOnToString() throws Exception {__CLR4_4_13f33f3lck0y8tc.R.globalSliceStart(getClass().getName(),4532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129pgho3hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13f33f3lck0y8tc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13f33f3lck0y8tc.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testValidJsonOnToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129pgho3hw() throws Exception{try{__CLR4_4_13f33f3lck0y8tc.R.inc(4532);
    __CLR4_4_13f33f3lck0y8tc.R.inc(4533);JsonPrimitive json = new JsonPrimitive("Some\nEscaped\nValue");
    __CLR4_4_13f33f3lck0y8tc.R.inc(4534);assertEquals("\"Some\\nEscaped\\nValue\"", json.toString());
    
    __CLR4_4_13f33f3lck0y8tc.R.inc(4535);json = new JsonPrimitive(new BigDecimal("1.333"));
    __CLR4_4_13f33f3lck0y8tc.R.inc(4536);assertEquals("1.333", json.toString());
  }finally{__CLR4_4_13f33f3lck0y8tc.R.flushNeeded();}}
}
