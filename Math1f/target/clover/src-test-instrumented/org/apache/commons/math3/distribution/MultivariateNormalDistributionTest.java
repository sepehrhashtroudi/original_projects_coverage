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

import org.apache.commons.math3.stat.correlation.Covariance;
import org.apache.commons.math3.linear.RealMatrix;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link MultivariateNormalDistribution}.
 */
public class MultivariateNormalDistributionTest {static class __CLR4_4_11k0j1k0jlb90pceg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72675,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test the ability of the distribution to report its mean value parameter.
     */
    @Test
    public void testGetMean() {__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceStart(getClass().getName(),72595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwwlg01k0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k0j1k0jlb90pceg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.MultivariateNormalDistributionTest.testGetMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwwlg01k0j(){try{__CLR4_4_11k0j1k0jlb90pceg.R.inc(72595);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72596);final double[] mu = { -1.5, 2 };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72597);final double[][] sigma = { { 2, -1.1 },
                                   { -1.1, 2 } };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72598);final MultivariateNormalDistribution d = new MultivariateNormalDistribution(mu, sigma);

        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72599);final double[] m = d.getMeans();
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72600);for (int i = 0; (((i < m.length)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72601)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72602)==0&false)); i++) {{
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72603);Assert.assertEquals(mu[i], m[i], 0);
        }
    }}finally{__CLR4_4_11k0j1k0jlb90pceg.R.flushNeeded();}}

    /**
     * Test the ability of the distribution to report its covariance matrix parameter.
     */
    @Test
    public void testGetCovarianceMatrix() {__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceStart(getClass().getName(),72604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ccbrd1k0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k0j1k0jlb90pceg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.MultivariateNormalDistributionTest.testGetCovarianceMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ccbrd1k0s(){try{__CLR4_4_11k0j1k0jlb90pceg.R.inc(72604);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72605);final double[] mu = { -1.5, 2 };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72606);final double[][] sigma = { { 2, -1.1 },
                                   { -1.1, 2 } };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72607);final MultivariateNormalDistribution d = new MultivariateNormalDistribution(mu, sigma);

        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72608);final RealMatrix s = d.getCovariances();
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72609);final int dim = d.getDimension();
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72610);for (int i = 0; (((i < dim)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72611)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72612)==0&false)); i++) {{
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72613);for (int j = 0; (((j < dim)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72614)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72615)==0&false)); j++) {{
                __CLR4_4_11k0j1k0jlb90pceg.R.inc(72616);Assert.assertEquals(sigma[i][j], s.getEntry(i, j), 0);
            }
        }}
    }}finally{__CLR4_4_11k0j1k0jlb90pceg.R.flushNeeded();}}

    /**
     * Test the accuracy of sampling from the distribution.
     */
    @Test
    public void testSampling() {__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceStart(getClass().getName(),72617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i4abk1k15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k0j1k0jlb90pceg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.MultivariateNormalDistributionTest.testSampling",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i4abk1k15(){try{__CLR4_4_11k0j1k0jlb90pceg.R.inc(72617);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72618);final double[] mu = { -1.5, 2 };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72619);final double[][] sigma = { { 2, -1.1 },
                                   { -1.1, 2 } };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72620);final MultivariateNormalDistribution d = new MultivariateNormalDistribution(mu, sigma);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72621);d.reseedRandomGenerator(50);

        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72622);final int n = 500000;

        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72623);final double[][] samples = d.sample(n);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72624);final int dim = d.getDimension();
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72625);final double[] sampleMeans = new double[dim];

        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72626);for (int i = 0; (((i < samples.length)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72627)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72628)==0&false)); i++) {{
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72629);for (int j = 0; (((j < dim)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72630)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72631)==0&false)); j++) {{
                __CLR4_4_11k0j1k0jlb90pceg.R.inc(72632);sampleMeans[j] += samples[i][j];
            }
        }}

        }__CLR4_4_11k0j1k0jlb90pceg.R.inc(72633);final double sampledValueTolerance = 1e-2;
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72634);for (int j = 0; (((j < dim)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72635)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72636)==0&false)); j++) {{
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72637);sampleMeans[j] /= samples.length;
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72638);Assert.assertEquals(mu[j], sampleMeans[j], sampledValueTolerance);
        }

        }__CLR4_4_11k0j1k0jlb90pceg.R.inc(72639);final double[][] sampleSigma = new Covariance(samples).getCovarianceMatrix().getData();
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72640);for (int i = 0; (((i < dim)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72641)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72642)==0&false)); i++) {{
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72643);for (int j = 0; (((j < dim)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72644)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72645)==0&false)); j++) {{
                __CLR4_4_11k0j1k0jlb90pceg.R.inc(72646);Assert.assertEquals(sigma[i][j], sampleSigma[i][j], sampledValueTolerance);
            }
        }}
    }}finally{__CLR4_4_11k0j1k0jlb90pceg.R.flushNeeded();}}

    /**
     * Test the accuracy of the distribution when calculating densities.
     */
    @Test
    public void testDensities() {__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceStart(getClass().getName(),72647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxdm8r1k1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k0j1k0jlb90pceg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.MultivariateNormalDistributionTest.testDensities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxdm8r1k1z(){try{__CLR4_4_11k0j1k0jlb90pceg.R.inc(72647);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72648);final double[] mu = { -1.5, 2 };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72649);final double[][] sigma = { { 2, -1.1 },
                                   { -1.1, 2 } };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72650);final MultivariateNormalDistribution d = new MultivariateNormalDistribution(mu, sigma);

        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72651);final double[][] testValues = { { -1.5, 2 },
                                        { 4, 4 },
                                        { 1.5, -2 },
                                        { 0, 0 } };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72652);final double[] densities = new double[testValues.length];
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72653);for (int i = 0; (((i < densities.length)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72654)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72655)==0&false)); i++) {{
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72656);densities[i] = d.density(testValues[i]);
        }

        // From dmvnorm function in R 2.15 CRAN package Mixtools v0.4.5
        }__CLR4_4_11k0j1k0jlb90pceg.R.inc(72657);final double[] correctDensities = { 0.09528357207691344,
                                            5.80932710124009e-09,
                                            0.001387448895173267,
                                            0.03309922090210541 };

        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72658);for (int i = 0; (((i < testValues.length)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72659)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72660)==0&false)); i++) {{
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72661);Assert.assertEquals(correctDensities[i], densities[i], 1e-16);
        }
    }}finally{__CLR4_4_11k0j1k0jlb90pceg.R.flushNeeded();}}

    /**
     * Test the accuracy of the distribution when calculating densities.
     */
    @Test
    public void testUnivariateDistribution() {__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceStart(getClass().getName(),72662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y2vijh1k2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k0j1k0jlb90pceg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k0j1k0jlb90pceg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.MultivariateNormalDistributionTest.testUnivariateDistribution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y2vijh1k2e(){try{__CLR4_4_11k0j1k0jlb90pceg.R.inc(72662);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72663);final double[] mu = { -1.5 };
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72664);final double[][] sigma = { { 1 } };
 
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72665);final MultivariateNormalDistribution multi = new MultivariateNormalDistribution(mu, sigma);

        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72666);final NormalDistribution uni = new NormalDistribution(mu[0], sigma[0][0]);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72667);final Random rng = new Random();
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72668);final int numCases = 100;
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72669);final double tol = Math.ulp(1d);
        __CLR4_4_11k0j1k0jlb90pceg.R.inc(72670);for (int i = 0; (((i < numCases)&&(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72671)!=0|true))||(__CLR4_4_11k0j1k0jlb90pceg.R.iget(72672)==0&false)); i++) {{
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72673);final double v = rng.nextDouble() * 10 - 5;
            __CLR4_4_11k0j1k0jlb90pceg.R.inc(72674);Assert.assertEquals(uni.density(v), multi.density(new double[] { v }), tol);
        }
    }}finally{__CLR4_4_11k0j1k0jlb90pceg.R.flushNeeded();}}
}
