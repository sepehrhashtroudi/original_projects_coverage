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
package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.Retry;
import org.apache.commons.math3.RetryRunner;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.random.MersenneTwister;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test for {@link CMAESOptimizer}.
 */
@RunWith(RetryRunner.class)
public class CMAESOptimizerTest {static class __CLR4_4_121ww21wwlb90pdt8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,96181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final int DIM = 13;
    static final int LAMBDA = 4 + (int)(3.*Math.log(DIM));

    @Test(expected = NumberIsTooLargeException.class)
    public void testInitOutofbounds1() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y08bog21ww();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,79,117,116,111,102,98,111,117,110,100,115,49,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testInitOutofbounds1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y08bog21ww(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95792);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95793);double[] startPoint = point(DIM,3);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95794);double[] insigma = point(DIM, 0.3);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95795);double[][] boundaries = boundaries(DIM,-1,2);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95796);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95797);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    @Test(expected = NumberIsTooSmallException.class)
    public void testInitOutofbounds2() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ur8cvz21x2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,79,117,116,111,102,98,111,117,110,100,115,50,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testInitOutofbounds2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ur8cvz21x2(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95798);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95799);double[] startPoint = point(DIM, -2);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95800);double[] insigma = point(DIM, 0.3);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95801);double[][] boundaries = boundaries(DIM,-1,2);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95802);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95803);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    
    @Test(expected = DimensionMismatchException.class)
    public void testBoundariesDimensionMismatch() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ks6zun21x8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,111,117,110,100,97,114,105,101,115,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testBoundariesDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ks6zun21x8(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95804);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95805);double[] startPoint = point(DIM,0.5);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95806);double[] insigma = point(DIM, 0.3);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95807);double[][] boundaries = boundaries(DIM+1,-1,2);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95808);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95809);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test(expected = NotPositiveException.class)
    public void testInputSigmaNegative() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukvvnt21xe();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,112,117,116,83,105,103,109,97,78,101,103,97,116,105,118,101,58,32,91,78,111,116,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testInputSigmaNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukvvnt21xe(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95810);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95811);double[] startPoint = point(DIM,0.5);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95812);double[] insigma = point(DIM,-0.5);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95813);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95814);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95815);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaOutOfRange() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lygeac21xk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,112,117,116,83,105,103,109,97,79,117,116,79,102,82,97,110,103,101,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testInputSigmaOutOfRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lygeac21xk(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95816);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95817);double[] startPoint = point(DIM,0.5);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95818);double[] insigma = point(DIM, 1.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95819);double[][] boundaries = boundaries(DIM,-0.5,0.5);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95820);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95821);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaDimensionMismatch() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bsn9n221xq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,112,117,116,83,105,103,109,97,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testInputSigmaDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bsn9n221xq(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95822);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95823);double[] startPoint = point(DIM,0.5);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95824);double[] insigma = point(DIM + 1, 0.5);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95825);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95826);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95827);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    
    @Test
    @Retry(3)
    public void testRosen() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mh4ks421xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mh4ks421xw(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95828);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95829);double[] startPoint = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95830);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95831);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95832);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95833);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95834);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    @Retry(3)
    public void testMaximize() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ww16t21y3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testMaximize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ww16t21y3(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95835);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95836);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95837);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95838);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95839);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95840);doTest(new MinusElli(), startPoint, insigma, boundaries,
                GoalType.MAXIMIZE, LAMBDA, true, 0, 1.0-1e-13,
                2e-10, 5e-6, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95841);doTest(new MinusElli(), startPoint, insigma, boundaries,
                GoalType.MAXIMIZE, LAMBDA, false, 0, 1.0-1e-13,
                2e-10, 5e-6, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95842);boundaries = boundaries(DIM,-0.3,0.3); 
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95843);startPoint = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95844);doTest(new MinusElli(), startPoint, insigma, boundaries,
                GoalType.MAXIMIZE, LAMBDA, true, 0, 1.0-1e-13,
                2e-10, 5e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testEllipse() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fb0cwd21yd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testEllipse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fb0cwd21yd(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95845);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95846);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95847);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95848);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95849);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95850);doTest(new Elli(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95851);doTest(new Elli(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testElliRotated() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1es5oyu21yk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testElliRotated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1es5oyu21yk(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95852);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95853);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95854);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95855);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95856);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95857);doTest(new ElliRotated(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95858);doTest(new ElliRotated(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testCigar() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s79tz21yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testCigar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s79tz21yr(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95859);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95860);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95861);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95862);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95863);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95864);doTest(new Cigar(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95865);doTest(new Cigar(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testCigarWithBoundaries() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1biaz21yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testCigarWithBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1biaz21yy(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95866);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95867);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95868);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95869);double[][] boundaries = boundaries(DIM, -1e100, Double.POSITIVE_INFINITY);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95870);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95871);doTest(new Cigar(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95872);doTest(new Cigar(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testTwoAxes() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198vkl621z5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testTwoAxes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198vkl621z5(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95873);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95874);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95875);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95876);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95877);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95878);doTest(new TwoAxes(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95879);doTest(new TwoAxes(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, false, 0, 1e-13,
                1e-8, 1e-3, 200000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testCigTab() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqlxal21zc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testCigTab",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqlxal21zc(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95880);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95881);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95882);double[] insigma = point(DIM,0.3);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95883);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95884);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95885);doTest(new CigTab(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 5e-5, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95886);doTest(new CigTab(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 5e-5, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testSphere() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ut81gm21zj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testSphere",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ut81gm21zj(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95887);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95888);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95889);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95890);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95891);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95892);doTest(new Sphere(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95893);doTest(new Sphere(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testTablet() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yqqld21zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testTablet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yqqld21zq(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95894);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95895);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95896);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95897);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95898);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95899);doTest(new Tablet(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95900);doTest(new Tablet(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testDiffPow() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qhzg821zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testDiffPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qhzg821zx(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95901);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95902);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95903);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95904);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95905);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95906);doTest(new DiffPow(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 10, true, 0, 1e-13,
                1e-8, 1e-1, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95907);doTest(new DiffPow(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 10, false, 0, 1e-13,
                1e-8, 2e-1, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testSsDiffPow() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivx0vs2204();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testSsDiffPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivx0vs2204(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95908);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95909);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95910);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95911);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95912);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95913);doTest(new SsDiffPow(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 10, true, 0, 1e-13,
                1e-4, 1e-1, 200000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95914);doTest(new SsDiffPow(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 10, false, 0, 1e-13,
                1e-4, 1e-1, 200000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testAckley() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luwii8220b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testAckley",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luwii8220b(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95915);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95916);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95917);double[] insigma = point(DIM,1.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95918);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95919);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95920);doTest(new Ackley(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, true, 0, 1e-13,
                1e-9, 1e-5, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95921);doTest(new Ackley(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, false, 0, 1e-13,
                1e-9, 1e-5, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testRastrigin() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16uup0m220i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testRastrigin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16uup0m220i(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95922);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95923);double[] startPoint = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95924);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95925);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95926);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95927);doTest(new Rastrigin(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, (int)(200*Math.sqrt(DIM)), true, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95928);doTest(new Rastrigin(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, (int)(200*Math.sqrt(DIM)), false, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testConstrainedRosen() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2y23i220p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testConstrainedRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2y23i220p(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95929);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95930);double[] startPoint = point(DIM, 0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95931);double[] insigma = point(DIM, 0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95932);double[][] boundaries = boundaries(DIM, -1, 2);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95933);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95934);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95935);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testDiagonalRosen() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h5qiqp220w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testDiagonalRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h5qiqp220w(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95936);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95937);double[] startPoint = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95938);double[] insigma = point(DIM,0.1);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95939);double[][] boundaries = null;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95940);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95941);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 1, 1e-13,
                1e-10, 1e-4, 1000000, expected);
     }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    @Test
    public void testMath864() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnv8ar2212();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testMath864",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnv8ar2212(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95942);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95943);final CMAESOptimizer optimizer
            = new CMAESOptimizer(30000, 0, true, 10,
                                 0, new MersenneTwister(), false, null);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95944);final MultivariateFunction fitnessFunction = new MultivariateFunction() {
                public double value(double[] parameters) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95945);
                    __CLR4_4_121ww21wwlb90pdt8.R.inc(95946);final double target = 1;
                    __CLR4_4_121ww21wwlb90pdt8.R.inc(95947);final double error = target - parameters[0];
                    __CLR4_4_121ww21wwlb90pdt8.R.inc(95948);return error * error;
                }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
            };

        __CLR4_4_121ww21wwlb90pdt8.R.inc(95949);final double[] start = { 0 };
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95950);final double[] lower = { -1e6 };
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95951);final double[] upper = { 1.5 };
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95952);final double[] sigma = { 1e-1 };
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95953);final double[] result = optimizer.optimize(new MaxEval(10000),
                                                   new ObjectiveFunction(fitnessFunction),
                                                   GoalType.MINIMIZE,
                                                   new CMAESOptimizer.PopulationSize(5),
                                                   new CMAESOptimizer.Sigma(sigma),
                                                   new InitialGuess(start),
                                                   new SimpleBounds(lower, upper)).getPoint();
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95954);Assert.assertTrue("Out of bounds (" + result[0] + " > " + upper[0] + ")",
                          result[0] <= upper[0]);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    /**
     * Cf. MATH-867
     */
    @Test
    public void testFitAccuracyDependsOnBoundary() {__CLR4_4_121ww21wwlb90pdt8.R.globalSliceStart(getClass().getName(),95955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118v20v221f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121ww21wwlb90pdt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_121ww21wwlb90pdt8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest.testFitAccuracyDependsOnBoundary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118v20v221f(){try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95955);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95956);final CMAESOptimizer optimizer
            = new CMAESOptimizer(30000, 0, true, 10,
                                 0, new MersenneTwister(), false, null);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95957);final MultivariateFunction fitnessFunction = new MultivariateFunction() {
                public double value(double[] parameters) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95958);
                    __CLR4_4_121ww21wwlb90pdt8.R.inc(95959);final double target = 11.1;
                    __CLR4_4_121ww21wwlb90pdt8.R.inc(95960);final double error = target - parameters[0];
                    __CLR4_4_121ww21wwlb90pdt8.R.inc(95961);return error * error;
                }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
            };

        __CLR4_4_121ww21wwlb90pdt8.R.inc(95962);final double[] start = { 1 };
 
        // No bounds.
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95963);PointValuePair result = optimizer.optimize(new MaxEval(100000),
                                                   new ObjectiveFunction(fitnessFunction),
                                                   GoalType.MINIMIZE,
                                                   SimpleBounds.unbounded(1),
                                                   new CMAESOptimizer.PopulationSize(5),
                                                   new CMAESOptimizer.Sigma(new double[] { 1e-1 }),
                                                   new InitialGuess(start));
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95964);final double resNoBound = result.getPoint()[0];

        // Optimum is near the lower bound.
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95965);final double[] lower = { -20 };
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95966);final double[] upper = { 5e16 };
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95967);final double[] sigma = { 10 };
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95968);result = optimizer.optimize(new MaxEval(100000),
                                    new ObjectiveFunction(fitnessFunction),
                                    GoalType.MINIMIZE,
                                    new CMAESOptimizer.PopulationSize(5),
                                    new CMAESOptimizer.Sigma(sigma),
                                    new InitialGuess(start),
                                    new SimpleBounds(lower, upper));
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95969);final double resNearLo = result.getPoint()[0];

        // Optimum is near the upper bound.
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95970);lower[0] = -5e16;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95971);upper[0] = 20;
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95972);result = optimizer.optimize(new MaxEval(100000),
                                    new ObjectiveFunction(fitnessFunction),
                                    GoalType.MINIMIZE,
                                    new CMAESOptimizer.PopulationSize(5),
                                    new CMAESOptimizer.Sigma(sigma),
                                    new InitialGuess(start),
                                    new SimpleBounds(lower, upper));
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95973);final double resNearHi = result.getPoint()[0];

        // System.out.println("resNoBound=" + resNoBound +
        //                    " resNearLo=" + resNearLo +
        //                    " resNearHi=" + resNearHi);

        // The two values currently differ by a substantial amount, indicating that
        // the bounds definition can prevent reaching the optimum.
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95974);Assert.assertEquals(resNoBound, resNearLo, 1e-3);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95975);Assert.assertEquals(resNoBound, resNearHi, 1e-3);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
 
    /**
     * @param func Function to optimize.
     * @param startPoint Starting point.
     * @param inSigma Individual input sigma.
     * @param boundaries Upper / lower point limit.
     * @param goal Minimization or maximization.
     * @param lambda Population size used for offspring.
     * @param isActive Covariance update mechanism.
     * @param diagonalOnly Simplified covariance update.
     * @param stopValue Termination criteria for optimization.
     * @param fTol Tolerance relative error on the objective function.
     * @param pointTol Tolerance for checking that the optimum is correct.
     * @param maxEvaluations Maximum number of evaluations.
     * @param expected Expected point / value.
     */
    private void doTest(MultivariateFunction func,
                        double[] startPoint,
                        double[] inSigma,
                        double[][] boundaries,
                        GoalType goal,
                        int lambda,
                        boolean isActive,
                        int diagonalOnly, 
                        double stopValue,
                        double fTol,
                        double pointTol,
                        int maxEvaluations,
                        PointValuePair expected) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95976);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95977);int dim = startPoint.length;
        // test diagonalOnly = 0 - slow but normally fewer feval#
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95978);CMAESOptimizer optim = new CMAESOptimizer(30000, stopValue, isActive, diagonalOnly,
                                                  0, new MersenneTwister(), false, null);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95979);PointValuePair result = (((boundaries == null )&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(95980)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(95981)==0&false))?
            optim.optimize(new MaxEval(maxEvaluations),
                           new ObjectiveFunction(func),
                           goal,
                           new InitialGuess(startPoint),
                           SimpleBounds.unbounded(dim),
                           new CMAESOptimizer.Sigma(inSigma),
                           new CMAESOptimizer.PopulationSize(lambda)) :
            optim.optimize(new MaxEval(maxEvaluations),
                           new ObjectiveFunction(func),
                           goal,
                           new SimpleBounds(boundaries[0],
                                            boundaries[1]),
                           new InitialGuess(startPoint),
                           new CMAESOptimizer.Sigma(inSigma),
                           new CMAESOptimizer.PopulationSize(lambda));

        // System.out.println("sol=" + Arrays.toString(result.getPoint()));
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95982);Assert.assertEquals(expected.getValue(), result.getValue(), fTol);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95983);for (int i = 0; (((i < dim)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(95984)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(95985)==0&false)); i++) {{
            __CLR4_4_121ww21wwlb90pdt8.R.inc(95986);Assert.assertEquals(expected.getPoint()[i], result.getPoint()[i], pointTol);
        }

        }__CLR4_4_121ww21wwlb90pdt8.R.inc(95987);Assert.assertTrue(optim.getIterations() > 0);
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    private static double[] point(int n, double value) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95988);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95989);double[] ds = new double[n];
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95990);Arrays.fill(ds, value);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95991);return ds;
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    private static double[][] boundaries(int dim,
            double lower, double upper) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(95992);
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95993);double[][] boundaries = new double[2][dim];
        __CLR4_4_121ww21wwlb90pdt8.R.inc(95994);for (int i = 0; (((i < dim)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(95995)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(95996)==0&false)); i++)
            {__CLR4_4_121ww21wwlb90pdt8.R.inc(95997);boundaries[0][i] = lower;
        }__CLR4_4_121ww21wwlb90pdt8.R.inc(95998);for (int i = 0; (((i < dim)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(95999)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96000)==0&false)); i++)
            {__CLR4_4_121ww21wwlb90pdt8.R.inc(96001);boundaries[1][i] = upper;
        }__CLR4_4_121ww21wwlb90pdt8.R.inc(96002);return boundaries;
    }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

    private static class Sphere implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96003);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96004);double f = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96005);for (int i = 0; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96006)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96007)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96008);f += x[i] * x[i];
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96009);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class Cigar implements MultivariateFunction {
        private double factor;

        Cigar() {
            this(1e3);__CLR4_4_121ww21wwlb90pdt8.R.inc(96011);try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96010);
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        Cigar(double axisratio) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96012);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96013);factor = axisratio * axisratio;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96014);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96015);double f = x[0] * x[0];
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96016);for (int i = 1; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96017)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96018)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96019);f += factor * x[i] * x[i];
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96020);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class Tablet implements MultivariateFunction {
        private double factor;

        Tablet() {
            this(1e3);__CLR4_4_121ww21wwlb90pdt8.R.inc(96022);try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96021);
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        Tablet(double axisratio) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96023);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96024);factor = axisratio * axisratio;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96025);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96026);double f = factor * x[0] * x[0];
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96027);for (int i = 1; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96028)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96029)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96030);f += x[i] * x[i];
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96031);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class CigTab implements MultivariateFunction {
        private double factor;

        CigTab() {
            this(1e4);__CLR4_4_121ww21wwlb90pdt8.R.inc(96033);try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96032);
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        CigTab(double axisratio) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96034);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96035);factor = axisratio;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96036);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96037);int end = x.length - 1;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96038);double f = x[0] * x[0] / factor + factor * x[end] * x[end];
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96039);for (int i = 1; (((i < end)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96040)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96041)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96042);f += x[i] * x[i];
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96043);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class TwoAxes implements MultivariateFunction {

        private double factor;

        TwoAxes() {
            this(1e6);__CLR4_4_121ww21wwlb90pdt8.R.inc(96045);try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96044);
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        TwoAxes(double axisratio) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96046);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96047);factor = axisratio * axisratio;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96048);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96049);double f = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96050);for (int i = 0; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96051)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96052)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96053);f += ((((i < x.length / 2 )&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96054)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96055)==0&false))? factor : 1) * x[i] * x[i];
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96056);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class ElliRotated implements MultivariateFunction {
        private Basis B = new Basis();
        private double factor;

        ElliRotated() {
            this(1e3);__CLR4_4_121ww21wwlb90pdt8.R.inc(96058);try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96057);
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        ElliRotated(double axisratio) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96059);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96060);factor = axisratio * axisratio;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96061);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96062);double f = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96063);x = B.Rotate(x);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96064);for (int i = 0; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96065)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96066)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96067);f += Math.pow(factor, i / (x.length - 1.)) * x[i] * x[i];
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96068);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class Elli implements MultivariateFunction {

        private double factor;

        Elli() {
            this(1e3);__CLR4_4_121ww21wwlb90pdt8.R.inc(96070);try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96069);
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        Elli(double axisratio) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96071);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96072);factor = axisratio * axisratio;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96073);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96074);double f = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96075);for (int i = 0; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96076)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96077)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96078);f += Math.pow(factor, i / (x.length - 1.)) * x[i] * x[i];
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96079);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class MinusElli implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96080);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96081);return 1.0-(new Elli().value(x));
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class DiffPow implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96082);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96083);double f = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96084);for (int i = 0; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96085)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96086)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96087);f += Math.pow(Math.abs(x[i]), 2. + 10 * (double) i
                        / (x.length - 1.));
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96088);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class SsDiffPow implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96089);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96090);double f = Math.pow(new DiffPow().value(x), 0.25);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96091);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class Rosen implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96092);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96093);double f = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96094);for (int i = 0; (((i < x.length - 1)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96095)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96096)==0&false)); ++i)
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96097);f += 1e2 * (x[i] * x[i] - x[i + 1]) * (x[i] * x[i] - x[i + 1])
                + (x[i] - 1.) * (x[i] - 1.);
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96098);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class Ackley implements MultivariateFunction {
        private double axisratio;

        Ackley(double axra) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96099);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96100);axisratio = axra;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public Ackley() {
            this(1);__CLR4_4_121ww21wwlb90pdt8.R.inc(96102);try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96101);
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96103);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96104);double f = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96105);double res2 = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96106);double fac = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96107);for (int i = 0; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96108)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96109)==0&false)); ++i) {{
                __CLR4_4_121ww21wwlb90pdt8.R.inc(96110);fac = Math.pow(axisratio, (i - 1.) / (x.length - 1.));
                __CLR4_4_121ww21wwlb90pdt8.R.inc(96111);f += fac * fac * x[i] * x[i];
                __CLR4_4_121ww21wwlb90pdt8.R.inc(96112);res2 += Math.cos(2. * Math.PI * fac * x[i]);
            }
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96113);f = (20. - 20. * Math.exp(-0.2 * Math.sqrt(f / x.length))
                    + Math.exp(1.) - Math.exp(res2 / x.length));
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96114);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class Rastrigin implements MultivariateFunction {

        private double axisratio;
        private double amplitude;

        Rastrigin() {
            this(1, 10);__CLR4_4_121ww21wwlb90pdt8.R.inc(96116);try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96115);
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        Rastrigin(double axisratio, double amplitude) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96117);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96118);this.axisratio = axisratio;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96119);this.amplitude = amplitude;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96120);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96121);double f = 0;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96122);double fac;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96123);for (int i = 0; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96124)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96125)==0&false)); ++i) {{
                __CLR4_4_121ww21wwlb90pdt8.R.inc(96126);fac = Math.pow(axisratio, (i - 1.) / (x.length - 1.));
                __CLR4_4_121ww21wwlb90pdt8.R.inc(96127);if ((((i == 0 && x[i] < 0)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96128)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96129)==0&false)))
                    {__CLR4_4_121ww21wwlb90pdt8.R.inc(96130);fac *= 1.;
                }__CLR4_4_121ww21wwlb90pdt8.R.inc(96131);f += fac * fac * x[i] * x[i] + amplitude
                * (1. - Math.cos(2. * Math.PI * fac * x[i]));
            }
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96132);return f;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }

    private static class Basis {
        double[][] basis;
        Random rand = new Random(2); // use not always the same basis

        double[] Rotate(double[] x) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96133);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96134);GenBasis(x.length);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96135);double[] y = new double[x.length];
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96136);for (int i = 0; (((i < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96137)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96138)==0&false)); ++i) {{
                __CLR4_4_121ww21wwlb90pdt8.R.inc(96139);y[i] = 0;
                __CLR4_4_121ww21wwlb90pdt8.R.inc(96140);for (int j = 0; (((j < x.length)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96141)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96142)==0&false)); ++j)
                    {__CLR4_4_121ww21wwlb90pdt8.R.inc(96143);y[i] += basis[i][j] * x[j];
            }}
            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96144);return y;
        }finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}

        void GenBasis(int DIM) {try{__CLR4_4_121ww21wwlb90pdt8.R.inc(96145);
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96146);if (((((((basis != null )&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96147)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96148)==0&false))? basis.length == DIM : false)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96149)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96150)==0&false)))
                {__CLR4_4_121ww21wwlb90pdt8.R.inc(96151);return;

            }__CLR4_4_121ww21wwlb90pdt8.R.inc(96152);double sp;
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96153);int i, j, k;

            /* generate orthogonal basis */
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96154);basis = new double[DIM][DIM];
            __CLR4_4_121ww21wwlb90pdt8.R.inc(96155);for (i = 0; (((i < DIM)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96156)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96157)==0&false)); ++i) {{
                /* sample components gaussian */
                __CLR4_4_121ww21wwlb90pdt8.R.inc(96158);for (j = 0; (((j < DIM)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96159)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96160)==0&false)); ++j)
                    {__CLR4_4_121ww21wwlb90pdt8.R.inc(96161);basis[i][j] = rand.nextGaussian();
                /* substract projection of previous vectors */
                }__CLR4_4_121ww21wwlb90pdt8.R.inc(96162);for (j = i - 1; (((j >= 0)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96163)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96164)==0&false)); --j) {{
                    __CLR4_4_121ww21wwlb90pdt8.R.inc(96165);for (sp = 0., k = 0; (((k < DIM)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96166)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96167)==0&false)); ++k)
                        {__CLR4_4_121ww21wwlb90pdt8.R.inc(96168);sp += basis[i][k] * basis[j][k]; /* scalar product */
                    }__CLR4_4_121ww21wwlb90pdt8.R.inc(96169);for (k = 0; (((k < DIM)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96170)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96171)==0&false)); ++k)
                        {__CLR4_4_121ww21wwlb90pdt8.R.inc(96172);basis[i][k] -= sp * basis[j][k]; /* substract */
                }}
                /* normalize */
                }__CLR4_4_121ww21wwlb90pdt8.R.inc(96173);for (sp = 0., k = 0; (((k < DIM)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96174)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96175)==0&false)); ++k)
                    {__CLR4_4_121ww21wwlb90pdt8.R.inc(96176);sp += basis[i][k] * basis[i][k]; /* squared norm */
                }__CLR4_4_121ww21wwlb90pdt8.R.inc(96177);for (k = 0; (((k < DIM)&&(__CLR4_4_121ww21wwlb90pdt8.R.iget(96178)!=0|true))||(__CLR4_4_121ww21wwlb90pdt8.R.iget(96179)==0&false)); ++k)
                    {__CLR4_4_121ww21wwlb90pdt8.R.inc(96180);basis[i][k] /= Math.sqrt(sp);
            }}
        }}finally{__CLR4_4_121ww21wwlb90pdt8.R.flushNeeded();}}
    }
}
