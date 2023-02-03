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

package com.google.gson;

import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.stream.JsonReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.StringReader;
import junit.framework.TestCase;

/**
 * Unit test for {@link JsonParser}
 * 
 * @author Inderjeet Singh
 */
public class JsonParserTest extends TestCase {static class __CLR4_4_13dt3dtlck0y8ss{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4431,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
  private JsonParser parser;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13dt3dtlck0y8ss.R.inc(4385);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4386);super.setUp();
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4387);parser = new JsonParser();
  }finally{__CLR4_4_13dt3dtlck0y8ss.R.flushNeeded();}}
  
  public void testParseString() {__CLR4_4_13dt3dtlck0y8ss.R.globalSliceStart(getClass().getName(),4388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sd948p3dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13dt3dtlck0y8ss.R.rethrow($CLV_t2$);}finally{__CLR4_4_13dt3dtlck0y8ss.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testParseString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sd948p3dw(){try{__CLR4_4_13dt3dtlck0y8ss.R.inc(4388);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4389);String json = "{a:10,b:'c'}";
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4390);JsonElement e = parser.parse(json);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4391);assertTrue(e.isJsonObject());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4392);assertEquals(10, e.getAsJsonObject().get("a").getAsInt());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4393);assertEquals("c", e.getAsJsonObject().get("b").getAsString());
  }finally{__CLR4_4_13dt3dtlck0y8ss.R.flushNeeded();}}
  
  public void testParseEmptyString() {__CLR4_4_13dt3dtlck0y8ss.R.globalSliceStart(getClass().getName(),4394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pkvwbo3e2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13dt3dtlck0y8ss.R.rethrow($CLV_t2$);}finally{__CLR4_4_13dt3dtlck0y8ss.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testParseEmptyString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pkvwbo3e2(){try{__CLR4_4_13dt3dtlck0y8ss.R.inc(4394);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4395);JsonElement e = parser.parse("\"   \"");
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4396);assertTrue(e.isJsonPrimitive());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4397);assertEquals("   ", e.getAsString());
  }finally{__CLR4_4_13dt3dtlck0y8ss.R.flushNeeded();}}

  public void testParseEmptyWhitespaceInput() {__CLR4_4_13dt3dtlck0y8ss.R.globalSliceStart(getClass().getName(),4398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1neluwo3e6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13dt3dtlck0y8ss.R.rethrow($CLV_t2$);}finally{__CLR4_4_13dt3dtlck0y8ss.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testParseEmptyWhitespaceInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1neluwo3e6(){try{__CLR4_4_13dt3dtlck0y8ss.R.inc(4398);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4399);JsonElement e = parser.parse("     ");
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4400);assertTrue(e.isJsonNull());
  }finally{__CLR4_4_13dt3dtlck0y8ss.R.flushNeeded();}}
  
  public void testParseMixedArray() {__CLR4_4_13dt3dtlck0y8ss.R.globalSliceStart(getClass().getName(),4401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogxjkq3e9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13dt3dtlck0y8ss.R.rethrow($CLV_t2$);}finally{__CLR4_4_13dt3dtlck0y8ss.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testParseMixedArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogxjkq3e9(){try{__CLR4_4_13dt3dtlck0y8ss.R.inc(4401);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4402);String json = "[{},13,\"stringValue\"]";
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4403);JsonElement e = parser.parse(json);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4404);assertTrue(e.isJsonArray());
    
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4405);JsonArray  array = e.getAsJsonArray();
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4406);assertEquals("{}", array.get(0).toString());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4407);assertEquals(13, array.get(1).getAsInt());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4408);assertEquals("stringValue", array.get(2).getAsString());
  }finally{__CLR4_4_13dt3dtlck0y8ss.R.flushNeeded();}}

  public void testParseReader() {__CLR4_4_13dt3dtlck0y8ss.R.globalSliceStart(getClass().getName(),4409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khoout3eh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13dt3dtlck0y8ss.R.rethrow($CLV_t2$);}finally{__CLR4_4_13dt3dtlck0y8ss.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testParseReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khoout3eh(){try{__CLR4_4_13dt3dtlck0y8ss.R.inc(4409);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4410);StringReader reader = new StringReader("{a:10,b:'c'}");
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4411);JsonElement e = parser.parse(reader);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4412);assertTrue(e.isJsonObject());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4413);assertEquals(10, e.getAsJsonObject().get("a").getAsInt());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4414);assertEquals("c", e.getAsJsonObject().get("b").getAsString());
  }finally{__CLR4_4_13dt3dtlck0y8ss.R.flushNeeded();}}
  
  public void testReadWriteTwoObjects() throws Exception {__CLR4_4_13dt3dtlck0y8ss.R.globalSliceStart(getClass().getName(),4415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xu8dju3en();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13dt3dtlck0y8ss.R.rethrow($CLV_t2$);}finally{__CLR4_4_13dt3dtlck0y8ss.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testReadWriteTwoObjects",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xu8dju3en() throws Exception{try{__CLR4_4_13dt3dtlck0y8ss.R.inc(4415);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4416);Gson gson= new Gson();
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4417);CharArrayWriter writer= new CharArrayWriter();
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4418);BagOfPrimitives expectedOne = new BagOfPrimitives(1, 1, true, "one");
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4419);writer.write(gson.toJson(expectedOne).toCharArray());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4420);BagOfPrimitives expectedTwo = new BagOfPrimitives(2, 2, false, "two");
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4421);writer.write(gson.toJson(expectedTwo).toCharArray());
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4422);CharArrayReader reader = new CharArrayReader(writer.toCharArray());
  
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4423);JsonReader parser = new JsonReader(reader);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4424);parser.setLenient(true);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4425);JsonElement element1 = Streams.parse(parser);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4426);JsonElement element2 = Streams.parse(parser);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4427);BagOfPrimitives actualOne = gson.fromJson(element1, BagOfPrimitives.class);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4428);assertEquals("one", actualOne.stringValue);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4429);BagOfPrimitives actualTwo = gson.fromJson(element2, BagOfPrimitives.class);
    __CLR4_4_13dt3dtlck0y8ss.R.inc(4430);assertEquals("two", actualTwo.stringValue);
  }finally{__CLR4_4_13dt3dtlck0y8ss.R.flushNeeded();}}
}
