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

package org.apache.commons.math3.distribution;

import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for WeibullDistribution.
 * Extends ContinuousDistributionAbstractTest.  See class javadoc for
 * ContinuousDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class WeibullDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11kmm1kmmlb90pcfx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default continuous distribution instance to use in tests. */
    @Override
    public WeibullDistribution makeDistribution() {try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73390);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73391);return new WeibullDistribution(1.2, 2.1);
    }finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73392);
        // quantiles computed using R version 2.9.2
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73393);return new double[] {0.00664355180993, 0.0454328283309, 0.0981162737374, 0.176713524579, 0.321946865392,
                10.5115496887, 7.4976304671, 6.23205600701, 5.23968436955, 4.2079028257};
    }finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73394);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73395);return new double[] {0.001, 0.01, 0.025, 0.05, 0.1, 0.999, 0.990, 0.975, 0.950, 0.900};
    }finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73396);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73397);return new double[] {0.180535929306, 0.262801138133, 0.301905425199, 0.330899152971,
          0.353441418887, 0.000788590320203, 0.00737060094841, 0.0177576041516, 0.0343043442574, 0.065664589369};
    }finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}}

    //---------------------------- Additional test cases -------------------------

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceStart(getClass().getName(),73398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1kmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kmm1kmmlb90pcfx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.WeibullDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1kmu(){try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73398);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73399);setInverseCumulativeTestPoints(new double[] {0.0, 1.0});
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73400);setInverseCumulativeTestValues(
                new double[] {0.0, Double.POSITIVE_INFINITY});
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73401);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}}

    @Test
    public void testAlpha() {__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceStart(getClass().getName(),73402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vlyz11kmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kmm1kmmlb90pcfx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.WeibullDistributionTest.testAlpha",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vlyz11kmy(){try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73402);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73403);WeibullDistribution dist = new WeibullDistribution(1, 2);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73404);Assert.assertEquals(1, dist.getShape(), 0);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73405);try {
            __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73406);new WeibullDistribution(0, 2);
            __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73407);Assert.fail("NotStrictlyPositiveException expected");
        } catch (NotStrictlyPositiveException e) {
            // Expected.
        }
    }finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}}

    @Test
    public void testBeta() {__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceStart(getClass().getName(),73408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qszrft1kn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kmm1kmmlb90pcfx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.WeibullDistributionTest.testBeta",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qszrft1kn4(){try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73408);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73409);WeibullDistribution dist = new WeibullDistribution(1, 2);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73410);Assert.assertEquals(2, dist.getScale(), 0);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73411);try {
            __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73412);new WeibullDistribution(1, 0);
            __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73413);Assert.fail("NotStrictlyPositiveException expected");
        } catch (NotStrictlyPositiveException e) {
            // Expected.
        }
    }finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceStart(getClass().getName(),73414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81kna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kmm1kmmlb90pcfx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.WeibullDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81kna(){try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73414);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73415);final double tol = 1e-9;
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73416);WeibullDistribution dist;

        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73417);dist = new WeibullDistribution(2.5, 3.5);
        // In R: 3.5*gamma(1+(1/2.5)) (or emperically: mean(rweibull(10000, 2.5, 3.5)))
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73418);Assert.assertEquals(dist.getNumericalMean(), 3.5 * FastMath.exp(Gamma.logGamma(1 + (1 / 2.5))), tol);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73419);Assert.assertEquals(dist.getNumericalVariance(), (3.5 * 3.5) *
                FastMath.exp(Gamma.logGamma(1 + (2 / 2.5))) -
                (dist.getNumericalMean() * dist.getNumericalMean()), tol);

        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73420);dist = new WeibullDistribution(10.4, 2.222);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73421);Assert.assertEquals(dist.getNumericalMean(), 2.222 * FastMath.exp(Gamma.logGamma(1 + (1 / 10.4))), tol);
        __CLR4_4_11kmm1kmmlb90pcfx.R.inc(73422);Assert.assertEquals(dist.getNumericalVariance(), (2.222 * 2.222) *
                FastMath.exp(Gamma.logGamma(1 + (2 / 10.4))) -
                (dist.getNumericalMean() * dist.getNumericalMean()), tol);
    }finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}}

    @Test
    public void testSampling() {__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceStart(getClass().getName(),73423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i4abk1knj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kmm1kmmlb90pcfx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kmm1kmmlb90pcfx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.WeibullDistributionTest.testSampling",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i4abk1knj(){try{__CLR4_4_11kmm1kmmlb90pcfx.R.inc(73423);}finally{__CLR4_4_11kmm1kmmlb90pcfx.R.flushNeeded();}} // Fails in super class
}
