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

import junit.framework.TestCase;

/**
 * Tests for the {@link LowerCamelCaseSeparatorNamingPolicy} class.
 *
 * @author Joel Leitch
 */
public class LowerCamelCaseSeparatorNamingPolicyTest extends TestCase {static class __CLR4_4_13j93j9lck0y8tp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final Class<String> CLASS = String.class;
  private static final String UNDERSCORE = "_";

  private LowerCamelCaseSeparatorNamingPolicy namingPolicy;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13j93j9lck0y8tp.R.inc(4581);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4582);super.setUp();
    __CLR4_4_13j93j9lck0y8tp.R.inc(4583);namingPolicy = new LowerCamelCaseSeparatorNamingPolicy(UNDERSCORE);
  }finally{__CLR4_4_13j93j9lck0y8tp.R.flushNeeded();}}

  public void testNameBeginsWithLowerCase() throws Exception {__CLR4_4_13j93j9lck0y8tp.R.globalSliceStart(getClass().getName(),4584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12g8rf93jc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13j93j9lck0y8tp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13j93j9lck0y8tp.R.globalSliceEnd(getClass().getName(),"com.google.gson.LowerCamelCaseSeparatorNamingPolicyTest.testNameBeginsWithLowerCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12g8rf93jc() throws Exception{try{__CLR4_4_13j93j9lck0y8tp.R.inc(4584);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4585);String translatedName = namingPolicy.translateName("testNameBeginsWithLower", CLASS, null);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4586);assertEquals("test_name_begins_with_lower", translatedName);
  }finally{__CLR4_4_13j93j9lck0y8tp.R.flushNeeded();}}

  public void testNameBeginsWithUpperCase() throws Exception {__CLR4_4_13j93j9lck0y8tp.R.globalSliceStart(getClass().getName(),4587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16k434k3jf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13j93j9lck0y8tp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13j93j9lck0y8tp.R.globalSliceEnd(getClass().getName(),"com.google.gson.LowerCamelCaseSeparatorNamingPolicyTest.testNameBeginsWithUpperCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16k434k3jf() throws Exception{try{__CLR4_4_13j93j9lck0y8tp.R.inc(4587);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4588);String translatedName = namingPolicy.translateName("TestNameBeginsWithUpper", CLASS, null);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4589);assertEquals("test_name_begins_with_upper", translatedName);
  }finally{__CLR4_4_13j93j9lck0y8tp.R.flushNeeded();}}

  public void testExceptionPossiblyIncorrectSeparation() throws Exception {__CLR4_4_13j93j9lck0y8tp.R.globalSliceStart(getClass().getName(),4590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqcnao3ji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13j93j9lck0y8tp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13j93j9lck0y8tp.R.globalSliceEnd(getClass().getName(),"com.google.gson.LowerCamelCaseSeparatorNamingPolicyTest.testExceptionPossiblyIncorrectSeparation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqcnao3ji() throws Exception{try{__CLR4_4_13j93j9lck0y8tp.R.inc(4590);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4591);String translatedName = namingPolicy.translateName("aURL", CLASS, null);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4592);assertEquals("a_u_r_l", translatedName);
  }finally{__CLR4_4_13j93j9lck0y8tp.R.flushNeeded();}}
  
  public void testUsingDashesInstead() throws Exception {__CLR4_4_13j93j9lck0y8tp.R.globalSliceStart(getClass().getName(),4593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lupodz3jl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13j93j9lck0y8tp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13j93j9lck0y8tp.R.globalSliceEnd(getClass().getName(),"com.google.gson.LowerCamelCaseSeparatorNamingPolicyTest.testUsingDashesInstead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lupodz3jl() throws Exception{try{__CLR4_4_13j93j9lck0y8tp.R.inc(4593);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4594);namingPolicy = new LowerCamelCaseSeparatorNamingPolicy("-");
    __CLR4_4_13j93j9lck0y8tp.R.inc(4595);String translatedName = namingPolicy.translateName("testUsingDashesInstead", CLASS, null);
    __CLR4_4_13j93j9lck0y8tp.R.inc(4596);assertEquals("test-using-dashes-instead", translatedName);
  }finally{__CLR4_4_13j93j9lck0y8tp.R.flushNeeded();}}
}
