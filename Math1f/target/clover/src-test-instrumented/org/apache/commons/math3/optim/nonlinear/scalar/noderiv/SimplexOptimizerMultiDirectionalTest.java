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

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class SimplexOptimizerMultiDirectionalTest {static class __CLR4_4_122b022b0lb90pdto{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,96403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected=MathUnsupportedOperationException.class)
    public void testBoundsUnsupported() {__CLR4_4_122b022b0lb90pdto.R.globalSliceStart(getClass().getName(),96300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198v7md22b0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,111,117,110,100,115,85,110,115,117,112,112,111,114,116,101,100,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122b022b0lb90pdto.R.rethrow($CLV_t2$);}finally{__CLR4_4_122b022b0lb90pdto.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest.testBoundsUnsupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198v7md22b0(){try{__CLR4_4_122b022b0lb90pdto.R.inc(96300);
        __CLR4_4_122b022b0lb90pdto.R.inc(96301);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_122b022b0lb90pdto.R.inc(96302);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122b022b0lb90pdto.R.inc(96303);optimizer.optimize(new MaxEval(100),
                           new ObjectiveFunction(fourExtrema),
                           GoalType.MINIMIZE,
                           new InitialGuess(new double[] { -3, 0 }),
                           new NelderMeadSimplex(new double[] { 0.2, 0.2 }),
                           new SimpleBounds(new double[] { -5, -1 },
                                            new double[] { 5, 1 }));
    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

    @Test
    public void testMinimize1() {__CLR4_4_122b022b0lb90pdto.R.globalSliceStart(getClass().getName(),96304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mcvso22b4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122b022b0lb90pdto.R.rethrow($CLV_t2$);}finally{__CLR4_4_122b022b0lb90pdto.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest.testMinimize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mcvso22b4(){try{__CLR4_4_122b022b0lb90pdto.R.inc(96304);
        __CLR4_4_122b022b0lb90pdto.R.inc(96305);SimplexOptimizer optimizer = new SimplexOptimizer(1e-11, 1e-30);
        __CLR4_4_122b022b0lb90pdto.R.inc(96306);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122b022b0lb90pdto.R.inc(96307);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(200),
                                 new ObjectiveFunction(fourExtrema),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { -3, 0 }),
                                 new MultiDirectionalSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_122b022b0lb90pdto.R.inc(96308);Assert.assertEquals(fourExtrema.xM, optimum.getPoint()[0], 4e-6);
        __CLR4_4_122b022b0lb90pdto.R.inc(96309);Assert.assertEquals(fourExtrema.yP, optimum.getPoint()[1], 3e-6);
        __CLR4_4_122b022b0lb90pdto.R.inc(96310);Assert.assertEquals(fourExtrema.valueXmYp, optimum.getValue(), 8e-13);
        __CLR4_4_122b022b0lb90pdto.R.inc(96311);Assert.assertTrue(optimizer.getEvaluations() > 120);
        __CLR4_4_122b022b0lb90pdto.R.inc(96312);Assert.assertTrue(optimizer.getEvaluations() < 150);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_122b022b0lb90pdto.R.inc(96313);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

    @Test
    public void testMinimize2() {__CLR4_4_122b022b0lb90pdto.R.globalSliceStart(getClass().getName(),96314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dcx0722be();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122b022b0lb90pdto.R.rethrow($CLV_t2$);}finally{__CLR4_4_122b022b0lb90pdto.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest.testMinimize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dcx0722be(){try{__CLR4_4_122b022b0lb90pdto.R.inc(96314);
        __CLR4_4_122b022b0lb90pdto.R.inc(96315);SimplexOptimizer optimizer = new SimplexOptimizer(1e-11, 1e-30);
        __CLR4_4_122b022b0lb90pdto.R.inc(96316);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122b022b0lb90pdto.R.inc(96317);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(200),
                                 new ObjectiveFunction(fourExtrema),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 1, 0 }),
                                 new MultiDirectionalSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_122b022b0lb90pdto.R.inc(96318);Assert.assertEquals(fourExtrema.xP, optimum.getPoint()[0], 2e-8);
        __CLR4_4_122b022b0lb90pdto.R.inc(96319);Assert.assertEquals(fourExtrema.yM, optimum.getPoint()[1], 3e-6);
        __CLR4_4_122b022b0lb90pdto.R.inc(96320);Assert.assertEquals(fourExtrema.valueXpYm, optimum.getValue(), 2e-12);
        __CLR4_4_122b022b0lb90pdto.R.inc(96321);Assert.assertTrue(optimizer.getEvaluations() > 120);
        __CLR4_4_122b022b0lb90pdto.R.inc(96322);Assert.assertTrue(optimizer.getEvaluations() < 150);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_122b022b0lb90pdto.R.inc(96323);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

    @Test
    public void testMaximize1() {__CLR4_4_122b022b0lb90pdto.R.globalSliceStart(getClass().getName(),96324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9ex7q22bo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122b022b0lb90pdto.R.rethrow($CLV_t2$);}finally{__CLR4_4_122b022b0lb90pdto.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest.testMaximize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9ex7q22bo(){try{__CLR4_4_122b022b0lb90pdto.R.inc(96324);
        __CLR4_4_122b022b0lb90pdto.R.inc(96325);SimplexOptimizer optimizer = new SimplexOptimizer(1e-11, 1e-30);
        __CLR4_4_122b022b0lb90pdto.R.inc(96326);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122b022b0lb90pdto.R.inc(96327);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(200),
                                 new ObjectiveFunction(fourExtrema),
                                 GoalType.MAXIMIZE,
                                 new InitialGuess(new double[] { -3.0, 0.0 }),
                                 new MultiDirectionalSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_122b022b0lb90pdto.R.inc(96328);Assert.assertEquals(fourExtrema.xM, optimum.getPoint()[0], 7e-7);
        __CLR4_4_122b022b0lb90pdto.R.inc(96329);Assert.assertEquals(fourExtrema.yM, optimum.getPoint()[1], 3e-7);
        __CLR4_4_122b022b0lb90pdto.R.inc(96330);Assert.assertEquals(fourExtrema.valueXmYm, optimum.getValue(), 2e-14);
        __CLR4_4_122b022b0lb90pdto.R.inc(96331);Assert.assertTrue(optimizer.getEvaluations() > 120);
        __CLR4_4_122b022b0lb90pdto.R.inc(96332);Assert.assertTrue(optimizer.getEvaluations() < 150);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_122b022b0lb90pdto.R.inc(96333);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

    @Test
    public void testMaximize2() {__CLR4_4_122b022b0lb90pdto.R.globalSliceStart(getClass().getName(),96334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0eyf922by();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122b022b0lb90pdto.R.rethrow($CLV_t2$);}finally{__CLR4_4_122b022b0lb90pdto.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest.testMaximize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0eyf922by(){try{__CLR4_4_122b022b0lb90pdto.R.inc(96334);
        __CLR4_4_122b022b0lb90pdto.R.inc(96335);SimplexOptimizer optimizer = new SimplexOptimizer(new SimpleValueChecker(1e-15, 1e-30));
        __CLR4_4_122b022b0lb90pdto.R.inc(96336);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_122b022b0lb90pdto.R.inc(96337);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(200),
                                 new ObjectiveFunction(fourExtrema),
                                 GoalType.MAXIMIZE,
                                 new InitialGuess(new double[] { 1, 0 }),
                                 new MultiDirectionalSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_122b022b0lb90pdto.R.inc(96338);Assert.assertEquals(fourExtrema.xP, optimum.getPoint()[0], 2e-8);
        __CLR4_4_122b022b0lb90pdto.R.inc(96339);Assert.assertEquals(fourExtrema.yP, optimum.getPoint()[1], 3e-6);
        __CLR4_4_122b022b0lb90pdto.R.inc(96340);Assert.assertEquals(fourExtrema.valueXpYp, optimum.getValue(), 2e-12);
        __CLR4_4_122b022b0lb90pdto.R.inc(96341);Assert.assertTrue(optimizer.getEvaluations() > 180);
        __CLR4_4_122b022b0lb90pdto.R.inc(96342);Assert.assertTrue(optimizer.getEvaluations() < 220);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_122b022b0lb90pdto.R.inc(96343);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

    @Test
    public void testRosenbrock() {__CLR4_4_122b022b0lb90pdto.R.globalSliceStart(getClass().getName(),96344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1glvc6922c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122b022b0lb90pdto.R.rethrow($CLV_t2$);}finally{__CLR4_4_122b022b0lb90pdto.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest.testRosenbrock",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1glvc6922c8(){try{__CLR4_4_122b022b0lb90pdto.R.inc(96344);
        __CLR4_4_122b022b0lb90pdto.R.inc(96345);MultivariateFunction rosenbrock
            = new MultivariateFunction() {
                    public double value(double[] x) {try{__CLR4_4_122b022b0lb90pdto.R.inc(96346);
                        __CLR4_4_122b022b0lb90pdto.R.inc(96347);++count;
                        __CLR4_4_122b022b0lb90pdto.R.inc(96348);double a = x[1] - x[0] * x[0];
                        __CLR4_4_122b022b0lb90pdto.R.inc(96349);double b = 1.0 - x[0];
                        __CLR4_4_122b022b0lb90pdto.R.inc(96350);return 100 * a * a + b * b;
                    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}
                };

        __CLR4_4_122b022b0lb90pdto.R.inc(96351);count = 0;
        __CLR4_4_122b022b0lb90pdto.R.inc(96352);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_122b022b0lb90pdto.R.inc(96353);PointValuePair optimum
           = optimizer.optimize(new MaxEval(100),
                                new ObjectiveFunction(rosenbrock),
                                GoalType.MINIMIZE,
                                new InitialGuess(new double[] { -1.2, 1 }),
                                new MultiDirectionalSimplex(new double[][] {
                                        { -1.2,  1.0 },
                                        { 0.9, 1.2 },
                                        {  3.5, -2.3 } }));

        __CLR4_4_122b022b0lb90pdto.R.inc(96354);Assert.assertEquals(count, optimizer.getEvaluations());
        __CLR4_4_122b022b0lb90pdto.R.inc(96355);Assert.assertTrue(optimizer.getEvaluations() > 50);
        __CLR4_4_122b022b0lb90pdto.R.inc(96356);Assert.assertTrue(optimizer.getEvaluations() < 100);
        __CLR4_4_122b022b0lb90pdto.R.inc(96357);Assert.assertTrue(optimum.getValue() > 1e-2);
    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

    @Test
    public void testPowell() {__CLR4_4_122b022b0lb90pdto.R.globalSliceStart(getClass().getName(),96358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eh0dly22cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122b022b0lb90pdto.R.rethrow($CLV_t2$);}finally{__CLR4_4_122b022b0lb90pdto.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest.testPowell",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eh0dly22cm(){try{__CLR4_4_122b022b0lb90pdto.R.inc(96358);
        __CLR4_4_122b022b0lb90pdto.R.inc(96359);MultivariateFunction powell
            = new MultivariateFunction() {
                    public double value(double[] x) {try{__CLR4_4_122b022b0lb90pdto.R.inc(96360);
                        __CLR4_4_122b022b0lb90pdto.R.inc(96361);++count;
                        __CLR4_4_122b022b0lb90pdto.R.inc(96362);double a = x[0] + 10 * x[1];
                        __CLR4_4_122b022b0lb90pdto.R.inc(96363);double b = x[2] - x[3];
                        __CLR4_4_122b022b0lb90pdto.R.inc(96364);double c = x[1] - 2 * x[2];
                        __CLR4_4_122b022b0lb90pdto.R.inc(96365);double d = x[0] - x[3];
                        __CLR4_4_122b022b0lb90pdto.R.inc(96366);return a * a + 5 * b * b + c * c * c * c + 10 * d * d * d * d;
                    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}
                };

        __CLR4_4_122b022b0lb90pdto.R.inc(96367);count = 0;
        __CLR4_4_122b022b0lb90pdto.R.inc(96368);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_122b022b0lb90pdto.R.inc(96369);PointValuePair optimum
            = optimizer.optimize(new MaxEval(1000),
                                 new ObjectiveFunction(powell),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 3, -1, 0, 1 }),
                                 new MultiDirectionalSimplex(4));
        __CLR4_4_122b022b0lb90pdto.R.inc(96370);Assert.assertEquals(count, optimizer.getEvaluations());
        __CLR4_4_122b022b0lb90pdto.R.inc(96371);Assert.assertTrue(optimizer.getEvaluations() > 800);
        __CLR4_4_122b022b0lb90pdto.R.inc(96372);Assert.assertTrue(optimizer.getEvaluations() < 900);
        __CLR4_4_122b022b0lb90pdto.R.inc(96373);Assert.assertTrue(optimum.getValue() > 1e-2);
    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

    @Test
    public void testMath283() {__CLR4_4_122b022b0lb90pdto.R.globalSliceStart(getClass().getName(),96374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pml5sq22d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122b022b0lb90pdto.R.rethrow($CLV_t2$);}finally{__CLR4_4_122b022b0lb90pdto.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest.testMath283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pml5sq22d2(){try{__CLR4_4_122b022b0lb90pdto.R.inc(96374);
        // fails because MultiDirectional.iterateSimplex is looping forever
        // the while(true) should be replaced with a convergence check
        __CLR4_4_122b022b0lb90pdto.R.inc(96375);SimplexOptimizer optimizer = new SimplexOptimizer(1e-14, 1e-14);
        __CLR4_4_122b022b0lb90pdto.R.inc(96376);final Gaussian2D function = new Gaussian2D(0, 0, 1);
        __CLR4_4_122b022b0lb90pdto.R.inc(96377);PointValuePair estimate = optimizer.optimize(new MaxEval(1000),
                                                     new ObjectiveFunction(function),
                                                     GoalType.MAXIMIZE,
                                                     new InitialGuess(function.getMaximumPosition()),
                                                     new MultiDirectionalSimplex(2));
        __CLR4_4_122b022b0lb90pdto.R.inc(96378);final double EPSILON = 1e-5;
        __CLR4_4_122b022b0lb90pdto.R.inc(96379);final double expectedMaximum = function.getMaximum();
        __CLR4_4_122b022b0lb90pdto.R.inc(96380);final double actualMaximum = estimate.getValue();
        __CLR4_4_122b022b0lb90pdto.R.inc(96381);Assert.assertEquals(expectedMaximum, actualMaximum, EPSILON);

        __CLR4_4_122b022b0lb90pdto.R.inc(96382);final double[] expectedPosition = function.getMaximumPosition();
        __CLR4_4_122b022b0lb90pdto.R.inc(96383);final double[] actualPosition = estimate.getPoint();
        __CLR4_4_122b022b0lb90pdto.R.inc(96384);Assert.assertEquals(expectedPosition[0], actualPosition[0], EPSILON );
        __CLR4_4_122b022b0lb90pdto.R.inc(96385);Assert.assertEquals(expectedPosition[1], actualPosition[1], EPSILON );
    }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

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

        public double value(double[] variables) {try{__CLR4_4_122b022b0lb90pdto.R.inc(96386);
            __CLR4_4_122b022b0lb90pdto.R.inc(96387);final double x = variables[0];
            __CLR4_4_122b022b0lb90pdto.R.inc(96388);final double y = variables[1];
            __CLR4_4_122b022b0lb90pdto.R.inc(96389);return ((((x == 0 || y == 0) )&&(__CLR4_4_122b022b0lb90pdto.R.iget(96390)!=0|true))||(__CLR4_4_122b022b0lb90pdto.R.iget(96391)==0&false))? 0 :
                FastMath.atan(x) * FastMath.atan(x + 2) * FastMath.atan(y) * FastMath.atan(y) / (x * y);
        }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}
    }

    private static class Gaussian2D implements MultivariateFunction {
        private final double[] maximumPosition;
        private final double std;

        public Gaussian2D(double xOpt, double yOpt, double std) {try{__CLR4_4_122b022b0lb90pdto.R.inc(96392);
            __CLR4_4_122b022b0lb90pdto.R.inc(96393);maximumPosition = new double[] { xOpt, yOpt };
            __CLR4_4_122b022b0lb90pdto.R.inc(96394);this.std = std;
        }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

        public double getMaximum() {try{__CLR4_4_122b022b0lb90pdto.R.inc(96395);
            __CLR4_4_122b022b0lb90pdto.R.inc(96396);return value(maximumPosition);
        }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

        public double[] getMaximumPosition() {try{__CLR4_4_122b022b0lb90pdto.R.inc(96397);
            __CLR4_4_122b022b0lb90pdto.R.inc(96398);return maximumPosition.clone();
        }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}

        public double value(double[] point) {try{__CLR4_4_122b022b0lb90pdto.R.inc(96399);
            __CLR4_4_122b022b0lb90pdto.R.inc(96400);final double x = point[0], y = point[1];
            __CLR4_4_122b022b0lb90pdto.R.inc(96401);final double twoS2 = 2.0 * std * std;
            __CLR4_4_122b022b0lb90pdto.R.inc(96402);return 1.0 / (twoS2 * FastMath.PI) * FastMath.exp(-(x * x + y * y) / twoS2);
        }finally{__CLR4_4_122b022b0lb90pdto.R.flushNeeded();}}
    }

    private int count;
}
