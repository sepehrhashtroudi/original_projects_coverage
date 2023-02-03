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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1h3nh3nlc8azu5r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,22821,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_DEFAULT = BuddhistChronology.getInstance(LONDON);
    private static final CopticChronology COPTIC_DEFAULT = CopticChronology.getInstance(LONDON);

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
//    private long TEST_TIME_NOW_PARIS =
//            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
            
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
        
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22163);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22164);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22165);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22166);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1h3nh3nlc8azu5r.R.inc(22168);try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22167);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22169);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22170);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22171);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22172);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22173);originalLocale = Locale.getDefault();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22174);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22175);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22176);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22177);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22178);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22179);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22180);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22181);Locale.setDefault(originalLocale);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22182);originalDateTimeZone = null;
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22183);originalTimeZone = null;
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22184);originalLocale = null;
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjh49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjh49(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22185);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22186);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW_UTC).toString());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22187);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1_UTC).toString());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22188);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2_UTC).toString());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet_DateTimeField() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggkkrh4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGet_DateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggkkrh4d(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22189);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22190);DateMidnight test = new DateMidnight();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22191);assertEquals(1, test.get(ISO_DEFAULT.era()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22192);assertEquals(20, test.get(ISO_DEFAULT.centuryOfEra()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22193);assertEquals(2, test.get(ISO_DEFAULT.yearOfCentury()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22194);assertEquals(2002, test.get(ISO_DEFAULT.yearOfEra()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22195);assertEquals(2002, test.get(ISO_DEFAULT.year()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22196);assertEquals(6, test.get(ISO_DEFAULT.monthOfYear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22197);assertEquals(9, test.get(ISO_DEFAULT.dayOfMonth()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22198);assertEquals(2002, test.get(ISO_DEFAULT.weekyear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22199);assertEquals(23, test.get(ISO_DEFAULT.weekOfWeekyear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22200);assertEquals(7, test.get(ISO_DEFAULT.dayOfWeek()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22201);assertEquals(160, test.get(ISO_DEFAULT.dayOfYear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22202);assertEquals(0, test.get(ISO_DEFAULT.halfdayOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22203);assertEquals(0, test.get(ISO_DEFAULT.hourOfHalfday()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22204);assertEquals(24, test.get(ISO_DEFAULT.clockhourOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22205);assertEquals(12, test.get(ISO_DEFAULT.clockhourOfHalfday()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22206);assertEquals(0, test.get(ISO_DEFAULT.hourOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22207);assertEquals(0, test.get(ISO_DEFAULT.minuteOfHour()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22208);assertEquals(0, test.get(ISO_DEFAULT.minuteOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22209);assertEquals(0, test.get(ISO_DEFAULT.secondOfMinute()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22210);assertEquals(0, test.get(ISO_DEFAULT.secondOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22211);assertEquals(0, test.get(ISO_DEFAULT.millisOfSecond()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22212);assertEquals(0, test.get(ISO_DEFAULT.millisOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22213);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22214);test.get((DateTimeField) null);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22215);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testGet_DateTimeFieldType() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vh54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vh54(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22216);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22217);DateMidnight test = new DateMidnight();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22218);assertEquals(1, test.get(DateTimeFieldType.era()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22219);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22220);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22221);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22222);assertEquals(2002, test.get(DateTimeFieldType.year()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22223);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22224);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22225);assertEquals(2002, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22226);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22227);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22228);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22229);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22230);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22231);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22232);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22233);assertEquals(0, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22234);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22235);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22236);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22237);assertEquals(0, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22238);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22239);assertEquals(0, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22240);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22241);test.get((DateTimeFieldType) null);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22242);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetters() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7h5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7h5v(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22243);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22244);DateMidnight test = new DateMidnight();
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22245);assertEquals(ISO_DEFAULT, test.getChronology());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22246);assertEquals(LONDON, test.getZone());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22247);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22248);assertEquals(1, test.getEra());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22249);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22250);assertEquals(2, test.getYearOfCentury());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22251);assertEquals(2002, test.getYearOfEra());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22252);assertEquals(2002, test.getYear());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22253);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22254);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22255);assertEquals(2002, test.getWeekyear());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22256);assertEquals(23, test.getWeekOfWeekyear());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22257);assertEquals(7, test.getDayOfWeek());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22258);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22259);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22260);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22261);assertEquals(0, test.getMinuteOfDay());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22262);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22263);assertEquals(0, test.getSecondOfDay());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22264);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22265);assertEquals(0, test.getMillisOfDay());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testWithers() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzph6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzph6i(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22266);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22267);DateMidnight test = new DateMidnight(1970, 6, 9, GJ_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22268);check(test.withYear(2000), 2000, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22269);check(test.withMonthOfYear(2), 1970, 2, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22270);check(test.withDayOfMonth(2), 1970, 6, 2);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22271);check(test.withDayOfYear(6), 1970, 1, 6);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22272);check(test.withDayOfWeek(6), 1970, 6, 13);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22273);check(test.withWeekOfWeekyear(6), 1970, 2, 3);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22274);check(test.withWeekyear(1971), 1971, 6, 15);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22275);check(test.withYearOfCentury(60), 1960, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22276);check(test.withCenturyOfEra(21), 2070, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22277);check(test.withYearOfEra(1066), 1066, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22278);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22279);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22280);test.withMonthOfYear(0);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22281);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22282);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22283);test.withMonthOfYear(13);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22284);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEqualsHashCode() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77h71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77h71(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22285);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22286);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22287);DateMidnight test2 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22288);assertEquals(true, test1.equals(test2));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22289);assertEquals(true, test2.equals(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22290);assertEquals(true, test1.equals(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22291);assertEquals(true, test2.equals(test2));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22292);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22293);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22294);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22295);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22296);assertEquals(false, test1.equals(test3));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22297);assertEquals(false, test2.equals(test3));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22298);assertEquals(false, test3.equals(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22299);assertEquals(false, test3.equals(test2));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22300);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22301);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22302);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22303);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22304);assertEquals(false, test1.equals(new DateMidnight(TEST_TIME1_UTC, GREGORIAN_DEFAULT)));
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22305);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22306);return null;
        }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22307);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22308);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22309);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22310);return ISO_DEFAULT;
        }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
    }

    public void testCompareTo() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvh7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvh7r(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22311);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22312);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22313);DateMidnight test1a = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22314);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22315);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22316);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22317);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22318);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22319);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22320);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22321);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22322);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22323);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22324);assertEquals(-1, test3.compareTo(test2));  // midnight paris before london
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22325);assertEquals(+1, test2.compareTo(new MockInstant()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22326);assertEquals(0, test1.compareTo(new MockInstant()));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22327);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22328);test1.compareTo(null);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22329);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
    
    public void testIsEqual() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9e1z3h8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testIsEqual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9e1z3h8a(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22330);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22331);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22332);DateMidnight test1a = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22333);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22334);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22335);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22336);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22337);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22338);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22339);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22340);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22341);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22342);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22343);assertEquals(false, test3.isEqual(test2));  // midnight paris before london
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22344);assertEquals(false, test2.isEqual(new MockInstant()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22345);assertEquals(true, test1.isEqual(new MockInstant()));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22346);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC + DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isEqual(null));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22347);assertEquals(true, new DateMidnight(TEST_TIME_NOW_UTC, DateTimeZone.UTC).isEqual(null));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22348);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isEqual(null));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22349);assertEquals(false, new DateMidnight(2004, 6, 9).isEqual(new DateTime(2004, 6, 8, 23, 59, 59, 999)));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22350);assertEquals(true, new DateMidnight(2004, 6, 9).isEqual(new DateTime(2004, 6, 9, 0, 0, 0, 0)));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22351);assertEquals(false, new DateMidnight(2004, 6, 9).isEqual(new DateTime(2004, 6, 9, 0, 0, 0, 1)));
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
    
    public void testIsBefore() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rmvj2h8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testIsBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rmvj2h8w(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22352);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22353);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22354);DateMidnight test1a = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22355);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22356);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22357);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22358);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22359);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22360);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22361);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22362);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22363);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22364);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22365);assertEquals(true, test3.isBefore(test2));  // midnight paris before london
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22366);assertEquals(false, test2.isBefore(new MockInstant()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22367);assertEquals(false, test1.isBefore(new MockInstant()));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22368);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC + DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isBefore(null));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22369);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC, DateTimeZone.UTC).isBefore(null));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22370);assertEquals(true, new DateMidnight(TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isBefore(null));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22371);assertEquals(false, new DateMidnight(2004, 6, 9).isBefore(new DateTime(2004, 6, 8, 23, 59, 59, 999)));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22372);assertEquals(false, new DateMidnight(2004, 6, 9).isBefore(new DateTime(2004, 6, 9, 0, 0, 0, 0)));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22373);assertEquals(true, new DateMidnight(2004, 6, 9).isBefore(new DateTime(2004, 6, 9, 0, 0, 0, 1)));
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
    
    public void testIsAfter() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax1icnh9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testIsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax1icnh9i(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22374);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22375);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22376);DateMidnight test1a = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22377);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22378);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22379);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22380);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22381);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22382);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22383);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22384);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22385);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22386);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22387);assertEquals(false, test3.isAfter(test2));  // midnight paris before london
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22388);assertEquals(true, test2.isAfter(new MockInstant()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22389);assertEquals(false, test1.isAfter(new MockInstant()));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22390);assertEquals(true, new DateMidnight(TEST_TIME_NOW_UTC + DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isAfter(null));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22391);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC, DateTimeZone.UTC).isAfter(null));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22392);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isAfter(null));
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22393);assertEquals(true, new DateMidnight(2004, 6, 9).isAfter(new DateTime(2004, 6, 8, 23, 59, 59, 999)));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22394);assertEquals(false, new DateMidnight(2004, 6, 9).isAfter(new DateTime(2004, 6, 9, 0, 0, 0, 0)));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22395);assertEquals(false, new DateMidnight(2004, 6, 9).isAfter(new DateTime(2004, 6, 9, 0, 0, 0, 1)));
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9ha4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9ha4() throws Exception{try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22396);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22397);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22398);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22399);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22400);oos.writeObject(test);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22401);byte[] bytes = baos.toByteArray();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22402);oos.close();
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22403);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22404);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22405);DateMidnight result = (DateMidnight) ois.readObject();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22406);ois.close();
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22407);assertEquals(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidhag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidhag(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22408);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22409);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22410);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22411);test = new DateMidnight(TEST_TIME_NOW_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22412);assertEquals("2002-06-09T00:00:00.000+02:00", test.toString());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22413);test = new DateMidnight(TEST_TIME_NOW_UTC, NEWYORK);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22414);assertEquals("2002-06-08T00:00:00.000-04:00", test.toString());  // the 8th
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToString_String() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xhan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xhan(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22415);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22416);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22417);assertEquals("2002 00", test.toString("yyyy HH"));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22418);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((String) null));
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToString_String_String() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne197har();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToString_String_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne197har(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22419);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22420);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22421);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22422);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22423);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22424);assertEquals("Sun 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22425);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString(null, null));
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToString_DTFormatter() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpshay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpshay(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22426);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22427);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22428);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22429);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInstant() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yip9h7hb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yip9h7hb2(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22430);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22431);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22432);Instant result = test.toInstant();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22433);assertEquals(TEST_TIME1_LONDON, result.getMillis());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToDateTime() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovhb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovhb6(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22434);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22435);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22436);DateTime result = test.toDateTime();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22437);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22438);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22439);assertEquals(PARIS, result.getZone());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToDateTimeISO() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udmnxghbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udmnxghbc(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22440);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22441);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22442);DateTime result = test.toDateTimeISO();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22443);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22444);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22445);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22446);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToDateTime_DateTimeZone() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hynethbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hynethbj(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22447);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22448);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22449);DateTime result = test.toDateTime(LONDON);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22450);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22451);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22452);assertEquals(LONDON, result.getZone());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22453);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22454);result = test.toDateTime(PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22455);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22456);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22457);assertEquals(PARIS, result.getZone());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22458);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22459);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22460);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22461);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22462);assertEquals(LONDON, result.getZone());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22463);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22464);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22465);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22466);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22467);assertEquals(LONDON, result.getZone());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToDateTime_Chronology() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqjjehc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqjjehc4(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22468);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22469);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22470);DateTime result = test.toDateTime(ISO_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22471);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22472);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22473);assertEquals(LONDON, result.getZone());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22474);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22475);result = test.toDateTime(GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22476);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22477);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22478);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22479);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22480);result = test.toDateTime((Chronology) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22481);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22482);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22483);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22484);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22485);result = test.toDateTime((Chronology) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22486);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22487);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22488);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToMutableDateTime() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c071a3hcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c071a3hcp(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22489);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22490);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22491);MutableDateTime result = test.toMutableDateTime();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22492);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22493);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToMutableDateTimeISO() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7exd4hcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToMutableDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7exd4hcu(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22494);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22495);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22496);MutableDateTime result = test.toMutableDateTimeISO();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22497);assertSame(MutableDateTime.class, result.getClass());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22498);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22499);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22500);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToMutableDateTime_DateTimeZone() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0i321hd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToMutableDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0i321hd1(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22501);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22502);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22503);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22504);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22505);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22506);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22507);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22508);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22509);assertEquals(ISO_PARIS, result.getChronology());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22510);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22511);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22512);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22513);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22514);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22515);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22516);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22517);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToMutableDateTime_Chronology() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6xe2hdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToMutableDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6xe2hdi(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22518);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22519);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22520);MutableDateTime result = test.toMutableDateTime(ISO_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22521);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22522);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22523);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22524);result = test.toMutableDateTime(GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22525);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22526);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22527);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22528);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22529);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22530);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22531);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22532);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22533);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22534);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToDate() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdkgyhdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdkgyhdz(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22535);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22536);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22537);Date result = test.toDate();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22538);assertEquals(test.getMillis(), result.getTime());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToCalendar_Locale() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ez8ojvhe3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToCalendar_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ez8ojvhe3(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22539);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22540);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22541);Calendar result = test.toCalendar(null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22542);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22543);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22544);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22545);result = test.toCalendar(null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22546);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22547);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22548);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22549);result = test.toCalendar(Locale.UK);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22550);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22551);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToGregorianCalendar() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zoxa6heg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToGregorianCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zoxa6heg(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22552);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22553);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22554);GregorianCalendar result = test.toGregorianCalendar();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22555);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22556);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22557);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22558);result = test.toGregorianCalendar();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22559);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22560);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToYearMonthDay() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6rzn1hep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6rzn1hep(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22561);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22562);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22563);YearMonthDay test = base.toYearMonthDay();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22564);assertEquals(new YearMonthDay(TEST_TIME1_UTC, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToLocalDate() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orirhet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orirhet(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22565);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22566);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22567);LocalDate test = base.toLocalDate();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22568);assertEquals(new LocalDate(TEST_TIME1_UTC, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testToInterval() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj50gphex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj50gphex(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22569);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22570);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22571);Interval test = base.toInterval();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22572);DateMidnight end = base.plus(Period.days(1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22573);assertEquals(new Interval(base, end), test);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithMillis_long() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9ypzwhf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9ypzwhf2(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22574);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22575);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22576);DateMidnight result = test.withMillis(TEST_TIME2_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22577);assertEquals(TEST_TIME2_LONDON, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22578);assertEquals(test.getChronology(), result.getChronology());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22579);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22580);result = test.withMillis(TEST_TIME2_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22581);assertEquals(TEST_TIME2_PARIS, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22582);assertEquals(test.getChronology(), result.getChronology());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22583);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22584);result = test.withMillis(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22585);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testWithChronology_Chronology() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133y836hfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithChronology_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133y836hfe(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22586);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22587);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22588);DateMidnight result = test.withChronology(GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22589);assertEquals(TEST_TIME1_LONDON, test.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22590);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22591);assertEquals(GREGORIAN_PARIS, result.getChronology());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22592);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22593);result = test.withChronology(null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22594);assertEquals(TEST_TIME1_PARIS, test.getMillis());
        // midnight Paris is previous day in London
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22595);assertEquals(TEST_TIME1_LONDON - DateTimeConstants.MILLIS_PER_DAY, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22596);assertEquals(ISO_DEFAULT, result.getChronology());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22597);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22598);result = test.withChronology(null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22599);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22600);assertEquals(ISO_DEFAULT, result.getChronology());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22601);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22602);result = test.withChronology(ISO_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22603);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testWithZoneRetainFields_DateTimeZone() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pa2s5hfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithZoneRetainFields_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pa2s5hfw(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22604);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22605);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22606);DateMidnight result = test.withZoneRetainFields(PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22607);assertEquals(TEST_TIME1_LONDON, test.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22608);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22609);assertEquals(ISO_PARIS, result.getChronology());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22610);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22611);result = test.withZoneRetainFields(null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22612);assertEquals(TEST_TIME1_PARIS, test.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22613);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22614);assertEquals(GREGORIAN_DEFAULT, result.getChronology());
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22615);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22616);result = test.withZoneRetainFields(LONDON);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22617);assertSame(test, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22618);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22619);result = test.withZoneRetainFields(null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22620);assertSame(test, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22621);test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22622);result = test.withZoneRetainFields(LONDON);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22623);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFields_RPartial() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1812bvohgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFields_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1812bvohgg(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22624);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22625);DateMidnight test = new DateMidnight(2004, 5, 6);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22626);DateMidnight result = test.withFields(new YearMonthDay(2003, 4, 5));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22627);DateMidnight expected = new DateMidnight(2003, 4, 5);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22628);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22629);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22630);result = test.withFields(null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22631);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField1() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16yhgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16yhgo(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22632);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22633);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22634);DateMidnight result = test.withField(DateTimeFieldType.year(), 2006);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22635);assertEquals(new DateMidnight(2004, 6, 9), test);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22636);assertEquals(new DateMidnight(2006, 6, 9), result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testWithField2() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2ehhgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2ehhgt(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22637);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22638);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22639);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22640);test.withField(null, 6);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22641);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded1() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22hgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22hgy(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22642);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22643);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22644);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 6);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22645);assertEquals(new DateMidnight(2004, 6, 9), test);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22646);assertEquals(new DateMidnight(2010, 6, 9), result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testWithFieldAdded2() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150grujhh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150grujhh3(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22647);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22648);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22649);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22650);test.withFieldAdded(null, 0);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22651);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testWithFieldAdded3() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn0hh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn0hh8(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22652);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22653);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22654);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22655);test.withFieldAdded(null, 6);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22656);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testWithFieldAdded4() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfhhhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfhhhd(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22657);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22658);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22659);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22660);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDurationAdded_long_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q11w3ihhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q11w3ihhh(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22661);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22662);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22663);DateMidnight result = test.withDurationAdded(123456789L, 1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22664);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22665);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22666);result = test.withDurationAdded(123456789L, 0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22667);assertSame(test, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22668);result = test.withDurationAdded(123456789L, 2);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22669);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22670);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22671);result = test.withDurationAdded(123456789L, -3);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22672);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22673);assertEquals(expected, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithDurationAdded_RD_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcnxxohhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_RD_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcnxxohhu(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22674);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22675);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22676);DateMidnight result = test.withDurationAdded(new Duration(123456789L), 1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22677);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22678);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22679);result = test.withDurationAdded(null, 1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22680);assertSame(test, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22681);result = test.withDurationAdded(new Duration(123456789L), 0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22682);assertSame(test, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22683);result = test.withDurationAdded(new Duration(123456789L), 2);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22684);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22685);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22686);result = test.withDurationAdded(new Duration(123456789L), -3);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22687);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22688);assertEquals(expected, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDurationAdded_RP_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1by6igwhi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_RP_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1by6igwhi9(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22689);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22690);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22691);DateMidnight result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22692);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22693);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22694);result = test.withPeriodAdded(null, 1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22695);assertSame(test, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22696);result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22697);assertSame(test, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22698);result = test.withPeriodAdded(new Period(1, 2, 0, 4, 5, 6, 7, 8), 3);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22699);expected = new DateMidnight(2005, 11, 15, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22700);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22701);result = test.withPeriodAdded(new Period(1, 2, 0, 1, 1, 2, 3, 4), -1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22702);expected = new DateMidnight(2001, 3, 1, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22703);assertEquals(expected, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    public void testPlus_long() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dfcomhio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dfcomhio(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22704);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22705);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22706);DateMidnight result = test.plus(123456789L);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22707);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22708);assertEquals(expected, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
    
    public void testPlus_RD() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121wcz0hit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121wcz0hit(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22709);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22710);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22711);DateMidnight result = test.plus(new Duration(123456789L));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22712);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22713);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22714);result = test.plus((ReadableDuration) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22715);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testPlus_RP() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83ighj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83ighj0(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22716);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22717);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22718);DateMidnight result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22719);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22720);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22721);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22722);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testPlusYears_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kpthj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kpthj7(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22723);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22724);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22725);DateMidnight result = test.plusYears(1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22726);DateMidnight expected = new DateMidnight(2003, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22727);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22728);result = test.plusYears(0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22729);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testPlusMonths_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaihje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaihje(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22730);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22731);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22732);DateMidnight result = test.plusMonths(1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22733);DateMidnight expected = new DateMidnight(2002, 6, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22734);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22735);result = test.plusMonths(0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22736);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testPlusWeeks_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eupheehjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eupheehjl(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22737);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22738);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22739);DateMidnight result = test.plusWeeks(1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22740);DateMidnight expected = new DateMidnight(2002, 5, 10, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22741);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22742);result = test.plusWeeks(0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22743);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testPlusDays_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqhjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqhjs(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22744);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22745);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22746);DateMidnight result = test.plusDays(1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22747);DateMidnight expected = new DateMidnight(2002, 5, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22748);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22749);result = test.plusDays(0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22750);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    public void testMinus_long() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gse7d0hjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gse7d0hjz(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22751);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22752);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22753);DateMidnight result = test.minus(123456789L);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22754);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22755);assertEquals(expected, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testMinus_RD() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyrr3uhk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyrr3uhk4(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22756);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22757);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22758);DateMidnight result = test.minus(new Duration(123456789L));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22759);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22760);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22761);result = test.minus((ReadableDuration) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22762);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testMinus_RP() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmhkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmhkb(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22763);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22764);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22765);DateMidnight result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22766);DateMidnight expected = new DateMidnight(2001, 3, 25, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22767);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22768);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22769);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testMinusYears_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdinhki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdinhki(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22770);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22771);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22772);DateMidnight result = test.minusYears(1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22773);DateMidnight expected = new DateMidnight(2001, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22774);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22775);result = test.minusYears(0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22776);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testMinusMonths_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gohkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gohkp(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22777);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22778);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22779);DateMidnight result = test.minusMonths(1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22780);DateMidnight expected = new DateMidnight(2002, 4, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22781);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22782);result = test.minusMonths(0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22783);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testMinusWeeks_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi4olkhkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi4olkhkw(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22784);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22785);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22786);DateMidnight result = test.minusWeeks(1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22787);DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22788);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22789);result = test.minusWeeks(0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22790);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    public void testMinusDays_int() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufckhl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufckhl3(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22791);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22792);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22793);DateMidnight result = test.minusDays(1);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22794);DateMidnight expected = new DateMidnight(2002, 5, 2, BUDDHIST_DEFAULT);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22795);assertEquals(expected, result);
        
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22796);result = test.minusDays(0);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22797);assertSame(test, result);
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceStart(getClass().getName(),22798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoihla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3nh3nlc8azu5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3nh3nlc8azu5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoihla(){try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22798);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22799);DateMidnight test = new DateMidnight();
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22800);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22801);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22802);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22803);assertEquals(test.property(DateTimeFieldType.millisOfSecond()), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22804);DateTimeFieldType bad = new DateTimeFieldType("bad") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22805);
                __CLR4_4_1h3nh3nlc8azu5r.R.inc(22806);return DurationFieldType.weeks();
            }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22807);
                __CLR4_4_1h3nh3nlc8azu5r.R.inc(22808);return null;
            }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22809);
                __CLR4_4_1h3nh3nlc8azu5r.R.inc(22810);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}
        };
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22811);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22812);test.property(bad);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22813);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22814);try {
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22815);test.property(null);
            __CLR4_4_1h3nh3nlc8azu5r.R.inc(22816);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1h3nh3nlc8azu5r.R.inc(22817);
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22818);assertEquals(year, test.getYear());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22819);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1h3nh3nlc8azu5r.R.inc(22820);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1h3nh3nlc8azu5r.R.flushNeeded();}}

}
