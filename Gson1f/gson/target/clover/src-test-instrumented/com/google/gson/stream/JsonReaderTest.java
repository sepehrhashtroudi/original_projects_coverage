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
import java.io.StringReader;

public final class JsonReaderTest extends TestCase {static class __CLR4_4_16zh6zhlck0y9ek{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,9547,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testReadArray() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ercfzc6zh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ercfzc6zh() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9053);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9054);JsonReader reader = new JsonReader(new StringReader("[true, true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9055);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9056);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9057);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9058);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9059);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testReadEmptyArray() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aedm856zo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadEmptyArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aedm856zo() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9060);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9061);JsonReader reader = new JsonReader(new StringReader("[]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9062);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9063);assertFalse(reader.hasNext());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9064);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9065);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testReadObject() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynpgj66zu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynpgj66zu() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9066);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9067);JsonReader reader = new JsonReader(new StringReader(
        "{\"a\": \"android\", \"b\": \"banana\"}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9068);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9069);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9070);assertEquals("android", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9071);assertEquals("b", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9072);assertEquals("banana", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9073);reader.endObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9074);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testReadEmptyObject() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th63wr703();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadEmptyObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th63wr703() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9075);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9076);JsonReader reader = new JsonReader(new StringReader("{}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9077);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9078);assertFalse(reader.hasNext());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9079);reader.endObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9080);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testSkipObject() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ik2l3709();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testSkipObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ik2l3709() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9081);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9082);JsonReader reader = new JsonReader(new StringReader(
        "{\"a\": { \"c\": [], \"d\": [true, true, {}] }, \"b\": \"banana\"}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9083);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9084);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9085);reader.skipValue();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9086);assertEquals("b", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9087);reader.skipValue();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9088);reader.endObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9089);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testHelloWorld() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yo6ntl70i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testHelloWorld",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yo6ntl70i() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9090);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9091);String json = "{\n" +
        "   \"hello\": true,\n" +
        "   \"foo\": [\"world\"]\n" +
        "}";
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9092);JsonReader reader = new JsonReader(new StringReader(json));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9093);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9094);assertEquals("hello", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9095);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9096);assertEquals("foo", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9097);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9098);assertEquals("world", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9099);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9100);reader.endObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9101);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testNulls() {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qr8a7370u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qr8a7370u(){try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9102);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9103);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9104);new JsonReader(null);
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9105);fail();
    } catch (NullPointerException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testEmptyString() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzzl3n70y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testEmptyString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzzl3n70y() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9106);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9107);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9108);new JsonReader(new StringReader("")).beginArray();
    } catch (IOException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9109);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9110);new JsonReader(new StringReader("")).beginObject();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testNoTopLevelObject() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdc6ko713();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNoTopLevelObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdc6ko713() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9111);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9112);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9113);new JsonReader(new StringReader("true")).nextBoolean();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testCharacterUnescaping() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150jcqd716();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testCharacterUnescaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150jcqd716() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9114);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9115);String json = "[\"a\","
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
        + "\"\\u0019\","
        + "\"\\u20AC\""
        + "]";
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9116);JsonReader reader = new JsonReader(new StringReader(json));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9117);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9118);assertEquals("a", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9119);assertEquals("a\"", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9120);assertEquals("\"", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9121);assertEquals(":", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9122);assertEquals(",", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9123);assertEquals("\b", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9124);assertEquals("\f", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9125);assertEquals("\n", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9126);assertEquals("\r", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9127);assertEquals("\t", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9128);assertEquals(" ", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9129);assertEquals("\\", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9130);assertEquals("{", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9131);assertEquals("}", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9132);assertEquals("[", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9133);assertEquals("]", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9134);assertEquals("\0", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9135);assertEquals("", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9136);assertEquals("\u20ac", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9137);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9138);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testIntegersWithFractionalPartSpecified() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s3ox3q71v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testIntegersWithFractionalPartSpecified",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s3ox3q71v() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9139);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9140);JsonReader reader = new JsonReader(new StringReader("[1.0,1.0,1.0]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9141);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9142);assertEquals(1.0, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9143);assertEquals(1, reader.nextInt());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9144);assertEquals(1L, reader.nextLong());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testDoubles() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wl993721();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wl993721() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9145);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9146);String json = "[-0.0,"
        + "1.0,"
        + "1.7976931348623157E308,"
        + "4.9E-324,"
        + "0.0,"
        + "-0.5,"
        + "2.2250738585072014E-308,"
        + "3.141592653589793,"
        + "2.718281828459045]";
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9147);JsonReader reader = new JsonReader(new StringReader(json));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9148);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9149);assertEquals(-0.0, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9150);assertEquals(1.0, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9151);assertEquals(1.7976931348623157E308, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9152);assertEquals(4.9E-324, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9153);assertEquals(0.0, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9154);assertEquals(-0.5, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9155);assertEquals(2.2250738585072014E-308, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9156);assertEquals(3.141592653589793, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9157);assertEquals(2.718281828459045, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9158);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9159);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictNonFiniteDoubles() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqv14o72g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNonFiniteDoubles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqv14o72g() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9160);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9161);String json = "[NaN]";
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9162);JsonReader reader = new JsonReader(new StringReader(json));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9163);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9164);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9165);reader.nextDouble();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9166);fail();
    } catch (NumberFormatException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientNonFiniteDoubles() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0atke72n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNonFiniteDoubles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0atke72n() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9167);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9168);String json = "[NaN, -Infinity, Infinity]";
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9169);JsonReader reader = new JsonReader(new StringReader(json));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9170);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9171);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9172);assertTrue(Double.isNaN(reader.nextDouble()));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9173);assertEquals(Double.NEGATIVE_INFINITY, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9174);assertEquals(Double.POSITIVE_INFINITY, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9175);reader.endArray();
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLongs() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cczn1072w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLongs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cczn1072w() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9176);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9177);String json = "[0,0,0,"
        + "1,1,1,"
        + "-1,-1,-1,"
        + "-9223372036854775808,"
        + "9223372036854775807]";
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9178);JsonReader reader = new JsonReader(new StringReader(json));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9179);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9180);assertEquals(0L, reader.nextLong());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9181);assertEquals(0, reader.nextInt());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9182);assertEquals(0.0, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9183);assertEquals(1L, reader.nextLong());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9184);assertEquals(1, reader.nextInt());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9185);assertEquals(1.0, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9186);assertEquals(-1L, reader.nextLong());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9187);assertEquals(-1, reader.nextInt());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9188);assertEquals(-1.0, reader.nextDouble());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9189);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9190);reader.nextInt();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9191);fail();
    } catch (NumberFormatException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9192);assertEquals(Long.MIN_VALUE, reader.nextLong());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9193);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9194);reader.nextInt();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9195);fail();
    } catch (NumberFormatException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9196);assertEquals(Long.MAX_VALUE, reader.nextLong());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9197);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9198);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  public void disabled_testHighPrecisionLong() throws IOException {try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9199);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9200);String json = "[9223372036854775806.000]";
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9201);JsonReader reader = new JsonReader(new StringReader(json));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9202);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9203);assertEquals(9223372036854775806L, reader.nextLong());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9204);reader.endArray();
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testNumberWithOctalPrefix() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nldrml73p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNumberWithOctalPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nldrml73p() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9205);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9206);String json = "[01]";
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9207);JsonReader reader = new JsonReader(new StringReader(json));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9208);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9209);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9210);reader.nextInt();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9211);fail();
    } catch (NumberFormatException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9212);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9213);reader.nextLong();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9214);fail();
    } catch (NumberFormatException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9215);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9216);reader.nextDouble();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9217);fail();
    } catch (NumberFormatException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9218);assertEquals("01", reader.nextString());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9219);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9220);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testBooleans() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13svq1w745();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testBooleans",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13svq1w745() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9221);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9222);JsonReader reader = new JsonReader(new StringReader("[true,false]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9223);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9224);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9225);assertEquals(false, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9226);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9227);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testMixedCaseLiterals() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iys7r074c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMixedCaseLiterals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iys7r074c() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9228);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9229);JsonReader reader = new JsonReader(new StringReader("[True,TruE,False,FALSE,NULL,nulL]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9230);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9231);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9232);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9233);assertEquals(false, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9234);assertEquals(false, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9235);reader.nextNull();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9236);reader.nextNull();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9237);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9238);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testMissingValue() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oines74n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMissingValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oines74n() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9239);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9240);JsonReader reader = new JsonReader(new StringReader("{\"a\":}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9241);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9242);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9243);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9244);reader.nextString();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9245);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testPrematureEndOfInput() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11106oo74u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematureEndOfInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11106oo74u() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9246);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9247);JsonReader reader = new JsonReader(new StringReader("{\"a\":true,"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9248);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9249);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9250);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9251);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9252);reader.nextName();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9253);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testPrematurelyClosed() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0tcpz752();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematurelyClosed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0tcpz752() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9254);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9255);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9256);JsonReader reader = new JsonReader(new StringReader("{\"a\":[]}"));
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9257);reader.beginObject();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9258);reader.close();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9259);reader.nextName();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9260);fail();
    } catch (IllegalStateException expected) {
    }

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9261);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9262);JsonReader reader = new JsonReader(new StringReader("{\"a\":[]}"));
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9263);reader.close();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9264);reader.beginObject();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9265);fail();
    } catch (IllegalStateException expected) {
    }

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9266);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9267);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}"));
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9268);reader.beginObject();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9269);reader.nextName();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9270);reader.peek();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9271);reader.close();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9272);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9273);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testNextFailuresDoNotAdvance() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci4tjl75m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNextFailuresDoNotAdvance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci4tjl75m() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9274);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9275);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9276);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9277);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9278);reader.nextString();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9279);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9280);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9281);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9282);reader.nextName();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9283);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9284);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9285);reader.beginArray();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9286);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9287);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9288);reader.endArray();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9289);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9290);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9291);reader.beginObject();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9292);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9293);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9294);reader.endObject();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9295);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9296);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9297);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9298);reader.nextString();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9299);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9300);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9301);reader.nextName();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9302);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9303);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9304);reader.beginArray();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9305);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9306);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9307);reader.endArray();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9308);fail();
    } catch (IllegalStateException expected) {
    }
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9309);reader.endObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9310);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9311);reader.close();
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStringNullIsNotNull() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2i5d976o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStringNullIsNotNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2i5d976o() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9312);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9313);JsonReader reader = new JsonReader(new StringReader("[\"null\"]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9314);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9315);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9316);reader.nextNull();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9317);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testNullLiteralIsNotAString() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xiy2u76u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNullLiteralIsNotAString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xiy2u76u() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9318);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9319);JsonReader reader = new JsonReader(new StringReader("[null]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9320);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9321);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9322);reader.nextString();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9323);fail();
    } catch (IllegalStateException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictNameValueSeparator() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bsyczl770();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNameValueSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bsyczl770() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9324);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9325);JsonReader reader = new JsonReader(new StringReader("{\"a\"=true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9326);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9327);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9328);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9329);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9330);fail();
    } catch (IOException expected) {
    }

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9331);reader = new JsonReader(new StringReader("{\"a\"=>true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9332);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9333);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9334);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9335);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9336);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientNameValueSeparator() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n179jf77d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNameValueSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n179jf77d() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9337);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9338);JsonReader reader = new JsonReader(new StringReader("{\"a\"=true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9339);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9340);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9341);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9342);assertEquals(true, reader.nextBoolean());

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9343);reader = new JsonReader(new StringReader("{\"a\"=>true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9344);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9345);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9346);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9347);assertEquals(true, reader.nextBoolean());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictComments() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcjh5677o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictComments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcjh5677o() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9348);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9349);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9350);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9351);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9352);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9353);fail();
    } catch (IOException expected) {
    }

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9354);reader = new JsonReader(new StringReader("[# comment \n true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9355);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9356);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9357);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9358);fail();
    } catch (IOException expected) {
    }

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9359);reader = new JsonReader(new StringReader("[/* comment */ true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9360);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9361);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9362);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9363);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientComments() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184n3nk784();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientComments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184n3nk784() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9364);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9365);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9366);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9367);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9368);assertEquals(true, reader.nextBoolean());

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9369);reader = new JsonReader(new StringReader("[# comment \n true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9370);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9371);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9372);assertEquals(true, reader.nextBoolean());

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9373);reader = new JsonReader(new StringReader("[/* comment */ true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9374);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9375);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9376);assertEquals(true, reader.nextBoolean());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictUnquotedNames() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178xael78h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictUnquotedNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178xael78h() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9377);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9378);JsonReader reader = new JsonReader(new StringReader("{a:true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9379);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9380);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9381);reader.nextName();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9382);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientUnquotedNames() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18q1qt378n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18q1qt378n() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9383);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9384);JsonReader reader = new JsonReader(new StringReader("{a:true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9385);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9386);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9387);assertEquals("a", reader.nextName());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictSingleQuotedNames() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgd1oc78s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgd1oc78s() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9388);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9389);JsonReader reader = new JsonReader(new StringReader("{'a':true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9390);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9391);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9392);reader.nextName();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9393);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientSingleQuotedNames() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1poap5278y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSingleQuotedNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1poap5278y() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9394);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9395);JsonReader reader = new JsonReader(new StringReader("{'a':true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9396);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9397);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9398);assertEquals("a", reader.nextName());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictUnquotedStrings() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ll2lfx793();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictUnquotedStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ll2lfx793() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9399);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9400);JsonReader reader = new JsonReader(new StringReader("[a]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9401);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9402);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9403);reader.nextString();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9404);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientUnquotedStrings() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3dtvn799();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3dtvn799() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9405);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9406);JsonReader reader = new JsonReader(new StringReader("[a]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9407);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9408);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9409);assertEquals("a", reader.nextString());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictSingleQuotedStrings() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16z25fi79e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16z25fi79e() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9410);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9411);JsonReader reader = new JsonReader(new StringReader("['a']"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9412);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9413);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9414);reader.nextString();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9415);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientSingleQuotedStrings() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12u3d879k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSingleQuotedStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12u3d879k() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9416);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9417);JsonReader reader = new JsonReader(new StringReader("['a']"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9418);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9419);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9420);assertEquals("a", reader.nextString());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictSemicolonDelimitedArray() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5bxml79p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSemicolonDelimitedArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5bxml79p() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9421);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9422);JsonReader reader = new JsonReader(new StringReader("[true;true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9423);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9424);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9425);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9426);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9427);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientSemicolonDelimitedArray() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18caw0d79w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18caw0d79w() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9428);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9429);JsonReader reader = new JsonReader(new StringReader("[true;true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9430);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9431);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9432);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9433);assertEquals(true, reader.nextBoolean());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictSemicolonDelimitedNameValuePair() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6cbc47a2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSemicolonDelimitedNameValuePair",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6cbc47a2() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9434);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9435);JsonReader reader = new JsonReader(new StringReader("{\"a\":true;\"b\":true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9436);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9437);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9438);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9439);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9440);reader.nextName();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9441);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientSemicolonDelimitedNameValuePair() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hprg9y7aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedNameValuePair",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hprg9y7aa() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9442);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9443);JsonReader reader = new JsonReader(new StringReader("{\"a\":true;\"b\":true}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9444);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9445);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9446);assertEquals("a", reader.nextName());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9447);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9448);assertEquals("b", reader.nextName());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictUnnecessaryArraySeparators() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjd7ot7ah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictUnnecessaryArraySeparators",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjd7ot7ah() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9449);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9450);JsonReader reader = new JsonReader(new StringReader("[true,,true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9451);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9452);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9453);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9454);reader.nextNull();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9455);fail();
    } catch (IOException expected) {
    }

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9456);reader = new JsonReader(new StringReader("[,true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9457);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9458);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9459);reader.nextNull();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9460);fail();
    } catch (IOException expected) {
    }

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9461);reader = new JsonReader(new StringReader("[true,]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9462);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9463);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9464);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9465);reader.nextNull();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9466);fail();
    } catch (IOException expected) {
    }

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9467);reader = new JsonReader(new StringReader("[,]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9468);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9469);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9470);reader.nextNull();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9471);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientUnnecessaryArraySeparators() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157fpgd7b4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnnecessaryArraySeparators",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157fpgd7b4() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9472);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9473);JsonReader reader = new JsonReader(new StringReader("[true,,true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9474);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9475);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9476);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9477);reader.nextNull();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9478);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9479);reader.endArray();

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9480);reader = new JsonReader(new StringReader("[,true]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9481);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9482);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9483);reader.nextNull();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9484);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9485);reader.endArray();

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9486);reader = new JsonReader(new StringReader("[true,]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9487);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9488);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9489);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9490);reader.nextNull();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9491);reader.endArray();

    __CLR4_4_16zh6zhlck0y9ek.R.inc(9492);reader = new JsonReader(new StringReader("[,]"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9493);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9494);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9495);reader.nextNull();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9496);reader.nextNull();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9497);reader.endArray();
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictMultipleTopLevelValues() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mh06il7bu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictMultipleTopLevelValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mh06il7bu() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9498);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9499);JsonReader reader = new JsonReader(new StringReader("[] []"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9500);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9501);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9502);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9503);reader.peek();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9504);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientMultipleTopLevelValues() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irybzn7c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientMultipleTopLevelValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irybzn7c1() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9505);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9506);JsonReader reader = new JsonReader(new StringReader("[] true {}"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9507);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9508);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9509);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9510);assertEquals(true, reader.nextBoolean());
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9511);reader.beginObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9512);reader.endObject();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9513);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictTopLevelValueType() {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17l8uk87ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictTopLevelValueType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17l8uk87ca(){try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9514);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9515);JsonReader reader = new JsonReader(new StringReader("true"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9516);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9517);reader.nextBoolean();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9518);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientTopLevelValueType() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bt6i0y7cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientTopLevelValueType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bt6i0y7cf() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9519);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9520);JsonReader reader = new JsonReader(new StringReader("true"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9521);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9522);assertEquals(true, reader.nextBoolean());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testStrictNonExecutePrefix() {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3sdyc7cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNonExecutePrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3sdyc7cj(){try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9523);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9524);JsonReader reader = new JsonReader(new StringReader(")]}'\n []"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9525);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9526);reader.beginArray();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9527);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientNonExecutePrefix() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd86e27co();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNonExecutePrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd86e27co() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9528);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9529);JsonReader reader = new JsonReader(new StringReader(")]}'\n []"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9530);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9531);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9532);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9533);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientNonExecutePrefixWithLeadingWhitespace() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126q9397cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNonExecutePrefixWithLeadingWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126q9397cu() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9534);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9535);JsonReader reader = new JsonReader(new StringReader("\r\n \t)]}'\n []"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9536);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9537);reader.beginArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9538);reader.endArray();
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9539);assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}

  public void testLenientPartialNonExecutePrefix() throws IOException {__CLR4_4_16zh6zhlck0y9ek.R.globalSliceStart(getClass().getName(),9540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ractj77d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16zh6zhlck0y9ek.R.rethrow($CLV_t2$);}finally{__CLR4_4_16zh6zhlck0y9ek.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientPartialNonExecutePrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ractj77d0() throws IOException{try{__CLR4_4_16zh6zhlck0y9ek.R.inc(9540);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9541);JsonReader reader = new JsonReader(new StringReader(")]}' []"));
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9542);reader.setLenient(true);
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9543);assertEquals(")", reader.nextString()); // lenient is almost too lenient!
    __CLR4_4_16zh6zhlck0y9ek.R.inc(9544);try {
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9545);reader.peek();
      __CLR4_4_16zh6zhlck0y9ek.R.inc(9546);fail();
    } catch (IOException expected) {
    }
  }finally{__CLR4_4_16zh6zhlck0y9ek.R.flushNeeded();}}
}
