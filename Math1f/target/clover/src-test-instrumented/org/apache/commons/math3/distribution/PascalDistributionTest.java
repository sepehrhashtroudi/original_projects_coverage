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
 * Test cases for PascalDistribution.
 * Extends IntegerDistributionAbstractTest.  See class javadoc for
 * IntegerDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class PascalDistributionTest extends IntegerDistributionAbstractTest {static class __CLR4_4_11k9c1k9clb90pcf3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72960,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // --------------------- Override tolerance  --------------
    protected double defaultTolerance = NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY;
    @Override
    public void setUp() {try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72912);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72913);super.setUp();
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72914);setTolerance(defaultTolerance);
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default discrete distribution instance to use in tests. */
    @Override
    public IntegerDistribution makeDistribution() {try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72915);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72916);return new PascalDistribution(10,0.70);
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    /** Creates the default probability density test input values */
    @Override
    public int[] makeDensityTestPoints() {try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72917);
      __CLR4_4_11k9c1k9clb90pcf3.R.inc(72918);return new int[] {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72919);
      __CLR4_4_11k9c1k9clb90pcf3.R.inc(72920);return new double[] {0, 0.0282475249, 0.0847425747, 0.139825248255, 0.167790297906, 0.163595540458,
              0.137420253985, 0.103065190489, 0.070673273478, 0.0450542118422, 0.0270325271053,
              0.0154085404500, 0.0084046584273};
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    /** Creates the default cumulative probability density test input values */
    @Override
    public int[] makeCumulativeTestPoints() {try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72921);
      __CLR4_4_11k9c1k9clb90pcf3.R.inc(72922);return makeDensityTestPoints();
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72923);
      __CLR4_4_11k9c1k9clb90pcf3.R.inc(72924);return new double[] {0, 0.0282475249, 0.1129900996, 0.252815347855, 0.420605645761, 0.584201186219,
              0.721621440204, 0.824686630693, 0.895359904171, 0.940414116013, 0.967446643119,
              0.982855183569, 0.991259841996};
        }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability test input values */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72925);
      __CLR4_4_11k9c1k9clb90pcf3.R.inc(72926);return new double[] {0.0, 0.001, 0.010, 0.025, 0.050, 0.100, 0.999,
          0.990, 0.975, 0.950, 0.900, 1.0};
        }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability density test expected values */
    @Override
    public int[] makeInverseCumulativeTestValues() {try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72927);
      __CLR4_4_11k9c1k9clb90pcf3.R.inc(72928);return new int[] {0, 0, 0, 0, 1, 1, 14, 11, 10, 9, 8, Integer.MAX_VALUE};
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    //----------------- Additional test cases ---------------------------------

    /** Test degenerate case p = 0   */
    @Test
    public void testDegenerate0() {__CLR4_4_11k9c1k9clb90pcf3.R.globalSliceStart(getClass().getName(),72929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pb40xd1k9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k9c1k9clb90pcf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k9c1k9clb90pcf3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PascalDistributionTest.testDegenerate0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pb40xd1k9t(){try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72929);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72930);setDistribution(new PascalDistribution(5, 0.0d));
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72931);setCumulativeTestPoints(new int[] {-1, 0, 1, 5, 10 });
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72932);setCumulativeTestValues(new double[] {0d, 0d, 0d, 0d, 0d});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72933);setDensityTestPoints(new int[] {-1, 0, 1, 10, 11});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72934);setDensityTestValues(new double[] {0d, 0d, 0d, 0d, 0d});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72935);setInverseCumulativeTestPoints(new double[] {0.1d, 0.5d});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72936);setInverseCumulativeTestValues(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72937);verifyDensities();
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72938);verifyCumulativeProbabilities();
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72939);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    /** Test degenerate case p = 1   */
    @Test
    public void testDegenerate1() {__CLR4_4_11k9c1k9clb90pcf3.R.globalSliceStart(getClass().getName(),72940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2424w1ka4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k9c1k9clb90pcf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k9c1k9clb90pcf3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PascalDistributionTest.testDegenerate1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2424w1ka4(){try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72940);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72941);setDistribution(new PascalDistribution(5, 1.0d));
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72942);setCumulativeTestPoints(new int[] {-1, 0, 1, 2, 5, 10 });
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72943);setCumulativeTestValues(new double[] {0d, 1d, 1d, 1d, 1d, 1d});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72944);setDensityTestPoints(new int[] {-1, 0, 1, 2, 5, 10});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72945);setDensityTestValues(new double[] {0d, 1d, 0d, 0d, 0d, 0d});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72946);setInverseCumulativeTestPoints(new double[] {0.1d, 0.5d});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72947);setInverseCumulativeTestValues(new int[] {0, 0});
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72948);verifyDensities();
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72949);verifyCumulativeProbabilities();
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72950);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11k9c1k9clb90pcf3.R.globalSliceStart(getClass().getName(),72951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81kaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k9c1k9clb90pcf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k9c1k9clb90pcf3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PascalDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81kaf(){try{__CLR4_4_11k9c1k9clb90pcf3.R.inc(72951);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72952);final double tol = 1e-9;
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72953);PascalDistribution dist;

        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72954);dist = new PascalDistribution(10, 0.5);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72955);Assert.assertEquals(dist.getNumericalMean(), ( 10d * 0.5d ) / 0.5d, tol);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72956);Assert.assertEquals(dist.getNumericalVariance(), ( 10d * 0.5d ) / (0.5d * 0.5d), tol);

        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72957);dist = new PascalDistribution(25, 0.7);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72958);Assert.assertEquals(dist.getNumericalMean(), ( 25d * 0.3d ) / 0.7d, tol);
        __CLR4_4_11k9c1k9clb90pcf3.R.inc(72959);Assert.assertEquals(dist.getNumericalVariance(), ( 25d * 0.3d ) / (0.7d * 0.7d), tol);
    }finally{__CLR4_4_11k9c1k9clb90pcf3.R.flushNeeded();}}
}
