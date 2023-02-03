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
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Basics extends TestCase {static class __CLR4_4_1t4st4slc8azvqo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,38259,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37756);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37757);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37758);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37759);return new TestSuite(TestMutableDateTime_Basics.class);
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public TestMutableDateTime_Basics(String name) {
        super(name);__CLR4_4_1t4st4slc8azvqo.R.inc(37761);try{__CLR4_4_1t4st4slc8azvqo.R.inc(37760);
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37762);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37763);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37764);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37765);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37766);originalLocale = Locale.getDefault();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37767);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37768);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37769);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37770);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37771);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37772);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37773);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37774);Locale.setDefault(originalLocale);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37775);originalDateTimeZone = null;
        __CLR4_4_1t4st4slc8azvqo.R.inc(37776);originalTimeZone = null;
        __CLR4_4_1t4st4slc8azvqo.R.inc(37777);originalLocale = null;
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjt5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjt5e(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37778);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37779);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37780);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37781);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet_DateTimeField() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggkkrt5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testGet_DateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggkkrt5i(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37782);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37783);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37784);assertEquals(1, test.get(ISOChronology.getInstance().era()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37785);assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37786);assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37787);assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37788);assertEquals(2002, test.get(ISOChronology.getInstance().year()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37789);assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37790);assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37791);assertEquals(2002, test.get(ISOChronology.getInstance().weekyear()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37792);assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37793);assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37794);assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37795);assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37796);assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37797);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37798);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37799);assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37800);assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37801);assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37802);assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37803);assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37804);assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37805);assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37806);try {
            __CLR4_4_1t4st4slc8azvqo.R.inc(37807);test.get((DateTimeField) null);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37808);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testGet_DateTimeFieldType() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vt69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vt69(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37809);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37810);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37811);assertEquals(1, test.get(DateTimeFieldType.era()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37812);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37813);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37814);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37815);assertEquals(2002, test.get(DateTimeFieldType.year()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37816);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37817);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37818);assertEquals(2002, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37819);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37820);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37821);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37822);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37823);assertEquals(1, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37824);assertEquals(1, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37825);assertEquals(1, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37826);assertEquals(1, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37827);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37828);assertEquals(60, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37829);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37830);assertEquals(60 * 60, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37831);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37832);assertEquals(60 * 60 * 1000, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37833);try {
            __CLR4_4_1t4st4slc8azvqo.R.inc(37834);test.get((DateTimeFieldType) null);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37835);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testGetMethods() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzt70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzt70(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37836);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37837);MutableDateTime test = new MutableDateTime();
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37838);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37839);assertEquals(LONDON, test.getZone());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37840);assertEquals(TEST_TIME_NOW, test.getMillis());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37841);assertEquals(1, test.getEra());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37842);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37843);assertEquals(2, test.getYearOfCentury());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37844);assertEquals(2002, test.getYearOfEra());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37845);assertEquals(2002, test.getYear());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37846);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37847);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37848);assertEquals(2002, test.getWeekyear());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37849);assertEquals(23, test.getWeekOfWeekyear());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37850);assertEquals(7, test.getDayOfWeek());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37851);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37852);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37853);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37854);assertEquals(60, test.getMinuteOfDay());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37855);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37856);assertEquals(60 * 60, test.getSecondOfDay());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37857);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37858);assertEquals(60 * 60 * 1000, test.getMillisOfDay());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77t7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77t7n(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37859);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37860);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37861);MutableDateTime test2 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37862);assertEquals(true, test1.equals(test2));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37863);assertEquals(true, test2.equals(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37864);assertEquals(true, test1.equals(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37865);assertEquals(true, test2.equals(test2));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37866);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37867);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37868);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37869);MutableDateTime test3 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37870);assertEquals(false, test1.equals(test3));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37871);assertEquals(false, test2.equals(test3));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37872);assertEquals(false, test3.equals(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37873);assertEquals(false, test3.equals(test2));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37874);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37875);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37876);DateTime test4 = new DateTime(TEST_TIME2);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37877);assertEquals(true, test4.equals(test3));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37878);assertEquals(true, test3.equals(test4));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37879);assertEquals(false, test4.equals(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37880);assertEquals(false, test1.equals(test4));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37881);assertEquals(true, test3.hashCode() == test4.hashCode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37882);assertEquals(false, test1.hashCode() == test4.hashCode());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37883);MutableDateTime test5 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37884);test5.setRounding(ISOChronology.getInstance().millisOfSecond());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37885);assertEquals(true, test5.equals(test3));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37886);assertEquals(true, test5.equals(test4));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37887);assertEquals(true, test3.equals(test5));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37888);assertEquals(true, test4.equals(test5));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37889);assertEquals(true, test3.hashCode() == test5.hashCode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(37890);assertEquals(true, test4.hashCode() == test5.hashCode());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37891);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37892);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37893);assertEquals(false, test1.equals(new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance())));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37894);assertEquals(true, new MutableDateTime(TEST_TIME1, new MockEqualsChronology()).equals(new MutableDateTime(TEST_TIME1, new MockEqualsChronology())));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37895);assertEquals(false, new MutableDateTime(TEST_TIME1, new MockEqualsChronology()).equals(new MutableDateTime(TEST_TIME1, ISOChronology.getInstance())));
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37896);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37897);return null;
        }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37898);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37899);return TEST_TIME1;
        }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37900);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37901);return ISOChronology.getInstance();
        }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37902);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37903);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37904);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37905);return null;
        }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37906);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37907);return this;
        }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37908);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37909);return this;
        }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(37910);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37911);return "";
        }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
    }

    public void testCompareTo() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvt94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvt94(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37912);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37913);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37914);MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37915);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37916);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37917);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37918);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37919);MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37920);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37921);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37922);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37923);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37924);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37925);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37926);assertEquals(+1, test2.compareTo(new MockInstant()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37927);assertEquals(0, test1.compareTo(new MockInstant()));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37928);try {
            __CLR4_4_1t4st4slc8azvqo.R.inc(37929);test1.compareTo(null);
            __CLR4_4_1t4st4slc8azvqo.R.inc(37930);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
    
    public void testIsEqual() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9e1z3t9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testIsEqual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9e1z3t9n(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37931);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37932);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37933);MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37934);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37935);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37936);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37937);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37938);MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37939);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37940);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37941);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37942);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37943);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37944);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37945);assertEquals(false, test2.isEqual(new MockInstant()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37946);assertEquals(true, test1.isEqual(new MockInstant()));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37947);assertEquals(false, new MutableDateTime(TEST_TIME_NOW + 1).isEqual(null));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37948);assertEquals(true, new MutableDateTime(TEST_TIME_NOW).isEqual(null));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37949);assertEquals(false, new MutableDateTime(TEST_TIME_NOW - 1).isEqual(null));
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
    
    public void testIsBefore() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rmvj2ta6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testIsBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rmvj2ta6(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37950);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37951);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37952);MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37953);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37954);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37955);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37956);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37957);MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37958);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37959);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37960);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37961);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37962);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37963);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37964);assertEquals(false, test2.isBefore(new MockInstant()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37965);assertEquals(false, test1.isBefore(new MockInstant()));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37966);assertEquals(false, new MutableDateTime(TEST_TIME_NOW + 1).isBefore(null));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37967);assertEquals(false, new MutableDateTime(TEST_TIME_NOW).isBefore(null));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37968);assertEquals(true, new MutableDateTime(TEST_TIME_NOW - 1).isBefore(null));
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
    
    public void testIsAfter() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax1icntap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testIsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax1icntap(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(37969);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37970);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37971);MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37972);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37973);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37974);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37975);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37976);MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37977);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37978);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37979);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37980);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37981);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37982);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37983);assertEquals(true, test2.isAfter(new MockInstant()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37984);assertEquals(false, test1.isAfter(new MockInstant()));
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37985);assertEquals(true, new MutableDateTime(TEST_TIME_NOW + 1).isAfter(null));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37986);assertEquals(false, new MutableDateTime(TEST_TIME_NOW).isAfter(null));
        __CLR4_4_1t4st4slc8azvqo.R.inc(37987);assertEquals(false, new MutableDateTime(TEST_TIME_NOW - 1).isAfter(null));
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),37988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9tb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9tb8() throws Exception{try{__CLR4_4_1t4st4slc8azvqo.R.inc(37988);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37989);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37990);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37991);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37992);oos.writeObject(test);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37993);byte[] bytes = baos.toByteArray();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37994);oos.close();
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37995);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37996);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1t4st4slc8azvqo.R.inc(37997);MutableDateTime result = (MutableDateTime) ois.readObject();
        __CLR4_4_1t4st4slc8azvqo.R.inc(37998);ois.close();
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(37999);assertEquals(test, result);
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidtbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidtbk(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38000);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38001);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38002);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38003);test = new MutableDateTime(TEST_TIME_NOW, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38004);assertEquals("2002-06-09T02:00:00.000+02:00", test.toString());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToString_String() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xtbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xtbp(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38005);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38006);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38007);assertEquals("2002 01", test.toString("yyyy HH"));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38008);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((String) null));
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToString_String_String() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne197tbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne197tbt(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38009);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38010);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38011);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38012);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38013);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38014);assertEquals("Sun 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38015);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null));
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToString_DTFormatter() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpstc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpstc0(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38016);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38017);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38018);assertEquals("2002 01", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38019);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInstant() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yip9h7tc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yip9h7tc4(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38020);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38021);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38022);Instant result = test.toInstant();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38023);assertEquals(TEST_TIME1, result.getMillis());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToDateTime() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovtc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovtc8(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38024);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38025);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38026);DateTime result = test.toDateTime();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38027);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38028);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToDateTimeISO() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udmnxgtcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udmnxgtcd(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38029);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38030);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38031);DateTime result = test.toDateTimeISO();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38032);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38033);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38034);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38035);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToDateTime_DateTimeZone() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hynettck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hynettck(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38036);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38037);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38038);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38039);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38040);assertEquals(test.getChronology(), result.getChronology());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38041);assertEquals(LONDON, result.getZone());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38042);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38043);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38044);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38045);assertEquals(PARIS, result.getZone());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38046);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38047);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38048);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38049);assertEquals(GregorianChronology.getInstance(LONDON), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38050);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38051);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38052);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38053);assertEquals(LONDON, result.getZone());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38054);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38055);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38056);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38057);assertEquals(LONDON, result.getZone());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38058);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToDateTime_Chronology() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqjjetd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqjjetd7(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38059);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38060);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38061);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38062);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38063);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38064);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38065);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38066);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38067);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38068);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38069);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38070);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38071);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38072);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38073);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38074);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38075);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToMutableDateTime() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c071a3tdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c071a3tdo(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38076);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38077);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38078);MutableDateTime result = test.toMutableDateTime();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38079);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38080);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38081);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToMutableDateTimeISO() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7exd4tdu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToMutableDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7exd4tdu(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38082);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38083);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38084);MutableDateTime result = test.toMutableDateTimeISO();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38085);assertSame(MutableDateTime.class, result.getClass());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38086);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38087);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38088);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38089);assertNotSame(test, result);
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToMutableDateTime_DateTimeZone() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0i321te2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToMutableDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0i321te2(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38090);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38091);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38092);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38093);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38094);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38095);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38096);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38097);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38098);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38099);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38100);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38101);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38102);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38103);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38104);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38105);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38106);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38107);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38108);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38109);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38110);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToMutableDateTime_Chronology() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6xe2ten();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToMutableDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6xe2ten(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38111);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38112);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38113);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38114);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38115);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38116);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38117);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38118);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38119);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38120);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38121);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38122);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38123);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38124);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38125);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38126);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38127);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38128);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38129);assertTrue(test != result);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38130);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38131);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToDate() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdkgytf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdkgytf8(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38132);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38133);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38134);Date result = test.toDate();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38135);assertEquals(test.getMillis(), result.getTime());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToCalendar_Locale() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ez8ojvtfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToCalendar_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ez8ojvtfc(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38136);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38137);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38138);Calendar result = test.toCalendar(null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38139);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38140);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38141);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38142);result = test.toCalendar(null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38143);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38144);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38145);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38146);result = test.toCalendar(Locale.UK);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38147);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38148);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testToGregorianCalendar() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zoxa6tfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToGregorianCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zoxa6tfp(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38149);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38150);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38151);GregorianCalendar result = test.toGregorianCalendar();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38152);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38153);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1t4st4slc8azvqo.R.inc(38154);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38155);result = test.toGregorianCalendar();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38156);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38157);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testClone() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyejytfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyejytfy(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38158);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38159);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38160);MutableDateTime result = (MutableDateTime) test.clone();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38161);assertEquals(true, test.equals(result));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38162);assertEquals(true, test != result);
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testCopy() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6atg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6atg3(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38163);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38164);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38165);MutableDateTime result = test.copy();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38166);assertEquals(true, test.equals(result));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38167);assertEquals(true, test != result);
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testRounding1() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oukln6tg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oukln6tg8(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38168);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38169);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38170);test.setRounding(ISOChronology.getInstance().hourOfDay());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38171);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38172);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38173);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testRounding2() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s3kkfntge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s3kkfntge(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38174);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38175);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38176);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38177);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38178);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38179);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testRounding3() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vckj84tgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vckj84tgk(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38180);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38181);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38182);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38183);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38184);assertEquals(MutableDateTime.ROUND_HALF_CEILING, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38185);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38186);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38187);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38188);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testRounding4() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylki0ltgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylki0ltgt(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38189);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38190);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38191);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38192);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38193);assertEquals(MutableDateTime.ROUND_HALF_FLOOR, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38194);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38195);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38196);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38197);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testRounding5() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6jl62th2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6jl62th2(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38198);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38199);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38200);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38201);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38202);assertEquals(MutableDateTime.ROUND_HALF_EVEN, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38203);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38204);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38205);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38206);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38207);test = new MutableDateTime(2002, 6, 9, 4, 30, 0, 0);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38208);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38209);assertEquals("2002-06-09T04:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testRounding6() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txjmdlthe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txjmdlthe(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38210);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38211);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38212);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38213);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38214);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38215);assertEquals(null, test.getRoundingField());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testRounding7() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qojnl4thk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qojnl4thk(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38216);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38217);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38218);try {
            __CLR4_4_1t4st4slc8azvqo.R.inc(38219);test.setRounding(ISOChronology.getInstance().hourOfDay(), -1);
            __CLR4_4_1t4st4slc8azvqo.R.inc(38220);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    public void testRounding8() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfjosnthp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfjosnthp(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38221);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38222);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38223);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38224);assertEquals(null, test.getRoundingField());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38225);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38226);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38227);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38228);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38229);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38230);assertEquals(null, test.getRoundingField());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38231);test.setRounding(null, -1);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38232);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38233);assertEquals(null, test.getRoundingField());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38234);test.setRounding(ISOChronology.getInstance().hourOfDay());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38235);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38236);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        __CLR4_4_1t4st4slc8azvqo.R.inc(38237);test.setRounding(null);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38238);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1t4st4slc8azvqo.R.inc(38239);assertEquals(null, test.getRoundingField());
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1t4st4slc8azvqo.R.globalSliceStart(getClass().getName(),38240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoiti8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4st4slc8azvqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4st4slc8azvqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoiti8(){try{__CLR4_4_1t4st4slc8azvqo.R.inc(38240);
        __CLR4_4_1t4st4slc8azvqo.R.inc(38241);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1t4st4slc8azvqo.R.inc(38242);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38243);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38244);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38245);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1t4st4slc8azvqo.R.inc(38246);DateTimeFieldType bad = new DateTimeFieldType("bad") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(38247);
                __CLR4_4_1t4st4slc8azvqo.R.inc(38248);return DurationFieldType.weeks();
            }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1t4st4slc8azvqo.R.inc(38249);
                __CLR4_4_1t4st4slc8azvqo.R.inc(38250);return null;
            }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1t4st4slc8azvqo.R.inc(38251);
                __CLR4_4_1t4st4slc8azvqo.R.inc(38252);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}
        };
        __CLR4_4_1t4st4slc8azvqo.R.inc(38253);try {
            __CLR4_4_1t4st4slc8azvqo.R.inc(38254);test.property(bad);
            __CLR4_4_1t4st4slc8azvqo.R.inc(38255);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1t4st4slc8azvqo.R.inc(38256);try {
            __CLR4_4_1t4st4slc8azvqo.R.inc(38257);test.property(null);
            __CLR4_4_1t4st4slc8azvqo.R.inc(38258);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1t4st4slc8azvqo.R.flushNeeded();}}

}
