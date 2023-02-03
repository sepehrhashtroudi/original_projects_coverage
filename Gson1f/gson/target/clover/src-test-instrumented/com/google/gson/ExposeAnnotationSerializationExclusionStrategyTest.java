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

import java.lang.reflect.Field;

import junit.framework.TestCase;

import com.google.gson.annotations.Expose;

/**
 * Unit tests for the {@link ExposeAnnotationSerializationExclusionStrategy} class.
 *
 * @author Joel Leitch
 */
public class ExposeAnnotationSerializationExclusionStrategyTest extends TestCase {static class __CLR4_4_135x35xlck0y8qt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4118,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private ExposeAnnotationSerializationExclusionStrategy strategy;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_135x35xlck0y8qt.R.inc(4101);
    __CLR4_4_135x35xlck0y8qt.R.inc(4102);super.setUp();
    __CLR4_4_135x35xlck0y8qt.R.inc(4103);strategy = new ExposeAnnotationSerializationExclusionStrategy();
  }finally{__CLR4_4_135x35xlck0y8qt.R.flushNeeded();}}

  public void testNeverSkipClasses() throws Exception {__CLR4_4_135x35xlck0y8qt.R.globalSliceStart(getClass().getName(),4104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kp9nho360();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135x35xlck0y8qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_135x35xlck0y8qt.R.globalSliceEnd(getClass().getName(),"com.google.gson.ExposeAnnotationSerializationExclusionStrategyTest.testNeverSkipClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kp9nho360() throws Exception{try{__CLR4_4_135x35xlck0y8qt.R.inc(4104);
    __CLR4_4_135x35xlck0y8qt.R.inc(4105);assertFalse(strategy.shouldSkipClass(MockObject.class));
  }finally{__CLR4_4_135x35xlck0y8qt.R.flushNeeded();}}

  public void testSkipNonAnnotatedFields() throws Exception {__CLR4_4_135x35xlck0y8qt.R.globalSliceStart(getClass().getName(),4106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrf4po362();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135x35xlck0y8qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_135x35xlck0y8qt.R.globalSliceEnd(getClass().getName(),"com.google.gson.ExposeAnnotationSerializationExclusionStrategyTest.testSkipNonAnnotatedFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrf4po362() throws Exception{try{__CLR4_4_135x35xlck0y8qt.R.inc(4106);
    __CLR4_4_135x35xlck0y8qt.R.inc(4107);Field f = MockObject.class.getField("hiddenField");
    __CLR4_4_135x35xlck0y8qt.R.inc(4108);assertTrue(strategy.shouldSkipField(new FieldAttributes(MockObject.class, f)));
  }finally{__CLR4_4_135x35xlck0y8qt.R.flushNeeded();}}

  public void testSkipExplicitlySkippedFields() throws Exception {__CLR4_4_135x35xlck0y8qt.R.globalSliceStart(getClass().getName(),4109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yaxa2q365();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135x35xlck0y8qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_135x35xlck0y8qt.R.globalSliceEnd(getClass().getName(),"com.google.gson.ExposeAnnotationSerializationExclusionStrategyTest.testSkipExplicitlySkippedFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yaxa2q365() throws Exception{try{__CLR4_4_135x35xlck0y8qt.R.inc(4109);
    __CLR4_4_135x35xlck0y8qt.R.inc(4110);Field f = MockObject.class.getField("explicitlyHiddenField");
    __CLR4_4_135x35xlck0y8qt.R.inc(4111);assertTrue(strategy.shouldSkipField(new FieldAttributes(MockObject.class, f)));
  }finally{__CLR4_4_135x35xlck0y8qt.R.flushNeeded();}}

  public void testNeverSkipExposedAnnotatedFields() throws Exception {__CLR4_4_135x35xlck0y8qt.R.globalSliceStart(getClass().getName(),4112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11bbf4h368();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135x35xlck0y8qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_135x35xlck0y8qt.R.globalSliceEnd(getClass().getName(),"com.google.gson.ExposeAnnotationSerializationExclusionStrategyTest.testNeverSkipExposedAnnotatedFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11bbf4h368() throws Exception{try{__CLR4_4_135x35xlck0y8qt.R.inc(4112);
    __CLR4_4_135x35xlck0y8qt.R.inc(4113);Field f = MockObject.class.getField("exposedField");
    __CLR4_4_135x35xlck0y8qt.R.inc(4114);assertFalse(strategy.shouldSkipField(new FieldAttributes(MockObject.class, f)));
  }finally{__CLR4_4_135x35xlck0y8qt.R.flushNeeded();}}

  public void testNeverSkipExplicitlyExposedAnnotatedFields() throws Exception {__CLR4_4_135x35xlck0y8qt.R.globalSliceStart(getClass().getName(),4115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t60r9u36b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135x35xlck0y8qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_135x35xlck0y8qt.R.globalSliceEnd(getClass().getName(),"com.google.gson.ExposeAnnotationSerializationExclusionStrategyTest.testNeverSkipExplicitlyExposedAnnotatedFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t60r9u36b() throws Exception{try{__CLR4_4_135x35xlck0y8qt.R.inc(4115);
    __CLR4_4_135x35xlck0y8qt.R.inc(4116);Field f = MockObject.class.getField("explicitlyExposedField");
    __CLR4_4_135x35xlck0y8qt.R.inc(4117);assertFalse(strategy.shouldSkipField(new FieldAttributes(MockObject.class, f)));
  }finally{__CLR4_4_135x35xlck0y8qt.R.flushNeeded();}}

  @SuppressWarnings("unused")
  private static class MockObject {
    @Expose
    public final int exposedField = 0;

    @Expose(serialize=true)
    public final int explicitlyExposedField = 0;

    @Expose(serialize=false)
    public final int explicitlyHiddenField = 0;

    public final int hiddenField = 0;
  }
}
