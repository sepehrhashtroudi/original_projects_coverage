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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.common.TestTypes.BagOfPrimitives;

import junit.framework.TestCase;

/**
 * Functional tests for versioning support in Gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class VersioningTest extends TestCase {static class __CLR4_4_16rv6rvlck0y9d4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8859,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final int A = 0;
  private static final int B = 1;
  private static final int C = 2;
  private static final int D = 3;

  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8779);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8780);super.setUp();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8781);builder = new GsonBuilder();
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testVersionedUntilSerialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbe64e6ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedUntilSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbe64e6ry(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8782);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8783);Version1 target = new Version1();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8784);Gson gson = builder.setVersion(1.29).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8785);String json = gson.toJson(target);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8786);assertTrue(json.contains("\"a\":" + A));
    
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8787);gson = builder.setVersion(1.3).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8788);json = gson.toJson(target);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8789);assertFalse(json.contains("\"a\":" + A));
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}
  
  public void testVersionedUntilDeserialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14i56gt6s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedUntilDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14i56gt6s6(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8790);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8791);Gson gson = builder.setVersion(1.3).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8792);String json = "{\"a\":3,\"b\":4,\"c\":5}";
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8793);Version1 version1 = gson.fromJson(json, Version1.class);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8794);assertEquals(A, version1.a);
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testVersionedClassesSerialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m26d8q6sb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedClassesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m26d8q6sb(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8795);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8796);Gson gson = builder.setVersion(1.0).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8797);String json1 = gson.toJson(new Version1());
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8798);String json2 = gson.toJson(new Version1_1());
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8799);assertEquals(json1, json2);
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testVersionedClassesDeserialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z7t2b96sg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedClassesDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z7t2b96sg(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8800);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8801);Gson gson = builder.setVersion(1.0).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8802);String json = "{\"a\":3,\"b\":4,\"c\":5}";
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8803);Version1 version1 = gson.fromJson(json, Version1.class);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8804);assertEquals(3, version1.a);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8805);assertEquals(4, version1.b);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8806);Version1_1 version1_1 = gson.fromJson(json, Version1_1.class);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8807);assertEquals(3, version1_1.a);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8808);assertEquals(4, version1_1.b);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8809);assertEquals(C, version1_1.c);
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testIgnoreLaterVersionClassSerialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198mvld6sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testIgnoreLaterVersionClassSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198mvld6sq(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8810);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8811);Gson gson = builder.setVersion(1.0).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8812);assertEquals("", gson.toJson(new Version1_2()));
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testIgnoreLaterVersionClassDeserialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kics26st();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testIgnoreLaterVersionClassDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kics26st(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8813);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8814);Gson gson = builder.setVersion(1.0).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8815);String json = "{\"a\":3,\"b\":4,\"c\":5,\"d\":6}";
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8816);Version1_2 version1_2 = gson.fromJson(json, Version1_2.class);
    // Since the class is versioned to be after 1.0, all fields should get set to
    // their default values.
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8817);assertEquals(A, version1_2.a);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8818);assertEquals(B, version1_2.b);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8819);assertEquals(C, version1_2.c);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8820);assertEquals(D, version1_2.d);
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testVersionedGsonWithUnversionedClassesSerialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t77tqx6t1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedGsonWithUnversionedClassesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t77tqx6t1(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8821);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8822);Gson gson = builder.setVersion(1.0).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8823);BagOfPrimitives target = new BagOfPrimitives(10, 20, false, "stringValue");
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8824);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testVersionedGsonWithUnversionedClassesDeserialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jjkt46t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedGsonWithUnversionedClassesDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jjkt46t5(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8825);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8826);Gson gson = builder.setVersion(1.0).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8827);String json = "{\"longValue\":10,\"intValue\":20,\"booleanValue\":false}";

    __CLR4_4_16rv6rvlck0y9d4.R.inc(8828);BagOfPrimitives expected = new BagOfPrimitives();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8829);expected.longValue = 10;
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8830);expected.intValue = 20;
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8831);expected.booleanValue = false;
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8832);BagOfPrimitives actual = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8833);assertEquals(expected, actual);
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testVersionedGsonMixingSinceAndUntilSerialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12n415g6te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedGsonMixingSinceAndUntilSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12n415g6te(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8834);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8835);Gson gson = builder.setVersion(1.0).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8836);SinceUntilMixing target = new SinceUntilMixing();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8837);String json = gson.toJson(target);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8838);assertFalse(json.contains("\"b\":" + B));
    
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8839);gson = builder.setVersion(1.2).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8840);json = gson.toJson(target);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8841);assertTrue(json.contains("\"b\":" + B));
    
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8842);gson = builder.setVersion(1.3).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8843);json = gson.toJson(target);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8844);assertFalse(json.contains("\"b\":" + B));
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  public void testVersionedGsonMixingSinceAndUntilDeserialization() {__CLR4_4_16rv6rvlck0y9d4.R.globalSliceStart(getClass().getName(),8845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8jeaz6tp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16rv6rvlck0y9d4.R.rethrow($CLV_t2$);}finally{__CLR4_4_16rv6rvlck0y9d4.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedGsonMixingSinceAndUntilDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8jeaz6tp(){try{__CLR4_4_16rv6rvlck0y9d4.R.inc(8845);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8846);String json = "{\"a\":5,\"b\":6}";
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8847);Gson gson = builder.setVersion(1.0).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8848);SinceUntilMixing result = gson.fromJson(json, SinceUntilMixing.class);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8849);assertEquals(5, result.a);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8850);assertEquals(B, result.b);
    
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8851);gson = builder.setVersion(1.2).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8852);result = gson.fromJson(json, SinceUntilMixing.class);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8853);assertEquals(5, result.a);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8854);assertEquals(6, result.b);
    
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8855);gson = builder.setVersion(1.3).create();
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8856);result = gson.fromJson(json, SinceUntilMixing.class);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8857);assertEquals(5, result.a);
    __CLR4_4_16rv6rvlck0y9d4.R.inc(8858);assertEquals(B, result.b);
  }finally{__CLR4_4_16rv6rvlck0y9d4.R.flushNeeded();}}

  private static class Version1 {
    @Until(1.3) int a = A;
    @Since(1.0) int b = B;
  }

  private static class Version1_1 extends Version1 {
    @Since(1.1) int c = C;
  }

  @Since(1.2)
  private static class Version1_2 extends Version1_1 {
    int d = D;
  }
  
  private static class SinceUntilMixing {
    int a = A;
    
    @Since(1.1)
    @Until(1.3)
    int b = B;
  }
}
