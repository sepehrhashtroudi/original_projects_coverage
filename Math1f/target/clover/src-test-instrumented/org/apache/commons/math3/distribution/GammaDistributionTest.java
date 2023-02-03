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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for GammaDistribution.
 * Extends ContinuousDistributionAbstractTest.  See class javadoc for
 * ContinuousDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class GammaDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11jk61jk6lb90pcca{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default continuous distribution instance to use in tests. */
    @Override
    public GammaDistribution makeDistribution() {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72006);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72007);return new GammaDistribution(4d, 2d);
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72008);
        // quantiles computed using R version 2.9.2
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72009);return new double[] {0.857104827257, 1.64649737269, 2.17973074725, 2.7326367935, 3.48953912565,
                26.1244815584, 20.0902350297, 17.5345461395, 15.5073130559, 13.3615661365};
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72010);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72011);return new double[] {0.001, 0.01, 0.025, 0.05, 0.1, 0.999, 0.990, 0.975, 0.950, 0.900};
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72012);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72013);return new double[] {0.00427280075546, 0.0204117166709, 0.0362756163658, 0.0542113174239, 0.0773195272491,
                0.000394468852816, 0.00366559696761, 0.00874649473311, 0.0166712508128, 0.0311798227954};
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    // --------------------- Override tolerance  --------------
    @Override
    public void setUp() {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72014);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72015);super.setUp();
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72016);setTolerance(1e-9);
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    //---------------------------- Additional test cases -------------------------
    @Test
    public void testParameterAccessors() {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1i8ck1jkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testParameterAccessors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1i8ck1jkh(){try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72017);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72018);GammaDistribution distribution = (GammaDistribution) getDistribution();
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72019);Assert.assertEquals(4d, distribution.getAlpha(), 0);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72020);Assert.assertEquals(2d, distribution.getBeta(), 0);
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testPreconditions() {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01jkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01jkl(){try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72021);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72022);try {
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72023);new GammaDistribution(0, 1);
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72024);Assert.fail("Expecting NotStrictlyPositiveException for alpha = 0");
        } catch (NotStrictlyPositiveException ex) {
            // Expected.
        }
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72025);try {
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72026);new GammaDistribution(1, 0);
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72027);Assert.fail("Expecting NotStrictlyPositiveException for alpha = 0");
        } catch (NotStrictlyPositiveException ex) {
            // Expected.
        }
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testProbabilities() {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tsonk81jks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testProbabilities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tsonk81jks(){try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72028);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72029);testProbability(-1.000, 4.0, 2.0, .0000);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72030);testProbability(15.501, 4.0, 2.0, .9499);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72031);testProbability(0.504, 4.0, 1.0, .0018);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72032);testProbability(10.011, 1.0, 2.0, .9933);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72033);testProbability(5.000, 2.0, 2.0, .7127);
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testValues() {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrolwl1jky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrolwl1jky(){try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72034);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72035);testValue(15.501, 4.0, 2.0, .9499);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72036);testValue(0.504, 4.0, 1.0, .0018);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72037);testValue(10.011, 1.0, 2.0, .9933);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72038);testValue(5.000, 2.0, 2.0, .7127);
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    private void testProbability(double x, double a, double b, double expected) {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72039);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72040);GammaDistribution distribution = new GammaDistribution( a, b );
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72041);double actual = distribution.cumulativeProbability(x);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72042);Assert.assertEquals("probability for " + x, expected, actual, 10e-4);
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    private void testValue(double expected, double a, double b, double p) {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72043);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72044);GammaDistribution distribution = new GammaDistribution( a, b );
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72045);double actual = distribution.inverseCumulativeProbability(p);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72046);Assert.assertEquals("critical value for " + p, expected, actual, 10e-4);
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testDensity() {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgzeyr1jlb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testDensity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgzeyr1jlb(){try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72047);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72048);double[] x = new double[]{-0.1, 1e-6, 0.5, 1, 2, 5};
        // R2.5: print(dgamma(x, shape=1, rate=1), digits=10)
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72049);checkDensity(1, 1, x, new double[]{0.000000000000, 0.999999000001, 0.606530659713, 0.367879441171, 0.135335283237, 0.006737946999});
        // R2.5: print(dgamma(x, shape=2, rate=1), digits=10)
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72050);checkDensity(2, 1, x, new double[]{0.000000000000, 0.000000999999, 0.303265329856, 0.367879441171, 0.270670566473, 0.033689734995});
        // R2.5: print(dgamma(x, shape=4, rate=1), digits=10)
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72051);checkDensity(4, 1, x, new double[]{0.000000000e+00, 1.666665000e-19, 1.263605541e-02, 6.131324020e-02, 1.804470443e-01, 1.403738958e-01});
        // R2.5: print(dgamma(x, shape=4, rate=10), digits=10)
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72052);checkDensity(4, 10, x, new double[]{0.000000000e+00, 1.666650000e-15, 1.403738958e+00, 7.566654960e-02, 2.748204830e-05, 4.018228850e-17});
        // R2.5: print(dgamma(x, shape=.1, rate=10), digits=10)
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72053);checkDensity(0.1, 10, x, new double[]{0.000000000e+00, 3.323953832e+04, 1.663849010e-03, 6.007786726e-06, 1.461647647e-10, 5.996008322e-24});
        // R2.5: print(dgamma(x, shape=.1, rate=20), digits=10)
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72054);checkDensity(0.1, 20, x, new double[]{0.000000000e+00, 3.562489883e+04, 1.201557345e-05, 2.923295295e-10, 3.228910843e-19, 1.239484589e-45});
        // R2.5: print(dgamma(x, shape=.1, rate=4), digits=10)
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72055);checkDensity(0.1, 4, x, new double[]{0.000000000e+00, 3.032938388e+04, 3.049322494e-02, 2.211502311e-03, 2.170613371e-05, 5.846590589e-11});
        // R2.5: print(dgamma(x, shape=.1, rate=1), digits=10)
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72056);checkDensity(0.1, 1, x, new double[]{0.000000000e+00, 2.640334143e+04, 1.189704437e-01, 3.866916944e-02, 7.623306235e-03, 1.663849010e-04});
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    private void checkDensity(double alpha, double rate, double[] x, double[] expected) {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72057);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72058);GammaDistribution d = new GammaDistribution(alpha, 1 / rate);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72059);for (int i = 0; (((i < x.length)&&(__CLR4_4_11jk61jk6lb90pcca.R.iget(72060)!=0|true))||(__CLR4_4_11jk61jk6lb90pcca.R.iget(72061)==0&false)); i++) {{
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72062);Assert.assertEquals(expected[i], d.density(x[i]), 1e-5);
        }
    }}finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1jlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1jlr(){try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72063);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72064);setInverseCumulativeTestPoints(new double[] {0, 1});
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72065);setInverseCumulativeTestValues(new double[] {0, Double.POSITIVE_INFINITY});
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72066);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81jlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81jlv(){try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72067);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72068);final double tol = 1e-9;
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72069);GammaDistribution dist;

        __CLR4_4_11jk61jk6lb90pcca.R.inc(72070);dist = new GammaDistribution(1, 2);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72071);Assert.assertEquals(dist.getNumericalMean(), 2, tol);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72072);Assert.assertEquals(dist.getNumericalVariance(), 4, tol);

        __CLR4_4_11jk61jk6lb90pcca.R.inc(72073);dist = new GammaDistribution(1.1, 4.2);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72074);Assert.assertEquals(dist.getNumericalMean(), 1.1d * 4.2d, tol);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72075);Assert.assertEquals(dist.getNumericalVariance(), 1.1d * 4.2d * 4.2d, tol);
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    private static final double HALF_LOG_2_PI = 0.5 * FastMath.log(2.0 * FastMath.PI);

    public static double logGamma(double x) {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72076);
        /*
         * This is a copy of
         * double Gamma.logGamma(double)
         * prior to MATH-849
         */
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72077);double ret;

        __CLR4_4_11jk61jk6lb90pcca.R.inc(72078);if ((((Double.isNaN(x) || (x <= 0.0))&&(__CLR4_4_11jk61jk6lb90pcca.R.iget(72079)!=0|true))||(__CLR4_4_11jk61jk6lb90pcca.R.iget(72080)==0&false))) {{
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72081);ret = Double.NaN;
        } }else {{
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72082);double sum = Gamma.lanczos(x);
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72083);double tmp = x + Gamma.LANCZOS_G + .5;
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72084);ret = ((x + .5) * FastMath.log(tmp)) - tmp +
                HALF_LOG_2_PI + FastMath.log(sum / x);
        }

        }__CLR4_4_11jk61jk6lb90pcca.R.inc(72085);return ret;
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    public static double density(final double x, final double shape,
                                 final double scale) {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72086);
        /*
         * This is a copy of
         * double GammaDistribution.density(double)
         * prior to MATH-753.
         */
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72087);if ((((x < 0)&&(__CLR4_4_11jk61jk6lb90pcca.R.iget(72088)!=0|true))||(__CLR4_4_11jk61jk6lb90pcca.R.iget(72089)==0&false))) {{
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72090);return 0;
        }
        }__CLR4_4_11jk61jk6lb90pcca.R.inc(72091);return FastMath.pow(x / scale, shape - 1) / scale *
               FastMath.exp(-x / scale) / FastMath.exp(logGamma(shape));
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    /*
     * MATH-753: large values of x or shape parameter cause density(double) to
     * overflow. Reference data is generated with the Maxima script
     * gamma-distribution.mac, which can be found in
     * src/test/resources/org/apache/commons/math3/distribution.
     */

    private void doTestMath753(final double shape,
        final double meanNoOF, final double sdNoOF,
        final double meanOF, final double sdOF,
        final String resourceName) throws IOException {try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72092);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72093);final GammaDistribution distribution = new GammaDistribution(shape, 1.0);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72094);final SummaryStatistics statOld = new SummaryStatistics();
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72095);final SummaryStatistics statNewNoOF = new SummaryStatistics();
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72096);final SummaryStatistics statNewOF = new SummaryStatistics();

        __CLR4_4_11jk61jk6lb90pcca.R.inc(72097);final InputStream resourceAsStream;
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72098);resourceAsStream = this.getClass().getResourceAsStream(resourceName);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72099);Assert.assertNotNull("Could not find resource " + resourceName,
                             resourceAsStream);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72100);final BufferedReader in;
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72101);in = new BufferedReader(new InputStreamReader(resourceAsStream));

        __CLR4_4_11jk61jk6lb90pcca.R.inc(72102);try {
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72103);for (String line = in.readLine(); (((line != null)&&(__CLR4_4_11jk61jk6lb90pcca.R.iget(72104)!=0|true))||(__CLR4_4_11jk61jk6lb90pcca.R.iget(72105)==0&false)); line = in.readLine()) {{
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72106);if ((((line.startsWith("#"))&&(__CLR4_4_11jk61jk6lb90pcca.R.iget(72107)!=0|true))||(__CLR4_4_11jk61jk6lb90pcca.R.iget(72108)==0&false))) {{
                    __CLR4_4_11jk61jk6lb90pcca.R.inc(72109);continue;
                }
                }__CLR4_4_11jk61jk6lb90pcca.R.inc(72110);final String[] tokens = line.split(", ");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72111);Assert.assertTrue("expected two floating-point values",
                                  tokens.length == 2);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72112);final double x = Double.parseDouble(tokens[0]);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72113);final String msg = "x = " + x + ", shape = " + shape +
                                   ", scale = 1.0";
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72114);final double expected = Double.parseDouble(tokens[1]);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72115);final double ulp = FastMath.ulp(expected);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72116);final double actualOld = density(x, shape, 1.0);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72117);final double actualNew = distribution.density(x);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72118);final double errOld, errNew;
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72119);errOld = FastMath.abs((actualOld - expected) / ulp);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72120);errNew = FastMath.abs((actualNew - expected) / ulp);

                __CLR4_4_11jk61jk6lb90pcca.R.inc(72121);if ((((Double.isNaN(actualOld) || Double.isInfinite(actualOld))&&(__CLR4_4_11jk61jk6lb90pcca.R.iget(72122)!=0|true))||(__CLR4_4_11jk61jk6lb90pcca.R.iget(72123)==0&false))) {{
                    __CLR4_4_11jk61jk6lb90pcca.R.inc(72124);Assert.assertFalse(msg, Double.isNaN(actualNew));
                    __CLR4_4_11jk61jk6lb90pcca.R.inc(72125);Assert.assertFalse(msg, Double.isInfinite(actualNew));
                    __CLR4_4_11jk61jk6lb90pcca.R.inc(72126);statNewOF.addValue(errNew);
                } }else {{
                    __CLR4_4_11jk61jk6lb90pcca.R.inc(72127);statOld.addValue(errOld);
                    __CLR4_4_11jk61jk6lb90pcca.R.inc(72128);statNewNoOF.addValue(errNew);
                }
            }}
            }__CLR4_4_11jk61jk6lb90pcca.R.inc(72129);if ((((statOld.getN() != 0)&&(__CLR4_4_11jk61jk6lb90pcca.R.iget(72130)!=0|true))||(__CLR4_4_11jk61jk6lb90pcca.R.iget(72131)==0&false))) {{
                /*
                 * If no overflow occurs, check that new implementation is
                 * better than old one.
                 */
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72132);final StringBuilder sb = new StringBuilder("shape = ");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72133);sb.append(shape);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72134);sb.append(", scale = 1.0\n");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72135);sb.append("Old implementation\n");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72136);sb.append("------------------\n");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72137);sb.append(statOld.toString());
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72138);sb.append("New implementation\n");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72139);sb.append("------------------\n");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72140);sb.append(statNewNoOF.toString());
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72141);final String msg = sb.toString();

                __CLR4_4_11jk61jk6lb90pcca.R.inc(72142);final double oldMin = statOld.getMin();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72143);final double newMin = statNewNoOF.getMin();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72144);Assert.assertTrue(msg, newMin <= oldMin);

                __CLR4_4_11jk61jk6lb90pcca.R.inc(72145);final double oldMax = statOld.getMax();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72146);final double newMax = statNewNoOF.getMax();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72147);Assert.assertTrue(msg, newMax <= oldMax);

                __CLR4_4_11jk61jk6lb90pcca.R.inc(72148);final double oldMean = statOld.getMean();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72149);final double newMean = statNewNoOF.getMean();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72150);Assert.assertTrue(msg, newMean <= oldMean);

                __CLR4_4_11jk61jk6lb90pcca.R.inc(72151);final double oldSd = statOld.getStandardDeviation();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72152);final double newSd = statNewNoOF.getStandardDeviation();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72153);Assert.assertTrue(msg, newSd <= oldSd);

                __CLR4_4_11jk61jk6lb90pcca.R.inc(72154);Assert.assertTrue(msg, newMean <= meanNoOF);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72155);Assert.assertTrue(msg, newSd <= sdNoOF);
            }
            }__CLR4_4_11jk61jk6lb90pcca.R.inc(72156);if ((((statNewOF.getN() != 0)&&(__CLR4_4_11jk61jk6lb90pcca.R.iget(72157)!=0|true))||(__CLR4_4_11jk61jk6lb90pcca.R.iget(72158)==0&false))) {{
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72159);final double newMean = statNewOF.getMean();
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72160);final double newSd = statNewOF.getStandardDeviation();

                __CLR4_4_11jk61jk6lb90pcca.R.inc(72161);final StringBuilder sb = new StringBuilder("shape = ");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72162);sb.append(shape);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72163);sb.append(", scale = 1.0");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72164);sb.append(", max. mean error (ulps) = ");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72165);sb.append(meanOF);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72166);sb.append(", actual mean error (ulps) = ");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72167);sb.append(newMean);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72168);sb.append(", max. sd of error (ulps) = ");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72169);sb.append(sdOF);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72170);sb.append(", actual sd of error (ulps) = ");
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72171);sb.append(newSd);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72172);final String msg = sb.toString();

                __CLR4_4_11jk61jk6lb90pcca.R.inc(72173);Assert.assertTrue(msg, newMean <= meanOF);
                __CLR4_4_11jk61jk6lb90pcca.R.inc(72174);Assert.assertTrue(msg, newSd <= sdOF);
            }
        }} catch (IOException e) {
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72175);Assert.fail(e.getMessage());
        } finally {
            __CLR4_4_11jk61jk6lb90pcca.R.inc(72176);in.close();
        }
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}


    @Test
    public void testMath753Shape1() throws IOException {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgr4vi1jox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testMath753Shape1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgr4vi1jox() throws IOException{try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72177);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72178);doTestMath753(1.0, 1.5, 0.5, 0.0, 0.0, "gamma-distribution-shape-1.csv");
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testMath753Shape8() throws IOException {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13prdc71joz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testMath753Shape8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13prdc71joz() throws IOException{try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72179);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72180);doTestMath753(8.0, 1.5, 1.0, 0.0, 0.0, "gamma-distribution-shape-8.csv");
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testMath753Shape10() throws IOException {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12soad01jp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testMath753Shape10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12soad01jp1() throws IOException{try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72181);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72182);doTestMath753(10.0, 1.0, 1.0, 0.0, 0.0, "gamma-distribution-shape-10.csv");
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testMath753Shape100() throws IOException {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kmnfte1jp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testMath753Shape100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kmnfte1jp3() throws IOException{try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72183);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72184);doTestMath753(100.0, 1.5, 1.0, 0.0, 0.0, "gamma-distribution-shape-100.csv");
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testMath753Shape142() throws IOException {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xuvm81jp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testMath753Shape142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xuvm81jp5() throws IOException{try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72185);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72186);doTestMath753(142.0, 0.5, 1.5, 40.0, 40.0, "gamma-distribution-shape-142.csv");
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}

    @Test
    public void testMath753Shape1000() throws IOException {__CLR4_4_11jk61jk6lb90pcca.R.globalSliceStart(getClass().getName(),72187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yihmes1jp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jk61jk6lb90pcca.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jk61jk6lb90pcca.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.GammaDistributionTest.testMath753Shape1000",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yihmes1jp7() throws IOException{try{__CLR4_4_11jk61jk6lb90pcca.R.inc(72187);
        __CLR4_4_11jk61jk6lb90pcca.R.inc(72188);doTestMath753(1000.0, 1.0, 1.0, 160.0, 220.0, "gamma-distribution-shape-1000.csv");
    }finally{__CLR4_4_11jk61jk6lb90pcca.R.flushNeeded();}}
}
