/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2009 Google Inc.
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.Base;
import com.google.gson.common.TestTypes.BaseSerializer;
import com.google.gson.common.TestTypes.ClassWithBaseArrayField;
import com.google.gson.common.TestTypes.ClassWithBaseField;
import com.google.gson.common.TestTypes.Sub;
import com.google.gson.common.TestTypes.SubSerializer;

import junit.framework.TestCase;

import java.lang.reflect.Type;

/**
 * Functional Test exercising custom serialization only.  When test applies to both
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 *
 * @author Inderjeet Singh
 */
public class CustomSerializerTest extends TestCase {static class __CLR4_4_14rg4rglck0y91i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6204,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

   public void testBaseClassSerializerInvokedForBaseClassFields() {__CLR4_4_14rg4rglck0y91i.R.globalSliceStart(getClass().getName(),6172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkzler4rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rg4rglck0y91i.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rg4rglck0y91i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomSerializerTest.testBaseClassSerializerInvokedForBaseClassFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkzler4rg(){try{__CLR4_4_14rg4rglck0y91i.R.inc(6172);
     __CLR4_4_14rg4rglck0y91i.R.inc(6173);Gson gson = new GsonBuilder()
         .registerTypeAdapter(Base.class, new BaseSerializer())
         .registerTypeAdapter(Sub.class, new SubSerializer())
         .create();
     __CLR4_4_14rg4rglck0y91i.R.inc(6174);ClassWithBaseField target = new ClassWithBaseField(new Base());
     __CLR4_4_14rg4rglck0y91i.R.inc(6175);JsonObject json = (JsonObject) gson.toJsonTree(target);
     __CLR4_4_14rg4rglck0y91i.R.inc(6176);JsonObject base = json.get("base").getAsJsonObject();
     __CLR4_4_14rg4rglck0y91i.R.inc(6177);assertEquals(BaseSerializer.NAME, base.get(Base.SERIALIZER_KEY).getAsString());
   }finally{__CLR4_4_14rg4rglck0y91i.R.flushNeeded();}}

   public void testSubClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances() {__CLR4_4_14rg4rglck0y91i.R.globalSliceStart(getClass().getName(),6178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fiu29b4rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rg4rglck0y91i.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rg4rglck0y91i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomSerializerTest.testSubClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fiu29b4rm(){try{__CLR4_4_14rg4rglck0y91i.R.inc(6178);
     __CLR4_4_14rg4rglck0y91i.R.inc(6179);Gson gson = new GsonBuilder()
         .registerTypeAdapter(Base.class, new BaseSerializer())
         .registerTypeAdapter(Sub.class, new SubSerializer())
         .create();
     __CLR4_4_14rg4rglck0y91i.R.inc(6180);ClassWithBaseField target = new ClassWithBaseField(new Sub());
     __CLR4_4_14rg4rglck0y91i.R.inc(6181);JsonObject json = (JsonObject) gson.toJsonTree(target);
     __CLR4_4_14rg4rglck0y91i.R.inc(6182);JsonObject base = json.get("base").getAsJsonObject();
     __CLR4_4_14rg4rglck0y91i.R.inc(6183);assertEquals(SubSerializer.NAME, base.get(Base.SERIALIZER_KEY).getAsString());
   }finally{__CLR4_4_14rg4rglck0y91i.R.flushNeeded();}}

   public void testSubClassSerializerInvokedForBaseClassFieldsHoldingArrayOfSubClassInstances() {__CLR4_4_14rg4rglck0y91i.R.globalSliceStart(getClass().getName(),6184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chaz894rs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rg4rglck0y91i.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rg4rglck0y91i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomSerializerTest.testSubClassSerializerInvokedForBaseClassFieldsHoldingArrayOfSubClassInstances",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chaz894rs(){try{__CLR4_4_14rg4rglck0y91i.R.inc(6184);
     __CLR4_4_14rg4rglck0y91i.R.inc(6185);Gson gson = new GsonBuilder()
         .registerTypeAdapter(Base.class, new BaseSerializer())
         .registerTypeAdapter(Sub.class, new SubSerializer())
         .create();
     __CLR4_4_14rg4rglck0y91i.R.inc(6186);ClassWithBaseArrayField target = new ClassWithBaseArrayField(new Base[] {new Sub(), new Sub()});
     __CLR4_4_14rg4rglck0y91i.R.inc(6187);JsonObject json = (JsonObject) gson.toJsonTree(target);
     __CLR4_4_14rg4rglck0y91i.R.inc(6188);JsonArray array = json.get("base").getAsJsonArray();
     __CLR4_4_14rg4rglck0y91i.R.inc(6189);for (JsonElement element : array) {{
       __CLR4_4_14rg4rglck0y91i.R.inc(6190);JsonElement serializerKey = element.getAsJsonObject().get(Base.SERIALIZER_KEY);
      __CLR4_4_14rg4rglck0y91i.R.inc(6191);assertEquals(SubSerializer.NAME, serializerKey.getAsString());
     }
   }}finally{__CLR4_4_14rg4rglck0y91i.R.flushNeeded();}}

   public void testBaseClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances() {__CLR4_4_14rg4rglck0y91i.R.globalSliceStart(getClass().getName(),6192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flayee4s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rg4rglck0y91i.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rg4rglck0y91i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomSerializerTest.testBaseClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flayee4s0(){try{__CLR4_4_14rg4rglck0y91i.R.inc(6192);
     __CLR4_4_14rg4rglck0y91i.R.inc(6193);Gson gson = new GsonBuilder()
         .registerTypeAdapter(Base.class, new BaseSerializer())
         .create();
     __CLR4_4_14rg4rglck0y91i.R.inc(6194);ClassWithBaseField target = new ClassWithBaseField(new Sub());
     __CLR4_4_14rg4rglck0y91i.R.inc(6195);JsonObject json = (JsonObject) gson.toJsonTree(target);
     __CLR4_4_14rg4rglck0y91i.R.inc(6196);JsonObject base = json.get("base").getAsJsonObject();
     __CLR4_4_14rg4rglck0y91i.R.inc(6197);assertEquals(BaseSerializer.NAME, base.get(Base.SERIALIZER_KEY).getAsString());
   }finally{__CLR4_4_14rg4rglck0y91i.R.flushNeeded();}}

   public void testSerializerReturnsNull() {__CLR4_4_14rg4rglck0y91i.R.globalSliceStart(getClass().getName(),6198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e4fyx94s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rg4rglck0y91i.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rg4rglck0y91i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomSerializerTest.testSerializerReturnsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e4fyx94s6(){try{__CLR4_4_14rg4rglck0y91i.R.inc(6198);
     __CLR4_4_14rg4rglck0y91i.R.inc(6199);Gson gson = new GsonBuilder()
       .registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
         public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_14rg4rglck0y91i.R.inc(6200);
           __CLR4_4_14rg4rglck0y91i.R.inc(6201);return null;
         }finally{__CLR4_4_14rg4rglck0y91i.R.flushNeeded();}}
       })
       .create();
       __CLR4_4_14rg4rglck0y91i.R.inc(6202);JsonElement json = gson.toJsonTree(new Base());
       __CLR4_4_14rg4rglck0y91i.R.inc(6203);assertTrue(json.isJsonNull());
   }finally{__CLR4_4_14rg4rglck0y91i.R.flushNeeded();}}
}
