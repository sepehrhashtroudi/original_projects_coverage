/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationField.
 *
 * @author Stephen Colebourne
 */
public class TestScaledDurationField extends TestCase {static class __CLR4_4_118cf18cflc8azx9a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,57632,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_118cf18cflc8azx9a.R.inc(57471);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57472);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_118cf18cflc8azx9a.R.inc(57473);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57474);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_118cf18cflc8azx9a.R.inc(57476);try{__CLR4_4_118cf18cflc8azx9a.R.inc(57475);
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_118cf18cflc8azx9a.R.inc(57477);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57478);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_118cf18cflc8azx9a.R.inc(57479);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_118cf18cflc8azx9a.R.inc(57480);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57481);iField = null;
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_constructor() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g18cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g18cq(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57482);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57483);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57484);new ScaledDurationField(null, DurationFieldType.minutes(), 10);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57485);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118cf18cflc8azx9a.R.inc(57486);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57487);new ScaledDurationField(MillisDurationField.INSTANCE, null, 10);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57488);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118cf18cflc8azx9a.R.inc(57489);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57490);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 0);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57491);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118cf18cflc8azx9a.R.inc(57492);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57493);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 1);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57494);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getScalar() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19j0jks18d3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getScalar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19j0jks18d3(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57495);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57496);assertEquals(90, iField.getScalar());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getType() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di18d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di18d5(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57497);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57498);assertEquals(DurationFieldType.minutes(), iField.getType());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getName() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k518d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k518d7(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57499);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57500);assertEquals("minutes", iField.getName());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}
    
    public void test_isSupported() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe18d9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe18d9(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57501);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57502);assertEquals(true, iField.isSupported());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_isPrecise() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u71yjv18db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_isPrecise",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u71yjv18db(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57503);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57504);assertEquals(true, iField.isPrecise());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getUnitMillis() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148duee18dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getUnitMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148duee18dd(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57505);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57506);assertEquals(90, iField.getUnitMillis());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_toString() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c018df();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c018df(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57507);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57508);assertEquals("DurationField[minutes]", iField.toString());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getValue_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8q16i18dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8q16i18dh(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57509);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57510);assertEquals(0, iField.getValue(0L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57511);assertEquals(12345678 / 90, iField.getValue(12345678L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57512);assertEquals(-1234 / 90, iField.getValue(-1234L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57513);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57514);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57515);iField.getValue(LONG_INTEGER_MAX + 1L);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57516);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getValueAsLong_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi2whg18dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi2whg18dp(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57517);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57518);assertEquals(0L, iField.getValueAsLong(0L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57519);assertEquals(12345678L / 90, iField.getValueAsLong(12345678L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57520);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57521);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L));
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getValue_long_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8wtf318du();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8wtf318du(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57522);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57523);assertEquals(0, iField.getValue(0L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57524);assertEquals(12345678 / 90, iField.getValue(12345678L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57525);assertEquals(-1234 / 90, iField.getValue(-1234L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57526);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57527);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57528);iField.getValue(LONG_INTEGER_MAX + 1L, 567L);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57529);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getValueAsLong_long_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8t4kj18e2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8t4kj18e2(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57530);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57531);assertEquals(0L, iField.getValueAsLong(0L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57532);assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57533);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57534);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L));
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMillis_int() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xyqi18e7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xyqi18e7(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57535);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57536);assertEquals(0, iField.getMillis(0));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57537);assertEquals(1234L * 90L, iField.getMillis(1234));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57538);assertEquals(-1234L * 90L, iField.getMillis(-1234));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57539);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX));
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getMillis_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njwor118ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njwor118ec(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57540);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57541);assertEquals(0L, iField.getMillis(0L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57542);assertEquals(1234L * 90L, iField.getMillis(1234L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57543);assertEquals(-1234L * 90L, iField.getMillis(-1234L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57544);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57545);iField.getMillis(LONG_MAX);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57546);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getMillis_int_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hp1zp918ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hp1zp918ej(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57547);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57548);assertEquals(0L, iField.getMillis(0, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57549);assertEquals(1234L * 90L, iField.getMillis(1234, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57550);assertEquals(-1234L * 90L, iField.getMillis(-1234, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57551);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX, 567L));
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getMillis_long_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nakswm18eo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nakswm18eo(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57552);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57553);assertEquals(0L, iField.getMillis(0L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57554);assertEquals(1234L * 90L, iField.getMillis(1234L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57555);assertEquals(-1234L * 90L, iField.getMillis(-1234L, 567L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57556);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57557);iField.getMillis(LONG_MAX, 567L);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57558);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_add_long_int() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu18ev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu18ev(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57559);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57560);assertEquals(567L, iField.add(567L, 0));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57561);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57562);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57563);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57564);iField.add(LONG_MAX, 1);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57565);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_add_long_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl18f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl18f2(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57566);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57567);assertEquals(567L, iField.add(567L, 0L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57568);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57569);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57570);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57571);iField.add(LONG_MAX, 1L);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57572);fail();
        } catch (ArithmeticException ex) {}
        __CLR4_4_118cf18cflc8azx9a.R.inc(57573);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57574);iField.add(1L, LONG_MAX);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57575);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDifference_long_int() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5edd818fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifference_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5edd818fc(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57576);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57577);assertEquals(0, iField.getDifference(1L, 0L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57578);assertEquals(567, iField.getDifference(567L * 90L, 0L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57579);assertEquals(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57580);assertEquals(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57581);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57582);iField.getDifference(LONG_MAX, -1L);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57583);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_getDifferenceAsLong_long_long() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m25718fk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m25718fk(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57584);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57585);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57586);assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57587);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57588);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57589);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57590);iField.getDifferenceAsLong(LONG_MAX, -1L);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57591);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_equals() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vrzfx18fs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_equals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vrzfx18fs(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57592);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57593);assertEquals(true, iField.equals(iField));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57594);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes()));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57595);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57596);assertEquals(false, iField.equals(dummy));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57597);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57598);assertEquals(true, iField.equals(dummy));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57599);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57600);assertEquals(false, iField.equals(dummy));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57601);assertEquals(false, iField.equals(""));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57602);assertEquals(false, iField.equals(null));
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    public void test_hashCode() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4dyzz18g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_hashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4dyzz18g3(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57603);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57604);assertEquals(iField.hashCode(), iField.hashCode());
        __CLR4_4_118cf18cflc8azx9a.R.inc(57605);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode());
        __CLR4_4_118cf18cflc8azx9a.R.inc(57606);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57607);assertEquals(false, iField.hashCode() == dummy.hashCode());
        __CLR4_4_118cf18cflc8azx9a.R.inc(57608);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57609);assertEquals(true, iField.hashCode() == dummy.hashCode());
        __CLR4_4_118cf18cflc8azx9a.R.inc(57610);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57611);assertEquals(false, iField.hashCode() == dummy.hashCode());
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_compareTo() {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s61q2u18gc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_compareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s61q2u18gc(){try{__CLR4_4_118cf18cflc8azx9a.R.inc(57612);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57613);assertEquals(0, iField.compareTo(iField));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57614);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes()));
        __CLR4_4_118cf18cflc8azx9a.R.inc(57615);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57616);assertEquals(1, iField.compareTo(dummy));
//        try {
//            iField.compareTo("");
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_118cf18cflc8azx9a.R.inc(57617);try {
            __CLR4_4_118cf18cflc8azx9a.R.inc(57618);iField.compareTo(null);
            __CLR4_4_118cf18cflc8azx9a.R.inc(57619);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_118cf18cflc8azx9a.R.globalSliceStart(getClass().getName(),57620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on918gk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cf18cflc8azx9a.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cf18cflc8azx9a.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on918gk() throws Exception{try{__CLR4_4_118cf18cflc8azx9a.R.inc(57620);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57621);DurationField test = iField;
        
        __CLR4_4_118cf18cflc8azx9a.R.inc(57622);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_118cf18cflc8azx9a.R.inc(57623);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57624);oos.writeObject(test);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57625);byte[] bytes = baos.toByteArray();
        __CLR4_4_118cf18cflc8azx9a.R.inc(57626);oos.close();
        
        __CLR4_4_118cf18cflc8azx9a.R.inc(57627);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57628);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_118cf18cflc8azx9a.R.inc(57629);DurationField result = (DurationField) ois.readObject();
        __CLR4_4_118cf18cflc8azx9a.R.inc(57630);ois.close();
        
        __CLR4_4_118cf18cflc8azx9a.R.inc(57631);assertEquals(test, result);
    }finally{__CLR4_4_118cf18cflc8azx9a.R.flushNeeded();}}

}
