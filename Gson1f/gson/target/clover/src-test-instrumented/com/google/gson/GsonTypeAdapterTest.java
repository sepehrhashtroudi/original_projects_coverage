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

package com.google.gson;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Contains numerous tests involving registered type converters with a Gson instance.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class GsonTypeAdapterTest extends TestCase {static class __CLR4_4_1388388lck0y8rm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4220,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_1388388lck0y8rm.R.inc(4184);
    __CLR4_4_1388388lck0y8rm.R.inc(4185);super.setUp();
    __CLR4_4_1388388lck0y8rm.R.inc(4186);gson = new GsonBuilder()
        .registerTypeAdapter(AtomicLong.class, new ExceptionTypeAdapter())
        .registerTypeAdapter(AtomicInteger.class, new AtomicIntegerTypeAdapter())
        .create();
  }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}

  public void testDefaultTypeAdapterThrowsParseException() throws Exception {__CLR4_4_1388388lck0y8rm.R.globalSliceStart(getClass().getName(),4187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nezwty38b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1388388lck0y8rm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1388388lck0y8rm.R.globalSliceEnd(getClass().getName(),"com.google.gson.GsonTypeAdapterTest.testDefaultTypeAdapterThrowsParseException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nezwty38b() throws Exception{try{__CLR4_4_1388388lck0y8rm.R.inc(4187);
    __CLR4_4_1388388lck0y8rm.R.inc(4188);try {
      __CLR4_4_1388388lck0y8rm.R.inc(4189);gson.fromJson("{\"abc\":123}", BigInteger.class);
      __CLR4_4_1388388lck0y8rm.R.inc(4190);fail("Should have thrown a JsonParseException");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}

  public void testTypeAdapterThrowsException() throws Exception {__CLR4_4_1388388lck0y8rm.R.globalSliceStart(getClass().getName(),4191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5b5pi38f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1388388lck0y8rm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1388388lck0y8rm.R.globalSliceEnd(getClass().getName(),"com.google.gson.GsonTypeAdapterTest.testTypeAdapterThrowsException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5b5pi38f() throws Exception{try{__CLR4_4_1388388lck0y8rm.R.inc(4191);
    __CLR4_4_1388388lck0y8rm.R.inc(4192);try {
      __CLR4_4_1388388lck0y8rm.R.inc(4193);gson.toJson(new AtomicLong(0));
      __CLR4_4_1388388lck0y8rm.R.inc(4194);fail("Type Adapter should have thrown an exception");
    } catch (IllegalStateException expected) { }

    __CLR4_4_1388388lck0y8rm.R.inc(4195);try {
      __CLR4_4_1388388lck0y8rm.R.inc(4196);gson.fromJson("123", AtomicLong.class);
      __CLR4_4_1388388lck0y8rm.R.inc(4197);fail("Type Adapter should have thrown an exception");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}

  public void testTypeAdapterProperlyConvertsTypes() throws Exception {__CLR4_4_1388388lck0y8rm.R.globalSliceStart(getClass().getName(),4198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gktvgg38m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1388388lck0y8rm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1388388lck0y8rm.R.globalSliceEnd(getClass().getName(),"com.google.gson.GsonTypeAdapterTest.testTypeAdapterProperlyConvertsTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gktvgg38m() throws Exception{try{__CLR4_4_1388388lck0y8rm.R.inc(4198);
    __CLR4_4_1388388lck0y8rm.R.inc(4199);int intialValue = 1;
    __CLR4_4_1388388lck0y8rm.R.inc(4200);AtomicInteger atomicInt = new AtomicInteger(intialValue);
    __CLR4_4_1388388lck0y8rm.R.inc(4201);String json = gson.toJson(atomicInt);
    __CLR4_4_1388388lck0y8rm.R.inc(4202);assertEquals(intialValue + 1, Integer.parseInt(json));

    __CLR4_4_1388388lck0y8rm.R.inc(4203);atomicInt = gson.fromJson(json, AtomicInteger.class);
    __CLR4_4_1388388lck0y8rm.R.inc(4204);assertEquals(intialValue, atomicInt.get());
  }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}

  public void testTypeAdapterDoesNotAffectNonAdaptedTypes() throws Exception {__CLR4_4_1388388lck0y8rm.R.globalSliceStart(getClass().getName(),4205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i86mao38t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1388388lck0y8rm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1388388lck0y8rm.R.globalSliceEnd(getClass().getName(),"com.google.gson.GsonTypeAdapterTest.testTypeAdapterDoesNotAffectNonAdaptedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i86mao38t() throws Exception{try{__CLR4_4_1388388lck0y8rm.R.inc(4205);
    __CLR4_4_1388388lck0y8rm.R.inc(4206);String expected = "blah";
    __CLR4_4_1388388lck0y8rm.R.inc(4207);String actual = gson.toJson(expected);
    __CLR4_4_1388388lck0y8rm.R.inc(4208);assertEquals("\"" + expected + "\"", actual);

    __CLR4_4_1388388lck0y8rm.R.inc(4209);actual = gson.fromJson(actual, String.class);
    __CLR4_4_1388388lck0y8rm.R.inc(4210);assertEquals(expected, actual);
  }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}

  private static class ExceptionTypeAdapter
      implements JsonSerializer<AtomicLong>, JsonDeserializer<AtomicLong> {
    public JsonElement serialize(
        AtomicLong src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_1388388lck0y8rm.R.inc(4211);
      __CLR4_4_1388388lck0y8rm.R.inc(4212);throw new IllegalStateException();
    }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}

    public AtomicLong deserialize(
        JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_1388388lck0y8rm.R.inc(4213);
      __CLR4_4_1388388lck0y8rm.R.inc(4214);throw new IllegalStateException();
    }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}
  }

  private static class AtomicIntegerTypeAdapter
      implements JsonSerializer<AtomicInteger>, JsonDeserializer<AtomicInteger> {
    public JsonElement serialize(AtomicInteger src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_1388388lck0y8rm.R.inc(4215);
      __CLR4_4_1388388lck0y8rm.R.inc(4216);return new JsonPrimitive(src.incrementAndGet());
    }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}

    public AtomicInteger deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_1388388lck0y8rm.R.inc(4217);
      __CLR4_4_1388388lck0y8rm.R.inc(4218);int intValue = json.getAsInt();
      __CLR4_4_1388388lck0y8rm.R.inc(4219);return new AtomicInteger(--intValue);
    }finally{__CLR4_4_1388388lck0y8rm.R.flushNeeded();}}
  }
}
