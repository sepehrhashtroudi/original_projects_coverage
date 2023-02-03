/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.apache.commons.math3.util;

import java.math.BigDecimal;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.TestUtils;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link Precision} class.
 *
 * @version $Id$
 */
public class PrecisionTest {static class __CLR4_4_12h342h34lb90pf6x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,115804,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testEqualsWithRelativeTolerance() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zf06pb2h34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testEqualsWithRelativeTolerance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zf06pb2h34(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115456);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115457);Assert.assertTrue(Precision.equalsWithRelativeTolerance(0d, 0d, 0d));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115458);Assert.assertTrue(Precision.equalsWithRelativeTolerance(0d, 1 / Double.NEGATIVE_INFINITY, 0d));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115459);final double eps = 1e-14;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115460);Assert.assertFalse(Precision.equalsWithRelativeTolerance(1.987654687654968, 1.987654687654988, eps));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115461);Assert.assertTrue(Precision.equalsWithRelativeTolerance(1.987654687654968, 1.987654687654987, eps));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115462);Assert.assertFalse(Precision.equalsWithRelativeTolerance(1.987654687654968, 1.987654687654948, eps));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115463);Assert.assertTrue(Precision.equalsWithRelativeTolerance(1.987654687654968, 1.987654687654949, eps));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115464);Assert.assertFalse(Precision.equalsWithRelativeTolerance(Precision.SAFE_MIN, 0.0, eps));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115465);Assert.assertFalse(Precision.equalsWithRelativeTolerance(1.0000000000001e-300, 1e-300, eps));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115466);Assert.assertTrue(Precision.equalsWithRelativeTolerance(1.00000000000001e-300, 1e-300, eps));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115467);Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.NEGATIVE_INFINITY, 1.23, eps));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115468);Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.POSITIVE_INFINITY, 1.23, eps));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115469);Assert.assertTrue(Precision.equalsWithRelativeTolerance(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, eps));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115470);Assert.assertTrue(Precision.equalsWithRelativeTolerance(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, eps));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115471);Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, eps));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115472);Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.NaN, 1.23, eps));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115473);Assert.assertFalse(Precision.equalsWithRelativeTolerance(Double.NaN, Double.NaN, eps));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testEqualsIncludingNaN() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hm6ki62h3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testEqualsIncludingNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hm6ki62h3m(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115474);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115475);double[] testArray = {
            Double.NaN,
            Double.POSITIVE_INFINITY,
            Double.NEGATIVE_INFINITY,
            1d,
            0d };
        __CLR4_4_12h342h34lb90pf6x.R.inc(115476);for (int i = 0; (((i < testArray.length)&&(__CLR4_4_12h342h34lb90pf6x.R.iget(115477)!=0|true))||(__CLR4_4_12h342h34lb90pf6x.R.iget(115478)==0&false)); i++) {{
            __CLR4_4_12h342h34lb90pf6x.R.inc(115479);for (int j = 0; (((j < testArray.length)&&(__CLR4_4_12h342h34lb90pf6x.R.iget(115480)!=0|true))||(__CLR4_4_12h342h34lb90pf6x.R.iget(115481)==0&false)); j++) {{
                __CLR4_4_12h342h34lb90pf6x.R.inc(115482);if ((((i == j)&&(__CLR4_4_12h342h34lb90pf6x.R.iget(115483)!=0|true))||(__CLR4_4_12h342h34lb90pf6x.R.iget(115484)==0&false))) {{
                    __CLR4_4_12h342h34lb90pf6x.R.inc(115485);Assert.assertTrue(Precision.equalsIncludingNaN(testArray[i], testArray[j]));
                    __CLR4_4_12h342h34lb90pf6x.R.inc(115486);Assert.assertTrue(Precision.equalsIncludingNaN(testArray[j], testArray[i]));
                } }else {{
                    __CLR4_4_12h342h34lb90pf6x.R.inc(115487);Assert.assertTrue(!Precision.equalsIncludingNaN(testArray[i], testArray[j]));
                    __CLR4_4_12h342h34lb90pf6x.R.inc(115488);Assert.assertTrue(!Precision.equalsIncludingNaN(testArray[j], testArray[i]));
                }
            }}
        }}
    }}finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testEqualsWithAllowedDelta() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdl3g22h41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testEqualsWithAllowedDelta",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdl3g22h41(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115489);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115490);Assert.assertTrue(Precision.equals(153.0000, 153.0000, .0625));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115491);Assert.assertTrue(Precision.equals(153.0000, 153.0625, .0625));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115492);Assert.assertTrue(Precision.equals(152.9375, 153.0000, .0625));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115493);Assert.assertFalse(Precision.equals(153.0000, 153.0625, .0624));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115494);Assert.assertFalse(Precision.equals(152.9374, 153.0000, .0625));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115495);Assert.assertFalse(Precision.equals(Double.NaN, Double.NaN, 1.0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115496);Assert.assertTrue(Precision.equals(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115497);Assert.assertTrue(Precision.equals(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1.0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115498);Assert.assertFalse(Precision.equals(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testMath475() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11uz6w12h4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testMath475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11uz6w12h4b(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115499);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115500);final double a = 1.7976931348623182E16;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115501);final double b = FastMath.nextUp(a);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115502);double diff = FastMath.abs(a - b);
        // Because they are adjacent floating point numbers, "a" and "b" are
        // considered equal even though the allowed error is smaller than
        // their difference.
        __CLR4_4_12h342h34lb90pf6x.R.inc(115503);Assert.assertTrue(Precision.equals(a, b, 0.5 * diff));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115504);final double c = FastMath.nextUp(b);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115505);diff = FastMath.abs(a - c);
        // Because "a" and "c" are not adjacent, the tolerance is taken into
        // account for assessing equality.
        __CLR4_4_12h342h34lb90pf6x.R.inc(115506);Assert.assertTrue(Precision.equals(a, c, diff));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115507);Assert.assertFalse(Precision.equals(a, c, (1 - 1e-16) * diff));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testEqualsIncludingNaNWithAllowedDelta() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2yuf02h4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testEqualsIncludingNaNWithAllowedDelta",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2yuf02h4k(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115508);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115509);Assert.assertTrue(Precision.equalsIncludingNaN(153.0000, 153.0000, .0625));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115510);Assert.assertTrue(Precision.equalsIncludingNaN(153.0000, 153.0625, .0625));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115511);Assert.assertTrue(Precision.equalsIncludingNaN(152.9375, 153.0000, .0625));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115512);Assert.assertTrue(Precision.equalsIncludingNaN(Double.NaN, Double.NaN, 1.0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115513);Assert.assertTrue(Precision.equalsIncludingNaN(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115514);Assert.assertTrue(Precision.equalsIncludingNaN(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1.0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115515);Assert.assertFalse(Precision.equalsIncludingNaN(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115516);Assert.assertFalse(Precision.equalsIncludingNaN(153.0000, 153.0625, .0624));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115517);Assert.assertFalse(Precision.equalsIncludingNaN(152.9374, 153.0000, .0625));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    // Tests for floating point equality
    @Test
    public void testFloatEqualsWithAllowedUlps() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ctvteu2h4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testFloatEqualsWithAllowedUlps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ctvteu2h4u(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115518);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115519);Assert.assertTrue("+0.0f == -0.0f",Precision.equals(0.0f, -0.0f));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115520);Assert.assertTrue("+0.0f == -0.0f (1 ulp)",Precision.equals(0.0f, -0.0f, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115521);float oneFloat = 1.0f;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115522);Assert.assertTrue("1.0f == 1.0f + 1 ulp",Precision.equals(oneFloat, Float.intBitsToFloat(1 + Float.floatToIntBits(oneFloat))));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115523);Assert.assertTrue("1.0f == 1.0f + 1 ulp (1 ulp)",Precision.equals(oneFloat, Float.intBitsToFloat(1 + Float.floatToIntBits(oneFloat)), 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115524);Assert.assertFalse("1.0f != 1.0f + 2 ulp (1 ulp)",Precision.equals(oneFloat, Float.intBitsToFloat(2 + Float.floatToIntBits(oneFloat)), 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115525);Assert.assertTrue(Precision.equals(153.0f, 153.0f, 1));

        // These tests need adjusting for floating point precision
//        Assert.assertTrue(Precision.equals(153.0f, 153.00000000000003f, 1));
//        Assert.assertFalse(Precision.equals(153.0f, 153.00000000000006f, 1));
//        Assert.assertTrue(Precision.equals(153.0f, 152.99999999999997f, 1));
//        Assert.assertFalse(Precision.equals(153f, 152.99999999999994f, 1));
//
//        Assert.assertTrue(Precision.equals(-128.0f, -127.99999999999999f, 1));
//        Assert.assertFalse(Precision.equals(-128.0f, -127.99999999999997f, 1));
//        Assert.assertTrue(Precision.equals(-128.0f, -128.00000000000003f, 1));
//        Assert.assertFalse(Precision.equals(-128.0f, -128.00000000000006f, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115526);Assert.assertTrue(Precision.equals(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115527);Assert.assertTrue(Precision.equals(Double.MAX_VALUE, Float.POSITIVE_INFINITY, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115528);Assert.assertTrue(Precision.equals(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115529);Assert.assertTrue(Precision.equals(-Float.MAX_VALUE, Float.NEGATIVE_INFINITY, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115530);Assert.assertFalse(Precision.equals(Float.NaN, Float.NaN, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115531);Assert.assertFalse(Precision.equals(Float.NaN, Float.NaN, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115532);Assert.assertFalse(Precision.equals(Float.NaN, 0, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115533);Assert.assertFalse(Precision.equals(Float.NaN, Float.POSITIVE_INFINITY, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115534);Assert.assertFalse(Precision.equals(Float.NaN, Float.NEGATIVE_INFINITY, 0));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115535);Assert.assertFalse(Precision.equals(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 100000));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testEqualsWithAllowedUlps() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0ckhe2h5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testEqualsWithAllowedUlps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0ckhe2h5c(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115536);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115537);Assert.assertTrue(Precision.equals(0.0, -0.0, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115538);Assert.assertTrue(Precision.equals(1.0, 1 + FastMath.ulp(1d), 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115539);Assert.assertFalse(Precision.equals(1.0, 1 + 2 * FastMath.ulp(1d), 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115540);final double nUp1 = FastMath.nextAfter(1d, Double.POSITIVE_INFINITY);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115541);final double nnUp1 = FastMath.nextAfter(nUp1, Double.POSITIVE_INFINITY);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115542);Assert.assertTrue(Precision.equals(1.0, nUp1, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115543);Assert.assertTrue(Precision.equals(nUp1, nnUp1, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115544);Assert.assertFalse(Precision.equals(1.0, nnUp1, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115545);Assert.assertTrue(Precision.equals(0.0, FastMath.ulp(0d), 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115546);Assert.assertTrue(Precision.equals(0.0, -FastMath.ulp(0d), 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115547);Assert.assertTrue(Precision.equals(153.0, 153.0, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115548);Assert.assertTrue(Precision.equals(153.0, 153.00000000000003, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115549);Assert.assertFalse(Precision.equals(153.0, 153.00000000000006, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115550);Assert.assertTrue(Precision.equals(153.0, 152.99999999999997, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115551);Assert.assertFalse(Precision.equals(153, 152.99999999999994, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115552);Assert.assertTrue(Precision.equals(-128.0, -127.99999999999999, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115553);Assert.assertFalse(Precision.equals(-128.0, -127.99999999999997, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115554);Assert.assertTrue(Precision.equals(-128.0, -128.00000000000003, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115555);Assert.assertFalse(Precision.equals(-128.0, -128.00000000000006, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115556);Assert.assertTrue(Precision.equals(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115557);Assert.assertTrue(Precision.equals(Double.MAX_VALUE, Double.POSITIVE_INFINITY, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115558);Assert.assertTrue(Precision.equals(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115559);Assert.assertTrue(Precision.equals(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115560);Assert.assertFalse(Precision.equals(Double.NaN, Double.NaN, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115561);Assert.assertFalse(Precision.equals(Double.NaN, Double.NaN, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115562);Assert.assertFalse(Precision.equals(Double.NaN, 0, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115563);Assert.assertFalse(Precision.equals(Double.NaN, Double.POSITIVE_INFINITY, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115564);Assert.assertFalse(Precision.equals(Double.NaN, Double.NEGATIVE_INFINITY, 0));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115565);Assert.assertFalse(Precision.equals(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 100000));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testEqualsIncludingNaNWithAllowedUlps() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vxbcu42h66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testEqualsIncludingNaNWithAllowedUlps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vxbcu42h66(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115566);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115567);Assert.assertTrue(Precision.equalsIncludingNaN(0.0, -0.0, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115568);Assert.assertTrue(Precision.equalsIncludingNaN(1.0, 1 + FastMath.ulp(1d), 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115569);Assert.assertFalse(Precision.equalsIncludingNaN(1.0, 1 + 2 * FastMath.ulp(1d), 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115570);final double nUp1 = FastMath.nextAfter(1d, Double.POSITIVE_INFINITY);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115571);final double nnUp1 = FastMath.nextAfter(nUp1, Double.POSITIVE_INFINITY);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115572);Assert.assertTrue(Precision.equalsIncludingNaN(1.0, nUp1, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115573);Assert.assertTrue(Precision.equalsIncludingNaN(nUp1, nnUp1, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115574);Assert.assertFalse(Precision.equalsIncludingNaN(1.0, nnUp1, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115575);Assert.assertTrue(Precision.equalsIncludingNaN(0.0, FastMath.ulp(0d), 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115576);Assert.assertTrue(Precision.equalsIncludingNaN(0.0, -FastMath.ulp(0d), 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115577);Assert.assertTrue(Precision.equalsIncludingNaN(153.0, 153.0, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115578);Assert.assertTrue(Precision.equalsIncludingNaN(153.0, 153.00000000000003, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115579);Assert.assertFalse(Precision.equalsIncludingNaN(153.0, 153.00000000000006, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115580);Assert.assertTrue(Precision.equalsIncludingNaN(153.0, 152.99999999999997, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115581);Assert.assertFalse(Precision.equalsIncludingNaN(153, 152.99999999999994, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115582);Assert.assertTrue(Precision.equalsIncludingNaN(-128.0, -127.99999999999999, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115583);Assert.assertFalse(Precision.equalsIncludingNaN(-128.0, -127.99999999999997, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115584);Assert.assertTrue(Precision.equalsIncludingNaN(-128.0, -128.00000000000003, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115585);Assert.assertFalse(Precision.equalsIncludingNaN(-128.0, -128.00000000000006, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115586);Assert.assertTrue(Precision.equalsIncludingNaN(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115587);Assert.assertTrue(Precision.equalsIncludingNaN(Double.MAX_VALUE, Double.POSITIVE_INFINITY, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115588);Assert.assertTrue(Precision.equalsIncludingNaN(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115589);Assert.assertTrue(Precision.equalsIncludingNaN(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115590);Assert.assertTrue(Precision.equalsIncludingNaN(Double.NaN, Double.NaN, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115591);Assert.assertFalse(Precision.equalsIncludingNaN(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 100000));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testCompareToEpsilon() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aal94t2h6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testCompareToEpsilon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aal94t2h6w(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115592);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115593);Assert.assertEquals(0, Precision.compareTo(152.33, 152.32, .011));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115594);Assert.assertTrue(Precision.compareTo(152.308, 152.32, .011) < 0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115595);Assert.assertTrue(Precision.compareTo(152.33, 152.318, .011) > 0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115596);Assert.assertEquals(0, Precision.compareTo(Double.MIN_VALUE, +0.0, Double.MIN_VALUE));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115597);Assert.assertEquals(0, Precision.compareTo(Double.MIN_VALUE, -0.0, Double.MIN_VALUE));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testCompareToMaxUlps() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14837612h72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testCompareToMaxUlps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14837612h72(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115598);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115599);double a     = 152.32;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115600);double delta = FastMath.ulp(a);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115601);for (int i = 0; (((i <= 10)&&(__CLR4_4_12h342h34lb90pf6x.R.iget(115602)!=0|true))||(__CLR4_4_12h342h34lb90pf6x.R.iget(115603)==0&false)); ++i) {{
            __CLR4_4_12h342h34lb90pf6x.R.inc(115604);if ((((i <= 5)&&(__CLR4_4_12h342h34lb90pf6x.R.iget(115605)!=0|true))||(__CLR4_4_12h342h34lb90pf6x.R.iget(115606)==0&false))) {{
                __CLR4_4_12h342h34lb90pf6x.R.inc(115607);Assert.assertEquals( 0, Precision.compareTo(a, a + i * delta, 5));
                __CLR4_4_12h342h34lb90pf6x.R.inc(115608);Assert.assertEquals( 0, Precision.compareTo(a, a - i * delta, 5));
            } }else {{
                __CLR4_4_12h342h34lb90pf6x.R.inc(115609);Assert.assertEquals(-1, Precision.compareTo(a, a + i * delta, 5));
                __CLR4_4_12h342h34lb90pf6x.R.inc(115610);Assert.assertEquals(+1, Precision.compareTo(a, a - i * delta, 5));
            }
        }}

        }__CLR4_4_12h342h34lb90pf6x.R.inc(115611);Assert.assertEquals( 0, Precision.compareTo(-0.0, 0.0, 0));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115612);Assert.assertEquals(-1, Precision.compareTo(-Double.MIN_VALUE, -0.0, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115613);Assert.assertEquals( 0, Precision.compareTo(-Double.MIN_VALUE, -0.0, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115614);Assert.assertEquals(-1, Precision.compareTo(-Double.MIN_VALUE, +0.0, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115615);Assert.assertEquals( 0, Precision.compareTo(-Double.MIN_VALUE, +0.0, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115616);Assert.assertEquals(+1, Precision.compareTo( Double.MIN_VALUE, -0.0, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115617);Assert.assertEquals( 0, Precision.compareTo( Double.MIN_VALUE, -0.0, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115618);Assert.assertEquals(+1, Precision.compareTo( Double.MIN_VALUE, +0.0, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115619);Assert.assertEquals( 0, Precision.compareTo( Double.MIN_VALUE, +0.0, 1));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115620);Assert.assertEquals(-1, Precision.compareTo(-Double.MIN_VALUE, Double.MIN_VALUE, 0));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115621);Assert.assertEquals(-1, Precision.compareTo(-Double.MIN_VALUE, Double.MIN_VALUE, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115622);Assert.assertEquals( 0, Precision.compareTo(-Double.MIN_VALUE, Double.MIN_VALUE, 2));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115623);Assert.assertEquals( 0, Precision.compareTo(Double.MAX_VALUE, Double.POSITIVE_INFINITY, 1));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115624);Assert.assertEquals(-1, Precision.compareTo(Double.MAX_VALUE, Double.POSITIVE_INFINITY, 0));

        __CLR4_4_12h342h34lb90pf6x.R.inc(115625);Assert.assertEquals(+1, Precision.compareTo(Double.MAX_VALUE, Double.NaN, Integer.MAX_VALUE));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115626);Assert.assertEquals(+1, Precision.compareTo(Double.NaN, Double.MAX_VALUE, Integer.MAX_VALUE));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testRoundDouble() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7xzkc2h7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testRoundDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7xzkc2h7v(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115627);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115628);double x = 1.234567890;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115629);Assert.assertEquals(1.23, Precision.round(x, 2), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115630);Assert.assertEquals(1.235, Precision.round(x, 3), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115631);Assert.assertEquals(1.2346, Precision.round(x, 4), 0.0);

        // JIRA MATH-151
        __CLR4_4_12h342h34lb90pf6x.R.inc(115632);Assert.assertEquals(39.25, Precision.round(39.245, 2), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115633);Assert.assertEquals(39.24, Precision.round(39.245, 2, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115634);double xx = 39.0;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115635);xx = xx + 245d / 1000d;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115636);Assert.assertEquals(39.25, Precision.round(xx, 2), 0.0);

        // BZ 35904
        __CLR4_4_12h342h34lb90pf6x.R.inc(115637);Assert.assertEquals(30.1d, Precision.round(30.095d, 2), 0.0d);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115638);Assert.assertEquals(30.1d, Precision.round(30.095d, 1), 0.0d);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115639);Assert.assertEquals(33.1d, Precision.round(33.095d, 1), 0.0d);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115640);Assert.assertEquals(33.1d, Precision.round(33.095d, 2), 0.0d);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115641);Assert.assertEquals(50.09d, Precision.round(50.085d, 2), 0.0d);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115642);Assert.assertEquals(50.19d, Precision.round(50.185d, 2), 0.0d);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115643);Assert.assertEquals(50.01d, Precision.round(50.005d, 2), 0.0d);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115644);Assert.assertEquals(30.01d, Precision.round(30.005d, 2), 0.0d);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115645);Assert.assertEquals(30.65d, Precision.round(30.645d, 2), 0.0d);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115646);Assert.assertEquals(1.24, Precision.round(x, 2, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115647);Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115648);Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115649);Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115650);Assert.assertEquals(-1.234, Precision.round(-x, 3, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115651);Assert.assertEquals(-1.2345, Precision.round(-x, 4, BigDecimal.ROUND_CEILING), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115652);Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115653);Assert.assertEquals(1.234, Precision.round(x, 3, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115654);Assert.assertEquals(1.2345, Precision.round(x, 4, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115655);Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115656);Assert.assertEquals(-1.234, Precision.round(-x, 3, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115657);Assert.assertEquals(-1.2345, Precision.round(-x, 4, BigDecimal.ROUND_DOWN), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115658);Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115659);Assert.assertEquals(1.234, Precision.round(x, 3, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115660);Assert.assertEquals(1.2345, Precision.round(x, 4, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115661);Assert.assertEquals(-1.24, Precision.round(-x, 2, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115662);Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115663);Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_FLOOR), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115664);Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115665);Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115666);Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115667);Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115668);Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115669);Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115670);Assert.assertEquals(1.234, Precision.round(1.2345, 3, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115671);Assert.assertEquals(-1.234, Precision.round(-1.2345, 3, BigDecimal.ROUND_HALF_DOWN), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115672);Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115673);Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115674);Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115675);Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115676);Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115677);Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115678);Assert.assertEquals(1.234, Precision.round(1.2345, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115679);Assert.assertEquals(-1.234, Precision.round(-1.2345, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115680);Assert.assertEquals(1.236, Precision.round(1.2355, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115681);Assert.assertEquals(-1.236, Precision.round(-1.2355, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115682);Assert.assertEquals(1.23, Precision.round(x, 2, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115683);Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115684);Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115685);Assert.assertEquals(-1.23, Precision.round(-x, 2, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115686);Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115687);Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115688);Assert.assertEquals(1.235, Precision.round(1.2345, 3, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115689);Assert.assertEquals(-1.235, Precision.round(-1.2345, 3, BigDecimal.ROUND_HALF_UP), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115690);Assert.assertEquals(-1.23, Precision.round(-1.23, 2, BigDecimal.ROUND_UNNECESSARY), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115691);Assert.assertEquals(1.23, Precision.round(1.23, 2, BigDecimal.ROUND_UNNECESSARY), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115692);try {
            __CLR4_4_12h342h34lb90pf6x.R.inc(115693);Precision.round(1.234, 2, BigDecimal.ROUND_UNNECESSARY);
            __CLR4_4_12h342h34lb90pf6x.R.inc(115694);Assert.fail();
        } catch (ArithmeticException ex) {
            // expected
        }

        __CLR4_4_12h342h34lb90pf6x.R.inc(115695);Assert.assertEquals(1.24, Precision.round(x, 2, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115696);Assert.assertEquals(1.235, Precision.round(x, 3, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115697);Assert.assertEquals(1.2346, Precision.round(x, 4, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115698);Assert.assertEquals(-1.24, Precision.round(-x, 2, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115699);Assert.assertEquals(-1.235, Precision.round(-x, 3, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115700);Assert.assertEquals(-1.2346, Precision.round(-x, 4, BigDecimal.ROUND_UP), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115701);try {
            __CLR4_4_12h342h34lb90pf6x.R.inc(115702);Precision.round(1.234, 2, 1923);
            __CLR4_4_12h342h34lb90pf6x.R.inc(115703);Assert.fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // MATH-151
        __CLR4_4_12h342h34lb90pf6x.R.inc(115704);Assert.assertEquals(39.25, Precision.round(39.245, 2, BigDecimal.ROUND_HALF_UP), 0.0);

        // special values
        __CLR4_4_12h342h34lb90pf6x.R.inc(115705);TestUtils.assertEquals(Double.NaN, Precision.round(Double.NaN, 2), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115706);Assert.assertEquals(0.0, Precision.round(0.0, 2), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115707);Assert.assertEquals(Double.POSITIVE_INFINITY, Precision.round(Double.POSITIVE_INFINITY, 2), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115708);Assert.assertEquals(Double.NEGATIVE_INFINITY, Precision.round(Double.NEGATIVE_INFINITY, 2), 0.0);
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testRoundFloat() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qvxlz2ha5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testRoundFloat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qvxlz2ha5(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115709);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115710);float x = 1.234567890f;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115711);Assert.assertEquals(1.23f, Precision.round(x, 2), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115712);Assert.assertEquals(1.235f, Precision.round(x, 3), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115713);Assert.assertEquals(1.2346f, Precision.round(x, 4), 0.0);

        // BZ 35904
        __CLR4_4_12h342h34lb90pf6x.R.inc(115714);Assert.assertEquals(30.1f, Precision.round(30.095f, 2), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115715);Assert.assertEquals(30.1f, Precision.round(30.095f, 1), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115716);Assert.assertEquals(50.09f, Precision.round(50.085f, 2), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115717);Assert.assertEquals(50.19f, Precision.round(50.185f, 2), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115718);Assert.assertEquals(50.01f, Precision.round(50.005f, 2), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115719);Assert.assertEquals(30.01f, Precision.round(30.005f, 2), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115720);Assert.assertEquals(30.65f, Precision.round(30.645f, 2), 0.0f);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115721);Assert.assertEquals(1.24f, Precision.round(x, 2, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115722);Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115723);Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115724);Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115725);Assert.assertEquals(-1.234f, Precision.round(-x, 3, BigDecimal.ROUND_CEILING), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115726);Assert.assertEquals(-1.2345f, Precision.round(-x, 4, BigDecimal.ROUND_CEILING), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115727);Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115728);Assert.assertEquals(1.234f, Precision.round(x, 3, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115729);Assert.assertEquals(1.2345f, Precision.round(x, 4, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115730);Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115731);Assert.assertEquals(-1.234f, Precision.round(-x, 3, BigDecimal.ROUND_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115732);Assert.assertEquals(-1.2345f, Precision.round(-x, 4, BigDecimal.ROUND_DOWN), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115733);Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115734);Assert.assertEquals(1.234f, Precision.round(x, 3, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115735);Assert.assertEquals(1.2345f, Precision.round(x, 4, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115736);Assert.assertEquals(-1.24f, Precision.round(-x, 2, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115737);Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_FLOOR), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115738);Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_FLOOR), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115739);Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115740);Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115741);Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115742);Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115743);Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115744);Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115745);Assert.assertEquals(1.234f, Precision.round(1.2345f, 3, BigDecimal.ROUND_HALF_DOWN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115746);Assert.assertEquals(-1.234f, Precision.round(-1.2345f, 3, BigDecimal.ROUND_HALF_DOWN), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115747);Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115748);Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115749);Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115750);Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115751);Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115752);Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115753);Assert.assertEquals(1.234f, Precision.round(1.2345f, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115754);Assert.assertEquals(-1.234f, Precision.round(-1.2345f, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115755);Assert.assertEquals(1.236f, Precision.round(1.2355f, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115756);Assert.assertEquals(-1.236f, Precision.round(-1.2355f, 3, BigDecimal.ROUND_HALF_EVEN), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115757);Assert.assertEquals(1.23f, Precision.round(x, 2, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115758);Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115759);Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115760);Assert.assertEquals(-1.23f, Precision.round(-x, 2, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115761);Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115762);Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115763);Assert.assertEquals(1.235f, Precision.round(1.2345f, 3, BigDecimal.ROUND_HALF_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115764);Assert.assertEquals(-1.235f, Precision.round(-1.2345f, 3, BigDecimal.ROUND_HALF_UP), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115765);Assert.assertEquals(-1.23f, Precision.round(-1.23f, 2, BigDecimal.ROUND_UNNECESSARY), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115766);Assert.assertEquals(1.23f, Precision.round(1.23f, 2, BigDecimal.ROUND_UNNECESSARY), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115767);try {
            __CLR4_4_12h342h34lb90pf6x.R.inc(115768);Precision.round(1.234f, 2, BigDecimal.ROUND_UNNECESSARY);
            __CLR4_4_12h342h34lb90pf6x.R.inc(115769);Assert.fail();
        } catch (MathArithmeticException ex) {
            // success
        }

        __CLR4_4_12h342h34lb90pf6x.R.inc(115770);Assert.assertEquals(1.24f, Precision.round(x, 2, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115771);Assert.assertEquals(1.235f, Precision.round(x, 3, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115772);Assert.assertEquals(1.2346f, Precision.round(x, 4, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115773);Assert.assertEquals(-1.24f, Precision.round(-x, 2, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115774);Assert.assertEquals(-1.235f, Precision.round(-x, 3, BigDecimal.ROUND_UP), 0.0);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115775);Assert.assertEquals(-1.2346f, Precision.round(-x, 4, BigDecimal.ROUND_UP), 0.0);

        __CLR4_4_12h342h34lb90pf6x.R.inc(115776);try {
            __CLR4_4_12h342h34lb90pf6x.R.inc(115777);Precision.round(1.234f, 2, 1923);
            __CLR4_4_12h342h34lb90pf6x.R.inc(115778);Assert.fail();
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // special values
        __CLR4_4_12h342h34lb90pf6x.R.inc(115779);TestUtils.assertEquals(Float.NaN, Precision.round(Float.NaN, 2), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115780);Assert.assertEquals(0.0f, Precision.round(0.0f, 2), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115781);Assert.assertEquals(Float.POSITIVE_INFINITY, Precision.round(Float.POSITIVE_INFINITY, 2), 0.0f);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115782);Assert.assertEquals(Float.NEGATIVE_INFINITY, Precision.round(Float.NEGATIVE_INFINITY, 2), 0.0f);
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}


    @Test
    public void testIssue721() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e04ly2hc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testIssue721",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e04ly2hc7(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115783);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115784);Assert.assertEquals(-53,   FastMath.getExponent(Precision.EPSILON));
        __CLR4_4_12h342h34lb90pf6x.R.inc(115785);Assert.assertEquals(-1022, FastMath.getExponent(Precision.SAFE_MIN));
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}


    @Test
    public void testRepresentableDelta() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vf12p2hca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testRepresentableDelta",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vf12p2hca(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115786);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115787);int nonRepresentableCount = 0;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115788);final double x = 100;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115789);final int numTrials = 10000;
        __CLR4_4_12h342h34lb90pf6x.R.inc(115790);for (int i = 0; (((i < numTrials)&&(__CLR4_4_12h342h34lb90pf6x.R.iget(115791)!=0|true))||(__CLR4_4_12h342h34lb90pf6x.R.iget(115792)==0&false)); i++) {{
            __CLR4_4_12h342h34lb90pf6x.R.inc(115793);final double originalDelta = Math.random();
            __CLR4_4_12h342h34lb90pf6x.R.inc(115794);final double delta = Precision.representableDelta(x, originalDelta);
            __CLR4_4_12h342h34lb90pf6x.R.inc(115795);if ((((delta != originalDelta)&&(__CLR4_4_12h342h34lb90pf6x.R.iget(115796)!=0|true))||(__CLR4_4_12h342h34lb90pf6x.R.iget(115797)==0&false))) {{
                __CLR4_4_12h342h34lb90pf6x.R.inc(115798);++nonRepresentableCount;
            }
        }}

        }__CLR4_4_12h342h34lb90pf6x.R.inc(115799);Assert.assertTrue(nonRepresentableCount / (double) numTrials > 0.9);
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}

    @Test
    public void testMath843() {__CLR4_4_12h342h34lb90pf6x.R.globalSliceStart(getClass().getName(),115800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z0ujks2hco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h342h34lb90pf6x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h342h34lb90pf6x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PrecisionTest.testMath843",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z0ujks2hco(){try{__CLR4_4_12h342h34lb90pf6x.R.inc(115800);
        __CLR4_4_12h342h34lb90pf6x.R.inc(115801);final double afterEpsilon = FastMath.nextAfter(Precision.EPSILON,
                                                       Double.POSITIVE_INFINITY);

        // a) 1 + EPSILON is equal to 1.
        __CLR4_4_12h342h34lb90pf6x.R.inc(115802);Assert.assertTrue(1 + Precision.EPSILON == 1);

        // b) 1 + "the number after EPSILON" is not equal to 1.
        __CLR4_4_12h342h34lb90pf6x.R.inc(115803);Assert.assertFalse(1 + afterEpsilon == 1);
    }finally{__CLR4_4_12h342h34lb90pf6x.R.flushNeeded();}}
}
