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
package org.apache.commons.math3.stat;


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link StatUtils} class.
 * @version $Id$
 */

public final class StatUtilsTest {static class __CLR4_4_129if29iflb90pejn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,105892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final double ONE = 1;
    private static final float  TWO = 2;
    private static final int    THREE = 3;
    private static final double MEAN = 2;
    private static final double SUMSQ = 18;
    private static final double SUM = 8;
    private static final double VAR = 0.666666666666666666667;
    private static final double MIN = 1;
    private static final double MAX = 3;
    private static final double TOLERANCE = 10E-15;
    private static final double NAN = Double.NaN;

    /** test stats */
    @Test
    public void testStats() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4xt829if();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testStats",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4xt829if(){try{__CLR4_4_129if29iflb90pejn.R.inc(105639);
        __CLR4_4_129if29iflb90pejn.R.inc(105640);double[] values = new double[] { ONE, TWO, TWO, THREE };
        __CLR4_4_129if29iflb90pejn.R.inc(105641);Assert.assertEquals("sum", SUM, StatUtils.sum(values), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105642);Assert.assertEquals("sumsq", SUMSQ, StatUtils.sumSq(values), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105643);Assert.assertEquals("var", VAR, StatUtils.variance(values), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105644);Assert.assertEquals("var with mean", VAR, StatUtils.variance(values, MEAN), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105645);Assert.assertEquals("mean", MEAN, StatUtils.mean(values), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105646);Assert.assertEquals("min", MIN, StatUtils.min(values), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105647);Assert.assertEquals("max", MAX, StatUtils.max(values), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testN0andN1Conditions() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161oc4l29io();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testN0andN1Conditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161oc4l29io(){try{__CLR4_4_129if29iflb90pejn.R.inc(105648);
        __CLR4_4_129if29iflb90pejn.R.inc(105649);double[] values = new double[0];

        __CLR4_4_129if29iflb90pejn.R.inc(105650);Assert.assertTrue(
            "Mean of n = 0 set should be NaN",
            Double.isNaN(StatUtils.mean(values)));
        __CLR4_4_129if29iflb90pejn.R.inc(105651);Assert.assertTrue(
            "Variance of n = 0 set should be NaN",
            Double.isNaN(StatUtils.variance(values)));

        __CLR4_4_129if29iflb90pejn.R.inc(105652);values = new double[] { ONE };

        __CLR4_4_129if29iflb90pejn.R.inc(105653);Assert.assertTrue(
            "Mean of n = 1 set should be value of single item n1",
            StatUtils.mean(values) == ONE);
        __CLR4_4_129if29iflb90pejn.R.inc(105654);Assert.assertTrue(
            "Variance of n = 1 set should be zero",
            StatUtils.variance(values) == 0);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testArrayIndexConditions() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfec4629iv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testArrayIndexConditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfec4629iv(){try{__CLR4_4_129if29iflb90pejn.R.inc(105655);
        __CLR4_4_129if29iflb90pejn.R.inc(105656);double[] values = { 1.0, 2.0, 3.0, 4.0 };

        __CLR4_4_129if29iflb90pejn.R.inc(105657);Assert.assertEquals(
            "Sum not expected",
            5.0,
            StatUtils.sum(values, 1, 2),
            Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105658);Assert.assertEquals(
            "Sum not expected",
            3.0,
            StatUtils.sum(values, 0, 2),
            Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105659);Assert.assertEquals(
            "Sum not expected",
            7.0,
            StatUtils.sum(values, 2, 2),
            Double.MIN_VALUE);

        __CLR4_4_129if29iflb90pejn.R.inc(105660);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105661);StatUtils.sum(values, 2, 3);
            __CLR4_4_129if29iflb90pejn.R.inc(105662);Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }

        __CLR4_4_129if29iflb90pejn.R.inc(105663);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105664);StatUtils.sum(values, -1, 2);
            __CLR4_4_129if29iflb90pejn.R.inc(105665);Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }

    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testSumSq() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8fksi29j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testSumSq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8fksi29j6(){try{__CLR4_4_129if29iflb90pejn.R.inc(105666);
        __CLR4_4_129if29iflb90pejn.R.inc(105667);double[] x = null;

        // test null
        __CLR4_4_129if29iflb90pejn.R.inc(105668);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105669);StatUtils.sumSq(x);
            __CLR4_4_129if29iflb90pejn.R.inc(105670);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        __CLR4_4_129if29iflb90pejn.R.inc(105671);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105672);StatUtils.sumSq(x, 0, 4);
            __CLR4_4_129if29iflb90pejn.R.inc(105673);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105674);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105675);TestUtils.assertEquals(0, StatUtils.sumSq(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105676);TestUtils.assertEquals(0, StatUtils.sumSq(x, 0, 0), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105677);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105678);TestUtils.assertEquals(4, StatUtils.sumSq(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105679);TestUtils.assertEquals(4, StatUtils.sumSq(x, 0, 1), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105680);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105681);TestUtils.assertEquals(18, StatUtils.sumSq(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105682);TestUtils.assertEquals(8, StatUtils.sumSq(x, 1, 2), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testProduct() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1begokc29jn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1begokc29jn(){try{__CLR4_4_129if29iflb90pejn.R.inc(105683);
        __CLR4_4_129if29iflb90pejn.R.inc(105684);double[] x = null;

        // test null
        __CLR4_4_129if29iflb90pejn.R.inc(105685);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105686);StatUtils.product(x);
            __CLR4_4_129if29iflb90pejn.R.inc(105687);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        __CLR4_4_129if29iflb90pejn.R.inc(105688);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105689);StatUtils.product(x, 0, 4);
            __CLR4_4_129if29iflb90pejn.R.inc(105690);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105691);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105692);TestUtils.assertEquals(1, StatUtils.product(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105693);TestUtils.assertEquals(1, StatUtils.product(x, 0, 0), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105694);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105695);TestUtils.assertEquals(TWO, StatUtils.product(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105696);TestUtils.assertEquals(TWO, StatUtils.product(x, 0, 1), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105697);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105698);TestUtils.assertEquals(12, StatUtils.product(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105699);TestUtils.assertEquals(4, StatUtils.product(x, 1, 2), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testSumLog() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fqx9q29k4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testSumLog",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fqx9q29k4(){try{__CLR4_4_129if29iflb90pejn.R.inc(105700);
        __CLR4_4_129if29iflb90pejn.R.inc(105701);double[] x = null;

        // test null
        __CLR4_4_129if29iflb90pejn.R.inc(105702);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105703);StatUtils.sumLog(x);
            __CLR4_4_129if29iflb90pejn.R.inc(105704);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        __CLR4_4_129if29iflb90pejn.R.inc(105705);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105706);StatUtils.sumLog(x, 0, 4);
            __CLR4_4_129if29iflb90pejn.R.inc(105707);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105708);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105709);TestUtils.assertEquals(0, StatUtils.sumLog(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105710);TestUtils.assertEquals(0, StatUtils.sumLog(x, 0, 0), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105711);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105712);TestUtils.assertEquals(FastMath.log(TWO), StatUtils.sumLog(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105713);TestUtils.assertEquals(FastMath.log(TWO), StatUtils.sumLog(x, 0, 1), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105714);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105715);TestUtils.assertEquals(FastMath.log(ONE) + 2.0 * FastMath.log(TWO) + FastMath.log(THREE), StatUtils.sumLog(x), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105716);TestUtils.assertEquals(2.0 * FastMath.log(TWO), StatUtils.sumLog(x, 1, 2), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testMean() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g14ffm29kl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g14ffm29kl(){try{__CLR4_4_129if29iflb90pejn.R.inc(105717);
        __CLR4_4_129if29iflb90pejn.R.inc(105718);double[] x = null;

        __CLR4_4_129if29iflb90pejn.R.inc(105719);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105720);StatUtils.mean(x, 0, 4);
            __CLR4_4_129if29iflb90pejn.R.inc(105721);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105722);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105723);TestUtils.assertEquals(Double.NaN, StatUtils.mean(x, 0, 0), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105724);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105725);TestUtils.assertEquals(TWO, StatUtils.mean(x, 0, 1), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105726);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105727);TestUtils.assertEquals(2.5, StatUtils.mean(x, 2, 2), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testVariance() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0a1va29kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0a1va29kw(){try{__CLR4_4_129if29iflb90pejn.R.inc(105728);
        __CLR4_4_129if29iflb90pejn.R.inc(105729);double[] x = null;

        __CLR4_4_129if29iflb90pejn.R.inc(105730);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105731);StatUtils.variance(x, 0, 4);
            __CLR4_4_129if29iflb90pejn.R.inc(105732);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105733);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105734);TestUtils.assertEquals(Double.NaN, StatUtils.variance(x, 0, 0), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105735);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105736);TestUtils.assertEquals(0.0, StatUtils.variance(x, 0, 1), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105737);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105738);TestUtils.assertEquals(0.5, StatUtils.variance(x, 2, 2), TOLERANCE);

        // test precomputed mean
        __CLR4_4_129if29iflb90pejn.R.inc(105739);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105740);TestUtils.assertEquals(0.5, StatUtils.variance(x,2.5, 2, 2), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}
    
    @Test
    public void testPopulationVariance() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uw9cbt29l9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testPopulationVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uw9cbt29l9(){try{__CLR4_4_129if29iflb90pejn.R.inc(105741);
        __CLR4_4_129if29iflb90pejn.R.inc(105742);double[] x = null;

        __CLR4_4_129if29iflb90pejn.R.inc(105743);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105744);StatUtils.variance(x, 0, 4);
            __CLR4_4_129if29iflb90pejn.R.inc(105745);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105746);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105747);TestUtils.assertEquals(Double.NaN, StatUtils.populationVariance(x, 0, 0), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105748);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105749);TestUtils.assertEquals(0.0, StatUtils.populationVariance(x, 0, 1), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105750);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105751);TestUtils.assertEquals(0.25, StatUtils.populationVariance(x, 0, 2), TOLERANCE);

        // test precomputed mean
        __CLR4_4_129if29iflb90pejn.R.inc(105752);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105753);TestUtils.assertEquals(0.25, StatUtils.populationVariance(x, 2.5, 2, 2), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}


    @Test
    public void testMax() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxwg3r29lm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxwg3r29lm(){try{__CLR4_4_129if29iflb90pejn.R.inc(105754);
        __CLR4_4_129if29iflb90pejn.R.inc(105755);double[] x = null;

        __CLR4_4_129if29iflb90pejn.R.inc(105756);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105757);StatUtils.max(x, 0, 4);
            __CLR4_4_129if29iflb90pejn.R.inc(105758);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105759);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105760);TestUtils.assertEquals(Double.NaN, StatUtils.max(x, 0, 0), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105761);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105762);TestUtils.assertEquals(TWO, StatUtils.max(x, 0, 1), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105763);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105764);TestUtils.assertEquals(THREE, StatUtils.max(x, 1, 3), TOLERANCE);

        // test first nan is ignored
        __CLR4_4_129if29iflb90pejn.R.inc(105765);x = new double[] {NAN, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105766);TestUtils.assertEquals(THREE, StatUtils.max(x), TOLERANCE);

        // test middle nan is ignored
        __CLR4_4_129if29iflb90pejn.R.inc(105767);x = new double[] {ONE, NAN, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105768);TestUtils.assertEquals(THREE, StatUtils.max(x), TOLERANCE);

        // test last nan is ignored
        __CLR4_4_129if29iflb90pejn.R.inc(105769);x = new double[] {ONE, TWO, NAN};
        __CLR4_4_129if29iflb90pejn.R.inc(105770);TestUtils.assertEquals(TWO, StatUtils.max(x), TOLERANCE);

        // test all nan returns nan
        __CLR4_4_129if29iflb90pejn.R.inc(105771);x = new double[] {NAN, NAN, NAN};
        __CLR4_4_129if29iflb90pejn.R.inc(105772);TestUtils.assertEquals(NAN, StatUtils.max(x), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testMin() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psd1ll29m5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psd1ll29m5(){try{__CLR4_4_129if29iflb90pejn.R.inc(105773);
        __CLR4_4_129if29iflb90pejn.R.inc(105774);double[] x = null;

        __CLR4_4_129if29iflb90pejn.R.inc(105775);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105776);StatUtils.min(x, 0, 4);
            __CLR4_4_129if29iflb90pejn.R.inc(105777);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105778);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105779);TestUtils.assertEquals(Double.NaN, StatUtils.min(x, 0, 0), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105780);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105781);TestUtils.assertEquals(TWO, StatUtils.min(x, 0, 1), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105782);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105783);TestUtils.assertEquals(TWO, StatUtils.min(x, 1, 3), TOLERANCE);

        // test first nan is ignored
        __CLR4_4_129if29iflb90pejn.R.inc(105784);x = new double[] {NAN, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105785);TestUtils.assertEquals(TWO, StatUtils.min(x), TOLERANCE);

        // test middle nan is ignored
        __CLR4_4_129if29iflb90pejn.R.inc(105786);x = new double[] {ONE, NAN, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105787);TestUtils.assertEquals(ONE, StatUtils.min(x), TOLERANCE);

        // test last nan is ignored
        __CLR4_4_129if29iflb90pejn.R.inc(105788);x = new double[] {ONE, TWO, NAN};
        __CLR4_4_129if29iflb90pejn.R.inc(105789);TestUtils.assertEquals(ONE, StatUtils.min(x), TOLERANCE);

        // test all nan returns nan
        __CLR4_4_129if29iflb90pejn.R.inc(105790);x = new double[] {NAN, NAN, NAN};
        __CLR4_4_129if29iflb90pejn.R.inc(105791);TestUtils.assertEquals(NAN, StatUtils.min(x), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testPercentile() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11po5ka29mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testPercentile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11po5ka29mo(){try{__CLR4_4_129if29iflb90pejn.R.inc(105792);
        __CLR4_4_129if29iflb90pejn.R.inc(105793);double[] x = null;

        // test null
        __CLR4_4_129if29iflb90pejn.R.inc(105794);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105795);StatUtils.percentile(x, .25);
            __CLR4_4_129if29iflb90pejn.R.inc(105796);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        __CLR4_4_129if29iflb90pejn.R.inc(105797);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105798);StatUtils.percentile(x, 0, 4, 0.25);
            __CLR4_4_129if29iflb90pejn.R.inc(105799);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException ex) {
            // success
        }

        // test empty
        __CLR4_4_129if29iflb90pejn.R.inc(105800);x = new double[] {};
        __CLR4_4_129if29iflb90pejn.R.inc(105801);TestUtils.assertEquals(Double.NaN, StatUtils.percentile(x, 25), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105802);TestUtils.assertEquals(Double.NaN, StatUtils.percentile(x, 0, 0, 25), TOLERANCE);

        // test one
        __CLR4_4_129if29iflb90pejn.R.inc(105803);x = new double[] {TWO};
        __CLR4_4_129if29iflb90pejn.R.inc(105804);TestUtils.assertEquals(TWO, StatUtils.percentile(x, 25), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105805);TestUtils.assertEquals(TWO, StatUtils.percentile(x, 0, 1, 25), TOLERANCE);

        // test many
        __CLR4_4_129if29iflb90pejn.R.inc(105806);x = new double[] {ONE, TWO, TWO, THREE};
        __CLR4_4_129if29iflb90pejn.R.inc(105807);TestUtils.assertEquals(2.5, StatUtils.percentile(x, 70), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105808);TestUtils.assertEquals(2.5, StatUtils.percentile(x, 1, 3, 62.5), TOLERANCE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testDifferenceStats() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vld0vr29n5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testDifferenceStats",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vld0vr29n5(){try{__CLR4_4_129if29iflb90pejn.R.inc(105809);
        __CLR4_4_129if29iflb90pejn.R.inc(105810);double sample1[] = {1d, 2d, 3d, 4d};
        __CLR4_4_129if29iflb90pejn.R.inc(105811);double sample2[] = {1d, 3d, 4d, 2d};
        __CLR4_4_129if29iflb90pejn.R.inc(105812);double diff[] = {0d, -1d, -1d, 2d};
        __CLR4_4_129if29iflb90pejn.R.inc(105813);double small[] = {1d, 4d};
        __CLR4_4_129if29iflb90pejn.R.inc(105814);double meanDifference = StatUtils.meanDifference(sample1, sample2);
        __CLR4_4_129if29iflb90pejn.R.inc(105815);Assert.assertEquals(StatUtils.sumDifference(sample1, sample2), StatUtils.sum(diff), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105816);Assert.assertEquals(meanDifference, StatUtils.mean(diff), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105817);Assert.assertEquals(StatUtils.varianceDifference(sample1, sample2, meanDifference),
                StatUtils.variance(diff), TOLERANCE);
        __CLR4_4_129if29iflb90pejn.R.inc(105818);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105819);StatUtils.meanDifference(sample1, small);
            __CLR4_4_129if29iflb90pejn.R.inc(105820);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_129if29iflb90pejn.R.inc(105821);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105822);StatUtils.varianceDifference(sample1, small, meanDifference);
            __CLR4_4_129if29iflb90pejn.R.inc(105823);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_129if29iflb90pejn.R.inc(105824);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105825);double[] single = {1.0};
            __CLR4_4_129if29iflb90pejn.R.inc(105826);StatUtils.varianceDifference(single, single, meanDifference);
            __CLR4_4_129if29iflb90pejn.R.inc(105827);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    @Test
    public void testGeometricMean() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cohekb29no();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testGeometricMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cohekb29no(){try{__CLR4_4_129if29iflb90pejn.R.inc(105828);
        __CLR4_4_129if29iflb90pejn.R.inc(105829);double[] test = null;
        __CLR4_4_129if29iflb90pejn.R.inc(105830);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105831);StatUtils.geometricMean(test);
            __CLR4_4_129if29iflb90pejn.R.inc(105832);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_129if29iflb90pejn.R.inc(105833);test = new double[] {2, 4, 6, 8};
        __CLR4_4_129if29iflb90pejn.R.inc(105834);Assert.assertEquals(FastMath.exp(0.25d * StatUtils.sumLog(test)),
                StatUtils.geometricMean(test), Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105835);Assert.assertEquals(FastMath.exp(0.5 * StatUtils.sumLog(test, 0, 2)),
                StatUtils.geometricMean(test, 0, 2), Double.MIN_VALUE);
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}
    
    
    /**
     * Run the test with the values 50 and 100 and assume standardized values    
     */

    @Test
    public void testNormalize1() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxugsj29nw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testNormalize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxugsj29nw(){try{__CLR4_4_129if29iflb90pejn.R.inc(105836);
        __CLR4_4_129if29iflb90pejn.R.inc(105837);double sample[] = { 50, 100 };
        __CLR4_4_129if29iflb90pejn.R.inc(105838);double expectedSample[] = { -25 / Math.sqrt(1250), 25 / Math.sqrt(1250) };
        __CLR4_4_129if29iflb90pejn.R.inc(105839);double[] out = StatUtils.normalize(sample);
        __CLR4_4_129if29iflb90pejn.R.inc(105840);for (int i = 0; (((i < out.length)&&(__CLR4_4_129if29iflb90pejn.R.iget(105841)!=0|true))||(__CLR4_4_129if29iflb90pejn.R.iget(105842)==0&false)); i++) {{
            __CLR4_4_129if29iflb90pejn.R.inc(105843);Assert.assertTrue(Precision.equals(out[i], expectedSample[i], 1));
        }

    }}finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

    /**
     * Run with 77 random values, assuming that the outcome has a mean of 0 and a standard deviation of 1 with a
     * precision of 1E-10.
     */

    @Test
    public void testNormalize2() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ioui0229o4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testNormalize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ioui0229o4(){try{__CLR4_4_129if29iflb90pejn.R.inc(105844);
        // create an sample with 77 values    
        __CLR4_4_129if29iflb90pejn.R.inc(105845);int length = 77;
        __CLR4_4_129if29iflb90pejn.R.inc(105846);double sample[] = new double[length];
        __CLR4_4_129if29iflb90pejn.R.inc(105847);for (int i = 0; (((i < length)&&(__CLR4_4_129if29iflb90pejn.R.iget(105848)!=0|true))||(__CLR4_4_129if29iflb90pejn.R.iget(105849)==0&false)); i++) {{
            __CLR4_4_129if29iflb90pejn.R.inc(105850);sample[i] = Math.random();
        }
        // normalize this sample
        }__CLR4_4_129if29iflb90pejn.R.inc(105851);double standardizedSample[] = StatUtils.normalize(sample);

        __CLR4_4_129if29iflb90pejn.R.inc(105852);DescriptiveStatistics stats = new DescriptiveStatistics();
        // Add the data from the array
        __CLR4_4_129if29iflb90pejn.R.inc(105853);for (int i = 0; (((i < length)&&(__CLR4_4_129if29iflb90pejn.R.iget(105854)!=0|true))||(__CLR4_4_129if29iflb90pejn.R.iget(105855)==0&false)); i++) {{
            __CLR4_4_129if29iflb90pejn.R.inc(105856);stats.addValue(standardizedSample[i]);
        }
        // the calculations do have a limited precision    
        }__CLR4_4_129if29iflb90pejn.R.inc(105857);double distance = 1E-10;
        // check the mean an standard deviation
        __CLR4_4_129if29iflb90pejn.R.inc(105858);Assert.assertEquals(0.0, stats.getMean(), distance);
        __CLR4_4_129if29iflb90pejn.R.inc(105859);Assert.assertEquals(1.0, stats.getStandardDeviation(), distance);

    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}
    
    @Test
    public void testMode() {__CLR4_4_129if29iflb90pejn.R.globalSliceStart(getClass().getName(),105860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mixofw29ok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129if29iflb90pejn.R.rethrow($CLV_t2$);}finally{__CLR4_4_129if29iflb90pejn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.StatUtilsTest.testMode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mixofw29ok(){try{__CLR4_4_129if29iflb90pejn.R.inc(105860);
        __CLR4_4_129if29iflb90pejn.R.inc(105861);final double[] singleMode = {0, 1, 0, 2, 7, 11, 12};
        __CLR4_4_129if29iflb90pejn.R.inc(105862);final double[] modeSingle = StatUtils.mode(singleMode);
        __CLR4_4_129if29iflb90pejn.R.inc(105863);Assert.assertEquals(0, modeSingle[0], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105864);Assert.assertEquals(1, modeSingle.length);

        __CLR4_4_129if29iflb90pejn.R.inc(105865);final double[] twoMode = {0, 1, 2, 0, 2, 3, 7, 11};
        __CLR4_4_129if29iflb90pejn.R.inc(105866);final double[] modeDouble = StatUtils.mode(twoMode);
        __CLR4_4_129if29iflb90pejn.R.inc(105867);Assert.assertEquals(0, modeDouble[0], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105868);Assert.assertEquals(2, modeDouble[1], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105869);Assert.assertEquals(2, modeDouble.length);

        __CLR4_4_129if29iflb90pejn.R.inc(105870);final double[] nanInfested = {0, 0, 0, Double.NaN, Double.NaN, Double.NaN, Double.NaN, 2, 2, 2, 3, 5};
        __CLR4_4_129if29iflb90pejn.R.inc(105871);final double[] modeNan = StatUtils.mode(nanInfested);
        __CLR4_4_129if29iflb90pejn.R.inc(105872);Assert.assertEquals(0, modeNan[0], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105873);Assert.assertEquals(2, modeNan[1], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105874);Assert.assertEquals(2, modeNan.length);

        __CLR4_4_129if29iflb90pejn.R.inc(105875);final double[] infInfested = {0, 0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,
            Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 2, 2, 3, 5};
        __CLR4_4_129if29iflb90pejn.R.inc(105876);final double[] modeInf = StatUtils.mode(infInfested);
        __CLR4_4_129if29iflb90pejn.R.inc(105877);Assert.assertEquals(Double.NEGATIVE_INFINITY, modeInf[0], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105878);Assert.assertEquals(0, modeInf[1], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105879);Assert.assertEquals(2, modeInf[2], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105880);Assert.assertEquals(Double.POSITIVE_INFINITY, modeInf[3], Double.MIN_VALUE);
        __CLR4_4_129if29iflb90pejn.R.inc(105881);Assert.assertEquals(4, modeInf.length);

        __CLR4_4_129if29iflb90pejn.R.inc(105882);final double[] noData = {};
        __CLR4_4_129if29iflb90pejn.R.inc(105883);final double[] modeNodata = StatUtils.mode(noData);
        __CLR4_4_129if29iflb90pejn.R.inc(105884);Assert.assertEquals(0, modeNodata.length);

        __CLR4_4_129if29iflb90pejn.R.inc(105885);final double[] nansOnly = {Double.NaN, Double.NaN};
        __CLR4_4_129if29iflb90pejn.R.inc(105886);final double[] modeNansOnly = StatUtils.mode(nansOnly);
        __CLR4_4_129if29iflb90pejn.R.inc(105887);Assert.assertEquals(0, modeNansOnly.length);
        
        __CLR4_4_129if29iflb90pejn.R.inc(105888);final double[] nullArray = null;
        __CLR4_4_129if29iflb90pejn.R.inc(105889);try {
            __CLR4_4_129if29iflb90pejn.R.inc(105890);StatUtils.mode(nullArray);
            __CLR4_4_129if29iflb90pejn.R.inc(105891);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // Expected
        }
    }finally{__CLR4_4_129if29iflb90pejn.R.flushNeeded();}}

}
