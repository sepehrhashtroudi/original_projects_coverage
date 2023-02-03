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
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for UniformRealDistribution. See class javadoc for
 * {@link RealDistributionAbstractTest} for further details.
 */
public class UniformRealDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11klm1klmlb90pcfu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73390,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // --- Override tolerance -------------------------------------------------

    @Override
    public void setUp() {try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73354);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73355);super.setUp();
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73356);setTolerance(1e-4);
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    //--- Implementations for abstract methods --------------------------------

    /** Creates the default uniform real distribution instance to use in tests. */
    @Override
    public UniformRealDistribution makeDistribution() {try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73357);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73358);return new UniformRealDistribution(-0.5, 1.25);
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    /** Creates the default cumulative probability distribution test input values */
    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73359);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73360);return new double[] {-0.5001, -0.5, -0.4999, -0.25, -0.0001, 0.0,
                             0.0001, 0.25, 1.0, 1.2499, 1.25, 1.2501};
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73361);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73362);return new double[] {0.0, 0.0, 0.0001, 0.25/1.75, 0.4999/1.75,
                             0.5/1.75, 0.5001/1.75, 0.75/1.75, 1.5/1.75,
                             1.7499/1.75, 1.0, 1.0};
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73363);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73364);double d = 1 / 1.75;
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73365);return new double[] {0, d, d, d, d, d, d, d, d, d, d, 0};
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    //--- Additional test cases -----------------------------------------------

    /** Test lower bound getter. */
    @Test
    public void testGetLowerBound() {__CLR4_4_11klm1klmlb90pcfu.R.globalSliceStart(getClass().getName(),73366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuvwbc1kly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11klm1klmlb90pcfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11klm1klmlb90pcfu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.UniformRealDistributionTest.testGetLowerBound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuvwbc1kly(){try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73366);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73367);UniformRealDistribution distribution = makeDistribution();
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73368);Assert.assertEquals(-0.5, distribution.getSupportLowerBound(), 0);
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    /** Test upper bound getter. */
    @Test
    public void testGetUpperBound() {__CLR4_4_11klm1klmlb90pcfu.R.globalSliceStart(getClass().getName(),73369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114mv5l1km1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11klm1klmlb90pcfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11klm1klmlb90pcfu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.UniformRealDistributionTest.testGetUpperBound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114mv5l1km1(){try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73369);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73370);UniformRealDistribution distribution = makeDistribution();
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73371);Assert.assertEquals(1.25, distribution.getSupportUpperBound(), 0);
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    /** Test pre-condition for equal lower/upper bound. */
    @Test(expected=NumberIsTooLargeException.class)
    public void testPreconditions1() {__CLR4_4_11klm1klmlb90pcfu.R.globalSliceStart(getClass().getName(),73372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuhld1km4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,49,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11klm1klmlb90pcfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11klm1klmlb90pcfu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.UniformRealDistributionTest.testPreconditions1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuhld1km4(){try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73372);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73373);new UniformRealDistribution(0, 0);
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    /** Test pre-condition for lower bound larger than upper bound. */
    @Test(expected=NumberIsTooLargeException.class)
    public void testPreconditions2() {__CLR4_4_11klm1klmlb90pcfu.R.globalSliceStart(getClass().getName(),73374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14muisw1km6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,50,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11klm1klmlb90pcfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11klm1klmlb90pcfu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.UniformRealDistributionTest.testPreconditions2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14muisw1km6(){try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73374);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73375);new UniformRealDistribution(1, 0);
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}

    /** Test mean/variance. */
    @Test
    public void testMeanVariance() {__CLR4_4_11klm1klmlb90pcfu.R.globalSliceStart(getClass().getName(),73376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azv0pb1km8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11klm1klmlb90pcfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11klm1klmlb90pcfu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.UniformRealDistributionTest.testMeanVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azv0pb1km8(){try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73376);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73377);UniformRealDistribution dist;

        __CLR4_4_11klm1klmlb90pcfu.R.inc(73378);dist = new UniformRealDistribution(0, 1);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73379);Assert.assertEquals(dist.getNumericalMean(), 0.5, 0);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73380);Assert.assertEquals(dist.getNumericalVariance(), 1/12.0, 0);

        __CLR4_4_11klm1klmlb90pcfu.R.inc(73381);dist = new UniformRealDistribution(-1.5, 0.6);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73382);Assert.assertEquals(dist.getNumericalMean(), -0.45, 0);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73383);Assert.assertEquals(dist.getNumericalVariance(), 0.3675, 0);

        __CLR4_4_11klm1klmlb90pcfu.R.inc(73384);dist = new UniformRealDistribution(-0.5, 1.25);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73385);Assert.assertEquals(dist.getNumericalMean(), 0.375, 0);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73386);Assert.assertEquals(dist.getNumericalVariance(), 0.2552083333333333, 0);
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}
    
    /** 
     * Check accuracy of analytical inverse CDF. Fails if a solver is used 
     * with the default accuracy. 
     */
    @Test
    public void testInverseCumulativeDistribution() {__CLR4_4_11klm1klmlb90pcfu.R.globalSliceStart(getClass().getName(),73387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cb2ulg1kmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11klm1klmlb90pcfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11klm1klmlb90pcfu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.UniformRealDistributionTest.testInverseCumulativeDistribution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cb2ulg1kmj(){try{__CLR4_4_11klm1klmlb90pcfu.R.inc(73387);
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73388);UniformRealDistribution dist = new UniformRealDistribution(0, 1e-9);
        
        __CLR4_4_11klm1klmlb90pcfu.R.inc(73389);Assert.assertEquals(2.5e-10, dist.inverseCumulativeProbability(0.25), 0);
    }finally{__CLR4_4_11klm1klmlb90pcfu.R.flushNeeded();}}
}
