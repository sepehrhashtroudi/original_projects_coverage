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
package org.apache.commons.math3.stat.inference;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the TestUtils class.
 *
 * @version $Id$
 */
public class TestUtilsTest {static class __CLR4_4_12buf2buflb90peqg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testChiSquare() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1axjeay2buf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testChiSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1axjeay2buf(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108663);

        // Target values computed using R version 1.8.1
        // Some assembly required ;-)
        //      Use sum((obs - exp)^2/exp) for the chi-square statistic and
        //      1 - pchisq(sum((obs - exp)^2/exp), length(obs) - 1) for the p-value

        __CLR4_4_12buf2buflb90peqg.R.inc(108664);long[] observed = {10, 9, 11};
        __CLR4_4_12buf2buflb90peqg.R.inc(108665);double[] expected = {10, 10, 10};
        __CLR4_4_12buf2buflb90peqg.R.inc(108666);Assert.assertEquals("chi-square statistic", 0.2,  TestUtils.chiSquare(expected, observed), 10E-12);
        __CLR4_4_12buf2buflb90peqg.R.inc(108667);Assert.assertEquals("chi-square p-value", 0.904837418036, TestUtils.chiSquareTest(expected, observed), 1E-10);

        __CLR4_4_12buf2buflb90peqg.R.inc(108668);long[] observed1 = { 500, 623, 72, 70, 31 };
        __CLR4_4_12buf2buflb90peqg.R.inc(108669);double[] expected1 = { 485, 541, 82, 61, 37 };
        __CLR4_4_12buf2buflb90peqg.R.inc(108670);Assert.assertEquals( "chi-square test statistic", 9.023307936427388, TestUtils.chiSquare(expected1, observed1), 1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108671);Assert.assertEquals("chi-square p-value", 0.06051952647453607, TestUtils.chiSquareTest(expected1, observed1), 1E-9);
        __CLR4_4_12buf2buflb90peqg.R.inc(108672);Assert.assertTrue("chi-square test reject", TestUtils.chiSquareTest(expected1, observed1, 0.07));
        __CLR4_4_12buf2buflb90peqg.R.inc(108673);Assert.assertTrue("chi-square test accept", !TestUtils.chiSquareTest(expected1, observed1, 0.05));

        __CLR4_4_12buf2buflb90peqg.R.inc(108674);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108675);TestUtils.chiSquareTest(expected1, observed1, 95);
            __CLR4_4_12buf2buflb90peqg.R.inc(108676);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108677);long[] tooShortObs = { 0 };
        __CLR4_4_12buf2buflb90peqg.R.inc(108678);double[] tooShortEx = { 1 };
        __CLR4_4_12buf2buflb90peqg.R.inc(108679);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108680);TestUtils.chiSquare(tooShortEx, tooShortObs);
            __CLR4_4_12buf2buflb90peqg.R.inc(108681);Assert.fail("arguments too short, DimensionMismatchException expected");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        // unmatched arrays
        __CLR4_4_12buf2buflb90peqg.R.inc(108682);long[] unMatchedObs = { 0, 1, 2, 3 };
        __CLR4_4_12buf2buflb90peqg.R.inc(108683);double[] unMatchedEx = { 1, 1, 2 };
        __CLR4_4_12buf2buflb90peqg.R.inc(108684);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108685);TestUtils.chiSquare(unMatchedEx, unMatchedObs);
            __CLR4_4_12buf2buflb90peqg.R.inc(108686);Assert.fail("arrays have different lengths, DimensionMismatchException expected");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        // 0 expected count
        __CLR4_4_12buf2buflb90peqg.R.inc(108687);expected[0] = 0;
        __CLR4_4_12buf2buflb90peqg.R.inc(108688);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108689);TestUtils.chiSquareTest(expected, observed, .01);
            __CLR4_4_12buf2buflb90peqg.R.inc(108690);Assert.fail("bad expected count, NotStrictlyPositiveException expected");
        } catch (NotStrictlyPositiveException ex) {
            // expected
        }

        // negative observed count
        __CLR4_4_12buf2buflb90peqg.R.inc(108691);expected[0] = 1;
        __CLR4_4_12buf2buflb90peqg.R.inc(108692);observed[0] = -1;
        __CLR4_4_12buf2buflb90peqg.R.inc(108693);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108694);TestUtils.chiSquareTest(expected, observed, .01);
            __CLR4_4_12buf2buflb90peqg.R.inc(108695);Assert.fail("bad expected count, NotPositiveException expected");
        } catch (NotPositiveException ex) {
            // expected
        }

    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    @Test
    public void testChiSquareIndependence() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1we4xda2bvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testChiSquareIndependence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1we4xda2bvc(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108696);

        // Target values computed using R version 1.8.1

        __CLR4_4_12buf2buflb90peqg.R.inc(108697);long[][] counts = { {40, 22, 43}, {91, 21, 28}, {60, 10, 22}};
        __CLR4_4_12buf2buflb90peqg.R.inc(108698);Assert.assertEquals( "chi-square test statistic", 22.709027688, TestUtils.chiSquare(counts), 1E-9);
        __CLR4_4_12buf2buflb90peqg.R.inc(108699);Assert.assertEquals("chi-square p-value", 0.000144751460134, TestUtils.chiSquareTest(counts), 1E-9);
        __CLR4_4_12buf2buflb90peqg.R.inc(108700);Assert.assertTrue("chi-square test reject", TestUtils.chiSquareTest(counts, 0.0002));
        __CLR4_4_12buf2buflb90peqg.R.inc(108701);Assert.assertTrue("chi-square test accept", !TestUtils.chiSquareTest(counts, 0.0001));

        __CLR4_4_12buf2buflb90peqg.R.inc(108702);long[][] counts2 = {{10, 15}, {30, 40}, {60, 90} };
        __CLR4_4_12buf2buflb90peqg.R.inc(108703);Assert.assertEquals( "chi-square test statistic", 0.168965517241, TestUtils.chiSquare(counts2), 1E-9);
        __CLR4_4_12buf2buflb90peqg.R.inc(108704);Assert.assertEquals("chi-square p-value",0.918987499852, TestUtils.chiSquareTest(counts2), 1E-9);
        __CLR4_4_12buf2buflb90peqg.R.inc(108705);Assert.assertTrue("chi-square test accept", !TestUtils.chiSquareTest(counts2, 0.1));

        // ragged input array
        __CLR4_4_12buf2buflb90peqg.R.inc(108706);long[][] counts3 = { {40, 22, 43}, {91, 21, 28}, {60, 10}};
        __CLR4_4_12buf2buflb90peqg.R.inc(108707);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108708);TestUtils.chiSquare(counts3);
            __CLR4_4_12buf2buflb90peqg.R.inc(108709);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        // insufficient data
        __CLR4_4_12buf2buflb90peqg.R.inc(108710);long[][] counts4 = {{40, 22, 43}};
        __CLR4_4_12buf2buflb90peqg.R.inc(108711);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108712);TestUtils.chiSquare(counts4);
            __CLR4_4_12buf2buflb90peqg.R.inc(108713);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException ex) {
            // expected
        }
        __CLR4_4_12buf2buflb90peqg.R.inc(108714);long[][] counts5 = {{40}, {40}, {30}, {10}};
        __CLR4_4_12buf2buflb90peqg.R.inc(108715);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108716);TestUtils.chiSquare(counts5);
            __CLR4_4_12buf2buflb90peqg.R.inc(108717);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        // negative counts
        __CLR4_4_12buf2buflb90peqg.R.inc(108718);long[][] counts6 = {{10, -2}, {30, 40}, {60, 90} };
        __CLR4_4_12buf2buflb90peqg.R.inc(108719);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108720);TestUtils.chiSquare(counts6);
            __CLR4_4_12buf2buflb90peqg.R.inc(108721);Assert.fail("Expecting NotPositiveException");
        } catch (NotPositiveException ex) {
            // expected
        }

        // bad alpha
        __CLR4_4_12buf2buflb90peqg.R.inc(108722);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108723);TestUtils.chiSquareTest(counts, 0);
            __CLR4_4_12buf2buflb90peqg.R.inc(108724);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    @Test
    public void testChiSquareLargeTestStatistic() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z7zprt2bw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testChiSquareLargeTestStatistic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z7zprt2bw5(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108725);
        __CLR4_4_12buf2buflb90peqg.R.inc(108726);double[] exp = new double[] {
                3389119.5, 649136.6, 285745.4, 25357364.76, 11291189.78, 543628.0,
                232921.0, 437665.75
        };

        __CLR4_4_12buf2buflb90peqg.R.inc(108727);long[] obs = new long[] {
                2372383, 584222, 257170, 17750155, 7903832, 489265, 209628, 393899
        };
        __CLR4_4_12buf2buflb90peqg.R.inc(108728);org.apache.commons.math3.stat.inference.ChiSquareTest csti =
            new org.apache.commons.math3.stat.inference.ChiSquareTest();
        __CLR4_4_12buf2buflb90peqg.R.inc(108729);double cst = csti.chiSquareTest(exp, obs);
        __CLR4_4_12buf2buflb90peqg.R.inc(108730);Assert.assertEquals("chi-square p-value", 0.0, cst, 1E-3);
        __CLR4_4_12buf2buflb90peqg.R.inc(108731);Assert.assertEquals( "chi-square test statistic",
                114875.90421929007, TestUtils.chiSquare(exp, obs), 1E-9);
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    /** Contingency table containing zeros - PR # 32531 */
    @Test
    public void testChiSquareZeroCount() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i8wun52bwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testChiSquareZeroCount",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i8wun52bwc(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108732);
        // Target values computed using R version 1.8.1
        __CLR4_4_12buf2buflb90peqg.R.inc(108733);long[][] counts = { {40, 0, 4}, {91, 1, 2}, {60, 2, 0}};
        __CLR4_4_12buf2buflb90peqg.R.inc(108734);Assert.assertEquals( "chi-square test statistic", 9.67444662263,
                TestUtils.chiSquare(counts), 1E-9);
        __CLR4_4_12buf2buflb90peqg.R.inc(108735);Assert.assertEquals("chi-square p-value", 0.0462835770603,
                TestUtils.chiSquareTest(counts), 1E-9);
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    private double[] tooShortObs = { 1.0 };
    private double[] emptyObs = {};
    private SummaryStatistics emptyStats = new SummaryStatistics();

    @Test
    public void testOneSampleT() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ju5ljx2bwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testOneSampleT",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ju5ljx2bwg(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108736);
        __CLR4_4_12buf2buflb90peqg.R.inc(108737);double[] observed =
            {93.0, 103.0, 95.0, 101.0, 91.0, 105.0, 96.0, 94.0, 101.0,  88.0, 98.0, 94.0, 101.0, 92.0, 95.0 };
        __CLR4_4_12buf2buflb90peqg.R.inc(108738);double mu = 100.0;
        __CLR4_4_12buf2buflb90peqg.R.inc(108739);SummaryStatistics sampleStats = null;
        __CLR4_4_12buf2buflb90peqg.R.inc(108740);sampleStats = new SummaryStatistics();
        __CLR4_4_12buf2buflb90peqg.R.inc(108741);for (int i = 0; (((i < observed.length)&&(__CLR4_4_12buf2buflb90peqg.R.iget(108742)!=0|true))||(__CLR4_4_12buf2buflb90peqg.R.iget(108743)==0&false)); i++) {{
            __CLR4_4_12buf2buflb90peqg.R.inc(108744);sampleStats.addValue(observed[i]);
        }

        // Target comparison values computed using R version 1.8.1 (Linux version)
        }__CLR4_4_12buf2buflb90peqg.R.inc(108745);Assert.assertEquals("t statistic",  -2.81976445346,
                TestUtils.t(mu, observed), 10E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108746);Assert.assertEquals("t statistic",  -2.81976445346,
                TestUtils.t(mu, sampleStats), 10E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108747);Assert.assertEquals("p value", 0.0136390585873,
                TestUtils.tTest(mu, observed), 10E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108748);Assert.assertEquals("p value", 0.0136390585873,
                TestUtils.tTest(mu, sampleStats), 10E-10);

        __CLR4_4_12buf2buflb90peqg.R.inc(108749);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108750);TestUtils.t(mu, (double[]) null);
            __CLR4_4_12buf2buflb90peqg.R.inc(108751);Assert.fail("arguments too short, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108752);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108753);TestUtils.t(mu, (SummaryStatistics) null);
            __CLR4_4_12buf2buflb90peqg.R.inc(108754);Assert.fail("arguments too short, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108755);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108756);TestUtils.t(mu, emptyObs);
            __CLR4_4_12buf2buflb90peqg.R.inc(108757);Assert.fail("arguments too short, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108758);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108759);TestUtils.t(mu, emptyStats);
            __CLR4_4_12buf2buflb90peqg.R.inc(108760);Assert.fail("arguments too short, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108761);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108762);TestUtils.t(mu, tooShortObs);
            __CLR4_4_12buf2buflb90peqg.R.inc(108763);Assert.fail("insufficient data to compute t statistic, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_12buf2buflb90peqg.R.inc(108764);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108765);TestUtils.tTest(mu, tooShortObs);
            __CLR4_4_12buf2buflb90peqg.R.inc(108766);Assert.fail("insufficient data to perform t test, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108767);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108768);TestUtils.t(mu, (SummaryStatistics) null);
            __CLR4_4_12buf2buflb90peqg.R.inc(108769);Assert.fail("insufficient data to compute t statistic, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        __CLR4_4_12buf2buflb90peqg.R.inc(108770);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108771);TestUtils.tTest(mu, (SummaryStatistics) null);
            __CLR4_4_12buf2buflb90peqg.R.inc(108772);Assert.fail("insufficient data to perform t test, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    @Test
    public void testOneSampleTTest() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q21df52bxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testOneSampleTTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q21df52bxh(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108773);
        __CLR4_4_12buf2buflb90peqg.R.inc(108774);double[] oneSidedP =
            {2d, 0d, 6d, 6d, 3d, 3d, 2d, 3d, -6d, 6d, 6d, 6d, 3d, 0d, 1d, 1d, 0d, 2d, 3d, 3d };
        __CLR4_4_12buf2buflb90peqg.R.inc(108775);SummaryStatistics oneSidedPStats = new SummaryStatistics();
        __CLR4_4_12buf2buflb90peqg.R.inc(108776);for (int i = 0; (((i < oneSidedP.length)&&(__CLR4_4_12buf2buflb90peqg.R.iget(108777)!=0|true))||(__CLR4_4_12buf2buflb90peqg.R.iget(108778)==0&false)); i++) {{
            __CLR4_4_12buf2buflb90peqg.R.inc(108779);oneSidedPStats.addValue(oneSidedP[i]);
        }
        // Target comparison values computed using R version 1.8.1 (Linux version)
        }__CLR4_4_12buf2buflb90peqg.R.inc(108780);Assert.assertEquals("one sample t stat", 3.86485535541,
                TestUtils.t(0d, oneSidedP), 10E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108781);Assert.assertEquals("one sample t stat", 3.86485535541,
                TestUtils.t(0d, oneSidedPStats),1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108782);Assert.assertEquals("one sample p value", 0.000521637019637,
                TestUtils.tTest(0d, oneSidedP) / 2d, 10E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108783);Assert.assertEquals("one sample p value", 0.000521637019637,
                TestUtils.tTest(0d, oneSidedPStats) / 2d, 10E-5);
        __CLR4_4_12buf2buflb90peqg.R.inc(108784);Assert.assertTrue("one sample t-test reject", TestUtils.tTest(0d, oneSidedP, 0.01));
        __CLR4_4_12buf2buflb90peqg.R.inc(108785);Assert.assertTrue("one sample t-test reject", TestUtils.tTest(0d, oneSidedPStats, 0.01));
        __CLR4_4_12buf2buflb90peqg.R.inc(108786);Assert.assertTrue("one sample t-test accept", !TestUtils.tTest(0d, oneSidedP, 0.0001));
        __CLR4_4_12buf2buflb90peqg.R.inc(108787);Assert.assertTrue("one sample t-test accept", !TestUtils.tTest(0d, oneSidedPStats, 0.0001));

        __CLR4_4_12buf2buflb90peqg.R.inc(108788);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108789);TestUtils.tTest(0d, oneSidedP, 95);
            __CLR4_4_12buf2buflb90peqg.R.inc(108790);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108791);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108792);TestUtils.tTest(0d, oneSidedPStats, 95);
            __CLR4_4_12buf2buflb90peqg.R.inc(108793);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    @Test
    public void testTwoSampleTHeterscedastic() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f15x1c2by2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testTwoSampleTHeterscedastic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f15x1c2by2(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108794);
        __CLR4_4_12buf2buflb90peqg.R.inc(108795);double[] sample1 = { 7d, -4d, 18d, 17d, -3d, -5d, 1d, 10d, 11d, -2d };
        __CLR4_4_12buf2buflb90peqg.R.inc(108796);double[] sample2 = { -1d, 12d, -1d, -3d, 3d, -5d, 5d, 2d, -11d, -1d, -3d };
        __CLR4_4_12buf2buflb90peqg.R.inc(108797);SummaryStatistics sampleStats1 = new SummaryStatistics();
        __CLR4_4_12buf2buflb90peqg.R.inc(108798);for (int i = 0; (((i < sample1.length)&&(__CLR4_4_12buf2buflb90peqg.R.iget(108799)!=0|true))||(__CLR4_4_12buf2buflb90peqg.R.iget(108800)==0&false)); i++) {{
            __CLR4_4_12buf2buflb90peqg.R.inc(108801);sampleStats1.addValue(sample1[i]);
        }
        }__CLR4_4_12buf2buflb90peqg.R.inc(108802);SummaryStatistics sampleStats2 = new SummaryStatistics();
        __CLR4_4_12buf2buflb90peqg.R.inc(108803);for (int i = 0; (((i < sample2.length)&&(__CLR4_4_12buf2buflb90peqg.R.iget(108804)!=0|true))||(__CLR4_4_12buf2buflb90peqg.R.iget(108805)==0&false)); i++) {{
            __CLR4_4_12buf2buflb90peqg.R.inc(108806);sampleStats2.addValue(sample2[i]);
        }

        // Target comparison values computed using R version 1.8.1 (Linux version)
        }__CLR4_4_12buf2buflb90peqg.R.inc(108807);Assert.assertEquals("two sample heteroscedastic t stat", 1.60371728768,
                TestUtils.t(sample1, sample2), 1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108808);Assert.assertEquals("two sample heteroscedastic t stat", 1.60371728768,
                TestUtils.t(sampleStats1, sampleStats2), 1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108809);Assert.assertEquals("two sample heteroscedastic p value", 0.128839369622,
                TestUtils.tTest(sample1, sample2), 1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108810);Assert.assertEquals("two sample heteroscedastic p value", 0.128839369622,
                TestUtils.tTest(sampleStats1, sampleStats2), 1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108811);Assert.assertTrue("two sample heteroscedastic t-test reject",
                TestUtils.tTest(sample1, sample2, 0.2));
        __CLR4_4_12buf2buflb90peqg.R.inc(108812);Assert.assertTrue("two sample heteroscedastic t-test reject",
                TestUtils.tTest(sampleStats1, sampleStats2, 0.2));
        __CLR4_4_12buf2buflb90peqg.R.inc(108813);Assert.assertTrue("two sample heteroscedastic t-test accept",
                !TestUtils.tTest(sample1, sample2, 0.1));
        __CLR4_4_12buf2buflb90peqg.R.inc(108814);Assert.assertTrue("two sample heteroscedastic t-test accept",
                !TestUtils.tTest(sampleStats1, sampleStats2, 0.1));

        __CLR4_4_12buf2buflb90peqg.R.inc(108815);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108816);TestUtils.tTest(sample1, sample2, .95);
            __CLR4_4_12buf2buflb90peqg.R.inc(108817);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108818);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108819);TestUtils.tTest(sampleStats1, sampleStats2, .95);
            __CLR4_4_12buf2buflb90peqg.R.inc(108820);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108821);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108822);TestUtils.tTest(sample1, tooShortObs, .01);
            __CLR4_4_12buf2buflb90peqg.R.inc(108823);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108824);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108825);TestUtils.tTest(sampleStats1, (SummaryStatistics) null, .01);
            __CLR4_4_12buf2buflb90peqg.R.inc(108826);Assert.fail("insufficient data, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108827);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108828);TestUtils.tTest(sample1, tooShortObs);
            __CLR4_4_12buf2buflb90peqg.R.inc(108829);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108830);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108831);TestUtils.tTest(sampleStats1, (SummaryStatistics) null);
            __CLR4_4_12buf2buflb90peqg.R.inc(108832);Assert.fail("insufficient data, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108833);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108834);TestUtils.t(sample1, tooShortObs);
            __CLR4_4_12buf2buflb90peqg.R.inc(108835);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12buf2buflb90peqg.R.inc(108836);try {
            __CLR4_4_12buf2buflb90peqg.R.inc(108837);TestUtils.t(sampleStats1, (SummaryStatistics) null);
            __CLR4_4_12buf2buflb90peqg.R.inc(108838);Assert.fail("insufficient data, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}
    @Test
    public void testTwoSampleTHomoscedastic() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153726d2bzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testTwoSampleTHomoscedastic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153726d2bzb(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108839);
        __CLR4_4_12buf2buflb90peqg.R.inc(108840);double[] sample1 ={2, 4, 6, 8, 10, 97};
        __CLR4_4_12buf2buflb90peqg.R.inc(108841);double[] sample2 = {4, 6, 8, 10, 16};
        __CLR4_4_12buf2buflb90peqg.R.inc(108842);SummaryStatistics sampleStats1 = new SummaryStatistics();
        __CLR4_4_12buf2buflb90peqg.R.inc(108843);for (int i = 0; (((i < sample1.length)&&(__CLR4_4_12buf2buflb90peqg.R.iget(108844)!=0|true))||(__CLR4_4_12buf2buflb90peqg.R.iget(108845)==0&false)); i++) {{
            __CLR4_4_12buf2buflb90peqg.R.inc(108846);sampleStats1.addValue(sample1[i]);
        }
        }__CLR4_4_12buf2buflb90peqg.R.inc(108847);SummaryStatistics sampleStats2 = new SummaryStatistics();
        __CLR4_4_12buf2buflb90peqg.R.inc(108848);for (int i = 0; (((i < sample2.length)&&(__CLR4_4_12buf2buflb90peqg.R.iget(108849)!=0|true))||(__CLR4_4_12buf2buflb90peqg.R.iget(108850)==0&false)); i++) {{
            __CLR4_4_12buf2buflb90peqg.R.inc(108851);sampleStats2.addValue(sample2[i]);
        }

        // Target comparison values computed using R version 1.8.1 (Linux version)
        }__CLR4_4_12buf2buflb90peqg.R.inc(108852);Assert.assertEquals("two sample homoscedastic t stat", 0.73096310086,
                TestUtils.homoscedasticT(sample1, sample2), 10E-11);
        __CLR4_4_12buf2buflb90peqg.R.inc(108853);Assert.assertEquals("two sample homoscedastic p value", 0.4833963785,
                TestUtils.homoscedasticTTest(sampleStats1, sampleStats2), 1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108854);Assert.assertTrue("two sample homoscedastic t-test reject",
                TestUtils.homoscedasticTTest(sample1, sample2, 0.49));
        __CLR4_4_12buf2buflb90peqg.R.inc(108855);Assert.assertTrue("two sample homoscedastic t-test accept",
                !TestUtils.homoscedasticTTest(sample1, sample2, 0.48));
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    @Test
    public void testSmallSamples() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7j5hh2bzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testSmallSamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7j5hh2bzs(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108856);
        __CLR4_4_12buf2buflb90peqg.R.inc(108857);double[] sample1 = {1d, 3d};
        __CLR4_4_12buf2buflb90peqg.R.inc(108858);double[] sample2 = {4d, 5d};

        // Target values computed using R, version 1.8.1 (linux version)
        __CLR4_4_12buf2buflb90peqg.R.inc(108859);Assert.assertEquals(-2.2360679775, TestUtils.t(sample1, sample2),
                1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108860);Assert.assertEquals(0.198727388935, TestUtils.tTest(sample1, sample2),
                1E-10);
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    @Test
    public void testPaired() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163xm9a2bzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testPaired",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163xm9a2bzx(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108861);
        __CLR4_4_12buf2buflb90peqg.R.inc(108862);double[] sample1 = {1d, 3d, 5d, 7d};
        __CLR4_4_12buf2buflb90peqg.R.inc(108863);double[] sample2 = {0d, 6d, 11d, 2d};
        __CLR4_4_12buf2buflb90peqg.R.inc(108864);double[] sample3 = {5d, 7d, 8d, 10d};

        // Target values computed using R, version 1.8.1 (linux version)
        __CLR4_4_12buf2buflb90peqg.R.inc(108865);Assert.assertEquals(-0.3133, TestUtils.pairedT(sample1, sample2), 1E-4);
        __CLR4_4_12buf2buflb90peqg.R.inc(108866);Assert.assertEquals(0.774544295819, TestUtils.pairedTTest(sample1, sample2), 1E-10);
        __CLR4_4_12buf2buflb90peqg.R.inc(108867);Assert.assertEquals(0.001208, TestUtils.pairedTTest(sample1, sample3), 1E-6);
        __CLR4_4_12buf2buflb90peqg.R.inc(108868);Assert.assertFalse(TestUtils.pairedTTest(sample1, sample3, .001));
        __CLR4_4_12buf2buflb90peqg.R.inc(108869);Assert.assertTrue(TestUtils.pairedTTest(sample1, sample3, .002));
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    private double[] classA =
      {93.0, 103.0, 95.0, 101.0};
    private double[] classB =
      {99.0, 92.0, 102.0, 100.0, 102.0};
    private double[] classC =
      {110.0, 115.0, 111.0, 117.0, 128.0};

    private List<double[]> classes = new ArrayList<double[]>();
    private OneWayAnova oneWayAnova = new OneWayAnova();

    @Test
    public void testOneWayAnovaUtils() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tnqrq2c06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testOneWayAnovaUtils",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tnqrq2c06(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108870);
        __CLR4_4_12buf2buflb90peqg.R.inc(108871);classes.add(classA);
        __CLR4_4_12buf2buflb90peqg.R.inc(108872);classes.add(classB);
        __CLR4_4_12buf2buflb90peqg.R.inc(108873);classes.add(classC);
        __CLR4_4_12buf2buflb90peqg.R.inc(108874);Assert.assertEquals(oneWayAnova.anovaFValue(classes),
                TestUtils.oneWayAnovaFValue(classes), 10E-12);
        __CLR4_4_12buf2buflb90peqg.R.inc(108875);Assert.assertEquals(oneWayAnova.anovaPValue(classes),
                TestUtils.oneWayAnovaPValue(classes), 10E-12);
        __CLR4_4_12buf2buflb90peqg.R.inc(108876);Assert.assertEquals(oneWayAnova.anovaTest(classes, 0.01),
                TestUtils.oneWayAnovaTest(classes, 0.01));
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}
    @Test
    public void testGTestGoodnesOfFit() throws Exception {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhhdl52c0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testGTestGoodnesOfFit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhhdl52c0d() throws Exception{try{__CLR4_4_12buf2buflb90peqg.R.inc(108877);
        __CLR4_4_12buf2buflb90peqg.R.inc(108878);double[] exp = new double[]{
            0.54d, 0.40d, 0.05d, 0.01d
        };

        __CLR4_4_12buf2buflb90peqg.R.inc(108879);long[] obs = new long[]{
            70, 79, 3, 4
        };
        __CLR4_4_12buf2buflb90peqg.R.inc(108880);Assert.assertEquals("G test statistic",
                13.144799, TestUtils.g(exp, obs), 1E-5);
        __CLR4_4_12buf2buflb90peqg.R.inc(108881);double p_gtgf = TestUtils.gTest(exp, obs);
        __CLR4_4_12buf2buflb90peqg.R.inc(108882);Assert.assertEquals("g-Test p-value", 0.004333, p_gtgf, 1E-5);

        __CLR4_4_12buf2buflb90peqg.R.inc(108883);Assert.assertTrue(TestUtils.gTest(exp, obs, 0.05));
}finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    @Test
    public void testGTestIndependance() throws Exception {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gfw7i2c0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testGTestIndependance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gfw7i2c0k() throws Exception{try{__CLR4_4_12buf2buflb90peqg.R.inc(108884);
        __CLR4_4_12buf2buflb90peqg.R.inc(108885);long[] obs1 = new long[]{
            268, 199, 42
        };

        __CLR4_4_12buf2buflb90peqg.R.inc(108886);long[] obs2 = new long[]{
            807, 759, 184
        };

        __CLR4_4_12buf2buflb90peqg.R.inc(108887);double g = TestUtils.gDataSetsComparison(obs1, obs2);

        __CLR4_4_12buf2buflb90peqg.R.inc(108888);Assert.assertEquals("G test statistic",
                7.3008170, g, 1E-4);
        __CLR4_4_12buf2buflb90peqg.R.inc(108889);double p_gti = TestUtils.gTestDataSetsComparison(obs1, obs2);

        __CLR4_4_12buf2buflb90peqg.R.inc(108890);Assert.assertEquals("g-Test p-value", 0.0259805, p_gti, 1E-4);
        __CLR4_4_12buf2buflb90peqg.R.inc(108891);Assert.assertTrue(TestUtils.gTestDataSetsComparison(obs1, obs2, 0.05));
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}

    @Test
    public void testRootLogLikelihood() {__CLR4_4_12buf2buflb90peqg.R.globalSliceStart(getClass().getName(),108892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17uxkpl2c0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12buf2buflb90peqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12buf2buflb90peqg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TestUtilsTest.testRootLogLikelihood",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17uxkpl2c0s(){try{__CLR4_4_12buf2buflb90peqg.R.inc(108892);
        // positive where k11 is bigger than expected.
        __CLR4_4_12buf2buflb90peqg.R.inc(108893);Assert.assertTrue(TestUtils.rootLogLikelihoodRatio(904, 21060, 1144, 283012) > 0.0);

        // negative because k11 is lower than expected
        __CLR4_4_12buf2buflb90peqg.R.inc(108894);Assert.assertTrue(TestUtils.rootLogLikelihoodRatio(36, 21928, 60280, 623876) < 0.0);

        __CLR4_4_12buf2buflb90peqg.R.inc(108895);Assert.assertEquals(Math.sqrt(2.772589), TestUtils.rootLogLikelihoodRatio(1, 0, 0, 1), 0.000001);
        __CLR4_4_12buf2buflb90peqg.R.inc(108896);Assert.assertEquals(-Math.sqrt(2.772589), TestUtils.rootLogLikelihoodRatio(0, 1, 1, 0), 0.000001);
        __CLR4_4_12buf2buflb90peqg.R.inc(108897);Assert.assertEquals(Math.sqrt(27.72589), TestUtils.rootLogLikelihoodRatio(10, 0, 0, 10), 0.00001);

        __CLR4_4_12buf2buflb90peqg.R.inc(108898);Assert.assertEquals(Math.sqrt(39.33052), TestUtils.rootLogLikelihoodRatio(5, 1995, 0, 100000), 0.00001);
        __CLR4_4_12buf2buflb90peqg.R.inc(108899);Assert.assertEquals(-Math.sqrt(39.33052), TestUtils.rootLogLikelihoodRatio(0, 100000, 5, 1995), 0.00001);

        __CLR4_4_12buf2buflb90peqg.R.inc(108900);Assert.assertEquals(Math.sqrt(4730.737), TestUtils.rootLogLikelihoodRatio(1000, 1995, 1000, 100000), 0.001);
        __CLR4_4_12buf2buflb90peqg.R.inc(108901);Assert.assertEquals(-Math.sqrt(4730.737), TestUtils.rootLogLikelihoodRatio(1000, 100000, 1000, 1995), 0.001);

        __CLR4_4_12buf2buflb90peqg.R.inc(108902);Assert.assertEquals(Math.sqrt(5734.343), TestUtils.rootLogLikelihoodRatio(1000, 1000, 1000, 100000), 0.001);
        __CLR4_4_12buf2buflb90peqg.R.inc(108903);Assert.assertEquals(Math.sqrt(5714.932), TestUtils.rootLogLikelihoodRatio(1000, 1000, 1000, 99000), 0.001);
    }finally{__CLR4_4_12buf2buflb90peqg.R.flushNeeded();}}
}
