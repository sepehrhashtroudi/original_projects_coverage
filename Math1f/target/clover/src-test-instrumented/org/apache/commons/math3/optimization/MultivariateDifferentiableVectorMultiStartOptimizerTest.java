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

package org.apache.commons.math3.optimization;


import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomVectorGenerator;
import org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator;
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
public class MultivariateDifferentiableVectorMultiStartOptimizerTest {static class __CLR4_4_1242f242flb90pdy9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testTrivial() {__CLR4_4_1242f242flb90pdy9.R.globalSliceStart(getClass().getName(),98583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ri9u242f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1242f242flb90pdy9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1242f242flb90pdy9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.testTrivial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ri9u242f(){try{__CLR4_4_1242f242flb90pdy9.R.inc(98583);
        __CLR4_4_1242f242flb90pdy9.R.inc(98584);LinearProblem problem =
            new LinearProblem(new double[][] { { 2 } }, new double[] { 3 });
        // TODO: the wrapper around GaussNewtonOptimizer is a temporary hack for
        // version 3.1 of the library. It should be removed when GaussNewtonOptimizer
        // will officialy be declared as implementing MultivariateDifferentiableVectorOptimizer
        __CLR4_4_1242f242flb90pdy9.R.inc(98585);MultivariateDifferentiableVectorOptimizer underlyingOptimizer =
                new MultivariateDifferentiableVectorOptimizer() {
            private GaussNewtonOptimizer gn =
                    new GaussNewtonOptimizer(true,
                                             new SimpleVectorValueChecker(1.0e-6, 1.0e-6));

            public PointVectorValuePair optimize(int maxEval,
                                                 MultivariateDifferentiableVectorFunction f,
                                                 double[] target,
                                                 double[] weight,
                                                 double[] startPoint) {try{__CLR4_4_1242f242flb90pdy9.R.inc(98586);
                __CLR4_4_1242f242flb90pdy9.R.inc(98587);return gn.optimize(maxEval, f, target, weight, startPoint);
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

            public int getMaxEvaluations() {try{__CLR4_4_1242f242flb90pdy9.R.inc(98588);
                __CLR4_4_1242f242flb90pdy9.R.inc(98589);return gn.getMaxEvaluations();
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

            public int getEvaluations() {try{__CLR4_4_1242f242flb90pdy9.R.inc(98590);
                __CLR4_4_1242f242flb90pdy9.R.inc(98591);return gn.getEvaluations();
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

            public ConvergenceChecker<PointVectorValuePair> getConvergenceChecker() {try{__CLR4_4_1242f242flb90pdy9.R.inc(98592);
                __CLR4_4_1242f242flb90pdy9.R.inc(98593);return gn.getConvergenceChecker();
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}
        };
        __CLR4_4_1242f242flb90pdy9.R.inc(98594);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_1242f242flb90pdy9.R.inc(98595);g.setSeed(16069223052l);
        __CLR4_4_1242f242flb90pdy9.R.inc(98596);RandomVectorGenerator generator =
            new UncorrelatedRandomVectorGenerator(1, new GaussianRandomGenerator(g));
        __CLR4_4_1242f242flb90pdy9.R.inc(98597);MultivariateDifferentiableVectorMultiStartOptimizer optimizer =
            new MultivariateDifferentiableVectorMultiStartOptimizer(underlyingOptimizer,
                                                                       10, generator);

        // no optima before first optimization attempt
        __CLR4_4_1242f242flb90pdy9.R.inc(98598);try {
            __CLR4_4_1242f242flb90pdy9.R.inc(98599);optimizer.getOptima();
            __CLR4_4_1242f242flb90pdy9.R.inc(98600);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalStateException ise) {
            // expected
        }
        __CLR4_4_1242f242flb90pdy9.R.inc(98601);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1 }, new double[] { 0 });
        __CLR4_4_1242f242flb90pdy9.R.inc(98602);Assert.assertEquals(1.5, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_1242f242flb90pdy9.R.inc(98603);Assert.assertEquals(3.0, optimum.getValue()[0], 1.0e-10);
        __CLR4_4_1242f242flb90pdy9.R.inc(98604);PointVectorValuePair[] optima = optimizer.getOptima();
        __CLR4_4_1242f242flb90pdy9.R.inc(98605);Assert.assertEquals(10, optima.length);
        __CLR4_4_1242f242flb90pdy9.R.inc(98606);for (int i = 0; (((i < optima.length)&&(__CLR4_4_1242f242flb90pdy9.R.iget(98607)!=0|true))||(__CLR4_4_1242f242flb90pdy9.R.iget(98608)==0&false)); ++i) {{
            __CLR4_4_1242f242flb90pdy9.R.inc(98609);Assert.assertEquals(1.5, optima[i].getPoint()[0], 1.0e-10);
            __CLR4_4_1242f242flb90pdy9.R.inc(98610);Assert.assertEquals(3.0, optima[i].getValue()[0], 1.0e-10);
        }
        }__CLR4_4_1242f242flb90pdy9.R.inc(98611);Assert.assertTrue(optimizer.getEvaluations() > 20);
        __CLR4_4_1242f242flb90pdy9.R.inc(98612);Assert.assertTrue(optimizer.getEvaluations() < 50);
        __CLR4_4_1242f242flb90pdy9.R.inc(98613);Assert.assertEquals(100, optimizer.getMaxEvaluations());
    }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

    @Test(expected=TestException.class)
    public void testNoOptimum() {__CLR4_4_1242f242flb90pdy9.R.globalSliceStart(getClass().getName(),98614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0b2rh243a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,79,112,116,105,109,117,109,58,32,91,84,101,115,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TestException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1242f242flb90pdy9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1242f242flb90pdy9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.testNoOptimum",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0b2rh243a(){try{__CLR4_4_1242f242flb90pdy9.R.inc(98614);

        // TODO: the wrapper around GaussNewtonOptimizer is a temporary hack for
        // version 3.1 of the library. It should be removed when GaussNewtonOptimizer
        // will officialy be declared as implementing MultivariateDifferentiableVectorOptimizer
        __CLR4_4_1242f242flb90pdy9.R.inc(98615);MultivariateDifferentiableVectorOptimizer underlyingOptimizer =
                new MultivariateDifferentiableVectorOptimizer() {
            private GaussNewtonOptimizer gn =
                    new GaussNewtonOptimizer(true,
                                             new SimpleVectorValueChecker(1.0e-6, 1.0e-6));

            public PointVectorValuePair optimize(int maxEval,
                                                 MultivariateDifferentiableVectorFunction f,
                                                 double[] target,
                                                 double[] weight,
                                                 double[] startPoint) {try{__CLR4_4_1242f242flb90pdy9.R.inc(98616);
                __CLR4_4_1242f242flb90pdy9.R.inc(98617);return gn.optimize(maxEval, f, target, weight, startPoint);
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

            public int getMaxEvaluations() {try{__CLR4_4_1242f242flb90pdy9.R.inc(98618);
                __CLR4_4_1242f242flb90pdy9.R.inc(98619);return gn.getMaxEvaluations();
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

            public int getEvaluations() {try{__CLR4_4_1242f242flb90pdy9.R.inc(98620);
                __CLR4_4_1242f242flb90pdy9.R.inc(98621);return gn.getEvaluations();
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

            public ConvergenceChecker<PointVectorValuePair> getConvergenceChecker() {try{__CLR4_4_1242f242flb90pdy9.R.inc(98622);
                __CLR4_4_1242f242flb90pdy9.R.inc(98623);return gn.getConvergenceChecker();
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}
        };
        __CLR4_4_1242f242flb90pdy9.R.inc(98624);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_1242f242flb90pdy9.R.inc(98625);g.setSeed(12373523445l);
        __CLR4_4_1242f242flb90pdy9.R.inc(98626);RandomVectorGenerator generator =
            new UncorrelatedRandomVectorGenerator(1, new GaussianRandomGenerator(g));
        __CLR4_4_1242f242flb90pdy9.R.inc(98627);MultivariateDifferentiableVectorMultiStartOptimizer optimizer =
            new MultivariateDifferentiableVectorMultiStartOptimizer(underlyingOptimizer,
                                                                       10, generator);
        __CLR4_4_1242f242flb90pdy9.R.inc(98628);optimizer.optimize(100, new MultivariateDifferentiableVectorFunction() {
            public double[] value(double[] point) {try{__CLR4_4_1242f242flb90pdy9.R.inc(98629);
                __CLR4_4_1242f242flb90pdy9.R.inc(98630);throw new TestException();
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}
            public DerivativeStructure[] value(DerivativeStructure[] point) {try{__CLR4_4_1242f242flb90pdy9.R.inc(98631);
                __CLR4_4_1242f242flb90pdy9.R.inc(98632);return point;
            }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}
            }, new double[] { 2 }, new double[] { 1 }, new double[] { 0 });
    }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

    private static class TestException extends RuntimeException {
        private static final long serialVersionUID = -7809988995389067683L;
    }

    private static class LinearProblem implements MultivariateDifferentiableVectorFunction {

        final RealMatrix factors;
        final double[] target;
        public LinearProblem(double[][] factors, double[] target) {try{__CLR4_4_1242f242flb90pdy9.R.inc(98633);
            __CLR4_4_1242f242flb90pdy9.R.inc(98634);this.factors = new BlockRealMatrix(factors);
            __CLR4_4_1242f242flb90pdy9.R.inc(98635);this.target  = target;
        }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

        public double[] value(double[] variables) {try{__CLR4_4_1242f242flb90pdy9.R.inc(98636);
            __CLR4_4_1242f242flb90pdy9.R.inc(98637);return factors.operate(variables);
        }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

        public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_1242f242flb90pdy9.R.inc(98638);
            __CLR4_4_1242f242flb90pdy9.R.inc(98639);DerivativeStructure[] y = new DerivativeStructure[factors.getRowDimension()];
            __CLR4_4_1242f242flb90pdy9.R.inc(98640);for (int i = 0; (((i < y.length)&&(__CLR4_4_1242f242flb90pdy9.R.iget(98641)!=0|true))||(__CLR4_4_1242f242flb90pdy9.R.iget(98642)==0&false)); ++i) {{
                __CLR4_4_1242f242flb90pdy9.R.inc(98643);y[i] = variables[0].getField().getZero();
                __CLR4_4_1242f242flb90pdy9.R.inc(98644);for (int j = 0; (((j < factors.getColumnDimension())&&(__CLR4_4_1242f242flb90pdy9.R.iget(98645)!=0|true))||(__CLR4_4_1242f242flb90pdy9.R.iget(98646)==0&false)); ++j) {{
                    __CLR4_4_1242f242flb90pdy9.R.inc(98647);y[i] = y[i].add(variables[j].multiply(factors.getEntry(i, j)));
                }
            }}
            }__CLR4_4_1242f242flb90pdy9.R.inc(98648);return y;
        }finally{__CLR4_4_1242f242flb90pdy9.R.flushNeeded();}}

    }

}
