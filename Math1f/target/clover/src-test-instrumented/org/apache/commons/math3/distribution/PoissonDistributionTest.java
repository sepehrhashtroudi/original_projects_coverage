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

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Assert;
import org.junit.Test;

/**
 * <code>PoissonDistributionTest</code>
 *
 * @version $Id$
 */
public class PoissonDistributionTest extends IntegerDistributionAbstractTest {static class __CLR4_4_11kao1kaolb90pcf8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73056,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Poisson parameter value for the test distribution.
     */
    private static final double DEFAULT_TEST_POISSON_PARAMETER = 4.0;

    /**
     * Constructor.
     */
    public PoissonDistributionTest() {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72960);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72961);setTolerance(1e-12);
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Creates the default discrete distribution instance to use in tests.
     */
    @Override
    public IntegerDistribution makeDistribution() {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72962);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72963);return new PoissonDistribution(DEFAULT_TEST_POISSON_PARAMETER);
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Creates the default probability density test input values.
     */
    @Override
    public int[] makeDensityTestPoints() {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72964);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72965);return new int[] { -1, 0, 1, 2, 3, 4, 5, 10, 20};
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Creates the default probability density test expected values.
     * These and all other test values are generated by R, version 1.8.1
     */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72966);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72967);return new double[] { 0d, 0.0183156388887d,  0.073262555555d,
                0.14652511111d, 0.195366814813d, 0.195366814813,
                0.156293451851d, 0.00529247667642d, 8.27746364655e-09};
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Creates the default cumulative probability density test input values.
     */
    @Override
    public int[] makeCumulativeTestPoints() {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72968);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72969);return new int[] { -1, 0, 1, 2, 3, 4, 5, 10, 20 };
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Creates the default cumulative probability density test expected values.
     */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72970);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72971);return new double[] { 0d,  0.0183156388887d, 0.0915781944437d,
                0.238103305554d, 0.433470120367d, 0.62883693518,
                0.78513038703d,  0.99716023388d, 0.999999998077 };
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability test input values.
     */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72972);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72973);IntegerDistribution dist = getDistribution();
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72974);return new double[] { 0d, 0.018315638886d, 0.018315638890d,
                0.091578194441d, 0.091578194445d, 0.238103305552d,
                0.238103305556d, dist.cumulativeProbability(3),
                dist.cumulativeProbability(4), dist.cumulativeProbability(5),
                dist.cumulativeProbability(10), dist.cumulativeProbability(20)};
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Creates the default inverse cumulative probability density test expected values.
     */
    @Override
    public int[] makeInverseCumulativeTestValues() {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72975);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72976);return new int[] { 0, 0, 1, 1, 2, 2, 3, 3, 4, 5, 10, 20};
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Test the normal approximation of the Poisson distribution by
     * calculating P(90 &le; X &le; 110) for X = Po(100) and
     * P(9900 &le; X &le; 10200) for X  = Po(10000)
     */
    @Test
    public void testNormalApproximateProbability() {__CLR4_4_11kao1kaolb90pcf8.R.globalSliceStart(getClass().getName(),72977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xhq0v1kb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kao1kaolb90pcf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kao1kaolb90pcf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PoissonDistributionTest.testNormalApproximateProbability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xhq0v1kb5(){try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72977);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72978);PoissonDistribution dist = new PoissonDistribution(100);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72979);double result = dist.normalApproximateProbability(110)
                - dist.normalApproximateProbability(89);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72980);Assert.assertEquals(0.706281887248, result, 1E-10);

        __CLR4_4_11kao1kaolb90pcf8.R.inc(72981);dist = new PoissonDistribution(10000);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72982);result = dist.normalApproximateProbability(10200)
        - dist.normalApproximateProbability(9899);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72983);Assert.assertEquals(0.820070051552, result, 1E-10);
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * Test the degenerate cases of a 0.0 and 1.0 inverse cumulative probability.
     */
    @Test
    public void testDegenerateInverseCumulativeProbability() {__CLR4_4_11kao1kaolb90pcf8.R.globalSliceStart(getClass().getName(),72984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19szv411kbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kao1kaolb90pcf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kao1kaolb90pcf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PoissonDistributionTest.testDegenerateInverseCumulativeProbability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19szv411kbc(){try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72984);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72985);PoissonDistribution dist = new PoissonDistribution(DEFAULT_TEST_POISSON_PARAMETER);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72986);Assert.assertEquals(Integer.MAX_VALUE, dist.inverseCumulativeProbability(1.0d));
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72987);Assert.assertEquals(0, dist.inverseCumulativeProbability(0d));
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testNegativeMean() {__CLR4_4_11kao1kaolb90pcf8.R.globalSliceStart(getClass().getName(),72988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qa03kj1kbg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,103,97,116,105,118,101,77,101,97,110,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kao1kaolb90pcf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kao1kaolb90pcf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PoissonDistributionTest.testNegativeMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qa03kj1kbg(){try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72988);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72989);new PoissonDistribution(-1);
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    @Test
    public void testMean() {__CLR4_4_11kao1kaolb90pcf8.R.globalSliceStart(getClass().getName(),72990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g14ffm1kbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kao1kaolb90pcf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kao1kaolb90pcf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PoissonDistributionTest.testMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g14ffm1kbi(){try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72990);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72991);PoissonDistribution dist = new PoissonDistribution(10.0);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72992);Assert.assertEquals(10.0, dist.getMean(), 0.0);
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    @Test
    public void testLargeMeanCumulativeProbability() {__CLR4_4_11kao1kaolb90pcf8.R.globalSliceStart(getClass().getName(),72993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15k9dad1kbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kao1kaolb90pcf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kao1kaolb90pcf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PoissonDistributionTest.testLargeMeanCumulativeProbability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15k9dad1kbl(){try{__CLR4_4_11kao1kaolb90pcf8.R.inc(72993);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72994);double mean = 1.0;
        __CLR4_4_11kao1kaolb90pcf8.R.inc(72995);while ((((mean <= 10000000.0)&&(__CLR4_4_11kao1kaolb90pcf8.R.iget(72996)!=0|true))||(__CLR4_4_11kao1kaolb90pcf8.R.iget(72997)==0&false))) {{
            __CLR4_4_11kao1kaolb90pcf8.R.inc(72998);PoissonDistribution dist = new PoissonDistribution(mean);

            __CLR4_4_11kao1kaolb90pcf8.R.inc(72999);double x = mean * 2.0;
            __CLR4_4_11kao1kaolb90pcf8.R.inc(73000);double dx = x / 10.0;
            __CLR4_4_11kao1kaolb90pcf8.R.inc(73001);double p = Double.NaN;
            __CLR4_4_11kao1kaolb90pcf8.R.inc(73002);double sigma = FastMath.sqrt(mean);
            __CLR4_4_11kao1kaolb90pcf8.R.inc(73003);while ((((x >= 0)&&(__CLR4_4_11kao1kaolb90pcf8.R.iget(73004)!=0|true))||(__CLR4_4_11kao1kaolb90pcf8.R.iget(73005)==0&false))) {{
                __CLR4_4_11kao1kaolb90pcf8.R.inc(73006);try {
                    __CLR4_4_11kao1kaolb90pcf8.R.inc(73007);p = dist.cumulativeProbability((int) x);
                    __CLR4_4_11kao1kaolb90pcf8.R.inc(73008);Assert.assertFalse("NaN cumulative probability returned for mean = " +
                            mean + " x = " + x,Double.isNaN(p));
                    __CLR4_4_11kao1kaolb90pcf8.R.inc(73009);if ((((x > mean - 2 * sigma)&&(__CLR4_4_11kao1kaolb90pcf8.R.iget(73010)!=0|true))||(__CLR4_4_11kao1kaolb90pcf8.R.iget(73011)==0&false))) {{
                        __CLR4_4_11kao1kaolb90pcf8.R.inc(73012);Assert.assertTrue("Zero cum probaility returned for mean = " +
                                mean + " x = " + x, p > 0);
                    }
                }} catch (Exception ex) {
                    __CLR4_4_11kao1kaolb90pcf8.R.inc(73013);Assert.fail("mean of " + mean + " and x of " + x + " caused " + ex.getMessage());
                }
                __CLR4_4_11kao1kaolb90pcf8.R.inc(73014);x -= dx;
            }

            }__CLR4_4_11kao1kaolb90pcf8.R.inc(73015);mean *= 10.0;
        }
    }}finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    /**
     * JIRA: MATH-282
     */
    @Test
    public void testCumulativeProbabilitySpecial() {__CLR4_4_11kao1kaolb90pcf8.R.globalSliceStart(getClass().getName(),73016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f801dc1kc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kao1kaolb90pcf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kao1kaolb90pcf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PoissonDistributionTest.testCumulativeProbabilitySpecial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f801dc1kc8(){try{__CLR4_4_11kao1kaolb90pcf8.R.inc(73016);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73017);PoissonDistribution dist;
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73018);dist = new PoissonDistribution(9120);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73019);checkProbability(dist, 9075);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73020);checkProbability(dist, 9102);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73021);dist = new PoissonDistribution(5058);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73022);checkProbability(dist, 5044);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73023);dist = new PoissonDistribution(6986);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73024);checkProbability(dist, 6950);
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    private void checkProbability(PoissonDistribution dist, int x) {try{__CLR4_4_11kao1kaolb90pcf8.R.inc(73025);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73026);double p = dist.cumulativeProbability(x);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73027);Assert.assertFalse("NaN cumulative probability returned for mean = " +
                dist.getMean() + " x = " + x, Double.isNaN(p));
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73028);Assert.assertTrue("Zero cum probability returned for mean = " +
                dist.getMean() + " x = " + x, p > 0);
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    @Test
    public void testLargeMeanInverseCumulativeProbability() {__CLR4_4_11kao1kaolb90pcf8.R.globalSliceStart(getClass().getName(),73029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0bgxz1kcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kao1kaolb90pcf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kao1kaolb90pcf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PoissonDistributionTest.testLargeMeanInverseCumulativeProbability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0bgxz1kcl(){try{__CLR4_4_11kao1kaolb90pcf8.R.inc(73029);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73030);double mean = 1.0;
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73031);while ((((mean <= 100000.0)&&(__CLR4_4_11kao1kaolb90pcf8.R.iget(73032)!=0|true))||(__CLR4_4_11kao1kaolb90pcf8.R.iget(73033)==0&false))) {{ // Extended test value: 1E7.  Reduced to limit run time.
            __CLR4_4_11kao1kaolb90pcf8.R.inc(73034);PoissonDistribution dist = new PoissonDistribution(mean);
            __CLR4_4_11kao1kaolb90pcf8.R.inc(73035);double p = 0.1;
            __CLR4_4_11kao1kaolb90pcf8.R.inc(73036);double dp = p;
            __CLR4_4_11kao1kaolb90pcf8.R.inc(73037);while ((((p < .99)&&(__CLR4_4_11kao1kaolb90pcf8.R.iget(73038)!=0|true))||(__CLR4_4_11kao1kaolb90pcf8.R.iget(73039)==0&false))) {{
                __CLR4_4_11kao1kaolb90pcf8.R.inc(73040);try {
                    __CLR4_4_11kao1kaolb90pcf8.R.inc(73041);int ret = dist.inverseCumulativeProbability(p);
                    // Verify that returned value satisties definition
                    __CLR4_4_11kao1kaolb90pcf8.R.inc(73042);Assert.assertTrue(p <= dist.cumulativeProbability(ret));
                    __CLR4_4_11kao1kaolb90pcf8.R.inc(73043);Assert.assertTrue(p > dist.cumulativeProbability(ret - 1));
                } catch (Exception ex) {
                    __CLR4_4_11kao1kaolb90pcf8.R.inc(73044);Assert.fail("mean of " + mean + " and p of " + p + " caused " + ex.getMessage());
                }
                __CLR4_4_11kao1kaolb90pcf8.R.inc(73045);p += dp;
            }
            }__CLR4_4_11kao1kaolb90pcf8.R.inc(73046);mean *= 10.0;
        }
    }}finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11kao1kaolb90pcf8.R.globalSliceStart(getClass().getName(),73047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81kd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kao1kaolb90pcf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kao1kaolb90pcf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.PoissonDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81kd3(){try{__CLR4_4_11kao1kaolb90pcf8.R.inc(73047);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73048);final double tol = 1e-9;
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73049);PoissonDistribution dist;

        __CLR4_4_11kao1kaolb90pcf8.R.inc(73050);dist = new PoissonDistribution(1);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73051);Assert.assertEquals(dist.getNumericalMean(), 1, tol);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73052);Assert.assertEquals(dist.getNumericalVariance(), 1, tol);

        __CLR4_4_11kao1kaolb90pcf8.R.inc(73053);dist = new PoissonDistribution(11.23);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73054);Assert.assertEquals(dist.getNumericalMean(), 11.23, tol);
        __CLR4_4_11kao1kaolb90pcf8.R.inc(73055);Assert.assertEquals(dist.getNumericalVariance(), 11.23, tol);
    }finally{__CLR4_4_11kao1kaolb90pcf8.R.flushNeeded();}}
}
