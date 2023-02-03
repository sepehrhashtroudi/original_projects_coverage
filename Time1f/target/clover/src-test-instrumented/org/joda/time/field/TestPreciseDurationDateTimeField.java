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
package org.joda.time.field;

import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_117x617x6lc8azx89{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,57322,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_117x617x6lc8azx89.R.inc(56922);
        __CLR4_4_117x617x6lc8azx89.R.inc(56923);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_117x617x6lc8azx89.R.inc(56924);
        __CLR4_4_117x617x6lc8azx89.R.inc(56925);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_117x617x6lc8azx89.R.inc(56927);try{__CLR4_4_117x617x6lc8azx89.R.inc(56926);
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_117x617x6lc8azx89.R.inc(56928);
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_117x617x6lc8azx89.R.inc(56929);
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_constructor() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g17xe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g17xe(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56930);
        __CLR4_4_117x617x6lc8azx89.R.inc(56931);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56932);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
        __CLR4_4_117x617x6lc8azx89.R.inc(56933);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(56934);field = new MockPreciseDurationDateTimeField(null, null);
            __CLR4_4_117x617x6lc8azx89.R.inc(56935);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117x617x6lc8azx89.R.inc(56936);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(56937);field = new MockPreciseDurationDateTimeField(
                DateTimeFieldType.minuteOfHour(),
                new MockImpreciseDurationField(DurationFieldType.minutes()));
            __CLR4_4_117x617x6lc8azx89.R.inc(56938);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117x617x6lc8azx89.R.inc(56939);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(56940);field = new MockPreciseDurationDateTimeField(
                DateTimeFieldType.minuteOfHour(),
                new MockZeroDurationField(DurationFieldType.minutes()));
            __CLR4_4_117x617x6lc8azx89.R.inc(56941);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getType() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di17xq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di17xq(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56942);
        __CLR4_4_117x617x6lc8azx89.R.inc(56943);BaseDateTimeField field = new MockPreciseDurationDateTimeField(
            DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
        __CLR4_4_117x617x6lc8azx89.R.inc(56944);assertEquals(DateTimeFieldType.secondOfDay(), field.getType());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getName() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k517xt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k517xt(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56945);
        __CLR4_4_117x617x6lc8azx89.R.inc(56946);BaseDateTimeField field = new MockPreciseDurationDateTimeField(
            DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
        __CLR4_4_117x617x6lc8azx89.R.inc(56947);assertEquals("secondOfDay", field.getName());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_toString() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c017xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c017xw(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56948);
        __CLR4_4_117x617x6lc8azx89.R.inc(56949);BaseDateTimeField field = new MockPreciseDurationDateTimeField(
            DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
        __CLR4_4_117x617x6lc8azx89.R.inc(56950);assertEquals("DateTimeField[secondOfDay]", field.toString());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_isSupported() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe17xz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe17xz(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56951);
        __CLR4_4_117x617x6lc8azx89.R.inc(56952);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56953);assertEquals(true, field.isSupported());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_isLenient() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljx0zd17y2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljx0zd17y2(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56954);
        __CLR4_4_117x617x6lc8azx89.R.inc(56955);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56956);assertEquals(false, field.isLenient());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_get() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oeyeo17y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oeyeo17y5(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56957);
        __CLR4_4_117x617x6lc8azx89.R.inc(56958);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56959);assertEquals(0, field.get(0));
        __CLR4_4_117x617x6lc8azx89.R.inc(56960);assertEquals(1, field.get(60));
        __CLR4_4_117x617x6lc8azx89.R.inc(56961);assertEquals(2, field.get(123));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getAsText_long_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdirgz17ya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdirgz17ya(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56962);
        __CLR4_4_117x617x6lc8azx89.R.inc(56963);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56964);assertEquals("29", field.getAsText(60L * 29, Locale.ENGLISH));
        __CLR4_4_117x617x6lc8azx89.R.inc(56965);assertEquals("29", field.getAsText(60L * 29, null));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getAsText_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3zd217ye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3zd217ye(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56966);
        __CLR4_4_117x617x6lc8azx89.R.inc(56967);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56968);assertEquals("29", field.getAsText(60L * 29));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getAsText_RP_int_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuft1h17yh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuft1h17yh(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56969);
        __CLR4_4_117x617x6lc8azx89.R.inc(56970);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56971);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_117x617x6lc8azx89.R.inc(56972);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getAsText_RP_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ywid17yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ywid17yl(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56973);
        __CLR4_4_117x617x6lc8azx89.R.inc(56974);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56975);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_117x617x6lc8azx89.R.inc(56976);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getAsText_int_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd8ltk17yp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd8ltk17yp(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56977);
        __CLR4_4_117x617x6lc8azx89.R.inc(56978);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56979);assertEquals("80", field.getAsText(80, Locale.ENGLISH));
        __CLR4_4_117x617x6lc8azx89.R.inc(56980);assertEquals("80", field.getAsText(80, null));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getAsShortText_long_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loiikt17yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loiikt17yt(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56981);
        __CLR4_4_117x617x6lc8azx89.R.inc(56982);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56983);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH));
        __CLR4_4_117x617x6lc8azx89.R.inc(56984);assertEquals("29", field.getAsShortText(60L * 29, null));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getAsShortText_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121lqfg17yx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121lqfg17yx(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56985);
        __CLR4_4_117x617x6lc8azx89.R.inc(56986);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56987);assertEquals("29", field.getAsShortText(60L * 29));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getAsShortText_RP_int_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qtetb17z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qtetb17z0(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56988);
        __CLR4_4_117x617x6lc8azx89.R.inc(56989);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56990);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_117x617x6lc8azx89.R.inc(56991);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getAsShortText_RP_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxyb9r17z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxyb9r17z4(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56992);
        __CLR4_4_117x617x6lc8azx89.R.inc(56993);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56994);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_117x617x6lc8azx89.R.inc(56995);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getAsShortText_int_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),56996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ntvlq17z8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ntvlq17z8(){try{__CLR4_4_117x617x6lc8azx89.R.inc(56996);
        __CLR4_4_117x617x6lc8azx89.R.inc(56997);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(56998);assertEquals("80", field.getAsShortText(80, Locale.ENGLISH));
        __CLR4_4_117x617x6lc8azx89.R.inc(56999);assertEquals("80", field.getAsShortText(80, null));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_add_long_int() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu17zc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu17zc(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57000);
        __CLR4_4_117x617x6lc8azx89.R.inc(57001);MockCountingDurationField.add_int = 0;
        __CLR4_4_117x617x6lc8azx89.R.inc(57002);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57003);assertEquals(61, field.add(1L, 1));
        __CLR4_4_117x617x6lc8azx89.R.inc(57004);assertEquals(1, MockCountingDurationField.add_int);
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_add_long_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl17zh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl17zh(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57005);
        __CLR4_4_117x617x6lc8azx89.R.inc(57006);MockCountingDurationField.add_long = 0;
        __CLR4_4_117x617x6lc8azx89.R.inc(57007);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57008);assertEquals(61, field.add(1L, 1L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57009);assertEquals(1, MockCountingDurationField.add_long);
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_add_RP_int_intarray_int() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06spl17zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06spl17zm(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57010);
        __CLR4_4_117x617x6lc8azx89.R.inc(57011);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57012);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57013);BaseDateTimeField field = new MockStandardBaseDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57014);int[] result = field.add(new TimeOfDay(), 2, values, 0);
        __CLR4_4_117x617x6lc8azx89.R.inc(57015);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57016);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57017);expected = new int[] {10, 20, 31, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57018);result = field.add(new TimeOfDay(), 2, values, 1);
        __CLR4_4_117x617x6lc8azx89.R.inc(57019);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57020);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57021);expected = new int[] {10, 21, 0, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57022);result = field.add(new TimeOfDay(), 2, values, 30);
        __CLR4_4_117x617x6lc8azx89.R.inc(57023);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57024);values = new int[] {23, 59, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57025);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(57026);field.add(new TimeOfDay(), 2, values, 30);
            __CLR4_4_117x617x6lc8azx89.R.inc(57027);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57028);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57029);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57030);result = field.add(new TimeOfDay(), 2, values, -1);
        __CLR4_4_117x617x6lc8azx89.R.inc(57031);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57032);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57033);expected = new int[] {10, 19, 59, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57034);result = field.add(new TimeOfDay(), 2, values, -31);
        __CLR4_4_117x617x6lc8azx89.R.inc(57035);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57036);values = new int[] {0, 0, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57037);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(57038);field.add(new TimeOfDay(), 2, values, -31);
            __CLR4_4_117x617x6lc8azx89.R.inc(57039);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_addWrapField_long_int() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdicdy180g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_addWrapField_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdicdy180g(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57040);
        __CLR4_4_117x617x6lc8azx89.R.inc(57041);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57042);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0));
        __CLR4_4_117x617x6lc8azx89.R.inc(57043);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30));
        __CLR4_4_117x617x6lc8azx89.R.inc(57044);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_addWrapField_RP_int_intarray_int() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdx7z180l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_addWrapField_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdx7z180l(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57045);
        __CLR4_4_117x617x6lc8azx89.R.inc(57046);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57047);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57048);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57049);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
        __CLR4_4_117x617x6lc8azx89.R.inc(57050);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57051);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57052);expected = new int[] {10, 20, 59, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57053);result = field.addWrapField(new TimeOfDay(), 2, values, 29);
        __CLR4_4_117x617x6lc8azx89.R.inc(57054);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57055);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57056);expected = new int[] {10, 20, 0, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57057);result = field.addWrapField(new TimeOfDay(), 2, values, 30);
        __CLR4_4_117x617x6lc8azx89.R.inc(57058);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57059);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57060);expected = new int[] {10, 20, 1, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57061);result = field.addWrapField(new TimeOfDay(), 2, values, 31);
        __CLR4_4_117x617x6lc8azx89.R.inc(57062);assertEquals(true, Arrays.equals(result, expected));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDifference_long_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fh4q51813();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getDifference_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fh4q51813(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57063);
        __CLR4_4_117x617x6lc8azx89.R.inc(57064);MockCountingDurationField.difference_long = 0;
        __CLR4_4_117x617x6lc8azx89.R.inc(57065);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57066);assertEquals(30, field.getDifference(0L, 0L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57067);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getDifferenceAsLong_long_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m2571818();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m2571818(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57068);
        __CLR4_4_117x617x6lc8azx89.R.inc(57069);MockCountingDurationField.difference_long = 0;
        __CLR4_4_117x617x6lc8azx89.R.inc(57070);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57071);assertEquals(30, field.getDifferenceAsLong(0L, 0L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57072);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_set_long_int() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rinawz181d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rinawz181d(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57073);
        __CLR4_4_117x617x6lc8azx89.R.inc(57074);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57075);assertEquals(0, field.set(120L, 0));
        __CLR4_4_117x617x6lc8azx89.R.inc(57076);assertEquals(29 * 60, field.set(120L, 29));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_set_RP_int_intarray_int() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c085k181h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c085k181h(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57077);
        __CLR4_4_117x617x6lc8azx89.R.inc(57078);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57079);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57080);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57081);int[] result = field.set(new TimeOfDay(), 2, values, 30);
        __CLR4_4_117x617x6lc8azx89.R.inc(57082);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57083);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57084);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57085);result = field.set(new TimeOfDay(), 2, values, 29);
        __CLR4_4_117x617x6lc8azx89.R.inc(57086);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57087);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57088);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57089);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(57090);field.set(new TimeOfDay(), 2, values, 60);
            __CLR4_4_117x617x6lc8azx89.R.inc(57091);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117x617x6lc8azx89.R.inc(57092);assertEquals(true, Arrays.equals(values, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57093);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57094);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57095);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(57096);field.set(new TimeOfDay(), 2, values, -1);
            __CLR4_4_117x617x6lc8azx89.R.inc(57097);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117x617x6lc8azx89.R.inc(57098);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_set_long_String_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481lrq1823();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481lrq1823(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57099);
        __CLR4_4_117x617x6lc8azx89.R.inc(57100);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57101);assertEquals(0, field.set(0L, "0", null));
        __CLR4_4_117x617x6lc8azx89.R.inc(57102);assertEquals(29 * 60, field.set(0L, "29", Locale.ENGLISH));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_set_long_String() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o1z691827();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o1z691827(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57103);
        __CLR4_4_117x617x6lc8azx89.R.inc(57104);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57105);assertEquals(0, field.set(0L, "0"));
        __CLR4_4_117x617x6lc8azx89.R.inc(57106);assertEquals(29 * 60, field.set(0L, "29"));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_set_RP_int_intarray_String_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j885c1182b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_RP_int_intarray_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j885c1182b(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57107);
        __CLR4_4_117x617x6lc8azx89.R.inc(57108);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57109);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57110);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57111);int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
        __CLR4_4_117x617x6lc8azx89.R.inc(57112);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57113);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57114);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57115);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
        __CLR4_4_117x617x6lc8azx89.R.inc(57116);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57117);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57118);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57119);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(57120);field.set(new TimeOfDay(), 2, values, "60", null);
            __CLR4_4_117x617x6lc8azx89.R.inc(57121);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117x617x6lc8azx89.R.inc(57122);assertEquals(true, Arrays.equals(values, expected));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57123);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57124);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117x617x6lc8azx89.R.inc(57125);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(57126);field.set(new TimeOfDay(), 2, values, "-1", null);
            __CLR4_4_117x617x6lc8azx89.R.inc(57127);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117x617x6lc8azx89.R.inc(57128);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_convertText() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj2ptm182x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_convertText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj2ptm182x(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57129);
        __CLR4_4_117x617x6lc8azx89.R.inc(57130);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57131);assertEquals(0, field.convertText("0", null));
        __CLR4_4_117x617x6lc8azx89.R.inc(57132);assertEquals(29, field.convertText("29", null));
        __CLR4_4_117x617x6lc8azx89.R.inc(57133);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(57134);field.convertText("2A", null);
            __CLR4_4_117x617x6lc8azx89.R.inc(57135);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117x617x6lc8azx89.R.inc(57136);try {
            __CLR4_4_117x617x6lc8azx89.R.inc(57137);field.convertText(null, null);
            __CLR4_4_117x617x6lc8azx89.R.inc(57138);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    public void test_isLeap_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu5r3x1837();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLeap_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu5r3x1837(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57139);
        __CLR4_4_117x617x6lc8azx89.R.inc(57140);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57141);assertEquals(false, field.isLeap(0L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getLeapAmount_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4dic9183a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getLeapAmount_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4dic9183a(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57142);
        __CLR4_4_117x617x6lc8azx89.R.inc(57143);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57144);assertEquals(0, field.getLeapAmount(0L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getLeapDurationField() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1geo4183d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getLeapDurationField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1geo4183d(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57145);
        __CLR4_4_117x617x6lc8azx89.R.inc(57146);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57147);assertEquals(null, field.getLeapDurationField());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMinimumValue() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1f2p9183g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1f2p9183g(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57148);
        __CLR4_4_117x617x6lc8azx89.R.inc(57149);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57150);assertEquals(0, field.getMinimumValue());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getMinimumValue_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyk6183j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyk6183j(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57151);
        __CLR4_4_117x617x6lc8azx89.R.inc(57152);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57153);assertEquals(0, field.getMinimumValue(0L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getMinimumValue_RP() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfeiw183m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfeiw183m(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57154);
        __CLR4_4_117x617x6lc8azx89.R.inc(57155);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57156);assertEquals(0, field.getMinimumValue(new TimeOfDay()));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getMinimumValue_RP_intarray() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz5kov183p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz5kov183p(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57157);
        __CLR4_4_117x617x6lc8azx89.R.inc(57158);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57159);assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getMaximumValue() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzocf183s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzocf183s(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57160);
        __CLR4_4_117x617x6lc8azx89.R.inc(57161);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57162);assertEquals(59, field.getMaximumValue());
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getMaximumValue_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk6lzc183v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk6lzc183v(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57163);
        __CLR4_4_117x617x6lc8azx89.R.inc(57164);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57165);assertEquals(59, field.getMaximumValue(0L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getMaximumValue_RP() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pndze183y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pndze183y(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57166);
        __CLR4_4_117x617x6lc8azx89.R.inc(57167);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57168);assertEquals(59, field.getMaximumValue(new TimeOfDay()));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getMaximumValue_RP_intarray() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2tg31841();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2tg31841(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57169);
        __CLR4_4_117x617x6lc8azx89.R.inc(57170);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57171);assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMaximumTextLength_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5m161844();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5m161844(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57172);
        __CLR4_4_117x617x6lc8azx89.R.inc(57173);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57174);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_117x617x6lc8azx89.R.inc(57175);field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57176);
                __CLR4_4_117x617x6lc8azx89.R.inc(57177);return 5;
            }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        };
        __CLR4_4_117x617x6lc8azx89.R.inc(57178);assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57179);field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57180);
                __CLR4_4_117x617x6lc8azx89.R.inc(57181);return 555;
            }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        };
        __CLR4_4_117x617x6lc8azx89.R.inc(57182);assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57183);field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57184);
                __CLR4_4_117x617x6lc8azx89.R.inc(57185);return 5555;
            }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        };
        __CLR4_4_117x617x6lc8azx89.R.inc(57186);assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));
        
        __CLR4_4_117x617x6lc8azx89.R.inc(57187);field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57188);
                __CLR4_4_117x617x6lc8azx89.R.inc(57189);return -1;
            }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        };
        __CLR4_4_117x617x6lc8azx89.R.inc(57190);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_getMaximumShortTextLength_Locale() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyw4ns184n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumShortTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyw4ns184n(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57191);
        __CLR4_4_117x617x6lc8azx89.R.inc(57192);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57193);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public void test_roundFloor_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rvn2v184q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rvn2v184q(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57194);
        __CLR4_4_117x617x6lc8azx89.R.inc(57195);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57196);assertEquals(-120L, field.roundFloor(-61L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57197);assertEquals(-60L, field.roundFloor(-60L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57198);assertEquals(-60L, field.roundFloor(-59L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57199);assertEquals(-60L, field.roundFloor(-1L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57200);assertEquals(0L, field.roundFloor(0L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57201);assertEquals(0L, field.roundFloor(1L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57202);assertEquals(0L, field.roundFloor(29L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57203);assertEquals(0L, field.roundFloor(30L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57204);assertEquals(0L, field.roundFloor(31L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57205);assertEquals(60L, field.roundFloor(60L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_roundCeiling_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t61ifu1852();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t61ifu1852(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57206);
        __CLR4_4_117x617x6lc8azx89.R.inc(57207);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57208);assertEquals(-60L, field.roundCeiling(-61L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57209);assertEquals(-60L, field.roundCeiling(-60L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57210);assertEquals(0L, field.roundCeiling(-59L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57211);assertEquals(0L, field.roundCeiling(-1L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57212);assertEquals(0L, field.roundCeiling(0L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57213);assertEquals(60L, field.roundCeiling(1L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57214);assertEquals(60L, field.roundCeiling(29L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57215);assertEquals(60L, field.roundCeiling(30L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57216);assertEquals(60L, field.roundCeiling(31L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57217);assertEquals(60L, field.roundCeiling(60L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_roundHalfFloor_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wvqu185e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundHalfFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wvqu185e(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57218);
        __CLR4_4_117x617x6lc8azx89.R.inc(57219);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57220);assertEquals(0L, field.roundHalfFloor(0L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57221);assertEquals(0L, field.roundHalfFloor(29L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57222);assertEquals(0L, field.roundHalfFloor(30L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57223);assertEquals(60L, field.roundHalfFloor(31L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57224);assertEquals(60L, field.roundHalfFloor(60L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_roundHalfCeiling_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182e0k9185l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundHalfCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182e0k9185l(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57225);
        __CLR4_4_117x617x6lc8azx89.R.inc(57226);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57227);assertEquals(0L, field.roundHalfCeiling(0L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57228);assertEquals(0L, field.roundHalfCeiling(29L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57229);assertEquals(60L, field.roundHalfCeiling(30L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57230);assertEquals(60L, field.roundHalfCeiling(31L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57231);assertEquals(60L, field.roundHalfCeiling(60L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_roundHalfEven_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd20a4185s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundHalfEven_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd20a4185s(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57232);
        __CLR4_4_117x617x6lc8azx89.R.inc(57233);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57234);assertEquals(0L, field.roundHalfEven(0L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57235);assertEquals(0L, field.roundHalfEven(29L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57236);assertEquals(0L, field.roundHalfEven(30L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57237);assertEquals(60L, field.roundHalfEven(31L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57238);assertEquals(60L, field.roundHalfEven(60L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57239);assertEquals(60L, field.roundHalfEven(89L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57240);assertEquals(120L, field.roundHalfEven(90L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57241);assertEquals(120L, field.roundHalfEven(91L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    public void test_remainder_long() {__CLR4_4_117x617x6lc8azx89.R.globalSliceStart(getClass().getName(),57242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6jwja1862();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117x617x6lc8azx89.R.rethrow($CLV_t2$);}finally{__CLR4_4_117x617x6lc8azx89.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_remainder_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6jwja1862(){try{__CLR4_4_117x617x6lc8azx89.R.inc(57242);
        __CLR4_4_117x617x6lc8azx89.R.inc(57243);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_117x617x6lc8azx89.R.inc(57244);assertEquals(0L, field.remainder(0L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57245);assertEquals(29L, field.remainder(29L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57246);assertEquals(30L, field.remainder(30L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57247);assertEquals(31L, field.remainder(31L));
        __CLR4_4_117x617x6lc8azx89.R.inc(57248);assertEquals(0L, field.remainder(60L));
    }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockPreciseDurationDateTimeField extends PreciseDurationDateTimeField {
        protected MockPreciseDurationDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_117x617x6lc8azx89.R.inc(57250);try{__CLR4_4_117x617x6lc8azx89.R.inc(57249);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_117x617x6lc8azx89.R.inc(57252);try{__CLR4_4_117x617x6lc8azx89.R.inc(57251);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57253);
            __CLR4_4_117x617x6lc8azx89.R.inc(57254);return (int) (instant / 60L);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57255);
            __CLR4_4_117x617x6lc8azx89.R.inc(57256);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57257);
            __CLR4_4_117x617x6lc8azx89.R.inc(57258);return 59;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_117x617x6lc8azx89.R.inc(57260);try{__CLR4_4_117x617x6lc8azx89.R.inc(57259);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57261);
            __CLR4_4_117x617x6lc8azx89.R.inc(57262);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57263);
            __CLR4_4_117x617x6lc8azx89.R.inc(57264);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_117x617x6lc8azx89.R.inc(57266);try{__CLR4_4_117x617x6lc8azx89.R.inc(57265);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57267);
            __CLR4_4_117x617x6lc8azx89.R.inc(57268);return true;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57269);
            __CLR4_4_117x617x6lc8azx89.R.inc(57270);return 60;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57271);
            __CLR4_4_117x617x6lc8azx89.R.inc(57272);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57273);
            __CLR4_4_117x617x6lc8azx89.R.inc(57274);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57275);
            __CLR4_4_117x617x6lc8azx89.R.inc(57276);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57277);
            __CLR4_4_117x617x6lc8azx89.R.inc(57278);add_int++;
            __CLR4_4_117x617x6lc8azx89.R.inc(57279);return instant + (value * 60L);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57280);
            __CLR4_4_117x617x6lc8azx89.R.inc(57281);add_long++;
            __CLR4_4_117x617x6lc8azx89.R.inc(57282);return instant + (value * 60L);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57283);
            __CLR4_4_117x617x6lc8azx89.R.inc(57284);difference_long++;
            __CLR4_4_117x617x6lc8azx89.R.inc(57285);return 30;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_117x617x6lc8azx89.R.inc(57287);try{__CLR4_4_117x617x6lc8azx89.R.inc(57286);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57288);
            __CLR4_4_117x617x6lc8azx89.R.inc(57289);return true;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57290);
            __CLR4_4_117x617x6lc8azx89.R.inc(57291);return 0;  // this is zero
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57292);
            __CLR4_4_117x617x6lc8azx89.R.inc(57293);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57294);
            __CLR4_4_117x617x6lc8azx89.R.inc(57295);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57296);
            __CLR4_4_117x617x6lc8azx89.R.inc(57297);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57298);
            __CLR4_4_117x617x6lc8azx89.R.inc(57299);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57300);
            __CLR4_4_117x617x6lc8azx89.R.inc(57301);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57302);
            __CLR4_4_117x617x6lc8azx89.R.inc(57303);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_117x617x6lc8azx89.R.inc(57305);try{__CLR4_4_117x617x6lc8azx89.R.inc(57304);
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57306);
            __CLR4_4_117x617x6lc8azx89.R.inc(57307);return false;  // this is false
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_117x617x6lc8azx89.R.inc(57308);
            __CLR4_4_117x617x6lc8azx89.R.inc(57309);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57310);
            __CLR4_4_117x617x6lc8azx89.R.inc(57311);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57312);
            __CLR4_4_117x617x6lc8azx89.R.inc(57313);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57314);
            __CLR4_4_117x617x6lc8azx89.R.inc(57315);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57316);
            __CLR4_4_117x617x6lc8azx89.R.inc(57317);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57318);
            __CLR4_4_117x617x6lc8azx89.R.inc(57319);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_117x617x6lc8azx89.R.inc(57320);
            __CLR4_4_117x617x6lc8azx89.R.inc(57321);return 0;
        }finally{__CLR4_4_117x617x6lc8azx89.R.flushNeeded();}}
    }

}
