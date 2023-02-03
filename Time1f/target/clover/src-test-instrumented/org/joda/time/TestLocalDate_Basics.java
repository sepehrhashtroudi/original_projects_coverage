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
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1pnapnalc8azvdb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,33944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
//    private static final int OFFSET = 1;
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
//    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
//    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1pnapnalc8azvdb.R.inc(33238);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33239);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pnapnalc8azvdb.R.inc(33240);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33241);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1pnapnalc8azvdb.R.inc(33243);try{__CLR4_4_1pnapnalc8azvdb.R.inc(33242);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pnapnalc8azvdb.R.inc(33244);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33245);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33246);zone = DateTimeZone.getDefault();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33247);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33248);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33249);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pnapnalc8azvdb.R.inc(33250);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33251);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33252);DateTimeZone.setDefault(zone);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33253);zone = null;
        __CLR4_4_1pnapnalc8azvdb.R.inc(33254);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33255);systemDefaultLocale = null;
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    
    public void testGet_DateTimeFieldType() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vpns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vpns(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33256);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33257);LocalDate test = new LocalDate();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33258);assertEquals(1970, test.get(DateTimeFieldType.year()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33259);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33260);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33261);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33262);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33263);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33264);assertEquals(1970, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33265);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33266);test.get(null);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33267);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1pnapnalc8azvdb.R.inc(33268);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33269);test.get(DateTimeFieldType.hourOfDay());
            __CLR4_4_1pnapnalc8azvdb.R.inc(33270);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testSize() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122po7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122po7(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33271);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33272);LocalDate test = new LocalDate();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33273);assertEquals(3, test.size());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testGetFieldType_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v547gnpoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldType_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v547gnpoa(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33274);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33275);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33276);assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33277);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33278);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33279);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33280);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1pnapnalc8azvdb.R.inc(33281);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33282);test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testGetFieldTypes() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvupoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvupoj(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33283);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33284);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33285);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33286);assertSame(DateTimeFieldType.year(), fields[0]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33287);assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33288);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33289);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testGetField_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esjyjxpoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetField_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esjyjxpoq(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33290);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33291);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33292);assertSame(COPTIC_UTC.year(), test.getField(0));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33293);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33294);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33295);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33296);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1pnapnalc8azvdb.R.inc(33297);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33298);test.getField(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testGetFields() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeaspoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeaspoz(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33299);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33300);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33301);DateTimeField[] fields = test.getFields();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33302);assertSame(COPTIC_UTC.year(), fields[0]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33303);assertSame(COPTIC_UTC.monthOfYear(), fields[1]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33304);assertSame(COPTIC_UTC.dayOfMonth(), fields[2]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33305);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testGetValue_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmp610pp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValue_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmp610pp6(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33306);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33307);LocalDate test = new LocalDate();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33308);assertEquals(1970, test.getValue(0));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33309);assertEquals(6, test.getValue(1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33310);assertEquals(9, test.getValue(2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33311);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33312);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1pnapnalc8azvdb.R.inc(33313);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33314);test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testGetValues() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelppf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelppf(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33315);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33316);LocalDate test = new LocalDate();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33317);int[] values = test.getValues();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33318);assertEquals(1970, values[0]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33319);assertEquals(6, values[1]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33320);assertEquals(9, values[2]);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33321);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testIsSupported_DateTimeFieldType() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyuedvppm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyuedvppm(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33322);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33323);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33324);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33325);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33326);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33327);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33328);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33329);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33330);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33331);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33332);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33333);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33334);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33335);assertEquals(true, test.isSupported(DateTimeFieldType.era()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33336);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33337);assertEquals(false, test.isSupported((DateTimeFieldType) null));
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testIsSupported_DurationFieldType() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3fm3epq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3fm3epq2(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33338);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33339);LocalDate test = new LocalDate(1970, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33340);assertEquals(false, test.isSupported(DurationFieldType.eras()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33341);assertEquals(true, test.isSupported(DurationFieldType.centuries()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33342);assertEquals(true, test.isSupported(DurationFieldType.years()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33343);assertEquals(true, test.isSupported(DurationFieldType.months()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33344);assertEquals(true, test.isSupported(DurationFieldType.weekyears()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33345);assertEquals(true, test.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33346);assertEquals(true, test.isSupported(DurationFieldType.days()));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33347);assertEquals(false, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33348);assertEquals(false, test.isSupported((DurationFieldType) null));
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testEqualsHashCode() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77pqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77pqd(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33349);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33350);LocalDate test1 = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33351);LocalDate test2 = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33352);assertEquals(true, test1.equals(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33353);assertEquals(true, test2.equals(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33354);assertEquals(true, test1.equals(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33355);assertEquals(true, test2.equals(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33356);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33357);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33358);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33359);LocalDate test3 = new LocalDate(1971, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33360);assertEquals(false, test1.equals(test3));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33361);assertEquals(false, test2.equals(test3));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33362);assertEquals(false, test3.equals(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33363);assertEquals(false, test3.equals(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33364);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33365);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33366);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33367);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33368);assertEquals(true, test1.equals(new YearMonthDay(1970, 6, 9, COPTIC_PARIS)));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33369);assertEquals(true, test1.hashCode() == new YearMonthDay(1970, 6, 9, COPTIC_PARIS).hashCode());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33370);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1pnapnalc8azvdb.R.inc(33371);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33372);return COPTIC_UTC;
        }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1pnapnalc8azvdb.R.inc(33373);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33374);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1pnapnalc8azvdb.R.inc(33375);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33376);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}
    }

    public void testEqualsHashCodeLenient() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zr7n2pr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zr7n2pr5(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33377);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33378);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33379);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33380);assertEquals(true, test1.equals(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33381);assertEquals(true, test2.equals(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33382);assertEquals(true, test1.equals(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33383);assertEquals(true, test2.equals(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33384);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33385);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33386);assertEquals(true, test2.hashCode() == test2.hashCode());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testEqualsHashCodeStrict() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b60798prf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b60798prf(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33387);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33388);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33389);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33390);assertEquals(true, test1.equals(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33391);assertEquals(true, test2.equals(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33392);assertEquals(true, test1.equals(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33393);assertEquals(true, test2.equals(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33394);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33395);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33396);assertEquals(true, test2.hashCode() == test2.hashCode());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testEqualsHashCodeAPI() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdct05prp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeAPI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdct05prp(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33397);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33398);LocalDate test = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33399);int expected = 157;
        __CLR4_4_1pnapnalc8azvdb.R.inc(33400);expected = 23 * expected + 1970;
        __CLR4_4_1pnapnalc8azvdb.R.inc(33401);expected = 23 * expected + COPTIC_UTC.year().getType().hashCode();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33402);expected = 23 * expected + 6;
        __CLR4_4_1pnapnalc8azvdb.R.inc(33403);expected = 23 * expected + COPTIC_UTC.monthOfYear().getType().hashCode();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33404);expected = 23 * expected + 9;
        __CLR4_4_1pnapnalc8azvdb.R.inc(33405);expected = 23 * expected + COPTIC_UTC.dayOfMonth().getType().hashCode();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33406);expected += COPTIC_UTC.hashCode();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33407);assertEquals(expected, test.hashCode());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testCompareTo() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvps0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvps0(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33408);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33409);LocalDate test1 = new LocalDate(2005, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33410);LocalDate test1a = new LocalDate(2005, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33411);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33412);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33413);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33414);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33415);LocalDate test2 = new LocalDate(2005, 7, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33416);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33417);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33418);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33419);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33420);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33421);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33422);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_1pnapnalc8azvdb.R.inc(33423);int[] values = new int[] {2005, 6, 2};
        __CLR4_4_1pnapnalc8azvdb.R.inc(33424);Partial p = new Partial(types, values);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33425);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33426);assertEquals(0, test1.compareTo(new YearMonthDay(2005, 6, 2)));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33427);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33428);test1.compareTo(null);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33429);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_1pnapnalc8azvdb.R.inc(33430);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33431);test1.compareTo(new TimeOfDay());
            __CLR4_4_1pnapnalc8azvdb.R.inc(33432);fail();
        } catch (ClassCastException ex) {}
        __CLR4_4_1pnapnalc8azvdb.R.inc(33433);Partial partial = new Partial()
            .with(DateTimeFieldType.centuryOfEra(), 1)
            .with(DateTimeFieldType.halfdayOfDay(), 0)
            .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33434);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33435);new LocalDate(1970, 6, 9).compareTo(partial);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33436);fail();
        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsEqual_LocalDate() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wj0wpzpst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsEqual_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wj0wpzpst(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33437);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33438);LocalDate test1 = new LocalDate(2005, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33439);LocalDate test1a = new LocalDate(2005, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33440);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33441);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33442);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33443);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33444);LocalDate test2 = new LocalDate(2005, 7, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33445);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33446);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33447);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33448);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33449);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33450);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33451);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33452);new LocalDate(2005, 7, 2).isEqual(null);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33453);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_LocalDate() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197zwn8pta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsBefore_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197zwn8pta(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33454);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33455);LocalDate test1 = new LocalDate(2005, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33456);LocalDate test1a = new LocalDate(2005, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33457);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33458);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33459);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33460);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33461);LocalDate test2 = new LocalDate(2005, 7, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33462);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33463);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33464);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33465);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33466);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33467);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33468);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33469);new LocalDate(2005, 7, 2).isBefore(null);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33470);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_LocalDate() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq5e67ptr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsAfter_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq5e67ptr(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33471);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33472);LocalDate test1 = new LocalDate(2005, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33473);LocalDate test1a = new LocalDate(2005, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33474);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33475);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33476);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33477);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33478);LocalDate test2 = new LocalDate(2005, 7, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33479);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33480);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33481);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33482);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33483);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33484);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33485);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33486);new LocalDate(2005, 7, 2).isAfter(null);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33487);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField_DateTimeFieldType_int_1() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apbcyjpu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apbcyjpu8(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33488);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33489);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33490);LocalDate result = test.withField(DateTimeFieldType.year(), 2006);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33491);assertEquals(new LocalDate(2004, 6, 9), test);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33492);assertEquals(new LocalDate(2006, 6, 9), result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testWithField_DateTimeFieldType_int_2() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gbe62pud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gbe62pud(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33493);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33494);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33495);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33496);test.withField(null, 6);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33497);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testWithField_DateTimeFieldType_int_3() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147bfdlpui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147bfdlpui(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33498);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33499);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33500);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33501);test.withField(DateTimeFieldType.hourOfDay(), 6);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33502);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testWithField_DateTimeFieldType_int_4() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybgl4pun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybgl4pun(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33503);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33504);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33505);LocalDate result = test.withField(DateTimeFieldType.year(), 2004);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33506);assertEquals(new LocalDate(2004, 6, 9), test);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33507);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded_DurationFieldType_int_1() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4lfcpus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4lfcpus(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33508);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33509);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33510);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33511);assertEquals(new LocalDate(2004, 6, 9), test);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33512);assertEquals(new LocalDate(2010, 6, 9), result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_2() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g4mmvpux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g4mmvpux(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33513);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33514);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33515);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33516);test.withFieldAdded(null, 0);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33517);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_3() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1674nuepv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1674nuepv2(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33518);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33519);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33520);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33521);test.withFieldAdded(null, 6);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33522);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_4() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12y4p1xpv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12y4p1xpv7(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33523);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33524);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33525);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33526);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_5() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av9qkpvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av9qkpvb(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33527);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33528);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33529);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33530);test.withFieldAdded(DurationFieldType.hours(), 6);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33531);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RP() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igpvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igpvg(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33532);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33533);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33534);LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33535);LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33536);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33537);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33538);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testPlusYears_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kptpvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kptpvn(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33539);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33540);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33541);LocalDate result = test.plusYears(1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33542);LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33543);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33544);result = test.plusYears(0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33545);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testPlusMonths_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaipvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaipvu(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33546);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33547);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33548);LocalDate result = test.plusMonths(1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33549);LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33550);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33551);result = test.plusMonths(0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33552);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testPlusWeeks_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eupheepw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eupheepw1(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33553);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33554);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33555);LocalDate result = test.plusWeeks(1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33556);LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33557);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33558);result = test.plusWeeks(0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33559);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testPlusDays_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqpw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqpw8(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33560);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33561);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33562);LocalDate result = test.plusDays(1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33563);LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33564);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33565);result = test.plusDays(0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33566);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_RP() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmpwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmpwf(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33567);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33568);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33569);LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        
        // TODO breaks because it subtracts millis now, and thus goes
        // into the previous day
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33570);LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33571);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33572);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33573);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testMinusYears_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdinpwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdinpwm(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33574);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33575);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33576);LocalDate result = test.minusYears(1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33577);LocalDate expected = new LocalDate(2001, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33578);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33579);result = test.minusYears(0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33580);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testMinusMonths_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gopwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gopwt(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33581);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33582);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33583);LocalDate result = test.minusMonths(1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33584);LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33585);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33586);result = test.minusMonths(0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33587);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testMinusWeeks_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi4olkpx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi4olkpx0(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33588);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33589);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33590);LocalDate result = test.minusWeeks(1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33591);LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33592);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33593);result = test.minusWeeks(0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33594);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testMinusDays_int() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufckpx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufckpx7(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33595);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33596);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33597);LocalDate result = test.minusDays(1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33598);LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33599);assertEquals(expected, result);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33600);result = test.minusDays(0);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33601);assertSame(test, result);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetters() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7pxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7pxe(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33602);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33603);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33604);assertEquals(1970, test.getYear());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33605);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33606);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33607);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33608);assertEquals(2, test.getDayOfWeek());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33609);assertEquals(24, test.getWeekOfWeekyear());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33610);assertEquals(1970, test.getWeekyear());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33611);assertEquals(70, test.getYearOfCentury());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33612);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33613);assertEquals(1970, test.getYearOfEra());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33614);assertEquals(DateTimeConstants.AD, test.getEra());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithers() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzppxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzppxr(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33615);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33616);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33617);check(test.withYear(2000), 2000, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33618);check(test.withMonthOfYear(2), 1970, 2, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33619);check(test.withDayOfMonth(2), 1970, 6, 2);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33620);check(test.withDayOfYear(6), 1970, 1, 6);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33621);check(test.withDayOfWeek(6), 1970, 6, 13);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33622);check(test.withWeekOfWeekyear(6), 1970, 2, 3);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33623);check(test.withWeekyear(1971), 1971, 6, 15);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33624);check(test.withYearOfCentury(60), 1960, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33625);check(test.withCenturyOfEra(21), 2070, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33626);check(test.withYearOfEra(1066), 1066, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33627);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33628);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33629);test.withMonthOfYear(0);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33630);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1pnapnalc8azvdb.R.inc(33631);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33632);test.withMonthOfYear(13);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33633);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeAtStartOfDay() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wquoitpya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wquoitpya(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33634);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33635);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33636);DateTime test = base.toDateTimeAtStartOfDay();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33637);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33638);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTimeAtStartOfDay_avoidDST() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14j43pkpyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_avoidDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14j43pkpyf(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33639);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33640);LocalDate base = new LocalDate(2007, 4, 1);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33641);DateTimeZone.setDefault(MOCK_GAZA);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33642);DateTime test = base.toDateTimeAtStartOfDay();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33643);check(base, 2007, 4, 1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33644);assertEquals(new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_GAZA), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeAtStartOfDay_Zone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pjz78pyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pjz78pyl(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33645);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33646);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33647);DateTime test = base.toDateTimeAtStartOfDay(TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33648);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33649);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTimeAtStartOfDay_Zone_avoidDST() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b24unrpyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_Zone_avoidDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b24unrpyq(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33650);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33651);LocalDate base = new LocalDate(2007, 4, 1);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33652);DateTime test = base.toDateTimeAtStartOfDay(MOCK_GAZA);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33653);check(base, 2007, 4, 1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33654);assertEquals(new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_GAZA), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTimeAtStartOfDay_nullZone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g20wpnpyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g20wpnpyv(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33655);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33656);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33657);DateTime test = base.toDateTimeAtStartOfDay((DateTimeZone) null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33658);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33659);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testToDateTimeAtMidnight() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kwl0upz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kwl0upz0(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33660);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33661);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33662);DateTime test = base.toDateTimeAtMidnight();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33663);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33664);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testToDateTimeAtMidnight_Zone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1baa121pz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1baa121pz5(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33665);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33666);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33667);DateTime test = base.toDateTimeAtMidnight(TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33668);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33669);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testToDateTimeAtMidnight_nullZone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkup1qpza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkup1qpza(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33670);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33671);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33672);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33673);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33674);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeAtCurrentTime() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxkflapzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxkflapzf(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33675);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33676);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33677);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33678);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33679);DateTime test = base.toDateTimeAtCurrentTime();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33680);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33681);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33682);expected = expected.year().setCopy(2005);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33683);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33684);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33685);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeAtCurrentTime_Zone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pbzvx5pzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pbzvx5pzq(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33686);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33687);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33688);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33689);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33690);DateTime test = base.toDateTimeAtCurrentTime(TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33691);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33692);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33693);expected = expected.year().setCopy(2005);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33694);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33695);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33696);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTimeAtCurrentTime_nullZone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sccwr2q01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sccwr2q01(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33697);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33698);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33699);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33700);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33701);DateTime test = base.toDateTimeAtCurrentTime((DateTimeZone) null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33702);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33703);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33704);expected = expected.year().setCopy(2005);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33705);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33706);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33707);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToLocalDateTime_LocalTime() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133rb0nq0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133rb0nq0c(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33708);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33709);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33710);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33711);LocalDateTime test = base.toLocalDateTime(tod);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33712);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33713);LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_UTC);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33714);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToLocalDateTime_nullLocalTime() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6656aq0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_nullLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6656aq0j(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33715);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33716);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33717);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33718);base.toLocalDateTime((LocalTime) null);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33719);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToLocalDateTime_wrongChronologyLocalTime() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cokra8q0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_wrongChronologyLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cokra8q0o(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33720);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33721);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33722);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); // PARIS irrelevant
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33723);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33724);base.toLocalDateTime(tod);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33725);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_LocalTime() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmsit4q0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmsit4q0u(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33726);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33727);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33728);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33729);DateTime test = base.toDateTime(tod);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33730);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33731);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33732);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTime_nullLocalTime() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ld55z3q11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ld55z3q11(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33733);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33734);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33735);long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_LONDON).getMillis();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33736);DateTimeUtils.setCurrentMillisFixed(now);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33737);DateTime test = base.toDateTime((LocalTime) null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33738);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33739);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33740);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_LocalTime_Zone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwng1q19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwng1q19(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33741);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33742);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33743);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33744);DateTime test = base.toDateTime(tod, TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33745);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33746);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33747);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTime_LocalTime_nullZone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130hbkoq1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130hbkoq1g(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33748);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33749);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33750);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33751);DateTime test = base.toDateTime(tod, null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33752);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33753);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33754);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTime_nullLocalTime_Zone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xs4m08q1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullLocalTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xs4m08q1n(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33755);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33756);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33757);long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_TOKYO).getMillis();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33758);DateTimeUtils.setCurrentMillisFixed(now);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33759);DateTime test = base.toDateTime((LocalTime) null, TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33760);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33761);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33762);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTime_wrongChronoLocalTime_Zone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xurivnq1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_wrongChronoLocalTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xurivnq1v(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33763);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33764);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33765);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_TOKYO);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33766);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33767);base.toDateTime(tod, LONDON);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33768);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testToDateMidnight() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osch5eq21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osch5eq21(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33769);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33770);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33771);DateMidnight test = base.toDateMidnight();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33772);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33773);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testToDateMidnight_Zone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11f3vmvq26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11f3vmvq26(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33774);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33775);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33776);DateMidnight test = base.toDateMidnight(TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33777);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33778);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_TOKYO), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testToDateMidnight_nullZone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15031fyq2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15031fyq2b(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33779);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33780);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33781);DateMidnight test = base.toDateMidnight((DateTimeZone) null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33782);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33783);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_RI() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdq2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdq2g(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33784);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33785);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33786);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33787);DateTime test = base.toDateTime(dt);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33788);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33789);DateTime expected = dt;
        __CLR4_4_1pnapnalc8azvdb.R.inc(33790);expected = expected.year().setCopy(2005);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33791);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33792);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33793);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDateTime_nullRI() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4q2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4q2q(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33794);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33795);LocalDate base = new LocalDate(2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33796);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33797);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33798);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33799);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33800);DateTime expected = dt;
        __CLR4_4_1pnapnalc8azvdb.R.inc(33801);expected = expected.year().setCopy(2005);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33802);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33803);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33804);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInterval() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj50gpq31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj50gpq31(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33805);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33806);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33807);Interval test = base.toInterval();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33808);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33809);DateTime start = base.toDateTimeAtStartOfDay();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33810);DateTime end = start.plus(Period.days(1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33811);Interval expected = new Interval(start, end);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33812);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInterval_Zone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpa0zkq39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpa0zkq39(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33813);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33814);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33815);Interval test = base.toInterval(TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33816);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33817);DateTime start = base.toDateTimeAtStartOfDay(TOKYO);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33818);DateTime end = start.plus(Period.days(1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33819);Interval expected = new Interval(start, end);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33820);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToInterval_Zone_noMidnight() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7wbiaq3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_Zone_noMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7wbiaq3h(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33821);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33822);LocalDate base = new LocalDate(2006, 4, 1, ISO_LONDON);  // LONDON irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33823);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza");
        __CLR4_4_1pnapnalc8azvdb.R.inc(33824);Interval test = base.toInterval(gaza);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33825);check(base, 2006, 4, 1);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33826);DateTime start = new DateTime(2006, 4, 1, 1, 0, 0, 0, gaza);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33827);DateTime end = new DateTime(2006, 4, 2, 0, 0, 0, 0, gaza);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33828);Interval expected = new Interval(start, end);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33829);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToInterval_nullZone() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hp1i1q3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hp1i1q3q(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33830);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33831);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1pnapnalc8azvdb.R.inc(33832);Interval test = base.toInterval(null);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33833);check(base, 2005, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33834);DateTime start = base.toDateTimeAtStartOfDay(LONDON);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33835);DateTime end = start.plus(Period.days(1));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33836);Interval expected = new Interval(start, end);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33837);assertEquals(expected, test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDate_summer() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs4c6eq3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_summer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs4c6eq3y(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33838);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33839);LocalDate base = new LocalDate(2005, 7, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33840);Date test = base.toDate();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33841);check(base, 2005, 7, 9);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33842);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33843);gcal.clear();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33844);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33845);gcal.set(Calendar.MONTH, Calendar.JULY);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33846);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33847);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDate_winter() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du955cq48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_winter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du955cq48(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33848);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33849);LocalDate base = new LocalDate(2005, 1, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33850);Date test = base.toDate();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33851);check(base, 2005, 1, 9);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33852);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33853);gcal.clear();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33854);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33855);gcal.set(Calendar.MONTH, Calendar.JANUARY);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33856);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33857);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDate_springDST() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrtnglq4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_springDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrtnglq4i(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33858);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33859);LocalDate base = new LocalDate(2007, 4, 2);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33860);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33861);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33862);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33863);TimeZone.setDefault(testZone);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33864);Date test = base.toDate();
            __CLR4_4_1pnapnalc8azvdb.R.inc(33865);check(base, 2007, 4, 2);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33866);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33867);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDate_springDST_2Hour40Savings() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1168c4nq4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_springDST_2Hour40Savings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1168c4nq4s(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33868);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33869);LocalDate base = new LocalDate(2007, 4, 2);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33870);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33871);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33872);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33873);TimeZone.setDefault(testZone);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33874);Date test = base.toDate();
            __CLR4_4_1pnapnalc8azvdb.R.inc(33875);check(base, 2007, 4, 2);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33876);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33877);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    public void testToDate_autumnDST() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4c67mq52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_autumnDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4c67mq52(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33878);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33879);LocalDate base = new LocalDate(2007, 10, 2);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33880);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33881);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33882);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33883);TimeZone.setDefault(testZone);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33884);Date test = base.toDate();
            __CLR4_4_1pnapnalc8azvdb.R.inc(33885);check(base, 2007, 10, 2);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33886);assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33887);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoiq5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoiq5c(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33888);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33889);LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33890);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33891);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33892);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33893);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33894);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33895);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33896);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33897);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33898);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33899);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33900);assertEquals(test.era(), test.property(DateTimeFieldType.era()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33901);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33902);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_1pnapnalc8azvdb.R.inc(33903);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1pnapnalc8azvdb.R.inc(33904);try {
            __CLR4_4_1pnapnalc8azvdb.R.inc(33905);test.property(null);
            __CLR4_4_1pnapnalc8azvdb.R.inc(33906);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9q5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9q5v() throws Exception{try{__CLR4_4_1pnapnalc8azvdb.R.inc(33907);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33908);LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33909);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33910);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33911);oos.writeObject(test);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33912);byte[] bytes = baos.toByteArray();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33913);oos.close();
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33914);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33915);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33916);LocalDate result = (LocalDate) ois.readObject();
        __CLR4_4_1pnapnalc8azvdb.R.inc(33917);ois.close();
        
        __CLR4_4_1pnapnalc8azvdb.R.inc(33918);assertEquals(test, result);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33919);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33920);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33921);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidq6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidq6a(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33922);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33923);LocalDate test = new LocalDate(2002, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33924);assertEquals("2002-06-09", test.toString());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xq6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xq6d(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33925);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33926);LocalDate test = new LocalDate(2002, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33927);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH"));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33928);assertEquals("2002-06-09", test.toString((String) null));
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String_Locale() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64uq6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64uq6h(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33929);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33930);LocalDate test = new LocalDate(1970, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33931);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33932);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33933);assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33934);assertEquals("Tue 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33935);assertEquals("1970-06-09", test.toString(null, null));
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_DTFormatter() {__CLR4_4_1pnapnalc8azvdb.R.globalSliceStart(getClass().getName(),33936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsq6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pnapnalc8azvdb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pnapnalc8azvdb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsq6o(){try{__CLR4_4_1pnapnalc8azvdb.R.inc(33936);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33937);LocalDate test = new LocalDate(2002, 6, 9);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33938);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1pnapnalc8azvdb.R.inc(33939);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1pnapnalc8azvdb.R.inc(33940);
        __CLR4_4_1pnapnalc8azvdb.R.inc(33941);assertEquals(hour, test.getYear());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33942);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1pnapnalc8azvdb.R.inc(33943);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1pnapnalc8azvdb.R.flushNeeded();}}
}
