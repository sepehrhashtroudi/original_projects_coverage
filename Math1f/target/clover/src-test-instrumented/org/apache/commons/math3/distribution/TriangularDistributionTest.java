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

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link TriangularDistribution}. See class javadoc for
 * {@link RealDistributionAbstractTest} for further details.
 */
public class TriangularDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11kjj1kjjlb90pcfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73328,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // --- Override tolerance -------------------------------------------------

    @Override
    public void setUp() {try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73279);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73280);super.setUp();
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73281);setTolerance(1e-4);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    //--- Implementations for abstract methods --------------------------------

    /**
     * Creates the default triangular distribution instance to use in tests.
     */
    @Override
    public TriangularDistribution makeDistribution() {try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73282);
        // Left side 5 wide, right side 10 wide.
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73283);return new TriangularDistribution(-3, 2, 12);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /**
     * Creates the default cumulative probability distribution test input
     * values.
     */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73284);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73285);return new double[] { -3.0001,                 // below lower limit
                              -3.0,                    // at lower limit
                              -2.0, -1.0, 0.0, 1.0,    // on lower side
                              2.0,                     // at mode
                              3.0, 4.0, 10.0, 11.0,    // on upper side
                              12.0,                    // at upper limit
                              12.0001                  // above upper limit
                            };
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /**
     * Creates the default cumulative probability density test expected values.
     */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73286);
        // Top at 2 / (b - a) = 2 / (12 - -3) = 2 / 15 = 7.5
        // Area left  = 7.5 * 5  * 0.5 = 18.75 (1/3 of the total area)
        // Area right = 7.5 * 10 * 0.5 = 37.5  (2/3 of the total area)
        // Area total = 18.75 + 37.5 = 56.25
        // Derivative left side = 7.5 / 5 = 1.5
        // Derivative right side = -7.5 / 10 = -0.75
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73287);double third = 1 / 3.0;
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73288);double left = 18.75;
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73289);double area = 56.25;
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73290);return new double[] { 0.0,
                              0.0,
                              0.75 / area, 3 / area, 6.75 / area, 12 / area,
                              third,
                              (left + 7.125) / area, (left + 13.5) / area,
                              (left + 36) / area, (left + 37.125) / area,
                              1.0,
                              1.0
                            };
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability distribution test
     * input values.
     */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73291);
        // Exclude the points outside the limits, as they have cumulative
        // probability of zero and one, meaning the inverse returns the
        // limits and not the points outside the limits.
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73292);double[] points = makeCumulativeTestValues();
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73293);double[] points2 = new double[points.length-2];
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73294);System.arraycopy(points, 1, points2, 0, points2.length);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73295);return points2;
        //return Arrays.copyOfRange(points, 1, points.length - 1);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability density test expected
     * values.
     */
    @Override
    public double[] makeInverseCumulativeTestValues() {try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73296);
        // Exclude the points outside the limits, as they have cumulative
        // probability of zero and one, meaning the inverse returns the
        // limits and not the points outside the limits.
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73297);double[] points = makeCumulativeTestPoints();
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73298);double[] points2 = new double[points.length-2];
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73299);System.arraycopy(points, 1, points2, 0, points2.length);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73300);return points2;
        //return Arrays.copyOfRange(points, 1, points.length - 1);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /** Creates the default probability density test expected values. */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73301);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73302);return new double[] { 0,
                              0,
                              2 / 75.0, 4 / 75.0, 6 / 75.0, 8 / 75.0,
                              10 / 75.0,
                              9 / 75.0, 8 / 75.0, 2 / 75.0, 1 / 75.0,
                              0,
                              0
                            };
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    //--- Additional test cases -----------------------------------------------

    /** Test lower bound getter. */
    @Test
    public void testGetLowerBound() {__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceStart(getClass().getName(),73303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuvwbc1kk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kjj1kjjlb90pcfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TriangularDistributionTest.testGetLowerBound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuvwbc1kk7(){try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73303);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73304);TriangularDistribution distribution = makeDistribution();
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73305);Assert.assertEquals(-3.0, distribution.getSupportLowerBound(), 0);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /** Test upper bound getter. */
    @Test
    public void testGetUpperBound() {__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceStart(getClass().getName(),73306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114mv5l1kka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kjj1kjjlb90pcfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TriangularDistributionTest.testGetUpperBound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114mv5l1kka(){try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73306);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73307);TriangularDistribution distribution = makeDistribution();
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73308);Assert.assertEquals(12.0, distribution.getSupportUpperBound(), 0);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /** Test pre-condition for equal lower/upper limit. */
    @Test(expected=NumberIsTooLargeException.class)
    public void testPreconditions1() {__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceStart(getClass().getName(),73309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuhld1kkd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,49,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kjj1kjjlb90pcfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TriangularDistributionTest.testPreconditions1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuhld1kkd(){try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73309);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73310);new TriangularDistribution(0, 0, 0);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /** Test pre-condition for lower limit larger than upper limit. */
    @Test(expected=NumberIsTooLargeException.class)
    public void testPreconditions2() {__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceStart(getClass().getName(),73311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14muisw1kkf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,50,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kjj1kjjlb90pcfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TriangularDistributionTest.testPreconditions2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14muisw1kkf(){try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73311);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73312);new TriangularDistribution(1, 1, 0);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /** Test pre-condition for mode larger than upper limit. */
    @Test(expected=NumberIsTooLargeException.class)
    public void testPreconditions3() {__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceStart(getClass().getName(),73313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11duk0f1kkh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,51,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kjj1kjjlb90pcfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TriangularDistributionTest.testPreconditions3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11duk0f1kkh(){try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73313);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73314);new TriangularDistribution(0, 2, 1);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /** Test pre-condition for mode smaller than lower limit. */
    @Test(expected=NumberIsTooSmallException.class)
    public void testPreconditions4() {__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceStart(getClass().getName(),73315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v5es21kkj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,52,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kjj1kjjlb90pcfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TriangularDistributionTest.testPreconditions4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v5es21kkj(){try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73315);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73316);new TriangularDistribution(2, 1, 3);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}

    /** Test mean/variance. */
    @Test
    public void testMeanVariance() {__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceStart(getClass().getName(),73317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azv0pb1kkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kjj1kjjlb90pcfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kjj1kjjlb90pcfo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.TriangularDistributionTest.testMeanVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azv0pb1kkl(){try{__CLR4_4_11kjj1kjjlb90pcfo.R.inc(73317);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73318);TriangularDistribution dist;

        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73319);dist = new TriangularDistribution(0, 0.5, 1.0);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73320);Assert.assertEquals(dist.getNumericalMean(), 0.5, 0);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73321);Assert.assertEquals(dist.getNumericalVariance(), 1 / 24.0, 0);

        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73322);dist = new TriangularDistribution(0, 1, 1);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73323);Assert.assertEquals(dist.getNumericalMean(), 2 / 3.0, 0);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73324);Assert.assertEquals(dist.getNumericalVariance(), 1 / 18.0, 0);

        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73325);dist = new TriangularDistribution(-3, 2, 12);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73326);Assert.assertEquals(dist.getNumericalMean(), 3 + (2 / 3.0), 0);
        __CLR4_4_11kjj1kjjlb90pcfo.R.inc(73327);Assert.assertEquals(dist.getNumericalVariance(), 175 / 18.0, 0);
    }finally{__CLR4_4_11kjj1kjjlb90pcfo.R.flushNeeded();}}
}
