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

import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.exception.MathParseException;

public abstract class RealVectorFormatAbstractTest {static class __CLR4_4_11wc31wc3lb90pdbw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,88720,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    RealVectorFormat realVectorFormat = null;
    RealVectorFormat realVectorFormatSquare = null;

    protected abstract Locale getLocale();

    protected abstract char getDecimalCharacter();

    public RealVectorFormatAbstractTest() {try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88563);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88564);realVectorFormat = RealVectorFormat.getInstance(getLocale());
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88565);final NumberFormat nf = NumberFormat.getInstance(getLocale());
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88566);nf.setMaximumFractionDigits(2);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88567);realVectorFormatSquare = new RealVectorFormat("[", "]", " : ", nf);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testSimpleNoDecimals() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ff5zea1wc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testSimpleNoDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ff5zea1wc8(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88568);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88569);ArrayRealVector c = new ArrayRealVector(new double[] {1, 1, 1});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88570);String expected = "{1; 1; 1}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88571);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88572);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testSimpleWithDecimals() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ozljoz1wcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testSimpleWithDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ozljoz1wcd(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88573);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88574);ArrayRealVector c = new ArrayRealVector(new double[] {1.23, 1.43, 1.63});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88575);String expected =
            "{1"    + getDecimalCharacter() +
            "23; 1" + getDecimalCharacter() +
            "43; 1" + getDecimalCharacter() +
            "63}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88576);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88577);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testSimpleWithDecimalsTrunc() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6olrb1wci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testSimpleWithDecimalsTrunc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6olrb1wci(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88578);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88579);ArrayRealVector c = new ArrayRealVector(new double[] {1.232323232323, 1.43434343434343, 1.633333333333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88580);String expected =
            "{1"    + getDecimalCharacter() +
            "2323232323; 1" + getDecimalCharacter() +
            "4343434343; 1" + getDecimalCharacter() +
            "6333333333}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88581);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88582);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testNegativeX() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dlhmg1wcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testNegativeX",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dlhmg1wcn(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88583);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88584);ArrayRealVector c = new ArrayRealVector(new double[] {-1.232323232323, 1.43, 1.63});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88585);String expected =
            "{-1"    + getDecimalCharacter() +
            "2323232323; 1" + getDecimalCharacter() +
            "43; 1" + getDecimalCharacter() +
            "63}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88586);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88587);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testNegativeY() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mlgex1wcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testNegativeY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mlgex1wcs(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88588);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88589);ArrayRealVector c = new ArrayRealVector(new double[] {1.23, -1.434343434343, 1.63});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88590);String expected =
            "{1"    + getDecimalCharacter() +
            "23; -1" + getDecimalCharacter() +
            "4343434343; 1" + getDecimalCharacter() +
            "63}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88591);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88592);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testNegativeZ() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avlf7e1wcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testNegativeZ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avlf7e1wcx(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88593);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88594);ArrayRealVector c = new ArrayRealVector(new double[] {1.23, 1.43, -1.633333333333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88595);String expected =
            "{1"    + getDecimalCharacter() +
            "23; 1" + getDecimalCharacter() +
            "43; -1" + getDecimalCharacter() +
            "6333333333}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88596);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88597);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testNonDefaultSetting() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2fwxb1wd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testNonDefaultSetting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2fwxb1wd2(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88598);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88599);ArrayRealVector c = new ArrayRealVector(new double[] {1, 1, 1});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88600);String expected = "[1 : 1 : 1]";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88601);String actual = realVectorFormatSquare.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88602);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testDefaultFormatRealVectorImpl() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f68acu1wd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testDefaultFormatRealVectorImpl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f68acu1wd7(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88603);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88604);Locale defaultLocal = Locale.getDefault();
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88605);Locale.setDefault(getLocale());

        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88606);ArrayRealVector c = new ArrayRealVector(new double[] {232.22222222222, -342.3333333333, 432.44444444444});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88607);String expected =
            "{232"    + getDecimalCharacter() +
            "2222222222; -342" + getDecimalCharacter() +
            "3333333333; 432" + getDecimalCharacter() +
            "4444444444}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88608);String actual = (new RealVectorFormat()).format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88609);Assert.assertEquals(expected, actual);

        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88610);Locale.setDefault(defaultLocal);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testNan() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igd93k1wdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igd93k1wdf(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88611);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88612);ArrayRealVector c = new ArrayRealVector(new double[] {Double.NaN, Double.NaN, Double.NaN});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88613);String expected = "{(NaN); (NaN); (NaN)}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88614);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88615);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testPositiveInfinity() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6qvc61wdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testPositiveInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6qvc61wdk(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88616);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88617);ArrayRealVector c = new ArrayRealVector(new double[] {
                Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY
        });
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88618);String expected = "{(Infinity); (Infinity); (Infinity)}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88619);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88620);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void tesNegativeInfinity() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16s515y1wdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.tesNegativeInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16s515y1wdp(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88621);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88622);ArrayRealVector c = new ArrayRealVector(new double[] {
                Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY
        });
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88623);String expected = "{(-Infinity); (-Infinity); (-Infinity)}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88624);String actual = realVectorFormat.format(c);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88625);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseSimpleNoDecimals() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y64rs31wdu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseSimpleNoDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y64rs31wdu(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88626);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88627);String source = "{1; 1; 1}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88628);ArrayRealVector expected = new ArrayRealVector(new double[] {1, 1, 1});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88629);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88630);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseIgnoredWhitespace() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbvjkb1wdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseIgnoredWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbvjkb1wdz(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88631);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88632);ArrayRealVector expected = new ArrayRealVector(new double[] {1, 1, 1});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88633);ParsePosition pos1 = new ParsePosition(0);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88634);String source1 = "{1;1;1}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88635);Assert.assertEquals(expected, realVectorFormat.parse(source1, pos1));
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88636);Assert.assertEquals(source1.length(), pos1.getIndex());
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88637);ParsePosition pos2 = new ParsePosition(0);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88638);String source2 = " { 1 ; 1 ; 1 } ";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88639);Assert.assertEquals(expected, realVectorFormat.parse(source2, pos2));
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88640);Assert.assertEquals(source2.length() - 1, pos2.getIndex());
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseSimpleWithDecimals() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1k9321we9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseSimpleWithDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1k9321we9(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88641);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88642);String source =
            "{1" + getDecimalCharacter() +
            "23; 1" + getDecimalCharacter() +
            "43; 1" + getDecimalCharacter() +
            "63}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88643);ArrayRealVector expected = new ArrayRealVector(new double[] {1.23, 1.43, 1.63});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88644);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88645);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseSimpleWithDecimalsTrunc() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twhnjs1wee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseSimpleWithDecimalsTrunc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twhnjs1wee(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88646);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88647);String source =
            "{1" + getDecimalCharacter() +
            "2323; 1" + getDecimalCharacter() +
            "4343; 1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88648);ArrayRealVector expected = new ArrayRealVector(new double[] {1.2323, 1.4343, 1.6333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88649);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88650);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseNegativeX() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kznb1wej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseNegativeX",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kznb1wej(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88651);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88652);String source =
            "{-1" + getDecimalCharacter() +
            "2323; 1" + getDecimalCharacter() +
            "4343; 1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88653);ArrayRealVector expected = new ArrayRealVector(new double[] {-1.2323, 1.4343, 1.6333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88654);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88655);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseNegativeY() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134ez561weo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseNegativeY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134ez561weo(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88656);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88657);String source =
            "{1" + getDecimalCharacter() +
            "2323; -1" + getDecimalCharacter() +
            "4343; 1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88658);ArrayRealVector expected = new ArrayRealVector(new double[] {1.2323, -1.4343, 1.6333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88659);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88660);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseNegativeZ() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dexxn1wet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseNegativeZ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dexxn1wet(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88661);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88662);String source =
            "{1" + getDecimalCharacter() +
            "2323; 1" + getDecimalCharacter() +
            "4343; -1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88663);ArrayRealVector expected = new ArrayRealVector(new double[] {1.2323, 1.4343, -1.6333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88664);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88665);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseNegativeAll() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btdyxe1wey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseNegativeAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btdyxe1wey(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88666);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88667);String source =
            "{-1" + getDecimalCharacter() +
            "2323; -1" + getDecimalCharacter() +
            "4343; -1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88668);ArrayRealVector expected = new ArrayRealVector(new double[] {-1.2323, -1.4343, -1.6333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88669);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88670);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseZeroX() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12twvje1wf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseZeroX",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12twvje1wf3(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88671);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88672);String source =
            "{0" + getDecimalCharacter() +
            "0; -1" + getDecimalCharacter() +
            "4343; 1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88673);ArrayRealVector expected = new ArrayRealVector(new double[] {0.0, -1.4343, 1.6333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88674);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88675);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseNonDefaultSetting() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1hx0e1wf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseNonDefaultSetting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1hx0e1wf8(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88676);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88677);String source =
            "[1" + getDecimalCharacter() +
            "2323 : 1" + getDecimalCharacter() +
            "4343 : 1" + getDecimalCharacter() +
            "6333]";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88678);ArrayRealVector expected = new ArrayRealVector(new double[] {1.2323, 1.4343, 1.6333});
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88679);ArrayRealVector actual = realVectorFormatSquare.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88680);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseNan() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op47a71wfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op47a71wfd(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88681);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88682);String source = "{(NaN); (NaN); (NaN)}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88683);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88684);Assert.assertEquals(new ArrayRealVector(new double[] {Double.NaN, Double.NaN, Double.NaN}), actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParsePositiveInfinity() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxpnpz1wfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParsePositiveInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxpnpz1wfh(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88685);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88686);String source = "{(Infinity); (Infinity); (Infinity)}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88687);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88688);Assert.assertEquals(new ArrayRealVector(new double[] {
                Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY
        }), actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseNegativeInfinity() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15q3hid1wfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseNegativeInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15q3hid1wfl(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88689);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88690);String source = "{(-Infinity); (-Infinity); (-Infinity)}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88691);ArrayRealVector actual = realVectorFormat.parse(source);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88692);Assert.assertEquals(new ArrayRealVector(new double[] {
                Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY
        }), actual);
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseNoComponents() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6rpb31wfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseNoComponents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6rpb31wfp(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88693);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88694);try {
            __CLR4_4_11wc31wc3lb90pdbw.R.inc(88695);realVectorFormat.parse("{ }");
            __CLR4_4_11wc31wc3lb90pdbw.R.inc(88696);Assert.fail("Expecting MathParseException");
        } catch (MathParseException pe) {
            // expected behavior
        }
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testParseManyComponents() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kss5qb1wft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testParseManyComponents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kss5qb1wft(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88697);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88698);ArrayRealVector parsed = realVectorFormat.parse("{0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0}");
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88699);Assert.assertEquals(24, parsed.getDimension());
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testConstructorSingleFormat() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oybje61wfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testConstructorSingleFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oybje61wfw(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88700);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88701);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88702);RealVectorFormat cf = new RealVectorFormat(nf);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88703);Assert.assertNotNull(cf);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88704);Assert.assertEquals(nf, cf.getFormat());
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testForgottenPrefix() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgstjz1wg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testForgottenPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgstjz1wg1(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88705);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88706);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88707);final String source = "1; 1; 1}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88708);Assert.assertNull("Should not parse <"+source+">",new RealVectorFormat().parse(source, pos));
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88709);Assert.assertEquals(0, pos.getErrorIndex());
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testForgottenSeparator() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfhsxw1wg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testForgottenSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfhsxw1wg6(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88710);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88711);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88712);final String source = "{1; 1 1}";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88713);Assert.assertNull("Should not parse <"+source+">",new RealVectorFormat().parse(source, pos));
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88714);Assert.assertEquals(6, pos.getErrorIndex());
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}

    @Test
    public void testForgottenSuffix() {__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceStart(getClass().getName(),88715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpbayo1wgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wc31wc3lb90pdbw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wc31wc3lb90pdbw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorFormatAbstractTest.testForgottenSuffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpbayo1wgb(){try{__CLR4_4_11wc31wc3lb90pdbw.R.inc(88715);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88716);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88717);final String source = "{1; 1; 1 ";
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88718);Assert.assertNull("Should not parse <"+source+">",new RealVectorFormat().parse(source, pos));
        __CLR4_4_11wc31wc3lb90pdbw.R.inc(88719);Assert.assertEquals(8, pos.getErrorIndex());
    }finally{__CLR4_4_11wc31wc3lb90pdbw.R.flushNeeded();}}
}
