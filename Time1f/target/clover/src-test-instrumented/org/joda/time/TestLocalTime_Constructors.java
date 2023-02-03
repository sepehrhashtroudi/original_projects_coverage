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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Constructors extends TestCase {static class __CLR4_4_1r64r64lc8azviq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,35709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final JulianChronology JULIAN_LONDON = JulianChronology.getInstance(LONDON);
    private static final JulianChronology JULIAN_PARIS = JulianChronology.getInstance(PARIS);
    private static final JulianChronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_LONDON = LONDON.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1r64r64lc8azviq.R.inc(35212);
        __CLR4_4_1r64r64lc8azviq.R.inc(35213);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r64r64lc8azviq.R.inc(35214);
        __CLR4_4_1r64r64lc8azviq.R.inc(35215);return new TestSuite(TestLocalTime_Constructors.class);
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public TestLocalTime_Constructors(String name) {
        super(name);__CLR4_4_1r64r64lc8azviq.R.inc(35217);try{__CLR4_4_1r64r64lc8azviq.R.inc(35216);
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1r64r64lc8azviq.R.inc(35218);
        __CLR4_4_1r64r64lc8azviq.R.inc(35219);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1r64r64lc8azviq.R.inc(35220);zone = DateTimeZone.getDefault();
        __CLR4_4_1r64r64lc8azviq.R.inc(35221);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35222);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1r64r64lc8azviq.R.inc(35223);
        __CLR4_4_1r64r64lc8azviq.R.inc(35224);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1r64r64lc8azviq.R.inc(35225);DateTimeZone.setDefault(zone);
        __CLR4_4_1r64r64lc8azviq.R.inc(35226);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1r64r64lc8azviq.R.inc(35227);zone = null;
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstantMidnight() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1ix4jr6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstantMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1ix4jr6k() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35228);
        __CLR4_4_1r64r64lc8azviq.R.inc(35229);LocalTime test = LocalTime.MIDNIGHT;
        __CLR4_4_1r64r64lc8azviq.R.inc(35230);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35231);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35232);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35233);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35234);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvir6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvir6r() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35235);
        __CLR4_4_1r64r64lc8azviq.R.inc(35236);assertEquals(new LocalTime(1, 20), LocalTime.parse("01:20"));
        __CLR4_4_1r64r64lc8azviq.R.inc(35237);assertEquals(new LocalTime(14, 50, 30, 432), LocalTime.parse("14:50:30.432"));
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxr6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxr6u() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35238);
        __CLR4_4_1r64r64lc8azviq.R.inc(35239);DateTimeFormatter f = DateTimeFormat.forPattern("HH mm").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1r64r64lc8azviq.R.inc(35240);assertEquals(new LocalTime(13, 30), LocalTime.parse("13 30", f));
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromCalendarFields_Calendar() throws Exception {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mnvhgr6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromCalendarFields_Calendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mnvhgr6x() throws Exception{try{__CLR4_4_1r64r64lc8azviq.R.inc(35241);
        __CLR4_4_1r64r64lc8azviq.R.inc(35242);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1r64r64lc8azviq.R.inc(35243);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1r64r64lc8azviq.R.inc(35244);LocalTime expected = new LocalTime(4, 5, 6, 7);
        __CLR4_4_1r64r64lc8azviq.R.inc(35245);assertEquals(expected, LocalTime.fromCalendarFields(cal));
        __CLR4_4_1r64r64lc8azviq.R.inc(35246);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35247);LocalTime.fromCalendarFields((Calendar) null);
            __CLR4_4_1r64r64lc8azviq.R.inc(35248);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromDateFields_after1970() throws Exception {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9oalfr75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_after1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9oalfr75() throws Exception{try{__CLR4_4_1r64r64lc8azviq.R.inc(35249);
        __CLR4_4_1r64r64lc8azviq.R.inc(35250);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1r64r64lc8azviq.R.inc(35251);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1r64r64lc8azviq.R.inc(35252);LocalTime expected = new LocalTime(4, 5, 6, 7);
        __CLR4_4_1r64r64lc8azviq.R.inc(35253);assertEquals(expected, LocalTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testFactory_FromDateFields_before1970() throws Exception {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn26q6r7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_before1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn26q6r7a() throws Exception{try{__CLR4_4_1r64r64lc8azviq.R.inc(35254);
        __CLR4_4_1r64r64lc8azviq.R.inc(35255);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        __CLR4_4_1r64r64lc8azviq.R.inc(35256);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1r64r64lc8azviq.R.inc(35257);LocalTime expected = new LocalTime(4, 5, 6, 7);
        __CLR4_4_1r64r64lc8azviq.R.inc(35258);assertEquals(expected, LocalTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testFactory_FromDateFields_null() throws Exception {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y25f1xr7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y25f1xr7f() throws Exception{try{__CLR4_4_1r64r64lc8azviq.R.inc(35259);
        __CLR4_4_1r64r64lc8azviq.R.inc(35260);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35261);LocalTime.fromDateFields((Date) null);
            __CLR4_4_1r64r64lc8azviq.R.inc(35262);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryMillisOfDay_long() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16afjz9r7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16afjz9r7j() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35263);
        __CLR4_4_1r64r64lc8azviq.R.inc(35264);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1);
        __CLR4_4_1r64r64lc8azviq.R.inc(35265);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35266);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35267);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35268);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35269);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryMillisOfDay_long_Chronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6rryur7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6rryur7q() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35270);
        __CLR4_4_1r64r64lc8azviq.R.inc(35271);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1, JULIAN_LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35272);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35273);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35274);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35275);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35276);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testFactoryMillisOfDay_long_nullChronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd19g1r7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd19g1r7x() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35277);
        __CLR4_4_1r64r64lc8azviq.R.inc(35278);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1, null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35279);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35280);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35281);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35282);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35283);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hr84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hr84() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35284);
        __CLR4_4_1r64r64lc8azviq.R.inc(35285);LocalTime test = new LocalTime();
        __CLR4_4_1r64r64lc8azviq.R.inc(35286);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35287);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35288);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35289);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35290);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35291);assertEquals(test, LocalTime.now());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5r8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5r8c() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35292);
        __CLR4_4_1r64r64lc8azviq.R.inc(35293);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35294);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1r64r64lc8azviq.R.inc(35295);LocalTime test = new LocalTime(LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35296);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35297);assertEquals(23, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35298);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35299);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35300);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35301);assertEquals(test, LocalTime.now(LONDON));
        
        __CLR4_4_1r64r64lc8azviq.R.inc(35302);test = new LocalTime(PARIS);
        __CLR4_4_1r64r64lc8azviq.R.inc(35303);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35304);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35305);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35306);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35307);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35308);assertEquals(test, LocalTime.now(PARIS));
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1ror8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1ror8t() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35309);
        __CLR4_4_1r64r64lc8azviq.R.inc(35310);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35311);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1r64r64lc8azviq.R.inc(35312);LocalTime test = new LocalTime((DateTimeZone) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35313);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35314);assertEquals(23, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35315);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35316);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35317);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tir92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tir92() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35318);
        __CLR4_4_1r64r64lc8azviq.R.inc(35319);LocalTime test = new LocalTime(JULIAN_LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35320);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35321);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35322);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35323);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35324);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35325);assertEquals(test, LocalTime.now(JULIAN_LONDON));
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rr9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rr9a() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35326);
        __CLR4_4_1r64r64lc8azviq.R.inc(35327);LocalTime test = new LocalTime((Chronology) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35328);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35329);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35330);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35331);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35332);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crr9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crr9h() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35333);
        __CLR4_4_1r64r64lc8azviq.R.inc(35334);LocalTime test = new LocalTime(TEST_TIME1);
        __CLR4_4_1r64r64lc8azviq.R.inc(35335);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35336);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35337);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35338);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35339);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_long2() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kar9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kar9o() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35340);
        __CLR4_4_1r64r64lc8azviq.R.inc(35341);LocalTime test = new LocalTime(TEST_TIME2);
        __CLR4_4_1r64r64lc8azviq.R.inc(35342);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35343);assertEquals(5 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35344);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35345);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35346);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_DateTimeZone() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzpm56r9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzpm56r9v() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35347);
        __CLR4_4_1r64r64lc8azviq.R.inc(35348);LocalTime test = new LocalTime(TEST_TIME1, PARIS);
        __CLR4_4_1r64r64lc8azviq.R.inc(35349);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35350);assertEquals(1 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35351);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35352);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35353);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_long_DateTimeZone_2() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17yks19ra2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_DateTimeZone_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17yks19ra2() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35354);
        __CLR4_4_1r64r64lc8azviq.R.inc(35355);DateTime dt = new DateTime(2007, 6, 9, 1, 2, 3, 4, PARIS);
        __CLR4_4_1r64r64lc8azviq.R.inc(35356);DateTime dtUTC = new DateTime(1970, 1, 1, 1, 2, 3, 4, DateTimeZone.UTC);
        
        __CLR4_4_1r64r64lc8azviq.R.inc(35357);LocalTime test = new LocalTime(dt.getMillis(), PARIS);
        __CLR4_4_1r64r64lc8azviq.R.inc(35358);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35359);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35360);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35361);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35362);assertEquals(4, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35363);assertEquals(dtUTC.getMillis(), test.getLocalMillis());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9rac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9rac() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35364);
        __CLR4_4_1r64r64lc8azviq.R.inc(35365);LocalTime test = new LocalTime(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35366);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35367);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35368);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35369);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35370);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5sraj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5sraj() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35371);
        __CLR4_4_1r64r64lc8azviq.R.inc(35372);LocalTime test = new LocalTime(TEST_TIME1, JULIAN_PARIS);
        __CLR4_4_1r64r64lc8azviq.R.inc(35373);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35374);assertEquals(1 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35375);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35376);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35377);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhraq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhraq() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35378);
        __CLR4_4_1r64r64lc8azviq.R.inc(35379);LocalTime test = new LocalTime(TEST_TIME2, JULIAN_LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35380);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35381);assertEquals(5 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35382);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35383);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35384);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckurax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckurax() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35385);
        __CLR4_4_1r64r64lc8azviq.R.inc(35386);LocalTime test = new LocalTime(TEST_TIME1, (Chronology) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35387);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35388);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35389);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35390);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35391);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyrb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyrb4() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35392);
        __CLR4_4_1r64r64lc8azviq.R.inc(35393);Date date = new Date(TEST_TIME1);
        __CLR4_4_1r64r64lc8azviq.R.inc(35394);LocalTime test = new LocalTime(date);
        __CLR4_4_1r64r64lc8azviq.R.inc(35395);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35396);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35397);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35398);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35399);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_Object2() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5frbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5frbc() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35400);
        __CLR4_4_1r64r64lc8azviq.R.inc(35401);Calendar cal = new GregorianCalendar();
        __CLR4_4_1r64r64lc8azviq.R.inc(35402);cal.setTime(new Date(TEST_TIME1));
        __CLR4_4_1r64r64lc8azviq.R.inc(35403);LocalTime test = new LocalTime(cal);
        __CLR4_4_1r64r64lc8azviq.R.inc(35404);assertEquals(GJChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35405);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35406);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35407);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35408);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukrbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukrbl() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35409);
        __CLR4_4_1r64r64lc8azviq.R.inc(35410);LocalTime test = new LocalTime((Object) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35411);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35412);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35413);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35414);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35415);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5drbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5drbs() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35416);
        __CLR4_4_1r64r64lc8azviq.R.inc(35417);LocalTime test = new LocalTime("10:20:30.040");
        __CLR4_4_1r64r64lc8azviq.R.inc(35418);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35419);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35420);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35421);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35422);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString1Tokyo() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcknmlrbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString1Tokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcknmlrbz() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35423);
        __CLR4_4_1r64r64lc8azviq.R.inc(35424);DateTimeZone.setDefault(TOKYO);
        __CLR4_4_1r64r64lc8azviq.R.inc(35425);LocalTime test = new LocalTime("10:20:30.040");
        __CLR4_4_1r64r64lc8azviq.R.inc(35426);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35427);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35428);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35429);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35430);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString1NewYork() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e193vwrc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString1NewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e193vwrc7() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35431);
        __CLR4_4_1r64r64lc8azviq.R.inc(35432);DateTimeZone.setDefault(NEW_YORK);
        __CLR4_4_1r64r64lc8azviq.R.inc(35433);LocalTime test = new LocalTime("10:20:30.040");
        __CLR4_4_1r64r64lc8azviq.R.inc(35434);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35435);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35436);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35437);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35438);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xurcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xurcf() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35439);
        __CLR4_4_1r64r64lc8azviq.R.inc(35440);LocalTime test = new LocalTime("T10:20:30.040");
        __CLR4_4_1r64r64lc8azviq.R.inc(35441);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35442);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35443);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35444);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35445);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qbrcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qbrcm() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35446);
        __CLR4_4_1r64r64lc8azviq.R.inc(35447);LocalTime test = new LocalTime("10:20");
        __CLR4_4_1r64r64lc8azviq.R.inc(35448);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35449);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35450);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35451);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35452);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327isrct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327isrct() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35453);
        __CLR4_4_1r64r64lc8azviq.R.inc(35454);LocalTime test = new LocalTime("10");
        __CLR4_4_1r64r64lc8azviq.R.inc(35455);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35456);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35457);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35458);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35459);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daulerd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daulerd0() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35460);
        __CLR4_4_1r64r64lc8azviq.R.inc(35461);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35462);new LocalTime("1970-04-06");
            __CLR4_4_1r64r64lc8azviq.R.inc(35463);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473rd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473rd4() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35464);
        __CLR4_4_1r64r64lc8azviq.R.inc(35465);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35466);new LocalTime("1970-04-06T+14:00");
            __CLR4_4_1r64r64lc8azviq.R.inc(35467);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zkrd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zkrd8() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35468);
        __CLR4_4_1r64r64lc8azviq.R.inc(35469);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35470);new LocalTime("1970-04-06T10:20:30.040");
            __CLR4_4_1r64r64lc8azviq.R.inc(35471);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1rdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1rdc() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35472);
        __CLR4_4_1r64r64lc8azviq.R.inc(35473);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35474);new LocalTime("1970-04-06T10:20:30.040+14:00");
            __CLR4_4_1r64r64lc8azviq.R.inc(35475);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx5() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmp0kirdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmp0kirdg() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35476);
        __CLR4_4_1r64r64lc8azviq.R.inc(35477);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35478);new LocalTime("T10:20:30.040+04:00");
            __CLR4_4_1r64r64lc8azviq.R.inc(35479);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx6() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evozczrdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evozczrdk() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35480);
        __CLR4_4_1r64r64lc8azviq.R.inc(35481);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35482);new LocalTime("10:20:30.040+04:00");
            __CLR4_4_1r64r64lc8azviq.R.inc(35483);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectLocalTime() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d94w9rdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d94w9rdo() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35484);
        __CLR4_4_1r64r64lc8azviq.R.inc(35485);LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1r64r64lc8azviq.R.inc(35486);LocalTime test = new LocalTime(time);
        __CLR4_4_1r64r64lc8azviq.R.inc(35487);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35488);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35489);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35490);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35491);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectLocalDate() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drwkayrdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drwkayrdw() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35492);
        __CLR4_4_1r64r64lc8azviq.R.inc(35493);LocalDate date = new LocalDate(1970, 4, 6, BUDDHIST_UTC);
        __CLR4_4_1r64r64lc8azviq.R.inc(35494);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35495);new LocalTime(date);
            __CLR4_4_1r64r64lc8azviq.R.inc(35496);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectLocalDateTime() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kto907re1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kto907re1() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35497);
        __CLR4_4_1r64r64lc8azviq.R.inc(35498);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1r64r64lc8azviq.R.inc(35499);LocalTime test = new LocalTime(dt);
        __CLR4_4_1r64r64lc8azviq.R.inc(35500);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35501);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35502);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35503);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35504);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_ObjectTimeOfDay() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkvwyxre9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectTimeOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkvwyxre9() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35505);
        __CLR4_4_1r64r64lc8azviq.R.inc(35506);TimeOfDay time = new TimeOfDay(10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1r64r64lc8azviq.R.inc(35507);LocalTime test = new LocalTime(time);
        __CLR4_4_1r64r64lc8azviq.R.inc(35508);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35509);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35510);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35511);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35512);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object1_DateTimeZone() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mto1cereh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mto1cereh() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35513);
        __CLR4_4_1r64r64lc8azviq.R.inc(35514);Date date = new Date(TEST_TIME1);
        __CLR4_4_1r64r64lc8azviq.R.inc(35515);LocalTime test = new LocalTime(date, PARIS);
        __CLR4_4_1r64r64lc8azviq.R.inc(35516);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35517);assertEquals(1 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35518);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35519);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35520);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString_DateTimeZoneLondon() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1fslarep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneLondon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1fslarep() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35521);
        __CLR4_4_1r64r64lc8azviq.R.inc(35522);LocalTime test = new LocalTime("04:20", LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35523);assertEquals(4, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35524);assertEquals(20, test.getMinuteOfHour());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString_DateTimeZoneTokyo() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uilxbiret();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneTokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uilxbiret() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35525);
        __CLR4_4_1r64r64lc8azviq.R.inc(35526);LocalTime test = new LocalTime("04:20", TOKYO);
        __CLR4_4_1r64r64lc8azviq.R.inc(35527);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35528);assertEquals(4, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35529);assertEquals(20, test.getMinuteOfHour());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_ObjectString_DateTimeZoneNewYork() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcrz9lrey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneNewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcrz9lrey() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35530);
        __CLR4_4_1r64r64lc8azviq.R.inc(35531);LocalTime test = new LocalTime("04:20", NEW_YORK);
        __CLR4_4_1r64r64lc8azviq.R.inc(35532);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35533);assertEquals(4, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35534);assertEquals(20, test.getMinuteOfHour());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgrf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgrf3() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35535);
        __CLR4_4_1r64r64lc8azviq.R.inc(35536);LocalTime test = new LocalTime((Object) null, PARIS);
        __CLR4_4_1r64r64lc8azviq.R.inc(35537);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35538);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35539);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35540);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35541);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6rfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6rfa() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35542);
        __CLR4_4_1r64r64lc8azviq.R.inc(35543);Date date = new Date(TEST_TIME1);
        __CLR4_4_1r64r64lc8azviq.R.inc(35544);LocalTime test = new LocalTime(date, (DateTimeZone) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35545);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35546);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35547);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35548);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35549);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5rfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5rfi() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35550);
        __CLR4_4_1r64r64lc8azviq.R.inc(35551);LocalTime test = new LocalTime((Object) null, (DateTimeZone) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35552);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35553);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35554);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35555);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35556);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object1_Chronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17w29z1rfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17w29z1rfp() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35557);
        __CLR4_4_1r64r64lc8azviq.R.inc(35558);Date date = new Date(TEST_TIME1);
        __CLR4_4_1r64r64lc8azviq.R.inc(35559);LocalTime test = new LocalTime(date, JULIAN_LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35560);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35561);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35562);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35563);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35564);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_Object2_Chronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdw9dqrfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdw9dqrfx() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35565);
        __CLR4_4_1r64r64lc8azviq.R.inc(35566);LocalTime test = new LocalTime("T10:20");
        __CLR4_4_1r64r64lc8azviq.R.inc(35567);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35568);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35569);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35570);assertEquals(0, test.getMillisOfSecond());
        
        __CLR4_4_1r64r64lc8azviq.R.inc(35571);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35572);new LocalTime("T1020");
            __CLR4_4_1r64r64lc8azviq.R.inc(35573);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynrg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynrg6() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35574);
        __CLR4_4_1r64r64lc8azviq.R.inc(35575);LocalTime test = new LocalTime((Object) null, JULIAN_LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35576);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35577);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35578);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35579);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35580);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzrgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzrgd() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35581);
        __CLR4_4_1r64r64lc8azviq.R.inc(35582);Date date = new Date(TEST_TIME1);
        __CLR4_4_1r64r64lc8azviq.R.inc(35583);LocalTime test = new LocalTime(date, (Chronology) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35584);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35585);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35586);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35587);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35588);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0rgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0rgl() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35589);
        __CLR4_4_1r64r64lc8azviq.R.inc(35590);LocalTime test = new LocalTime((Object) null, (Chronology) null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35591);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35592);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35593);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35594);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35595);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_int_int() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ioxbrgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ioxbrgs() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35596);
        __CLR4_4_1r64r64lc8azviq.R.inc(35597);LocalTime test = new LocalTime(10, 20);
        __CLR4_4_1r64r64lc8azviq.R.inc(35598);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35599);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35600);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35601);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35602);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35603);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35604);new LocalTime(-1, 20);
            __CLR4_4_1r64r64lc8azviq.R.inc(35605);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35606);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35607);new LocalTime(24, 20);
            __CLR4_4_1r64r64lc8azviq.R.inc(35608);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35609);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35610);new LocalTime(10, -1);
            __CLR4_4_1r64r64lc8azviq.R.inc(35611);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35612);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35613);new LocalTime(10, 60);
            __CLR4_4_1r64r64lc8azviq.R.inc(35614);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqnrhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqnrhb() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35615);
        __CLR4_4_1r64r64lc8azviq.R.inc(35616);LocalTime test = new LocalTime(10, 20, 30);
        __CLR4_4_1r64r64lc8azviq.R.inc(35617);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35618);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35619);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35620);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35621);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35622);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35623);new LocalTime(-1, 20, 30);
            __CLR4_4_1r64r64lc8azviq.R.inc(35624);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35625);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35626);new LocalTime(24, 20, 30);
            __CLR4_4_1r64r64lc8azviq.R.inc(35627);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35628);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35629);new LocalTime(10, -1, 30);
            __CLR4_4_1r64r64lc8azviq.R.inc(35630);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35631);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35632);new LocalTime(10, 60, 30);
            __CLR4_4_1r64r64lc8azviq.R.inc(35633);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35634);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35635);new LocalTime(10, 20, -1);
            __CLR4_4_1r64r64lc8azviq.R.inc(35636);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35637);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35638);new LocalTime(10, 20, 60);
            __CLR4_4_1r64r64lc8azviq.R.inc(35639);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_int_int_int_int() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjvai9ri0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjvai9ri0() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35640);
        __CLR4_4_1r64r64lc8azviq.R.inc(35641);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1r64r64lc8azviq.R.inc(35642);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35643);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35644);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35645);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35646);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35647);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35648);new LocalTime(-1, 20, 30, 40);
            __CLR4_4_1r64r64lc8azviq.R.inc(35649);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35650);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35651);new LocalTime(24, 20, 30, 40);
            __CLR4_4_1r64r64lc8azviq.R.inc(35652);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35653);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35654);new LocalTime(10, -1, 30, 40);
            __CLR4_4_1r64r64lc8azviq.R.inc(35655);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35656);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35657);new LocalTime(10, 60, 30, 40);
            __CLR4_4_1r64r64lc8azviq.R.inc(35658);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35659);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35660);new LocalTime(10, 20, -1, 40);
            __CLR4_4_1r64r64lc8azviq.R.inc(35661);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35662);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35663);new LocalTime(10, 20, 60, 40);
            __CLR4_4_1r64r64lc8azviq.R.inc(35664);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35665);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35666);new LocalTime(10, 20, 30, -1);
            __CLR4_4_1r64r64lc8azviq.R.inc(35667);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35668);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35669);new LocalTime(10, 20, 30, 1000);
            __CLR4_4_1r64r64lc8azviq.R.inc(35670);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152fm4qriv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152fm4qriv() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35671);
        __CLR4_4_1r64r64lc8azviq.R.inc(35672);LocalTime test = new LocalTime(10, 20, 30, 40, JULIAN_LONDON);
        __CLR4_4_1r64r64lc8azviq.R.inc(35673);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35674);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35675);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35676);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35677);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1r64r64lc8azviq.R.inc(35678);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35679);new LocalTime(-1, 20, 30, 40, JULIAN_LONDON);
            __CLR4_4_1r64r64lc8azviq.R.inc(35680);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35681);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35682);new LocalTime(24, 20, 30, 40, JULIAN_LONDON);
            __CLR4_4_1r64r64lc8azviq.R.inc(35683);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35684);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35685);new LocalTime(10, -1, 30, 40, JULIAN_LONDON);
            __CLR4_4_1r64r64lc8azviq.R.inc(35686);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35687);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35688);new LocalTime(10, 60, 30, 40, JULIAN_LONDON);
            __CLR4_4_1r64r64lc8azviq.R.inc(35689);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35690);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35691);new LocalTime(10, 20, -1, 40, JULIAN_LONDON);
            __CLR4_4_1r64r64lc8azviq.R.inc(35692);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35693);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35694);new LocalTime(10, 20, 60, 40, JULIAN_LONDON);
            __CLR4_4_1r64r64lc8azviq.R.inc(35695);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35696);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35697);new LocalTime(10, 20, 30, -1, JULIAN_LONDON);
            __CLR4_4_1r64r64lc8azviq.R.inc(35698);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1r64r64lc8azviq.R.inc(35699);try {
            __CLR4_4_1r64r64lc8azviq.R.inc(35700);new LocalTime(10, 20, 30, 1000, JULIAN_LONDON);
            __CLR4_4_1r64r64lc8azviq.R.inc(35701);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

    public void testConstructor_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1r64r64lc8azviq.R.globalSliceStart(getClass().getName(),35702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ah63rxrjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r64r64lc8azviq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r64r64lc8azviq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ah63rxrjq() throws Throwable{try{__CLR4_4_1r64r64lc8azviq.R.inc(35702);
        __CLR4_4_1r64r64lc8azviq.R.inc(35703);LocalTime test = new LocalTime(10, 20, 30, 40, null);
        __CLR4_4_1r64r64lc8azviq.R.inc(35704);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1r64r64lc8azviq.R.inc(35705);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1r64r64lc8azviq.R.inc(35706);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1r64r64lc8azviq.R.inc(35707);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1r64r64lc8azviq.R.inc(35708);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1r64r64lc8azviq.R.flushNeeded();}}

}
