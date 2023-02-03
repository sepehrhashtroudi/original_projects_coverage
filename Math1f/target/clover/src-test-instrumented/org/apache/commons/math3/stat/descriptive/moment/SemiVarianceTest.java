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

package org.apache.commons.math3.stat.descriptive.moment;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;


public class SemiVarianceTest {static class __CLR4_4_12b5g2b5glb90peod{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testInsufficientData() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xyn3a2b5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testInsufficientData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xyn3a2b5g(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107764);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107765);double[] nothing = null;
        __CLR4_4_12b5g2b5glb90peod.R.inc(107766);SemiVariance sv = new SemiVariance();
        __CLR4_4_12b5g2b5glb90peod.R.inc(107767);try {
            __CLR4_4_12b5g2b5glb90peod.R.inc(107768);sv.evaluate(nothing);
            __CLR4_4_12b5g2b5glb90peod.R.inc(107769);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException iae) {
        }

        __CLR4_4_12b5g2b5glb90peod.R.inc(107770);try {
            __CLR4_4_12b5g2b5glb90peod.R.inc(107771);sv.setVarianceDirection(SemiVariance.UPSIDE_VARIANCE);
            __CLR4_4_12b5g2b5glb90peod.R.inc(107772);sv.evaluate(nothing);
            __CLR4_4_12b5g2b5glb90peod.R.inc(107773);Assert.fail("null is not a valid data array.");
        } catch (MathIllegalArgumentException iae) {
        }
        __CLR4_4_12b5g2b5glb90peod.R.inc(107774);nothing = new double[] {};
        __CLR4_4_12b5g2b5glb90peod.R.inc(107775);Assert.assertTrue(Double.isNaN(sv.evaluate(nothing)));
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}

    @Test
    public void testSingleDown() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2ebyb2b5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testSingleDown",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2ebyb2b5s(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107776);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107777);SemiVariance sv = new SemiVariance();
        __CLR4_4_12b5g2b5glb90peod.R.inc(107778);double[] values = { 50.0d };
        __CLR4_4_12b5g2b5glb90peod.R.inc(107779);double singletest = sv.evaluate(values);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107780);Assert.assertEquals(0.0d, singletest, 0);
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}

    @Test
    public void testSingleUp() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzwo842b5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testSingleUp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzwo842b5x(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107781);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107782);SemiVariance sv = new SemiVariance(SemiVariance.UPSIDE_VARIANCE);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107783);double[] values = { 50.0d };
        __CLR4_4_12b5g2b5glb90peod.R.inc(107784);double singletest = sv.evaluate(values);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107785);Assert.assertEquals(0.0d, singletest, 0);
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}

    @Test
    public void testSample() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzmboj2b62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzmboj2b62(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107786);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107787);final double[] values = { -2.0d, 2.0d, 4.0d, -2.0d, 22.0d, 11.0d, 3.0d, 14.0d, 5.0d };
        __CLR4_4_12b5g2b5glb90peod.R.inc(107788);final int length = values.length;
        __CLR4_4_12b5g2b5glb90peod.R.inc(107789);final double mean = StatUtils.mean(values); // 6.333...
        __CLR4_4_12b5g2b5glb90peod.R.inc(107790);final SemiVariance sv = new SemiVariance();  // Default bias correction is true
        __CLR4_4_12b5g2b5glb90peod.R.inc(107791);final double downsideSemiVariance = sv.evaluate(values); // Downside is the default
        __CLR4_4_12b5g2b5glb90peod.R.inc(107792);Assert.assertEquals(TestUtils.sumSquareDev(new double[] {-2d, 2d, 4d, -2d, 3d, 5d}, mean) / (length - 1),
                downsideSemiVariance, 1E-14);

        __CLR4_4_12b5g2b5glb90peod.R.inc(107793);sv.setVarianceDirection(SemiVariance.UPSIDE_VARIANCE);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107794);final double upsideSemiVariance = sv.evaluate(values);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107795);Assert.assertEquals(TestUtils.sumSquareDev(new double[] {22d, 11d, 14d}, mean) / (length - 1),
                upsideSemiVariance, 1E-14);

        // Verify that upper + lower semivariance against the mean sum to variance
        __CLR4_4_12b5g2b5glb90peod.R.inc(107796);Assert.assertEquals(StatUtils.variance(values), downsideSemiVariance + upsideSemiVariance, 10e-12);
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}

    @Test
    public void testPopulation() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hz9yqi2b6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testPopulation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hz9yqi2b6d(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107797);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107798);double[] values = { -2.0d, 2.0d, 4.0d, -2.0d, 22.0d, 11.0d, 3.0d, 14.0d, 5.0d };
        __CLR4_4_12b5g2b5glb90peod.R.inc(107799);SemiVariance sv = new SemiVariance(false);

        __CLR4_4_12b5g2b5glb90peod.R.inc(107800);double singletest = sv.evaluate(values);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107801);Assert.assertEquals(19.556d, singletest, 0.01d);

        __CLR4_4_12b5g2b5glb90peod.R.inc(107802);sv.setVarianceDirection(SemiVariance.UPSIDE_VARIANCE);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107803);singletest = sv.evaluate(values);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107804);Assert.assertEquals(36.222d, singletest, 0.01d);
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}

    @Test
    public void testNonMeanCutoffs() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwzcfn2b6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testNonMeanCutoffs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwzcfn2b6l(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107805);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107806);double[] values = { -2.0d, 2.0d, 4.0d, -2.0d, 22.0d, 11.0d, 3.0d, 14.0d, 5.0d };
        __CLR4_4_12b5g2b5glb90peod.R.inc(107807);SemiVariance sv = new SemiVariance(false); // Turn off bias correction - use df = length

        __CLR4_4_12b5g2b5glb90peod.R.inc(107808);double singletest = sv.evaluate(values, 1.0d, SemiVariance.DOWNSIDE_VARIANCE, false, 0, values.length);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107809);Assert.assertEquals(TestUtils.sumSquareDev(new double[] { -2d, -2d }, 1.0d) / values.length,
                singletest, 0.01d);

        __CLR4_4_12b5g2b5glb90peod.R.inc(107810);singletest = sv.evaluate(values, 3.0d, SemiVariance.UPSIDE_VARIANCE, false, 0, values.length);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107811);Assert.assertEquals(TestUtils.sumSquareDev(new double[] { 4d, 22d, 11d, 14d, 5d }, 3.0d) / values.length, singletest,
                0.01d);
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}

    /**
     * Check that the lower + upper semivariance against the mean sum to the
     * variance.
     */
    @Test
    public void testVarianceDecompMeanCutoff() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zrcj02b6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testVarianceDecompMeanCutoff",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zrcj02b6s(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107812);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107813);double[] values = { -2.0d, 2.0d, 4.0d, -2.0d, 22.0d, 11.0d, 3.0d, 14.0d, 5.0d };
        __CLR4_4_12b5g2b5glb90peod.R.inc(107814);double variance = StatUtils.variance(values);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107815);SemiVariance sv = new SemiVariance(true); // Bias corrected
        __CLR4_4_12b5g2b5glb90peod.R.inc(107816);sv.setVarianceDirection(SemiVariance.DOWNSIDE_VARIANCE);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107817);final double lower = sv.evaluate(values);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107818);sv.setVarianceDirection(SemiVariance.UPSIDE_VARIANCE);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107819);final double upper = sv.evaluate(values);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107820);Assert.assertEquals(variance, lower + upper, 10e-12);
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}

    /**
     * Check that upper and lower semivariances against a cutoff sum to the sum
     * of squared deviations of the full set of values against the cutoff
     * divided by df = length - 1 (assuming bias-corrected).
     */
    @Test
    public void testVarianceDecompNonMeanCutoff() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jztpzh2b71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testVarianceDecompNonMeanCutoff",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jztpzh2b71(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107821);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107822);double[] values = { -2.0d, 2.0d, 4.0d, -2.0d, 22.0d, 11.0d, 3.0d, 14.0d, 5.0d };
        __CLR4_4_12b5g2b5glb90peod.R.inc(107823);double target = 0;
        __CLR4_4_12b5g2b5glb90peod.R.inc(107824);double totalSumOfSquares = TestUtils.sumSquareDev(values, target);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107825);SemiVariance sv = new SemiVariance(true); // Bias corrected
        __CLR4_4_12b5g2b5glb90peod.R.inc(107826);sv.setVarianceDirection(SemiVariance.DOWNSIDE_VARIANCE);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107827);double lower = sv.evaluate(values, target);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107828);sv.setVarianceDirection(SemiVariance.UPSIDE_VARIANCE);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107829);double upper = sv.evaluate(values, target);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107830);Assert.assertEquals(totalSumOfSquares / (values.length - 1), lower + upper, 10e-12);
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}

    @Test
    public void testNoVariance() {__CLR4_4_12b5g2b5glb90peod.R.globalSliceStart(getClass().getName(),107831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18s9gej2b7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b5g2b5glb90peod.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b5g2b5glb90peod.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testNoVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18s9gej2b7b(){try{__CLR4_4_12b5g2b5glb90peod.R.inc(107831);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107832);final double[] values = {100d, 100d, 100d, 100d};
        __CLR4_4_12b5g2b5glb90peod.R.inc(107833);SemiVariance sv = new SemiVariance();
        __CLR4_4_12b5g2b5glb90peod.R.inc(107834);Assert.assertEquals(0, sv.evaluate(values), 10E-12);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107835);Assert.assertEquals(0, sv.evaluate(values, 100d), 10E-12);
        __CLR4_4_12b5g2b5glb90peod.R.inc(107836);Assert.assertEquals(0, sv.evaluate(values, 100d, SemiVariance.UPSIDE_VARIANCE, false, 0, values.length), 10E-12);
    }finally{__CLR4_4_12b5g2b5glb90peod.R.flushNeeded();}}
}
