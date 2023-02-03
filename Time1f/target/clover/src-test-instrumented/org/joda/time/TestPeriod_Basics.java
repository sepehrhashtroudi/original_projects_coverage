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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BasePeriod;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1xsexselc8azw5o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,44680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) {try{__CLR4_4_1xsexselc8azw5o.R.inc(43790);
        __CLR4_4_1xsexselc8azw5o.R.inc(43791);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1xsexselc8azw5o.R.inc(43792);
        __CLR4_4_1xsexselc8azw5o.R.inc(43793);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1xsexselc8azw5o.R.inc(43795);try{__CLR4_4_1xsexselc8azw5o.R.inc(43794);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1xsexselc8azw5o.R.inc(43796);
        __CLR4_4_1xsexselc8azw5o.R.inc(43797);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1xsexselc8azw5o.R.inc(43798);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1xsexselc8azw5o.R.inc(43799);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1xsexselc8azw5o.R.inc(43800);originalLocale = Locale.getDefault();
        __CLR4_4_1xsexselc8azw5o.R.inc(43801);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1xsexselc8azw5o.R.inc(43802);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1xsexselc8azw5o.R.inc(43803);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1xsexselc8azw5o.R.inc(43804);
        __CLR4_4_1xsexselc8azw5o.R.inc(43805);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1xsexselc8azw5o.R.inc(43806);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1xsexselc8azw5o.R.inc(43807);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1xsexselc8azw5o.R.inc(43808);Locale.setDefault(originalLocale);
        __CLR4_4_1xsexselc8azw5o.R.inc(43809);originalDateTimeZone = null;
        __CLR4_4_1xsexselc8azw5o.R.inc(43810);originalTimeZone = null;
        __CLR4_4_1xsexselc8azw5o.R.inc(43811);originalLocale = null;
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjxt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjxt0(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43812);
        __CLR4_4_1xsexselc8azw5o.R.inc(43813);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1xsexselc8azw5o.R.inc(43814);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1xsexselc8azw5o.R.inc(43815);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPeriodType() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1ixt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1ixt4(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43816);
        __CLR4_4_1xsexselc8azw5o.R.inc(43817);Period test = new Period(0L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43818);assertEquals(PeriodType.standard(), test.getPeriodType());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testGetMethods() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzxt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzxt7(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43819);
        __CLR4_4_1xsexselc8azw5o.R.inc(43820);Period test = new Period(0L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43821);assertEquals(0, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(43822);assertEquals(0, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(43823);assertEquals(0, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(43824);assertEquals(0, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(43825);assertEquals(0, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(43826);assertEquals(0, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(43827);assertEquals(0, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(43828);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testValueIndexMethods() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4dda2xth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testValueIndexMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4dda2xth(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43829);
        __CLR4_4_1xsexselc8azw5o.R.inc(43830);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(43831);assertEquals(6, test.size());
        __CLR4_4_1xsexselc8azw5o.R.inc(43832);assertEquals(1, test.getValue(0));
        __CLR4_4_1xsexselc8azw5o.R.inc(43833);assertEquals(4, test.getValue(1));
        __CLR4_4_1xsexselc8azw5o.R.inc(43834);assertEquals(5, test.getValue(2));
        __CLR4_4_1xsexselc8azw5o.R.inc(43835);assertEquals(6, test.getValue(3));
        __CLR4_4_1xsexselc8azw5o.R.inc(43836);assertEquals(7, test.getValue(4));
        __CLR4_4_1xsexselc8azw5o.R.inc(43837);assertEquals(8, test.getValue(5));
        __CLR4_4_1xsexselc8azw5o.R.inc(43838);assertEquals(true, Arrays.equals(new int[] {1, 4, 5, 6, 7, 8}, test.getValues()));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testTypeIndexMethods() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i681n7xtr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testTypeIndexMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i681n7xtr(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43839);
        __CLR4_4_1xsexselc8azw5o.R.inc(43840);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(43841);assertEquals(6, test.size());
        __CLR4_4_1xsexselc8azw5o.R.inc(43842);assertEquals(DurationFieldType.years(), test.getFieldType(0));
        __CLR4_4_1xsexselc8azw5o.R.inc(43843);assertEquals(DurationFieldType.days(), test.getFieldType(1));
        __CLR4_4_1xsexselc8azw5o.R.inc(43844);assertEquals(DurationFieldType.hours(), test.getFieldType(2));
        __CLR4_4_1xsexselc8azw5o.R.inc(43845);assertEquals(DurationFieldType.minutes(), test.getFieldType(3));
        __CLR4_4_1xsexselc8azw5o.R.inc(43846);assertEquals(DurationFieldType.seconds(), test.getFieldType(4));
        __CLR4_4_1xsexselc8azw5o.R.inc(43847);assertEquals(DurationFieldType.millis(), test.getFieldType(5));
        __CLR4_4_1xsexselc8azw5o.R.inc(43848);assertEquals(true, Arrays.equals(new DurationFieldType[] {
            DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(),
            DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()},
            test.getFieldTypes()));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testIsSupported() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24nxu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24nxu1(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43849);
        __CLR4_4_1xsexselc8azw5o.R.inc(43850);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(43851);assertEquals(true, test.isSupported(DurationFieldType.years()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43852);assertEquals(false, test.isSupported(DurationFieldType.months()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43853);assertEquals(false, test.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43854);assertEquals(true, test.isSupported(DurationFieldType.days()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43855);assertEquals(true, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43856);assertEquals(true, test.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43857);assertEquals(true, test.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43858);assertEquals(true, test.isSupported(DurationFieldType.millis()));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}        

    public void testIndexOf() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1656tvixub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testIndexOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1656tvixub(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43859);
        __CLR4_4_1xsexselc8azw5o.R.inc(43860);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(43861);assertEquals(0, test.indexOf(DurationFieldType.years()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43862);assertEquals(-1, test.indexOf(DurationFieldType.months()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43863);assertEquals(-1, test.indexOf(DurationFieldType.weeks()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43864);assertEquals(1, test.indexOf(DurationFieldType.days()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43865);assertEquals(2, test.indexOf(DurationFieldType.hours()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43866);assertEquals(3, test.indexOf(DurationFieldType.minutes()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43867);assertEquals(4, test.indexOf(DurationFieldType.seconds()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43868);assertEquals(5, test.indexOf(DurationFieldType.millis()));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testGet() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3vxul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3vxul(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43869);
        __CLR4_4_1xsexselc8azw5o.R.inc(43870);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(43871);assertEquals(1, test.get(DurationFieldType.years()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43872);assertEquals(0, test.get(DurationFieldType.months()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43873);assertEquals(0, test.get(DurationFieldType.weeks()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43874);assertEquals(4, test.get(DurationFieldType.days()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43875);assertEquals(5, test.get(DurationFieldType.hours()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43876);assertEquals(6, test.get(DurationFieldType.minutes()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43877);assertEquals(7, test.get(DurationFieldType.seconds()));
        __CLR4_4_1xsexselc8azw5o.R.inc(43878);assertEquals(8, test.get(DurationFieldType.millis()));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77xuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77xuv(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43879);
        __CLR4_4_1xsexselc8azw5o.R.inc(43880);Period test1 = new Period(123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43881);Period test2 = new Period(123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43882);assertEquals(true, test1.equals(test2));
        __CLR4_4_1xsexselc8azw5o.R.inc(43883);assertEquals(true, test2.equals(test1));
        __CLR4_4_1xsexselc8azw5o.R.inc(43884);assertEquals(true, test1.equals(test1));
        __CLR4_4_1xsexselc8azw5o.R.inc(43885);assertEquals(true, test2.equals(test2));
        __CLR4_4_1xsexselc8azw5o.R.inc(43886);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1xsexselc8azw5o.R.inc(43887);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1xsexselc8azw5o.R.inc(43888);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43889);Period test3 = new Period(321L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43890);assertEquals(false, test1.equals(test3));
        __CLR4_4_1xsexselc8azw5o.R.inc(43891);assertEquals(false, test2.equals(test3));
        __CLR4_4_1xsexselc8azw5o.R.inc(43892);assertEquals(false, test3.equals(test1));
        __CLR4_4_1xsexselc8azw5o.R.inc(43893);assertEquals(false, test3.equals(test2));
        __CLR4_4_1xsexselc8azw5o.R.inc(43894);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1xsexselc8azw5o.R.inc(43895);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43896);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1xsexselc8azw5o.R.inc(43897);assertEquals(true, test1.equals(new MockPeriod(123L)));
        __CLR4_4_1xsexselc8azw5o.R.inc(43898);assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime())));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1xsexselc8azw5o.R.inc(43900);try{__CLR4_4_1xsexselc8azw5o.R.inc(43899);
        }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9xvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9xvh() throws Exception{try{__CLR4_4_1xsexselc8azw5o.R.inc(43901);
        __CLR4_4_1xsexselc8azw5o.R.inc(43902);Period test = new Period(123L);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43903);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1xsexselc8azw5o.R.inc(43904);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1xsexselc8azw5o.R.inc(43905);oos.writeObject(test);
        __CLR4_4_1xsexselc8azw5o.R.inc(43906);byte[] bytes = baos.toByteArray();
        __CLR4_4_1xsexselc8azw5o.R.inc(43907);oos.close();
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43908);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1xsexselc8azw5o.R.inc(43909);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1xsexselc8azw5o.R.inc(43910);Period result = (Period) ois.readObject();
        __CLR4_4_1xsexselc8azw5o.R.inc(43911);ois.close();
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43912);assertEquals(test, result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    public void testAddTo1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, -2);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo3() {
//        long expected = TEST_TIME_NOW;
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 0);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo4() {
//        long expected = TEST_TIME_NOW + 100L;
//        Period test = new Period(100L);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToWithChronology1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1, ISOChronology.getInstance());
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, ISOChronology.getInstanceUTC());  // local specified so use it
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, null);  // no chrono specified so use default
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToRI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        DateTime added = test.addTo(new Instant(), 1);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new Instant(), -2);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(ISOChronology.getInstanceUTC()), -2);  // DateTime has UTC time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstanceUTC(), added.getChronology());
//    }
//    
//    public void testAddToRI4() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance(PARIS).years().add(expected, -2);
//        expected = ISOChronology.getInstance(PARIS).months().add(expected, -4);
//        expected = ISOChronology.getInstance(PARIS).weeks().add(expected, -6);
//        expected = ISOChronology.getInstance(PARIS).days().add(expected, -8);
//        expected = ISOChronology.getInstance(PARIS).hours().add(expected, -10);
//        expected = ISOChronology.getInstance(PARIS).minutes().add(expected, -12);
//        expected = ISOChronology.getInstance(PARIS).seconds().add(expected, -14);
//        expected = ISOChronology.getInstance(PARIS).millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(PARIS), -2);  // DateTime has PARIS time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(PARIS), added.getChronology());
//    }
//    
//    public void testAddToRI5() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(null, -2);  // null has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddIntoRWI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, 1);
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, -2);  // MutableDateTime has a chronology, use it
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI3() {
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        try {
//            test.addInto(null, 1);
//            fail();
//        } catch (IllegalArgumentException ex) {}
//    }
    
    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidxvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidxvt(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43913);
        __CLR4_4_1xsexselc8azw5o.R.inc(43914);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(43915);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43916);test = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(43917);assertEquals("PT0S", test.toString());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43918);test = new Period(12345L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43919);assertEquals("PT12.345S", test.toString());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_PeriodFormatter() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkl5o1xw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_PeriodFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkl5o1xw0(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43920);
        __CLR4_4_1xsexselc8azw5o.R.inc(43921);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(43922);assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString(PeriodFormat.getDefault()));
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43923);test = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(43924);assertEquals("0 milliseconds", test.toString(PeriodFormat.getDefault()));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToString_nullPeriodFormatter() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19j49hkxw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_nullPeriodFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19j49hkxw5(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43925);
        __CLR4_4_1xsexselc8azw5o.R.inc(43926);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(43927);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString((PeriodFormatter) null));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17xw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17xw8(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43928);
        __CLR4_4_1xsexselc8azw5o.R.inc(43929);Period test = new Period(123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43930);Period result = test.toPeriod();
        __CLR4_4_1xsexselc8azw5o.R.inc(43931);assertSame(test, result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToMutablePeriod() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v2j33xwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToMutablePeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v2j33xwc(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43932);
        __CLR4_4_1xsexselc8azw5o.R.inc(43933);Period test = new Period(123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43934);MutablePeriod result = test.toMutablePeriod();
        __CLR4_4_1xsexselc8azw5o.R.inc(43935);assertEquals(test, result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
//    public void testToDurationMillisFrom() {
//        Period test = new Period(123L);
//        assertEquals(123L, test.toDurationMillisFrom(0L, null));
//    }

    public void testToDurationFrom() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkq832xwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToDurationFrom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkq832xwg(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43936);
        __CLR4_4_1xsexselc8azw5o.R.inc(43937);Period test = new Period(123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43938);assertEquals(new Duration(123L), test.toDurationFrom(new Instant(0L)));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToDurationTo() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8901vxwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToDurationTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8901vxwj(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43939);
        __CLR4_4_1xsexselc8azw5o.R.inc(43940);Period test = new Period(123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43941);assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L)));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithPeriodType1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d5hicbxwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d5hicbxwm(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43942);
        __CLR4_4_1xsexselc8azw5o.R.inc(43943);Period test = new Period(123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43944);Period result = test.withPeriodType(PeriodType.standard());
        __CLR4_4_1xsexselc8azw5o.R.inc(43945);assertSame(test, result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithPeriodType2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19whjjuxwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19whjjuxwq(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43946);
        __CLR4_4_1xsexselc8azw5o.R.inc(43947);Period test = new Period(3123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43948);Period result = test.withPeriodType(PeriodType.dayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(43949);assertEquals(3, result.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(43950);assertEquals(123, result.getMillis());
        __CLR4_4_1xsexselc8azw5o.R.inc(43951);assertEquals(PeriodType.dayTime(), result.getPeriodType());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithPeriodType3() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nhkrdxww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nhkrdxww(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43952);
        __CLR4_4_1xsexselc8azw5o.R.inc(43953);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        __CLR4_4_1xsexselc8azw5o.R.inc(43954);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(43955);test.withPeriodType(PeriodType.dayTime());
            __CLR4_4_1xsexselc8azw5o.R.inc(43956);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithPeriodType4() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ehlywxx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ehlywxx1(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43957);
        __CLR4_4_1xsexselc8azw5o.R.inc(43958);Period test = new Period(3123L);
        __CLR4_4_1xsexselc8azw5o.R.inc(43959);Period result = test.withPeriodType(null);
        __CLR4_4_1xsexselc8azw5o.R.inc(43960);assertEquals(3, result.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(43961);assertEquals(123, result.getMillis());
        __CLR4_4_1xsexselc8azw5o.R.inc(43962);assertEquals(PeriodType.standard(), result.getPeriodType());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithPeriodType5() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15hn6fxx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15hn6fxx7(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43963);
        __CLR4_4_1xsexselc8azw5o.R.inc(43964);Period test = new Period(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.standard());
        __CLR4_4_1xsexselc8azw5o.R.inc(43965);Period result = test.withPeriodType(PeriodType.yearMonthDayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(43966);assertEquals(PeriodType.yearMonthDayTime(), result.getPeriodType());
        __CLR4_4_1xsexselc8azw5o.R.inc(43967);assertEquals(1, result.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(43968);assertEquals(2, result.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(43969);assertEquals(0, result.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(43970);assertEquals(4, result.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(43971);assertEquals(5, result.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(43972);assertEquals(6, result.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(43973);assertEquals(7, result.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(43974);assertEquals(8, result.getMillis());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFields1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h744vtxxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h744vtxxj(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43975);
        __CLR4_4_1xsexselc8azw5o.R.inc(43976);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(43977);Period test2 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis());
        __CLR4_4_1xsexselc8azw5o.R.inc(43978);Period result = test1.withFields(test2);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43979);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1);
        __CLR4_4_1xsexselc8azw5o.R.inc(43980);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test2);
        __CLR4_4_1xsexselc8azw5o.R.inc(43981);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 9), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithFields2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dy463cxxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dy463cxxq(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43982);
        __CLR4_4_1xsexselc8azw5o.R.inc(43983);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(43984);Period test2 = null;
        __CLR4_4_1xsexselc8azw5o.R.inc(43985);Period result = test1.withFields(test2);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43986);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1);
        __CLR4_4_1xsexselc8azw5o.R.inc(43987);assertSame(test1, result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithFields3() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ap47avxxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ap47avxxw(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43988);
        __CLR4_4_1xsexselc8azw5o.R.inc(43989);Period test1 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis());
        __CLR4_4_1xsexselc8azw5o.R.inc(43990);Period test2 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(43991);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(43992);test1.withFields(test2);
            __CLR4_4_1xsexselc8azw5o.R.inc(43993);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1xsexselc8azw5o.R.inc(43994);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test1);
        __CLR4_4_1xsexselc8azw5o.R.inc(43995);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test2);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),43996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16yxy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16yxy4(){try{__CLR4_4_1xsexselc8azw5o.R.inc(43996);
        __CLR4_4_1xsexselc8azw5o.R.inc(43997);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(43998);Period result = test.withField(DurationFieldType.years(), 6);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(43999);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44000);assertEquals(new Period(6, 2, 3, 4, 5, 6, 7, 8), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithField2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2ehxy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2ehxy9(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44001);
        __CLR4_4_1xsexselc8azw5o.R.inc(44002);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44003);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44004);test.withField(null, 6);
            __CLR4_4_1xsexselc8azw5o.R.inc(44005);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithField3() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2e3m0xye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2e3m0xye(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44006);
        __CLR4_4_1xsexselc8azw5o.R.inc(44007);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        __CLR4_4_1xsexselc8azw5o.R.inc(44008);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44009);test.withField(DurationFieldType.years(), 6);
            __CLR4_4_1xsexselc8azw5o.R.inc(44010);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithField4() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bte4tjxyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bte4tjxyj(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44011);
        __CLR4_4_1xsexselc8azw5o.R.inc(44012);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        __CLR4_4_1xsexselc8azw5o.R.inc(44013);Period result = test.withField(DurationFieldType.years(), 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44014);assertEquals(test, result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22xyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22xyn(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44015);
        __CLR4_4_1xsexselc8azw5o.R.inc(44016);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44017);Period result = test.withFieldAdded(DurationFieldType.years(), 6);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44018);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44019);assertEquals(new Period(7, 2, 3, 4, 5, 6, 7, 8), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithFieldAdded2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150grujxys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150grujxys(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44020);
        __CLR4_4_1xsexselc8azw5o.R.inc(44021);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44022);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44023);test.withFieldAdded(null, 0);
            __CLR4_4_1xsexselc8azw5o.R.inc(44024);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithFieldAdded3() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn0xyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn0xyx(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44025);
        __CLR4_4_1xsexselc8azw5o.R.inc(44026);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        __CLR4_4_1xsexselc8azw5o.R.inc(44027);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44028);test.withFieldAdded(DurationFieldType.years(), 6);
            __CLR4_4_1xsexselc8azw5o.R.inc(44029);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testWithFieldAdded4() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfhxz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfhxz2(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44030);
        __CLR4_4_1xsexselc8azw5o.R.inc(44031);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        __CLR4_4_1xsexselc8azw5o.R.inc(44032);Period result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44033);assertEquals(test, result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPeriodStatics() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19wixcpxz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPeriodStatics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19wixcpxz6(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44034);
        __CLR4_4_1xsexselc8azw5o.R.inc(44035);Period test;
        __CLR4_4_1xsexselc8azw5o.R.inc(44036);test = Period.years(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44037);assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44038);test = Period.months(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44039);assertEquals(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44040);test = Period.weeks(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44041);assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44042);test = Period.days(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44043);assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44044);test = Period.hours(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44045);assertEquals(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44046);test = Period.minutes(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44047);assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44048);test = Period.seconds(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44049);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44050);test = Period.millis(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44051);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard()));
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWith() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq6ynxzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWith",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq6ynxzo(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44052);
        __CLR4_4_1xsexselc8azw5o.R.inc(44053);Period test;
        __CLR4_4_1xsexselc8azw5o.R.inc(44054);test = Period.years(5).withYears(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44055);assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44056);test = Period.months(5).withMonths(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44057);assertEquals(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44058);test = Period.weeks(5).withWeeks(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44059);assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44060);test = Period.days(5).withDays(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44061);assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44062);test = Period.hours(5).withHours(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44063);assertEquals(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44064);test = Period.minutes(5).withMinutes(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44065);assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44066);test = Period.seconds(5).withSeconds(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44067);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard()));
        __CLR4_4_1xsexselc8azw5o.R.inc(44068);test = Period.millis(5).withMillis(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44069);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard()));
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44070);test = new Period(0L, PeriodType.millis());
        __CLR4_4_1xsexselc8azw5o.R.inc(44071);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44072);test.withYears(1);
            __CLR4_4_1xsexselc8azw5o.R.inc(44073);fail();
        } catch (UnsupportedOperationException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1py855fy0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1py855fy0a(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44074);
        __CLR4_4_1xsexselc8azw5o.R.inc(44075);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44076);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44077);Period test = base.plus((ReadablePeriod) null);
        __CLR4_4_1xsexselc8azw5o.R.inc(44078);assertSame(base, test);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44079);test = base.plus(Period.years(10));
        __CLR4_4_1xsexselc8azw5o.R.inc(44080);assertEquals(11, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44081);assertEquals(2, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44082);assertEquals(3, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44083);assertEquals(4, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44084);assertEquals(5, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44085);assertEquals(6, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44086);assertEquals(7, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44087);assertEquals(8, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44088);test = base.plus(Years.years(10));
        __CLR4_4_1xsexselc8azw5o.R.inc(44089);assertEquals(11, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44090);assertEquals(2, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44091);assertEquals(3, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44092);assertEquals(4, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44093);assertEquals(5, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44094);assertEquals(6, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44095);assertEquals(7, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44096);assertEquals(8, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44097);test = base.plus(Period.days(10));
        __CLR4_4_1xsexselc8azw5o.R.inc(44098);assertEquals(1, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44099);assertEquals(2, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44100);assertEquals(3, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44101);assertEquals(14, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44102);assertEquals(5, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44103);assertEquals(6, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44104);assertEquals(7, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44105);assertEquals(8, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44106);test = baseDaysOnly.plus(Period.years(0));
        __CLR4_4_1xsexselc8azw5o.R.inc(44107);assertEquals(0, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44108);assertEquals(0, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44109);assertEquals(0, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44110);assertEquals(10, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44111);assertEquals(0, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44112);assertEquals(0, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44113);assertEquals(0, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44114);assertEquals(0, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44115);test = baseDaysOnly.plus(baseDaysOnly);
        __CLR4_4_1xsexselc8azw5o.R.inc(44116);assertEquals(0, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44117);assertEquals(0, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44118);assertEquals(0, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44119);assertEquals(20, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44120);assertEquals(0, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44121);assertEquals(0, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44122);assertEquals(0, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44123);assertEquals(0, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44124);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44125);baseDaysOnly.plus(Period.years(1));
            __CLR4_4_1xsexselc8azw5o.R.inc(44126);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44127);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44128);Period.days(Integer.MAX_VALUE).plus(Period.days(1));
            __CLR4_4_1xsexselc8azw5o.R.inc(44129);fail();
        } catch (ArithmeticException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44130);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44131);Period.days(Integer.MIN_VALUE).plus(Period.days(-1));
            __CLR4_4_1xsexselc8azw5o.R.inc(44132);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rscqyty1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rscqyty1x(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44133);
        __CLR4_4_1xsexselc8azw5o.R.inc(44134);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44135);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44136);Period test = base.minus((ReadablePeriod) null);
        __CLR4_4_1xsexselc8azw5o.R.inc(44137);assertSame(base, test);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44138);test = base.minus(Period.years(10));
        __CLR4_4_1xsexselc8azw5o.R.inc(44139);assertEquals(-9, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44140);assertEquals(2, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44141);assertEquals(3, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44142);assertEquals(4, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44143);assertEquals(5, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44144);assertEquals(6, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44145);assertEquals(7, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44146);assertEquals(8, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44147);test = base.minus(Years.years(10));
        __CLR4_4_1xsexselc8azw5o.R.inc(44148);assertEquals(-9, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44149);assertEquals(2, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44150);assertEquals(3, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44151);assertEquals(4, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44152);assertEquals(5, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44153);assertEquals(6, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44154);assertEquals(7, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44155);assertEquals(8, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44156);test = base.minus(Period.days(10));
        __CLR4_4_1xsexselc8azw5o.R.inc(44157);assertEquals(1, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44158);assertEquals(2, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44159);assertEquals(3, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44160);assertEquals(-6, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44161);assertEquals(5, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44162);assertEquals(6, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44163);assertEquals(7, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44164);assertEquals(8, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44165);test = baseDaysOnly.minus(Period.years(0));
        __CLR4_4_1xsexselc8azw5o.R.inc(44166);assertEquals(0, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44167);assertEquals(0, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44168);assertEquals(0, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44169);assertEquals(10, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44170);assertEquals(0, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44171);assertEquals(0, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44172);assertEquals(0, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44173);assertEquals(0, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44174);test = baseDaysOnly.minus(baseDaysOnly);
        __CLR4_4_1xsexselc8azw5o.R.inc(44175);assertEquals(0, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44176);assertEquals(0, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44177);assertEquals(0, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44178);assertEquals(0, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44179);assertEquals(0, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44180);assertEquals(0, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44181);assertEquals(0, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44182);assertEquals(0, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44183);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44184);baseDaysOnly.minus(Period.years(1));
            __CLR4_4_1xsexselc8azw5o.R.inc(44185);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44186);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44187);Period.days(Integer.MAX_VALUE).minus(Period.days(-1));
            __CLR4_4_1xsexselc8azw5o.R.inc(44188);fail();
        } catch (ArithmeticException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44189);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44190);Period.days(Integer.MIN_VALUE).minus(Period.days(1));
            __CLR4_4_1xsexselc8azw5o.R.inc(44191);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlusFields() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121hlfwy3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121hlfwy3k(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44192);
        __CLR4_4_1xsexselc8azw5o.R.inc(44193);Period test;
        __CLR4_4_1xsexselc8azw5o.R.inc(44194);test = Period.years(1).plusYears(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44195);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44196);test = Period.months(1).plusMonths(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44197);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44198);test = Period.weeks(1).plusWeeks(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44199);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44200);test = Period.days(1).plusDays(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44201);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44202);test = Period.hours(1).plusHours(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44203);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44204);test = Period.minutes(1).plusMinutes(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44205);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44206);test = Period.seconds(1).plusSeconds(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44207);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44208);test = Period.millis(1).plusMillis(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44209);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44210);test = new Period(0L, PeriodType.millis());
        __CLR4_4_1xsexselc8azw5o.R.inc(44211);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44212);test.plusYears(1);
            __CLR4_4_1xsexselc8azw5o.R.inc(44213);fail();
        } catch (UnsupportedOperationException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testPlusFieldsZero() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9eju4y46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFieldsZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9eju4y46(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44214);
        __CLR4_4_1xsexselc8azw5o.R.inc(44215);Period test, result;
        __CLR4_4_1xsexselc8azw5o.R.inc(44216);test = Period.years(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44217);result = test.plusYears(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44218);assertSame(test, result);
        __CLR4_4_1xsexselc8azw5o.R.inc(44219);test = Period.months(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44220);result = test.plusMonths(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44221);assertSame(test, result);
        __CLR4_4_1xsexselc8azw5o.R.inc(44222);test = Period.weeks(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44223);result = test.plusWeeks(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44224);assertSame(test, result);
        __CLR4_4_1xsexselc8azw5o.R.inc(44225);test = Period.days(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44226);result = test.plusDays(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44227);assertSame(test, result);
        __CLR4_4_1xsexselc8azw5o.R.inc(44228);test = Period.hours(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44229);result = test.plusHours(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44230);assertSame(test, result);
        __CLR4_4_1xsexselc8azw5o.R.inc(44231);test = Period.minutes(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44232);result = test.plusMinutes(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44233);assertSame(test, result);
        __CLR4_4_1xsexselc8azw5o.R.inc(44234);test = Period.seconds(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44235);result = test.plusSeconds(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44236);assertSame(test, result);
        __CLR4_4_1xsexselc8azw5o.R.inc(44237);test = Period.millis(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44238);result = test.plusMillis(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44239);assertSame(test, result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testMinusFields() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrxqkey4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinusFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrxqkey4w(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44240);
        __CLR4_4_1xsexselc8azw5o.R.inc(44241);Period test;
        __CLR4_4_1xsexselc8azw5o.R.inc(44242);test = Period.years(3).minusYears(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44243);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44244);test = Period.months(3).minusMonths(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44245);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44246);test = Period.weeks(3).minusWeeks(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44247);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44248);test = Period.days(3).minusDays(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44249);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44250);test = Period.hours(3).minusHours(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44251);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44252);test = Period.minutes(3).minusMinutes(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44253);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44254);test = Period.seconds(3).minusSeconds(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44255);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44256);test = Period.millis(3).minusMillis(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44257);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44258);test = new Period(0L, PeriodType.millis());
        __CLR4_4_1xsexselc8azw5o.R.inc(44259);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44260);test.minusYears(1);
            __CLR4_4_1xsexselc8azw5o.R.inc(44261);fail();
        } catch (UnsupportedOperationException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMultipliedBy() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxhdzxy5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMultipliedBy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxhdzxy5i(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44262);
        __CLR4_4_1xsexselc8azw5o.R.inc(44263);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44264);Period test = base.multipliedBy(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44265);assertSame(base, test);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44266);test = base.multipliedBy(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44267);assertEquals(Period.ZERO, test);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44268);test = base.multipliedBy(2);
        __CLR4_4_1xsexselc8azw5o.R.inc(44269);assertEquals(2, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44270);assertEquals(4, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44271);assertEquals(6, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44272);assertEquals(8, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44273);assertEquals(10, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44274);assertEquals(12, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44275);assertEquals(14, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44276);assertEquals(16, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44277);test = base.multipliedBy(3);
        __CLR4_4_1xsexselc8azw5o.R.inc(44278);assertEquals(3, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44279);assertEquals(6, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44280);assertEquals(9, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44281);assertEquals(12, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44282);assertEquals(15, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44283);assertEquals(18, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44284);assertEquals(21, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44285);assertEquals(24, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44286);test = base.multipliedBy(-4);
        __CLR4_4_1xsexselc8azw5o.R.inc(44287);assertEquals(-4, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44288);assertEquals(-8, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44289);assertEquals(-12, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44290);assertEquals(-16, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44291);assertEquals(-20, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44292);assertEquals(-24, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44293);assertEquals(-28, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44294);assertEquals(-32, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44295);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44296);Period.days(Integer.MAX_VALUE).multipliedBy(2);
            __CLR4_4_1xsexselc8azw5o.R.inc(44297);fail();
        } catch (ArithmeticException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44298);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44299);Period.days(Integer.MIN_VALUE).multipliedBy(2);
            __CLR4_4_1xsexselc8azw5o.R.inc(44300);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testNegated() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307y6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307y6l(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44301);
        __CLR4_4_1xsexselc8azw5o.R.inc(44302);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44303);Period test = Period.ZERO.negated();
        __CLR4_4_1xsexselc8azw5o.R.inc(44304);assertEquals(Period.ZERO, test);
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44305);test = base.negated();
        __CLR4_4_1xsexselc8azw5o.R.inc(44306);assertEquals(-1, test.getYears());
        __CLR4_4_1xsexselc8azw5o.R.inc(44307);assertEquals(-2, test.getMonths());
        __CLR4_4_1xsexselc8azw5o.R.inc(44308);assertEquals(-3, test.getWeeks());
        __CLR4_4_1xsexselc8azw5o.R.inc(44309);assertEquals(-4, test.getDays());
        __CLR4_4_1xsexselc8azw5o.R.inc(44310);assertEquals(-5, test.getHours());
        __CLR4_4_1xsexselc8azw5o.R.inc(44311);assertEquals(-6, test.getMinutes());
        __CLR4_4_1xsexselc8azw5o.R.inc(44312);assertEquals(-7, test.getSeconds());
        __CLR4_4_1xsexselc8azw5o.R.inc(44313);assertEquals(-8, test.getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44314);test = Period.days(Integer.MAX_VALUE).negated();
        __CLR4_4_1xsexselc8azw5o.R.inc(44315);assertEquals(-Integer.MAX_VALUE, test.getDays());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44316);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44317);Period.days(Integer.MIN_VALUE).negated();
            __CLR4_4_1xsexselc8azw5o.R.inc(44318);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardWeeks() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx0y73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx0y73(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44319);
        __CLR4_4_1xsexselc8azw5o.R.inc(44320);Period test = new Period(0, 0, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44321);assertEquals(3, test.toStandardWeeks().getWeeks());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44322);test = new Period(0, 0, 3, 7, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44323);assertEquals(4, test.toStandardWeeks().getWeeks());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44324);test = new Period(0, 0, 0, 6, 23, 59, 59, 1000);
        __CLR4_4_1xsexselc8azw5o.R.inc(44325);assertEquals(1, test.toStandardWeeks().getWeeks());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44326);test = new Period(0, 0, Integer.MAX_VALUE, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44327);assertEquals(Integer.MAX_VALUE, test.toStandardWeeks().getWeeks());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44328);test = new Period(0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44329);long intMax = Integer.MAX_VALUE;
        __CLR4_4_1xsexselc8azw5o.R.inc(44330);BigInteger expected = BigInteger.valueOf(intMax);
        __CLR4_4_1xsexselc8azw5o.R.inc(44331);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_1xsexselc8azw5o.R.inc(44332);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_1xsexselc8azw5o.R.inc(44333);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_1xsexselc8azw5o.R.inc(44334);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1xsexselc8azw5o.R.inc(44335);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK));
        __CLR4_4_1xsexselc8azw5o.R.inc(44336);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44337);assertEquals(expected.longValue(), test.toStandardWeeks().getWeeks());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44338);test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44339);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44340);test.toStandardWeeks();
            __CLR4_4_1xsexselc8azw5o.R.inc(44341);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardWeeks_years() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yq1a4ty7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yq1a4ty7q(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44342);
        __CLR4_4_1xsexselc8azw5o.R.inc(44343);Period test = Period.years(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44344);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44345);test.toStandardWeeks();
            __CLR4_4_1xsexselc8azw5o.R.inc(44346);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44347);test = Period.years(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44348);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44349);test.toStandardWeeks();
            __CLR4_4_1xsexselc8azw5o.R.inc(44350);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44351);test = Period.years(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44352);assertEquals(0, test.toStandardWeeks().getWeeks());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardWeeks_months() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mti10y81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mti10y81(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44353);
        __CLR4_4_1xsexselc8azw5o.R.inc(44354);Period test = Period.months(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44355);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44356);test.toStandardWeeks();
            __CLR4_4_1xsexselc8azw5o.R.inc(44357);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44358);test = Period.months(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44359);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44360);test.toStandardWeeks();
            __CLR4_4_1xsexselc8azw5o.R.inc(44361);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44362);test = Period.months(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44363);assertEquals(0, test.toStandardWeeks().getWeeks());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardDays() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm0y8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm0y8c(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44364);
        __CLR4_4_1xsexselc8azw5o.R.inc(44365);Period test = new Period(0, 0, 0, 4, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44366);assertEquals(4, test.toStandardDays().getDays());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44367);test = new Period(0, 0, 1, 4, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44368);assertEquals(11, test.toStandardDays().getDays());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44369);test = new Period(0, 0, 0, 0, 23, 59, 59, 1000);
        __CLR4_4_1xsexselc8azw5o.R.inc(44370);assertEquals(1, test.toStandardDays().getDays());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44371);test = new Period(0, 0, 0, Integer.MAX_VALUE, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44372);assertEquals(Integer.MAX_VALUE, test.toStandardDays().getDays());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44373);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44374);long intMax = Integer.MAX_VALUE;
        __CLR4_4_1xsexselc8azw5o.R.inc(44375);BigInteger expected = BigInteger.valueOf(intMax);
        __CLR4_4_1xsexselc8azw5o.R.inc(44376);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_1xsexselc8azw5o.R.inc(44377);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_1xsexselc8azw5o.R.inc(44378);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_1xsexselc8azw5o.R.inc(44379);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1xsexselc8azw5o.R.inc(44380);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44381);assertEquals(expected.longValue(), test.toStandardDays().getDays());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44382);test = new Period(0, 0, 0, Integer.MAX_VALUE, 24, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44383);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44384);test.toStandardDays();
            __CLR4_4_1xsexselc8azw5o.R.inc(44385);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardDays_years() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ealftry8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ealftry8y(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44386);
        __CLR4_4_1xsexselc8azw5o.R.inc(44387);Period test = Period.years(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44388);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44389);test.toStandardDays();
            __CLR4_4_1xsexselc8azw5o.R.inc(44390);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44391);test = Period.years(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44392);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44393);test.toStandardDays();
            __CLR4_4_1xsexselc8azw5o.R.inc(44394);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44395);test = Period.years(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44396);assertEquals(0, test.toStandardDays().getDays());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardDays_months() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj0pawy99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj0pawy99(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44397);
        __CLR4_4_1xsexselc8azw5o.R.inc(44398);Period test = Period.months(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44399);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44400);test.toStandardDays();
            __CLR4_4_1xsexselc8azw5o.R.inc(44401);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44402);test = Period.months(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44403);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44404);test.toStandardDays();
            __CLR4_4_1xsexselc8azw5o.R.inc(44405);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44406);test = Period.months(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44407);assertEquals(0, test.toStandardDays().getDays());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardHours() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7gy9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7gy9k(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44408);
        __CLR4_4_1xsexselc8azw5o.R.inc(44409);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44410);assertEquals(5, test.toStandardHours().getHours());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44411);test = new Period(0, 0, 0, 1, 5, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44412);assertEquals(29, test.toStandardHours().getHours());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44413);test = new Period(0, 0, 0, 0, 0, 59, 59, 1000);
        __CLR4_4_1xsexselc8azw5o.R.inc(44414);assertEquals(1, test.toStandardHours().getHours());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44415);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44416);assertEquals(Integer.MAX_VALUE, test.toStandardHours().getHours());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44417);test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44418);long intMax = Integer.MAX_VALUE;
        __CLR4_4_1xsexselc8azw5o.R.inc(44419);BigInteger expected = BigInteger.valueOf(intMax);
        __CLR4_4_1xsexselc8azw5o.R.inc(44420);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_1xsexselc8azw5o.R.inc(44421);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_1xsexselc8azw5o.R.inc(44422);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_1xsexselc8azw5o.R.inc(44423);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44424);assertEquals(expected.longValue(), test.toStandardHours().getHours());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44425);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, 60, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44426);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44427);test.toStandardHours();
            __CLR4_4_1xsexselc8azw5o.R.inc(44428);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardHours_years() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdix6lya5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdix6lya5(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44429);
        __CLR4_4_1xsexselc8azw5o.R.inc(44430);Period test = Period.years(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44431);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44432);test.toStandardHours();
            __CLR4_4_1xsexselc8azw5o.R.inc(44433);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44434);test = Period.years(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44435);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44436);test.toStandardHours();
            __CLR4_4_1xsexselc8azw5o.R.inc(44437);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44438);test = Period.years(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44439);assertEquals(0, test.toStandardHours().getHours());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardHours_months() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdilisyag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdilisyag(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44440);
        __CLR4_4_1xsexselc8azw5o.R.inc(44441);Period test = Period.months(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44442);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44443);test.toStandardHours();
            __CLR4_4_1xsexselc8azw5o.R.inc(44444);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44445);test = Period.months(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44446);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44447);test.toStandardHours();
            __CLR4_4_1xsexselc8azw5o.R.inc(44448);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44449);test = Period.months(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44450);assertEquals(0, test.toStandardHours().getHours());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardMinutes() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44yar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44yar(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44451);
        __CLR4_4_1xsexselc8azw5o.R.inc(44452);Period test = new Period(0, 0, 0, 0, 0, 6, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44453);assertEquals(6, test.toStandardMinutes().getMinutes());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44454);test = new Period(0, 0, 0, 0, 1, 6, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44455);assertEquals(66, test.toStandardMinutes().getMinutes());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44456);test = new Period(0, 0, 0, 0, 0, 0, 59, 1000);
        __CLR4_4_1xsexselc8azw5o.R.inc(44457);assertEquals(1, test.toStandardMinutes().getMinutes());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44458);test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44459);assertEquals(Integer.MAX_VALUE, test.toStandardMinutes().getMinutes());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44460);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44461);long intMax = Integer.MAX_VALUE;
        __CLR4_4_1xsexselc8azw5o.R.inc(44462);BigInteger expected = BigInteger.valueOf(intMax);
        __CLR4_4_1xsexselc8azw5o.R.inc(44463);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_1xsexselc8azw5o.R.inc(44464);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_1xsexselc8azw5o.R.inc(44465);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44466);assertEquals(expected.longValue(), test.toStandardMinutes().getMinutes());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44467);test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, 60, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44468);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44469);test.toStandardMinutes();
            __CLR4_4_1xsexselc8azw5o.R.inc(44470);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardMinutes_years() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4rglvybb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4rglvybb(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44471);
        __CLR4_4_1xsexselc8azw5o.R.inc(44472);Period test = Period.years(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44473);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44474);test.toStandardMinutes();
            __CLR4_4_1xsexselc8azw5o.R.inc(44475);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44476);test = Period.years(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44477);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44478);test.toStandardMinutes();
            __CLR4_4_1xsexselc8azw5o.R.inc(44479);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44480);test = Period.years(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44481);assertEquals(0, test.toStandardMinutes().getMinutes());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardMinutes_months() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jncwd8ybm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jncwd8ybm(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44482);
        __CLR4_4_1xsexselc8azw5o.R.inc(44483);Period test = Period.months(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44484);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44485);test.toStandardMinutes();
            __CLR4_4_1xsexselc8azw5o.R.inc(44486);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44487);test = Period.months(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44488);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44489);test.toStandardMinutes();
            __CLR4_4_1xsexselc8azw5o.R.inc(44490);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44491);test = Period.months(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44492);assertEquals(0, test.toStandardMinutes().getMinutes());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardSeconds() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqsybx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqsybx(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44493);
        __CLR4_4_1xsexselc8azw5o.R.inc(44494);Period test = new Period(0, 0, 0, 0, 0, 0, 7, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44495);assertEquals(7, test.toStandardSeconds().getSeconds());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44496);test = new Period(0, 0, 0, 0, 0, 1, 3, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44497);assertEquals(63, test.toStandardSeconds().getSeconds());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44498);test = new Period(0, 0, 0, 0, 0, 0, 0, 1000);
        __CLR4_4_1xsexselc8azw5o.R.inc(44499);assertEquals(1, test.toStandardSeconds().getSeconds());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44500);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44501);assertEquals(Integer.MAX_VALUE, test.toStandardSeconds().getSeconds());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44502);test = new Period(0, 0, 0, 0, 0, 0, 20, Integer.MAX_VALUE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44503);long expected = 20;
        __CLR4_4_1xsexselc8azw5o.R.inc(44504);expected += ((long) Integer.MAX_VALUE) / DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_1xsexselc8azw5o.R.inc(44505);assertEquals(expected, test.toStandardSeconds().getSeconds());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44506);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 1000);
        __CLR4_4_1xsexselc8azw5o.R.inc(44507);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44508);test.toStandardSeconds();
            __CLR4_4_1xsexselc8azw5o.R.inc(44509);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardSeconds_years() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mde2byce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mde2byce(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44510);
        __CLR4_4_1xsexselc8azw5o.R.inc(44511);Period test = Period.years(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44512);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44513);test.toStandardSeconds();
            __CLR4_4_1xsexselc8azw5o.R.inc(44514);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44515);test = Period.years(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44516);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44517);test.toStandardSeconds();
            __CLR4_4_1xsexselc8azw5o.R.inc(44518);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44519);test = Period.years(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44520);assertEquals(0, test.toStandardSeconds().getSeconds());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardSeconds_months() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8knekycp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8knekycp(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44521);
        __CLR4_4_1xsexselc8azw5o.R.inc(44522);Period test = Period.months(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44523);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44524);test.toStandardSeconds();
            __CLR4_4_1xsexselc8azw5o.R.inc(44525);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44526);test = Period.months(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44527);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44528);test.toStandardSeconds();
            __CLR4_4_1xsexselc8azw5o.R.inc(44529);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44530);test = Period.months(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44531);assertEquals(0, test.toStandardSeconds().getSeconds());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardDuration() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnpyd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnpyd0(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44532);
        __CLR4_4_1xsexselc8azw5o.R.inc(44533);Period test = new Period(0, 0, 0, 0, 0, 0, 0, 8);
        __CLR4_4_1xsexselc8azw5o.R.inc(44534);assertEquals(8, test.toStandardDuration().getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44535);test = new Period(0, 0, 0, 0, 0, 0, 1, 20);
        __CLR4_4_1xsexselc8azw5o.R.inc(44536);assertEquals(1020, test.toStandardDuration().getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44537);test = new Period(0, 0, 0, 0, 0, 0, 0, Integer.MAX_VALUE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44538);assertEquals(Integer.MAX_VALUE, test.toStandardDuration().getMillis());
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44539);test = new Period(0, 0, 0, 0, 0, 10, 20, Integer.MAX_VALUE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44540);long expected = Integer.MAX_VALUE;
        __CLR4_4_1xsexselc8azw5o.R.inc(44541);expected += 10L * ((long) DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44542);expected += 20L * ((long) DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_1xsexselc8azw5o.R.inc(44543);assertEquals(expected, test.toStandardDuration().getMillis());
        
        // proof that overflow does not occur
        __CLR4_4_1xsexselc8azw5o.R.inc(44544);BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        __CLR4_4_1xsexselc8azw5o.R.inc(44545);BigInteger exp = intMax;
        __CLR4_4_1xsexselc8azw5o.R.inc(44546);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_SECOND)));
        __CLR4_4_1xsexselc8azw5o.R.inc(44547);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_MINUTE)));
        __CLR4_4_1xsexselc8azw5o.R.inc(44548);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_HOUR)));
        __CLR4_4_1xsexselc8azw5o.R.inc(44549);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY)));
        __CLR4_4_1xsexselc8azw5o.R.inc(44550);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK)));
        __CLR4_4_1xsexselc8azw5o.R.inc(44551);assertTrue(exp.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
//        test = new Period(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
//        try {
//            test.toStandardDuration();
//            fail();
//        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardDuration_years() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194yw58ydk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194yw58ydk(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44552);
        __CLR4_4_1xsexselc8azw5o.R.inc(44553);Period test = Period.years(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44554);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44555);test.toStandardDuration();
            __CLR4_4_1xsexselc8azw5o.R.inc(44556);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44557);test = Period.years(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44558);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44559);test.toStandardDuration();
            __CLR4_4_1xsexselc8azw5o.R.inc(44560);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44561);test = Period.years(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44562);assertEquals(0, test.toStandardDuration().getMillis());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testToStandardDuration_months() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqtv4rydv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqtv4rydv(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44563);
        __CLR4_4_1xsexselc8azw5o.R.inc(44564);Period test = Period.months(1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44565);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44566);test.toStandardDuration();
            __CLR4_4_1xsexselc8azw5o.R.inc(44567);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44568);test = Period.months(-1);
        __CLR4_4_1xsexselc8azw5o.R.inc(44569);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44570);test.toStandardDuration();
            __CLR4_4_1xsexselc8azw5o.R.inc(44571);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_1xsexselc8azw5o.R.inc(44572);test = Period.months(0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44573);assertEquals(0, test.toStandardDuration().getMillis());
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testNormalizedStandard_yearMonth1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rolfyye6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rolfyye6(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44574);
        __CLR4_4_1xsexselc8azw5o.R.inc(44575);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44576);Period result = test.normalizedStandard();
        __CLR4_4_1xsexselc8azw5o.R.inc(44577);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44578);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_yearMonth2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0ok8fyeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0ok8fyeb(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44579);
        __CLR4_4_1xsexselc8azw5o.R.inc(44580);Period test = new Period(Integer.MAX_VALUE, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44581);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44582);test.normalizedStandard();
            __CLR4_4_1xsexselc8azw5o.R.inc(44583);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_weekDay1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxhpknyeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_weekDay1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxhpknyeg(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44584);
        __CLR4_4_1xsexselc8azw5o.R.inc(44585);Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44586);Period result = test.normalizedStandard();
        __CLR4_4_1xsexselc8azw5o.R.inc(44587);assertEquals(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44588);assertEquals(new Period(0, 0, 2, 5, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_weekDay2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ohqs6yel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_weekDay2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ohqs6yel(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44589);
        __CLR4_4_1xsexselc8azw5o.R.inc(44590);Period test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44591);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44592);test.normalizedStandard();
            __CLR4_4_1xsexselc8azw5o.R.inc(44593);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_yearMonthWeekDay() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nedo85yeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonthWeekDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nedo85yeq(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44594);
        __CLR4_4_1xsexselc8azw5o.R.inc(44595);Period test = new Period(1, 15, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44596);Period result = test.normalizedStandard();
        __CLR4_4_1xsexselc8azw5o.R.inc(44597);assertEquals(new Period(1, 15, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44598);assertEquals(new Period(2, 3, 2, 5, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_yearMonthDay() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e43qwpyev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e43qwpyev(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44599);
        __CLR4_4_1xsexselc8azw5o.R.inc(44600);Period test = new Period(1, 15, 0, 36, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44601);Period result = test.normalizedStandard();
        __CLR4_4_1xsexselc8azw5o.R.inc(44602);assertEquals(new Period(1, 15, 0, 36, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44603);assertEquals(new Period(2, 3, 5, 1, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_negative() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14g6syzyf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_negative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14g6syzyf0(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44604);
        __CLR4_4_1xsexselc8azw5o.R.inc(44605);Period test = new Period(0, 0, 0, 0, 2, -10, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44606);Period result = test.normalizedStandard();
        __CLR4_4_1xsexselc8azw5o.R.inc(44607);assertEquals(new Period(0, 0, 0, 0, 2, -10, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44608);assertEquals(new Period(0, 0, 0, 0, 1, 50, 0, 0), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_fullNegative() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqm57gyf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_fullNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqm57gyf5(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44609);
        __CLR4_4_1xsexselc8azw5o.R.inc(44610);Period test = new Period(0, 0, 0, 0, 1, -70, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44611);Period result = test.normalizedStandard();
        __CLR4_4_1xsexselc8azw5o.R.inc(44612);assertEquals(new Period(0, 0, 0, 0, 1, -70, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44613);assertEquals(new Period(0, 0, 0, 0, 0, -10, 0, 0), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testNormalizedStandard_periodType_yearMonth1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vlwpsyfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vlwpsyfa(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44614);
        __CLR4_4_1xsexselc8azw5o.R.inc(44615);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44616);Period result = test.normalizedStandard((PeriodType) null);
        __CLR4_4_1xsexselc8azw5o.R.inc(44617);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44618);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_yearMonth2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mlxxbyff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mlxxbyff(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44619);
        __CLR4_4_1xsexselc8azw5o.R.inc(44620);Period test = new Period(Integer.MAX_VALUE, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44621);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44622);test.normalizedStandard((PeriodType) null);
            __CLR4_4_1xsexselc8azw5o.R.inc(44623);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_yearMonth3() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlz4uyfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlz4uyfk(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44624);
        __CLR4_4_1xsexselc8azw5o.R.inc(44625);Period test = new Period(1, 15, 3, 4, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44626);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44627);test.normalizedStandard(PeriodType.dayTime());
            __CLR4_4_1xsexselc8azw5o.R.inc(44628);fail();
        } catch (UnsupportedOperationException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_weekDay1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fifs63yfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_weekDay1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fifs63yfp(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44629);
        __CLR4_4_1xsexselc8azw5o.R.inc(44630);Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44631);Period result = test.normalizedStandard((PeriodType) null);
        __CLR4_4_1xsexselc8azw5o.R.inc(44632);assertEquals(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44633);assertEquals(new Period(0, 0, 2, 5, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_weekDay2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irfqykyfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_weekDay2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irfqykyfu(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44634);
        __CLR4_4_1xsexselc8azw5o.R.inc(44635);Period test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44636);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44637);test.normalizedStandard((PeriodType) null);
            __CLR4_4_1xsexselc8azw5o.R.inc(44638);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_weekDay3() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0fpr1yfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_weekDay3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0fpr1yfz(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44639);
        __CLR4_4_1xsexselc8azw5o.R.inc(44640);Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44641);Period result = test.normalizedStandard(PeriodType.dayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(44642);assertEquals(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44643);assertEquals(new Period(0, 0, 0, 19, 0, 0, 0, 0, PeriodType.dayTime()), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_yearMonthWeekDay() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyd2bbyg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonthWeekDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyd2bbyg4(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44644);
        __CLR4_4_1xsexselc8azw5o.R.inc(44645);Period test = new Period(1, 15, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44646);Period result = test.normalizedStandard(PeriodType.yearMonthDayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(44647);assertEquals(new Period(1, 15, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44648);assertEquals(new Period(2, 3, 0, 19, 0, 0, 0, 0, PeriodType.yearMonthDayTime()), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_yearMonthDay() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uykwdxyg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uykwdxyg9(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44649);
        __CLR4_4_1xsexselc8azw5o.R.inc(44650);Period test = new Period(1, 15, 0, 36, 27, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44651);Period result = test.normalizedStandard(PeriodType.yearMonthDayTime());
        __CLR4_4_1xsexselc8azw5o.R.inc(44652);assertEquals(new Period(1, 15, 0, 36, 27, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44653);assertEquals(new Period(2, 3, 0, 37, 3, 0, 0, 0, PeriodType.yearMonthDayTime()), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_months1() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1efzdxiyge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_months1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1efzdxiyge(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44654);
        __CLR4_4_1xsexselc8azw5o.R.inc(44655);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44656);Period result = test.normalizedStandard(PeriodType.months());
        __CLR4_4_1xsexselc8azw5o.R.inc(44657);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44658);assertEquals(new Period(0, 27, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_months2() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6zf51ygj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_months2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6zf51ygj(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44659);
        __CLR4_4_1xsexselc8azw5o.R.inc(44660);Period test = new Period(-2, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44661);Period result = test.normalizedStandard(PeriodType.months());
        __CLR4_4_1xsexselc8azw5o.R.inc(44662);assertEquals(new Period(-2, 15, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44663);assertEquals(new Period(0, -9, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_months3() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xzgckygo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_months3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xzgckygo(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44664);
        __CLR4_4_1xsexselc8azw5o.R.inc(44665);Period test = new Period(0, 4, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44666);Period result = test.normalizedStandard(PeriodType.months());
        __CLR4_4_1xsexselc8azw5o.R.inc(44667);assertEquals(new Period(0, 4, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44668);assertEquals(new Period(0, 4, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_years() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0o4kyygt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0o4kyygt(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44669);
        __CLR4_4_1xsexselc8azw5o.R.inc(44670);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44671);try {
            __CLR4_4_1xsexselc8azw5o.R.inc(44672);test.normalizedStandard(PeriodType.years());
            __CLR4_4_1xsexselc8azw5o.R.inc(44673);fail();
        } catch (UnsupportedOperationException ex) {
            // expected
        }
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

    public void testNormalizedStandard_periodType_monthsWeeks() {__CLR4_4_1xsexselc8azw5o.R.globalSliceStart(getClass().getName(),44674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fd3dt4ygy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xsexselc8azw5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xsexselc8azw5o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_monthsWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fd3dt4ygy(){try{__CLR4_4_1xsexselc8azw5o.R.inc(44674);
        __CLR4_4_1xsexselc8azw5o.R.inc(44675);PeriodType type = PeriodType.forFields(new DurationFieldType[]{
                        DurationFieldType.months(),
                        DurationFieldType.weeks(),
                        DurationFieldType.days()});
        __CLR4_4_1xsexselc8azw5o.R.inc(44676);Period test = new Period(2, 4, 6, 0, 0, 0, 0, 0);
        __CLR4_4_1xsexselc8azw5o.R.inc(44677);Period result = test.normalizedStandard(type);
        __CLR4_4_1xsexselc8azw5o.R.inc(44678);assertEquals(new Period(2, 4, 6, 0, 0, 0, 0, 0), test);
        __CLR4_4_1xsexselc8azw5o.R.inc(44679);assertEquals(new Period(0, 28, 6, 0, 0, 0, 0, 0, type), result);
    }finally{__CLR4_4_1xsexselc8azw5o.R.flushNeeded();}}

}
