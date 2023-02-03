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

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.SimpleBounds;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test for {@link BOBYQAOptimizer}.
 */
public class BOBYQAOptimizerTest {static class __CLR4_4_1246u246ulb90pdyv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,99045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final int DIM = 13;
   
    @Test(expected=NumberIsTooLargeException.class)
    public void testInitOutOfBounds() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xr7itb246u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,79,117,116,79,102,66,111,117,110,100,115,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testInitOutOfBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xr7itb246u(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98742);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98743);double[] startPoint = point(DIM, 3);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98744);double[][] boundaries = boundaries(DIM, -1, 2);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98745);doTest(new Rosen(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 2000, null);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    
    @Test(expected=DimensionMismatchException.class)
    public void testBoundariesDimensionMismatch() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ks6zun246y();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,111,117,110,100,97,114,105,101,115,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testBoundariesDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ks6zun246y(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98746);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98747);double[] startPoint = point(DIM, 0.5);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98748);double[][] boundaries = boundaries(DIM + 1, -1, 2);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98749);doTest(new Rosen(), startPoint, boundaries,
               GoalType.MINIMIZE, 
               1e-13, 1e-6, 2000, null);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test(expected=NumberIsTooSmallException.class)
    public void testProblemDimensionTooSmall() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1di2mur2472();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,111,98,108,101,109,68,105,109,101,110,115,105,111,110,84,111,111,83,109,97,108,108,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testProblemDimensionTooSmall",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1di2mur2472(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98750);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98751);double[] startPoint = point(1, 0.5);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98752);doTest(new Rosen(), startPoint, null,
               GoalType.MINIMIZE,
               1e-13, 1e-6, 2000, null);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test(expected=TooManyEvaluationsException.class)
    public void testMaxEvaluations() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7mzqs2475();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,69,118,97,108,117,97,116,105,111,110,115,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testMaxEvaluations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7mzqs2475(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98753);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98754);final int lowMaxEval = 2;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98755);double[] startPoint = point(DIM, 0.1);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98756);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98757);doTest(new Rosen(), startPoint, boundaries,
               GoalType.MINIMIZE, 
               1e-13, 1e-6, lowMaxEval, null);
     }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testRosen() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mh4ks4247a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mh4ks4247a(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98758);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98759);double[] startPoint = point(DIM,0.1);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98760);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98761);PointValuePair expected = new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98762);doTest(new Rosen(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 2000, expected);
     }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testMaximize() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ww16t247f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testMaximize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ww16t247f(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98763);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98764);double[] startPoint = point(DIM,1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98765);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98766);PointValuePair expected = new PointValuePair(point(DIM,0.0),1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98767);doTest(new MinusElli(), startPoint, boundaries,
                GoalType.MAXIMIZE, 
                2e-10, 5e-6, 1000, expected);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98768);boundaries = boundaries(DIM,-0.3,0.3); 
        __CLR4_4_1246u246ulb90pdyv.R.inc(98769);startPoint = point(DIM,0.1);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98770);doTest(new MinusElli(), startPoint, boundaries,
                GoalType.MAXIMIZE, 
                2e-10, 5e-6, 1000, expected);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testEllipse() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fb0cwd247n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testEllipse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fb0cwd247n(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98771);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98772);double[] startPoint = point(DIM,1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98773);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98774);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98775);doTest(new Elli(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 1000, expected);
     }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testElliRotated() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1es5oyu247s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testElliRotated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1es5oyu247s(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98776);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98777);double[] startPoint = point(DIM,1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98778);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98779);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98780);doTest(new ElliRotated(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-12, 1e-6, 10000, expected);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testCigar() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s79tz247x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testCigar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s79tz247x(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98781);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98782);double[] startPoint = point(DIM,1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98783);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98784);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98785);doTest(new Cigar(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 100, expected);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testTwoAxes() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198vkl62482();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testTwoAxes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198vkl62482(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98786);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98787);double[] startPoint = point(DIM,1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98788);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98789);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98790);doTest(new TwoAxes(), startPoint, boundaries,
                GoalType.MINIMIZE, 2*
                1e-13, 1e-6, 100, expected);
     }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testCigTab() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqlxal2487();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testCigTab",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqlxal2487(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98791);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98792);double[] startPoint = point(DIM,1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98793);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98794);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98795);doTest(new CigTab(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 5e-5, 100, expected);
     }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testSphere() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ut81gm248c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testSphere",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ut81gm248c(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98796);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98797);double[] startPoint = point(DIM,1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98798);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98799);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98800);doTest(new Sphere(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 100, expected);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testTablet() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yqqld248h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testTablet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yqqld248h(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98801);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98802);double[] startPoint = point(DIM,1.0); 
        __CLR4_4_1246u246ulb90pdyv.R.inc(98803);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98804);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98805);doTest(new Tablet(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 100, expected);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testDiffPow() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qhzg8248m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testDiffPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qhzg8248m(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98806);}finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testDiffPow() {
//         double[] startPoint = point(DIM/2,1.0);
//         double[][] boundaries = null;
//         PointValuePair expected =
//             new PointValuePair(point(DIM/2,0.0),0.0);
//         doTest(new DiffPow(), startPoint, boundaries,
//                 GoalType.MINIMIZE, 
//                 1e-8, 1e-1, 12000, expected);
//     }

    @Test
    public void testSsDiffPow() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivx0vs248n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testSsDiffPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivx0vs248n(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98807);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98808);double[] startPoint = point(DIM/2,1.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98809);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98810);PointValuePair expected =
            new PointValuePair(point(DIM/2,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98811);doTest(new SsDiffPow(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-2, 1.3e-1, 50000, expected);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testAckley() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luwii8248s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testAckley",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luwii8248s(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98812);}finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testAckley() {
//         double[] startPoint = point(DIM,0.1);
//         double[][] boundaries = null;
//         PointValuePair expected =
//             new PointValuePair(point(DIM,0.0),0.0);
//         doTest(new Ackley(), startPoint, boundaries,
//                 GoalType.MINIMIZE,
//                 1e-8, 1e-5, 1000, expected);
//     }

    @Test
    public void testRastrigin() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16uup0m248t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testRastrigin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16uup0m248t(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98813);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98814);double[] startPoint = point(DIM,1.0);

        __CLR4_4_1246u246ulb90pdyv.R.inc(98815);double[][] boundaries = null;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98816);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98817);doTest(new Rastrigin(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 1000, expected);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    @Test
    public void testConstrainedRosen() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2y23i248y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testConstrainedRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2y23i248y(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98818);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98819);double[] startPoint = point(DIM,0.1);

        __CLR4_4_1246u246ulb90pdyv.R.inc(98820);double[][] boundaries = boundaries(DIM,-1,2);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98821);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98822);doTest(new Rosen(), startPoint, boundaries,
                GoalType.MINIMIZE,
                1e-13, 1e-6, 2000, expected);
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    // See MATH-728
    // TODO: this test is temporarily disabled for 3.2 release as a bug in Cobertura
    //       makes it run for several hours before completing
    @Ignore @Test
    public void testConstrainedRosenWithMoreInterpolationPoints() {__CLR4_4_1246u246ulb90pdyv.R.globalSliceStart(getClass().getName(),98823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qsei02493();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246u246ulb90pdyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246u246ulb90pdyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest.testConstrainedRosenWithMoreInterpolationPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qsei02493(){try{__CLR4_4_1246u246ulb90pdyv.R.inc(98823);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98824);final double[] startPoint = point(DIM, 0.1);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98825);final double[][] boundaries = boundaries(DIM, -1, 2);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98826);final PointValuePair expected = new PointValuePair(point(DIM, 1.0), 0.0);

        // This should have been 78 because in the code the hard limit is
        // said to be
        //   ((DIM + 1) * (DIM + 2)) / 2 - (2 * DIM + 1)
        // i.e. 78 in this case, but the test fails for 48, 59, 62, 63, 64,
        // 65, 66, ...
        __CLR4_4_1246u246ulb90pdyv.R.inc(98827);final int maxAdditionalPoints = 47;

        __CLR4_4_1246u246ulb90pdyv.R.inc(98828);for (int num = 1; (((num <= maxAdditionalPoints)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98829)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98830)==0&false)); num++) {{
            __CLR4_4_1246u246ulb90pdyv.R.inc(98831);doTest(new Rosen(), startPoint, boundaries,
                   GoalType.MINIMIZE,
                   1e-12, 1e-6, 2000,
                   num,
                   expected,
                   "num=" + num);
        }
    }}finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    /**
     * @param func Function to optimize.
     * @param startPoint Starting point.
     * @param boundaries Upper / lower point limit.
     * @param goal Minimization or maximization.
     * @param fTol Tolerance relative error on the objective function.
     * @param pointTol Tolerance for checking that the optimum is correct.
     * @param maxEvaluations Maximum number of evaluations.
     * @param expected Expected point / value.
     */
    private void doTest(MultivariateFunction func,
                        double[] startPoint,
                        double[][] boundaries,
                        GoalType goal,
                        double fTol,
                        double pointTol,
                        int maxEvaluations,
                        PointValuePair expected) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98832);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98833);doTest(func,
               startPoint,
               boundaries,
               goal,
               fTol,
               pointTol,
               maxEvaluations,
               0,
               expected,
               "");
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    /**
     * @param func Function to optimize.
     * @param startPoint Starting point.
     * @param boundaries Upper / lower point limit.
     * @param goal Minimization or maximization.
     * @param fTol Tolerance relative error on the objective function.
     * @param pointTol Tolerance for checking that the optimum is correct.
     * @param maxEvaluations Maximum number of evaluations.
     * @param additionalInterpolationPoints Number of interpolation to used
     * in addition to the default (2 * dim + 1).
     * @param expected Expected point / value.
     */
    private void doTest(MultivariateFunction func,
                        double[] startPoint,
                        double[][] boundaries,
                        GoalType goal,
                        double fTol,
                        double pointTol,
                        int maxEvaluations,
                        int additionalInterpolationPoints,
                        PointValuePair expected,
                        String assertMsg) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98834);

//         System.out.println(func.getClass().getName() + " BEGIN"); // XXX

        __CLR4_4_1246u246ulb90pdyv.R.inc(98835);int dim = startPoint.length;
//        MultivariateOptimizer optim =
//            new PowellOptimizer(1e-13, Math.ulp(1d));
//        PointValuePair result = optim.optimize(100000, func, goal, startPoint);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98836);final double[] lB = (((boundaries == null )&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98837)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98838)==0&false))? null : boundaries[0];
        __CLR4_4_1246u246ulb90pdyv.R.inc(98839);final double[] uB = (((boundaries == null )&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98840)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98841)==0&false))? null : boundaries[1];
        __CLR4_4_1246u246ulb90pdyv.R.inc(98842);final int numIterpolationPoints = 2 * dim + 1 + additionalInterpolationPoints;
        __CLR4_4_1246u246ulb90pdyv.R.inc(98843);BOBYQAOptimizer optim = new BOBYQAOptimizer(numIterpolationPoints);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98844);PointValuePair result = (((boundaries == null )&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98845)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98846)==0&false))?
            optim.optimize(maxEvaluations, func, goal,
                           new InitialGuess(startPoint)) :
            optim.optimize(maxEvaluations, func, goal,
                           new InitialGuess(startPoint),
                           new SimpleBounds(lB, uB));
//        System.out.println(func.getClass().getName() + " = " 
//              + optim.getEvaluations() + " f(");
//        for (double x: result.getPoint())  System.out.print(x + " ");
//        System.out.println(") = " +  result.getValue());
        __CLR4_4_1246u246ulb90pdyv.R.inc(98847);Assert.assertEquals(assertMsg, expected.getValue(), result.getValue(), fTol);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98848);for (int i = 0; (((i < dim)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98849)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98850)==0&false)); i++) {{
            __CLR4_4_1246u246ulb90pdyv.R.inc(98851);Assert.assertEquals(expected.getPoint()[i],
                                result.getPoint()[i], pointTol);
        }

//         System.out.println(func.getClass().getName() + " END"); // XXX
    }}finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    private static double[] point(int n, double value) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98852);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98853);double[] ds = new double[n];
        __CLR4_4_1246u246ulb90pdyv.R.inc(98854);Arrays.fill(ds, value);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98855);return ds;
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    private static double[][] boundaries(int dim,
            double lower, double upper) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98856);
        __CLR4_4_1246u246ulb90pdyv.R.inc(98857);double[][] boundaries = new double[2][dim];
        __CLR4_4_1246u246ulb90pdyv.R.inc(98858);for (int i = 0; (((i < dim)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98859)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98860)==0&false)); i++)
            {__CLR4_4_1246u246ulb90pdyv.R.inc(98861);boundaries[0][i] = lower;
        }__CLR4_4_1246u246ulb90pdyv.R.inc(98862);for (int i = 0; (((i < dim)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98863)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98864)==0&false)); i++)
            {__CLR4_4_1246u246ulb90pdyv.R.inc(98865);boundaries[1][i] = upper;
        }__CLR4_4_1246u246ulb90pdyv.R.inc(98866);return boundaries;
    }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

    private static class Sphere implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98867);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98868);double f = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98869);for (int i = 0; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98870)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98871)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98872);f += x[i] * x[i];
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98873);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class Cigar implements MultivariateFunction {
        private double factor;

        Cigar() {
            this(1e3);__CLR4_4_1246u246ulb90pdyv.R.inc(98875);try{__CLR4_4_1246u246ulb90pdyv.R.inc(98874);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        Cigar(double axisratio) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98876);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98877);factor = axisratio * axisratio;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98878);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98879);double f = x[0] * x[0];
            __CLR4_4_1246u246ulb90pdyv.R.inc(98880);for (int i = 1; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98881)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98882)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98883);f += factor * x[i] * x[i];
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98884);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class Tablet implements MultivariateFunction {
        private double factor;

        Tablet() {
            this(1e3);__CLR4_4_1246u246ulb90pdyv.R.inc(98886);try{__CLR4_4_1246u246ulb90pdyv.R.inc(98885);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        Tablet(double axisratio) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98887);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98888);factor = axisratio * axisratio;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98889);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98890);double f = factor * x[0] * x[0];
            __CLR4_4_1246u246ulb90pdyv.R.inc(98891);for (int i = 1; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98892)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98893)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98894);f += x[i] * x[i];
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98895);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class CigTab implements MultivariateFunction {
        private double factor;

        CigTab() {
            this(1e4);__CLR4_4_1246u246ulb90pdyv.R.inc(98897);try{__CLR4_4_1246u246ulb90pdyv.R.inc(98896);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        CigTab(double axisratio) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98898);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98899);factor = axisratio;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98900);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98901);int end = x.length - 1;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98902);double f = x[0] * x[0] / factor + factor * x[end] * x[end];
            __CLR4_4_1246u246ulb90pdyv.R.inc(98903);for (int i = 1; (((i < end)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98904)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98905)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98906);f += x[i] * x[i];
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98907);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class TwoAxes implements MultivariateFunction {

        private double factor;

        TwoAxes() {
            this(1e6);__CLR4_4_1246u246ulb90pdyv.R.inc(98909);try{__CLR4_4_1246u246ulb90pdyv.R.inc(98908);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        TwoAxes(double axisratio) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98910);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98911);factor = axisratio * axisratio;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98912);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98913);double f = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98914);for (int i = 0; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98915)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98916)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98917);f += ((((i < x.length / 2 )&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98918)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98919)==0&false))? factor : 1) * x[i] * x[i];
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98920);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class ElliRotated implements MultivariateFunction {
        private Basis B = new Basis();
        private double factor;

        ElliRotated() {
            this(1e3);__CLR4_4_1246u246ulb90pdyv.R.inc(98922);try{__CLR4_4_1246u246ulb90pdyv.R.inc(98921);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        ElliRotated(double axisratio) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98923);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98924);factor = axisratio * axisratio;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98925);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98926);double f = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98927);x = B.Rotate(x);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98928);for (int i = 0; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98929)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98930)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98931);f += Math.pow(factor, i / (x.length - 1.)) * x[i] * x[i];
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98932);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class Elli implements MultivariateFunction {

        private double factor;

        Elli() {
            this(1e3);__CLR4_4_1246u246ulb90pdyv.R.inc(98934);try{__CLR4_4_1246u246ulb90pdyv.R.inc(98933);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        Elli(double axisratio) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98935);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98936);factor = axisratio * axisratio;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98937);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98938);double f = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98939);for (int i = 0; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98940)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98941)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98942);f += Math.pow(factor, i / (x.length - 1.)) * x[i] * x[i];
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98943);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class MinusElli implements MultivariateFunction {
        private final Elli elli = new Elli();
        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98944);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98945);return 1.0 - elli.value(x);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class DiffPow implements MultivariateFunction {
//        private int fcount = 0;
        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98946);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98947);double f = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98948);for (int i = 0; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98949)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98950)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98951);f += Math.pow(Math.abs(x[i]), 2. + 10 * (double) i
                        / (x.length - 1.));
//            System.out.print("" + (fcount++) + ") ");
//            for (int i = 0; i < x.length; i++)
//                System.out.print(x[i] +  " ");
//            System.out.println(" = " + f);
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98952);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class SsDiffPow implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98953);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98954);double f = Math.pow(new DiffPow().value(x), 0.25);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98955);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class Rosen implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98956);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98957);double f = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98958);for (int i = 0; (((i < x.length - 1)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98959)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98960)==0&false)); ++i)
                {__CLR4_4_1246u246ulb90pdyv.R.inc(98961);f += 1e2 * (x[i] * x[i] - x[i + 1]) * (x[i] * x[i] - x[i + 1])
                + (x[i] - 1.) * (x[i] - 1.);
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98962);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class Ackley implements MultivariateFunction {
        private double axisratio;

        Ackley(double axra) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98963);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98964);axisratio = axra;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public Ackley() {
            this(1);__CLR4_4_1246u246ulb90pdyv.R.inc(98966);try{__CLR4_4_1246u246ulb90pdyv.R.inc(98965);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98967);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98968);double f = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98969);double res2 = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98970);double fac = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98971);for (int i = 0; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98972)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98973)==0&false)); ++i) {{
                __CLR4_4_1246u246ulb90pdyv.R.inc(98974);fac = Math.pow(axisratio, (i - 1.) / (x.length - 1.));
                __CLR4_4_1246u246ulb90pdyv.R.inc(98975);f += fac * fac * x[i] * x[i];
                __CLR4_4_1246u246ulb90pdyv.R.inc(98976);res2 += Math.cos(2. * Math.PI * fac * x[i]);
            }
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98977);f = (20. - 20. * Math.exp(-0.2 * Math.sqrt(f / x.length))
                    + Math.exp(1.) - Math.exp(res2 / x.length));
            __CLR4_4_1246u246ulb90pdyv.R.inc(98978);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class Rastrigin implements MultivariateFunction {

        private double axisratio;
        private double amplitude;

        Rastrigin() {
            this(1, 10);__CLR4_4_1246u246ulb90pdyv.R.inc(98980);try{__CLR4_4_1246u246ulb90pdyv.R.inc(98979);
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        Rastrigin(double axisratio, double amplitude) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98981);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98982);this.axisratio = axisratio;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98983);this.amplitude = amplitude;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98984);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98985);double f = 0;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98986);double fac;
            __CLR4_4_1246u246ulb90pdyv.R.inc(98987);for (int i = 0; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98988)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98989)==0&false)); ++i) {{
                __CLR4_4_1246u246ulb90pdyv.R.inc(98990);fac = Math.pow(axisratio, (i - 1.) / (x.length - 1.));
                __CLR4_4_1246u246ulb90pdyv.R.inc(98991);if ((((i == 0 && x[i] < 0)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(98992)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(98993)==0&false)))
                    {__CLR4_4_1246u246ulb90pdyv.R.inc(98994);fac *= 1.;
                }__CLR4_4_1246u246ulb90pdyv.R.inc(98995);f += fac * fac * x[i] * x[i] + amplitude
                * (1. - Math.cos(2. * Math.PI * fac * x[i]));
            }
            }__CLR4_4_1246u246ulb90pdyv.R.inc(98996);return f;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }

    private static class Basis {
        double[][] basis;
        Random rand = new Random(2); // use not always the same basis

        double[] Rotate(double[] x) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(98997);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98998);GenBasis(x.length);
            __CLR4_4_1246u246ulb90pdyv.R.inc(98999);double[] y = new double[x.length];
            __CLR4_4_1246u246ulb90pdyv.R.inc(99000);for (int i = 0; (((i < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99001)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99002)==0&false)); ++i) {{
                __CLR4_4_1246u246ulb90pdyv.R.inc(99003);y[i] = 0;
                __CLR4_4_1246u246ulb90pdyv.R.inc(99004);for (int j = 0; (((j < x.length)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99005)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99006)==0&false)); ++j)
                    {__CLR4_4_1246u246ulb90pdyv.R.inc(99007);y[i] += basis[i][j] * x[j];
            }}
            }__CLR4_4_1246u246ulb90pdyv.R.inc(99008);return y;
        }finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}

        void GenBasis(int DIM) {try{__CLR4_4_1246u246ulb90pdyv.R.inc(99009);
            __CLR4_4_1246u246ulb90pdyv.R.inc(99010);if (((((((basis != null )&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99011)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99012)==0&false))? basis.length == DIM : false)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99013)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99014)==0&false)))
                {__CLR4_4_1246u246ulb90pdyv.R.inc(99015);return;

            }__CLR4_4_1246u246ulb90pdyv.R.inc(99016);double sp;
            __CLR4_4_1246u246ulb90pdyv.R.inc(99017);int i, j, k;

            /* generate orthogonal basis */
            __CLR4_4_1246u246ulb90pdyv.R.inc(99018);basis = new double[DIM][DIM];
            __CLR4_4_1246u246ulb90pdyv.R.inc(99019);for (i = 0; (((i < DIM)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99020)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99021)==0&false)); ++i) {{
                /* sample components gaussian */
                __CLR4_4_1246u246ulb90pdyv.R.inc(99022);for (j = 0; (((j < DIM)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99023)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99024)==0&false)); ++j)
                    {__CLR4_4_1246u246ulb90pdyv.R.inc(99025);basis[i][j] = rand.nextGaussian();
                /* substract projection of previous vectors */
                }__CLR4_4_1246u246ulb90pdyv.R.inc(99026);for (j = i - 1; (((j >= 0)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99027)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99028)==0&false)); --j) {{
                    __CLR4_4_1246u246ulb90pdyv.R.inc(99029);for (sp = 0., k = 0; (((k < DIM)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99030)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99031)==0&false)); ++k)
                        {__CLR4_4_1246u246ulb90pdyv.R.inc(99032);sp += basis[i][k] * basis[j][k]; /* scalar product */
                    }__CLR4_4_1246u246ulb90pdyv.R.inc(99033);for (k = 0; (((k < DIM)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99034)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99035)==0&false)); ++k)
                        {__CLR4_4_1246u246ulb90pdyv.R.inc(99036);basis[i][k] -= sp * basis[j][k]; /* substract */
                }}
                /* normalize */
                }__CLR4_4_1246u246ulb90pdyv.R.inc(99037);for (sp = 0., k = 0; (((k < DIM)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99038)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99039)==0&false)); ++k)
                    {__CLR4_4_1246u246ulb90pdyv.R.inc(99040);sp += basis[i][k] * basis[i][k]; /* squared norm */
                }__CLR4_4_1246u246ulb90pdyv.R.inc(99041);for (k = 0; (((k < DIM)&&(__CLR4_4_1246u246ulb90pdyv.R.iget(99042)!=0|true))||(__CLR4_4_1246u246ulb90pdyv.R.iget(99043)==0&false)); ++k)
                    {__CLR4_4_1246u246ulb90pdyv.R.inc(99044);basis[i][k] /= Math.sqrt(sp);
            }}
        }}finally{__CLR4_4_1246u246ulb90pdyv.R.flushNeeded();}}
    }
}
