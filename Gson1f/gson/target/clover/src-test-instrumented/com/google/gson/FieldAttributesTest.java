/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2009 Google Inc.
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

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Unit tests for the {@link FieldAttributes} class.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class FieldAttributesTest extends TestCase {static class __CLR4_4_136e36elck0y8qz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private FieldAttributes fieldAttributes;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_136e36elck0y8qz.R.inc(4118);
    __CLR4_4_136e36elck0y8qz.R.inc(4119);super.setUp();
    __CLR4_4_136e36elck0y8qz.R.inc(4120);fieldAttributes = new FieldAttributes(Foo.class, Foo.class.getField("bar"));
  }finally{__CLR4_4_136e36elck0y8qz.R.flushNeeded();}}

  public void testNullField() throws Exception {__CLR4_4_136e36elck0y8qz.R.globalSliceStart(getClass().getName(),4121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9falk36h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136e36elck0y8qz.R.rethrow($CLV_t2$);}finally{__CLR4_4_136e36elck0y8qz.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testNullField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9falk36h() throws Exception{try{__CLR4_4_136e36elck0y8qz.R.inc(4121);
    __CLR4_4_136e36elck0y8qz.R.inc(4122);try {
      __CLR4_4_136e36elck0y8qz.R.inc(4123);new FieldAttributes(Foo.class, null);
      __CLR4_4_136e36elck0y8qz.R.inc(4124);fail("Field parameter can not be null");
    } catch (NullPointerException expected) { }
  }finally{__CLR4_4_136e36elck0y8qz.R.flushNeeded();}}

  public void testDeclaringClass() throws Exception {__CLR4_4_136e36elck0y8qz.R.globalSliceStart(getClass().getName(),4125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pbcjpy36l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136e36elck0y8qz.R.rethrow($CLV_t2$);}finally{__CLR4_4_136e36elck0y8qz.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testDeclaringClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pbcjpy36l() throws Exception{try{__CLR4_4_136e36elck0y8qz.R.inc(4125);
    __CLR4_4_136e36elck0y8qz.R.inc(4126);assertEquals(Foo.class, fieldAttributes.getDeclaringClass());
  }finally{__CLR4_4_136e36elck0y8qz.R.flushNeeded();}}

  public void testModifiers() throws Exception {__CLR4_4_136e36elck0y8qz.R.globalSliceStart(getClass().getName(),4127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n5te936n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136e36elck0y8qz.R.rethrow($CLV_t2$);}finally{__CLR4_4_136e36elck0y8qz.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testModifiers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n5te936n() throws Exception{try{__CLR4_4_136e36elck0y8qz.R.inc(4127);
    __CLR4_4_136e36elck0y8qz.R.inc(4128);assertFalse(fieldAttributes.hasModifier(Modifier.STATIC));
    __CLR4_4_136e36elck0y8qz.R.inc(4129);assertFalse(fieldAttributes.hasModifier(Modifier.FINAL));
    __CLR4_4_136e36elck0y8qz.R.inc(4130);assertFalse(fieldAttributes.hasModifier(Modifier.ABSTRACT));
    __CLR4_4_136e36elck0y8qz.R.inc(4131);assertFalse(fieldAttributes.hasModifier(Modifier.VOLATILE));
    __CLR4_4_136e36elck0y8qz.R.inc(4132);assertFalse(fieldAttributes.hasModifier(Modifier.PROTECTED));

    __CLR4_4_136e36elck0y8qz.R.inc(4133);assertTrue(fieldAttributes.hasModifier(Modifier.PUBLIC));
    __CLR4_4_136e36elck0y8qz.R.inc(4134);assertTrue(fieldAttributes.hasModifier(Modifier.TRANSIENT));
  }finally{__CLR4_4_136e36elck0y8qz.R.flushNeeded();}}

  public void testIsSynthetic() throws Exception {__CLR4_4_136e36elck0y8qz.R.globalSliceStart(getClass().getName(),4135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnfk4036v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136e36elck0y8qz.R.rethrow($CLV_t2$);}finally{__CLR4_4_136e36elck0y8qz.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testIsSynthetic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnfk4036v() throws Exception{try{__CLR4_4_136e36elck0y8qz.R.inc(4135);
    __CLR4_4_136e36elck0y8qz.R.inc(4136);assertFalse(fieldAttributes.isSynthetic());
  }finally{__CLR4_4_136e36elck0y8qz.R.flushNeeded();}}

  public void testName() throws Exception {__CLR4_4_136e36elck0y8qz.R.globalSliceStart(getClass().getName(),4137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufa59836x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136e36elck0y8qz.R.rethrow($CLV_t2$);}finally{__CLR4_4_136e36elck0y8qz.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufa59836x() throws Exception{try{__CLR4_4_136e36elck0y8qz.R.inc(4137);
    __CLR4_4_136e36elck0y8qz.R.inc(4138);assertEquals("bar", fieldAttributes.getName());
  }finally{__CLR4_4_136e36elck0y8qz.R.flushNeeded();}}

  public void testDeclaredTypeAndClass() throws Exception {__CLR4_4_136e36elck0y8qz.R.globalSliceStart(getClass().getName(),4139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjzexe36z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136e36elck0y8qz.R.rethrow($CLV_t2$);}finally{__CLR4_4_136e36elck0y8qz.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testDeclaredTypeAndClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjzexe36z() throws Exception{try{__CLR4_4_136e36elck0y8qz.R.inc(4139);
    __CLR4_4_136e36elck0y8qz.R.inc(4140);Type expectedType = new TypeToken<List<String>>() {}.getType();
    __CLR4_4_136e36elck0y8qz.R.inc(4141);assertEquals(expectedType, fieldAttributes.getDeclaredType());
    __CLR4_4_136e36elck0y8qz.R.inc(4142);assertEquals(List.class, fieldAttributes.getDeclaredClass());
  }finally{__CLR4_4_136e36elck0y8qz.R.flushNeeded();}}

  private static class Foo {
    @SuppressWarnings("unused")
    public transient List<String> bar;
  }
}
