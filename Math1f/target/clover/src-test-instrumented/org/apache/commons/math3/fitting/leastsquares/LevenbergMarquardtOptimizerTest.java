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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

/**
 * <p>Some of the unit tests are re-implementations of the MINPACK <a
 * href="http://www.netlib.org/minpack/ex/file17">file17</a> and <a
 * href="http://www.netlib.org/minpack/ex/file22">file22</a> test files.
 * The redistribution policy for MINPACK is available <a
 * href="http://www.netlib.org/minpack/disclaimer">here</a>.
 *
 * @version $Id$
 */
public class LevenbergMarquardtOptimizerTest
    extends AbstractLeastSquaresOptimizerAbstractTest<LevenbergMarquardtOptimizer> {static class __CLR4_4_11lt31lt3lb90pck7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,75082,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Override
    public LevenbergMarquardtOptimizer createOptimizer() {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(74919);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74920);return LevenbergMarquardtOptimizer.create();
    }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

    @Override
    public int getMaxIterations() {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(74921);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74922);return 25;
    }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

    @Override
    @Test
    public void testShallowCopy() {__CLR4_4_11lt31lt3lb90pck7.R.globalSliceStart(getClass().getName(),74923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13s4a1u1lt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lt31lt3lb90pck7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lt31lt3lb90pck7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testShallowCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13s4a1u1lt7(){try{__CLR4_4_11lt31lt3lb90pck7.R.inc(74923);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74924);super.testShallowCopy(); // Test copy of parent.

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74925);final double initStep1 = 1e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74926);final double costTol1 = 1e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74927);final double parTol1 = 1e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74928);final double orthoTol1 = 1e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74929);final double threshold1 = 1e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74930);final LevenbergMarquardtOptimizer optim1 = createOptimizer()
            .withInitialStepBoundFactor(initStep1)
            .withCostRelativeTolerance(costTol1)
            .withParameterRelativeTolerance(parTol1)
            .withOrthoTolerance(orthoTol1)
            .withRankingThreshold(threshold1);

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74931);final LevenbergMarquardtOptimizer optim2 = optim1.shallowCopy();

        // Check that all fields have the same values.
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74932);Assert.assertTrue(optim1.getInitialStepBoundFactor() == optim2.getInitialStepBoundFactor());
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74933);Assert.assertTrue(optim1.getCostRelativeTolerance() == optim2.getCostRelativeTolerance());
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74934);Assert.assertTrue(optim1.getParameterRelativeTolerance() == optim2.getParameterRelativeTolerance());
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74935);Assert.assertTrue(optim1.getOrthoTolerance() == optim2.getOrthoTolerance());
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74936);Assert.assertTrue(optim1.getRankingThreshold() == optim2.getRankingThreshold());

        // Change "optim2".
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74937);final double initStep2 = 2e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74938);final double costTol2 = 2e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74939);final double parTol2 = 2e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74940);final double orthoTol2 = 2e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74941);final double threshold2 = 2e-1;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74942);optim2
            .withInitialStepBoundFactor(initStep2)
            .withCostRelativeTolerance(costTol2)
            .withParameterRelativeTolerance(parTol2)
            .withOrthoTolerance(orthoTol2)
            .withRankingThreshold(threshold2);

        // Check that all fields now have different values.
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74943);Assert.assertFalse(optim1.getInitialStepBoundFactor() == optim2.getInitialStepBoundFactor());
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74944);Assert.assertFalse(optim1.getCostRelativeTolerance() == optim2.getCostRelativeTolerance());
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74945);Assert.assertFalse(optim1.getParameterRelativeTolerance() == optim2.getParameterRelativeTolerance());
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74946);Assert.assertFalse(optim1.getOrthoTolerance() == optim2.getOrthoTolerance());
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74947);Assert.assertFalse(optim1.getRankingThreshold() == optim2.getRankingThreshold());
    }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

    @Override
    @Test(expected=SingularMatrixException.class)
    public void testNonInvertible() {__CLR4_4_11lt31lt3lb90pck7.R.globalSliceStart(getClass().getName(),74948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm6ye1ltw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,73,110,118,101,114,116,105,98,108,101,58,32,91,83,105,110,103,117,108,97,114,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof SingularMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lt31lt3lb90pck7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lt31lt3lb90pck7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm6ye1ltw(){try{__CLR4_4_11lt31lt3lb90pck7.R.inc(74948);
        /*
         * Overrides the method from parent class, since the default singularity
         * threshold (1e-14) does not trigger the expected exception.
         */
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74949);LinearProblem problem = new LinearProblem(new double[][] {
                {  1, 2, -3 },
                {  2, 1,  3 },
                { -3, 0, -9 }
        }, new double[] { 1, 1, 1 });

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74950);final LevenbergMarquardtOptimizer optimizer = createOptimizer()
            .withMaxEvaluations(100)
            .withMaxIterations(20)
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.getTarget())
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1 }))
            .withStartPoint(new double[] { 0, 0, 0 });

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74951);final double[] optimum = optimizer.optimize().getPoint();
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74952);Assert.assertTrue(FastMath.sqrt(optimizer.getTarget().length) * optimizer.computeRMS(optimum) > 0.6);

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74953);optimizer.computeCovariances(optimum, 1.5e-14);
    }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

    @Test
    public void testControlParameters() {__CLR4_4_11lt31lt3lb90pck7.R.globalSliceStart(getClass().getName(),74954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kd6zo1lu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lt31lt3lb90pck7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lt31lt3lb90pck7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testControlParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kd6zo1lu2(){try{__CLR4_4_11lt31lt3lb90pck7.R.inc(74954);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74955);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74956);circle.addPoint( 30.0,  68.0);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74957);circle.addPoint( 50.0,  -6.0);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74958);circle.addPoint(110.0, -20.0);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74959);circle.addPoint( 35.0,  15.0);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74960);circle.addPoint( 45.0,  97.0);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74961);checkEstimate(circle.getModelFunction(),
                      circle.getModelFunctionJacobian(),
                      0.1, 10, 1.0e-14, 1.0e-16, 1.0e-10, false);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74962);checkEstimate(circle.getModelFunction(),
                      circle.getModelFunctionJacobian(),
                      0.1, 10, 1.0e-15, 1.0e-17, 1.0e-10, true);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74963);checkEstimate(circle.getModelFunction(),
                      circle.getModelFunctionJacobian(),
                      0.1,  5, 1.0e-15, 1.0e-16, 1.0e-10, true);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74964);circle.addPoint(300, -300);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74965);checkEstimate(circle.getModelFunction(),
                      circle.getModelFunctionJacobian(),
                      0.1, 20, 1.0e-18, 1.0e-16, 1.0e-10, true);
    }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

    private void checkEstimate(MultivariateVectorFunction problem,
                               MultivariateMatrixFunction problemJacobian,
                               double initialStepBoundFactor, int maxCostEval,
                               double costRelativeTolerance, double parRelativeTolerance,
                               double orthoTolerance, boolean shouldFail) {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(74966);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74967);try {
            __CLR4_4_11lt31lt3lb90pck7.R.inc(74968);final LevenbergMarquardtOptimizer optimizer = LevenbergMarquardtOptimizer.create()
                .withInitialStepBoundFactor(initialStepBoundFactor)
                .withCostRelativeTolerance(costRelativeTolerance)
                .withParameterRelativeTolerance(parRelativeTolerance)
                .withOrthoTolerance(orthoTolerance)
                .withRankingThreshold(Precision.SAFE_MIN)
                .withMaxEvaluations(maxCostEval)
                .withMaxIterations(100)
                .withModelAndJacobian(problem, problemJacobian)
                .withTarget(new double[] { 0, 0, 0, 0, 0 })
                .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1, 1, 1 }))
                .withStartPoint(new double[] { 98.680, 47.345 });

            __CLR4_4_11lt31lt3lb90pck7.R.inc(74969);optimizer.optimize();

            __CLR4_4_11lt31lt3lb90pck7.R.inc(74970);Assert.assertTrue(!shouldFail);
        } catch (DimensionMismatchException ee) {
            __CLR4_4_11lt31lt3lb90pck7.R.inc(74971);Assert.assertTrue(shouldFail);
        } catch (TooManyEvaluationsException ee) {
            __CLR4_4_11lt31lt3lb90pck7.R.inc(74972);Assert.assertTrue(shouldFail);
        }
    }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

    /**
     * Non-linear test case: fitting of decay curve (from Chapter 8 of
     * Bevington's textbook, "Data reduction and analysis for the physical sciences").
     * XXX The expected ("reference") values may not be accurate and the tolerance too
     * relaxed for this test to be currently really useful (the issue is under
     * investigation).
     */
    @Test
    public void testBevington() {__CLR4_4_11lt31lt3lb90pck7.R.globalSliceStart(getClass().getName(),74973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o98tt31lul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lt31lt3lb90pck7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lt31lt3lb90pck7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testBevington",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o98tt31lul(){try{__CLR4_4_11lt31lt3lb90pck7.R.inc(74973);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74974);final double[][] dataPoints = {
            // column 1 = times
            { 15, 30, 45, 60, 75, 90, 105, 120, 135, 150,
              165, 180, 195, 210, 225, 240, 255, 270, 285, 300,
              315, 330, 345, 360, 375, 390, 405, 420, 435, 450,
              465, 480, 495, 510, 525, 540, 555, 570, 585, 600,
              615, 630, 645, 660, 675, 690, 705, 720, 735, 750,
              765, 780, 795, 810, 825, 840, 855, 870, 885, },
            // column 2 = measured counts
            { 775, 479, 380, 302, 185, 157, 137, 119, 110, 89,
              74, 61, 66, 68, 48, 54, 51, 46, 55, 29,
              28, 37, 49, 26, 35, 29, 31, 24, 25, 35,
              24, 30, 26, 28, 21, 18, 20, 27, 17, 17,
              14, 17, 24, 11, 22, 17, 12, 10, 13, 16,
              9, 9, 14, 21, 17, 13, 12, 18, 10, },
        };

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74975);final BevingtonProblem problem = new BevingtonProblem();

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74976);final int len = dataPoints[0].length;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74977);final double[] weights = new double[len];
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74978);for (int i = 0; (((i < len)&&(__CLR4_4_11lt31lt3lb90pck7.R.iget(74979)!=0|true))||(__CLR4_4_11lt31lt3lb90pck7.R.iget(74980)==0&false)); i++) {{
            __CLR4_4_11lt31lt3lb90pck7.R.inc(74981);problem.addPoint(dataPoints[0][i],
                             dataPoints[1][i]);

            __CLR4_4_11lt31lt3lb90pck7.R.inc(74982);weights[i] = 1 / dataPoints[1][i];
        }

        }__CLR4_4_11lt31lt3lb90pck7.R.inc(74983);final LevenbergMarquardtOptimizer optimizer = LevenbergMarquardtOptimizer.create()
            .withMaxEvaluations(100)
            .withMaxIterations(20)
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(dataPoints[1])
            .withWeight(new DiagonalMatrix(weights))
            .withStartPoint(new double[] { 10, 900, 80, 27, 225 });

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74984);final PointVectorValuePair optimum = optimizer.optimize();
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74985);final double[] solution = optimum.getPoint();
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74986);final double[] expectedSolution = { 10.4, 958.3, 131.4, 33.9, 205.0 };

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74987);final double[][] covarMatrix = optimizer.computeCovariances(solution, 1e-14);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74988);final double[][] expectedCovarMatrix = {
            { 3.38, -3.69, 27.98, -2.34, -49.24 },
            { -3.69, 2492.26, 81.89, -69.21, -8.9 },
            { 27.98, 81.89, 468.99, -44.22, -615.44 },
            { -2.34, -69.21, -44.22, 6.39, 53.80 },
            { -49.24, -8.9, -615.44, 53.8, 929.45 }
        };

        __CLR4_4_11lt31lt3lb90pck7.R.inc(74989);final int numParams = expectedSolution.length;

        // Check that the computed solution is within the reference error range.
        __CLR4_4_11lt31lt3lb90pck7.R.inc(74990);for (int i = 0; (((i < numParams)&&(__CLR4_4_11lt31lt3lb90pck7.R.iget(74991)!=0|true))||(__CLR4_4_11lt31lt3lb90pck7.R.iget(74992)==0&false)); i++) {{
            __CLR4_4_11lt31lt3lb90pck7.R.inc(74993);final double error = FastMath.sqrt(expectedCovarMatrix[i][i]);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(74994);Assert.assertEquals("Parameter " + i, expectedSolution[i], solution[i], error);
        }

        // Check that each entry of the computed covariance matrix is within 10%
        // of the reference matrix entry.
        }__CLR4_4_11lt31lt3lb90pck7.R.inc(74995);for (int i = 0; (((i < numParams)&&(__CLR4_4_11lt31lt3lb90pck7.R.iget(74996)!=0|true))||(__CLR4_4_11lt31lt3lb90pck7.R.iget(74997)==0&false)); i++) {{
            __CLR4_4_11lt31lt3lb90pck7.R.inc(74998);for (int j = 0; (((j < numParams)&&(__CLR4_4_11lt31lt3lb90pck7.R.iget(74999)!=0|true))||(__CLR4_4_11lt31lt3lb90pck7.R.iget(75000)==0&false)); j++) {{
                __CLR4_4_11lt31lt3lb90pck7.R.inc(75001);Assert.assertEquals("Covariance matrix [" + i + "][" + j + "]",
                                    expectedCovarMatrix[i][j],
                                    covarMatrix[i][j],
                                    FastMath.abs(0.1 * expectedCovarMatrix[i][j]));
            }
        }}
    }}finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

    @Test
    public void testCircleFitting2() {__CLR4_4_11lt31lt3lb90pck7.R.globalSliceStart(getClass().getName(),75002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj6el81lve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lt31lt3lb90pck7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lt31lt3lb90pck7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testCircleFitting2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj6el81lve(){try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75002);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75003);final double xCenter = 123.456;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75004);final double yCenter = 654.321;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75005);final double xSigma = 10;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75006);final double ySigma = 15;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75007);final double radius = 111.111;
        // The test is extremely sensitive to the seed.
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75008);final long seed = 59421061L;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75009);final RandomCirclePointGenerator factory
            = new RandomCirclePointGenerator(xCenter, yCenter, radius,
                                             xSigma, ySigma,
                                             seed);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75010);final CircleProblem circle = new CircleProblem(xSigma, ySigma);

        __CLR4_4_11lt31lt3lb90pck7.R.inc(75011);final int numPoints = 10;
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75012);for (Vector2D p : factory.generate(numPoints)) {{
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75013);circle.addPoint(p.getX(), p.getY());
        }

        // First guess for the center's coordinates and radius.
        }__CLR4_4_11lt31lt3lb90pck7.R.inc(75014);final double[] init = { 90, 659, 115 };

        __CLR4_4_11lt31lt3lb90pck7.R.inc(75015);final LevenbergMarquardtOptimizer optimizer = LevenbergMarquardtOptimizer.create()
            .withMaxEvaluations(100)
            .withMaxIterations(50)
            .withModelAndJacobian(circle.getModelFunction(),
                                  circle.getModelFunctionJacobian())
            .withTarget(circle.target())
            .withWeight(new DiagonalMatrix(circle.weight()))
            .withStartPoint(init);

        __CLR4_4_11lt31lt3lb90pck7.R.inc(75016);final PointVectorValuePair optimum = optimizer.optimize();
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75017);final double[] paramFound = optimum.getPoint();

        // Retrieve errors estimation.
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75018);final double[] asymptoticStandardErrorFound = optimizer.computeSigma(paramFound, 1e-14);

        // Check that the parameters are found within the assumed error bars.
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75019);Assert.assertEquals(xCenter, paramFound[0], asymptoticStandardErrorFound[0]);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75020);Assert.assertEquals(yCenter, paramFound[1], asymptoticStandardErrorFound[1]);
        __CLR4_4_11lt31lt3lb90pck7.R.inc(75021);Assert.assertEquals(radius, paramFound[2], asymptoticStandardErrorFound[2]);
    }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

    private static class QuadraticProblem {
        private List<Double> x;
        private List<Double> y;

        public QuadraticProblem() {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75022);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75023);x = new ArrayList<Double>();
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75024);y = new ArrayList<Double>();
        }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

        public void addPoint(double x, double y) {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75025);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75026);this.x.add(x);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75027);this.y.add(y);
        }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

        public MultivariateVectorFunction getModelFunction() {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75028);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75029);return new MultivariateVectorFunction() {
                public double[] value(double[] variables) {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75030);
                    __CLR4_4_11lt31lt3lb90pck7.R.inc(75031);double[] values = new double[x.size()];
                    __CLR4_4_11lt31lt3lb90pck7.R.inc(75032);for (int i = 0; (((i < values.length)&&(__CLR4_4_11lt31lt3lb90pck7.R.iget(75033)!=0|true))||(__CLR4_4_11lt31lt3lb90pck7.R.iget(75034)==0&false)); ++i) {{
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75035);values[i] = (variables[0] * x.get(i) + variables[1]) * x.get(i) + variables[2];
                    }
                    }__CLR4_4_11lt31lt3lb90pck7.R.inc(75036);return values;
                }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}
            };
        }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

        public MultivariateMatrixFunction getModelFunctionJacobian() {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75037);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75038);return new MultivariateMatrixFunction() {
                public double[][] value(double[] params) {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75039);                    
                    __CLR4_4_11lt31lt3lb90pck7.R.inc(75040);double[][] jacobian = new double[x.size()][3];
                    __CLR4_4_11lt31lt3lb90pck7.R.inc(75041);for (int i = 0; (((i < jacobian.length)&&(__CLR4_4_11lt31lt3lb90pck7.R.iget(75042)!=0|true))||(__CLR4_4_11lt31lt3lb90pck7.R.iget(75043)==0&false)); ++i) {{
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75044);jacobian[i][0] = x.get(i) * x.get(i);
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75045);jacobian[i][1] = x.get(i);
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75046);jacobian[i][2] = 1.0;
                    }
                    }__CLR4_4_11lt31lt3lb90pck7.R.inc(75047);return jacobian;
                }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}
            };
        }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}
    }

    private static class BevingtonProblem {
        private List<Double> time;
        private List<Double> count;

        public BevingtonProblem() {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75048);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75049);time = new ArrayList<Double>();
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75050);count = new ArrayList<Double>();
        }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

        public void addPoint(double t, double c) {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75051);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75052);time.add(t);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75053);count.add(c);
        }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

        public MultivariateVectorFunction getModelFunction() {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75054);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75055);return new MultivariateVectorFunction() {
                public double[] value(double[] params) {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75056);
                    __CLR4_4_11lt31lt3lb90pck7.R.inc(75057);double[] values = new double[time.size()];
                    __CLR4_4_11lt31lt3lb90pck7.R.inc(75058);for (int i = 0; (((i < values.length)&&(__CLR4_4_11lt31lt3lb90pck7.R.iget(75059)!=0|true))||(__CLR4_4_11lt31lt3lb90pck7.R.iget(75060)==0&false)); ++i) {{
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75061);final double t = time.get(i);
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75062);values[i] = params[0] +
                            params[1] * Math.exp(-t / params[3]) +
                            params[2] * Math.exp(-t / params[4]);
                    }
                    }__CLR4_4_11lt31lt3lb90pck7.R.inc(75063);return values;
                }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}
            };
        }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}

        public MultivariateMatrixFunction getModelFunctionJacobian() {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75064);
            __CLR4_4_11lt31lt3lb90pck7.R.inc(75065);return new MultivariateMatrixFunction() {
                public double[][] value(double[] params) {try{__CLR4_4_11lt31lt3lb90pck7.R.inc(75066);
                    __CLR4_4_11lt31lt3lb90pck7.R.inc(75067);double[][] jacobian = new double[time.size()][5];

                    __CLR4_4_11lt31lt3lb90pck7.R.inc(75068);for (int i = 0; (((i < jacobian.length)&&(__CLR4_4_11lt31lt3lb90pck7.R.iget(75069)!=0|true))||(__CLR4_4_11lt31lt3lb90pck7.R.iget(75070)==0&false)); ++i) {{
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75071);final double t = time.get(i);
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75072);jacobian[i][0] = 1;

                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75073);final double p3 =  params[3];
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75074);final double p4 =  params[4];
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75075);final double tOp3 = t / p3;
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75076);final double tOp4 = t / p4;
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75077);jacobian[i][1] = Math.exp(-tOp3);
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75078);jacobian[i][2] = Math.exp(-tOp4);
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75079);jacobian[i][3] = params[1] * Math.exp(-tOp3) * tOp3 / p3;
                        __CLR4_4_11lt31lt3lb90pck7.R.inc(75080);jacobian[i][4] = params[2] * Math.exp(-tOp4) * tOp4 / p4;
                    }
                    }__CLR4_4_11lt31lt3lb90pck7.R.inc(75081);return jacobian;
                }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}
            };
        }finally{__CLR4_4_11lt31lt3lb90pck7.R.flushNeeded();}}
    }
}
