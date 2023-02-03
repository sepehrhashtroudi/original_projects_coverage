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

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Small test to ensure that the TypeInfoFactory is return the object that we expect.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class TypeInfoFactoryTest extends TestCase {static class __CLR4_4_13y23y2lck0y8wt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static Type OBJ_TYPE = new TypeToken<ObjectWithDifferentFields<Integer>>() {}.getType();
  private ObjectWithDifferentFields<Integer> obj;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13y23y2lck0y8wt.R.inc(5114);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5115);super.setUp();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5116);obj = new ObjectWithDifferentFields<Integer>();
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testSimpleField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7swsj3y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testSimpleField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7swsj3y5() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5117);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5118);Field f = obj.getClass().getField("simpleField");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5119);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5120);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5121);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5122);assertEquals(String.class, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5123);assertEquals(String.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testEnumField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjs7zi3yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testEnumField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjs7zi3yc() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5124);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5125);Field f = obj.getClass().getField("enumField");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5126);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5127);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5128);assertTrue(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5129);assertEquals(ObjectWithDifferentFields.TestEnum.class, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5130);assertEquals(ObjectWithDifferentFields.TestEnum.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testParameterizedTypeField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4p11c3yj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testParameterizedTypeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4p11c3yj() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5131);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5132);Type listType = new TypeToken<List<String>>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5133);Field f = obj.getClass().getField("simpleParameterizedType");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5134);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5135);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5136);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5137);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5138);assertEquals(List.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testNestedParameterizedTypeField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ovogzt3yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testNestedParameterizedTypeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ovogzt3yr() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5139);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5140);Type listType = new TypeToken<List<List<String>>>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5141);Field f = obj.getClass().getField("simpleNestedParameterizedType");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5142);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5143);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5144);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5145);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5146);assertEquals(List.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testGenericArrayTypeField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bp3mab3yz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testGenericArrayTypeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bp3mab3yz() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5147);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5148);Type listType = new TypeToken<List<String>[]>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5149);Field f = obj.getClass().getField("simpleGenericArray");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5150);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5151);assertTrue(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5152);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5153);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5154);assertEquals(List[].class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testTypeVariableField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y64luv3z7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testTypeVariableField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y64luv3z7() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5155);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5156);Field f = obj.getClass().getField("typeVariableObj");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5157);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5158);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5159);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5160);assertEquals(Integer.class, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5161);assertEquals(Integer.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testTypeVariableArrayField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1v683ze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testTypeVariableArrayField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1v683ze() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5162);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5163);Field f = obj.getClass().getField("typeVariableArray");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5164);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5165);assertTrue(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5166);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5167);assertEquals(Integer[].class, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5168);assertEquals(Integer[].class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testMutliDimensionalTypeVariableArrayField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvykuw3zl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testMutliDimensionalTypeVariableArrayField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvykuw3zl() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5169);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5170);Field f = obj.getClass().getField("mutliDimensionalTypeVariableArray");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5171);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5172);assertTrue(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5173);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5174);assertEquals(Integer[][][].class, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5175);assertEquals(Integer[][][].class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testParameterizedTypeVariableField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhias3zs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testParameterizedTypeVariableField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhias3zs() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5176);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5177);Type listType = new TypeToken<List<Integer>>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5178);Field f = obj.getClass().getField("listOfTypeVariables");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5179);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5180);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5181);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5182);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5183);assertEquals(List.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testNestedParameterizedTypeVariableField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d0lpp7400();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testNestedParameterizedTypeVariableField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d0lpp7400() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5184);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5185);Type listType = new TypeToken<List<List<Integer>>>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5186);Field f = obj.getClass().getField("listOfListsOfTypeVariables");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5187);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5188);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5189);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5190);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5191);assertEquals(List.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testParameterizedTypeVariableArrayField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2lbcr408();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testParameterizedTypeVariableArrayField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2lbcr408() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5192);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5193);Type listType = new TypeToken<List<Integer>[]>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5194);Field f = obj.getClass().getField("listOfTypeVariablesArray");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5195);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5196);assertTrue(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5197);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5198);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5199);assertEquals(List[].class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testWildcardField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9shud40g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testWildcardField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9shud40g() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5200);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5201);Type listType = new TypeToken<List<Object>>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5202);Field f = obj.getClass().getField("listWithWildcard");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5203);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5204);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5205);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5206);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5207);assertEquals(List.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testArrayOfWildcardField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131482140o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testArrayOfWildcardField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131482140o() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5208);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5209);Type listType = new TypeToken<List<Object>[]>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5210);Field f = obj.getClass().getField("arrayOfListWithWildcard");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5211);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5212);assertTrue(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5213);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5214);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5215);assertEquals(List[].class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testListStringWildcardField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j4mduu40w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testListStringWildcardField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j4mduu40w() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5216);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5217);Type listType = new TypeToken<List<String>>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5218);Field f = obj.getClass().getField("listWithStringWildcard");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5219);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5220);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5221);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5222);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5223);assertEquals(List.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testArrayOfListStringWildcardField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmbzza414();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testArrayOfListStringWildcardField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmbzza414() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5224);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5225);Type listType = new TypeToken<List<String>[]>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5226);Field f = obj.getClass().getField("arrayOfListWithStringWildcard");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5227);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5228);assertTrue(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5229);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5230);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5231);assertEquals(List[].class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testListTypeVariableWildcardField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbtnbz41c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testListTypeVariableWildcardField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbtnbz41c() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5232);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5233);Type listType = new TypeToken<List<Integer>>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5234);Field f = obj.getClass().getField("listWithTypeVariableWildcard");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5235);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5236);assertFalse(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5237);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5238);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5239);assertEquals(List.class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  public void testArrayOfListTypeVariableWildcardField() throws Exception {__CLR4_4_13y23y2lck0y8wt.R.globalSliceStart(getClass().getName(),5240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ennisr41k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y23y2lck0y8wt.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y23y2lck0y8wt.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testArrayOfListTypeVariableWildcardField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ennisr41k() throws Exception{try{__CLR4_4_13y23y2lck0y8wt.R.inc(5240);
    __CLR4_4_13y23y2lck0y8wt.R.inc(5241);Type listType = new TypeToken<List<Integer>[]>() {}.getType();
    __CLR4_4_13y23y2lck0y8wt.R.inc(5242);Field f = obj.getClass().getField("arrayOfListWithTypeVariableWildcard");
    __CLR4_4_13y23y2lck0y8wt.R.inc(5243);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE);

    __CLR4_4_13y23y2lck0y8wt.R.inc(5244);assertTrue(typeInfo.isArray());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5245);assertFalse(typeInfo.isEnum());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5246);assertEquals(listType, typeInfo.getActualType());
    __CLR4_4_13y23y2lck0y8wt.R.inc(5247);assertEquals(List[].class, typeInfo.getRawClass());
  }finally{__CLR4_4_13y23y2lck0y8wt.R.flushNeeded();}}

  @SuppressWarnings("unused")
  private static class ObjectWithDifferentFields<T> {
    public static enum TestEnum {
      TEST_1, TEST_2;
    }

    public String simpleField;
    public TestEnum enumField;
    public List<String> simpleParameterizedType;
    public List<List<String>> simpleNestedParameterizedType;
    public List<String>[] simpleGenericArray;

    public T typeVariableObj;
    public T[] typeVariableArray;
    public T[][][] mutliDimensionalTypeVariableArray;
    public List<T> listOfTypeVariables;
    public List<List<T>> listOfListsOfTypeVariables;
    public List<T>[] listOfTypeVariablesArray;

    public List<?> listWithWildcard;
    public List<?>[] arrayOfListWithWildcard;
    public List<? extends String> listWithStringWildcard;
    public List<? extends String>[] arrayOfListWithStringWildcard;

    public List<? extends T> listWithTypeVariableWildcard;
    public List<? extends T>[] arrayOfListWithTypeVariableWildcard;
  }
}
