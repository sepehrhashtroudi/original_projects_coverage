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
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1qrtqrtlc8azvhg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,35212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

//    private long TEST_TIME1 =
//        1L * DateTimeConstants.MILLIS_PER_HOUR
//        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 3L * DateTimeConstants.MILLIS_PER_SECOND
//        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34697);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34698);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34699);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34700);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1qrtqrtlc8azvhg.R.inc(34702);try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34701);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34703);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34704);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34705);zone = DateTimeZone.getDefault();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34706);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34707);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34708);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34709);DateTimeZone.setDefault(zone);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34710);zone = null;
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet_DateTimeFieldType() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vqs7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vqs7(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34711);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34712);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34713);assertEquals(10, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34714);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34715);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34716);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34717);assertEquals(TEST_TIME_NOW / 60000 , test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34718);assertEquals(TEST_TIME_NOW / 1000 , test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34719);assertEquals(TEST_TIME_NOW , test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34720);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34721);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34722);test = new LocalTime(12, 30);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34723);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34724);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34725);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34726);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34727);test = new LocalTime(14, 30);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34728);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34729);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34730);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34731);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34732);test = new LocalTime(0, 30);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34733);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34734);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34735);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34736);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34737);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34738);test.get(null);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34739);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34740);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34741);test.get(DateTimeFieldType.dayOfMonth());
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34742);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testSize() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122qt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122qt3(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34743);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34744);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34745);assertEquals(4, test.size());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testGetFieldType_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v547gnqt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetFieldType_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v547gnqt6(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34746);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34747);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34748);assertSame(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34749);assertSame(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34750);assertSame(DateTimeFieldType.secondOfMinute(), test.getFieldType(2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34751);assertSame(DateTimeFieldType.millisOfSecond(), test.getFieldType(3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34752);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34753);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34754);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34755);test.getFieldType(5);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testGetFieldTypes() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvuqtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvuqtg(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34756);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34757);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34758);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34759);assertSame(DateTimeFieldType.hourOfDay(), fields[0]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34760);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34761);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34762);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34763);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testGetField_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esjyjxqto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetField_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esjyjxqto(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34764);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34765);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34766);assertSame(COPTIC_UTC.hourOfDay(), test.getField(0));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34767);assertSame(COPTIC_UTC.minuteOfHour(), test.getField(1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34768);assertSame(COPTIC_UTC.secondOfMinute(), test.getField(2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34769);assertSame(COPTIC_UTC.millisOfSecond(), test.getField(3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34770);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34771);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34772);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34773);test.getField(5);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testGetFields() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeasqty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeasqty(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34774);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34775);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34776);DateTimeField[] fields = test.getFields();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34777);assertSame(COPTIC_UTC.hourOfDay(), fields[0]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34778);assertSame(COPTIC_UTC.minuteOfHour(), fields[1]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34779);assertSame(COPTIC_UTC.secondOfMinute(), fields[2]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34780);assertSame(COPTIC_UTC.millisOfSecond(), fields[3]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34781);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testGetValue_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmp610qu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValue_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmp610qu6(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34782);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34783);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34784);assertEquals(10, test.getValue(0));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34785);assertEquals(20, test.getValue(1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34786);assertEquals(30, test.getValue(2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34787);assertEquals(40, test.getValue(3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34788);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34789);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34790);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34791);test.getValue(5);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testGetValues() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelqug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelqug(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34792);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34793);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34794);int[] values = test.getValues();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34795);assertEquals(10, values[0]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34796);assertEquals(20, values[1]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34797);assertEquals(30, values[2]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34798);assertEquals(40, values[3]);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34799);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testIsSupported_DateTimeFieldType() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyuedvquo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyuedvquo(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34800);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34801);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34802);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34803);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34804);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34805);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34806);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34807);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34808);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay()));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34809);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34810);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34811);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34812);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay()));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34813);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34814);assertEquals(false, test.isSupported((DateTimeFieldType) null));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34815);DateTimeFieldType d = new DateTimeFieldType("hours") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34816);
                __CLR4_4_1qrtqrtlc8azvhg.R.inc(34817);return DurationFieldType.hours();
            }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34818);
                __CLR4_4_1qrtqrtlc8azvhg.R.inc(34819);return null;
            }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34820);
                __CLR4_4_1qrtqrtlc8azvhg.R.inc(34821);return chronology.hourOfDay();
            }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
        };
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34822);assertEquals(false, test.isSupported(d));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34823);d = new DateTimeFieldType("hourOfYear") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34824);
                __CLR4_4_1qrtqrtlc8azvhg.R.inc(34825);return DurationFieldType.hours();
            }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34826);
                __CLR4_4_1qrtqrtlc8azvhg.R.inc(34827);return DurationFieldType.years();
            }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34828);
                __CLR4_4_1qrtqrtlc8azvhg.R.inc(34829);return chronology.hourOfDay();
            }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
        };
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34830);assertEquals(false, test.isSupported(d));
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testIsSupported_DurationFieldType() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3fm3eqvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DurationFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3fm3eqvj(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34831);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34832);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34833);assertEquals(true, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34834);assertEquals(true, test.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34835);assertEquals(true, test.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34836);assertEquals(true, test.isSupported(DurationFieldType.millis()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34837);assertEquals(true, test.isSupported(DurationFieldType.halfdays()));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34838);assertEquals(false, test.isSupported(DurationFieldType.days()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34839);assertEquals(false, test.isSupported((DurationFieldType) null));
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testEqualsHashCode() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77qvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77qvs(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34840);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34841);LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34842);LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34843);assertEquals(true, test1.equals(test2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34844);assertEquals(true, test2.equals(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34845);assertEquals(true, test1.equals(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34846);assertEquals(true, test2.equals(test2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34847);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34848);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34849);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34850);LocalTime test3 = new LocalTime(15, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34851);assertEquals(false, test1.equals(test3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34852);assertEquals(false, test2.equals(test3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34853);assertEquals(false, test3.equals(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34854);assertEquals(false, test3.equals(test2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34855);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34856);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34857);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34858);assertEquals(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC)));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34859);assertEquals(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34860);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34861);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34862);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34863);return COPTIC_UTC;
        }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34864);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34865);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34866);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34867);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testCompareTo() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvqwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvqwk(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34868);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34869);LocalTime test1 = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34870);LocalTime test1a = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34871);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34872);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34873);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34874);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34875);LocalTime test2 = new LocalTime(10, 20, 35, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34876);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34877);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34878);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34879);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34880);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34881);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34882);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.hourOfDay(),
            DateTimeFieldType.minuteOfHour(),
            DateTimeFieldType.secondOfMinute(),
            DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34883);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34884);Partial p = new Partial(types, values);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34885);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34886);assertEquals(0, test1.compareTo(new TimeOfDay(10, 20, 30, 40)));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34887);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34888);test1.compareTo(null);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34889);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsEqual_LocalTime() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3fpugqx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsEqual_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3fpugqx6(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34890);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34891);LocalTime test1 = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34892);LocalTime test1a = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34893);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34894);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34895);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34896);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34897);LocalTime test2 = new LocalTime(10, 20, 35, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34898);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34899);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34900);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34901);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34902);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34903);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34904);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34905);new LocalTime(10, 20, 35, 40).isEqual(null);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34906);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_LocalTime() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emnc1xqxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsBefore_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emnc1xqxn(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34907);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34908);LocalTime test1 = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34909);LocalTime test1a = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34910);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34911);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34912);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34913);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34914);LocalTime test2 = new LocalTime(10, 20, 35, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34915);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34916);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34917);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34918);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34919);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34920);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34921);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34922);new LocalTime(10, 20, 35, 40).isBefore(null);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34923);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_LocalTime() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywb8e8qy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsAfter_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywb8e8qy4(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34924);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34925);LocalTime test1 = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34926);LocalTime test1a = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34927);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34928);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34929);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34930);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34931);LocalTime test2 = new LocalTime(10, 20, 35, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34932);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34933);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34934);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34935);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34936);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34937);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34938);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34939);new LocalTime(10, 20, 35, 40).isAfter(null);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34940);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField_DateTimeFieldType_int_1() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apbcyjqyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apbcyjqyl(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34941);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34942);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34943);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34944);assertEquals(new LocalTime(10, 20, 30, 40), test);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34945);assertEquals(new LocalTime(15, 20, 30, 40), result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithField_DateTimeFieldType_int_2() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gbe62qyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gbe62qyq(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34946);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34947);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34948);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34949);test.withField(null, 6);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34950);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithField_DateTimeFieldType_int_3() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147bfdlqyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147bfdlqyv(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34951);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34952);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34953);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34954);test.withField(DateTimeFieldType.dayOfMonth(), 6);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34955);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithField_DateTimeFieldType_int_4() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybgl4qz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybgl4qz0(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34956);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34957);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34958);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34959);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded_DurationFieldType_int_1() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4lfcqz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4lfcqz4(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34960);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34961);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34962);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34963);assertEquals(new LocalTime(10, 20, 30, 40), test);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34964);assertEquals(new LocalTime(16, 20, 30, 40), result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_2() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g4mmvqz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g4mmvqz9(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34965);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34966);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34967);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34968);test.withFieldAdded(null, 0);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34969);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_3() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1674nueqze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1674nueqze(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34970);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34971);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34972);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34973);test.withFieldAdded(null, 6);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34974);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_4() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12y4p1xqzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12y4p1xqzj(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34975);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34976);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34977);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34978);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_5() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av9qkqzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av9qkqzn(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34979);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34980);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34981);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34982);test.withFieldAdded(DurationFieldType.days(), 6);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(34983);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_6() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jv8j1qzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jv8j1qzs(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34984);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34985);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34986);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 16);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34987);assertEquals(new LocalTime(10, 20, 30, 40), test);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34988);assertEquals(new LocalTime(2, 20, 30, 40), result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_7() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),34989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16sv7biqzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16sv7biqzx(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(34989);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34990);LocalTime test = new LocalTime(23, 59, 59, 999);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34991);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), 1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34992);assertEquals(new LocalTime(0, 0, 0, 0), result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34993);test = new LocalTime(23, 59, 59, 999);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34994);result = test.withFieldAdded(DurationFieldType.seconds(), 1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34995);assertEquals(new LocalTime(0, 0, 0, 999), result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34996);test = new LocalTime(23, 59, 59, 999);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34997);result = test.withFieldAdded(DurationFieldType.minutes(), 1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34998);assertEquals(new LocalTime(0, 0, 59, 999), result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(34999);test = new LocalTime(23, 59, 59, 999);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35000);result = test.withFieldAdded(DurationFieldType.hours(), 1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35001);assertEquals(new LocalTime(0, 59, 59, 999), result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testWithFieldAdded_DurationFieldType_int_8() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1v63zr0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1v63zr0a(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35002);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35003);LocalTime test = new LocalTime(0, 0, 0, 0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35004);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35005);assertEquals(new LocalTime(23, 59, 59, 999), result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35006);test = new LocalTime(0, 0, 0, 0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35007);result = test.withFieldAdded(DurationFieldType.seconds(), -1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35008);assertEquals(new LocalTime(23, 59, 59, 0), result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35009);test = new LocalTime(0, 0, 0, 0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35010);result = test.withFieldAdded(DurationFieldType.minutes(), -1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35011);assertEquals(new LocalTime(23, 59, 0, 0), result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35012);test = new LocalTime(0, 0, 0, 0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35013);result = test.withFieldAdded(DurationFieldType.hours(), -1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35014);assertEquals(new LocalTime(23, 0, 0, 0), result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RP() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igr0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igr0n(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35015);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35016);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35017);LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35018);LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35019);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35020);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35021);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testPlusHours_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s87b5yr0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s87b5yr0u(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35022);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35023);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35024);LocalTime result = test.plusHours(1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35025);LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35026);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35027);result = test.plusHours(0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35028);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testPlusMinutes_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mjqur11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mjqur11(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35029);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35030);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35031);LocalTime result = test.plusMinutes(1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35032);LocalTime expected = new LocalTime(1, 3, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35033);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35034);result = test.plusMinutes(0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35035);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testPlusSeconds_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx4lrer18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx4lrer18(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35036);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35037);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35038);LocalTime result = test.plusSeconds(1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35039);LocalTime expected = new LocalTime(1, 2, 4, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35040);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35041);result = test.plusSeconds(0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35042);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testPlusMillis_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blt447r1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blt447r1f(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35043);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35044);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35045);LocalTime result = test.plusMillis(1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35046);LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35047);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35048);result = test.plusMillis(0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35049);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_RP() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmr1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmr1m(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35050);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35051);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35052);LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35053);LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35054);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35055);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35056);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testMinusHours_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmid4r1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmid4r1t(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35057);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35058);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35059);LocalTime result = test.minusHours(1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35060);LocalTime expected = new LocalTime(0, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35061);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35062);result = test.minusHours(0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35063);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testMinusMinutes_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zd8a0r20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zd8a0r20(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35064);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35065);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35066);LocalTime result = test.minusMinutes(1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35067);LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35068);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35069);result = test.minusMinutes(0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35070);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testMinusSeconds_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2q4qwr27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2q4qwr27(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35071);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35072);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35073);LocalTime result = test.minusSeconds(1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35074);LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35075);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35076);result = test.minusSeconds(0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35077);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testMinusMillis_int() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrwbadr2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrwbadr2e(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35078);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35079);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35080);LocalTime result = test.minusMillis(1);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35081);LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35082);assertEquals(expected, result);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35083);result = test.minusMillis(0);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35084);assertSame(test, result);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetters() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7r2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7r2l(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35085);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35086);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35087);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35088);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35089);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35090);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35091);assertEquals(TEST_TIME_NOW, test.getMillisOfDay());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithers() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzpr2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzpr2s(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35092);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35093);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35094);check(test.withHourOfDay(6), 6, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35095);check(test.withMinuteOfHour(6), 10, 6, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35096);check(test.withSecondOfMinute(6), 10, 20, 6, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35097);check(test.withMillisOfSecond(6), 10, 20, 30, 6);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35098);check(test.withMillisOfDay(61234), 0, 1, 1, 234);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35099);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(35100);test.withHourOfDay(-1);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(35101);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35102);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(35103);test.withHourOfDay(24);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(35104);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeTodayDefaultZone() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izxxk5r35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeTodayDefaultZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izxxk5r35(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35105);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35106);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35107);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35108);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35109);DateTime test = base.toDateTimeToday();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35110);check(base, 10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35111);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35112);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35113);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35114);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35115);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35116);assertEquals(expected, test);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeToday_Zone() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1junxpjr3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1junxpjr3h(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35117);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35118);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35119);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35120);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35121);DateTime test = base.toDateTimeToday(TOKYO);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35122);check(base, 10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35123);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35124);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35125);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35126);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35127);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35128);assertEquals(expected, test);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testToDateTimeToday_nullZone() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjvd1cr3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjvd1cr3t(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35129);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35130);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35131);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35132);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35133);DateTime test = base.toDateTimeToday((DateTimeZone) null);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35134);check(base, 10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35135);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35136);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35137);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35138);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35139);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35140);assertEquals(expected, test);
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_RI() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdr45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdr45(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35141);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35142);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35143);DateTime dt = new DateTime(0L); // LONDON zone
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35144);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35145);DateTime test = base.toDateTime(dt);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35146);check(base, 10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35147);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35148);assertEquals("1970-01-01T10:20:30.040+01:00", test.toString());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    public void testToDateTime_nullRI() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4r4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4r4d(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35149);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35150);LocalTime base = new LocalTime(1, 2, 3, 4);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35151);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35152);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35153);check(base, 1, 2, 3, 4);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35154);assertEquals("1970-01-02T01:02:03.004+01:00", test.toString());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoir4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoir4j(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35155);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35156);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35157);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35158);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35159);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35160);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35161);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay()));
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35162);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35163);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35164);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35165);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35166);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35167);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35168);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime());
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35169);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(35170);test.property(DateTimeFieldType.dayOfWeek());
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(35171);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35172);try {
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(35173);test.property(null);
            __CLR4_4_1qrtqrtlc8azvhg.R.inc(35174);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9r53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9r53() throws Exception{try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35175);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35176);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35177);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35178);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35179);oos.writeObject(test);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35180);byte[] bytes = baos.toByteArray();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35181);oos.close();
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35182);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35183);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35184);LocalTime result = (LocalTime) ois.readObject();
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35185);ois.close();
        
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35186);assertEquals(test, result);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35187);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35188);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35189);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidr5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidr5i(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35190);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35191);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35192);assertEquals("10:20:30.040", test.toString());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xr5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xr5l(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35193);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35194);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35195);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH"));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35196);assertEquals("10:20:30.040", test.toString((String) null));
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String_Locale() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64ur5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64ur5p(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35197);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35198);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35199);assertEquals("10 20", test.toString("H m", Locale.ENGLISH));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35200);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35201);assertEquals("10 20", test.toString("H m", null));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35202);assertEquals("10:20:30.040", test.toString(null, null));
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_DTFormatter() {__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceStart(getClass().getName(),35203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsr5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrtqrtlc8azvhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrtqrtlc8azvhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsr5v(){try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35203);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35204);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35205);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35206);assertEquals("10:20:30.040", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1qrtqrtlc8azvhg.R.inc(35207);
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35208);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35209);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35210);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1qrtqrtlc8azvhg.R.inc(35211);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1qrtqrtlc8azvhg.R.flushNeeded();}}
}
