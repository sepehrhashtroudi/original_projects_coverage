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
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithObjects;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.Collection;

/**
 * Functional tests for the different cases for serializing (or ignoring) null fields and object.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NullObjectAndFieldTest extends TestCase {static class __CLR4_4_15r75r7lck0y979{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,7554,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private GsonBuilder gsonBuilder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_15r75r7lck0y979.R.inc(7459);
    __CLR4_4_15r75r7lck0y979.R.inc(7460);super.setUp();
    __CLR4_4_15r75r7lck0y979.R.inc(7461);gsonBuilder = new GsonBuilder().serializeNulls();
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  public void testTopLevelNullObjectSerialization() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3969c5ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testTopLevelNullObjectSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3969c5ra(){try{__CLR4_4_15r75r7lck0y979.R.inc(7462);
    __CLR4_4_15r75r7lck0y979.R.inc(7463);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7464);String actual = gson.toJson(null);
    __CLR4_4_15r75r7lck0y979.R.inc(7465);assertEquals("null", actual);

    __CLR4_4_15r75r7lck0y979.R.inc(7466);actual = gson.toJson(null, String.class);
    __CLR4_4_15r75r7lck0y979.R.inc(7467);assertEquals("null", actual);
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  public void testTopLevelNullObjectDeserialization() throws Exception {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18k4fe75rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testTopLevelNullObjectDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18k4fe75rg() throws Exception{try{__CLR4_4_15r75r7lck0y979.R.inc(7468);
    __CLR4_4_15r75r7lck0y979.R.inc(7469);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7470);String actual = gson.fromJson("null", String.class);
    __CLR4_4_15r75r7lck0y979.R.inc(7471);assertNull(actual);
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  public void testExplicitSerializationOfNulls() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nac7bm5rk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nac7bm5rk(){try{__CLR4_4_15r75r7lck0y979.R.inc(7472);
    __CLR4_4_15r75r7lck0y979.R.inc(7473);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7474);ClassWithObjects target = new ClassWithObjects(null);
    __CLR4_4_15r75r7lck0y979.R.inc(7475);String actual = gson.toJson(target);
    __CLR4_4_15r75r7lck0y979.R.inc(7476);String expected = "{\"bag\":null}";
    __CLR4_4_15r75r7lck0y979.R.inc(7477);assertEquals(expected, actual);
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  public void testExplicitDeserializationOfNulls() throws Exception {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5q7pp5rq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testExplicitDeserializationOfNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5q7pp5rq() throws Exception{try{__CLR4_4_15r75r7lck0y979.R.inc(7478);
    __CLR4_4_15r75r7lck0y979.R.inc(7479);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7480);ClassWithObjects target = gson.fromJson("{\"bag\":null}", ClassWithObjects.class);
    __CLR4_4_15r75r7lck0y979.R.inc(7481);assertNull(target.bag);
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
  
  public void testExplicitSerializationOfNullArrayMembers() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vxnftd5ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNullArrayMembers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vxnftd5ru(){try{__CLR4_4_15r75r7lck0y979.R.inc(7482);
    __CLR4_4_15r75r7lck0y979.R.inc(7483);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7484);ClassWithMembers target = new ClassWithMembers();
    __CLR4_4_15r75r7lck0y979.R.inc(7485);String json = gson.toJson(target);
    __CLR4_4_15r75r7lck0y979.R.inc(7486);assertTrue(json.contains("\"array\":null"));
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
  
  /** 
   * Added to verify http://code.google.com/p/google-gson/issues/detail?id=68
   */
  public void testNullWrappedPrimitiveMemberSerialization() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilypcu5rz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testNullWrappedPrimitiveMemberSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilypcu5rz(){try{__CLR4_4_15r75r7lck0y979.R.inc(7487);
    __CLR4_4_15r75r7lck0y979.R.inc(7488);Gson gson = gsonBuilder.serializeNulls().create();
    __CLR4_4_15r75r7lck0y979.R.inc(7489);ClassWithNullWrappedPrimitive target = new ClassWithNullWrappedPrimitive();
    __CLR4_4_15r75r7lck0y979.R.inc(7490);String json = gson.toJson(target);
    __CLR4_4_15r75r7lck0y979.R.inc(7491);assertTrue(json.contains("\"value\":null"));
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
  
  /** 
   * Added to verify http://code.google.com/p/google-gson/issues/detail?id=68
   */
  public void testNullWrappedPrimitiveMemberDeserialization() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ck33q95s4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testNullWrappedPrimitiveMemberDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ck33q95s4(){try{__CLR4_4_15r75r7lck0y979.R.inc(7492);
    __CLR4_4_15r75r7lck0y979.R.inc(7493);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7494);String json = "{'value':null}";
    __CLR4_4_15r75r7lck0y979.R.inc(7495);ClassWithNullWrappedPrimitive target = gson.fromJson(json, ClassWithNullWrappedPrimitive.class);
    __CLR4_4_15r75r7lck0y979.R.inc(7496);assertNull(target.value);
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
  
  public void testExplicitSerializationOfNullCollectionMembers() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lz0xlm5s9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNullCollectionMembers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lz0xlm5s9(){try{__CLR4_4_15r75r7lck0y979.R.inc(7497);
    __CLR4_4_15r75r7lck0y979.R.inc(7498);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7499);ClassWithMembers target = new ClassWithMembers();
    __CLR4_4_15r75r7lck0y979.R.inc(7500);String json = gson.toJson(target);
    __CLR4_4_15r75r7lck0y979.R.inc(7501);assertTrue(json.contains("\"col\":null"));
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
  
  public void testExplicitSerializationOfNullStringMembers() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1581f155se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNullStringMembers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1581f155se(){try{__CLR4_4_15r75r7lck0y979.R.inc(7502);
    __CLR4_4_15r75r7lck0y979.R.inc(7503);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7504);ClassWithMembers target = new ClassWithMembers();
    __CLR4_4_15r75r7lck0y979.R.inc(7505);String json = gson.toJson(target);
    __CLR4_4_15r75r7lck0y979.R.inc(7506);assertTrue(json.contains("\"str\":null"));
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  public void testCustomSerializationOfNulls() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18howbz5sj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testCustomSerializationOfNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18howbz5sj(){try{__CLR4_4_15r75r7lck0y979.R.inc(7507);
    __CLR4_4_15r75r7lck0y979.R.inc(7508);gsonBuilder.registerTypeAdapter(ClassWithObjects.class, new ClassWithObjectsSerializer());
    __CLR4_4_15r75r7lck0y979.R.inc(7509);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7510);ClassWithObjects target = new ClassWithObjects(new BagOfPrimitives());
    __CLR4_4_15r75r7lck0y979.R.inc(7511);String actual = gson.toJson(target);
    __CLR4_4_15r75r7lck0y979.R.inc(7512);String expected = "{\"bag\":null}";
    __CLR4_4_15r75r7lck0y979.R.inc(7513);assertEquals(expected, actual);
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
  
  public void testPrintPrintingObjectWithNulls() throws Exception {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11agqgy5sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testPrintPrintingObjectWithNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11agqgy5sq() throws Exception{try{__CLR4_4_15r75r7lck0y979.R.inc(7514);
    __CLR4_4_15r75r7lck0y979.R.inc(7515);gsonBuilder = new GsonBuilder();
    __CLR4_4_15r75r7lck0y979.R.inc(7516);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7517);String result = gson.toJson(new ClassWithMembers());
    __CLR4_4_15r75r7lck0y979.R.inc(7518);assertEquals("{}", result);

    __CLR4_4_15r75r7lck0y979.R.inc(7519);gson = gsonBuilder.serializeNulls().create();
    __CLR4_4_15r75r7lck0y979.R.inc(7520);result = gson.toJson(new ClassWithMembers());
    __CLR4_4_15r75r7lck0y979.R.inc(7521);assertTrue(result.contains("\"str\":null"));
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
  
  public void testPrintPrintingArraysWithNulls() throws Exception {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116z16r5sy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testPrintPrintingArraysWithNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116z16r5sy() throws Exception{try{__CLR4_4_15r75r7lck0y979.R.inc(7522);
    __CLR4_4_15r75r7lck0y979.R.inc(7523);gsonBuilder = new GsonBuilder();
    __CLR4_4_15r75r7lck0y979.R.inc(7524);Gson gson = gsonBuilder.create();
    __CLR4_4_15r75r7lck0y979.R.inc(7525);String result = gson.toJson(new String[] { "1", null, "3" });
    __CLR4_4_15r75r7lck0y979.R.inc(7526);assertEquals("[\"1\",null,\"3\"]", result);

    __CLR4_4_15r75r7lck0y979.R.inc(7527);gson = gsonBuilder.serializeNulls().create();
    __CLR4_4_15r75r7lck0y979.R.inc(7528);result = gson.toJson(new String[] { "1", null, "3" });
    __CLR4_4_15r75r7lck0y979.R.inc(7529);assertEquals("[\"1\",null,\"3\"]", result);
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  private static class ClassWithNullWrappedPrimitive {
    private Long value;
  }

  @SuppressWarnings("unused")
  private static class ClassWithMembers {
    String str;
    int[] array;
    Collection<String> col;
  }
  
  private static class ClassWithObjectsSerializer implements JsonSerializer<ClassWithObjects> {
    public JsonElement serialize(ClassWithObjects src, Type typeOfSrc,
        JsonSerializationContext context) {try{__CLR4_4_15r75r7lck0y979.R.inc(7530);
      __CLR4_4_15r75r7lck0y979.R.inc(7531);JsonObject obj = new JsonObject();
      __CLR4_4_15r75r7lck0y979.R.inc(7532);obj.add("bag", new JsonNull());
      __CLR4_4_15r75r7lck0y979.R.inc(7533);return obj;
    }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
  }

  public void testExplicitNullSetsFieldToNullDuringDeserialization() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xr4pd55ta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testExplicitNullSetsFieldToNullDuringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xr4pd55ta(){try{__CLR4_4_15r75r7lck0y979.R.inc(7534);
    __CLR4_4_15r75r7lck0y979.R.inc(7535);Gson gson = new Gson();
    __CLR4_4_15r75r7lck0y979.R.inc(7536);String json = "{value:null}";
    __CLR4_4_15r75r7lck0y979.R.inc(7537);ObjectWithField obj = gson.fromJson(json, ObjectWithField.class);
    __CLR4_4_15r75r7lck0y979.R.inc(7538);assertNull(obj.value);    
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  public void testCustomTypeAdapterPassesNullSerialization() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1td0nun5tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testCustomTypeAdapterPassesNullSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1td0nun5tf(){try{__CLR4_4_15r75r7lck0y979.R.inc(7539);
    __CLR4_4_15r75r7lck0y979.R.inc(7540);Gson gson = new GsonBuilder()
        .registerTypeAdapter(ObjectWithField.class, new JsonSerializer<ObjectWithField>() {
          public JsonElement serialize(ObjectWithField src, Type typeOfSrc,
              JsonSerializationContext context) {try{__CLR4_4_15r75r7lck0y979.R.inc(7541);
            __CLR4_4_15r75r7lck0y979.R.inc(7542);return context.serialize(null);
          }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
        }).create();
    __CLR4_4_15r75r7lck0y979.R.inc(7543);ObjectWithField target = new ObjectWithField();
    __CLR4_4_15r75r7lck0y979.R.inc(7544);target.value = "value1";
    __CLR4_4_15r75r7lck0y979.R.inc(7545);String json = gson.toJson(target);
    __CLR4_4_15r75r7lck0y979.R.inc(7546);assertFalse(json.contains("value1"));
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  public void testCustomTypeAdapterPassesNullDesrialization() {__CLR4_4_15r75r7lck0y979.R.globalSliceStart(getClass().getName(),7547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kp785t5tn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15r75r7lck0y979.R.rethrow($CLV_t2$);}finally{__CLR4_4_15r75r7lck0y979.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testCustomTypeAdapterPassesNullDesrialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kp785t5tn(){try{__CLR4_4_15r75r7lck0y979.R.inc(7547);
    __CLR4_4_15r75r7lck0y979.R.inc(7548);Gson gson = new GsonBuilder()
        .registerTypeAdapter(ObjectWithField.class, new JsonDeserializer<ObjectWithField>() {
          public ObjectWithField deserialize(JsonElement json, Type type,
              JsonDeserializationContext context) {try{__CLR4_4_15r75r7lck0y979.R.inc(7549);
            __CLR4_4_15r75r7lck0y979.R.inc(7550);return context.deserialize(null, type);
          }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}
        }).create();
    __CLR4_4_15r75r7lck0y979.R.inc(7551);String json = "{value:'value1'}";
    __CLR4_4_15r75r7lck0y979.R.inc(7552);ObjectWithField target = gson.fromJson(json, ObjectWithField.class);
    __CLR4_4_15r75r7lck0y979.R.inc(7553);assertNull(target);
  }finally{__CLR4_4_15r75r7lck0y979.R.flushNeeded();}}

  private static class ObjectWithField {
    String value = "";
  }
}
