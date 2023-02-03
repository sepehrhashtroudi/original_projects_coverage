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

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.PointVectorValuePair;
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
 * @version $Id$
 */
public abstract class AbstractLeastSquaresOptimizerAbstractTest {static class __CLR4_4_125ef25eflb90pe1n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,100532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public abstract AbstractLeastSquaresOptimizer createOptimizer();

    @Test
    public void testTrivial() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ri9u25ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testTrivial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ri9u25ef(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100311);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100312);LinearProblem problem =
            new LinearProblem(new double[][] { { 2 } }, new double[] { 3 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100313);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100314);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1 }, new double[] { 0 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100315);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100316);Assert.assertEquals(1.5, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100317);Assert.assertEquals(3.0, optimum.getValue()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100318);try {
            __CLR4_4_125ef25eflb90pe1n.R.inc(100319);optimizer.guessParametersErrors();
            __CLR4_4_125ef25eflb90pe1n.R.inc(100320);Assert.fail("an exception should have been thrown");
        } catch (NumberIsTooSmallException ee) {
            // expected behavior
        }
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testQRColumnsPermutation() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1codiwz25ep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testQRColumnsPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1codiwz25ep(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100321);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100322);LinearProblem problem =
            new LinearProblem(new double[][] { { 1.0, -1.0 }, { 0.0, 2.0 }, { 1.0, -2.0 } },
                              new double[] { 4.0, 6.0, 1.0 });

        __CLR4_4_125ef25eflb90pe1n.R.inc(100323);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100324);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1 }, new double[] { 0, 0 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100325);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100326);Assert.assertEquals(7.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100327);Assert.assertEquals(3.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100328);Assert.assertEquals(4.0, optimum.getValue()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100329);Assert.assertEquals(6.0, optimum.getValue()[1], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100330);Assert.assertEquals(1.0, optimum.getValue()[2], 1.0e-10);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testNoDependency() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vquu3f25ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testNoDependency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vquu3f25ez(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100331);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100332);LinearProblem problem = new LinearProblem(new double[][] {
                { 2, 0, 0, 0, 0, 0 },
                { 0, 2, 0, 0, 0, 0 },
                { 0, 0, 2, 0, 0, 0 },
                { 0, 0, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 0, 2 }
        }, new double[] { 0.0, 1.1, 2.2, 3.3, 4.4, 5.5 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100333);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100334);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1, 1, 1, 1 },
                               new double[] { 0, 0, 0, 0, 0, 0 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100335);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100336);for (int i = 0; (((i < problem.target.length)&&(__CLR4_4_125ef25eflb90pe1n.R.iget(100337)!=0|true))||(__CLR4_4_125ef25eflb90pe1n.R.iget(100338)==0&false)); ++i) {{
            __CLR4_4_125ef25eflb90pe1n.R.inc(100339);Assert.assertEquals(0.55 * i, optimum.getPoint()[i], 1.0e-10);
        }
    }}finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testOneSet() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6wyqd25f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testOneSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6wyqd25f8(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100340);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100341);LinearProblem problem = new LinearProblem(new double[][] {
                {  1,  0, 0 },
                { -1,  1, 0 },
                {  0, -1, 1 }
        }, new double[] { 1, 1, 1});
        __CLR4_4_125ef25eflb90pe1n.R.inc(100342);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100343);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1 }, new double[] { 0, 0, 0 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100344);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100345);Assert.assertEquals(1.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100346);Assert.assertEquals(2.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100347);Assert.assertEquals(3.0, optimum.getPoint()[2], 1.0e-10);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testTwoSets() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tdq3225fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testTwoSets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tdq3225fg(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100348);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100349);double epsilon = 1.0e-7;
        __CLR4_4_125ef25eflb90pe1n.R.inc(100350);LinearProblem problem = new LinearProblem(new double[][] {
                {  2,  1,   0,  4,       0, 0 },
                { -4, -2,   3, -7,       0, 0 },
                {  4,  1,  -2,  8,       0, 0 },
                {  0, -3, -12, -1,       0, 0 },
                {  0,  0,   0,  0, epsilon, 1 },
                {  0,  0,   0,  0,       1, 1 }
        }, new double[] { 2, -9, 2, 2, 1 + epsilon * epsilon, 2});

        __CLR4_4_125ef25eflb90pe1n.R.inc(100351);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100352);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1, 1, 1, 1 },
                               new double[] { 0, 0, 0, 0, 0, 0 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100353);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100354);Assert.assertEquals( 3.0, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100355);Assert.assertEquals( 4.0, optimum.getPoint()[1], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100356);Assert.assertEquals(-1.0, optimum.getPoint()[2], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100357);Assert.assertEquals(-2.0, optimum.getPoint()[3], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100358);Assert.assertEquals( 1.0 + epsilon, optimum.getPoint()[4], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100359);Assert.assertEquals( 1.0 - epsilon, optimum.getPoint()[5], 1.0e-10);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test(expected=ConvergenceException.class)
    public void testNonInvertible() throws Exception {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm6ye25fs();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,73,110,118,101,114,116,105,98,108,101,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm6ye25fs() throws Exception{try{__CLR4_4_125ef25eflb90pe1n.R.inc(100360);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100361);LinearProblem problem = new LinearProblem(new double[][] {
                {  1, 2, -3 },
                {  2, 1,  3 },
                { -3, 0, -9 }
        }, new double[] { 1, 1, 1 });

        __CLR4_4_125ef25eflb90pe1n.R.inc(100362);AbstractLeastSquaresOptimizer optimizer = createOptimizer();

        __CLR4_4_125ef25eflb90pe1n.R.inc(100363);optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1 }, new double[] { 0, 0, 0 });
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testIllConditioned() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3imy225fw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testIllConditioned",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3imy225fw(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100364);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100365);LinearProblem problem1 = new LinearProblem(new double[][] {
                { 10.0, 7.0,  8.0,  7.0 },
                {  7.0, 5.0,  6.0,  5.0 },
                {  8.0, 6.0, 10.0,  9.0 },
                {  7.0, 5.0,  9.0, 10.0 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100366);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100367);PointVectorValuePair optimum1 =
            optimizer.optimize(100, problem1, problem1.target, new double[] { 1, 1, 1, 1 },
                               new double[] { 0, 1, 2, 3 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100368);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100369);Assert.assertEquals(1.0, optimum1.getPoint()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100370);Assert.assertEquals(1.0, optimum1.getPoint()[1], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100371);Assert.assertEquals(1.0, optimum1.getPoint()[2], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100372);Assert.assertEquals(1.0, optimum1.getPoint()[3], 1.0e-10);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100373);LinearProblem problem2 = new LinearProblem(new double[][] {
                { 10.00, 7.00, 8.10, 7.20 },
                {  7.08, 5.04, 6.00, 5.00 },
                {  8.00, 5.98, 9.89, 9.00 },
                {  6.99, 4.99, 9.00, 9.98 }
        }, new double[] { 32, 23, 33, 31 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100374);PointVectorValuePair optimum2 =
            optimizer.optimize(100, problem2, problem2.target, new double[] { 1, 1, 1, 1 },
                               new double[] { 0, 1, 2, 3 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100375);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100376);Assert.assertEquals(-81.0, optimum2.getPoint()[0], 1.0e-8);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100377);Assert.assertEquals(137.0, optimum2.getPoint()[1], 1.0e-8);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100378);Assert.assertEquals(-34.0, optimum2.getPoint()[2], 1.0e-8);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100379);Assert.assertEquals( 22.0, optimum2.getPoint()[3], 1.0e-8);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersSimple() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ow9s825gc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testMoreEstimatedParametersSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ow9s825gc(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100380);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100381);LinearProblem problem = new LinearProblem(new double[][] {
                { 3.0, 2.0,  0.0, 0.0 },
                { 0.0, 1.0, -1.0, 1.0 },
                { 2.0, 0.0,  1.0, 0.0 }
        }, new double[] { 7.0, 3.0, 5.0 });

        __CLR4_4_125ef25eflb90pe1n.R.inc(100382);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100383);optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1 },
                new double[] { 7, 6, 5, 4 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100384);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testMoreEstimatedParametersUnsorted() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sopi425gh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testMoreEstimatedParametersUnsorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sopi425gh(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100385);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100386);LinearProblem problem = new LinearProblem(new double[][] {
                { 1.0, 1.0,  0.0,  0.0, 0.0,  0.0 },
                { 0.0, 0.0,  1.0,  1.0, 1.0,  0.0 },
                { 0.0, 0.0,  0.0,  0.0, 1.0, -1.0 },
                { 0.0, 0.0, -1.0,  1.0, 0.0,  1.0 },
                { 0.0, 0.0,  0.0, -1.0, 1.0,  0.0 }
       }, new double[] { 3.0, 12.0, -1.0, 7.0, 1.0 });

        __CLR4_4_125ef25eflb90pe1n.R.inc(100387);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100388);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1, 1, 1 },
                               new double[] { 2, 2, 2, 2, 2, 2 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100389);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100390);Assert.assertEquals(3.0, optimum.getPointRef()[2], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100391);Assert.assertEquals(4.0, optimum.getPointRef()[3], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100392);Assert.assertEquals(5.0, optimum.getPointRef()[4], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100393);Assert.assertEquals(6.0, optimum.getPointRef()[5], 1.0e-10);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testRedundantEquations() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lkgd25gq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testRedundantEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lkgd25gq(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100394);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100395);LinearProblem problem = new LinearProblem(new double[][] {
                { 1.0,  1.0 },
                { 1.0, -1.0 },
                { 1.0,  3.0 }
        }, new double[] { 3.0, 1.0, 5.0 });

        __CLR4_4_125ef25eflb90pe1n.R.inc(100396);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100397);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1 },
                               new double[] { 1, 1 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100398);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100399);Assert.assertEquals(2.0, optimum.getPointRef()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100400);Assert.assertEquals(1.0, optimum.getPointRef()[1], 1.0e-10);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testInconsistentEquations() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5k8or25gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentEquations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5k8or25gx(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100401);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100402);LinearProblem problem = new LinearProblem(new double[][] {
                { 1.0,  1.0 },
                { 1.0, -1.0 },
                { 1.0,  3.0 }
        }, new double[] { 3.0, 1.0, 4.0 });

        __CLR4_4_125ef25eflb90pe1n.R.inc(100403);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100404);optimizer.optimize(100, problem, problem.target, new double[] { 1, 1, 1 }, new double[] { 1, 1 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100405);Assert.assertTrue(optimizer.getRMS() > 0.1);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testInconsistentSizes1() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kd0lt25h2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,110,115,105,115,116,101,110,116,83,105,122,101,115,49,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentSizes1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kd0lt25h2(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100406);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100407);LinearProblem problem =
            new LinearProblem(new double[][] { { 1, 0 }, { 0, 1 } }, new double[] { -1, 1 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100408);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100409);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1, 1 }, new double[] { 0, 0 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100410);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100411);Assert.assertEquals(-1, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100412);Assert.assertEquals(+1, optimum.getPoint()[1], 1.0e-10);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100413);optimizer.optimize(100, problem, problem.target,
                           new double[] { 1 },
                           new double[] { 0, 0 });
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testInconsistentSizes2() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11omy6o25ha();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,110,115,105,115,116,101,110,116,83,105,122,101,115,50,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testInconsistentSizes2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11omy6o25ha(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100414);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100415);LinearProblem problem =
            new LinearProblem(new double[][] { { 1, 0 }, { 0, 1 } }, new double[] { -1, 1 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100416);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100417);PointVectorValuePair optimum =
            optimizer.optimize(100, problem, problem.target, new double[] { 1, 1 }, new double[] { 0, 0 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100418);Assert.assertEquals(0, optimizer.getRMS(), 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100419);Assert.assertEquals(-1, optimum.getPoint()[0], 1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100420);Assert.assertEquals(+1, optimum.getPoint()[1], 1.0e-10);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100421);optimizer.optimize(100, problem, new double[] { 1 },
                           new double[] { 1 },
                           new double[] { 0, 0 });
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testCircleFitting() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcouro25hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testCircleFitting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcouro25hi(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100422);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100423);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100424);circle.addPoint( 30.0,  68.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100425);circle.addPoint( 50.0,  -6.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100426);circle.addPoint(110.0, -20.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100427);circle.addPoint( 35.0,  15.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100428);circle.addPoint( 45.0,  97.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100429);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100430);PointVectorValuePair optimum
            = optimizer.optimize(100, circle, new double[] { 0, 0, 0, 0, 0 }, new double[] { 1, 1, 1, 1, 1 },
                                 new double[] { 98.680, 47.345 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100431);Assert.assertTrue(optimizer.getEvaluations() < 10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100432);Assert.assertTrue(optimizer.getJacobianEvaluations() < 10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100433);double rms = optimizer.getRMS();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100434);Assert.assertEquals(1.768262623567235,  FastMath.sqrt(circle.getN()) * rms,  1.0e-10);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100435);Vector2D center = new Vector2D(optimum.getPointRef()[0], optimum.getPointRef()[1]);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100436);Assert.assertEquals(69.96016176931406, circle.getRadius(center), 1.0e-6);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100437);Assert.assertEquals(96.07590211815305, center.getX(),            1.0e-6);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100438);Assert.assertEquals(48.13516790438953, center.getY(),            1.0e-6);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100439);double[][] cov = optimizer.computeCovariances(optimum.getPoint(), 1e-14);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100440);Assert.assertEquals(1.839, cov[0][0], 0.001);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100441);Assert.assertEquals(0.731, cov[0][1], 0.001);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100442);Assert.assertEquals(cov[0][1], cov[1][0], 1.0e-14);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100443);Assert.assertEquals(0.786, cov[1][1], 0.001);

        // add perfect measurements and check errors are reduced
        __CLR4_4_125ef25eflb90pe1n.R.inc(100444);double  r = circle.getRadius(center);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100445);for (double d= 0; (((d < 2 * FastMath.PI)&&(__CLR4_4_125ef25eflb90pe1n.R.iget(100446)!=0|true))||(__CLR4_4_125ef25eflb90pe1n.R.iget(100447)==0&false)); d += 0.01) {{
            __CLR4_4_125ef25eflb90pe1n.R.inc(100448);circle.addPoint(center.getX() + r * FastMath.cos(d), center.getY() + r * FastMath.sin(d));
        }
        }__CLR4_4_125ef25eflb90pe1n.R.inc(100449);double[] target = new double[circle.getN()];
        __CLR4_4_125ef25eflb90pe1n.R.inc(100450);Arrays.fill(target, 0.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100451);double[] weights = new double[circle.getN()];
        __CLR4_4_125ef25eflb90pe1n.R.inc(100452);Arrays.fill(weights, 2.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100453);optimum = optimizer.optimize(100, circle, target, weights, new double[] { 98.680, 47.345 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100454);cov = optimizer.computeCovariances(optimum.getPoint(), 1e-14);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100455);Assert.assertEquals(0.0016, cov[0][0], 0.001);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100456);Assert.assertEquals(3.2e-7, cov[0][1], 1.0e-9);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100457);Assert.assertEquals(cov[0][1], cov[1][0], 1.0e-14);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100458);Assert.assertEquals(0.0016, cov[1][1], 0.001);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testCircleFittingBadInit() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlbl5t25ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testCircleFittingBadInit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlbl5t25ij(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100459);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100460);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100461);double[][] points = circlePoints;
        __CLR4_4_125ef25eflb90pe1n.R.inc(100462);double[] target = new double[points.length];
        __CLR4_4_125ef25eflb90pe1n.R.inc(100463);Arrays.fill(target, 0.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100464);double[] weights = new double[points.length];
        __CLR4_4_125ef25eflb90pe1n.R.inc(100465);Arrays.fill(weights, 2.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100466);for (int i = 0; (((i < points.length)&&(__CLR4_4_125ef25eflb90pe1n.R.iget(100467)!=0|true))||(__CLR4_4_125ef25eflb90pe1n.R.iget(100468)==0&false)); ++i) {{
            __CLR4_4_125ef25eflb90pe1n.R.inc(100469);circle.addPoint(points[i][0], points[i][1]);
        }
        }__CLR4_4_125ef25eflb90pe1n.R.inc(100470);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100471);PointVectorValuePair optimum
            = optimizer.optimize(100, circle, target, weights, new double[] { -12, -12 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100472);Vector2D center = new Vector2D(optimum.getPointRef()[0], optimum.getPointRef()[1]);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100473);Assert.assertTrue(optimizer.getEvaluations() < 25);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100474);Assert.assertTrue(optimizer.getJacobianEvaluations() < 20);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100475);Assert.assertEquals( 0.043, optimizer.getRMS(), 1.0e-3);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100476);Assert.assertEquals( 0.292235,  circle.getRadius(center), 1.0e-6);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100477);Assert.assertEquals(-0.151738,  center.getX(),            1.0e-6);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100478);Assert.assertEquals( 0.2075001, center.getY(),            1.0e-6);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testCircleFittingGoodInit() {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2xc9b25j3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testCircleFittingGoodInit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2xc9b25j3(){try{__CLR4_4_125ef25eflb90pe1n.R.inc(100479);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100480);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100481);double[][] points = circlePoints;
        __CLR4_4_125ef25eflb90pe1n.R.inc(100482);double[] target = new double[points.length];
        __CLR4_4_125ef25eflb90pe1n.R.inc(100483);Arrays.fill(target, 0.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100484);double[] weights = new double[points.length];
        __CLR4_4_125ef25eflb90pe1n.R.inc(100485);Arrays.fill(weights, 2.0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100486);for (int i = 0; (((i < points.length)&&(__CLR4_4_125ef25eflb90pe1n.R.iget(100487)!=0|true))||(__CLR4_4_125ef25eflb90pe1n.R.iget(100488)==0&false)); ++i) {{
            __CLR4_4_125ef25eflb90pe1n.R.inc(100489);circle.addPoint(points[i][0], points[i][1]);
        }
        }__CLR4_4_125ef25eflb90pe1n.R.inc(100490);AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100491);PointVectorValuePair optimum =
            optimizer.optimize(100, circle, target, weights, new double[] { 0, 0 });
        __CLR4_4_125ef25eflb90pe1n.R.inc(100492);Assert.assertEquals(-0.1517383071957963, optimum.getPointRef()[0], 1.0e-6);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100493);Assert.assertEquals(0.2074999736353867,  optimum.getPointRef()[1], 1.0e-6);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100494);Assert.assertEquals(0.04268731682389561, optimizer.getRMS(),       1.0e-8);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

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
        final double errParams, final double errParamsSd) {try{__CLR4_4_125ef25eflb90pe1n.R.inc(100495);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100496);final AbstractLeastSquaresOptimizer optimizer = createOptimizer();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100497);final double[] w = new double[dataset.getNumObservations()];
        __CLR4_4_125ef25eflb90pe1n.R.inc(100498);Arrays.fill(w, 1.0);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100499);final double[][] data = dataset.getData();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100500);final double[] initial = dataset.getStartingPoint(0);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100501);final MultivariateDifferentiableVectorFunction problem;
        __CLR4_4_125ef25eflb90pe1n.R.inc(100502);problem = dataset.getLeastSquaresProblem();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100503);final PointVectorValuePair optimum;
        __CLR4_4_125ef25eflb90pe1n.R.inc(100504);optimum = optimizer.optimize(100, problem, data[1], w, initial);

        __CLR4_4_125ef25eflb90pe1n.R.inc(100505);final double[] actual = optimum.getPoint();
        __CLR4_4_125ef25eflb90pe1n.R.inc(100506);for (int i = 0; (((i < actual.length)&&(__CLR4_4_125ef25eflb90pe1n.R.iget(100507)!=0|true))||(__CLR4_4_125ef25eflb90pe1n.R.iget(100508)==0&false)); i++) {{
            __CLR4_4_125ef25eflb90pe1n.R.inc(100509);double expected = dataset.getParameter(i);
            __CLR4_4_125ef25eflb90pe1n.R.inc(100510);double delta = FastMath.abs(errParams * expected);
            __CLR4_4_125ef25eflb90pe1n.R.inc(100511);Assert.assertEquals(dataset.getName() + ", param #" + i,
                                expected, actual[i], delta);
        }
    }}finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testKirby2() throws IOException {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6a7nk25k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testKirby2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6a7nk25k0() throws IOException{try{__CLR4_4_125ef25eflb90pe1n.R.inc(100512);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100513);doTestStRD(StatisticalReferenceDatasetFactory.createKirby2(), 1E-7, 1E-7);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    @Test
    public void testHahn1() throws IOException {__CLR4_4_125ef25eflb90pe1n.R.globalSliceStart(getClass().getName(),100514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynumnb25k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125ef25eflb90pe1n.R.rethrow($CLV_t2$);}finally{__CLR4_4_125ef25eflb90pe1n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerAbstractTest.testHahn1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynumnb25k2() throws IOException{try{__CLR4_4_125ef25eflb90pe1n.R.inc(100514);
        __CLR4_4_125ef25eflb90pe1n.R.inc(100515);doTestStRD(StatisticalReferenceDatasetFactory.createHahn1(), 1E-7, 1E-4);
    }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    static class LinearProblem implements MultivariateDifferentiableVectorFunction, Serializable {

        private static final long serialVersionUID = 703247177355019415L;
        final RealMatrix factors;
        final double[] target;
        public LinearProblem(double[][] factors, double[] target) {try{__CLR4_4_125ef25eflb90pe1n.R.inc(100516);
            __CLR4_4_125ef25eflb90pe1n.R.inc(100517);this.factors = new BlockRealMatrix(factors);
            __CLR4_4_125ef25eflb90pe1n.R.inc(100518);this.target  = target;
        }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

        public double[] value(double[] variables) {try{__CLR4_4_125ef25eflb90pe1n.R.inc(100519);
            __CLR4_4_125ef25eflb90pe1n.R.inc(100520);return factors.operate(variables);
        }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

        public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125ef25eflb90pe1n.R.inc(100521);
            __CLR4_4_125ef25eflb90pe1n.R.inc(100522);DerivativeStructure[] value = new DerivativeStructure[factors.getRowDimension()];
            __CLR4_4_125ef25eflb90pe1n.R.inc(100523);for (int i = 0; (((i < value.length)&&(__CLR4_4_125ef25eflb90pe1n.R.iget(100524)!=0|true))||(__CLR4_4_125ef25eflb90pe1n.R.iget(100525)==0&false)); ++i) {{
                __CLR4_4_125ef25eflb90pe1n.R.inc(100526);value[i] = variables[0].getField().getZero();
                __CLR4_4_125ef25eflb90pe1n.R.inc(100527);for (int j = 0; (((j < factors.getColumnDimension())&&(__CLR4_4_125ef25eflb90pe1n.R.iget(100528)!=0|true))||(__CLR4_4_125ef25eflb90pe1n.R.iget(100529)==0&false)); ++j) {{
                    __CLR4_4_125ef25eflb90pe1n.R.inc(100530);value[i] = value[i].add(variables[j].multiply(factors.getEntry(i, j)));
                }
                
            }}
            }__CLR4_4_125ef25eflb90pe1n.R.inc(100531);return value;
        }finally{__CLR4_4_125ef25eflb90pe1n.R.flushNeeded();}}

    }
}
