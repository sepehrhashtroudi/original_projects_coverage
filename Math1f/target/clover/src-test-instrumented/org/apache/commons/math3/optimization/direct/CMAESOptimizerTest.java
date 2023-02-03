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
package org.apache.commons.math3.optimization.direct;

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
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.SimpleBounds;
import org.apache.commons.math3.random.MersenneTwister;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test for {@link CMAESOptimizer}.
 */
@RunWith(RetryRunner.class)
public class CMAESOptimizerTest {static class __CLR4_4_124f924f9lb90pdzc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,99417,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final int DIM = 13;
    static final int LAMBDA = 4 + (int)(3.*Math.log(DIM));
   
    @Test(expected = NumberIsTooLargeException.class)
    public void testInitOutofbounds1() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y08bog24f9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,79,117,116,111,102,98,111,117,110,100,115,49,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testInitOutofbounds1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y08bog24f9(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99045);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99046);double[] startPoint = point(DIM,3);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99047);double[] insigma = point(DIM, 0.3);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99048);double[][] boundaries = boundaries(DIM,-1,2);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99049);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99050);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    @Test(expected = NumberIsTooSmallException.class)
    public void testInitOutofbounds2() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ur8cvz24ff();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,79,117,116,111,102,98,111,117,110,100,115,50,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testInitOutofbounds2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ur8cvz24ff(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99051);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99052);double[] startPoint = point(DIM, -2);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99053);double[] insigma = point(DIM, 0.3);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99054);double[][] boundaries = boundaries(DIM,-1,2);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99055);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99056);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    
    @Test(expected = DimensionMismatchException.class)
    public void testBoundariesDimensionMismatch() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ks6zun24fl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,111,117,110,100,97,114,105,101,115,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testBoundariesDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ks6zun24fl(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99057);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99058);double[] startPoint = point(DIM,0.5);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99059);double[] insigma = point(DIM, 0.3);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99060);double[][] boundaries = boundaries(DIM+1,-1,2);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99061);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99062);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test(expected = NotPositiveException.class)
    public void testInputSigmaNegative() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukvvnt24fr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,112,117,116,83,105,103,109,97,78,101,103,97,116,105,118,101,58,32,91,78,111,116,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testInputSigmaNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukvvnt24fr(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99063);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99064);double[] startPoint = point(DIM,0.5);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99065);double[] insigma = point(DIM,-0.5);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99066);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99067);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99068);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaOutOfRange() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lygeac24fx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,112,117,116,83,105,103,109,97,79,117,116,79,102,82,97,110,103,101,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testInputSigmaOutOfRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lygeac24fx(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99069);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99070);double[] startPoint = point(DIM,0.5);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99071);double[] insigma = point(DIM, 1.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99072);double[][] boundaries = boundaries(DIM,-0.5,0.5);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99073);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99074);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaDimensionMismatch() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bsn9n224g3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,112,117,116,83,105,103,109,97,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testInputSigmaDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bsn9n224g3(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99075);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99076);double[] startPoint = point(DIM,0.5);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99077);double[] insigma = point(DIM + 1, 0.5);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99078);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99079);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99080);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    
    @Test
    @Retry(3)
    public void testRosen() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mh4ks424g9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mh4ks424g9(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99081);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99082);double[] startPoint = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99083);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99084);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99085);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99086);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99087);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    @Retry(3)
    public void testMaximize() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ww16t24gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testMaximize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ww16t24gg(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99088);}finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testMaximize() {
//         double[] startPoint = point(DIM,1.0);
//         double[] insigma = point(DIM,0.1);
//         double[][] boundaries = null;
//         PointValuePair expected =
//             new PointValuePair(point(DIM,0.0),1.0);
//         doTest(new MinusElli(), startPoint, insigma, boundaries,
//                 GoalType.MAXIMIZE, LAMBDA, true, 0, 1.0-1e-13,
//                 2e-10, 5e-6, 100000, expected);
//         doTest(new MinusElli(), startPoint, insigma, boundaries,
//                 GoalType.MAXIMIZE, LAMBDA, false, 0, 1.0-1e-13,
//                 2e-10, 5e-6, 100000, expected);
//         boundaries = boundaries(DIM,-0.3,0.3); 
//         startPoint = point(DIM,0.1);
//         doTest(new MinusElli(), startPoint, insigma, boundaries,
//                 GoalType.MAXIMIZE, LAMBDA, true, 0, 1.0-1e-13,
//                 2e-10, 5e-6, 100000, expected);
//     }

    @Test
    public void testEllipse() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fb0cwd24gh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testEllipse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fb0cwd24gh(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99089);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99090);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99091);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99092);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99093);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99094);doTest(new Elli(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99095);doTest(new Elli(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testElliRotated() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1es5oyu24go();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testElliRotated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1es5oyu24go(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99096);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99097);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99098);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99099);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99100);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99101);doTest(new ElliRotated(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99102);doTest(new ElliRotated(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testCigar() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s79tz24gv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testCigar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s79tz24gv(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99103);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99104);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99105);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99106);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99107);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99108);doTest(new Cigar(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99109);doTest(new Cigar(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testCigarWithBoundaries() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1biaz24h2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testCigarWithBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1biaz24h2(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99110);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99111);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99112);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99113);double[][] boundaries = boundaries(DIM, -1e100, Double.POSITIVE_INFINITY);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99114);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99115);doTest(new Cigar(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99116);doTest(new Cigar(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testTwoAxes() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198vkl624h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testTwoAxes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198vkl624h9(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99117);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99118);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99119);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99120);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99121);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99122);doTest(new TwoAxes(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99123);doTest(new TwoAxes(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, false, 0, 1e-13,
                1e-8, 1e-3, 200000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testCigTab() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqlxal24hg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testCigTab",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqlxal24hg(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99124);}finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testCigTab() {
//         double[] startPoint = point(DIM,1.0);
//         double[] insigma = point(DIM,0.3);
//         double[][] boundaries = null;
//         PointValuePair expected =
//             new PointValuePair(point(DIM,0.0),0.0);
//         doTest(new CigTab(), startPoint, insigma, boundaries,
//                 GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
//                 1e-13, 5e-5, 100000, expected);
//         doTest(new CigTab(), startPoint, insigma, boundaries,
//                 GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
//                 1e-13, 5e-5, 100000, expected);
//     }

    @Test
    public void testSphere() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ut81gm24hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testSphere",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ut81gm24hh(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99125);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99126);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99127);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99128);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99129);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99130);doTest(new Sphere(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99131);doTest(new Sphere(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testTablet() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yqqld24ho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testTablet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yqqld24ho(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99132);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99133);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99134);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99135);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99136);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99137);doTest(new Tablet(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99138);doTest(new Tablet(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testDiffPow() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qhzg824hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testDiffPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qhzg824hv(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99139);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99140);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99141);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99142);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99143);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99144);doTest(new DiffPow(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 10, true, 0, 1e-13,
                1e-8, 1e-1, 100000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99145);doTest(new DiffPow(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 10, false, 0, 1e-13,
                1e-8, 2e-1, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testSsDiffPow() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivx0vs24i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testSsDiffPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivx0vs24i2(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99146);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99147);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99148);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99149);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99150);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99151);doTest(new SsDiffPow(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 10, true, 0, 1e-13,
                1e-4, 1e-1, 200000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99152);doTest(new SsDiffPow(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 10, false, 0, 1e-13,
                1e-4, 1e-1, 200000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testAckley() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luwii824i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testAckley",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luwii824i9(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99153);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99154);double[] startPoint = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99155);double[] insigma = point(DIM,1.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99156);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99157);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99158);doTest(new Ackley(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, true, 0, 1e-13,
                1e-9, 1e-5, 100000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99159);doTest(new Ackley(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, false, 0, 1e-13,
                1e-9, 1e-5, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testRastrigin() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16uup0m24ig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testRastrigin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16uup0m24ig(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99160);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99161);double[] startPoint = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99162);double[] insigma = point(DIM,0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99163);double[][] boundaries = null;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99164);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99165);doTest(new Rastrigin(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, (int)(200*Math.sqrt(DIM)), true, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99166);doTest(new Rastrigin(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, (int)(200*Math.sqrt(DIM)), false, 0, 1e-13,
                1e-13, 1e-6, 200000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testConstrainedRosen() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2y23i24in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testConstrainedRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2y23i24in(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99167);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99168);double[] startPoint = point(DIM, 0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99169);double[] insigma = point(DIM, 0.1);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99170);double[][] boundaries = boundaries(DIM, -1, 2);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99171);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99172);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, true, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99173);doTest(new Rosen(), startPoint, insigma, boundaries,
                GoalType.MINIMIZE, 2*LAMBDA, false, 0, 1e-13,
                1e-13, 1e-6, 100000, expected);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    @Test
    public void testDiagonalRosen() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h5qiqp24iu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testDiagonalRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h5qiqp24iu(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99174);}finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testDiagonalRosen() {
//         double[] startPoint = point(DIM,0.1);
//         double[] insigma = point(DIM,0.1);
//         double[][] boundaries = null;
//         PointValuePair expected =
//             new PointValuePair(point(DIM,1.0),0.0);
//         doTest(new Rosen(), startPoint, insigma, boundaries,
//                 GoalType.MINIMIZE, LAMBDA, false, 1, 1e-13,
//                 1e-10, 1e-4, 1000000, expected);
//      }

    @Test
    public void testMath864() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnv8ar24iv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testMath864",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnv8ar24iv(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99175);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99176);final CMAESOptimizer optimizer = new CMAESOptimizer();
        __CLR4_4_124f924f9lb90pdzc.R.inc(99177);final MultivariateFunction fitnessFunction = new MultivariateFunction() {
                public double value(double[] parameters) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99178);
                    __CLR4_4_124f924f9lb90pdzc.R.inc(99179);final double target = 1;
                    __CLR4_4_124f924f9lb90pdzc.R.inc(99180);final double error = target - parameters[0];
                    __CLR4_4_124f924f9lb90pdzc.R.inc(99181);return error * error;
                }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
            };

        __CLR4_4_124f924f9lb90pdzc.R.inc(99182);final double[] start = { 0 };
        __CLR4_4_124f924f9lb90pdzc.R.inc(99183);final double[] lower = { -1e6 };
        __CLR4_4_124f924f9lb90pdzc.R.inc(99184);final double[] upper = { 1.5 };
        __CLR4_4_124f924f9lb90pdzc.R.inc(99185);final double[] result = optimizer.optimize(10000, fitnessFunction, GoalType.MINIMIZE,
                                                   start, lower, upper).getPoint();
        __CLR4_4_124f924f9lb90pdzc.R.inc(99186);Assert.assertTrue("Out of bounds (" + result[0] + " > " + upper[0] + ")",
                          result[0] <= upper[0]);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    /**
     * Cf. MATH-867
     */
    @Test
    public void testFitAccuracyDependsOnBoundary() {__CLR4_4_124f924f9lb90pdzc.R.globalSliceStart(getClass().getName(),99187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118v20v24j7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124f924f9lb90pdzc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124f924f9lb90pdzc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.CMAESOptimizerTest.testFitAccuracyDependsOnBoundary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118v20v24j7(){try{__CLR4_4_124f924f9lb90pdzc.R.inc(99187);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99188);final CMAESOptimizer optimizer = new CMAESOptimizer();
        __CLR4_4_124f924f9lb90pdzc.R.inc(99189);final MultivariateFunction fitnessFunction = new MultivariateFunction() {
                public double value(double[] parameters) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99190);
                    __CLR4_4_124f924f9lb90pdzc.R.inc(99191);final double target = 11.1;
                    __CLR4_4_124f924f9lb90pdzc.R.inc(99192);final double error = target - parameters[0];
                    __CLR4_4_124f924f9lb90pdzc.R.inc(99193);return error * error;
                }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
            };

        __CLR4_4_124f924f9lb90pdzc.R.inc(99194);final double[] start = { 1 };
 
        // No bounds.
        __CLR4_4_124f924f9lb90pdzc.R.inc(99195);PointValuePair result = optimizer.optimize(100000, fitnessFunction, GoalType.MINIMIZE,
                                                   start);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99196);final double resNoBound = result.getPoint()[0];

        // Optimum is near the lower bound.
        __CLR4_4_124f924f9lb90pdzc.R.inc(99197);final double[] lower = { -20 };
        __CLR4_4_124f924f9lb90pdzc.R.inc(99198);final double[] upper = { 5e16 };
        __CLR4_4_124f924f9lb90pdzc.R.inc(99199);result = optimizer.optimize(100000, fitnessFunction, GoalType.MINIMIZE,
                                    start, lower, upper);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99200);final double resNearLo = result.getPoint()[0];

        // Optimum is near the upper bound.
        __CLR4_4_124f924f9lb90pdzc.R.inc(99201);lower[0] = -5e16;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99202);upper[0] = 20;
        __CLR4_4_124f924f9lb90pdzc.R.inc(99203);result = optimizer.optimize(100000, fitnessFunction, GoalType.MINIMIZE,
                                    start, lower, upper);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99204);final double resNearHi = result.getPoint()[0];

        // System.out.println("resNoBound=" + resNoBound +
        //                    " resNearLo=" + resNearLo +
        //                    " resNearHi=" + resNearHi);

        // The two values currently differ by a substantial amount, indicating that
        // the bounds definition can prevent reaching the optimum.
        __CLR4_4_124f924f9lb90pdzc.R.inc(99205);Assert.assertEquals(resNoBound, resNearLo, 1e-3);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99206);Assert.assertEquals(resNoBound, resNearHi, 1e-3);
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
 
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
            PointValuePair expected) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99207);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99208);int dim = startPoint.length;
        // test diagonalOnly = 0 - slow but normally fewer feval#
        __CLR4_4_124f924f9lb90pdzc.R.inc(99209);CMAESOptimizer optim = new CMAESOptimizer(30000, stopValue, isActive, diagonalOnly,
                                                  0, new MersenneTwister(), false, null);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99210);final double[] lB = (((boundaries == null )&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99211)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99212)==0&false))? null : boundaries[0];
        __CLR4_4_124f924f9lb90pdzc.R.inc(99213);final double[] uB = (((boundaries == null )&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99214)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99215)==0&false))? null : boundaries[1];
        __CLR4_4_124f924f9lb90pdzc.R.inc(99216);PointValuePair result = (((boundaries == null )&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99217)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99218)==0&false))?
            optim.optimize(maxEvaluations, func, goal,
                           new InitialGuess(startPoint),
                           new CMAESOptimizer.Sigma(inSigma),
                           new CMAESOptimizer.PopulationSize(lambda)) :
            optim.optimize(maxEvaluations, func, goal,
                           new InitialGuess(startPoint),
                           new SimpleBounds(lB, uB),
                           new CMAESOptimizer.Sigma(inSigma),
                           new CMAESOptimizer.PopulationSize(lambda));
        // System.out.println("sol=" + Arrays.toString(result.getPoint()));
        __CLR4_4_124f924f9lb90pdzc.R.inc(99219);Assert.assertEquals(expected.getValue(), result.getValue(), fTol);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99220);for (int i = 0; (((i < dim)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99221)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99222)==0&false)); i++) {{
            __CLR4_4_124f924f9lb90pdzc.R.inc(99223);Assert.assertEquals(expected.getPoint()[i], result.getPoint()[i], pointTol);
        }
    }}finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    private static double[] point(int n, double value) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99224);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99225);double[] ds = new double[n];
        __CLR4_4_124f924f9lb90pdzc.R.inc(99226);Arrays.fill(ds, value);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99227);return ds;
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    private static double[][] boundaries(int dim,
            double lower, double upper) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99228);
        __CLR4_4_124f924f9lb90pdzc.R.inc(99229);double[][] boundaries = new double[2][dim];
        __CLR4_4_124f924f9lb90pdzc.R.inc(99230);for (int i = 0; (((i < dim)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99231)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99232)==0&false)); i++)
            {__CLR4_4_124f924f9lb90pdzc.R.inc(99233);boundaries[0][i] = lower;
        }__CLR4_4_124f924f9lb90pdzc.R.inc(99234);for (int i = 0; (((i < dim)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99235)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99236)==0&false)); i++)
            {__CLR4_4_124f924f9lb90pdzc.R.inc(99237);boundaries[1][i] = upper;
        }__CLR4_4_124f924f9lb90pdzc.R.inc(99238);return boundaries;
    }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

    private static class Sphere implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99239);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99240);double f = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99241);for (int i = 0; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99242)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99243)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99244);f += x[i] * x[i];
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99245);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class Cigar implements MultivariateFunction {
        private double factor;

        Cigar() {
            this(1e3);__CLR4_4_124f924f9lb90pdzc.R.inc(99247);try{__CLR4_4_124f924f9lb90pdzc.R.inc(99246);
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        Cigar(double axisratio) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99248);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99249);factor = axisratio * axisratio;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99250);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99251);double f = x[0] * x[0];
            __CLR4_4_124f924f9lb90pdzc.R.inc(99252);for (int i = 1; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99253)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99254)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99255);f += factor * x[i] * x[i];
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99256);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class Tablet implements MultivariateFunction {
        private double factor;

        Tablet() {
            this(1e3);__CLR4_4_124f924f9lb90pdzc.R.inc(99258);try{__CLR4_4_124f924f9lb90pdzc.R.inc(99257);
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        Tablet(double axisratio) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99259);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99260);factor = axisratio * axisratio;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99261);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99262);double f = factor * x[0] * x[0];
            __CLR4_4_124f924f9lb90pdzc.R.inc(99263);for (int i = 1; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99264)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99265)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99266);f += x[i] * x[i];
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99267);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class CigTab implements MultivariateFunction {
        private double factor;

        CigTab() {
            this(1e4);__CLR4_4_124f924f9lb90pdzc.R.inc(99269);try{__CLR4_4_124f924f9lb90pdzc.R.inc(99268);
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        CigTab(double axisratio) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99270);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99271);factor = axisratio;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99272);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99273);int end = x.length - 1;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99274);double f = x[0] * x[0] / factor + factor * x[end] * x[end];
            __CLR4_4_124f924f9lb90pdzc.R.inc(99275);for (int i = 1; (((i < end)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99276)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99277)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99278);f += x[i] * x[i];
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99279);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class TwoAxes implements MultivariateFunction {

        private double factor;

        TwoAxes() {
            this(1e6);__CLR4_4_124f924f9lb90pdzc.R.inc(99281);try{__CLR4_4_124f924f9lb90pdzc.R.inc(99280);
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        TwoAxes(double axisratio) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99282);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99283);factor = axisratio * axisratio;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99284);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99285);double f = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99286);for (int i = 0; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99287)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99288)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99289);f += ((((i < x.length / 2 )&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99290)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99291)==0&false))? factor : 1) * x[i] * x[i];
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99292);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class ElliRotated implements MultivariateFunction {
        private Basis B = new Basis();
        private double factor;

        ElliRotated() {
            this(1e3);__CLR4_4_124f924f9lb90pdzc.R.inc(99294);try{__CLR4_4_124f924f9lb90pdzc.R.inc(99293);
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        ElliRotated(double axisratio) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99295);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99296);factor = axisratio * axisratio;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99297);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99298);double f = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99299);x = B.Rotate(x);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99300);for (int i = 0; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99301)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99302)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99303);f += Math.pow(factor, i / (x.length - 1.)) * x[i] * x[i];
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99304);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class Elli implements MultivariateFunction {

        private double factor;

        Elli() {
            this(1e3);__CLR4_4_124f924f9lb90pdzc.R.inc(99306);try{__CLR4_4_124f924f9lb90pdzc.R.inc(99305);
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        Elli(double axisratio) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99307);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99308);factor = axisratio * axisratio;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99309);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99310);double f = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99311);for (int i = 0; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99312)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99313)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99314);f += Math.pow(factor, i / (x.length - 1.)) * x[i] * x[i];
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99315);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class MinusElli implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99316);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99317);return 1.0-(new Elli().value(x));
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class DiffPow implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99318);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99319);double f = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99320);for (int i = 0; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99321)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99322)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99323);f += Math.pow(Math.abs(x[i]), 2. + 10 * (double) i
                        / (x.length - 1.));
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99324);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class SsDiffPow implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99325);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99326);double f = Math.pow(new DiffPow().value(x), 0.25);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99327);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class Rosen implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99328);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99329);double f = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99330);for (int i = 0; (((i < x.length - 1)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99331)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99332)==0&false)); ++i)
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99333);f += 1e2 * (x[i] * x[i] - x[i + 1]) * (x[i] * x[i] - x[i + 1])
                + (x[i] - 1.) * (x[i] - 1.);
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99334);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class Ackley implements MultivariateFunction {
        private double axisratio;

        Ackley(double axra) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99335);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99336);axisratio = axra;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public Ackley() {
            this(1);__CLR4_4_124f924f9lb90pdzc.R.inc(99338);try{__CLR4_4_124f924f9lb90pdzc.R.inc(99337);
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99339);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99340);double f = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99341);double res2 = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99342);double fac = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99343);for (int i = 0; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99344)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99345)==0&false)); ++i) {{
                __CLR4_4_124f924f9lb90pdzc.R.inc(99346);fac = Math.pow(axisratio, (i - 1.) / (x.length - 1.));
                __CLR4_4_124f924f9lb90pdzc.R.inc(99347);f += fac * fac * x[i] * x[i];
                __CLR4_4_124f924f9lb90pdzc.R.inc(99348);res2 += Math.cos(2. * Math.PI * fac * x[i]);
            }
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99349);f = (20. - 20. * Math.exp(-0.2 * Math.sqrt(f / x.length))
                    + Math.exp(1.) - Math.exp(res2 / x.length));
            __CLR4_4_124f924f9lb90pdzc.R.inc(99350);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class Rastrigin implements MultivariateFunction {

        private double axisratio;
        private double amplitude;

        Rastrigin() {
            this(1, 10);__CLR4_4_124f924f9lb90pdzc.R.inc(99352);try{__CLR4_4_124f924f9lb90pdzc.R.inc(99351);
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        Rastrigin(double axisratio, double amplitude) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99353);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99354);this.axisratio = axisratio;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99355);this.amplitude = amplitude;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99356);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99357);double f = 0;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99358);double fac;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99359);for (int i = 0; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99360)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99361)==0&false)); ++i) {{
                __CLR4_4_124f924f9lb90pdzc.R.inc(99362);fac = Math.pow(axisratio, (i - 1.) / (x.length - 1.));
                __CLR4_4_124f924f9lb90pdzc.R.inc(99363);if ((((i == 0 && x[i] < 0)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99364)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99365)==0&false)))
                    {__CLR4_4_124f924f9lb90pdzc.R.inc(99366);fac *= 1.;
                }__CLR4_4_124f924f9lb90pdzc.R.inc(99367);f += fac * fac * x[i] * x[i] + amplitude
                * (1. - Math.cos(2. * Math.PI * fac * x[i]));
            }
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99368);return f;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }

    private static class Basis {
        double[][] basis;
        Random rand = new Random(2); // use not always the same basis

        double[] Rotate(double[] x) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99369);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99370);GenBasis(x.length);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99371);double[] y = new double[x.length];
            __CLR4_4_124f924f9lb90pdzc.R.inc(99372);for (int i = 0; (((i < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99373)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99374)==0&false)); ++i) {{
                __CLR4_4_124f924f9lb90pdzc.R.inc(99375);y[i] = 0;
                __CLR4_4_124f924f9lb90pdzc.R.inc(99376);for (int j = 0; (((j < x.length)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99377)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99378)==0&false)); ++j)
                    {__CLR4_4_124f924f9lb90pdzc.R.inc(99379);y[i] += basis[i][j] * x[j];
            }}
            }__CLR4_4_124f924f9lb90pdzc.R.inc(99380);return y;
        }finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}

        void GenBasis(int DIM) {try{__CLR4_4_124f924f9lb90pdzc.R.inc(99381);
            __CLR4_4_124f924f9lb90pdzc.R.inc(99382);if (((((((basis != null )&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99383)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99384)==0&false))? basis.length == DIM : false)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99385)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99386)==0&false)))
                {__CLR4_4_124f924f9lb90pdzc.R.inc(99387);return;

            }__CLR4_4_124f924f9lb90pdzc.R.inc(99388);double sp;
            __CLR4_4_124f924f9lb90pdzc.R.inc(99389);int i, j, k;

            /* generate orthogonal basis */
            __CLR4_4_124f924f9lb90pdzc.R.inc(99390);basis = new double[DIM][DIM];
            __CLR4_4_124f924f9lb90pdzc.R.inc(99391);for (i = 0; (((i < DIM)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99392)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99393)==0&false)); ++i) {{
                /* sample components gaussian */
                __CLR4_4_124f924f9lb90pdzc.R.inc(99394);for (j = 0; (((j < DIM)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99395)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99396)==0&false)); ++j)
                    {__CLR4_4_124f924f9lb90pdzc.R.inc(99397);basis[i][j] = rand.nextGaussian();
                /* substract projection of previous vectors */
                }__CLR4_4_124f924f9lb90pdzc.R.inc(99398);for (j = i - 1; (((j >= 0)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99399)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99400)==0&false)); --j) {{
                    __CLR4_4_124f924f9lb90pdzc.R.inc(99401);for (sp = 0., k = 0; (((k < DIM)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99402)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99403)==0&false)); ++k)
                        {__CLR4_4_124f924f9lb90pdzc.R.inc(99404);sp += basis[i][k] * basis[j][k]; /* scalar product */
                    }__CLR4_4_124f924f9lb90pdzc.R.inc(99405);for (k = 0; (((k < DIM)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99406)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99407)==0&false)); ++k)
                        {__CLR4_4_124f924f9lb90pdzc.R.inc(99408);basis[i][k] -= sp * basis[j][k]; /* substract */
                }}
                /* normalize */
                }__CLR4_4_124f924f9lb90pdzc.R.inc(99409);for (sp = 0., k = 0; (((k < DIM)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99410)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99411)==0&false)); ++k)
                    {__CLR4_4_124f924f9lb90pdzc.R.inc(99412);sp += basis[i][k] * basis[i][k]; /* squared norm */
                }__CLR4_4_124f924f9lb90pdzc.R.inc(99413);for (k = 0; (((k < DIM)&&(__CLR4_4_124f924f9lb90pdzc.R.iget(99414)!=0|true))||(__CLR4_4_124f924f9lb90pdzc.R.iget(99415)==0&false)); ++k)
                    {__CLR4_4_124f924f9lb90pdzc.R.inc(99416);basis[i][k] /= Math.sqrt(sp);
            }}
        }}finally{__CLR4_4_124f924f9lb90pdzc.R.flushNeeded();}}
    }
}
