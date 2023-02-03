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

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Abstract base class for {@link IntegerDistribution} tests.
 * <p>
 * To create a concrete test class for an integer distribution implementation,
 *  implement makeDistribution() to return a distribution instance to use in
 *  tests and each of the test data generation methods below.  In each case, the
 *  test points and test values arrays returned represent parallel arrays of
 *  inputs and expected values for the distribution returned by makeDistribution().
 *  <p>
 *  makeDensityTestPoints() -- arguments used to test probability density calculation
 *  makeDensityTestValues() -- expected probability densities
 *  makeCumulativeTestPoints() -- arguments used to test cumulative probabilities
 *  makeCumulativeTestValues() -- expected cumulative probabilites
 *  makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf evaluation
 *  makeInverseCumulativeTestValues() -- expected inverse cdf values
 * <p>
 *  To implement additional test cases with different distribution instances and test data,
 *  use the setXxx methods for the instance data in test cases and call the verifyXxx methods
 *  to verify results.
 *
 * @version $Id$
 */
public abstract class IntegerDistributionAbstractTest {static class __CLR4_4_11jtm1jtmlb90pce1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72461,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

//-------------------- Private test instance data -------------------------
    /** Discrete distribution instance used to perform tests */
    private IntegerDistribution distribution;

    /** Tolerance used in comparing expected and returned values */
    private double tolerance = 1E-4;

    /** Arguments used to test probability density calculations */
    private int[] densityTestPoints;

    /** Values used to test probability density calculations */
    private double[] densityTestValues;

    /** Arguments used to test cumulative probability density calculations */
    private int[] cumulativeTestPoints;

    /** Values used to test cumulative probability density calculations */
    private double[] cumulativeTestValues;

    /** Arguments used to test inverse cumulative probability density calculations */
    private double[] inverseCumulativeTestPoints;

    /** Values used to test inverse cumulative probability density calculations */
    private int[] inverseCumulativeTestValues;

    //-------------------- Abstract methods -----------------------------------

    /** Creates the default discrete distribution instance to use in tests. */
    public abstract IntegerDistribution makeDistribution();

    /** Creates the default probability density test input values */
    public abstract int[] makeDensityTestPoints();

    /** Creates the default probability density test expected values */
    public abstract double[] makeDensityTestValues();

    /** Creates the default cumulative probability density test input values */
    public abstract int[] makeCumulativeTestPoints();

    /** Creates the default cumulative probability density test expected values */
    public abstract double[] makeCumulativeTestValues();

    /** Creates the default inverse cumulative probability test input values */
    public abstract double[] makeInverseCumulativeTestPoints();

    /** Creates the default inverse cumulative probability density test expected values */
    public abstract int[] makeInverseCumulativeTestValues();

    //-------------------- Setup / tear down ----------------------------------

    /**
     * Setup sets all test instance data to default values
     */
    @Before
    public void setUp() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72346);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72347);distribution = makeDistribution();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72348);densityTestPoints = makeDensityTestPoints();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72349);densityTestValues = makeDensityTestValues();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72350);cumulativeTestPoints = makeCumulativeTestPoints();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72351);cumulativeTestValues = makeCumulativeTestValues();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72352);inverseCumulativeTestPoints = makeInverseCumulativeTestPoints();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72353);inverseCumulativeTestValues = makeInverseCumulativeTestValues();
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * Cleans up test instance data
     */
    @After
    public void tearDown() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72354);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72355);distribution = null;
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72356);densityTestPoints = null;
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72357);densityTestValues = null;
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72358);cumulativeTestPoints = null;
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72359);cumulativeTestValues = null;
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72360);inverseCumulativeTestPoints = null;
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72361);inverseCumulativeTestValues = null;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    //-------------------- Verification methods -------------------------------

    /**
     * Verifies that probability density calculations match expected values
     * using current test instance data
     */
    protected void verifyDensities() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72362);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72363);for (int i = 0; (((i < densityTestPoints.length)&&(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72364)!=0|true))||(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72365)==0&false)); i++) {{
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72366);Assert.assertEquals("Incorrect density value returned for " + densityTestPoints[i],
                    densityTestValues[i],
                    distribution.probability(densityTestPoints[i]), tolerance);
        }
    }}finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * Verifies that cumulative probability density calculations match expected values
     * using current test instance data
     */
    protected void verifyCumulativeProbabilities() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72367);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72368);for (int i = 0; (((i < cumulativeTestPoints.length)&&(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72369)!=0|true))||(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72370)==0&false)); i++) {{
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72371);Assert.assertEquals("Incorrect cumulative probability value returned for " + cumulativeTestPoints[i],
                    cumulativeTestValues[i],
                    distribution.cumulativeProbability(cumulativeTestPoints[i]), tolerance);
        }
    }}finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}


    /**
     * Verifies that inverse cumulative probability density calculations match expected values
     * using current test instance data
     */
    protected void verifyInverseCumulativeProbabilities() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72372);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72373);for (int i = 0; (((i < inverseCumulativeTestPoints.length)&&(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72374)!=0|true))||(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72375)==0&false)); i++) {{
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72376);Assert.assertEquals("Incorrect inverse cumulative probability value returned for "
                    + inverseCumulativeTestPoints[i], inverseCumulativeTestValues[i],
                    distribution.inverseCumulativeProbability(inverseCumulativeTestPoints[i]));
        }
    }}finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    //------------------------ Default test cases -----------------------------

    /**
     * Verifies that probability density calculations match expected values
     * using default test instance data
     */
    @Test
    public void testDensities() {__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceStart(getClass().getName(),72377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxdm8r1juh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jtm1jtmlb90pce1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testDensities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxdm8r1juh(){try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72377);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72378);verifyDensities();
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * Verifies that cumulative probability density calculations match expected values
     * using default test instance data
     */
    @Test
    public void testCumulativeProbabilities() {__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceStart(getClass().getName(),72379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nywctx1juj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jtm1jtmlb90pce1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testCumulativeProbabilities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nywctx1juj(){try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72379);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72380);verifyCumulativeProbabilities();
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * Verifies that inverse cumulative probability density calculations match expected values
     * using default test instance data
     */
    @Test
    public void testInverseCumulativeProbabilities() {__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceStart(getClass().getName(),72381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oa0pfb1jul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jtm1jtmlb90pce1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testInverseCumulativeProbabilities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oa0pfb1jul(){try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72381);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72382);verifyInverseCumulativeProbabilities();
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    @Test
    public void testConsistencyAtSupportBounds() {__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceStart(getClass().getName(),72383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jnbgy1jun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jtm1jtmlb90pce1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testConsistencyAtSupportBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jnbgy1jun(){try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72383);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72384);final int lower = distribution.getSupportLowerBound();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72385);Assert.assertEquals("Cumulative probability mmust be 0 below support lower bound.",
                0.0, distribution.cumulativeProbability(lower - 1), 0.0);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72386);Assert.assertEquals("Cumulative probability of support lower bound must be equal to probability mass at this point.",
                distribution.probability(lower), distribution.cumulativeProbability(lower), tolerance);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72387);Assert.assertEquals("Inverse cumulative probability of 0 must be equal to support lower bound.",
                lower, distribution.inverseCumulativeProbability(0.0));

        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72388);final int upper = distribution.getSupportUpperBound();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72389);if ((((upper != Integer.MAX_VALUE)&&(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72390)!=0|true))||(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72391)==0&false)))
            {__CLR4_4_11jtm1jtmlb90pce1.R.inc(72392);Assert.assertEquals("Cumulative probability of support upper bound must be equal to 1.",
                    1.0, distribution.cumulativeProbability(upper), 0.0);
        }__CLR4_4_11jtm1jtmlb90pce1.R.inc(72393);Assert.assertEquals("Inverse cumulative probability of 1 must be equal to support upper bound.",
                upper, distribution.inverseCumulativeProbability(1.0));
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * Verifies that illegal arguments are correctly handled
     */
    @Test
    public void testIllegalArguments() {__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceStart(getClass().getName(),72394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wabgah1juy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jtm1jtmlb90pce1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testIllegalArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wabgah1juy(){try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72394);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72395);try {
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72396);distribution.cumulativeProbability(1, 0);
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72397);Assert.fail("Expecting MathIllegalArgumentException for bad cumulativeProbability interval");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72398);try {
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72399);distribution.inverseCumulativeProbability(-1);
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72400);Assert.fail("Expecting MathIllegalArgumentException for p = -1");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72401);try {
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72402);distribution.inverseCumulativeProbability(2);
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72403);Assert.fail("Expecting MathIllegalArgumentException for p = 2");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * Test sampling
     */
    @Test
    public void testSampling() {__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceStart(getClass().getName(),72404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i4abk1jv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jtm1jtmlb90pce1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jtm1jtmlb90pce1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testSampling",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i4abk1jv8(){try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72404);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72405);int[] densityPoints = makeDensityTestPoints();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72406);double[] densityValues = makeDensityTestValues();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72407);int sampleSize = 1000;
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72408);int length = TestUtils.eliminateZeroMassPoints(densityPoints, densityValues);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72409);AbstractIntegerDistribution distribution = (AbstractIntegerDistribution) makeDistribution();
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72410);double[] expectedCounts = new double[length];
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72411);long[] observedCounts = new long[length];
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72412);for (int i = 0; (((i < length)&&(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72413)!=0|true))||(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72414)==0&false)); i++) {{
            __CLR4_4_11jtm1jtmlb90pce1.R.inc(72415);expectedCounts[i] = sampleSize * densityValues[i];
        }
        }__CLR4_4_11jtm1jtmlb90pce1.R.inc(72416);distribution.reseedRandomGenerator(1000); // Use fixed seed
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72417);int[] sample = distribution.sample(sampleSize);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72418);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72419)!=0|true))||(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72420)==0&false)); i++) {{
          __CLR4_4_11jtm1jtmlb90pce1.R.inc(72421);for (int j = 0; (((j < length)&&(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72422)!=0|true))||(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72423)==0&false)); j++) {{
              __CLR4_4_11jtm1jtmlb90pce1.R.inc(72424);if ((((sample[i] == densityPoints[j])&&(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72425)!=0|true))||(__CLR4_4_11jtm1jtmlb90pce1.R.iget(72426)==0&false))) {{
                  __CLR4_4_11jtm1jtmlb90pce1.R.inc(72427);observedCounts[j]++;
              }
          }}
        }}
        }__CLR4_4_11jtm1jtmlb90pce1.R.inc(72428);TestUtils.assertChiSquareAccept(densityPoints, expectedCounts, observedCounts, .001);
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    //------------------ Getters / Setters for test instance data -----------
    /**
     * @return Returns the cumulativeTestPoints.
     */
    protected int[] getCumulativeTestPoints() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72429);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72430);return cumulativeTestPoints;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @param cumulativeTestPoints The cumulativeTestPoints to set.
     */
    protected void setCumulativeTestPoints(int[] cumulativeTestPoints) {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72431);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72432);this.cumulativeTestPoints = cumulativeTestPoints;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @return Returns the cumulativeTestValues.
     */
    protected double[] getCumulativeTestValues() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72433);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72434);return cumulativeTestValues;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @param cumulativeTestValues The cumulativeTestValues to set.
     */
    protected void setCumulativeTestValues(double[] cumulativeTestValues) {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72435);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72436);this.cumulativeTestValues = cumulativeTestValues;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @return Returns the densityTestPoints.
     */
    protected int[] getDensityTestPoints() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72437);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72438);return densityTestPoints;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @param densityTestPoints The densityTestPoints to set.
     */
    protected void setDensityTestPoints(int[] densityTestPoints) {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72439);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72440);this.densityTestPoints = densityTestPoints;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @return Returns the densityTestValues.
     */
    protected double[] getDensityTestValues() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72441);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72442);return densityTestValues;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @param densityTestValues The densityTestValues to set.
     */
    protected void setDensityTestValues(double[] densityTestValues) {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72443);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72444);this.densityTestValues = densityTestValues;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @return Returns the distribution.
     */
    protected IntegerDistribution getDistribution() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72445);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72446);return distribution;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @param distribution The distribution to set.
     */
    protected void setDistribution(IntegerDistribution distribution) {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72447);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72448);this.distribution = distribution;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @return Returns the inverseCumulativeTestPoints.
     */
    protected double[] getInverseCumulativeTestPoints() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72449);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72450);return inverseCumulativeTestPoints;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.
     */
    protected void setInverseCumulativeTestPoints(double[] inverseCumulativeTestPoints) {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72451);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72452);this.inverseCumulativeTestPoints = inverseCumulativeTestPoints;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @return Returns the inverseCumulativeTestValues.
     */
    protected int[] getInverseCumulativeTestValues() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72453);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72454);return inverseCumulativeTestValues;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.
     */
    protected void setInverseCumulativeTestValues(int[] inverseCumulativeTestValues) {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72455);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72456);this.inverseCumulativeTestValues = inverseCumulativeTestValues;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @return Returns the tolerance.
     */
    protected double getTolerance() {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72457);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72458);return tolerance;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

    /**
     * @param tolerance The tolerance to set.
     */
    protected void setTolerance(double tolerance) {try{__CLR4_4_11jtm1jtmlb90pce1.R.inc(72459);
        __CLR4_4_11jtm1jtmlb90pce1.R.inc(72460);this.tolerance = tolerance;
    }finally{__CLR4_4_11jtm1jtmlb90pce1.R.flushNeeded();}}

}
