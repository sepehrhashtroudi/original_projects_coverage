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
public class TestPreciseDurationField extends TestCase {static class __CLR4_4_1188a188alc8azx8s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,57471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1188a188alc8azx8s.R.inc(57322);
        __CLR4_4_1188a188alc8azx8s.R.inc(57323);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1188a188alc8azx8s.R.inc(57324);
        __CLR4_4_1188a188alc8azx8s.R.inc(57325);return new TestSuite(TestPreciseDurationField.class);
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public TestPreciseDurationField(String name) {
        super(name);__CLR4_4_1188a188alc8azx8s.R.inc(57327);try{__CLR4_4_1188a188alc8azx8s.R.inc(57326);
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1188a188alc8azx8s.R.inc(57328);
        __CLR4_4_1188a188alc8azx8s.R.inc(57329);iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1188a188alc8azx8s.R.inc(57330);
        __CLR4_4_1188a188alc8azx8s.R.inc(57331);iField = null;
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_constructor() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g188k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g188k(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57332);
        __CLR4_4_1188a188alc8azx8s.R.inc(57333);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57334);new PreciseDurationField(null, 10);
            __CLR4_4_1188a188alc8azx8s.R.inc(57335);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getType() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di188o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di188o(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57336);
        __CLR4_4_1188a188alc8azx8s.R.inc(57337);assertEquals(DurationFieldType.seconds(), iField.getType());
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getName() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k5188q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k5188q(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57338);
        __CLR4_4_1188a188alc8azx8s.R.inc(57339);assertEquals("seconds", iField.getName());
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}
    
    public void test_isSupported() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe188s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe188s(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57340);
        __CLR4_4_1188a188alc8azx8s.R.inc(57341);assertEquals(true, iField.isSupported());
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_isPrecise() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u71yjv188u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isPrecise",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u71yjv188u(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57342);
        __CLR4_4_1188a188alc8azx8s.R.inc(57343);assertEquals(true, iField.isPrecise());
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getUnitMillis() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148duee188w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getUnitMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148duee188w(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57344);
        __CLR4_4_1188a188alc8azx8s.R.inc(57345);assertEquals(1000, iField.getUnitMillis());
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_toString() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c0188y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c0188y(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57346);
        __CLR4_4_1188a188alc8azx8s.R.inc(57347);assertEquals("DurationField[seconds]", iField.toString());
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getValue_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8q16i1890();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8q16i1890(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57348);
        __CLR4_4_1188a188alc8azx8s.R.inc(57349);assertEquals(0, iField.getValue(0L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57350);assertEquals(12345, iField.getValue(12345678L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57351);assertEquals(-1, iField.getValue(-1234L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57352);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57353);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57354);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L);
            __CLR4_4_1188a188alc8azx8s.R.inc(57355);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getValueAsLong_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi2whg1898();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi2whg1898(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57356);
        __CLR4_4_1188a188alc8azx8s.R.inc(57357);assertEquals(0L, iField.getValueAsLong(0L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57358);assertEquals(12345L, iField.getValueAsLong(12345678L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57359);assertEquals(-1L, iField.getValueAsLong(-1234L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57360);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L));
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getValue_long_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8wtf3189d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8wtf3189d(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57361);
        __CLR4_4_1188a188alc8azx8s.R.inc(57362);assertEquals(0, iField.getValue(0L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57363);assertEquals(12345, iField.getValue(12345678L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57364);assertEquals(-1, iField.getValue(-1234L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57365);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57366);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57367);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L);
            __CLR4_4_1188a188alc8azx8s.R.inc(57368);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getValueAsLong_long_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8t4kj189l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8t4kj189l(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57369);
        __CLR4_4_1188a188alc8azx8s.R.inc(57370);assertEquals(0L, iField.getValueAsLong(0L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57371);assertEquals(12345L, iField.getValueAsLong(12345678L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57372);assertEquals(-1L, iField.getValueAsLong(-1234L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57373);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L, 567L));
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMillis_int() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xyqi189q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xyqi189q(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57374);
        __CLR4_4_1188a188alc8azx8s.R.inc(57375);assertEquals(0, iField.getMillis(0));
        __CLR4_4_1188a188alc8azx8s.R.inc(57376);assertEquals(1234000L, iField.getMillis(1234));
        __CLR4_4_1188a188alc8azx8s.R.inc(57377);assertEquals(-1234000L, iField.getMillis(-1234));
        __CLR4_4_1188a188alc8azx8s.R.inc(57378);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX));
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getMillis_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njwor1189v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njwor1189v(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57379);
        __CLR4_4_1188a188alc8azx8s.R.inc(57380);assertEquals(0L, iField.getMillis(0L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57381);assertEquals(1234000L, iField.getMillis(1234L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57382);assertEquals(-1234000L, iField.getMillis(-1234L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57383);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57384);iField.getMillis(LONG_MAX);
            __CLR4_4_1188a188alc8azx8s.R.inc(57385);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getMillis_int_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hp1zp918a2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hp1zp918a2(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57386);
        __CLR4_4_1188a188alc8azx8s.R.inc(57387);assertEquals(0L, iField.getMillis(0, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57388);assertEquals(1234000L, iField.getMillis(1234, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57389);assertEquals(-1234000L, iField.getMillis(-1234, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57390);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX, 567L));
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getMillis_long_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nakswm18a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nakswm18a7(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57391);
        __CLR4_4_1188a188alc8azx8s.R.inc(57392);assertEquals(0L, iField.getMillis(0L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57393);assertEquals(1234000L, iField.getMillis(1234L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57394);assertEquals(-1234000L, iField.getMillis(-1234L, 567L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57395);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57396);iField.getMillis(LONG_MAX, 567L);
            __CLR4_4_1188a188alc8azx8s.R.inc(57397);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_add_long_int() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu18ae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu18ae(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57398);
        __CLR4_4_1188a188alc8azx8s.R.inc(57399);assertEquals(567L, iField.add(567L, 0));
        __CLR4_4_1188a188alc8azx8s.R.inc(57400);assertEquals(567L + 1234000L, iField.add(567L, 1234));
        __CLR4_4_1188a188alc8azx8s.R.inc(57401);assertEquals(567L - 1234000L, iField.add(567L, -1234));
        __CLR4_4_1188a188alc8azx8s.R.inc(57402);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57403);iField.add(LONG_MAX, 1);
            __CLR4_4_1188a188alc8azx8s.R.inc(57404);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_add_long_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl18al();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl18al(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57405);
        __CLR4_4_1188a188alc8azx8s.R.inc(57406);assertEquals(567L, iField.add(567L, 0L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57407);assertEquals(567L + 1234000L, iField.add(567L, 1234L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57408);assertEquals(567L - 1234000L, iField.add(567L, -1234L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57409);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57410);iField.add(LONG_MAX, 1L);
            __CLR4_4_1188a188alc8azx8s.R.inc(57411);fail();
        } catch (ArithmeticException ex) {}
        __CLR4_4_1188a188alc8azx8s.R.inc(57412);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57413);iField.add(1L, LONG_MAX);
            __CLR4_4_1188a188alc8azx8s.R.inc(57414);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDifference_long_int() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5edd818av();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifference_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5edd818av(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57415);
        __CLR4_4_1188a188alc8azx8s.R.inc(57416);assertEquals(0, iField.getDifference(1L, 0L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57417);assertEquals(567, iField.getDifference(567000L, 0L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57418);assertEquals(567 - 1234, iField.getDifference(567000L, 1234000L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57419);assertEquals(567 + 1234, iField.getDifference(567000L, -1234000L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57420);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57421);iField.getDifference(LONG_MAX, -1L);
            __CLR4_4_1188a188alc8azx8s.R.inc(57422);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_getDifferenceAsLong_long_long() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m25718b3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m25718b3(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57423);
        __CLR4_4_1188a188alc8azx8s.R.inc(57424);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57425);assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57426);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57427);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L));
        __CLR4_4_1188a188alc8azx8s.R.inc(57428);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57429);iField.getDifferenceAsLong(LONG_MAX, -1L);
            __CLR4_4_1188a188alc8azx8s.R.inc(57430);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_equals() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vrzfx18bb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_equals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vrzfx18bb(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57431);
        __CLR4_4_1188a188alc8azx8s.R.inc(57432);assertEquals(true, iField.equals(iField));
        __CLR4_4_1188a188alc8azx8s.R.inc(57433);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes()));
        __CLR4_4_1188a188alc8azx8s.R.inc(57434);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0);
        __CLR4_4_1188a188alc8azx8s.R.inc(57435);assertEquals(false, iField.equals(dummy));
        __CLR4_4_1188a188alc8azx8s.R.inc(57436);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000);
        __CLR4_4_1188a188alc8azx8s.R.inc(57437);assertEquals(true, iField.equals(dummy));
        __CLR4_4_1188a188alc8azx8s.R.inc(57438);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000);
        __CLR4_4_1188a188alc8azx8s.R.inc(57439);assertEquals(false, iField.equals(dummy));
        __CLR4_4_1188a188alc8azx8s.R.inc(57440);assertEquals(false, iField.equals(""));
        __CLR4_4_1188a188alc8azx8s.R.inc(57441);assertEquals(false, iField.equals(null));
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    public void test_hashCode() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4dyzz18bm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_hashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4dyzz18bm(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57442);
        __CLR4_4_1188a188alc8azx8s.R.inc(57443);assertEquals(true, iField.hashCode() == iField.hashCode());
        __CLR4_4_1188a188alc8azx8s.R.inc(57444);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode());
        __CLR4_4_1188a188alc8azx8s.R.inc(57445);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0);
        __CLR4_4_1188a188alc8azx8s.R.inc(57446);assertEquals(false, iField.hashCode() == dummy.hashCode());
        __CLR4_4_1188a188alc8azx8s.R.inc(57447);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000);
        __CLR4_4_1188a188alc8azx8s.R.inc(57448);assertEquals(true, iField.hashCode() == dummy.hashCode());
        __CLR4_4_1188a188alc8azx8s.R.inc(57449);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000);
        __CLR4_4_1188a188alc8azx8s.R.inc(57450);assertEquals(false, iField.hashCode() == dummy.hashCode());
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_compareTo() {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s61q2u18bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_compareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s61q2u18bv(){try{__CLR4_4_1188a188alc8azx8s.R.inc(57451);
        __CLR4_4_1188a188alc8azx8s.R.inc(57452);assertEquals(0, iField.compareTo(iField));
        __CLR4_4_1188a188alc8azx8s.R.inc(57453);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes()));
        __CLR4_4_1188a188alc8azx8s.R.inc(57454);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0);
        __CLR4_4_1188a188alc8azx8s.R.inc(57455);assertEquals(1, iField.compareTo(dummy));
//        try {
//            iField.compareTo("");
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_1188a188alc8azx8s.R.inc(57456);try {
            __CLR4_4_1188a188alc8azx8s.R.inc(57457);iField.compareTo(null);
            __CLR4_4_1188a188alc8azx8s.R.inc(57458);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1188a188alc8azx8s.R.globalSliceStart(getClass().getName(),57459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on918c3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1188a188alc8azx8s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1188a188alc8azx8s.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on918c3() throws Exception{try{__CLR4_4_1188a188alc8azx8s.R.inc(57459);
        __CLR4_4_1188a188alc8azx8s.R.inc(57460);DurationField test = iField;
        
        __CLR4_4_1188a188alc8azx8s.R.inc(57461);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1188a188alc8azx8s.R.inc(57462);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1188a188alc8azx8s.R.inc(57463);oos.writeObject(test);
        __CLR4_4_1188a188alc8azx8s.R.inc(57464);byte[] bytes = baos.toByteArray();
        __CLR4_4_1188a188alc8azx8s.R.inc(57465);oos.close();
        
        __CLR4_4_1188a188alc8azx8s.R.inc(57466);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1188a188alc8azx8s.R.inc(57467);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1188a188alc8azx8s.R.inc(57468);DurationField result = (DurationField) ois.readObject();
        __CLR4_4_1188a188alc8azx8s.R.inc(57469);ois.close();
        
        __CLR4_4_1188a188alc8azx8s.R.inc(57470);assertEquals(test, result);
    }finally{__CLR4_4_1188a188alc8azx8s.R.flushNeeded();}}

}
