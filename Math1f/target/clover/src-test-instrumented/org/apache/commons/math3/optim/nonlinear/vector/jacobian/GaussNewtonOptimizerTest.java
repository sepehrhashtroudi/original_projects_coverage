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
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
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
public class GaussNewtonOptimizerTest
    extends AbstractLeastSquaresOptimizerAbstractTest {static class __CLR4_4_122xn22xnlb90pdvd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,97136,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public AbstractLeastSquaresOptimizer createOptimizer() {try{__CLR4_4_122xn22xnlb90pdvd.R.inc(97115);
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97116);return new GaussNewtonOptimizer(new SimpleVectorValueChecker(1.0e-6, 1.0e-6));
    }finally{__CLR4_4_122xn22xnlb90pdvd.R.flushNeeded();}}

    @Test(expected=MathUnsupportedOperationException.class)
    public void testConstraintsUnsupported() {__CLR4_4_122xn22xnlb90pdvd.R.globalSliceStart(getClass().getName(),97117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w66qvc22xp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,97,105,110,116,115,85,110,115,117,112,112,111,114,116,101,100,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122xn22xnlb90pdvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_122xn22xnlb90pdvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizerTest.testConstraintsUnsupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w66qvc22xp(){try{__CLR4_4_122xn22xnlb90pdvd.R.inc(97117);
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97118);createOptimizer().optimize(new MaxEval(100),
                                   new Target(new double[] { 2 }),
                                   new Weight(new double[] { 1 }),
                                   new InitialGuess(new double[] { 1, 2 }),
                                   new SimpleBounds(new double[] { -10, 0 },
                                                    new double[] { 20, 30 }));
    }finally{__CLR4_4_122xn22xnlb90pdvd.R.flushNeeded();}}

    @Override
    @Test(expected = ConvergenceException.class)
    public void testMoreEstimatedParametersSimple() {__CLR4_4_122xn22xnlb90pdvd.R.globalSliceStart(getClass().getName(),97119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ow9s822xr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,111,114,101,69,115,116,105,109,97,116,101,100,80,97,114,97,109,101,116,101,114,115,83,105,109,112,108,101,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122xn22xnlb90pdvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_122xn22xnlb90pdvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ow9s822xr(){try{__CLR4_4_122xn22xnlb90pdvd.R.inc(97119);
        /*
         * Exception is expected with this optimizer
         */
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97120);super.testMoreEstimatedParametersSimple();
    }finally{__CLR4_4_122xn22xnlb90pdvd.R.flushNeeded();}}

    @Override
    @Test(expected=ConvergenceException.class)
    public void testMoreEstimatedParametersUnsorted() {__CLR4_4_122xn22xnlb90pdvd.R.globalSliceStart(getClass().getName(),97121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sopi422xt();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,111,114,101,69,115,116,105,109,97,116,101,100,80,97,114,97,109,101,116,101,114,115,85,110,115,111,114,116,101,100,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122xn22xnlb90pdvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_122xn22xnlb90pdvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sopi422xt(){try{__CLR4_4_122xn22xnlb90pdvd.R.inc(97121);
        /*
         * Exception is expected with this optimizer
         */
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97122);super.testMoreEstimatedParametersUnsorted();
    }finally{__CLR4_4_122xn22xnlb90pdvd.R.flushNeeded();}}

    @Test(expected=TooManyEvaluationsException.class)
    public void testMaxEvaluations() throws Exception {__CLR4_4_122xn22xnlb90pdvd.R.globalSliceStart(getClass().getName(),97123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7mzqs22xv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,69,118,97,108,117,97,116,105,111,110,115,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122xn22xnlb90pdvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_122xn22xnlb90pdvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizerTest.testMaxEvaluations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7mzqs22xv() throws Exception{try{__CLR4_4_122xn22xnlb90pdvd.R.inc(97123);
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97124);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97125);circle.addPoint( 30.0,  68.0);
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97126);circle.addPoint( 50.0,  -6.0);
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97127);circle.addPoint(110.0, -20.0);
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97128);circle.addPoint( 35.0,  15.0);
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97129);circle.addPoint( 45.0,  97.0);

        __CLR4_4_122xn22xnlb90pdvd.R.inc(97130);GaussNewtonOptimizer optimizer
            = new GaussNewtonOptimizer(new SimpleVectorValueChecker(1e-30, 1e-30));

        __CLR4_4_122xn22xnlb90pdvd.R.inc(97131);optimizer.optimize(new MaxEval(100),
                           circle.getModelFunction(),
                           circle.getModelFunctionJacobian(),
                           new Target(new double[] { 0, 0, 0, 0, 0 }),
                           new Weight(new double[] { 1, 1, 1, 1, 1 }),
                           new InitialGuess(new double[] { 98.680, 47.345 }));
    }finally{__CLR4_4_122xn22xnlb90pdvd.R.flushNeeded();}}

    @Override
    @Test(expected=ConvergenceException.class)
    public void testCircleFittingBadInit() {__CLR4_4_122xn22xnlb90pdvd.R.globalSliceStart(getClass().getName(),97132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlbl5t22y4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,105,114,99,108,101,70,105,116,116,105,110,103,66,97,100,73,110,105,116,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122xn22xnlb90pdvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_122xn22xnlb90pdvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizerTest.testCircleFittingBadInit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlbl5t22y4(){try{__CLR4_4_122xn22xnlb90pdvd.R.inc(97132);
        /*
         * This test does not converge with this optimizer.
         */
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97133);super.testCircleFittingBadInit();
    }finally{__CLR4_4_122xn22xnlb90pdvd.R.flushNeeded();}}

    @Override
    @Test(expected = ConvergenceException.class)
    public void testHahn1()
        throws IOException {__CLR4_4_122xn22xnlb90pdvd.R.globalSliceStart(getClass().getName(),97134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynumnb22y6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,72,97,104,110,49,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122xn22xnlb90pdvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_122xn22xnlb90pdvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizerTest.testHahn1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynumnb22y6() throws IOException{try{__CLR4_4_122xn22xnlb90pdvd.R.inc(97134);
        /*
         * TODO This test leads to a singular problem with the Gauss-Newton
         * optimizer. This should be inquired.
         */
        __CLR4_4_122xn22xnlb90pdvd.R.inc(97135);super.testHahn1();
    }finally{__CLR4_4_122xn22xnlb90pdvd.R.flushNeeded();}}
}
