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

package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.common.TestTypes.Base;
import com.google.gson.common.TestTypes.ClassWithBaseField;
import com.google.gson.common.TestTypes.Sub;

import junit.framework.TestCase;

import java.lang.reflect.Type;

/**
 * Functional Test exercising custom serialization only.  When test applies to both
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 *
 * @author Inderjeet Singh
 */
public class InstanceCreatorTest extends TestCase {static class __CLR4_4_15g65g6lck0y95c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,7087,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testInstanceCreatorReturnsBaseType() {__CLR4_4_15g65g6lck0y95c.R.globalSliceStart(getClass().getName(),7062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8yu7k5g6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15g65g6lck0y95c.R.rethrow($CLV_t2$);}finally{__CLR4_4_15g65g6lck0y95c.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InstanceCreatorTest.testInstanceCreatorReturnsBaseType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8yu7k5g6(){try{__CLR4_4_15g65g6lck0y95c.R.inc(7062);
    __CLR4_4_15g65g6lck0y95c.R.inc(7063);Gson gson = new GsonBuilder()
      .registerTypeAdapter(Base.class, new InstanceCreator<Base>() {
       public Base createInstance(Type type) {try{__CLR4_4_15g65g6lck0y95c.R.inc(7064);
         __CLR4_4_15g65g6lck0y95c.R.inc(7065);return new Base();
       }finally{__CLR4_4_15g65g6lck0y95c.R.flushNeeded();}}
      })
      .create();
    __CLR4_4_15g65g6lck0y95c.R.inc(7066);String json = "{baseName:'BaseRevised',subName:'Sub'}";
    __CLR4_4_15g65g6lck0y95c.R.inc(7067);Base base = gson.fromJson(json, Base.class);
    __CLR4_4_15g65g6lck0y95c.R.inc(7068);assertEquals("BaseRevised", base.baseName);
  }finally{__CLR4_4_15g65g6lck0y95c.R.flushNeeded();}}

  public void testInstanceCreatorReturnsSubTypeForTopLevelObject() {__CLR4_4_15g65g6lck0y95c.R.globalSliceStart(getClass().getName(),7069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z51em5gd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15g65g6lck0y95c.R.rethrow($CLV_t2$);}finally{__CLR4_4_15g65g6lck0y95c.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InstanceCreatorTest.testInstanceCreatorReturnsSubTypeForTopLevelObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z51em5gd(){try{__CLR4_4_15g65g6lck0y95c.R.inc(7069);
    __CLR4_4_15g65g6lck0y95c.R.inc(7070);Gson gson = new GsonBuilder()
    .registerTypeAdapter(Base.class, new InstanceCreator<Base>() {
      public Base createInstance(Type type) {try{__CLR4_4_15g65g6lck0y95c.R.inc(7071);
        __CLR4_4_15g65g6lck0y95c.R.inc(7072);return new Sub();
      }finally{__CLR4_4_15g65g6lck0y95c.R.flushNeeded();}}
    })
    .create();

    __CLR4_4_15g65g6lck0y95c.R.inc(7073);String json = "{baseName:'Base',subName:'SubRevised'}";
    __CLR4_4_15g65g6lck0y95c.R.inc(7074);Base base = gson.fromJson(json, Base.class);
    __CLR4_4_15g65g6lck0y95c.R.inc(7075);assertTrue(base instanceof Sub);

    __CLR4_4_15g65g6lck0y95c.R.inc(7076);Sub sub = (Sub) base;
    __CLR4_4_15g65g6lck0y95c.R.inc(7077);assertFalse("SubRevised".equals(sub.subName));
    __CLR4_4_15g65g6lck0y95c.R.inc(7078);assertEquals(Sub.SUB_NAME, sub.subName);
  }finally{__CLR4_4_15g65g6lck0y95c.R.flushNeeded();}}

  public void testInstanceCreatorReturnsSubTypeForField() {__CLR4_4_15g65g6lck0y95c.R.globalSliceStart(getClass().getName(),7079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jr3uz85gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15g65g6lck0y95c.R.rethrow($CLV_t2$);}finally{__CLR4_4_15g65g6lck0y95c.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InstanceCreatorTest.testInstanceCreatorReturnsSubTypeForField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jr3uz85gn(){try{__CLR4_4_15g65g6lck0y95c.R.inc(7079);
    __CLR4_4_15g65g6lck0y95c.R.inc(7080);Gson gson = new GsonBuilder()
    .registerTypeAdapter(Base.class, new InstanceCreator<Base>() {
      public Base createInstance(Type type) {try{__CLR4_4_15g65g6lck0y95c.R.inc(7081);
        __CLR4_4_15g65g6lck0y95c.R.inc(7082);return new Sub();
      }finally{__CLR4_4_15g65g6lck0y95c.R.flushNeeded();}}
    })
    .create();
    __CLR4_4_15g65g6lck0y95c.R.inc(7083);String json = "{base:{baseName:'Base',subName:'SubRevised'}}";
    __CLR4_4_15g65g6lck0y95c.R.inc(7084);ClassWithBaseField target = gson.fromJson(json, ClassWithBaseField.class);
    __CLR4_4_15g65g6lck0y95c.R.inc(7085);assertTrue(target.base instanceof Sub);
    __CLR4_4_15g65g6lck0y95c.R.inc(7086);assertEquals("SubRevised", ((Sub)target.base).subName);
  }finally{__CLR4_4_15g65g6lck0y95c.R.flushNeeded();}}
}
