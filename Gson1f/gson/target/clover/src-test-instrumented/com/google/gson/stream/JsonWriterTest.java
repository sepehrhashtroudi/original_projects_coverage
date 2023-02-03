/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.stream;

import junit.framework.TestCase;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class JsonWriterTest extends TestCase {static class __CLR4_4_17d77d7lck0y9f7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,9835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testWrongTopLevelType() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhp3kl7d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testWrongTopLevelType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhp3kl7d7() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9547);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9548);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9549);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9550);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9551);jsonWriter.value("a");
      __CLR4_4_17d77d7lck0y9f7.R.inc(9552);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testTwoNames() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skd3857dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testTwoNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skd3857dd() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9553);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9554);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9555);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9556);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9557);jsonWriter.name("a");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9558);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9559);jsonWriter.name("a");
      __CLR4_4_17d77d7lck0y9f7.R.inc(9560);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testNameWithoutValue() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1squhv17dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNameWithoutValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1squhv17dl() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9561);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9562);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9563);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9564);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9565);jsonWriter.name("a");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9566);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9567);jsonWriter.endObject();
      __CLR4_4_17d77d7lck0y9f7.R.inc(9568);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testValueWithoutName() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1its5z97dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testValueWithoutName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1its5z97dt() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9569);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9570);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9571);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9572);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9573);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9574);jsonWriter.value(true);
      __CLR4_4_17d77d7lck0y9f7.R.inc(9575);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testMultipleTopLevelValues() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zc4upy7e0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testMultipleTopLevelValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zc4upy7e0() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9576);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9577);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9578);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9579);jsonWriter.beginArray().endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9580);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9581);jsonWriter.beginArray();
      __CLR4_4_17d77d7lck0y9f7.R.inc(9582);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testBadNestingObject() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnylb77e7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testBadNestingObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnylb77e7() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9583);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9584);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9585);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9586);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9587);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9588);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9589);jsonWriter.endArray();
      __CLR4_4_17d77d7lck0y9f7.R.inc(9590);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testBadNestingArray() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6ywmh7ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testBadNestingArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6ywmh7ef() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9591);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9592);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9593);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9594);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9595);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9596);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9597);jsonWriter.endObject();
      __CLR4_4_17d77d7lck0y9f7.R.inc(9598);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testNullName() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0kkkr7en();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0kkkr7en() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9599);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9600);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9601);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9602);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9603);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9604);jsonWriter.name(null);
      __CLR4_4_17d77d7lck0y9f7.R.inc(9605);fail();
    } catch (NullPointerException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testNullStringValue() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zcdou7eu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullStringValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zcdou7eu() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9606);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9607);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9608);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9609);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9610);jsonWriter.name("a");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9611);jsonWriter.value((String) null);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9612);jsonWriter.endObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9613);assertEquals("{\"a\":null}", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testNonFiniteDoubles() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqgtdt7f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteDoubles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqgtdt7f2() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9614);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9615);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9616);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9617);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9618);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9619);jsonWriter.value(Double.NaN);
      __CLR4_4_17d77d7lck0y9f7.R.inc(9620);fail();
    } catch (IllegalArgumentException expected) {
    }
    __CLR4_4_17d77d7lck0y9f7.R.inc(9621);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9622);jsonWriter.value(Double.NEGATIVE_INFINITY);
      __CLR4_4_17d77d7lck0y9f7.R.inc(9623);fail();
    } catch (IllegalArgumentException expected) {
    }
    __CLR4_4_17d77d7lck0y9f7.R.inc(9624);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9625);jsonWriter.value(Double.POSITIVE_INFINITY);
      __CLR4_4_17d77d7lck0y9f7.R.inc(9626);fail();
    } catch (IllegalArgumentException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testNonFiniteBoxedDoubles() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mxsuh7ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteBoxedDoubles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mxsuh7ff() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9627);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9628);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9629);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9630);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9631);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9632);jsonWriter.value(new Double(Double.NaN));
      __CLR4_4_17d77d7lck0y9f7.R.inc(9633);fail();
    } catch (IllegalArgumentException expected) {
    }
    __CLR4_4_17d77d7lck0y9f7.R.inc(9634);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9635);jsonWriter.value(new Double(Double.NEGATIVE_INFINITY));
      __CLR4_4_17d77d7lck0y9f7.R.inc(9636);fail();
    } catch (IllegalArgumentException expected) {
    }
    __CLR4_4_17d77d7lck0y9f7.R.inc(9637);try {
      __CLR4_4_17d77d7lck0y9f7.R.inc(9638);jsonWriter.value(new Double(Double.POSITIVE_INFINITY));
      __CLR4_4_17d77d7lck0y9f7.R.inc(9639);fail();
    } catch (IllegalArgumentException expected) {
    }
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testDoubles() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wl9937fs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDoubles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wl9937fs() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9640);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9641);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9642);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9643);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9644);jsonWriter.value(-0.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9645);jsonWriter.value(1.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9646);jsonWriter.value(Double.MAX_VALUE);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9647);jsonWriter.value(Double.MIN_VALUE);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9648);jsonWriter.value(0.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9649);jsonWriter.value(-0.5);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9650);jsonWriter.value(2.2250738585072014E-308);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9651);jsonWriter.value(Math.PI);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9652);jsonWriter.value(Math.E);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9653);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9654);jsonWriter.close();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9655);assertEquals("[-0.0,"
        + "1.0,"
        + "1.7976931348623157E308,"
        + "4.9E-324,"
        + "0.0,"
        + "-0.5,"
        + "2.2250738585072014E-308,"
        + "3.141592653589793,"
        + "2.718281828459045]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testLongs() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cczn107g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testLongs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cczn107g8() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9656);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9657);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9658);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9659);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9660);jsonWriter.value(0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9661);jsonWriter.value(1);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9662);jsonWriter.value(-1);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9663);jsonWriter.value(Long.MIN_VALUE);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9664);jsonWriter.value(Long.MAX_VALUE);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9665);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9666);jsonWriter.close();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9667);assertEquals("[0,"
        + "1,"
        + "-1,"
        + "-9223372036854775808,"
        + "9223372036854775807]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testNumbers() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zglep7gk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNumbers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zglep7gk() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9668);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9669);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9670);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9671);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9672);jsonWriter.value(new BigInteger("0"));
    __CLR4_4_17d77d7lck0y9f7.R.inc(9673);jsonWriter.value(new BigInteger("9223372036854775808"));
    __CLR4_4_17d77d7lck0y9f7.R.inc(9674);jsonWriter.value(new BigInteger("-9223372036854775809"));
    __CLR4_4_17d77d7lck0y9f7.R.inc(9675);jsonWriter.value(new BigDecimal("3.141592653589793238462643383"));
    __CLR4_4_17d77d7lck0y9f7.R.inc(9676);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9677);jsonWriter.close();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9678);assertEquals("[0,"
        + "9223372036854775808,"
        + "-9223372036854775809,"
        + "3.141592653589793238462643383]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testBooleans() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13svq1w7gv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testBooleans",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13svq1w7gv() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9679);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9680);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9681);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9682);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9683);jsonWriter.value(true);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9684);jsonWriter.value(false);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9685);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9686);assertEquals("[true,false]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testNulls() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qr8a737h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qr8a737h3() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9687);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9688);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9689);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9690);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9691);jsonWriter.nullValue();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9692);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9693);assertEquals("[null]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testStrings() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wvys77ha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wvys77ha() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9694);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9695);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9696);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9697);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9698);jsonWriter.value("a");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9699);jsonWriter.value("a\"");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9700);jsonWriter.value("\"");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9701);jsonWriter.value(":");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9702);jsonWriter.value(",");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9703);jsonWriter.value("\b");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9704);jsonWriter.value("\f");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9705);jsonWriter.value("\n");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9706);jsonWriter.value("\r");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9707);jsonWriter.value("\t");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9708);jsonWriter.value(" ");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9709);jsonWriter.value("\\");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9710);jsonWriter.value("{");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9711);jsonWriter.value("}");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9712);jsonWriter.value("[");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9713);jsonWriter.value("]");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9714);jsonWriter.value("\0");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9715);jsonWriter.value("");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9716);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9717);assertEquals("[\"a\","
        + "\"a\\\"\","
        + "\"\\\"\","
        + "\":\","
        + "\",\","
        + "\"\\b\","
        + "\"\\f\","
        + "\"\\n\","
        + "\"\\r\","
        + "\"\\t\","
        + "\" \","
        + "\"\\\\\","
        + "\"{\","
        + "\"}\","
        + "\"[\","
        + "\"]\","
        + "\"\\u0000\","
        + "\"\\u0019\"]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testEmptyArray() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ec0mz7hy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testEmptyArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ec0mz7hy() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9718);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9719);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9720);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9721);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9722);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9723);assertEquals("[]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testEmptyObject() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bgbl6p7i4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testEmptyObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bgbl6p7i4() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9724);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9725);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9726);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9727);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9728);jsonWriter.endObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9729);assertEquals("{}", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testObjectsInArrays() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvttm07ia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testObjectsInArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvttm07ia() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9730);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9731);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9732);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9733);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9734);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9735);jsonWriter.name("a").value(5);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9736);jsonWriter.name("b").value(false);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9737);jsonWriter.endObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9738);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9739);jsonWriter.name("c").value(6);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9740);jsonWriter.name("d").value(true);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9741);jsonWriter.endObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9742);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9743);assertEquals("[{\"a\":5,\"b\":false},"
        + "{\"c\":6,\"d\":true}]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testArraysInObjects() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qeknw67io();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testArraysInObjects",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qeknw67io() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9744);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9745);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9746);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9747);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9748);jsonWriter.name("a");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9749);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9750);jsonWriter.value(5);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9751);jsonWriter.value(false);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9752);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9753);jsonWriter.name("b");
    __CLR4_4_17d77d7lck0y9f7.R.inc(9754);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9755);jsonWriter.value(6);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9756);jsonWriter.value(true);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9757);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9758);jsonWriter.endObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9759);assertEquals("{\"a\":[5,false],"
        + "\"b\":[6,true]}", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testDeepNestingArrays() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11quh2l7j4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDeepNestingArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11quh2l7j4() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9760);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9761);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9762);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9763);for (int i = 0; (((i < 20)&&(__CLR4_4_17d77d7lck0y9f7.R.iget(9764)!=0|true))||(__CLR4_4_17d77d7lck0y9f7.R.iget(9765)==0&false)); i++) {{
      __CLR4_4_17d77d7lck0y9f7.R.inc(9766);jsonWriter.beginArray();
    }
    }__CLR4_4_17d77d7lck0y9f7.R.inc(9767);for (int i = 0; (((i < 20)&&(__CLR4_4_17d77d7lck0y9f7.R.iget(9768)!=0|true))||(__CLR4_4_17d77d7lck0y9f7.R.iget(9769)==0&false)); i++) {{
      __CLR4_4_17d77d7lck0y9f7.R.inc(9770);jsonWriter.endArray();
    }
    }__CLR4_4_17d77d7lck0y9f7.R.inc(9771);assertEquals("[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testDeepNestingObjects() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12404337jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDeepNestingObjects",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12404337jg() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9772);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9773);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9774);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9775);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9776);for (int i = 0; (((i < 20)&&(__CLR4_4_17d77d7lck0y9f7.R.iget(9777)!=0|true))||(__CLR4_4_17d77d7lck0y9f7.R.iget(9778)==0&false)); i++) {{
      __CLR4_4_17d77d7lck0y9f7.R.inc(9779);jsonWriter.name("a");
      __CLR4_4_17d77d7lck0y9f7.R.inc(9780);jsonWriter.beginObject();
    }
    }__CLR4_4_17d77d7lck0y9f7.R.inc(9781);for (int i = 0; (((i < 20)&&(__CLR4_4_17d77d7lck0y9f7.R.iget(9782)!=0|true))||(__CLR4_4_17d77d7lck0y9f7.R.iget(9783)==0&false)); i++) {{
      __CLR4_4_17d77d7lck0y9f7.R.inc(9784);jsonWriter.endObject();
    }
    }__CLR4_4_17d77d7lck0y9f7.R.inc(9785);jsonWriter.endObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9786);assertEquals("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":"
        + "{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{"
        + "}}}}}}}}}}}}}}}}}}}}}", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testRepeatedName() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbyk027jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testRepeatedName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbyk027jv() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9787);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9788);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9789);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9790);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9791);jsonWriter.name("a").value(true);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9792);jsonWriter.name("a").value(false);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9793);jsonWriter.endObject();
    // JsonWriter doesn't attempt to detect duplicate names
    __CLR4_4_17d77d7lck0y9f7.R.inc(9794);assertEquals("{\"a\":true,\"a\":false}", stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testPrettyPrintObject() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3ukaz7k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testPrettyPrintObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3ukaz7k3() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9795);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9796);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9797);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9798);jsonWriter.setIndent("   ");

    __CLR4_4_17d77d7lck0y9f7.R.inc(9799);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9800);jsonWriter.name("a").value(true);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9801);jsonWriter.name("b").value(false);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9802);jsonWriter.name("c").value(5.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9803);jsonWriter.name("e").nullValue();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9804);jsonWriter.name("f").beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9805);jsonWriter.value(6.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9806);jsonWriter.value(7.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9807);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9808);jsonWriter.name("g").beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9809);jsonWriter.name("h").value(8.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9810);jsonWriter.name("i").value(9.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9811);jsonWriter.endObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9812);jsonWriter.endObject();

    __CLR4_4_17d77d7lck0y9f7.R.inc(9813);String expected = "{\n"
        + "   \"a\": true,\n"
        + "   \"b\": false,\n"
        + "   \"c\": 5.0,\n"
        + "   \"e\": null,\n"
        + "   \"f\": [\n"
        + "      6.0,\n"
        + "      7.0\n"
        + "   ],\n"
        + "   \"g\": {\n"
        + "      \"h\": 8.0,\n"
        + "      \"i\": 9.0\n"
        + "   }\n"
        + "}";
    __CLR4_4_17d77d7lck0y9f7.R.inc(9814);assertEquals(expected, stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}

  public void testPrettyPrintArray() throws IOException {__CLR4_4_17d77d7lck0y9f7.R.globalSliceStart(getClass().getName(),9815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjt8ed7kn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17d77d7lck0y9f7.R.rethrow($CLV_t2$);}finally{__CLR4_4_17d77d7lck0y9f7.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testPrettyPrintArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjt8ed7kn() throws IOException{try{__CLR4_4_17d77d7lck0y9f7.R.inc(9815);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9816);StringWriter stringWriter = new StringWriter();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9817);JsonWriter jsonWriter = new JsonWriter(stringWriter);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9818);jsonWriter.setIndent("   ");

    __CLR4_4_17d77d7lck0y9f7.R.inc(9819);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9820);jsonWriter.value(true);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9821);jsonWriter.value(false);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9822);jsonWriter.value(5.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9823);jsonWriter.nullValue();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9824);jsonWriter.beginObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9825);jsonWriter.name("a").value(6.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9826);jsonWriter.name("b").value(7.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9827);jsonWriter.endObject();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9828);jsonWriter.beginArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9829);jsonWriter.value(8.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9830);jsonWriter.value(9.0);
    __CLR4_4_17d77d7lck0y9f7.R.inc(9831);jsonWriter.endArray();
    __CLR4_4_17d77d7lck0y9f7.R.inc(9832);jsonWriter.endArray();

    __CLR4_4_17d77d7lck0y9f7.R.inc(9833);String expected = "[\n"
        + "   true,\n"
        + "   false,\n"
        + "   5.0,\n"
        + "   null,\n"
        + "   {\n"
        + "      \"a\": 6.0,\n"
        + "      \"b\": 7.0\n"
        + "   },\n"
        + "   [\n"
        + "      8.0,\n"
        + "      9.0\n"
        + "   ]\n"
        + "]";
    __CLR4_4_17d77d7lck0y9f7.R.inc(9834);assertEquals(expected, stringWriter.toString());
  }finally{__CLR4_4_17d77d7lck0y9f7.R.flushNeeded();}}
}
