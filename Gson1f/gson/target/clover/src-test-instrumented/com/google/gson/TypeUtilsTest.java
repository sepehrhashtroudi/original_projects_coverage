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

import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/**
 * Unit tests for {@link TypeUtils}.
 *
 * @author Inderjeet Singh
 */
public class TypeUtilsTest extends TestCase {static class __CLR4_4_143q43qlck0y8xb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5331,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final Type MAP_TYPE = new TypeToken<Map<String, Integer>>() {}.getType();

  public void testGetActualTypeForFirstTypeVariable() {__CLR4_4_143q43qlck0y8xb.R.globalSliceStart(getClass().getName(),5318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dy32pc43q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143q43qlck0y8xb.R.rethrow($CLV_t2$);}finally{__CLR4_4_143q43qlck0y8xb.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeUtilsTest.testGetActualTypeForFirstTypeVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dy32pc43q(){try{__CLR4_4_143q43qlck0y8xb.R.inc(5318);
    __CLR4_4_143q43qlck0y8xb.R.inc(5319);assertEquals(String.class, TypeUtils.getActualTypeForFirstTypeVariable(MAP_TYPE));
  }finally{__CLR4_4_143q43qlck0y8xb.R.flushNeeded();}}

  public void testIsArrayForNonArrayClasses() {__CLR4_4_143q43qlck0y8xb.R.globalSliceStart(getClass().getName(),5320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pidlqj43s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143q43qlck0y8xb.R.rethrow($CLV_t2$);}finally{__CLR4_4_143q43qlck0y8xb.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeUtilsTest.testIsArrayForNonArrayClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pidlqj43s(){try{__CLR4_4_143q43qlck0y8xb.R.inc(5320);
    __CLR4_4_143q43qlck0y8xb.R.inc(5321);assertFalse(TypeUtils.isArray(Boolean.class));
    __CLR4_4_143q43qlck0y8xb.R.inc(5322);assertFalse(TypeUtils.isArray(MAP_TYPE));
  }finally{__CLR4_4_143q43qlck0y8xb.R.flushNeeded();}}

  public void testIsArrayForArrayClasses() {__CLR4_4_143q43qlck0y8xb.R.globalSliceStart(getClass().getName(),5323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sk0f7k43v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143q43qlck0y8xb.R.rethrow($CLV_t2$);}finally{__CLR4_4_143q43qlck0y8xb.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeUtilsTest.testIsArrayForArrayClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sk0f7k43v(){try{__CLR4_4_143q43qlck0y8xb.R.inc(5323);
    __CLR4_4_143q43qlck0y8xb.R.inc(5324);assertTrue(TypeUtils.isArray(String[].class));
    __CLR4_4_143q43qlck0y8xb.R.inc(5325);assertTrue(TypeUtils.isArray(Integer[][].class));
    __CLR4_4_143q43qlck0y8xb.R.inc(5326);assertTrue(TypeUtils.isArray(Collection[].class));
  }finally{__CLR4_4_143q43qlck0y8xb.R.flushNeeded();}}

  public void testToRawClassForNonGenericClasses() {__CLR4_4_143q43qlck0y8xb.R.globalSliceStart(getClass().getName(),5327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqkv4n43z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143q43qlck0y8xb.R.rethrow($CLV_t2$);}finally{__CLR4_4_143q43qlck0y8xb.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeUtilsTest.testToRawClassForNonGenericClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqkv4n43z(){try{__CLR4_4_143q43qlck0y8xb.R.inc(5327);
    __CLR4_4_143q43qlck0y8xb.R.inc(5328);assertEquals(String.class, TypeUtils.toRawClass(String.class));
  }finally{__CLR4_4_143q43qlck0y8xb.R.flushNeeded();}}

  public void testToRawClassForGenericClasses() {__CLR4_4_143q43qlck0y8xb.R.globalSliceStart(getClass().getName(),5329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pl92qm441();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143q43qlck0y8xb.R.rethrow($CLV_t2$);}finally{__CLR4_4_143q43qlck0y8xb.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeUtilsTest.testToRawClassForGenericClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pl92qm441(){try{__CLR4_4_143q43qlck0y8xb.R.inc(5329);
    __CLR4_4_143q43qlck0y8xb.R.inc(5330);assertEquals(Map.class, TypeUtils.toRawClass(MAP_TYPE));
  }finally{__CLR4_4_143q43qlck0y8xb.R.flushNeeded();}}
}
