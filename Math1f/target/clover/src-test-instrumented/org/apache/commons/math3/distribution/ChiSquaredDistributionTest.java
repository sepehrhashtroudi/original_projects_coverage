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

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link ChiSquaredDistribution}.
 *
 * @see RealDistributionAbstractTest
 * @version $Id$
 */
public class ChiSquaredDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11jc01jc0lb90pcbf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default continuous distribution instance to use in tests. */
    @Override
    public ChiSquaredDistribution makeDistribution() {try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71712);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71713);return new ChiSquaredDistribution(5.0);
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71714);
        // quantiles computed using R version 2.9.2
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71715);return new double[] {0.210212602629, 0.554298076728, 0.831211613487, 1.14547622606, 1.61030798696,
                20.5150056524, 15.0862724694, 12.8325019940, 11.0704976935, 9.23635689978};
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71716);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71717);return new double[] {0.001, 0.01, 0.025, 0.05, 0.1, 0.999, 0.990, 0.975, 0.950, 0.900};
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability test input values */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71718);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71719);return new double[] {0, 0.001d, 0.01d, 0.025d, 0.05d, 0.1d, 0.999d,
                0.990d, 0.975d, 0.950d, 0.900d, 1};
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability density test expected values */
    @Override
    public double[] makeInverseCumulativeTestValues() {try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71720);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71721);return new double[] {0, 0.210212602629, 0.554298076728, 0.831211613487, 1.14547622606, 1.61030798696,
                20.5150056524, 15.0862724694, 12.8325019940, 11.0704976935, 9.23635689978,
                Double.POSITIVE_INFINITY};
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71722);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71723);return new double[] {0.0115379817652, 0.0415948507811, 0.0665060119842, 0.0919455953114, 0.121472591024,
                0.000433630076361, 0.00412780610309, 0.00999340341045, 0.0193246438937, 0.0368460089216};
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

 // --------------------- Override tolerance  --------------
    @Override
    public void setUp() {try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71724);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71725);super.setUp();
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71726);setTolerance(1e-9);
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

 //---------------------------- Additional test cases -------------------------

    @Test
    public void testSmallDf() {__CLR4_4_11jc01jc0lb90pcbf.R.globalSliceStart(getClass().getName(),71727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytukki1jcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jc01jc0lb90pcbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jc01jc0lb90pcbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ChiSquaredDistributionTest.testSmallDf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytukki1jcf(){try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71727);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71728);setDistribution(new ChiSquaredDistribution(0.1d));
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71729);setTolerance(1E-4);
        // quantiles computed using R version 1.8.1 (linux version)
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71730);setCumulativeTestPoints(new double[] {1.168926E-60, 1.168926E-40, 1.063132E-32,
                1.144775E-26, 1.168926E-20, 5.472917, 2.175255, 1.13438,
                0.5318646, 0.1526342});
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71731);setInverseCumulativeTestValues(getCumulativeTestPoints());
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71732);setInverseCumulativeTestPoints(getCumulativeTestValues());
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71733);verifyCumulativeProbabilities();
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71734);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    @Test
    public void testDfAccessors() {__CLR4_4_11jc01jc0lb90pcbf.R.globalSliceStart(getClass().getName(),71735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oe9iin1jcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jc01jc0lb90pcbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jc01jc0lb90pcbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ChiSquaredDistributionTest.testDfAccessors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oe9iin1jcn(){try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71735);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71736);ChiSquaredDistribution distribution = (ChiSquaredDistribution) getDistribution();
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71737);Assert.assertEquals(5d, distribution.getDegreesOfFreedom(), Double.MIN_VALUE);
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    @Test
    public void testDensity() {__CLR4_4_11jc01jc0lb90pcbf.R.globalSliceStart(getClass().getName(),71738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgzeyr1jcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jc01jc0lb90pcbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jc01jc0lb90pcbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ChiSquaredDistributionTest.testDensity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgzeyr1jcq(){try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71738);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71739);double[] x = new double[]{-0.1, 1e-6, 0.5, 1, 2, 5};
        //R 2.5: print(dchisq(x, df=1), digits=10)
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71740);checkDensity(1, x, new double[]{0.00000000000, 398.94208093034, 0.43939128947, 0.24197072452, 0.10377687436, 0.01464498256});
        //R 2.5: print(dchisq(x, df=0.1), digits=10)
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71741);checkDensity(0.1, x, new double[]{0.000000000e+00, 2.486453997e+04, 7.464238732e-02, 3.009077718e-02, 9.447299159e-03, 8.827199396e-04});
        //R 2.5: print(dchisq(x, df=2), digits=10)
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71742);checkDensity(2, x, new double[]{0.00000000000, 0.49999975000, 0.38940039154, 0.30326532986, 0.18393972059, 0.04104249931});
        //R 2.5: print(dchisq(x, df=10), digits=10)
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71743);checkDensity(10, x, new double[]{0.000000000e+00, 1.302082682e-27, 6.337896998e-05, 7.897534632e-04, 7.664155024e-03, 6.680094289e-02});
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    private void checkDensity(double df, double[] x, double[] expected) {try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71744);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71745);ChiSquaredDistribution d = new ChiSquaredDistribution(df);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71746);for (int i = 0; (((i < x.length)&&(__CLR4_4_11jc01jc0lb90pcbf.R.iget(71747)!=0|true))||(__CLR4_4_11jc01jc0lb90pcbf.R.iget(71748)==0&false)); i++) {{
            __CLR4_4_11jc01jc0lb90pcbf.R.inc(71749);Assert.assertEquals(expected[i], d.density(x[i]), 1e-5);
        }
    }}finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11jc01jc0lb90pcbf.R.globalSliceStart(getClass().getName(),71750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81jd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jc01jc0lb90pcbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jc01jc0lb90pcbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ChiSquaredDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81jd2(){try{__CLR4_4_11jc01jc0lb90pcbf.R.inc(71750);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71751);final double tol = 1e-9;
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71752);ChiSquaredDistribution dist;

        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71753);dist = new ChiSquaredDistribution(1500);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71754);Assert.assertEquals(dist.getNumericalMean(), 1500, tol);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71755);Assert.assertEquals(dist.getNumericalVariance(), 3000, tol);

        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71756);dist = new ChiSquaredDistribution(1.12);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71757);Assert.assertEquals(dist.getNumericalMean(), 1.12, tol);
        __CLR4_4_11jc01jc0lb90pcbf.R.inc(71758);Assert.assertEquals(dist.getNumericalVariance(), 2.24, tol);
    }finally{__CLR4_4_11jc01jc0lb90pcbf.R.flushNeeded();}}
}
