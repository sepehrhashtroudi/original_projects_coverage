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
 * Test cases for {@link LogNormalDistribution}. Extends
 * {@link RealDistributionAbstractTest}. See class javadoc of that class
 * for details.
 *
 * @version $Id$
 * @since 3.0
 */
public class LogNormalDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11jy01jy0lb90pcec{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72595,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default real distribution instance to use in tests. */
    @Override
    public LogNormalDistribution makeDistribution() {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72504);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72505);return new LogNormalDistribution(2.1, 1.4);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72506);
        // quantiles computed using R
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72507);return new double[] { -2.226325228634938, -1.156887023657177,
                              -0.643949578356075, -0.2027950777320613,
                              0.305827808237559, 6.42632522863494,
                              5.35688702365718, 4.843949578356074,
                              4.40279507773206, 3.89417219176244 };
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72508);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72509);return new double[] { 0, 0, 0, 0, 0.00948199951485, 0.432056525076,
                              0.381648158697, 0.354555726206, 0.329513316888,
                              0.298422824228 };
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72510);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72511);return new double[] { 0, 0, 0, 0, 0.0594218160072, 0.0436977691036,
                              0.0508364857798, 0.054873528325, 0.0587182664085,
                              0.0636229042785 };
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability distribution test
     * input values.
     */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72512);
        // Exclude the test points less than zero, as they have cumulative
        // probability of zero, meaning the inverse returns zero, and not the
        // points less than zero.
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72513);double[] points = makeCumulativeTestValues();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72514);double[] points2 = new double[points.length - 4];
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72515);System.arraycopy(points, 4, points2, 0, points2.length - 4);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72516);return points2;
        //return Arrays.copyOfRange(points, 4, points.length - 4);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability test expected
     * values.
     */
    @Override
    public double[] makeInverseCumulativeTestValues() {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72517);
        // Exclude the test points less than zero, as they have cumulative
        // probability of zero, meaning the inverse returns zero, and not the
        // points less than zero.
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72518);double[] points = makeCumulativeTestPoints();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72519);double[] points2 = new double[points.length - 4];
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72520);System.arraycopy(points, 4, points2, 0, points2.length - 4);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72521);return points2;
        //return Arrays.copyOfRange(points, 1, points.length - 4);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    // --------------------- Override tolerance  --------------
    @Override
    public void setUp() {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72522);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72523);super.setUp();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72524);setTolerance(LogNormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    //---------------------------- Additional test cases -------------------------

    private void verifyQuantiles() {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72525);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72526);LogNormalDistribution distribution = (LogNormalDistribution)getDistribution();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72527);double mu = distribution.getScale();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72528);double sigma = distribution.getShape();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72529);setCumulativeTestPoints( new double[] { mu - 2 *sigma, mu - sigma,
                                                mu, mu + sigma, mu + 2 * sigma,
                                                mu + 3 * sigma,mu + 4 * sigma,
                                                mu + 5 * sigma });
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72530);verifyCumulativeProbabilities();
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    @Test
    public void testQuantiles() {__CLR4_4_11jy01jy0lb90pcec.R.globalSliceStart(getClass().getName(),72531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11opvh31jyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jy01jy0lb90pcec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jy01jy0lb90pcec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LogNormalDistributionTest.testQuantiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11opvh31jyr(){try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72531);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72532);setCumulativeTestValues(new double[] {0, 0.0396495152787,
                                              0.16601209243, 0.272533253269,
                                              0.357618409638, 0.426488363093,
                                              0.483255136841, 0.530823013877});
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72533);setDensityTestValues(new double[] {0, 0.0873055825147, 0.0847676303432,
                                           0.0677935186237, 0.0544105523058,
                                           0.0444614628804, 0.0369750288945,
                                           0.0312206409653});
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72534);verifyQuantiles();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72535);verifyDensities();

        __CLR4_4_11jy01jy0lb90pcec.R.inc(72536);setDistribution(new LogNormalDistribution(0, 1));
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72537);setCumulativeTestValues(new double[] {0, 0, 0, 0.5, 0.755891404214,
                                              0.864031392359, 0.917171480998,
                                              0.946239689548});
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72538);setDensityTestValues(new double[] {0, 0, 0, 0.398942280401,
                                           0.156874019279, 0.07272825614,
                                           0.0381534565119, 0.0218507148303});
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72539);verifyQuantiles();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72540);verifyDensities();

        __CLR4_4_11jy01jy0lb90pcec.R.inc(72541);setDistribution(new LogNormalDistribution(0, 0.1));
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72542);setCumulativeTestValues(new double[] {0, 0, 0, 1.28417563064e-117,
                                              1.39679883412e-58,
                                              1.09839325447e-33,
                                              2.52587961726e-20,
                                              2.0824223487e-12});
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72543);setDensityTestValues(new double[] {0, 0, 0, 2.96247992535e-114,
                                           1.1283370232e-55, 4.43812313223e-31,
                                           5.85346445002e-18,
                                           2.9446618076e-10});
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72544);verifyQuantiles();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72545);verifyDensities();
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    @Test
    public void testInverseCumulativeProbabilityExtremes() {__CLR4_4_11jy01jy0lb90pcec.R.globalSliceStart(getClass().getName(),72546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nua9zi1jz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jy01jy0lb90pcec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jy01jy0lb90pcec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LogNormalDistributionTest.testInverseCumulativeProbabilityExtremes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nua9zi1jz6(){try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72546);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72547);setInverseCumulativeTestPoints(new double[] {0, 1});
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72548);setInverseCumulativeTestValues(
                new double[] {0, Double.POSITIVE_INFINITY});
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72549);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    @Test
    public void testGetScale() {__CLR4_4_11jy01jy0lb90pcec.R.globalSliceStart(getClass().getName(),72550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11l3gab1jza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jy01jy0lb90pcec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jy01jy0lb90pcec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LogNormalDistributionTest.testGetScale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11l3gab1jza(){try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72550);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72551);LogNormalDistribution distribution = (LogNormalDistribution)getDistribution();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72552);Assert.assertEquals(2.1, distribution.getScale(), 0);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    @Test
    public void testGetShape() {__CLR4_4_11jy01jy0lb90pcec.R.globalSliceStart(getClass().getName(),72553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igq0s1jzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jy01jy0lb90pcec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jy01jy0lb90pcec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LogNormalDistributionTest.testGetShape",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igq0s1jzd(){try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72553);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72554);LogNormalDistribution distribution = (LogNormalDistribution)getDistribution();
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72555);Assert.assertEquals(1.4, distribution.getShape(), 0);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions() {__CLR4_4_11jy01jy0lb90pcec.R.globalSliceStart(getClass().getName(),72556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01jzg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jy01jy0lb90pcec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jy01jy0lb90pcec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LogNormalDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01jzg(){try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72556);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72557);new LogNormalDistribution(1, 0);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    @Test
    public void testDensity() {__CLR4_4_11jy01jy0lb90pcec.R.globalSliceStart(getClass().getName(),72558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgzeyr1jzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jy01jy0lb90pcec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jy01jy0lb90pcec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LogNormalDistributionTest.testDensity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgzeyr1jzi(){try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72558);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72559);double [] x = new double[]{-2, -1, 0, 1, 2};
        // R 2.13: print(dlnorm(c(-2,-1,0,1,2)), digits=10)
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72560);checkDensity(0, 1, x, new double[] { 0.0000000000, 0.0000000000,
                                             0.0000000000, 0.3989422804,
                                             0.1568740193 });
        // R 2.13: print(dlnorm(c(-2,-1,0,1,2), mean=1.1), digits=10)
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72561);checkDensity(1.1, 1, x, new double[] { 0.0000000000, 0.0000000000,
                                               0.0000000000, 0.2178521770,
                                               0.1836267118});
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    private void checkDensity(double scale, double shape, double[] x,
        double[] expected) {try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72562);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72563);LogNormalDistribution d = new LogNormalDistribution(scale, shape);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72564);for (int i = 0; (((i < x.length)&&(__CLR4_4_11jy01jy0lb90pcec.R.iget(72565)!=0|true))||(__CLR4_4_11jy01jy0lb90pcec.R.iget(72566)==0&false)); i++) {{
            __CLR4_4_11jy01jy0lb90pcec.R.inc(72567);Assert.assertEquals(expected[i], d.density(x[i]), 1e-9);
        }
    }}finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    /**
     * Check to make sure top-coding of extreme values works correctly.
     * Verifies fixes for JIRA MATH-167, MATH-414
     */
    @Test
    public void testExtremeValues() {__CLR4_4_11jy01jy0lb90pcec.R.globalSliceStart(getClass().getName(),72568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgudkz1jzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jy01jy0lb90pcec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jy01jy0lb90pcec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LogNormalDistributionTest.testExtremeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgudkz1jzs(){try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72568);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72569);LogNormalDistribution d = new LogNormalDistribution(0, 1);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72570);for (int i = 0; (((i < 1e5)&&(__CLR4_4_11jy01jy0lb90pcec.R.iget(72571)!=0|true))||(__CLR4_4_11jy01jy0lb90pcec.R.iget(72572)==0&false)); i++) {{ // make sure no convergence exception
            __CLR4_4_11jy01jy0lb90pcec.R.inc(72573);double upperTail = d.cumulativeProbability(i);
            __CLR4_4_11jy01jy0lb90pcec.R.inc(72574);if ((((i <= 72)&&(__CLR4_4_11jy01jy0lb90pcec.R.iget(72575)!=0|true))||(__CLR4_4_11jy01jy0lb90pcec.R.iget(72576)==0&false))) {{ // make sure not top-coded
                __CLR4_4_11jy01jy0lb90pcec.R.inc(72577);Assert.assertTrue(upperTail < 1.0d);
            }
            }else {{ // make sure top coding not reversed
                __CLR4_4_11jy01jy0lb90pcec.R.inc(72578);Assert.assertTrue(upperTail > 0.99999);
            }
        }}

        }__CLR4_4_11jy01jy0lb90pcec.R.inc(72579);Assert.assertEquals(d.cumulativeProbability(Double.MAX_VALUE), 1, 0);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72580);Assert.assertEquals(d.cumulativeProbability(-Double.MAX_VALUE), 0, 0);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72581);Assert.assertEquals(d.cumulativeProbability(Double.POSITIVE_INFINITY), 1, 0);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72582);Assert.assertEquals(d.cumulativeProbability(Double.NEGATIVE_INFINITY), 0, 0);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}

    @Test
    public void testMeanVariance() {__CLR4_4_11jy01jy0lb90pcec.R.globalSliceStart(getClass().getName(),72583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azv0pb1k07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jy01jy0lb90pcec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jy01jy0lb90pcec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LogNormalDistributionTest.testMeanVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azv0pb1k07(){try{__CLR4_4_11jy01jy0lb90pcec.R.inc(72583);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72584);final double tol = 1e-9;
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72585);LogNormalDistribution dist;

        __CLR4_4_11jy01jy0lb90pcec.R.inc(72586);dist = new LogNormalDistribution(0, 1);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72587);Assert.assertEquals(dist.getNumericalMean(), 1.6487212707001282, tol);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72588);Assert.assertEquals(dist.getNumericalVariance(),
                            4.670774270471604, tol);

        __CLR4_4_11jy01jy0lb90pcec.R.inc(72589);dist = new LogNormalDistribution(2.2, 1.4);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72590);Assert.assertEquals(dist.getNumericalMean(), 24.046753552064498, tol);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72591);Assert.assertEquals(dist.getNumericalVariance(),
                            3526.913651880464, tol);

        __CLR4_4_11jy01jy0lb90pcec.R.inc(72592);dist = new LogNormalDistribution(-2000.9, 10.4);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72593);Assert.assertEquals(dist.getNumericalMean(), 0.0, tol);
        __CLR4_4_11jy01jy0lb90pcec.R.inc(72594);Assert.assertEquals(dist.getNumericalVariance(), 0.0, tol);
    }finally{__CLR4_4_11jy01jy0lb90pcec.R.flushNeeded();}}
}
