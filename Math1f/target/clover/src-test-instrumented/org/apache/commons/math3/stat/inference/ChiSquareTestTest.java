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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the ChiSquareTestImpl class.
 *
 * @version $Id$
 */

public class ChiSquareTestTest {static class __CLR4_4_12bhx2bhxlb90pepg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108315,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected ChiSquareTest testStatistic = new ChiSquareTest();

    @Test
    public void testChiSquare() {__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceStart(getClass().getName(),108213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1axjeay2bhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bhx2bhxlb90pepg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.ChiSquareTestTest.testChiSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1axjeay2bhx(){try{__CLR4_4_12bhx2bhxlb90pepg.R.inc(108213);

        // Target values computed using R version 1.8.1
        // Some assembly required ;-)
        //      Use sum((obs - exp)^2/exp) for the chi-square statistic and
        //      1 - pchisq(sum((obs - exp)^2/exp), length(obs) - 1) for the p-value

        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108214);long[] observed = {10, 9, 11};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108215);double[] expected = {10, 10, 10};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108216);Assert.assertEquals("chi-square statistic", 0.2,  testStatistic.chiSquare(expected, observed), 10E-12);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108217);Assert.assertEquals("chi-square p-value", 0.904837418036, testStatistic.chiSquareTest(expected, observed), 1E-10);

        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108218);long[] observed1 = { 500, 623, 72, 70, 31 };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108219);double[] expected1 = { 485, 541, 82, 61, 37 };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108220);Assert.assertEquals( "chi-square test statistic", 9.023307936427388, testStatistic.chiSquare(expected1, observed1), 1E-10);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108221);Assert.assertEquals("chi-square p-value", 0.06051952647453607, testStatistic.chiSquareTest(expected1, observed1), 1E-9);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108222);Assert.assertTrue("chi-square test reject", testStatistic.chiSquareTest(expected1, observed1, 0.08));
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108223);Assert.assertTrue("chi-square test accept", !testStatistic.chiSquareTest(expected1, observed1, 0.05));

        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108224);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108225);testStatistic.chiSquareTest(expected1, observed1, 95);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108226);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108227);long[] tooShortObs = { 0 };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108228);double[] tooShortEx = { 1 };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108229);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108230);testStatistic.chiSquare(tooShortEx, tooShortObs);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108231);Assert.fail("arguments too short, DimensionMismatchException expected");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        // unmatched arrays
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108232);long[] unMatchedObs = { 0, 1, 2, 3 };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108233);double[] unMatchedEx = { 1, 1, 2 };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108234);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108235);testStatistic.chiSquare(unMatchedEx, unMatchedObs);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108236);Assert.fail("arrays have different lengths, DimensionMismatchException expected");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        // 0 expected count
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108237);expected[0] = 0;
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108238);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108239);testStatistic.chiSquareTest(expected, observed, .01);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108240);Assert.fail("bad expected count, NotStrictlyPositiveException expected");
        } catch (NotStrictlyPositiveException ex) {
            // expected
        }

        // negative observed count
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108241);expected[0] = 1;
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108242);observed[0] = -1;
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108243);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108244);testStatistic.chiSquareTest(expected, observed, .01);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108245);Assert.fail("bad expected count, NotPositiveException expected");
        } catch (NotPositiveException ex) {
            // expected
        }

    }finally{__CLR4_4_12bhx2bhxlb90pepg.R.flushNeeded();}}

    @Test
    public void testChiSquareIndependence() {__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceStart(getClass().getName(),108246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1we4xda2biu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bhx2bhxlb90pepg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.ChiSquareTestTest.testChiSquareIndependence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1we4xda2biu(){try{__CLR4_4_12bhx2bhxlb90pepg.R.inc(108246);

        // Target values computed using R version 1.8.1

        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108247);long[][] counts = { {40, 22, 43}, {91, 21, 28}, {60, 10, 22}};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108248);Assert.assertEquals( "chi-square test statistic", 22.709027688, testStatistic.chiSquare(counts), 1E-9);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108249);Assert.assertEquals("chi-square p-value", 0.000144751460134, testStatistic.chiSquareTest(counts), 1E-9);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108250);Assert.assertTrue("chi-square test reject", testStatistic.chiSquareTest(counts, 0.0002));
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108251);Assert.assertTrue("chi-square test accept", !testStatistic.chiSquareTest(counts, 0.0001));

        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108252);long[][] counts2 = {{10, 15}, {30, 40}, {60, 90} };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108253);Assert.assertEquals( "chi-square test statistic", 0.168965517241, testStatistic.chiSquare(counts2), 1E-9);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108254);Assert.assertEquals("chi-square p-value",0.918987499852, testStatistic.chiSquareTest(counts2), 1E-9);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108255);Assert.assertTrue("chi-square test accept", !testStatistic.chiSquareTest(counts2, 0.1));

        // ragged input array
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108256);long[][] counts3 = { {40, 22, 43}, {91, 21, 28}, {60, 10}};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108257);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108258);testStatistic.chiSquare(counts3);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108259);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        // insufficient data
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108260);long[][] counts4 = {{40, 22, 43}};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108261);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108262);testStatistic.chiSquare(counts4);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108263);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException ex) {
            // expected
        }
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108264);long[][] counts5 = {{40}, {40}, {30}, {10}};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108265);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108266);testStatistic.chiSquare(counts5);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108267);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        // negative counts
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108268);long[][] counts6 = {{10, -2}, {30, 40}, {60, 90} };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108269);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108270);testStatistic.chiSquare(counts6);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108271);Assert.fail("Expecting NotPositiveException");
        } catch (NotPositiveException ex) {
            // expected
        }

        // bad alpha
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108272);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108273);testStatistic.chiSquareTest(counts, 0);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108274);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_12bhx2bhxlb90pepg.R.flushNeeded();}}

    @Test
    public void testChiSquareLargeTestStatistic() {__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceStart(getClass().getName(),108275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z7zprt2bjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bhx2bhxlb90pepg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.ChiSquareTestTest.testChiSquareLargeTestStatistic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z7zprt2bjn(){try{__CLR4_4_12bhx2bhxlb90pepg.R.inc(108275);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108276);double[] exp = new double[] {
            3389119.5, 649136.6, 285745.4, 25357364.76, 11291189.78, 543628.0,
            232921.0, 437665.75
        };

        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108277);long[] obs = new long[] {
            2372383, 584222, 257170, 17750155, 7903832, 489265, 209628, 393899
        };
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108278);org.apache.commons.math3.stat.inference.ChiSquareTest csti =
            new org.apache.commons.math3.stat.inference.ChiSquareTest();
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108279);double cst = csti.chiSquareTest(exp, obs);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108280);Assert.assertEquals("chi-square p-value", 0.0, cst, 1E-3);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108281);Assert.assertEquals( "chi-square test statistic",
                114875.90421929007, testStatistic.chiSquare(exp, obs), 1E-9);
    }finally{__CLR4_4_12bhx2bhxlb90pepg.R.flushNeeded();}}

    /** Contingency table containing zeros - PR # 32531 */
    @Test
    public void testChiSquareZeroCount() {__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceStart(getClass().getName(),108282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i8wun52bju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bhx2bhxlb90pepg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.ChiSquareTestTest.testChiSquareZeroCount",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i8wun52bju(){try{__CLR4_4_12bhx2bhxlb90pepg.R.inc(108282);
        // Target values computed using R version 1.8.1
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108283);long[][] counts = { {40, 0, 4}, {91, 1, 2}, {60, 2, 0}};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108284);Assert.assertEquals( "chi-square test statistic", 9.67444662263,
                testStatistic.chiSquare(counts), 1E-9);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108285);Assert.assertEquals("chi-square p-value", 0.0462835770603,
                testStatistic.chiSquareTest(counts), 1E-9);
    }finally{__CLR4_4_12bhx2bhxlb90pepg.R.flushNeeded();}}

    /** Target values verified using DATAPLOT version 2006.3 */
    @Test
    public void testChiSquareDataSetsComparisonEqualCounts()
        {__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceStart(getClass().getName(),108286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1py2qs42bjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bhx2bhxlb90pepg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.ChiSquareTestTest.testChiSquareDataSetsComparisonEqualCounts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1py2qs42bjy(){try{__CLR4_4_12bhx2bhxlb90pepg.R.inc(108286);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108287);long[] observed1 = {10, 12, 12, 10};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108288);long[] observed2 = {5, 15, 14, 10};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108289);Assert.assertEquals("chi-square p value", 0.541096,
                testStatistic.chiSquareTestDataSetsComparison(
                observed1, observed2), 1E-6);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108290);Assert.assertEquals("chi-square test statistic", 2.153846,
                testStatistic.chiSquareDataSetsComparison(
                observed1, observed2), 1E-6);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108291);Assert.assertFalse("chi-square test result",
                testStatistic.chiSquareTestDataSetsComparison(
                observed1, observed2, 0.4));
    }finally{__CLR4_4_12bhx2bhxlb90pepg.R.flushNeeded();}}

    /** Target values verified using DATAPLOT version 2006.3 */
    @Test
    public void testChiSquareDataSetsComparisonUnEqualCounts()
        {__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceStart(getClass().getName(),108292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxsneb2bk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bhx2bhxlb90pepg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.ChiSquareTestTest.testChiSquareDataSetsComparisonUnEqualCounts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxsneb2bk4(){try{__CLR4_4_12bhx2bhxlb90pepg.R.inc(108292);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108293);long[] observed1 = {10, 12, 12, 10, 15};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108294);long[] observed2 = {15, 10, 10, 15, 5};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108295);Assert.assertEquals("chi-square p value", 0.124115,
                testStatistic.chiSquareTestDataSetsComparison(
                observed1, observed2), 1E-6);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108296);Assert.assertEquals("chi-square test statistic", 7.232189,
                testStatistic.chiSquareDataSetsComparison(
                observed1, observed2), 1E-6);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108297);Assert.assertTrue("chi-square test result",
                testStatistic.chiSquareTestDataSetsComparison(
                observed1, observed2, 0.13));
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108298);Assert.assertFalse("chi-square test result",
                testStatistic.chiSquareTestDataSetsComparison(
                observed1, observed2, 0.12));
    }finally{__CLR4_4_12bhx2bhxlb90pepg.R.flushNeeded();}}

    @Test
    public void testChiSquareDataSetsComparisonBadCounts()
        {__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceStart(getClass().getName(),108299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154fsil2bkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bhx2bhxlb90pepg.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bhx2bhxlb90pepg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.ChiSquareTestTest.testChiSquareDataSetsComparisonBadCounts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154fsil2bkb(){try{__CLR4_4_12bhx2bhxlb90pepg.R.inc(108299);
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108300);long[] observed1 = {10, -1, 12, 10, 15};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108301);long[] observed2 = {15, 10, 10, 15, 5};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108302);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108303);testStatistic.chiSquareTestDataSetsComparison(
                    observed1, observed2);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108304);Assert.fail("Expecting NotPositiveException - negative count");
        } catch (NotPositiveException ex) {
            // expected
        }
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108305);long[] observed3 = {10, 0, 12, 10, 15};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108306);long[] observed4 = {15, 0, 10, 15, 5};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108307);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108308);testStatistic.chiSquareTestDataSetsComparison(
                    observed3, observed4);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108309);Assert.fail("Expecting ZeroException - double 0's");
        } catch (ZeroException ex) {
            // expected
        }
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108310);long[] observed5 = {10, 10, 12, 10, 15};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108311);long[] observed6 = {0, 0, 0, 0, 0};
        __CLR4_4_12bhx2bhxlb90pepg.R.inc(108312);try {
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108313);testStatistic.chiSquareTestDataSetsComparison(
                    observed5, observed6);
            __CLR4_4_12bhx2bhxlb90pepg.R.inc(108314);Assert.fail("Expecting ZeroException - vanishing counts");
        } catch (ZeroException ex) {
            // expected
        }
    }finally{__CLR4_4_12bhx2bhxlb90pepg.R.flushNeeded();}}
}
