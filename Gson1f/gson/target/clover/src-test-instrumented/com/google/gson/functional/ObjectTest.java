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
import com.google.gson.InstanceCreator;
import com.google.gson.JsonObject;
import com.google.gson.common.TestTypes.ArrayOfObjects;
import com.google.gson.common.TestTypes.BagOfPrimitiveWrappers;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithArray;
import com.google.gson.common.TestTypes.ClassWithNoFields;
import com.google.gson.common.TestTypes.ClassWithObjects;
import com.google.gson.common.TestTypes.ClassWithTransientFields;
import com.google.gson.common.TestTypes.Nested;
import com.google.gson.common.TestTypes.PrimitiveArray;

import java.util.List;
import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Functional tests for Json serialization and deserialization of regular classes.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ObjectTest extends TestCase {static class __CLR4_4_15tu5tulck0y97z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,7780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_15tu5tulck0y97z.R.inc(7554);
    __CLR4_4_15tu5tulck0y97z.R.inc(7555);super.setUp();
    __CLR4_4_15tu5tulck0y97z.R.inc(7556);gson = new Gson();
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testJsonInSingleQuotesDeserialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mztnrc5tx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testJsonInSingleQuotesDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mztnrc5tx(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7557);
    __CLR4_4_15tu5tulck0y97z.R.inc(7558);String json = "{'stringValue':'no message','intValue':10,'longValue':20}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7559);BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7560);assertEquals("no message", target.stringValue);
    __CLR4_4_15tu5tulck0y97z.R.inc(7561);assertEquals(10, target.intValue);
    __CLR4_4_15tu5tulck0y97z.R.inc(7562);assertEquals(20, target.longValue);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
  
  public void testJsonInMixedQuotesDeserialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fo7ehp5u3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testJsonInMixedQuotesDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fo7ehp5u3(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7563);
    __CLR4_4_15tu5tulck0y97z.R.inc(7564);String json = "{\"stringValue\":'no message','intValue':10,'longValue':20}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7565);BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7566);assertEquals("no message", target.stringValue);
    __CLR4_4_15tu5tulck0y97z.R.inc(7567);assertEquals(10, target.intValue);
    __CLR4_4_15tu5tulck0y97z.R.inc(7568);assertEquals(20, target.longValue);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
  
  public void testBagOfPrimitivesSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i3ni5u9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testBagOfPrimitivesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i3ni5u9() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7569);
    __CLR4_4_15tu5tulck0y97z.R.inc(7570);BagOfPrimitives target = new BagOfPrimitives(10, 20, false, "stringValue");
    __CLR4_4_15tu5tulck0y97z.R.inc(7571);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testBagOfPrimitivesDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fq0i2r5uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testBagOfPrimitivesDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fq0i2r5uc() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7572);
    __CLR4_4_15tu5tulck0y97z.R.inc(7573);BagOfPrimitives src = new BagOfPrimitives(10, 20, false, "stringValue");
    __CLR4_4_15tu5tulck0y97z.R.inc(7574);String json = src.getExpectedJson();
    __CLR4_4_15tu5tulck0y97z.R.inc(7575);BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7576);assertEquals(json, target.getExpectedJson());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testBagOfPrimitiveWrappersSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171wn6l5uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testBagOfPrimitiveWrappersSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171wn6l5uh() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7577);
    __CLR4_4_15tu5tulck0y97z.R.inc(7578);BagOfPrimitiveWrappers target = new BagOfPrimitiveWrappers(10L, 20, false);
    __CLR4_4_15tu5tulck0y97z.R.inc(7579);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testBagOfPrimitiveWrappersDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1tsm45uk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testBagOfPrimitiveWrappersDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1tsm45uk() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7580);
    __CLR4_4_15tu5tulck0y97z.R.inc(7581);BagOfPrimitiveWrappers target = new BagOfPrimitiveWrappers(10L, 20, false);
    __CLR4_4_15tu5tulck0y97z.R.inc(7582);String jsonString = target.getExpectedJson();
    __CLR4_4_15tu5tulck0y97z.R.inc(7583);target = gson.fromJson(jsonString, BagOfPrimitiveWrappers.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7584);assertEquals(jsonString, target.getExpectedJson());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testClassWithTransientFieldsSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqv5ds5up();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testClassWithTransientFieldsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqv5ds5up() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7585);
    __CLR4_4_15tu5tulck0y97z.R.inc(7586);ClassWithTransientFields<Long> target = new ClassWithTransientFields<Long>(1L);
    __CLR4_4_15tu5tulck0y97z.R.inc(7587);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  @SuppressWarnings("rawtypes")
  public void testClassWithTransientFieldsDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12yet4v5us();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testClassWithTransientFieldsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12yet4v5us() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7588);
    __CLR4_4_15tu5tulck0y97z.R.inc(7589);String json = "{\"longValue\":[1]}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7590);ClassWithTransientFields target = gson.fromJson(json, ClassWithTransientFields.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7591);assertEquals(json, target.getExpectedJson());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  @SuppressWarnings("rawtypes")
  public void testClassWithTransientFieldsDeserializationTransientFieldsPassedInJsonAreIgnored()
      throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmxhn75uw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testClassWithTransientFieldsDeserializationTransientFieldsPassedInJsonAreIgnored",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmxhn75uw() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7592);
    __CLR4_4_15tu5tulck0y97z.R.inc(7593);String json = "{\"transientLongValue\":1,\"longValue\":[1]}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7594);ClassWithTransientFields target = gson.fromJson(json, ClassWithTransientFields.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7595);assertFalse(target.transientLongValue != 1);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testClassWithNoFieldsSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sot0sv5v0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testClassWithNoFieldsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sot0sv5v0() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7596);
    __CLR4_4_15tu5tulck0y97z.R.inc(7597);assertEquals("{}", gson.toJson(new ClassWithNoFields()));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testClassWithNoFieldsDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3wyhc5v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testClassWithNoFieldsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3wyhc5v2() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7598);
    __CLR4_4_15tu5tulck0y97z.R.inc(7599);String json = "{}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7600);ClassWithNoFields target = gson.fromJson(json, ClassWithNoFields.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7601);ClassWithNoFields expected = new ClassWithNoFields();
    __CLR4_4_15tu5tulck0y97z.R.inc(7602);assertEquals(expected, target);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testNestedSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dwi4ia5v7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNestedSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dwi4ia5v7() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7603);
    __CLR4_4_15tu5tulck0y97z.R.inc(7604);Nested target = new Nested(new BagOfPrimitives(10, 20, false, "stringValue"),
       new BagOfPrimitives(30, 40, true, "stringValue"));
    __CLR4_4_15tu5tulck0y97z.R.inc(7605);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testNestedDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rjv0z5va();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNestedDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rjv0z5va() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7606);
    __CLR4_4_15tu5tulck0y97z.R.inc(7607);String json = "{\"primitive1\":{\"longValue\":10,\"intValue\":20,\"booleanValue\":false,"
        + "\"stringValue\":\"stringValue\"},\"primitive2\":{\"longValue\":30,\"intValue\":40,"
        + "\"booleanValue\":true,\"stringValue\":\"stringValue\"}}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7608);Nested target = gson.fromJson(json, Nested.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7609);assertEquals(json, target.getExpectedJson());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
  public void testNullSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1va0swy5ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNullSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1va0swy5ve() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7610);
    __CLR4_4_15tu5tulck0y97z.R.inc(7611);assertEquals("", gson.toJson(null));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testEmptyStringDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbc7065vg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testEmptyStringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbc7065vg() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7612);
    __CLR4_4_15tu5tulck0y97z.R.inc(7613);Object object = gson.fromJson("", Object.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7614);assertNull(object);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testNullDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdoicj5vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNullDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdoicj5vj() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7615);
    __CLR4_4_15tu5tulck0y97z.R.inc(7616);String myNullObject = null;
    __CLR4_4_15tu5tulck0y97z.R.inc(7617);Object object = gson.fromJson(myNullObject, Object.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7618);assertNull(object);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testNullFieldsSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eweojf5vn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNullFieldsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eweojf5vn() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7619);
    __CLR4_4_15tu5tulck0y97z.R.inc(7620);Nested target = new Nested(new BagOfPrimitives(10, 20, false, "stringValue"), null);
    __CLR4_4_15tu5tulck0y97z.R.inc(7621);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testNullFieldsDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7y6845vq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNullFieldsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7y6845vq() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7622);
    __CLR4_4_15tu5tulck0y97z.R.inc(7623);String json = "{\"primitive1\":{\"longValue\":10,\"intValue\":20,\"booleanValue\":false"
        + ",\"stringValue\":\"stringValue\"}}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7624);Nested target = gson.fromJson(json, Nested.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7625);assertEquals(json, target.getExpectedJson());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testArrayOfObjectsSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bce1dt5vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testArrayOfObjectsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bce1dt5vu() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7626);
    __CLR4_4_15tu5tulck0y97z.R.inc(7627);ArrayOfObjects target = new ArrayOfObjects();
    __CLR4_4_15tu5tulck0y97z.R.inc(7628);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testArrayOfObjectsDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3mou85vx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testArrayOfObjectsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3mou85vx() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7629);
    __CLR4_4_15tu5tulck0y97z.R.inc(7630);String json = new ArrayOfObjects().getExpectedJson();
    __CLR4_4_15tu5tulck0y97z.R.inc(7631);ArrayOfObjects target = gson.fromJson(json, ArrayOfObjects.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7632);assertEquals(json, target.getExpectedJson());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testArrayOfArraysSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r25rtr5w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testArrayOfArraysSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r25rtr5w1() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7633);
    __CLR4_4_15tu5tulck0y97z.R.inc(7634);ArrayOfArrays target = new ArrayOfArrays();
    __CLR4_4_15tu5tulck0y97z.R.inc(7635);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testArrayOfArraysDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fzvq65w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testArrayOfArraysDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fzvq65w4() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7636);
    __CLR4_4_15tu5tulck0y97z.R.inc(7637);String json = new ArrayOfArrays().getExpectedJson();
    __CLR4_4_15tu5tulck0y97z.R.inc(7638);ArrayOfArrays target = gson.fromJson(json, ArrayOfArrays.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7639);assertEquals(json, target.getExpectedJson());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testArrayOfObjectsAsFields() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5lh485w8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testArrayOfObjectsAsFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5lh485w8() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7640);
    __CLR4_4_15tu5tulck0y97z.R.inc(7641);ClassWithObjects classWithObjects = new ClassWithObjects();
    __CLR4_4_15tu5tulck0y97z.R.inc(7642);BagOfPrimitives bagOfPrimitives = new BagOfPrimitives();
    __CLR4_4_15tu5tulck0y97z.R.inc(7643);String stringValue = "someStringValueInArray";
    __CLR4_4_15tu5tulck0y97z.R.inc(7644);String classWithObjectsJson = gson.toJson(classWithObjects);
    __CLR4_4_15tu5tulck0y97z.R.inc(7645);String bagOfPrimitivesJson = gson.toJson(bagOfPrimitives);
    
    __CLR4_4_15tu5tulck0y97z.R.inc(7646);ClassWithArray classWithArray = new ClassWithArray(
        new Object[] { stringValue, classWithObjects, bagOfPrimitives });
    __CLR4_4_15tu5tulck0y97z.R.inc(7647);String json = gson.toJson(classWithArray);

    __CLR4_4_15tu5tulck0y97z.R.inc(7648);assertTrue(json.contains(classWithObjectsJson));
    __CLR4_4_15tu5tulck0y97z.R.inc(7649);assertTrue(json.contains(bagOfPrimitivesJson));
    __CLR4_4_15tu5tulck0y97z.R.inc(7650);assertTrue(json.contains("\"" + stringValue + "\""));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  /**
   * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
   */
  public void testNullArraysDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v118j5wj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNullArraysDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v118j5wj() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7651);
    __CLR4_4_15tu5tulck0y97z.R.inc(7652);String json = "{\"array\": null}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7653);ClassWithArray target = gson.fromJson(json, ClassWithArray.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7654);assertNull(target.array);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  /**
   * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
   */
  public void testNullObjectFieldsDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wlk28r5wn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNullObjectFieldsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wlk28r5wn() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7655);
    __CLR4_4_15tu5tulck0y97z.R.inc(7656);String json = "{\"bag\": null}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7657);ClassWithObjects target = gson.fromJson(json, ClassWithObjects.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7658);assertNull(target.bag);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testEmptyCollectionInAnObjectDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e194lo5wr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testEmptyCollectionInAnObjectDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e194lo5wr() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7659);
    __CLR4_4_15tu5tulck0y97z.R.inc(7660);String json = "{\"children\":[]}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7661);ClassWithCollectionField target = gson.fromJson(json, ClassWithCollectionField.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7662);assertNotNull(target);
    __CLR4_4_15tu5tulck0y97z.R.inc(7663);assertTrue(target.children.isEmpty());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  private static class ClassWithCollectionField {
    Collection<String> children = new ArrayList<String>();
  }

  public void testPrimitiveArrayInAnObjectDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ug6gv5ww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testPrimitiveArrayInAnObjectDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ug6gv5ww() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7664);
    __CLR4_4_15tu5tulck0y97z.R.inc(7665);String json = "{\"longArray\":[0,1,2,3,4,5,6,7,8,9]}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7666);PrimitiveArray target = gson.fromJson(json, PrimitiveArray.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7667);assertEquals(json, target.getExpectedJson());
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  /**
   * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
   */
  public void testNullPrimitiveFieldsDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j8rkj55x0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNullPrimitiveFieldsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j8rkj55x0() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7668);
    __CLR4_4_15tu5tulck0y97z.R.inc(7669);String json = "{\"longValue\":null}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7670);BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7671);assertEquals(BagOfPrimitives.DEFAULT_VALUE, target.longValue);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testEmptyCollectionInAnObjectSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19bwn2l5x4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testEmptyCollectionInAnObjectSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19bwn2l5x4() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7672);
    __CLR4_4_15tu5tulck0y97z.R.inc(7673);ClassWithCollectionField target = new ClassWithCollectionField();
    __CLR4_4_15tu5tulck0y97z.R.inc(7674);assertEquals("{\"children\":[]}", gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testPrivateNoArgConstructorDeserialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obs9j45x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testPrivateNoArgConstructorDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obs9j45x7() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7675);
    __CLR4_4_15tu5tulck0y97z.R.inc(7676);ClassWithPrivateNoArgsConstructor target =
      gson.fromJson("{\"a\":20}", ClassWithPrivateNoArgsConstructor.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7677);assertEquals(20, target.a);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testAnonymousLocalClassesSerialization() throws Exception {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cvvi75xa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testAnonymousLocalClassesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cvvi75xa() throws Exception{try{__CLR4_4_15tu5tulck0y97z.R.inc(7678);
    __CLR4_4_15tu5tulck0y97z.R.inc(7679);assertEquals("", gson.toJson(new ClassWithNoFields() {
      // empty anonymous class
    }));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  public void testPrimitiveArrayFieldSerialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lz19zz5xc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testPrimitiveArrayFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lz19zz5xc(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7680);
    __CLR4_4_15tu5tulck0y97z.R.inc(7681);PrimitiveArray target = new PrimitiveArray(new long[] { 1L, 2L, 3L });
    __CLR4_4_15tu5tulck0y97z.R.inc(7682);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  /**
   * Tests that a class field with type Object can be serialized properly. 
   * See issue 54
   */
  public void testClassWithObjectFieldSerialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfmtig5xf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testClassWithObjectFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfmtig5xf(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7683);
    __CLR4_4_15tu5tulck0y97z.R.inc(7684);ClassWithObjectField obj = new ClassWithObjectField();
    __CLR4_4_15tu5tulck0y97z.R.inc(7685);obj.member = "abc";
    __CLR4_4_15tu5tulck0y97z.R.inc(7686);String json = gson.toJson(obj);
    __CLR4_4_15tu5tulck0y97z.R.inc(7687);assertTrue(json.contains("abc"));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  private static class ClassWithObjectField {
    @SuppressWarnings("unused")
    Object member;
  }
  
  public void testInnerClassSerialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191j2g35xk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testInnerClassSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191j2g35xk(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7688);    
    __CLR4_4_15tu5tulck0y97z.R.inc(7689);Parent p = new Parent();
    __CLR4_4_15tu5tulck0y97z.R.inc(7690);Parent.Child c = p.new Child();
    __CLR4_4_15tu5tulck0y97z.R.inc(7691);String json = gson.toJson(c);
    __CLR4_4_15tu5tulck0y97z.R.inc(7692);assertTrue(json.contains("value2"));
    __CLR4_4_15tu5tulck0y97z.R.inc(7693);assertFalse(json.contains("value1"));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
   
  public void testInnerClassDeserialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5drvm5xq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testInnerClassDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5drvm5xq(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7694);
    __CLR4_4_15tu5tulck0y97z.R.inc(7695);final Parent p = new Parent();
    __CLR4_4_15tu5tulck0y97z.R.inc(7696);Gson gson = new GsonBuilder().registerTypeAdapter(
        Parent.Child.class, new InstanceCreator<Parent.Child>() {
      public Parent.Child createInstance(Type type) {try{__CLR4_4_15tu5tulck0y97z.R.inc(7697);
        __CLR4_4_15tu5tulck0y97z.R.inc(7698);return p.new Child();
      }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}      
    }).create();
    __CLR4_4_15tu5tulck0y97z.R.inc(7699);String json = "{'value2':3}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7700);Parent.Child c = gson.fromJson(json, Parent.Child.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7701);assertEquals(3, c.value2);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
   
  private static class Parent {
    @SuppressWarnings("unused")
    int value1 = 1;
    private class Child {
      int value2 = 2;
    }
  }

  private static class ArrayOfArrays {
    private final BagOfPrimitives[][] elements;
    public ArrayOfArrays() {try{__CLR4_4_15tu5tulck0y97z.R.inc(7702);
      __CLR4_4_15tu5tulck0y97z.R.inc(7703);elements = new BagOfPrimitives[3][2];
      __CLR4_4_15tu5tulck0y97z.R.inc(7704);for (int i = 0; (((i < elements.length)&&(__CLR4_4_15tu5tulck0y97z.R.iget(7705)!=0|true))||(__CLR4_4_15tu5tulck0y97z.R.iget(7706)==0&false)); ++i) {{
        __CLR4_4_15tu5tulck0y97z.R.inc(7707);BagOfPrimitives[] row = elements[i];
        __CLR4_4_15tu5tulck0y97z.R.inc(7708);for (int j = 0; (((j < row.length)&&(__CLR4_4_15tu5tulck0y97z.R.iget(7709)!=0|true))||(__CLR4_4_15tu5tulck0y97z.R.iget(7710)==0&false)); ++j) {{
          __CLR4_4_15tu5tulck0y97z.R.inc(7711);row[j] = new BagOfPrimitives(i+j, i*j, false, i+"_"+j);
        }
      }}
    }}finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
    public String getExpectedJson() {try{__CLR4_4_15tu5tulck0y97z.R.inc(7712);
      __CLR4_4_15tu5tulck0y97z.R.inc(7713);StringBuilder sb = new StringBuilder("{\"elements\":[");
      __CLR4_4_15tu5tulck0y97z.R.inc(7714);boolean first = true;
      __CLR4_4_15tu5tulck0y97z.R.inc(7715);for (BagOfPrimitives[] row : elements) {{
        __CLR4_4_15tu5tulck0y97z.R.inc(7716);if ((((first)&&(__CLR4_4_15tu5tulck0y97z.R.iget(7717)!=0|true))||(__CLR4_4_15tu5tulck0y97z.R.iget(7718)==0&false))) {{
          __CLR4_4_15tu5tulck0y97z.R.inc(7719);first = false;
        } }else {{
          __CLR4_4_15tu5tulck0y97z.R.inc(7720);sb.append(",");
        }
        }__CLR4_4_15tu5tulck0y97z.R.inc(7721);boolean firstOfRow = true;
        __CLR4_4_15tu5tulck0y97z.R.inc(7722);sb.append("[");
        __CLR4_4_15tu5tulck0y97z.R.inc(7723);for (BagOfPrimitives element : row) {{
          __CLR4_4_15tu5tulck0y97z.R.inc(7724);if ((((firstOfRow)&&(__CLR4_4_15tu5tulck0y97z.R.iget(7725)!=0|true))||(__CLR4_4_15tu5tulck0y97z.R.iget(7726)==0&false))) {{
            __CLR4_4_15tu5tulck0y97z.R.inc(7727);firstOfRow = false;
          } }else {{
            __CLR4_4_15tu5tulck0y97z.R.inc(7728);sb.append(",");
          }
          }__CLR4_4_15tu5tulck0y97z.R.inc(7729);sb.append(element.getExpectedJson());
        }
        }__CLR4_4_15tu5tulck0y97z.R.inc(7730);sb.append("]");
      }
      }__CLR4_4_15tu5tulck0y97z.R.inc(7731);sb.append("]}");
      __CLR4_4_15tu5tulck0y97z.R.inc(7732);return sb.toString();
    }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
  }

  private static class ClassWithPrivateNoArgsConstructor {
    public int a;
    private ClassWithPrivateNoArgsConstructor() {try{__CLR4_4_15tu5tulck0y97z.R.inc(7733);
      __CLR4_4_15tu5tulck0y97z.R.inc(7734);a = 10;
    }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
  }
  
  /**
   * In response to Issue 41 http://code.google.com/p/google-gson/issues/detail?id=41
   */
  public void testObjectFieldNamesWithoutQuotesDeserialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwxvue5yv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testObjectFieldNamesWithoutQuotesDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwxvue5yv(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7735);
    __CLR4_4_15tu5tulck0y97z.R.inc(7736);String json = "{longValue:1,'booleanValue':true,\"stringValue\":'bar'}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7737);BagOfPrimitives bag = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7738);assertEquals(1, bag.longValue);
    __CLR4_4_15tu5tulck0y97z.R.inc(7739);assertTrue(bag.booleanValue);
    __CLR4_4_15tu5tulck0y97z.R.inc(7740);assertEquals("bar", bag.stringValue);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}
  
  public void testStringFieldWithNumberValueDeserialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plu2ff5z1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testStringFieldWithNumberValueDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plu2ff5z1(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7741);
    __CLR4_4_15tu5tulck0y97z.R.inc(7742);String json = "{\"stringValue\":1}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7743);BagOfPrimitives bag = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7744);assertEquals("1", bag.stringValue);
    
    __CLR4_4_15tu5tulck0y97z.R.inc(7745);json = "{\"stringValue\":1.5E+6}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7746);bag = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7747);assertEquals("1.5E+6", bag.stringValue);
    
    __CLR4_4_15tu5tulck0y97z.R.inc(7748);json = "{\"stringValue\":true}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7749);bag = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7750);assertEquals("true", bag.stringValue);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  /**
   * Created to reproduce issue 140
   */
  public void testStringFieldWithEmptyValueSerialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58ira5zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testStringFieldWithEmptyValueSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58ira5zb(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7751);
    __CLR4_4_15tu5tulck0y97z.R.inc(7752);ClassWithEmptyStringFields target = new ClassWithEmptyStringFields();
    __CLR4_4_15tu5tulck0y97z.R.inc(7753);target.a = "5794749";
    __CLR4_4_15tu5tulck0y97z.R.inc(7754);String json = gson.toJson(target);
    __CLR4_4_15tu5tulck0y97z.R.inc(7755);assertTrue(json.contains("\"a\":\"5794749\""));
    __CLR4_4_15tu5tulck0y97z.R.inc(7756);assertTrue(json.contains("\"b\":\"\""));
    __CLR4_4_15tu5tulck0y97z.R.inc(7757);assertTrue(json.contains("\"c\":\"\""));
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  /**
   * Created to reproduce issue 140
   */
  public void testStringFieldWithEmptyValueDeserialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gid8r5zi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testStringFieldWithEmptyValueDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gid8r5zi(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7758);
    __CLR4_4_15tu5tulck0y97z.R.inc(7759);String json = "{a:\"5794749\",b:\"\",c:\"\"}";
    __CLR4_4_15tu5tulck0y97z.R.inc(7760);ClassWithEmptyStringFields target = gson.fromJson(json, ClassWithEmptyStringFields.class);
    __CLR4_4_15tu5tulck0y97z.R.inc(7761);assertEquals("5794749", target.a);
    __CLR4_4_15tu5tulck0y97z.R.inc(7762);assertEquals("", target.b);
    __CLR4_4_15tu5tulck0y97z.R.inc(7763);assertEquals("", target.c);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  private static class ClassWithEmptyStringFields {
    String a = "";
    String b = "";
    String c = "";
  }
  
  public void testJsonObjectSerialization() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vfsda5zo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testJsonObjectSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vfsda5zo(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7764);
    __CLR4_4_15tu5tulck0y97z.R.inc(7765);Gson gson = new GsonBuilder().serializeNulls().create();
    __CLR4_4_15tu5tulck0y97z.R.inc(7766);JsonObject obj = new JsonObject();
    __CLR4_4_15tu5tulck0y97z.R.inc(7767);String json = gson.toJson(obj);
    __CLR4_4_15tu5tulck0y97z.R.inc(7768);assertEquals("{}", json);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  /**
   * Test for issue 215.
   */
  public void testSingletonLists() {__CLR4_4_15tu5tulck0y97z.R.globalSliceStart(getClass().getName(),7769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqk1fn5zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15tu5tulck0y97z.R.rethrow($CLV_t2$);}finally{__CLR4_4_15tu5tulck0y97z.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testSingletonLists",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqk1fn5zt(){try{__CLR4_4_15tu5tulck0y97z.R.inc(7769);
    __CLR4_4_15tu5tulck0y97z.R.inc(7770);Gson gson = new Gson();
    __CLR4_4_15tu5tulck0y97z.R.inc(7771);Product product = new Product();
    __CLR4_4_15tu5tulck0y97z.R.inc(7772);assertEquals("{\"attributes\":[],\"departments\":[]}",
        gson.toJson(product));
    __CLR4_4_15tu5tulck0y97z.R.inc(7773);gson.fromJson(gson.toJson(product), Product.class);

    __CLR4_4_15tu5tulck0y97z.R.inc(7774);product.departments.add(new Department());
    __CLR4_4_15tu5tulck0y97z.R.inc(7775);assertEquals("{\"attributes\":[],\"departments\":[{\"name\":\"abc\",\"code\":\"123\"}]}",
        gson.toJson(product));
    __CLR4_4_15tu5tulck0y97z.R.inc(7776);gson.fromJson(gson.toJson(product), Product.class);

    __CLR4_4_15tu5tulck0y97z.R.inc(7777);product.attributes.add("456");
    __CLR4_4_15tu5tulck0y97z.R.inc(7778);assertEquals("{\"attributes\":[\"456\"],\"departments\":[{\"name\":\"abc\",\"code\":\"123\"}]}",
        gson.toJson(product));
    __CLR4_4_15tu5tulck0y97z.R.inc(7779);gson.fromJson(gson.toJson(product), Product.class);
  }finally{__CLR4_4_15tu5tulck0y97z.R.flushNeeded();}}

  static final class Department {
    public String name = "abc";
    public String code = "123";
  }

  static final class Product {
    private List<String> attributes = new ArrayList<String>();
    private List<Department> departments = new ArrayList<Department>();
  }

}
