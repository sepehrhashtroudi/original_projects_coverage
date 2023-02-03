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
 * Test cases for {@link NormalDistribution}. Extends
 * {@link RealDistributionAbstractTest}. See class javadoc of that class
 * for details.
 *
 * @version $Id$
 */
public class NormalDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11k4c1k4clb90pcet{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72824,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default real distribution instance to use in tests. */
    @Override
    public NormalDistribution makeDistribution() {try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72732);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72733);return new NormalDistribution(2.1, 1.4);
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72734);
        // quantiles computed using R
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72735);return new double[] {-2.226325228634938d, -1.156887023657177d, -0.643949578356075d, -0.2027950777320613d, 0.305827808237559d,
                6.42632522863494d, 5.35688702365718d, 4.843949578356074d, 4.40279507773206d, 3.89417219176244d};
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72736);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72737);return new double[] {0.001d, 0.01d, 0.025d, 0.05d, 0.1d, 0.999d,
                0.990d, 0.975d, 0.950d, 0.900d};
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72738);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72739);return new double[] {0.00240506434076, 0.0190372444310, 0.0417464784322, 0.0736683145538, 0.125355951380,
                0.00240506434076, 0.0190372444310, 0.0417464784322, 0.0736683145538, 0.125355951380};
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    // --------------------- Override tolerance  --------------
    protected double defaultTolerance = NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY;
    @Override
    public void setUp() {try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72740);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72741);super.setUp();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72742);setTolerance(defaultTolerance);
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    //---------------------------- Additional test cases -------------------------

    private void verifyQuantiles() {try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72743);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72744);NormalDistribution distribution = (NormalDistribution) getDistribution();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72745);double mu = distribution.getMean();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72746);double sigma = distribution.getStandardDeviation();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72747);setCumulativeTestPoints( new double[] {mu - 2 *sigma, mu - sigma,
                mu, mu + sigma, mu + 2 * sigma,  mu + 3 * sigma, mu + 4 * sigma,
                mu + 5 * sigma});
        // Quantiles computed using R (same as Mathematica)
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72748);setCumulativeTestValues(new double[] {0.02275013194817921, 0.158655253931457, 0.5, 0.841344746068543,
                0.977249868051821, 0.99865010196837, 0.999968328758167,  0.999999713348428});
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72749);verifyCumulativeProbabilities();
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    @Test
    public void testQuantiles() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11opvh31k4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testQuantiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11opvh31k4u(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72750);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72751);setDensityTestValues(new double[] {0.0385649760808, 0.172836231799, 0.284958771715, 0.172836231799, 0.0385649760808,
                0.00316560600853, 9.55930184035e-05, 1.06194251052e-06});
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72752);verifyQuantiles();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72753);verifyDensities();

        __CLR4_4_11k4c1k4clb90pcet.R.inc(72754);setDistribution(new NormalDistribution(0, 1));
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72755);setDensityTestValues(new double[] {0.0539909665132, 0.241970724519, 0.398942280401, 0.241970724519, 0.0539909665132,
                0.00443184841194, 0.000133830225765, 1.48671951473e-06});
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72756);verifyQuantiles();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72757);verifyDensities();

        __CLR4_4_11k4c1k4clb90pcet.R.inc(72758);setDistribution(new NormalDistribution(0, 0.1));
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72759);setDensityTestValues(new double[] {0.539909665132, 2.41970724519, 3.98942280401, 2.41970724519,
                0.539909665132, 0.0443184841194, 0.00133830225765, 1.48671951473e-05});
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72760);verifyQuantiles();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72761);verifyDensities();
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1k56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1k56(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72762);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72763);setInverseCumulativeTestPoints(new double[] {0, 1});
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72764);setInverseCumulativeTestValues(
                new double[] {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY});
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72765);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    @Test
    public void testGetMean() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwwlg01k5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testGetMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwwlg01k5a(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72766);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72767);NormalDistribution distribution = (NormalDistribution) getDistribution();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72768);Assert.assertEquals(2.1, distribution.getMean(), 0);
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    @Test
    public void testGetStandardDeviation() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttrqfb1k5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testGetStandardDeviation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttrqfb1k5d(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72769);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72770);NormalDistribution distribution = (NormalDistribution) getDistribution();
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72771);Assert.assertEquals(1.4, distribution.getStandardDeviation(), 0);
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01k5g();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01k5g(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72772);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72773);new NormalDistribution(1, 0);
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    @Test
    public void testDensity() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgzeyr1k5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testDensity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgzeyr1k5i(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72774);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72775);double [] x = new double[]{-2, -1, 0, 1, 2};
        // R 2.5: print(dnorm(c(-2,-1,0,1,2)), digits=10)
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72776);checkDensity(0, 1, x, new double[]{0.05399096651, 0.24197072452, 0.39894228040, 0.24197072452, 0.05399096651});
        // R 2.5: print(dnorm(c(-2,-1,0,1,2), mean=1.1), digits=10)
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72777);checkDensity(1.1, 1, x, new double[]{0.003266819056,0.043983595980,0.217852177033,0.396952547477,0.266085249899});
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    private void checkDensity(double mean, double sd, double[] x, double[] expected) {try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72778);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72779);NormalDistribution d = new NormalDistribution(mean, sd);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72780);for (int i = 0; (((i < x.length)&&(__CLR4_4_11k4c1k4clb90pcet.R.iget(72781)!=0|true))||(__CLR4_4_11k4c1k4clb90pcet.R.iget(72782)==0&false)); i++) {{
            __CLR4_4_11k4c1k4clb90pcet.R.inc(72783);Assert.assertEquals(expected[i], d.density(x[i]), 1e-9);
        }
    }}finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    /**
     * Check to make sure top-coding of extreme values works correctly.
     * Verifies fixes for JIRA MATH-167, MATH-414
     */
    @Test
    public void testExtremeValues() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgudkz1k5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testExtremeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgudkz1k5s(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72784);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72785);NormalDistribution distribution = new NormalDistribution(0, 1);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72786);for (int i = 0; (((i < 100)&&(__CLR4_4_11k4c1k4clb90pcet.R.iget(72787)!=0|true))||(__CLR4_4_11k4c1k4clb90pcet.R.iget(72788)==0&false)); i++) {{ // make sure no convergence exception
            __CLR4_4_11k4c1k4clb90pcet.R.inc(72789);double lowerTail = distribution.cumulativeProbability(-i);
            __CLR4_4_11k4c1k4clb90pcet.R.inc(72790);double upperTail = distribution.cumulativeProbability(i);
            __CLR4_4_11k4c1k4clb90pcet.R.inc(72791);if ((((i < 9)&&(__CLR4_4_11k4c1k4clb90pcet.R.iget(72792)!=0|true))||(__CLR4_4_11k4c1k4clb90pcet.R.iget(72793)==0&false))) {{ // make sure not top-coded
                // For i = 10, due to bad tail precision in erf (MATH-364), 1 is returned
                // TODO: once MATH-364 is resolved, replace 9 with 30
                __CLR4_4_11k4c1k4clb90pcet.R.inc(72794);Assert.assertTrue(lowerTail > 0.0d);
                __CLR4_4_11k4c1k4clb90pcet.R.inc(72795);Assert.assertTrue(upperTail < 1.0d);
            }
            }else {{ // make sure top coding not reversed
                __CLR4_4_11k4c1k4clb90pcet.R.inc(72796);Assert.assertTrue(lowerTail < 0.00001);
                __CLR4_4_11k4c1k4clb90pcet.R.inc(72797);Assert.assertTrue(upperTail > 0.99999);
            }
        }}

        }__CLR4_4_11k4c1k4clb90pcet.R.inc(72798);Assert.assertEquals(distribution.cumulativeProbability(Double.MAX_VALUE), 1, 0);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72799);Assert.assertEquals(distribution.cumulativeProbability(-Double.MAX_VALUE), 0, 0);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72800);Assert.assertEquals(distribution.cumulativeProbability(Double.POSITIVE_INFINITY), 1, 0);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72801);Assert.assertEquals(distribution.cumulativeProbability(Double.NEGATIVE_INFINITY), 0, 0);
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    @Test
    public void testMath280() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvl9fb1k6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testMath280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvl9fb1k6a(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72802);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72803);NormalDistribution normal = new NormalDistribution(0,1);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72804);double result = normal.inverseCumulativeProbability(0.9986501019683698);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72805);Assert.assertEquals(3.0, result, defaultTolerance);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72806);result = normal.inverseCumulativeProbability(0.841344746068543);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72807);Assert.assertEquals(1.0, result, defaultTolerance);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72808);result = normal.inverseCumulativeProbability(0.9999683287581673);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72809);Assert.assertEquals(4.0, result, defaultTolerance);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72810);result = normal.inverseCumulativeProbability(0.9772498680518209);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72811);Assert.assertEquals(2.0, result, defaultTolerance);
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11k4c1k4clb90pcet.R.globalSliceStart(getClass().getName(),72812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81k6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k4c1k4clb90pcet.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k4c1k4clb90pcet.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.NormalDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81k6k(){try{__CLR4_4_11k4c1k4clb90pcet.R.inc(72812);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72813);final double tol = 1e-9;
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72814);NormalDistribution dist;

        __CLR4_4_11k4c1k4clb90pcet.R.inc(72815);dist = new NormalDistribution(0, 1);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72816);Assert.assertEquals(dist.getNumericalMean(), 0, tol);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72817);Assert.assertEquals(dist.getNumericalVariance(), 1, tol);

        __CLR4_4_11k4c1k4clb90pcet.R.inc(72818);dist = new NormalDistribution(2.2, 1.4);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72819);Assert.assertEquals(dist.getNumericalMean(), 2.2, tol);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72820);Assert.assertEquals(dist.getNumericalVariance(), 1.4 * 1.4, tol);

        __CLR4_4_11k4c1k4clb90pcet.R.inc(72821);dist = new NormalDistribution(-2000.9, 10.4);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72822);Assert.assertEquals(dist.getNumericalMean(), -2000.9, tol);
        __CLR4_4_11k4c1k4clb90pcet.R.inc(72823);Assert.assertEquals(dist.getNumericalVariance(), 10.4 * 10.4, tol);
    }finally{__CLR4_4_11k4c1k4clb90pcet.R.flushNeeded();}}
}
