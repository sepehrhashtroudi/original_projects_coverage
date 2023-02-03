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
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for HyperGeometriclDistribution.
 * Extends IntegerDistributionAbstractTest.  See class javadoc for
 * IntegerDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class HypergeometricDistributionTest extends IntegerDistributionAbstractTest {static class __CLR4_4_11jpw1jpwlb90pcdw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

//-------------- Implementations for abstract methods -----------------------

    /** Creates the default discrete distribution instance to use in tests. */
    @Override
    public IntegerDistribution makeDistribution() {try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72212);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72213);return new HypergeometricDistribution(10, 5, 5);
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    /** Creates the default probability density test input values */
    @Override
    public int[] makeDensityTestPoints() {try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72214);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72215);return new int[] {-1, 0, 1, 2, 3, 4, 5, 10};
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72216);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72217);return new double[] {0d, 0.003968d, 0.099206d, 0.396825d, 0.396825d,
                0.099206d, 0.003968d, 0d};
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    /** Creates the default cumulative probability density test input values */
    @Override
    public int[] makeCumulativeTestPoints() {try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72218);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72219);return makeDensityTestPoints();
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72220);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72221);return new double[] {0d, .003968d, .103175d, .50000d, .896825d, .996032d,
                1.00000d, 1d};
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability test input values */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72222);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72223);return new double[] {0d, 0.001d, 0.010d, 0.025d, 0.050d, 0.100d, 0.999d,
                0.990d, 0.975d, 0.950d, 0.900d, 1d};
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability density test expected values */
    @Override
    public int[] makeInverseCumulativeTestValues() {try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72224);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72225);return new int[] {0, 0, 1, 1, 1, 1, 5, 4, 4, 4, 4, 5};
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    //-------------------- Additional test cases ------------------------------

    /** Verify that if there are no failures, mass is concentrated on sampleSize */
    @Test
    public void testDegenerateNoFailures() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2rqe11jqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateNoFailures",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2rqe11jqa(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72226);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72227);HypergeometricDistribution dist = new HypergeometricDistribution(5,5,3);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72228);setDistribution(dist);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72229);setCumulativeTestPoints(new int[] {-1, 0, 1, 3, 10 });
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72230);setCumulativeTestValues(new double[] {0d, 0d, 0d, 1d, 1d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72231);setDensityTestPoints(new int[] {-1, 0, 1, 3, 10});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72232);setDensityTestValues(new double[] {0d, 0d, 0d, 1d, 0d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72233);setInverseCumulativeTestPoints(new double[] {0.1d, 0.5d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72234);setInverseCumulativeTestValues(new int[] {3, 3});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72235);verifyDensities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72236);verifyCumulativeProbabilities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72237);verifyInverseCumulativeProbabilities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72238);Assert.assertEquals(dist.getSupportLowerBound(), 3);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72239);Assert.assertEquals(dist.getSupportUpperBound(), 3);
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    /** Verify that if there are no successes, mass is concentrated on 0 */
    @Test
    public void testDegenerateNoSuccesses() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y24j731jqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateNoSuccesses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y24j731jqo(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72240);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72241);HypergeometricDistribution dist = new HypergeometricDistribution(5,0,3);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72242);setDistribution(dist);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72243);setCumulativeTestPoints(new int[] {-1, 0, 1, 3, 10 });
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72244);setCumulativeTestValues(new double[] {0d, 1d, 1d, 1d, 1d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72245);setDensityTestPoints(new int[] {-1, 0, 1, 3, 10});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72246);setDensityTestValues(new double[] {0d, 1d, 0d, 0d, 0d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72247);setInverseCumulativeTestPoints(new double[] {0.1d, 0.5d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72248);setInverseCumulativeTestValues(new int[] {0, 0});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72249);verifyDensities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72250);verifyCumulativeProbabilities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72251);verifyInverseCumulativeProbabilities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72252);Assert.assertEquals(dist.getSupportLowerBound(), 0);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72253);Assert.assertEquals(dist.getSupportUpperBound(), 0);
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    /** Verify that if sampleSize = populationSize, mass is concentrated on numberOfSuccesses */
    @Test
    public void testDegenerateFullSample() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wqwneg1jr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateFullSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wqwneg1jr2(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72254);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72255);HypergeometricDistribution dist = new HypergeometricDistribution(5,3,5);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72256);setDistribution(dist);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72257);setCumulativeTestPoints(new int[] {-1, 0, 1, 3, 10 });
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72258);setCumulativeTestValues(new double[] {0d, 0d, 0d, 1d, 1d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72259);setDensityTestPoints(new int[] {-1, 0, 1, 3, 10});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72260);setDensityTestValues(new double[] {0d, 0d, 0d, 1d, 0d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72261);setInverseCumulativeTestPoints(new double[] {0.1d, 0.5d});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72262);setInverseCumulativeTestValues(new int[] {3, 3});
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72263);verifyDensities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72264);verifyCumulativeProbabilities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72265);verifyInverseCumulativeProbabilities();
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72266);Assert.assertEquals(dist.getSupportLowerBound(), 3);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72267);Assert.assertEquals(dist.getSupportUpperBound(), 3);
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    @Test
    public void testPreconditions() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01jrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01jrg(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72268);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72269);try {
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72270);new HypergeometricDistribution(0, 3, 5);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72271);Assert.fail("negative population size. NotStrictlyPositiveException expected");
        } catch(NotStrictlyPositiveException ex) {
            // Expected.
        }
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72272);try {
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72273);new HypergeometricDistribution(5, -1, 5);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72274);Assert.fail("negative number of successes. NotPositiveException expected");
        } catch(NotPositiveException ex) {
            // Expected.
        }
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72275);try {
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72276);new HypergeometricDistribution(5, 3, -1);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72277);Assert.fail("negative sample size. NotPositiveException expected");
        } catch(NotPositiveException ex) {
            // Expected.
        }
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72278);try {
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72279);new HypergeometricDistribution(5, 6, 5);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72280);Assert.fail("numberOfSuccesses > populationSize. NumberIsTooLargeException expected");
        } catch(NumberIsTooLargeException ex) {
            // Expected.
        }
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72281);try {
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72282);new HypergeometricDistribution(5, 3, 6);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72283);Assert.fail("sampleSize > populationSize. NumberIsTooLargeException expected");
        } catch(NumberIsTooLargeException ex) {
            // Expected.
        }
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    @Test
    public void testAccessors() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hde3s11jrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testAccessors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hde3s11jrw(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72284);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72285);HypergeometricDistribution dist = new HypergeometricDistribution(5, 3, 4);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72286);Assert.assertEquals(5, dist.getPopulationSize());
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72287);Assert.assertEquals(3, dist.getNumberOfSuccesses());
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72288);Assert.assertEquals(4, dist.getSampleSize());
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    @Test
    public void testLargeValues() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuzv0u1js1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testLargeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuzv0u1js1(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72289);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72290);int populationSize = 3456;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72291);int sampleSize = 789;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72292);int numberOfSucceses = 101;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72293);double[][] data = {
            {0.0, 2.75646034603961e-12, 2.75646034603961e-12, 1.0},
            {1.0, 8.55705370142386e-11, 8.83269973602783e-11, 0.999999999997244},
            {2.0, 1.31288129219665e-9, 1.40120828955693e-9, 0.999999999911673},
            {3.0, 1.32724172984193e-8, 1.46736255879763e-8, 0.999999998598792},
            {4.0, 9.94501711734089e-8, 1.14123796761385e-7, 0.999999985326375},
            {5.0, 5.89080768883643e-7, 7.03204565645028e-7, 0.999999885876203},
            {20.0, 0.0760051397707708, 0.27349758476299, 0.802507555007781},
            {21.0, 0.087144222047629, 0.360641806810619, 0.72650241523701},
            {22.0, 0.0940378846881819, 0.454679691498801, 0.639358193189381},
            {23.0, 0.0956897500614809, 0.550369441560282, 0.545320308501199},
            {24.0, 0.0919766921922999, 0.642346133752582, 0.449630558439718},
            {25.0, 0.083641637261095, 0.725987771013677, 0.357653866247418},
            {96.0, 5.93849188852098e-57, 1.0, 6.01900244560712e-57},
            {97.0, 7.96593036832547e-59, 1.0, 8.05105570861321e-59},
            {98.0, 8.44582921934367e-61, 1.0, 8.5125340287733e-61},
            {99.0, 6.63604297068222e-63, 1.0, 6.670480942963e-63},
            {100.0, 3.43501099007557e-65, 1.0, 3.4437972280786e-65},
            {101.0, 8.78623800302957e-68, 1.0, 8.78623800302957e-68},
        };

        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72294);testHypergeometricDistributionProbabilities(populationSize, sampleSize, numberOfSucceses, data);
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    private void testHypergeometricDistributionProbabilities(int populationSize, int sampleSize, int numberOfSucceses, double[][] data) {try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72295);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72296);HypergeometricDistribution dist = new HypergeometricDistribution(populationSize, numberOfSucceses, sampleSize);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72297);for (int i = 0; (((i < data.length)&&(__CLR4_4_11jpw1jpwlb90pcdw.R.iget(72298)!=0|true))||(__CLR4_4_11jpw1jpwlb90pcdw.R.iget(72299)==0&false)); ++i) {{
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72300);int x = (int)data[i][0];
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72301);double pmf = data[i][1];
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72302);double actualPmf = dist.probability(x);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72303);TestUtils.assertRelativelyEquals("Expected equals for <"+x+"> pmf",pmf, actualPmf, 1.0e-9);

            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72304);double cdf = data[i][2];
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72305);double actualCdf = dist.cumulativeProbability(x);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72306);TestUtils.assertRelativelyEquals("Expected equals for <"+x+"> cdf",cdf, actualCdf, 1.0e-9);

            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72307);double cdf1 = data[i][3];
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72308);double actualCdf1 = dist.upperCumulativeProbability(x);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72309);TestUtils.assertRelativelyEquals("Expected equals for <"+x+"> cdf1",cdf1, actualCdf1, 1.0e-9);
        }
    }}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    @Test
    public void testMoreLargeValues() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cw48g31jsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMoreLargeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cw48g31jsm(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72310);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72311);int populationSize = 26896;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72312);int sampleSize = 895;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72313);int numberOfSucceses = 55;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72314);double[][] data = {
            {0.0, 0.155168304750504, 0.155168304750504, 1.0},
            {1.0, 0.29437545000746, 0.449543754757964, 0.844831695249496},
            {2.0, 0.273841321577003, 0.723385076334967, 0.550456245242036},
            {3.0, 0.166488572570786, 0.889873648905753, 0.276614923665033},
            {4.0, 0.0743969744713231, 0.964270623377076, 0.110126351094247},
            {5.0, 0.0260542785784855, 0.990324901955562, 0.0357293766229237},
            {20.0, 3.57101101678792e-16, 1.0, 3.78252101622096e-16},
            {21.0, 2.00551638598312e-17, 1.0, 2.11509999433041e-17},
            {22.0, 1.04317070180562e-18, 1.0, 1.09583608347287e-18},
            {23.0, 5.03153504903308e-20, 1.0, 5.266538166725e-20},
            {24.0, 2.2525984149695e-21, 1.0, 2.35003117691919e-21},
            {25.0, 9.3677424515947e-23, 1.0, 9.74327619496943e-23},
            {50.0, 9.83633962945521e-69, 1.0, 9.8677629437617e-69},
            {51.0, 3.13448949497553e-71, 1.0, 3.14233143064882e-71},
            {52.0, 7.82755221928122e-74, 1.0, 7.84193567329055e-74},
            {53.0, 1.43662126065532e-76, 1.0, 1.43834540093295e-76},
            {54.0, 1.72312692517348e-79, 1.0, 1.7241402776278e-79},
            {55.0, 1.01335245432581e-82, 1.0, 1.01335245432581e-82},
        };
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72315);testHypergeometricDistributionProbabilities(populationSize, sampleSize, numberOfSucceses, data);
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81jss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81jss(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72316);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72317);final double tol = 1e-9;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72318);HypergeometricDistribution dist;

        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72319);dist = new HypergeometricDistribution(1500, 40, 100);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72320);Assert.assertEquals(dist.getNumericalMean(), 40d * 100d / 1500d, tol);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72321);Assert.assertEquals(dist.getNumericalVariance(), ( 100d * 40d * (1500d - 100d) * (1500d - 40d) ) / ( (1500d * 1500d * 1499d) ), tol);

        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72322);dist = new HypergeometricDistribution(3000, 55, 200);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72323);Assert.assertEquals(dist.getNumericalMean(), 55d * 200d / 3000d, tol);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72324);Assert.assertEquals(dist.getNumericalVariance(), ( 200d * 55d * (3000d - 200d) * (3000d - 55d) ) / ( (3000d * 3000d * 2999d) ), tol);
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}
    
    @Test
    public void testMath644() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ri57251jt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMath644",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ri57251jt1(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72325);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72326);int N = 14761461;  // population
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72327);int m = 1035;      // successes in population
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72328);int n = 1841;      // number of trials

        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72329);int k = 0;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72330);final HypergeometricDistribution dist = new HypergeometricDistribution(N, m, n);
        
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72331);Assert.assertTrue(Precision.compareTo(1.0, dist.upperCumulativeProbability(k), 1) == 0);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72332);Assert.assertTrue(Precision.compareTo(dist.cumulativeProbability(k), 0.0, 1) > 0);
        
        // another way to calculate the upper cumulative probability
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72333);double upper = 1.0 - dist.cumulativeProbability(k) + dist.probability(k);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72334);Assert.assertTrue(Precision.compareTo(1.0, upper, 1) == 0);
    }finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}

    @Test
    public void testMath1021() {__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceStart(getClass().getName(),72335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5pmzj1jtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jpw1jpwlb90pcdw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMath1021",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5pmzj1jtb(){try{__CLR4_4_11jpw1jpwlb90pcdw.R.inc(72335);
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72336);final int N = 43130568;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72337);final int m = 42976365;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72338);final int n = 50;
        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72339);final HypergeometricDistribution dist = new HypergeometricDistribution(N, m, n);

        __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72340);for (int i = 0; (((i < 100)&&(__CLR4_4_11jpw1jpwlb90pcdw.R.iget(72341)!=0|true))||(__CLR4_4_11jpw1jpwlb90pcdw.R.iget(72342)==0&false)); i++) {{
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72343);final int sample = dist.sample();
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72344);Assert.assertTrue("sample=" + sample, 0 <= sample);
            __CLR4_4_11jpw1jpwlb90pcdw.R.inc(72345);Assert.assertTrue("sample=" + sample, sample <= n);
        }
    }}finally{__CLR4_4_11jpw1jpwlb90pcdw.R.flushNeeded();}}
}
