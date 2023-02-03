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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Adds extends TestCase {static class __CLR4_4_1syrsyrlc8azvp6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,37756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37539);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37540);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37541);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37542);return new TestSuite(TestMutableDateTime_Adds.class);
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public TestMutableDateTime_Adds(String name) {
        super(name);__CLR4_4_1syrsyrlc8azvp6.R.inc(37544);try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37543);
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37545);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37546);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37547);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37548);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37549);originalLocale = Locale.getDefault();
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37550);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37551);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37552);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37553);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37554);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37555);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37556);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37557);Locale.setDefault(originalLocale);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37558);originalDateTimeZone = null;
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37559);originalTimeZone = null;
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37560);originalLocale = null;
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjszd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjszd(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37561);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37562);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37563);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37564);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_long1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1ijikszh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1ijikszh(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37565);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37566);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37567);test.add(123456L);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37568);assertEquals(TEST_TIME1 + 123456L, test.getMillis());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37569);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_RD1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owfs46szm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owfs46szm(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37570);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37571);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37572);test.add(new Duration(123456L));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37573);assertEquals(TEST_TIME1 + 123456L, test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAdd_RD2() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5fqwnszq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5fqwnszq(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37574);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37575);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37576);test.add((ReadableDuration) null);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37577);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_RD_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzz6cmszu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzz6cmszu(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37578);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37579);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37580);test.add(new Duration(123456L), -2);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37581);assertEquals(TEST_TIME1 - (2L * 123456L), test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAdd_RD_int2() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x8z553szy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x8z553szy(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37582);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37583);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37584);test.add((ReadableDuration) null, 1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37585);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_RP1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd6cqyt02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd6cqyt02(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37586);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37587);Period d = new Period(1, 1, 0, 1, 1, 1, 1, 1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37588);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37589);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37590);test.add(d);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37591);assertEquals("2003-07-10T06:07:08.009+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAdd_RP2() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tm6bjft08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tm6bjft08(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37592);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37593);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37594);test.add((ReadablePeriod) null);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37595);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_RP_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exql7et0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exql7et0c(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37596);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37597);Period d = new Period(0, 0, 0, 0, 0, 0, 1, 2);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37598);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37599);test.add(d, -2);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37600);assertEquals(TEST_TIME1 - (2L * 1002L), test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAdd_RP_int2() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6qjzvt0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6qjzvt0h(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37601);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37602);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37603);test.add((ReadablePeriod) null, 1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37604);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAdd_DurationFieldType_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7idvct0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7idvct0l(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37605);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37606);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37607);test.add(DurationFieldType.years(), 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37608);assertEquals(2010, test.getYear());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAdd_DurationFieldType_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utxu9tt0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utxu9tt0p(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37609);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37610);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37611);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37612);test.add(DurationFieldType.years(), 0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37613);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAdd_DurationFieldType_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1bx07t0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1bx07t0u(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37614);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37615);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37616);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37617);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37618);test.add(DurationFieldType.years(), 0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37619);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAdd_DurationFieldType_int2() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgicntt10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgicntt10(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37620);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37621);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37622);try {
            __CLR4_4_1syrsyrlc8azvp6.R.inc(37623);test.add((DurationFieldType) null, 0);
            __CLR4_4_1syrsyrlc8azvp6.R.inc(37624);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37625);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAdd_DurationFieldType_int3() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opibgat16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opibgat16(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37626);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37627);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37628);try {
            __CLR4_4_1syrsyrlc8azvp6.R.inc(37629);test.add((DurationFieldType) null, 6);
            __CLR4_4_1syrsyrlc8azvp6.R.inc(37630);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37631);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddYears_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqvugxt1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqvugxt1c(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37632);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37633);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37634);test.addYears(8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37635);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddYears_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vjj1yt1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vjj1yt1g(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37636);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37637);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37638);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37639);test.addYears(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37640);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddYears_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1po5gbkt1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1po5gbkt1l(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37641);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37642);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37643);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37644);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37645);test.addYears(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37646);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddMonths_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj5x3ut1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj5x3ut1r(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37647);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37648);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37649);test.addMonths(6);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37650);assertEquals("2002-12-09T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddMonths_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eq4uflt1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eq4uflt1v(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37651);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37652);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37653);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37654);test.addMonths(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37655);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddMonths_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1viqrp7t20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1viqrp7t20(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37656);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37657);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37658);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37659);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37660);test.addMonths(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37661);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddDays_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qej9j2t26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qej9j2t26(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37662);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37663);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37664);test.addDays(17);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37665);assertEquals("2002-06-26T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddDays_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14g9i5xt2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14g9i5xt2a(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37666);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37667);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37668);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37669);test.addDays(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37670);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddDays_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8vffjt2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8vffjt2f(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37671);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37672);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37673);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37674);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37675);test.addDays(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37676);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddWeekyears_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgs35ht2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeekyears_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgs35ht2l(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37677);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37678);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37679);test.addWeekyears(-1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37680);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddWeeks_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jr23jct2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jr23jct2p(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37681);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37682);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37683);test.addWeeks(-21);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37684);assertEquals("2002-01-13T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddWeeks_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1al77hbt2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1al77hbt2t(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37685);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37686);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37687);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37688);test.addWeeks(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37689);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddWeeks_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdt4qxt2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdt4qxt2y(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37690);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37691);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37692);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37693);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37694);test.addWeeks(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37695);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddHours_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186qeewt34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddHours_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186qeewt34(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37696);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37697);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37698);test.addHours(13);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37699);assertEquals("2002-06-09T18:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddHours_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cilwoft38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddHours_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cilwoft38(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37700);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37701);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37702);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37703);test.addHours(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37704);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddHours_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tb7ty1t3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddHours_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tb7ty1t3d(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37705);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37706);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37707);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37708);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37709);test.addHours(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37710);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddMinutes_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kexh4t3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kexh4t3j(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37711);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37712);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37713);test.addMinutes(13);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37714);assertEquals("2002-06-09T05:19:07.008+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddMinutes_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zghfent3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zghfent3n(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37715);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37716);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37717);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37718);test.addMinutes(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37719);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddMinutes_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1is0pavt3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1is0pavt3s(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37720);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37721);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37722);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37723);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37724);test.addMinutes(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37725);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddSeconds_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3wn8ot3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3wn8ot3y(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37726);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37727);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37728);test.addSeconds(13);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37729);assertEquals("2002-06-09T05:06:20.008+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddSeconds_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmwx5rt42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmwx5rt42(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37730);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37731);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37732);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37733);test.addSeconds(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37734);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddSeconds_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oll7jrt47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oll7jrt47(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37735);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37736);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37737);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37738);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37739);test.addSeconds(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37740);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddMillis_int1() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uufoq5t4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uufoq5t4d(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37741);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37742);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37743);test.addMillis(13);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37744);assertEquals("2002-06-09T05:06:07.021+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddMillis_int_dstOverlapSummer_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jql8m4t4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jql8m4t4h(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37745);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37746);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37747);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37748);test.addMillis(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37749);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

    public void testAddMillis_int_dstOverlapWinter_addZero() {__CLR4_4_1syrsyrlc8azvp6.R.globalSliceStart(getClass().getName(),37750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xzbcit4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syrsyrlc8azvp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syrsyrlc8azvp6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xzbcit4m(){try{__CLR4_4_1syrsyrlc8azvp6.R.inc(37750);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37751);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37752);test.addHours(1);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37753);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37754);test.addMillis(0);
        __CLR4_4_1syrsyrlc8azvp6.R.inc(37755);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1syrsyrlc8azvp6.R.flushNeeded();}}

}
