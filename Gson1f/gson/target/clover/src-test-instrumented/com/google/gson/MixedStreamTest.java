/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
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

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

public final class MixedStreamTest extends TestCase {static class __CLR4_4_13lv3lvlck0y8up{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4793,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final Car BLUE_MUSTANG = new Car("mustang", 0x0000FF);
  private static final Car BLACK_BMW = new Car("bmw", 0x000000);
  private static final Car RED_MIATA = new Car("miata", 0xFF0000);
  private static final String CARS_JSON = "[\n"
      + "  {\n"
      + "    \"name\": \"mustang\",\n"
      + "    \"color\": 255\n"
      + "  },\n"
      + "  {\n"
      + "    \"name\": \"bmw\",\n"
      + "    \"color\": 0\n"
      + "  },\n"
      + "  {\n"
      + "    \"name\": \"miata\",\n"
      + "    \"color\": 16711680\n"
      + "  }\n"
      + "]";

  public void testWriteMixedStreamed() throws IOException {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ortvg43lv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testWriteMixedStreamed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ortvg43lv() throws IOException{try{__CLR4_4_13lv3lvlck0y8up.R.inc(4675);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4676);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4677);StringWriter stringWriter = new StringWriter();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4678);JsonWriter jsonWriter = new JsonWriter(stringWriter);

    __CLR4_4_13lv3lvlck0y8up.R.inc(4679);jsonWriter.beginArray();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4680);jsonWriter.setIndent("  ");
    __CLR4_4_13lv3lvlck0y8up.R.inc(4681);gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4682);gson.toJson(BLACK_BMW, Car.class, jsonWriter);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4683);gson.toJson(RED_MIATA, Car.class, jsonWriter);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4684);jsonWriter.endArray();

    __CLR4_4_13lv3lvlck0y8up.R.inc(4685);assertEquals(CARS_JSON, stringWriter.toString());
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

  public void testReadMixedStreamed() throws IOException {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkl6p33m6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testReadMixedStreamed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkl6p33m6() throws IOException{try{__CLR4_4_13lv3lvlck0y8up.R.inc(4686);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4687);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4688);StringReader stringReader = new StringReader(CARS_JSON);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4689);JsonReader jsonReader = new JsonReader(stringReader);

    __CLR4_4_13lv3lvlck0y8up.R.inc(4690);jsonReader.beginArray();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4691);assertEquals(BLUE_MUSTANG, gson.fromJson(jsonReader, Car.class));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4692);assertEquals(BLACK_BMW, gson.fromJson(jsonReader, Car.class));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4693);assertEquals(RED_MIATA, gson.fromJson(jsonReader, Car.class));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4694);jsonReader.endArray();
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}
  
  public void testReaderDoesNotMutateState() throws IOException {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7e0fn3mf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testReaderDoesNotMutateState",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7e0fn3mf() throws IOException{try{__CLR4_4_13lv3lvlck0y8up.R.inc(4695);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4696);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4697);JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4698);jsonReader.beginArray();

    __CLR4_4_13lv3lvlck0y8up.R.inc(4699);jsonReader.setLenient(false);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4700);gson.fromJson(jsonReader, Car.class);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4701);assertFalse(jsonReader.isLenient());

    __CLR4_4_13lv3lvlck0y8up.R.inc(4702);jsonReader.setLenient(true);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4703);gson.fromJson(jsonReader, Car.class);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4704);assertTrue(jsonReader.isLenient());
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

  public void testWriteDoesNotMutateState() throws IOException {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5l64b3mp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testWriteDoesNotMutateState",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5l64b3mp() throws IOException{try{__CLR4_4_13lv3lvlck0y8up.R.inc(4705);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4706);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4707);JsonWriter jsonWriter = new JsonWriter(new StringWriter());
    __CLR4_4_13lv3lvlck0y8up.R.inc(4708);jsonWriter.beginArray();

    __CLR4_4_13lv3lvlck0y8up.R.inc(4709);jsonWriter.setHtmlSafe(true);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4710);jsonWriter.setLenient(true);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4711);gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4712);assertTrue(jsonWriter.isHtmlSafe());
    __CLR4_4_13lv3lvlck0y8up.R.inc(4713);assertTrue(jsonWriter.isLenient());

    __CLR4_4_13lv3lvlck0y8up.R.inc(4714);jsonWriter.setHtmlSafe(false);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4715);jsonWriter.setLenient(false);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4716);gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4717);assertFalse(jsonWriter.isHtmlSafe());
    __CLR4_4_13lv3lvlck0y8up.R.inc(4718);assertFalse(jsonWriter.isLenient());
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

  public void testReadInvalidState() throws IOException {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfsi893n3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testReadInvalidState",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfsi893n3() throws IOException{try{__CLR4_4_13lv3lvlck0y8up.R.inc(4719);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4720);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4721);JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4722);jsonReader.beginArray();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4723);jsonReader.beginObject();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4724);try {
      __CLR4_4_13lv3lvlck0y8up.R.inc(4725);gson.fromJson(jsonReader, String.class);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4726);fail();
    } catch (IllegalArgumentException expected) {
    }
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

  public void testReadClosed() throws IOException {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157e9np3nb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testReadClosed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157e9np3nb() throws IOException{try{__CLR4_4_13lv3lvlck0y8up.R.inc(4727);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4728);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4729);JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4730);jsonReader.close();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4731);try {
      __CLR4_4_13lv3lvlck0y8up.R.inc(4732);gson.fromJson(jsonReader, new TypeToken<List<Car>>() {}.getType());
      __CLR4_4_13lv3lvlck0y8up.R.inc(4733);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

  public void testWriteInvalidState() throws IOException {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi4pte3ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testWriteInvalidState",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi4pte3ni() throws IOException{try{__CLR4_4_13lv3lvlck0y8up.R.inc(4734);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4735);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4736);JsonWriter jsonWriter = new JsonWriter(new StringWriter());
    __CLR4_4_13lv3lvlck0y8up.R.inc(4737);jsonWriter.beginObject();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4738);try {
      __CLR4_4_13lv3lvlck0y8up.R.inc(4739);gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4740);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

  public void testWriteClosed() throws IOException {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6am3k3np();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testWriteClosed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6am3k3np() throws IOException{try{__CLR4_4_13lv3lvlck0y8up.R.inc(4741);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4742);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4743);JsonWriter jsonWriter = new JsonWriter(new StringWriter());
    __CLR4_4_13lv3lvlck0y8up.R.inc(4744);jsonWriter.beginArray();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4745);jsonWriter.endArray();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4746);jsonWriter.close();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4747);try {
      __CLR4_4_13lv3lvlck0y8up.R.inc(4748);gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4749);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}
  
  public void testWriteNulls() {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lcn2e3ny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testWriteNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lcn2e3ny(){try{__CLR4_4_13lv3lvlck0y8up.R.inc(4750);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4751);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4752);try {
      __CLR4_4_13lv3lvlck0y8up.R.inc(4753);gson.toJson(new JsonPrimitive("hello"), (JsonWriter) null);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4754);fail();
    } catch (NullPointerException expected) {
    }

    __CLR4_4_13lv3lvlck0y8up.R.inc(4755);StringWriter stringWriter = new StringWriter();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4756);gson.toJson(null, new JsonWriter(stringWriter));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4757);assertEquals("", stringWriter.toString());
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}
  
  public void testReadNulls() {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12iju3v3o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testReadNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12iju3v3o6(){try{__CLR4_4_13lv3lvlck0y8up.R.inc(4758);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4759);Gson gson = new Gson();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4760);try {
      __CLR4_4_13lv3lvlck0y8up.R.inc(4761);gson.fromJson((JsonReader) null, Integer.class);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4762);fail();
    } catch (NullPointerException expected) {
    }
    __CLR4_4_13lv3lvlck0y8up.R.inc(4763);try {
      __CLR4_4_13lv3lvlck0y8up.R.inc(4764);gson.fromJson(new JsonReader(new StringReader("true")), null);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4765);fail();
    } catch (IllegalArgumentException expected) {
    }
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

  public void testWriteHtmlSafe() {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u4n3o3oe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testWriteHtmlSafe",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u4n3o3oe(){try{__CLR4_4_13lv3lvlck0y8up.R.inc(4766);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4767);List<String> contents = Arrays.asList("<", ">", "&", "=", "'");
    __CLR4_4_13lv3lvlck0y8up.R.inc(4768);Type type = new TypeToken<List<String>>() {}.getType();

    __CLR4_4_13lv3lvlck0y8up.R.inc(4769);StringWriter writer = new StringWriter();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4770);new Gson().toJson(contents, type, new JsonWriter(writer));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4771);assertEquals("[\"\\u003c\",\"\\u003e\",\"\\u0026\",\"\\u003d\",\"\\u0027\"]",
        writer.toString());

    __CLR4_4_13lv3lvlck0y8up.R.inc(4772);writer = new StringWriter();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4773);new GsonBuilder().disableHtmlEscaping().create()
        .toJson(contents, type, new JsonWriter(writer));
    __CLR4_4_13lv3lvlck0y8up.R.inc(4774);assertEquals("[\"<\",\">\",\"&\",\"=\",\"'\"]",
        writer.toString());
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}
  
  public void testWriteLenient() {__CLR4_4_13lv3lvlck0y8up.R.globalSliceStart(getClass().getName(),4775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172c4of3on();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13lv3lvlck0y8up.R.rethrow($CLV_t2$);}finally{__CLR4_4_13lv3lvlck0y8up.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testWriteLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172c4of3on(){try{__CLR4_4_13lv3lvlck0y8up.R.inc(4775);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4776);List<Double> doubles = Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY,
        Double.POSITIVE_INFINITY, -0.0d, 0.5d, 0.0d);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4777);Type type = new TypeToken<List<Double>>() {}.getType();

    __CLR4_4_13lv3lvlck0y8up.R.inc(4778);StringWriter writer = new StringWriter();
    __CLR4_4_13lv3lvlck0y8up.R.inc(4779);JsonWriter jsonWriter = new JsonWriter(writer);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4780);new GsonBuilder().serializeSpecialFloatingPointValues().create()
        .toJson(doubles, type, jsonWriter);
    __CLR4_4_13lv3lvlck0y8up.R.inc(4781);assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());

    __CLR4_4_13lv3lvlck0y8up.R.inc(4782);try {
      __CLR4_4_13lv3lvlck0y8up.R.inc(4783);new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
      __CLR4_4_13lv3lvlck0y8up.R.inc(4784);fail();
    } catch (IllegalArgumentException expected) {
    }
  }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

  static final class Car {
    String name;
    int color;

    Car(String name, int color) {try{__CLR4_4_13lv3lvlck0y8up.R.inc(4785);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4786);this.name = name;
      __CLR4_4_13lv3lvlck0y8up.R.inc(4787);this.color = color;
    }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

    // used by Gson
    Car() {try{__CLR4_4_13lv3lvlck0y8up.R.inc(4788);}finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

    @Override public int hashCode() {try{__CLR4_4_13lv3lvlck0y8up.R.inc(4789);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4790);return name.hashCode() ^ color;
    }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}

    @Override public boolean equals(Object o) {try{__CLR4_4_13lv3lvlck0y8up.R.inc(4791);
      __CLR4_4_13lv3lvlck0y8up.R.inc(4792);return o instanceof Car
          && ((Car) o).name.equals(name)
          && ((Car) o).color == color;
    }finally{__CLR4_4_13lv3lvlck0y8up.R.flushNeeded();}}
  }
}
