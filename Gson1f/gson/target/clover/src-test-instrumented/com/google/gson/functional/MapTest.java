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
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Functional test for Json serialization and deserialization for Maps
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class MapTest extends TestCase {static class __CLR4_4_15kg5kglck0y96k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,7388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_15kg5kglck0y96k.R.inc(7216);
    __CLR4_4_15kg5kglck0y96k.R.inc(7217);super.setUp();
    __CLR4_4_15kg5kglck0y96k.R.inc(7218);gson = new Gson();
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  public void testMapSerialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18038wj5kj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18038wj5kj(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7219);
    __CLR4_4_15kg5kglck0y96k.R.inc(7220);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7221);map.put("a", 1);
    __CLR4_4_15kg5kglck0y96k.R.inc(7222);map.put("b", 2);
    __CLR4_4_15kg5kglck0y96k.R.inc(7223);Type typeOfMap = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7224);String json = gson.toJson(map, typeOfMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7225);assertTrue(json.contains("\"a\":1"));
    __CLR4_4_15kg5kglck0y96k.R.inc(7226);assertTrue(json.contains("\"b\":2"));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  public void testMapDeserialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzelg45kr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzelg45kr(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7227);
    __CLR4_4_15kg5kglck0y96k.R.inc(7228);String json = "{\"a\":1,\"b\":2}";
    __CLR4_4_15kg5kglck0y96k.R.inc(7229);Type typeOfMap = new TypeToken<Map<String,Integer>>(){}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7230);Map<String, Integer> target = gson.fromJson(json, typeOfMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7231);assertEquals(1, target.get("a").intValue());
    __CLR4_4_15kg5kglck0y96k.R.inc(7232);assertEquals(2, target.get("b").intValue());
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  @SuppressWarnings({ "unchecked", "rawtypes" })
  public void testRawMapSerialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z30l9r5kx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testRawMapSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z30l9r5kx(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7233);
    __CLR4_4_15kg5kglck0y96k.R.inc(7234);Map map = new LinkedHashMap();
    __CLR4_4_15kg5kglck0y96k.R.inc(7235);map.put("a", 1);
    __CLR4_4_15kg5kglck0y96k.R.inc(7236);map.put("b", "string");
    __CLR4_4_15kg5kglck0y96k.R.inc(7237);String json = gson.toJson(map);
    __CLR4_4_15kg5kglck0y96k.R.inc(7238);assertTrue(json.contains("\"a\":1"));
    __CLR4_4_15kg5kglck0y96k.R.inc(7239);assertTrue(json.contains("\"b\":\"string\""));    
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapSerializationEmpty() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eusq4y5l4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eusq4y5l4(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7240);
    __CLR4_4_15kg5kglck0y96k.R.inc(7241);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7242);Type typeOfMap = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7243);String json = gson.toJson(map, typeOfMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7244);assertEquals("{}", json);
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapDeserializationEmpty() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140pjg15l9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapDeserializationEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140pjg15l9(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7245);
    __CLR4_4_15kg5kglck0y96k.R.inc(7246);Type typeOfMap = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7247);Map<String, Integer> map = gson.fromJson("{}", typeOfMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7248);assertTrue(map.isEmpty());
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapSerializationWithNullValue() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fs42v95ld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationWithNullValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fs42v95ld(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7249);
    __CLR4_4_15kg5kglck0y96k.R.inc(7250);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7251);map.put("abc", null);
    __CLR4_4_15kg5kglck0y96k.R.inc(7252);Type typeOfMap = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7253);String json = gson.toJson(map, typeOfMap);
    
    // Maps are represented as JSON objects, so ignoring null field
    __CLR4_4_15kg5kglck0y96k.R.inc(7254);assertEquals("{}", json);
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapDeserializationWithNullValue() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahllie5lj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapDeserializationWithNullValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahllie5lj(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7255);
    __CLR4_4_15kg5kglck0y96k.R.inc(7256);Type typeOfMap = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7257);Map<String, Integer> map = gson.fromJson("{\"abc\":null}", typeOfMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7258);assertEquals(1, map.size());
    __CLR4_4_15kg5kglck0y96k.R.inc(7259);assertNull(map.get("abc"));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapSerializationWithNullValueButSerializeNulls() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1haicvq5lo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationWithNullValueButSerializeNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1haicvq5lo(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7260);
    __CLR4_4_15kg5kglck0y96k.R.inc(7261);gson = new GsonBuilder().serializeNulls().create();
    __CLR4_4_15kg5kglck0y96k.R.inc(7262);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7263);map.put("abc", null);
    __CLR4_4_15kg5kglck0y96k.R.inc(7264);Type typeOfMap = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7265);String json = gson.toJson(map, typeOfMap);

    __CLR4_4_15kg5kglck0y96k.R.inc(7266);assertEquals("{\"abc\":null}", json);
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapSerializationWithNullKey() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ch8tfx5lv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationWithNullKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ch8tfx5lv(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7267);
    __CLR4_4_15kg5kglck0y96k.R.inc(7268);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7269);map.put(null, 123);
    __CLR4_4_15kg5kglck0y96k.R.inc(7270);Type typeOfMap = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7271);String json = gson.toJson(map, typeOfMap);

    __CLR4_4_15kg5kglck0y96k.R.inc(7272);assertEquals("{\"null\":123}", json);
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapDeserializationWithNullKey() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182a7dg5m1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapDeserializationWithNullKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182a7dg5m1(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7273);
    __CLR4_4_15kg5kglck0y96k.R.inc(7274);Type typeOfMap = new TypeToken<Map<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7275);Map<String, Integer> map = gson.fromJson("{\"null\":123}", typeOfMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7276);assertEquals(1, map.size());
    __CLR4_4_15kg5kglck0y96k.R.inc(7277);assertNull(map.get(null));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapSerializationWithIntegerKeys() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z8n1p5m6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationWithIntegerKeys",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z8n1p5m6(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7278);
    __CLR4_4_15kg5kglck0y96k.R.inc(7279);Map<Integer, String> map = new LinkedHashMap<Integer, String>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7280);map.put(123, "456");
    __CLR4_4_15kg5kglck0y96k.R.inc(7281);Type typeOfMap = new TypeToken<Map<Integer, String>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7282);String json = gson.toJson(map, typeOfMap);

    __CLR4_4_15kg5kglck0y96k.R.inc(7283);assertEquals("{\"123\":\"456\"}", json);
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapDeserializationWithIntegerKeys() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xh4t0y5mc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapDeserializationWithIntegerKeys",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xh4t0y5mc(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7284);
    __CLR4_4_15kg5kglck0y96k.R.inc(7285);Type typeOfMap = new TypeToken<Map<Integer, String>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7286);Map<Integer, String> map = gson.fromJson("{\"123\":\"456\"}", typeOfMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7287);assertEquals(1, map.size());
    __CLR4_4_15kg5kglck0y96k.R.inc(7288);assertTrue(map.containsKey(123));
    __CLR4_4_15kg5kglck0y96k.R.inc(7289);assertEquals("456", map.get(123));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  public void testParameterizedMapSubclassSerialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ewsmi5mi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testParameterizedMapSubclassSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ewsmi5mi(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7290);
    __CLR4_4_15kg5kglck0y96k.R.inc(7291);MyParameterizedMap<String, String> map = new MyParameterizedMap<String, String>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7292);map.put("a", "b");
    __CLR4_4_15kg5kglck0y96k.R.inc(7293);Type type = new TypeToken<MyParameterizedMap<String, String>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7294);String json = gson.toJson(map, type);
    __CLR4_4_15kg5kglck0y96k.R.inc(7295);assertTrue(json.contains("\"a\":\"b\""));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  @SuppressWarnings("rawtypes")
  public void testParameterizedMapSubclassDeserialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mq70d35mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testParameterizedMapSubclassDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mq70d35mo(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7296);
    __CLR4_4_15kg5kglck0y96k.R.inc(7297);Type type = new TypeToken<MyParameterizedMap<String, Integer>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7298);Gson gson = new GsonBuilder().registerTypeAdapter(type, 
        new InstanceCreator<MyParameterizedMap>() {
      public MyParameterizedMap createInstance(Type type) {try{__CLR4_4_15kg5kglck0y96k.R.inc(7299);
        __CLR4_4_15kg5kglck0y96k.R.inc(7300);return new MyParameterizedMap();
      }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}      
    }).create();
    __CLR4_4_15kg5kglck0y96k.R.inc(7301);String json = "{\"a\":1,\"b\":2}";
    __CLR4_4_15kg5kglck0y96k.R.inc(7302);MyParameterizedMap<String, Integer> map = gson.fromJson(json, type);
    __CLR4_4_15kg5kglck0y96k.R.inc(7303);assertEquals(1, map.get("a").intValue()); 
    __CLR4_4_15kg5kglck0y96k.R.inc(7304);assertEquals(2, map.get("b").intValue()); 
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  private static class MyParameterizedMap<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unused")
    int foo = 10;
  }
  
  public void testMapSubclassSerialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9y3hn5mx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSubclassSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9y3hn5mx(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7305);
    __CLR4_4_15kg5kglck0y96k.R.inc(7306);MyMap map = new MyMap();
    __CLR4_4_15kg5kglck0y96k.R.inc(7307);map.put("a", "b");
    __CLR4_4_15kg5kglck0y96k.R.inc(7308);String json = gson.toJson(map, MyMap.class);
    __CLR4_4_15kg5kglck0y96k.R.inc(7309);assertTrue(json.contains("\"a\":\"b\""));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapStandardSubclassDeserialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wse9u15n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapStandardSubclassDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wse9u15n2(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7310);
    __CLR4_4_15kg5kglck0y96k.R.inc(7311);String json = "{a:'1',b:'2'}";
    __CLR4_4_15kg5kglck0y96k.R.inc(7312);Type type = new TypeToken<LinkedHashMap<String, String>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7313);LinkedHashMap<String, Integer> map = gson.fromJson(json, type);
    __CLR4_4_15kg5kglck0y96k.R.inc(7314);assertEquals("1", map.get("a")); 
    __CLR4_4_15kg5kglck0y96k.R.inc(7315);assertEquals("2", map.get("b")); 
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void disable_testMapSubclassDeserialization() {try{__CLR4_4_15kg5kglck0y96k.R.inc(7316);
    __CLR4_4_15kg5kglck0y96k.R.inc(7317);Gson gson = new GsonBuilder().registerTypeAdapter(MyMap.class, new InstanceCreator<MyMap>() {
      public MyMap createInstance(Type type) {try{__CLR4_4_15kg5kglck0y96k.R.inc(7318);
        __CLR4_4_15kg5kglck0y96k.R.inc(7319);return new MyMap();
      }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}      
    }).create();
    __CLR4_4_15kg5kglck0y96k.R.inc(7320);String json = "{\"a\":1,\"b\":2}";
    __CLR4_4_15kg5kglck0y96k.R.inc(7321);MyMap map = gson.fromJson(json, MyMap.class);
    __CLR4_4_15kg5kglck0y96k.R.inc(7322);assertEquals("1", map.get("a")); 
    __CLR4_4_15kg5kglck0y96k.R.inc(7323);assertEquals("2", map.get("b")); 
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
   */
  private static class ClassWithAMap {
    Map<String, String> map = new TreeMap<String, String>();
  }
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
   */
  public void testMapSerializationWithNullValues() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxrz6k5ng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationWithNullValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxrz6k5ng(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7324);
    __CLR4_4_15kg5kglck0y96k.R.inc(7325);ClassWithAMap target = new ClassWithAMap();
    __CLR4_4_15kg5kglck0y96k.R.inc(7326);target.map.put("name1", null);
    __CLR4_4_15kg5kglck0y96k.R.inc(7327);target.map.put("name2", "value2");
    __CLR4_4_15kg5kglck0y96k.R.inc(7328);String json = gson.toJson(target);
    __CLR4_4_15kg5kglck0y96k.R.inc(7329);assertFalse(json.contains("name1"));
    __CLR4_4_15kg5kglck0y96k.R.inc(7330);assertTrue(json.contains("name2"));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
   */
  public void testMapSerializationWithNullValuesSerialized() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d258ow5nn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationWithNullValuesSerialized",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d258ow5nn(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7331);
    __CLR4_4_15kg5kglck0y96k.R.inc(7332);Gson gson = new GsonBuilder().serializeNulls().create();
    __CLR4_4_15kg5kglck0y96k.R.inc(7333);ClassWithAMap target = new ClassWithAMap();
    __CLR4_4_15kg5kglck0y96k.R.inc(7334);target.map.put("name1", null);
    __CLR4_4_15kg5kglck0y96k.R.inc(7335);target.map.put("name2", "value2");
    __CLR4_4_15kg5kglck0y96k.R.inc(7336);String json = gson.toJson(target);
    __CLR4_4_15kg5kglck0y96k.R.inc(7337);assertTrue(json.contains("name1"));
    __CLR4_4_15kg5kglck0y96k.R.inc(7338);assertTrue(json.contains("name2"));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapSerializationWithWildcardValues() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tbo6mn5nv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationWithWildcardValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tbo6mn5nv(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7339);
    __CLR4_4_15kg5kglck0y96k.R.inc(7340);Map<String, ? extends Collection<? extends Integer>> map =
        new LinkedHashMap<String, Collection<Integer>>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7341);map.put("test", null);
    __CLR4_4_15kg5kglck0y96k.R.inc(7342);Type typeOfMap = 
        new TypeToken<Map<String, ? extends Collection<? extends Integer>>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7343);String json = gson.toJson(map, typeOfMap);

    __CLR4_4_15kg5kglck0y96k.R.inc(7344);assertEquals("{}", json);
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  public void testMapDeserializationWithWildcardValues() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3x37y5o1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapDeserializationWithWildcardValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3x37y5o1(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7345);
    __CLR4_4_15kg5kglck0y96k.R.inc(7346);Type typeOfMap = new TypeToken<Map<String, ? extends Long>>() {}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7347);Map<String, ? extends Long> map = gson.fromJson("{\"test\":123}", typeOfMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7348);assertEquals(1, map.size());
    __CLR4_4_15kg5kglck0y96k.R.inc(7349);assertEquals(new Long(123L), map.get("test"));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  
  private static class MyMap extends LinkedHashMap<String, String> {
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unused")
    int foo = 10;
  }
  
  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
   */
  public void testMapOfMapSerialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uutcv85o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapOfMapSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uutcv85o6(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7350);
    __CLR4_4_15kg5kglck0y96k.R.inc(7351);Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7352);Map<String, String> nestedMap = new HashMap<String, String>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7353);nestedMap.put("1", "1");
    __CLR4_4_15kg5kglck0y96k.R.inc(7354);nestedMap.put("2", "2");
    __CLR4_4_15kg5kglck0y96k.R.inc(7355);map.put("nestedMap", nestedMap);
    __CLR4_4_15kg5kglck0y96k.R.inc(7356);String json = gson.toJson(map);
    __CLR4_4_15kg5kglck0y96k.R.inc(7357);assertTrue(json.contains("nestedMap"));
    __CLR4_4_15kg5kglck0y96k.R.inc(7358);assertTrue(json.contains("\"1\":\"1\""));
    __CLR4_4_15kg5kglck0y96k.R.inc(7359);assertTrue(json.contains("\"2\":\"2\""));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
   */
  public void testMapOfMapDeserialization() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zeilqz5og();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapOfMapDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zeilqz5og(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7360);
    __CLR4_4_15kg5kglck0y96k.R.inc(7361);String json = "{nestedMap:{'2':'2','1':'1'}}";
    __CLR4_4_15kg5kglck0y96k.R.inc(7362);Type type = new TypeToken<Map<String, Map<String, String>>>(){}.getType();
    __CLR4_4_15kg5kglck0y96k.R.inc(7363);Map<String, Map<String, String>> map = gson.fromJson(json, type);
    __CLR4_4_15kg5kglck0y96k.R.inc(7364);Map<String, String> nested = map.get("nestedMap");
    __CLR4_4_15kg5kglck0y96k.R.inc(7365);assertEquals("1", nested.get("1"));
    __CLR4_4_15kg5kglck0y96k.R.inc(7366);assertEquals("2", nested.get("2"));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=178
   */
  public void testMapWithQuotes() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h9r9q5on();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapWithQuotes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h9r9q5on(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7367);
    __CLR4_4_15kg5kglck0y96k.R.inc(7368);Map<String, String> map = new HashMap<String, String>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7369);map.put("a\"b", "c\"d");
    __CLR4_4_15kg5kglck0y96k.R.inc(7370);String json = gson.toJson(map);
    __CLR4_4_15kg5kglck0y96k.R.inc(7371);assertEquals("{\"a\\\"b\":\"c\\\"d\"}", json);
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
  
  /**
   * From issue 227.
   */
  public void testWriteMapsWithEmptyStringKey() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1niq6z65os();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testWriteMapsWithEmptyStringKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1niq6z65os(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7372);
    __CLR4_4_15kg5kglck0y96k.R.inc(7373);Map<String, Boolean> map = new HashMap<String, Boolean>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7374);map.put("", true);
    __CLR4_4_15kg5kglck0y96k.R.inc(7375);assertEquals("{\"\":true}", gson.toJson(map));

  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  public void testReadMapsWithEmptyStringKey() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1450yyb5ow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testReadMapsWithEmptyStringKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1450yyb5ow(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7376);
    __CLR4_4_15kg5kglck0y96k.R.inc(7377);Map<String, Boolean> map = gson.fromJson("{\"\":true}", new TypeToken<Map<String, Boolean>>() {}.getType());
    __CLR4_4_15kg5kglck0y96k.R.inc(7378);assertEquals(Boolean.TRUE, map.get(""));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}

  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
   */
  public void testSerializeMaps() {__CLR4_4_15kg5kglck0y96k.R.globalSliceStart(getClass().getName(),7379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3vn045oz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15kg5kglck0y96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_15kg5kglck0y96k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testSerializeMaps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3vn045oz(){try{__CLR4_4_15kg5kglck0y96k.R.inc(7379);
    __CLR4_4_15kg5kglck0y96k.R.inc(7380);Map<String, Object> map = new LinkedHashMap<String, Object>();
    __CLR4_4_15kg5kglck0y96k.R.inc(7381);map.put("a", 12);
    __CLR4_4_15kg5kglck0y96k.R.inc(7382);map.put("b", null);
    __CLR4_4_15kg5kglck0y96k.R.inc(7383);map.put("c", new HashMap<String, Object>());

    __CLR4_4_15kg5kglck0y96k.R.inc(7384);assertEquals("{\"a\":12,\"b\":null,\"c\":{}}",
        new GsonBuilder().serializeNulls().create().toJson(map));
    __CLR4_4_15kg5kglck0y96k.R.inc(7385);assertEquals("{\"a\":12,\"b\":null,\"c\":{}}",
        new GsonBuilder().serializeNulls().create().toJson(map));
    __CLR4_4_15kg5kglck0y96k.R.inc(7386);assertEquals("{\"a\":12,\"c\":{}}",
        new GsonBuilder().create().toJson(map));
    __CLR4_4_15kg5kglck0y96k.R.inc(7387);assertEquals("{\"a\":12,\"c\":{}}",
        new GsonBuilder().create().toJson(map));
  }finally{__CLR4_4_15kg5kglck0y96k.R.flushNeeded();}}
}
