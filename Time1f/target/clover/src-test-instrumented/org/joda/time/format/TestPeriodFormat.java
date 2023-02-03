/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2012 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.format;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Period;

/**
 * This class is a Junit unit test for PeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormat extends TestCase {static class __CLR4_4_11beg1beglc8azxmt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,61600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale EN = new Locale("en");
    private static final Locale FR = new Locale("fr");
    private static final Locale PT = new Locale("pt");
    private static final Locale ES = new Locale("es");
    private static final Locale DE = new Locale("de");
    private static final Locale NL = new Locale("nl");
    private static final Locale DA = new Locale("da");
    private static final Locale JA = new Locale("ja");

    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_11beg1beglc8azxmt.R.inc(61432);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61433);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11beg1beglc8azxmt.R.inc(61434);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61435);return new TestSuite(TestPeriodFormat.class);
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    public TestPeriodFormat(String name) {
        super(name);__CLR4_4_11beg1beglc8azxmt.R.inc(61437);try{__CLR4_4_11beg1beglc8azxmt.R.inc(61436);
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11beg1beglc8azxmt.R.inc(61438);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61439);originalLocale = Locale.getDefault();
        __CLR4_4_11beg1beglc8azxmt.R.inc(61440);Locale.setDefault(DE);
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11beg1beglc8azxmt.R.inc(61441);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61442);Locale.setDefault(originalLocale);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61443);originalLocale = null;
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSubclassableConstructor() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm293x1bes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.testSubclassableConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm293x1bes(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61444);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61445);PeriodFormat f = new PeriodFormat() {
            // test constructor is protected
        };
        __CLR4_4_11beg1beglc8azxmt.R.inc(61446);assertNotNull(f);
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // getDefault()
    //-----------------------------------------------------------------------
    public void test_getDefault_formatStandard() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3am0u1bev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3am0u1bev(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61447);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61448);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61449);assertEquals("1 day, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", PeriodFormat.getDefault().print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDefault_FormatOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqqdh51bey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqqdh51bey(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61450);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61451);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61452);assertEquals("2 days", PeriodFormat.getDefault().print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDefault_formatTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tc77ki1bf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tc77ki1bf1(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61453);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61454);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61455);assertEquals("2 days and 5 hours", PeriodFormat.getDefault().print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDefault_parseOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nuu3mh1bf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nuu3mh1bf4(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61456);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61457);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61458);assertEquals(p, PeriodFormat.getDefault().parsePeriod("2 days"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDefault_parseTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1muizts1bf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1muizts1bf7(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61459);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61460);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61461);assertEquals(p, PeriodFormat.getDefault().parsePeriod("2 days and 5 hours"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDefault_checkRedundantSeparator() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoxm001bfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_checkRedundantSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoxm001bfa(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61462);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61463);try {
            __CLR4_4_11beg1beglc8azxmt.R.inc(61464);PeriodFormat.getDefault().parsePeriod("2 days and 5 hours ");
            __CLR4_4_11beg1beglc8azxmt.R.inc(61465);fail("No exception was caught");
        } catch (Exception e) {
            __CLR4_4_11beg1beglc8azxmt.R.inc(61466);assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}    
    
    //-----------------------------------------------------------------------
    public void test_getDefault_cached() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dytks01bff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dytks01bff(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61467);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61468);assertSame(PeriodFormat.getDefault(), PeriodFormat.getDefault());
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased() - default locale (de)
    //-----------------------------------------------------------------------
    public void test_wordBased_default() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecefq31bfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_default",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecefq31bfh(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61469);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61470);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61471);assertEquals("1 Tag, 5 Stunden, 6 Minuten, 7 Sekunden und 8 Millisekunden", PeriodFormat.wordBased().print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale.FRENCH)
    //-----------------------------------------------------------------------
    public void test_wordBased_fr_formatStandard() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dtinp1bfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dtinp1bfk(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61472);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61473);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61474);assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_fr_FormatOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ng7gua1bfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ng7gua1bfn(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61475);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61476);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61477);assertEquals("2 jours", PeriodFormat.wordBased(FR).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_fr_formatTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cixj5n1bfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cixj5n1bfq(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61478);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61479);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61480);assertEquals("2 jours et 5 heures", PeriodFormat.wordBased(FR).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_fr_parseOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpigjm1bft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpigjm1bft(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61481);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61482);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61483);assertEquals(p, PeriodFormat.wordBased(FR).parsePeriod("2 jours"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_fr_parseTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d51wgn1bfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d51wgn1bfw(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61484);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61485);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61486);assertEquals(p, PeriodFormat.wordBased(FR).parsePeriod("2 jours et 5 heures"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_fr_cached() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142u3151bfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142u3151bfz(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61487);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61488);assertSame(PeriodFormat.wordBased(FR), PeriodFormat.wordBased(FR));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale pt)
    //-----------------------------------------------------------------------
    public void test_wordBased_pt_formatStandard() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du6l0t1bg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du6l0t1bg1(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61489);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61490);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61491);assertEquals("1 dia, 5 horas, 6 minutos, 7 segundos e 8 milissegundos", PeriodFormat.wordBased(PT).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_pt_FormatOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzueh61bg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzueh61bg4(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61492);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61493);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61494);assertEquals("2 dias", PeriodFormat.wordBased(PT).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_pt_formatTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiueir1bg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiueir1bg7(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61495);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61496);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61497);assertEquals("2 dias e 5 horas", PeriodFormat.wordBased(PT).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_pt_parseOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swzqwm1bga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swzqwm1bga(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61498);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61499);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61500);assertEquals(p, PeriodFormat.wordBased(PT).parsePeriod("2 dias"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_pt_parseTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kleytr1bgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kleytr1bgd(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61501);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61502);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61503);assertEquals(p, PeriodFormat.wordBased(PT).parsePeriod("2 dias e 5 horas"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_pt_cached() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huj2an1bgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huj2an1bgg(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61504);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61505);assertSame(PeriodFormat.wordBased(PT), PeriodFormat.wordBased(PT));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale es)
    //-----------------------------------------------------------------------
    public void test_wordBased_es_formatStandard() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shd5d51bgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shd5d51bgi(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61506);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61507);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61508);assertEquals("1 d\u00eda, 5 horas, 6 minutos, 7 segundos y 8 milisegundos", PeriodFormat.wordBased(ES).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_es_FormatOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cppx401bgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cppx401bgl(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61509);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61510);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61511);assertEquals("2 d\u00edas", PeriodFormat.wordBased(ES).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_es_formatTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12v4bxj1bgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12v4bxj1bgo(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61512);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61513);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61514);assertEquals("2 d\u00edas y 5 horas", PeriodFormat.wordBased(ES).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_es_parseOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152rz6o1bgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152rz6o1bgr(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61515);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61516);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61517);assertEquals(p, PeriodFormat.wordBased(ES).parsePeriod("2 d\u00edas"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_es_parseTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lq4rk71bgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lq4rk71bgu(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61518);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61519);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61520);assertEquals(p, PeriodFormat.wordBased(ES).parsePeriod("2 d\u00edas y 5 horas"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_es_cached() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysird51bgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysird51bgx(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61521);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61522);assertSame(PeriodFormat.wordBased(ES), PeriodFormat.wordBased(ES));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale de)
    //-----------------------------------------------------------------------
    public void test_wordBased_de_formatStandard() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1prixka1bgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1prixka1bgz(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61523);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61524);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61525);assertEquals("1 Tag, 5 Stunden, 6 Minuten, 7 Sekunden und 8 Millisekunden", PeriodFormat.wordBased(DE).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_de_FormatOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142i1xp1bh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142i1xp1bh2(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61526);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61527);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61528);assertEquals("2 Tage", PeriodFormat.wordBased(DE).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_de_formatTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1py74ka1bh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1py74ka1bh5(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61529);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61530);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61531);assertEquals("2 Tage und 5 Stunden", PeriodFormat.wordBased(DE).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_de_parseOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8nlsj1bh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8nlsj1bh8(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61532);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61533);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61534);assertEquals(p, PeriodFormat.wordBased(DE).parsePeriod("2 Tage"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_de_parseTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wirbd81bhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wirbd81bhb(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61535);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61536);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61537);assertEquals(p, PeriodFormat.wordBased(DE).parsePeriod("2 Tage und 5 Stunden"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_de_cached() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2fyzg1bhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2fyzg1bhe(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61538);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61539);assertSame(PeriodFormat.wordBased(DE), PeriodFormat.wordBased(DE));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale nl)
    //-----------------------------------------------------------------------
    public void test_wordBased_nl_formatStandard() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ij2xz1bhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ij2xz1bhg(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61540);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61541);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61542);assertEquals("1 dag, 5 uur, 6 minuten, 7 seconden en 8 milliseconden", PeriodFormat.wordBased(NL).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_nl_FormatOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbhwk01bhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbhwk01bhj(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61543);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61544);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61545);assertEquals("2 dagen", PeriodFormat.wordBased(NL).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_nl_formatTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dxy0n1bhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dxy0n1bhm(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61546);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61547);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61548);assertEquals("2 dagen en 5 uur", PeriodFormat.wordBased(NL).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_nl_parseOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdioz41bhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdioz41bhp(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61549);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61550);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61551);assertEquals(p, PeriodFormat.wordBased(NL).parsePeriod("2 dagen"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_nl_parseTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9rgqx1bhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9rgqx1bhs(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61552);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61553);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61554);assertEquals(p, PeriodFormat.wordBased(NL).parsePeriod("2 dagen en 5 uur"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_nl_cached() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du7ml51bhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du7ml51bhv(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61555);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61556);assertSame(PeriodFormat.wordBased(NL), PeriodFormat.wordBased(NL));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale da)
    //-----------------------------------------------------------------------
    public void test_wordBased_da_formatMultiple() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1162n3n1bhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_da_formatMultiple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1162n3n1bhx(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61557);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61558);Period p = new Period(2, 3, 4, 2, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61559);assertEquals("2 \u00e5r, 3 m\u00e5neder, 4 uger, 2 dage, 5 timer, 6 minutter, 7 sekunder og 8 millisekunder", PeriodFormat.wordBased(DA).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_da_formatSinglular() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116ehrq1bi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_da_formatSinglular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116ehrq1bi0(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61560);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61561);Period p = new Period(1, 1, 1, 1, 1, 1, 1, 1);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61562);assertEquals("1 \u00e5r, 1 m\u00e5ned, 1 uge, 1 dag, 1 time, 1 minut, 1 sekund og 1 millisekund", PeriodFormat.wordBased(DA).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void test_wordBased_da_cached() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13knj6g1bi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_da_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13knj6g1bi3(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61563);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61564);assertSame(PeriodFormat.wordBased(DA), PeriodFormat.wordBased(DA));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    // wordBased(Locale ja)
    //-----------------------------------------------------------------------
    public void test_wordBased_ja_formatMultiple() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148vtbh1bi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_formatMultiple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148vtbh1bi5(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61565);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61566);Period p = new Period(2, 3, 4, 2, 5, 6 ,7, 8);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61567);assertEquals("2\u5e743\u304b\u67084\u9031\u95932\u65e55\u6642\u95936\u52067\u79d28\u30df\u30ea\u79d2", PeriodFormat.wordBased(JA).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_ja_formatSingular() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzdb0a1bi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_formatSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzdb0a1bi8(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61568);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61569);Period p = new Period(1, 1, 1, 1, 1, 1, 1, 1);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61570);assertEquals("1\u5e741\u304b\u67081\u9031\u95931\u65e51\u6642\u95931\u52061\u79d21\u30df\u30ea\u79d2", PeriodFormat.wordBased(JA).print(p));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_ja_cached() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc0qjy1bib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc0qjy1bib(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61571);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61572);assertSame(PeriodFormat.wordBased(JA), PeriodFormat.wordBased(JA));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_ja_parseOneField() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eu1itl1bid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eu1itl1bid(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61573);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61574);Period p = Period.days(2);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61575);assertEquals(p, PeriodFormat.wordBased(JA).parsePeriod("2\u65e5"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_wordBased_ja_parseTwoFields() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uy7lky1big();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uy7lky1big(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61576);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61577);Period p = Period.days(2).withHours(5);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61578);assertEquals(p, PeriodFormat.wordBased(JA).parsePeriod("2\u65e55\u6642\u9593"));
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void test_wordBased_ja_checkRedundantSeparator() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmzd4y1bij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_checkRedundantSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmzd4y1bij(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61579);
        __CLR4_4_11beg1beglc8azxmt.R.inc(61580);try {
            // Spaces are not valid separators in Japanese
            __CLR4_4_11beg1beglc8azxmt.R.inc(61581);PeriodFormat.wordBased(JA).parsePeriod("2\u65e5 ");
            __CLR4_4_11beg1beglc8azxmt.R.inc(61582);fail("No exception was caught");
        } catch (Exception e) {
            __CLR4_4_11beg1beglc8azxmt.R.inc(61583);assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}   
    
    //-----------------------------------------------------------------------
    // Cross check languages
    //-----------------------------------------------------------------------
    public void test_wordBased_fr_from_de() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12u3dhp1bio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_from_de",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12u3dhp1bio(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61584);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61585);Locale.setDefault(DE);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61586);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61587);assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p));
  }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    public void test_wordBased_fr_from_nl() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdw3fa1bis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_from_nl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdw3fa1bis(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61588);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61589);Locale.setDefault(NL);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61590);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61591);assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p));
  }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    public void test_wordBased_en_from_de() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1623f061biw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_en_from_de",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1623f061biw(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61592);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61593);Locale.setDefault(DE);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61594);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61595);assertEquals("1 day, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", PeriodFormat.wordBased(EN).print(p));
  }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

    public void test_wordBased_en_from_nl() {__CLR4_4_11beg1beglc8azxmt.R.globalSliceStart(getClass().getName(),61596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr161z1bj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11beg1beglc8azxmt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11beg1beglc8azxmt.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_en_from_nl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr161z1bj0(){try{__CLR4_4_11beg1beglc8azxmt.R.inc(61596);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61597);Locale.setDefault(NL);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61598);Period p = new Period(0, 0, 0, 1, 5, 6 ,7, 8);
      __CLR4_4_11beg1beglc8azxmt.R.inc(61599);assertEquals("1 day, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", PeriodFormat.wordBased(EN).print(p));
  }finally{__CLR4_4_11beg1beglc8azxmt.R.flushNeeded();}}

}
