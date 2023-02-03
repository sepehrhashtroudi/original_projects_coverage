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
import com.google.gson.common.TestTypes.BagOfPrimitives;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 * Performs some functional test involving JSON output escaping.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class EscapingTest extends TestCase {static class __CLR4_4_157f57flck0y942{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6782,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_157f57flck0y942.R.inc(6747);
    __CLR4_4_157f57flck0y942.R.inc(6748);super.setUp();
    __CLR4_4_157f57flck0y942.R.inc(6749);gson = new Gson();
  }finally{__CLR4_4_157f57flck0y942.R.flushNeeded();}}

  public void testEscapingQuotesInStringArray() throws Exception {__CLR4_4_157f57flck0y942.R.globalSliceStart(getClass().getName(),6750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmqvc357i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157f57flck0y942.R.rethrow($CLV_t2$);}finally{__CLR4_4_157f57flck0y942.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EscapingTest.testEscapingQuotesInStringArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmqvc357i() throws Exception{try{__CLR4_4_157f57flck0y942.R.inc(6750);
    __CLR4_4_157f57flck0y942.R.inc(6751);String[] valueWithQuotes = { "beforeQuote\"afterQuote" };
    __CLR4_4_157f57flck0y942.R.inc(6752);String jsonRepresentation = gson.toJson(valueWithQuotes);
    __CLR4_4_157f57flck0y942.R.inc(6753);String[] target = gson.fromJson(jsonRepresentation, String[].class);
    __CLR4_4_157f57flck0y942.R.inc(6754);assertEquals(1, target.length);
    __CLR4_4_157f57flck0y942.R.inc(6755);assertEquals(valueWithQuotes[0], target[0]);
  }finally{__CLR4_4_157f57flck0y942.R.flushNeeded();}}

  public void testEscapeAllHtmlCharacters() {__CLR4_4_157f57flck0y942.R.globalSliceStart(getClass().getName(),6756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5z5li57o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157f57flck0y942.R.rethrow($CLV_t2$);}finally{__CLR4_4_157f57flck0y942.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EscapingTest.testEscapeAllHtmlCharacters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5z5li57o(){try{__CLR4_4_157f57flck0y942.R.inc(6756);
    __CLR4_4_157f57flck0y942.R.inc(6757);List<String> strings = new ArrayList<String>();
    __CLR4_4_157f57flck0y942.R.inc(6758);strings.add("<");
    __CLR4_4_157f57flck0y942.R.inc(6759);strings.add(">");
    __CLR4_4_157f57flck0y942.R.inc(6760);strings.add("=");
    __CLR4_4_157f57flck0y942.R.inc(6761);strings.add("&");
    __CLR4_4_157f57flck0y942.R.inc(6762);strings.add("'");
    __CLR4_4_157f57flck0y942.R.inc(6763);strings.add("\"");
    __CLR4_4_157f57flck0y942.R.inc(6764);assertEquals("[\"\\u003c\",\"\\u003e\",\"\\u003d\",\"\\u0026\",\"\\u0027\",\"\\\"\"]",
        gson.toJson(strings));
  }finally{__CLR4_4_157f57flck0y942.R.flushNeeded();}}

  public void testEscapingObjectFields() throws Exception {__CLR4_4_157f57flck0y942.R.globalSliceStart(getClass().getName(),6765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g2k7an57x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157f57flck0y942.R.rethrow($CLV_t2$);}finally{__CLR4_4_157f57flck0y942.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EscapingTest.testEscapingObjectFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g2k7an57x() throws Exception{try{__CLR4_4_157f57flck0y942.R.inc(6765);
    __CLR4_4_157f57flck0y942.R.inc(6766);BagOfPrimitives objWithPrimitives = new BagOfPrimitives(1L, 1, true, "test with\" <script>");
    __CLR4_4_157f57flck0y942.R.inc(6767);String jsonRepresentation = gson.toJson(objWithPrimitives);
    __CLR4_4_157f57flck0y942.R.inc(6768);assertFalse(jsonRepresentation.contains("<"));
    __CLR4_4_157f57flck0y942.R.inc(6769);assertFalse(jsonRepresentation.contains(">"));
    __CLR4_4_157f57flck0y942.R.inc(6770);assertTrue(jsonRepresentation.contains("\\\""));

    __CLR4_4_157f57flck0y942.R.inc(6771);BagOfPrimitives expectedObject = gson.fromJson(jsonRepresentation, BagOfPrimitives.class);
    __CLR4_4_157f57flck0y942.R.inc(6772);assertEquals(objWithPrimitives.getExpectedJson(), expectedObject.getExpectedJson());
  }finally{__CLR4_4_157f57flck0y942.R.flushNeeded();}}
  
  public void testGsonAcceptsEscapedAndNonEscapedJsonDeserialization() throws Exception {__CLR4_4_157f57flck0y942.R.globalSliceStart(getClass().getName(),6773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q733oq585();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157f57flck0y942.R.rethrow($CLV_t2$);}finally{__CLR4_4_157f57flck0y942.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EscapingTest.testGsonAcceptsEscapedAndNonEscapedJsonDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q733oq585() throws Exception{try{__CLR4_4_157f57flck0y942.R.inc(6773);
    __CLR4_4_157f57flck0y942.R.inc(6774);Gson escapeHtmlGson = new GsonBuilder().create();
    __CLR4_4_157f57flck0y942.R.inc(6775);Gson noEscapeHtmlGson = new GsonBuilder().disableHtmlEscaping().create();
    
    __CLR4_4_157f57flck0y942.R.inc(6776);BagOfPrimitives target = new BagOfPrimitives(1L, 1, true, "test' / w'ith\" / \\ <script>");
    __CLR4_4_157f57flck0y942.R.inc(6777);String escapedJsonForm = escapeHtmlGson.toJson(target);
    __CLR4_4_157f57flck0y942.R.inc(6778);String nonEscapedJsonForm = noEscapeHtmlGson.toJson(target);
    __CLR4_4_157f57flck0y942.R.inc(6779);assertFalse(escapedJsonForm.equals(nonEscapedJsonForm));
    
    __CLR4_4_157f57flck0y942.R.inc(6780);assertEquals(target, noEscapeHtmlGson.fromJson(escapedJsonForm, BagOfPrimitives.class));
    __CLR4_4_157f57flck0y942.R.inc(6781);assertEquals(target, escapeHtmlGson.fromJson(nonEscapedJsonForm, BagOfPrimitives.class));
  }finally{__CLR4_4_157f57flck0y942.R.flushNeeded();}}
}
