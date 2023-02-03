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

import com.google.gson.DefaultTypeAdapters.DefaultDateTypeAdapter;

import junit.framework.TestCase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A simple unit test for the {@link DefaultDateTypeAdapter} class.
 *
 * @author Joel Leitch
 */
public class DefaultDateTypeAdapterTest extends TestCase {static class __CLR4_4_1316316lck0y8pp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,3948,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testDateSerialization() throws Exception {__CLR4_4_1316316lck0y8pp.R.globalSliceStart(getClass().getName(),3930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18030dz316();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1316316lck0y8pp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1316316lck0y8pp.R.globalSliceEnd(getClass().getName(),"com.google.gson.DefaultDateTypeAdapterTest.testDateSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18030dz316() throws Exception{try{__CLR4_4_1316316lck0y8pp.R.inc(3930);
    __CLR4_4_1316316lck0y8pp.R.inc(3931);int dateStyle = DateFormat.LONG;
    __CLR4_4_1316316lck0y8pp.R.inc(3932);DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(dateStyle);
    __CLR4_4_1316316lck0y8pp.R.inc(3933);DateFormat formatter = DateFormat.getDateInstance(dateStyle);
    __CLR4_4_1316316lck0y8pp.R.inc(3934);Date currentDate = new Date();

    __CLR4_4_1316316lck0y8pp.R.inc(3935);String dateString = dateTypeAdapter.serialize(currentDate, Date.class, null).getAsString();
    __CLR4_4_1316316lck0y8pp.R.inc(3936);assertEquals(formatter.format(currentDate), dateString);
  }finally{__CLR4_4_1316316lck0y8pp.R.flushNeeded();}}

  public void testDatePattern() throws Exception {__CLR4_4_1316316lck0y8pp.R.globalSliceStart(getClass().getName(),3937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wsbzd31d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1316316lck0y8pp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1316316lck0y8pp.R.globalSliceEnd(getClass().getName(),"com.google.gson.DefaultDateTypeAdapterTest.testDatePattern",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wsbzd31d() throws Exception{try{__CLR4_4_1316316lck0y8pp.R.inc(3937);
    __CLR4_4_1316316lck0y8pp.R.inc(3938);String pattern = "yyyy-MM-dd";
    __CLR4_4_1316316lck0y8pp.R.inc(3939);DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(pattern);
    __CLR4_4_1316316lck0y8pp.R.inc(3940);DateFormat formatter = new SimpleDateFormat(pattern);
    __CLR4_4_1316316lck0y8pp.R.inc(3941);Date currentDate = new Date();

    __CLR4_4_1316316lck0y8pp.R.inc(3942);String dateString = dateTypeAdapter.serialize(currentDate, Date.class, null).getAsString();
    __CLR4_4_1316316lck0y8pp.R.inc(3943);assertEquals(formatter.format(currentDate), dateString);
  }finally{__CLR4_4_1316316lck0y8pp.R.flushNeeded();}}

  public void testInvalidDatePattern() throws Exception {__CLR4_4_1316316lck0y8pp.R.globalSliceStart(getClass().getName(),3944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eca2jo31k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1316316lck0y8pp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1316316lck0y8pp.R.globalSliceEnd(getClass().getName(),"com.google.gson.DefaultDateTypeAdapterTest.testInvalidDatePattern",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eca2jo31k() throws Exception{try{__CLR4_4_1316316lck0y8pp.R.inc(3944);
    __CLR4_4_1316316lck0y8pp.R.inc(3945);try {
      __CLR4_4_1316316lck0y8pp.R.inc(3946);new DefaultDateTypeAdapter("I am a bad Date pattern....");
      __CLR4_4_1316316lck0y8pp.R.inc(3947);fail("Invalid date pattern should fail.");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_1316316lck0y8pp.R.flushNeeded();}}
}
