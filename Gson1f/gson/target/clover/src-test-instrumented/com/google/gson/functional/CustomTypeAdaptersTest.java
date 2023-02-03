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
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithCustomTypeConverter;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Functional tests for the support of custom serializer and deserializers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CustomTypeAdaptersTest extends TestCase {static class __CLR4_4_14sc4sclck0y92o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14sc4sclck0y92o.R.inc(6204);
    __CLR4_4_14sc4sclck0y92o.R.inc(6205);super.setUp();
    __CLR4_4_14sc4sclck0y92o.R.inc(6206);builder = new GsonBuilder();
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  public void testCustomSerializers() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4r2114sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomSerializers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4r2114sf(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6207);
    __CLR4_4_14sc4sclck0y92o.R.inc(6208);Gson gson = builder.registerTypeAdapter(
        ClassWithCustomTypeConverter.class, new JsonSerializer<ClassWithCustomTypeConverter>() {
      public JsonElement serialize(ClassWithCustomTypeConverter src, Type typeOfSrc,
          JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6209);
        __CLR4_4_14sc4sclck0y92o.R.inc(6210);JsonObject json = new JsonObject();
        __CLR4_4_14sc4sclck0y92o.R.inc(6211);json.addProperty("bag", 5);
        __CLR4_4_14sc4sclck0y92o.R.inc(6212);json.addProperty("value", 25);
        __CLR4_4_14sc4sclck0y92o.R.inc(6213);return json;
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
    }).create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6214);ClassWithCustomTypeConverter target = new ClassWithCustomTypeConverter();
    __CLR4_4_14sc4sclck0y92o.R.inc(6215);assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  public void testCustomDeserializers() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fjwec4so();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomDeserializers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fjwec4so(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6216);
    __CLR4_4_14sc4sclck0y92o.R.inc(6217);Gson gson = new GsonBuilder().registerTypeAdapter(
        ClassWithCustomTypeConverter.class, new JsonDeserializer<ClassWithCustomTypeConverter>() {
      public ClassWithCustomTypeConverter deserialize(JsonElement json, Type typeOfT,
          JsonDeserializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6218);
        __CLR4_4_14sc4sclck0y92o.R.inc(6219);JsonObject jsonObject = json.getAsJsonObject();
        __CLR4_4_14sc4sclck0y92o.R.inc(6220);int value = jsonObject.get("bag").getAsInt();
        __CLR4_4_14sc4sclck0y92o.R.inc(6221);return new ClassWithCustomTypeConverter(new BagOfPrimitives(value,
            value, false, ""), value);
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
    }).create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6222);String json = "{\"bag\":5,\"value\":25}";
    __CLR4_4_14sc4sclck0y92o.R.inc(6223);ClassWithCustomTypeConverter target = gson.fromJson(json, ClassWithCustomTypeConverter.class);
    __CLR4_4_14sc4sclck0y92o.R.inc(6224);assertEquals(5, target.getBag().getIntValue());
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  public void disable_testCustomSerializersOfSelf() {try{__CLR4_4_14sc4sclck0y92o.R.inc(6225);
    __CLR4_4_14sc4sclck0y92o.R.inc(6226);Gson gson = createGsonObjectWithFooTypeAdapter();
    __CLR4_4_14sc4sclck0y92o.R.inc(6227);Gson basicGson = new Gson();
    __CLR4_4_14sc4sclck0y92o.R.inc(6228);Foo newFooObject = new Foo(1, 2L);
    __CLR4_4_14sc4sclck0y92o.R.inc(6229);String jsonFromCustomSerializer = gson.toJson(newFooObject);
    __CLR4_4_14sc4sclck0y92o.R.inc(6230);String jsonFromGson = basicGson.toJson(newFooObject);
    
    __CLR4_4_14sc4sclck0y92o.R.inc(6231);assertEquals(jsonFromGson, jsonFromCustomSerializer);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  public void disable_testCustomDeserializersOfSelf() {try{__CLR4_4_14sc4sclck0y92o.R.inc(6232);
    __CLR4_4_14sc4sclck0y92o.R.inc(6233);Gson gson = createGsonObjectWithFooTypeAdapter();
    __CLR4_4_14sc4sclck0y92o.R.inc(6234);Gson basicGson = new Gson();
    __CLR4_4_14sc4sclck0y92o.R.inc(6235);Foo expectedFoo = new Foo(1, 2L);
    __CLR4_4_14sc4sclck0y92o.R.inc(6236);String json = basicGson.toJson(expectedFoo);
    __CLR4_4_14sc4sclck0y92o.R.inc(6237);Foo newFooObject = gson.fromJson(json, Foo.class);
    
    __CLR4_4_14sc4sclck0y92o.R.inc(6238);assertEquals(expectedFoo.key, newFooObject.key);
    __CLR4_4_14sc4sclck0y92o.R.inc(6239);assertEquals(expectedFoo.value, newFooObject.value);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  public void testCustomNestedSerializers() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iapjn24tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomNestedSerializers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iapjn24tc(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6240);
    __CLR4_4_14sc4sclck0y92o.R.inc(6241);Gson gson = new GsonBuilder().registerTypeAdapter(
        BagOfPrimitives.class, new JsonSerializer<BagOfPrimitives>() {
      public JsonElement serialize(BagOfPrimitives src, Type typeOfSrc,
          JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6242);
        __CLR4_4_14sc4sclck0y92o.R.inc(6243);return new JsonPrimitive(6);
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
    }).create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6244);ClassWithCustomTypeConverter target = new ClassWithCustomTypeConverter();
    __CLR4_4_14sc4sclck0y92o.R.inc(6245);assertEquals("{\"bag\":6,\"value\":10}", gson.toJson(target));
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  public void testCustomNestedDeserializers() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l7c4t4ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomNestedDeserializers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l7c4t4ti(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6246);
    __CLR4_4_14sc4sclck0y92o.R.inc(6247);Gson gson = new GsonBuilder().registerTypeAdapter(
        BagOfPrimitives.class, new JsonDeserializer<BagOfPrimitives>() {
      public BagOfPrimitives deserialize(JsonElement json, Type typeOfT,
          JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_14sc4sclck0y92o.R.inc(6248);
        __CLR4_4_14sc4sclck0y92o.R.inc(6249);int value = json.getAsInt();
        __CLR4_4_14sc4sclck0y92o.R.inc(6250);return new BagOfPrimitives(value, value, false, "");
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
    }).create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6251);String json = "{\"bag\":7,\"value\":25}";
    __CLR4_4_14sc4sclck0y92o.R.inc(6252);ClassWithCustomTypeConverter target = gson.fromJson(json, ClassWithCustomTypeConverter.class);
    __CLR4_4_14sc4sclck0y92o.R.inc(6253);assertEquals(7, target.getBag().getIntValue());
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  public void testCustomTypeAdapterDoesNotAppliesToSubClasses() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e270ic4tq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomTypeAdapterDoesNotAppliesToSubClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e270ic4tq(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6254);
    __CLR4_4_14sc4sclck0y92o.R.inc(6255);Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base> () {
      public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6256);
        __CLR4_4_14sc4sclck0y92o.R.inc(6257);JsonObject json = new JsonObject();
        __CLR4_4_14sc4sclck0y92o.R.inc(6258);json.addProperty("value", src.baseValue);
        __CLR4_4_14sc4sclck0y92o.R.inc(6259);return json;
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}          
    }).create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6260);Base b = new Base();
    __CLR4_4_14sc4sclck0y92o.R.inc(6261);String json = gson.toJson(b);
    __CLR4_4_14sc4sclck0y92o.R.inc(6262);assertTrue(json.contains("value"));    
    __CLR4_4_14sc4sclck0y92o.R.inc(6263);b = new Derived();
    __CLR4_4_14sc4sclck0y92o.R.inc(6264);json = gson.toJson(b);
    __CLR4_4_14sc4sclck0y92o.R.inc(6265);assertTrue(json.contains("derivedValue"));    
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  public void testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rjg2ar4u2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rjg2ar4u2(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6266);
    __CLR4_4_14sc4sclck0y92o.R.inc(6267);Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base> () {
      public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6268);
        __CLR4_4_14sc4sclck0y92o.R.inc(6269);JsonObject json = new JsonObject();
        __CLR4_4_14sc4sclck0y92o.R.inc(6270);json.addProperty("value", src.baseValue);
        __CLR4_4_14sc4sclck0y92o.R.inc(6271);return json;
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}          
    }).create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6272);Base b = new Base();
    __CLR4_4_14sc4sclck0y92o.R.inc(6273);String json = gson.toJson(b);
    __CLR4_4_14sc4sclck0y92o.R.inc(6274);assertTrue(json.contains("value"));    
    __CLR4_4_14sc4sclck0y92o.R.inc(6275);b = new Derived();
    __CLR4_4_14sc4sclck0y92o.R.inc(6276);json = gson.toJson(b, Base.class);
    __CLR4_4_14sc4sclck0y92o.R.inc(6277);assertTrue(json.contains("value"));    
    __CLR4_4_14sc4sclck0y92o.R.inc(6278);assertFalse(json.contains("derivedValue"));
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  private static class Base {
    int baseValue = 2;
  }
  
  private static class Derived extends Base {
    @SuppressWarnings("unused")
    int derivedValue = 3;
  }
  
  
  private Gson createGsonObjectWithFooTypeAdapter() {try{__CLR4_4_14sc4sclck0y92o.R.inc(6279);
    __CLR4_4_14sc4sclck0y92o.R.inc(6280);return new GsonBuilder().registerTypeAdapter(Foo.class, new FooTypeAdapter()).create();
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  public static class Foo {
    private final int key;
    private final long value;
    
    public Foo() {
      this(0, 0L);__CLR4_4_14sc4sclck0y92o.R.inc(6282);try{__CLR4_4_14sc4sclck0y92o.R.inc(6281);
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

    public Foo(int key, long value) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6283);
      __CLR4_4_14sc4sclck0y92o.R.inc(6284);this.key = key;
      __CLR4_4_14sc4sclck0y92o.R.inc(6285);this.value = value;
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  }
  
  public static class FooTypeAdapter implements JsonSerializer<Foo>, JsonDeserializer<Foo> {
    public Foo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_14sc4sclck0y92o.R.inc(6286);
      __CLR4_4_14sc4sclck0y92o.R.inc(6287);return context.deserialize(json, typeOfT);
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

    public JsonElement serialize(Foo src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6288);
      __CLR4_4_14sc4sclck0y92o.R.inc(6289);return context.serialize(src, typeOfSrc);
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  }
  
  public void testCustomSerializerForLong() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7hycp4uq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomSerializerForLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7hycp4uq(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6290);
    __CLR4_4_14sc4sclck0y92o.R.inc(6291);final ClassWithBooleanField customSerializerInvoked = new ClassWithBooleanField();
    __CLR4_4_14sc4sclck0y92o.R.inc(6292);customSerializerInvoked.value = false;
    __CLR4_4_14sc4sclck0y92o.R.inc(6293);Gson gson = new GsonBuilder().registerTypeAdapter(Long.class, new JsonSerializer<Long>() {
      public JsonElement serialize(Long src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6294);
        __CLR4_4_14sc4sclck0y92o.R.inc(6295);customSerializerInvoked.value = true;
        __CLR4_4_14sc4sclck0y92o.R.inc(6296);return new JsonPrimitive(src);
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}      
    }).serializeNulls().create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6297);ClassWithWrapperLongField src = new ClassWithWrapperLongField();
    __CLR4_4_14sc4sclck0y92o.R.inc(6298);String json = gson.toJson(src);
    __CLR4_4_14sc4sclck0y92o.R.inc(6299);assertTrue(json.contains("\"value\":null"));
    __CLR4_4_14sc4sclck0y92o.R.inc(6300);assertFalse(customSerializerInvoked.value);
    
    __CLR4_4_14sc4sclck0y92o.R.inc(6301);customSerializerInvoked.value = false;
    __CLR4_4_14sc4sclck0y92o.R.inc(6302);src.value = 10L;
    __CLR4_4_14sc4sclck0y92o.R.inc(6303);json = gson.toJson(src);
    __CLR4_4_14sc4sclck0y92o.R.inc(6304);assertTrue(json.contains("\"value\":10"));
    __CLR4_4_14sc4sclck0y92o.R.inc(6305);assertTrue(customSerializerInvoked.value);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  public void testCustomDeserializerForLong() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7tfoq4v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomDeserializerForLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7tfoq4v6(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6306);
    __CLR4_4_14sc4sclck0y92o.R.inc(6307);final ClassWithBooleanField customDeserializerInvoked = new ClassWithBooleanField();
    __CLR4_4_14sc4sclck0y92o.R.inc(6308);customDeserializerInvoked.value = false;
    __CLR4_4_14sc4sclck0y92o.R.inc(6309);Gson gson = new GsonBuilder().registerTypeAdapter(Long.class, new JsonDeserializer<Long>() {
      public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
          throws JsonParseException {try{__CLR4_4_14sc4sclck0y92o.R.inc(6310);
        __CLR4_4_14sc4sclck0y92o.R.inc(6311);customDeserializerInvoked.value = true;
        __CLR4_4_14sc4sclck0y92o.R.inc(6312);if ((((json == null || json.isJsonNull())&&(__CLR4_4_14sc4sclck0y92o.R.iget(6313)!=0|true))||(__CLR4_4_14sc4sclck0y92o.R.iget(6314)==0&false))) {{
          __CLR4_4_14sc4sclck0y92o.R.inc(6315);return null;
        }
        }__CLR4_4_14sc4sclck0y92o.R.inc(6316);Number number = json.getAsJsonPrimitive().getAsNumber();
        __CLR4_4_14sc4sclck0y92o.R.inc(6317);return (((number == null )&&(__CLR4_4_14sc4sclck0y92o.R.iget(6318)!=0|true))||(__CLR4_4_14sc4sclck0y92o.R.iget(6319)==0&false))? null : number.longValue();
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}      
    }).create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6320);String json = "{'value':null}";
    __CLR4_4_14sc4sclck0y92o.R.inc(6321);ClassWithWrapperLongField target = gson.fromJson(json, ClassWithWrapperLongField.class);
    __CLR4_4_14sc4sclck0y92o.R.inc(6322);assertNull(target.value);
    __CLR4_4_14sc4sclck0y92o.R.inc(6323);assertFalse(customDeserializerInvoked.value);
    
    __CLR4_4_14sc4sclck0y92o.R.inc(6324);customDeserializerInvoked.value = false;
    __CLR4_4_14sc4sclck0y92o.R.inc(6325);json = "{'value':10}";
    __CLR4_4_14sc4sclck0y92o.R.inc(6326);target = gson.fromJson(json, ClassWithWrapperLongField.class);
    __CLR4_4_14sc4sclck0y92o.R.inc(6327);assertEquals(10L, target.value.longValue());
    __CLR4_4_14sc4sclck0y92o.R.inc(6328);assertTrue(customDeserializerInvoked.value);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  private static class ClassWithWrapperLongField {
    Long value;
  }
  
  private static class ClassWithBooleanField {
    Boolean value;
  }
  
  public void testCustomByteArraySerializer() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161i69z4vt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomByteArraySerializer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161i69z4vt(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6329);
    __CLR4_4_14sc4sclck0y92o.R.inc(6330);Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
      public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6331);
        __CLR4_4_14sc4sclck0y92o.R.inc(6332);StringBuilder sb = new StringBuilder(src.length);
        __CLR4_4_14sc4sclck0y92o.R.inc(6333);for (byte b : src) {{
          __CLR4_4_14sc4sclck0y92o.R.inc(6334);sb.append(b);
        }
        }__CLR4_4_14sc4sclck0y92o.R.inc(6335);return new JsonPrimitive(sb.toString());
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}      
    }).create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6336);byte[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    __CLR4_4_14sc4sclck0y92o.R.inc(6337);String json = gson.toJson(data);
    __CLR4_4_14sc4sclck0y92o.R.inc(6338);assertEquals("\"0123456789\"", json);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  public void testCustomByteArrayDeserializerAndInstanceCreator() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199dtqg4w3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomByteArrayDeserializerAndInstanceCreator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199dtqg4w3(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6339);
    __CLR4_4_14sc4sclck0y92o.R.inc(6340);GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, 
        new JsonDeserializer<byte[]>() {
      public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
          throws JsonParseException {try{__CLR4_4_14sc4sclck0y92o.R.inc(6341);
        __CLR4_4_14sc4sclck0y92o.R.inc(6342);String str = json.getAsString();
        __CLR4_4_14sc4sclck0y92o.R.inc(6343);byte[] data = new byte[str.length()];
        __CLR4_4_14sc4sclck0y92o.R.inc(6344);for (int i = 0; (((i < data.length)&&(__CLR4_4_14sc4sclck0y92o.R.iget(6345)!=0|true))||(__CLR4_4_14sc4sclck0y92o.R.iget(6346)==0&false)); ++i) {{
          __CLR4_4_14sc4sclck0y92o.R.inc(6347);data[i] = Byte.parseByte(""+str.charAt(i));
        }
        }__CLR4_4_14sc4sclck0y92o.R.inc(6348);return data;
      }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}      
    });
    __CLR4_4_14sc4sclck0y92o.R.inc(6349);Gson gson = gsonBuilder.create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6350);String json = "'0123456789'";
    __CLR4_4_14sc4sclck0y92o.R.inc(6351);byte[] actual = gson.fromJson(json, byte[].class);
    __CLR4_4_14sc4sclck0y92o.R.inc(6352);byte[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    __CLR4_4_14sc4sclck0y92o.R.inc(6353);for (int i = 0; (((i < actual.length)&&(__CLR4_4_14sc4sclck0y92o.R.iget(6354)!=0|true))||(__CLR4_4_14sc4sclck0y92o.R.iget(6355)==0&false)); ++i) {{
      __CLR4_4_14sc4sclck0y92o.R.inc(6356);assertEquals(expected[i], actual[i]);
    }
  }}finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  private static class StringHolder {
    String part1;
    String part2;

    public StringHolder(String string) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6357);
      __CLR4_4_14sc4sclck0y92o.R.inc(6358);String[] parts = string.split(":");
      __CLR4_4_14sc4sclck0y92o.R.inc(6359);part1 = parts[0];
      __CLR4_4_14sc4sclck0y92o.R.inc(6360);part2 = parts[1];
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
    public StringHolder(String part1, String part2) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6361);
      __CLR4_4_14sc4sclck0y92o.R.inc(6362);this.part1 = part1;
      __CLR4_4_14sc4sclck0y92o.R.inc(6363);this.part2 = part2;
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  }
  
  private static class StringHolderTypeAdapter implements JsonSerializer<StringHolder>, 
      JsonDeserializer<StringHolder>, InstanceCreator<StringHolder> {

    public StringHolder createInstance(Type type) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6364);
      //Fill up with objects that will be thrown away
      __CLR4_4_14sc4sclck0y92o.R.inc(6365);return new StringHolder("unknown:thing");
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

    public StringHolder deserialize(JsonElement src, Type type, 
        JsonDeserializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6366);
      __CLR4_4_14sc4sclck0y92o.R.inc(6367);return new StringHolder(src.getAsString());
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

    public JsonElement serialize(StringHolder src, Type typeOfSrc, 
        JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6368);
      __CLR4_4_14sc4sclck0y92o.R.inc(6369);String contents = src.part1 + ':' + src.part2;
      __CLR4_4_14sc4sclck0y92o.R.inc(6370);return new JsonPrimitive(contents);
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  }
  
  // Test created from Issue 70
  public void testCustomAdapterInvokedForCollectionElementSerializationWithType() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1joj36m4wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomAdapterInvokedForCollectionElementSerializationWithType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1joj36m4wz(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6371);
    __CLR4_4_14sc4sclck0y92o.R.inc(6372);Gson gson = new GsonBuilder()
      .registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter())
      .create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6373);Type setType = new TypeToken<Set<StringHolder>>() {}.getType();
    __CLR4_4_14sc4sclck0y92o.R.inc(6374);StringHolder holder = new StringHolder("Jacob", "Tomaw");
    __CLR4_4_14sc4sclck0y92o.R.inc(6375);Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
    __CLR4_4_14sc4sclck0y92o.R.inc(6376);setOfHolders.add(holder);
    __CLR4_4_14sc4sclck0y92o.R.inc(6377);String json = gson.toJson(setOfHolders, setType);
    __CLR4_4_14sc4sclck0y92o.R.inc(6378);assertTrue(json.contains("Jacob:Tomaw"));
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  // Test created from Issue 70
  public void testCustomAdapterInvokedForCollectionElementSerialization() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi3rq64x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomAdapterInvokedForCollectionElementSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi3rq64x7(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6379);
    __CLR4_4_14sc4sclck0y92o.R.inc(6380);Gson gson = new GsonBuilder()
      .registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter())
      .create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6381);StringHolder holder = new StringHolder("Jacob", "Tomaw");
    __CLR4_4_14sc4sclck0y92o.R.inc(6382);Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
    __CLR4_4_14sc4sclck0y92o.R.inc(6383);setOfHolders.add(holder);
    __CLR4_4_14sc4sclck0y92o.R.inc(6384);String json = gson.toJson(setOfHolders);
    __CLR4_4_14sc4sclck0y92o.R.inc(6385);assertTrue(json.contains("Jacob:Tomaw"));
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  // Test created from Issue 70
  public void testCustomAdapterInvokedForCollectionElementDeserialization() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdgntr4xe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomAdapterInvokedForCollectionElementDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdgntr4xe(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6386);
    __CLR4_4_14sc4sclck0y92o.R.inc(6387);Gson gson = new GsonBuilder()
      .registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter())
      .create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6388);Type setType = new TypeToken<Set<StringHolder>>() {}.getType();
    __CLR4_4_14sc4sclck0y92o.R.inc(6389);Set<StringHolder> setOfHolders = gson.fromJson("['Jacob:Tomaw']", setType);
    __CLR4_4_14sc4sclck0y92o.R.inc(6390);assertEquals(1, setOfHolders.size());
    __CLR4_4_14sc4sclck0y92o.R.inc(6391);StringHolder foo = setOfHolders.iterator().next();
    __CLR4_4_14sc4sclck0y92o.R.inc(6392);assertEquals("Jacob", foo.part1);
    __CLR4_4_14sc4sclck0y92o.R.inc(6393);assertEquals("Tomaw", foo.part2);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  // Test created from Issue 70
  public void testCustomAdapterInvokedForMapElementSerializationWithType() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8ic324xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomAdapterInvokedForMapElementSerializationWithType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8ic324xm(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6394);
    __CLR4_4_14sc4sclck0y92o.R.inc(6395);Gson gson = new GsonBuilder()
      .registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter())
      .create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6396);Type mapType = new TypeToken<Map<String,StringHolder>>() {}.getType();
    __CLR4_4_14sc4sclck0y92o.R.inc(6397);StringHolder holder = new StringHolder("Jacob", "Tomaw");
    __CLR4_4_14sc4sclck0y92o.R.inc(6398);Map<String, StringHolder> mapOfHolders = new HashMap<String, StringHolder>();
    __CLR4_4_14sc4sclck0y92o.R.inc(6399);mapOfHolders.put("foo", holder);
    __CLR4_4_14sc4sclck0y92o.R.inc(6400);String json = gson.toJson(mapOfHolders, mapType);
    __CLR4_4_14sc4sclck0y92o.R.inc(6401);assertTrue(json.contains("\"foo\":\"Jacob:Tomaw\""));
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  
  // Test created from Issue 70
  public void testCustomAdapterInvokedForMapElementSerialization() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcgsby4xu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomAdapterInvokedForMapElementSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcgsby4xu(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6402);
    __CLR4_4_14sc4sclck0y92o.R.inc(6403);Gson gson = new GsonBuilder()
      .registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter())
      .create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6404);StringHolder holder = new StringHolder("Jacob", "Tomaw");
    __CLR4_4_14sc4sclck0y92o.R.inc(6405);Map<String, StringHolder> mapOfHolders = new HashMap<String, StringHolder>();
    __CLR4_4_14sc4sclck0y92o.R.inc(6406);mapOfHolders.put("foo", holder);
    __CLR4_4_14sc4sclck0y92o.R.inc(6407);String json = gson.toJson(mapOfHolders);
    __CLR4_4_14sc4sclck0y92o.R.inc(6408);assertTrue(json.contains("\"foo\":\"Jacob:Tomaw\""));
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  // Test created from Issue 70
  public void testCustomAdapterInvokedForMapElementDeserialization() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l89x5f4y1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomAdapterInvokedForMapElementDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l89x5f4y1(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6409);
    __CLR4_4_14sc4sclck0y92o.R.inc(6410);Gson gson = new GsonBuilder()
      .registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter())
      .create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6411);Type mapType = new TypeToken<Map<String, StringHolder>>() {}.getType();
    __CLR4_4_14sc4sclck0y92o.R.inc(6412);Map<String, StringHolder> mapOfFoo = gson.fromJson("{'foo':'Jacob:Tomaw'}", mapType);
    __CLR4_4_14sc4sclck0y92o.R.inc(6413);assertEquals(1, mapOfFoo.size());
    __CLR4_4_14sc4sclck0y92o.R.inc(6414);StringHolder foo = mapOfFoo.get("foo");
    __CLR4_4_14sc4sclck0y92o.R.inc(6415);assertEquals("Jacob", foo.part1);
    __CLR4_4_14sc4sclck0y92o.R.inc(6416);assertEquals("Tomaw", foo.part2);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  public void testEnsureCustomSerializerNotInvokedForNullValues() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mskllf4y9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testEnsureCustomSerializerNotInvokedForNullValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mskllf4y9(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6417);
    __CLR4_4_14sc4sclck0y92o.R.inc(6418);Gson gson = new GsonBuilder()
        .registerTypeAdapter(DataHolder.class, new DataHolderSerializer())
        .create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6419);DataHolderWrapper target = new DataHolderWrapper(new DataHolder("abc"));
    __CLR4_4_14sc4sclck0y92o.R.inc(6420);String json = gson.toJson(target);
    __CLR4_4_14sc4sclck0y92o.R.inc(6421);assertEquals("{\"wrappedData\":{\"myData\":\"abc\"}}", json);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  public void testEnsureCustomDeserializerNotInvokedForNullValues() {__CLR4_4_14sc4sclck0y92o.R.globalSliceStart(getClass().getName(),6422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197qtzo4ye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sc4sclck0y92o.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sc4sclck0y92o.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testEnsureCustomDeserializerNotInvokedForNullValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197qtzo4ye(){try{__CLR4_4_14sc4sclck0y92o.R.inc(6422);
    __CLR4_4_14sc4sclck0y92o.R.inc(6423);Gson gson = new GsonBuilder()
        .registerTypeAdapter(DataHolder.class, new DataHolderDeserializer())
        .create();
    __CLR4_4_14sc4sclck0y92o.R.inc(6424);String json = "{wrappedData:null}";
    __CLR4_4_14sc4sclck0y92o.R.inc(6425);DataHolderWrapper actual = gson.fromJson(json, DataHolderWrapper.class);
    __CLR4_4_14sc4sclck0y92o.R.inc(6426);assertNull(actual.wrappedData);
  }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}

  private static class DataHolder {
    final String data;

    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolder() {
      this("");__CLR4_4_14sc4sclck0y92o.R.inc(6428);try{__CLR4_4_14sc4sclck0y92o.R.inc(6427);
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
    
    public DataHolder(String data) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6429);
      __CLR4_4_14sc4sclck0y92o.R.inc(6430);this.data = data;
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  }
  
  private static class DataHolderWrapper {
    final DataHolder wrappedData;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolderWrapper() {
      this(null);__CLR4_4_14sc4sclck0y92o.R.inc(6432);try{__CLR4_4_14sc4sclck0y92o.R.inc(6431);
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
    
    public DataHolderWrapper(DataHolder data) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6433);
      __CLR4_4_14sc4sclck0y92o.R.inc(6434);this.wrappedData = data;
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  }
  
  private static class DataHolderSerializer implements JsonSerializer<DataHolder> {
    public JsonElement serialize(DataHolder src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_14sc4sclck0y92o.R.inc(6435);
      __CLR4_4_14sc4sclck0y92o.R.inc(6436);JsonObject obj = new JsonObject();
      __CLR4_4_14sc4sclck0y92o.R.inc(6437);obj.addProperty("myData", src.data);
      __CLR4_4_14sc4sclck0y92o.R.inc(6438);return obj;
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  }

  private static class DataHolderDeserializer implements JsonDeserializer<DataHolder> {
    public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_14sc4sclck0y92o.R.inc(6439);
      __CLR4_4_14sc4sclck0y92o.R.inc(6440);JsonObject jsonObj = json.getAsJsonObject();
      __CLR4_4_14sc4sclck0y92o.R.inc(6441);JsonElement jsonElement = jsonObj.get("data");
      __CLR4_4_14sc4sclck0y92o.R.inc(6442);if ((((jsonElement == null || jsonElement.isJsonNull())&&(__CLR4_4_14sc4sclck0y92o.R.iget(6443)!=0|true))||(__CLR4_4_14sc4sclck0y92o.R.iget(6444)==0&false))) {{
        __CLR4_4_14sc4sclck0y92o.R.inc(6445);return new DataHolder(null);
      }
      }__CLR4_4_14sc4sclck0y92o.R.inc(6446);return new DataHolder(jsonElement.getAsString());
    }finally{__CLR4_4_14sc4sclck0y92o.R.flushNeeded();}}
  }
}
