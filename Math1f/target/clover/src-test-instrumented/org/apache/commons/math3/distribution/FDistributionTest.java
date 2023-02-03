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
 * Test cases for FDistribution.
 * Extends ContinuousDistributionAbstractTest.  See class javadoc for
 * ContinuousDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class FDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11jif1jiflb90pcbz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72006,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default continuous distribution instance to use in tests. */
    @Override
    public FDistribution makeDistribution() {try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71943);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71944);return new FDistribution(5.0, 6.0);
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71945);
        // quantiles computed using R version 2.9.2
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71946);return new double[] {0.0346808448626, 0.0937009113303, 0.143313661184, 0.202008445998, 0.293728320107,
                20.8026639595, 8.74589525602, 5.98756512605, 4.38737418741, 3.10751166664};
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71947);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71948);return new double[] {0.001, 0.01, 0.025, 0.05, 0.1, 0.999, 0.990, 0.975, 0.950, 0.900};
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71949);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71950);return new double[] {0.0689156576706, 0.236735653193, 0.364074131941, 0.481570789649, 0.595880479994,
                0.000133443915657, 0.00286681303403, 0.00969192007502, 0.0242883861471, 0.0605491314658};
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    // --------------------- Override tolerance  --------------
    @Override
    public void setUp() {try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71951);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71952);super.setUp();
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71953);setTolerance(1e-9);
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    //---------------------------- Additional test cases -------------------------

    @Test
    public void testCumulativeProbabilityExtremes() {__CLR4_4_11jif1jiflb90pcbz.R.globalSliceStart(getClass().getName(),71954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y35ftu1jiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jif1jiflb90pcbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jif1jiflb90pcbz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.FDistributionTest.testCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y35ftu1jiq(){try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71954);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71955);setCumulativeTestPoints(new double[] {-2, 0});
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71956);setCumulativeTestValues(new double[] {0, 0});
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71957);verifyCumulativeProbabilities();
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11jif1jiflb90pcbz.R.globalSliceStart(getClass().getName(),71958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1jiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jif1jiflb90pcbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jif1jiflb90pcbz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.FDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1jiu(){try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71958);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71959);setInverseCumulativeTestPoints(new double[] {0, 1});
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71960);setInverseCumulativeTestValues(new double[] {0, Double.POSITIVE_INFINITY});
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71961);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    @Test
    public void testDfAccessors() {__CLR4_4_11jif1jiflb90pcbz.R.globalSliceStart(getClass().getName(),71962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oe9iin1jiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jif1jiflb90pcbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jif1jiflb90pcbz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.FDistributionTest.testDfAccessors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oe9iin1jiy(){try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71962);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71963);FDistribution dist = (FDistribution) getDistribution();
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71964);Assert.assertEquals(5d, dist.getNumeratorDegreesOfFreedom(), Double.MIN_VALUE);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71965);Assert.assertEquals(6d, dist.getDenominatorDegreesOfFreedom(), Double.MIN_VALUE);
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    @Test
    public void testPreconditions() {__CLR4_4_11jif1jiflb90pcbz.R.globalSliceStart(getClass().getName(),71966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01jj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jif1jiflb90pcbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jif1jiflb90pcbz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.FDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01jj2(){try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71966);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71967);try {
            __CLR4_4_11jif1jiflb90pcbz.R.inc(71968);new FDistribution(0, 1);
            __CLR4_4_11jif1jiflb90pcbz.R.inc(71969);Assert.fail("Expecting NotStrictlyPositiveException for df = 0");
        } catch (NotStrictlyPositiveException ex) {
            // Expected.
        }
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71970);try {
            __CLR4_4_11jif1jiflb90pcbz.R.inc(71971);new FDistribution(1, 0);
            __CLR4_4_11jif1jiflb90pcbz.R.inc(71972);Assert.fail("Expecting NotStrictlyPositiveException for df = 0");
        } catch (NotStrictlyPositiveException ex) {
            // Expected.
        }
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    @Test
    public void testLargeDegreesOfFreedom() {__CLR4_4_11jif1jiflb90pcbz.R.globalSliceStart(getClass().getName(),71973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v77iw1jj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jif1jiflb90pcbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jif1jiflb90pcbz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.FDistributionTest.testLargeDegreesOfFreedom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v77iw1jj9(){try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71973);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71974);FDistribution fd = new FDistribution(100000, 100000);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71975);double p = fd.cumulativeProbability(.999);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71976);double x = fd.inverseCumulativeProbability(p);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71977);Assert.assertEquals(.999, x, 1.0e-5);
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    @Test
    public void testSmallDegreesOfFreedom() {__CLR4_4_11jif1jiflb90pcbz.R.globalSliceStart(getClass().getName(),71978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abxggc1jje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jif1jiflb90pcbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jif1jiflb90pcbz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.FDistributionTest.testSmallDegreesOfFreedom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abxggc1jje(){try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71978);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71979);FDistribution fd = new FDistribution(1, 1);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71980);double p = fd.cumulativeProbability(0.975);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71981);double x = fd.inverseCumulativeProbability(p);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71982);Assert.assertEquals(0.975, x, 1.0e-5);

        __CLR4_4_11jif1jiflb90pcbz.R.inc(71983);fd = new FDistribution(1, 2);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71984);p = fd.cumulativeProbability(0.975);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71985);x = fd.inverseCumulativeProbability(p);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71986);Assert.assertEquals(0.975, x, 1.0e-5);
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11jif1jiflb90pcbz.R.globalSliceStart(getClass().getName(),71987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81jjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jif1jiflb90pcbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jif1jiflb90pcbz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.FDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81jjn(){try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71987);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71988);final double tol = 1e-9;
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71989);FDistribution dist;

        __CLR4_4_11jif1jiflb90pcbz.R.inc(71990);dist = new FDistribution(1, 2);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71991);Assert.assertTrue(Double.isNaN(dist.getNumericalMean()));
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71992);Assert.assertTrue(Double.isNaN(dist.getNumericalVariance()));

        __CLR4_4_11jif1jiflb90pcbz.R.inc(71993);dist = new FDistribution(1, 3);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71994);Assert.assertEquals(dist.getNumericalMean(), 3d / (3d - 2d), tol);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71995);Assert.assertTrue(Double.isNaN(dist.getNumericalVariance()));

        __CLR4_4_11jif1jiflb90pcbz.R.inc(71996);dist = new FDistribution(1, 5);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71997);Assert.assertEquals(dist.getNumericalMean(), 5d / (5d - 2d), tol);
        __CLR4_4_11jif1jiflb90pcbz.R.inc(71998);Assert.assertEquals(dist.getNumericalVariance(), (2d * 5d * 5d * 4d) / 9d, tol);
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}

    @Test
    public void testMath785() {__CLR4_4_11jif1jiflb90pcbz.R.globalSliceStart(getClass().getName(),71999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgbn291jjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jif1jiflb90pcbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jif1jiflb90pcbz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.FDistributionTest.testMath785",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgbn291jjz(){try{__CLR4_4_11jif1jiflb90pcbz.R.inc(71999);
        // this test was failing due to inaccurate results from ContinuedFraction.

        __CLR4_4_11jif1jiflb90pcbz.R.inc(72000);try {
            __CLR4_4_11jif1jiflb90pcbz.R.inc(72001);double prob = 0.01;
            __CLR4_4_11jif1jiflb90pcbz.R.inc(72002);FDistribution f = new FDistribution(200000, 200000);
            __CLR4_4_11jif1jiflb90pcbz.R.inc(72003);double result = f.inverseCumulativeProbability(prob);
            __CLR4_4_11jif1jiflb90pcbz.R.inc(72004);Assert.assertTrue(result < 1.0);
        } catch (Exception e) {
            __CLR4_4_11jif1jiflb90pcbz.R.inc(72005);Assert.fail("Failing to calculate inverse cumulative probability");
        }
    }finally{__CLR4_4_11jif1jiflb90pcbz.R.flushNeeded();}}
}
