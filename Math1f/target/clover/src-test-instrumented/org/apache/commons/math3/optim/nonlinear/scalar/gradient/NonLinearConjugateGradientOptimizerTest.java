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

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p>Some of the unit tests are re-implementations of the MINPACK <a
 * href="http://www.netlib.org/minpack/ex/file17">file17</a> and <a
 * href="http://www.netlib.org/minpack/ex/file22">file22</a> test files.
 * The redistribution policy for MINPACK is available <a
 * href="http://www.netlib.org/minpack/disclaimer">here</a>, for
 * convenience, it is reproduced below.</p>
 *
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
 *
 * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)
 * @author Burton S. Garbow (original fortran minpack tests)
 * @author Kenneth E. Hillstrom (original fortran minpack tests)
 * @author Jorge J. More (original fortran minpack tests)
 * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)
 */
public class NonLinearConjugateGradientOptimizerTest {static class __CLR4_4_121kw21kwlb90pdsb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,95495,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected=MathUnsupportedOperationException.class)
    public void testBoundsUnsupported() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198v7md21kw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,111,117,110,100,115,85,110,115,117,112,112,111,114,116,101,100,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testBoundsUnsupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198v7md21kw(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95360);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95361);LinearProblem problem
            = new LinearProblem(new double[][] { { 2 } }, new double[] { 3 });
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95362);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95363);optimizer.optimize(new MaxEval(100),
                           problem.getObjectiveFunction(),
                           problem.getObjectiveFunctionGradient(),
                           GoalType.MINIMIZE,
                           new InitialGuess(new double[] { 0 }),
                           new SimpleBounds(new double[] { -1 },
                                            new double[] { 1 }));
    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testTrivial() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ri9u21l0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testTrivial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ri9u21l0(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95364);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95365);LinearProblem problem
            = new LinearProblem(new double[][] { { 2 } }, new double[] { 3 });
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95366);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95367);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 0 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95368);Assert.assertEquals(1.5, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95369);Assert.assertEquals(0.0, optimum.getValue(), 1.0e-10);

        // Check that the number of iterations is updated (MATH-949).
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95370);Assert.assertTrue(optimizer.getIterations() > 0);
    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testColumnsPermutation() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trxz2a21l7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testColumnsPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trxz2a21l7(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95371);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95372);LinearProblem problem
            = new LinearProblem(new double[][] { { 1.0, -1.0 }, { 0.0, 2.0 }, { 1.0, -2.0 } },
                                new double[] { 4.0, 6.0, 1.0 });

        __CLR4_4_121kw21kwlb90pdsb.R.inc(95373);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95374);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 0, 0 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95375);Assert.assertEquals(7.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95376);Assert.assertEquals(3.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95377);Assert.assertEquals(0.0, optimum.getValue(), 1.0e-10);

    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testNoDependency() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vquu3f21le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testNoDependency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vquu3f21le(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95378);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95379);LinearProblem problem = new LinearProblem(new double[][] {
                { 2, 0, 0, 0, 0, 0 },
                { 0, 2, 0, 0, 0, 0 },
                { 0, 0, 2, 0, 0, 0 },
                { 0, 0, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 0, 2 }
        }, new double[] { 0.0, 1.1, 2.2, 3.3, 4.4, 5.5 });
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95380);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95381);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 0, 0, 0, 0, 0, 0 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95382);for (int i = 0; (((i < problem.target.length)&&(__CLR4_4_121kw21kwlb90pdsb.R.iget(95383)!=0|true))||(__CLR4_4_121kw21kwlb90pdsb.R.iget(95384)==0&false)); ++i) {{
            __CLR4_4_121kw21kwlb90pdsb.R.inc(95385);Assert.assertEquals(0.55 * i, optimum.getPoint()[i], 1.0e-10);
        }
    }}finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testOneSet() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6wyqd21lm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testOneSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6wyqd21lm(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95386);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95387);LinearProblem problem = new LinearProblem(new double[][] {
                {  1,  0, 0 },
                { -1,  1, 0 },
                {  0, -1, 1 }
        }, new double[] { 1, 1, 1});
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95388);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95389);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 0, 0, 0 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95390);Assert.assertEquals(1.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95391);Assert.assertEquals(2.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95392);Assert.assertEquals(3.0, optimum.getPoint()[2], 1.0e-10);

    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testTwoSets() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tdq3221lt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testTwoSets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tdq3221lt(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95393);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95394);final double epsilon = 1.0e-7;
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95395);LinearProblem problem = new LinearProblem(new double[][] {
                {  2,  1,   0,  4,       0, 0 },
                { -4, -2,   3, -7,       0, 0 },
                {  4,  1,  -2,  8,       0, 0 },
                {  0, -3, -12, -1,       0, 0 },
                {  0,  0,   0,  0, epsilon, 1 },
                {  0,  0,   0,  0,       1, 1 }
        }, new double[] { 2, -9, 2, 2, 1 + epsilon * epsilon, 2});

        __CLR4_4_121kw21kwlb90pdsb.R.inc(95396);final Preconditioner preconditioner
            = new Preconditioner() {
                    public double[] precondition(double[] point, double[] r) {try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95397);
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95398);double[] d = r.clone();
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95399);d[0] /=  72.0;
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95400);d[1] /=  30.0;
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95401);d[2] /= 314.0;
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95402);d[3] /= 260.0;
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95403);d[4] /= 2 * (1 + epsilon * epsilon);
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95404);d[5] /= 4.0;
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95405);return d;
                    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}
                };

        __CLR4_4_121kw21kwlb90pdsb.R.inc(95406);NonLinearConjugateGradientOptimizer optimizer
           = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                     new SimpleValueChecker(1e-13, 1e-13),
                                                     new BrentSolver(),
                                                     preconditioner);

        __CLR4_4_121kw21kwlb90pdsb.R.inc(95407);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 0, 0, 0, 0, 0, 0 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95408);Assert.assertEquals( 3.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95409);Assert.assertEquals( 4.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95410);Assert.assertEquals(-1.0, optimum.getPoint()[2], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95411);Assert.assertEquals(-2.0, optimum.getPoint()[3], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95412);Assert.assertEquals( 1.0 + epsilon, optimum.getPoint()[4], 1.0e-10);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95413);Assert.assertEquals( 1.0 - epsilon, optimum.getPoint()[5], 1.0e-10);

    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testNonInversible() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npm2hj21me();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testNonInversible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npm2hj21me(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95414);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95415);LinearProblem problem = new LinearProblem(new double[][] {
                {  1, 2, -3 },
                {  2, 1,  3 },
                { -3, 0, -9 }
        }, new double[] { 1, 1, 1 });
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95416);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95417);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 0, 0, 0 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95418);Assert.assertTrue(optimum.getValue() > 0.5);
    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testIllConditioned() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3imy221mj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testIllConditioned",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3imy221mj(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95419);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95420);LinearProblem problem1 = new LinearProblem(new double[][] {
                { 10.0, 7.0,  8.0,  7.0 },
                {  7.0, 5.0,  6.0,  5.0 },
                {  8.0, 6.0, 10.0,  9.0 },
                {  7.0, 5.0,  9.0, 10.0 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95421);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-13, 1e-13),
                                                      new BrentSolver(1e-15, 1e-15));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95422);PointValuePair optimum1
            = optimizer.optimize(new MaxEval(200),
                                 problem1.getObjectiveFunction(),
                                 problem1.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 0, 1, 2, 3 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95423);Assert.assertEquals(1.0, optimum1.getPoint()[0], 1.0e-4);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95424);Assert.assertEquals(1.0, optimum1.getPoint()[1], 1.0e-4);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95425);Assert.assertEquals(1.0, optimum1.getPoint()[2], 1.0e-4);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95426);Assert.assertEquals(1.0, optimum1.getPoint()[3], 1.0e-4);

        __CLR4_4_121kw21kwlb90pdsb.R.inc(95427);LinearProblem problem2 = new LinearProblem(new double[][] {
                { 10.00, 7.00, 8.10, 7.20 },
                {  7.08, 5.04, 6.00, 5.00 },
                {  8.00, 5.98, 9.89, 9.00 },
                {  6.99, 4.99, 9.00, 9.98 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95428);PointValuePair optimum2
            = optimizer.optimize(new MaxEval(200),
                                 problem2.getObjectiveFunction(),
                                 problem2.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 0, 1, 2, 3 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95429);Assert.assertEquals(-81.0, optimum2.getPoint()[0], 1.0e-1);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95430);Assert.assertEquals(137.0, optimum2.getPoint()[1], 1.0e-1);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95431);Assert.assertEquals(-34.0, optimum2.getPoint()[2], 1.0e-1);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95432);Assert.assertEquals( 22.0, optimum2.getPoint()[3], 1.0e-1);

    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersSimple() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ow9s821mx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ow9s821mx(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95433);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95434);LinearProblem problem = new LinearProblem(new double[][] {
                { 3.0, 2.0,  0.0, 0.0 },
                { 0.0, 1.0, -1.0, 1.0 },
                { 2.0, 0.0,  1.0, 0.0 }
        }, new double[] { 7.0, 3.0, 5.0 });

        __CLR4_4_121kw21kwlb90pdsb.R.inc(95435);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95436);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 7, 6, 5, 4 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95437);Assert.assertEquals(0, optimum.getValue(), 1.0e-10);

    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersUnsorted() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sopi421n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sopi421n2(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95438);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95439);LinearProblem problem = new LinearProblem(new double[][] {
                 { 1.0, 1.0,  0.0,  0.0, 0.0,  0.0 },
                 { 0.0, 0.0,  1.0,  1.0, 1.0,  0.0 },
                 { 0.0, 0.0,  0.0,  0.0, 1.0, -1.0 },
                 { 0.0, 0.0, -1.0,  1.0, 0.0,  1.0 },
                 { 0.0, 0.0,  0.0, -1.0, 1.0,  0.0 }
        }, new double[] { 3.0, 12.0, -1.0, 7.0, 1.0 });
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95440);NonLinearConjugateGradientOptimizer optimizer
           = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                     new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95441);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 2, 2, 2, 2, 2, 2 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95442);Assert.assertEquals(0, optimum.getValue(), 1.0e-10);
    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testRedundantEquations() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lkgd21n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testRedundantEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lkgd21n7(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95443);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95444);LinearProblem problem = new LinearProblem(new double[][] {
                { 1.0,  1.0 },
                { 1.0, -1.0 },
                { 1.0,  3.0 }
        }, new double[] { 3.0, 1.0, 5.0 });

        __CLR4_4_121kw21kwlb90pdsb.R.inc(95445);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95446);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 1, 1 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95447);Assert.assertEquals(2.0, optimum.getPoint()[0], 1.0e-8);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95448);Assert.assertEquals(1.0, optimum.getPoint()[1], 1.0e-8);

    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testInconsistentEquations() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5k8or21nd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5k8or21nd(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95449);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95450);LinearProblem problem = new LinearProblem(new double[][] {
                { 1.0,  1.0 },
                { 1.0, -1.0 },
                { 1.0,  3.0 }
        }, new double[] { 3.0, 1.0, 4.0 });

        __CLR4_4_121kw21kwlb90pdsb.R.inc(95451);NonLinearConjugateGradientOptimizer optimizer
            = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                      new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95452);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 1, 1 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95453);Assert.assertTrue(optimum.getValue() > 0.1);

    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    @Test
    public void testCircleFitting() {__CLR4_4_121kw21kwlb90pdsb.R.globalSliceStart(getClass().getName(),95454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcouro21ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121kw21kwlb90pdsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_121kw21kwlb90pdsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest.testCircleFitting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcouro21ni(){try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95454);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95455);CircleScalar problem = new CircleScalar();
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95456);problem.addPoint( 30.0,  68.0);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95457);problem.addPoint( 50.0,  -6.0);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95458);problem.addPoint(110.0, -20.0);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95459);problem.addPoint( 35.0,  15.0);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95460);problem.addPoint( 45.0,  97.0);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95461);NonLinearConjugateGradientOptimizer optimizer
           = new NonLinearConjugateGradientOptimizer(NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                                                     new SimpleValueChecker(1e-30, 1e-30),
                                                     new BrentSolver(1e-15, 1e-13));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95462);PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getObjectiveFunction(),
                                 problem.getObjectiveFunctionGradient(),
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 98.680, 47.345 }));
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95463);Vector2D center = new Vector2D(optimum.getPointRef()[0], optimum.getPointRef()[1]);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95464);Assert.assertEquals(69.960161753, problem.getRadius(center), 1.0e-8);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95465);Assert.assertEquals(96.075902096, center.getX(), 1.0e-8);
        __CLR4_4_121kw21kwlb90pdsb.R.inc(95466);Assert.assertEquals(48.135167894, center.getY(), 1.0e-8);
    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

    private static class LinearProblem {
        final RealMatrix factors;
        final double[] target;

        public LinearProblem(double[][] factors,
                             double[] target) {try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95467);
            __CLR4_4_121kw21kwlb90pdsb.R.inc(95468);this.factors = new BlockRealMatrix(factors);
            __CLR4_4_121kw21kwlb90pdsb.R.inc(95469);this.target  = target;
        }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

        public ObjectiveFunction getObjectiveFunction() {try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95470);
            __CLR4_4_121kw21kwlb90pdsb.R.inc(95471);return new ObjectiveFunction(new MultivariateFunction() {
                    public double value(double[] point) {try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95472);
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95473);double[] y = factors.operate(point);
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95474);double sum = 0;
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95475);for (int i = 0; (((i < y.length)&&(__CLR4_4_121kw21kwlb90pdsb.R.iget(95476)!=0|true))||(__CLR4_4_121kw21kwlb90pdsb.R.iget(95477)==0&false)); ++i) {{
                            __CLR4_4_121kw21kwlb90pdsb.R.inc(95478);double ri = y[i] - target[i];
                            __CLR4_4_121kw21kwlb90pdsb.R.inc(95479);sum += ri * ri;
                        }
                        }__CLR4_4_121kw21kwlb90pdsb.R.inc(95480);return sum;
                    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}
                });
        }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}

        public ObjectiveFunctionGradient getObjectiveFunctionGradient() {try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95481);
            __CLR4_4_121kw21kwlb90pdsb.R.inc(95482);return new ObjectiveFunctionGradient(new MultivariateVectorFunction() {
                    public double[] value(double[] point) {try{__CLR4_4_121kw21kwlb90pdsb.R.inc(95483);
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95484);double[] r = factors.operate(point);
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95485);for (int i = 0; (((i < r.length)&&(__CLR4_4_121kw21kwlb90pdsb.R.iget(95486)!=0|true))||(__CLR4_4_121kw21kwlb90pdsb.R.iget(95487)==0&false)); ++i) {{
                            __CLR4_4_121kw21kwlb90pdsb.R.inc(95488);r[i] -= target[i];
                        }
                        }__CLR4_4_121kw21kwlb90pdsb.R.inc(95489);double[] p = factors.transpose().operate(r);
                        __CLR4_4_121kw21kwlb90pdsb.R.inc(95490);for (int i = 0; (((i < p.length)&&(__CLR4_4_121kw21kwlb90pdsb.R.iget(95491)!=0|true))||(__CLR4_4_121kw21kwlb90pdsb.R.iget(95492)==0&false)); ++i) {{
                            __CLR4_4_121kw21kwlb90pdsb.R.inc(95493);p[i] *= 2;
                        }
                        }__CLR4_4_121kw21kwlb90pdsb.R.inc(95494);return p;
                    }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}
                });
        }finally{__CLR4_4_121kw21kwlb90pdsb.R.flushNeeded();}}
    }
}
