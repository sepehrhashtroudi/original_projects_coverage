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

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for CauchyDistribution.
 * Extends ContinuousDistributionAbstractTest.  See class javadoc for
 * ContinuousDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class CauchyDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11jb01jb0lb90pcba{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71712,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // --------------------- Override tolerance  --------------
    protected double defaultTolerance = NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY;
    @Override
    public void setUp() {try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71676);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71677);super.setUp();
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71678);setTolerance(defaultTolerance);
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default continuous distribution instance to use in tests. */
    @Override
    public CauchyDistribution makeDistribution() {try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71679);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71680);return new CauchyDistribution(1.2, 2.1);
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71681);
        // quantiles computed using R 2.9.2
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71682);return new double[] {-667.24856187, -65.6230835029, -25.4830299460, -12.0588781808,
                -5.26313542807, 669.64856187, 68.0230835029, 27.8830299460, 14.4588781808, 7.66313542807};
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71683);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71684);return new double[] {0.001, 0.01, 0.025, 0.05, 0.1, 0.999,
                0.990, 0.975, 0.950, 0.900};
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71685);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71686);return new double[] {1.49599158008e-06, 0.000149550440335, 0.000933076881878, 0.00370933207799, 0.0144742330437,
                1.49599158008e-06, 0.000149550440335, 0.000933076881878, 0.00370933207799, 0.0144742330437};
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    //---------------------------- Additional test cases -------------------------

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11jb01jb0lb90pcba.R.globalSliceStart(getClass().getName(),71687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1jbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jb01jb0lb90pcba.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jb01jb0lb90pcba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.CauchyDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1jbb(){try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71687);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71688);setInverseCumulativeTestPoints(new double[] {0.0, 1.0});
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71689);setInverseCumulativeTestValues(
                new double[] {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY});
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71690);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    @Test
    public void testMedian() {__CLR4_4_11jb01jb0lb90pcba.R.globalSliceStart(getClass().getName(),71691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apj4lf1jbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jb01jb0lb90pcba.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jb01jb0lb90pcba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.CauchyDistributionTest.testMedian",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apj4lf1jbf(){try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71691);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71692);CauchyDistribution distribution = (CauchyDistribution) getDistribution();
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71693);Assert.assertEquals(1.2, distribution.getMedian(), 0.0);
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    @Test
    public void testScale() {__CLR4_4_11jb01jb0lb90pcba.R.globalSliceStart(getClass().getName(),71694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1na2dwh1jbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jb01jb0lb90pcba.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jb01jb0lb90pcba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.CauchyDistributionTest.testScale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1na2dwh1jbi(){try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71694);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71695);CauchyDistribution distribution = (CauchyDistribution) getDistribution();
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71696);Assert.assertEquals(2.1, distribution.getScale(), 0.0);
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    @Test
    public void testPreconditions() {__CLR4_4_11jb01jb0lb90pcba.R.globalSliceStart(getClass().getName(),71697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01jbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jb01jb0lb90pcba.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jb01jb0lb90pcba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.CauchyDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01jbl(){try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71697);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71698);try {
            __CLR4_4_11jb01jb0lb90pcba.R.inc(71699);new CauchyDistribution(0, 0);
            __CLR4_4_11jb01jb0lb90pcba.R.inc(71700);Assert.fail("Cannot have zero scale");
        } catch (NotStrictlyPositiveException ex) {
            // Expected.
        }
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71701);try {
            __CLR4_4_11jb01jb0lb90pcba.R.inc(71702);new CauchyDistribution(0, -1);
            __CLR4_4_11jb01jb0lb90pcba.R.inc(71703);Assert.fail("Cannot have negative scale");
        } catch (NotStrictlyPositiveException ex) {
            // Expected.
        }
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11jb01jb0lb90pcba.R.globalSliceStart(getClass().getName(),71704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81jbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jb01jb0lb90pcba.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jb01jb0lb90pcba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.CauchyDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81jbs(){try{__CLR4_4_11jb01jb0lb90pcba.R.inc(71704);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71705);CauchyDistribution dist;

        __CLR4_4_11jb01jb0lb90pcba.R.inc(71706);dist = new CauchyDistribution(10.2, 0.15);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71707);Assert.assertTrue(Double.isNaN(dist.getNumericalMean()));
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71708);Assert.assertTrue(Double.isNaN(dist.getNumericalVariance()));

        __CLR4_4_11jb01jb0lb90pcba.R.inc(71709);dist = new CauchyDistribution(23.12, 2.12);
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71710);Assert.assertTrue(Double.isNaN(dist.getNumericalMean()));
        __CLR4_4_11jb01jb0lb90pcba.R.inc(71711);Assert.assertTrue(Double.isNaN(dist.getNumericalVariance()));
    }finally{__CLR4_4_11jb01jb0lb90pcba.R.flushNeeded();}}
}
