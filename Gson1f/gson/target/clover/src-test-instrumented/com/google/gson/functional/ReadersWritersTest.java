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
import com.google.gson.JsonStreamParser;
import com.google.gson.common.TestTypes.BagOfPrimitives;

import junit.framework.TestCase;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Functional tests for the support of {@link Reader}s and {@link Writer}s.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ReadersWritersTest extends TestCase {static class __CLR4_4_16ld6ldlck0y9c3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8601,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8545);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8546);super.setUp();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8547);gson = new Gson();
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}

  public void testWriterForSerialization() throws Exception {__CLR4_4_16ld6ldlck0y9c3.R.globalSliceStart(getClass().getName(),8548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6tqz16lg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ld6ldlck0y9c3.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ld6ldlck0y9c3.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ReadersWritersTest.testWriterForSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6tqz16lg() throws Exception{try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8548);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8549);Writer writer = new StringWriter();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8550);BagOfPrimitives src = new BagOfPrimitives();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8551);gson.toJson(src, writer);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8552);assertEquals(src.getExpectedJson(), writer.toString());
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}

  public void testReaderForDeserialization() throws Exception {__CLR4_4_16ld6ldlck0y9c3.R.globalSliceStart(getClass().getName(),8553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zkfcy6ll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ld6ldlck0y9c3.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ld6ldlck0y9c3.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ReadersWritersTest.testReaderForDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zkfcy6ll() throws Exception{try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8553);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8554);BagOfPrimitives expected = new BagOfPrimitives();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8555);Reader json = new StringReader(expected.getExpectedJson());
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8556);BagOfPrimitives actual = gson.fromJson(json, BagOfPrimitives.class);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8557);assertEquals(expected, actual);
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}

  public void testTopLevelNullObjectSerializationWithWriter() {__CLR4_4_16ld6ldlck0y9c3.R.globalSliceStart(getClass().getName(),8558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olsfwp6lq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ld6ldlck0y9c3.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ld6ldlck0y9c3.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ReadersWritersTest.testTopLevelNullObjectSerializationWithWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olsfwp6lq(){try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8558);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8559);StringWriter writer = new StringWriter();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8560);gson.toJson(null, writer);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8561);assertEquals("", writer.toString());
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}

  public void testTopLevelNullObjectDeserializationWithReader() {__CLR4_4_16ld6ldlck0y9c3.R.globalSliceStart(getClass().getName(),8562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gub6js6lu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ld6ldlck0y9c3.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ld6ldlck0y9c3.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ReadersWritersTest.testTopLevelNullObjectDeserializationWithReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gub6js6lu(){try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8562);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8563);StringReader reader = new StringReader("null");
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8564);Integer nullIntObject = gson.fromJson(reader, Integer.class);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8565);assertNull(nullIntObject);
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}

  public void testTopLevelNullObjectSerializationWithWriterAndSerializeNulls() {__CLR4_4_16ld6ldlck0y9c3.R.globalSliceStart(getClass().getName(),8566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9cibc6ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ld6ldlck0y9c3.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ld6ldlck0y9c3.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ReadersWritersTest.testTopLevelNullObjectSerializationWithWriterAndSerializeNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9cibc6ly(){try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8566);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8567);Gson gson = new GsonBuilder().serializeNulls().create();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8568);StringWriter writer = new StringWriter();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8569);gson.toJson(null, writer);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8570);assertEquals("null", writer.toString());
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}

  public void testTopLevelNullObjectDeserializationWithReaderAndSerializeNulls() {__CLR4_4_16ld6ldlck0y9c3.R.globalSliceStart(getClass().getName(),8571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1axasmf6m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ld6ldlck0y9c3.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ld6ldlck0y9c3.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ReadersWritersTest.testTopLevelNullObjectDeserializationWithReaderAndSerializeNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1axasmf6m3(){try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8571);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8572);Gson gson = new GsonBuilder().serializeNulls().create();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8573);StringReader reader = new StringReader("null");
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8574);Integer nullIntObject = gson.fromJson(reader, Integer.class);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8575);assertNull(nullIntObject);
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}
  
  public void testReadWriteTwoStrings() throws IOException {__CLR4_4_16ld6ldlck0y9c3.R.globalSliceStart(getClass().getName(),8576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yzbx06m8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ld6ldlck0y9c3.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ld6ldlck0y9c3.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ReadersWritersTest.testReadWriteTwoStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yzbx06m8() throws IOException{try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8576);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8577);Gson gson= new Gson();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8578);CharArrayWriter writer= new CharArrayWriter();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8579);writer.write(gson.toJson("one").toCharArray());
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8580);writer.write(gson.toJson("two").toCharArray());
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8581);CharArrayReader reader = new CharArrayReader(writer.toCharArray());
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8582);JsonStreamParser parser = new JsonStreamParser(reader);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8583);String actualOne = gson.fromJson(parser.next(), String.class);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8584);assertEquals("one", actualOne);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8585);String actualTwo = gson.fromJson(parser.next(), String.class);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8586);assertEquals("two", actualTwo);
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}
  
  public void testReadWriteTwoObjects() throws IOException {__CLR4_4_16ld6ldlck0y9c3.R.globalSliceStart(getClass().getName(),8587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xu8dju6mj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ld6ldlck0y9c3.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ld6ldlck0y9c3.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ReadersWritersTest.testReadWriteTwoObjects",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xu8dju6mj() throws IOException{try{__CLR4_4_16ld6ldlck0y9c3.R.inc(8587);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8588);Gson gson= new Gson();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8589);CharArrayWriter writer= new CharArrayWriter();
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8590);BagOfPrimitives expectedOne = new BagOfPrimitives(1, 1, true, "one");
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8591);writer.write(gson.toJson(expectedOne).toCharArray());
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8592);BagOfPrimitives expectedTwo = new BagOfPrimitives(2, 2, false, "two");
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8593);writer.write(gson.toJson(expectedTwo).toCharArray());
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8594);CharArrayReader reader = new CharArrayReader(writer.toCharArray());
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8595);JsonStreamParser parser = new JsonStreamParser(reader);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8596);BagOfPrimitives actualOne = gson.fromJson(parser.next(), BagOfPrimitives.class);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8597);assertEquals("one", actualOne.stringValue);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8598);BagOfPrimitives actualTwo = gson.fromJson(parser.next(), BagOfPrimitives.class);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8599);assertEquals("two", actualTwo.stringValue);
    __CLR4_4_16ld6ldlck0y9c3.R.inc(8600);assertFalse(parser.hasNext());
  }finally{__CLR4_4_16ld6ldlck0y9c3.R.flushNeeded();}}
}
