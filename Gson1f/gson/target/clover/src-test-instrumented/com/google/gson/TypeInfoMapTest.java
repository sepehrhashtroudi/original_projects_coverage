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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for the default JSON map serialization object located in the
 * {@link DefaultTypeAdapters} class.
 *
 * @author Joel Leitch
 */
public class TypeInfoMapTest extends TestCase {static class __CLR4_4_141s41slck0y8x0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testInvalidConstruction() throws Exception {__CLR4_4_141s41slck0y8x0.R.globalSliceStart(getClass().getName(),5248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xv2m541s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141s41slck0y8x0.R.rethrow($CLV_t2$);}finally{__CLR4_4_141s41slck0y8x0.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoMapTest.testInvalidConstruction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xv2m541s() throws Exception{try{__CLR4_4_141s41slck0y8x0.R.inc(5248);
    __CLR4_4_141s41slck0y8x0.R.inc(5249);try {
      __CLR4_4_141s41slck0y8x0.R.inc(5250);new TypeInfoMap(String.class);
      __CLR4_4_141s41slck0y8x0.R.inc(5251);fail("Must be a ParameterizedType");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_141s41slck0y8x0.R.flushNeeded();}}

  public void testNonMapConstruction() throws Exception {__CLR4_4_141s41slck0y8x0.R.globalSliceStart(getClass().getName(),5252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psphbt41w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141s41slck0y8x0.R.rethrow($CLV_t2$);}finally{__CLR4_4_141s41slck0y8x0.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoMapTest.testNonMapConstruction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psphbt41w() throws Exception{try{__CLR4_4_141s41slck0y8x0.R.inc(5252);
    __CLR4_4_141s41slck0y8x0.R.inc(5253);try {
      __CLR4_4_141s41slck0y8x0.R.inc(5254);Type parameterizedMapType = new TypeToken<List<String>>() {}.getType();
      __CLR4_4_141s41slck0y8x0.R.inc(5255);new TypeInfoMap(parameterizedMapType);
      __CLR4_4_141s41slck0y8x0.R.inc(5256);fail("The raw type must be a Map");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_141s41slck0y8x0.R.flushNeeded();}}

  public void testBasicGetters() throws Exception {__CLR4_4_141s41slck0y8x0.R.globalSliceStart(getClass().getName(),5257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoi40d421();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141s41slck0y8x0.R.rethrow($CLV_t2$);}finally{__CLR4_4_141s41slck0y8x0.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoMapTest.testBasicGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoi40d421() throws Exception{try{__CLR4_4_141s41slck0y8x0.R.inc(5257);
    __CLR4_4_141s41slck0y8x0.R.inc(5258);Type parameterizedMapType = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_141s41slck0y8x0.R.inc(5259);TypeInfoMap mapTypeInfo = new TypeInfoMap(parameterizedMapType);

    __CLR4_4_141s41slck0y8x0.R.inc(5260);assertEquals(String.class, mapTypeInfo.getKeyType());
    __CLR4_4_141s41slck0y8x0.R.inc(5261);assertEquals(Integer.class, mapTypeInfo.getValueType());
  }finally{__CLR4_4_141s41slck0y8x0.R.flushNeeded();}}

  public void testMapImplementations() throws Exception {__CLR4_4_141s41slck0y8x0.R.globalSliceStart(getClass().getName(),5262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdqc82426();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141s41slck0y8x0.R.rethrow($CLV_t2$);}finally{__CLR4_4_141s41slck0y8x0.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoMapTest.testMapImplementations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdqc82426() throws Exception{try{__CLR4_4_141s41slck0y8x0.R.inc(5262);
    __CLR4_4_141s41slck0y8x0.R.inc(5263);Type parameterizedMapType = new TypeToken<HashMap<String, Integer>>() {}.getType();
    __CLR4_4_141s41slck0y8x0.R.inc(5264);TypeInfoMap mapTypeInfo = new TypeInfoMap(parameterizedMapType);

    __CLR4_4_141s41slck0y8x0.R.inc(5265);assertEquals(String.class, mapTypeInfo.getKeyType());
    __CLR4_4_141s41slck0y8x0.R.inc(5266);assertEquals(Integer.class, mapTypeInfo.getValueType());
  }finally{__CLR4_4_141s41slck0y8x0.R.flushNeeded();}}
}
