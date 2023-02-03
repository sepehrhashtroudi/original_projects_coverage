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

/**
 * Performs some unit testing for the {@link Escaper} class.
 *
 * @author Joel Leitch
 */
public class EscaperTest extends TestCase {static class __CLR4_4_132m32mlck0y8qe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4084,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private Escaper escapeHtmlChar;
  private Escaper noEscapeHtmlChar;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_132m32mlck0y8qe.R.inc(3982);
    __CLR4_4_132m32mlck0y8qe.R.inc(3983);super.setUp();
    __CLR4_4_132m32mlck0y8qe.R.inc(3984);escapeHtmlChar = new Escaper(true);
    __CLR4_4_132m32mlck0y8qe.R.inc(3985);noEscapeHtmlChar = new Escaper(false);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testNoSpecialCharacters() {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),3986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y10m7d32q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testNoSpecialCharacters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y10m7d32q(){try{__CLR4_4_132m32mlck0y8qe.R.inc(3986);
    __CLR4_4_132m32mlck0y8qe.R.inc(3987);String value = "Testing123";
    __CLR4_4_132m32mlck0y8qe.R.inc(3988);String escapedString = escapeHtmlChar.escapeJsonString(value);
    __CLR4_4_132m32mlck0y8qe.R.inc(3989);assertEquals(value, escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testNewlineEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),3990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn0d8932u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testNewlineEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn0d8932u() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(3990);
    __CLR4_4_132m32mlck0y8qe.R.inc(3991);String containsNewline = "123\n456";
    __CLR4_4_132m32mlck0y8qe.R.inc(3992);String escapedString = escapeHtmlChar.escapeJsonString(containsNewline);
    __CLR4_4_132m32mlck0y8qe.R.inc(3993);assertEquals("123\\n456", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testCarrageReturnEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),3994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odp4vw32y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testCarrageReturnEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odp4vw32y() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(3994);
    __CLR4_4_132m32mlck0y8qe.R.inc(3995);String containsCarrageReturn = "123\r456";
    __CLR4_4_132m32mlck0y8qe.R.inc(3996);String escapedString = escapeHtmlChar.escapeJsonString(containsCarrageReturn);
    __CLR4_4_132m32mlck0y8qe.R.inc(3997);assertEquals("123\\r456", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testTabEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),3998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gosc88332();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testTabEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gosc88332() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(3998);
    __CLR4_4_132m32mlck0y8qe.R.inc(3999);String containsTab = "123\t456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4000);String escapedString = escapeHtmlChar.escapeJsonString(containsTab);
    __CLR4_4_132m32mlck0y8qe.R.inc(4001);assertEquals("123\\t456", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testDoubleQuoteEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrb3nm336();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testDoubleQuoteEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrb3nm336() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4002);
    __CLR4_4_132m32mlck0y8qe.R.inc(4003);String containsQuote = "123\"456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4004);String escapedString = escapeHtmlChar.escapeJsonString(containsQuote);
    __CLR4_4_132m32mlck0y8qe.R.inc(4005);assertEquals("123\\\"456", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}
  
  public void testSingleQuoteEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r36f0n33a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testSingleQuoteEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r36f0n33a() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4006);
    __CLR4_4_132m32mlck0y8qe.R.inc(4007);String containsQuote = "123'456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4008);String escapedString = escapeHtmlChar.escapeJsonString(containsQuote);
    __CLR4_4_132m32mlck0y8qe.R.inc(4009);assertEquals("123\\u0027456", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testLineSeparatorEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1msjh5w33e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testLineSeparatorEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1msjh5w33e() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4010);
    __CLR4_4_132m32mlck0y8qe.R.inc(4011);String src = "123\u2028 456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4012);String escapedString = escapeHtmlChar.escapeJsonString(src);
    __CLR4_4_132m32mlck0y8qe.R.inc(4013);assertEquals("123\\u2028 456", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testParagraphSeparatorEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1quh1ki33i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testParagraphSeparatorEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1quh1ki33i() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4014);
    __CLR4_4_132m32mlck0y8qe.R.inc(4015);String src = "123\u2029 456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4016);String escapedString = escapeHtmlChar.escapeJsonString(src);
    __CLR4_4_132m32mlck0y8qe.R.inc(4017);assertEquals("123\\u2029 456", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testControlCharBlockEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ha4qtt33m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testControlCharBlockEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ha4qtt33m() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4018);
    __CLR4_4_132m32mlck0y8qe.R.inc(4019);for (char c = ''; (((c <= '\u009f')&&(__CLR4_4_132m32mlck0y8qe.R.iget(4020)!=0|true))||(__CLR4_4_132m32mlck0y8qe.R.iget(4021)==0&false)); ++c) {{
      __CLR4_4_132m32mlck0y8qe.R.inc(4022);String src = "123 " + c + " 456";
      __CLR4_4_132m32mlck0y8qe.R.inc(4023);String escapedString = escapeHtmlChar.escapeJsonString(src);
      __CLR4_4_132m32mlck0y8qe.R.inc(4024);assertFalse(src.equals(escapedString));
    }
  }}finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testEqualsEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzeg0a33t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testEqualsEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzeg0a33t() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4025);
    __CLR4_4_132m32mlck0y8qe.R.inc(4026);String containsEquals = "123=456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4027);int index = containsEquals.indexOf('=');
    __CLR4_4_132m32mlck0y8qe.R.inc(4028);String unicodeValue = convertToUnicodeString(Character.codePointAt(containsEquals, index));
    __CLR4_4_132m32mlck0y8qe.R.inc(4029);String escapedString = escapeHtmlChar.escapeJsonString(containsEquals);
    __CLR4_4_132m32mlck0y8qe.R.inc(4030);assertEquals("123" + unicodeValue + "456", escapedString);
    
    __CLR4_4_132m32mlck0y8qe.R.inc(4031);escapedString = noEscapeHtmlChar.escapeJsonString(containsEquals);
    __CLR4_4_132m32mlck0y8qe.R.inc(4032);assertEquals(containsEquals, escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testGreaterThanAndLessThanEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1disvsd341();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testGreaterThanAndLessThanEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1disvsd341() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4033);
    __CLR4_4_132m32mlck0y8qe.R.inc(4034);String containsLtGt = "123>456<";
    __CLR4_4_132m32mlck0y8qe.R.inc(4035);int gtIndex = containsLtGt.indexOf('>');
    __CLR4_4_132m32mlck0y8qe.R.inc(4036);int ltIndex = containsLtGt.indexOf('<');
    __CLR4_4_132m32mlck0y8qe.R.inc(4037);String gtAsUnicode = convertToUnicodeString(Character.codePointAt(containsLtGt, gtIndex));
    __CLR4_4_132m32mlck0y8qe.R.inc(4038);String ltAsUnicode = convertToUnicodeString(Character.codePointAt(containsLtGt, ltIndex));

    __CLR4_4_132m32mlck0y8qe.R.inc(4039);String escapedString = escapeHtmlChar.escapeJsonString(containsLtGt);
    __CLR4_4_132m32mlck0y8qe.R.inc(4040);assertEquals("123" + gtAsUnicode + "456" + ltAsUnicode, escapedString);
    
    __CLR4_4_132m32mlck0y8qe.R.inc(4041);escapedString = noEscapeHtmlChar.escapeJsonString(containsLtGt);
    __CLR4_4_132m32mlck0y8qe.R.inc(4042);assertEquals(containsLtGt, escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testAmpersandEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9z5mw34b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testAmpersandEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9z5mw34b() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4043);
    __CLR4_4_132m32mlck0y8qe.R.inc(4044);String containsAmp = "123&456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4045);int ampIndex = containsAmp.indexOf('&');
    __CLR4_4_132m32mlck0y8qe.R.inc(4046);String ampAsUnicode = convertToUnicodeString(Character.codePointAt(containsAmp, ampIndex));

    __CLR4_4_132m32mlck0y8qe.R.inc(4047);String escapedString = escapeHtmlChar.escapeJsonString(containsAmp);
    __CLR4_4_132m32mlck0y8qe.R.inc(4048);assertEquals("123" + ampAsUnicode + "456", escapedString);
    
    __CLR4_4_132m32mlck0y8qe.R.inc(4049);escapedString = noEscapeHtmlChar.escapeJsonString(containsAmp);
    __CLR4_4_132m32mlck0y8qe.R.inc(4050);assertEquals(containsAmp, escapedString);

    __CLR4_4_132m32mlck0y8qe.R.inc(4051);char ampCharAsUnicode = '&';
    __CLR4_4_132m32mlck0y8qe.R.inc(4052);String containsAmpUnicode = "123" + ampCharAsUnicode + "456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4053);escapedString = escapeHtmlChar.escapeJsonString(containsAmpUnicode);
    __CLR4_4_132m32mlck0y8qe.R.inc(4054);assertEquals("123" + ampAsUnicode + "456", escapedString);

    __CLR4_4_132m32mlck0y8qe.R.inc(4055);escapedString = noEscapeHtmlChar.escapeJsonString(containsAmpUnicode);
    __CLR4_4_132m32mlck0y8qe.R.inc(4056);assertEquals(containsAmp, escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testSlashEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ih6p8w34p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testSlashEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ih6p8w34p() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4057);
    __CLR4_4_132m32mlck0y8qe.R.inc(4058);String containsSlash = "123\\456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4059);String escapedString = escapeHtmlChar.escapeJsonString(containsSlash);
    __CLR4_4_132m32mlck0y8qe.R.inc(4060);assertEquals("123\\\\456", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testSingleQuoteNotEscaped() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhettz34t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testSingleQuoteNotEscaped",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhettz34t() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4061);
    __CLR4_4_132m32mlck0y8qe.R.inc(4062);String containsSingleQuote = "123'456";
    __CLR4_4_132m32mlck0y8qe.R.inc(4063);String escapedString = noEscapeHtmlChar.escapeJsonString(containsSingleQuote);
    __CLR4_4_132m32mlck0y8qe.R.inc(4064);assertEquals(containsSingleQuote, escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testRequiredEscapingUnicodeCharacter() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sjps234x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testRequiredEscapingUnicodeCharacter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sjps234x() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4065);
    __CLR4_4_132m32mlck0y8qe.R.inc(4066);char unicodeChar = '\u2028';
    __CLR4_4_132m32mlck0y8qe.R.inc(4067);String unicodeString = "Testing" + unicodeChar;

    __CLR4_4_132m32mlck0y8qe.R.inc(4068);String escapedString = escapeHtmlChar.escapeJsonString(unicodeString);
    __CLR4_4_132m32mlck0y8qe.R.inc(4069);assertFalse(unicodeString.equals(escapedString));
    __CLR4_4_132m32mlck0y8qe.R.inc(4070);assertEquals("Testing\\u2028", escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  public void testUnicodeCharacterStringNoEscaping() throws Exception {__CLR4_4_132m32mlck0y8qe.R.globalSliceStart(getClass().getName(),4071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0i8s5353();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_132m32mlck0y8qe.R.rethrow($CLV_t2$);}finally{__CLR4_4_132m32mlck0y8qe.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testUnicodeCharacterStringNoEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0i8s5353() throws Exception{try{__CLR4_4_132m32mlck0y8qe.R.inc(4071);
    __CLR4_4_132m32mlck0y8qe.R.inc(4072);String unicodeString = "ef";

    __CLR4_4_132m32mlck0y8qe.R.inc(4073);String escapedString = escapeHtmlChar.escapeJsonString(unicodeString);
    __CLR4_4_132m32mlck0y8qe.R.inc(4074);assertEquals(unicodeString, escapedString);
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}

  /*
  public void testChineseCharacterEscaping() throws Exception {
    String unicodeString = "\u597d\u597d\u597d";
    String chineseString = "\u597d\u597d\u597d";
    assertEquals(unicodeString, chineseString);

    String expectedEscapedString = "\\u597d\\u597d\\u597d";
    String escapedString = Escaper.escapeJsonString(chineseString);
    assertEquals(expectedEscapedString, escapedString);
  }
   */

  private String convertToUnicodeString(int codepoint) {try{__CLR4_4_132m32mlck0y8qe.R.inc(4075);
    __CLR4_4_132m32mlck0y8qe.R.inc(4076);String hexValue = Integer.toHexString(codepoint);
    __CLR4_4_132m32mlck0y8qe.R.inc(4077);StringBuilder sb = new StringBuilder("\\u");
    __CLR4_4_132m32mlck0y8qe.R.inc(4078);for (int i = 0; (((i < 4 - hexValue.length())&&(__CLR4_4_132m32mlck0y8qe.R.iget(4079)!=0|true))||(__CLR4_4_132m32mlck0y8qe.R.iget(4080)==0&false)); i++) {{
      __CLR4_4_132m32mlck0y8qe.R.inc(4081);sb.append(0);
    }
    }__CLR4_4_132m32mlck0y8qe.R.inc(4082);sb.append(hexValue);

    __CLR4_4_132m32mlck0y8qe.R.inc(4083);return sb.toString().toLowerCase();
  }finally{__CLR4_4_132m32mlck0y8qe.R.flushNeeded();}}
}
