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
import org.joda.time.chrono.BaseChronology;
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
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1jyzjyzlc8azuj5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,26697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
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

    public static void main(String[] args) {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25883);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25884);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25885);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25886);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1jyzjyzlc8azuj5.R.inc(25888);try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25887);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25889);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25890);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25891);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25892);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25893);originalLocale = Locale.getDefault();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25894);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25895);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25896);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25897);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25898);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25899);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25900);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25901);Locale.setDefault(originalLocale);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25902);originalDateTimeZone = null;
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25903);originalTimeZone = null;
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25904);originalLocale = null;
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),25905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjjzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjjzl(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25905);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25906);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25907);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25908);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet_DateTimeField() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),25909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggkkrjzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testGet_DateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggkkrjzp(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25909);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25910);DateTime test = new DateTime();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25911);assertEquals(1, test.get(ISO_DEFAULT.era()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25912);assertEquals(20, test.get(ISO_DEFAULT.centuryOfEra()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25913);assertEquals(2, test.get(ISO_DEFAULT.yearOfCentury()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25914);assertEquals(2002, test.get(ISO_DEFAULT.yearOfEra()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25915);assertEquals(2002, test.get(ISO_DEFAULT.year()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25916);assertEquals(6, test.get(ISO_DEFAULT.monthOfYear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25917);assertEquals(9, test.get(ISO_DEFAULT.dayOfMonth()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25918);assertEquals(2002, test.get(ISO_DEFAULT.weekyear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25919);assertEquals(23, test.get(ISO_DEFAULT.weekOfWeekyear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25920);assertEquals(7, test.get(ISO_DEFAULT.dayOfWeek()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25921);assertEquals(160, test.get(ISO_DEFAULT.dayOfYear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25922);assertEquals(0, test.get(ISO_DEFAULT.halfdayOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25923);assertEquals(1, test.get(ISO_DEFAULT.hourOfHalfday()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25924);assertEquals(1, test.get(ISO_DEFAULT.clockhourOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25925);assertEquals(1, test.get(ISO_DEFAULT.clockhourOfHalfday()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25926);assertEquals(1, test.get(ISO_DEFAULT.hourOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25927);assertEquals(0, test.get(ISO_DEFAULT.minuteOfHour()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25928);assertEquals(60, test.get(ISO_DEFAULT.minuteOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25929);assertEquals(0, test.get(ISO_DEFAULT.secondOfMinute()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25930);assertEquals(60 * 60, test.get(ISO_DEFAULT.secondOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25931);assertEquals(0, test.get(ISO_DEFAULT.millisOfSecond()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25932);assertEquals(60 * 60 * 1000, test.get(ISO_DEFAULT.millisOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25933);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(25934);test.get((DateTimeField) null);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(25935);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testGet_DateTimeFieldType() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),25936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vk0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vk0g(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25936);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25937);DateTime test = new DateTime();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25938);assertEquals(1, test.get(DateTimeFieldType.era()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25939);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25940);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25941);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25942);assertEquals(2002, test.get(DateTimeFieldType.year()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25943);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25944);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25945);assertEquals(2002, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25946);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25947);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25948);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25949);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25950);assertEquals(1, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25951);assertEquals(1, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25952);assertEquals(1, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25953);assertEquals(1, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25954);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25955);assertEquals(60, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25956);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25957);assertEquals(60 * 60, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25958);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25959);assertEquals(60 * 60 * 1000, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25960);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(25961);test.get((DateTimeFieldType) null);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(25962);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testIsSupported_DateTimeFieldType() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),25963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyuedvk17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsSupported_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyuedvk17(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25963);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25964);DateTime test = new DateTime();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25965);assertEquals(true, test.isSupported(DateTimeFieldType.era()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25966);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25967);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25968);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25969);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25970);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25971);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25972);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25973);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25974);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25975);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25976);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25977);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25978);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25979);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25980);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25981);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25982);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25983);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25984);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25985);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25986);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25987);assertEquals(false, test.isSupported(null));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetters() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),25988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7k1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7k1w(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(25988);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25989);DateTime test = new DateTime();
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25990);assertEquals(ISO_DEFAULT, test.getChronology());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25991);assertEquals(LONDON, test.getZone());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25992);assertEquals(TEST_TIME_NOW, test.getMillis());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25993);assertEquals(1, test.getEra());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25994);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25995);assertEquals(2, test.getYearOfCentury());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25996);assertEquals(2002, test.getYearOfEra());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25997);assertEquals(2002, test.getYear());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25998);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(25999);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26000);assertEquals(2002, test.getWeekyear());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26001);assertEquals(23, test.getWeekOfWeekyear());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26002);assertEquals(7, test.getDayOfWeek());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26003);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26004);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26005);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26006);assertEquals(60, test.getMinuteOfDay());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26007);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26008);assertEquals(60 * 60, test.getSecondOfDay());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26009);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26010);assertEquals(60 * 60 * 1000, test.getMillisOfDay());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testWithers() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzpk2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzpk2j(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26011);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26012);DateTime test = new DateTime(1970, 6, 9, 10, 20, 30, 40, GJ_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26013);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26014);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26015);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26016);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26017);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26018);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26019);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26020);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26021);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26022);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26023);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26024);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26025);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26026);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26027);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26028);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26029);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26030);test.withMonthOfYear(0);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26031);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26032);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26033);test.withMonthOfYear(13);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26034);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEqualsHashCode() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77k37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77k37(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26035);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26036);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26037);DateTime test2 = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26038);assertEquals(true, test1.equals(test2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26039);assertEquals(true, test2.equals(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26040);assertEquals(true, test1.equals(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26041);assertEquals(true, test2.equals(test2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26042);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26043);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26044);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26045);DateTime test3 = new DateTime(TEST_TIME2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26046);assertEquals(false, test1.equals(test3));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26047);assertEquals(false, test2.equals(test3));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26048);assertEquals(false, test3.equals(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26049);assertEquals(false, test3.equals(test2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26050);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26051);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26052);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26053);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26054);assertEquals(false, test1.equals(new DateTime(TEST_TIME1, GREGORIAN_DEFAULT)));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26055);assertEquals(true, new DateTime(TEST_TIME1, new MockEqualsChronology()).equals(new DateTime(TEST_TIME1, new MockEqualsChronology())));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26056);assertEquals(false, new DateTime(TEST_TIME1, new MockEqualsChronology()).equals(new DateTime(TEST_TIME1, ISO_DEFAULT)));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26057);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26058);return null;
        }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26059);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26060);return TEST_TIME1;
        }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26061);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26062);return ISO_DEFAULT;
        }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26063);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26064);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26065);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26066);return null;
        }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26067);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26068);return this;
        }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26069);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26070);return this;
        }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26071);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26072);return "";
        }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    }

    public void testCompareTo() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvk49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvk49(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26073);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26074);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26075);DateTime test1a = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26076);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26077);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26078);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26079);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26080);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26081);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26082);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26083);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26084);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26085);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26086);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26087);assertEquals(+1, test2.compareTo(new MockInstant()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26088);assertEquals(0, test1.compareTo(new MockInstant()));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26089);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26090);test1.compareTo(null);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26091);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsEqual_long() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2rxu2k4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsEqual_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2rxu2k4s(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26092);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26093);assertEquals(false, new DateTime(TEST_TIME1).isEqual(TEST_TIME2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26094);assertEquals(true, new DateTime(TEST_TIME1).isEqual(TEST_TIME1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26095);assertEquals(false, new DateTime(TEST_TIME2).isEqual(TEST_TIME1));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testIsEqualNow() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17sfjzvk4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsEqualNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17sfjzvk4w(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26096);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26097);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isEqualNow());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26098);assertEquals(true, new DateTime(TEST_TIME_NOW).isEqualNow());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26099);assertEquals(false, new DateTime(TEST_TIME_NOW + 1).isEqualNow());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testIsEqual_RI() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1wuudk50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsEqual_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1wuudk50(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26100);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26101);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26102);DateTime test1a = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26103);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26104);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26105);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26106);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26107);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26108);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26109);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26110);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26111);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26112);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26113);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26114);assertEquals(false, test2.isEqual(new MockInstant()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26115);assertEquals(true, test1.isEqual(new MockInstant()));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26116);assertEquals(false, new DateTime(TEST_TIME_NOW + 1).isEqual(null));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26117);assertEquals(true, new DateTime(TEST_TIME_NOW).isEqual(null));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26118);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isEqual(null));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_long() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie6mpzk5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsBefore_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie6mpzk5j(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26119);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26120);assertEquals(true, new DateTime(TEST_TIME1).isBefore(TEST_TIME2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26121);assertEquals(false, new DateTime(TEST_TIME1).isBefore(TEST_TIME1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26122);assertEquals(false, new DateTime(TEST_TIME2).isBefore(TEST_TIME1));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testIsBeforeNow() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh1we6k5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsBeforeNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh1we6k5n(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26123);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26124);assertEquals(true, new DateTime(TEST_TIME_NOW - 1).isBeforeNow());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26125);assertEquals(false, new DateTime(TEST_TIME_NOW).isBeforeNow());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26126);assertEquals(false, new DateTime(TEST_TIME_NOW + 1).isBeforeNow());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testIsBefore_RI() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mphjyk5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsBefore_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mphjyk5r(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26127);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26128);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26129);DateTime test1a = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26130);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26131);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26132);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26133);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26134);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26135);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26136);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26137);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26138);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26139);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26140);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26141);assertEquals(false, test2.isBefore(new MockInstant()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26142);assertEquals(false, test1.isBefore(new MockInstant()));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26143);assertEquals(false, new DateTime(TEST_TIME_NOW + 1).isBefore(null));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26144);assertEquals(false, new DateTime(TEST_TIME_NOW).isBefore(null));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26145);assertEquals(true, new DateTime(TEST_TIME_NOW - 1).isBefore(null));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_long() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehltpak6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehltpak6a(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26146);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26147);assertEquals(false, new DateTime(TEST_TIME1).isAfter(TEST_TIME2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26148);assertEquals(false, new DateTime(TEST_TIME1).isAfter(TEST_TIME1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26149);assertEquals(true, new DateTime(TEST_TIME2).isAfter(TEST_TIME1));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testIsAfterNow() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bglzxk6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfterNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bglzxk6e(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26150);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26151);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfterNow());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26152);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfterNow());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26153);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfterNow());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testIsAfter_RI() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5t0u5k6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5t0u5k6i(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26154);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26155);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26156);DateTime test1a = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26157);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26158);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26159);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26160);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26161);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26162);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26163);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26164);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26165);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26166);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26167);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26168);assertEquals(true, test2.isAfter(new MockInstant()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26169);assertEquals(false, test1.isAfter(new MockInstant()));
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26170);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfter(null));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26171);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfter(null));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26172);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfter(null));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9k71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9k71() throws Exception{try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26173);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26174);DateTime test = new DateTime(TEST_TIME_NOW);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26175);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26176);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26177);oos.writeObject(test);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26178);byte[] bytes = baos.toByteArray();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26179);oos.close();
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26180);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26181);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26182);DateTime result = (DateTime) ois.readObject();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26183);ois.close();
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26184);assertEquals(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidk7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidk7d(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26185);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26186);DateTime test = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26187);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26188);test = new DateTime(TEST_TIME_NOW, PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26189);assertEquals("2002-06-09T02:00:00.000+02:00", test.toString());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToString_String() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xk7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xk7i(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26190);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26191);DateTime test = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26192);assertEquals("2002 01", test.toString("yyyy HH"));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26193);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((String) null));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToString_String_Locale() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64uk7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64uk7m(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26194);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26195);DateTime test = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26196);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26197);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26198);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26199);assertEquals("Sun 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26200);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testToString_DTFormatter() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsk7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsk7t(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26201);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26202);DateMidnight test = new DateMidnight(TEST_TIME_NOW);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26203);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26204);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInstant() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yip9h7k7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yip9h7k7x(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26205);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26206);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26207);Instant result = test.toInstant();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26208);assertEquals(TEST_TIME1, result.getMillis());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToDateTime() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovk81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovk81(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26209);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26210);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26211);DateTime result = test.toDateTime();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26212);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToDateTimeISO() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udmnxgk85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udmnxgk85(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26213);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26214);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26215);DateTime result = test.toDateTimeISO();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26216);assertSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26217);test = new DateTime(TEST_TIME1, ISO_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26218);result = test.toDateTimeISO();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26219);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26220);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26221);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26222);assertEquals(ISO_PARIS, result.getChronology());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26223);assertNotSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26224);test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26225);result = test.toDateTimeISO();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26226);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26227);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26228);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26229);assertEquals(ISO_DEFAULT, result.getChronology());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26230);assertNotSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26231);test = new DateTime(TEST_TIME1, new MockNullZoneChronology());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26232);result = test.toDateTimeISO();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26233);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26234);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26235);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26236);assertEquals(ISO_DEFAULT, result.getChronology());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26237);assertNotSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToDateTime_DateTimeZone() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hynetk8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hynetk8u(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26238);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26239);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26240);DateTime result = test.toDateTime(LONDON);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26241);assertSame(test, result);

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26242);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26243);result = test.toDateTime(PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26244);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26245);assertEquals(PARIS, result.getZone());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26246);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26247);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26248);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26249);assertEquals(LONDON, result.getZone());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26250);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26251);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26252);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToDateTime_Chronology() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqjjek99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqjjek99(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26253);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26254);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26255);DateTime result = test.toDateTime(ISO_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26256);assertSame(test, result);

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26257);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26258);result = test.toDateTime(GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26259);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26260);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26261);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26262);result = test.toDateTime((Chronology) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26263);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26264);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26265);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26266);result = test.toDateTime((Chronology) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26267);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToMutableDateTime() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c071a3k9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c071a3k9o(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26268);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26269);DateTime test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26270);MutableDateTime result = test.toMutableDateTime();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26271);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26272);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToMutableDateTimeISO() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7exd4k9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7exd4k9t(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26273);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26274);DateTime test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26275);MutableDateTime result = test.toMutableDateTimeISO();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26276);assertSame(MutableDateTime.class, result.getClass());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26277);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26278);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26279);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToMutableDateTime_DateTimeZone() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0i321ka0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0i321ka0(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26280);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26281);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26282);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26283);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26284);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26285);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26286);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26287);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26288);assertEquals(ISO_PARIS, result.getChronology());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26289);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26290);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26291);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26292);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26293);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26294);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26295);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26296);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToMutableDateTime_Chronology() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6xe2kah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6xe2kah(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26297);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26298);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26299);MutableDateTime result = test.toMutableDateTime(ISO_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26300);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26301);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26302);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26303);result = test.toMutableDateTime(GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26304);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26305);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26306);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26307);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26308);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26309);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26310);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26311);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26312);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26313);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToDate() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdkgykay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdkgykay(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26314);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26315);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26316);Date result = test.toDate();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26317);assertEquals(test.getMillis(), result.getTime());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToCalendar_Locale() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ez8ojvkb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToCalendar_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ez8ojvkb2(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26318);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26319);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26320);Calendar result = test.toCalendar(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26321);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26322);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26323);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26324);result = test.toCalendar(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26325);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26326);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26327);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26328);result = test.toCalendar(Locale.UK);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26329);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26330);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToGregorianCalendar() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zoxa6kbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToGregorianCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zoxa6kbf(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26331);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26332);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26333);GregorianCalendar result = test.toGregorianCalendar();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26334);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26335);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26336);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26337);result = test.toGregorianCalendar();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26338);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26339);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testToDateMidnight() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osch5ekbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osch5ekbo(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26340);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26341);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26342);DateMidnight test = base.toDateMidnight();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26343);assertEquals(new DateMidnight(base, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testToYearMonthDay() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6rzn1kbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6rzn1kbs(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26344);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26345);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26346);YearMonthDay test = base.toYearMonthDay();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26347);assertEquals(new YearMonthDay(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testToTimeOfDay() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6fxsekbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToTimeOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6fxsekbw(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26348);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26349);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26350);TimeOfDay test = base.toTimeOfDay();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26351);assertEquals(new TimeOfDay(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToLocalDateTime() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18m6ie8kc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18m6ie8kc0(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26352);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26353);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26354);LocalDateTime test = base.toLocalDateTime();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26355);assertEquals(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToLocalDate() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orirkc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orirkc4(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26356);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26357);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26358);LocalDate test = base.toLocalDate();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26359);assertEquals(new LocalDate(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testToLocalTime() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn1c42kc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn1c42kc8(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26360);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26361);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26362);LocalTime test = base.toLocalTime();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26363);assertEquals(new LocalTime(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithMillis_long() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9ypzwkcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9ypzwkcc(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26364);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26365);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26366);DateTime result = test.withMillis(TEST_TIME2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26367);assertEquals(TEST_TIME2, result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26368);assertEquals(test.getChronology(), result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26369);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26370);result = test.withMillis(TEST_TIME2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26371);assertEquals(TEST_TIME2, result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26372);assertEquals(test.getChronology(), result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26373);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26374);result = test.withMillis(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26375);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testWithChronology_Chronology() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133y836kco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithChronology_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133y836kco(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26376);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26377);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26378);DateTime result = test.withChronology(GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26379);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26380);assertEquals(GREGORIAN_PARIS, result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26381);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26382);result = test.withChronology(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26383);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26384);assertEquals(ISO_DEFAULT, result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26385);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26386);result = test.withChronology(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26387);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26388);assertEquals(ISO_DEFAULT, result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26389);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26390);result = test.withChronology(ISO_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26391);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testWithZone_DateTimeZone() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4wnc9kd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithZone_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4wnc9kd4(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26392);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26393);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26394);DateTime result = test.withZone(PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26395);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26396);assertEquals(ISO_PARIS, result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26397);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26398);result = test.withZone(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26399);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26400);assertEquals(GREGORIAN_DEFAULT, result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26401);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26402);result = test.withZone(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26403);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testWithZoneRetainFields_DateTimeZone() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pa2s5kdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithZoneRetainFields_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pa2s5kdg(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26404);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26405);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26406);DateTime result = test.withZoneRetainFields(PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26407);assertEquals(test.getMillis() - DateTimeConstants.MILLIS_PER_HOUR, result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26408);assertEquals(ISO_PARIS, result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26409);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26410);result = test.withZoneRetainFields(LONDON);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26411);assertSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26412);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26413);result = test.withZoneRetainFields(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26414);assertSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26415);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26416);result = test.withZoneRetainFields(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26417);assertEquals(test.getMillis() + DateTimeConstants.MILLIS_PER_HOUR, result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26418);assertEquals(GREGORIAN_DEFAULT, result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26419);test = new DateTime(TEST_TIME1, new MockNullZoneChronology());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26420);result = test.withZoneRetainFields(LONDON);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26421);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithDate_int_int_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1343719kdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1343719kdy(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26422);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26423);DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26424);DateTime result = test.withDate(2003, 5, 6);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26425);DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26426);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26427);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26428);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26429);test.withDate(2003, 13, 1);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26430);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testWithTime_int_int_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kpm1wke7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kpm1wke7(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26431);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26432);DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26433);DateTime result = test.withTime(12, 24, 0, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26434);assertEquals(TEST_TIME1, result.getMillis());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26435);assertEquals(BUDDHIST_UTC, result.getChronology());
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26436);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26437);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26438);test.withTime(25, 1, 1, 1);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26439);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    @SuppressWarnings("deprecation")
    public void testWithFields_RPartial() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1812bvokeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFields_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1812bvokeg(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26440);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26441);DateTime test = new DateTime(2004, 5, 6, 7, 8, 9, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26442);DateTime result = test.withFields(new YearMonthDay(2003, 4, 5));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26443);DateTime expected = new DateTime(2003, 4, 5, 7, 8, 9, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26444);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26445);test = new DateTime(TEST_TIME1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26446);result = test.withFields(null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26447);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithField1() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16ykeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16ykeo(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26448);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26449);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26450);DateTime result = test.withField(DateTimeFieldType.year(), 2006);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26451);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26452);assertEquals(new DateTime(2006, 6, 9, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testWithField2() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2ehket();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2ehket(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26453);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26454);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26455);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26456);test.withField(null, 6);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26457);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded1() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22key();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22key(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26458);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26459);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26460);DateTime result = test.withFieldAdded(DurationFieldType.years(), 6);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26461);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26462);assertEquals(new DateTime(2010, 6, 9, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testWithFieldAdded2() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150grujkf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150grujkf3(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26463);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26464);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26465);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26466);test.withFieldAdded(null, 0);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26467);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testWithFieldAdded3() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn0kf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn0kf8(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26468);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26469);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26470);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26471);test.withFieldAdded(null, 6);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26472);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testWithFieldAdded4() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfhkfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfhkfd(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26473);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26474);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26475);DateTime result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26476);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDurationAdded_long_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q11w3ikfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q11w3ikfh(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26477);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26478);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26479);DateTime result = test.withDurationAdded(123456789L, 1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26480);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26481);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26482);result = test.withDurationAdded(123456789L, 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26483);assertSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26484);result = test.withDurationAdded(123456789L, 2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26485);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26486);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26487);result = test.withDurationAdded(123456789L, -3);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26488);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26489);assertEquals(expected, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithDurationAdded_RD_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcnxxokfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcnxxokfu(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26490);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26491);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26492);DateTime result = test.withDurationAdded(new Duration(123456789L), 1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26493);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26494);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26495);result = test.withDurationAdded(null, 1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26496);assertSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26497);result = test.withDurationAdded(new Duration(123456789L), 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26498);assertSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26499);result = test.withDurationAdded(new Duration(123456789L), 2);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26500);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26501);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26502);result = test.withDurationAdded(new Duration(123456789L), -3);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26503);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26504);assertEquals(expected, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithDurationAdded_RP_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1by6igwkg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RP_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1by6igwkg9(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26505);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26506);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26507);DateTime result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26508);DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26509);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26510);result = test.withPeriodAdded(null, 1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26511);assertSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26512);result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26513);assertSame(test, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26514);result = test.withPeriodAdded(new Period(1, 2, 0, 4, 5, 6, 7, 8), 3);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26515);expected = new DateTime(2005, 11, 15, 16, 20, 24, 28, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26516);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26517);result = test.withPeriodAdded(new Period(1, 2, 0, 1, 1, 2, 3, 4), -1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26518);expected = new DateTime(2001, 3, 2, 0, 0, 0, 0, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26519);assertEquals(expected, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    public void testPlus_long() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dfcomkgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dfcomkgo(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26520);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26521);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26522);DateTime result = test.plus(123456789L);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26523);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26524);assertEquals(expected, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testPlus_RD() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121wcz0kgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121wcz0kgt(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26525);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26526);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26527);DateTime result = test.plus(new Duration(123456789L));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26528);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26529);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26530);result = test.plus((ReadableDuration) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26531);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testPlus_RP() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igkh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igkh0(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26532);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26533);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26534);DateTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26535);DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26536);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26537);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26538);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testPlusYears_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kptkh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kptkh7(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26539);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26540);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26541);DateTime result = test.plusYears(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26542);DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26543);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26544);result = test.plusYears(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26545);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testPlusMonths_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaikhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaikhe(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26546);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26547);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26548);DateTime result = test.plusMonths(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26549);DateTime expected = new DateTime(2002, 6, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26550);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26551);result = test.plusMonths(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26552);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testPlusWeeks_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eupheekhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eupheekhl(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26553);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26554);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26555);DateTime result = test.plusWeeks(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26556);DateTime expected = new DateTime(2002, 5, 10, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26557);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26558);result = test.plusWeeks(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26559);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testPlusDays_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqkhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqkhs(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26560);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26561);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26562);DateTime result = test.plusDays(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26563);DateTime expected = new DateTime(2002, 5, 4, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26564);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26565);result = test.plusDays(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26566);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testPlusHours_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s87b5ykhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s87b5ykhz(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26567);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26568);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26569);DateTime result = test.plusHours(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26570);DateTime expected = new DateTime(2002, 5, 3, 2, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26571);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26572);result = test.plusHours(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26573);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testPlusMinutes_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mjquki6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mjquki6(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26574);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26575);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26576);DateTime result = test.plusMinutes(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26577);DateTime expected = new DateTime(2002, 5, 3, 1, 3, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26578);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26579);result = test.plusMinutes(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26580);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testPlusSeconds_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx4lrekid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx4lrekid(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26581);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26582);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26583);DateTime result = test.plusSeconds(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26584);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 4, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26585);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26586);result = test.plusSeconds(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26587);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testPlusMillis_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blt447kik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blt447kik(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26588);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26589);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26590);DateTime result = test.plusMillis(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26591);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 5, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26592);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26593);result = test.plusMillis(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26594);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    public void testMinus_long() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gse7d0kir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gse7d0kir(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26595);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26596);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26597);DateTime result = test.minus(123456789L);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26598);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26599);assertEquals(expected, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testMinus_RD() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyrr3ukiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyrr3ukiw(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26600);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26601);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26602);DateTime result = test.minus(new Duration(123456789L));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26603);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26604);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26605);result = test.minus((ReadableDuration) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26606);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
    
    public void testMinus_RP() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmkj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmkj3(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26607);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26608);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26609);DateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26610);DateTime expected = new DateTime(2001, 3, 26, 0, 1, 2, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26611);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26612);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26613);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testMinusYears_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdinkja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdinkja(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26614);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26615);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26616);DateTime result = test.minusYears(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26617);DateTime expected = new DateTime(2001, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26618);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26619);result = test.minusYears(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26620);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testMinusMonths_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gokjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gokjh(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26621);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26622);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26623);DateTime result = test.minusMonths(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26624);DateTime expected = new DateTime(2002, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26625);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26626);result = test.minusMonths(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26627);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testMinusWeeks_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi4olkkjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi4olkkjo(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26628);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26629);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26630);DateTime result = test.minusWeeks(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26631);DateTime expected = new DateTime(2002, 4, 26, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26632);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26633);result = test.minusWeeks(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26634);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testMinusDays_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufckkjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufckkjv(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26635);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26636);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26637);DateTime result = test.minusDays(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26638);DateTime expected = new DateTime(2002, 5, 2, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26639);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26640);result = test.minusDays(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26641);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testMinusHours_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmid4kk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmid4kk2(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26642);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26643);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26644);DateTime result = test.minusHours(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26645);DateTime expected = new DateTime(2002, 5, 3, 0, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26646);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26647);result = test.minusHours(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26648);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testMinusMinutes_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zd8a0kk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zd8a0kk9(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26649);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26650);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26651);DateTime result = test.minusMinutes(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26652);DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26653);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26654);result = test.minusMinutes(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26655);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testMinusSeconds_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2q4qwkkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2q4qwkkg(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26656);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26657);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26658);DateTime result = test.minusSeconds(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26659);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 2, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26660);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26661);result = test.minusSeconds(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26662);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    public void testMinusMillis_int() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrwbadkkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrwbadkkn(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26663);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26664);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26665);DateTime result = test.minusMillis(1);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26666);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26667);assertEquals(expected, result);
        
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26668);result = test.minusMillis(0);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26669);assertSame(test, result);
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceStart(getClass().getName(),26670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoikku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyzjyzlc8azuj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyzjyzlc8azuj5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoikku(){try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26670);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26671);DateTime test = new DateTime();
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26672);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26673);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26674);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26675);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26676);DateTimeFieldType bad = new DateTimeFieldType("bad") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26677);
                __CLR4_4_1jyzjyzlc8azuj5.R.inc(26678);return DurationFieldType.weeks();
            }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26679);
                __CLR4_4_1jyzjyzlc8azuj5.R.inc(26680);return null;
            }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26681);
                __CLR4_4_1jyzjyzlc8azuj5.R.inc(26682);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}
        };
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26683);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26684);test.property(bad);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26685);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26686);try {
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26687);test.property(null);
            __CLR4_4_1jyzjyzlc8azuj5.R.inc(26688);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1jyzjyzlc8azuj5.R.inc(26689);
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26690);assertEquals(year, test.getYear());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26691);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26692);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26693);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26694);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26695);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1jyzjyzlc8azuj5.R.inc(26696);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1jyzjyzlc8azuj5.R.flushNeeded();}}

}
