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
import java.util.List;

/**
 * Exercising the construction of the Parameter object and ensure the
 * proper types are returned.
 *
 * @author Joel Leitch
 */
public class TypeInfoTest extends TestCase {static class __CLR4_4_142b42blck0y8x6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testPrimitive() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pvx9842b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testPrimitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pvx9842b() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5267);
    __CLR4_4_142b42blck0y8x6.R.inc(5268);TypeInfo typeInfo = new TypeInfo(boolean.class);

    __CLR4_4_142b42blck0y8x6.R.inc(5269);assertFalse(typeInfo.isArray());
    __CLR4_4_142b42blck0y8x6.R.inc(5270);assertTrue(typeInfo.isPrimitive());
    __CLR4_4_142b42blck0y8x6.R.inc(5271);assertEquals(boolean.class, typeInfo.getRawClass());
    __CLR4_4_142b42blck0y8x6.R.inc(5272);assertEquals(Boolean.class, typeInfo.getWrappedClass());
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}

  public void testPrimitiveWrapper() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g73hlx42h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testPrimitiveWrapper",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g73hlx42h() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5273);
    __CLR4_4_142b42blck0y8x6.R.inc(5274);TypeInfo typeInfo = new TypeInfo(Integer.class);

    __CLR4_4_142b42blck0y8x6.R.inc(5275);assertEquals(Integer.class, typeInfo.getRawClass());
    __CLR4_4_142b42blck0y8x6.R.inc(5276);assertTrue(typeInfo.isPrimitive());
    __CLR4_4_142b42blck0y8x6.R.inc(5277);assertFalse(typeInfo.isArray());
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}

  public void testString() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184sgd242m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184sgd242m() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5278);
    __CLR4_4_142b42blck0y8x6.R.inc(5279);TypeInfo typeInfo = new TypeInfo(String.class);

    __CLR4_4_142b42blck0y8x6.R.inc(5280);assertFalse(typeInfo.isArray());
    __CLR4_4_142b42blck0y8x6.R.inc(5281);assertFalse(typeInfo.isPrimitive());
    __CLR4_4_142b42blck0y8x6.R.inc(5282);assertEquals(String.class, typeInfo.getRawClass());
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}

  public void testObject() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iogga042r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iogga042r() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5283);
    __CLR4_4_142b42blck0y8x6.R.inc(5284);TypeInfo typeInfo = new TypeInfo(Object.class);

    __CLR4_4_142b42blck0y8x6.R.inc(5285);assertFalse(typeInfo.isArray());
    __CLR4_4_142b42blck0y8x6.R.inc(5286);assertFalse(typeInfo.isPrimitive());
    __CLR4_4_142b42blck0y8x6.R.inc(5287);assertEquals(Object.class, typeInfo.getRawClass());
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}

  public void testPrimitiveType() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrekay42w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testPrimitiveType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrekay42w() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5288);
    __CLR4_4_142b42blck0y8x6.R.inc(5289);TypeInfo typeInfo = new TypeInfo(long.class);
    __CLR4_4_142b42blck0y8x6.R.inc(5290);assertFalse(typeInfo.isArray());
    __CLR4_4_142b42blck0y8x6.R.inc(5291);assertEquals(long.class, typeInfo.getRawClass());
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}

  public void testObjectType() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i74ylu430();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testObjectType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i74ylu430() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5292);
    __CLR4_4_142b42blck0y8x6.R.inc(5293);TypeInfo typeInfo = new TypeInfo(String.class);
    __CLR4_4_142b42blck0y8x6.R.inc(5294);assertFalse(typeInfo.isArray());
    __CLR4_4_142b42blck0y8x6.R.inc(5295);assertFalse(typeInfo.isPrimitive());
    __CLR4_4_142b42blck0y8x6.R.inc(5296);assertEquals(String.class, typeInfo.getRawClass());
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}

  public void testParameterizedTypes() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrlj0n435();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testParameterizedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrlj0n435() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5297);
    __CLR4_4_142b42blck0y8x6.R.inc(5298);Type type = new TypeToken<List<String>>() {}.getType();
    __CLR4_4_142b42blck0y8x6.R.inc(5299);TypeInfo typeInfo = new TypeInfo(type);

    __CLR4_4_142b42blck0y8x6.R.inc(5300);assertFalse(typeInfo.isArray());
    __CLR4_4_142b42blck0y8x6.R.inc(5301);assertEquals(List.class, typeInfo.getRawClass());
    __CLR4_4_142b42blck0y8x6.R.inc(5302);assertEquals(type, typeInfo.getActualType());
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}

  public void testGenericizedGenericType() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3rl4t43b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testGenericizedGenericType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3rl4t43b() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5303);
    __CLR4_4_142b42blck0y8x6.R.inc(5304);Type type = new TypeToken<List<List<String>>>() {}.getType();
    __CLR4_4_142b42blck0y8x6.R.inc(5305);Type genericType = new TypeToken<List<String>>() {}.getType();

    __CLR4_4_142b42blck0y8x6.R.inc(5306);TypeInfo typeInfo = new TypeInfo(type);
    __CLR4_4_142b42blck0y8x6.R.inc(5307);assertFalse(typeInfo.isArray());
    __CLR4_4_142b42blck0y8x6.R.inc(5308);assertEquals(List.class, typeInfo.getRawClass());
    __CLR4_4_142b42blck0y8x6.R.inc(5309);Type actualTypeForFirstTypeVariable = TypeUtils.getActualTypeForFirstTypeVariable(type);
    __CLR4_4_142b42blck0y8x6.R.inc(5310);assertEquals(genericType, actualTypeForFirstTypeVariable);

    __CLR4_4_142b42blck0y8x6.R.inc(5311);typeInfo = new TypeInfo(genericType);
    __CLR4_4_142b42blck0y8x6.R.inc(5312);actualTypeForFirstTypeVariable = TypeUtils.getActualTypeForFirstTypeVariable(genericType);
    __CLR4_4_142b42blck0y8x6.R.inc(5313);assertEquals(String.class, actualTypeForFirstTypeVariable);
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}

  public void testStrangeTypeParameters() throws Exception {__CLR4_4_142b42blck0y8x6.R.globalSliceStart(getClass().getName(),5314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sg7ib943m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142b42blck0y8x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_142b42blck0y8x6.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testStrangeTypeParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sg7ib943m() throws Exception{try{__CLR4_4_142b42blck0y8x6.R.inc(5314);
    __CLR4_4_142b42blck0y8x6.R.inc(5315);try {
      __CLR4_4_142b42blck0y8x6.R.inc(5316);new TypeInfo(new Type() {});
      __CLR4_4_142b42blck0y8x6.R.inc(5317);fail("Should not be able to determine this unknown type");
    } catch (IllegalArgumentException expected) {
    }
  }finally{__CLR4_4_142b42blck0y8x6.R.flushNeeded();}}
}
