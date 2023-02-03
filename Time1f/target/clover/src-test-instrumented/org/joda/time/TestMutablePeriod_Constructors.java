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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1v91v91lc8azvzb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,41188,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1v91v91lc8azvzb.R.inc(40501);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40502);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1v91v91lc8azvzb.R.inc(40503);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40504);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1v91v91lc8azvzb.R.inc(40506);try{__CLR4_4_1v91v91lc8azvzb.R.inc(40505);
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1v91v91lc8azvzb.R.inc(40507);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40508);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40509);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1v91v91lc8azvzb.R.inc(40510);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1v91v91lc8azvzb.R.inc(40511);originalLocale = Locale.getDefault();
        __CLR4_4_1v91v91lc8azvzb.R.inc(40512);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40513);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1v91v91lc8azvzb.R.inc(40514);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1v91v91lc8azvzb.R.inc(40515);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40516);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1v91v91lc8azvzb.R.inc(40517);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40518);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40519);Locale.setDefault(originalLocale);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40520);originalDateTimeZone = null;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40521);originalTimeZone = null;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40522);originalLocale = null;
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqviv9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqviv9n() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40523);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40524);assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 890), MutablePeriod.parse("P1Y2M3W4DT5H6M7.890S"));
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kibo7kv9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kibo7kv9p() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40525);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40526);MutablePeriod test = new MutablePeriod();
        __CLR4_4_1v91v91lc8azvzb.R.inc(40527);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40528);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40529);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40530);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40531);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40532);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40533);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40534);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40535);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (PeriodType)
     */
    public void testConstructor_PeriodType1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tcd2t6va0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tcd2t6va0() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40536);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40537);MutablePeriod test = new MutablePeriod(PeriodType.yearMonthDayTime());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40538);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40539);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40540);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40541);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40542);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40543);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40544);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40545);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40546);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_PeriodType2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3d40pvab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3d40pvab() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40547);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40548);MutablePeriod test = new MutablePeriod((PeriodType) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40549);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40550);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40551);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40552);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40553);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40554);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40555);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40556);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40557);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crvam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crvam() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40558);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40559);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40560);MutablePeriod test = new MutablePeriod(length);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40561);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40562);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40563);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40564);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40565);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40566);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40567);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40568);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40569);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kavay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kavay() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40570);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40571);long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40572);MutablePeriod test = new MutablePeriod(length);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40573);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40574);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40575);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40576);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40577);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40578);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40579);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40580);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40581);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q015rtvba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q015rtvba() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40582);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40583);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40584);MutablePeriod test = new MutablePeriod(length);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40585);assertEquals(PeriodType.standard(), test.getPeriodType());
        // only time fields are precise in AllType
        __CLR4_4_1v91v91lc8azvzb.R.inc(40586);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1v91v91lc8azvzb.R.inc(40587);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40588);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40589);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40590);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40591);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40592);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40593);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_PeriodType1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqhe5tvbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqhe5tvbm() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40594);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40595);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40596);MutablePeriod test = new MutablePeriod(length, (PeriodType) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40597);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40598);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40599);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40600);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40601);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40602);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40603);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40604);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40605);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_PeriodType2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzhcyavby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzhcyavby() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40606);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40607);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40608);MutablePeriod test = new MutablePeriod(length, PeriodType.millis());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40609);assertEquals(PeriodType.millis(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40610);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40611);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40612);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40613);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40614);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40615);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40616);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40617);assertEquals(length, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_PeriodType3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8hbqrvca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8hbqrvca() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40618);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40619);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40620);MutablePeriod test = new MutablePeriod(length, PeriodType.standard());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40621);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40622);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40623);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40624);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40625);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40626);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40627);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40628);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40629);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_PeriodType4() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhhaj8vcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhhaj8vcm() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40630);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40631);long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40632);MutablePeriod test = new MutablePeriod(length, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40633);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40634);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40635);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40636);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40637);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40638);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40639);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40640);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40641);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_Chronology1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcl59wvcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcl59wvcy() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40642);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40643);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40644);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40645);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40646);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40647);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40648);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40649);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40650);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40651);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40652);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40653);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_Chronology2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfixwrvda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfixwrvda() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40654);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40655);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40656);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstanceUTC());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40657);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40658);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40659);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40660);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40661);assertEquals(4, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40662);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40663);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40664);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40665);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_Chronology3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6iz4avdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6iz4avdm() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40666);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40667);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40668);MutablePeriod test = new MutablePeriod(length, (Chronology) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40669);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40670);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40671);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40672);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40673);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40674);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40675);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40676);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40677);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_PeriodType_Chronology1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13o11o8vdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13o11o8vdy() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40678);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40679);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40680);MutablePeriod test = new MutablePeriod(length, PeriodType.time().withMillisRemoved(), ISOChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40681);assertEquals(PeriodType.time().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40682);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40683);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40684);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40685);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40686);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40687);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40688);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40689);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_PeriodType_Chronology2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f12vrvea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f12vrvea() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40690);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40691);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40692);MutablePeriod test = new MutablePeriod(length, PeriodType.standard(), ISOChronology.getInstanceUTC());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40693);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40694);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40695);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40696);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40697);assertEquals(4, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40698);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40699);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40700);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40701);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_PeriodType_Chronology3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tyvwqvem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tyvwqvem() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40702);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40703);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40704);MutablePeriod test = new MutablePeriod(length, PeriodType.standard(), (Chronology) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40705);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40706);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40707);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40708);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40709);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40710);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40711);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40712);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40713);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_PeriodType_Chronology4() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162yup7vey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162yup7vey() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40714);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40715);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1v91v91lc8azvzb.R.inc(40716);MutablePeriod test = new MutablePeriod(length, (PeriodType) null, (Chronology) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40717);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40718);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40719);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40720);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40721);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40722);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40723);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40724);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40725);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    public void testConstructor_4int1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fk5dmvfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_4int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fk5dmvfa() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40726);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40727);MutablePeriod test = new MutablePeriod(5, 6, 7, 8);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40728);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40729);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40730);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40731);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40732);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40733);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40734);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40735);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40736);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    public void testConstructor_8int1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0fcqyvfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_8int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0fcqyvfl() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40737);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40738);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40739);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40740);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40741);assertEquals(2, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40742);assertEquals(3, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40743);assertEquals(4, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40744);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40745);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40746);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40747);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    public void testConstructor_8int__PeriodType1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrz59rvfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_8int__PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrz59rvfw() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40748);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40749);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40750);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40751);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40752);assertEquals(2, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40753);assertEquals(3, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40754);assertEquals(4, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40755);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40756);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40757);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40758);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_8int__PeriodType2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0z428vg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_8int__PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0z428vg7() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40759);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40760);MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.dayTime());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40761);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40762);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40763);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40764);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40765);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40766);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40767);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40768);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40769);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_8int__PeriodType3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9z2upvgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_8int__PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9z2upvgi() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40770);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40771);try {
            __CLR4_4_1v91v91lc8azvzb.R.inc(40772);new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.dayTime());
            __CLR4_4_1v91v91lc8azvzb.R.inc(40773);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf4vgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf4vgm() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40774);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40775);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40776);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40777);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40778);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40779);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40780);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40781);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40782);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40783);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40784);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40785);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40786);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_long2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129fcmnvgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129fcmnvgz() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40787);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40788);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40789);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40790);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40791);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40792);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40793);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40794);assertEquals(1, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40795);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40796);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40797);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40798);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40799);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_PeriodType1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifrgrevhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifrgrevhc() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40800);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40801);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40802);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40803);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40804);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40805);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40806);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40807);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40808);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40809);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40810);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40811);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40812);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_long_PeriodType2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6rhyxvhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6rhyxvhp() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40813);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40814);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40815);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40816);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40817);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40818);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40819);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40820);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40821);assertEquals(31, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40822);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40823);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40824);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40825);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_long_PeriodType3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxrj6gvi2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxrj6gvi2() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40826);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40827);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40828);DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40829);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.standard().withMillisRemoved());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40830);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40831);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40832);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40833);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40834);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40835);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40836);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40837);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40838);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_Chronology1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cacpvif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cacpvif() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40839);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40840);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40841);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40842);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40843);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40844);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40845);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40846);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40847);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40848);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40849);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40850);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40851);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_long_Chronology2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fc956vis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fc956vis() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40852);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40853);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40854);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40855);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (Chronology) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40856);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40857);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40858);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40859);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40860);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40861);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40862);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40863);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40864);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_PeriodType_Chronology1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g1lwlpvj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g1lwlpvj5() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40865);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40866);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40867);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40868);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, CopticChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40869);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40870);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40871);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40872);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40873);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40874);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40875);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40876);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40877);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_long_long_PeriodType_Chronology2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cslxt8vji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cslxt8vji() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40878);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40879);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40880);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40881);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40882);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40883);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40884);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40885);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40886);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40887);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40888);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40889);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40890);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qodsvjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qodsvjv() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40891);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40892);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40893);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40894);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40895);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40896);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40897);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40898);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40899);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40900);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40901);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40902);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40903);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplbvk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplbvk8() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40904);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40905);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40906);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40907);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40908);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40909);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40910);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40911);assertEquals(1, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40912);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40913);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40914);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40915);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40916);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsuvkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsuvkl() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40917);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40918);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1v91v91lc8azvzb.R.inc(40919);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40920);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40921);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40922);assertEquals(3, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40923);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40924);assertEquals(1, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40925);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40926);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40927);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40928);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40929);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0dvky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0dvky() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40930);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40931);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40932);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1v91v91lc8azvzb.R.inc(40933);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40934);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40935);assertEquals(-3, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40936);assertEquals(-1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40937);assertEquals(-1, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40938);assertEquals(-1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40939);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40940);assertEquals(-1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40941);assertEquals(-1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40942);assertEquals(-1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RI5() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7qt7wvlb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7qt7wvlb() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40943);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40944);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1v91v91lc8azvzb.R.inc(40945);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1v91v91lc8azvzb.R.inc(40946);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40947);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40948);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40949);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40950);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40951);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40952);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40953);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40954);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40955);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RI_PeriodType1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bl9f0avlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bl9f0avlo() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40956);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40957);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40958);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40959);MutablePeriod test = new MutablePeriod(dt1, dt2, null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40960);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40961);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40962);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40963);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40964);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40965);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40966);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40967);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40968);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RI_PeriodType2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18c9g7tvm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18c9g7tvm1() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40969);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40970);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40971);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40972);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.dayTime());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40973);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40974);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40975);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40976);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40977);assertEquals(31, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40978);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40979);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40980);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40981);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RI_PeriodType3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1539hfcvme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1539hfcvme() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40982);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40983);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40984);DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40985);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40986);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40987);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40988);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40989);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40990);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40991);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40992);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40993);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40994);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RI_PeriodType4() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),40995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u9imvvmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u9imvvmr() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(40995);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40996);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1v91v91lc8azvzb.R.inc(40997);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(40998);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.standard());
        __CLR4_4_1v91v91lc8azvzb.R.inc(40999);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41000);assertEquals(3, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41001);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41002);assertEquals(1, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41003);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41004);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41005);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41006);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41007);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RI_PeriodType5() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11eqg5mvn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11eqg5mvn4() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41008);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41009);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1v91v91lc8azvzb.R.inc(41010);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1v91v91lc8azvzb.R.inc(41011);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.standard());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41012);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41013);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41014);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41015);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41016);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41017);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41018);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41019);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41020);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RD1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqt357vnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqt357vnh() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41021);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41022);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41023);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41024);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1v91v91lc8azvzb.R.inc(41025);MutablePeriod test = new MutablePeriod(dt1, dur);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41026);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41027);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41028);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41029);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41030);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41031);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41032);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41033);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41034);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RD2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qht4cqvnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qht4cqvnv() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41035);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41036);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41037);Duration dur = null;
        __CLR4_4_1v91v91lc8azvzb.R.inc(41038);MutablePeriod test = new MutablePeriod(dt1, dur);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41039);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41040);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41041);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41042);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41043);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41044);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41045);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41046);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41047);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RD_PeriodType1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wz1nflvo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wz1nflvo8() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41048);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41049);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41050);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41051);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1v91v91lc8azvzb.R.inc(41052);MutablePeriod test = new MutablePeriod(dt1, dur, PeriodType.yearDayTime());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41053);assertEquals(PeriodType.yearDayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41054);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41055);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41056);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41057);assertEquals(31, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41058);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41059);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41060);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41061);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_RI_RD_PeriodType2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt2fr2vom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt2fr2vom() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41062);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41063);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41064);Duration dur = null;
        __CLR4_4_1v91v91lc8azvzb.R.inc(41065);MutablePeriod test = new MutablePeriod(dt1, dur, (PeriodType) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41066);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41067);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41068);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41069);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41070);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41071);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41072);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41073);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41074);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyvoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyvoz() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41075);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41076);MutablePeriod test = new MutablePeriod("P1Y2M3D");
        __CLR4_4_1v91v91lc8azvzb.R.inc(41077);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41078);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41079);assertEquals(2, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41080);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41081);assertEquals(3, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41082);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41083);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41084);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41085);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_Object2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5fvpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5fvpa() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41086);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41087);MutablePeriod test = new MutablePeriod((Object) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41088);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41089);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41090);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41091);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41092);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41093);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41094);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41095);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41096);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_Object3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxwvpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxwvpl() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41097);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41098);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()));
        __CLR4_4_1v91v91lc8azvzb.R.inc(41099);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41100);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41101);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41102);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41103);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41104);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41105);assertEquals(2, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41106);assertEquals(3, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41107);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_Object4() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqdvpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqdvpw() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41108);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41109);Period base = new Period(1, 1, 0, 1, 1, 1, 1, 1, PeriodType.standard());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41110);MutablePeriod test = new MutablePeriod(base);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41111);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41112);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41113);assertEquals(1, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41114);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41115);assertEquals(1, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41116);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41117);assertEquals(1, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41118);assertEquals(1, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41119);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object,PeriodType)
     */
    public void testConstructor_Object_PeriodType1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170brckvq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170brckvq8() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41120);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41121);MutablePeriod test = new MutablePeriod("P1Y2M3D", PeriodType.yearMonthDayTime());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41122);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41123);assertEquals(1, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41124);assertEquals(2, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41125);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41126);assertEquals(3, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41127);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41128);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41129);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41130);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_Object_PeriodType2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9bq51vqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9bq51vqj() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41131);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41132);MutablePeriod test = new MutablePeriod((Object) null, PeriodType.yearMonthDayTime());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41133);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41134);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41135);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41136);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41137);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41138);assertEquals(0, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41139);assertEquals(0, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41140);assertEquals(0, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41141);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_Object_PeriodType3() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1diboxivqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1diboxivqu() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41142);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41143);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41144);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41145);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41146);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41147);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41148);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41149);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41150);assertEquals(2, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41151);assertEquals(3, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41152);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_Object_PeriodType4() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grbnpzvr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grbnpzvr5() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41153);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41154);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), (PeriodType) null);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41155);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41156);assertEquals(0, test.getYears());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41157);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41158);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41159);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41160);assertEquals(1, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41161);assertEquals(2, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41162);assertEquals(3, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41163);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object_Chronology1() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmfignvrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmfignvrg() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41164);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41165);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1v91v91lc8azvzb.R.inc(41166);MutablePeriod test = new MutablePeriod(new Duration(length), ISOChronology.getInstance());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41167);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41168);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1v91v91lc8azvzb.R.inc(41169);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41170);assertEquals(0, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41171);assertEquals(0, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41172);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41173);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41174);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41175);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

    public void testConstructor_Object_Chronology2() throws Throwable {__CLR4_4_1v91v91lc8azvzb.R.globalSliceStart(getClass().getName(),41176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svfh94vrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v91v91lc8azvzb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v91v91lc8azvzb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svfh94vrs() throws Throwable{try{__CLR4_4_1v91v91lc8azvzb.R.inc(41176);
        __CLR4_4_1v91v91lc8azvzb.R.inc(41177);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1v91v91lc8azvzb.R.inc(41178);MutablePeriod test = new MutablePeriod(new Duration(length), ISOChronology.getInstanceUTC());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41179);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41180);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1v91v91lc8azvzb.R.inc(41181);assertEquals(0, test.getMonths());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41182);assertEquals(64, test.getWeeks());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41183);assertEquals(2, test.getDays());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41184);assertEquals(5, test.getHours());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41185);assertEquals(6, test.getMinutes());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41186);assertEquals(7, test.getSeconds());
        __CLR4_4_1v91v91lc8azvzb.R.inc(41187);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1v91v91lc8azvzb.R.flushNeeded();}}

}
