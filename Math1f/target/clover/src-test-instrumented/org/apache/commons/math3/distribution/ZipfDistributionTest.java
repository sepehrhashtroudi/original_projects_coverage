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

import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link ZipfDistribution}.
 * Extends IntegerDistributionAbstractTest.  See class javadoc for
 * IntegerDistributionAbstractTest for details.
 *
 * @version $Id$
 */
public class ZipfDistributionTest extends IntegerDistributionAbstractTest {static class __CLR4_4_11knk1knklb90pcg0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73448,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions1() {__CLR4_4_11knk1knklb90pcg0.R.globalSliceStart(getClass().getName(),73424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuhld1knk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,49,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11knk1knklb90pcg0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11knk1knklb90pcg0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ZipfDistributionTest.testPreconditions1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuhld1knk(){try{__CLR4_4_11knk1knklb90pcg0.R.inc(73424);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73425);new ZipfDistribution(0, 1);
    }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions2() {__CLR4_4_11knk1knklb90pcg0.R.globalSliceStart(getClass().getName(),73426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14muisw1knm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,50,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11knk1knklb90pcg0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11knk1knklb90pcg0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ZipfDistributionTest.testPreconditions2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14muisw1knm(){try{__CLR4_4_11knk1knklb90pcg0.R.inc(73426);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73427);new ZipfDistribution(1, 0);
    }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    //-------------- Implementations for abstract methods -----------------------

    /** Creates the default discrete distribution instance to use in tests. */
    @Override
    public IntegerDistribution makeDistribution() {try{__CLR4_4_11knk1knklb90pcg0.R.inc(73428);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73429);return new ZipfDistribution(10, 1);
    }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    /** Creates the default probability density test input values */
    @Override
    public int[] makeDensityTestPoints() {try{__CLR4_4_11knk1knklb90pcg0.R.inc(73430);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73431);return new int[] {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    /** Creates the default probability density test expected values */
    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11knk1knklb90pcg0.R.inc(73432);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73433);return new double[] {0d, 0d, 0.3414d, 0.1707d, 0.1138d, 0.0854d, 0.0683d,
                0.0569d, 0.0488d, 0.0427d, 0.0379d, 0.0341d, 0d};
    }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    /** Creates the default cumulative probability density test input values */
    @Override
    public int[] makeCumulativeTestPoints() {try{__CLR4_4_11knk1knklb90pcg0.R.inc(73434);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73435);return makeDensityTestPoints();
    }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    /** Creates the default cumulative probability density test expected values */
    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11knk1knklb90pcg0.R.inc(73436);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73437);return new double[] {0d, 0.0000d, 0.3414d, 0.5121d, 0.6259d, 0.7113d,
                0.7796d, 0.8365d, 0.8852d, 0.9279d, 0.9659d, 1d, 1d};
        }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability test input values */
    @Override
    public double[] makeInverseCumulativeTestPoints() {try{__CLR4_4_11knk1knklb90pcg0.R.inc(73438);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73439);return new double[] {0d, 0.001d, 0.010d, 0.025d, 0.050d, 0.3413d, 0.3415d, 0.999d,
                0.990d, 0.975d, 0.950d, 0.900d, 1d};
        }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    /** Creates the default inverse cumulative probability density test expected values */
    @Override
    public int[] makeInverseCumulativeTestValues() {try{__CLR4_4_11knk1knklb90pcg0.R.inc(73440);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73441);return new int[] {1, 1, 1, 1, 1, 1, 2, 10, 10, 10, 9, 8, 10};
    }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}

    @Test
    public void testMoments() {__CLR4_4_11knk1knklb90pcg0.R.globalSliceStart(getClass().getName(),73442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5bck81ko2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11knk1knklb90pcg0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11knk1knklb90pcg0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.ZipfDistributionTest.testMoments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5bck81ko2(){try{__CLR4_4_11knk1knklb90pcg0.R.inc(73442);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73443);final double tol = 1e-9;
        __CLR4_4_11knk1knklb90pcg0.R.inc(73444);ZipfDistribution dist;

        __CLR4_4_11knk1knklb90pcg0.R.inc(73445);dist = new ZipfDistribution(2, 0.5);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73446);Assert.assertEquals(dist.getNumericalMean(), FastMath.sqrt(2), tol);
        __CLR4_4_11knk1knklb90pcg0.R.inc(73447);Assert.assertEquals(dist.getNumericalVariance(), 0.24264068711928521, tol);
    }finally{__CLR4_4_11knk1knklb90pcg0.R.flushNeeded();}}
}
