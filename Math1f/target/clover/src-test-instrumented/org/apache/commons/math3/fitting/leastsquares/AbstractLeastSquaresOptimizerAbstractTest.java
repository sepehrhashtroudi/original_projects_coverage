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
package org.apache.commons.math3.fitting.leastsquares;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Some of the unit tests are re-implementations of the MINPACK
 * <a href="http://www.netlib.org/minpack/ex/file17">file17</a> and
 * <a href="http://www.netlib.org/minpack/ex/file22">file22</a> test files.
 * The redistribution policy for MINPACK is available
 * <a href="http://www.netlib.org/minpack/disclaimer">here</a>.
 *
 * <T> Concrete implementation of an optimizer.
 *
 * @version $Id$
 */
public abstract class AbstractLeastSquaresOptimizerAbstractTest<T extends AbstractLeastSquaresOptimizer<T>> {static class __CLR4_4_11ld51ld5lb90pcj7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * @return a concrete optimizer.
     */
    public abstract T createOptimizer();

    /**
     * @return the default number of allowed iterations (which will be
     * used when not specified otherwise).
     */
    public abstract int getMaxIterations();

    @Test
    public void testShallowCopy() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13s4a1u1ld5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testShallowCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13s4a1u1ld5(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74345);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74346);final int maxEval1 = 12;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74347);final int maxIter1 = 23;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74348);final double[] target1 = { 3.4 };
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74349);final double[] weight1 = { 4.5 };
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74350);final double[] start1 = { 5.6 };
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74351);final double factor1 = 6.7;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74352);final MultivariateVectorFunction model1 = new MultivariateVectorFunction() {
                public double[] value(double[] point) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74353);
                    __CLR4_4_11ld51ld5lb90pcj7.R.inc(74354);return new double[] {
                        factor1 * factor1 * point[0]
                    };
                }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}};
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74355);final MultivariateMatrixFunction jac1 = new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74356);
                        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74357);return new double[][] {
                            { 2 * factor1 * point[0] }
                        };
                    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}
                };


        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74358);final T optim1 = createOptimizer()
            .withMaxEvaluations(maxEval1)
            .withMaxIterations(maxIter1)
            .withTarget(target1)
            .withWeight(new DiagonalMatrix(weight1))
            .withStartPoint(start1)
            .withModelAndJacobian(model1, jac1);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74359);final T optim2 = optim1.shallowCopy();

        // Check that all fields have the same values.
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74360);Assert.assertTrue(optim1.getMaxEvaluations() == optim2.getMaxEvaluations());
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74361);Assert.assertTrue(optim1.getMaxIterations() == optim2.getMaxIterations());
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74362);Assert.assertTrue(optim1.getTarget()[0] == optim2.getTarget()[0]);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74363);Assert.assertTrue(optim1.getWeight().getEntry(0, 0) == optim2.getWeight().getEntry(0, 0));
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74364);Assert.assertTrue(optim1.getStart()[0] == optim2.getStart()[0]);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74365);Assert.assertTrue(optim1.getModel().value(new double[] {32})[0] == optim2.getModel().value(new double[] {32})[0]);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74366);Assert.assertTrue(optim1.getJacobian().value(new double[] {54})[0][0] == optim2.getJacobian().value(new double[] {54})[0][0]);

        // Change "optim2".
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74367);final int maxEval2 = 122;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74368);final int maxIter2 = 232;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74369);final double[] target2 = { 3.42 };
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74370);final double[] weight2 = { 4.52 };
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74371);final double[] start2 = { 5.62 };
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74372);final double factor2 = 6.72;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74373);final MultivariateVectorFunction model2 = new MultivariateVectorFunction() {
                public double[] value(double[] point) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74374);
                    __CLR4_4_11ld51ld5lb90pcj7.R.inc(74375);return new double[] {
                        factor2 * factor2 * point[0]
                    };
                }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}};
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74376);final MultivariateMatrixFunction jac2 = new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74377);
                        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74378);return new double[][] {
                            { 2 * factor2 * point[0] }
                        };
                    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}
                };

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74379);optim2
            .withMaxEvaluations(maxEval2)
            .withMaxIterations(maxIter2)
            .withTarget(target2)
            .withWeight(new DiagonalMatrix(weight2))
            .withStartPoint(start2)
            .withModelAndJacobian(model2, jac2);

        // Check that all fields now have different values.
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74380);Assert.assertFalse(optim1.getMaxEvaluations() == optim2.getMaxEvaluations());
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74381);Assert.assertFalse(optim1.getMaxIterations() == optim2.getMaxIterations());
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74382);Assert.assertFalse(optim1.getTarget()[0] == optim2.getTarget()[0]);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74383);Assert.assertFalse(optim1.getWeight().getEntry(0, 0) == optim2.getWeight().getEntry(0, 0));
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74384);Assert.assertFalse(optim1.getStart()[0] == optim2.getStart()[0]);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74385);Assert.assertFalse(optim1.getModel().value(new double[] {32})[0] == optim2.getModel().value(new double[] {32})[0]);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74386);Assert.assertFalse(optim1.getJacobian().value(new double[] {54})[0][0] == optim2.getJacobian().value(new double[] {54})[0][0]);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testGetIterations() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yhlj31leb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testGetIterations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yhlj31leb(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74387);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74388);T optim = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withTarget(new double[] { 1 })
            .withWeight(new DiagonalMatrix(new double[] { 1 }))
            .withStartPoint(new double[] { 3 })
            .withModelAndJacobian(new MultivariateVectorFunction() {
                    public double[] value(double[] point) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74389);
                        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74390);return new double[] {
                            FastMath.pow(point[0], 4)
                        };
                    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}},
                new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74391);
                        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74392);return new double[][] {
                            { 0.25 * FastMath.pow(point[0], 3) }
                        };
                    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}
                });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74393);optim.optimize();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74394);Assert.assertTrue(optim.getIterations() > 0);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testTrivial() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ri9u1lej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testTrivial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ri9u1lej(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74395);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74396);LinearProblem problem
            = new LinearProblem(new double[][] { { 2 } },
                                new double[] { 3 });
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74397);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1 }))
            .withStartPoint(new double[] { 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74398);PointVectorValuePair optimum = optimizer.optimize();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74399);Assert.assertEquals(0, optimizer.computeRMS(optimum.getPoint()), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74400);Assert.assertEquals(1.5, optimum.getPoint()[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74401);Assert.assertEquals(3.0, optimum.getValue()[0], 1e-10);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testQRColumnsPermutation() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1codiwz1leq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testQRColumnsPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1codiwz1leq(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74402);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74403);LinearProblem problem
            = new LinearProblem(new double[][] { { 1, -1 }, { 0, 2 }, { 1, -2 } },
                                new double[] { 4, 6, 1 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74404);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1 }))
            .withStartPoint(new double[] { 0, 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74405);PointVectorValuePair optimum = optimizer.optimize();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74406);Assert.assertEquals(0, optimizer.computeRMS(optimum.getPoint()), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74407);Assert.assertEquals(7, optimum.getPoint()[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74408);Assert.assertEquals(3, optimum.getPoint()[1], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74409);Assert.assertEquals(4, optimum.getValue()[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74410);Assert.assertEquals(6, optimum.getValue()[1], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74411);Assert.assertEquals(1, optimum.getValue()[2], 1e-10);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testNoDependency() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vquu3f1lf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testNoDependency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vquu3f1lf0(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74412);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74413);LinearProblem problem = new LinearProblem(new double[][] {
                { 2, 0, 0, 0, 0, 0 },
                { 0, 2, 0, 0, 0, 0 },
                { 0, 0, 2, 0, 0, 0 },
                { 0, 0, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 0, 2 }
        }, new double[] { 0, 1.1, 2.2, 3.3, 4.4, 5.5 });
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74414);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1, 1, 1, 1 }))
            .withStartPoint(new double[] { 0, 0, 0, 0, 0, 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74415);double[] optimum = optimizer.optimize().getPoint();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74416);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74417);for (int i = 0; (((i < problem.target.length)&&(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74418)!=0|true))||(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74419)==0&false)); ++i) {{
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74420);Assert.assertEquals(0.55 * i, optimum[i], 1e-10);
        }
    }}finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testOneSet() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6wyqd1lf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testOneSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6wyqd1lf9(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74421);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74422);LinearProblem problem = new LinearProblem(new double[][] {
                {  1,  0, 0 },
                { -1,  1, 0 },
                {  0, -1, 1 }
        }, new double[] { 1, 1, 1});

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74423);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1 }))
            .withStartPoint(new double[] { 0, 0, 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74424);double[] optimum = optimizer.optimize().getPoint();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74425);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74426);Assert.assertEquals(1, optimum[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74427);Assert.assertEquals(2, optimum[1], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74428);Assert.assertEquals(3, optimum[2], 1e-10);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testTwoSets() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tdq321lfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testTwoSets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tdq321lfh(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74429);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74430);double epsilon = 1e-7;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74431);LinearProblem problem = new LinearProblem(new double[][] {
                {  2,  1,   0,  4,       0, 0 },
                { -4, -2,   3, -7,       0, 0 },
                {  4,  1,  -2,  8,       0, 0 },
                {  0, -3, -12, -1,       0, 0 },
                {  0,  0,   0,  0, epsilon, 1 },
                {  0,  0,   0,  0,       1, 1 }
        }, new double[] { 2, -9, 2, 2, 1 + epsilon * epsilon, 2});

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74432);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1, 1, 1, 1 }))
            .withStartPoint(new double[] { 0, 0, 0, 0, 0, 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74433);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74434);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74435);Assert.assertEquals(3, optimum[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74436);Assert.assertEquals(4, optimum[1], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74437);Assert.assertEquals(-1, optimum[2], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74438);Assert.assertEquals(-2, optimum[3], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74439);Assert.assertEquals(1 + epsilon, optimum[4], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74440);Assert.assertEquals(1 - epsilon, optimum[5], 1e-10);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test(expected=ConvergenceException.class)
    public void testNonInvertible() throws Exception {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm6ye1lft();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,73,110,118,101,114,116,105,98,108,101,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm6ye1lft() throws Exception{try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74441);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74442);LinearProblem problem = new LinearProblem(new double[][] {
                {  1, 2, -3 },
                {  2, 1,  3 },
                { -3, 0, -9 }
        }, new double[] { 1, 1, 1 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74443);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1 }))
            .withStartPoint(new double[] { 0, 0, 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74444);optimizer.optimize();
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testIllConditioned() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3imy21lfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testIllConditioned",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3imy21lfx(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74445);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74446);LinearProblem problem1 = new LinearProblem(new double[][] {
                { 10, 7,  8,  7 },
                {  7, 5,  6,  5 },
                {  8, 6, 10,  9 },
                {  7, 5,  9, 10 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74447);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem1.getModelFunction(),
                                  problem1.getModelFunctionJacobian())
            .withTarget(problem1.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1, 1 }))
            .withStartPoint(new double[] { 0, 1, 2, 3 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74448);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74449);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74450);Assert.assertEquals(1, optimum[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74451);Assert.assertEquals(1, optimum[1], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74452);Assert.assertEquals(1, optimum[2], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74453);Assert.assertEquals(1, optimum[3], 1e-10);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74454);LinearProblem problem2 = new LinearProblem(new double[][] {
                { 10.00, 7.00, 8.10, 7.20 },
                {  7.08, 5.04, 6.00, 5.00 },
                {  8.00, 5.98, 9.89, 9.00 },
                {  6.99, 4.99, 9.00, 9.98 }
        }, new double[] { 32, 23, 33, 31 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74455);optimizer = optimizer
            .withModelAndJacobian(problem2.getModelFunction(),
                                  problem2.getModelFunctionJacobian())
            .withTarget(problem2.getTarget());

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74456);optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74457);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74458);Assert.assertEquals(-81, optimum[0], 1e-8);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74459);Assert.assertEquals(137, optimum[1], 1e-8);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74460);Assert.assertEquals(-34, optimum[2], 1e-8);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74461);Assert.assertEquals( 22, optimum[3], 1e-8);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersSimple() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ow9s81lge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testMoreEstimatedParametersSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ow9s81lge(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74462);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74463);LinearProblem problem = new LinearProblem(new double[][] {
                { 3, 2,  0, 0 },
                { 0, 1, -1, 1 },
                { 2, 0,  1, 0 }
        }, new double[] { 7, 3, 5 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74464);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1 }))
            .withStartPoint(new double[] { 7, 6, 5, 4 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74465);double[] optimum = optimizer.optimize().getPoint();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74466);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersUnsorted() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sopi41lgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testMoreEstimatedParametersUnsorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sopi41lgj(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74467);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74468);LinearProblem problem = new LinearProblem(new double[][] {
                { 1, 1,  0,  0, 0,  0 },
                { 0, 0,  1,  1, 1,  0 },
                { 0, 0,  0,  0, 1, -1 },
                { 0, 0, -1,  1, 0,  1 },
                { 0, 0,  0, -1, 1,  0 }
       }, new double[] { 3, 12, -1, 7, 1 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74469);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1, 1, 1 }))
            .withStartPoint(new double[] { 2, 2, 2, 2, 2, 2 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74470);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74471);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74472);Assert.assertEquals(3, optimum[2], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74473);Assert.assertEquals(4, optimum[3], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74474);Assert.assertEquals(5, optimum[4], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74475);Assert.assertEquals(6, optimum[5], 1e-10);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testRedundantEquations() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lkgd1lgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testRedundantEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lkgd1lgs(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74476);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74477);LinearProblem problem = new LinearProblem(new double[][] {
                { 1,  1 },
                { 1, -1 },
                { 1,  3 }
        }, new double[] { 3, 1, 5 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74478);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1 }))
            .withStartPoint(new double[] { 1, 1 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74479);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74480);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74481);Assert.assertEquals(2, optimum[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74482);Assert.assertEquals(1, optimum[1], 1e-10);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testInconsistentEquations() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5k8or1lgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5k8or1lgz(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74483);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74484);LinearProblem problem = new LinearProblem(new double[][] {
                { 1,  1 },
                { 1, -1 },
                { 1,  3 }
        }, new double[] { 3, 1, 4 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74485);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1 }))
            .withStartPoint(new double[] { 1, 1 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74486);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74487);Assert.assertTrue(optimizer.computeRMS(optimum) > 0.1);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testInconsistentSizes1() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kd0lt1lh4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,110,115,105,115,116,101,110,116,83,105,122,101,115,49,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentSizes1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kd0lt1lh4(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74488);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74489);LinearProblem problem
            = new LinearProblem(new double[][] { { 1, 0 },
                                                 { 0, 1 } },
                                new double[] { -1, 1 });
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74490);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1 }))
            .withStartPoint(new double[] { 0, 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74491);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74492);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74493);Assert.assertEquals(-1, optimum[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74494);Assert.assertEquals(1, optimum[1], 1e-10);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74495);optimizer.withWeight(new DiagonalMatrix(new double[] { 1 })).optimize();
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testInconsistentSizes2() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11omy6o1lhc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,110,115,105,115,116,101,110,116,83,105,122,101,115,50,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentSizes2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11omy6o1lhc(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74496);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74497);LinearProblem problem
            = new LinearProblem(new double[][] { { 1, 0 }, { 0, 1 } },
                                new double[] { -1, 1 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74498);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1 }))
            .withStartPoint(new double[] { 0, 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74499);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74500);Assert.assertEquals(0, optimizer.computeRMS(optimum), 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74501);Assert.assertEquals(-1, optimum[0], 1e-10);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74502);Assert.assertEquals(1, optimum[1], 1e-10);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74503);optimizer
            .withTarget(new double[] { 1 })
            .withWeight(new DiagonalMatrix(new double[] { 1 }))
            .optimize();
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testCircleFitting() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcouro1lhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testCircleFitting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcouro1lhk(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74504);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74505);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74506);circle.addPoint( 30,  68);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74507);circle.addPoint( 50,  -6);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74508);circle.addPoint(110, -20);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74509);circle.addPoint( 35,  15);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74510);circle.addPoint( 45,  97);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74511);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(circle.getModelFunction(),
                                  circle.getModelFunctionJacobian())
            .withTarget(new double[] { 0, 0, 0, 0, 0 })
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1, 1, 1 }))
            .withStartPoint(new double[] { 98.680, 47.345 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74512);double[] optimum = optimizer.optimize().getPoint();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74513);Assert.assertTrue(optimizer.getEvaluations() < 10);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74514);double rms = optimizer.computeRMS(optimum);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74515);Assert.assertEquals(1.768262623567235,  FastMath.sqrt(circle.getN()) * rms, 1e-10);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74516);Vector2D center = new Vector2D(optimum[0], optimum[1]);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74517);Assert.assertEquals(69.96016176931406, circle.getRadius(center), 1e-6);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74518);Assert.assertEquals(96.07590211815305, center.getX(), 1e-6);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74519);Assert.assertEquals(48.13516790438953, center.getY(), 1e-6);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74520);double[][] cov = optimizer.computeCovariances(optimum, 1e-14);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74521);Assert.assertEquals(1.839, cov[0][0], 0.001);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74522);Assert.assertEquals(0.731, cov[0][1], 0.001);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74523);Assert.assertEquals(cov[0][1], cov[1][0], 1e-14);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74524);Assert.assertEquals(0.786, cov[1][1], 0.001);

        // add perfect measurements and check errors are reduced
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74525);double  r = circle.getRadius(center);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74526);for (double d= 0; (((d < 2 * FastMath.PI)&&(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74527)!=0|true))||(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74528)==0&false)); d += 0.01) {{
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74529);circle.addPoint(center.getX() + r * FastMath.cos(d), center.getY() + r * FastMath.sin(d));
        }

        }__CLR4_4_11ld51ld5lb90pcj7.R.inc(74530);double[] target = new double[circle.getN()];
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74531);Arrays.fill(target, 0);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74532);double[] weights = new double[circle.getN()];
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74533);Arrays.fill(weights, 2);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74534);optimizer = optimizer.withTarget(target).withWeight(new DiagonalMatrix(weights));
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74535);optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74536);cov = optimizer.computeCovariances(optimum, 1e-14);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74537);Assert.assertEquals(0.0016, cov[0][0], 0.001);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74538);Assert.assertEquals(3.2e-7, cov[0][1], 1e-9);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74539);Assert.assertEquals(cov[0][1], cov[1][0], 1e-14);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74540);Assert.assertEquals(0.0016, cov[1][1], 0.001);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testCircleFittingBadInit() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlbl5t1lil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testCircleFittingBadInit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlbl5t1lil(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74541);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74542);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74543);double[][] points = circlePoints;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74544);double[] target = new double[points.length];
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74545);Arrays.fill(target, 0);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74546);double[] weights = new double[points.length];
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74547);Arrays.fill(weights, 2);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74548);for (int i = 0; (((i < points.length)&&(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74549)!=0|true))||(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74550)==0&false)); ++i) {{
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74551);circle.addPoint(points[i][0], points[i][1]);
        }
        }__CLR4_4_11ld51ld5lb90pcj7.R.inc(74552);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(circle.getModelFunction(),
                                  circle.getModelFunctionJacobian())
            .withTarget(target)
            .withWeight(new DiagonalMatrix(weights))
            .withStartPoint(new double[] { -12, -12 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74553);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74554);Vector2D center = new Vector2D(optimum[0], optimum[1]);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74555);Assert.assertTrue(optimizer.getEvaluations() < 25);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74556);Assert.assertEquals( 0.043, optimizer.computeRMS(optimum), 1e-3);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74557);Assert.assertEquals( 0.292235,  circle.getRadius(center), 1e-6);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74558);Assert.assertEquals(-0.151738,  center.getX(), 1e-6);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74559);Assert.assertEquals( 0.2075001, center.getY(), 1e-6);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testCircleFittingGoodInit() {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2xc9b1lj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testCircleFittingGoodInit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2xc9b1lj4(){try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74560);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74561);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74562);double[][] points = circlePoints;
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74563);double[] target = new double[points.length];
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74564);Arrays.fill(target, 0);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74565);double[] weights = new double[points.length];
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74566);Arrays.fill(weights, 2);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74567);for (int i = 0; (((i < points.length)&&(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74568)!=0|true))||(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74569)==0&false)); ++i) {{
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74570);circle.addPoint(points[i][0], points[i][1]);
        }
        }__CLR4_4_11ld51ld5lb90pcj7.R.inc(74571);T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(circle.getModelFunction(),
                                  circle.getModelFunctionJacobian())
            .withTarget(target)
            .withWeight(new DiagonalMatrix(weights))
            .withStartPoint(new double[] { 0, 0 });

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74572);double[] optimum = optimizer.optimize().getPoint();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74573);Assert.assertEquals(-0.1517383071957963, optimum[0], 1e-6);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74574);Assert.assertEquals(0.2074999736353867,  optimum[1], 1e-6);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74575);Assert.assertEquals(0.04268731682389561, optimizer.computeRMS(optimum), 1e-8);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    private final double[][] circlePoints = new double[][] {
        {-0.312967,  0.072366}, {-0.339248,  0.132965}, {-0.379780,  0.202724},
        {-0.390426,  0.260487}, {-0.361212,  0.328325}, {-0.346039,  0.392619},
        {-0.280579,  0.444306}, {-0.216035,  0.470009}, {-0.149127,  0.493832},
        {-0.075133,  0.483271}, {-0.007759,  0.452680}, { 0.060071,  0.410235},
        { 0.103037,  0.341076}, { 0.118438,  0.273884}, { 0.131293,  0.192201},
        { 0.115869,  0.129797}, { 0.072223,  0.058396}, { 0.022884,  0.000718},
        {-0.053355, -0.020405}, {-0.123584, -0.032451}, {-0.216248, -0.032862},
        {-0.278592, -0.005008}, {-0.337655,  0.056658}, {-0.385899,  0.112526},
        {-0.405517,  0.186957}, {-0.415374,  0.262071}, {-0.387482,  0.343398},
        {-0.347322,  0.397943}, {-0.287623,  0.458425}, {-0.223502,  0.475513},
        {-0.135352,  0.478186}, {-0.061221,  0.483371}, { 0.003711,  0.422737},
        { 0.065054,  0.375830}, { 0.108108,  0.297099}, { 0.123882,  0.222850},
        { 0.117729,  0.134382}, { 0.085195,  0.056820}, { 0.029800, -0.019138},
        {-0.027520, -0.072374}, {-0.102268, -0.091555}, {-0.200299, -0.106578},
        {-0.292731, -0.091473}, {-0.356288, -0.051108}, {-0.420561,  0.014926},
        {-0.471036,  0.074716}, {-0.488638,  0.182508}, {-0.485990,  0.254068},
        {-0.463943,  0.338438}, {-0.406453,  0.404704}, {-0.334287,  0.466119},
        {-0.254244,  0.503188}, {-0.161548,  0.495769}, {-0.075733,  0.495560},
        { 0.001375,  0.434937}, { 0.082787,  0.385806}, { 0.115490,  0.323807},
        { 0.141089,  0.223450}, { 0.138693,  0.131703}, { 0.126415,  0.049174},
        { 0.066518, -0.010217}, {-0.005184, -0.070647}, {-0.080985, -0.103635},
        {-0.177377, -0.116887}, {-0.260628, -0.100258}, {-0.335756, -0.056251},
        {-0.405195, -0.000895}, {-0.444937,  0.085456}, {-0.484357,  0.175597},
        {-0.472453,  0.248681}, {-0.438580,  0.347463}, {-0.402304,  0.422428},
        {-0.326777,  0.479438}, {-0.247797,  0.505581}, {-0.152676,  0.519380},
        {-0.071754,  0.516264}, { 0.015942,  0.472802}, { 0.076608,  0.419077},
        { 0.127673,  0.330264}, { 0.159951,  0.262150}, { 0.153530,  0.172681},
        { 0.140653,  0.089229}, { 0.078666,  0.024981}, { 0.023807, -0.037022},
        {-0.048837, -0.077056}, {-0.127729, -0.075338}, {-0.221271, -0.067526}
    };

    public void doTestStRD(final StatisticalReferenceDataset dataset,
                           final double errParams,
                           final double errParamsSd) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74576);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74577);final double[] w = new double[dataset.getNumObservations()];
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74578);Arrays.fill(w, 1);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74579);final double[][] data = dataset.getData();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74580);final double[] initial = dataset.getStartingPoint(0);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74581);final StatisticalReferenceDataset.LeastSquaresProblem problem = dataset.getLeastSquaresProblem();

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74582);final T optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(getMaxIterations())
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(data[1])
            .withWeight(new DiagonalMatrix(w))
            .withStartPoint(initial);

        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74583);final double[] actual = optimizer.optimize().getPoint();
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74584);for (int i = 0; (((i < actual.length)&&(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74585)!=0|true))||(__CLR4_4_11ld51ld5lb90pcj7.R.iget(74586)==0&false)); i++) {{
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74587);double expected = dataset.getParameter(i);
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74588);double delta = FastMath.abs(errParams * expected);
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74589);Assert.assertEquals(dataset.getName() + ", param #" + i,
                                expected, actual[i], delta);
        }
    }}finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testKirby2() throws IOException {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6a7nk1ljy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testKirby2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6a7nk1ljy() throws IOException{try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74590);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74591);doTestStRD(StatisticalReferenceDatasetFactory.createKirby2(), 1E-7, 1E-7);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    @Test
    public void testHahn1() throws IOException {__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceStart(getClass().getName(),74592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynumnb1lk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ld51ld5lb90pcj7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ld51ld5lb90pcj7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerAbstractTest.testHahn1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynumnb1lk0() throws IOException{try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74592);
        __CLR4_4_11ld51ld5lb90pcj7.R.inc(74593);doTestStRD(StatisticalReferenceDatasetFactory.createHahn1(), 1E-7, 1E-4);
    }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

    static class LinearProblem {
        private final RealMatrix factors;
        private final double[] target;

        public LinearProblem(double[][] factors, double[] target) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74594);
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74595);this.factors = new BlockRealMatrix(factors);
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74596);this.target  = target;
        }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

        public double[] getTarget() {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74597);
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74598);return target;
        }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

        public MultivariateVectorFunction getModelFunction() {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74599);
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74600);return new MultivariateVectorFunction() {
                public double[] value(double[] params) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74601);
                    __CLR4_4_11ld51ld5lb90pcj7.R.inc(74602);return factors.operate(params);
                }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}
            };
        }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}

        public MultivariateMatrixFunction getModelFunctionJacobian() {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74603);
            __CLR4_4_11ld51ld5lb90pcj7.R.inc(74604);return new MultivariateMatrixFunction() {
                public double[][] value(double[] params) {try{__CLR4_4_11ld51ld5lb90pcj7.R.inc(74605);
                    __CLR4_4_11ld51ld5lb90pcj7.R.inc(74606);return factors.getData();
                }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}
            };
        }finally{__CLR4_4_11ld51ld5lb90pcj7.R.flushNeeded();}}
    }
}
