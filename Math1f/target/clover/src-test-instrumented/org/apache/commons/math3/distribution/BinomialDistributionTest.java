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
package org.apache.commons.math3.distribution;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for BinomialDistribution. Extends IntegerDistributionAbstractTest.
 * See class javadoc for IntegerDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class BinomialDistributionTest extends IntegerDistributionAbstractTest {static class __CLR4_4_11j9e1j9elb90pcb7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71676,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // -------------- Implementations for abstract methods
    // -----------------------

    /** Creates the default discrete distribution instance to use in tests. */
    @Override
    public IntegerDistribution makeDistribution() {try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71618);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71619);return new BinomialDistribution(10, 0.70);
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    /** Creates the default probability density test input values */
    @Override
    public int[] makeDensityTestPoints() {try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71620);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71621);return new int[] { -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71622);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71623);return new double[] { 0d, 0.0000059049d, 0.000137781d, 0.0014467d,
                0.00900169d, 0.0367569d, 0.102919d, 0.200121d, 0.266828d,
                0.233474d, 0.121061d, 0.0282475d, 0d };
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    /** Creates the default cumulative probability density test input values */
    @Override
    public int[] makeCumulativeTestPoints() {try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71624);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71625);return makeDensityTestPoints();
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71626);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71627);return new double[] { 0d, 0.0000d, 0.0001d, 0.0016d, 0.0106d, 0.0473d,
                0.1503d, 0.3504d, 0.6172d, 0.8507d, 0.9718d, 1d, 1d };
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability test input values */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71628);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71629);return new double[] { 0, 0.001d, 0.010d, 0.025d, 0.050d, 0.100d,
                0.999d, 0.990d, 0.975d, 0.950d, 0.900d, 1 };
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability density test expected
     * values
     */
    @Override
    public int[] makeInverseCumulativeTestValues() {try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71630);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71631);return new int[] { 0, 2, 3, 4, 5, 5, 10, 10, 10, 9, 9, 10 };
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    // ----------------- Additional test cases ---------------------------------

    /** Test degenerate case p = 0 */
    @Test
    public void testDegenerate0() {__CLR4_4_11j9e1j9elb90pcb7.R.globalSliceStart(getClass().getName(),71632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pb40xd1j9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11j9e1j9elb90pcb7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11j9e1j9elb90pcb7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.BinomialDistributionTest.testDegenerate0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pb40xd1j9s(){try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71632);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71633);BinomialDistribution dist = new BinomialDistribution(5, 0.0d);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71634);setDistribution(dist);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71635);setCumulativeTestPoints(new int[] { -1, 0, 1, 5, 10 });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71636);setCumulativeTestValues(new double[] { 0d, 1d, 1d, 1d, 1d });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71637);setDensityTestPoints(new int[] { -1, 0, 1, 10, 11 });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71638);setDensityTestValues(new double[] { 0d, 1d, 0d, 0d, 0d });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71639);setInverseCumulativeTestPoints(new double[] { 0.1d, 0.5d });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71640);setInverseCumulativeTestValues(new int[] { 0, 0 });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71641);verifyDensities();
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71642);verifyCumulativeProbabilities();
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71643);verifyInverseCumulativeProbabilities();
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71644);Assert.assertEquals(dist.getSupportLowerBound(), 0);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71645);Assert.assertEquals(dist.getSupportUpperBound(), 0);
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    /** Test degenerate case p = 1 */
    @Test
    public void testDegenerate1() {__CLR4_4_11j9e1j9elb90pcb7.R.globalSliceStart(getClass().getName(),71646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2424w1ja6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11j9e1j9elb90pcb7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11j9e1j9elb90pcb7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.BinomialDistributionTest.testDegenerate1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2424w1ja6(){try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71646);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71647);BinomialDistribution dist = new BinomialDistribution(5, 1.0d);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71648);setDistribution(dist);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71649);setCumulativeTestPoints(new int[] { -1, 0, 1, 2, 5, 10 });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71650);setCumulativeTestValues(new double[] { 0d, 0d, 0d, 0d, 1d, 1d });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71651);setDensityTestPoints(new int[] { -1, 0, 1, 2, 5, 10 });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71652);setDensityTestValues(new double[] { 0d, 0d, 0d, 0d, 1d, 0d });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71653);setInverseCumulativeTestPoints(new double[] { 0.1d, 0.5d });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71654);setInverseCumulativeTestValues(new int[] { 5, 5 });
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71655);verifyDensities();
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71656);verifyCumulativeProbabilities();
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71657);verifyInverseCumulativeProbabilities();
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71658);Assert.assertEquals(dist.getSupportLowerBound(), 5);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71659);Assert.assertEquals(dist.getSupportUpperBound(), 5);
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11j9e1j9elb90pcb7.R.globalSliceStart(getClass().getName(),71660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81jak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11j9e1j9elb90pcb7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11j9e1j9elb90pcb7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.BinomialDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81jak(){try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71660);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71661);final double tol = 1e-9;
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71662);BinomialDistribution dist;

        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71663);dist = new BinomialDistribution(10, 0.5);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71664);Assert.assertEquals(dist.getNumericalMean(), 10d * 0.5d, tol);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71665);Assert.assertEquals(dist.getNumericalVariance(), 10d * 0.5d * 0.5d, tol);

        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71666);dist = new BinomialDistribution(30, 0.3);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71667);Assert.assertEquals(dist.getNumericalMean(), 30d * 0.3d, tol);
        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71668);Assert.assertEquals(dist.getNumericalVariance(), 30d * 0.3d * (1d - 0.3d), tol);
    }finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}

    @Test
    public void testMath718() {__CLR4_4_11j9e1j9elb90pcb7.R.globalSliceStart(getClass().getName(),71669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrgoet1jat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11j9e1j9elb90pcb7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11j9e1j9elb90pcb7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.BinomialDistributionTest.testMath718",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrgoet1jat(){try{__CLR4_4_11j9e1j9elb90pcb7.R.inc(71669);
        // for large trials the evaluation of ContinuedFraction was inaccurate
        // do a sweep over several large trials to test if the current implementation is
        // numerically stable.

        __CLR4_4_11j9e1j9elb90pcb7.R.inc(71670);for (int trials = 500000; (((trials < 20000000)&&(__CLR4_4_11j9e1j9elb90pcb7.R.iget(71671)!=0|true))||(__CLR4_4_11j9e1j9elb90pcb7.R.iget(71672)==0&false)); trials += 100000) {{
            __CLR4_4_11j9e1j9elb90pcb7.R.inc(71673);BinomialDistribution dist = new BinomialDistribution(trials, 0.5);
            __CLR4_4_11j9e1j9elb90pcb7.R.inc(71674);int p = dist.inverseCumulativeProbability(0.5);
            __CLR4_4_11j9e1j9elb90pcb7.R.inc(71675);Assert.assertEquals(trials / 2, p);
        }
    }}finally{__CLR4_4_11j9e1j9elb90pcb7.R.flushNeeded();}}
}
