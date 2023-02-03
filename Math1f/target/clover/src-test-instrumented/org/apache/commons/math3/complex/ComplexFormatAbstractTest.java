/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math3.complex;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.util.FastMath;

public abstract class ComplexFormatAbstractTest {static class __CLR4_4_11h6d1h6dlb90pc5t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,69089,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    ComplexFormat complexFormat = null;
    ComplexFormat complexFormatJ = null;

    protected abstract Locale getLocale();

    protected abstract char getDecimalCharacter();

    protected ComplexFormatAbstractTest() {try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68917);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68918);complexFormat = ComplexFormat.getInstance(getLocale());
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68919);complexFormatJ = ComplexFormat.getInstance("j", getLocale());
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testSimpleNoDecimals() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ff5zea1h6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testSimpleNoDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ff5zea1h6g(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68920);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68921);Complex c = new Complex(1, 2);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68922);String expected = "1 + 2i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68923);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68924);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testTrimOneImaginary() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cx1cby1h6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testTrimOneImaginary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cx1cby1h6l(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68925);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68926);final ComplexFormat fmt = ComplexFormat.getInstance(getLocale());
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68927);fmt.getImaginaryFormat().setMaximumFractionDigits(1);

        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68928);Complex c = new Complex(1, 1.04);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68929);String expected = "1 + i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68930);String actual = fmt.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68931);Assert.assertEquals(expected, actual);

        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68932);c = new Complex(1, 1.09);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68933);expected = "1 + 1" + getDecimalCharacter() + "1i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68934);actual = fmt.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68935);Assert.assertEquals(expected, actual);

        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68936);c = new Complex(1, -1.09);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68937);expected = "1 - 1" + getDecimalCharacter() + "1i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68938);actual = fmt.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68939);Assert.assertEquals(expected, actual);

        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68940);c = new Complex(1, -1.04);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68941);expected = "1 - i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68942);actual = fmt.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68943);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testSimpleWithDecimals() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ozljoz1h74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testSimpleWithDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ozljoz1h74(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68944);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68945);Complex c = new Complex(1.23, 1.43);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68946);String expected = "1" + getDecimalCharacter() + "23 + 1" + getDecimalCharacter() + "43i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68947);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68948);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testSimpleWithDecimalsTrunc() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6olrb1h79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testSimpleWithDecimalsTrunc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6olrb1h79(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68949);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68950);Complex c = new Complex(1.232323232323, 1.434343434343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68951);String expected = "1" + getDecimalCharacter() + "2323232323 + 1" + getDecimalCharacter() + "4343434343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68952);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68953);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testNegativeReal() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzonxw1h7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testNegativeReal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzonxw1h7e(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68954);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68955);Complex c = new Complex(-1.232323232323, 1.43);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68956);String expected = "-1" + getDecimalCharacter() + "2323232323 + 1" + getDecimalCharacter() + "43i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68957);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68958);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testNegativeImaginary() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ovo0l51h7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testNegativeImaginary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ovo0l51h7j(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68959);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68960);Complex c = new Complex(1.23, -1.434343434343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68961);String expected = "1" + getDecimalCharacter() + "23 - 1" + getDecimalCharacter() + "4343434343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68962);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68963);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testNegativeBoth() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiwmp1h7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testNegativeBoth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiwmp1h7o(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68964);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68965);Complex c = new Complex(-1.232323232323, -1.434343434343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68966);String expected = "-1" + getDecimalCharacter() + "2323232323 - 1" + getDecimalCharacter() + "4343434343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68967);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68968);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testZeroReal() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7jecf1h7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testZeroReal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7jecf1h7t(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68969);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68970);Complex c = new Complex(0.0, -1.434343434343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68971);String expected = "0 - 1" + getDecimalCharacter() + "4343434343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68972);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68973);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testZeroImaginary() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132xvp61h7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testZeroImaginary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132xvp61h7y(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68974);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68975);Complex c = new Complex(30.23333333333, 0);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68976);String expected = "30" + getDecimalCharacter() + "2333333333";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68977);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68978);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testDifferentImaginaryChar() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1177lf51h83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testDifferentImaginaryChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1177lf51h83(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68979);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68980);Complex c = new Complex(1, 1);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68981);String expected = "1 + j";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68982);String actual = complexFormatJ.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68983);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testDefaultFormatComplex() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a02b7z1h88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testDefaultFormatComplex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a02b7z1h88(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68984);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68985);Locale defaultLocal = Locale.getDefault();
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68986);Locale.setDefault(getLocale());

        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68987);Complex c = new Complex(232.22222222222, -342.3333333333);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68988);String expected = "232" + getDecimalCharacter() + "2222222222 - 342" + getDecimalCharacter() + "3333333333i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68989);String actual = (new ComplexFormat()).format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68990);Assert.assertEquals(expected, actual);

        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68991);Locale.setDefault(defaultLocal);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testNan() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igd93k1h8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igd93k1h8g(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68992);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68993);Complex c = new Complex(Double.NaN, Double.NaN);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68994);String expected = "(NaN) + (NaN)i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68995);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68996);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testPositiveInfinity() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),68997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6qvc61h8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testPositiveInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6qvc61h8l(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(68997);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68998);Complex c = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(68999);String expected = "(Infinity) + (Infinity)i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69000);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69001);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testNegativeInfinity() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oh29w61h8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testNegativeInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oh29w61h8q(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69002);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69003);Complex c = new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69004);String expected = "(-Infinity) - (Infinity)i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69005);String actual = complexFormat.format(c);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69006);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseSimpleNoDecimals() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y64rs31h8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseSimpleNoDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y64rs31h8v(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69007);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69008);String source = "1 + 1i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69009);Complex expected = new Complex(1, 1);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69010);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69011);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseSimpleWithDecimals() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1k9321h90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseSimpleWithDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1k9321h90(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69012);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69013);String source = "1" + getDecimalCharacter() + "23 + 1" + getDecimalCharacter() + "43i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69014);Complex expected = new Complex(1.23, 1.43);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69015);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69016);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseSimpleWithDecimalsTrunc() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twhnjs1h95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseSimpleWithDecimalsTrunc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twhnjs1h95(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69017);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69018);String source = "1" + getDecimalCharacter() + "232323232323 + 1" + getDecimalCharacter() + "434343434343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69019);Complex expected = new Complex(1.232323232323, 1.434343434343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69020);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69021);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseNegativeReal() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cz0xzv1h9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseNegativeReal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cz0xzv1h9a(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69022);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69023);String source = "-1" + getDecimalCharacter() + "232323232323 + 1" + getDecimalCharacter() + "4343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69024);Complex expected = new Complex(-1.232323232323, 1.4343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69025);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69026);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseNegativeImaginary() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwm0i21h9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseNegativeImaginary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwm0i21h9f(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69027);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69028);String source = "1" + getDecimalCharacter() + "2323 - 1" + getDecimalCharacter() + "434343434343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69029);Complex expected = new Complex(1.2323, -1.434343434343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69030);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69031);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseNegativeBoth() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkxco21h9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseNegativeBoth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkxco21h9k(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69032);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69033);String source = "-1" + getDecimalCharacter() + "232323232323 - 1" + getDecimalCharacter() + "434343434343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69034);Complex expected = new Complex(-1.232323232323, -1.434343434343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69035);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69036);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseZeroReal() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilvb5a1h9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseZeroReal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilvb5a1h9p(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69037);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69038);String source = "0" + getDecimalCharacter() + "0 - 1" + getDecimalCharacter() + "4343i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69039);Complex expected = new Complex(0.0, -1.4343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69040);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69041);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseZeroImaginary() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sa72s71h9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseZeroImaginary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sa72s71h9u(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69042);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69043);String source = "-1" + getDecimalCharacter() + "2323";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69044);Complex expected = new Complex(-1.2323, 0);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69045);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69046);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseDifferentImaginaryChar() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gw6eua1h9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseDifferentImaginaryChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gw6eua1h9z(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69047);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69048);String source = "-1" + getDecimalCharacter() + "2323 - 1" + getDecimalCharacter() + "4343j";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69049);Complex expected = new Complex(-1.2323, -1.4343);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69050);Complex actual = complexFormatJ.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69051);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParseNan() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op47a71ha4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParseNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op47a71ha4(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69052);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69053);String source = "(NaN) + (NaN)i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69054);Complex expected = new Complex(Double.NaN, Double.NaN);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69055);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69056);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testParsePositiveInfinity() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxpnpz1ha9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testParsePositiveInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxpnpz1ha9(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69057);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69058);String source = "(Infinity) + (Infinity)i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69059);Complex expected = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69060);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69061);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testPaseNegativeInfinity() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uadrjb1hae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testPaseNegativeInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uadrjb1hae(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69062);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69063);String source = "(-Infinity) - (Infinity)i";
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69064);Complex expected = new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69065);Complex actual = complexFormat.parse(source);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69066);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testConstructorSingleFormat() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oybje61haj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testConstructorSingleFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oybje61haj(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69067);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69068);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69069);ComplexFormat cf = new ComplexFormat(nf);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69070);Assert.assertNotNull(cf);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69071);Assert.assertEquals(nf, cf.getRealFormat());
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testGetImaginaryFormat() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ia3kmr1hao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testGetImaginaryFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ia3kmr1hao(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69072);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69073);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69074);ComplexFormat cf = new ComplexFormat(nf);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69075);Assert.assertSame(nf, cf.getImaginaryFormat());
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testGetRealFormat() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mdp281has();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testGetRealFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mdp281has(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69076);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69077);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69078);ComplexFormat cf = new ComplexFormat(nf);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69079);Assert.assertSame(nf, cf.getRealFormat());
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testFormatNumber() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111gic91haw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testFormatNumber",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111gic91haw(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69080);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69081);ComplexFormat cf = ComplexFormat.getInstance(getLocale());
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69082);Double pi = Double.valueOf(FastMath.PI);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69083);String text = cf.format(pi);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69084);Assert.assertEquals("3" + getDecimalCharacter() + "1415926536", text);
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}

    @Test
    public void testForgottenImaginaryCharacter() {__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceStart(getClass().getName(),69085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vchau71hb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h6d1h6dlb90pc5t.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h6d1h6dlb90pc5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexFormatAbstractTest.testForgottenImaginaryCharacter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vchau71hb1(){try{__CLR4_4_11h6d1h6dlb90pc5t.R.inc(69085);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69086);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69087);Assert.assertNull(new ComplexFormat().parse("1 + 1", pos));
        __CLR4_4_11h6d1h6dlb90pc5t.R.inc(69088);Assert.assertEquals(5, pos.getErrorIndex());
    }finally{__CLR4_4_11h6d1h6dlb90pc5t.R.flushNeeded();}}
}
