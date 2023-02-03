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


import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class SimplexOptimizerNelderMeadTest {static class __CLR4_4_122dv22dvlb90pdtz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,96529,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected=MathUnsupportedOperationException.class)
    public void testBoundsUnsupported() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198v7md22dv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,111,117,110,100,115,85,110,115,117,112,112,111,114,116,101,100,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testBoundsUnsupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198v7md22dv(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96403);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96404);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96405);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122dv22dvlb90pdtz.R.inc(96406);optimizer.optimize(new MaxEval(100),
                           new ObjectiveFunction(fourExtrema),
                           GoalType.MINIMIZE,
                           new InitialGuess(new double[] { -3, 0 }),
                           new NelderMeadSimplex(new double[] { 0.2, 0.2 }),
                           new SimpleBounds(new double[] { -5, -1 },
                                            new double[] { 5, 1 }));
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testMinimize1() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mcvso22dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testMinimize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mcvso22dz(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96407);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96408);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96409);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122dv22dvlb90pdtz.R.inc(96410);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 new ObjectiveFunction(fourExtrema),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { -3, 0 }),
                                 new NelderMeadSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96411);Assert.assertEquals(fourExtrema.xM, optimum.getPoint()[0], 2e-7);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96412);Assert.assertEquals(fourExtrema.yP, optimum.getPoint()[1], 2e-5);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96413);Assert.assertEquals(fourExtrema.valueXmYp, optimum.getValue(), 6e-12);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96414);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96415);Assert.assertTrue(optimizer.getEvaluations() < 90);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96416);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testMinimize2() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dcx0722e9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testMinimize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dcx0722e9(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96417);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96418);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96419);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122dv22dvlb90pdtz.R.inc(96420);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 new ObjectiveFunction(fourExtrema),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 1, 0 }),
                                 new NelderMeadSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96421);Assert.assertEquals(fourExtrema.xP, optimum.getPoint()[0], 5e-6);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96422);Assert.assertEquals(fourExtrema.yM, optimum.getPoint()[1], 6e-6);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96423);Assert.assertEquals(fourExtrema.valueXpYm, optimum.getValue(), 1e-11);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96424);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96425);Assert.assertTrue(optimizer.getEvaluations() < 90);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96426);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testMaximize1() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9ex7q22ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testMaximize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9ex7q22ej(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96427);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96428);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96429);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122dv22dvlb90pdtz.R.inc(96430);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 new ObjectiveFunction(fourExtrema),
                                 GoalType.MAXIMIZE,
                                 new InitialGuess(new double[] { -3, 0 }),
                                 new NelderMeadSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96431);Assert.assertEquals(fourExtrema.xM, optimum.getPoint()[0], 1e-5);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96432);Assert.assertEquals(fourExtrema.yM, optimum.getPoint()[1], 3e-6);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96433);Assert.assertEquals(fourExtrema.valueXmYm, optimum.getValue(), 3e-12);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96434);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96435);Assert.assertTrue(optimizer.getEvaluations() < 90);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96436);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testMaximize2() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0eyf922et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testMaximize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0eyf922et(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96437);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96438);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96439);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122dv22dvlb90pdtz.R.inc(96440);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 new ObjectiveFunction(fourExtrema),
                                 GoalType.MAXIMIZE,
                                 new InitialGuess(new double[] { 1, 0 }),
                                 new NelderMeadSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96441);Assert.assertEquals(fourExtrema.xP, optimum.getPoint()[0], 4e-6);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96442);Assert.assertEquals(fourExtrema.yP, optimum.getPoint()[1], 5e-6);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96443);Assert.assertEquals(fourExtrema.valueXpYp, optimum.getValue(), 7e-12);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96444);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96445);Assert.assertTrue(optimizer.getEvaluations() < 90);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96446);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testRosenbrock() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1glvc6922f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testRosenbrock",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1glvc6922f3(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96447);

        __CLR4_4_122dv22dvlb90pdtz.R.inc(96448);Rosenbrock rosenbrock = new Rosenbrock();
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96449);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96450);PointValuePair optimum
        = optimizer.optimize(new MaxEval(100),
                             new ObjectiveFunction(rosenbrock),
                             GoalType.MINIMIZE,
                             new InitialGuess(new double[] { -1.2, 1 }),
                                new NelderMeadSimplex(new double[][] {
                                        { -1.2,  1 },
                                        { 0.9, 1.2 },
                                        {  3.5, -2.3 } }));

        __CLR4_4_122dv22dvlb90pdtz.R.inc(96451);Assert.assertEquals(rosenbrock.getCount(), optimizer.getEvaluations());
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96452);Assert.assertTrue(optimizer.getEvaluations() > 40);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96453);Assert.assertTrue(optimizer.getEvaluations() < 50);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96454);Assert.assertTrue(optimum.getValue() < 8e-4);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testPowell() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eh0dly22fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testPowell",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eh0dly22fb(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96455);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96456);Powell powell = new Powell();
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96457);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96458);PointValuePair optimum =
            optimizer.optimize(new MaxEval(200),
                               new ObjectiveFunction(powell),
                               GoalType.MINIMIZE,
                               new InitialGuess(new double[] { 3, -1, 0, 1 }),
                               new NelderMeadSimplex(4));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96459);Assert.assertEquals(powell.getCount(), optimizer.getEvaluations());
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96460);Assert.assertTrue(optimizer.getEvaluations() > 110);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96461);Assert.assertTrue(optimizer.getEvaluations() < 130);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96462);Assert.assertTrue(optimum.getValue() < 2e-3);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testLeastSquares1() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11g035322fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testLeastSquares1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11g035322fj(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96463);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96464);final RealMatrix factors
            = new Array2DRowRealMatrix(new double[][] {
                    { 1, 0 },
                    { 0, 1 }
                }, false);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96465);LeastSquaresConverter ls = new LeastSquaresConverter(new MultivariateVectorFunction() {
                public double[] value(double[] variables) {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96466);
                    __CLR4_4_122dv22dvlb90pdtz.R.inc(96467);return factors.operate(variables);
                }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}
            }, new double[] { 2.0, -3.0 });
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96468);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-6);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96469);PointValuePair optimum =
            optimizer.optimize(new MaxEval(200),
                               new ObjectiveFunction(ls),
                               GoalType.MINIMIZE,
                               new InitialGuess(new double[] { 10, 10 }),
                               new NelderMeadSimplex(2));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96470);Assert.assertEquals( 2, optimum.getPointRef()[0], 3e-5);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96471);Assert.assertEquals(-3, optimum.getPointRef()[1], 4e-4);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96472);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96473);Assert.assertTrue(optimizer.getEvaluations() < 80);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96474);Assert.assertTrue(optimum.getValue() < 1.0e-6);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testLeastSquares2() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11szvne22fv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testLeastSquares2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11szvne22fv(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96475);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96476);final RealMatrix factors
            = new Array2DRowRealMatrix(new double[][] {
                    { 1, 0 },
                    { 0, 1 }
                }, false);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96477);LeastSquaresConverter ls = new LeastSquaresConverter(new MultivariateVectorFunction() {
                public double[] value(double[] variables) {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96478);
                    __CLR4_4_122dv22dvlb90pdtz.R.inc(96479);return factors.operate(variables);
                }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}
            }, new double[] { 2, -3 }, new double[] { 10, 0.1 });
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96480);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-6);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96481);PointValuePair optimum =
            optimizer.optimize(new MaxEval(200),
                               new ObjectiveFunction(ls),
                               GoalType.MINIMIZE,
                               new InitialGuess(new double[] { 10, 10 }),
                               new NelderMeadSimplex(2));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96482);Assert.assertEquals( 2, optimum.getPointRef()[0], 5e-5);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96483);Assert.assertEquals(-3, optimum.getPointRef()[1], 8e-4);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96484);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96485);Assert.assertTrue(optimizer.getEvaluations() < 80);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96486);Assert.assertTrue(optimum.getValue() < 1e-6);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test
    public void testLeastSquares3() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151zufv22g7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testLeastSquares3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151zufv22g7(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96487);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96488);final RealMatrix factors =
            new Array2DRowRealMatrix(new double[][] {
                    { 1, 0 },
                    { 0, 1 }
                }, false);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96489);LeastSquaresConverter ls = new LeastSquaresConverter(new MultivariateVectorFunction() {
                public double[] value(double[] variables) {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96490);
                    __CLR4_4_122dv22dvlb90pdtz.R.inc(96491);return factors.operate(variables);
                }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}
            }, new double[] { 2, -3 }, new Array2DRowRealMatrix(new double [][] {
                    { 1, 1.2 }, { 1.2, 2 }
                }));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96492);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-6);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96493);PointValuePair optimum
            = optimizer.optimize(new MaxEval(200),
                                 new ObjectiveFunction(ls),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 10, 10 }),
                                 new NelderMeadSimplex(2));
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96494);Assert.assertEquals( 2, optimum.getPointRef()[0], 2e-3);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96495);Assert.assertEquals(-3, optimum.getPointRef()[1], 8e-4);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96496);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96497);Assert.assertTrue(optimizer.getEvaluations() < 80);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96498);Assert.assertTrue(optimum.getValue() < 1e-6);
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    @Test(expected=TooManyEvaluationsException.class)
    public void testMaxIterations() {__CLR4_4_122dv22dvlb90pdtz.R.globalSliceStart(getClass().getName(),96499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7jz4f22gj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,73,116,101,114,97,116,105,111,110,115,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122dv22dvlb90pdtz.R.rethrow($CLV_t2$);}finally{__CLR4_4_122dv22dvlb90pdtz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest.testMaxIterations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7jz4f22gj(){try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96499);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96500);Powell powell = new Powell();
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96501);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_122dv22dvlb90pdtz.R.inc(96502);optimizer.optimize(new MaxEval(20),
                           new ObjectiveFunction(powell),
                           GoalType.MINIMIZE,
                           new InitialGuess(new double[] { 3, -1, 0, 1 }),
                           new NelderMeadSimplex(4));
    }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

    private static class FourExtrema implements MultivariateFunction {
        // The following function has 4 local extrema.
        final double xM = -3.841947088256863675365;
        final double yM = -1.391745200270734924416;
        final double xP =  0.2286682237349059125691;
        final double yP = -yM;
        final double valueXmYm = 0.2373295333134216789769; // Local maximum.
        final double valueXmYp = -valueXmYm; // Local minimum.
        final double valueXpYm = -0.7290400707055187115322; // Global minimum.
        final double valueXpYp = -valueXpYm; // Global maximum.

        public double value(double[] variables) {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96503);
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96504);final double x = variables[0];
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96505);final double y = variables[1];
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96506);return ((((x == 0 || y == 0) )&&(__CLR4_4_122dv22dvlb90pdtz.R.iget(96507)!=0|true))||(__CLR4_4_122dv22dvlb90pdtz.R.iget(96508)==0&false))? 0 :
                FastMath.atan(x) * FastMath.atan(x + 2) * FastMath.atan(y) * FastMath.atan(y) / (x * y);
        }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}
    }

    private static class Rosenbrock implements MultivariateFunction {
        private int count;

        public Rosenbrock() {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96509);
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96510);count = 0;
        }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96511);
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96512);++count;
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96513);double a = x[1] - x[0] * x[0];
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96514);double b = 1.0 - x[0];
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96515);return 100 * a * a + b * b;
        }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

        public int getCount() {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96516);
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96517);return count;
        }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}
    }

    private static class Powell implements MultivariateFunction {
        private int count;

        public Powell() {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96518);
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96519);count = 0;
        }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96520);
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96521);++count;
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96522);double a = x[0] + 10 * x[1];
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96523);double b = x[2] - x[3];
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96524);double c = x[1] - 2 * x[2];
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96525);double d = x[0] - x[3];
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96526);return a * a + 5 * b * b + c * c * c * c + 10 * d * d * d * d;
        }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}

        public int getCount() {try{__CLR4_4_122dv22dvlb90pdtz.R.inc(96527);
            __CLR4_4_122dv22dvlb90pdtz.R.inc(96528);return count;
        }finally{__CLR4_4_122dv22dvlb90pdtz.R.flushNeeded();}}
    }
}
