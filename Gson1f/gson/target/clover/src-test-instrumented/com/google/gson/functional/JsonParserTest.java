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

import java.io.StringReader;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.Nested;

/**
 * Functional tests for that use JsonParser and related Gson methods
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonParserTest extends TestCase {static class __CLR4_4_15ht5htlck0y95r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,7171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_15ht5htlck0y95r.R.inc(7121);
    __CLR4_4_15ht5htlck0y95r.R.inc(7122);super.setUp();
    __CLR4_4_15ht5htlck0y95r.R.inc(7123);gson = new Gson();
  }finally{__CLR4_4_15ht5htlck0y95r.R.flushNeeded();}}
  
  public void testDeserializingCustomTree() {__CLR4_4_15ht5htlck0y95r.R.globalSliceStart(getClass().getName(),7124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4scjk5hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ht5htlck0y95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ht5htlck0y95r.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testDeserializingCustomTree",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4scjk5hw(){try{__CLR4_4_15ht5htlck0y95r.R.inc(7124);
    __CLR4_4_15ht5htlck0y95r.R.inc(7125);JsonObject obj = new JsonObject();
    __CLR4_4_15ht5htlck0y95r.R.inc(7126);obj.addProperty("stringValue", "foo");
    __CLR4_4_15ht5htlck0y95r.R.inc(7127);obj.addProperty("intValue", 11);
    __CLR4_4_15ht5htlck0y95r.R.inc(7128);BagOfPrimitives target = gson.fromJson(obj, BagOfPrimitives.class);
    __CLR4_4_15ht5htlck0y95r.R.inc(7129);assertEquals(11, target.intValue);
    __CLR4_4_15ht5htlck0y95r.R.inc(7130);assertEquals("foo", target.stringValue);
  }finally{__CLR4_4_15ht5htlck0y95r.R.flushNeeded();}}
  
  public void testBadTypeForDeserializingCustomTree() {__CLR4_4_15ht5htlck0y95r.R.globalSliceStart(getClass().getName(),7131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgecne5i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ht5htlck0y95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ht5htlck0y95r.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testBadTypeForDeserializingCustomTree",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgecne5i3(){try{__CLR4_4_15ht5htlck0y95r.R.inc(7131);
    __CLR4_4_15ht5htlck0y95r.R.inc(7132);JsonObject obj = new JsonObject();
    __CLR4_4_15ht5htlck0y95r.R.inc(7133);obj.addProperty("stringValue", "foo");
    __CLR4_4_15ht5htlck0y95r.R.inc(7134);obj.addProperty("intValue", 11);
    __CLR4_4_15ht5htlck0y95r.R.inc(7135);JsonArray array = new JsonArray();
    __CLR4_4_15ht5htlck0y95r.R.inc(7136);array.add(obj);
    __CLR4_4_15ht5htlck0y95r.R.inc(7137);try {
      __CLR4_4_15ht5htlck0y95r.R.inc(7138);gson.fromJson(array, BagOfPrimitives.class);
      __CLR4_4_15ht5htlck0y95r.R.inc(7139);fail("BagOfPrimitives is not an array");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_15ht5htlck0y95r.R.flushNeeded();}}
  
  public void testBadFieldTypeForCustomDeserializerCustomTree() {__CLR4_4_15ht5htlck0y95r.R.globalSliceStart(getClass().getName(),7140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qo6qf65ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ht5htlck0y95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ht5htlck0y95r.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testBadFieldTypeForCustomDeserializerCustomTree",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qo6qf65ic(){try{__CLR4_4_15ht5htlck0y95r.R.inc(7140);
    __CLR4_4_15ht5htlck0y95r.R.inc(7141);JsonArray array = new JsonArray();
    __CLR4_4_15ht5htlck0y95r.R.inc(7142);array.add(new JsonPrimitive("blah"));
    __CLR4_4_15ht5htlck0y95r.R.inc(7143);JsonObject obj = new JsonObject();
    __CLR4_4_15ht5htlck0y95r.R.inc(7144);obj.addProperty("stringValue", "foo");
    __CLR4_4_15ht5htlck0y95r.R.inc(7145);obj.addProperty("intValue", 11);
    __CLR4_4_15ht5htlck0y95r.R.inc(7146);obj.add("longValue", array);

    __CLR4_4_15ht5htlck0y95r.R.inc(7147);try {
      __CLR4_4_15ht5htlck0y95r.R.inc(7148);gson.fromJson(obj, BagOfPrimitives.class);
      __CLR4_4_15ht5htlck0y95r.R.inc(7149);fail("BagOfPrimitives is not an array");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_15ht5htlck0y95r.R.flushNeeded();}}

  public void testBadFieldTypeForDeserializingCustomTree() {__CLR4_4_15ht5htlck0y95r.R.globalSliceStart(getClass().getName(),7150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6fkom5im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ht5htlck0y95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ht5htlck0y95r.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testBadFieldTypeForDeserializingCustomTree",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6fkom5im(){try{__CLR4_4_15ht5htlck0y95r.R.inc(7150);
    __CLR4_4_15ht5htlck0y95r.R.inc(7151);JsonArray array = new JsonArray();
    __CLR4_4_15ht5htlck0y95r.R.inc(7152);array.add(new JsonPrimitive("blah"));
    __CLR4_4_15ht5htlck0y95r.R.inc(7153);JsonObject primitive1 = new JsonObject();
    __CLR4_4_15ht5htlck0y95r.R.inc(7154);primitive1.addProperty("string", "foo");
    __CLR4_4_15ht5htlck0y95r.R.inc(7155);primitive1.addProperty("intValue", 11);

    __CLR4_4_15ht5htlck0y95r.R.inc(7156);JsonObject obj = new JsonObject();
    __CLR4_4_15ht5htlck0y95r.R.inc(7157);obj.add("primitive1", primitive1);
    __CLR4_4_15ht5htlck0y95r.R.inc(7158);obj.add("primitive2", array);
    
    __CLR4_4_15ht5htlck0y95r.R.inc(7159);try {
      __CLR4_4_15ht5htlck0y95r.R.inc(7160);gson.fromJson(obj, Nested.class);
      __CLR4_4_15ht5htlck0y95r.R.inc(7161);fail("Nested has field BagOfPrimitives which is not an array");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_15ht5htlck0y95r.R.flushNeeded();}}

  public void testChangingCustomTreeAndDeserializing() {__CLR4_4_15ht5htlck0y95r.R.globalSliceStart(getClass().getName(),7162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gm7aqi5iy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ht5htlck0y95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ht5htlck0y95r.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testChangingCustomTreeAndDeserializing",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gm7aqi5iy(){try{__CLR4_4_15ht5htlck0y95r.R.inc(7162);
    __CLR4_4_15ht5htlck0y95r.R.inc(7163);StringReader json = 
      new StringReader("{'stringValue':'no message','intValue':10,'longValue':20}");
    __CLR4_4_15ht5htlck0y95r.R.inc(7164);JsonObject obj = (JsonObject) new JsonParser().parse(json);
    __CLR4_4_15ht5htlck0y95r.R.inc(7165);obj.remove("stringValue");
    __CLR4_4_15ht5htlck0y95r.R.inc(7166);obj.addProperty("stringValue", "fooBar");
    __CLR4_4_15ht5htlck0y95r.R.inc(7167);BagOfPrimitives target = gson.fromJson(obj, BagOfPrimitives.class);
    __CLR4_4_15ht5htlck0y95r.R.inc(7168);assertEquals(10, target.intValue);
    __CLR4_4_15ht5htlck0y95r.R.inc(7169);assertEquals(20, target.longValue);
    __CLR4_4_15ht5htlck0y95r.R.inc(7170);assertEquals("fooBar", target.stringValue);
  }finally{__CLR4_4_15ht5htlck0y95r.R.flushNeeded();}}
}
