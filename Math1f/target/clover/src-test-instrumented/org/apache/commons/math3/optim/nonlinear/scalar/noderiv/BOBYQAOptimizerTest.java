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
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.SimpleBounds;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test for {@link BOBYQAOptimizer}.
 */
public class BOBYQAOptimizerTest {static class __CLR4_4_121on21onlb90pdsm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,95792,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final int DIM = 13;
   
    @Test(expected=NumberIsTooLargeException.class)
    public void testInitOutOfBounds() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xr7itb21on();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,79,117,116,79,102,66,111,117,110,100,115,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testInitOutOfBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xr7itb21on(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95495);
        __CLR4_4_121on21onlb90pdsm.R.inc(95496);double[] startPoint = point(DIM, 3);
        __CLR4_4_121on21onlb90pdsm.R.inc(95497);double[][] boundaries = boundaries(DIM, -1, 2);
        __CLR4_4_121on21onlb90pdsm.R.inc(95498);doTest(new Rosen(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 2000, null);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    
    @Test(expected=DimensionMismatchException.class)
    public void testBoundariesDimensionMismatch() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ks6zun21or();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,111,117,110,100,97,114,105,101,115,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testBoundariesDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ks6zun21or(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95499);
        __CLR4_4_121on21onlb90pdsm.R.inc(95500);double[] startPoint = point(DIM, 0.5);
        __CLR4_4_121on21onlb90pdsm.R.inc(95501);double[][] boundaries = boundaries(DIM + 1, -1, 2);
        __CLR4_4_121on21onlb90pdsm.R.inc(95502);doTest(new Rosen(), startPoint, boundaries,
               GoalType.MINIMIZE, 
               1e-13, 1e-6, 2000, null);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test(expected=NumberIsTooSmallException.class)
    public void testProblemDimensionTooSmall() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1di2mur21ov();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,111,98,108,101,109,68,105,109,101,110,115,105,111,110,84,111,111,83,109,97,108,108,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testProblemDimensionTooSmall",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1di2mur21ov(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95503);
        __CLR4_4_121on21onlb90pdsm.R.inc(95504);double[] startPoint = point(1, 0.5);
        __CLR4_4_121on21onlb90pdsm.R.inc(95505);doTest(new Rosen(), startPoint, null,
               GoalType.MINIMIZE,
               1e-13, 1e-6, 2000, null);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test(expected=TooManyEvaluationsException.class)
    public void testMaxEvaluations() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7mzqs21oy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,69,118,97,108,117,97,116,105,111,110,115,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testMaxEvaluations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7mzqs21oy(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95506);
        __CLR4_4_121on21onlb90pdsm.R.inc(95507);final int lowMaxEval = 2;
        __CLR4_4_121on21onlb90pdsm.R.inc(95508);double[] startPoint = point(DIM, 0.1);
        __CLR4_4_121on21onlb90pdsm.R.inc(95509);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95510);doTest(new Rosen(), startPoint, boundaries,
               GoalType.MINIMIZE, 
               1e-13, 1e-6, lowMaxEval, null);
     }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testRosen() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mh4ks421p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mh4ks421p3(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95511);
        __CLR4_4_121on21onlb90pdsm.R.inc(95512);double[] startPoint = point(DIM,0.1);
        __CLR4_4_121on21onlb90pdsm.R.inc(95513);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95514);PointValuePair expected = new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95515);doTest(new Rosen(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 2000, expected);
     }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testMaximize() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ww16t21p8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testMaximize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ww16t21p8(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95516);
        __CLR4_4_121on21onlb90pdsm.R.inc(95517);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95518);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95519);PointValuePair expected = new PointValuePair(point(DIM,0.0),1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95520);doTest(new MinusElli(), startPoint, boundaries,
                GoalType.MAXIMIZE, 
                2e-10, 5e-6, 1000, expected);
        __CLR4_4_121on21onlb90pdsm.R.inc(95521);boundaries = boundaries(DIM,-0.3,0.3); 
        __CLR4_4_121on21onlb90pdsm.R.inc(95522);startPoint = point(DIM,0.1);
        __CLR4_4_121on21onlb90pdsm.R.inc(95523);doTest(new MinusElli(), startPoint, boundaries,
                GoalType.MAXIMIZE, 
                2e-10, 5e-6, 1000, expected);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testEllipse() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fb0cwd21pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testEllipse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fb0cwd21pg(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95524);
        __CLR4_4_121on21onlb90pdsm.R.inc(95525);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95526);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95527);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95528);doTest(new Elli(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 1000, expected);
     }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testElliRotated() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1es5oyu21pl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testElliRotated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1es5oyu21pl(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95529);
        __CLR4_4_121on21onlb90pdsm.R.inc(95530);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95531);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95532);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95533);doTest(new ElliRotated(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-12, 1e-6, 10000, expected);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testCigar() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s79tz21pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testCigar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s79tz21pq(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95534);
        __CLR4_4_121on21onlb90pdsm.R.inc(95535);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95536);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95537);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95538);doTest(new Cigar(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 100, expected);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testTwoAxes() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198vkl621pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testTwoAxes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198vkl621pv(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95539);
        __CLR4_4_121on21onlb90pdsm.R.inc(95540);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95541);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95542);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95543);doTest(new TwoAxes(), startPoint, boundaries,
                GoalType.MINIMIZE, 2*
                1e-13, 1e-6, 100, expected);
     }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testCigTab() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqlxal21q0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testCigTab",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqlxal21q0(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95544);
        __CLR4_4_121on21onlb90pdsm.R.inc(95545);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95546);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95547);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95548);doTest(new CigTab(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 5e-5, 100, expected);
     }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testSphere() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ut81gm21q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testSphere",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ut81gm21q5(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95549);
        __CLR4_4_121on21onlb90pdsm.R.inc(95550);double[] startPoint = point(DIM,1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95551);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95552);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95553);doTest(new Sphere(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 100, expected);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testTablet() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yqqld21qa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testTablet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yqqld21qa(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95554);
        __CLR4_4_121on21onlb90pdsm.R.inc(95555);double[] startPoint = point(DIM,1.0); 
        __CLR4_4_121on21onlb90pdsm.R.inc(95556);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95557);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95558);doTest(new Tablet(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 100, expected);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testDiffPow() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qhzg821qf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testDiffPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qhzg821qf(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95559);}finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
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
    public void testSsDiffPow() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivx0vs21qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testSsDiffPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivx0vs21qg(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95560);
        __CLR4_4_121on21onlb90pdsm.R.inc(95561);double[] startPoint = point(DIM/2,1.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95562);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95563);PointValuePair expected =
            new PointValuePair(point(DIM/2,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95564);doTest(new SsDiffPow(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-2, 1.3e-1, 50000, expected);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testAckley() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luwii821ql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testAckley",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luwii821ql(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95565);}finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
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
    public void testRastrigin() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16uup0m21qm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testRastrigin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16uup0m21qm(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95566);
        __CLR4_4_121on21onlb90pdsm.R.inc(95567);double[] startPoint = point(DIM,1.0);

        __CLR4_4_121on21onlb90pdsm.R.inc(95568);double[][] boundaries = null;
        __CLR4_4_121on21onlb90pdsm.R.inc(95569);PointValuePair expected =
            new PointValuePair(point(DIM,0.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95570);doTest(new Rastrigin(), startPoint, boundaries,
                GoalType.MINIMIZE, 
                1e-13, 1e-6, 1000, expected);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    @Test
    public void testConstrainedRosen() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2y23i21qr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testConstrainedRosen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2y23i21qr(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95571);
        __CLR4_4_121on21onlb90pdsm.R.inc(95572);double[] startPoint = point(DIM,0.1);

        __CLR4_4_121on21onlb90pdsm.R.inc(95573);double[][] boundaries = boundaries(DIM,-1,2);
        __CLR4_4_121on21onlb90pdsm.R.inc(95574);PointValuePair expected =
            new PointValuePair(point(DIM,1.0),0.0);
        __CLR4_4_121on21onlb90pdsm.R.inc(95575);doTest(new Rosen(), startPoint, boundaries,
                GoalType.MINIMIZE,
                1e-13, 1e-6, 2000, expected);
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    // See MATH-728
    // TODO: this test is temporarily disabled for 3.2 release as a bug in Cobertura
    //       makes it run for several hours before completing
    @Ignore @Test
    public void testConstrainedRosenWithMoreInterpolationPoints() {__CLR4_4_121on21onlb90pdsm.R.globalSliceStart(getClass().getName(),95576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qsei021qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121on21onlb90pdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_121on21onlb90pdsm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizerTest.testConstrainedRosenWithMoreInterpolationPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qsei021qw(){try{__CLR4_4_121on21onlb90pdsm.R.inc(95576);
        __CLR4_4_121on21onlb90pdsm.R.inc(95577);final double[] startPoint = point(DIM, 0.1);
        __CLR4_4_121on21onlb90pdsm.R.inc(95578);final double[][] boundaries = boundaries(DIM, -1, 2);
        __CLR4_4_121on21onlb90pdsm.R.inc(95579);final PointValuePair expected = new PointValuePair(point(DIM, 1.0), 0.0);

        // This should have been 78 because in the code the hard limit is
        // said to be
        //   ((DIM + 1) * (DIM + 2)) / 2 - (2 * DIM + 1)
        // i.e. 78 in this case, but the test fails for 48, 59, 62, 63, 64,
        // 65, 66, ...
        __CLR4_4_121on21onlb90pdsm.R.inc(95580);final int maxAdditionalPoints = 47;

        __CLR4_4_121on21onlb90pdsm.R.inc(95581);for (int num = 1; (((num <= maxAdditionalPoints)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95582)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95583)==0&false)); num++) {{
            __CLR4_4_121on21onlb90pdsm.R.inc(95584);doTest(new Rosen(), startPoint, boundaries,
                   GoalType.MINIMIZE,
                   1e-12, 1e-6, 2000,
                   num,
                   expected,
                   "num=" + num);
        }
    }}finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

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
                        PointValuePair expected) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95585);
        __CLR4_4_121on21onlb90pdsm.R.inc(95586);doTest(func,
               startPoint,
               boundaries,
               goal,
               fTol,
               pointTol,
               maxEvaluations,
               0,
               expected,
               "");
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

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
                        String assertMsg) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95587);

//         System.out.println(func.getClass().getName() + " BEGIN"); // XXX

        __CLR4_4_121on21onlb90pdsm.R.inc(95588);int dim = startPoint.length;
        __CLR4_4_121on21onlb90pdsm.R.inc(95589);final int numIterpolationPoints = 2 * dim + 1 + additionalInterpolationPoints;
        __CLR4_4_121on21onlb90pdsm.R.inc(95590);BOBYQAOptimizer optim = new BOBYQAOptimizer(numIterpolationPoints);
        __CLR4_4_121on21onlb90pdsm.R.inc(95591);PointValuePair result = (((boundaries == null )&&(__CLR4_4_121on21onlb90pdsm.R.iget(95592)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95593)==0&false))?
            optim.optimize(new MaxEval(maxEvaluations),
                           new ObjectiveFunction(func),
                           goal,
                           SimpleBounds.unbounded(dim),
                           new InitialGuess(startPoint)) :
            optim.optimize(new MaxEval(maxEvaluations),
                           new ObjectiveFunction(func),
                           goal,
                           new InitialGuess(startPoint),
                           new SimpleBounds(boundaries[0],
                                            boundaries[1]));
//        System.out.println(func.getClass().getName() + " = " 
//              + optim.getEvaluations() + " f(");
//        for (double x: result.getPoint())  System.out.print(x + " ");
//        System.out.println(") = " +  result.getValue());
        __CLR4_4_121on21onlb90pdsm.R.inc(95594);Assert.assertEquals(assertMsg, expected.getValue(), result.getValue(), fTol);
        __CLR4_4_121on21onlb90pdsm.R.inc(95595);for (int i = 0; (((i < dim)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95596)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95597)==0&false)); i++) {{
            __CLR4_4_121on21onlb90pdsm.R.inc(95598);Assert.assertEquals(expected.getPoint()[i],
                                result.getPoint()[i], pointTol);
        }

//         System.out.println(func.getClass().getName() + " END"); // XXX
    }}finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    private static double[] point(int n, double value) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95599);
        __CLR4_4_121on21onlb90pdsm.R.inc(95600);double[] ds = new double[n];
        __CLR4_4_121on21onlb90pdsm.R.inc(95601);Arrays.fill(ds, value);
        __CLR4_4_121on21onlb90pdsm.R.inc(95602);return ds;
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    private static double[][] boundaries(int dim,
            double lower, double upper) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95603);
        __CLR4_4_121on21onlb90pdsm.R.inc(95604);double[][] boundaries = new double[2][dim];
        __CLR4_4_121on21onlb90pdsm.R.inc(95605);for (int i = 0; (((i < dim)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95606)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95607)==0&false)); i++)
            {__CLR4_4_121on21onlb90pdsm.R.inc(95608);boundaries[0][i] = lower;
        }__CLR4_4_121on21onlb90pdsm.R.inc(95609);for (int i = 0; (((i < dim)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95610)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95611)==0&false)); i++)
            {__CLR4_4_121on21onlb90pdsm.R.inc(95612);boundaries[1][i] = upper;
        }__CLR4_4_121on21onlb90pdsm.R.inc(95613);return boundaries;
    }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

    private static class Sphere implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95614);
            __CLR4_4_121on21onlb90pdsm.R.inc(95615);double f = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95616);for (int i = 0; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95617)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95618)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95619);f += x[i] * x[i];
            }__CLR4_4_121on21onlb90pdsm.R.inc(95620);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class Cigar implements MultivariateFunction {
        private double factor;

        Cigar() {
            this(1e3);__CLR4_4_121on21onlb90pdsm.R.inc(95622);try{__CLR4_4_121on21onlb90pdsm.R.inc(95621);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        Cigar(double axisratio) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95623);
            __CLR4_4_121on21onlb90pdsm.R.inc(95624);factor = axisratio * axisratio;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95625);
            __CLR4_4_121on21onlb90pdsm.R.inc(95626);double f = x[0] * x[0];
            __CLR4_4_121on21onlb90pdsm.R.inc(95627);for (int i = 1; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95628)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95629)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95630);f += factor * x[i] * x[i];
            }__CLR4_4_121on21onlb90pdsm.R.inc(95631);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class Tablet implements MultivariateFunction {
        private double factor;

        Tablet() {
            this(1e3);__CLR4_4_121on21onlb90pdsm.R.inc(95633);try{__CLR4_4_121on21onlb90pdsm.R.inc(95632);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        Tablet(double axisratio) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95634);
            __CLR4_4_121on21onlb90pdsm.R.inc(95635);factor = axisratio * axisratio;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95636);
            __CLR4_4_121on21onlb90pdsm.R.inc(95637);double f = factor * x[0] * x[0];
            __CLR4_4_121on21onlb90pdsm.R.inc(95638);for (int i = 1; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95639)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95640)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95641);f += x[i] * x[i];
            }__CLR4_4_121on21onlb90pdsm.R.inc(95642);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class CigTab implements MultivariateFunction {
        private double factor;

        CigTab() {
            this(1e4);__CLR4_4_121on21onlb90pdsm.R.inc(95644);try{__CLR4_4_121on21onlb90pdsm.R.inc(95643);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        CigTab(double axisratio) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95645);
            __CLR4_4_121on21onlb90pdsm.R.inc(95646);factor = axisratio;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95647);
            __CLR4_4_121on21onlb90pdsm.R.inc(95648);int end = x.length - 1;
            __CLR4_4_121on21onlb90pdsm.R.inc(95649);double f = x[0] * x[0] / factor + factor * x[end] * x[end];
            __CLR4_4_121on21onlb90pdsm.R.inc(95650);for (int i = 1; (((i < end)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95651)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95652)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95653);f += x[i] * x[i];
            }__CLR4_4_121on21onlb90pdsm.R.inc(95654);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class TwoAxes implements MultivariateFunction {

        private double factor;

        TwoAxes() {
            this(1e6);__CLR4_4_121on21onlb90pdsm.R.inc(95656);try{__CLR4_4_121on21onlb90pdsm.R.inc(95655);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        TwoAxes(double axisratio) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95657);
            __CLR4_4_121on21onlb90pdsm.R.inc(95658);factor = axisratio * axisratio;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95659);
            __CLR4_4_121on21onlb90pdsm.R.inc(95660);double f = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95661);for (int i = 0; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95662)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95663)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95664);f += ((((i < x.length / 2 )&&(__CLR4_4_121on21onlb90pdsm.R.iget(95665)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95666)==0&false))? factor : 1) * x[i] * x[i];
            }__CLR4_4_121on21onlb90pdsm.R.inc(95667);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class ElliRotated implements MultivariateFunction {
        private Basis B = new Basis();
        private double factor;

        ElliRotated() {
            this(1e3);__CLR4_4_121on21onlb90pdsm.R.inc(95669);try{__CLR4_4_121on21onlb90pdsm.R.inc(95668);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        ElliRotated(double axisratio) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95670);
            __CLR4_4_121on21onlb90pdsm.R.inc(95671);factor = axisratio * axisratio;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95672);
            __CLR4_4_121on21onlb90pdsm.R.inc(95673);double f = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95674);x = B.Rotate(x);
            __CLR4_4_121on21onlb90pdsm.R.inc(95675);for (int i = 0; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95676)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95677)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95678);f += Math.pow(factor, i / (x.length - 1.)) * x[i] * x[i];
            }__CLR4_4_121on21onlb90pdsm.R.inc(95679);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class Elli implements MultivariateFunction {

        private double factor;

        Elli() {
            this(1e3);__CLR4_4_121on21onlb90pdsm.R.inc(95681);try{__CLR4_4_121on21onlb90pdsm.R.inc(95680);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        Elli(double axisratio) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95682);
            __CLR4_4_121on21onlb90pdsm.R.inc(95683);factor = axisratio * axisratio;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95684);
            __CLR4_4_121on21onlb90pdsm.R.inc(95685);double f = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95686);for (int i = 0; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95687)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95688)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95689);f += Math.pow(factor, i / (x.length - 1.)) * x[i] * x[i];
            }__CLR4_4_121on21onlb90pdsm.R.inc(95690);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class MinusElli implements MultivariateFunction {
        private final Elli elli = new Elli();
        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95691);
            __CLR4_4_121on21onlb90pdsm.R.inc(95692);return 1.0 - elli.value(x);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class DiffPow implements MultivariateFunction {
//        private int fcount = 0;
        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95693);
            __CLR4_4_121on21onlb90pdsm.R.inc(95694);double f = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95695);for (int i = 0; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95696)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95697)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95698);f += Math.pow(Math.abs(x[i]), 2. + 10 * (double) i
                        / (x.length - 1.));
//            System.out.print("" + (fcount++) + ") ");
//            for (int i = 0; i < x.length; i++)
//                System.out.print(x[i] +  " ");
//            System.out.println(" = " + f);
            }__CLR4_4_121on21onlb90pdsm.R.inc(95699);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class SsDiffPow implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95700);
            __CLR4_4_121on21onlb90pdsm.R.inc(95701);double f = Math.pow(new DiffPow().value(x), 0.25);
            __CLR4_4_121on21onlb90pdsm.R.inc(95702);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class Rosen implements MultivariateFunction {

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95703);
            __CLR4_4_121on21onlb90pdsm.R.inc(95704);double f = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95705);for (int i = 0; (((i < x.length - 1)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95706)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95707)==0&false)); ++i)
                {__CLR4_4_121on21onlb90pdsm.R.inc(95708);f += 1e2 * (x[i] * x[i] - x[i + 1]) * (x[i] * x[i] - x[i + 1])
                + (x[i] - 1.) * (x[i] - 1.);
            }__CLR4_4_121on21onlb90pdsm.R.inc(95709);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class Ackley implements MultivariateFunction {
        private double axisratio;

        Ackley(double axra) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95710);
            __CLR4_4_121on21onlb90pdsm.R.inc(95711);axisratio = axra;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public Ackley() {
            this(1);__CLR4_4_121on21onlb90pdsm.R.inc(95713);try{__CLR4_4_121on21onlb90pdsm.R.inc(95712);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95714);
            __CLR4_4_121on21onlb90pdsm.R.inc(95715);double f = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95716);double res2 = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95717);double fac = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95718);for (int i = 0; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95719)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95720)==0&false)); ++i) {{
                __CLR4_4_121on21onlb90pdsm.R.inc(95721);fac = Math.pow(axisratio, (i - 1.) / (x.length - 1.));
                __CLR4_4_121on21onlb90pdsm.R.inc(95722);f += fac * fac * x[i] * x[i];
                __CLR4_4_121on21onlb90pdsm.R.inc(95723);res2 += Math.cos(2. * Math.PI * fac * x[i]);
            }
            }__CLR4_4_121on21onlb90pdsm.R.inc(95724);f = (20. - 20. * Math.exp(-0.2 * Math.sqrt(f / x.length))
                    + Math.exp(1.) - Math.exp(res2 / x.length));
            __CLR4_4_121on21onlb90pdsm.R.inc(95725);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class Rastrigin implements MultivariateFunction {

        private double axisratio;
        private double amplitude;

        Rastrigin() {
            this(1, 10);__CLR4_4_121on21onlb90pdsm.R.inc(95727);try{__CLR4_4_121on21onlb90pdsm.R.inc(95726);
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        Rastrigin(double axisratio, double amplitude) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95728);
            __CLR4_4_121on21onlb90pdsm.R.inc(95729);this.axisratio = axisratio;
            __CLR4_4_121on21onlb90pdsm.R.inc(95730);this.amplitude = amplitude;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95731);
            __CLR4_4_121on21onlb90pdsm.R.inc(95732);double f = 0;
            __CLR4_4_121on21onlb90pdsm.R.inc(95733);double fac;
            __CLR4_4_121on21onlb90pdsm.R.inc(95734);for (int i = 0; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95735)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95736)==0&false)); ++i) {{
                __CLR4_4_121on21onlb90pdsm.R.inc(95737);fac = Math.pow(axisratio, (i - 1.) / (x.length - 1.));
                __CLR4_4_121on21onlb90pdsm.R.inc(95738);if ((((i == 0 && x[i] < 0)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95739)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95740)==0&false)))
                    {__CLR4_4_121on21onlb90pdsm.R.inc(95741);fac *= 1.;
                }__CLR4_4_121on21onlb90pdsm.R.inc(95742);f += fac * fac * x[i] * x[i] + amplitude
                * (1. - Math.cos(2. * Math.PI * fac * x[i]));
            }
            }__CLR4_4_121on21onlb90pdsm.R.inc(95743);return f;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }

    private static class Basis {
        double[][] basis;
        Random rand = new Random(2); // use not always the same basis

        double[] Rotate(double[] x) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95744);
            __CLR4_4_121on21onlb90pdsm.R.inc(95745);GenBasis(x.length);
            __CLR4_4_121on21onlb90pdsm.R.inc(95746);double[] y = new double[x.length];
            __CLR4_4_121on21onlb90pdsm.R.inc(95747);for (int i = 0; (((i < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95748)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95749)==0&false)); ++i) {{
                __CLR4_4_121on21onlb90pdsm.R.inc(95750);y[i] = 0;
                __CLR4_4_121on21onlb90pdsm.R.inc(95751);for (int j = 0; (((j < x.length)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95752)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95753)==0&false)); ++j)
                    {__CLR4_4_121on21onlb90pdsm.R.inc(95754);y[i] += basis[i][j] * x[j];
            }}
            }__CLR4_4_121on21onlb90pdsm.R.inc(95755);return y;
        }finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}

        void GenBasis(int DIM) {try{__CLR4_4_121on21onlb90pdsm.R.inc(95756);
            __CLR4_4_121on21onlb90pdsm.R.inc(95757);if (((((((basis != null )&&(__CLR4_4_121on21onlb90pdsm.R.iget(95758)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95759)==0&false))? basis.length == DIM : false)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95760)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95761)==0&false)))
                {__CLR4_4_121on21onlb90pdsm.R.inc(95762);return;

            }__CLR4_4_121on21onlb90pdsm.R.inc(95763);double sp;
            __CLR4_4_121on21onlb90pdsm.R.inc(95764);int i, j, k;

            /* generate orthogonal basis */
            __CLR4_4_121on21onlb90pdsm.R.inc(95765);basis = new double[DIM][DIM];
            __CLR4_4_121on21onlb90pdsm.R.inc(95766);for (i = 0; (((i < DIM)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95767)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95768)==0&false)); ++i) {{
                /* sample components gaussian */
                __CLR4_4_121on21onlb90pdsm.R.inc(95769);for (j = 0; (((j < DIM)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95770)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95771)==0&false)); ++j)
                    {__CLR4_4_121on21onlb90pdsm.R.inc(95772);basis[i][j] = rand.nextGaussian();
                /* substract projection of previous vectors */
                }__CLR4_4_121on21onlb90pdsm.R.inc(95773);for (j = i - 1; (((j >= 0)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95774)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95775)==0&false)); --j) {{
                    __CLR4_4_121on21onlb90pdsm.R.inc(95776);for (sp = 0., k = 0; (((k < DIM)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95777)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95778)==0&false)); ++k)
                        {__CLR4_4_121on21onlb90pdsm.R.inc(95779);sp += basis[i][k] * basis[j][k]; /* scalar product */
                    }__CLR4_4_121on21onlb90pdsm.R.inc(95780);for (k = 0; (((k < DIM)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95781)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95782)==0&false)); ++k)
                        {__CLR4_4_121on21onlb90pdsm.R.inc(95783);basis[i][k] -= sp * basis[j][k]; /* substract */
                }}
                /* normalize */
                }__CLR4_4_121on21onlb90pdsm.R.inc(95784);for (sp = 0., k = 0; (((k < DIM)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95785)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95786)==0&false)); ++k)
                    {__CLR4_4_121on21onlb90pdsm.R.inc(95787);sp += basis[i][k] * basis[i][k]; /* squared norm */
                }__CLR4_4_121on21onlb90pdsm.R.inc(95788);for (k = 0; (((k < DIM)&&(__CLR4_4_121on21onlb90pdsm.R.iget(95789)!=0|true))||(__CLR4_4_121on21onlb90pdsm.R.iget(95790)==0&false)); ++k)
                    {__CLR4_4_121on21onlb90pdsm.R.inc(95791);basis[i][k] /= Math.sqrt(sp);
            }}
        }}finally{__CLR4_4_121on21onlb90pdsm.R.flushNeeded();}}
    }
}
