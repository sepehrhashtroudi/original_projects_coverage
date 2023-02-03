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
 * Test cases for UniformIntegerDistribution. See class javadoc for
 * {@link IntegerDistributionAbstractTest} for further details.
 */
public class UniformIntegerDistributionTest extends IntegerDistributionAbstractTest {static class __CLR4_4_11kkw1kkwlb90pcfr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // --- Override tolerance -------------------------------------------------

    @Override
    public void setUp() {try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73328);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73329);super.setUp();
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73330);setTolerance(1e-9);
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}

    //--- Implementations for abstract methods --------------------------------

    /** Creates the default discrete distribution instance to use in tests. */
    @Override
    public IntegerDistribution makeDistribution() {try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73331);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73332);return new UniformIntegerDistribution(-3, 5);
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}

    /** Creates the default probability density test input values. */
    @Override
    public int[] makeDensityTestPoints() {try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73333);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73334);return new int[] {-4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}

    /** Creates the default probability density test expected values. */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73335);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73336);double d = 1.0 / (5 - -3 + 1);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73337);return new double[] {0, d, d, d, d, d, d, d, d, d, 0};
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}

    /** Creates the default cumulative probability density test input values. */
    @Override
    public int[] makeCumulativeTestPoints() {try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73338);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73339);return makeDensityTestPoints();
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values. */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73340);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73341);return new double[] {0, 1 / 9.0, 2 / 9.0, 3 / 9.0, 4 / 9.0, 5 / 9.0,
                             6 / 9.0, 7 / 9.0, 8 / 9.0, 1, 1};
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability test input values */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73342);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73343);return new double[] {0, 0.001, 0.010, 0.025, 0.050, 0.100, 0.200,
                             0.5, 0.999, 0.990, 0.975, 0.950, 0.900, 1};
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability density test expected values */
    @Override
    public int[] makeInverseCumulativeTestValues() {try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73344);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73345);return new int[] {-3, -3, -3, -3, -3, -3, -2, 1, 5, 5, 5, 5, 5, 5};
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}

    //--- Additional test cases -----------------------------------------------

    /** Test mean/variance. */
    @Test
    public void testMoments() {__CLR4_4_11kkw1kkwlb90pcfr.R.globalSliceStart(getClass().getName(),73346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81kle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkw1kkwlb90pcfr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkw1kkwlb90pcfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.UniformIntegerDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81kle(){try{__CLR4_4_11kkw1kkwlb90pcfr.R.inc(73346);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73347);UniformIntegerDistribution dist;

        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73348);dist = new UniformIntegerDistribution(0, 5);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73349);Assert.assertEquals(dist.getNumericalMean(), 2.5, 0);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73350);Assert.assertEquals(dist.getNumericalVariance(), 35 / 12.0, 0);

        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73351);dist = new UniformIntegerDistribution(0, 1);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73352);Assert.assertEquals(dist.getNumericalMean(), 0.5, 0);
        __CLR4_4_11kkw1kkwlb90pcfr.R.inc(73353);Assert.assertEquals(dist.getNumericalVariance(), 3 / 12.0, 0);
    }finally{__CLR4_4_11kkw1kkwlb90pcfr.R.flushNeeded();}}
}
