/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for ISOPeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISOPeriodFormatParsing extends TestCase {static class __CLR4_4_11bc21bc2lc8azxmb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,61432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW = (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61346);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61347);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61348);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61349);return new TestSuite(TestISOPeriodFormatParsing.class);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    public TestISOPeriodFormatParsing(String name) {
        super(name);__CLR4_4_11bc21bc2lc8azxmb.R.inc(61351);try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61350);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61352);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61353);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61354);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61355);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61356);originalLocale = Locale.getDefault();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61357);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61358);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61359);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61360);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61361);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61362);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61363);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61364);Locale.setDefault(originalLocale);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61365);originalDateTimeZone = null;
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61366);originalTimeZone = null;
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61367);originalLocale = null;
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard1() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1paoime1bco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1paoime1bco(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61368);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61369);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61370);Period p = parser.parsePeriod("P1Y2M3W4DT5H6M7.008S");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61371);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard2() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1ojtx1bcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1ojtx1bcs(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61372);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61373);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61374);Period p = parser.parsePeriod("P0Y0M0W0DT5H6M7.008S");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61375);assertEquals(new Period(0, 0, 0, 0, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard3() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isol1g1bcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isol1g1bcw(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61376);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61377);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61378);Period p = parser.parsePeriod("P0DT5H6M7.008S");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61379);assertEquals(new Period(0, 0, 0, 0, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard4() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjom8z1bd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjom8z1bd0(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61380);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61381);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61382);Period p = parser.parsePeriod("P2Y3DT5H6M7.008S");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61383);assertEquals(new Period(2, 0, 0, 3, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard5() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1caongi1bd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1caongi1bd4(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61384);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61385);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61386);Period p = parser.parsePeriod("P2YT5H6M7.008S");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61387);assertEquals(new Period(2, 0, 0, 0, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard6() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191ooo11bd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191ooo11bd8(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61388);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61389);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61390);Period p = parser.parsePeriod("PT5H6M7.008S");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61391);assertEquals(new Period(0, 0, 0, 0, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard7() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sopvk1bdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sopvk1bdc(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61392);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61393);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61394);Period p = parser.parsePeriod("P1Y2M3W4D");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61395);assertEquals(new Period(1, 2, 3, 4, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard8() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jor331bdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jor331bdg(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61396);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61397);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61398);Period p = parser.parsePeriod("PT5H6M7S");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61399);assertEquals(new Period(0, 0, 0, 0, 5, 6, 7, 0), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard9() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pb7pe1bdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pb7pe1bdk(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61400);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61401);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61402);Period p = parser.parsePeriod("PT0S");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61403);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard10() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfkvhg1bdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfkvhg1bdo(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61404);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61405);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61406);Period p = parser.parsePeriod("P0D");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61407);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandard11() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycj7p71bds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycj7p71bds(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61408);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61409);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61410);Period p = parser.parsePeriod("P0Y");
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61411);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandardFail1() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sve9z81bdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandardFail1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sve9z81bdw(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61412);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61413);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61414);try {
            __CLR4_4_11bc21bc2lc8azxmb.R.inc(61415);parser.parsePeriod("P1Y2S");
            __CLR4_4_11bc21bc2lc8azxmb.R.inc(61416);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandardFail2() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmeb6r1be1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandardFail2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmeb6r1be1(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61417);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61418);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61419);try {
            __CLR4_4_11bc21bc2lc8azxmb.R.inc(61420);parser.parsePeriod("PS");
            __CLR4_4_11bc21bc2lc8azxmb.R.inc(61421);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandardFail3() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdecea1be6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandardFail3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdecea1be6(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61422);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61423);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61424);try {
            __CLR4_4_11bc21bc2lc8azxmb.R.inc(61425);parser.parsePeriod("PTS");
            __CLR4_4_11bc21bc2lc8azxmb.R.inc(61426);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseStandardFail4() {__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceStart(getClass().getName(),61427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j4edlt1beb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bc21bc2lc8azxmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bc21bc2lc8azxmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandardFail4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j4edlt1beb(){try{__CLR4_4_11bc21bc2lc8azxmb.R.inc(61427);
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61428);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11bc21bc2lc8azxmb.R.inc(61429);try {
            __CLR4_4_11bc21bc2lc8azxmb.R.inc(61430);parser.parsePeriod("PXS");
            __CLR4_4_11bc21bc2lc8azxmb.R.inc(61431);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bc21bc2lc8azxmb.R.flushNeeded();}}

}
