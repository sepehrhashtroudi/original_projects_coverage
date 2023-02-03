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
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.common.TestTypes.Base;
import com.google.gson.common.TestTypes.ClassWithBaseField;

import junit.framework.TestCase;

import java.lang.reflect.Type;

/**
 * Functional Test exercising custom deserialization only.  When test applies to both 
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 *
 * @author Joel Leitch
 */
public class CustomDeserializerTest extends TestCase {static class __CLR4_4_14p44p4lck0y919{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final String DEFAULT_VALUE = "test123";
  private static final String SUFFIX = "blah";
  
  private Gson gson;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14p44p4lck0y919.R.inc(6088);
    __CLR4_4_14p44p4lck0y919.R.inc(6089);super.setUp();
    __CLR4_4_14p44p4lck0y919.R.inc(6090);gson = new GsonBuilder().registerTypeAdapter(DataHolder.class, new DataHolderDeserializer()).create();
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
  
  public void testDefaultConstructorNotCalledOnObject() throws Exception {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipivka4p7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testDefaultConstructorNotCalledOnObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipivka4p7() throws Exception{try{__CLR4_4_14p44p4lck0y919.R.inc(6091);
    __CLR4_4_14p44p4lck0y919.R.inc(6092);DataHolder data = new DataHolder(DEFAULT_VALUE);
    __CLR4_4_14p44p4lck0y919.R.inc(6093);String json = gson.toJson(data);
    
    __CLR4_4_14p44p4lck0y919.R.inc(6094);DataHolder actual = gson.fromJson(json, DataHolder.class);
    __CLR4_4_14p44p4lck0y919.R.inc(6095);assertEquals(DEFAULT_VALUE + SUFFIX, actual.getData());
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
  
  public void testDefaultConstructorNotCalledOnField() throws Exception {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qddnhf4pc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testDefaultConstructorNotCalledOnField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qddnhf4pc() throws Exception{try{__CLR4_4_14p44p4lck0y919.R.inc(6096);
    __CLR4_4_14p44p4lck0y919.R.inc(6097);DataHolderWrapper dataWrapper = new DataHolderWrapper(new DataHolder(DEFAULT_VALUE));
    __CLR4_4_14p44p4lck0y919.R.inc(6098);String json = gson.toJson(dataWrapper);
    
    __CLR4_4_14p44p4lck0y919.R.inc(6099);DataHolderWrapper actual = gson.fromJson(json, DataHolderWrapper.class);
    __CLR4_4_14p44p4lck0y919.R.inc(6100);assertEquals(DEFAULT_VALUE + SUFFIX, actual.getWrappedData().getData());
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}

  private static class DataHolder {
    private final String data;

    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolder() {try{__CLR4_4_14p44p4lck0y919.R.inc(6101);
      __CLR4_4_14p44p4lck0y919.R.inc(6102);throw new IllegalStateException();
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
    
    public DataHolder(String data) {try{__CLR4_4_14p44p4lck0y919.R.inc(6103);
      __CLR4_4_14p44p4lck0y919.R.inc(6104);this.data = data;
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
    
    public String getData() {try{__CLR4_4_14p44p4lck0y919.R.inc(6105);
      __CLR4_4_14p44p4lck0y919.R.inc(6106);return data;
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
  }
  
  private static class DataHolderWrapper {
    private final DataHolder wrappedData;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolderWrapper() {
      this(new DataHolder(DEFAULT_VALUE));__CLR4_4_14p44p4lck0y919.R.inc(6108);try{__CLR4_4_14p44p4lck0y919.R.inc(6107);
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
    
    public DataHolderWrapper(DataHolder data) {try{__CLR4_4_14p44p4lck0y919.R.inc(6109);
      __CLR4_4_14p44p4lck0y919.R.inc(6110);this.wrappedData = data;
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}

    public DataHolder getWrappedData() {try{__CLR4_4_14p44p4lck0y919.R.inc(6111);
      __CLR4_4_14p44p4lck0y919.R.inc(6112);return wrappedData;
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
  }
  
  private static class DataHolderDeserializer implements JsonDeserializer<DataHolder> {
    public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_14p44p4lck0y919.R.inc(6113);
      __CLR4_4_14p44p4lck0y919.R.inc(6114);JsonObject jsonObj = json.getAsJsonObject();
      __CLR4_4_14p44p4lck0y919.R.inc(6115);String dataString = jsonObj.get("data").getAsString();
      __CLR4_4_14p44p4lck0y919.R.inc(6116);return new DataHolder(dataString + SUFFIX);
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
  }
  
  public void testJsonTypeFieldBasedDeserialization() {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_190mhyh4px();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testJsonTypeFieldBasedDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_190mhyh4px(){try{__CLR4_4_14p44p4lck0y919.R.inc(6117);
    __CLR4_4_14p44p4lck0y919.R.inc(6118);String json = "{field1:'abc',field2:'def',__type__:'SUB_TYPE1'}";
    __CLR4_4_14p44p4lck0y919.R.inc(6119);Gson gson = new GsonBuilder().registerTypeAdapter(MyBase.class, new JsonDeserializer<MyBase>() {
      public MyBase deserialize(JsonElement json, Type pojoType,
          JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_14p44p4lck0y919.R.inc(6120);
        __CLR4_4_14p44p4lck0y919.R.inc(6121);String type = json.getAsJsonObject().get(MyBase.TYPE_ACCESS).getAsString();
        __CLR4_4_14p44p4lck0y919.R.inc(6122);return context.deserialize(json, SubTypes.valueOf(type).getSubclass());
      }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
    }).create();    
    __CLR4_4_14p44p4lck0y919.R.inc(6123);SubType1 target = (SubType1) gson.fromJson(json, MyBase.class);
    __CLR4_4_14p44p4lck0y919.R.inc(6124);assertEquals("abc", target.field1);    
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}

  private static class MyBase {
    static final String TYPE_ACCESS = "__type__";
  }

  private enum SubTypes { 
    SUB_TYPE1(SubType1.class),
    SUB_TYPE2(SubType2.class);
    private final Type subClass;
    private SubTypes(Type subClass) {try{__CLR4_4_14p44p4lck0y919.R.inc(6125);
      __CLR4_4_14p44p4lck0y919.R.inc(6126);this.subClass = subClass;
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
    public Type getSubclass() {try{__CLR4_4_14p44p4lck0y919.R.inc(6127);
      __CLR4_4_14p44p4lck0y919.R.inc(6128);return subClass;
    }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
  }

  private static class SubType1 extends MyBase {
    String field1;    
  }

  private static class SubType2 extends MyBase {
    @SuppressWarnings("unused")
    String field2;    
  }
  
  public void testCustomDeserializerReturnsNullForTopLevelObject() {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzbrg64q9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNullForTopLevelObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzbrg64q9(){try{__CLR4_4_14p44p4lck0y919.R.inc(6129);
    __CLR4_4_14p44p4lck0y919.R.inc(6130);Gson gson = new GsonBuilder()
      .registerTypeAdapter(Base.class, new JsonDeserializer<Base>() {
        public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {try{__CLR4_4_14p44p4lck0y919.R.inc(6131);
          __CLR4_4_14p44p4lck0y919.R.inc(6132);return null;
        }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
      }).create();
    __CLR4_4_14p44p4lck0y919.R.inc(6133);String json = "{baseName:'Base',subName:'SubRevised'}";
    __CLR4_4_14p44p4lck0y919.R.inc(6134);Base target = gson.fromJson(json, Base.class);
    __CLR4_4_14p44p4lck0y919.R.inc(6135);assertNull(target);
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}

  public void testCustomDeserializerReturnsNull() {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxdovv4qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxdovv4qg(){try{__CLR4_4_14p44p4lck0y919.R.inc(6136);
    __CLR4_4_14p44p4lck0y919.R.inc(6137);Gson gson = new GsonBuilder()
      .registerTypeAdapter(Base.class, new JsonDeserializer<Base>() {
        public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {try{__CLR4_4_14p44p4lck0y919.R.inc(6138);
          __CLR4_4_14p44p4lck0y919.R.inc(6139);return null;
        }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
      }).create();
    __CLR4_4_14p44p4lck0y919.R.inc(6140);String json = "{base:{baseName:'Base',subName:'SubRevised'}}";
    __CLR4_4_14p44p4lck0y919.R.inc(6141);ClassWithBaseField target = gson.fromJson(json, ClassWithBaseField.class);
    __CLR4_4_14p44p4lck0y919.R.inc(6142);assertNull(target.base);
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}

  public void testCustomDeserializerReturnsNullForTopLevelPrimitives() {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bx6sbb4qn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNullForTopLevelPrimitives",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bx6sbb4qn(){try{__CLR4_4_14p44p4lck0y919.R.inc(6143);
    __CLR4_4_14p44p4lck0y919.R.inc(6144);Gson gson = new GsonBuilder()
      .registerTypeAdapter(long.class, new JsonDeserializer<Long>() {
        public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {try{__CLR4_4_14p44p4lck0y919.R.inc(6145);
          __CLR4_4_14p44p4lck0y919.R.inc(6146);return null;
        }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
      }).create();
    __CLR4_4_14p44p4lck0y919.R.inc(6147);String json = "10";
    __CLR4_4_14p44p4lck0y919.R.inc(6148);assertNull(gson.fromJson(json, long.class));
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}

  public void testCustomDeserializerReturnsNullForPrimitiveFields() {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggp2b64qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNullForPrimitiveFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggp2b64qt(){try{__CLR4_4_14p44p4lck0y919.R.inc(6149);
    __CLR4_4_14p44p4lck0y919.R.inc(6150);Gson gson = new GsonBuilder()
      .registerTypeAdapter(long.class, new JsonDeserializer<Long>() {
        public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {try{__CLR4_4_14p44p4lck0y919.R.inc(6151);
          __CLR4_4_14p44p4lck0y919.R.inc(6152);return null;
        }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
      }).create();
    __CLR4_4_14p44p4lck0y919.R.inc(6153);String json = "{field:10}";
    __CLR4_4_14p44p4lck0y919.R.inc(6154);ClassWithLong target = gson.fromJson(json, ClassWithLong.class);
    __CLR4_4_14p44p4lck0y919.R.inc(6155);assertEquals(0, target.field);
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
  private static class ClassWithLong {
    long field;
  }
 
  public void testCustomDeserializerReturnsNullForArrayElements() {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxa34u4r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNullForArrayElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxa34u4r0(){try{__CLR4_4_14p44p4lck0y919.R.inc(6156);
    __CLR4_4_14p44p4lck0y919.R.inc(6157);Gson gson = new GsonBuilder()
      .registerTypeAdapter(Base.class, new JsonDeserializer<Base>() {
        public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {try{__CLR4_4_14p44p4lck0y919.R.inc(6158);
          __CLR4_4_14p44p4lck0y919.R.inc(6159);return null;
        }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
      }).create();
    __CLR4_4_14p44p4lck0y919.R.inc(6160);String json = "[{baseName:'Base'},{baseName:'Base'}]";
    __CLR4_4_14p44p4lck0y919.R.inc(6161);Base[] target = gson.fromJson(json, Base[].class);
    __CLR4_4_14p44p4lck0y919.R.inc(6162);assertNull(target[0]);
    __CLR4_4_14p44p4lck0y919.R.inc(6163);assertNull(target[1]);
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}

  public void testCustomDeserializerReturnsNullForArrayElementsForArrayField() {__CLR4_4_14p44p4lck0y919.R.globalSliceStart(getClass().getName(),6164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tc968a4r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14p44p4lck0y919.R.rethrow($CLV_t2$);}finally{__CLR4_4_14p44p4lck0y919.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNullForArrayElementsForArrayField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tc968a4r8(){try{__CLR4_4_14p44p4lck0y919.R.inc(6164);
    __CLR4_4_14p44p4lck0y919.R.inc(6165);Gson gson = new GsonBuilder()
      .registerTypeAdapter(Base.class, new JsonDeserializer<Base>() {
        public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {try{__CLR4_4_14p44p4lck0y919.R.inc(6166);
          __CLR4_4_14p44p4lck0y919.R.inc(6167);return null;
        }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}
      }).create();
    __CLR4_4_14p44p4lck0y919.R.inc(6168);String json = "{bases:[{baseName:'Base'},{baseName:'Base'}]}";
    __CLR4_4_14p44p4lck0y919.R.inc(6169);ClassWithBaseArray target = gson.fromJson(json, ClassWithBaseArray.class);
    __CLR4_4_14p44p4lck0y919.R.inc(6170);assertNull(target.bases[0]);
    __CLR4_4_14p44p4lck0y919.R.inc(6171);assertNull(target.bases[1]);
  }finally{__CLR4_4_14p44p4lck0y919.R.flushNeeded();}}

  private static class ClassWithBaseArray {
    Base[] bases;
  }
}
