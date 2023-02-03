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

package org.apache.commons.math3.optimization.general;

import java.io.Serializable;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
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
public class NonLinearConjugateGradientOptimizerTest {static class __CLR4_4_1269b269blb90pe3q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,101554,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testTrivial() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ri9u269b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testTrivial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ri9u269b(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101423);
        __CLR4_4_1269b269blb90pe3q.R.inc(101424);LinearProblem problem =
            new LinearProblem(new double[][] { { 2 } }, new double[] { 3 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101425);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101426);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 0 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101427);Assert.assertEquals(1.5, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101428);Assert.assertEquals(0.0, optimum.getValue(), 1.0e-10);
    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testColumnsPermutation() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trxz2a269h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testColumnsPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trxz2a269h(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101429);
        __CLR4_4_1269b269blb90pe3q.R.inc(101430);LinearProblem problem =
            new LinearProblem(new double[][] { { 1.0, -1.0 }, { 0.0, 2.0 }, { 1.0, -2.0 } },
                              new double[] { 4.0, 6.0, 1.0 });

        __CLR4_4_1269b269blb90pe3q.R.inc(101431);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101432);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 0, 0 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101433);Assert.assertEquals(7.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101434);Assert.assertEquals(3.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101435);Assert.assertEquals(0.0, optimum.getValue(), 1.0e-10);

    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testNoDependency() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vquu3f269o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testNoDependency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vquu3f269o(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101436);
        __CLR4_4_1269b269blb90pe3q.R.inc(101437);LinearProblem problem = new LinearProblem(new double[][] {
                { 2, 0, 0, 0, 0, 0 },
                { 0, 2, 0, 0, 0, 0 },
                { 0, 0, 2, 0, 0, 0 },
                { 0, 0, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 0, 2 }
        }, new double[] { 0.0, 1.1, 2.2, 3.3, 4.4, 5.5 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101438);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101439);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 0, 0, 0, 0, 0, 0 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101440);for (int i = 0; (((i < problem.target.length)&&(__CLR4_4_1269b269blb90pe3q.R.iget(101441)!=0|true))||(__CLR4_4_1269b269blb90pe3q.R.iget(101442)==0&false)); ++i) {{
            __CLR4_4_1269b269blb90pe3q.R.inc(101443);Assert.assertEquals(0.55 * i, optimum.getPoint()[i], 1.0e-10);
        }
    }}finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testOneSet() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6wyqd269w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testOneSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6wyqd269w(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101444);
        __CLR4_4_1269b269blb90pe3q.R.inc(101445);LinearProblem problem = new LinearProblem(new double[][] {
                {  1,  0, 0 },
                { -1,  1, 0 },
                {  0, -1, 1 }
        }, new double[] { 1, 1, 1});
        __CLR4_4_1269b269blb90pe3q.R.inc(101446);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101447);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 0, 0, 0 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101448);Assert.assertEquals(1.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101449);Assert.assertEquals(2.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101450);Assert.assertEquals(3.0, optimum.getPoint()[2], 1.0e-10);

    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testTwoSets() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tdq3226a3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testTwoSets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tdq3226a3(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101451);
        __CLR4_4_1269b269blb90pe3q.R.inc(101452);final double epsilon = 1.0e-7;
        __CLR4_4_1269b269blb90pe3q.R.inc(101453);LinearProblem problem = new LinearProblem(new double[][] {
                {  2,  1,   0,  4,       0, 0 },
                { -4, -2,   3, -7,       0, 0 },
                {  4,  1,  -2,  8,       0, 0 },
                {  0, -3, -12, -1,       0, 0 },
                {  0,  0,   0,  0, epsilon, 1 },
                {  0,  0,   0,  0,       1, 1 }
        }, new double[] { 2, -9, 2, 2, 1 + epsilon * epsilon, 2});

        __CLR4_4_1269b269blb90pe3q.R.inc(101454);final Preconditioner preconditioner
            = new Preconditioner() {
                    public double[] precondition(double[] point, double[] r) {try{__CLR4_4_1269b269blb90pe3q.R.inc(101455);
                        __CLR4_4_1269b269blb90pe3q.R.inc(101456);double[] d = r.clone();
                        __CLR4_4_1269b269blb90pe3q.R.inc(101457);d[0] /=  72.0;
                        __CLR4_4_1269b269blb90pe3q.R.inc(101458);d[1] /=  30.0;
                        __CLR4_4_1269b269blb90pe3q.R.inc(101459);d[2] /= 314.0;
                        __CLR4_4_1269b269blb90pe3q.R.inc(101460);d[3] /= 260.0;
                        __CLR4_4_1269b269blb90pe3q.R.inc(101461);d[4] /= 2 * (1 + epsilon * epsilon);
                        __CLR4_4_1269b269blb90pe3q.R.inc(101462);d[5] /= 4.0;
                        __CLR4_4_1269b269blb90pe3q.R.inc(101463);return d;
                    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}
                };

        __CLR4_4_1269b269blb90pe3q.R.inc(101464);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-13, 1e-13),
                                                    new BrentSolver(),
                                                    preconditioner);
                                                    
        __CLR4_4_1269b269blb90pe3q.R.inc(101465);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 0, 0, 0, 0, 0, 0 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101466);Assert.assertEquals( 3.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101467);Assert.assertEquals( 4.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101468);Assert.assertEquals(-1.0, optimum.getPoint()[2], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101469);Assert.assertEquals(-2.0, optimum.getPoint()[3], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101470);Assert.assertEquals( 1.0 + epsilon, optimum.getPoint()[4], 1.0e-10);
        __CLR4_4_1269b269blb90pe3q.R.inc(101471);Assert.assertEquals( 1.0 - epsilon, optimum.getPoint()[5], 1.0e-10);

    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testNonInversible() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npm2hj26ao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npm2hj26ao(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101472);
        __CLR4_4_1269b269blb90pe3q.R.inc(101473);LinearProblem problem = new LinearProblem(new double[][] {
                {  1, 2, -3 },
                {  2, 1,  3 },
                { -3, 0, -9 }
        }, new double[] { 1, 1, 1 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101474);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101475);PointValuePair optimum =
                optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 0, 0, 0 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101476);Assert.assertTrue(optimum.getValue() > 0.5);
    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testIllConditioned() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3imy226at();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3imy226at(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101477);
        __CLR4_4_1269b269blb90pe3q.R.inc(101478);LinearProblem problem1 = new LinearProblem(new double[][] {
                { 10.0, 7.0,  8.0,  7.0 },
                {  7.0, 5.0,  6.0,  5.0 },
                {  8.0, 6.0, 10.0,  9.0 },
                {  7.0, 5.0,  9.0, 10.0 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101479);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-13, 1e-13),
                                                    new BrentSolver(1e-15, 1e-15));
        __CLR4_4_1269b269blb90pe3q.R.inc(101480);PointValuePair optimum1 =
            optimizer.optimize(200, problem1, GoalType.MINIMIZE, new double[] { 0, 1, 2, 3 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101481);Assert.assertEquals(1.0, optimum1.getPoint()[0], 1.0e-4);
        __CLR4_4_1269b269blb90pe3q.R.inc(101482);Assert.assertEquals(1.0, optimum1.getPoint()[1], 1.0e-4);
        __CLR4_4_1269b269blb90pe3q.R.inc(101483);Assert.assertEquals(1.0, optimum1.getPoint()[2], 1.0e-4);
        __CLR4_4_1269b269blb90pe3q.R.inc(101484);Assert.assertEquals(1.0, optimum1.getPoint()[3], 1.0e-4);

        __CLR4_4_1269b269blb90pe3q.R.inc(101485);LinearProblem problem2 = new LinearProblem(new double[][] {
                { 10.00, 7.00, 8.10, 7.20 },
                {  7.08, 5.04, 6.00, 5.00 },
                {  8.00, 5.98, 9.89, 9.00 },
                {  6.99, 4.99, 9.00, 9.98 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101486);PointValuePair optimum2 =
            optimizer.optimize(200, problem2, GoalType.MINIMIZE, new double[] { 0, 1, 2, 3 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101487);Assert.assertEquals(-81.0, optimum2.getPoint()[0], 1.0e-1);
        __CLR4_4_1269b269blb90pe3q.R.inc(101488);Assert.assertEquals(137.0, optimum2.getPoint()[1], 1.0e-1);
        __CLR4_4_1269b269blb90pe3q.R.inc(101489);Assert.assertEquals(-34.0, optimum2.getPoint()[2], 1.0e-1);
        __CLR4_4_1269b269blb90pe3q.R.inc(101490);Assert.assertEquals( 22.0, optimum2.getPoint()[3], 1.0e-1);

    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersSimple() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ow9s826b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ow9s826b7(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101491);
        __CLR4_4_1269b269blb90pe3q.R.inc(101492);LinearProblem problem = new LinearProblem(new double[][] {
                { 3.0, 2.0,  0.0, 0.0 },
                { 0.0, 1.0, -1.0, 1.0 },
                { 2.0, 0.0,  1.0, 0.0 }
        }, new double[] { 7.0, 3.0, 5.0 });

        __CLR4_4_1269b269blb90pe3q.R.inc(101493);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101494);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 7, 6, 5, 4 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101495);Assert.assertEquals(0, optimum.getValue(), 1.0e-10);

    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersUnsorted() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sopi426bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sopi426bc(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101496);
        __CLR4_4_1269b269blb90pe3q.R.inc(101497);LinearProblem problem = new LinearProblem(new double[][] {
                 { 1.0, 1.0,  0.0,  0.0, 0.0,  0.0 },
                 { 0.0, 0.0,  1.0,  1.0, 1.0,  0.0 },
                 { 0.0, 0.0,  0.0,  0.0, 1.0, -1.0 },
                 { 0.0, 0.0, -1.0,  1.0, 0.0,  1.0 },
                 { 0.0, 0.0,  0.0, -1.0, 1.0,  0.0 }
        }, new double[] { 3.0, 12.0, -1.0, 7.0, 1.0 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101498);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101499);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 2, 2, 2, 2, 2, 2 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101500);Assert.assertEquals(0, optimum.getValue(), 1.0e-10);
    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testRedundantEquations() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lkgd26bh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lkgd26bh(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101501);
        __CLR4_4_1269b269blb90pe3q.R.inc(101502);LinearProblem problem = new LinearProblem(new double[][] {
                { 1.0,  1.0 },
                { 1.0, -1.0 },
                { 1.0,  3.0 }
        }, new double[] { 3.0, 1.0, 5.0 });

        __CLR4_4_1269b269blb90pe3q.R.inc(101503);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101504);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 1, 1 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101505);Assert.assertEquals(2.0, optimum.getPoint()[0], 1.0e-8);
        __CLR4_4_1269b269blb90pe3q.R.inc(101506);Assert.assertEquals(1.0, optimum.getPoint()[1], 1.0e-8);

    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testInconsistentEquations() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5k8or26bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5k8or26bn(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101507);
        __CLR4_4_1269b269blb90pe3q.R.inc(101508);LinearProblem problem = new LinearProblem(new double[][] {
                { 1.0,  1.0 },
                { 1.0, -1.0 },
                { 1.0,  3.0 }
        }, new double[] { 3.0, 1.0, 4.0 });

        __CLR4_4_1269b269blb90pe3q.R.inc(101509);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-6, 1e-6));
        __CLR4_4_1269b269blb90pe3q.R.inc(101510);PointValuePair optimum =
            optimizer.optimize(100, problem, GoalType.MINIMIZE, new double[] { 1, 1 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101511);Assert.assertTrue(optimum.getValue() > 0.1);

    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    @Test
    public void testCircleFitting() {__CLR4_4_1269b269blb90pe3q.R.globalSliceStart(getClass().getName(),101512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcouro26bs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1269b269blb90pe3q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1269b269blb90pe3q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcouro26bs(){try{__CLR4_4_1269b269blb90pe3q.R.inc(101512);
        __CLR4_4_1269b269blb90pe3q.R.inc(101513);CircleScalar circle = new CircleScalar();
        __CLR4_4_1269b269blb90pe3q.R.inc(101514);circle.addPoint( 30.0,  68.0);
        __CLR4_4_1269b269blb90pe3q.R.inc(101515);circle.addPoint( 50.0,  -6.0);
        __CLR4_4_1269b269blb90pe3q.R.inc(101516);circle.addPoint(110.0, -20.0);
        __CLR4_4_1269b269blb90pe3q.R.inc(101517);circle.addPoint( 35.0,  15.0);
        __CLR4_4_1269b269blb90pe3q.R.inc(101518);circle.addPoint( 45.0,  97.0);
        __CLR4_4_1269b269blb90pe3q.R.inc(101519);NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                    new SimpleValueChecker(1e-30, 1e-30),
                                                    new BrentSolver(1e-15, 1e-13));
        __CLR4_4_1269b269blb90pe3q.R.inc(101520);PointValuePair optimum =
            optimizer.optimize(100, circle, GoalType.MINIMIZE, new double[] { 98.680, 47.345 });
        __CLR4_4_1269b269blb90pe3q.R.inc(101521);Vector2D center = new Vector2D(optimum.getPointRef()[0], optimum.getPointRef()[1]);
        __CLR4_4_1269b269blb90pe3q.R.inc(101522);Assert.assertEquals(69.960161753, circle.getRadius(center), 1.0e-8);
        __CLR4_4_1269b269blb90pe3q.R.inc(101523);Assert.assertEquals(96.075902096, center.getX(), 1.0e-8);
        __CLR4_4_1269b269blb90pe3q.R.inc(101524);Assert.assertEquals(48.135167894, center.getY(), 1.0e-8);
    }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    private static class LinearProblem implements MultivariateDifferentiableFunction, Serializable {

        private static final long serialVersionUID = 703247177355019415L;
        final RealMatrix factors;
        final double[] target;
        public LinearProblem(double[][] factors, double[] target) {try{__CLR4_4_1269b269blb90pe3q.R.inc(101525);
            __CLR4_4_1269b269blb90pe3q.R.inc(101526);this.factors = new BlockRealMatrix(factors);
            __CLR4_4_1269b269blb90pe3q.R.inc(101527);this.target  = target;
        }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

        public double value(double[] variables) {try{__CLR4_4_1269b269blb90pe3q.R.inc(101528);
            __CLR4_4_1269b269blb90pe3q.R.inc(101529);double[] y = factors.operate(variables);
            __CLR4_4_1269b269blb90pe3q.R.inc(101530);double sum = 0;
            __CLR4_4_1269b269blb90pe3q.R.inc(101531);for (int i = 0; (((i < y.length)&&(__CLR4_4_1269b269blb90pe3q.R.iget(101532)!=0|true))||(__CLR4_4_1269b269blb90pe3q.R.iget(101533)==0&false)); ++i) {{
                __CLR4_4_1269b269blb90pe3q.R.inc(101534);double ri = y[i] - target[i];
                __CLR4_4_1269b269blb90pe3q.R.inc(101535);sum += ri * ri;
            }
            }__CLR4_4_1269b269blb90pe3q.R.inc(101536);return sum;
        }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

        public DerivativeStructure value(DerivativeStructure[] variables) {try{__CLR4_4_1269b269blb90pe3q.R.inc(101537);
            __CLR4_4_1269b269blb90pe3q.R.inc(101538);DerivativeStructure[] y = new DerivativeStructure[factors.getRowDimension()];
            __CLR4_4_1269b269blb90pe3q.R.inc(101539);for (int i = 0; (((i < y.length)&&(__CLR4_4_1269b269blb90pe3q.R.iget(101540)!=0|true))||(__CLR4_4_1269b269blb90pe3q.R.iget(101541)==0&false)); ++i) {{
                __CLR4_4_1269b269blb90pe3q.R.inc(101542);y[i] = variables[0].getField().getZero();
                __CLR4_4_1269b269blb90pe3q.R.inc(101543);for (int j = 0; (((j < factors.getColumnDimension())&&(__CLR4_4_1269b269blb90pe3q.R.iget(101544)!=0|true))||(__CLR4_4_1269b269blb90pe3q.R.iget(101545)==0&false)); ++j) {{
                    __CLR4_4_1269b269blb90pe3q.R.inc(101546);y[i] = y[i].add(variables[j].multiply(factors.getEntry(i, j)));
                }
            }}

            }__CLR4_4_1269b269blb90pe3q.R.inc(101547);DerivativeStructure sum = variables[0].getField().getZero();
            __CLR4_4_1269b269blb90pe3q.R.inc(101548);for (int i = 0; (((i < y.length)&&(__CLR4_4_1269b269blb90pe3q.R.iget(101549)!=0|true))||(__CLR4_4_1269b269blb90pe3q.R.iget(101550)==0&false)); ++i) {{
                __CLR4_4_1269b269blb90pe3q.R.inc(101551);DerivativeStructure ri = y[i].subtract(target[i]);
                __CLR4_4_1269b269blb90pe3q.R.inc(101552);sum = sum.add(ri.multiply(ri));
            }
            }__CLR4_4_1269b269blb90pe3q.R.inc(101553);return sum;
        }finally{__CLR4_4_1269b269blb90pe3q.R.flushNeeded();}}

    }
}
