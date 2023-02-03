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
import com.google.gson.common.TestTypes.BagOfPrimitives;

import junit.framework.TestCase;

/**
 * Tests for security-related aspects of Gson
 * 
 * @author Inderjeet Singh
 */
public class SecurityTest extends TestCase {static class __CLR4_4_16mx6mxlck0y9c9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8628,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  /**
   * Keep this in sync with Gson.JSON_NON_EXECUTABLE_PREFIX
   */
  private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";

  private GsonBuilder gsonBuilder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_16mx6mxlck0y9c9.R.inc(8601);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8602);super.setUp();
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8603);gsonBuilder = new GsonBuilder();
  }finally{__CLR4_4_16mx6mxlck0y9c9.R.flushNeeded();}}

  public void testNonExecutableJsonSerialization() {__CLR4_4_16mx6mxlck0y9c9.R.globalSliceStart(getClass().getName(),8604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpfhze6n0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16mx6mxlck0y9c9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16mx6mxlck0y9c9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.SecurityTest.testNonExecutableJsonSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpfhze6n0(){try{__CLR4_4_16mx6mxlck0y9c9.R.inc(8604);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8605);Gson gson = gsonBuilder.generateNonExecutableJson().create();
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8606);String json = gson.toJson(new BagOfPrimitives());
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8607);assertTrue(json.startsWith(JSON_NON_EXECUTABLE_PREFIX));
  }finally{__CLR4_4_16mx6mxlck0y9c9.R.flushNeeded();}}
  
  public void testNonExecutableJsonDeserialization() {__CLR4_4_16mx6mxlck0y9c9.R.globalSliceStart(getClass().getName(),8608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s811s96n4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16mx6mxlck0y9c9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16mx6mxlck0y9c9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.SecurityTest.testNonExecutableJsonDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s811s96n4(){try{__CLR4_4_16mx6mxlck0y9c9.R.inc(8608);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8609);String json = JSON_NON_EXECUTABLE_PREFIX + "{longValue:1}";
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8610);Gson gson = gsonBuilder.create();
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8611);BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8612);assertEquals(1, target.longValue);
  }finally{__CLR4_4_16mx6mxlck0y9c9.R.flushNeeded();}}
  
  public void testJsonWithNonExectuableTokenSerialization() {__CLR4_4_16mx6mxlck0y9c9.R.globalSliceStart(getClass().getName(),8613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y019sn6n9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16mx6mxlck0y9c9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16mx6mxlck0y9c9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y019sn6n9(){try{__CLR4_4_16mx6mxlck0y9c9.R.inc(8613);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8614);Gson gson = gsonBuilder.generateNonExecutableJson().create();
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8615);String json = gson.toJson(JSON_NON_EXECUTABLE_PREFIX);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8616);assertTrue(json.contains(")]}'\n"));
  }finally{__CLR4_4_16mx6mxlck0y9c9.R.flushNeeded();}}
  
  /**
   *  Gson should be able to deserialize a stream with non-exectuable token even if it is created
   *  without {@link GsonBuilder#generateNonExecutableJson()}.
   */
  public void testJsonWithNonExectuableTokenWithRegularGsonDeserialization() {__CLR4_4_16mx6mxlck0y9c9.R.globalSliceStart(getClass().getName(),8617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1647vhn6nd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16mx6mxlck0y9c9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16mx6mxlck0y9c9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenWithRegularGsonDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1647vhn6nd(){try{__CLR4_4_16mx6mxlck0y9c9.R.inc(8617);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8618);Gson gson = gsonBuilder.create();
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8619);String json = JSON_NON_EXECUTABLE_PREFIX + "{stringValue:')]}\\u0027\\n'}";
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8620);BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8621);assertEquals(")]}'\n", target.stringValue);
  }finally{__CLR4_4_16mx6mxlck0y9c9.R.flushNeeded();}}  
  
  /**
   *  Gson should be able to deserialize a stream with non-exectuable token if it is created
   *  with {@link GsonBuilder#generateNonExecutableJson()}.
   */
  public void testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization() {__CLR4_4_16mx6mxlck0y9c9.R.globalSliceStart(getClass().getName(),8622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jb1hnd6ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16mx6mxlck0y9c9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16mx6mxlck0y9c9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jb1hnd6ni(){try{__CLR4_4_16mx6mxlck0y9c9.R.inc(8622);
    // Gson should be able to deserialize a stream with non-exectuable token even if it is created 
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8623);Gson gson = gsonBuilder.generateNonExecutableJson().create();
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8624);String json = JSON_NON_EXECUTABLE_PREFIX + "{intValue:2,stringValue:')]}\\u0027\\n'}";
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8625);BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8626);assertEquals(")]}'\n", target.stringValue);
    __CLR4_4_16mx6mxlck0y9c9.R.inc(8627);assertEquals(2, target.intValue);
  }finally{__CLR4_4_16mx6mxlck0y9c9.R.flushNeeded();}}  
}
