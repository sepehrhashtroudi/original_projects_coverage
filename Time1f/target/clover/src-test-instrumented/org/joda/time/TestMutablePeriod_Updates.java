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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1vs4vs4lc8azw17{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,42107,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41188);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41189);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41190);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41191);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1vs4vs4lc8azw17.R.inc(41193);try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41192);
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41194);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41195);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41196);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41197);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41198);originalLocale = Locale.getDefault();
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41199);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41200);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41201);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41202);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41203);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41204);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41205);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41206);Locale.setDefault(originalLocale);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41207);originalDateTimeZone = null;
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41208);originalTimeZone = null;
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41209);originalLocale = null;
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjvsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjvsq(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41210);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41211);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41212);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41213);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testClear() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlyl6qvsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlyl6qvsu(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41214);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41215);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41216);test.clear();
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41217);assertEquals(new MutablePeriod(), test);
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41218);test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41219);test.clear();
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41220);assertEquals(new MutablePeriod(PeriodType.yearMonthDayTime()), test);
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddYears() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pigqmmvt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pigqmmvt1(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41221);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41222);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41223);test.addYears(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41224);assertEquals(11, test.getYears());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41225);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41226);test.addYears(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41227);assertEquals(-9, test.getYears());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41228);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41229);test.addYears(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41230);assertEquals(1, test.getYears());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddMonths() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5eqa1vtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5eqa1vtb(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41231);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41232);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41233);test.addMonths(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41234);assertEquals(12, test.getMonths());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41235);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41236);test.addMonths(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41237);assertEquals(-8, test.getMonths());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41238);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41239);test.addMonths(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41240);assertEquals(2, test.getMonths());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddWeeks() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15be28nvtl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15be28nvtl(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41241);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41242);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41243);test.addWeeks(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41244);assertEquals(13, test.getWeeks());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41245);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41246);test.addWeeks(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41247);assertEquals(-7, test.getWeeks());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41248);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41249);test.addWeeks(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41250);assertEquals(3, test.getWeeks());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddDays() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hq0g19vtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hq0g19vtv(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41251);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41252);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41253);test.addDays(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41254);assertEquals(14, test.getDays());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41255);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41256);test.addDays(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41257);assertEquals(-6, test.getDays());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41258);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41259);test.addDays(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41260);assertEquals(4, test.getDays());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddHours() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9jld3vu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9jld3vu5(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41261);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41262);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41263);test.addHours(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41264);assertEquals(15, test.getHours());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41265);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41266);test.addHours(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41267);assertEquals(-5, test.getHours());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41268);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41269);test.addHours(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41270);assertEquals(5, test.getHours());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddMinutes() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pu9rbdvuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pu9rbdvuf(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41271);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41272);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41273);test.addMinutes(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41274);assertEquals(16, test.getMinutes());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41275);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41276);test.addMinutes(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41277);assertEquals(-4, test.getMinutes());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41278);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41279);test.addMinutes(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41280);assertEquals(6, test.getMinutes());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddSeconds() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dg3my1vup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dg3my1vup(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41281);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41282);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41283);test.addSeconds(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41284);assertEquals(17, test.getSeconds());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41285);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41286);test.addSeconds(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41287);assertEquals(-3, test.getSeconds());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41288);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41289);test.addSeconds(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41290);assertEquals(7, test.getSeconds());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddMillis() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2qm4cvuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2qm4cvuz(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41291);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41292);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41293);test.addMillis(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41294);assertEquals(18, test.getMillis());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41295);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41296);test.addMillis(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41297);assertEquals(-2, test.getMillis());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41298);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41299);test.addMillis(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41300);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetYears() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1diokb1vv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1diokb1vv9(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41301);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41302);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41303);test.setYears(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41304);assertEquals(10, test.getYears());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41305);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41306);test.setYears(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41307);assertEquals(-10, test.getYears());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41308);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41309);test.setYears(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41310);assertEquals(0, test.getYears());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41311);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41312);test.setYears(1);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41313);assertEquals(1, test.getYears());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41314);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41315);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41316);test.setYears(1);
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41317);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMonths() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hpk6ivvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hpk6ivvq(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41318);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41319);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41320);test.setMonths(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41321);assertEquals(10, test.getMonths());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41322);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41323);test.setMonths(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41324);assertEquals(-10, test.getMonths());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41325);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41326);test.setMonths(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41327);assertEquals(0, test.getMonths());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41328);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41329);test.setMonths(2);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41330);assertEquals(2, test.getMonths());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetWeeks() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16oe42yvw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16oe42yvw3(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41331);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41332);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41333);test.setWeeks(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41334);assertEquals(10, test.getWeeks());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41335);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41336);test.setWeeks(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41337);assertEquals(-10, test.getWeeks());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41338);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41339);test.setWeeks(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41340);assertEquals(0, test.getWeeks());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41341);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41342);test.setWeeks(3);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41343);assertEquals(3, test.getWeeks());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDays() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kshbmvwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kshbmvwg(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41344);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41345);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41346);test.setDays(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41347);assertEquals(10, test.getDays());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41348);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41349);test.setDays(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41350);assertEquals(-10, test.getDays());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41351);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41352);test.setDays(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41353);assertEquals(0, test.getDays());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41354);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41355);test.setDays(4);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41356);assertEquals(4, test.getDays());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetHours() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9rf1ivwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9rf1ivwt(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41357);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41358);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41359);test.setHours(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41360);assertEquals(10, test.getHours());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41361);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41362);test.setHours(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41363);assertEquals(-10, test.getHours());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41364);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41365);test.setHours(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41366);assertEquals(0, test.getHours());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41367);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41368);test.setHours(5);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41369);assertEquals(5, test.getHours());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMinutes() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pzyfg6vx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pzyfg6vx6(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41370);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41371);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41372);test.setMinutes(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41373);assertEquals(10, test.getMinutes());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41374);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41375);test.setMinutes(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41376);assertEquals(-10, test.getMinutes());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41377);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41378);test.setMinutes(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41379);assertEquals(0, test.getMinutes());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41380);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41381);test.setMinutes(6);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41382);assertEquals(6, test.getMinutes());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetSeconds() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmzi5mvxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmzi5mvxj(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41383);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41384);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41385);test.setSeconds(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41386);assertEquals(10, test.getSeconds());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41387);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41388);test.setSeconds(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41389);assertEquals(-10, test.getSeconds());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41390);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41391);test.setSeconds(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41392);assertEquals(0, test.getSeconds());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41393);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41394);test.setSeconds(7);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41395);assertEquals(7, test.getSeconds());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMillis() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kyjz7vxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kyjz7vxw(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41396);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41397);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41398);test.setMillis(10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41399);assertEquals(10, test.getMillis());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41400);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41401);test.setMillis(-10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41402);assertEquals(-10, test.getMillis());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41403);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41404);test.setMillis(0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41405);assertEquals(0, test.getMillis());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41406);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41407);test.setMillis(8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41408);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSet_Field() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133r8s2vy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSet_Field",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133r8s2vy9(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41409);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41410);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41411);test.set(DurationFieldType.years(), 10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41412);assertEquals(10, test.getYears());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41413);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41414);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41415);test.set(null, 10);
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41416);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_Field() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrgevlvyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_Field",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrgevlvyh(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41417);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41418);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41419);test.add(DurationFieldType.years(), 10);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41420);assertEquals(11, test.getYears());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41421);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41422);test.add(DurationFieldType.years(), 0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41423);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41424);assertEquals(1, test.getMillis());
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41425);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41426);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41427);test.add(null, 0);
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41428);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41429);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41430);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41431);test.add(null, 10);
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41432);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetPeriod_8ints1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175y17uvyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175y17uvyx(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41433);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41434);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41435);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41436);assertEquals(11, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41437);assertEquals(12, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41438);assertEquals(13, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41439);assertEquals(14, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41440);assertEquals(15, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41441);assertEquals(16, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41442);assertEquals(17, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41443);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_8ints2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aey00bvz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aey00bvz8(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41444);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41445);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41446);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41447);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41448);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41449);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41450);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41451);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41452);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41453);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41454);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41455);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41456);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_8ints3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnxyssvzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnxyssvzl(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41457);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41458);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41459);test.setPeriod(0, 0, 0, 0, 0, 0, 0, 18);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41460);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41461);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41462);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41463);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41464);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41465);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41466);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41467);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_8ints4() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwxxl9vzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwxxl9vzw(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41468);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41469);MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41470);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41471);assertEquals(11, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41472);assertEquals(12, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41473);assertEquals(13, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41474);assertEquals(14, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41475);assertEquals(15, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41476);assertEquals(16, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41477);assertEquals(17, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41478);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetPeriod_RP1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_188fiwcw07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_188fiwcw07(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41479);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41480);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41481);test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41482);assertEquals(11, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41483);assertEquals(12, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41484);assertEquals(13, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41485);assertEquals(14, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41486);assertEquals(15, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41487);assertEquals(16, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41488);assertEquals(17, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41489);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RP2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhfhotw0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhfhotw0i(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41490);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41491);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41492);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41493);test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41494);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41495);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41496);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41497);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41498);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41499);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41500);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41501);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41502);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RP3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqfghaw0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqfghaw0v(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41503);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41504);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41505);test.setPeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41506);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41507);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41508);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41509);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41510);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41511);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41512);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41513);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RP4() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzff9rw16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzff9rw16(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41514);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41515);MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41516);test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41517);assertEquals(11, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41518);assertEquals(12, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41519);assertEquals(13, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41520);assertEquals(14, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41521);assertEquals(15, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41522);assertEquals(16, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41523);assertEquals(17, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41524);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RP5() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8fe28w1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8fe28w1h(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41525);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41526);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41527);test.setPeriod((ReadablePeriod) null);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41528);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41529);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41530);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41531);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41532);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41533);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41534);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41535);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetPeriod_long_long1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4xs4nw1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4xs4nw1s(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41536);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41537);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41538);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41539);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41540);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41541);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41542);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41543);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41544);assertEquals(1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41545);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41546);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41547);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41548);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdxqx4w25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdxqx4w25(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41549);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41550);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41551);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41552);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41553);test.setPeriod(dt2.getMillis(), dt1.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41554);assertEquals(-1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41555);assertEquals(-1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41556);assertEquals(-1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41557);assertEquals(-1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41558);assertEquals(-1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41559);assertEquals(-1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41560);assertEquals(-1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41561);assertEquals(-1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1umxpplw2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1umxpplw2i(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41562);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41563);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41564);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41565);test.setPeriod(dt1.getMillis(), dt1.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41566);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41567);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41568);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41569);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41570);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41571);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41572);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41573);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long_NoYears() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppetn2w2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppetn2w2u(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41574);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41575);MutablePeriod test = new MutablePeriod(PeriodType.standard().withYearsRemoved());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41576);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41577);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41578);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41579);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41580);assertEquals(13, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41581);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41582);assertEquals(1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41583);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41584);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41585);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41586);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long_NoMonths() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4rbntw37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4rbntw37(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41587);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41588);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMonthsRemoved());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41589);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41590);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41591);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41592);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41593);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41594);assertEquals(5, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41595);assertEquals(3, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41596);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41597);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41598);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41599);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long_NoWeeks() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ic593w3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ic593w3k(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41600);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41601);MutablePeriod test = new MutablePeriod(PeriodType.standard().withWeeksRemoved());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41602);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41603);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41604);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41605);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41606);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41607);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41608);assertEquals(8, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41609);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41610);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41611);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41612);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long_NoDays() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hq8igdw3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hq8igdw3x(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41613);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41614);MutablePeriod test = new MutablePeriod(PeriodType.standard().withDaysRemoved());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41615);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41616);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41617);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41618);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41619);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41620);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41621);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41622);assertEquals(25, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41623);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41624);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41625);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long_NoHours() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vghodjw4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vghodjw4a(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41626);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41627);MutablePeriod test = new MutablePeriod(PeriodType.standard().withHoursRemoved());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41628);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41629);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41630);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41631);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41632);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41633);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41634);assertEquals(1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41635);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41636);assertEquals(61, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41637);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41638);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long_NoMinutes() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjcjljw4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjcjljw4n(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41639);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41640);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41641);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41642);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41643);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41644);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41645);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41646);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41647);assertEquals(1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41648);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41649);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41650);assertEquals(61, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41651);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long_NoSeconds() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txinyvw50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txinyvw50(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41652);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41653);MutablePeriod test = new MutablePeriod(PeriodType.standard().withSecondsRemoved());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41654);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41655);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41656);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41657);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41658);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41659);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41660);assertEquals(1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41661);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41662);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41663);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41664);assertEquals(1001, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long_long_NoMillis() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g237i4w5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g237i4w5d(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41665);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41666);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMillisRemoved());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41667);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41668);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41669);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41670);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41671);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41672);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41673);assertEquals(1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41674);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41675);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41676);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41677);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetPeriod_RI_RI1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2e915w5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2e915w5q(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41678);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41679);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41680);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41681);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41682);test.setPeriod(dt1, dt2);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41683);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41684);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41685);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41686);assertEquals(1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41687);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41688);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41689);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41690);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RI_RI2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtea8ow63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtea8ow63(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41691);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41692);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41693);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41694);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41695);test.setPeriod(dt2, dt1);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41696);assertEquals(-1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41697);assertEquals(-1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41698);assertEquals(-1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41699);assertEquals(-1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41700);assertEquals(-1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41701);assertEquals(-1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41702);assertEquals(-1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41703);assertEquals(-1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RI_RI3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkebg7w6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkebg7w6g(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41704);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41705);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41706);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41707);test.setPeriod(dt1, dt1);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41708);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41709);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41710);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41711);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41712);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41713);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41714);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41715);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetPeriod_RInterval1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymuhipw6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymuhipw6s(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41716);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41717);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41718);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41719);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41720);test.setPeriod(new Interval(dt1, dt2));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41721);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41722);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41723);assertEquals(1, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41724);assertEquals(1, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41725);assertEquals(1, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41726);assertEquals(1, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41727);assertEquals(1, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41728);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RInterval2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vduiq8w75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vduiq8w75(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41729);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41730);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41731);test.setPeriod((ReadableInterval) null);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41732);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41733);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41734);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41735);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41736);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41737);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41738);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41739);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetPeriod_long1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1axx5biw7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1axx5biw7g(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41740);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41741);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41742);test.setPeriod(100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41743);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41744);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41745);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41746);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41747);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41748);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41749);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41750);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_long2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6x43zw7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6x43zw7r(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41751);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41752);MutablePeriod test = new MutablePeriod();
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41753);test.setPeriod(
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
        // only time fields are precise
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41754);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41755);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41756);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41757);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41758);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41759);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41760);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41761);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

//    public void testSetPeriod_long3() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long4() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(12, test.getWeeks());
//        assertEquals(1, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long_NoYears() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withYearsRemoved());
//        test.setPeriod(ms);
//        assertEquals(0, test.getYears());
//        assertEquals(15, test.getMonths()); // totalDays=365+85=450=15*30
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMonths() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMonthsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoWeeks() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType().withWeeksRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoDays() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withDaysRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5 + 25 * 24, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoHours() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withHoursRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(0, test.getHours());
//        assertEquals(6 + 5 * 60, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMinutes() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMinutesRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(0, test.getMinutes());
//        assertEquals(7 + 6 * 60, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoSeconds() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withSecondsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(0, test.getSeconds());
//        assertEquals(8 + 7 * 1000, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMillis() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMillisRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(0, test.getMillis());
//        assertEquals(ms - 8, test.toDurationMillis());
//    }

    //-----------------------------------------------------------------------
    public void testSetPeriod_RD1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16roy9kw82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16roy9kw82(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41762);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41763);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41764);test.setPeriod(new Duration(100L));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41765);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41766);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41767);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41768);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41769);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41770);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41771);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41772);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RD2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0ox21w8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0ox21w8d(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41773);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41774);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41775);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41776);test.setPeriod(new Duration(length));
        // only time fields are precise
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41777);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41778);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41779);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41780);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41781);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41782);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41783);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41784);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testSetPeriod_RD3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9ovuiw8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9ovuiw8p(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41785);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41786);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41787);test.setPeriod((ReadableDuration) null);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41788);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41789);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41790);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41791);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41792);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41793);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41794);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41795);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_8ints1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1ragkw90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1ragkw90(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41796);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41797);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41798);test.add(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41799);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41800);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41801);assertEquals(3, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41802);assertEquals(4, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41803);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41804);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41805);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41806);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_8ints2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esrbo3w9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esrbo3w9b(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41807);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41808);MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41809);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41810);test.add(1, 2, 3, 4, 5, 6, 7, 8);
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41811);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41812);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41813);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41814);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41815);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41816);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41817);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41818);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41819);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_long1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1ijikw9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1ijikw9o(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41820);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41821);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41822);test.add(100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41823);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41824);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41825);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41826);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41827);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41828);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41829);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41830);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_long2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqljo3w9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqljo3w9z(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41831);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41832);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41833);long ms =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41834);test.add(ms);
        // only time fields are precise
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41835);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41836);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41837);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41838);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41839);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41840);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41841);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41842);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_long3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhlkvmwab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhlkvmwab(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41843);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41844);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41845);test.add(2100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41846);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41847);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41848);assertEquals(3, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41849);assertEquals(4, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41850);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41851);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41852);assertEquals(9, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41853);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_long_Chronology1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184h71vwam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184h71vwam(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41854);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41855);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41856);test.add(100L, ISOChronology.getInstance());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41857);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41858);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41859);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41860);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41861);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41862);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41863);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41864);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_long_Chronology2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vh89ewax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vh89ewax(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41865);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41866);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41867);long ms =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41868);test.add(ms, ISOChronology.getInstance());
        // only time fields are precise
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41869);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450 days
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41870);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41871);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41872);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41873);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41874);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41875);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41876);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_long_Chronology3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mh9gxwb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mh9gxwb9(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41877);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41878);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41879);long ms =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41880);test.add(ms, ISOChronology.getInstanceUTC());
        // UTC, so weeks and day also precise
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41881);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450 days
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41882);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41883);assertEquals(64, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41884);assertEquals(2, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41885);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41886);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41887);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41888);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_RD1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owfs46wbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owfs46wbl(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41889);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41890);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41891);test.add(new Duration(100L));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41892);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41893);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41894);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41895);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41896);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41897);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41898);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41899);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RD2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5fqwnwbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5fqwnwbw(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41900);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41901);MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41902);long ms =
            (4L + (3L * 7L)) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41903);test.add(new Duration(ms));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41904);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41905);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41906);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41907);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41908);assertEquals((4 + (3 * 7)) * 24 + 5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41909);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41910);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41911);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RD3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vefpp4wc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vefpp4wc8(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41912);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41913);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41914);test.add((ReadableDuration) null);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41915);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41916);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41917);assertEquals(3, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41918);assertEquals(4, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41919);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41920);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41921);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41922);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_RP1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd6cqywcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd6cqywcj(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41923);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41924);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41925);test.add(new Period(100L));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41926);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41927);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41928);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41929);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41930);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41931);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41932);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41933);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RP2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tm6bjfwcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tm6bjfwcu(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41934);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41935);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());  // All type
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41936);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 0, PeriodType.standard().withMillisRemoved()));
        // add field value, ignore different types
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41937);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41938);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41939);assertEquals(3, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41940);assertEquals(4, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41941);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41942);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41943);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41944);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RP3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wv6abwwd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wv6abwwd5(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41945);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41946);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41947);test.add(new Period(0L));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41948);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41949);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41950);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41951);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41952);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41953);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41954);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41955);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RP4() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywxsurwdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywxsurwdg(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41956);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41957);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41958);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41959);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8));  // cannot set weeks
            __CLR4_4_1vs4vs4lc8azw17.R.inc(41960);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41961);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41962);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41963);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41964);assertEquals(4, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41965);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41966);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41967);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41968);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RP5() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnxu2awdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnxu2awdt(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41969);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41970);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41971);test.add(new Period(1, 2, 0, 4, 5, 6, 7, 8));  // can set weeks as zero
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41972);assertEquals(2, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41973);assertEquals(4, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41974);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41975);assertEquals(8, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41976);assertEquals(10, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41977);assertEquals(12, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41978);assertEquals(14, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41979);assertEquals(16, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RP6() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sexv9twe4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sexv9twe4(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41980);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41981);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41982);test.add((ReadablePeriod) null);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41983);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41984);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41985);assertEquals(3, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41986);assertEquals(4, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41987);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41988);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41989);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41990);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_RInterval1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),41991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rshu29wef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rshu29wef(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(41991);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41992);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41993);test.add(new Interval(100L, 200L));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41994);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41995);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41996);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41997);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41998);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(41999);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42000);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42001);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RInterval2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1hsuqweq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1hsuqweq(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42002);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42003);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42004);DateTime dt2 = new DateTime(2005, 12, 18, 0, 0, 0, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42005);MutablePeriod test = new MutablePeriod(100L);  // All type
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42006);test.add(new Interval(dt1, dt2));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42007);assertEquals(1, test.getYears());  // add field value from interval
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42008);assertEquals(6, test.getMonths());  // add field value from interval
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42009);assertEquals(1, test.getWeeks());  // add field value from interval
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42010);assertEquals(2, test.getDays());  // add field value from interval
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42011);assertEquals(0, test.getHours());  // time zone OK
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42012);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42013);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42014);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RInterval3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yahrn7wf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yahrn7wf3(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42015);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42016);MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42017);test.add(new Interval(0L, 0L));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42018);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42019);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42020);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42021);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42022);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42023);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42024);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42025);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RInterval4() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhmbjgwfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhmbjgwfe(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42026);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42027);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42028);DateTime dt2 = new DateTime(2005, 7, 17, 0, 0, 0, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42029);MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42030);test.add(new Interval(dt1, dt2));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42031);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42032);assertEquals(1, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42033);assertEquals(0, test.getWeeks());  // no weeks
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42034);assertEquals(8, test.getDays());  // week added to days
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42035);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42036);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42037);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42038);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testAdd_RInterval5() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8mcqzwfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8mcqzwfr(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42039);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42040);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42041);test.add((ReadableInterval) null);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42042);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42043);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42044);assertEquals(3, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42045);assertEquals(4, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42046);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42047);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42048);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42049);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMergePeriod_RP1() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tminpawg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tminpawg2(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42050);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42051);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42052);test.mergePeriod(new MutablePeriod(0, 0, 0, 14, 15, 16, 17, 18, PeriodType.dayTime()));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42053);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42054);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42055);assertEquals(3, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42056);assertEquals(14, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42057);assertEquals(15, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42058);assertEquals(16, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42059);assertEquals(17, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42060);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testMergePeriod_RP2() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdiowtwgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdiowtwgd(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42061);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42062);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42063);try {
            __CLR4_4_1vs4vs4lc8azw17.R.inc(42064);test.mergePeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
            __CLR4_4_1vs4vs4lc8azw17.R.inc(42065);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42066);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42067);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42068);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42069);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42070);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42071);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42072);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42073);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testMergePeriod_RP3() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4iq4cwgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4iq4cwgq(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42074);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42075);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42076);test.mergePeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42077);assertEquals(0, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42078);assertEquals(0, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42079);assertEquals(0, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42080);assertEquals(0, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42081);assertEquals(0, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42082);assertEquals(0, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42083);assertEquals(0, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42084);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testMergePeriod_RP4() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jvirbvwh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jvirbvwh1(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42085);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42086);MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42087);test.mergePeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42088);assertEquals(11, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42089);assertEquals(12, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42090);assertEquals(13, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42091);assertEquals(14, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42092);assertEquals(15, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42093);assertEquals(16, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42094);assertEquals(17, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42095);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

    public void testMergePeriod_RP5() {__CLR4_4_1vs4vs4lc8azw17.R.globalSliceStart(getClass().getName(),42096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmisjewhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vs4vs4lc8azw17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vs4vs4lc8azw17.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmisjewhc(){try{__CLR4_4_1vs4vs4lc8azw17.R.inc(42096);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42097);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42098);test.mergePeriod((ReadablePeriod) null);
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42099);assertEquals(1, test.getYears());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42100);assertEquals(2, test.getMonths());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42101);assertEquals(3, test.getWeeks());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42102);assertEquals(4, test.getDays());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42103);assertEquals(5, test.getHours());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42104);assertEquals(6, test.getMinutes());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42105);assertEquals(7, test.getSeconds());
        __CLR4_4_1vs4vs4lc8azw17.R.inc(42106);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1vs4vs4lc8azw17.R.flushNeeded();}}

}
