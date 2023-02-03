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

package org.apache.commons.math3.linear;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.exception.MathParseException;

public abstract class RealMatrixFormatAbstractTest {static class __CLR4_4_11vbm1vbmlb90pda8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,87411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    RealMatrixFormat realMatrixFormat = null;
    RealMatrixFormat realMatrixFormatOctave = null;

    protected abstract Locale getLocale();

    protected abstract char getDecimalCharacter();

    public RealMatrixFormatAbstractTest() {try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87250);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87251);realMatrixFormat = RealMatrixFormat.getInstance(getLocale());
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87252);final NumberFormat nf = NumberFormat.getInstance(getLocale());
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87253);nf.setMaximumFractionDigits(2);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87254);realMatrixFormatOctave = new RealMatrixFormat("[", "]", "", "", "; ", ", ", nf);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testSimpleNoDecimals() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ff5zea1vbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testSimpleNoDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ff5zea1vbr(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87255);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87256);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{1, 1, 1}, {1, 1, 1}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87257);String expected = "{{1,1,1},{1,1,1}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87258);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87259);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testSimpleWithDecimals() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ozljoz1vbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testSimpleWithDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ozljoz1vbw(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87260);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87261);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{1.23, 1.43, 1.63}, {2.46, 2.46, 2.66}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87262);String expected =
            "{{1"    + getDecimalCharacter() +
            "23,1" + getDecimalCharacter() +
            "43,1" + getDecimalCharacter() +
            "63},{2" + getDecimalCharacter() +
            "46,2" + getDecimalCharacter() +
            "46,2" + getDecimalCharacter() +
            "66}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87263);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87264);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testSimpleWithDecimalsTrunc() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6olrb1vc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testSimpleWithDecimalsTrunc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6olrb1vc1(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87265);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87266);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{1.232323232323, 1.43, 1.63},
                                                                    {2.46, 2.46, 2.666666666666}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87267);String expected =
                "{{1"    + getDecimalCharacter() +
                "2323232323,1" + getDecimalCharacter() +
                "43,1" + getDecimalCharacter() +
                "63},{2" + getDecimalCharacter() +
                "46,2" + getDecimalCharacter() +
                "46,2" + getDecimalCharacter() +
                "6666666667}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87268);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87269);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testNegativeComponent() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrmdzx1vc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testNegativeComponent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrmdzx1vc6(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87270);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87271);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{-1.232323232323, 1.43, 1.63},
                                                                    {2.46, 2.46, 2.66}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87272);String expected =
                "{{-1"    + getDecimalCharacter() +
                "2323232323,1" + getDecimalCharacter() +
                "43,1" + getDecimalCharacter() +
                "63},{2" + getDecimalCharacter() +
                "46,2" + getDecimalCharacter() +
                "46,2" + getDecimalCharacter() +
                "66}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87273);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87274);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testNegativeComponent2() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gapsrn1vcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testNegativeComponent2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gapsrn1vcb(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87275);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87276);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{1.23, -1.434343434343, 1.63},
                                                                    {2.46, 2.46, 2.66}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87277);String expected =
                "{{1"    + getDecimalCharacter() +
                "23,-1" + getDecimalCharacter() +
                "4343434343,1" + getDecimalCharacter() +
                "63},{2" + getDecimalCharacter() +
                "46,2" + getDecimalCharacter() +
                "46,2" + getDecimalCharacter() +
                "66}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87278);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87279);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testNegativeSecondRow() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5mqyi1vcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testNegativeSecondRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5mqyi1vcg(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87280);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87281);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{1.23, 1.43, 1.63},
                                                                    {-2.66666666666, 2.46, 2.66}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87282);String expected =
                "{{1"    + getDecimalCharacter() +
                "23,1" + getDecimalCharacter() +
                "43,1" + getDecimalCharacter() +
                "63},{-2" + getDecimalCharacter() +
                "6666666667,2" + getDecimalCharacter() +
                "46,2" + getDecimalCharacter() +
                "66}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87283);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87284);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testNonDefaultSetting() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2fwxb1vcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testNonDefaultSetting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2fwxb1vcl(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87285);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87286);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{1, 1, 1}, {1, 1, 1}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87287);String expected = "[1, 1, 1; 1, 1, 1]";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87288);String actual = realMatrixFormatOctave.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87289);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testDefaultFormat() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j92uul1vcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testDefaultFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j92uul1vcq(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87290);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87291);Locale defaultLocale = Locale.getDefault();
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87292);Locale.setDefault(getLocale());

        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87293);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{232.2222222222, -342.33333333333, 432.44444444444}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87294);String expected =
            "{{232"    + getDecimalCharacter() +
            "2222222222,-342" + getDecimalCharacter() +
            "3333333333,432" + getDecimalCharacter() +
            "4444444444}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87295);String actual = (new RealMatrixFormat()).format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87296);Assert.assertEquals(expected, actual);

        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87297);Locale.setDefault(defaultLocale);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testNan() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igd93k1vcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igd93k1vcy(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87298);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87299);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {{Double.NaN, Double.NaN, Double.NaN}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87300);String expected = "{{(NaN),(NaN),(NaN)}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87301);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87302);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testPositiveInfinity() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6qvc61vd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testPositiveInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6qvc61vd3(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87303);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87304);RealMatrix m = MatrixUtils.createRealMatrix(
                new double[][] {{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87305);String expected = "{{(Infinity),(Infinity),(Infinity)}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87306);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87307);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void tesNegativeInfinity() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16s515y1vd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.tesNegativeInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16s515y1vd8(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87308);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87309);RealMatrix m = MatrixUtils.createRealMatrix(
                new double[][] {{Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87310);String expected = "{{(-Infinity),(-Infinity),(-Infinity)}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87311);String actual = realMatrixFormat.format(m);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87312);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseSimpleNoDecimals() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y64rs31vdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseSimpleNoDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y64rs31vdd(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87313);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87314);String source = "{{1, 1, 1}, {1, 1, 1}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87315);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{1, 1, 1}, {1, 1, 1}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87316);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87317);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    @Ignore
    public void testParseSimpleWithClosingRowSeparator() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17a81gu1vdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseSimpleWithClosingRowSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17a81gu1vdi(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87318);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87319);String source = "{{1, 1, 1},{1, 1, 1}, }}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87320);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{1, 1, 1}, {1, 1, 1}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87321);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87322);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseIgnoredWhitespace() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbvjkb1vdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseIgnoredWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbvjkb1vdn(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87323);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87324);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{1, 1, 1}, {1, 1, 1}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87325);ParsePosition pos1 = new ParsePosition(0);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87326);String source1 = "{{1,1,1},{1,1,1}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87327);Assert.assertEquals(expected, realMatrixFormat.parse(source1, pos1));
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87328);Assert.assertEquals(source1.length(), pos1.getIndex());
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87329);ParsePosition pos2 = new ParsePosition(0);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87330);String source2 = " { { 1 , 1 , 1 } , { 1 , 1 , 1 } } ";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87331);Assert.assertEquals(expected, realMatrixFormat.parse(source2, pos2));
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87332);Assert.assertEquals(source2.length() - 1, pos2.getIndex());
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseSimpleWithDecimals() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1k9321vdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseSimpleWithDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1k9321vdx(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87333);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87334);String source =
            "{{1" + getDecimalCharacter() +
            "23,1" + getDecimalCharacter() +
            "43,1" + getDecimalCharacter() +
            "63}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87335);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{1.23, 1.43, 1.63}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87336);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87337);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseSimpleWithDecimalsTrunc() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twhnjs1ve2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseSimpleWithDecimalsTrunc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twhnjs1ve2(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87338);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87339);String source =
            "{{1" + getDecimalCharacter() +
            "2323,1" + getDecimalCharacter() +
            "4343,1" + getDecimalCharacter() +
            "6333}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87340);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{1.2323, 1.4343, 1.6333}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87341);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87342);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseNegativeComponent() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16skdwu1ve7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseNegativeComponent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16skdwu1ve7(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87343);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87344);String source =
            "{{-1" + getDecimalCharacter() +
            "2323,1" + getDecimalCharacter() +
            "4343,1" + getDecimalCharacter() +
            "6333}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87345);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{-1.2323, 1.4343, 1.6333}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87346);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87347);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseNegativeAll() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btdyxe1vec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseNegativeAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btdyxe1vec(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87348);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87349);String source =
            "{{-1" + getDecimalCharacter() +
            "2323,-1" + getDecimalCharacter() +
            "4343,-1" + getDecimalCharacter() +
            "6333}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87350);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{-1.2323, -1.4343, -1.6333}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87351);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87352);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseZeroComponent() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n65g6z1veh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseZeroComponent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n65g6z1veh(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87353);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87354);String source =
            "{{0" + getDecimalCharacter() +
            "0,-1" + getDecimalCharacter() +
            "4343,1" + getDecimalCharacter() +
            "6333}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87355);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{0.0, -1.4343, 1.6333}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87356);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87357);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseNonDefaultSetting() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1hx0e1vem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseNonDefaultSetting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1hx0e1vem(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87358);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87359);String source =
            "[1" + getDecimalCharacter() +
            "2323, 1" + getDecimalCharacter() +
            "4343, 1" + getDecimalCharacter() +
            "6333]";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87360);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{1.2323, 1.4343, 1.6333}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87361);RealMatrix actual = realMatrixFormatOctave.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87362);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseNan() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op47a71ver();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op47a71ver(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87363);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87364);String source = "{{(NaN), (NaN), (NaN)}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87365);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87366);RealMatrix expected = MatrixUtils.createRealMatrix(new double[][] {{Double.NaN, Double.NaN, Double.NaN}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87367);for (int i = 0; (((i < expected.getRowDimension())&&(__CLR4_4_11vbm1vbmlb90pda8.R.iget(87368)!=0|true))||(__CLR4_4_11vbm1vbmlb90pda8.R.iget(87369)==0&false)); i++) {{
            __CLR4_4_11vbm1vbmlb90pda8.R.inc(87370);for (int j = 0; (((j < expected.getColumnDimension())&&(__CLR4_4_11vbm1vbmlb90pda8.R.iget(87371)!=0|true))||(__CLR4_4_11vbm1vbmlb90pda8.R.iget(87372)==0&false)); j++) {{
                __CLR4_4_11vbm1vbmlb90pda8.R.inc(87373);Assert.assertTrue(Double.isNaN(actual.getEntry(i, j)));
            }
        }}
    }}finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParsePositiveInfinity() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxpnpz1vf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParsePositiveInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxpnpz1vf2(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87374);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87375);String source = "{{(Infinity), (Infinity), (Infinity)}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87376);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87377);RealMatrix expected = MatrixUtils.createRealMatrix(
                new double[][] {{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87378);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseNegativeInfinity() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15q3hid1vf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseNegativeInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15q3hid1vf7(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87379);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87380);String source = "{{(-Infinity), (-Infinity), (-Infinity)}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87381);RealMatrix actual = realMatrixFormat.parse(source);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87382);RealMatrix expected = MatrixUtils.createRealMatrix(
                new double[][] {{Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY}});
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87383);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseNoComponents() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6rpb31vfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseNoComponents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6rpb31vfc(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87384);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87385);try {
            __CLR4_4_11vbm1vbmlb90pda8.R.inc(87386);realMatrixFormat.parse("{{ }}");
            __CLR4_4_11vbm1vbmlb90pda8.R.inc(87387);Assert.fail("Expecting MathParseException");
        } catch (MathParseException pe) {
            // expected behavior
        }
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testParseManyComponents() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kss5qb1vfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testParseManyComponents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kss5qb1vfg(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87388);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87389);RealMatrix parsed = realMatrixFormat.parse("{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}}");
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87390);Assert.assertEquals(24, parsed.getColumnDimension());
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testConstructorSingleFormat() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oybje61vfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testConstructorSingleFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oybje61vfj(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87391);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87392);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87393);RealMatrixFormat mf = new RealMatrixFormat(nf);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87394);Assert.assertNotNull(mf);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87395);Assert.assertEquals(nf, mf.getFormat());
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testForgottenPrefix() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgstjz1vfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testForgottenPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgstjz1vfo(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87396);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87397);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87398);final String source = "1; 1; 1]";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87399);Assert.assertNull("Should not parse <"+source+">", realMatrixFormat.parse(source, pos));
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87400);Assert.assertEquals(0, pos.getErrorIndex());
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testForgottenSeparator() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfhsxw1vft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testForgottenSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfhsxw1vft(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87401);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87402);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87403);final String source = "{{1, 1 1}}";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87404);Assert.assertNull("Should not parse <"+source+">", realMatrixFormat.parse(source, pos));
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87405);Assert.assertEquals(7, pos.getErrorIndex());
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}

    @Test
    public void testForgottenSuffix() {__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceStart(getClass().getName(),87406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpbayo1vfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vbm1vbmlb90pda8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vbm1vbmlb90pda8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealMatrixFormatAbstractTest.testForgottenSuffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpbayo1vfy(){try{__CLR4_4_11vbm1vbmlb90pda8.R.inc(87406);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87407);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87408);final String source = "{{1, 1, 1 ";
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87409);Assert.assertNull("Should not parse <"+source+">", realMatrixFormat.parse(source, pos));
        __CLR4_4_11vbm1vbmlb90pda8.R.inc(87410);Assert.assertEquals(9, pos.getErrorIndex());
    }finally{__CLR4_4_11vbm1vbmlb90pda8.R.flushNeeded();}}
}
