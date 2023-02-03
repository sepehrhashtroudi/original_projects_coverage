/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.google.gson.functional;

import com.google.gson.Gson;

import junit.framework.TestCase;

/**
 * Functional tests for Json serialization and deserialization of strings.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class StringTest extends TestCase {static class __CLR4_4_16no6nolck0y9cl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8711,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_16no6nolck0y9cl.R.inc(8628);
    __CLR4_4_16no6nolck0y9cl.R.inc(8629);super.setUp();
    __CLR4_4_16no6nolck0y9cl.R.inc(8630);gson = new Gson();
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}
  
  public void testStringValueSerialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njccrt6nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testStringValueSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njccrt6nr() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8631);
    __CLR4_4_16no6nolck0y9cl.R.inc(8632);String value = "someRandomStringValue";
    __CLR4_4_16no6nolck0y9cl.R.inc(8633);assertEquals('"' + value + '"', gson.toJson(value));
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testStringValueDeserialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sm3nmw6nu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testStringValueDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sm3nmw6nu() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8634);
    __CLR4_4_16no6nolck0y9cl.R.inc(8635);String value = "someRandomStringValue";
    __CLR4_4_16no6nolck0y9cl.R.inc(8636);String actual = gson.fromJson("\"" + value + "\"", String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8637);assertEquals(value, actual);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testSingleQuoteInStringSerialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u83whr6ny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testSingleQuoteInStringSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u83whr6ny() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8638);
    __CLR4_4_16no6nolck0y9cl.R.inc(8639);String valueWithQuotes = "beforeQuote'afterQuote";
    __CLR4_4_16no6nolck0y9cl.R.inc(8640);String jsonRepresentation = gson.toJson(valueWithQuotes);
    __CLR4_4_16no6nolck0y9cl.R.inc(8641);assertEquals(valueWithQuotes, gson.fromJson(jsonRepresentation, String.class));
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testEscapedCtrlNInStringSerialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2cof6o2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testEscapedCtrlNInStringSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2cof6o2() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8642);
    __CLR4_4_16no6nolck0y9cl.R.inc(8643);String value = "a\nb";
    __CLR4_4_16no6nolck0y9cl.R.inc(8644);String json = gson.toJson(value);
    __CLR4_4_16no6nolck0y9cl.R.inc(8645);assertEquals("\"a\\nb\"", json);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testEscapedCtrlNInStringDeserialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0g2du6o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testEscapedCtrlNInStringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0g2du6o6() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8646);
    __CLR4_4_16no6nolck0y9cl.R.inc(8647);String json = "'a\\nb'";
    __CLR4_4_16no6nolck0y9cl.R.inc(8648);String actual = gson.fromJson(json, String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8649);assertEquals("a\nb", actual);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testEscapedCtrlRInStringSerialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mcd36d6oa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testEscapedCtrlRInStringSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mcd36d6oa() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8650);
    __CLR4_4_16no6nolck0y9cl.R.inc(8651);String value = "a\rb";
    __CLR4_4_16no6nolck0y9cl.R.inc(8652);String json = gson.toJson(value);
    __CLR4_4_16no6nolck0y9cl.R.inc(8653);assertEquals("\"a\\rb\"", json);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testEscapedCtrlRInStringDeserialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nm92qe6oe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testEscapedCtrlRInStringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nm92qe6oe() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8654);
    __CLR4_4_16no6nolck0y9cl.R.inc(8655);String json = "'a\\rb'";
    __CLR4_4_16no6nolck0y9cl.R.inc(8656);String actual = gson.fromJson(json, String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8657);assertEquals("a\rb", actual);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testEscapedBackslashInStringSerialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vu2f5w6oi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testEscapedBackslashInStringSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vu2f5w6oi() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8658);
    __CLR4_4_16no6nolck0y9cl.R.inc(8659);String value = "a\\b";
    __CLR4_4_16no6nolck0y9cl.R.inc(8660);String json = gson.toJson(value);
    __CLR4_4_16no6nolck0y9cl.R.inc(8661);assertEquals("\"a\\\\b\"", json);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testEscapedBackslashInStringDeserialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hs10or6om();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testEscapedBackslashInStringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hs10or6om() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8662);
    __CLR4_4_16no6nolck0y9cl.R.inc(8663);String actual = gson.fromJson("'a\\\\b'", String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8664);assertEquals("a\\b", actual);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testSingleQuoteInStringDeserialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183rwjm6op();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testSingleQuoteInStringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183rwjm6op() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8665);
    __CLR4_4_16no6nolck0y9cl.R.inc(8666);String value = "beforeQuote'afterQuote";
    __CLR4_4_16no6nolck0y9cl.R.inc(8667);String actual = gson.fromJson("\"" + value + "\"", String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8668);assertEquals(value, actual);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testEscapingQuotesInStringSerialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v33ye26ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testEscapingQuotesInStringSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v33ye26ot() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8669);
    __CLR4_4_16no6nolck0y9cl.R.inc(8670);String valueWithQuotes = "beforeQuote\"afterQuote";
    __CLR4_4_16no6nolck0y9cl.R.inc(8671);String jsonRepresentation = gson.toJson(valueWithQuotes);
    __CLR4_4_16no6nolck0y9cl.R.inc(8672);String target = gson.fromJson(jsonRepresentation, String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8673);assertEquals(valueWithQuotes, target);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testEscapingQuotesInStringDeserialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwpwvb6oy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testEscapingQuotesInStringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwpwvb6oy() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8674);
    __CLR4_4_16no6nolck0y9cl.R.inc(8675);String value = "beforeQuote\\\"afterQuote";
    __CLR4_4_16no6nolck0y9cl.R.inc(8676);String actual = gson.fromJson("\"" + value + "\"", String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8677);String expected = "beforeQuote\"afterQuote";
    __CLR4_4_16no6nolck0y9cl.R.inc(8678);assertEquals(expected, actual);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testStringValueAsSingleElementArraySerialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xg4es26p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testStringValueAsSingleElementArraySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xg4es26p3() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8679);
    __CLR4_4_16no6nolck0y9cl.R.inc(8680);String[] target = {"abc"};
    __CLR4_4_16no6nolck0y9cl.R.inc(8681);assertEquals("[\"abc\"]", gson.toJson(target));
    __CLR4_4_16no6nolck0y9cl.R.inc(8682);assertEquals("[\"abc\"]", gson.toJson(target, String[].class));
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}

  public void testStringValueAsSingleElementArrayDeserialization() throws Exception {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhxvm96p7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testStringValueAsSingleElementArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhxvm96p7() throws Exception{try{__CLR4_4_16no6nolck0y9cl.R.inc(8683);
    __CLR4_4_16no6nolck0y9cl.R.inc(8684);String value = "someRandomStringValue";
    __CLR4_4_16no6nolck0y9cl.R.inc(8685);String actual = gson.fromJson("[\"" + value + "\"]", String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8686);assertEquals(value, actual);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}
  
  public void testStringWithEscapedSlashDeserialization() {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ih35cj6pb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testStringWithEscapedSlashDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ih35cj6pb(){try{__CLR4_4_16no6nolck0y9cl.R.inc(8687);
    __CLR4_4_16no6nolck0y9cl.R.inc(8688);String value = "/";
    __CLR4_4_16no6nolck0y9cl.R.inc(8689);String json = "'\\/'";
    __CLR4_4_16no6nolck0y9cl.R.inc(8690);String actual = gson.fromJson(json, String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8691);assertEquals(value, actual);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}
  
  /**
   * Created in response to http://groups.google.com/group/google-gson/browse_thread/thread/2431d4a3d0d6cb23
   */
  public void testAssignmentCharSerialization() {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlzjz66pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testAssignmentCharSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlzjz66pg(){try{__CLR4_4_16no6nolck0y9cl.R.inc(8692);
    __CLR4_4_16no6nolck0y9cl.R.inc(8693);String value = "abc=";
    __CLR4_4_16no6nolck0y9cl.R.inc(8694);String json = gson.toJson(value);
    __CLR4_4_16no6nolck0y9cl.R.inc(8695);assertEquals("\"abc\\u003d\"", json);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}
  
  /**
   * Created in response to http://groups.google.com/group/google-gson/browse_thread/thread/2431d4a3d0d6cb23
   */
  public void testAssignmentCharDeserialization() {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cibtt6pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testAssignmentCharDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cibtt6pk(){try{__CLR4_4_16no6nolck0y9cl.R.inc(8696);
    __CLR4_4_16no6nolck0y9cl.R.inc(8697);String json = "\"abc=\"";
    __CLR4_4_16no6nolck0y9cl.R.inc(8698);String value = gson.fromJson(json, String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8699);assertEquals("abc=", value);

    __CLR4_4_16no6nolck0y9cl.R.inc(8700);json = "'abc='";
    __CLR4_4_16no6nolck0y9cl.R.inc(8701);value = gson.fromJson(json, String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8702);assertEquals("abc=", value);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}
  
  public void testJavascriptKeywordsInStringSerialization() {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19cahq06pr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testJavascriptKeywordsInStringSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19cahq06pr(){try{__CLR4_4_16no6nolck0y9cl.R.inc(8703);
    __CLR4_4_16no6nolck0y9cl.R.inc(8704);String value = "null true false function";
    __CLR4_4_16no6nolck0y9cl.R.inc(8705);String json = gson.toJson(value);
    __CLR4_4_16no6nolck0y9cl.R.inc(8706);assertEquals("\"" + value + "\"", json);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}
  
  public void testJavascriptKeywordsInStringDeserialization() {__CLR4_4_16no6nolck0y9cl.R.globalSliceStart(getClass().getName(),8707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob0bp36pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16no6nolck0y9cl.R.rethrow($CLV_t2$);}finally{__CLR4_4_16no6nolck0y9cl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testJavascriptKeywordsInStringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob0bp36pv(){try{__CLR4_4_16no6nolck0y9cl.R.inc(8707);
    __CLR4_4_16no6nolck0y9cl.R.inc(8708);String json = "'null true false function'";
    __CLR4_4_16no6nolck0y9cl.R.inc(8709);String value = gson.fromJson(json, String.class);
    __CLR4_4_16no6nolck0y9cl.R.inc(8710);assertEquals(json.substring(1, json.length() - 1), value);
  }finally{__CLR4_4_16no6nolck0y9cl.R.flushNeeded();}}
}
