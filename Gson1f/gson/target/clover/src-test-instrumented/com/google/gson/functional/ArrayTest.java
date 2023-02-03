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
import com.google.gson.JsonParseException;
import com.google.gson.common.MoreAsserts;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithObjects;
import com.google.gson.common.TestTypes.CrazyLongTypeAdapter;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
/**
 * Functional tests for Json serialization and deserialization of arrays.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ArrayTest extends TestCase {static class __CLR4_4_14c44c4lck0y8z9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14c44c4lck0y8z9.R.inc(5620);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5621);super.setUp();
    __CLR4_4_14c44c4lck0y8z9.R.inc(5622);gson = new Gson();
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testTopLevelArrayOfIntsSerialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wyistg4c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testTopLevelArrayOfIntsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wyistg4c7(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5623);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5624);int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    __CLR4_4_14c44c4lck0y8z9.R.inc(5625);assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testTopLevelArrayOfIntsDeserialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19591gd4ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testTopLevelArrayOfIntsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19591gd4ca(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5626);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5627);int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    __CLR4_4_14c44c4lck0y8z9.R.inc(5628);int[] actual = gson.fromJson("[1,2,3,4,5,6,7,8,9]", int[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5629);MoreAsserts.assertEquals(expected, actual);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testInvalidArrayDeserialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vk3jlq4ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testInvalidArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vk3jlq4ce(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5630);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5631);String json = "[1, 2 3, 4, 5]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5632);try {
      __CLR4_4_14c44c4lck0y8z9.R.inc(5633);gson.fromJson(json, int[].class);
      __CLR4_4_14c44c4lck0y8z9.R.inc(5634);fail("Gson should not deserialize array elements with missing ,");
    } catch (JsonParseException expected) {
    }
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testEmptyArraySerialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14rxvhj4cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testEmptyArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14rxvhj4cj(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5635);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5636);int[] target = {};
    __CLR4_4_14c44c4lck0y8z9.R.inc(5637);assertEquals("[]", gson.toJson(target));
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testEmptyArrayDeserialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o867144cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testEmptyArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o867144cm(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5638);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5639);int[] actualObject = gson.fromJson("[]", int[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5640);assertTrue(actualObject.length == 0);

    __CLR4_4_14c44c4lck0y8z9.R.inc(5641);Integer[] actualObject2 = gson.fromJson("[]", Integer[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5642);assertTrue(actualObject2.length == 0);

    __CLR4_4_14c44c4lck0y8z9.R.inc(5643);actualObject = gson.fromJson("[ ]", int[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5644);assertTrue(actualObject.length == 0);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testNullsInArraySerialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wudwd94ct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wudwd94ct(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5645);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5646);String[] array = {"foo", null, "bar"};
    __CLR4_4_14c44c4lck0y8z9.R.inc(5647);String expected = "[\"foo\",null,\"bar\"]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5648);String json = gson.toJson(array);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5649);assertEquals(expected, json);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testNullsInArrayDeserialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mi4u704cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mi4u704cy(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5650);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5651);String json = "[\"foo\",null,\"bar\"]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5652);String[] expected = {"foo", null, "bar"};
    __CLR4_4_14c44c4lck0y8z9.R.inc(5653);String[] target = gson.fromJson(json, expected.getClass());
    __CLR4_4_14c44c4lck0y8z9.R.inc(5654);for (int i = 0; (((i < expected.length)&&(__CLR4_4_14c44c4lck0y8z9.R.iget(5655)!=0|true))||(__CLR4_4_14c44c4lck0y8z9.R.iget(5656)==0&false)); ++i) {{
      __CLR4_4_14c44c4lck0y8z9.R.inc(5657);assertEquals(expected[i], target[i]);
    }
  }}finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testSingleNullInArraySerialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vr7g4d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testSingleNullInArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vr7g4d6(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5658);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5659);BagOfPrimitives[] array = new BagOfPrimitives[1];
    __CLR4_4_14c44c4lck0y8z9.R.inc(5660);array[0] = null;
    __CLR4_4_14c44c4lck0y8z9.R.inc(5661);String json = gson.toJson(array);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5662);assertEquals("[null]", json);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testSingleNullInArrayDeserialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wzjpf4db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testSingleNullInArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wzjpf4db(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5663);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5664);BagOfPrimitives[] array = gson.fromJson("[null]", BagOfPrimitives[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5665);assertNull(array[0]);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testNullsInArrayWithSerializeNullPropertySetSerialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6cde94de();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArrayWithSerializeNullPropertySetSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6cde94de(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5666);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5667);gson = new GsonBuilder().serializeNulls().create();
    __CLR4_4_14c44c4lck0y8z9.R.inc(5668);String[] array = {"foo", null, "bar"};
    __CLR4_4_14c44c4lck0y8z9.R.inc(5669);String expected = "[\"foo\",null,\"bar\"]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5670);String json = gson.toJson(array);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5671);assertEquals(expected, json);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testArrayOfStringsSerialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18libn14dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfStringsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18libn14dk(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5672);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5673);String[] target = {"Hello", "World"};
    __CLR4_4_14c44c4lck0y8z9.R.inc(5674);assertEquals("[\"Hello\",\"World\"]", gson.toJson(target));
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testArrayOfStringsDeserialization() {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phy71q4dn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfStringsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phy71q4dn(){try{__CLR4_4_14c44c4lck0y8z9.R.inc(5675);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5676);String json = "[\"Hello\",\"World\"]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5677);String[] target = gson.fromJson(json, String[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5678);assertEquals("Hello", target[0]);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5679);assertEquals("World", target[1]);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testSingleStringArraySerialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18cmvmx4ds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testSingleStringArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18cmvmx4ds() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5680);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5681);String[] s = { "hello" };
    __CLR4_4_14c44c4lck0y8z9.R.inc(5682);String output = gson.toJson(s);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5683);assertEquals("[\"hello\"]", output);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testSingleStringArrayDeserialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143vixk4dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testSingleStringArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143vixk4dw() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5684);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5685);String json = "[\"hello\"]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5686);String[] arrayType = gson.fromJson(json, String[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5687);assertEquals(1, arrayType.length);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5688);assertEquals("hello", arrayType[0]);

    __CLR4_4_14c44c4lck0y8z9.R.inc(5689);String type = gson.fromJson(json, String.class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5690);assertEquals("hello", type);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public void testArrayOfCollectionSerialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_192jlfp4e3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfCollectionSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_192jlfp4e3() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5691);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5692);StringBuilder sb = new StringBuilder("[");
    __CLR4_4_14c44c4lck0y8z9.R.inc(5693);int arraySize = 3;

    __CLR4_4_14c44c4lck0y8z9.R.inc(5694);Type typeToSerialize = new TypeToken<Collection<Integer>[]>() {}.getType();
    __CLR4_4_14c44c4lck0y8z9.R.inc(5695);Collection<Integer>[] arrayOfCollection = new ArrayList[arraySize];
    __CLR4_4_14c44c4lck0y8z9.R.inc(5696);for (int i = 0; (((i < arraySize)&&(__CLR4_4_14c44c4lck0y8z9.R.iget(5697)!=0|true))||(__CLR4_4_14c44c4lck0y8z9.R.iget(5698)==0&false)); ++i) {{
      __CLR4_4_14c44c4lck0y8z9.R.inc(5699);int startValue = (3 * i) + 1;
      __CLR4_4_14c44c4lck0y8z9.R.inc(5700);sb.append('[').append(startValue).append(',').append(startValue + 1).append(']');
      __CLR4_4_14c44c4lck0y8z9.R.inc(5701);ArrayList<Integer> tmpList = new ArrayList<Integer>();
      __CLR4_4_14c44c4lck0y8z9.R.inc(5702);tmpList.add(startValue);
      __CLR4_4_14c44c4lck0y8z9.R.inc(5703);tmpList.add(startValue + 1);
      __CLR4_4_14c44c4lck0y8z9.R.inc(5704);arrayOfCollection[i] = tmpList;

      __CLR4_4_14c44c4lck0y8z9.R.inc(5705);if ((((i < arraySize - 1)&&(__CLR4_4_14c44c4lck0y8z9.R.iget(5706)!=0|true))||(__CLR4_4_14c44c4lck0y8z9.R.iget(5707)==0&false))) {{
        __CLR4_4_14c44c4lck0y8z9.R.inc(5708);sb.append(',');
      }
    }}
    }__CLR4_4_14c44c4lck0y8z9.R.inc(5709);sb.append(']');

    __CLR4_4_14c44c4lck0y8z9.R.inc(5710);String json = gson.toJson(arrayOfCollection, typeToSerialize);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5711);assertEquals(sb.toString(), json);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testArrayOfCollectionDeserialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gyvoje4eo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfCollectionDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gyvoje4eo() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5712);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5713);String json = "[[1,2],[3,4]]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5714);Type type = new TypeToken<Collection<Integer>[]>() {}.getType();
    __CLR4_4_14c44c4lck0y8z9.R.inc(5715);Collection<Integer>[] target = gson.fromJson(json, type);

    __CLR4_4_14c44c4lck0y8z9.R.inc(5716);assertEquals(2, target.length);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5717);MoreAsserts.assertEquals(new Integer[] { 1, 2 }, target[0].toArray(new Integer[0]));
    __CLR4_4_14c44c4lck0y8z9.R.inc(5718);MoreAsserts.assertEquals(new Integer[] { 3, 4 }, target[1].toArray(new Integer[0]));
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testArrayOfPrimitivesWithCustomTypeAdapter() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2meat4ev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfPrimitivesWithCustomTypeAdapter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2meat4ev() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5719);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5720);CrazyLongTypeAdapter typeAdapter = new CrazyLongTypeAdapter();
    __CLR4_4_14c44c4lck0y8z9.R.inc(5721);gson = new GsonBuilder()
        .registerTypeAdapter(long.class, typeAdapter)
        .registerTypeAdapter(Long.class, typeAdapter)
        .create();
    __CLR4_4_14c44c4lck0y8z9.R.inc(5722);long[] value = { 1L };
    __CLR4_4_14c44c4lck0y8z9.R.inc(5723);String serializedValue = gson.toJson(value);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5724);String expected = "[" + String.valueOf(value[0] + CrazyLongTypeAdapter.DIFFERENCE) + "]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5725);assertEquals(expected, serializedValue);

    __CLR4_4_14c44c4lck0y8z9.R.inc(5726);long[] deserializedValue = gson.fromJson(serializedValue, long[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5727);assertEquals(1, deserializedValue.length);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5728);assertEquals(value[0], deserializedValue[0]);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testArrayOfPrimitivesAsObjectsSerialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fud7l4f5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfPrimitivesAsObjectsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fud7l4f5() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5729);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5730);Object[] objs = new Object[]{1, "abc", 0.3f, 5L};
    __CLR4_4_14c44c4lck0y8z9.R.inc(5731);String json = gson.toJson(objs);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5732);assertTrue(json.contains("abc"));
    __CLR4_4_14c44c4lck0y8z9.R.inc(5733);assertTrue(json.contains("0.3"));
    __CLR4_4_14c44c4lck0y8z9.R.inc(5734);assertTrue(json.contains("5"));
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testArrayOfPrimitivesAsObjectsDeserialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tls2xq4fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfPrimitivesAsObjectsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tls2xq4fb() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5735);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5736);String json = "[1,'abc',0.3,5]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5737);Object[] objs = gson.fromJson(json, Object[].class);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5738);assertEquals(1, objs[0]);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5739);assertEquals("abc", objs[1]);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5740);assertEquals(new BigDecimal("0.3"), objs[2]);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5741);assertEquals(5, objs[3]);
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testArrayOfObjectsWithoutTypeInfoDeserialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16g2wtg4fi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfObjectsWithoutTypeInfoDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16g2wtg4fi() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5742);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5743);String json = "[1,'abc',{a:1},5]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5744);try {
      __CLR4_4_14c44c4lck0y8z9.R.inc(5745);gson.fromJson(json, Object[].class);
      __CLR4_4_14c44c4lck0y8z9.R.inc(5746);fail("This is crazy....how did we deserialize it!!!");
    } catch (JsonParseException expected) {
    }
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testArrayWithoutTypeInfoDeserialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1egl6q54fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayWithoutTypeInfoDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1egl6q54fn() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5747);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5748);String json = "[1,'abc',[1,2],5]";
    __CLR4_4_14c44c4lck0y8z9.R.inc(5749);try {
      __CLR4_4_14c44c4lck0y8z9.R.inc(5750);gson.fromJson(json, Object[].class);
      __CLR4_4_14c44c4lck0y8z9.R.inc(5751);fail("This is crazy....how did we deserialize it!!!");
    } catch (JsonParseException expected) {
    }
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}

  public void testObjectArrayWithNonPrimitivesSerialization() throws Exception {__CLR4_4_14c44c4lck0y8z9.R.globalSliceStart(getClass().getName(),5752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1biodf04fs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14c44c4lck0y8z9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14c44c4lck0y8z9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testObjectArrayWithNonPrimitivesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1biodf04fs() throws Exception{try{__CLR4_4_14c44c4lck0y8z9.R.inc(5752);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5753);ClassWithObjects classWithObjects = new ClassWithObjects();
    __CLR4_4_14c44c4lck0y8z9.R.inc(5754);BagOfPrimitives bagOfPrimitives = new BagOfPrimitives();
    __CLR4_4_14c44c4lck0y8z9.R.inc(5755);String classWithObjectsJson = gson.toJson(classWithObjects);
    __CLR4_4_14c44c4lck0y8z9.R.inc(5756);String bagOfPrimitivesJson = gson.toJson(bagOfPrimitives);

    __CLR4_4_14c44c4lck0y8z9.R.inc(5757);Object[] objects = new Object[] { classWithObjects, bagOfPrimitives };
    __CLR4_4_14c44c4lck0y8z9.R.inc(5758);String json = gson.toJson(objects);

    __CLR4_4_14c44c4lck0y8z9.R.inc(5759);assertTrue(json.contains(classWithObjectsJson));
    __CLR4_4_14c44c4lck0y8z9.R.inc(5760);assertTrue(json.contains(bagOfPrimitivesJson));
  }finally{__CLR4_4_14c44c4lck0y8z9.R.flushNeeded();}}
}
