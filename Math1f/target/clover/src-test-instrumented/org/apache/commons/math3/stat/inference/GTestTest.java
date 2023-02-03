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
 * Test cases for the GTest class.
 *
 * Data for the tests are from p64-69 in: McDonald, J.H. 2009. Handbook of
 * Biological Statistics (2nd ed.). Sparky House Publishing, Baltimore,
 * Maryland.
 *
 */
public class GTestTest {static class __CLR4_4_12bkr2bkrlb90pepo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected GTest testStatistic = new GTest();

    @Test
    public void testGTestGoodnesOfFit1() throws Exception {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqtmp62bkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testGTestGoodnesOfFit1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqtmp62bkr() throws Exception{try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108315);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108316);final double[] exp = new double[]{
            3d, 1d
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108317);final long[] obs = new long[]{
            423, 133
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108318);Assert.assertEquals("G test statistic",
                0.348721, testStatistic.g(exp, obs), 1E-6);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108319);final double p_gtgf = testStatistic.gTest(exp, obs);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108320);Assert.assertEquals("g-Test p-value", 0.55483, p_gtgf, 1E-5);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108321);Assert.assertFalse(testStatistic.gTest(exp, obs, 0.05));
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}

    @Test
    public void testGTestGoodnesOfFit2() throws Exception {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahtnwp2bky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testGTestGoodnesOfFit2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahtnwp2bky() throws Exception{try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108322);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108323);final double[] exp = new double[]{
            0.54d, 0.40d, 0.05d, 0.01d
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108324);final long[] obs = new long[]{
            70, 79, 3, 4
        };
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108325);Assert.assertEquals("G test statistic",
                13.144799, testStatistic.g(exp, obs), 1E-6);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108326);final double p_gtgf = testStatistic.gTest(exp, obs);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108327);Assert.assertEquals("g-Test p-value", 0.004333, p_gtgf, 1E-5);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108328);Assert.assertTrue(testStatistic.gTest(exp, obs, 0.05));
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}

    @Test
    public void testGTestGoodnesOfFit3() throws Exception {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178tp482bl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testGTestGoodnesOfFit3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178tp482bl5() throws Exception{try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108329);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108330);final double[] exp = new double[]{
            0.167d, 0.483d, 0.350d
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108331);final long[] obs = new long[]{
            14, 21, 25
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108332);Assert.assertEquals("G test statistic",
                4.5554, testStatistic.g(exp, obs), 1E-4);
        // Intrinisic (Hardy-Weinberg proportions) P-Value should be 0.033
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108333);final double p_gtgf = testStatistic.gTestIntrinsic(exp, obs);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108334);Assert.assertEquals("g-Test p-value", 0.0328, p_gtgf, 1E-4);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108335);Assert.assertFalse(testStatistic.gTest(exp, obs, 0.05));
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}

    @Test
    public void testGTestIndependance1() throws Exception {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ze75n32blc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testGTestIndependance1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ze75n32blc() throws Exception{try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108336);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108337);final long[] obs1 = new long[]{
            268, 199, 42
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108338);final long[] obs2 = new long[]{
            807, 759, 184
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108339);final double g = testStatistic.gDataSetsComparison(obs1, obs2);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108340);Assert.assertEquals("G test statistic",
                7.3008170, g, 1E-6);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108341);final double p_gti = testStatistic.gTestDataSetsComparison(obs1, obs2);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108342);Assert.assertEquals("g-Test p-value", 0.0259805, p_gti, 1E-6);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108343);Assert.assertTrue(testStatistic.gTestDataSetsComparison(obs1, obs2, 0.05));
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}

    @Test
    public void testGTestIndependance2() throws Exception {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w576um2blk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testGTestIndependance2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w576um2blk() throws Exception{try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108344);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108345);final long[] obs1 = new long[]{
            127, 99, 264
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108346);final long[] obs2 = new long[]{
            116, 67, 161
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108347);final double g = testStatistic.gDataSetsComparison(obs1, obs2);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108348);Assert.assertEquals("G test statistic",
                6.227288, g, 1E-6);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108349);final double p_gti = testStatistic.gTestDataSetsComparison(obs1, obs2);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108350);Assert.assertEquals("g-Test p-value", 0.04443, p_gti, 1E-5);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108351);Assert.assertTrue(testStatistic.gTestDataSetsComparison(obs1, obs2, 0.05));
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}

    @Test
    public void testGTestIndependance3() throws Exception {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sw78252bls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testGTestIndependance3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sw78252bls() throws Exception{try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108352);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108353);final long[] obs1 = new long[]{
            190, 149
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108354);final long[] obs2 = new long[]{
            42, 49
        };

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108355);final double g = testStatistic.gDataSetsComparison(obs1, obs2);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108356);Assert.assertEquals("G test statistic",
                2.8187, g, 1E-4);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108357);final double p_gti = testStatistic.gTestDataSetsComparison(obs1, obs2);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108358);Assert.assertEquals("g-Test p-value", 0.09317325, p_gti, 1E-6);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108359);Assert.assertFalse(testStatistic.gTestDataSetsComparison(obs1, obs2, 0.05));
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}

    @Test
    public void testGTestSetsComparisonBadCounts() {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emgn692bm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testGTestSetsComparisonBadCounts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emgn692bm0(){try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108360);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108361);long[] observed1 = {10, -1, 12, 10, 15};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108362);long[] observed2 = {15, 10, 10, 15, 5};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108363);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108364);testStatistic.gTestDataSetsComparison(
                    observed1, observed2);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108365);Assert.fail("Expecting NotPositiveException - negative count");
        } catch (NotPositiveException ex) {
            // expected
        }
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108366);long[] observed3 = {10, 0, 12, 10, 15};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108367);long[] observed4 = {15, 0, 10, 15, 5};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108368);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108369);testStatistic.gTestDataSetsComparison(
                    observed3, observed4);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108370);Assert.fail("Expecting ZeroException - double 0's");
        } catch (ZeroException ex) {
            // expected
        }
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108371);long[] observed5 = {10, 10, 12, 10, 15};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108372);long[] observed6 = {0, 0, 0, 0, 0};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108373);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108374);testStatistic.gTestDataSetsComparison(
                    observed5, observed6);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108375);Assert.fail("Expecting ZeroException - vanishing counts");
        } catch (ZeroException ex) {
            // expected
        }
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}
    
    @Test
    public void testUnmatchedArrays() {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e452ey2bmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testUnmatchedArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e452ey2bmg(){try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108376);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108377);final long[] observed = { 0, 1, 2, 3 };
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108378);final double[] expected = { 1, 1, 2 };
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108379);final long[] observed2 = {3, 4};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108380);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108381);testStatistic.gTest(expected, observed);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108382);Assert.fail("arrays have different lengths, DimensionMismatchException expected");
        } catch (DimensionMismatchException ex) {
            // expected
        }
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108383);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108384);testStatistic.gTestDataSetsComparison(observed, observed2);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108385);Assert.fail("arrays have different lengths, DimensionMismatchException expected");
        } catch (DimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}
    
    @Test
    public void testNegativeObservedCounts() {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17a6h222bmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testNegativeObservedCounts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17a6h222bmq(){try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108386);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108387);final long[] observed = { 0, 1, 2, -3 };
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108388);final double[] expected = { 1, 1, 2, 3};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108389);final long[] observed2 = {3, 4, 5, 0};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108390);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108391);testStatistic.gTest(expected, observed);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108392);Assert.fail("negative observed count, NotPositiveException expected");
        } catch (NotPositiveException ex) {
            // expected
        }
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108393);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108394);testStatistic.gTestDataSetsComparison(observed, observed2);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108395);Assert.fail("negative observed count, NotPositiveException expected");
        } catch (NotPositiveException ex) {
            // expected
        } 
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}
    
    @Test
    public void testZeroExpectedCounts() {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kpkbkt2bn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testZeroExpectedCounts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kpkbkt2bn0(){try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108396);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108397);final long[] observed = { 0, 1, 2, -3 };
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108398);final double[] expected = { 1, 0, 2, 3};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108399);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108400);testStatistic.gTest(expected, observed);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108401);Assert.fail("zero expected count, NotStrictlyPositiveException expected");
        } catch (NotStrictlyPositiveException ex) {
            // expected
        }
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}
    
    @Test
    public void testBadAlpha() {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18cpszy2bn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testBadAlpha",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18cpszy2bn6(){try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108402);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108403);final long[] observed = { 0, 1, 2, 3 };
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108404);final double[] expected = { 1, 2, 2, 3};
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108405);final long[] observed2 = { 0, 2, 2, 3 };
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108406);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108407);testStatistic.gTest(expected, observed, 0.8);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108408);Assert.fail("zero expected count, NotStrictlyPositiveException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108409);try {
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108410);testStatistic.gTestDataSetsComparison(observed, observed2, -0.5);
            __CLR4_4_12bkr2bkrlb90pepo.R.inc(108411);Assert.fail("zero expected count, NotStrictlyPositiveException expected");
        } catch (OutOfRangeException ex) {
            // expected
        }  
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}
    
    @Test
    public void testScaling() {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jc11ok2bng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testScaling",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jc11ok2bng(){try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108412);
      __CLR4_4_12bkr2bkrlb90pepo.R.inc(108413);final long[] observed = {9, 11, 10, 8, 12};
      __CLR4_4_12bkr2bkrlb90pepo.R.inc(108414);final double[] expected1 = {10, 10, 10, 10, 10};
      __CLR4_4_12bkr2bkrlb90pepo.R.inc(108415);final double[] expected2 = {1000, 1000, 1000, 1000, 1000};
      __CLR4_4_12bkr2bkrlb90pepo.R.inc(108416);final double[] expected3 = {1, 1, 1, 1, 1};
      __CLR4_4_12bkr2bkrlb90pepo.R.inc(108417);final double tol = 1E-15;
      __CLR4_4_12bkr2bkrlb90pepo.R.inc(108418);Assert.assertEquals(
              testStatistic.gTest(expected1, observed),
              testStatistic.gTest(expected2, observed),
              tol);
      __CLR4_4_12bkr2bkrlb90pepo.R.inc(108419);Assert.assertEquals(
              testStatistic.gTest(expected1, observed),
              testStatistic.gTest(expected3, observed),
              tol);
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}

    @Test
    public void testRootLogLikelihood() {__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceStart(getClass().getName(),108420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17uxkpl2bno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bkr2bkrlb90pepo.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bkr2bkrlb90pepo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.GTestTest.testRootLogLikelihood",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17uxkpl2bno(){try{__CLR4_4_12bkr2bkrlb90pepo.R.inc(108420);
        // positive where k11 is bigger than expected.
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108421);Assert.assertTrue(testStatistic.rootLogLikelihoodRatio(904, 21060, 1144, 283012) > 0.0);

        // negative because k11 is lower than expected
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108422);Assert.assertTrue(testStatistic.rootLogLikelihoodRatio(36, 21928, 60280, 623876) < 0.0);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108423);Assert.assertEquals(Math.sqrt(2.772589), testStatistic.rootLogLikelihoodRatio(1, 0, 0, 1), 0.000001);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108424);Assert.assertEquals(-Math.sqrt(2.772589), testStatistic.rootLogLikelihoodRatio(0, 1, 1, 0), 0.000001);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108425);Assert.assertEquals(Math.sqrt(27.72589), testStatistic.rootLogLikelihoodRatio(10, 0, 0, 10), 0.00001);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108426);Assert.assertEquals(Math.sqrt(39.33052), testStatistic.rootLogLikelihoodRatio(5, 1995, 0, 100000), 0.00001);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108427);Assert.assertEquals(-Math.sqrt(39.33052), testStatistic.rootLogLikelihoodRatio(0, 100000, 5, 1995), 0.00001);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108428);Assert.assertEquals(Math.sqrt(4730.737), testStatistic.rootLogLikelihoodRatio(1000, 1995, 1000, 100000), 0.001);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108429);Assert.assertEquals(-Math.sqrt(4730.737), testStatistic.rootLogLikelihoodRatio(1000, 100000, 1000, 1995), 0.001);

        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108430);Assert.assertEquals(Math.sqrt(5734.343), testStatistic.rootLogLikelihoodRatio(1000, 1000, 1000, 100000), 0.001);
        __CLR4_4_12bkr2bkrlb90pepo.R.inc(108431);Assert.assertEquals(Math.sqrt(5714.932), testStatistic.rootLogLikelihoodRatio(1000, 1000, 1000, 99000), 0.001);
    }finally{__CLR4_4_12bkr2bkrlb90pepo.R.flushNeeded();}}
}
