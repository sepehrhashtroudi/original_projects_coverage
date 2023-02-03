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
import com.google.gson.JsonObject;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithTransientFields;
import com.google.gson.common.TestTypes.Nested;
import com.google.gson.common.TestTypes.PrimitiveArray;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Functional tests for print formatting.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrintFormattingTest extends TestCase {static class __CLR4_4_16kk6kklck0y9bx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_16kk6kklck0y9bx.R.inc(8516);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8517);super.setUp();
    __CLR4_4_16kk6kklck0y9bx.R.inc(8518);gson = new Gson();
  }finally{__CLR4_4_16kk6kklck0y9bx.R.flushNeeded();}}

  @SuppressWarnings({ "unchecked", "rawtypes" })
  public void testCompactFormattingLeavesNoWhiteSpace() {__CLR4_4_16kk6kklck0y9bx.R.globalSliceStart(getClass().getName(),8519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12hw9hz6kn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16kk6kklck0y9bx.R.rethrow($CLV_t2$);}finally{__CLR4_4_16kk6kklck0y9bx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrintFormattingTest.testCompactFormattingLeavesNoWhiteSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12hw9hz6kn(){try{__CLR4_4_16kk6kklck0y9bx.R.inc(8519);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8520);List list = new ArrayList();
    __CLR4_4_16kk6kklck0y9bx.R.inc(8521);list.add(new BagOfPrimitives());
    __CLR4_4_16kk6kklck0y9bx.R.inc(8522);list.add(new Nested());
    __CLR4_4_16kk6kklck0y9bx.R.inc(8523);list.add(new PrimitiveArray());
    __CLR4_4_16kk6kklck0y9bx.R.inc(8524);list.add(new ClassWithTransientFields());

    __CLR4_4_16kk6kklck0y9bx.R.inc(8525);String json = gson.toJson(list);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8526);assertContainsNoWhiteSpace(json);
  }finally{__CLR4_4_16kk6kklck0y9bx.R.flushNeeded();}}

  public void testJsonObjectWithNullValues() {__CLR4_4_16kk6kklck0y9bx.R.globalSliceStart(getClass().getName(),8527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1quctm96kv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16kk6kklck0y9bx.R.rethrow($CLV_t2$);}finally{__CLR4_4_16kk6kklck0y9bx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrintFormattingTest.testJsonObjectWithNullValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1quctm96kv(){try{__CLR4_4_16kk6kklck0y9bx.R.inc(8527);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8528);JsonObject obj = new JsonObject();
    __CLR4_4_16kk6kklck0y9bx.R.inc(8529);obj.addProperty("field1", "value1");
    __CLR4_4_16kk6kklck0y9bx.R.inc(8530);obj.addProperty("field2", (String) null);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8531);String json = gson.toJson(obj);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8532);assertTrue(json.contains("field1"));
    __CLR4_4_16kk6kklck0y9bx.R.inc(8533);assertFalse(json.contains("field2"));
  }finally{__CLR4_4_16kk6kklck0y9bx.R.flushNeeded();}}

  public void testJsonObjectWithNullValuesSerialized() {__CLR4_4_16kk6kklck0y9bx.R.globalSliceStart(getClass().getName(),8534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17km2tp6l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16kk6kklck0y9bx.R.rethrow($CLV_t2$);}finally{__CLR4_4_16kk6kklck0y9bx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrintFormattingTest.testJsonObjectWithNullValuesSerialized",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17km2tp6l2(){try{__CLR4_4_16kk6kklck0y9bx.R.inc(8534);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8535);gson = new GsonBuilder().serializeNulls().create();
    __CLR4_4_16kk6kklck0y9bx.R.inc(8536);JsonObject obj = new JsonObject();
    __CLR4_4_16kk6kklck0y9bx.R.inc(8537);obj.addProperty("field1", "value1");
    __CLR4_4_16kk6kklck0y9bx.R.inc(8538);obj.addProperty("field2", (String) null);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8539);String json = gson.toJson(obj);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8540);assertTrue(json.contains("field1"));
    __CLR4_4_16kk6kklck0y9bx.R.inc(8541);assertTrue(json.contains("field2"));
  }finally{__CLR4_4_16kk6kklck0y9bx.R.flushNeeded();}}

  private static void assertContainsNoWhiteSpace(String str) {try{__CLR4_4_16kk6kklck0y9bx.R.inc(8542);
    __CLR4_4_16kk6kklck0y9bx.R.inc(8543);for (char c : str.toCharArray()) {{
      __CLR4_4_16kk6kklck0y9bx.R.inc(8544);assertFalse(Character.isWhitespace(c));
    }
  }}finally{__CLR4_4_16kk6kklck0y9bx.R.flushNeeded();}}
}
