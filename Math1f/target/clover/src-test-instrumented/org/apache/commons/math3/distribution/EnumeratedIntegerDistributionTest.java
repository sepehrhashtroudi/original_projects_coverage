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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotANumberException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link EnumeratedIntegerDistribution}.
 *
 * @version $Id$
 */
public class EnumeratedIntegerDistributionTest {static class __CLR4_4_11jdb1jdblb90pcbk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71819,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The distribution object used for testing.
     */
    private final EnumeratedIntegerDistribution testDistribution;

    /**
     * Creates the default distribution object used for testing.
     */
    public EnumeratedIntegerDistributionTest() {try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71759);
        // Non-sorted singleton array with duplicates should be allowed.
        // Values with zero-probability do not extend the support.
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71760);testDistribution = new EnumeratedIntegerDistribution(
                new int[]{3, -1, 3, 7, -2, 8},
                new double[]{0.2, 0.2, 0.3, 0.3, 0.0, 0.0});
    }finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests if the EnumeratedIntegerDistribution constructor throws
     * exceptions for invalid data.
     */
    @Test
    public void testExceptions() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tx2tdv1jdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testExceptions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tx2tdv1jdd(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71761);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71762);EnumeratedIntegerDistribution invalid = null;
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71763);try {
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71764);new EnumeratedIntegerDistribution(new int[]{1, 2}, new double[]{0.0});
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71765);Assert.fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
        }
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71766);try {
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71767);new EnumeratedIntegerDistribution(new int[]{1, 2}, new double[]{0.0, -1.0});
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71768);Assert.fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
        }
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71769);try {
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71770);new EnumeratedIntegerDistribution(new int[]{1, 2}, new double[]{0.0, 0.0});
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71771);Assert.fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
        }
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71772);try {
          __CLR4_4_11jdb1jdblb90pcbk.R.inc(71773);new EnumeratedIntegerDistribution(new int[]{1, 2}, new double[]{0.0, Double.NaN});
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71774);Assert.fail("Expected NotANumberException");
        } catch (NotANumberException e) {
        }
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71775);try {
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71776);new EnumeratedIntegerDistribution(new int[]{1, 2}, new double[]{0.0, Double.POSITIVE_INFINITY});
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71777);Assert.fail("Expected NotFiniteNumberException");
        } catch (NotFiniteNumberException e) {
        }
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71778);Assert.assertNull("Expected non-initialized DiscreteRealDistribution", invalid);
    }finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper probability values.
     */
    @Test
    public void testProbability() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knbfoq1jdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testProbability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knbfoq1jdv(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71779);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71780);int[] points = new int[]{-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71781);double[] results = new double[]{0, 0.2, 0, 0, 0, 0.5, 0, 0, 0, 0.3, 0};
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71782);for (int p = 0; (((p < points.length)&&(__CLR4_4_11jdb1jdblb90pcbk.R.iget(71783)!=0|true))||(__CLR4_4_11jdb1jdblb90pcbk.R.iget(71784)==0&false)); p++) {{
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71785);double probability = testDistribution.probability(points[p]);
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71786);Assert.assertEquals(results[p], probability, 0.0);
        }
    }}finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper cumulative probability values.
     */
    @Test
    public void testCumulativeProbability() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmm6eh1je3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testCumulativeProbability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmm6eh1je3(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71787);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71788);int[] points = new int[]{-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71789);double[] results = new double[]{0, 0.2, 0.2, 0.2, 0.2, 0.7, 0.7, 0.7, 0.7, 1.0, 1.0};
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71790);for (int p = 0; (((p < points.length)&&(__CLR4_4_11jdb1jdblb90pcbk.R.iget(71791)!=0|true))||(__CLR4_4_11jdb1jdblb90pcbk.R.iget(71792)==0&false)); p++) {{
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71793);double probability = testDistribution.cumulativeProbability(points[p]);
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71794);Assert.assertEquals(results[p], probability, 1e-10);
        }
    }}finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper mean value.
     */
    @Test
    public void testGetNumericalMean() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9du681jeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testGetNumericalMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9du681jeb(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71795);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71796);Assert.assertEquals(3.4, testDistribution.getNumericalMean(), 1e-10);
    }finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper variance.
     */
    @Test
    public void testGetNumericalVariance() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdd6b01jed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testGetNumericalVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdd6b01jed(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71797);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71798);Assert.assertEquals(7.84, testDistribution.getNumericalVariance(), 1e-10);
    }finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper lower bound.
     */
    @Test
    public void testGetSupportLowerBound() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mh7khb1jef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testGetSupportLowerBound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mh7khb1jef(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71799);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71800);Assert.assertEquals(-1, testDistribution.getSupportLowerBound());
    }finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests if the distribution returns proper upper bound.
     */
    @Test
    public void testGetSupportUpperBound() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtngc21jeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testGetSupportUpperBound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtngc21jeh(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71801);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71802);Assert.assertEquals(7, testDistribution.getSupportUpperBound());
    }finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests if the distribution returns properly that the support is connected.
     */
    @Test
    public void testIsSupportConnected() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yoqol91jej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testIsSupportConnected",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yoqol91jej(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71803);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71804);Assert.assertTrue(testDistribution.isSupportConnected());
    }finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}

    /**
     * Tests sampling.
     */
    @Test
    public void testSample() {__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceStart(getClass().getName(),71805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzmboj1jel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jdb1jdblb90pcbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jdb1jdblb90pcbk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest.testSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzmboj1jel(){try{__CLR4_4_11jdb1jdblb90pcbk.R.inc(71805);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71806);final int n = 1000000;
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71807);testDistribution.reseedRandomGenerator(-334759360); // fixed seed
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71808);final int[] samples = testDistribution.sample(n);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71809);Assert.assertEquals(n, samples.length);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71810);double sum = 0;
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71811);double sumOfSquares = 0;
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71812);for (int i = 0; (((i < samples.length)&&(__CLR4_4_11jdb1jdblb90pcbk.R.iget(71813)!=0|true))||(__CLR4_4_11jdb1jdblb90pcbk.R.iget(71814)==0&false)); i++) {{
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71815);sum += samples[i];
            __CLR4_4_11jdb1jdblb90pcbk.R.inc(71816);sumOfSquares += samples[i] * samples[i];
        }
        }__CLR4_4_11jdb1jdblb90pcbk.R.inc(71817);Assert.assertEquals(testDistribution.getNumericalMean(),
                sum / n, 1e-2);
        __CLR4_4_11jdb1jdblb90pcbk.R.inc(71818);Assert.assertEquals(testDistribution.getNumericalVariance(),
                sumOfSquares / n - FastMath.pow(sum / n, 2), 1e-2);
    }finally{__CLR4_4_11jdb1jdblb90pcbk.R.flushNeeded();}}
}
