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

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p>Some of the unit tests are re-implementations of the MINPACK <a
 * href="http://www.netlib.org/minpack/ex/file17">file17</a> and <a
 * href="http://www.netlib.org/minpack/ex/file22">file22</a> test files.
 * The redistribution policy for MINPACK is available <a
 * href="http://www.netlib.org/minpack/disclaimer">here</a>, for
 * convenience, it is reproduced below.</p>

 * <table border="0" width="80%" cellpadding="10" align="center" bgcolor="#E0E0E0">
 * <tr><td>
 *    Minpack Copyright Notice (1999) University of Chicago.
 *    All rights reserved
 * </td></tr>
 * <tr><td>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * <ol>
 *  <li>Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.</li>
 * <li>Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.</li>
 * <li>The end-user documentation included with the redistribution, if any,
 *     must include the following acknowledgment:
 *     <code>This product includes software developed by the University of
 *           Chicago, as Operator of Argonne National Laboratory.</code>
 *     Alternately, this acknowledgment may appear in the software itself,
 *     if and wherever such third-party acknowledgments normally appear.</li>
 * <li><strong>WARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED "AS IS"
 *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE
 *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND
 *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR
 *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES
 *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE
 *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY
 *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR
 *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF
 *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)
 *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION
 *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL
 *     BE CORRECTED.</strong></li>
 * <li><strong>LIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT
 *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF
 *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,
 *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF
 *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF
 *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER
 *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT
 *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,
 *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE
 *     POSSIBILITY OF SUCH LOSS OR DAMAGES.</strong></li>
 * <ol></td></tr>
 * </table>

 * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)
 * @author Burton S. Garbow (original fortran minpack tests)
 * @author Kenneth E. Hillstrom (original fortran minpack tests)
 * @author Jorge J. More (original fortran minpack tests)
 * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)
 */
public class LevenbergMarquardtOptimizerTest
    extends AbstractLeastSquaresOptimizerAbstractTest {static class __CLR4_4_122y822y8lb90pdvr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,97274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Override
    public AbstractLeastSquaresOptimizer createOptimizer() {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97136);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97137);return new LevenbergMarquardtOptimizer();
    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

    @Test(expected=MathUnsupportedOperationException.class)
    public void testConstraintsUnsupported() {__CLR4_4_122y822y8lb90pdvr.R.globalSliceStart(getClass().getName(),97138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w66qvc22ya();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,97,105,110,116,115,85,110,115,117,112,112,111,114,116,101,100,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122y822y8lb90pdvr.R.rethrow($CLV_t2$);}finally{__CLR4_4_122y822y8lb90pdvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testConstraintsUnsupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w66qvc22ya(){try{__CLR4_4_122y822y8lb90pdvr.R.inc(97138);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97139);createOptimizer().optimize(new MaxEval(100),
                                   new Target(new double[] { 2 }),
                                   new Weight(new double[] { 1 }),
                                   new InitialGuess(new double[] { 1, 2 }),
                                   new SimpleBounds(new double[] { -10, 0 },
                                                    new double[] { 20, 30 }));
    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

    @Override
    @Test(expected=SingularMatrixException.class)
    public void testNonInvertible() {__CLR4_4_122y822y8lb90pdvr.R.globalSliceStart(getClass().getName(),97140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm6ye22yc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,73,110,118,101,114,116,105,98,108,101,58,32,91,83,105,110,103,117,108,97,114,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof SingularMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122y822y8lb90pdvr.R.rethrow($CLV_t2$);}finally{__CLR4_4_122y822y8lb90pdvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm6ye22yc(){try{__CLR4_4_122y822y8lb90pdvr.R.inc(97140);
        /*
         * Overrides the method from parent class, since the default singularity
         * threshold (1e-14) does not trigger the expected exception.
         */
        __CLR4_4_122y822y8lb90pdvr.R.inc(97141);LinearProblem problem = new LinearProblem(new double[][] {
                {  1, 2, -3 },
                {  2, 1,  3 },
                { -3, 0, -9 }
        }, new double[] { 1, 1, 1 });

        __CLR4_4_122y822y8lb90pdvr.R.inc(97142);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122y822y8lb90pdvr.R.inc(97143);PointVectorValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getModelFunction(),
                                 problem.getModelFunctionJacobian(),
                                 problem.getTarget(),
                                 new Weight(new double[] { 1, 1, 1 }),
                                 new InitialGuess(new double[] { 0, 0, 0 }));
        __CLR4_4_122y822y8lb90pdvr.R.inc(97144);Assert.assertTrue(FastMath.sqrt(optimizer.getTargetSize()) * optimizer.getRMS() > 0.6);

        __CLR4_4_122y822y8lb90pdvr.R.inc(97145);optimizer.computeCovariances(optimum.getPoint(), 1.5e-14);
    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

    @Test
    public void testControlParameters() {__CLR4_4_122y822y8lb90pdvr.R.globalSliceStart(getClass().getName(),97146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kd6zo22yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122y822y8lb90pdvr.R.rethrow($CLV_t2$);}finally{__CLR4_4_122y822y8lb90pdvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testControlParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kd6zo22yi(){try{__CLR4_4_122y822y8lb90pdvr.R.inc(97146);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97147);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_122y822y8lb90pdvr.R.inc(97148);circle.addPoint( 30.0,  68.0);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97149);circle.addPoint( 50.0,  -6.0);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97150);circle.addPoint(110.0, -20.0);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97151);circle.addPoint( 35.0,  15.0);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97152);circle.addPoint( 45.0,  97.0);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97153);checkEstimate(circle.getModelFunction(),
                      circle.getModelFunctionJacobian(),
                      0.1, 10, 1.0e-14, 1.0e-16, 1.0e-10, false);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97154);checkEstimate(circle.getModelFunction(),
                      circle.getModelFunctionJacobian(),
                      0.1, 10, 1.0e-15, 1.0e-17, 1.0e-10, true);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97155);checkEstimate(circle.getModelFunction(),
                      circle.getModelFunctionJacobian(),
                      0.1,  5, 1.0e-15, 1.0e-16, 1.0e-10, true);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97156);circle.addPoint(300, -300);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97157);checkEstimate(circle.getModelFunction(),
                      circle.getModelFunctionJacobian(),
                      0.1, 20, 1.0e-18, 1.0e-16, 1.0e-10, true);
    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

    private void checkEstimate(ModelFunction problem,
                               ModelFunctionJacobian problemJacobian,
                               double initialStepBoundFactor, int maxCostEval,
                               double costRelativeTolerance, double parRelativeTolerance,
                               double orthoTolerance, boolean shouldFail) {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97158);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97159);try {
            __CLR4_4_122y822y8lb90pdvr.R.inc(97160);LevenbergMarquardtOptimizer optimizer
                = new LevenbergMarquardtOptimizer(initialStepBoundFactor,
                                                  costRelativeTolerance,
                                                  parRelativeTolerance,
                                                  orthoTolerance,
                                                  Precision.SAFE_MIN);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97161);optimizer.optimize(new MaxEval(maxCostEval),
                               problem,
                               problemJacobian,
                               new Target(new double[] { 0, 0, 0, 0, 0 }),
                               new Weight(new double[] { 1, 1, 1, 1, 1 }),
                               new InitialGuess(new double[] { 98.680, 47.345 }));
            __CLR4_4_122y822y8lb90pdvr.R.inc(97162);Assert.assertTrue(!shouldFail);
        } catch (DimensionMismatchException ee) {
            __CLR4_4_122y822y8lb90pdvr.R.inc(97163);Assert.assertTrue(shouldFail);
        } catch (TooManyEvaluationsException ee) {
            __CLR4_4_122y822y8lb90pdvr.R.inc(97164);Assert.assertTrue(shouldFail);
        }
    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

    /**
     * Non-linear test case: fitting of decay curve (from Chapter 8 of
     * Bevington's textbook, "Data reduction and analysis for the physical sciences").
     * XXX The expected ("reference") values may not be accurate and the tolerance too
     * relaxed for this test to be currently really useful (the issue is under
     * investigation).
     */
    @Test
    public void testBevington() {__CLR4_4_122y822y8lb90pdvr.R.globalSliceStart(getClass().getName(),97165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o98tt322z1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122y822y8lb90pdvr.R.rethrow($CLV_t2$);}finally{__CLR4_4_122y822y8lb90pdvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testBevington",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o98tt322z1(){try{__CLR4_4_122y822y8lb90pdvr.R.inc(97165);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97166);final double[][] dataPoints = {
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

        __CLR4_4_122y822y8lb90pdvr.R.inc(97167);final BevingtonProblem problem = new BevingtonProblem();

        __CLR4_4_122y822y8lb90pdvr.R.inc(97168);final int len = dataPoints[0].length;
        __CLR4_4_122y822y8lb90pdvr.R.inc(97169);final double[] weights = new double[len];
        __CLR4_4_122y822y8lb90pdvr.R.inc(97170);for (int i = 0; (((i < len)&&(__CLR4_4_122y822y8lb90pdvr.R.iget(97171)!=0|true))||(__CLR4_4_122y822y8lb90pdvr.R.iget(97172)==0&false)); i++) {{
            __CLR4_4_122y822y8lb90pdvr.R.inc(97173);problem.addPoint(dataPoints[0][i],
                             dataPoints[1][i]);

            __CLR4_4_122y822y8lb90pdvr.R.inc(97174);weights[i] = 1 / dataPoints[1][i];
        }

        }__CLR4_4_122y822y8lb90pdvr.R.inc(97175);final LevenbergMarquardtOptimizer optimizer
            = new LevenbergMarquardtOptimizer();

        __CLR4_4_122y822y8lb90pdvr.R.inc(97176);final PointVectorValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getModelFunction(),
                                 problem.getModelFunctionJacobian(),
                                 new Target(dataPoints[1]),
                                 new Weight(weights),
                                 new InitialGuess(new double[] { 10, 900, 80, 27, 225 }));

        __CLR4_4_122y822y8lb90pdvr.R.inc(97177);final double[] solution = optimum.getPoint();
        __CLR4_4_122y822y8lb90pdvr.R.inc(97178);final double[] expectedSolution = { 10.4, 958.3, 131.4, 33.9, 205.0 };

        __CLR4_4_122y822y8lb90pdvr.R.inc(97179);final double[][] covarMatrix = optimizer.computeCovariances(solution, 1e-14);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97180);final double[][] expectedCovarMatrix = {
            { 3.38, -3.69, 27.98, -2.34, -49.24 },
            { -3.69, 2492.26, 81.89, -69.21, -8.9 },
            { 27.98, 81.89, 468.99, -44.22, -615.44 },
            { -2.34, -69.21, -44.22, 6.39, 53.80 },
            { -49.24, -8.9, -615.44, 53.8, 929.45 }
        };

        __CLR4_4_122y822y8lb90pdvr.R.inc(97181);final int numParams = expectedSolution.length;

        // Check that the computed solution is within the reference error range.
        __CLR4_4_122y822y8lb90pdvr.R.inc(97182);for (int i = 0; (((i < numParams)&&(__CLR4_4_122y822y8lb90pdvr.R.iget(97183)!=0|true))||(__CLR4_4_122y822y8lb90pdvr.R.iget(97184)==0&false)); i++) {{
            __CLR4_4_122y822y8lb90pdvr.R.inc(97185);final double error = FastMath.sqrt(expectedCovarMatrix[i][i]);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97186);Assert.assertEquals("Parameter " + i, expectedSolution[i], solution[i], error);
        }

        // Check that each entry of the computed covariance matrix is within 10%
        // of the reference matrix entry.
        }__CLR4_4_122y822y8lb90pdvr.R.inc(97187);for (int i = 0; (((i < numParams)&&(__CLR4_4_122y822y8lb90pdvr.R.iget(97188)!=0|true))||(__CLR4_4_122y822y8lb90pdvr.R.iget(97189)==0&false)); i++) {{
            __CLR4_4_122y822y8lb90pdvr.R.inc(97190);for (int j = 0; (((j < numParams)&&(__CLR4_4_122y822y8lb90pdvr.R.iget(97191)!=0|true))||(__CLR4_4_122y822y8lb90pdvr.R.iget(97192)==0&false)); j++) {{
                __CLR4_4_122y822y8lb90pdvr.R.inc(97193);Assert.assertEquals("Covariance matrix [" + i + "][" + j + "]",
                                    expectedCovarMatrix[i][j],
                                    covarMatrix[i][j],
                                    FastMath.abs(0.1 * expectedCovarMatrix[i][j]));
            }
        }}
    }}finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

    @Test
    public void testCircleFitting2() {__CLR4_4_122y822y8lb90pdvr.R.globalSliceStart(getClass().getName(),97194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj6el822zu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122y822y8lb90pdvr.R.rethrow($CLV_t2$);}finally{__CLR4_4_122y822y8lb90pdvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testCircleFitting2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj6el822zu(){try{__CLR4_4_122y822y8lb90pdvr.R.inc(97194);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97195);final double xCenter = 123.456;
        __CLR4_4_122y822y8lb90pdvr.R.inc(97196);final double yCenter = 654.321;
        __CLR4_4_122y822y8lb90pdvr.R.inc(97197);final double xSigma = 10;
        __CLR4_4_122y822y8lb90pdvr.R.inc(97198);final double ySigma = 15;
        __CLR4_4_122y822y8lb90pdvr.R.inc(97199);final double radius = 111.111;
        // The test is extremely sensitive to the seed.
        __CLR4_4_122y822y8lb90pdvr.R.inc(97200);final long seed = 59421061L;
        __CLR4_4_122y822y8lb90pdvr.R.inc(97201);final RandomCirclePointGenerator factory
            = new RandomCirclePointGenerator(xCenter, yCenter, radius,
                                             xSigma, ySigma,
                                             seed);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97202);final CircleProblem circle = new CircleProblem(xSigma, ySigma);

        __CLR4_4_122y822y8lb90pdvr.R.inc(97203);final int numPoints = 10;
        __CLR4_4_122y822y8lb90pdvr.R.inc(97204);for (Vector2D p : factory.generate(numPoints)) {{
            __CLR4_4_122y822y8lb90pdvr.R.inc(97205);circle.addPoint(p.getX(), p.getY());
        }

        // First guess for the center's coordinates and radius.
        }__CLR4_4_122y822y8lb90pdvr.R.inc(97206);final double[] init = { 90, 659, 115 };

        __CLR4_4_122y822y8lb90pdvr.R.inc(97207);final LevenbergMarquardtOptimizer optimizer
            = new LevenbergMarquardtOptimizer();
        __CLR4_4_122y822y8lb90pdvr.R.inc(97208);final PointVectorValuePair optimum = optimizer.optimize(new MaxEval(100),
                                                                circle.getModelFunction(),
                                                                circle.getModelFunctionJacobian(),
                                                                new Target(circle.target()),
                                                                new Weight(circle.weight()),
                                                                new InitialGuess(init));

        __CLR4_4_122y822y8lb90pdvr.R.inc(97209);final double[] paramFound = optimum.getPoint();

        // Retrieve errors estimation.
        __CLR4_4_122y822y8lb90pdvr.R.inc(97210);final double[] asymptoticStandardErrorFound = optimizer.computeSigma(paramFound, 1e-14);

        // Check that the parameters are found within the assumed error bars.
        __CLR4_4_122y822y8lb90pdvr.R.inc(97211);Assert.assertEquals(xCenter, paramFound[0], asymptoticStandardErrorFound[0]);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97212);Assert.assertEquals(yCenter, paramFound[1], asymptoticStandardErrorFound[1]);
        __CLR4_4_122y822y8lb90pdvr.R.inc(97213);Assert.assertEquals(radius, paramFound[2], asymptoticStandardErrorFound[2]);
    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

    private static class QuadraticProblem {
        private List<Double> x;
        private List<Double> y;

        public QuadraticProblem() {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97214);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97215);x = new ArrayList<Double>();
            __CLR4_4_122y822y8lb90pdvr.R.inc(97216);y = new ArrayList<Double>();
        }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

        public void addPoint(double x, double y) {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97217);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97218);this.x.add(x);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97219);this.y.add(y);
        }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

        public ModelFunction getModelFunction() {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97220);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97221);return new ModelFunction(new MultivariateVectorFunction() {
                    public double[] value(double[] variables) {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97222);
                        __CLR4_4_122y822y8lb90pdvr.R.inc(97223);double[] values = new double[x.size()];
                        __CLR4_4_122y822y8lb90pdvr.R.inc(97224);for (int i = 0; (((i < values.length)&&(__CLR4_4_122y822y8lb90pdvr.R.iget(97225)!=0|true))||(__CLR4_4_122y822y8lb90pdvr.R.iget(97226)==0&false)); ++i) {{
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97227);values[i] = (variables[0] * x.get(i) + variables[1]) * x.get(i) + variables[2];
                        }
                        }__CLR4_4_122y822y8lb90pdvr.R.inc(97228);return values;
                    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}
                });
        }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

        public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97229);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97230);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                    public double[][] value(double[] params) {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97231);                    
                        __CLR4_4_122y822y8lb90pdvr.R.inc(97232);double[][] jacobian = new double[x.size()][3];
                        __CLR4_4_122y822y8lb90pdvr.R.inc(97233);for (int i = 0; (((i < jacobian.length)&&(__CLR4_4_122y822y8lb90pdvr.R.iget(97234)!=0|true))||(__CLR4_4_122y822y8lb90pdvr.R.iget(97235)==0&false)); ++i) {{
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97236);jacobian[i][0] = x.get(i) * x.get(i);
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97237);jacobian[i][1] = x.get(i);
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97238);jacobian[i][2] = 1.0;
                        }
                        }__CLR4_4_122y822y8lb90pdvr.R.inc(97239);return jacobian;
                    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}
                });
        }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}
    }

    private static class BevingtonProblem {
        private List<Double> time;
        private List<Double> count;

        public BevingtonProblem() {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97240);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97241);time = new ArrayList<Double>();
            __CLR4_4_122y822y8lb90pdvr.R.inc(97242);count = new ArrayList<Double>();
        }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

        public void addPoint(double t, double c) {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97243);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97244);time.add(t);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97245);count.add(c);
        }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

        public ModelFunction getModelFunction() {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97246);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97247);return new ModelFunction(new MultivariateVectorFunction() {
                    public double[] value(double[] params) {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97248);
                        __CLR4_4_122y822y8lb90pdvr.R.inc(97249);double[] values = new double[time.size()];
                        __CLR4_4_122y822y8lb90pdvr.R.inc(97250);for (int i = 0; (((i < values.length)&&(__CLR4_4_122y822y8lb90pdvr.R.iget(97251)!=0|true))||(__CLR4_4_122y822y8lb90pdvr.R.iget(97252)==0&false)); ++i) {{
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97253);final double t = time.get(i);
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97254);values[i] = params[0] +
                                params[1] * Math.exp(-t / params[3]) +
                                params[2] * Math.exp(-t / params[4]);
                        }
                        }__CLR4_4_122y822y8lb90pdvr.R.inc(97255);return values;
                    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}
                });
        }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}

        public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97256);
            __CLR4_4_122y822y8lb90pdvr.R.inc(97257);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                    public double[][] value(double[] params) {try{__CLR4_4_122y822y8lb90pdvr.R.inc(97258);
                        __CLR4_4_122y822y8lb90pdvr.R.inc(97259);double[][] jacobian = new double[time.size()][5];

                        __CLR4_4_122y822y8lb90pdvr.R.inc(97260);for (int i = 0; (((i < jacobian.length)&&(__CLR4_4_122y822y8lb90pdvr.R.iget(97261)!=0|true))||(__CLR4_4_122y822y8lb90pdvr.R.iget(97262)==0&false)); ++i) {{
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97263);final double t = time.get(i);
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97264);jacobian[i][0] = 1;

                            __CLR4_4_122y822y8lb90pdvr.R.inc(97265);final double p3 =  params[3];
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97266);final double p4 =  params[4];
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97267);final double tOp3 = t / p3;
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97268);final double tOp4 = t / p4;
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97269);jacobian[i][1] = Math.exp(-tOp3);
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97270);jacobian[i][2] = Math.exp(-tOp4);
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97271);jacobian[i][3] = params[1] * Math.exp(-tOp3) * tOp3 / p3;
                            __CLR4_4_122y822y8lb90pdvr.R.inc(97272);jacobian[i][4] = params[2] * Math.exp(-tOp4) * tOp4 / p4;
                        }
                        }__CLR4_4_122y822y8lb90pdvr.R.inc(97273);return jacobian;
                    }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}
                });
        }finally{__CLR4_4_122y822y8lb90pdvr.R.flushNeeded();}}
    }
}
