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
 * This class is a Junit unit test for PreciseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_117mh17mhlc8azx73{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,56922,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56537);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56538);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56539);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56540);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_117mh17mhlc8azx73.R.inc(56542);try{__CLR4_4_117mh17mhlc8azx73.R.inc(56541);
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56543);
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56544);
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_constructor() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g17mp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g17mp(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56545);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56546);BaseDateTimeField field = new PreciseDateTimeField(
            DateTimeFieldType.secondOfMinute(),
            ISOChronology.getInstanceUTC().millis(),
            ISOChronology.getInstanceUTC().hours()
        );
        __CLR4_4_117mh17mhlc8azx73.R.inc(56547);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
        __CLR4_4_117mh17mhlc8azx73.R.inc(56548);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56549);field = new PreciseDateTimeField(null, null, null);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56550);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56551);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56552);field = new PreciseDateTimeField(
                DateTimeFieldType.minuteOfHour(),
                new MockImpreciseDurationField(DurationFieldType.minutes()),
                ISOChronology.getInstanceUTC().hours());
            __CLR4_4_117mh17mhlc8azx73.R.inc(56553);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56554);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56555);field = new PreciseDateTimeField(
                DateTimeFieldType.minuteOfHour(),
                ISOChronology.getInstanceUTC().hours(),
                new MockImpreciseDurationField(DurationFieldType.minutes()));
            __CLR4_4_117mh17mhlc8azx73.R.inc(56556);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56557);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56558);field = new PreciseDateTimeField(
                DateTimeFieldType.minuteOfHour(),
                ISOChronology.getInstanceUTC().hours(),
                ISOChronology.getInstanceUTC().hours());
            __CLR4_4_117mh17mhlc8azx73.R.inc(56559);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56560);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56561);field = new PreciseDateTimeField(
                DateTimeFieldType.minuteOfHour(),
                new MockZeroDurationField(DurationFieldType.minutes()),
                ISOChronology.getInstanceUTC().hours());
            __CLR4_4_117mh17mhlc8azx73.R.inc(56562);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getType() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di17n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di17n7(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56563);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56564);BaseDateTimeField field = new PreciseDateTimeField(
            DateTimeFieldType.secondOfDay(),
            ISOChronology.getInstanceUTC().millis(),
            ISOChronology.getInstanceUTC().hours()
        );
        __CLR4_4_117mh17mhlc8azx73.R.inc(56565);assertEquals(DateTimeFieldType.secondOfDay(), field.getType());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getName() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k517na();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k517na(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56566);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56567);BaseDateTimeField field = new PreciseDateTimeField(
            DateTimeFieldType.secondOfDay(),
            ISOChronology.getInstanceUTC().millis(),
            ISOChronology.getInstanceUTC().hours()
        );
        __CLR4_4_117mh17mhlc8azx73.R.inc(56568);assertEquals("secondOfDay", field.getName());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_toString() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c017nd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c017nd(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56569);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56570);BaseDateTimeField field = new PreciseDateTimeField(
            DateTimeFieldType.secondOfDay(),
            ISOChronology.getInstanceUTC().millis(),
            ISOChronology.getInstanceUTC().hours()
        );
        __CLR4_4_117mh17mhlc8azx73.R.inc(56571);assertEquals("DateTimeField[secondOfDay]", field.toString());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_isSupported() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe17ng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe17ng(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56572);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56573);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56574);assertEquals(true, field.isSupported());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getRange() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sssj3917nj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sssj3917nj(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56575);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56576);PreciseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56577);assertEquals(60, field.getRange());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_get() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oeyeo17nm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oeyeo17nm(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56578);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56579);PreciseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56580);assertEquals(0, field.get(0));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56581);assertEquals(1, field.get(60));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56582);assertEquals(2, field.get(123));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getAsText_long_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdirgz17nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdirgz17nr(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56583);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56584);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56585);assertEquals("29", field.getAsText(60L * 29, Locale.ENGLISH));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56586);assertEquals("29", field.getAsText(60L * 29, null));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getAsText_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3zd217nv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3zd217nv(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56587);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56588);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56589);assertEquals("29", field.getAsText(60L * 29));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getAsText_RP_int_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuft1h17ny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuft1h17ny(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56590);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56591);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56592);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56593);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getAsText_RP_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ywid17o2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ywid17o2(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56594);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56595);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56596);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56597);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getAsText_int_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd8ltk17o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd8ltk17o6(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56598);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56599);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56600);assertEquals("80", field.getAsText(80, Locale.ENGLISH));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56601);assertEquals("80", field.getAsText(80, null));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getAsShortText_long_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loiikt17oa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loiikt17oa(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56602);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56603);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56604);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56605);assertEquals("29", field.getAsShortText(60L * 29, null));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getAsShortText_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121lqfg17oe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121lqfg17oe(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56606);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56607);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56608);assertEquals("29", field.getAsShortText(60L * 29));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getAsShortText_RP_int_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qtetb17oh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qtetb17oh(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56609);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56610);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56611);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56612);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getAsShortText_RP_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxyb9r17ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxyb9r17ol(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56613);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56614);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56615);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56616);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getAsShortText_int_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ntvlq17op();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ntvlq17op(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56617);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56618);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56619);assertEquals("80", field.getAsShortText(80, Locale.ENGLISH));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56620);assertEquals("80", field.getAsShortText(80, null));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_add_long_int() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu17ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu17ot(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56621);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56622);MockCountingDurationField.add_int = 0;
        __CLR4_4_117mh17mhlc8azx73.R.inc(56623);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56624);assertEquals(61, field.add(1L, 1));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56625);assertEquals(1, MockCountingDurationField.add_int);
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_add_long_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl17oy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl17oy(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56626);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56627);MockCountingDurationField.add_long = 0;
        __CLR4_4_117mh17mhlc8azx73.R.inc(56628);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56629);assertEquals(61, field.add(1L, 1L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56630);assertEquals(1, MockCountingDurationField.add_long);
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_add_RP_int_intarray_int() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06spl17p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06spl17p3(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56631);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56632);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56633);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56634);BaseDateTimeField field = new MockStandardDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56635);int[] result = field.add(new TimeOfDay(), 2, values, 0);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56636);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56637);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56638);expected = new int[] {10, 20, 31, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56639);result = field.add(new TimeOfDay(), 2, values, 1);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56640);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56641);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56642);expected = new int[] {10, 21, 0, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56643);result = field.add(new TimeOfDay(), 2, values, 30);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56644);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56645);values = new int[] {23, 59, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56646);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56647);field.add(new TimeOfDay(), 2, values, 30);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56648);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56649);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56650);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56651);result = field.add(new TimeOfDay(), 2, values, -1);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56652);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56653);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56654);expected = new int[] {10, 19, 59, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56655);result = field.add(new TimeOfDay(), 2, values, -31);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56656);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56657);values = new int[] {0, 0, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56658);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56659);field.add(new TimeOfDay(), 2, values, -31);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56660);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_addWrapField_long_int() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdicdy17px();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdicdy17px(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56661);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56662);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56663);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56664);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56665);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_addWrapField_RP_int_intarray_int() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdx7z17q2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdx7z17q2(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56666);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56667);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56668);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56669);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56670);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56671);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56672);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56673);expected = new int[] {10, 20, 59, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56674);result = field.addWrapField(new TimeOfDay(), 2, values, 29);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56675);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56676);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56677);expected = new int[] {10, 20, 0, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56678);result = field.addWrapField(new TimeOfDay(), 2, values, 30);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56679);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56680);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56681);expected = new int[] {10, 20, 1, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56682);result = field.addWrapField(new TimeOfDay(), 2, values, 31);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56683);assertEquals(true, Arrays.equals(result, expected));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDifference_long_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fh4q517qk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getDifference_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fh4q517qk(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56684);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56685);MockCountingDurationField.difference_long = 0;
        __CLR4_4_117mh17mhlc8azx73.R.inc(56686);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56687);assertEquals(30, field.getDifference(0L, 0L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56688);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getDifferenceAsLong_long_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m25717qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m25717qp(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56689);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56690);MockCountingDurationField.difference_long = 0;
        __CLR4_4_117mh17mhlc8azx73.R.inc(56691);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56692);assertEquals(30, field.getDifferenceAsLong(0L, 0L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56693);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_set_long_int() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rinawz17qu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rinawz17qu(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56694);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56695);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56696);assertEquals(0, field.set(120L, 0));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56697);assertEquals(29 * 60, field.set(120L, 29));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_set_RP_int_intarray_int() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c085k17qy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c085k17qy(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56698);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56699);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56700);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56701);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56702);int[] result = field.set(new TimeOfDay(), 2, values, 30);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56703);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56704);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56705);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56706);result = field.set(new TimeOfDay(), 2, values, 29);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56707);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56708);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56709);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56710);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56711);field.set(new TimeOfDay(), 2, values, 60);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56712);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56713);assertEquals(true, Arrays.equals(values, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56714);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56715);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56716);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56717);field.set(new TimeOfDay(), 2, values, -1);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56718);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56719);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_set_long_String_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481lrq17rk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481lrq17rk(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56720);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56721);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56722);assertEquals(0, field.set(0L, "0", null));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56723);assertEquals(29 * 60, field.set(0L, "29", Locale.ENGLISH));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_set_long_String() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o1z6917ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o1z6917ro(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56724);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56725);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56726);assertEquals(0, field.set(0L, "0"));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56727);assertEquals(29 * 60, field.set(0L, "29"));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_set_RP_int_intarray_String_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j885c117rs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_RP_int_intarray_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j885c117rs(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56728);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56729);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56730);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56731);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56732);int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56733);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56734);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56735);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56736);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56737);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56738);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56739);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56740);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56741);field.set(new TimeOfDay(), 2, values, "60", null);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56742);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56743);assertEquals(true, Arrays.equals(values, expected));
        
        __CLR4_4_117mh17mhlc8azx73.R.inc(56744);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56745);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117mh17mhlc8azx73.R.inc(56746);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56747);field.set(new TimeOfDay(), 2, values, "-1", null);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56748);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56749);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_convertText() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj2ptm17se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_convertText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj2ptm17se(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56750);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56751);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56752);assertEquals(0, field.convertText("0", null));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56753);assertEquals(29, field.convertText("29", null));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56754);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56755);field.convertText("2A", null);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56756);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117mh17mhlc8azx73.R.inc(56757);try {
            __CLR4_4_117mh17mhlc8azx73.R.inc(56758);field.convertText(null, null);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56759);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    public void test_isLeap_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu5r3x17so();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_isLeap_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu5r3x17so(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56760);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56761);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56762);assertEquals(false, field.isLeap(0L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getLeapAmount_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4dic917sr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getLeapAmount_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4dic917sr(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56763);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56764);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56765);assertEquals(0, field.getLeapAmount(0L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getLeapDurationField() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1geo417su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getLeapDurationField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1geo417su(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56766);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56767);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56768);assertEquals(null, field.getLeapDurationField());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMinimumValue() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1f2p917sx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMinimumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1f2p917sx(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56769);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56770);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56771);assertEquals(0, field.getMinimumValue());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getMinimumValue_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyk617t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMinimumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyk617t0(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56772);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56773);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56774);assertEquals(0, field.getMinimumValue(0L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getMinimumValue_RP() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfeiw17t3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMinimumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfeiw17t3(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56775);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56776);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56777);assertEquals(0, field.getMinimumValue(new TimeOfDay()));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getMinimumValue_RP_intarray() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz5kov17t6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMinimumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz5kov17t6(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56778);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56779);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56780);assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getMaximumValue() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzocf17t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzocf17t9(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56781);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56782);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56783);assertEquals(59, field.getMaximumValue());
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getMaximumValue_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk6lzc17tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk6lzc17tc(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56784);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56785);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56786);assertEquals(59, field.getMaximumValue(0L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getMaximumValue_RP() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pndze17tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pndze17tf(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56787);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56788);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56789);assertEquals(59, field.getMaximumValue(new TimeOfDay()));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getMaximumValue_RP_intarray() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2tg317ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2tg317ti(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56790);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56791);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56792);assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMaximumTextLength_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5m1617tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5m1617tl(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56793);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56794);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56795);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_getMaximumShortTextLength_Locale() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyw4ns17to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumShortTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyw4ns17to(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56796);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56797);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56798);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public void test_roundFloor_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rvn2v17tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rvn2v17tr(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56799);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56800);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56801);assertEquals(-120L, field.roundFloor(-61L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56802);assertEquals(-60L, field.roundFloor(-60L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56803);assertEquals(-60L, field.roundFloor(-59L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56804);assertEquals(-60L, field.roundFloor(-1L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56805);assertEquals(0L, field.roundFloor(0L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56806);assertEquals(0L, field.roundFloor(1L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56807);assertEquals(0L, field.roundFloor(29L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56808);assertEquals(0L, field.roundFloor(30L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56809);assertEquals(0L, field.roundFloor(31L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56810);assertEquals(60L, field.roundFloor(60L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_roundCeiling_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t61ifu17u3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t61ifu17u3(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56811);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56812);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56813);assertEquals(-60L, field.roundCeiling(-61L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56814);assertEquals(-60L, field.roundCeiling(-60L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56815);assertEquals(0L, field.roundCeiling(-59L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56816);assertEquals(0L, field.roundCeiling(-1L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56817);assertEquals(0L, field.roundCeiling(0L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56818);assertEquals(60L, field.roundCeiling(1L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56819);assertEquals(60L, field.roundCeiling(29L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56820);assertEquals(60L, field.roundCeiling(30L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56821);assertEquals(60L, field.roundCeiling(31L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56822);assertEquals(60L, field.roundCeiling(60L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_roundHalfFloor_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wvqu17uf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundHalfFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wvqu17uf(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56823);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56824);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56825);assertEquals(0L, field.roundHalfFloor(0L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56826);assertEquals(0L, field.roundHalfFloor(29L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56827);assertEquals(0L, field.roundHalfFloor(30L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56828);assertEquals(60L, field.roundHalfFloor(31L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56829);assertEquals(60L, field.roundHalfFloor(60L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_roundHalfCeiling_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182e0k917um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundHalfCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182e0k917um(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56830);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56831);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56832);assertEquals(0L, field.roundHalfCeiling(0L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56833);assertEquals(0L, field.roundHalfCeiling(29L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56834);assertEquals(60L, field.roundHalfCeiling(30L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56835);assertEquals(60L, field.roundHalfCeiling(31L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56836);assertEquals(60L, field.roundHalfCeiling(60L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_roundHalfEven_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd20a417ut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundHalfEven_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd20a417ut(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56837);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56838);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56839);assertEquals(0L, field.roundHalfEven(0L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56840);assertEquals(0L, field.roundHalfEven(29L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56841);assertEquals(0L, field.roundHalfEven(30L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56842);assertEquals(60L, field.roundHalfEven(31L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56843);assertEquals(60L, field.roundHalfEven(60L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56844);assertEquals(60L, field.roundHalfEven(89L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56845);assertEquals(120L, field.roundHalfEven(90L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56846);assertEquals(120L, field.roundHalfEven(91L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    public void test_remainder_long() {__CLR4_4_117mh17mhlc8azx73.R.globalSliceStart(getClass().getName(),56847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6jwja17v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117mh17mhlc8azx73.R.rethrow($CLV_t2$);}finally{__CLR4_4_117mh17mhlc8azx73.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_remainder_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6jwja17v3(){try{__CLR4_4_117mh17mhlc8azx73.R.inc(56847);
        __CLR4_4_117mh17mhlc8azx73.R.inc(56848);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_117mh17mhlc8azx73.R.inc(56849);assertEquals(0L, field.remainder(0L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56850);assertEquals(29L, field.remainder(29L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56851);assertEquals(30L, field.remainder(30L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56852);assertEquals(31L, field.remainder(31L));
        __CLR4_4_117mh17mhlc8azx73.R.inc(56853);assertEquals(0L, field.remainder(60L));
    }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockPreciseDateTimeField extends PreciseDateTimeField {
        protected MockPreciseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds(), 60),
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_117mh17mhlc8azx73.R.inc(56855);try{__CLR4_4_117mh17mhlc8azx73.R.inc(56854);
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_117mh17mhlc8azx73.R.inc(56857);try{__CLR4_4_117mh17mhlc8azx73.R.inc(56856);
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_117mh17mhlc8azx73.R.inc(56859);try{__CLR4_4_117mh17mhlc8azx73.R.inc(56858);
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56860);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56861);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56862);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56863);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_117mh17mhlc8azx73.R.inc(56865);try{__CLR4_4_117mh17mhlc8azx73.R.inc(56864);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56866);this.unit = unit;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56867);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56868);return true;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56869);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56870);return unit;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56871);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56872);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56873);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56874);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56875);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56876);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56877);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56878);add_int++;
            __CLR4_4_117mh17mhlc8azx73.R.inc(56879);return instant + (value * 60L);
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56880);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56881);add_long++;
            __CLR4_4_117mh17mhlc8azx73.R.inc(56882);return instant + (value * 60L);
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56883);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56884);difference_long++;
            __CLR4_4_117mh17mhlc8azx73.R.inc(56885);return 30;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_117mh17mhlc8azx73.R.inc(56887);try{__CLR4_4_117mh17mhlc8azx73.R.inc(56886);
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56888);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56889);return true;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56890);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56891);return 0;  // this is zero
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56892);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56893);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56894);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56895);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56896);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56897);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56898);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56899);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56900);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56901);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56902);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56903);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_117mh17mhlc8azx73.R.inc(56905);try{__CLR4_4_117mh17mhlc8azx73.R.inc(56904);
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56906);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56907);return false;  // this is false
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56908);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56909);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56910);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56911);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56912);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56913);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56914);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56915);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56916);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56917);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56918);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56919);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_117mh17mhlc8azx73.R.inc(56920);
            __CLR4_4_117mh17mhlc8azx73.R.inc(56921);return 0;
        }finally{__CLR4_4_117mh17mhlc8azx73.R.flushNeeded();}}
    }

}
