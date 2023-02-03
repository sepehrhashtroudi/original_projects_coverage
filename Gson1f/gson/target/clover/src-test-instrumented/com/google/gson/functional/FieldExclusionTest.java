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

import junit.framework.TestCase;

/**
 * Performs some functional testing to ensure GSON infrastructure properly serializes/deserializes
 * fields that either should or should not be included in the output based on the GSON
 * configuration.
 *
 * @author Joel Leitch
 */
public class FieldExclusionTest extends TestCase {static class __CLR4_4_15b25b2lck0y94o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final String VALUE = "blah_1234";

  private Outer outer;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_15b25b2lck0y94o.R.inc(6878);
    __CLR4_4_15b25b2lck0y94o.R.inc(6879);super.setUp();
    __CLR4_4_15b25b2lck0y94o.R.inc(6880);outer = new Outer();
  }finally{__CLR4_4_15b25b2lck0y94o.R.flushNeeded();}}
  
  public void testDefaultInnerClassExclusion() throws Exception {__CLR4_4_15b25b2lck0y94o.R.globalSliceStart(getClass().getName(),6881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q56arg5b5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15b25b2lck0y94o.R.rethrow($CLV_t2$);}finally{__CLR4_4_15b25b2lck0y94o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.FieldExclusionTest.testDefaultInnerClassExclusion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q56arg5b5() throws Exception{try{__CLR4_4_15b25b2lck0y94o.R.inc(6881);
    __CLR4_4_15b25b2lck0y94o.R.inc(6882);Gson gson = new Gson();
    __CLR4_4_15b25b2lck0y94o.R.inc(6883);Outer.Inner target = outer.new Inner(VALUE);
    __CLR4_4_15b25b2lck0y94o.R.inc(6884);String result = gson.toJson(target);
    __CLR4_4_15b25b2lck0y94o.R.inc(6885);assertEquals(target.toJson(), result);
    
    __CLR4_4_15b25b2lck0y94o.R.inc(6886);gson = new GsonBuilder().create();
    __CLR4_4_15b25b2lck0y94o.R.inc(6887);target = outer.new Inner(VALUE);
    __CLR4_4_15b25b2lck0y94o.R.inc(6888);result = gson.toJson(target);
    __CLR4_4_15b25b2lck0y94o.R.inc(6889);assertEquals(target.toJson(), result);
  }finally{__CLR4_4_15b25b2lck0y94o.R.flushNeeded();}}
  
  public void testInnerClassExclusion() throws Exception {__CLR4_4_15b25b2lck0y94o.R.globalSliceStart(getClass().getName(),6890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q4h6bl5be();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15b25b2lck0y94o.R.rethrow($CLV_t2$);}finally{__CLR4_4_15b25b2lck0y94o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.FieldExclusionTest.testInnerClassExclusion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q4h6bl5be() throws Exception{try{__CLR4_4_15b25b2lck0y94o.R.inc(6890);
    __CLR4_4_15b25b2lck0y94o.R.inc(6891);Gson gson = new GsonBuilder().disableInnerClassSerialization().create();
    __CLR4_4_15b25b2lck0y94o.R.inc(6892);Outer.Inner target = outer.new Inner(VALUE);
    __CLR4_4_15b25b2lck0y94o.R.inc(6893);String result = gson.toJson(target);
    __CLR4_4_15b25b2lck0y94o.R.inc(6894);assertEquals("", result);
  }finally{__CLR4_4_15b25b2lck0y94o.R.flushNeeded();}}
  
  public void testDefaultNestedStaticClassIncluded() throws Exception {__CLR4_4_15b25b2lck0y94o.R.globalSliceStart(getClass().getName(),6895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tf3w075bj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15b25b2lck0y94o.R.rethrow($CLV_t2$);}finally{__CLR4_4_15b25b2lck0y94o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.FieldExclusionTest.testDefaultNestedStaticClassIncluded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tf3w075bj() throws Exception{try{__CLR4_4_15b25b2lck0y94o.R.inc(6895);
    __CLR4_4_15b25b2lck0y94o.R.inc(6896);Gson gson = new Gson();
    __CLR4_4_15b25b2lck0y94o.R.inc(6897);Outer.Inner target = outer.new Inner(VALUE);
    __CLR4_4_15b25b2lck0y94o.R.inc(6898);String result = gson.toJson(target);
    __CLR4_4_15b25b2lck0y94o.R.inc(6899);assertEquals(target.toJson(), result);
    
    __CLR4_4_15b25b2lck0y94o.R.inc(6900);gson = new GsonBuilder().create();
    __CLR4_4_15b25b2lck0y94o.R.inc(6901);target = outer.new Inner(VALUE);
    __CLR4_4_15b25b2lck0y94o.R.inc(6902);result = gson.toJson(target);
    __CLR4_4_15b25b2lck0y94o.R.inc(6903);assertEquals(target.toJson(), result);
  }finally{__CLR4_4_15b25b2lck0y94o.R.flushNeeded();}}
  
  private static class Outer {
    private class Inner extends NestedClass {
      public Inner(String value) {
        super(value);__CLR4_4_15b25b2lck0y94o.R.inc(6905);try{__CLR4_4_15b25b2lck0y94o.R.inc(6904);
      }finally{__CLR4_4_15b25b2lck0y94o.R.flushNeeded();}}
    }
        
  }
  
  private static class NestedClass {
    private final String value;
    public NestedClass(String value) {try{__CLR4_4_15b25b2lck0y94o.R.inc(6906);
      __CLR4_4_15b25b2lck0y94o.R.inc(6907);this.value = value;
    }finally{__CLR4_4_15b25b2lck0y94o.R.flushNeeded();}}
    
    public String toJson() {try{__CLR4_4_15b25b2lck0y94o.R.inc(6908);
      __CLR4_4_15b25b2lck0y94o.R.inc(6909);return "{\"value\":\"" + value + "\"}";
    }finally{__CLR4_4_15b25b2lck0y94o.R.flushNeeded();}}
  }
}
