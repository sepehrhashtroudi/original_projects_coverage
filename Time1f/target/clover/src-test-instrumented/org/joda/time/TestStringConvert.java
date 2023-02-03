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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.convert.StringConvert;
import org.joda.time.chrono.ISOChronology;

/**
 * Test string conversion.
 *
 * @author Stephen Colebourne
 */
public class TestStringConvert extends TestCase {static class __CLR4_4_1zm3zm3lc8azw81{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,46263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ZONE = DateTimeZone.forID("+02:00");

    public static void main(String[] args) {try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46155);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46156);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46157);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46158);return new TestSuite(TestStringConvert.class);
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public TestStringConvert(String name) {
        super(name);__CLR4_4_1zm3zm3lc8azw81.R.inc(46160);try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46159);
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46161);
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46162);
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testDateMidnight() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m65my1zmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m65my1zmb(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46163);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46164);DateMidnight test = new DateMidnight(2010, 6, 30, ISOChronology.getInstance(ZONE));
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46165);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46166);assertEquals("2010-06-30T00:00:00.000+02:00", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46167);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateMidnight.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testDateTime() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jx9slozmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jx9slozmg(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46168);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46169);DateTime test = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46170);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46171);assertEquals("2010-06-30T02:30:50.678+02:00", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46172);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTime.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testMutableDateTime() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdx1lizml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdx1lizml(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46173);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46174);MutableDateTime test = new MutableDateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46175);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46176);assertEquals("2010-06-30T02:30:50.678+02:00", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46177);assertEquals(test, StringConvert.INSTANCE.convertFromString(MutableDateTime.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testLocalDateTime() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qh5x1hzmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qh5x1hzmq(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46178);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46179);LocalDateTime test = new LocalDateTime(2010, 6, 30, 2, 30);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46180);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46181);assertEquals("2010-06-30T02:30:00.000", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46182);assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalDateTime.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testLocalDate() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pi26zmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pi26zmv(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46183);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46184);LocalDate test = new LocalDate(2010, 6, 30);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46185);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46186);assertEquals("2010-06-30", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46187);assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalDate.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testLocalTime() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155xxcjzn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155xxcjzn0(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46188);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46189);LocalTime test = new LocalTime(2, 30, 50, 678);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46190);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46191);assertEquals("02:30:50.678", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46192);assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalTime.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testYearMonth() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cgzczn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYearMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cgzczn5(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46193);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46194);YearMonth test = new YearMonth(2010, 6);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46195);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46196);assertEquals("2010-06", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46197);assertEquals(test, StringConvert.INSTANCE.convertFromString(YearMonth.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testMonthDay() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1era7yjzna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1era7yjzna(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46198);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46199);MonthDay test = new MonthDay(6, 30);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46200);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46201);assertEquals("--06-30", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46202);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testMonthDay_leapDay() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18x3yi2znf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay_leapDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18x3yi2znf(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46203);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46204);MonthDay test = new MonthDay(2, 29);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46205);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46206);assertEquals("--02-29", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46207);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTimeZone() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwcgniznk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwcgniznk(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46208);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46209);DateTimeZone test = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46210);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46211);assertEquals("Europe/Paris", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46212);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTimeZone.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

//    public void testInterval() {
//        DateTime a = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
//        DateTime b = new DateTime(2011, 9, 10, 4, 20, 40, 234, ISOChronology.getInstance(ZONE));
//        Interval test = new Interval(a, b);
//        String str = StringConvert.INSTANCE.convertToString(test);
//        assertEquals("2010-06-30T02:30:50.678+02:00/2011-09-10T04:20:40.234+02:00", str);
//        assertEquals(test, StringConvert.INSTANCE.convertFromString(Interval.class, str));
//    }

    public void testDuration() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gv0z03znp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gv0z03znp(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46213);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46214);Duration test = new Duration(12345678L);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46215);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46216);assertEquals("PT12345.678S", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46217);assertEquals(test, StringConvert.INSTANCE.convertFromString(Duration.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testPeriod() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8wo2iznu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8wo2iznu(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46218);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46219);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46220);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46221);assertEquals("P1Y2M3W4DT5H6M7.008S", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46222);assertEquals(test, StringConvert.INSTANCE.convertFromString(Period.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testMutablePeriod() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2p3gcznz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMutablePeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2p3gcznz(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46223);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46224);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46225);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46226);assertEquals("P1Y2M3W4DT5H6M7.008S", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46227);assertEquals(test, StringConvert.INSTANCE.convertFromString(MutablePeriod.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testYears() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nq13v9zo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nq13v9zo4(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46228);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46229);Years test = Years.years(5);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46230);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46231);assertEquals("P5Y", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46232);assertEquals(test, StringConvert.INSTANCE.convertFromString(Years.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testMonths() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bildmczo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bildmczo9(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46233);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46234);Months test = Months.months(5);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46235);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46236);assertEquals("P5M", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46237);assertEquals(test, StringConvert.INSTANCE.convertFromString(Months.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testWeeks() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r409pwzoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r409pwzoe(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46238);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46239);Weeks test = Weeks.weeks(5);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46240);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46241);assertEquals("P5W", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46242);assertEquals(test, StringConvert.INSTANCE.convertFromString(Weeks.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testDays() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzehn4zoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzehn4zoj(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46243);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46244);Days test = Days.days(5);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46245);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46246);assertEquals("P5D", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46247);assertEquals(test, StringConvert.INSTANCE.convertFromString(Days.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testHours() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyy94szoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyy94szoo(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46248);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46249);Hours test = Hours.hours(5);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46250);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46251);assertEquals("PT5H", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46252);assertEquals(test, StringConvert.INSTANCE.convertFromString(Hours.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testMinutes() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1oajwzot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1oajwzot(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46253);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46254);Minutes test = Minutes.minutes(5);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46255);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46256);assertEquals("PT5M", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46257);assertEquals(test, StringConvert.INSTANCE.convertFromString(Minutes.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

    public void testSeconds() {__CLR4_4_1zm3zm3lc8azw81.R.globalSliceStart(getClass().getName(),46258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mni66kzoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zm3zm3lc8azw81.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zm3zm3lc8azw81.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mni66kzoy(){try{__CLR4_4_1zm3zm3lc8azw81.R.inc(46258);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46259);Seconds test = Seconds.seconds(5);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46260);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46261);assertEquals("PT5S", str);
        __CLR4_4_1zm3zm3lc8azw81.R.inc(46262);assertEquals(test, StringConvert.INSTANCE.convertFromString(Seconds.class, str));
    }finally{__CLR4_4_1zm3zm3lc8azw81.R.flushNeeded();}}

}
