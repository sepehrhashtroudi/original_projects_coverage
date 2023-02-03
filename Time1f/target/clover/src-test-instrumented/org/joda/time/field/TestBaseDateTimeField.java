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

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for BaseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_116va16valc8azx3a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,55933,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_116va16valc8azx3a.R.inc(55558);
        __CLR4_4_116va16valc8azx3a.R.inc(55559);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_116va16valc8azx3a.R.inc(55560);
        __CLR4_4_116va16valc8azx3a.R.inc(55561);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_116va16valc8azx3a.R.inc(55563);try{__CLR4_4_116va16valc8azx3a.R.inc(55562);
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_116va16valc8azx3a.R.inc(55564);
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_116va16valc8azx3a.R.inc(55565);
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_constructor() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g16vi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g16vi(){try{__CLR4_4_116va16valc8azx3a.R.inc(55566);
        __CLR4_4_116va16valc8azx3a.R.inc(55567);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55568);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
        __CLR4_4_116va16valc8azx3a.R.inc(55569);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55570);field = new MockBaseDateTimeField(null);
            __CLR4_4_116va16valc8azx3a.R.inc(55571);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getType() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di16vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di16vo(){try{__CLR4_4_116va16valc8azx3a.R.inc(55572);
        __CLR4_4_116va16valc8azx3a.R.inc(55573);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay());
        __CLR4_4_116va16valc8azx3a.R.inc(55574);assertEquals(DateTimeFieldType.secondOfDay(), field.getType());
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getName() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k516vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k516vr(){try{__CLR4_4_116va16valc8azx3a.R.inc(55575);
        __CLR4_4_116va16valc8azx3a.R.inc(55576);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay());
        __CLR4_4_116va16valc8azx3a.R.inc(55577);assertEquals("secondOfDay", field.getName());
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_toString() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c016vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c016vu(){try{__CLR4_4_116va16valc8azx3a.R.inc(55578);
        __CLR4_4_116va16valc8azx3a.R.inc(55579);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay());
        __CLR4_4_116va16valc8azx3a.R.inc(55580);assertEquals("DateTimeField[secondOfDay]", field.toString());
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_isSupported() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe16vx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe16vx(){try{__CLR4_4_116va16valc8azx3a.R.inc(55581);
        __CLR4_4_116va16valc8azx3a.R.inc(55582);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55583);assertEquals(true, field.isSupported());
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_get() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oeyeo16w0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oeyeo16w0(){try{__CLR4_4_116va16valc8azx3a.R.inc(55584);
        __CLR4_4_116va16valc8azx3a.R.inc(55585);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55586);assertEquals(0, field.get(0));
        __CLR4_4_116va16valc8azx3a.R.inc(55587);assertEquals(1, field.get(60));
        __CLR4_4_116va16valc8azx3a.R.inc(55588);assertEquals(2, field.get(123));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getAsText_long_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdirgz16w5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdirgz16w5(){try{__CLR4_4_116va16valc8azx3a.R.inc(55589);
        __CLR4_4_116va16valc8azx3a.R.inc(55590);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55591);assertEquals("29", field.getAsText(60L * 29, Locale.ENGLISH));
        __CLR4_4_116va16valc8azx3a.R.inc(55592);assertEquals("29", field.getAsText(60L * 29, null));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getAsText_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3zd216w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3zd216w9(){try{__CLR4_4_116va16valc8azx3a.R.inc(55593);
        __CLR4_4_116va16valc8azx3a.R.inc(55594);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55595);assertEquals("29", field.getAsText(60L * 29));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getAsText_RP_int_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuft1h16wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuft1h16wc(){try{__CLR4_4_116va16valc8azx3a.R.inc(55596);
        __CLR4_4_116va16valc8azx3a.R.inc(55597);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55598);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_116va16valc8azx3a.R.inc(55599);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getAsText_RP_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ywid16wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ywid16wg(){try{__CLR4_4_116va16valc8azx3a.R.inc(55600);
        __CLR4_4_116va16valc8azx3a.R.inc(55601);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55602);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_116va16valc8azx3a.R.inc(55603);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getAsText_int_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd8ltk16wk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd8ltk16wk(){try{__CLR4_4_116va16valc8azx3a.R.inc(55604);
        __CLR4_4_116va16valc8azx3a.R.inc(55605);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55606);assertEquals("80", field.getAsText(80, Locale.ENGLISH));
        __CLR4_4_116va16valc8azx3a.R.inc(55607);assertEquals("80", field.getAsText(80, null));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getAsShortText_long_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loiikt16wo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loiikt16wo(){try{__CLR4_4_116va16valc8azx3a.R.inc(55608);
        __CLR4_4_116va16valc8azx3a.R.inc(55609);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55610);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH));
        __CLR4_4_116va16valc8azx3a.R.inc(55611);assertEquals("29", field.getAsShortText(60L * 29, null));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getAsShortText_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121lqfg16ws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121lqfg16ws(){try{__CLR4_4_116va16valc8azx3a.R.inc(55612);
        __CLR4_4_116va16valc8azx3a.R.inc(55613);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55614);assertEquals("29", field.getAsShortText(60L * 29));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getAsShortText_RP_int_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qtetb16wv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qtetb16wv(){try{__CLR4_4_116va16valc8azx3a.R.inc(55615);
        __CLR4_4_116va16valc8azx3a.R.inc(55616);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55617);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_116va16valc8azx3a.R.inc(55618);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getAsShortText_RP_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxyb9r16wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxyb9r16wz(){try{__CLR4_4_116va16valc8azx3a.R.inc(55619);
        __CLR4_4_116va16valc8azx3a.R.inc(55620);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55621);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_116va16valc8azx3a.R.inc(55622);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getAsShortText_int_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ntvlq16x3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ntvlq16x3(){try{__CLR4_4_116va16valc8azx3a.R.inc(55623);
        __CLR4_4_116va16valc8azx3a.R.inc(55624);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55625);assertEquals("80", field.getAsShortText(80, Locale.ENGLISH));
        __CLR4_4_116va16valc8azx3a.R.inc(55626);assertEquals("80", field.getAsShortText(80, null));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_add_long_int() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu16x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu16x7(){try{__CLR4_4_116va16valc8azx3a.R.inc(55627);
        __CLR4_4_116va16valc8azx3a.R.inc(55628);MockCountingDurationField.add_int = 0;
        __CLR4_4_116va16valc8azx3a.R.inc(55629);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55630);assertEquals(61, field.add(1L, 1));
        __CLR4_4_116va16valc8azx3a.R.inc(55631);assertEquals(1, MockCountingDurationField.add_int);
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_add_long_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl16xc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl16xc(){try{__CLR4_4_116va16valc8azx3a.R.inc(55632);
        __CLR4_4_116va16valc8azx3a.R.inc(55633);MockCountingDurationField.add_long = 0;
        __CLR4_4_116va16valc8azx3a.R.inc(55634);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55635);assertEquals(61, field.add(1L, 1L));
        __CLR4_4_116va16valc8azx3a.R.inc(55636);assertEquals(1, MockCountingDurationField.add_long);
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_add_RP_int_intarray_int() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06spl16xh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06spl16xh(){try{__CLR4_4_116va16valc8azx3a.R.inc(55637);
        __CLR4_4_116va16valc8azx3a.R.inc(55638);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55639);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55640);BaseDateTimeField field = new MockStandardBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55641);int[] result = field.add(new TimeOfDay(), 2, values, 0);
        __CLR4_4_116va16valc8azx3a.R.inc(55642);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55643);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55644);expected = new int[] {10, 20, 31, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55645);result = field.add(new TimeOfDay(), 2, values, 1);
        __CLR4_4_116va16valc8azx3a.R.inc(55646);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55647);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55648);expected = new int[] {10, 21, 0, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55649);result = field.add(new TimeOfDay(), 2, values, 30);
        __CLR4_4_116va16valc8azx3a.R.inc(55650);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55651);values = new int[] {23, 59, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55652);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55653);field.add(new TimeOfDay(), 2, values, 30);
            __CLR4_4_116va16valc8azx3a.R.inc(55654);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_116va16valc8azx3a.R.inc(55655);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55656);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55657);result = field.add(new TimeOfDay(), 2, values, -1);
        __CLR4_4_116va16valc8azx3a.R.inc(55658);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55659);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55660);expected = new int[] {10, 19, 59, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55661);result = field.add(new TimeOfDay(), 2, values, -31);
        __CLR4_4_116va16valc8azx3a.R.inc(55662);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55663);values = new int[] {0, 0, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55664);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55665);field.add(new TimeOfDay(), 2, values, -31);
            __CLR4_4_116va16valc8azx3a.R.inc(55666);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_116va16valc8azx3a.R.inc(55667);values = new int[] {0, 0};
        __CLR4_4_116va16valc8azx3a.R.inc(55668);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55669);field.add(new MockPartial(), 0, values, 1000);
            __CLR4_4_116va16valc8azx3a.R.inc(55670);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_116va16valc8azx3a.R.inc(55671);values = new int[] {1, 0};
        __CLR4_4_116va16valc8azx3a.R.inc(55672);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55673);field.add(new MockPartial(), 0, values, -1000);
            __CLR4_4_116va16valc8azx3a.R.inc(55674);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_addWrapField_long_int() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdicdy16yj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdicdy16yj(){try{__CLR4_4_116va16valc8azx3a.R.inc(55675);
        __CLR4_4_116va16valc8azx3a.R.inc(55676);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55677);assertEquals(1029, field.addWrapField(60L * 29, 0));
        __CLR4_4_116va16valc8azx3a.R.inc(55678);assertEquals(1059, field.addWrapField(60L * 29, 30));
        __CLR4_4_116va16valc8azx3a.R.inc(55679);assertEquals(1000, field.addWrapField(60L * 29, 31));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_addWrapField_RP_int_intarray_int() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdx7z16yo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdx7z16yo(){try{__CLR4_4_116va16valc8azx3a.R.inc(55680);
        __CLR4_4_116va16valc8azx3a.R.inc(55681);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55682);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55683);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55684);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
        __CLR4_4_116va16valc8azx3a.R.inc(55685);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55686);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55687);expected = new int[] {10, 20, 59, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55688);result = field.addWrapField(new TimeOfDay(), 2, values, 29);
        __CLR4_4_116va16valc8azx3a.R.inc(55689);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55690);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55691);expected = new int[] {10, 20, 0, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55692);result = field.addWrapField(new TimeOfDay(), 2, values, 30);
        __CLR4_4_116va16valc8azx3a.R.inc(55693);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55694);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55695);expected = new int[] {10, 20, 1, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55696);result = field.addWrapField(new TimeOfDay(), 2, values, 31);
        __CLR4_4_116va16valc8azx3a.R.inc(55697);assertEquals(true, Arrays.equals(result, expected));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDifference_long_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fh4q516z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifference_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fh4q516z6(){try{__CLR4_4_116va16valc8azx3a.R.inc(55698);
        __CLR4_4_116va16valc8azx3a.R.inc(55699);MockCountingDurationField.difference_long = 0;
        __CLR4_4_116va16valc8azx3a.R.inc(55700);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55701);assertEquals(30, field.getDifference(0L, 0L));
        __CLR4_4_116va16valc8azx3a.R.inc(55702);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getDifferenceAsLong_long_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m25716zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m25716zb(){try{__CLR4_4_116va16valc8azx3a.R.inc(55703);
        __CLR4_4_116va16valc8azx3a.R.inc(55704);MockCountingDurationField.difference_long = 0;
        __CLR4_4_116va16valc8azx3a.R.inc(55705);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55706);assertEquals(30, field.getDifferenceAsLong(0L, 0L));
        __CLR4_4_116va16valc8azx3a.R.inc(55707);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_set_long_int() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rinawz16zg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rinawz16zg(){try{__CLR4_4_116va16valc8azx3a.R.inc(55708);
        __CLR4_4_116va16valc8azx3a.R.inc(55709);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55710);assertEquals(1000, field.set(0L, 0));
        __CLR4_4_116va16valc8azx3a.R.inc(55711);assertEquals(1029, field.set(0L, 29));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_set_RP_int_intarray_int() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c085k16zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c085k16zk(){try{__CLR4_4_116va16valc8azx3a.R.inc(55712);
        __CLR4_4_116va16valc8azx3a.R.inc(55713);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55714);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55715);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55716);int[] result = field.set(new TimeOfDay(), 2, values, 30);
        __CLR4_4_116va16valc8azx3a.R.inc(55717);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55718);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55719);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55720);result = field.set(new TimeOfDay(), 2, values, 29);
        __CLR4_4_116va16valc8azx3a.R.inc(55721);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55722);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55723);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55724);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55725);field.set(new TimeOfDay(), 2, values, 60);
            __CLR4_4_116va16valc8azx3a.R.inc(55726);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116va16valc8azx3a.R.inc(55727);assertEquals(true, Arrays.equals(values, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55728);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55729);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55730);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55731);field.set(new TimeOfDay(), 2, values, -1);
            __CLR4_4_116va16valc8azx3a.R.inc(55732);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116va16valc8azx3a.R.inc(55733);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_set_long_String_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481lrq1706();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481lrq1706(){try{__CLR4_4_116va16valc8azx3a.R.inc(55734);
        __CLR4_4_116va16valc8azx3a.R.inc(55735);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55736);assertEquals(1000, field.set(0L, "0", null));
        __CLR4_4_116va16valc8azx3a.R.inc(55737);assertEquals(1029, field.set(0L, "29", Locale.ENGLISH));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_set_long_String() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o1z69170a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o1z69170a(){try{__CLR4_4_116va16valc8azx3a.R.inc(55738);
        __CLR4_4_116va16valc8azx3a.R.inc(55739);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55740);assertEquals(1000, field.set(0L, "0"));
        __CLR4_4_116va16valc8azx3a.R.inc(55741);assertEquals(1029, field.set(0L, "29"));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_set_RP_int_intarray_String_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j885c1170e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j885c1170e(){try{__CLR4_4_116va16valc8azx3a.R.inc(55742);
        __CLR4_4_116va16valc8azx3a.R.inc(55743);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55744);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55745);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55746);int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
        __CLR4_4_116va16valc8azx3a.R.inc(55747);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55748);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55749);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55750);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
        __CLR4_4_116va16valc8azx3a.R.inc(55751);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55752);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55753);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55754);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55755);field.set(new TimeOfDay(), 2, values, "60", null);
            __CLR4_4_116va16valc8azx3a.R.inc(55756);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116va16valc8azx3a.R.inc(55757);assertEquals(true, Arrays.equals(values, expected));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55758);values = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55759);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_116va16valc8azx3a.R.inc(55760);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55761);field.set(new TimeOfDay(), 2, values, "-1", null);
            __CLR4_4_116va16valc8azx3a.R.inc(55762);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116va16valc8azx3a.R.inc(55763);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_convertText() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj2ptm1710();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_convertText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj2ptm1710(){try{__CLR4_4_116va16valc8azx3a.R.inc(55764);
        __CLR4_4_116va16valc8azx3a.R.inc(55765);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55766);assertEquals(0, field.convertText("0", null));
        __CLR4_4_116va16valc8azx3a.R.inc(55767);assertEquals(29, field.convertText("29", null));
        __CLR4_4_116va16valc8azx3a.R.inc(55768);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55769);field.convertText("2A", null);
            __CLR4_4_116va16valc8azx3a.R.inc(55770);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116va16valc8azx3a.R.inc(55771);try {
            __CLR4_4_116va16valc8azx3a.R.inc(55772);field.convertText(null, null);
            __CLR4_4_116va16valc8azx3a.R.inc(55773);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    public void test_isLeap_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu5r3x171a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isLeap_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu5r3x171a(){try{__CLR4_4_116va16valc8azx3a.R.inc(55774);
        __CLR4_4_116va16valc8azx3a.R.inc(55775);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55776);assertEquals(false, field.isLeap(0L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getLeapAmount_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4dic9171d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapAmount_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4dic9171d(){try{__CLR4_4_116va16valc8azx3a.R.inc(55777);
        __CLR4_4_116va16valc8azx3a.R.inc(55778);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55779);assertEquals(0, field.getLeapAmount(0L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getLeapDurationField() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1geo4171g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapDurationField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1geo4171g(){try{__CLR4_4_116va16valc8azx3a.R.inc(55780);
        __CLR4_4_116va16valc8azx3a.R.inc(55781);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55782);assertEquals(null, field.getLeapDurationField());
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMinimumValue() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1f2p9171j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1f2p9171j(){try{__CLR4_4_116va16valc8azx3a.R.inc(55783);
        __CLR4_4_116va16valc8azx3a.R.inc(55784);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55785);assertEquals(0, field.getMinimumValue());
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getMinimumValue_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyk6171m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyk6171m(){try{__CLR4_4_116va16valc8azx3a.R.inc(55786);
        __CLR4_4_116va16valc8azx3a.R.inc(55787);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55788);assertEquals(0, field.getMinimumValue(0L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getMinimumValue_RP() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfeiw171p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfeiw171p(){try{__CLR4_4_116va16valc8azx3a.R.inc(55789);
        __CLR4_4_116va16valc8azx3a.R.inc(55790);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55791);assertEquals(0, field.getMinimumValue(new TimeOfDay()));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getMinimumValue_RP_intarray() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz5kov171s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz5kov171s(){try{__CLR4_4_116va16valc8azx3a.R.inc(55792);
        __CLR4_4_116va16valc8azx3a.R.inc(55793);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55794);assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getMaximumValue() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzocf171v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzocf171v(){try{__CLR4_4_116va16valc8azx3a.R.inc(55795);
        __CLR4_4_116va16valc8azx3a.R.inc(55796);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55797);assertEquals(59, field.getMaximumValue());
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getMaximumValue_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk6lzc171y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk6lzc171y(){try{__CLR4_4_116va16valc8azx3a.R.inc(55798);
        __CLR4_4_116va16valc8azx3a.R.inc(55799);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55800);assertEquals(59, field.getMaximumValue(0L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getMaximumValue_RP() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pndze1721();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pndze1721(){try{__CLR4_4_116va16valc8azx3a.R.inc(55801);
        __CLR4_4_116va16valc8azx3a.R.inc(55802);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55803);assertEquals(59, field.getMaximumValue(new TimeOfDay()));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getMaximumValue_RP_intarray() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2tg31724();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2tg31724(){try{__CLR4_4_116va16valc8azx3a.R.inc(55804);
        __CLR4_4_116va16valc8azx3a.R.inc(55805);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55806);assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMaximumTextLength_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5m161727();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5m161727(){try{__CLR4_4_116va16valc8azx3a.R.inc(55807);
        __CLR4_4_116va16valc8azx3a.R.inc(55808);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55809);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_116va16valc8azx3a.R.inc(55810);field = new MockBaseDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_116va16valc8azx3a.R.inc(55811);
                __CLR4_4_116va16valc8azx3a.R.inc(55812);return 5;
            }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        };
        __CLR4_4_116va16valc8azx3a.R.inc(55813);assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55814);field = new MockBaseDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_116va16valc8azx3a.R.inc(55815);
                __CLR4_4_116va16valc8azx3a.R.inc(55816);return 555;
            }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        };
        __CLR4_4_116va16valc8azx3a.R.inc(55817);assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55818);field = new MockBaseDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_116va16valc8azx3a.R.inc(55819);
                __CLR4_4_116va16valc8azx3a.R.inc(55820);return 5555;
            }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        };
        __CLR4_4_116va16valc8azx3a.R.inc(55821);assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));
        
        __CLR4_4_116va16valc8azx3a.R.inc(55822);field = new MockBaseDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_116va16valc8azx3a.R.inc(55823);
                __CLR4_4_116va16valc8azx3a.R.inc(55824);return -1;
            }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        };
        __CLR4_4_116va16valc8azx3a.R.inc(55825);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_getMaximumShortTextLength_Locale() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyw4ns172q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumShortTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyw4ns172q(){try{__CLR4_4_116va16valc8azx3a.R.inc(55826);
        __CLR4_4_116va16valc8azx3a.R.inc(55827);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55828);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public void test_roundFloor_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rvn2v172t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rvn2v172t(){try{__CLR4_4_116va16valc8azx3a.R.inc(55829);
        __CLR4_4_116va16valc8azx3a.R.inc(55830);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55831);assertEquals(0L, field.roundFloor(0L));
        __CLR4_4_116va16valc8azx3a.R.inc(55832);assertEquals(0L, field.roundFloor(29L));
        __CLR4_4_116va16valc8azx3a.R.inc(55833);assertEquals(0L, field.roundFloor(30L));
        __CLR4_4_116va16valc8azx3a.R.inc(55834);assertEquals(0L, field.roundFloor(31L));
        __CLR4_4_116va16valc8azx3a.R.inc(55835);assertEquals(60L, field.roundFloor(60L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_roundCeiling_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t61ifu1730();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t61ifu1730(){try{__CLR4_4_116va16valc8azx3a.R.inc(55836);
        __CLR4_4_116va16valc8azx3a.R.inc(55837);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55838);assertEquals(0L, field.roundCeiling(0L));
        __CLR4_4_116va16valc8azx3a.R.inc(55839);assertEquals(60L, field.roundCeiling(29L));
        __CLR4_4_116va16valc8azx3a.R.inc(55840);assertEquals(60L, field.roundCeiling(30L));
        __CLR4_4_116va16valc8azx3a.R.inc(55841);assertEquals(60L, field.roundCeiling(31L));
        __CLR4_4_116va16valc8azx3a.R.inc(55842);assertEquals(60L, field.roundCeiling(60L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_roundHalfFloor_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wvqu1737();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wvqu1737(){try{__CLR4_4_116va16valc8azx3a.R.inc(55843);
        __CLR4_4_116va16valc8azx3a.R.inc(55844);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55845);assertEquals(0L, field.roundHalfFloor(0L));
        __CLR4_4_116va16valc8azx3a.R.inc(55846);assertEquals(0L, field.roundHalfFloor(29L));
        __CLR4_4_116va16valc8azx3a.R.inc(55847);assertEquals(0L, field.roundHalfFloor(30L));
        __CLR4_4_116va16valc8azx3a.R.inc(55848);assertEquals(60L, field.roundHalfFloor(31L));
        __CLR4_4_116va16valc8azx3a.R.inc(55849);assertEquals(60L, field.roundHalfFloor(60L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_roundHalfCeiling_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182e0k9173e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182e0k9173e(){try{__CLR4_4_116va16valc8azx3a.R.inc(55850);
        __CLR4_4_116va16valc8azx3a.R.inc(55851);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55852);assertEquals(0L, field.roundHalfCeiling(0L));
        __CLR4_4_116va16valc8azx3a.R.inc(55853);assertEquals(0L, field.roundHalfCeiling(29L));
        __CLR4_4_116va16valc8azx3a.R.inc(55854);assertEquals(60L, field.roundHalfCeiling(30L));
        __CLR4_4_116va16valc8azx3a.R.inc(55855);assertEquals(60L, field.roundHalfCeiling(31L));
        __CLR4_4_116va16valc8azx3a.R.inc(55856);assertEquals(60L, field.roundHalfCeiling(60L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_roundHalfEven_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd20a4173l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfEven_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd20a4173l(){try{__CLR4_4_116va16valc8azx3a.R.inc(55857);
        __CLR4_4_116va16valc8azx3a.R.inc(55858);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55859);assertEquals(0L, field.roundHalfEven(0L));
        __CLR4_4_116va16valc8azx3a.R.inc(55860);assertEquals(0L, field.roundHalfEven(29L));
        __CLR4_4_116va16valc8azx3a.R.inc(55861);assertEquals(0L, field.roundHalfEven(30L));
        __CLR4_4_116va16valc8azx3a.R.inc(55862);assertEquals(60L, field.roundHalfEven(31L));
        __CLR4_4_116va16valc8azx3a.R.inc(55863);assertEquals(60L, field.roundHalfEven(60L));
        __CLR4_4_116va16valc8azx3a.R.inc(55864);assertEquals(60L, field.roundHalfEven(89L));
        __CLR4_4_116va16valc8azx3a.R.inc(55865);assertEquals(120L, field.roundHalfEven(90L));
        __CLR4_4_116va16valc8azx3a.R.inc(55866);assertEquals(120L, field.roundHalfEven(91L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    public void test_remainder_long() {__CLR4_4_116va16valc8azx3a.R.globalSliceStart(getClass().getName(),55867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6jwja173v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116va16valc8azx3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_116va16valc8azx3a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_remainder_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6jwja173v(){try{__CLR4_4_116va16valc8azx3a.R.inc(55867);
        __CLR4_4_116va16valc8azx3a.R.inc(55868);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_116va16valc8azx3a.R.inc(55869);assertEquals(0L, field.remainder(0L));
        __CLR4_4_116va16valc8azx3a.R.inc(55870);assertEquals(29L, field.remainder(29L));
        __CLR4_4_116va16valc8azx3a.R.inc(55871);assertEquals(30L, field.remainder(30L));
        __CLR4_4_116va16valc8azx3a.R.inc(55872);assertEquals(31L, field.remainder(31L));
        __CLR4_4_116va16valc8azx3a.R.inc(55873);assertEquals(0L, field.remainder(60L));
    }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockBaseDateTimeField extends BaseDateTimeField {
        protected MockBaseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_116va16valc8azx3a.R.inc(55875);try{__CLR4_4_116va16valc8azx3a.R.inc(55874);
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_116va16valc8azx3a.R.inc(55877);try{__CLR4_4_116va16valc8azx3a.R.inc(55876);
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_116va16valc8azx3a.R.inc(55878);
            __CLR4_4_116va16valc8azx3a.R.inc(55879);return (int) (instant / 60L);
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_116va16valc8azx3a.R.inc(55880);
            __CLR4_4_116va16valc8azx3a.R.inc(55881);return 1000 + value;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_116va16valc8azx3a.R.inc(55882);
            __CLR4_4_116va16valc8azx3a.R.inc(55883);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_116va16valc8azx3a.R.inc(55884);
            __CLR4_4_116va16valc8azx3a.R.inc(55885);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_116va16valc8azx3a.R.inc(55886);
            __CLR4_4_116va16valc8azx3a.R.inc(55887);return 0;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_116va16valc8azx3a.R.inc(55888);
            __CLR4_4_116va16valc8azx3a.R.inc(55889);return 59;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_116va16valc8azx3a.R.inc(55890);
            __CLR4_4_116va16valc8azx3a.R.inc(55891);return (instant / 60L) * 60L;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_116va16valc8azx3a.R.inc(55892);
            __CLR4_4_116va16valc8azx3a.R.inc(55893);return false;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_116va16valc8azx3a.R.inc(55895);try{__CLR4_4_116va16valc8azx3a.R.inc(55894);
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_116va16valc8azx3a.R.inc(55896);
            __CLR4_4_116va16valc8azx3a.R.inc(55897);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_116va16valc8azx3a.R.inc(55898);
            __CLR4_4_116va16valc8azx3a.R.inc(55899);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_116va16valc8azx3a.R.inc(55901);try{__CLR4_4_116va16valc8azx3a.R.inc(55900);
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_116va16valc8azx3a.R.inc(55902);
            __CLR4_4_116va16valc8azx3a.R.inc(55903);return false;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_116va16valc8azx3a.R.inc(55904);
            __CLR4_4_116va16valc8azx3a.R.inc(55905);return 0;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_116va16valc8azx3a.R.inc(55906);
            __CLR4_4_116va16valc8azx3a.R.inc(55907);return 0;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_116va16valc8azx3a.R.inc(55908);
            __CLR4_4_116va16valc8azx3a.R.inc(55909);return 0;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_116va16valc8azx3a.R.inc(55910);
            __CLR4_4_116va16valc8azx3a.R.inc(55911);return 0;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_116va16valc8azx3a.R.inc(55912);
            __CLR4_4_116va16valc8azx3a.R.inc(55913);add_int++;
            __CLR4_4_116va16valc8azx3a.R.inc(55914);return instant + (value * 60L);
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_116va16valc8azx3a.R.inc(55915);
            __CLR4_4_116va16valc8azx3a.R.inc(55916);add_long++;
            __CLR4_4_116va16valc8azx3a.R.inc(55917);return instant + (value * 60L);
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_116va16valc8azx3a.R.inc(55918);
            __CLR4_4_116va16valc8azx3a.R.inc(55919);difference_long++;
            __CLR4_4_116va16valc8azx3a.R.inc(55920);return 30;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_116va16valc8azx3a.R.inc(55921);
            __CLR4_4_116va16valc8azx3a.R.inc(55922);if ((((index == 0)&&(__CLR4_4_116va16valc8azx3a.R.iget(55923)!=0|true))||(__CLR4_4_116va16valc8azx3a.R.iget(55924)==0&false))) {{
                __CLR4_4_116va16valc8azx3a.R.inc(55925);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_116va16valc8azx3a.R.inc(55926);if ((((index == 1)&&(__CLR4_4_116va16valc8azx3a.R.iget(55927)!=0|true))||(__CLR4_4_116va16valc8azx3a.R.iget(55928)==0&false))) {{
                __CLR4_4_116va16valc8azx3a.R.inc(55929);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_116va16valc8azx3a.R.inc(55930);return null;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        public int size() {try{__CLR4_4_116va16valc8azx3a.R.inc(55931);
            __CLR4_4_116va16valc8azx3a.R.inc(55932);return 2;
        }finally{__CLR4_4_116va16valc8azx3a.R.flushNeeded();}}
        
    }
}
