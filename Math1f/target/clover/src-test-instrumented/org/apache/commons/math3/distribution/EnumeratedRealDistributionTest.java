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
import java.util.List;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotANumberException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link EnumeratedRealDistribution}.
 * 
 * @version $Id$
 */
public class EnumeratedRealDistributionTest {static class __CLR4_4_11jez1jezlb90pcbq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71896,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The distribution object used for testing.
     */
    private final EnumeratedRealDistribution testDistribution;

    /**
     * Creates the default distribution object used for testing.
     */
    public EnumeratedRealDistributionTest() {try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71819);
        // Non-sorted singleton array with duplicates should be allowed.
        // Values with zero-probability do not extend the support.
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71820);testDistribution = new EnumeratedRealDistribution(
                new double[]{3.0, -1.0, 3.0, 7.0, -2.0, 8.0},
                new double[]{0.2, 0.2, 0.3, 0.3, 0.0, 0.0});
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the {@link EnumeratedRealDistribution} constructor throws
     * exceptions for invalid data.
     */
    @Test
    public void testExceptions() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tx2tdv1jf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testExceptions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tx2tdv1jf1(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71821);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71822);EnumeratedRealDistribution invalid = null;
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71823);try {
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71824);invalid = new EnumeratedRealDistribution(new double[]{1.0, 2.0}, new double[]{0.0});
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71825);Assert.fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
        }
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71826);try{
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71827);invalid = new EnumeratedRealDistribution(new double[]{1.0, 2.0}, new double[]{0.0, -1.0});
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71828);Assert.fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
        }
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71829);try {
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71830);invalid = new EnumeratedRealDistribution(new double[]{1.0, 2.0}, new double[]{0.0, 0.0});
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71831);Assert.fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
        }
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71832);try {
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71833);invalid = new EnumeratedRealDistribution(new double[]{1.0, 2.0}, new double[]{0.0, Double.NaN});
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71834);Assert.fail("Expected NotANumberException");
        } catch (NotANumberException e) {
        }
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71835);try {
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71836);invalid = new EnumeratedRealDistribution(new double[]{1.0, 2.0}, new double[]{0.0, Double.POSITIVE_INFINITY});
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71837);Assert.fail("Expected NotFiniteNumberException");
        } catch (NotFiniteNumberException e) {
        }
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71838);Assert.assertNull("Expected non-initialized DiscreteRealDistribution", invalid);
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper probability values.
     */
    @Test
    public void testProbability() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knbfoq1jfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testProbability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knbfoq1jfj(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71839);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71840);double[] points = new double[]{-2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71841);double[] results = new double[]{0, 0.2, 0, 0, 0, 0.5, 0, 0, 0, 0.3, 0};
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71842);for (int p = 0; (((p < points.length)&&(__CLR4_4_11jez1jezlb90pcbq.R.iget(71843)!=0|true))||(__CLR4_4_11jez1jezlb90pcbq.R.iget(71844)==0&false)); p++) {{
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71845);double density = testDistribution.probability(points[p]);
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71846);Assert.assertEquals(results[p], density, 0.0);
        }
    }}finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper density values.
     */
    @Test
    public void testDensity() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgzeyr1jfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testDensity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgzeyr1jfr(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71847);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71848);double[] points = new double[]{-2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71849);double[] results = new double[]{0, 0.2, 0, 0, 0, 0.5, 0, 0, 0, 0.3, 0};
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71850);for (int p = 0; (((p < points.length)&&(__CLR4_4_11jez1jezlb90pcbq.R.iget(71851)!=0|true))||(__CLR4_4_11jez1jezlb90pcbq.R.iget(71852)==0&false)); p++) {{
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71853);double density = testDistribution.density(points[p]);
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71854);Assert.assertEquals(results[p], density, 0.0);
        }
    }}finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper cumulative probability values.
     */
    @Test
    public void testCumulativeProbability() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmm6eh1jfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testCumulativeProbability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmm6eh1jfz(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71855);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71856);double[] points = new double[]{-2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71857);double[] results = new double[]{0, 0.2, 0.2, 0.2, 0.2, 0.7, 0.7, 0.7, 0.7, 1.0, 1.0};
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71858);for (int p = 0; (((p < points.length)&&(__CLR4_4_11jez1jezlb90pcbq.R.iget(71859)!=0|true))||(__CLR4_4_11jez1jezlb90pcbq.R.iget(71860)==0&false)); p++) {{
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71861);double probability = testDistribution.cumulativeProbability(points[p]);
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71862);Assert.assertEquals(results[p], probability, 1e-10);
        }
    }}finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper mean value.
     */
    @Test
    public void testGetNumericalMean() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9du681jg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testGetNumericalMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9du681jg7(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71863);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71864);Assert.assertEquals(3.4, testDistribution.getNumericalMean(), 1e-10);
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper variance.
     */
    @Test
    public void testGetNumericalVariance() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdd6b01jg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testGetNumericalVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdd6b01jg9(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71865);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71866);Assert.assertEquals(7.84, testDistribution.getNumericalVariance(), 1e-10);
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper lower bound.
     */
    @Test
    public void testGetSupportLowerBound() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mh7khb1jgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testGetSupportLowerBound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mh7khb1jgb(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71867);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71868);Assert.assertEquals(-1, testDistribution.getSupportLowerBound(), 0);
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper upper bound.
     */
    @Test
    public void testGetSupportUpperBound() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtngc21jgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testGetSupportUpperBound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtngc21jgd(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71869);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71870);Assert.assertEquals(7, testDistribution.getSupportUpperBound(), 0);
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns properly that the support includes the
     * lower bound.
     */
    @Test
    public void testIsSupportLowerBoundInclusive() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cihtwd1jgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testIsSupportLowerBoundInclusive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cihtwd1jgf(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71871);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71872);Assert.assertTrue(testDistribution.isSupportLowerBoundInclusive());
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns properly that the support includes the
     * upper bound.
     */
    @Test
    public void testIsSupportUpperBoundInclusive() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d38h0k1jgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testIsSupportUpperBoundInclusive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d38h0k1jgh(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71873);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71874);Assert.assertTrue(testDistribution.isSupportUpperBoundInclusive());
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests if the distribution returns properly that the support is connected.
     */
    @Test
    public void testIsSupportConnected() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yoqol91jgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testIsSupportConnected",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yoqol91jgj(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71875);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71876);Assert.assertTrue(testDistribution.isSupportConnected());
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    /**
     * Tests sampling.
     */
    @Test
    public void testSample() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzmboj1jgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzmboj1jgl(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71877);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71878);final int n = 1000000;
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71879);testDistribution.reseedRandomGenerator(-334759360); // fixed seed
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71880);final double[] samples = testDistribution.sample(n);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71881);Assert.assertEquals(n, samples.length);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71882);double sum = 0;
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71883);double sumOfSquares = 0;
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71884);for (int i = 0; (((i < samples.length)&&(__CLR4_4_11jez1jezlb90pcbq.R.iget(71885)!=0|true))||(__CLR4_4_11jez1jezlb90pcbq.R.iget(71886)==0&false)); i++) {{
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71887);sum += samples[i];
            __CLR4_4_11jez1jezlb90pcbq.R.inc(71888);sumOfSquares += samples[i] * samples[i];
        }
        }__CLR4_4_11jez1jezlb90pcbq.R.inc(71889);Assert.assertEquals(testDistribution.getNumericalMean(),
                sum / n, 1e-2);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71890);Assert.assertEquals(testDistribution.getNumericalVariance(),
                sumOfSquares / n - FastMath.pow(sum / n, 2), 1e-2);
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

    @Test
    public void testIssue942() {__CLR4_4_11jez1jezlb90pcbq.R.globalSliceStart(getClass().getName(),71891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1483j7t1jgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jez1jezlb90pcbq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jez1jezlb90pcbq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testIssue942",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1483j7t1jgz(){try{__CLR4_4_11jez1jezlb90pcbq.R.inc(71891);
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71892);List<Pair<Object,Double>> list = new ArrayList<Pair<Object, Double>>();
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71893);list.add(new Pair<Object, Double>(new Object() {}, new Double(0)));
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71894);list.add(new Pair<Object, Double>(new Object() {}, new Double(1)));
        __CLR4_4_11jez1jezlb90pcbq.R.inc(71895);Assert.assertEquals(1, new EnumeratedDistribution<Object>(list).sample(1).length);
    }finally{__CLR4_4_11jez1jezlb90pcbq.R.flushNeeded();}}

}
