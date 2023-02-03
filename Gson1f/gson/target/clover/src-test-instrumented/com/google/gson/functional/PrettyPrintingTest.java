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

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.common.TestTypes.ArrayOfObjects;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.reflect.TypeToken;

/**
 * Functional tests for pretty printing option.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrettyPrintingTest extends TestCase {static class __CLR4_4_169h69hlck0y9at{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static int PRINT_MARGIN = 80;
  private static int RIGHT_MARGIN = 4;

  private static final boolean DEBUG = false;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_169h69hlck0y9at.R.inc(8117);
    __CLR4_4_169h69hlck0y9at.R.inc(8118);super.setUp();
    __CLR4_4_169h69hlck0y9at.R.inc(8119);gson = new GsonBuilder().setPrettyPrinting().create();
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}

  public void testPrettyPrintList() {__CLR4_4_169h69hlck0y9at.R.globalSliceStart(getClass().getName(),8120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qv36k669k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169h69hlck0y9at.R.rethrow($CLV_t2$);}finally{__CLR4_4_169h69hlck0y9at.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrettyPrintingTest.testPrettyPrintList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qv36k669k(){try{__CLR4_4_169h69hlck0y9at.R.inc(8120);
    __CLR4_4_169h69hlck0y9at.R.inc(8121);BagOfPrimitives b = new BagOfPrimitives();
    __CLR4_4_169h69hlck0y9at.R.inc(8122);List<BagOfPrimitives> listOfB = new LinkedList<BagOfPrimitives>();
    __CLR4_4_169h69hlck0y9at.R.inc(8123);for (int i = 0; (((i < 15)&&(__CLR4_4_169h69hlck0y9at.R.iget(8124)!=0|true))||(__CLR4_4_169h69hlck0y9at.R.iget(8125)==0&false)); ++i) {{
      __CLR4_4_169h69hlck0y9at.R.inc(8126);listOfB.add(b);
    }
    }__CLR4_4_169h69hlck0y9at.R.inc(8127);Type typeOfSrc = new TypeToken<List<BagOfPrimitives>>() {}.getType();
    __CLR4_4_169h69hlck0y9at.R.inc(8128);String json = gson.toJson(listOfB, typeOfSrc);
    __CLR4_4_169h69hlck0y9at.R.inc(8129);print(json);
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}

  public void testPrettyPrintArrayOfObjects() {__CLR4_4_169h69hlck0y9at.R.globalSliceStart(getClass().getName(),8130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f2wfk69u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169h69hlck0y9at.R.rethrow($CLV_t2$);}finally{__CLR4_4_169h69hlck0y9at.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrettyPrintingTest.testPrettyPrintArrayOfObjects",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f2wfk69u(){try{__CLR4_4_169h69hlck0y9at.R.inc(8130);
    __CLR4_4_169h69hlck0y9at.R.inc(8131);ArrayOfObjects target = new ArrayOfObjects();
    __CLR4_4_169h69hlck0y9at.R.inc(8132);String json = gson.toJson(target);
    __CLR4_4_169h69hlck0y9at.R.inc(8133);print(json);
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}

  public void testPrettyPrintArrayOfPrimitives() {__CLR4_4_169h69hlck0y9at.R.globalSliceStart(getClass().getName(),8134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yd1pr269y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169h69hlck0y9at.R.rethrow($CLV_t2$);}finally{__CLR4_4_169h69hlck0y9at.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrettyPrintingTest.testPrettyPrintArrayOfPrimitives",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yd1pr269y(){try{__CLR4_4_169h69hlck0y9at.R.inc(8134);
    __CLR4_4_169h69hlck0y9at.R.inc(8135);int[] ints = new int[] { 1, 2, 3, 4, 5 };
    __CLR4_4_169h69hlck0y9at.R.inc(8136);String json = gson.toJson(ints);
    __CLR4_4_169h69hlck0y9at.R.inc(8137);assertEquals("[\n  1,\n  2,\n  3,\n  4,\n  5\n]", json);
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}

  public void testPrettyPrintArrayOfPrimitiveArrays() {__CLR4_4_169h69hlck0y9at.R.globalSliceStart(getClass().getName(),8138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8urvh6a2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169h69hlck0y9at.R.rethrow($CLV_t2$);}finally{__CLR4_4_169h69hlck0y9at.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrettyPrintingTest.testPrettyPrintArrayOfPrimitiveArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8urvh6a2(){try{__CLR4_4_169h69hlck0y9at.R.inc(8138);
    __CLR4_4_169h69hlck0y9at.R.inc(8139);int[][] ints = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 },
        { 9, 0 }, { 10 } };
    __CLR4_4_169h69hlck0y9at.R.inc(8140);String json = gson.toJson(ints);
    __CLR4_4_169h69hlck0y9at.R.inc(8141);assertEquals("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ],"
        + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]", json);
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}

  public void testPrettyPrintListOfPrimitiveArrays() {__CLR4_4_169h69hlck0y9at.R.globalSliceStart(getClass().getName(),8142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u33ir26a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169h69hlck0y9at.R.rethrow($CLV_t2$);}finally{__CLR4_4_169h69hlck0y9at.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrettyPrintingTest.testPrettyPrintListOfPrimitiveArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u33ir26a6(){try{__CLR4_4_169h69hlck0y9at.R.inc(8142);
    __CLR4_4_169h69hlck0y9at.R.inc(8143);List<Integer[]> list = Arrays.asList(new Integer[][] { { 1, 2 }, { 3, 4 },
        { 5, 6 }, { 7, 8 }, { 9, 0 }, { 10 } });
    __CLR4_4_169h69hlck0y9at.R.inc(8144);String json = gson.toJson(list);
    __CLR4_4_169h69hlck0y9at.R.inc(8145);assertEquals("[\n  [\n    1,\n    2\n  ],\n  [\n    3,\n    4\n  ],\n  [\n    5,\n    6\n  ],"
        + "\n  [\n    7,\n    8\n  ],\n  [\n    9,\n    0\n  ],\n  [\n    10\n  ]\n]", json);
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}
  
  public void testMap() {__CLR4_4_169h69hlck0y9at.R.globalSliceStart(getClass().getName(),8146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r37vjl6aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169h69hlck0y9at.R.rethrow($CLV_t2$);}finally{__CLR4_4_169h69hlck0y9at.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrettyPrintingTest.testMap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r37vjl6aa(){try{__CLR4_4_169h69hlck0y9at.R.inc(8146);
    __CLR4_4_169h69hlck0y9at.R.inc(8147);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    __CLR4_4_169h69hlck0y9at.R.inc(8148);map.put("abc", 1);
    __CLR4_4_169h69hlck0y9at.R.inc(8149);map.put("def", 5);
    __CLR4_4_169h69hlck0y9at.R.inc(8150);String json = gson.toJson(map);
    __CLR4_4_169h69hlck0y9at.R.inc(8151);assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}

  // In response to bug 153
  public void testEmptyMapField() {__CLR4_4_169h69hlck0y9at.R.globalSliceStart(getClass().getName(),8152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srllpc6ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169h69hlck0y9at.R.rethrow($CLV_t2$);}finally{__CLR4_4_169h69hlck0y9at.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrettyPrintingTest.testEmptyMapField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srllpc6ag(){try{__CLR4_4_169h69hlck0y9at.R.inc(8152);
    __CLR4_4_169h69hlck0y9at.R.inc(8153);ClassWithMap obj = new ClassWithMap();
    __CLR4_4_169h69hlck0y9at.R.inc(8154);obj.map = new LinkedHashMap<String, Integer>();
    __CLR4_4_169h69hlck0y9at.R.inc(8155);String json = gson.toJson(obj);
    __CLR4_4_169h69hlck0y9at.R.inc(8156);assertTrue(json.contains("{\n  \"map\": {},\n  \"value\": 2\n}"));
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}

  @SuppressWarnings("unused")
  private static class ClassWithMap {
    Map<String, Integer> map;
    int value = 2;
  }

  public void testMultipleArrays() {__CLR4_4_169h69hlck0y9at.R.globalSliceStart(getClass().getName(),8157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1j44d6al();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169h69hlck0y9at.R.rethrow($CLV_t2$);}finally{__CLR4_4_169h69hlck0y9at.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrettyPrintingTest.testMultipleArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1j44d6al(){try{__CLR4_4_169h69hlck0y9at.R.inc(8157);
    __CLR4_4_169h69hlck0y9at.R.inc(8158);int[][][] ints = new int[][][] { { { 1 }, { 2 } } };
    __CLR4_4_169h69hlck0y9at.R.inc(8159);String json = gson.toJson(ints);
    __CLR4_4_169h69hlck0y9at.R.inc(8160);assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
  }finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}

  private void print(String msg) {try{__CLR4_4_169h69hlck0y9at.R.inc(8161);
    __CLR4_4_169h69hlck0y9at.R.inc(8162);if ((((DEBUG)&&(__CLR4_4_169h69hlck0y9at.R.iget(8163)!=0|true))||(__CLR4_4_169h69hlck0y9at.R.iget(8164)==0&false))) {{
      __CLR4_4_169h69hlck0y9at.R.inc(8165);System.out.println(msg);
    }
  }}finally{__CLR4_4_169h69hlck0y9at.R.flushNeeded();}}
}
