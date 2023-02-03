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

/**
 * Unit test for the {@link InnerClassExclusionStrategy} class.
 *
 * @author Joel Leitch
 */
public class InnerClassExclusionStrategyTest extends TestCase {static class __CLR4_4_1398398lck0y8rs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4237,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  public InnerClass innerClass;
  public StaticNestedClass staticNestedClass;

  private InnerClassExclusionStrategy strategy;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_1398398lck0y8rs.R.inc(4220);
    __CLR4_4_1398398lck0y8rs.R.inc(4221);super.setUp();
    __CLR4_4_1398398lck0y8rs.R.inc(4222);innerClass = new InnerClass();
    __CLR4_4_1398398lck0y8rs.R.inc(4223);staticNestedClass = new StaticNestedClass();
    __CLR4_4_1398398lck0y8rs.R.inc(4224);strategy = new InnerClassExclusionStrategy();
  }finally{__CLR4_4_1398398lck0y8rs.R.flushNeeded();}}

  public void testExcludeInnerClassObject() throws Exception {__CLR4_4_1398398lck0y8rs.R.globalSliceStart(getClass().getName(),4225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b25gds39d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1398398lck0y8rs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1398398lck0y8rs.R.globalSliceEnd(getClass().getName(),"com.google.gson.InnerClassExclusionStrategyTest.testExcludeInnerClassObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b25gds39d() throws Exception{try{__CLR4_4_1398398lck0y8rs.R.inc(4225);
    __CLR4_4_1398398lck0y8rs.R.inc(4226);Class<?> clazz = innerClass.getClass();
    __CLR4_4_1398398lck0y8rs.R.inc(4227);assertTrue(strategy.shouldSkipClass(clazz));
  }finally{__CLR4_4_1398398lck0y8rs.R.flushNeeded();}}

  public void testExcludeInnerClassField() throws Exception {__CLR4_4_1398398lck0y8rs.R.globalSliceStart(getClass().getName(),4228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171d2mv39g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1398398lck0y8rs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1398398lck0y8rs.R.globalSliceEnd(getClass().getName(),"com.google.gson.InnerClassExclusionStrategyTest.testExcludeInnerClassField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171d2mv39g() throws Exception{try{__CLR4_4_1398398lck0y8rs.R.inc(4228);
    __CLR4_4_1398398lck0y8rs.R.inc(4229);Field f = getClass().getField("innerClass");
    __CLR4_4_1398398lck0y8rs.R.inc(4230);assertTrue(strategy.shouldSkipField(new FieldAttributes(getClass(), f)));
  }finally{__CLR4_4_1398398lck0y8rs.R.flushNeeded();}}

  public void testIncludeStaticNestedClassObject() throws Exception {__CLR4_4_1398398lck0y8rs.R.globalSliceStart(getClass().getName(),4231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ny7xvh39j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1398398lck0y8rs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1398398lck0y8rs.R.globalSliceEnd(getClass().getName(),"com.google.gson.InnerClassExclusionStrategyTest.testIncludeStaticNestedClassObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ny7xvh39j() throws Exception{try{__CLR4_4_1398398lck0y8rs.R.inc(4231);
    __CLR4_4_1398398lck0y8rs.R.inc(4232);Class<?> clazz = staticNestedClass.getClass();
    __CLR4_4_1398398lck0y8rs.R.inc(4233);assertFalse(strategy.shouldSkipClass(clazz));
  }finally{__CLR4_4_1398398lck0y8rs.R.flushNeeded();}}

  public void testIncludeStaticNestedClassField() throws Exception {__CLR4_4_1398398lck0y8rs.R.globalSliceStart(getClass().getName(),4234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r8s3t039m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1398398lck0y8rs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1398398lck0y8rs.R.globalSliceEnd(getClass().getName(),"com.google.gson.InnerClassExclusionStrategyTest.testIncludeStaticNestedClassField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r8s3t039m() throws Exception{try{__CLR4_4_1398398lck0y8rs.R.inc(4234);
    __CLR4_4_1398398lck0y8rs.R.inc(4235);Field f = getClass().getField("staticNestedClass");
    __CLR4_4_1398398lck0y8rs.R.inc(4236);assertFalse(strategy.shouldSkipField(new FieldAttributes(getClass(), f)));
  }finally{__CLR4_4_1398398lck0y8rs.R.flushNeeded();}}

  class InnerClass {
  }

  static class StaticNestedClass {
  }
}
