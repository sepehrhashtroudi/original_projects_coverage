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
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedType;
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedTypeAdapter;
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedTypeInstanceCreator;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Functional tests for the serialization and deserialization of parameterized types in Gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ParameterizedTypesTest extends TestCase {static class __CLR4_4_1604604lck0y99l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_1604604lck0y99l.R.inc(7780);
    __CLR4_4_1604604lck0y99l.R.inc(7781);super.setUp();
    __CLR4_4_1604604lck0y99l.R.inc(7782);gson = new Gson();
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testParameterizedTypesSerialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1myj6lh607();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1myj6lh607() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7783);
    __CLR4_4_1604604lck0y99l.R.inc(7784);MyParameterizedType<Integer> src = new MyParameterizedType<Integer>(10);
    __CLR4_4_1604604lck0y99l.R.inc(7785);Type typeOfSrc = new TypeToken<MyParameterizedType<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7786);String json = gson.toJson(src, typeOfSrc);
    __CLR4_4_1604604lck0y99l.R.inc(7787);assertEquals(src.getExpectedJson(), json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testParameterizedTypeDeserialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13lko2360c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13lko2360c() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7788);
    __CLR4_4_1604604lck0y99l.R.inc(7789);BagOfPrimitives bag = new BagOfPrimitives();
    __CLR4_4_1604604lck0y99l.R.inc(7790);MyParameterizedType<BagOfPrimitives> expected = new MyParameterizedType<BagOfPrimitives>(bag);
    __CLR4_4_1604604lck0y99l.R.inc(7791);Type expectedType = new TypeToken<MyParameterizedType<BagOfPrimitives>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7792);BagOfPrimitives bagDefaultInstance = new BagOfPrimitives();
    __CLR4_4_1604604lck0y99l.R.inc(7793);Gson gson = new GsonBuilder().registerTypeAdapter(
        expectedType, new MyParameterizedTypeInstanceCreator<BagOfPrimitives>(bagDefaultInstance))
        .create();

    __CLR4_4_1604604lck0y99l.R.inc(7794);String json = expected.getExpectedJson();
    __CLR4_4_1604604lck0y99l.R.inc(7795);MyParameterizedType<BagOfPrimitives> actual = gson.fromJson(json, expectedType);
    __CLR4_4_1604604lck0y99l.R.inc(7796);assertEquals(expected, actual);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testTypesWithMultipleParametersSerialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gq8gls60l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testTypesWithMultipleParametersSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gq8gls60l() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7797);
    __CLR4_4_1604604lck0y99l.R.inc(7798);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> src =
        new MultiParameters<Integer, Float, Double, String, BagOfPrimitives>(10, 1.0F, 2.1D,
            "abc", new BagOfPrimitives());
    __CLR4_4_1604604lck0y99l.R.inc(7799);Type typeOfSrc = new TypeToken<MultiParameters<Integer, Float, Double, String,
        BagOfPrimitives>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7800);String json = gson.toJson(src, typeOfSrc);
    __CLR4_4_1604604lck0y99l.R.inc(7801);String expected = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\","
        + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
    __CLR4_4_1604604lck0y99l.R.inc(7802);assertEquals(expected, json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testTypesWithMultipleParametersDeserialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9ape960r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testTypesWithMultipleParametersDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9ape960r() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7803);
    __CLR4_4_1604604lck0y99l.R.inc(7804);Type typeOfTarget = new TypeToken<MultiParameters<Integer, Float, Double, String,
        BagOfPrimitives>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7805);String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\","
        + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
    __CLR4_4_1604604lck0y99l.R.inc(7806);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> target =
        gson.fromJson(json, typeOfTarget);
    __CLR4_4_1604604lck0y99l.R.inc(7807);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> expected =
        new MultiParameters<Integer, Float, Double, String, BagOfPrimitives>(10, 1.0F, 2.1D,
            "abc", new BagOfPrimitives());
    __CLR4_4_1604604lck0y99l.R.inc(7808);assertEquals(expected, target);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testParameterizedTypeWithCustomSerializer() {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118xmz560x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeWithCustomSerializer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118xmz560x(){try{__CLR4_4_1604604lck0y99l.R.inc(7809);
    __CLR4_4_1604604lck0y99l.R.inc(7810);Type ptIntegerType = new TypeToken<MyParameterizedType<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7811);Type ptStringType = new TypeToken<MyParameterizedType<String>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7812);Gson gson = new GsonBuilder()
        .registerTypeAdapter(ptIntegerType, new MyParameterizedTypeAdapter<Integer>())
        .registerTypeAdapter(ptStringType, new MyParameterizedTypeAdapter<String>())
        .create();
    __CLR4_4_1604604lck0y99l.R.inc(7813);MyParameterizedType<Integer> intTarget = new MyParameterizedType<Integer>(10);
    __CLR4_4_1604604lck0y99l.R.inc(7814);String json = gson.toJson(intTarget, ptIntegerType);
    __CLR4_4_1604604lck0y99l.R.inc(7815);assertEquals(MyParameterizedTypeAdapter.<Integer>getExpectedJson(intTarget), json);

    __CLR4_4_1604604lck0y99l.R.inc(7816);MyParameterizedType<String> stringTarget = new MyParameterizedType<String>("abc");
    __CLR4_4_1604604lck0y99l.R.inc(7817);json = gson.toJson(stringTarget, ptStringType);
    __CLR4_4_1604604lck0y99l.R.inc(7818);assertEquals(MyParameterizedTypeAdapter.<String>getExpectedJson(stringTarget), json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testParameterizedTypesWithCustomDeserializer() {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uloo2l617();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypesWithCustomDeserializer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uloo2l617(){try{__CLR4_4_1604604lck0y99l.R.inc(7819);
    __CLR4_4_1604604lck0y99l.R.inc(7820);Type ptIntegerType = new TypeToken<MyParameterizedType<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7821);Type ptStringType = new TypeToken<MyParameterizedType<String>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7822);Gson gson = new GsonBuilder().registerTypeAdapter(
        ptIntegerType, new MyParameterizedTypeAdapter<Integer>())
        .registerTypeAdapter(ptStringType, new MyParameterizedTypeAdapter<String>())
        .registerTypeAdapter(ptStringType, new MyParameterizedTypeInstanceCreator<String>(""))
        .registerTypeAdapter(ptIntegerType,
            new MyParameterizedTypeInstanceCreator<Integer>(new Integer(0)))
        .create();

    __CLR4_4_1604604lck0y99l.R.inc(7823);MyParameterizedType<Integer> src = new MyParameterizedType<Integer>(10);
    __CLR4_4_1604604lck0y99l.R.inc(7824);String json = MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
    __CLR4_4_1604604lck0y99l.R.inc(7825);MyParameterizedType<Integer> intTarget = gson.fromJson(json, ptIntegerType);
    __CLR4_4_1604604lck0y99l.R.inc(7826);assertEquals(10, (int) intTarget.value);

    __CLR4_4_1604604lck0y99l.R.inc(7827);MyParameterizedType<String> srcStr = new MyParameterizedType<String>("abc");
    __CLR4_4_1604604lck0y99l.R.inc(7828);json = MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
    __CLR4_4_1604604lck0y99l.R.inc(7829);MyParameterizedType<String> stringTarget = gson.fromJson(json, ptStringType);
    __CLR4_4_1604604lck0y99l.R.inc(7830);assertEquals("abc", stringTarget.value);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testParameterizedTypesWithWriterSerialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdmcus61j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypesWithWriterSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdmcus61j() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7831);
    __CLR4_4_1604604lck0y99l.R.inc(7832);Writer writer = new StringWriter();
    __CLR4_4_1604604lck0y99l.R.inc(7833);MyParameterizedType<Integer> src = new MyParameterizedType<Integer>(10);
    __CLR4_4_1604604lck0y99l.R.inc(7834);Type typeOfSrc = new TypeToken<MyParameterizedType<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7835);gson.toJson(src, typeOfSrc, writer);
    __CLR4_4_1604604lck0y99l.R.inc(7836);assertEquals(src.getExpectedJson(), writer.toString());
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testParameterizedTypeWithReaderDeserialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16125v061p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeWithReaderDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16125v061p() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7837);
    __CLR4_4_1604604lck0y99l.R.inc(7838);BagOfPrimitives bag = new BagOfPrimitives();
    __CLR4_4_1604604lck0y99l.R.inc(7839);MyParameterizedType<BagOfPrimitives> expected = new MyParameterizedType<BagOfPrimitives>(bag);
    __CLR4_4_1604604lck0y99l.R.inc(7840);Type expectedType = new TypeToken<MyParameterizedType<BagOfPrimitives>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7841);BagOfPrimitives bagDefaultInstance = new BagOfPrimitives();
    __CLR4_4_1604604lck0y99l.R.inc(7842);Gson gson = new GsonBuilder().registerTypeAdapter(
        expectedType, new MyParameterizedTypeInstanceCreator<BagOfPrimitives>(bagDefaultInstance))
        .create();

    __CLR4_4_1604604lck0y99l.R.inc(7843);Reader json = new StringReader(expected.getExpectedJson());
    __CLR4_4_1604604lck0y99l.R.inc(7844);MyParameterizedType<Integer> actual = gson.fromJson(json, expectedType);
    __CLR4_4_1604604lck0y99l.R.inc(7845);assertEquals(expected, actual);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public void testVariableTypeFieldsAndGenericArraysSerialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ypcex061y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testVariableTypeFieldsAndGenericArraysSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ypcex061y() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7846);
    __CLR4_4_1604604lck0y99l.R.inc(7847);Integer obj = 0;
    __CLR4_4_1604604lck0y99l.R.inc(7848);Integer[] array = { 1, 2, 3 };
    __CLR4_4_1604604lck0y99l.R.inc(7849);List<Integer> list = new ArrayList<Integer>();
    __CLR4_4_1604604lck0y99l.R.inc(7850);list.add(4);
    __CLR4_4_1604604lck0y99l.R.inc(7851);list.add(5);
    __CLR4_4_1604604lck0y99l.R.inc(7852);List<Integer>[] arrayOfLists = new List[] { list, list };

    __CLR4_4_1604604lck0y99l.R.inc(7853);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7854);ObjectWithTypeVariables<Integer> objToSerialize =
        new ObjectWithTypeVariables<Integer>(obj, array, list, arrayOfLists, list, arrayOfLists);
    __CLR4_4_1604604lck0y99l.R.inc(7855);String json = gson.toJson(objToSerialize, typeOfSrc);

    __CLR4_4_1604604lck0y99l.R.inc(7856);assertEquals(objToSerialize.getExpectedJson(), json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public void testVariableTypeFieldsAndGenericArraysDeserialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1nr0b629();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testVariableTypeFieldsAndGenericArraysDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1nr0b629() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7857);
    __CLR4_4_1604604lck0y99l.R.inc(7858);Integer obj = 0;
    __CLR4_4_1604604lck0y99l.R.inc(7859);Integer[] array = { 1, 2, 3 };
    __CLR4_4_1604604lck0y99l.R.inc(7860);List<Integer> list = new ArrayList<Integer>();
    __CLR4_4_1604604lck0y99l.R.inc(7861);list.add(4);
    __CLR4_4_1604604lck0y99l.R.inc(7862);list.add(5);
    __CLR4_4_1604604lck0y99l.R.inc(7863);List<Integer>[] arrayOfLists = new List[] { list, list };

    __CLR4_4_1604604lck0y99l.R.inc(7864);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7865);ObjectWithTypeVariables<Integer> objToSerialize =
        new ObjectWithTypeVariables<Integer>(obj, array, list, arrayOfLists, list, arrayOfLists);
    __CLR4_4_1604604lck0y99l.R.inc(7866);String json = gson.toJson(objToSerialize, typeOfSrc);
    __CLR4_4_1604604lck0y99l.R.inc(7867);ObjectWithTypeVariables<Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);

    __CLR4_4_1604604lck0y99l.R.inc(7868);assertEquals(objAfterDeserialization.getExpectedJson(), json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testVariableTypeDeserialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pscamm62l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testVariableTypeDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pscamm62l() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7869);
    __CLR4_4_1604604lck0y99l.R.inc(7870);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7871);ObjectWithTypeVariables<Integer> objToSerialize =
        new ObjectWithTypeVariables<Integer>(0, null, null, null, null, null);
    __CLR4_4_1604604lck0y99l.R.inc(7872);String json = gson.toJson(objToSerialize, typeOfSrc);
    __CLR4_4_1604604lck0y99l.R.inc(7873);ObjectWithTypeVariables<Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);

    __CLR4_4_1604604lck0y99l.R.inc(7874);assertEquals(objAfterDeserialization.getExpectedJson(), json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testVariableTypeArrayDeserialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fgc4b62r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testVariableTypeArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fgc4b62r() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7875);
    __CLR4_4_1604604lck0y99l.R.inc(7876);Integer[] array = { 1, 2, 3 };

    __CLR4_4_1604604lck0y99l.R.inc(7877);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7878);ObjectWithTypeVariables<Integer> objToSerialize =
        new ObjectWithTypeVariables<Integer>(null, array, null, null, null, null);
    __CLR4_4_1604604lck0y99l.R.inc(7879);String json = gson.toJson(objToSerialize, typeOfSrc);
    __CLR4_4_1604604lck0y99l.R.inc(7880);ObjectWithTypeVariables<Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);

    __CLR4_4_1604604lck0y99l.R.inc(7881);assertEquals(objAfterDeserialization.getExpectedJson(), json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  public void testParameterizedTypeWithVariableTypeDeserialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6zn3b62y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeWithVariableTypeDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6zn3b62y() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7882);
    __CLR4_4_1604604lck0y99l.R.inc(7883);List<Integer> list = new ArrayList<Integer>();
    __CLR4_4_1604604lck0y99l.R.inc(7884);list.add(4);
    __CLR4_4_1604604lck0y99l.R.inc(7885);list.add(5);

    __CLR4_4_1604604lck0y99l.R.inc(7886);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7887);ObjectWithTypeVariables<Integer> objToSerialize =
        new ObjectWithTypeVariables<Integer>(null, null, list, null, null, null);
    __CLR4_4_1604604lck0y99l.R.inc(7888);String json = gson.toJson(objToSerialize, typeOfSrc);
    __CLR4_4_1604604lck0y99l.R.inc(7889);ObjectWithTypeVariables<Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);

    __CLR4_4_1604604lck0y99l.R.inc(7890);assertEquals(objAfterDeserialization.getExpectedJson(), json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public void testParameterizedTypeGenericArraysSerialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9f1h5637();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeGenericArraysSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9f1h5637() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7891);
    __CLR4_4_1604604lck0y99l.R.inc(7892);List<Integer> list = new ArrayList<Integer>();
    __CLR4_4_1604604lck0y99l.R.inc(7893);list.add(1);
    __CLR4_4_1604604lck0y99l.R.inc(7894);list.add(2);
    __CLR4_4_1604604lck0y99l.R.inc(7895);List<Integer>[] arrayOfLists = new List[] { list, list };

    __CLR4_4_1604604lck0y99l.R.inc(7896);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7897);ObjectWithTypeVariables<Integer> objToSerialize =
        new ObjectWithTypeVariables<Integer>(null, null, null, arrayOfLists, null, null);
    __CLR4_4_1604604lck0y99l.R.inc(7898);String json = gson.toJson(objToSerialize, typeOfSrc);
    __CLR4_4_1604604lck0y99l.R.inc(7899);assertEquals("{\"arrayOfListOfTypeParameters\":[[1,2],[1,2]]}", json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public void testParameterizedTypeGenericArraysDeserialization() throws Exception {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),7900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6g92y63g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeGenericArraysDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6g92y63g() throws Exception{try{__CLR4_4_1604604lck0y99l.R.inc(7900);
    __CLR4_4_1604604lck0y99l.R.inc(7901);List<Integer> list = new ArrayList<Integer>();
    __CLR4_4_1604604lck0y99l.R.inc(7902);list.add(1);
    __CLR4_4_1604604lck0y99l.R.inc(7903);list.add(2);
    __CLR4_4_1604604lck0y99l.R.inc(7904);List<Integer>[] arrayOfLists = new List[] { list, list };

    __CLR4_4_1604604lck0y99l.R.inc(7905);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() {}.getType();
    __CLR4_4_1604604lck0y99l.R.inc(7906);ObjectWithTypeVariables<Integer> objToSerialize =
        new ObjectWithTypeVariables<Integer>(null, null, null, arrayOfLists, null, null);
    __CLR4_4_1604604lck0y99l.R.inc(7907);String json = gson.toJson(objToSerialize, typeOfSrc);
    __CLR4_4_1604604lck0y99l.R.inc(7908);ObjectWithTypeVariables<Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);

    __CLR4_4_1604604lck0y99l.R.inc(7909);assertEquals(objAfterDeserialization.getExpectedJson(), json);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

  /**
   * An test object that has fields that are type variables.
   *
   * @param <T> Enforce T to be a string to make writing the "toExpectedJson" method easier.
   */
  private static class ObjectWithTypeVariables<T extends Number> {
    private final T typeParameterObj;
    private final T[] typeParameterArray;
    private final List<T> listOfTypeParameters;
    private final List<T>[] arrayOfListOfTypeParameters;
    private final List<? extends T> listOfWildcardTypeParameters;
    private final List<? extends T>[] arrayOfListOfWildcardTypeParameters;

    // For use by Gson
    @SuppressWarnings("unused")
    private ObjectWithTypeVariables() {
      this(null, null, null, null, null, null);__CLR4_4_1604604lck0y99l.R.inc(7911);try{__CLR4_4_1604604lck0y99l.R.inc(7910);
    }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

    public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList,
        List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList) {try{__CLR4_4_1604604lck0y99l.R.inc(7912);
      __CLR4_4_1604604lck0y99l.R.inc(7913);this.typeParameterObj = obj;
      __CLR4_4_1604604lck0y99l.R.inc(7914);this.typeParameterArray = array;
      __CLR4_4_1604604lck0y99l.R.inc(7915);this.listOfTypeParameters = list;
      __CLR4_4_1604604lck0y99l.R.inc(7916);this.arrayOfListOfTypeParameters = arrayOfList;
      __CLR4_4_1604604lck0y99l.R.inc(7917);this.listOfWildcardTypeParameters = wildcardList;
      __CLR4_4_1604604lck0y99l.R.inc(7918);this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
    }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1604604lck0y99l.R.inc(7919);
      __CLR4_4_1604604lck0y99l.R.inc(7920);StringBuilder sb = new StringBuilder().append("{");

      __CLR4_4_1604604lck0y99l.R.inc(7921);boolean needsComma = false;
      __CLR4_4_1604604lck0y99l.R.inc(7922);if ((((typeParameterObj != null)&&(__CLR4_4_1604604lck0y99l.R.iget(7923)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7924)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(7925);sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
        __CLR4_4_1604604lck0y99l.R.inc(7926);needsComma = true;
      }

      }__CLR4_4_1604604lck0y99l.R.inc(7927);if ((((typeParameterArray != null)&&(__CLR4_4_1604604lck0y99l.R.iget(7928)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7929)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(7930);if ((((needsComma)&&(__CLR4_4_1604604lck0y99l.R.iget(7931)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7932)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(7933);sb.append(',');
        }
        }__CLR4_4_1604604lck0y99l.R.inc(7934);sb.append("\"typeParameterArray\":[");
        __CLR4_4_1604604lck0y99l.R.inc(7935);appendObjectsToBuilder(sb, Arrays.asList(typeParameterArray));
        __CLR4_4_1604604lck0y99l.R.inc(7936);sb.append(']');
        __CLR4_4_1604604lck0y99l.R.inc(7937);needsComma = true;
      }

      }__CLR4_4_1604604lck0y99l.R.inc(7938);if ((((listOfTypeParameters != null)&&(__CLR4_4_1604604lck0y99l.R.iget(7939)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7940)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(7941);if ((((needsComma)&&(__CLR4_4_1604604lck0y99l.R.iget(7942)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7943)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(7944);sb.append(',');
        }
        }__CLR4_4_1604604lck0y99l.R.inc(7945);sb.append("\"listOfTypeParameters\":[");
        __CLR4_4_1604604lck0y99l.R.inc(7946);appendObjectsToBuilder(sb, listOfTypeParameters);
        __CLR4_4_1604604lck0y99l.R.inc(7947);sb.append(']');
        __CLR4_4_1604604lck0y99l.R.inc(7948);needsComma = true;
      }

      }__CLR4_4_1604604lck0y99l.R.inc(7949);if ((((arrayOfListOfTypeParameters != null)&&(__CLR4_4_1604604lck0y99l.R.iget(7950)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7951)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(7952);if ((((needsComma)&&(__CLR4_4_1604604lck0y99l.R.iget(7953)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7954)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(7955);sb.append(',');
        }
        }__CLR4_4_1604604lck0y99l.R.inc(7956);sb.append("\"arrayOfListOfTypeParameters\":[");
        __CLR4_4_1604604lck0y99l.R.inc(7957);appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
        __CLR4_4_1604604lck0y99l.R.inc(7958);sb.append(']');
        __CLR4_4_1604604lck0y99l.R.inc(7959);needsComma = true;
      }

      }__CLR4_4_1604604lck0y99l.R.inc(7960);if ((((listOfWildcardTypeParameters != null)&&(__CLR4_4_1604604lck0y99l.R.iget(7961)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7962)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(7963);if ((((needsComma)&&(__CLR4_4_1604604lck0y99l.R.iget(7964)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7965)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(7966);sb.append(',');
        }
        }__CLR4_4_1604604lck0y99l.R.inc(7967);sb.append("\"listOfWildcardTypeParameters\":[");
        __CLR4_4_1604604lck0y99l.R.inc(7968);appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
        __CLR4_4_1604604lck0y99l.R.inc(7969);sb.append(']');
        __CLR4_4_1604604lck0y99l.R.inc(7970);needsComma = true;
      }

      }__CLR4_4_1604604lck0y99l.R.inc(7971);if ((((arrayOfListOfWildcardTypeParameters != null)&&(__CLR4_4_1604604lck0y99l.R.iget(7972)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7973)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(7974);if ((((needsComma)&&(__CLR4_4_1604604lck0y99l.R.iget(7975)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7976)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(7977);sb.append(',');
        }
        }__CLR4_4_1604604lck0y99l.R.inc(7978);sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
        __CLR4_4_1604604lck0y99l.R.inc(7979);appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
        __CLR4_4_1604604lck0y99l.R.inc(7980);sb.append(']');
        __CLR4_4_1604604lck0y99l.R.inc(7981);needsComma = true;
      }
      }__CLR4_4_1604604lck0y99l.R.inc(7982);sb.append('}');
      __CLR4_4_1604604lck0y99l.R.inc(7983);return sb.toString();
    }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {try{__CLR4_4_1604604lck0y99l.R.inc(7984);
      __CLR4_4_1604604lck0y99l.R.inc(7985);boolean isFirst = true;
      __CLR4_4_1604604lck0y99l.R.inc(7986);for (T obj : iterable) {{
        __CLR4_4_1604604lck0y99l.R.inc(7987);if ((((!isFirst)&&(__CLR4_4_1604604lck0y99l.R.iget(7988)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7989)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(7990);sb.append(',');
        }
        }__CLR4_4_1604604lck0y99l.R.inc(7991);isFirst = false;
        __CLR4_4_1604604lck0y99l.R.inc(7992);sb.append(toString(obj));
      }
    }}finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {try{__CLR4_4_1604604lck0y99l.R.inc(7993);
      __CLR4_4_1604604lck0y99l.R.inc(7994);boolean isFirst = true;
      __CLR4_4_1604604lck0y99l.R.inc(7995);for (List<? extends T> list : arrayOfList) {{
        __CLR4_4_1604604lck0y99l.R.inc(7996);if ((((!isFirst)&&(__CLR4_4_1604604lck0y99l.R.iget(7997)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(7998)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(7999);sb.append(',');
        }
        }__CLR4_4_1604604lck0y99l.R.inc(8000);isFirst = false;
        __CLR4_4_1604604lck0y99l.R.inc(8001);if ((((list != null)&&(__CLR4_4_1604604lck0y99l.R.iget(8002)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8003)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(8004);sb.append('[');
          __CLR4_4_1604604lck0y99l.R.inc(8005);appendObjectsToBuilder(sb, list);
          __CLR4_4_1604604lck0y99l.R.inc(8006);sb.append(']');
        } }else {{
          __CLR4_4_1604604lck0y99l.R.inc(8007);sb.append("null");
        }
      }}
    }}finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}

    public String toString(T obj) {try{__CLR4_4_1604604lck0y99l.R.inc(8008);
      __CLR4_4_1604604lck0y99l.R.inc(8009);return obj.toString();
    }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}
  }

  private static class MultiParameters<A, B, C, D, E> {
    A a;
    B b;
    C c;
    D d;
    E e;
    // For use by Gson
    @SuppressWarnings("unused")
    private MultiParameters() {try{__CLR4_4_1604604lck0y99l.R.inc(8010);
    }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}
    MultiParameters(A a, B b, C c, D d, E e) {
      super();__CLR4_4_1604604lck0y99l.R.inc(8012);try{__CLR4_4_1604604lck0y99l.R.inc(8011);
      __CLR4_4_1604604lck0y99l.R.inc(8013);this.a = a;
      __CLR4_4_1604604lck0y99l.R.inc(8014);this.b = b;
      __CLR4_4_1604604lck0y99l.R.inc(8015);this.c = c;
      __CLR4_4_1604604lck0y99l.R.inc(8016);this.d = d;
      __CLR4_4_1604604lck0y99l.R.inc(8017);this.e = e;
    }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}
    @Override
    public int hashCode() {try{__CLR4_4_1604604lck0y99l.R.inc(8018);
      __CLR4_4_1604604lck0y99l.R.inc(8019);final int prime = 31;
      __CLR4_4_1604604lck0y99l.R.inc(8020);int result = 1;
      __CLR4_4_1604604lck0y99l.R.inc(8021);result = prime * result + (((((a == null) )&&(__CLR4_4_1604604lck0y99l.R.iget(8022)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8023)==0&false))? 0 : a.hashCode());
      __CLR4_4_1604604lck0y99l.R.inc(8024);result = prime * result + (((((b == null) )&&(__CLR4_4_1604604lck0y99l.R.iget(8025)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8026)==0&false))? 0 : b.hashCode());
      __CLR4_4_1604604lck0y99l.R.inc(8027);result = prime * result + (((((c == null) )&&(__CLR4_4_1604604lck0y99l.R.iget(8028)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8029)==0&false))? 0 : c.hashCode());
      __CLR4_4_1604604lck0y99l.R.inc(8030);result = prime * result + (((((d == null) )&&(__CLR4_4_1604604lck0y99l.R.iget(8031)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8032)==0&false))? 0 : d.hashCode());
      __CLR4_4_1604604lck0y99l.R.inc(8033);result = prime * result + (((((e == null) )&&(__CLR4_4_1604604lck0y99l.R.iget(8034)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8035)==0&false))? 0 : e.hashCode());
      __CLR4_4_1604604lck0y99l.R.inc(8036);return result;
    }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {try{__CLR4_4_1604604lck0y99l.R.inc(8037);
      __CLR4_4_1604604lck0y99l.R.inc(8038);if ((((this == obj)&&(__CLR4_4_1604604lck0y99l.R.iget(8039)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8040)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8041);return true;
      }
      }__CLR4_4_1604604lck0y99l.R.inc(8042);if ((((obj == null)&&(__CLR4_4_1604604lck0y99l.R.iget(8043)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8044)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8045);return false;
      }
      }__CLR4_4_1604604lck0y99l.R.inc(8046);if ((((getClass() != obj.getClass())&&(__CLR4_4_1604604lck0y99l.R.iget(8047)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8048)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8049);return false;
      }
      }__CLR4_4_1604604lck0y99l.R.inc(8050);MultiParameters<A, B, C, D, E> other = (MultiParameters<A, B, C, D, E>) obj;
      __CLR4_4_1604604lck0y99l.R.inc(8051);if ((((a == null)&&(__CLR4_4_1604604lck0y99l.R.iget(8052)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8053)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8054);if ((((other.a != null)&&(__CLR4_4_1604604lck0y99l.R.iget(8055)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8056)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(8057);return false;
        }
      }} }else {__CLR4_4_1604604lck0y99l.R.inc(8058);if ((((!a.equals(other.a))&&(__CLR4_4_1604604lck0y99l.R.iget(8059)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8060)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8061);return false;
      }
      }}__CLR4_4_1604604lck0y99l.R.inc(8062);if ((((b == null)&&(__CLR4_4_1604604lck0y99l.R.iget(8063)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8064)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8065);if ((((other.b != null)&&(__CLR4_4_1604604lck0y99l.R.iget(8066)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8067)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(8068);return false;
        }
      }} }else {__CLR4_4_1604604lck0y99l.R.inc(8069);if ((((!b.equals(other.b))&&(__CLR4_4_1604604lck0y99l.R.iget(8070)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8071)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8072);return false;
      }
      }}__CLR4_4_1604604lck0y99l.R.inc(8073);if ((((c == null)&&(__CLR4_4_1604604lck0y99l.R.iget(8074)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8075)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8076);if ((((other.c != null)&&(__CLR4_4_1604604lck0y99l.R.iget(8077)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8078)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(8079);return false;
        }
      }} }else {__CLR4_4_1604604lck0y99l.R.inc(8080);if ((((!c.equals(other.c))&&(__CLR4_4_1604604lck0y99l.R.iget(8081)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8082)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8083);return false;
      }
      }}__CLR4_4_1604604lck0y99l.R.inc(8084);if ((((d == null)&&(__CLR4_4_1604604lck0y99l.R.iget(8085)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8086)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8087);if ((((other.d != null)&&(__CLR4_4_1604604lck0y99l.R.iget(8088)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8089)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(8090);return false;
        }
      }} }else {__CLR4_4_1604604lck0y99l.R.inc(8091);if ((((!d.equals(other.d))&&(__CLR4_4_1604604lck0y99l.R.iget(8092)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8093)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8094);return false;
      }
      }}__CLR4_4_1604604lck0y99l.R.inc(8095);if ((((e == null)&&(__CLR4_4_1604604lck0y99l.R.iget(8096)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8097)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8098);if ((((other.e != null)&&(__CLR4_4_1604604lck0y99l.R.iget(8099)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8100)==0&false))) {{
          __CLR4_4_1604604lck0y99l.R.inc(8101);return false;
        }
      }} }else {__CLR4_4_1604604lck0y99l.R.inc(8102);if ((((!e.equals(other.e))&&(__CLR4_4_1604604lck0y99l.R.iget(8103)!=0|true))||(__CLR4_4_1604604lck0y99l.R.iget(8104)==0&false))) {{
        __CLR4_4_1604604lck0y99l.R.inc(8105);return false;
      }
      }}__CLR4_4_1604604lck0y99l.R.inc(8106);return true;
    }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}
  }
  
  // Begin: tests to reproduce issue 103
  private static class Quantity {
    @SuppressWarnings("unused")
    int q = 10;
  }
  private static class MyQuantity extends Quantity {
    @SuppressWarnings("unused")
    int q2 = 20;
  }
  private interface Measurable<T> {    
  }
  private interface Field<T> {    
  }
  private interface Immutable {    
  }
  
  public static final class Amount<Q extends Quantity> 
      implements Measurable<Q>, Field<Amount<?>>, Serializable, Immutable {
    private static final long serialVersionUID = -7560491093120970437L;

    int value = 30;
  }
  
  public void testDeepParameterizedTypeSerialization() {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),8107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uorsu697();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testDeepParameterizedTypeSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uorsu697(){try{__CLR4_4_1604604lck0y99l.R.inc(8107);
    __CLR4_4_1604604lck0y99l.R.inc(8108);Amount<MyQuantity> amount = new Amount<MyQuantity>();
    __CLR4_4_1604604lck0y99l.R.inc(8109);String json = gson.toJson(amount);
    __CLR4_4_1604604lck0y99l.R.inc(8110);assertTrue(json.contains("value"));
    __CLR4_4_1604604lck0y99l.R.inc(8111);assertTrue(json.contains("30"));    
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}
  
  public void testDeepParameterizedTypeDeserialization() {__CLR4_4_1604604lck0y99l.R.globalSliceStart(getClass().getName(),8112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlclvl69c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1604604lck0y99l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1604604lck0y99l.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testDeepParameterizedTypeDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlclvl69c(){try{__CLR4_4_1604604lck0y99l.R.inc(8112);
    __CLR4_4_1604604lck0y99l.R.inc(8113);String json = "{value:30}";
    __CLR4_4_1604604lck0y99l.R.inc(8114);Type type = new TypeToken<Amount<MyQuantity>>() {}.getType();    
    __CLR4_4_1604604lck0y99l.R.inc(8115);Amount<MyQuantity> amount = gson.fromJson(json, type);
    __CLR4_4_1604604lck0y99l.R.inc(8116);assertEquals(30, amount.value);
  }finally{__CLR4_4_1604604lck0y99l.R.flushNeeded();}}
  // End: tests to reproduce issue 103
}
