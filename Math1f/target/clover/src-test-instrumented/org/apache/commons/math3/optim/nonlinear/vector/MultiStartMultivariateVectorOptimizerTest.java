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
package org.apache.commons.math3.optim.nonlinear.vector;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
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
public class MultiStartMultivariateVectorOptimizerTest {static class __CLR4_4_122hd22hdlb90pdu6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,96598,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected=NullPointerException.class)
    public void testGetOptimaBeforeOptimize() {__CLR4_4_122hd22hdlb90pdu6.R.globalSliceStart(getClass().getName(),96529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hn9fsf22hd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,79,112,116,105,109,97,66,101,102,111,114,101,79,112,116,105,109,105,122,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122hd22hdlb90pdu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_122hd22hdlb90pdu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest.testGetOptimaBeforeOptimize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hn9fsf22hd(){try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96529);

        __CLR4_4_122hd22hdlb90pdu6.R.inc(96530);JacobianMultivariateVectorOptimizer underlyingOptimizer
            = new GaussNewtonOptimizer(true, new SimpleVectorValueChecker(1e-6, 1e-6));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96531);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96532);g.setSeed(16069223052l);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96533);RandomVectorGenerator generator
            = new UncorrelatedRandomVectorGenerator(1, new GaussianRandomGenerator(g));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96534);MultiStartMultivariateVectorOptimizer optimizer
            = new MultiStartMultivariateVectorOptimizer(underlyingOptimizer, 10, generator);

        __CLR4_4_122hd22hdlb90pdu6.R.inc(96535);optimizer.getOptima();
    }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}

    @Test
    public void testTrivial() {__CLR4_4_122hd22hdlb90pdu6.R.globalSliceStart(getClass().getName(),96536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ri9u22hk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122hd22hdlb90pdu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_122hd22hdlb90pdu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest.testTrivial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ri9u22hk(){try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96536);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96537);LinearProblem problem
            = new LinearProblem(new double[][] { { 2 } }, new double[] { 3 });
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96538);JacobianMultivariateVectorOptimizer underlyingOptimizer
            = new GaussNewtonOptimizer(true, new SimpleVectorValueChecker(1e-6, 1e-6));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96539);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96540);g.setSeed(16069223052l);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96541);RandomVectorGenerator generator
            = new UncorrelatedRandomVectorGenerator(1, new GaussianRandomGenerator(g));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96542);MultiStartMultivariateVectorOptimizer optimizer
            = new MultiStartMultivariateVectorOptimizer(underlyingOptimizer, 10, generator);

        __CLR4_4_122hd22hdlb90pdu6.R.inc(96543);PointVectorValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 problem.getModelFunction(),
                                 problem.getModelFunctionJacobian(),
                                 problem.getTarget(),
                                 new Weight(new double[] { 1 }),
                                 new InitialGuess(new double[] { 0 }));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96544);Assert.assertEquals(1.5, optimum.getPoint()[0], 1e-10);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96545);Assert.assertEquals(3.0, optimum.getValue()[0], 1e-10);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96546);PointVectorValuePair[] optima = optimizer.getOptima();
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96547);Assert.assertEquals(10, optima.length);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96548);for (int i = 0; (((i < optima.length)&&(__CLR4_4_122hd22hdlb90pdu6.R.iget(96549)!=0|true))||(__CLR4_4_122hd22hdlb90pdu6.R.iget(96550)==0&false)); i++) {{
            __CLR4_4_122hd22hdlb90pdu6.R.inc(96551);Assert.assertEquals(1.5, optima[i].getPoint()[0], 1e-10);
            __CLR4_4_122hd22hdlb90pdu6.R.inc(96552);Assert.assertEquals(3.0, optima[i].getValue()[0], 1e-10);
        }
        }__CLR4_4_122hd22hdlb90pdu6.R.inc(96553);Assert.assertTrue(optimizer.getEvaluations() > 20);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96554);Assert.assertTrue(optimizer.getEvaluations() < 50);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96555);Assert.assertEquals(100, optimizer.getMaxEvaluations());
    }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}

    @Test
    public void testIssue914() {__CLR4_4_122hd22hdlb90pdu6.R.globalSliceStart(getClass().getName(),96556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuk9ac22i4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122hd22hdlb90pdu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_122hd22hdlb90pdu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest.testIssue914",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuk9ac22i4(){try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96556);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96557);LinearProblem problem = new LinearProblem(new double[][] { { 2 } }, new double[] { 3 });
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96558);JacobianMultivariateVectorOptimizer underlyingOptimizer =
                new GaussNewtonOptimizer(true, new SimpleVectorValueChecker(1e-6, 1e-6)) {
            @Override
            public PointVectorValuePair optimize(OptimizationData... optData) {try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96559);
                // filter out simple bounds, as they are not supported
                // by the underlying optimizer, and we don't really care for this test
                __CLR4_4_122hd22hdlb90pdu6.R.inc(96560);OptimizationData[] filtered = optData.clone();
                __CLR4_4_122hd22hdlb90pdu6.R.inc(96561);for (int i = 0; (((i < filtered.length)&&(__CLR4_4_122hd22hdlb90pdu6.R.iget(96562)!=0|true))||(__CLR4_4_122hd22hdlb90pdu6.R.iget(96563)==0&false)); ++i) {{
                    __CLR4_4_122hd22hdlb90pdu6.R.inc(96564);if ((((filtered[i] instanceof SimpleBounds)&&(__CLR4_4_122hd22hdlb90pdu6.R.iget(96565)!=0|true))||(__CLR4_4_122hd22hdlb90pdu6.R.iget(96566)==0&false))) {{
                        __CLR4_4_122hd22hdlb90pdu6.R.inc(96567);filtered[i] = null;
                    }
                }}
                }__CLR4_4_122hd22hdlb90pdu6.R.inc(96568);return super.optimize(filtered);
            }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}
        };
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96569);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96570);g.setSeed(16069223052l);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96571);RandomVectorGenerator generator =
                new UncorrelatedRandomVectorGenerator(1, new GaussianRandomGenerator(g));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96572);MultiStartMultivariateVectorOptimizer optimizer =
                new MultiStartMultivariateVectorOptimizer(underlyingOptimizer, 10, generator);

        __CLR4_4_122hd22hdlb90pdu6.R.inc(96573);optimizer.optimize(new MaxEval(100),
                           problem.getModelFunction(),
                           problem.getModelFunctionJacobian(),
                           problem.getTarget(),
                           new Weight(new double[] { 1 }),
                           new InitialGuess(new double[] { 0 }),
                           new SimpleBounds(new double[] { -1.0e-10 }, new double[] {  1.0e-10 }));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96574);PointVectorValuePair[] optima = optimizer.getOptima();
        // only the first start should have succeeded
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96575);Assert.assertEquals(1, optima.length);

    }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}

    /**
     * Test demonstrating that the user exception is finally thrown if none
     * of the runs succeed.
     */
    @Test(expected=TestException.class)
    public void testNoOptimum() {__CLR4_4_122hd22hdlb90pdu6.R.globalSliceStart(getClass().getName(),96576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0b2rh22io();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,79,112,116,105,109,117,109,58,32,91,84,101,115,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TestException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122hd22hdlb90pdu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_122hd22hdlb90pdu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest.testNoOptimum",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0b2rh22io(){try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96576);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96577);JacobianMultivariateVectorOptimizer underlyingOptimizer
            = new GaussNewtonOptimizer(true, new SimpleVectorValueChecker(1e-6, 1e-6));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96578);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96579);g.setSeed(12373523445l);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96580);RandomVectorGenerator generator
            = new UncorrelatedRandomVectorGenerator(1, new GaussianRandomGenerator(g));
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96581);MultiStartMultivariateVectorOptimizer optimizer
            = new MultiStartMultivariateVectorOptimizer(underlyingOptimizer, 10, generator);
        __CLR4_4_122hd22hdlb90pdu6.R.inc(96582);optimizer.optimize(new MaxEval(100),
                           new Target(new double[] { 0 }),
                           new Weight(new double[] { 1 }),
                           new InitialGuess(new double[] { 0 }),
                           new ModelFunction(new MultivariateVectorFunction() {
                                   public double[] value(double[] point) {try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96583);
                                       __CLR4_4_122hd22hdlb90pdu6.R.inc(96584);throw new TestException();
                                   }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}
                               }));
    }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}

    private static class TestException extends RuntimeException {

    private static final long serialVersionUID = 1L;}

    private static class LinearProblem {
        private final RealMatrix factors;
        private final double[] target;

        public LinearProblem(double[][] factors,
                             double[] target) {try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96585);
            __CLR4_4_122hd22hdlb90pdu6.R.inc(96586);this.factors = new BlockRealMatrix(factors);
            __CLR4_4_122hd22hdlb90pdu6.R.inc(96587);this.target  = target;
        }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}

        public Target getTarget() {try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96588);
            __CLR4_4_122hd22hdlb90pdu6.R.inc(96589);return new Target(target);
        }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}

        public ModelFunction getModelFunction() {try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96590);
            __CLR4_4_122hd22hdlb90pdu6.R.inc(96591);return new ModelFunction(new MultivariateVectorFunction() {
                    public double[] value(double[] variables) {try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96592);
                        __CLR4_4_122hd22hdlb90pdu6.R.inc(96593);return factors.operate(variables);
                    }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}
                });
        }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}

        public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96594);
            __CLR4_4_122hd22hdlb90pdu6.R.inc(96595);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {try{__CLR4_4_122hd22hdlb90pdu6.R.inc(96596);
                        __CLR4_4_122hd22hdlb90pdu6.R.inc(96597);return factors.getData();
                    }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}
                });
        }finally{__CLR4_4_122hd22hdlb90pdu6.R.flushNeeded();}}
    }
}
