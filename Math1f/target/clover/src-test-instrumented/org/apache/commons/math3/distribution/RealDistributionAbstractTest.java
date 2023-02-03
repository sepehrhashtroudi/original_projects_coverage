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


import java.util.ArrayList;
import java.util.Collections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator;
import org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Abstract base class for {@link RealDistribution} tests.
 * <p>
 * To create a concrete test class for a continuous distribution
 * implementation, first implement makeDistribution() to return a distribution
 * instance to use in tests. Then implement each of the test data generation
 * methods below.  In each case, the test points and test values arrays
 * returned represent parallel arrays of inputs and expected values for the
 * distribution returned by makeDistribution().  Default implementations
 * are provided for the makeInverseXxx methods that just invert the mapping
 * defined by the arrays returned by the makeCumulativeXxx methods.
 * <p>
 * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities
 * makeCumulativeTestValues() -- expected cumulative probabilites
 * makeDensityTestValues() -- expected density values at cumulativeTestPoints
 * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf
 * makeInverseCumulativeTestValues() -- expected inverse cdf values
 * <p>
 * To implement additional test cases with different distribution instances and
 * test data, use the setXxx methods for the instance data in test cases and
 * call the verifyXxx methods to verify results.
 * <p>
 * Error tolerance can be overriden by implementing getTolerance().
 * <p>
 * Test data should be validated against reference tables or other packages
 * where possible, and the source of the reference data and/or validation
 * should be documented in the test cases.  A framework for validating
 * distribution data against R is included in the /src/test/R source tree.
 * <p>
 * See {@link NormalDistributionTest} and {@link ChiSquaredDistributionTest}
 * for examples.
 *
 * @version $Id$
 */
public abstract class RealDistributionAbstractTest {static class __CLR4_4_11kdc1kdclb90pcfg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73216,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

//-------------------- Private test instance data -------------------------
    /**  Distribution instance used to perform tests */
    private RealDistribution distribution;

    /** Tolerance used in comparing expected and returned values */
    private double tolerance = 1E-4;

    /** Arguments used to test cumulative probability density calculations */
    private double[] cumulativeTestPoints;

    /** Values used to test cumulative probability density calculations */
    private double[] cumulativeTestValues;

    /** Arguments used to test inverse cumulative probability density calculations */
    private double[] inverseCumulativeTestPoints;

    /** Values used to test inverse cumulative probability density calculations */
    private double[] inverseCumulativeTestValues;

    /** Values used to test density calculations */
    private double[] densityTestValues;

    //-------------------- Abstract methods -----------------------------------

    /** Creates the default continuous distribution instance to use in tests. */
    public abstract RealDistribution makeDistribution();

    /** Creates the default cumulative probability test input values */
    public abstract double[] makeCumulativeTestPoints();

    /** Creates the default cumulative probability test expected values */
    public abstract double[] makeCumulativeTestValues();

    /** Creates the default density test expected values */
    public abstract double[] makeDensityTestValues();

    //---- Default implementations of inverse test data generation methods ----

    /** Creates the default inverse cumulative probability test input values */
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73056);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73057);return makeCumulativeTestValues();
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability density test expected values */
    public double[] makeInverseCumulativeTestValues() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73058);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73059);return makeCumulativeTestPoints();
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    //-------------------- Setup / tear down ----------------------------------

    /**
     * Setup sets all test instance data to default values
     */
    @Before
    public void setUp() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73060);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73061);distribution = makeDistribution();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73062);cumulativeTestPoints = makeCumulativeTestPoints();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73063);cumulativeTestValues = makeCumulativeTestValues();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73064);inverseCumulativeTestPoints = makeInverseCumulativeTestPoints();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73065);inverseCumulativeTestValues = makeInverseCumulativeTestValues();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73066);densityTestValues = makeDensityTestValues();
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * Cleans up test instance data
     */
    @After
    public void tearDown() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73067);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73068);distribution = null;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73069);cumulativeTestPoints = null;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73070);cumulativeTestValues = null;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73071);inverseCumulativeTestPoints = null;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73072);inverseCumulativeTestValues = null;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73073);densityTestValues = null;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    //-------------------- Verification methods -------------------------------

    /**
     * Verifies that cumulative probability density calculations match expected values
     * using current test instance data
     */
    protected void verifyCumulativeProbabilities() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73074);
        // verify cumulativeProbability(double)
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73075);for (int i = 0; (((i < cumulativeTestPoints.length)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73076)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73077)==0&false)); i++) {{
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73078);TestUtils.assertEquals("Incorrect cumulative probability value returned for "
                + cumulativeTestPoints[i], cumulativeTestValues[i],
                distribution.cumulativeProbability(cumulativeTestPoints[i]),
                getTolerance());
        }
        // verify cumulativeProbability(double, double)
        // XXX In 4.0, "cumulativeProbability(double,double)" must be replaced with "probability" (MATH-839).
        }__CLR4_4_11kdc1kdclb90pcfg.R.inc(73079);for (int i = 0; (((i < cumulativeTestPoints.length)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73080)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73081)==0&false)); i++) {{
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73082);for (int j = 0; (((j < cumulativeTestPoints.length)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73083)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73084)==0&false)); j++) {{
                __CLR4_4_11kdc1kdclb90pcfg.R.inc(73085);if ((((cumulativeTestPoints[i] <= cumulativeTestPoints[j])&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73086)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73087)==0&false))) {{
                    __CLR4_4_11kdc1kdclb90pcfg.R.inc(73088);TestUtils.assertEquals(cumulativeTestValues[j] - cumulativeTestValues[i],
                        distribution.cumulativeProbability(cumulativeTestPoints[i], cumulativeTestPoints[j]),
                        getTolerance());
                } }else {{
                    __CLR4_4_11kdc1kdclb90pcfg.R.inc(73089);try {
                        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73090);distribution.cumulativeProbability(cumulativeTestPoints[i], cumulativeTestPoints[j]);
                    } catch (NumberIsTooLargeException e) {
                        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73091);continue;
                    }
                    __CLR4_4_11kdc1kdclb90pcfg.R.inc(73092);Assert.fail("distribution.cumulativeProbability(double, double) should have thrown an exception that second argument is too large");
                }
            }}
        }}
    }}finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * Verifies that inverse cumulative probability density calculations match expected values
     * using current test instance data
     */
    protected void verifyInverseCumulativeProbabilities() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73093);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73094);for (int i = 0; (((i < inverseCumulativeTestPoints.length)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73095)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73096)==0&false)); i++) {{
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73097);TestUtils.assertEquals("Incorrect inverse cumulative probability value returned for "
                + inverseCumulativeTestPoints[i], inverseCumulativeTestValues[i],
                 distribution.inverseCumulativeProbability(inverseCumulativeTestPoints[i]),
                 getTolerance());
        }
    }}finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * Verifies that density calculations match expected values
     */
    protected void verifyDensities() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73098);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73099);for (int i = 0; (((i < cumulativeTestPoints.length)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73100)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73101)==0&false)); i++) {{
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73102);TestUtils.assertEquals("Incorrect probability density value returned for "
                + cumulativeTestPoints[i], densityTestValues[i],
                 distribution.density(cumulativeTestPoints[i]),
                 getTolerance());
        }
    }}finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    //------------------------ Default test cases -----------------------------

    /**
     * Verifies that cumulative probability density calculations match expected values
     * using default test instance data
     */
    @Test
    public void testCumulativeProbabilities() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nywctx1ken();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testCumulativeProbabilities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nywctx1ken(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73103);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73104);verifyCumulativeProbabilities();
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * Verifies that inverse cumulative probability density calculations match expected values
     * using default test instance data
     */
    @Test
    public void testInverseCumulativeProbabilities() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oa0pfb1kep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testInverseCumulativeProbabilities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oa0pfb1kep(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73105);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73106);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * Verifies that density calculations return expected values
     * for default test instance data
     */
    @Test
    public void testDensities() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxdm8r1ker();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testDensities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxdm8r1ker(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73107);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73108);verifyDensities();
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * Verifies that probability computations are consistent
     */
    @Test
    public void testConsistency() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tafanh1ket();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tafanh1ket(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73109);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73110);for (int i=1; (((i < cumulativeTestPoints.length)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73111)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73112)==0&false)); i++) {{

            // check that cdf(x, x) = 0
            // XXX In 4.0, "cumulativeProbability(double,double)" must be replaced with "probability" (MATH-839).
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73113);TestUtils.assertEquals(0d,
               distribution.cumulativeProbability
                 (cumulativeTestPoints[i], cumulativeTestPoints[i]), tolerance);

            // check that P(a < X <= b) = P(X <= b) - P(X <= a)
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73114);double upper = FastMath.max(cumulativeTestPoints[i], cumulativeTestPoints[i -1]);
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73115);double lower = FastMath.min(cumulativeTestPoints[i], cumulativeTestPoints[i -1]);
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73116);double diff = distribution.cumulativeProbability(upper) -
                distribution.cumulativeProbability(lower);
            // XXX In 4.0, "cumulativeProbability(double,double)" must be replaced with "probability" (MATH-839).
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73117);double direct = distribution.cumulativeProbability(lower, upper);
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73118);TestUtils.assertEquals("Inconsistent cumulative probabilities for ("
                    + lower + "," + upper + ")", diff, direct, tolerance);
        }
    }}finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * Verifies that illegal arguments are correctly handled
     */
    @Test
    public void testIllegalArguments() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wabgah1kf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIllegalArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wabgah1kf3(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73119);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73120);try {
            // XXX In 4.0, "cumulativeProbability(double,double)" must be replaced with "probability" (MATH-839).
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73121);distribution.cumulativeProbability(1, 0);
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73122);Assert.fail("Expecting MathIllegalArgumentException for bad cumulativeProbability interval");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73123);try {
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73124);distribution.inverseCumulativeProbability(-1);
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73125);Assert.fail("Expecting MathIllegalArgumentException for p = -1");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73126);try {
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73127);distribution.inverseCumulativeProbability(2);
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73128);Assert.fail("Expecting MathIllegalArgumentException for p = 2");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}
    
    /**
     * Test sampling
     */
    @Test
    public void testSampling() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i4abk1kfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testSampling",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i4abk1kfd(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73129);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73130);final int sampleSize = 1000;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73131);distribution.reseedRandomGenerator(1000); // Use fixed seed
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73132);double[] sample = distribution.sample(sampleSize);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73133);double[] quartiles = TestUtils.getDistributionQuartiles(distribution);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73134);double[] expected = {250, 250, 250, 250};
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73135);long[] counts = new long[4];
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73136);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73137)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73138)==0&false)); i++) {{
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73139);TestUtils.updateCounts(sample[i], counts, quartiles);
        }
        }__CLR4_4_11kdc1kdclb90pcfg.R.inc(73140);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}
    
    /**
     * Verify that density integrals match the distribution.
     * The (filtered, sorted) cumulativeTestPoints array is used to source
     * integration limits. The integral of the density (estimated using a
     * Legendre-Gauss integrator) is compared with the cdf over the same
     * interval. Test points outside of the domain of the density function
     * are discarded.
     */
    @Test
    public void testDensityIntegrals() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gy9wq01kfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testDensityIntegrals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gy9wq01kfp(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73141);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73142);final double tol = 1.0e-9;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73143);final BaseAbstractUnivariateIntegrator integrator =
            new IterativeLegendreGaussIntegrator(5, 1.0e-12, 1.0e-10);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73144);final UnivariateFunction d = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73145);
                __CLR4_4_11kdc1kdclb90pcfg.R.inc(73146);return distribution.density(x);
            }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}
        };
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73147);final ArrayList<Double> integrationTestPoints = new ArrayList<Double>();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73148);for (int i = 0; (((i < cumulativeTestPoints.length)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73149)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73150)==0&false)); i++) {{
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73151);if ((((Double.isNaN(cumulativeTestValues[i]) ||
                    cumulativeTestValues[i] < 1.0e-5 ||
                    cumulativeTestValues[i] > 1 - 1.0e-5)&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73152)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73153)==0&false))) {{
                __CLR4_4_11kdc1kdclb90pcfg.R.inc(73154);continue; // exclude integrals outside domain.
            }
            }__CLR4_4_11kdc1kdclb90pcfg.R.inc(73155);integrationTestPoints.add(cumulativeTestPoints[i]);
        }
        }__CLR4_4_11kdc1kdclb90pcfg.R.inc(73156);Collections.sort(integrationTestPoints);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73157);for (int i = 1; (((i < integrationTestPoints.size())&&(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73158)!=0|true))||(__CLR4_4_11kdc1kdclb90pcfg.R.iget(73159)==0&false)); i++) {{
            __CLR4_4_11kdc1kdclb90pcfg.R.inc(73160);Assert.assertEquals(
                    distribution.cumulativeProbability(  // FIXME @4.0 when rename happens
                            integrationTestPoints.get(0), integrationTestPoints.get(i)),
                            integrator.integrate(
                                    1000000, // Triangle integrals are very slow to converge
                                    d, integrationTestPoints.get(0),
                                    integrationTestPoints.get(i)), tol);
        }
    }}finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}
    
    /**
     * Verify that isSupportLowerBoundInclusvie returns true iff the lower bound
     * is finite and density is non-NaN, non-infinite there.
     */
    @Test
    public void testIsSupportLowerBoundInclusive() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cihtwd1kg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIsSupportLowerBoundInclusive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cihtwd1kg9(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73161);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73162);final double lowerBound = distribution.getSupportLowerBound();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73163);double result = Double.NaN;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73164);result = distribution.density(lowerBound);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73165);Assert.assertEquals(
                !Double.isInfinite(lowerBound) && !Double.isNaN(result) &&
                !Double.isInfinite(result),
                distribution.isSupportLowerBoundInclusive());
         
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}
    
    /**
     * Verify that isSupportUpperBoundInclusvie returns true iff the upper bound
     * is finite and density is non-NaN, non-infinite there.
     */
    @Test
    public void testIsSupportUpperBoundInclusive() {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d38h0k1kge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIsSupportUpperBoundInclusive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d38h0k1kge(){try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73166);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73167);final double upperBound = distribution.getSupportUpperBound();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73168);double result = Double.NaN;
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73169);result = distribution.density(upperBound);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73170);Assert.assertEquals(
                !Double.isInfinite(upperBound) && !Double.isNaN(result) &&
                !Double.isInfinite(result),
                distribution.isSupportUpperBoundInclusive());
         
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    @Test
    public void testDistributionClone()
        throws IOException,
               ClassNotFoundException {__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceStart(getClass().getName(),73171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhk3se1kgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kdc1kdclb90pcfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kdc1kdclb90pcfg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.RealDistributionAbstractTest.testDistributionClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhk3se1kgj() throws IOException, ClassNotFoundException{try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73171);
        // Construct a distribution and initialize its internal random
        // generator, using a fixed seed for deterministic results.
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73172);distribution.reseedRandomGenerator(123);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73173);distribution.sample();

        // Clone the distribution.
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73174);final RealDistribution cloned = deepClone();

        // Make sure they still produce the same samples.
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73175);final double s1 = distribution.sample();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73176);final double s2 = cloned.sample();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73177);Assert.assertEquals(s1, s2, 0d);
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    //------------------ Getters / Setters for test instance data -----------
    /**
     * @return Returns the cumulativeTestPoints.
     */
    protected double[] getCumulativeTestPoints() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73178);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73179);return cumulativeTestPoints;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @param cumulativeTestPoints The cumulativeTestPoints to set.
     */
    protected void setCumulativeTestPoints(double[] cumulativeTestPoints) {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73180);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73181);this.cumulativeTestPoints = cumulativeTestPoints;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @return Returns the cumulativeTestValues.
     */
    protected double[] getCumulativeTestValues() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73182);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73183);return cumulativeTestValues;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @param cumulativeTestValues The cumulativeTestValues to set.
     */
    protected void setCumulativeTestValues(double[] cumulativeTestValues) {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73184);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73185);this.cumulativeTestValues = cumulativeTestValues;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    protected double[] getDensityTestValues() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73186);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73187);return densityTestValues;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    protected void setDensityTestValues(double[] densityTestValues) {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73188);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73189);this.densityTestValues = densityTestValues;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @return Returns the distribution.
     */
    protected RealDistribution getDistribution() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73190);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73191);return distribution;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @param distribution The distribution to set.
     */
    protected void setDistribution(RealDistribution distribution) {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73192);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73193);this.distribution = distribution;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @return Returns the inverseCumulativeTestPoints.
     */
    protected double[] getInverseCumulativeTestPoints() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73194);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73195);return inverseCumulativeTestPoints;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.
     */
    protected void setInverseCumulativeTestPoints(double[] inverseCumulativeTestPoints) {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73196);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73197);this.inverseCumulativeTestPoints = inverseCumulativeTestPoints;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @return Returns the inverseCumulativeTestValues.
     */
    protected double[] getInverseCumulativeTestValues() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73198);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73199);return inverseCumulativeTestValues;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.
     */
    protected void setInverseCumulativeTestValues(double[] inverseCumulativeTestValues) {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73200);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73201);this.inverseCumulativeTestValues = inverseCumulativeTestValues;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @return Returns the tolerance.
     */
    protected double getTolerance() {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73202);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73203);return tolerance;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * @param tolerance The tolerance to set.
     */
    protected void setTolerance(double tolerance) {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73204);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73205);this.tolerance = tolerance;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}

    /**
     * Serialization and deserialization loop of the {@link #distribution}.
     */
    private RealDistribution deepClone()
        throws IOException,
               ClassNotFoundException {try{__CLR4_4_11kdc1kdclb90pcfg.R.inc(73206);
        // Serialize to byte array.
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73207);final ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73208);final ObjectOutputStream oOut = new ObjectOutputStream(bOut);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73209);oOut.writeObject(distribution);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73210);final byte[] data = bOut.toByteArray();

        // Deserialize from byte array.
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73211);final ByteArrayInputStream bIn = new ByteArrayInputStream(data);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73212);final ObjectInputStream oIn = new ObjectInputStream(bIn);
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73213);final Object clone = oIn.readObject();
        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73214);oIn.close();

        __CLR4_4_11kdc1kdclb90pcfg.R.inc(73215);return (RealDistribution) clone;
    }finally{__CLR4_4_11kdc1kdclb90pcfg.R.flushNeeded();}}
}
