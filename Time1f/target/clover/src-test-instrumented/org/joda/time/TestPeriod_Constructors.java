/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1yh4yh4lc8azw6z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,45791,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44680);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44681);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44682);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44683);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1yh4yh4lc8azw6z.R.inc(44685);try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44684);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44686);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44687);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44688);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44689);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44690);originalLocale = Locale.getDefault();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44691);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44692);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44693);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44694);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44695);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44696);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44697);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44698);Locale.setDefault(originalLocale);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44699);originalDateTimeZone = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44700);originalTimeZone = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44701);originalLocale = null;
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstants() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwyhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwyhq() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44702);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44703);Period test = Period.ZERO;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44704);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44705);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44706);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44707);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44708);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44709);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44710);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44711);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44712);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqviyi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqviyi1() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44713);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44714);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 890), Period.parse("P1Y2M3W4DT5H6M7.890S"));
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kibo7kyi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kibo7kyi3() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44715);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44716);Period test = new Period();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44717);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44718);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44719);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44720);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44721);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44722);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44723);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44724);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44725);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cryie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cryie() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44726);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44727);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44728);Period test = new Period(length);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44729);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44730);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44731);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44732);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44733);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44734);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44735);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44736);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44737);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kayiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kayiq() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44738);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44739);long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44740);Period test = new Period(length);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44741);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44742);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44743);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44744);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44745);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44746);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44747);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44748);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44749);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q015rtyj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q015rtyj2() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44750);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44751);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44752);Period test = new Period(length);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44753);assertEquals(PeriodType.standard(), test.getPeriodType());
        // only time fields are precise in AllType
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44754);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44755);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44756);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44757);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44758);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44759);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44760);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44761);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_fixedZone() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9v6jpyje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_fixedZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9v6jpyje() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44762);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44763);DateTimeZone zone = DateTimeZone.getDefault();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44764);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44765);DateTimeZone.setDefault(DateTimeZone.forOffsetHours(2));
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44766);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                5L * DateTimeConstants.MILLIS_PER_HOUR +
                6L * DateTimeConstants.MILLIS_PER_MINUTE +
                7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44767);Period test = new Period(length);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44768);assertEquals(PeriodType.standard(), test.getPeriodType());
            // only time fields are precise in AllType
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44769);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44770);assertEquals(0, test.getMonths());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44771);assertEquals(0, test.getWeeks());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44772);assertEquals(0, test.getDays());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44773);assertEquals((450 * 24) + 5, test.getHours());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44774);assertEquals(6, test.getMinutes());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44775);assertEquals(7, test.getSeconds());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44776);assertEquals(8, test.getMillis());
        } finally {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44777);DateTimeZone.setDefault(zone);
        }
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_PeriodType1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqhe5tyju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqhe5tyju() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44778);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44779);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44780);Period test = new Period(length, (PeriodType) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44781);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44782);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44783);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44784);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44785);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44786);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44787);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44788);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44789);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_PeriodType2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzhcyayk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzhcyayk6() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44790);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44791);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44792);Period test = new Period(length, PeriodType.millis());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44793);assertEquals(PeriodType.millis(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44794);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44795);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44796);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44797);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44798);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44799);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44800);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44801);assertEquals(length, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_PeriodType3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8hbqryki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8hbqryki() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44802);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44803);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44804);Period test = new Period(length, PeriodType.dayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44805);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44806);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44807);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44808);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44809);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44810);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44811);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44812);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44813);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_PeriodType4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhhaj8yku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhhaj8yku() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44814);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44815);long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44816);Period test = new Period(length, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44817);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44818);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44819);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44820);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44821);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44822);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44823);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44824);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44825);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_Chronology1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcl59wyl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcl59wyl6() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44826);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44827);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44828);Period test = new Period(length, ISOChronology.getInstance());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44829);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44830);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44831);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44832);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44833);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44834);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44835);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44836);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44837);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_Chronology2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfixwryli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfixwryli() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44838);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44839);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44840);Period test = new Period(length, ISOChronology.getInstanceUTC());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44841);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44842);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44843);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44844);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44845);assertEquals(4, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44846);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44847);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44848);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44849);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_Chronology3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6iz4aylu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6iz4aylu() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44850);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44851);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44852);Period test = new Period(length, (Chronology) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44853);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44854);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44855);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44856);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44857);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44858);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44859);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44860);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44861);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_PeriodType_Chronology1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13o11o8ym6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13o11o8ym6() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44862);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44863);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44864);Period test = new Period(length, PeriodType.time().withMillisRemoved(), ISOChronology.getInstance());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44865);assertEquals(PeriodType.time().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44866);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44867);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44868);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44869);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44870);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44871);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44872);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44873);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_PeriodType_Chronology2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f12vrymi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f12vrymi() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44874);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44875);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44876);Period test = new Period(length, PeriodType.standard(), ISOChronology.getInstanceUTC());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44877);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44878);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44879);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44880);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44881);assertEquals(4, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44882);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44883);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44884);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44885);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_PeriodType_Chronology3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tyvwqymu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tyvwqymu() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44886);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44887);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44888);Period test = new Period(length, PeriodType.standard(), (Chronology) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44889);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44890);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44891);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44892);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44893);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44894);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44895);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44896);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44897);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_PeriodType_Chronology4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162yup7yn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162yup7yn6() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44898);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44899);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44900);Period test = new Period(length, (PeriodType) null, (Chronology) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44901);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44902);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44903);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44904);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44905);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44906);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44907);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44908);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44909);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    public void testConstructor_4int1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fk5dmyni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_4int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fk5dmyni() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44910);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44911);Period test = new Period(5, 6, 7, 8);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44912);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44913);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44914);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44915);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44916);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44917);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44918);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44919);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44920);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    public void testConstructor_8int1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0fcqyynt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_8int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0fcqyynt() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44921);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44922);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44923);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44924);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44925);assertEquals(2, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44926);assertEquals(3, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44927);assertEquals(4, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44928);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44929);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44930);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44931);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    public void testConstructor_8int__PeriodType1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrz59ryo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_8int__PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrz59ryo4() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44932);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44933);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44934);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44935);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44936);assertEquals(2, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44937);assertEquals(3, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44938);assertEquals(4, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44939);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44940);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44941);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44942);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_8int__PeriodType2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0z428yof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_8int__PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0z428yof() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44943);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44944);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.dayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44945);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44946);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44947);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44948);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44949);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44950);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44951);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44952);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44953);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_8int__PeriodType3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9z2upyoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_8int__PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9z2upyoq() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44954);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44955);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44956);new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.dayTime());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(44957);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf4you();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf4you() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44958);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44959);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44960);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44961);Period test = new Period(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44962);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44963);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44964);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44965);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44966);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44967);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44968);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44969);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44970);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_long2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129fcmnyp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129fcmnyp7() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44971);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44972);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44973);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44974);Period test = new Period(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44975);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44976);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44977);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44978);assertEquals(1, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44979);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44980);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44981);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44982);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44983);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_PeriodType1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifrgreypk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifrgreypk() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44984);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44985);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44986);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44987);Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44988);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44989);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44990);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44991);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44992);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44993);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44994);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44995);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44996);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_long_PeriodType2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),44997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6rhyxypx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6rhyxypx() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(44997);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44998);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(44999);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45000);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45001);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45002);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45003);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45004);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45005);assertEquals(31, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45006);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45007);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45008);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45009);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_long_PeriodType3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxrj6gyqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxrj6gyqa() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45010);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45011);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45012);DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45013);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.standard().withMillisRemoved());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45014);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45015);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45016);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45017);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45018);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45019);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45020);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45021);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45022);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testToPeriod_PeriodType3() {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0urhuyqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testToPeriod_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0urhuyqn(){try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45023);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45024);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45025);DateTime dt2 = new DateTime(2005, 6, 9, 12, 14, 16, 18);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45026);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.yearWeekDayTime());
        
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45027);assertEquals(PeriodType.yearWeekDayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45028);assertEquals(1, test.getYears());  // tests using years and not weekyears
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45029);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45030);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45031);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45032);assertEquals(5, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45033);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45034);assertEquals(7, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45035);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_Chronology1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cacpyr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cacpyr0() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45036);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45037);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45038);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45039);Period test = new Period(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45040);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45041);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45042);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45043);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45044);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45045);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45046);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45047);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45048);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_long_Chronology2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fc956yrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fc956yrd() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45049);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45050);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45051);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45052);Period test = new Period(dt1.getMillis(), dt2.getMillis(), (Chronology) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45053);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45054);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45055);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45056);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45057);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45058);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45059);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45060);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45061);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_PeriodType_Chronology1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g1lwlpyrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g1lwlpyrq() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45062);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45063);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45064);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45065);Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, CopticChronology.getInstance());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45066);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45067);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45068);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45069);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45070);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45071);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45072);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45073);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45074);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_long_long_PeriodType_Chronology2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cslxt8ys3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cslxt8ys3() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45075);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45076);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45077);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45078);Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45079);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45080);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45081);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45082);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45083);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45084);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45085);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45086);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45087);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qodsysg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qodsysg() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45088);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45089);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45090);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45091);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45092);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45093);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45094);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45095);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45096);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45097);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45098);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45099);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45100);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplbyst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplbyst() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45101);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45102);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45103);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45104);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45105);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45106);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45107);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45108);assertEquals(1, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45109);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45110);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45111);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45112);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45113);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsuyt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsuyt6() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45114);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45115);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45116);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45117);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45118);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45119);assertEquals(3, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45120);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45121);assertEquals(1, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45122);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45123);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45124);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45125);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45126);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0dytj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0dytj() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45127);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45128);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45129);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45130);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45131);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45132);assertEquals(-3, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45133);assertEquals(-1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45134);assertEquals(-1, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45135);assertEquals(-1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45136);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45137);assertEquals(-1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45138);assertEquals(-1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45139);assertEquals(-1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RI5() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7qt7wytw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7qt7wytw() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45140);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45141);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45142);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45143);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45144);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45145);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45146);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45147);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45148);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45149);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45150);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45151);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45152);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RI_PeriodType1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bl9f0ayu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bl9f0ayu9() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45153);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45154);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45155);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45156);Period test = new Period(dt1, dt2, null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45157);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45158);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45159);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45160);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45161);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45162);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45163);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45164);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45165);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RI_PeriodType2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18c9g7tyum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18c9g7tyum() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45166);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45167);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45168);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45169);Period test = new Period(dt1, dt2, PeriodType.dayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45170);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45171);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45172);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45173);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45174);assertEquals(31, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45175);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45176);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45177);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45178);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RI_PeriodType3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1539hfcyuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1539hfcyuz() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45179);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45180);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45181);DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45182);Period test = new Period(dt1, dt2, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45183);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45184);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45185);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45186);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45187);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45188);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45189);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45190);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45191);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RI_PeriodType4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u9imvyvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u9imvyvc() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45192);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45193);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45194);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45195);Period test = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45196);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45197);assertEquals(3, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45198);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45199);assertEquals(1, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45200);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45201);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45202);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45203);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45204);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RI_PeriodType5() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11eqg5myvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11eqg5myvp() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45205);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45206);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45207);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45208);Period test = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45209);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45210);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45211);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45212);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45213);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45214);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45215);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45216);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45217);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8wm7kyw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8wm7kyw2() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45218);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45219);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45220);YearMonthDay dt2 = new YearMonthDay(2005, 7, 10);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45221);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45222);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45223);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45224);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45225);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45226);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45227);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45228);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45229);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45230);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhwl01ywf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhwl01ywf() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45231);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45232);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45233);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45234);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45235);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45236);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45237);assertEquals(11, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45238);assertEquals(1, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45239);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45240);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45241);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45242);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45243);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RP_RP2Local() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2ef6wyws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP2Local",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2ef6wyws() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45244);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45245);LocalDate dt1 = new LocalDate(2004, 6, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45246);LocalDate dt2 = new LocalDate(2005, 5, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45247);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45248);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45249);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45250);assertEquals(11, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45251);assertEquals(1, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45252);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45253);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45254);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45255);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45256);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya7i6myx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya7i6myx5() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45257);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45258);YearMonthDay dt1 = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45259);YearMonthDay dt2 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45260);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45261);new Period(dt1, dt2);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45262);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v17je5yxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v17je5yxb() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45263);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45264);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45265);YearMonthDay dt2 = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45266);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45267);new Period(dt1, dt2);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45268);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP5() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs7kloyxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs7kloyxh() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45269);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45270);YearMonthDay dt1 = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45271);YearMonthDay dt2 = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45272);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45273);new Period(dt1, dt2);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45274);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP6() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oj7lt7yxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oj7lt7yxn() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45275);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45276);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45277);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45278);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45279);new Period(dt1, dt2);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45280);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RP_RP7() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1la7n0qyxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1la7n0qyxt() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45281);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45282);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45283);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45284);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45285);new Period(dt1, dt2);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45286);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RP_RP8() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i17o89yxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i17o89yxz() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45287);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45288);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45289);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45290);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45291);new Period(dt1, dt2);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45292);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP_PeriodType1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1we6tuiyy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1we6tuiyy5() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45293);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45294);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45295);YearMonthDay dt2 = new YearMonthDay(2005, 7, 10);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45296);Period test = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45297);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45298);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45299);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45300);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45301);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45302);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45303);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45304);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45305);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP_PeriodType2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t56v21yyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t56v21yyi() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45306);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45307);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45308);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45309);Period test = new Period(dt1, dt2, PeriodType.yearMonthDay());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45310);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45311);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45312);assertEquals(11, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45313);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45314);assertEquals(8, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45315);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45316);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45317);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45318);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RP_RP_PeriodType2Local() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj99gyyyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType2Local",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj99gyyyv() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45319);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45320);LocalDate dt1 = new LocalDate(2004, 6, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45321);LocalDate dt2 = new LocalDate(2005, 5, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45322);Period test = new Period(dt1, dt2, PeriodType.yearMonthDay());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45323);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45324);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45325);assertEquals(11, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45326);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45327);assertEquals(8, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45328);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45329);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45330);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45331);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP_PeriodType3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pw6w9kyz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pw6w9kyz8() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45332);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45333);YearMonthDay dt1 = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45334);YearMonthDay dt2 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45335);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45336);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45337);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP_PeriodType4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn6xh3yze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn6xh3yze() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45338);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45339);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45340);YearMonthDay dt2 = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45341);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45342);new Period(dt1, dt2);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45343);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP_PeriodType5() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je6yomyzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je6yomyzk() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45344);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45345);YearMonthDay dt1 = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45346);YearMonthDay dt2 = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45347);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45348);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45349);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_RP_RP_PeriodType6() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g56zw5yzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g56zw5yzq() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45350);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45351);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45352);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45353);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45354);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45355);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RP_RP_PeriodType7() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cw713oyzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cw713oyzw() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45356);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45357);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45358);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45359);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45360);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45361);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RP_RP_PeriodType8() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19n72b7z02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19n72b7z02() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45362);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45363);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45364);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45365);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45366);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45367);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RD1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqt357z08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqt357z08() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45368);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45369);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45370);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45371);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45372);Period test = new Period(dt1, dur);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45373);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45374);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45375);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45376);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45377);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45378);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45379);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45380);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45381);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RD2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qht4cqz0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qht4cqz0m() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45382);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45383);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45384);Duration dur = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45385);Period test = new Period(dt1, dur);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45386);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45387);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45388);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45389);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45390);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45391);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45392);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45393);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45394);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RD_PeriodType1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wz1nflz0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wz1nflz0z() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45395);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45396);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45397);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45398);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45399);Period test = new Period(dt1, dur, PeriodType.yearDayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45400);assertEquals(PeriodType.yearDayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45401);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45402);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45403);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45404);assertEquals(31, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45405);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45406);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45407);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45408);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RI_RD_PeriodType2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt2fr2z1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt2fr2z1d() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45409);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45410);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45411);Duration dur = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45412);Period test = new Period(dt1, dur, (PeriodType) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45413);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45414);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45415);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45416);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45417);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45418);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45419);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45420);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45421);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RD_RI1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160dzxnz1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160dzxnz1q() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45422);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45423);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45424);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45425);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45426);Period test = new Period(dur, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45427);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45428);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45429);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45430);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45431);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45432);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45433);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45434);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45435);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RD_RI2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199dyq4z24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199dyq4z24() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45436);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45437);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45438);Duration dur = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45439);Period test = new Period(dur, dt1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45440);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45441);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45442);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45443);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45444);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45445);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45446);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45447);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45448);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RD_RI_PeriodType1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqhpzfz2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqhpzfz2h() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45449);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45450);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45451);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45452);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45453);Period test = new Period(dur, dt2, PeriodType.yearDayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45454);assertEquals(PeriodType.yearDayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45455);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45456);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45457);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45458);assertEquals(31, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45459);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45460);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45461);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45462);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_RD_RI_PeriodType2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzhorwz2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzhorwz2v() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45463);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45464);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45465);Duration dur = null;
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45466);Period test = new Period(dur, dt1, (PeriodType) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45467);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45468);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45469);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45470);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45471);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45472);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45473);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45474);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45475);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyz38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyz38() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45476);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45477);Period test = new Period("P1Y2M3D");
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45478);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45479);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45480);assertEquals(2, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45481);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45482);assertEquals(3, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45483);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45484);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45485);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45486);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_Object2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5fz3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5fz3j() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45487);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45488);Period test = new Period((Object) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45489);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45490);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45491);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45492);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45493);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45494);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45495);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45496);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45497);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_Object3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxwz3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxwz3u() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45498);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45499);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()));
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45500);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45501);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45502);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45503);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45504);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45505);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45506);assertEquals(2, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45507);assertEquals(3, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45508);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_Object4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqdz45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqdz45() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45509);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45510);Period base = new Period(1, 1, 0, 1, 1, 1, 1, 1, PeriodType.standard());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45511);Period test = new Period(base);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45512);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45513);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45514);assertEquals(1, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45515);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45516);assertEquals(1, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45517);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45518);assertEquals(1, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45519);assertEquals(1, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45520);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object_PeriodType1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170brckz4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170brckz4h() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45521);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45522);Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45523);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45524);assertEquals(1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45525);assertEquals(2, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45526);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45527);assertEquals(3, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45528);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45529);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45530);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45531);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_Object_PeriodType2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9bq51z4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9bq51z4s() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45532);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45533);Period test = new Period((Object) null, PeriodType.yearMonthDayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45534);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45535);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45536);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45537);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45538);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45539);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45540);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45541);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45542);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_Object_PeriodType3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1diboxiz53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1diboxiz53() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45543);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45544);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45545);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45546);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45547);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45548);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45549);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45550);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45551);assertEquals(2, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45552);assertEquals(3, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45553);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_Object_PeriodType4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grbnpzz5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grbnpzz5e() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45554);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45555);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), (PeriodType) null);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45556);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45557);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45558);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45559);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45560);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45561);assertEquals(1, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45562);assertEquals(2, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45563);assertEquals(3, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45564);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryYears() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgj0v9z5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgj0v9z5p() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45565);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45566);Period test = Period.years(6);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45567);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45568);assertEquals(6, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45569);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45570);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45571);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45572);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45573);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45574);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45575);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testFactoryMonths() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jlno2z60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jlno2z60() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45576);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45577);Period test = Period.months(6);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45578);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45579);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45580);assertEquals(6, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45581);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45582);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45583);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45584);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45585);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45586);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testFactoryWeeks() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gchaz6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gchaz6b() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45587);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45588);Period test = Period.weeks(6);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45589);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45590);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45591);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45592);assertEquals(6, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45593);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45594);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45595);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45596);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45597);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testFactoryDays() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eiojd6z6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eiojd6z6m() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45598);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45599);Period test = Period.days(6);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45600);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45601);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45602);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45603);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45604);assertEquals(6, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45605);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45606);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45607);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45608);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testFactoryHours() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7lvlqz6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7lvlqz6x() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45609);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45610);Period test = Period.hours(6);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45611);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45612);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45613);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45614);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45615);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45616);assertEquals(6, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45617);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45618);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45619);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testFactoryMinutes() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilhdlaz78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilhdlaz78() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45620);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45621);Period test = Period.minutes(6);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45622);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45623);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45624);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45625);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45626);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45627);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45628);assertEquals(6, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45629);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45630);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testFactorySeconds() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uznhymz7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactorySeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uznhymz7j() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45631);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45632);Period test = Period.seconds(6);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45633);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45634);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45635);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45636);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45637);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45638);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45639);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45640);assertEquals(6, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45641);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testFactoryMillis() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14j2ghnz7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14j2ghnz7u() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45642);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45643);Period test = Period.millis(6);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45644);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45645);assertEquals(0, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45646);assertEquals(0, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45647);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45648);assertEquals(0, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45649);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45650);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45651);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45652);assertEquals(6, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    public void testConstructor_trickyDifferences_RI_RI_toFeb_standardYear() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h795cuz85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_standardYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h795cuz85() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45653);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45654);DateTime dt1 = new DateTime(2011, 1, 1, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45655);DateTime dt2 = new DateTime(2011, 2, 28, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45656);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45657);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45658);assertEquals(new Period(0, 1, 3, 6, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_RI_RI_toFeb_leapYear() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohbsyfz8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_leapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohbsyfz8b() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45659);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45660);DateTime dt1 = new DateTime(2012, 1, 1, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45661);DateTime dt2 = new DateTime(2012, 2, 29, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45662);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45663);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45664);assertEquals(new Period(0, 1, 4, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2mkjgz8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2mkjgz8h() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45665);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45666);DateTime dt1 = new DateTime(2004, 12, 28, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45667);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45668);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45669);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45670);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r87j83z8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r87j83z8n() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45671);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45672);DateTime dt1 = new DateTime(2004, 12, 29, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45673);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45674);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45675);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45676);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nz7kfmz8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nz7kfmz8t() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45677);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45678);DateTime dt1 = new DateTime(2004, 12, 30, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45679);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45680);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45681);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45682);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kq7ln5z8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kq7ln5z8z() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45683);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45684);DateTime dt1 = new DateTime(2004, 12, 31, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45685);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45686);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45687);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45688);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx1qlkz95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx1qlkz95() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45689);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45690);DateTime dt1 = new DateTime(2013, 1, 31, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45691);DateTime dt2 = new DateTime(2013, 3, 30, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45692);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45693);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45694);assertEquals(new Period(0, 1, 4, 2, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xv2cl3z9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xv2cl3z9b() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45695);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45696);DateTime dt1 = new DateTime(2013, 1, 31, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45697);DateTime dt2 = new DateTime(2013, 3, 31, 0, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45698);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45699);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45700);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    public void testConstructor_trickyDifferences_LD_LD_toFeb_standardYear() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n51ngiz9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_standardYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n51ngiz9h() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45701);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45702);LocalDate dt1 = new LocalDate(2011, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45703);LocalDate dt2 = new LocalDate(2011, 2, 28);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45704);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45705);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45706);assertEquals(new Period(0, 1, 3, 6, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_LD_LD_toFeb_leapYear() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13e9jg7z9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_leapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13e9jg7z9n() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45707);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45708);LocalDate dt1 = new LocalDate(2012, 1, 1);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45709);LocalDate dt2 = new LocalDate(2012, 2, 29);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45710);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45711);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45712);assertEquals(new Period(0, 1, 4, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmy2p0z9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmy2p0z9t() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45713);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45714);LocalDate dt1 = new LocalDate(2004, 12, 28);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45715);LocalDate dt2 = new LocalDate(2005, 2, 28);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45716);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45717);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45718);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wo4hfz9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wo4hfz9z() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45719);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45720);LocalDate dt1 = new LocalDate(2004, 12, 29);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45721);LocalDate dt2 = new LocalDate(2005, 2, 28);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45722);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45723);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45724);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14no5oyza5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14no5oyza5() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45725);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45726);LocalDate dt1 = new LocalDate(2004, 12, 30);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45727);LocalDate dt2 = new LocalDate(2005, 2, 28);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45728);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45729);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45730);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11eo6whzab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11eo6whzab() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45731);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45732);LocalDate dt1 = new LocalDate(2004, 12, 31);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45733);LocalDate dt2 = new LocalDate(2005, 2, 28);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45734);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45735);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45736);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsiwmwzah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsiwmwzah() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45737);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45738);LocalDate dt1 = new LocalDate(2013, 1, 31);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45739);LocalDate dt2 = new LocalDate(2013, 3, 30);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45740);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45741);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45742);assertEquals(new Period(0, 1, 4, 2, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejixufzan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejixufzan() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45743);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45744);LocalDate dt1 = new LocalDate(2013, 1, 31);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45745);LocalDate dt2 = new LocalDate(2013, 3, 31);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45746);Period test = new Period(dt1, dt2);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45747);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45748);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testFactoryFieldDifference1() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qkwu4nzat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qkwu4nzat() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45749);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45750);YearMonthDay start = new YearMonthDay(2005, 4, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45751);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45752);Partial end = new Partial(types, new int[] {2004, 6, 7});
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45753);Period test = Period.fieldDifference(start, end);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45754);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45755);assertEquals(-1, test.getYears());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45756);assertEquals(2, test.getMonths());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45757);assertEquals(0, test.getWeeks());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45758);assertEquals(-2, test.getDays());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45759);assertEquals(0, test.getHours());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45760);assertEquals(0, test.getMinutes());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45761);assertEquals(0, test.getSeconds());
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45762);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testFactoryFieldDifference2() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwvc6zb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwvc6zb7() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45763);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45764);YearMonthDay ymd = new YearMonthDay(2005, 4, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45765);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45766);Period.fieldDifference(ymd, (ReadablePartial) null);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45767);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45768);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45769);Period.fieldDifference((ReadablePartial) null, ymd);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45770);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testFactoryFieldDifference3() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2wwjpzbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2wwjpzbf() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45771);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45772);YearMonthDay start = new YearMonthDay(2005, 4, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45773);TimeOfDay endTime = new TimeOfDay(12, 30, 40, 0);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45774);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45775);Period.fieldDifference(start, endTime);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45776);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testFactoryFieldDifference4() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtwxr8zbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtwxr8zbl() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45777);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45778);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45779);YearMonthDay start = new YearMonthDay(2005, 4, 9);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45780);Partial end = new Partial(types, new int[] {1, 2, 3});
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45781);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45782);Period.fieldDifference(start, end);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45783);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

    public void testFactoryFieldDifference5() throws Throwable {__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceStart(getClass().getName(),45784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkwyyrzbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yh4yh4lc8azw6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yh4yh4lc8azw6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkwyyrzbs() throws Throwable{try{__CLR4_4_1yh4yh4lc8azw6z.R.inc(45784);
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45785);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45786);Partial start = new Partial(types, new int[] {1, 2, 3});
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45787);Partial end = new Partial(types, new int[] {1, 2, 3});
        __CLR4_4_1yh4yh4lc8azw6z.R.inc(45788);try {
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45789);Period.fieldDifference(start, end);
            __CLR4_4_1yh4yh4lc8azw6z.R.inc(45790);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1yh4yh4lc8azw6z.R.flushNeeded();}}

}
