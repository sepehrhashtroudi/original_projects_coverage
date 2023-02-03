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
 * This class is a Junit unit test for PeriodFormatterBuilder.
 *
 * @author Stephen Colebourne
 */
public class TestMillisDurationField extends TestCase {static class __CLR4_4_117ad17adlc8azx4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,56209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_117ad17adlc8azx4m.R.inc(56101);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56102);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_117ad17adlc8azx4m.R.inc(56103);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56104);return new TestSuite(TestMillisDurationField.class);
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public TestMillisDurationField(String name) {
        super(name);__CLR4_4_117ad17adlc8azx4m.R.inc(56106);try{__CLR4_4_117ad17adlc8azx4m.R.inc(56105);
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_117ad17adlc8azx4m.R.inc(56107);
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_117ad17adlc8azx4m.R.inc(56108);
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getType() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di17al();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di17al(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56109);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56110);assertEquals(DurationFieldType.millis(), MillisDurationField.INSTANCE.getType());
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getName() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k517an();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k517an(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56111);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56112);assertEquals("millis", MillisDurationField.INSTANCE.getName());
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}
    
    public void test_isSupported() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe17ap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe17ap(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56113);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56114);assertEquals(true, MillisDurationField.INSTANCE.isSupported());
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_isPrecise() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u71yjv17ar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isPrecise",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u71yjv17ar(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56115);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56116);assertEquals(true, MillisDurationField.INSTANCE.isPrecise());
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getUnitMillis() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148duee17at();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getUnitMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148duee17at(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56117);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56118);assertEquals(1, MillisDurationField.INSTANCE.getUnitMillis());
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_toString() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c017av();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c017av(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56119);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56120);assertEquals("DurationField[millis]", MillisDurationField.INSTANCE.toString());
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void test_getValue_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8q16i17ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8q16i17ax(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56121);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56122);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56123);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56124);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56125);try {
            __CLR4_4_117ad17adlc8azx4m.R.inc(56126);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L);
            __CLR4_4_117ad17adlc8azx4m.R.inc(56127);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getValueAsLong_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi2whg17b4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi2whg17b4(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56128);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56129);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56130);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56131);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56132);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L));
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getValue_long_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8wtf317b9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8wtf317b9(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56133);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56134);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56135);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56136);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56137);try {
            __CLR4_4_117ad17adlc8azx4m.R.inc(56138);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L, 567L);
            __CLR4_4_117ad17adlc8azx4m.R.inc(56139);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getValueAsLong_long_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8t4kj17bg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8t4kj17bg(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56140);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56141);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56142);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56143);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56144);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L, 567L));
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMillis_int() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xyqi17bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xyqi17bl(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56145);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56146);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56147);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56148);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234));
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getMillis_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njwor117bp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njwor117bp(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56149);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56150);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56151);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56152);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L));
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getMillis_int_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hp1zp917bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hp1zp917bt(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56153);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56154);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56155);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56156);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234, 567L));
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getMillis_long_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nakswm17bx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nakswm17bx(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56157);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56158);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56159);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L, 567L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56160);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L, 567L));
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_add_long_int() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu17c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu17c1(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56161);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56162);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56163);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56164);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56165);try {
            __CLR4_4_117ad17adlc8azx4m.R.inc(56166);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1);
            __CLR4_4_117ad17adlc8azx4m.R.inc(56167);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_add_long_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl17c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl17c8(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56168);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56169);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56170);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56171);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56172);try {
            __CLR4_4_117ad17adlc8azx4m.R.inc(56173);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1L);
            __CLR4_4_117ad17adlc8azx4m.R.inc(56174);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDifference_long_int() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5edd817cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifference_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5edd817cf(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56175);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56176);assertEquals(567, MillisDurationField.INSTANCE.getDifference(567L, 0L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56177);assertEquals(567 - 1234, MillisDurationField.INSTANCE.getDifference(567L, 1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56178);assertEquals(567 + 1234, MillisDurationField.INSTANCE.getDifference(567L, -1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56179);try {
            __CLR4_4_117ad17adlc8azx4m.R.inc(56180);MillisDurationField.INSTANCE.getDifference(Long.MAX_VALUE, 1L);
            __CLR4_4_117ad17adlc8azx4m.R.inc(56181);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    public void test_getDifferenceAsLong_long_long() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m25717cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m25717cm(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56182);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56183);assertEquals(567L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 0L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56184);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56185);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, -1234L));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56186);try {
            __CLR4_4_117ad17adlc8azx4m.R.inc(56187);MillisDurationField.INSTANCE.getDifferenceAsLong(Long.MAX_VALUE, -1L);
            __CLR4_4_117ad17adlc8azx4m.R.inc(56188);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_compareTo() {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s61q2u17ct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_compareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s61q2u17ct(){try{__CLR4_4_117ad17adlc8azx4m.R.inc(56189);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56190);assertEquals(0, MillisDurationField.INSTANCE.compareTo(MillisDurationField.INSTANCE));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56191);assertEquals(-1, MillisDurationField.INSTANCE.compareTo(ISOChronology.getInstance().seconds()));
        __CLR4_4_117ad17adlc8azx4m.R.inc(56192);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56193);assertEquals(1, MillisDurationField.INSTANCE.compareTo(dummy));
//        try {
//            MillisDurationField.INSTANCE.compareTo("");
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_117ad17adlc8azx4m.R.inc(56194);try {
            __CLR4_4_117ad17adlc8azx4m.R.inc(56195);MillisDurationField.INSTANCE.compareTo(null);
            __CLR4_4_117ad17adlc8azx4m.R.inc(56196);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_117ad17adlc8azx4m.R.globalSliceStart(getClass().getName(),56197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on917d1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117ad17adlc8azx4m.R.rethrow($CLV_t2$);}finally{__CLR4_4_117ad17adlc8azx4m.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on917d1() throws Exception{try{__CLR4_4_117ad17adlc8azx4m.R.inc(56197);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56198);DurationField test = MillisDurationField.INSTANCE;
        
        __CLR4_4_117ad17adlc8azx4m.R.inc(56199);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_117ad17adlc8azx4m.R.inc(56200);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56201);oos.writeObject(test);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56202);byte[] bytes = baos.toByteArray();
        __CLR4_4_117ad17adlc8azx4m.R.inc(56203);oos.close();
        
        __CLR4_4_117ad17adlc8azx4m.R.inc(56204);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56205);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_117ad17adlc8azx4m.R.inc(56206);DurationField result = (DurationField) ois.readObject();
        __CLR4_4_117ad17adlc8azx4m.R.inc(56207);ois.close();
        
        __CLR4_4_117ad17adlc8azx4m.R.inc(56208);assertSame(test, result);
    }finally{__CLR4_4_117ad17adlc8azx4m.R.flushNeeded();}}

}
