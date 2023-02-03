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
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1o3yo3ylc8azv4h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,31942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);

//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private int MILLIS_OF_DAY_UTC =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);

    private long TEST_TIME_NOW_UTC =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY + MILLIS_OF_DAY_UTC;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31246);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31247);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31248);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31249);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1o3yo3ylc8azv4h.R.inc(31251);try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31250);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31252);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31253);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31254);zone = DateTimeZone.getDefault();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31255);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31256);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31257);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31258);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31259);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31260);DateTimeZone.setDefault(zone);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31261);zone = null;
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31262);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31263);systemDefaultLocale = null;
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet_DateTimeFieldType() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vo4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vo4g(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31264);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31265);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31266);assertEquals(1970, test.get(DateTimeFieldType.year()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31267);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31268);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31269);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31270);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31271);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31272);assertEquals(1970, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31273);assertEquals(10, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31274);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31275);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31276);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31277);assertEquals(MILLIS_OF_DAY_UTC / 60000 , test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31278);assertEquals(MILLIS_OF_DAY_UTC / 1000 , test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31279);assertEquals(MILLIS_OF_DAY_UTC , test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31280);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31281);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31282);test = new LocalDateTime(1970, 6, 9, 12, 30);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31283);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31284);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31285);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31286);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31287);test = new LocalDateTime(1970, 6, 9, 14, 30);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31288);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31289);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31290);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31291);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31292);test = new LocalDateTime(1970, 6, 9, 0, 30);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31293);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31294);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31295);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31296);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31297);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31298);test.get(null);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31299);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testSize() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122o5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122o5g(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31300);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31301);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31302);assertEquals(4, test.size());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testGetFieldType_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v547gno5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFieldType_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v547gno5j(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31303);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31304);LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31305);assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31306);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31307);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31308);assertSame(DateTimeFieldType.millisOfDay(), test.getFieldType(3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31309);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31310);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31311);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31312);test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testGetFieldTypes() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvuo5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvuo5t(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31313);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31314);LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31315);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31316);assertSame(DateTimeFieldType.year(), fields[0]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31317);assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31318);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31319);assertSame(DateTimeFieldType.millisOfDay(), fields[3]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31320);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testGetField_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esjyjxo61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetField_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esjyjxo61(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31321);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31322);LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31323);assertSame(COPTIC_UTC.year(), test.getField(0));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31324);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31325);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31326);assertSame(COPTIC_UTC.millisOfDay(), test.getField(3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31327);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31328);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31329);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31330);test.getField(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testGetFields() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeaso6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeaso6b(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31331);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31332);LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31333);DateTimeField[] fields = test.getFields();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31334);assertSame(COPTIC_UTC.year(), fields[0]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31335);assertSame(COPTIC_UTC.monthOfYear(), fields[1]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31336);assertSame(COPTIC_UTC.dayOfMonth(), fields[2]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31337);assertSame(COPTIC_UTC.millisOfDay(), fields[3]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31338);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testGetValue_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmp610o6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetValue_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmp610o6j(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31339);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31340);LocalDateTime test = new LocalDateTime(ISO_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31341);assertEquals(1970, test.getValue(0));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31342);assertEquals(6, test.getValue(1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31343);assertEquals(9, test.getValue(2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31344);assertEquals(MILLIS_OF_DAY_UTC, test.getValue(3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31345);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31346);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31347);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31348);test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testGetValues() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelo6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelo6t(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31349);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31350);LocalDateTime test = new LocalDateTime(ISO_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31351);int[] values = test.getValues();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31352);assertEquals(1970, values[0]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31353);assertEquals(6, values[1]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31354);assertEquals(9, values[2]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31355);assertEquals(MILLIS_OF_DAY_UTC, values[3]);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31356);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testIsSupported_DateTimeFieldType() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyuedvo71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyuedvo71(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31357);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31358);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31359);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31360);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31361);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31362);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31363);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31364);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31365);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31366);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31367);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31368);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31369);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31370);assertEquals(true, test.isSupported(DateTimeFieldType.era()));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31371);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31372);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31373);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31374);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31375);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31376);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31377);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31378);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31379);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31380);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31381);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay()));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31382);assertEquals(false, test.isSupported((DateTimeFieldType) null));
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testIsSupported_DurationFieldType() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3fm3eo7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DurationFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3fm3eo7r(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31383);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31384);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31385);assertEquals(false, test.isSupported(DurationFieldType.eras()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31386);assertEquals(true, test.isSupported(DurationFieldType.centuries()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31387);assertEquals(true, test.isSupported(DurationFieldType.years()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31388);assertEquals(true, test.isSupported(DurationFieldType.months()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31389);assertEquals(true, test.isSupported(DurationFieldType.weekyears()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31390);assertEquals(true, test.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31391);assertEquals(true, test.isSupported(DurationFieldType.days()));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31392);assertEquals(true, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31393);assertEquals(true, test.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31394);assertEquals(true, test.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31395);assertEquals(true, test.isSupported(DurationFieldType.millis()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31396);assertEquals(true, test.isSupported(DurationFieldType.halfdays()));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31397);assertEquals(false, test.isSupported((DurationFieldType) null));
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77o86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77o86(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31398);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31399);LocalDateTime test1 = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31400);LocalDateTime test2 = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31401);assertEquals(true, test1.equals(test2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31402);assertEquals(true, test2.equals(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31403);assertEquals(true, test1.equals(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31404);assertEquals(true, test2.equals(test2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31405);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31406);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31407);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31408);LocalDateTime test3 = new LocalDateTime(1971, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31409);assertEquals(false, test1.equals(test3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31410);assertEquals(false, test2.equals(test3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31411);assertEquals(false, test3.equals(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31412);assertEquals(false, test3.equals(test2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31413);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31414);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31415);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31416);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31417);Partial partial = new Partial(
                new DateTimeFieldType[] {
                        DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth(), DateTimeFieldType.millisOfDay()},
                new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC}, COPTIC_PARIS);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31418);assertEquals(true, test1.equals(partial));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31419);assertEquals(true, test1.hashCode() == partial.hashCode());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31420);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31421);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31422);return COPTIC_UTC;
        }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31423);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31424);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31425);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31426);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testCompareTo() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvo8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvo8z(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31427);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31428);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31429);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31430);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31431);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31432);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31433);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31434);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31435);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31436);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31437);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31438);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31439);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31440);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31441);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.millisOfDay(),
        };
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31442);int[] values = new int[] {2005, 6, 2, MILLIS_OF_DAY_UTC};
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31443);Partial p = new Partial(types, values);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31444);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31445);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31446);test1.compareTo(null);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31447);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31448);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31449);@SuppressWarnings("deprecation")
            YearMonthDay ymd = new YearMonthDay();
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31450);test1.compareTo(ymd);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31451);fail();
        } catch (ClassCastException ex) {}
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31452);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31453);@SuppressWarnings("deprecation")
            TimeOfDay tod = new TimeOfDay();
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31454);test1.compareTo(tod);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31455);fail();
        } catch (ClassCastException ex) {}
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31456);Partial partial = new Partial()
            .with(DateTimeFieldType.centuryOfEra(), 1)
            .with(DateTimeFieldType.halfdayOfDay(), 0)
            .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31457);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31458);new LocalDateTime(1970, 6, 9, 10, 20, 30, 40).compareTo(partial);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31459);fail();
        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsEqual_LocalDateTime() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwc8d6o9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsEqual_LocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwc8d6o9w(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31460);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31461);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31462);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31463);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31464);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31465);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31466);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31467);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31468);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31469);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31470);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31471);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31472);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31473);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31474);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31475);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isEqual(null);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31476);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_LocalDateTime() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ulqdload();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsBefore_LocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ulqdload(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31477);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31478);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31479);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31480);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31481);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31482);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31483);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31484);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31485);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31486);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31487);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31488);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31489);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31490);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31491);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31492);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isBefore(null);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31493);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_LocalDateTime() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12d0tdeoau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsAfter_LocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12d0tdeoau(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31494);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31495);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31496);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31497);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31498);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31499);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31500);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31501);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31502);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31503);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31504);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31505);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31506);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31507);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31508);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31509);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isAfter(null);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31510);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDate() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180tcctobb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180tcctobb(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31511);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31512);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31513);LocalDateTime result = test.withDate(2006, 2, 1);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31514);check(test, 2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31515);check(result, 2006, 2, 1, 10, 20, 30, 40);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithTime() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12m5wy4obg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12m5wy4obg(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31516);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31517);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31518);LocalDateTime result = test.withTime(9, 8, 7, 6);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31519);check(test, 2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31520);check(result, 2004, 6, 9, 9, 8, 7, 6);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField_DateTimeFieldType_int_1() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apbcyjobl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apbcyjobl(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31521);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31522);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31523);LocalDateTime result = test.withField(DateTimeFieldType.year(), 2006);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31524);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31525);assertEquals(new LocalDateTime(2006, 6, 9, 10, 20, 30, 40), result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testWithField_DateTimeFieldType_int_2() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gbe62obq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gbe62obq(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31526);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31527);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31528);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31529);test.withField(null, 6);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31530);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testWithField_DateTimeFieldType_int_3() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147bfdlobv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147bfdlobv(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31531);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31532);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31533);LocalDateTime result = test.withField(DateTimeFieldType.year(), 2004);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31534);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31535);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded_DurationFieldType_int_1() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4lfcoc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4lfcoc0(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31536);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31537);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31538);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 6);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31539);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31540);assertEquals(new LocalDateTime(2010, 6, 9, 10, 20, 30, 40), result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_2() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g4mmvoc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g4mmvoc5(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31541);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31542);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31543);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31544);test.withFieldAdded(null, 0);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31545);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_3() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1674nueoca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1674nueoca(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31546);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31547);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31548);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31549);test.withFieldAdded(null, 6);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31550);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_4() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12y4p1xocf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12y4p1xocf(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31551);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31552);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31553);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31554);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RP() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igocj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igocj(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31555);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31556);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31557);LocalDateTime result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31558);LocalDateTime expected = new LocalDateTime(2003, 7, 29, 15, 26, 37, 48, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31559);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31560);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31561);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testPlusYears_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kptocq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kptocq(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31562);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31563);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31564);LocalDateTime result = test.plusYears(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31565);LocalDateTime expected = new LocalDateTime(2003, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31566);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31567);result = test.plusYears(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31568);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testPlusMonths_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaiocx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaiocx(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31569);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31570);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31571);LocalDateTime result = test.plusMonths(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31572);LocalDateTime expected = new LocalDateTime(2002, 6, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31573);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31574);result = test.plusMonths(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31575);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testPlusWeeks_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eupheeod4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eupheeod4(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31576);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31577);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31578);LocalDateTime result = test.plusWeeks(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31579);LocalDateTime expected = new LocalDateTime(2002, 5, 10, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31580);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31581);result = test.plusWeeks(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31582);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testPlusDays_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqodb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqodb(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31583);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31584);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31585);LocalDateTime result = test.plusDays(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31586);LocalDateTime expected = new LocalDateTime(2002, 5, 4, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31587);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31588);result = test.plusDays(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31589);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testPlusHours_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s87b5yodi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s87b5yodi(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31590);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31591);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31592);LocalDateTime result = test.plusHours(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31593);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 11, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31594);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31595);result = test.plusHours(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31596);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testPlusMinutes_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mjquodp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mjquodp(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31597);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31598);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31599);LocalDateTime result = test.plusMinutes(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31600);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 21, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31601);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31602);result = test.plusMinutes(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31603);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testPlusSeconds_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx4lreodw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx4lreodw(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31604);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31605);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31606);LocalDateTime result = test.plusSeconds(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31607);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 31, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31608);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31609);result = test.plusSeconds(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31610);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testPlusMillis_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blt447oe3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blt447oe3(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31611);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31612);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31613);LocalDateTime result = test.plusMillis(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31614);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 41, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31615);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31616);result = test.plusMillis(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31617);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_RP() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmoea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmoea(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31618);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31619);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31620);LocalDateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31621);LocalDateTime expected = new LocalDateTime(2001, 3, 26, 9, 19, 29, 39, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31622);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31623);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31624);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testMinusYears_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdinoeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdinoeh(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31625);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31626);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31627);LocalDateTime result = test.minusYears(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31628);LocalDateTime expected = new LocalDateTime(2001, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31629);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31630);result = test.minusYears(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31631);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testMinusMonths_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gooeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gooeo(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31632);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31633);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31634);LocalDateTime result = test.minusMonths(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31635);LocalDateTime expected = new LocalDateTime(2002, 4, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31636);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31637);result = test.minusMonths(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31638);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testMinusWeeks_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi4olkoev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi4olkoev(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31639);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31640);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31641);LocalDateTime result = test.minusWeeks(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31642);LocalDateTime expected = new LocalDateTime(2002, 4, 26, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31643);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31644);result = test.minusWeeks(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31645);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testMinusDays_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufckof2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufckof2(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31646);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31647);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31648);LocalDateTime result = test.minusDays(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31649);LocalDateTime expected = new LocalDateTime(2002, 5, 2, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31650);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31651);result = test.minusDays(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31652);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testMinusHours_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmid4of9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmid4of9(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31653);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31654);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31655);LocalDateTime result = test.minusHours(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31656);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 9, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31657);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31658);result = test.minusHours(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31659);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testMinusMinutes_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zd8a0ofg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zd8a0ofg(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31660);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31661);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31662);LocalDateTime result = test.minusMinutes(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31663);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 19, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31664);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31665);result = test.minusMinutes(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31666);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testMinusSeconds_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2q4qwofn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2q4qwofn(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31667);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31668);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31669);LocalDateTime result = test.minusSeconds(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31670);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 29, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31671);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31672);result = test.minusSeconds(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31673);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testMinusMillis_int() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrwbadofu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrwbadofu(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31674);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31675);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31676);LocalDateTime result = test.minusMillis(1);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31677);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 39, BUDDHIST_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31678);assertEquals(expected, result);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31679);result = test.minusMillis(0);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31680);assertSame(test, result);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetters() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7og1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7og1(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31681);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31682);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31683);assertEquals(1970, test.getYear());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31684);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31685);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31686);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31687);assertEquals(2, test.getDayOfWeek());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31688);assertEquals(24, test.getWeekOfWeekyear());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31689);assertEquals(1970, test.getWeekyear());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31690);assertEquals(70, test.getYearOfCentury());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31691);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31692);assertEquals(1970, test.getYearOfEra());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31693);assertEquals(DateTimeConstants.AD, test.getEra());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31694);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31695);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31696);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31697);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31698);assertEquals(MILLIS_OF_DAY_UTC, test.getMillisOfDay());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithers() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzpogj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzpogj(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31699);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31700);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31701);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31702);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31703);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31704);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31705);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31706);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31707);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31708);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31709);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31710);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31711);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31712);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31713);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31714);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31715);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31716);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31717);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31718);test.withMonthOfYear(0);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31719);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31720);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31721);test.withMonthOfYear(13);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31722);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovoh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovoh7(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31723);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31724);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31725);DateTime test = base.toDateTime();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31726);check(base, 2005, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31727);DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31728);assertEquals(expected, test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_Zone() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnglp2ohd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnglp2ohd(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31729);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31730);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31731);DateTime test = base.toDateTime(TOKYO);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31732);check(base, 2005, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31733);DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_TOKYO);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31734);assertEquals(expected, test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDateTime_nullZone() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9ddf3ohj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9ddf3ohj(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31735);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31736);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31737);DateTime test = base.toDateTime((DateTimeZone) null);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31738);check(base, 2005, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31739);DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31740);assertEquals(expected, test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToLocalDate() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orirohp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orirohp(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31741);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31742);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31743);LocalDate expected = new LocalDate(2005, 6, 9, COPTIC_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31744);assertEquals(expected,base.toLocalDate());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToLocalTime() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn1c42oht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn1c42oht(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31745);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31746);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31747);LocalTime expected = new LocalTime(6, 7, 8, 9, COPTIC_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31748);assertEquals(expected,base.toLocalTime());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_RI() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdohx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdohx(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31749);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31750);LocalDateTime base = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31751);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7, BUDDHIST_TOKYO);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31752);DateTime test = base.toDateTime(dt);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31753);check(base, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31754);DateTime expected = new DateTime(2005, 6, 9, 10, 20, 30, 40, BUDDHIST_TOKYO);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31755);assertEquals(expected, test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDateTime_nullRI() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4oi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4oi4(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31756);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31757);LocalDateTime base = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31758);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31759);check(base, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31760);DateTime expected = new DateTime(2005, 6, 9, 10, 20, 30, 40, ISO_LONDON);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31761);assertEquals(expected, test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDate_summer() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs4c6eoia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_summer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs4c6eoia(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31762);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31763);LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31764);Date test = base.toDate();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31765);check(base, 2005, 7, 9, 10, 20, 30, 40);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31766);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31767);gcal.clear();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31768);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31769);gcal.set(Calendar.MONTH, Calendar.JULY);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31770);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31771);gcal.set(Calendar.HOUR_OF_DAY, 10);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31772);gcal.set(Calendar.MINUTE, 20);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31773);gcal.set(Calendar.SECOND, 30);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31774);gcal.set(Calendar.MILLISECOND, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31775);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDate_winter() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du955coio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_winter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du955coio(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31776);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31777);LocalDateTime base = new LocalDateTime(2005, 1, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31778);Date test = base.toDate();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31779);check(base, 2005, 1, 9, 10, 20, 30, 40);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31780);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31781);gcal.clear();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31782);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31783);gcal.set(Calendar.MONTH, Calendar.JANUARY);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31784);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31785);gcal.set(Calendar.HOUR_OF_DAY, 10);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31786);gcal.set(Calendar.MINUTE, 20);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31787);gcal.set(Calendar.SECOND, 30);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31788);gcal.set(Calendar.MILLISECOND, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31789);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDate_springDST() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrtngloj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrtngloj2(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31790);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31791);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31792);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31793);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31794);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31795);TimeZone.setDefault(testZone);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31796);Date test = base.toDate();
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31797);check(base, 2007, 4, 2, 0, 20, 0, 0);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31798);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31799);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDate_springDST_2Hour40Savings() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1168c4nojc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST_2Hour40Savings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1168c4nojc(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31800);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31801);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31802);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31803);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31804);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31805);TimeZone.setDefault(testZone);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31806);Date test = base.toDate();
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31807);check(base, 2007, 4, 2, 0, 20, 0, 0);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31808);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31809);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDate_autumnDST() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4c67mojm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4c67mojm(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31810);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31811);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31812);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31813);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31814);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31815);TimeZone.setDefault(testZone);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31816);Date test = base.toDate();
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31817);check(base, 2007, 10, 2, 0, 20, 30, 0);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31818);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31819);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDate_summer_Zone() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1itpggxojw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_summer_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1itpggxojw(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31820);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31821);LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31822);Date test = base.toDate(TimeZone.getDefault());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31823);check(base, 2005, 7, 9, 10, 20, 30, 40);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31824);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31825);gcal.clear();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31826);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31827);gcal.set(Calendar.MONTH, Calendar.JULY);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31828);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31829);gcal.set(Calendar.HOUR_OF_DAY, 10);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31830);gcal.set(Calendar.MINUTE, 20);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31831);gcal.set(Calendar.SECOND, 30);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31832);gcal.set(Calendar.MILLISECOND, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31833);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDate_winter_Zone() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffeuk7oka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_winter_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffeuk7oka(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31834);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31835);LocalDateTime base = new LocalDateTime(2005, 1, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31836);Date test = base.toDate(TimeZone.getDefault());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31837);check(base, 2005, 1, 9, 10, 20, 30, 40);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31838);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31839);gcal.clear();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31840);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31841);gcal.set(Calendar.MONTH, Calendar.JANUARY);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31842);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31843);gcal.set(Calendar.HOUR_OF_DAY, 10);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31844);gcal.set(Calendar.MINUTE, 20);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31845);gcal.set(Calendar.SECOND, 30);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31846);gcal.set(Calendar.MILLISECOND, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31847);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDate_springDST_Zone() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e553z2oko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e553z2oko(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31848);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31849);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31850);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31851);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31852);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31853);TimeZone.setDefault(testZone);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31854);Date test = base.toDate(TimeZone.getDefault());
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31855);check(base, 2007, 4, 2, 0, 20, 0, 0);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31856);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31857);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDate_springDST_2Hour40Savings_Zone() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cg7zwgoky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST_2Hour40Savings_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cg7zwgoky(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31858);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31859);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31860);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31861);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31862);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31863);TimeZone.setDefault(testZone);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31864);Date test = base.toDate(TimeZone.getDefault());
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31865);check(base, 2007, 4, 2, 0, 20, 0, 0);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31866);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31867);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    public void testToDate_autumnDST_Zone() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iio8xzol8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iio8xzol8(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31868);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31869);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31870);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31871);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31872);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31873);TimeZone.setDefault(testZone);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31874);Date test = base.toDate(TimeZone.getDefault());
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31875);check(base, 2007, 10, 2, 0, 20, 30, 0);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31876);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31877);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
    
    
    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoioli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoioli(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31878);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31879);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GJ_UTC);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31880);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31881);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31882);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31883);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31884);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31885);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31886);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31887);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31888);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31889);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31890);assertEquals(test.era(), test.property(DateTimeFieldType.era()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31891);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31892);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31893);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31894);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31895);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay()));
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31896);try {
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31897);test.property(null);
            __CLR4_4_1o3yo3ylc8azv4h.R.inc(31898);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31899);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalDateTime());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9om4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9om4() throws Exception{try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31900);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31901);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31902);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31903);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31904);oos.writeObject(test);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31905);byte[] bytes = baos.toByteArray();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31906);oos.close();
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31907);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31908);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31909);LocalDateTime result = (LocalDateTime) ois.readObject();
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31910);ois.close();
        
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31911);assertEquals(test, result);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31912);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31913);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31914);assertEquals(test.getChronology(), result.getChronology());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31915);assertTrue(result.isSupported(DateTimeFieldType.dayOfMonth()));  // check deserialization
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidomk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidomk(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31916);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31917);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31918);assertEquals("2002-06-09T10:20:30.040", test.toString());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xomn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xomn(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31919);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31920);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31921);assertEquals("2002 10", test.toString("yyyy HH"));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31922);assertEquals("2002-06-09T10:20:30.040", test.toString((String) null));
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String_Locale() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64uomr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64uomr(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31923);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31924);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31925);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31926);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31927);assertEquals("1970-06-09T10:20:30.040", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31928);assertEquals("Tue 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31929);assertEquals("1970-06-09T10:20:30.040", test.toString(null, null));
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_DTFormatter() {__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceStart(getClass().getName(),31930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsomy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o3yo3ylc8azv4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o3yo3ylc8azv4h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsomy(){try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31930);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31931);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31932);assertEquals("2002 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31933);assertEquals("2002-06-09T10:20:30.040", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1o3yo3ylc8azv4h.R.inc(31934);
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31935);assertEquals(year, test.getYear());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31936);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31937);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31938);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31939);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31940);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1o3yo3ylc8azv4h.R.inc(31941);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1o3yo3ylc8azv4h.R.flushNeeded();}}
}
