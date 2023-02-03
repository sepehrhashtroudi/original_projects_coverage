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
 * Small test for the {@link TypeInfoArray}.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class TypeInfoArrayTest extends TestCase {static class __CLR4_4_13wd3wdlck0y8wc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testArray() {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzzhou3wd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzzhou3wd(){try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5053);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5054);String[] a = {"a", "b", "c"};
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5055);TypeInfoArray typeInfo = new TypeInfoArray(a.getClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5056);assertEquals(a.getClass(), typeInfo.getRawClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5057);assertEquals(String.class, typeInfo.getComponentRawType());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testArrayOfArrays() {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fddjy73wi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testArrayOfArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fddjy73wi(){try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5058);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5059);String[][] a = {
        new String[]{"a1", "a2", "a3"},
        new String[]{"b1", "b2", "b3"},
        new String[]{"c1", "c2", "c3"}};
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5060);TypeInfoArray typeInfo = new TypeInfoArray(a.getClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5061);assertEquals(a.getClass(), typeInfo.getRawClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5062);assertEquals(String.class, typeInfo.getComponentRawType());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5063);assertEquals(String[].class, typeInfo.getSecondLevelType());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testParameterizedArray() {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ux3e553wo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testParameterizedArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ux3e553wo(){try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5064);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5065);Type type = new TypeToken<List<String>[]>() {}.getType();
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5066);TypeInfoArray typeInfo = new TypeInfoArray(type);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5067);assertEquals(List[].class, typeInfo.getRawClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5068);assertEquals(List.class, typeInfo.getComponentRawType());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testParameterizedArrayOfArrays() {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmzmpi3wt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testParameterizedArrayOfArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmzmpi3wt(){try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5069);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5070);Type type = new TypeToken<List<String>[][]>() {}.getType();
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5071);Type secondLevelType = new TypeToken<List<String>[]>() {}.getType();

    __CLR4_4_13wd3wdlck0y8wc.R.inc(5072);TypeInfoArray typeInfo = new TypeInfoArray(type);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5073);assertEquals(List[][].class, typeInfo.getRawClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5074);assertEquals(secondLevelType, typeInfo.getSecondLevelType());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5075);assertEquals(List.class, typeInfo.getComponentRawType());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testNestedParameterizedArray() {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13daekw3x0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testNestedParameterizedArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13daekw3x0(){try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5076);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5077);Type type = new TypeToken<List<List<String>>[]>() {}.getType();
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5078);Type secondLevelType = new TypeToken<List<List<String>>>() {}.getType();

    __CLR4_4_13wd3wdlck0y8wc.R.inc(5079);TypeInfoArray typeInfo = new TypeInfoArray(type);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5080);assertEquals(List[].class, typeInfo.getRawClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5081);assertEquals(secondLevelType, typeInfo.getSecondLevelType());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5082);assertEquals(List.class, typeInfo.getComponentRawType());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testPrimitiveArray() throws Exception {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggs3hn3x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testPrimitiveArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggs3hn3x7() throws Exception{try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5083);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5084);TypeInfoArray arrayTypeInfo = new TypeInfoArray(int[].class);

    __CLR4_4_13wd3wdlck0y8wc.R.inc(5085);assertTrue(arrayTypeInfo.isArray());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5086);assertFalse(arrayTypeInfo.isPrimitive());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5087);assertEquals(int.class, arrayTypeInfo.getSecondLevelType());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testStringArray() throws Exception {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0p7dv3xc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testStringArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0p7dv3xc() throws Exception{try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5088);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5089);TypeInfoArray arrayTypeInfo = new TypeInfoArray(String[].class);

    __CLR4_4_13wd3wdlck0y8wc.R.inc(5090);assertTrue(arrayTypeInfo.isArray());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5091);assertEquals(String.class, arrayTypeInfo.getSecondLevelType());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5092);assertEquals(String[].class, arrayTypeInfo.getRawClass());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testPrimitiveArrayType() throws Exception {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vqen973xh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testPrimitiveArrayType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vqen973xh() throws Exception{try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5093);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5094);TypeInfoArray typeInfo = new TypeInfoArray(long[].class);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5095);assertTrue(typeInfo.isArray());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5096);assertEquals(long.class, typeInfo.getSecondLevelType());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5097);assertEquals(long[].class, typeInfo.getRawClass());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testStringArrayType() throws Exception {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vt8m153xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testStringArrayType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vt8m153xm() throws Exception{try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5098);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5099);TypeInfoArray typeInfo = new TypeInfoArray(String[].class);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5100);assertTrue(typeInfo.isArray());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5101);assertEquals(String[].class, typeInfo.getRawClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5102);assertEquals(String.class, typeInfo.getSecondLevelType());
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}

  public void testArrayAsParameterizedTypes() throws Exception {__CLR4_4_13wd3wdlck0y8wc.R.globalSliceStart(getClass().getName(),5103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpuu2o3xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wd3wdlck0y8wc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wd3wdlck0y8wc.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testArrayAsParameterizedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpuu2o3xr() throws Exception{try{__CLR4_4_13wd3wdlck0y8wc.R.inc(5103);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5104);Type type = new TypeToken<List<String>[]>() {}.getType();
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5105);Type secondLevelType = new TypeToken<List<String>>() {}.getType();

    __CLR4_4_13wd3wdlck0y8wc.R.inc(5106);TypeInfoArray typeInfo = new TypeInfoArray(type);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5107);assertTrue(typeInfo.isArray());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5108);assertEquals(List[].class, typeInfo.getRawClass());
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5109);assertEquals(secondLevelType, typeInfo.getSecondLevelType());

    __CLR4_4_13wd3wdlck0y8wc.R.inc(5110);Type actualType = typeInfo.getActualType();
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5111);assertEquals(type, actualType);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5112);Type actualTypeForFirstTypeVariable = TypeUtils.getActualTypeForFirstTypeVariable(actualType);
    __CLR4_4_13wd3wdlck0y8wc.R.inc(5113);assertEquals(String.class, actualTypeForFirstTypeVariable);
  }finally{__CLR4_4_13wd3wdlck0y8wc.R.flushNeeded();}}
}
