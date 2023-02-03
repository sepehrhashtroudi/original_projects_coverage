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


import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for the TTestImpl class.
 *
 * @version $Id$
 */
public class TTestTest {static class __CLR4_4_12bqm2bqmlb90peq1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected TTest testStatistic = new TTest();

    private double[] tooShortObs = { 1.0 };
    private double[] emptyObs = {};
    private SummaryStatistics emptyStats = new SummaryStatistics();
   SummaryStatistics tooShortStats = null;

    @Before
    public void setUp() {try{__CLR4_4_12bqm2bqmlb90peq1.R.inc(108526);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108527);tooShortStats = new SummaryStatistics();
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108528);tooShortStats.addValue(0d);
    }finally{__CLR4_4_12bqm2bqmlb90peq1.R.flushNeeded();}}

    @Test
    public void testOneSampleT() {__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceStart(getClass().getName(),108529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ju5ljx2bqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bqm2bqmlb90peq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TTestTest.testOneSampleT",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ju5ljx2bqp(){try{__CLR4_4_12bqm2bqmlb90peq1.R.inc(108529);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108530);double[] observed =
            {93.0, 103.0, 95.0, 101.0, 91.0, 105.0, 96.0, 94.0, 101.0,  88.0, 98.0, 94.0, 101.0, 92.0, 95.0 };
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108531);double mu = 100.0;
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108532);SummaryStatistics sampleStats = null;
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108533);sampleStats = new SummaryStatistics();
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108534);for (int i = 0; (((i < observed.length)&&(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108535)!=0|true))||(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108536)==0&false)); i++) {{
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108537);sampleStats.addValue(observed[i]);
        }

        // Target comparison values computed using R version 1.8.1 (Linux version)
        }__CLR4_4_12bqm2bqmlb90peq1.R.inc(108538);Assert.assertEquals("t statistic",  -2.81976445346,
                testStatistic.t(mu, observed), 10E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108539);Assert.assertEquals("t statistic",  -2.81976445346,
                testStatistic.t(mu, sampleStats), 10E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108540);Assert.assertEquals("p value", 0.0136390585873,
                testStatistic.tTest(mu, observed), 10E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108541);Assert.assertEquals("p value", 0.0136390585873,
                testStatistic.tTest(mu, sampleStats), 10E-10);

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108542);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108543);testStatistic.t(mu, (double[]) null);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108544);Assert.fail("arguments too short, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108545);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108546);testStatistic.t(mu, (SummaryStatistics) null);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108547);Assert.fail("arguments too short, NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108548);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108549);testStatistic.t(mu, emptyObs);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108550);Assert.fail("arguments too short, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108551);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108552);testStatistic.t(mu, emptyStats);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108553);Assert.fail("arguments too short, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108554);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108555);testStatistic.t(mu, tooShortObs);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108556);Assert.fail("insufficient data to compute t statistic, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108557);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108558);testStatistic.tTest(mu, tooShortObs);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108559);Assert.fail("insufficient data to perform t test, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
           // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108560);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108561);testStatistic.t(mu, tooShortStats);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108562);Assert.fail("insufficient data to compute t statistic, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108563);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108564);testStatistic.tTest(mu, tooShortStats);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108565);Assert.fail("insufficient data to perform t test, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
    }finally{__CLR4_4_12bqm2bqmlb90peq1.R.flushNeeded();}}

    @Test
    public void testOneSampleTTest() {__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceStart(getClass().getName(),108566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q21df52brq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bqm2bqmlb90peq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TTestTest.testOneSampleTTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q21df52brq(){try{__CLR4_4_12bqm2bqmlb90peq1.R.inc(108566);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108567);double[] oneSidedP =
            {2d, 0d, 6d, 6d, 3d, 3d, 2d, 3d, -6d, 6d, 6d, 6d, 3d, 0d, 1d, 1d, 0d, 2d, 3d, 3d };
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108568);SummaryStatistics oneSidedPStats = new SummaryStatistics();
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108569);for (int i = 0; (((i < oneSidedP.length)&&(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108570)!=0|true))||(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108571)==0&false)); i++) {{
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108572);oneSidedPStats.addValue(oneSidedP[i]);
        }
        // Target comparison values computed using R version 1.8.1 (Linux version)
        }__CLR4_4_12bqm2bqmlb90peq1.R.inc(108573);Assert.assertEquals("one sample t stat", 3.86485535541,
                testStatistic.t(0d, oneSidedP), 10E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108574);Assert.assertEquals("one sample t stat", 3.86485535541,
                testStatistic.t(0d, oneSidedPStats),1E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108575);Assert.assertEquals("one sample p value", 0.000521637019637,
                testStatistic.tTest(0d, oneSidedP) / 2d, 10E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108576);Assert.assertEquals("one sample p value", 0.000521637019637,
                testStatistic.tTest(0d, oneSidedPStats) / 2d, 10E-5);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108577);Assert.assertTrue("one sample t-test reject", testStatistic.tTest(0d, oneSidedP, 0.01));
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108578);Assert.assertTrue("one sample t-test reject", testStatistic.tTest(0d, oneSidedPStats, 0.01));
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108579);Assert.assertTrue("one sample t-test accept", !testStatistic.tTest(0d, oneSidedP, 0.0001));
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108580);Assert.assertTrue("one sample t-test accept", !testStatistic.tTest(0d, oneSidedPStats, 0.0001));

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108581);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108582);testStatistic.tTest(0d, oneSidedP, 95);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108583);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108584);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108585);testStatistic.tTest(0d, oneSidedPStats, 95);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108586);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

    }finally{__CLR4_4_12bqm2bqmlb90peq1.R.flushNeeded();}}

    @Test
    public void testTwoSampleTHeterscedastic() {__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceStart(getClass().getName(),108587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f15x1c2bsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bqm2bqmlb90peq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TTestTest.testTwoSampleTHeterscedastic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f15x1c2bsb(){try{__CLR4_4_12bqm2bqmlb90peq1.R.inc(108587);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108588);double[] sample1 = { 7d, -4d, 18d, 17d, -3d, -5d, 1d, 10d, 11d, -2d };
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108589);double[] sample2 = { -1d, 12d, -1d, -3d, 3d, -5d, 5d, 2d, -11d, -1d, -3d };
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108590);SummaryStatistics sampleStats1 = new SummaryStatistics();
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108591);for (int i = 0; (((i < sample1.length)&&(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108592)!=0|true))||(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108593)==0&false)); i++) {{
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108594);sampleStats1.addValue(sample1[i]);
        }
        }__CLR4_4_12bqm2bqmlb90peq1.R.inc(108595);SummaryStatistics sampleStats2 = new SummaryStatistics();
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108596);for (int i = 0; (((i < sample2.length)&&(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108597)!=0|true))||(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108598)==0&false)); i++) {{
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108599);sampleStats2.addValue(sample2[i]);
        }

        // Target comparison values computed using R version 1.8.1 (Linux version)
        }__CLR4_4_12bqm2bqmlb90peq1.R.inc(108600);Assert.assertEquals("two sample heteroscedastic t stat", 1.60371728768,
                testStatistic.t(sample1, sample2), 1E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108601);Assert.assertEquals("two sample heteroscedastic t stat", 1.60371728768,
                testStatistic.t(sampleStats1, sampleStats2), 1E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108602);Assert.assertEquals("two sample heteroscedastic p value", 0.128839369622,
                testStatistic.tTest(sample1, sample2), 1E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108603);Assert.assertEquals("two sample heteroscedastic p value", 0.128839369622,
                testStatistic.tTest(sampleStats1, sampleStats2), 1E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108604);Assert.assertTrue("two sample heteroscedastic t-test reject",
                testStatistic.tTest(sample1, sample2, 0.2));
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108605);Assert.assertTrue("two sample heteroscedastic t-test reject",
                testStatistic.tTest(sampleStats1, sampleStats2, 0.2));
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108606);Assert.assertTrue("two sample heteroscedastic t-test accept",
                !testStatistic.tTest(sample1, sample2, 0.1));
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108607);Assert.assertTrue("two sample heteroscedastic t-test accept",
                !testStatistic.tTest(sampleStats1, sampleStats2, 0.1));

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108608);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108609);testStatistic.tTest(sample1, sample2, .95);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108610);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108611);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108612);testStatistic.tTest(sampleStats1, sampleStats2, .95);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108613);Assert.fail("alpha out of range, OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108614);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108615);testStatistic.tTest(sample1, tooShortObs, .01);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108616);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108617);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108618);testStatistic.tTest(sampleStats1, tooShortStats, .01);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108619);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108620);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108621);testStatistic.tTest(sample1, tooShortObs);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108622);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
           // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108623);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108624);testStatistic.tTest(sampleStats1, tooShortStats);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108625);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108626);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108627);testStatistic.t(sample1, tooShortObs);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108628);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }

        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108629);try {
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108630);testStatistic.t(sampleStats1, tooShortStats);
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108631);Assert.fail("insufficient data, NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException ex) {
           // expected
        }
    }finally{__CLR4_4_12bqm2bqmlb90peq1.R.flushNeeded();}}
    @Test
    public void testTwoSampleTHomoscedastic() {__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceStart(getClass().getName(),108632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153726d2btk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bqm2bqmlb90peq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TTestTest.testTwoSampleTHomoscedastic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153726d2btk(){try{__CLR4_4_12bqm2bqmlb90peq1.R.inc(108632);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108633);double[] sample1 ={2, 4, 6, 8, 10, 97};
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108634);double[] sample2 = {4, 6, 8, 10, 16};
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108635);SummaryStatistics sampleStats1 = new SummaryStatistics();
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108636);for (int i = 0; (((i < sample1.length)&&(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108637)!=0|true))||(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108638)==0&false)); i++) {{
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108639);sampleStats1.addValue(sample1[i]);
        }
        }__CLR4_4_12bqm2bqmlb90peq1.R.inc(108640);SummaryStatistics sampleStats2 = new SummaryStatistics();
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108641);for (int i = 0; (((i < sample2.length)&&(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108642)!=0|true))||(__CLR4_4_12bqm2bqmlb90peq1.R.iget(108643)==0&false)); i++) {{
            __CLR4_4_12bqm2bqmlb90peq1.R.inc(108644);sampleStats2.addValue(sample2[i]);
        }

        // Target comparison values computed using R version 1.8.1 (Linux version)
        }__CLR4_4_12bqm2bqmlb90peq1.R.inc(108645);Assert.assertEquals("two sample homoscedastic t stat", 0.73096310086,
              testStatistic.homoscedasticT(sample1, sample2), 10E-11);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108646);Assert.assertEquals("two sample homoscedastic p value", 0.4833963785,
                testStatistic.homoscedasticTTest(sampleStats1, sampleStats2), 1E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108647);Assert.assertTrue("two sample homoscedastic t-test reject",
                testStatistic.homoscedasticTTest(sample1, sample2, 0.49));
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108648);Assert.assertTrue("two sample homoscedastic t-test accept",
                !testStatistic.homoscedasticTTest(sample1, sample2, 0.48));
    }finally{__CLR4_4_12bqm2bqmlb90peq1.R.flushNeeded();}}

    @Test
    public void testSmallSamples() {__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceStart(getClass().getName(),108649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7j5hh2bu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bqm2bqmlb90peq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TTestTest.testSmallSamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7j5hh2bu1(){try{__CLR4_4_12bqm2bqmlb90peq1.R.inc(108649);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108650);double[] sample1 = {1d, 3d};
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108651);double[] sample2 = {4d, 5d};

        // Target values computed using R, version 1.8.1 (linux version)
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108652);Assert.assertEquals(-2.2360679775, testStatistic.t(sample1, sample2),
                1E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108653);Assert.assertEquals(0.198727388935, testStatistic.tTest(sample1, sample2),
                1E-10);
    }finally{__CLR4_4_12bqm2bqmlb90peq1.R.flushNeeded();}}

    @Test
    public void testPaired() {__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceStart(getClass().getName(),108654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163xm9a2bu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bqm2bqmlb90peq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bqm2bqmlb90peq1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.TTestTest.testPaired",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163xm9a2bu6(){try{__CLR4_4_12bqm2bqmlb90peq1.R.inc(108654);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108655);double[] sample1 = {1d, 3d, 5d, 7d};
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108656);double[] sample2 = {0d, 6d, 11d, 2d};
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108657);double[] sample3 = {5d, 7d, 8d, 10d};

        // Target values computed using R, version 1.8.1 (linux version)
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108658);Assert.assertEquals(-0.3133, testStatistic.pairedT(sample1, sample2), 1E-4);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108659);Assert.assertEquals(0.774544295819, testStatistic.pairedTTest(sample1, sample2), 1E-10);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108660);Assert.assertEquals(0.001208, testStatistic.pairedTTest(sample1, sample3), 1E-6);
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108661);Assert.assertFalse(testStatistic.pairedTTest(sample1, sample3, .001));
        __CLR4_4_12bqm2bqmlb90peq1.R.inc(108662);Assert.assertTrue(testStatistic.pairedTTest(sample1, sample3, .002));
    }finally{__CLR4_4_12bqm2bqmlb90peq1.R.flushNeeded();}}
}
