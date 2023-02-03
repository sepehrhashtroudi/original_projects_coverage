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
 * Test cases for {@link ParetoDistribution}.
 * <p>
 * Extends {@link RealDistributionAbstractTest}. See class javadoc of that class for details.
 *
 * @version $Id$
 * @since 3.3
 */
public class ParetoDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11k6w1k6wlb90pcey{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72912,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default real distribution instance to use in tests. */
    @Override
    public ParetoDistribution makeDistribution() {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72824);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72825);return new ParetoDistribution(2.1, 1.4);
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72826);
        // quantiles computed using R
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72827);return new double[] { -2.226325228634938, -1.156887023657177, -0.643949578356075, -0.2027950777320613, 0.305827808237559,
                              +6.42632522863494, 5.35688702365718, 4.843949578356074, 4.40279507773206, 3.89417219176244 };
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72828);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72829);return new double[] { 0, 0, 0, 0, 0, 0.791089998892, 0.730456085931, 0.689667290488, 0.645278794701, 0.578763688757 };
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72830);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72831);return new double[] { 0, 0, 0, 0, 0, 0.0455118580441, 0.070444173646, 0.0896924681582, 0.112794186114, 0.151439332084 };
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability distribution test input values.
     */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72832);
        // Exclude the test points less than zero, as they have cumulative
        // probability of zero, meaning the inverse returns zero, and not the
        // points less than zero.
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72833);double[] points = makeCumulativeTestValues();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72834);double[] points2 = new double[points.length - 5];
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72835);System.arraycopy(points, 5, points2, 0, points.length - 5);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72836);return points2;
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability test expected values.
     */
    @Override
    public double[] makeInverseCumulativeTestValues() {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72837);
        // Exclude the test points less than zero, as they have cumulative
        // probability of zero, meaning the inverse returns zero, and not the
        // points less than zero.
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72838);double[] points = makeCumulativeTestPoints();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72839);double[] points2 = new double[points.length - 5];
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72840);System.arraycopy(points, 5, points2, 0, points.length - 5);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72841);return points2;
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    // --------------------- Override tolerance  --------------
    @Override
    public void setUp() {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72842);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72843);super.setUp();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72844);setTolerance(ParetoDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    //---------------------------- Additional test cases -------------------------

    private void verifyQuantiles() {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72845);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72846);ParetoDistribution distribution = (ParetoDistribution)getDistribution();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72847);double mu = distribution.getScale();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72848);double sigma = distribution.getShape();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72849);setCumulativeTestPoints( new double[] { mu - 2 *sigma,  mu - sigma,
                                                mu,             mu + sigma,
                                                mu + 2 * sigma, mu + 3 * sigma,
                                                mu + 4 * sigma, mu + 5 * sigma });
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72850);verifyCumulativeProbabilities();
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    @Test
    public void testQuantiles() {__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceStart(getClass().getName(),72851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11opvh31k7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k6w1k6wlb90pcey.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ParetoDistributionTest.testQuantiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11opvh31k7n(){try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72851);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72852);setCumulativeTestValues(new double[] {0, 0, 0, 0.510884134236, 0.694625688662, 0.785201995008, 0.837811522357, 0.871634279326});
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72853);setDensityTestValues(new double[] {0, 0, 0.666666666, 0.195646346305, 0.0872498032394, 0.0477328899983, 0.0294888141169, 0.0197485724114});
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72854);verifyQuantiles();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72855);verifyDensities();

        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72856);setDistribution(new ParetoDistribution(1, 1));
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72857);setCumulativeTestValues(new double[] {0, 0, 0, 0.5, 0.666666666667, 0.75, 0.8, 0.833333333333});
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72858);setDensityTestValues(new double[] {0, 0, 1.0, 0.25, 0.111111111111, 0.0625, 0.04, 0.0277777777778});
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72859);verifyQuantiles();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72860);verifyDensities();

        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72861);setDistribution(new ParetoDistribution(0.1, 0.1));
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72862);setCumulativeTestValues(new double[] {0, 0, 0, 0.0669670084632, 0.104041540159, 0.129449436704, 0.148660077479, 0.164041197922});
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72863);setDensityTestValues(new double[] {0, 0, 1.0, 0.466516495768, 0.298652819947, 0.217637640824, 0.170267984504, 0.139326467013});
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72864);verifyQuantiles();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72865);verifyDensities();
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceStart(getClass().getName(),72866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1k82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k6w1k6wlb90pcey.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ParetoDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1k82(){try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72866);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72867);setInverseCumulativeTestPoints(new double[] {0, 1});
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72868);setInverseCumulativeTestValues(new double[] {2.1, Double.POSITIVE_INFINITY});
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72869);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    @Test
    public void testGetScale() {__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceStart(getClass().getName(),72870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11l3gab1k86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k6w1k6wlb90pcey.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ParetoDistributionTest.testGetScale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11l3gab1k86(){try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72870);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72871);ParetoDistribution distribution = (ParetoDistribution)getDistribution();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72872);Assert.assertEquals(2.1, distribution.getScale(), 0);
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    @Test
    public void testGetShape() {__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceStart(getClass().getName(),72873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igq0s1k89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k6w1k6wlb90pcey.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ParetoDistributionTest.testGetShape",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igq0s1k89(){try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72873);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72874);ParetoDistribution distribution = (ParetoDistribution)getDistribution();
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72875);Assert.assertEquals(1.4, distribution.getShape(), 0);
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions() {__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceStart(getClass().getName(),72876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01k8c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k6w1k6wlb90pcey.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ParetoDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01k8c(){try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72876);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72877);new ParetoDistribution(1, 0);
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    @Test
    public void testDensity() {__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceStart(getClass().getName(),72878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgzeyr1k8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k6w1k6wlb90pcey.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ParetoDistributionTest.testDensity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgzeyr1k8e(){try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72878);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72879);double [] x = new double[]{-2, -1, 0, 1, 2};
        // R 2.14: print(dpareto(c(-2,-1,0,1,2), scale=1, shape=1), digits=10)
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72880);checkDensity(1, 1, x, new double[] { 0.00, 0.00, 0.00, 1.00, 0.25 });
        // R 2.14: print(dpareto(c(-2,-1,0,1,2), scale=1.1, shape=1), digits=10)
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72881);checkDensity(1.1, 1, x, new double[] { 0.000, 0.000, 0.000, 0.000, 0.275 });
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    private void checkDensity(double scale, double shape, double[] x,
        double[] expected) {try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72882);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72883);ParetoDistribution d = new ParetoDistribution(scale, shape);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72884);for (int i = 0; (((i < x.length)&&(__CLR4_4_11k6w1k6wlb90pcey.R.iget(72885)!=0|true))||(__CLR4_4_11k6w1k6wlb90pcey.R.iget(72886)==0&false)); i++) {{
            __CLR4_4_11k6w1k6wlb90pcey.R.inc(72887);Assert.assertEquals(expected[i], d.density(x[i]), 1e-9);
        }
    }}finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    /**
     * Check to make sure top-coding of extreme values works correctly.
     */
    @Test
    public void testExtremeValues() {__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceStart(getClass().getName(),72888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgudkz1k8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k6w1k6wlb90pcey.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ParetoDistributionTest.testExtremeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgudkz1k8o(){try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72888);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72889);ParetoDistribution d = new ParetoDistribution(1, 1);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72890);for (int i = 0; (((i < 1e5)&&(__CLR4_4_11k6w1k6wlb90pcey.R.iget(72891)!=0|true))||(__CLR4_4_11k6w1k6wlb90pcey.R.iget(72892)==0&false)); i++) {{ // make sure no convergence exception
            __CLR4_4_11k6w1k6wlb90pcey.R.inc(72893);double upperTail = d.cumulativeProbability(i);
            __CLR4_4_11k6w1k6wlb90pcey.R.inc(72894);if ((((i <= 1000)&&(__CLR4_4_11k6w1k6wlb90pcey.R.iget(72895)!=0|true))||(__CLR4_4_11k6w1k6wlb90pcey.R.iget(72896)==0&false))) {{ // make sure not top-coded
                __CLR4_4_11k6w1k6wlb90pcey.R.inc(72897);Assert.assertTrue(upperTail < 1.0d);
            }
            }else {{ // make sure top coding not reversed
                __CLR4_4_11k6w1k6wlb90pcey.R.inc(72898);Assert.assertTrue(upperTail > 0.999);
            }
        }}

        }__CLR4_4_11k6w1k6wlb90pcey.R.inc(72899);Assert.assertEquals(d.cumulativeProbability(Double.MAX_VALUE), 1, 0);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72900);Assert.assertEquals(d.cumulativeProbability(-Double.MAX_VALUE), 0, 0);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72901);Assert.assertEquals(d.cumulativeProbability(Double.POSITIVE_INFINITY), 1, 0);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72902);Assert.assertEquals(d.cumulativeProbability(Double.NEGATIVE_INFINITY), 0, 0);
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}

    @Test
    public void testMeanVariance() {__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceStart(getClass().getName(),72903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azv0pb1k93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k6w1k6wlb90pcey.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k6w1k6wlb90pcey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ParetoDistributionTest.testMeanVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azv0pb1k93(){try{__CLR4_4_11k6w1k6wlb90pcey.R.inc(72903);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72904);final double tol = 1e-9;
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72905);ParetoDistribution dist;

        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72906);dist = new ParetoDistribution(1, 1);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72907);Assert.assertEquals(dist.getNumericalMean(), Double.POSITIVE_INFINITY, tol);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72908);Assert.assertEquals(dist.getNumericalVariance(), Double.POSITIVE_INFINITY, tol);

        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72909);dist = new ParetoDistribution(2.2, 2.4);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72910);Assert.assertEquals(dist.getNumericalMean(), 3.771428571428, tol);
        __CLR4_4_11k6w1k6wlb90pcey.R.inc(72911);Assert.assertEquals(dist.getNumericalVariance(), 14.816326530, tol);
    }finally{__CLR4_4_11k6w1k6wlb90pcey.R.flushNeeded();}}
}
