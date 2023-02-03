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
import org.apache.commons.math3.TestUtils;
/**
 * Test cases for TDistribution.
 * Extends ContinuousDistributionAbstractTest.  See class javadoc for
 * ContinuousDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class TDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11khs1khslb90pcfk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

//-------------- Implementations for abstract methods -----------------------

    /** Creates the default continuous distribution instance to use in tests. */
    @Override
    public TDistribution makeDistribution() {try{__CLR4_4_11khs1khslb90pcfk.R.inc(73216);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73217);return new TDistribution(5.0);
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11khs1khslb90pcfk.R.inc(73218);
        // quantiles computed using R version 2.9.2
        __CLR4_4_11khs1khslb90pcfk.R.inc(73219);return new double[] {-5.89342953136, -3.36492999891, -2.57058183564, -2.01504837333, -1.47588404882,
                5.89342953136, 3.36492999891, 2.57058183564, 2.01504837333, 1.47588404882};
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11khs1khslb90pcfk.R.inc(73220);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73221);return new double[] {0.001, 0.01, 0.025, 0.05, 0.1, 0.999,
                0.990, 0.975, 0.950, 0.900};
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11khs1khslb90pcfk.R.inc(73222);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73223);return new double[] {0.000756494565517, 0.0109109752919, 0.0303377878006, 0.0637967988952, 0.128289492005,
                0.000756494565517, 0.0109109752919, 0.0303377878006, 0.0637967988952, 0.128289492005};
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    // --------------------- Override tolerance  --------------
    @Override
    public void setUp() {try{__CLR4_4_11khs1khslb90pcfk.R.inc(73224);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73225);super.setUp();
        __CLR4_4_11khs1khslb90pcfk.R.inc(73226);setTolerance(1E-9);
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    //---------------------------- Additional test cases -------------------------
    /**
     * @see <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=27243">
     *      Bug report that prompted this unit test.</a>
     */
    @Test
    public void testCumulativeProbabilityAgainstStackOverflow() {__CLR4_4_11khs1khslb90pcfk.R.globalSliceStart(getClass().getName(),73227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fav3401ki3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11khs1khslb90pcfk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11khs1khslb90pcfk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TDistributionTest.testCumulativeProbabilityAgainstStackOverflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fav3401ki3(){try{__CLR4_4_11khs1khslb90pcfk.R.inc(73227);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73228);TDistribution td = new TDistribution(5.);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73229);td.cumulativeProbability(.1);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73230);td.cumulativeProbability(.01);
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    @Test
    public void testSmallDf() {__CLR4_4_11khs1khslb90pcfk.R.globalSliceStart(getClass().getName(),73231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytukki1ki7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11khs1khslb90pcfk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11khs1khslb90pcfk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TDistributionTest.testSmallDf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytukki1ki7(){try{__CLR4_4_11khs1khslb90pcfk.R.inc(73231);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73232);setDistribution(new TDistribution(1d));
        // quantiles computed using R version 2.9.2
        __CLR4_4_11khs1khslb90pcfk.R.inc(73233);setCumulativeTestPoints(new double[] {-318.308838986, -31.8205159538, -12.7062047362,
                -6.31375151468, -3.07768353718, 318.308838986, 31.8205159538, 12.7062047362,
                 6.31375151468, 3.07768353718});
        __CLR4_4_11khs1khslb90pcfk.R.inc(73234);setDensityTestValues(new double[] {3.14158231817e-06, 0.000314055924703, 0.00195946145194,
                0.00778959736375, 0.0303958893917, 3.14158231817e-06, 0.000314055924703,
                0.00195946145194, 0.00778959736375, 0.0303958893917});
        __CLR4_4_11khs1khslb90pcfk.R.inc(73235);setInverseCumulativeTestValues(getCumulativeTestPoints());
        __CLR4_4_11khs1khslb90pcfk.R.inc(73236);verifyCumulativeProbabilities();
        __CLR4_4_11khs1khslb90pcfk.R.inc(73237);verifyInverseCumulativeProbabilities();
        __CLR4_4_11khs1khslb90pcfk.R.inc(73238);verifyDensities();
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11khs1khslb90pcfk.R.globalSliceStart(getClass().getName(),73239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1kif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11khs1khslb90pcfk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11khs1khslb90pcfk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1kif(){try{__CLR4_4_11khs1khslb90pcfk.R.inc(73239);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73240);setInverseCumulativeTestPoints(new double[] {0, 1});
        __CLR4_4_11khs1khslb90pcfk.R.inc(73241);setInverseCumulativeTestValues(
                new double[] {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY});
        __CLR4_4_11khs1khslb90pcfk.R.inc(73242);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    @Test
    public void testDfAccessors() {__CLR4_4_11khs1khslb90pcfk.R.globalSliceStart(getClass().getName(),73243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oe9iin1kij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11khs1khslb90pcfk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11khs1khslb90pcfk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TDistributionTest.testDfAccessors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oe9iin1kij(){try{__CLR4_4_11khs1khslb90pcfk.R.inc(73243);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73244);TDistribution dist = (TDistribution) getDistribution();
        __CLR4_4_11khs1khslb90pcfk.R.inc(73245);Assert.assertEquals(5d, dist.getDegreesOfFreedom(), Double.MIN_VALUE);
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions() {__CLR4_4_11khs1khslb90pcfk.R.globalSliceStart(getClass().getName(),73246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01kim();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11khs1khslb90pcfk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11khs1khslb90pcfk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01kim(){try{__CLR4_4_11khs1khslb90pcfk.R.inc(73246);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73247);new TDistribution(0);
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11khs1khslb90pcfk.R.globalSliceStart(getClass().getName(),73248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81kio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11khs1khslb90pcfk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11khs1khslb90pcfk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81kio(){try{__CLR4_4_11khs1khslb90pcfk.R.inc(73248);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73249);final double tol = 1e-9;
        __CLR4_4_11khs1khslb90pcfk.R.inc(73250);TDistribution dist;

        __CLR4_4_11khs1khslb90pcfk.R.inc(73251);dist = new TDistribution(1);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73252);Assert.assertTrue(Double.isNaN(dist.getNumericalMean()));
        __CLR4_4_11khs1khslb90pcfk.R.inc(73253);Assert.assertTrue(Double.isNaN(dist.getNumericalVariance()));

        __CLR4_4_11khs1khslb90pcfk.R.inc(73254);dist = new TDistribution(1.5);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73255);Assert.assertEquals(dist.getNumericalMean(), 0, tol);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73256);Assert.assertTrue(Double.isInfinite(dist.getNumericalVariance()));

        __CLR4_4_11khs1khslb90pcfk.R.inc(73257);dist = new TDistribution(5);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73258);Assert.assertEquals(dist.getNumericalMean(), 0, tol);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73259);Assert.assertEquals(dist.getNumericalVariance(), 5d / (5d - 2d), tol);
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}

    /*
     * Adding this test to benchmark against tables published by NIST
     * http://itl.nist.gov/div898/handbook/eda/section3/eda3672.htm
     * Have chosen tabulated results for degrees of freedom 2,10,30,100
     * Have chosen problevels from 0.10 to 0.001
     */
    @Test
    public void nistData(){__CLR4_4_11khs1khslb90pcfk.R.globalSliceStart(getClass().getName(),73260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mgtp1kj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11khs1khslb90pcfk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11khs1khslb90pcfk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TDistributionTest.nistData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mgtp1kj0(){try{__CLR4_4_11khs1khslb90pcfk.R.inc(73260);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73261);double[] prob = new double[]{ 0.10,0.05,0.025,0.01,0.005,0.001};
        __CLR4_4_11khs1khslb90pcfk.R.inc(73262);double[] args2 = new double[]{1.886,2.920,4.303,6.965,9.925,22.327};
        __CLR4_4_11khs1khslb90pcfk.R.inc(73263);double[] args10 = new double[]{1.372,1.812,2.228,2.764,3.169,4.143};
        __CLR4_4_11khs1khslb90pcfk.R.inc(73264);double[] args30 = new double[]{1.310,1.697,2.042,2.457,2.750,3.385};
        __CLR4_4_11khs1khslb90pcfk.R.inc(73265);double[] args100= new double[]{1.290,1.660,1.984,2.364,2.626,3.174};
        __CLR4_4_11khs1khslb90pcfk.R.inc(73266);TestUtils.assertEquals(prob, makeNistResults(args2, 2), 1.0e-4);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73267);TestUtils.assertEquals(prob, makeNistResults(args10, 10), 1.0e-4);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73268);TestUtils.assertEquals(prob, makeNistResults(args30, 30), 1.0e-4);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73269);TestUtils.assertEquals(prob, makeNistResults(args100, 100), 1.0e-4);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73270);return;
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}
    private double[] makeNistResults(double[] args, int df){try{__CLR4_4_11khs1khslb90pcfk.R.inc(73271);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73272);TDistribution td =  new TDistribution(df);
        __CLR4_4_11khs1khslb90pcfk.R.inc(73273);double[] res  = new double[ args.length ];
        __CLR4_4_11khs1khslb90pcfk.R.inc(73274);for( int i = 0 ; (((i < res.length )&&(__CLR4_4_11khs1khslb90pcfk.R.iget(73275)!=0|true))||(__CLR4_4_11khs1khslb90pcfk.R.iget(73276)==0&false)); i++){{
            __CLR4_4_11khs1khslb90pcfk.R.inc(73277);res[i] = 1.0 - td.cumulativeProbability(args[i]);
        }
        }__CLR4_4_11khs1khslb90pcfk.R.inc(73278);return res;
    }finally{__CLR4_4_11khs1khslb90pcfk.R.flushNeeded();}}
}
