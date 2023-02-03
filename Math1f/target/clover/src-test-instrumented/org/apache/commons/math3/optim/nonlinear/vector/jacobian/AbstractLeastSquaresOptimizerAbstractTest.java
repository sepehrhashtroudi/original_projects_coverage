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

import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.util.FastMath;
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
 * @version $Id: AbstractLeastSquaresOptimizerAbstractTest.java 1407467 2012-11-09 14:30:49Z erans $
 */
public abstract class AbstractLeastSquaresOptimizerAbstractTest {static class __CLR4_4_122ja22jalb90pduq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,96817,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public abstract AbstractLeastSquaresOptimizer createOptimizer();

    @Test
    public void testGetIterations() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yhlj322ja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testGetIterations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yhlj322ja(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96598);
        __CLR4_4_122ja22jalb90pduq.R.inc(96599);AbstractLeastSquaresOptimizer optim = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96600);optim.optimize(new MaxEval(100), new Target(new double[] { 1 }),
                       new Weight(new double[] { 1 }),
                       new InitialGuess(new double[] { 3 }),
                       new ModelFunction(new MultivariateVectorFunction() {
                               public double[] value(double[] point) {try{__CLR4_4_122ja22jalb90pduq.R.inc(96601);
                                   __CLR4_4_122ja22jalb90pduq.R.inc(96602);return new double[] {
                                       FastMath.pow(point[0], 4)
                                   };
                               }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}
                           }),
                       new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                               public double[][] value(double[] point) {try{__CLR4_4_122ja22jalb90pduq.R.inc(96603);
                                   __CLR4_4_122ja22jalb90pduq.R.inc(96604);return new double[][] {
                                       { 0.25 * FastMath.pow(point[0], 3) }
                                   };
                               }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}
                           }));

        __CLR4_4_122ja22jalb90pduq.R.inc(96605);Assert.assertTrue(optim.getIterations() > 0);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testTrivial() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ri9u22ji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testTrivial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ri9u22ji(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96606);
        __CLR4_4_122ja22jalb90pduq.R.inc(96607);LinearProblem problem
            = new LinearProblem(new double[][] { { 2 } }, new double[] { 3 });
        __CLR4_4_122ja22jalb90pduq.R.inc(96608);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96609);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               problem.getModelFunction(),
                               problem.getModelFunctionJacobian(),
                               problem.getTarget(),
                               new Weight(new double[] { 1 }),
                               new InitialGuess(new double[] { 0 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96610);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96611);Assert.assertEquals(1.5, optimum.getPoint()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96612);Assert.assertEquals(3.0, optimum.getValue()[0], 1e-10);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testQRColumnsPermutation() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1codiwz22jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testQRColumnsPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1codiwz22jp(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96613);

        __CLR4_4_122ja22jalb90pduq.R.inc(96614);LinearProblem problem
            = new LinearProblem(new double[][] { { 1, -1 }, { 0, 2 }, { 1, -2 } },
                                new double[] { 4, 6, 1 });

        __CLR4_4_122ja22jalb90pduq.R.inc(96615);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96616);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               problem.getModelFunction(),
                               problem.getModelFunctionJacobian(),
                               problem.getTarget(),
                               new Weight(new double[] { 1, 1, 1 }),
                               new InitialGuess(new double[] { 0, 0 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96617);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96618);Assert.assertEquals(7, optimum.getPoint()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96619);Assert.assertEquals(3, optimum.getPoint()[1], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96620);Assert.assertEquals(4, optimum.getValue()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96621);Assert.assertEquals(6, optimum.getValue()[1], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96622);Assert.assertEquals(1, optimum.getValue()[2], 1e-10);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testNoDependency() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vquu3f22jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testNoDependency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vquu3f22jz(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96623);
        __CLR4_4_122ja22jalb90pduq.R.inc(96624);LinearProblem problem = new LinearProblem(new double[][] {
                { 2, 0, 0, 0, 0, 0 },
                { 0, 2, 0, 0, 0, 0 },
                { 0, 0, 2, 0, 0, 0 },
                { 0, 0, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 0, 2 }
        }, new double[] { 0, 1.1, 2.2, 3.3, 4.4, 5.5 });
        __CLR4_4_122ja22jalb90pduq.R.inc(96625);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96626);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               problem.getModelFunction(),
                               problem.getModelFunctionJacobian(),
                               problem.getTarget(),
                               new Weight(new double[] { 1, 1, 1, 1, 1, 1 }),
                               new InitialGuess(new double[] { 0, 0, 0, 0, 0, 0 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96627);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96628);for (int i = 0; (((i < problem.target.length)&&(__CLR4_4_122ja22jalb90pduq.R.iget(96629)!=0|true))||(__CLR4_4_122ja22jalb90pduq.R.iget(96630)==0&false)); ++i) {{
            __CLR4_4_122ja22jalb90pduq.R.inc(96631);Assert.assertEquals(0.55 * i, optimum.getPoint()[i], 1e-10);
        }
    }}finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testOneSet() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6wyqd22k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testOneSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6wyqd22k8(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96632);

        __CLR4_4_122ja22jalb90pduq.R.inc(96633);LinearProblem problem = new LinearProblem(new double[][] {
                {  1,  0, 0 },
                { -1,  1, 0 },
                {  0, -1, 1 }
        }, new double[] { 1, 1, 1});
        __CLR4_4_122ja22jalb90pduq.R.inc(96634);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96635);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               problem.getModelFunction(),
                               problem.getModelFunctionJacobian(),
                               problem.getTarget(),
                               new Weight(new double[] { 1, 1, 1 }),
                               new InitialGuess(new double[] { 0, 0, 0 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96636);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96637);Assert.assertEquals(1, optimum.getPoint()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96638);Assert.assertEquals(2, optimum.getPoint()[1], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96639);Assert.assertEquals(3, optimum.getPoint()[2], 1e-10);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testTwoSets() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tdq3222kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testTwoSets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tdq3222kg(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96640);
        __CLR4_4_122ja22jalb90pduq.R.inc(96641);double epsilon = 1e-7;
        __CLR4_4_122ja22jalb90pduq.R.inc(96642);LinearProblem problem = new LinearProblem(new double[][] {
                {  2,  1,   0,  4,       0, 0 },
                { -4, -2,   3, -7,       0, 0 },
                {  4,  1,  -2,  8,       0, 0 },
                {  0, -3, -12, -1,       0, 0 },
                {  0,  0,   0,  0, epsilon, 1 },
                {  0,  0,   0,  0,       1, 1 }
        }, new double[] { 2, -9, 2, 2, 1 + epsilon * epsilon, 2});

        __CLR4_4_122ja22jalb90pduq.R.inc(96643);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96644);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               problem.getModelFunction(),
                               problem.getModelFunctionJacobian(),
                               problem.getTarget(),
                               new Weight(new double[] { 1, 1, 1, 1, 1, 1 }),
                               new InitialGuess(new double[] { 0, 0, 0, 0, 0, 0 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96645);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96646);Assert.assertEquals(3, optimum.getPoint()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96647);Assert.assertEquals(4, optimum.getPoint()[1], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96648);Assert.assertEquals(-1, optimum.getPoint()[2], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96649);Assert.assertEquals(-2, optimum.getPoint()[3], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96650);Assert.assertEquals(1 + epsilon, optimum.getPoint()[4], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96651);Assert.assertEquals(1 - epsilon, optimum.getPoint()[5], 1e-10);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test(expected=ConvergenceException.class)
    public void testNonInvertible() throws Exception {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm6ye22ks();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,73,110,118,101,114,116,105,98,108,101,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm6ye22ks() throws Exception{try{__CLR4_4_122ja22jalb90pduq.R.inc(96652);

        __CLR4_4_122ja22jalb90pduq.R.inc(96653);LinearProblem problem = new LinearProblem(new double[][] {
                {  1, 2, -3 },
                {  2, 1,  3 },
                { -3, 0, -9 }
        }, new double[] { 1, 1, 1 });

        __CLR4_4_122ja22jalb90pduq.R.inc(96654);AbstractLeastSquaresOptimizer optimizer = createOptimizer();

        __CLR4_4_122ja22jalb90pduq.R.inc(96655);optimizer.optimize(new MaxEval(100),
                           problem.getModelFunction(),
                           problem.getModelFunctionJacobian(),
                           problem.getTarget(),
                           new Weight(new double[] { 1, 1, 1 }),
                           new InitialGuess(new double[] { 0, 0, 0 }));
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testIllConditioned() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3imy222kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testIllConditioned",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3imy222kw(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96656);
        __CLR4_4_122ja22jalb90pduq.R.inc(96657);LinearProblem problem1 = new LinearProblem(new double[][] {
                { 10, 7,  8,  7 },
                {  7, 5,  6,  5 },
                {  8, 6, 10,  9 },
                {  7, 5,  9, 10 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_122ja22jalb90pduq.R.inc(96658);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96659);PointVectorValuePair optimum1 =
            optimizer.optimize(new MaxEval(100),
                               problem1.getModelFunction(),
                               problem1.getModelFunctionJacobian(),
                               problem1.getTarget(),
                               new Weight(new double[] { 1, 1, 1, 1 }),
                               new InitialGuess(new double[] { 0, 1, 2, 3 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96660);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96661);Assert.assertEquals(1, optimum1.getPoint()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96662);Assert.assertEquals(1, optimum1.getPoint()[1], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96663);Assert.assertEquals(1, optimum1.getPoint()[2], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96664);Assert.assertEquals(1, optimum1.getPoint()[3], 1e-10);

        __CLR4_4_122ja22jalb90pduq.R.inc(96665);LinearProblem problem2 = new LinearProblem(new double[][] {
                { 10.00, 7.00, 8.10, 7.20 },
                {  7.08, 5.04, 6.00, 5.00 },
                {  8.00, 5.98, 9.89, 9.00 },
                {  6.99, 4.99, 9.00, 9.98 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_122ja22jalb90pduq.R.inc(96666);PointVectorValuePair optimum2 =
            optimizer.optimize(new MaxEval(100),
                               problem2.getModelFunction(),
                               problem2.getModelFunctionJacobian(),
                               problem2.getTarget(), 
                               new Weight(new double[] { 1, 1, 1, 1 }),
                               new InitialGuess(new double[] { 0, 1, 2, 3 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96667);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96668);Assert.assertEquals(-81, optimum2.getPoint()[0], 1e-8);
        __CLR4_4_122ja22jalb90pduq.R.inc(96669);Assert.assertEquals(137, optimum2.getPoint()[1], 1e-8);
        __CLR4_4_122ja22jalb90pduq.R.inc(96670);Assert.assertEquals(-34, optimum2.getPoint()[2], 1e-8);
        __CLR4_4_122ja22jalb90pduq.R.inc(96671);Assert.assertEquals( 22, optimum2.getPoint()[3], 1e-8);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersSimple() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ow9s822lc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testMoreEstimatedParametersSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ow9s822lc(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96672);

        __CLR4_4_122ja22jalb90pduq.R.inc(96673);LinearProblem problem = new LinearProblem(new double[][] {
                { 3, 2,  0, 0 },
                { 0, 1, -1, 1 },
                { 2, 0,  1, 0 }
        }, new double[] { 7, 3, 5 });

        __CLR4_4_122ja22jalb90pduq.R.inc(96674);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96675);optimizer.optimize(new MaxEval(100),
                           problem.getModelFunction(),
                           problem.getModelFunctionJacobian(),
                           problem.getTarget(),
                           new Weight(new double[] { 1, 1, 1 }),
                           new InitialGuess(new double[] { 7, 6, 5, 4 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96676);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersUnsorted() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sopi422lh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testMoreEstimatedParametersUnsorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sopi422lh(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96677);
        __CLR4_4_122ja22jalb90pduq.R.inc(96678);LinearProblem problem = new LinearProblem(new double[][] {
                { 1, 1,  0,  0, 0,  0 },
                { 0, 0,  1,  1, 1,  0 },
                { 0, 0,  0,  0, 1, -1 },
                { 0, 0, -1,  1, 0,  1 },
                { 0, 0,  0, -1, 1,  0 }
       }, new double[] { 3, 12, -1, 7, 1 });

        __CLR4_4_122ja22jalb90pduq.R.inc(96679);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96680);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               problem.getModelFunction(),
                               problem.getModelFunctionJacobian(),
                               problem.getTarget(),
                               new Weight(new double[] { 1, 1, 1, 1, 1 }),
                               new InitialGuess(new double[] { 2, 2, 2, 2, 2, 2 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96681);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96682);Assert.assertEquals(3, optimum.getPointRef()[2], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96683);Assert.assertEquals(4, optimum.getPointRef()[3], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96684);Assert.assertEquals(5, optimum.getPointRef()[4], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96685);Assert.assertEquals(6, optimum.getPointRef()[5], 1e-10);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testRedundantEquations() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lkgd22lq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testRedundantEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lkgd22lq(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96686);
        __CLR4_4_122ja22jalb90pduq.R.inc(96687);LinearProblem problem = new LinearProblem(new double[][] {
                { 1,  1 },
                { 1, -1 },
                { 1,  3 }
        }, new double[] { 3, 1, 5 });

        __CLR4_4_122ja22jalb90pduq.R.inc(96688);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96689);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               problem.getModelFunction(),
                               problem.getModelFunctionJacobian(),
                               problem.getTarget(),
                               new Weight(new double[] { 1, 1, 1 }),
                               new InitialGuess(new double[] { 1, 1 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96690);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96691);Assert.assertEquals(2, optimum.getPointRef()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96692);Assert.assertEquals(1, optimum.getPointRef()[1], 1e-10);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testInconsistentEquations() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5k8or22lx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5k8or22lx(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96693);
        __CLR4_4_122ja22jalb90pduq.R.inc(96694);LinearProblem problem = new LinearProblem(new double[][] {
                { 1,  1 },
                { 1, -1 },
                { 1,  3 }
        }, new double[] { 3, 1, 4 });

        __CLR4_4_122ja22jalb90pduq.R.inc(96695);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96696);optimizer.optimize(new MaxEval(100),
                           problem.getModelFunction(),
                           problem.getModelFunctionJacobian(),
                           problem.getTarget(),
                           new Weight(new double[] { 1, 1, 1 }),
                           new InitialGuess(new double[] { 1, 1 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96697);Assert.assertTrue(optimizer.getRMS() > 0.1);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testInconsistentSizes1() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kd0lt22m2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,110,115,105,115,116,101,110,116,83,105,122,101,115,49,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentSizes1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kd0lt22m2(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96698);
        __CLR4_4_122ja22jalb90pduq.R.inc(96699);LinearProblem problem
            = new LinearProblem(new double[][] { { 1, 0 }, { 0, 1 } },
                                new double[] { -1, 1 });
        __CLR4_4_122ja22jalb90pduq.R.inc(96700);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96701);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               problem.getModelFunction(),
                               problem.getModelFunctionJacobian(),
                               problem.getTarget(),
                               new Weight(new double[] { 1, 1 }),
                               new InitialGuess(new double[] { 0, 0 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96702);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96703);Assert.assertEquals(-1, optimum.getPoint()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96704);Assert.assertEquals(1, optimum.getPoint()[1], 1e-10);

        __CLR4_4_122ja22jalb90pduq.R.inc(96705);optimizer.optimize(new MaxEval(100),
                           problem.getModelFunction(),
                           problem.getModelFunctionJacobian(),
                           problem.getTarget(),
                           new Weight(new double[] { 1 }),
                           new InitialGuess(new double[] { 0, 0 }));
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testInconsistentSizes2() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11omy6o22ma();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,110,115,105,115,116,101,110,116,83,105,122,101,115,50,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentSizes2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11omy6o22ma(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96706);
        __CLR4_4_122ja22jalb90pduq.R.inc(96707);LinearProblem problem
            = new LinearProblem(new double[][] { { 1, 0 }, { 0, 1 } },
                                new double[] { -1, 1 });
        __CLR4_4_122ja22jalb90pduq.R.inc(96708);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96709);PointVectorValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getModelFunction(),
                                 problem.getModelFunctionJacobian(),
                                 problem.getTarget(),
                                 new Weight(new double[] { 1, 1 }),
                                 new InitialGuess(new double[] { 0, 0 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96710);Assert.assertEquals(0, optimizer.getRMS(), 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96711);Assert.assertEquals(-1, optimum.getPoint()[0], 1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96712);Assert.assertEquals(1, optimum.getPoint()[1], 1e-10);

        __CLR4_4_122ja22jalb90pduq.R.inc(96713);optimizer.optimize(new MaxEval(100),
                           problem.getModelFunction(),
                           problem.getModelFunctionJacobian(),
                           new Target(new double[] { 1 }),
                           new Weight(new double[] { 1 }),
                           new InitialGuess(new double[] { 0, 0 }));
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testCircleFitting() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcouro22mi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testCircleFitting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcouro22mi(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96714);
        __CLR4_4_122ja22jalb90pduq.R.inc(96715);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_122ja22jalb90pduq.R.inc(96716);circle.addPoint( 30,  68);
        __CLR4_4_122ja22jalb90pduq.R.inc(96717);circle.addPoint( 50,  -6);
        __CLR4_4_122ja22jalb90pduq.R.inc(96718);circle.addPoint(110, -20);
        __CLR4_4_122ja22jalb90pduq.R.inc(96719);circle.addPoint( 35,  15);
        __CLR4_4_122ja22jalb90pduq.R.inc(96720);circle.addPoint( 45,  97);
        __CLR4_4_122ja22jalb90pduq.R.inc(96721);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96722);PointVectorValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 circle.getModelFunction(),
                                 circle.getModelFunctionJacobian(),
                                 new Target(new double[] { 0, 0, 0, 0, 0 }),
                                 new Weight(new double[] { 1, 1, 1, 1, 1 }),
                                 new InitialGuess(new double[] { 98.680, 47.345 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96723);Assert.assertTrue(optimizer.getEvaluations() < 10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96724);double rms = optimizer.getRMS();
        __CLR4_4_122ja22jalb90pduq.R.inc(96725);Assert.assertEquals(1.768262623567235,  FastMath.sqrt(circle.getN()) * rms,  1e-10);
        __CLR4_4_122ja22jalb90pduq.R.inc(96726);Vector2D center = new Vector2D(optimum.getPointRef()[0], optimum.getPointRef()[1]);
        __CLR4_4_122ja22jalb90pduq.R.inc(96727);Assert.assertEquals(69.96016176931406, circle.getRadius(center), 1e-6);
        __CLR4_4_122ja22jalb90pduq.R.inc(96728);Assert.assertEquals(96.07590211815305, center.getX(),            1e-6);
        __CLR4_4_122ja22jalb90pduq.R.inc(96729);Assert.assertEquals(48.13516790438953, center.getY(),            1e-6);
        __CLR4_4_122ja22jalb90pduq.R.inc(96730);double[][] cov = optimizer.computeCovariances(optimum.getPoint(), 1e-14);
        __CLR4_4_122ja22jalb90pduq.R.inc(96731);Assert.assertEquals(1.839, cov[0][0], 0.001);
        __CLR4_4_122ja22jalb90pduq.R.inc(96732);Assert.assertEquals(0.731, cov[0][1], 0.001);
        __CLR4_4_122ja22jalb90pduq.R.inc(96733);Assert.assertEquals(cov[0][1], cov[1][0], 1e-14);
        __CLR4_4_122ja22jalb90pduq.R.inc(96734);Assert.assertEquals(0.786, cov[1][1], 0.001);

        // add perfect measurements and check errors are reduced
        __CLR4_4_122ja22jalb90pduq.R.inc(96735);double  r = circle.getRadius(center);
        __CLR4_4_122ja22jalb90pduq.R.inc(96736);for (double d= 0; (((d < 2 * FastMath.PI)&&(__CLR4_4_122ja22jalb90pduq.R.iget(96737)!=0|true))||(__CLR4_4_122ja22jalb90pduq.R.iget(96738)==0&false)); d += 0.01) {{
            __CLR4_4_122ja22jalb90pduq.R.inc(96739);circle.addPoint(center.getX() + r * FastMath.cos(d), center.getY() + r * FastMath.sin(d));
        }
        }__CLR4_4_122ja22jalb90pduq.R.inc(96740);double[] target = new double[circle.getN()];
        __CLR4_4_122ja22jalb90pduq.R.inc(96741);Arrays.fill(target, 0);
        __CLR4_4_122ja22jalb90pduq.R.inc(96742);double[] weights = new double[circle.getN()];
        __CLR4_4_122ja22jalb90pduq.R.inc(96743);Arrays.fill(weights, 2);
        __CLR4_4_122ja22jalb90pduq.R.inc(96744);optimum = optimizer.optimize(new MaxEval(100),
                                     circle.getModelFunction(),
                                     circle.getModelFunctionJacobian(),
                                     new Target(target),
                                     new Weight(weights),
                                     new InitialGuess(new double[] { 98.680, 47.345 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96745);cov = optimizer.computeCovariances(optimum.getPoint(), 1e-14);
        __CLR4_4_122ja22jalb90pduq.R.inc(96746);Assert.assertEquals(0.0016, cov[0][0], 0.001);
        __CLR4_4_122ja22jalb90pduq.R.inc(96747);Assert.assertEquals(3.2e-7, cov[0][1], 1e-9);
        __CLR4_4_122ja22jalb90pduq.R.inc(96748);Assert.assertEquals(cov[0][1], cov[1][0], 1e-14);
        __CLR4_4_122ja22jalb90pduq.R.inc(96749);Assert.assertEquals(0.0016, cov[1][1], 0.001);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testCircleFittingBadInit() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlbl5t22ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testCircleFittingBadInit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlbl5t22ni(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96750);
        __CLR4_4_122ja22jalb90pduq.R.inc(96751);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_122ja22jalb90pduq.R.inc(96752);double[][] points = circlePoints;
        __CLR4_4_122ja22jalb90pduq.R.inc(96753);double[] target = new double[points.length];
        __CLR4_4_122ja22jalb90pduq.R.inc(96754);Arrays.fill(target, 0);
        __CLR4_4_122ja22jalb90pduq.R.inc(96755);double[] weights = new double[points.length];
        __CLR4_4_122ja22jalb90pduq.R.inc(96756);Arrays.fill(weights, 2);
        __CLR4_4_122ja22jalb90pduq.R.inc(96757);for (int i = 0; (((i < points.length)&&(__CLR4_4_122ja22jalb90pduq.R.iget(96758)!=0|true))||(__CLR4_4_122ja22jalb90pduq.R.iget(96759)==0&false)); ++i) {{
            __CLR4_4_122ja22jalb90pduq.R.inc(96760);circle.addPoint(points[i][0], points[i][1]);
        }
        }__CLR4_4_122ja22jalb90pduq.R.inc(96761);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96762);PointVectorValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 circle.getModelFunction(),
                                 circle.getModelFunctionJacobian(),
                                 new Target(target),
                                 new Weight(weights),
                                 new InitialGuess(new double[] { -12, -12 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96763);Vector2D center = new Vector2D(optimum.getPointRef()[0], optimum.getPointRef()[1]);
        __CLR4_4_122ja22jalb90pduq.R.inc(96764);Assert.assertTrue(optimizer.getEvaluations() < 25);
        __CLR4_4_122ja22jalb90pduq.R.inc(96765);Assert.assertEquals( 0.043, optimizer.getRMS(), 1e-3);
        __CLR4_4_122ja22jalb90pduq.R.inc(96766);Assert.assertEquals( 0.292235,  circle.getRadius(center), 1e-6);
        __CLR4_4_122ja22jalb90pduq.R.inc(96767);Assert.assertEquals(-0.151738,  center.getX(),            1e-6);
        __CLR4_4_122ja22jalb90pduq.R.inc(96768);Assert.assertEquals( 0.2075001, center.getY(),            1e-6);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testCircleFittingGoodInit() {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2xc9b22o1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testCircleFittingGoodInit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2xc9b22o1(){try{__CLR4_4_122ja22jalb90pduq.R.inc(96769);
        __CLR4_4_122ja22jalb90pduq.R.inc(96770);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_122ja22jalb90pduq.R.inc(96771);double[][] points = circlePoints;
        __CLR4_4_122ja22jalb90pduq.R.inc(96772);double[] target = new double[points.length];
        __CLR4_4_122ja22jalb90pduq.R.inc(96773);Arrays.fill(target, 0);
        __CLR4_4_122ja22jalb90pduq.R.inc(96774);double[] weights = new double[points.length];
        __CLR4_4_122ja22jalb90pduq.R.inc(96775);Arrays.fill(weights, 2);
        __CLR4_4_122ja22jalb90pduq.R.inc(96776);for (int i = 0; (((i < points.length)&&(__CLR4_4_122ja22jalb90pduq.R.iget(96777)!=0|true))||(__CLR4_4_122ja22jalb90pduq.R.iget(96778)==0&false)); ++i) {{
            __CLR4_4_122ja22jalb90pduq.R.inc(96779);circle.addPoint(points[i][0], points[i][1]);
        }
        }__CLR4_4_122ja22jalb90pduq.R.inc(96780);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96781);PointVectorValuePair optimum =
            optimizer.optimize(new MaxEval(100),
                               circle.getModelFunction(),
                               circle.getModelFunctionJacobian(),
                               new Target(target),
                               new Weight(weights),
                               new InitialGuess(new double[] { 0, 0 }));
        __CLR4_4_122ja22jalb90pduq.R.inc(96782);Assert.assertEquals(-0.1517383071957963, optimum.getPointRef()[0], 1e-6);
        __CLR4_4_122ja22jalb90pduq.R.inc(96783);Assert.assertEquals(0.2074999736353867,  optimum.getPointRef()[1], 1e-6);
        __CLR4_4_122ja22jalb90pduq.R.inc(96784);Assert.assertEquals(0.04268731682389561, optimizer.getRMS(),       1e-8);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

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
                           final double errParamsSd) {try{__CLR4_4_122ja22jalb90pduq.R.inc(96785);
        __CLR4_4_122ja22jalb90pduq.R.inc(96786);final AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_122ja22jalb90pduq.R.inc(96787);final double[] w = new double[dataset.getNumObservations()];
        __CLR4_4_122ja22jalb90pduq.R.inc(96788);Arrays.fill(w, 1);

        __CLR4_4_122ja22jalb90pduq.R.inc(96789);final double[][] data = dataset.getData();
        __CLR4_4_122ja22jalb90pduq.R.inc(96790);final double[] initial = dataset.getStartingPoint(0);
        __CLR4_4_122ja22jalb90pduq.R.inc(96791);final StatisticalReferenceDataset.LeastSquaresProblem problem = dataset.getLeastSquaresProblem();
        __CLR4_4_122ja22jalb90pduq.R.inc(96792);final PointVectorValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getModelFunction(),
                                 problem.getModelFunctionJacobian(),
                                 new Target(data[1]),
                                 new Weight(w),
                                 new InitialGuess(initial));

        __CLR4_4_122ja22jalb90pduq.R.inc(96793);final double[] actual = optimum.getPoint();
        __CLR4_4_122ja22jalb90pduq.R.inc(96794);for (int i = 0; (((i < actual.length)&&(__CLR4_4_122ja22jalb90pduq.R.iget(96795)!=0|true))||(__CLR4_4_122ja22jalb90pduq.R.iget(96796)==0&false)); i++) {{
            __CLR4_4_122ja22jalb90pduq.R.inc(96797);double expected = dataset.getParameter(i);
            __CLR4_4_122ja22jalb90pduq.R.inc(96798);double delta = FastMath.abs(errParams * expected);
            __CLR4_4_122ja22jalb90pduq.R.inc(96799);Assert.assertEquals(dataset.getName() + ", param #" + i,
                                expected, actual[i], delta);
        }
    }}finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testKirby2() throws IOException {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6a7nk22ow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testKirby2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6a7nk22ow() throws IOException{try{__CLR4_4_122ja22jalb90pduq.R.inc(96800);
        __CLR4_4_122ja22jalb90pduq.R.inc(96801);doTestStRD(StatisticalReferenceDatasetFactory.createKirby2(), 1E-7, 1E-7);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    @Test
    public void testHahn1() throws IOException {__CLR4_4_122ja22jalb90pduq.R.globalSliceStart(getClass().getName(),96802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynumnb22oy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122ja22jalb90pduq.R.rethrow($CLV_t2$);}finally{__CLR4_4_122ja22jalb90pduq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerAbstractTest.testHahn1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynumnb22oy() throws IOException{try{__CLR4_4_122ja22jalb90pduq.R.inc(96802);
        __CLR4_4_122ja22jalb90pduq.R.inc(96803);doTestStRD(StatisticalReferenceDatasetFactory.createHahn1(), 1E-7, 1E-4);
    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

    static class LinearProblem {
        private final RealMatrix factors;
        private final double[] target;

        public LinearProblem(double[][] factors, double[] target) {try{__CLR4_4_122ja22jalb90pduq.R.inc(96804);
            __CLR4_4_122ja22jalb90pduq.R.inc(96805);this.factors = new BlockRealMatrix(factors);
            __CLR4_4_122ja22jalb90pduq.R.inc(96806);this.target  = target;
        }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

        public Target getTarget() {try{__CLR4_4_122ja22jalb90pduq.R.inc(96807);
            __CLR4_4_122ja22jalb90pduq.R.inc(96808);return new Target(target);
        }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

        public ModelFunction getModelFunction() {try{__CLR4_4_122ja22jalb90pduq.R.inc(96809);
            __CLR4_4_122ja22jalb90pduq.R.inc(96810);return new ModelFunction(new MultivariateVectorFunction() {
                    public double[] value(double[] params) {try{__CLR4_4_122ja22jalb90pduq.R.inc(96811);
                        __CLR4_4_122ja22jalb90pduq.R.inc(96812);return factors.operate(params);
                    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}
                });
        }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}

        public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_122ja22jalb90pduq.R.inc(96813);
            __CLR4_4_122ja22jalb90pduq.R.inc(96814);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                    public double[][] value(double[] params) {try{__CLR4_4_122ja22jalb90pduq.R.inc(96815);
                        __CLR4_4_122ja22jalb90pduq.R.inc(96816);return factors.getData();
                    }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}
                });
        }finally{__CLR4_4_122ja22jalb90pduq.R.flushNeeded();}}
    }
}
