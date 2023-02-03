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

package org.apache.commons.math3.analysis.solvers;

import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for {@link BracketingNthOrderBrentSolver bracketing n<sup>th</sup> order Brent} solver.
 *
 * @version $Id$
 */
public final class BracketingNthOrderBrentSolverTest extends BaseSecantSolverAbstractTest {static class __CLR4_4_11gou1goulb90pc4b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** {@inheritDoc} */
    @Override
    protected UnivariateSolver getSolver() {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68286);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68287);return new BracketingNthOrderBrentSolver();
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected int[] getQuinticEvalCounts() {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68288);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68289);return new int[] {1, 3, 8, 1, 9, 4, 8, 1, 12, 1, 16};
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    @Test(expected=NumberIsTooSmallException.class)
    public void testInsufficientOrder1() {__CLR4_4_11gou1goulb90pc4b.R.globalSliceStart(getClass().getName(),68290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2u0ht1goy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,115,117,102,102,105,99,105,101,110,116,79,114,100,101,114,49,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gou1goulb90pc4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gou1goulb90pc4b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest.testInsufficientOrder1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2u0ht1goy(){try{__CLR4_4_11gou1goulb90pc4b.R.inc(68290);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68291);new BracketingNthOrderBrentSolver(1.0e-10, 1);
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    @Test(expected=NumberIsTooSmallException.class)
    public void testInsufficientOrder2() {__CLR4_4_11gou1goulb90pc4b.R.globalSliceStart(getClass().getName(),68292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19tu1pc1gp0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,115,117,102,102,105,99,105,101,110,116,79,114,100,101,114,50,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gou1goulb90pc4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gou1goulb90pc4b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest.testInsufficientOrder2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19tu1pc1gp0(){try{__CLR4_4_11gou1goulb90pc4b.R.inc(68292);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68293);new BracketingNthOrderBrentSolver(1.0e-10, 1.0e-10, 1);
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    @Test(expected=NumberIsTooSmallException.class)
    public void testInsufficientOrder3() {__CLR4_4_11gou1goulb90pc4b.R.globalSliceStart(getClass().getName(),68294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ku2wv1gp2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,115,117,102,102,105,99,105,101,110,116,79,114,100,101,114,51,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gou1goulb90pc4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gou1goulb90pc4b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest.testInsufficientOrder3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ku2wv1gp2(){try{__CLR4_4_11gou1goulb90pc4b.R.inc(68294);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68295);new BracketingNthOrderBrentSolver(1.0e-10, 1.0e-10, 1.0e-10, 1);
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    @Test
    public void testConstructorsOK() {__CLR4_4_11gou1goulb90pc4b.R.globalSliceStart(getClass().getName(),68296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133xtke1gp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gou1goulb90pc4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gou1goulb90pc4b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest.testConstructorsOK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133xtke1gp4(){try{__CLR4_4_11gou1goulb90pc4b.R.inc(68296);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68297);Assert.assertEquals(2, new BracketingNthOrderBrentSolver(1.0e-10, 2).getMaximalOrder());
        __CLR4_4_11gou1goulb90pc4b.R.inc(68298);Assert.assertEquals(2, new BracketingNthOrderBrentSolver(1.0e-10, 1.0e-10, 2).getMaximalOrder());
        __CLR4_4_11gou1goulb90pc4b.R.inc(68299);Assert.assertEquals(2, new BracketingNthOrderBrentSolver(1.0e-10, 1.0e-10, 1.0e-10, 2).getMaximalOrder());
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    @Test
    public void testConvergenceOnFunctionAccuracy() {__CLR4_4_11gou1goulb90pc4b.R.globalSliceStart(getClass().getName(),68300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sg84s61gp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gou1goulb90pc4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gou1goulb90pc4b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest.testConvergenceOnFunctionAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sg84s61gp8(){try{__CLR4_4_11gou1goulb90pc4b.R.inc(68300);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68301);BracketingNthOrderBrentSolver solver =
                new BracketingNthOrderBrentSolver(1.0e-12, 1.0e-10, 0.001, 3);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68302);QuinticFunction f = new QuinticFunction();
        __CLR4_4_11gou1goulb90pc4b.R.inc(68303);double result = solver.solve(20, f, 0.2, 0.9, 0.4, AllowedSolution.BELOW_SIDE);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68304);Assert.assertEquals(0, f.value(result), solver.getFunctionValueAccuracy());
        __CLR4_4_11gou1goulb90pc4b.R.inc(68305);Assert.assertTrue(f.value(result) <= 0);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68306);Assert.assertTrue(result - 0.5 > solver.getAbsoluteAccuracy());
        __CLR4_4_11gou1goulb90pc4b.R.inc(68307);result = solver.solve(20, f, -0.9, -0.2,  -0.4, AllowedSolution.ABOVE_SIDE);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68308);Assert.assertEquals(0, f.value(result), solver.getFunctionValueAccuracy());
        __CLR4_4_11gou1goulb90pc4b.R.inc(68309);Assert.assertTrue(f.value(result) >= 0);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68310);Assert.assertTrue(result + 0.5 < -solver.getAbsoluteAccuracy());
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    @Test
    public void testIssue716() {__CLR4_4_11gou1goulb90pc4b.R.globalSliceStart(getClass().getName(),68311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152uxz81gpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gou1goulb90pc4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gou1goulb90pc4b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest.testIssue716",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152uxz81gpj(){try{__CLR4_4_11gou1goulb90pc4b.R.inc(68311);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68312);BracketingNthOrderBrentSolver solver =
                new BracketingNthOrderBrentSolver(1.0e-12, 1.0e-10, 1.0e-22, 5);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68313);UnivariateFunction sharpTurn = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68314);
                __CLR4_4_11gou1goulb90pc4b.R.inc(68315);return (2 * x + 1) / (1.0e9 * (x + 1));
            }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}
        };
        __CLR4_4_11gou1goulb90pc4b.R.inc(68316);double result = solver.solve(100, sharpTurn, -0.9999999, 30, 15, AllowedSolution.RIGHT_SIDE);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68317);Assert.assertEquals(0, sharpTurn.value(result), solver.getFunctionValueAccuracy());
        __CLR4_4_11gou1goulb90pc4b.R.inc(68318);Assert.assertTrue(sharpTurn.value(result) >= 0);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68319);Assert.assertEquals(-0.5, result, 1.0e-10);
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    @Test
    public void testFasterThanNewton() {__CLR4_4_11gou1goulb90pc4b.R.globalSliceStart(getClass().getName(),68320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pr7bre1gps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gou1goulb90pc4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gou1goulb90pc4b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest.testFasterThanNewton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pr7bre1gps(){try{__CLR4_4_11gou1goulb90pc4b.R.inc(68320);
        // the following test functions come from Beny Neta's paper:
        // "Several New Methods for solving Equations"
        // intern J. Computer Math Vol 23 pp 265-282
        // available here: http://www.math.nps.navy.mil/~bneta/SeveralNewMethods.PDF
        // the reference roots have been computed by the Dfp solver to more than
        // 80 digits and checked with emacs (only the first 20 digits are reproduced here)
        __CLR4_4_11gou1goulb90pc4b.R.inc(68321);compare(new TestFunction(0.0, -2, 2) {
            @Override
            public DerivativeStructure value(DerivativeStructure x) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68322);
                __CLR4_4_11gou1goulb90pc4b.R.inc(68323);return x.sin().subtract(x.multiply(0.5));
            }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}
        });
        __CLR4_4_11gou1goulb90pc4b.R.inc(68324);compare(new TestFunction(6.3087771299726890947, -5, 10) {
            @Override
            public DerivativeStructure value(DerivativeStructure x) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68325);
                __CLR4_4_11gou1goulb90pc4b.R.inc(68326);return x.pow(5).add(x).subtract(10000);
            }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}
        });
        __CLR4_4_11gou1goulb90pc4b.R.inc(68327);compare(new TestFunction(9.6335955628326951924, 0.001, 10) {
            @Override
            public DerivativeStructure value(DerivativeStructure x) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68328);
                __CLR4_4_11gou1goulb90pc4b.R.inc(68329);return x.sqrt().subtract(x.reciprocal()).subtract(3);
            }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}
        });
        __CLR4_4_11gou1goulb90pc4b.R.inc(68330);compare(new TestFunction(2.8424389537844470678, -5, 5) {
            @Override
            public DerivativeStructure value(DerivativeStructure x) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68331);
                __CLR4_4_11gou1goulb90pc4b.R.inc(68332);return x.exp().add(x).subtract(20);
            }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}
        });
        __CLR4_4_11gou1goulb90pc4b.R.inc(68333);compare(new TestFunction(8.3094326942315717953, 0.001, 10) {
            @Override
            public DerivativeStructure value(DerivativeStructure x) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68334);
                __CLR4_4_11gou1goulb90pc4b.R.inc(68335);return x.log().add(x.sqrt()).subtract(5);
            }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}
        });
        __CLR4_4_11gou1goulb90pc4b.R.inc(68336);compare(new TestFunction(1.4655712318767680266, -0.5, 1.5) {
            @Override
            public DerivativeStructure value(DerivativeStructure x) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68337);
                __CLR4_4_11gou1goulb90pc4b.R.inc(68338);return x.subtract(1).multiply(x).multiply(x).subtract(1);
            }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}
        });

    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    private void compare(TestFunction f) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68339);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68340);compare(f, f.getRoot(), f.getMin(), f.getMax());
    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    private void compare(final UnivariateDifferentiableFunction f,
                         double root, double min, double max) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68341);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68342);NewtonRaphsonSolver newton = new NewtonRaphsonSolver(1.0e-12);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68343);BracketingNthOrderBrentSolver bracketing =
                new BracketingNthOrderBrentSolver(1.0e-12, 1.0e-12, 1.0e-18, 5);
        __CLR4_4_11gou1goulb90pc4b.R.inc(68344);double resultN;
        __CLR4_4_11gou1goulb90pc4b.R.inc(68345);try {
            __CLR4_4_11gou1goulb90pc4b.R.inc(68346);resultN = newton.solve(100, f, min, max);
        } catch (TooManyEvaluationsException tmee) {
            __CLR4_4_11gou1goulb90pc4b.R.inc(68347);resultN = Double.NaN;
        }
        __CLR4_4_11gou1goulb90pc4b.R.inc(68348);double resultB;
        __CLR4_4_11gou1goulb90pc4b.R.inc(68349);try {
            __CLR4_4_11gou1goulb90pc4b.R.inc(68350);resultB = bracketing.solve(100, f, min, max);
        } catch (TooManyEvaluationsException tmee) {
            __CLR4_4_11gou1goulb90pc4b.R.inc(68351);resultB = Double.NaN;
        }
        __CLR4_4_11gou1goulb90pc4b.R.inc(68352);Assert.assertEquals(root, resultN, newton.getAbsoluteAccuracy());
        __CLR4_4_11gou1goulb90pc4b.R.inc(68353);Assert.assertEquals(root, resultB, bracketing.getAbsoluteAccuracy());

        // bracketing solver evaluates only function value, we set the weight to 1
        __CLR4_4_11gou1goulb90pc4b.R.inc(68354);final int weightedBracketingEvaluations = bracketing.getEvaluations();

        // Newton-Raphson solver evaluates both function value and derivative, we set the weight to 2
        __CLR4_4_11gou1goulb90pc4b.R.inc(68355);final int weightedNewtonEvaluations = 2 * newton.getEvaluations();

        __CLR4_4_11gou1goulb90pc4b.R.inc(68356);Assert.assertTrue(weightedBracketingEvaluations < weightedNewtonEvaluations);

    }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

    private static abstract class TestFunction implements UnivariateDifferentiableFunction {

        private final double root;
        private final double min;
        private final double max;

        protected TestFunction(final double root, final double min, final double max) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68357);
            __CLR4_4_11gou1goulb90pc4b.R.inc(68358);this.root = root;
            __CLR4_4_11gou1goulb90pc4b.R.inc(68359);this.min  = min;
            __CLR4_4_11gou1goulb90pc4b.R.inc(68360);this.max  = max;
        }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

        public double getRoot() {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68361);
            __CLR4_4_11gou1goulb90pc4b.R.inc(68362);return root;
        }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

        public double getMin() {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68363);
            __CLR4_4_11gou1goulb90pc4b.R.inc(68364);return min;
        }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

        public double getMax() {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68365);
            __CLR4_4_11gou1goulb90pc4b.R.inc(68366);return max;
        }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

        public double value(final double x) {try{__CLR4_4_11gou1goulb90pc4b.R.inc(68367);
            __CLR4_4_11gou1goulb90pc4b.R.inc(68368);return value(new DerivativeStructure(0, 0, x)).getValue();
        }finally{__CLR4_4_11gou1goulb90pc4b.R.flushNeeded();}}

        public abstract DerivativeStructure value(final DerivativeStructure t);

    }

}
