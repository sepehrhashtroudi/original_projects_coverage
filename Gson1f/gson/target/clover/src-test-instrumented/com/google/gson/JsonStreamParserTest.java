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

import junit.framework.TestCase;

import java.util.NoSuchElementException;

/**
 * Unit tests for {@link JsonStreamParser}
 * 
 * @author Inderjeet Singh
 */
public class JsonStreamParserTest extends TestCase {static class __CLR4_4_13i13i1lck0y8th{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4567,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private JsonStreamParser parser;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13i13i1lck0y8th.R.inc(4537);
    __CLR4_4_13i13i1lck0y8th.R.inc(4538);super.setUp();
    __CLR4_4_13i13i1lck0y8th.R.inc(4539);parser = new JsonStreamParser("'one' 'two'");
  }finally{__CLR4_4_13i13i1lck0y8th.R.flushNeeded();}}

  public void testParseTwoStrings() {__CLR4_4_13i13i1lck0y8th.R.globalSliceStart(getClass().getName(),4540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195uwgy3i4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13i13i1lck0y8th.R.rethrow($CLV_t2$);}finally{__CLR4_4_13i13i1lck0y8th.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonStreamParserTest.testParseTwoStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195uwgy3i4(){try{__CLR4_4_13i13i1lck0y8th.R.inc(4540);
    __CLR4_4_13i13i1lck0y8th.R.inc(4541);String actualOne = parser.next().getAsString();
    __CLR4_4_13i13i1lck0y8th.R.inc(4542);assertEquals("one", actualOne);
    __CLR4_4_13i13i1lck0y8th.R.inc(4543);String actualTwo = parser.next().getAsString();
    __CLR4_4_13i13i1lck0y8th.R.inc(4544);assertEquals("two", actualTwo);
  }finally{__CLR4_4_13i13i1lck0y8th.R.flushNeeded();}}

  public void testIterator() {__CLR4_4_13i13i1lck0y8th.R.globalSliceStart(getClass().getName(),4545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9uicn3i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13i13i1lck0y8th.R.rethrow($CLV_t2$);}finally{__CLR4_4_13i13i1lck0y8th.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonStreamParserTest.testIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9uicn3i9(){try{__CLR4_4_13i13i1lck0y8th.R.inc(4545);
    __CLR4_4_13i13i1lck0y8th.R.inc(4546);assertTrue(parser.hasNext());
    __CLR4_4_13i13i1lck0y8th.R.inc(4547);assertEquals("one", parser.next().getAsString());
    __CLR4_4_13i13i1lck0y8th.R.inc(4548);assertTrue(parser.hasNext());
    __CLR4_4_13i13i1lck0y8th.R.inc(4549);assertEquals("two", parser.next().getAsString());
    __CLR4_4_13i13i1lck0y8th.R.inc(4550);assertFalse(parser.hasNext());
  }finally{__CLR4_4_13i13i1lck0y8th.R.flushNeeded();}}

  public void testNoSideEffectForHasNext() throws Exception {__CLR4_4_13i13i1lck0y8th.R.globalSliceStart(getClass().getName(),4551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1henqti3if();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13i13i1lck0y8th.R.rethrow($CLV_t2$);}finally{__CLR4_4_13i13i1lck0y8th.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonStreamParserTest.testNoSideEffectForHasNext",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1henqti3if() throws Exception{try{__CLR4_4_13i13i1lck0y8th.R.inc(4551);
    __CLR4_4_13i13i1lck0y8th.R.inc(4552);assertTrue(parser.hasNext());
    __CLR4_4_13i13i1lck0y8th.R.inc(4553);assertTrue(parser.hasNext());
    __CLR4_4_13i13i1lck0y8th.R.inc(4554);assertTrue(parser.hasNext());
    __CLR4_4_13i13i1lck0y8th.R.inc(4555);assertEquals("one", parser.next().getAsString());
    
    __CLR4_4_13i13i1lck0y8th.R.inc(4556);assertTrue(parser.hasNext());
    __CLR4_4_13i13i1lck0y8th.R.inc(4557);assertTrue(parser.hasNext());
    __CLR4_4_13i13i1lck0y8th.R.inc(4558);assertEquals("two", parser.next().getAsString());
    
    __CLR4_4_13i13i1lck0y8th.R.inc(4559);assertFalse(parser.hasNext());
    __CLR4_4_13i13i1lck0y8th.R.inc(4560);assertFalse(parser.hasNext());
  }finally{__CLR4_4_13i13i1lck0y8th.R.flushNeeded();}}

  public void testCallingNextBeyondAvailableInput() {__CLR4_4_13i13i1lck0y8th.R.globalSliceStart(getClass().getName(),4561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ijd2u43ip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13i13i1lck0y8th.R.rethrow($CLV_t2$);}finally{__CLR4_4_13i13i1lck0y8th.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonStreamParserTest.testCallingNextBeyondAvailableInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ijd2u43ip(){try{__CLR4_4_13i13i1lck0y8th.R.inc(4561);
    __CLR4_4_13i13i1lck0y8th.R.inc(4562);parser.next();
    __CLR4_4_13i13i1lck0y8th.R.inc(4563);parser.next();
    __CLR4_4_13i13i1lck0y8th.R.inc(4564);try {
      __CLR4_4_13i13i1lck0y8th.R.inc(4565);parser.next();
      __CLR4_4_13i13i1lck0y8th.R.inc(4566);fail("Parser should not go beyond available input");
    } catch (NoSuchElementException expected) {
    }
  }finally{__CLR4_4_13i13i1lck0y8th.R.flushNeeded();}}
}
