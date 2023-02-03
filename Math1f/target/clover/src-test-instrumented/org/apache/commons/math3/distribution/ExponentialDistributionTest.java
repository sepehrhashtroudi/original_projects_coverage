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

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for ExponentialDistribution.
 * Extends ContinuousDistributionAbstractTest.  See class javadoc for
 * ContinuousDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class ExponentialDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11jh41jh4lb90pcbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71943,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // --------------------- Override tolerance  --------------
    @Override
    public void setUp() {try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71896);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71897);super.setUp();
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71898);setTolerance(1E-9);
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default continuous distribution instance to use in tests. */
    @Override
    public ExponentialDistribution makeDistribution() {try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71899);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71900);return new ExponentialDistribution(5.0);
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71901);
        // quantiles computed using R version 2.9.2
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71902);return new double[] {0.00500250166792, 0.0502516792675, 0.126589039921, 0.256466471938,
                0.526802578289, 34.5387763949, 23.0258509299, 18.4443972706, 14.9786613678, 11.5129254650};
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71903);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71904);return new double[] {0.001, 0.01, 0.025, 0.05, 0.1, 0.999,
                0.990, 0.975, 0.950, 0.900};
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71905);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71906);return new double[] {0.1998, 0.198, 0.195, 0.19, 0.18, 0.000200000000000,
                0.00200000000002, 0.00499999999997, 0.00999999999994, 0.0199999999999};
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    //------------ Additional tests -------------------------------------------

    @Test
    public void testCumulativeProbabilityExtremes() {__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceStart(getClass().getName(),71907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y35ftu1jhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jh41jh4lb90pcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ExponentialDistributionTest.testCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y35ftu1jhf(){try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71907);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71908);setCumulativeTestPoints(new double[] {-2, 0});
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71909);setCumulativeTestValues(new double[] {0, 0});
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71910);verifyCumulativeProbabilities();
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceStart(getClass().getName(),71911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1jhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jh41jh4lb90pcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ExponentialDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1jhj(){try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71911);
         __CLR4_4_11jh41jh4lb90pcbv.R.inc(71912);setInverseCumulativeTestPoints(new double[] {0, 1});
         __CLR4_4_11jh41jh4lb90pcbv.R.inc(71913);setInverseCumulativeTestValues(new double[] {0, Double.POSITIVE_INFINITY});
         __CLR4_4_11jh41jh4lb90pcbv.R.inc(71914);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    @Test
    public void testCumulativeProbability2() {__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceStart(getClass().getName(),71915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tnlbvt1jhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jh41jh4lb90pcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ExponentialDistributionTest.testCumulativeProbability2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tnlbvt1jhn(){try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71915);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71916);double actual = getDistribution().cumulativeProbability(0.25, 0.75);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71917);Assert.assertEquals(0.0905214, actual, 10e-4);
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    @Test
    public void testDensity() {__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceStart(getClass().getName(),71918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgzeyr1jhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jh41jh4lb90pcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ExponentialDistributionTest.testDensity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgzeyr1jhq(){try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71918);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71919);ExponentialDistribution d1 = new ExponentialDistribution(1);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71920);Assert.assertTrue(Precision.equals(0.0, d1.density(-1e-9), 1));
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71921);Assert.assertTrue(Precision.equals(1.0, d1.density(0.0), 1));
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71922);Assert.assertTrue(Precision.equals(0.0, d1.density(1000.0), 1));
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71923);Assert.assertTrue(Precision.equals(FastMath.exp(-1), d1.density(1.0), 1));
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71924);Assert.assertTrue(Precision.equals(FastMath.exp(-2), d1.density(2.0), 1));

        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71925);ExponentialDistribution d2 = new ExponentialDistribution(3);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71926);Assert.assertTrue(Precision.equals(1/3.0, d2.density(0.0), 1));
        // computed using  print(dexp(1, rate=1/3), digits=10) in R 2.5
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71927);Assert.assertEquals(0.2388437702, d2.density(1.0), 1e-8);

        // computed using  print(dexp(2, rate=1/3), digits=10) in R 2.5
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71928);Assert.assertEquals(0.1711390397, d2.density(2.0), 1e-8);
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    @Test
    public void testMeanAccessors() {__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceStart(getClass().getName(),71929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124enss1ji1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jh41jh4lb90pcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ExponentialDistributionTest.testMeanAccessors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124enss1ji1(){try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71929);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71930);ExponentialDistribution distribution = (ExponentialDistribution) getDistribution();
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71931);Assert.assertEquals(5d, distribution.getMean(), Double.MIN_VALUE);
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions() {__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceStart(getClass().getName(),71932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01ji4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jh41jh4lb90pcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ExponentialDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01ji4(){try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71932);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71933);new ExponentialDistribution(0);
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceStart(getClass().getName(),71934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81ji6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jh41jh4lb90pcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jh41jh4lb90pcbv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ExponentialDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81ji6(){try{__CLR4_4_11jh41jh4lb90pcbv.R.inc(71934);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71935);final double tol = 1e-9;
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71936);ExponentialDistribution dist;

        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71937);dist = new ExponentialDistribution(11d);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71938);Assert.assertEquals(dist.getNumericalMean(), 11d, tol);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71939);Assert.assertEquals(dist.getNumericalVariance(), 11d * 11d, tol);

        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71940);dist = new ExponentialDistribution(10.5d);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71941);Assert.assertEquals(dist.getNumericalMean(), 10.5d, tol);
        __CLR4_4_11jh41jh4lb90pcbv.R.inc(71942);Assert.assertEquals(dist.getNumericalVariance(), 10.5d * 10.5d, tol);
    }finally{__CLR4_4_11jh41jh4lb90pcbv.R.flushNeeded();}}
}
