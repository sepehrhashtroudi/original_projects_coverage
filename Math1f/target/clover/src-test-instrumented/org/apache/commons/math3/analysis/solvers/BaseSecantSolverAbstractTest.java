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
package org.apache.commons.math3.analysis.solvers;

import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.XMinus5Function;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Base class for root-finding algorithms tests derived from
 * {@link BaseSecantSolver}.
 *
 * @version $Id$
 */
public abstract class BaseSecantSolverAbstractTest {static class __CLR4_4_11gkc1gkclb90pc41{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68247,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Returns the solver to use to perform the tests.
     * @return the solver to use to perform the tests
     */
    protected abstract UnivariateSolver getSolver();

    /** Returns the expected number of evaluations for the
     * {@link #testQuinticZero} unit test. A value of {@code -1} indicates that
     * the test should be skipped for that solver.
     * @return the expected number of evaluations for the
     * {@link #testQuinticZero} unit test
     */
    protected abstract int[] getQuinticEvalCounts();

    @Test
    public void testSinZero() {__CLR4_4_11gkc1gkclb90pc41.R.globalSliceStart(getClass().getName(),68124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15u3fw51gkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gkc1gkclb90pc41.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gkc1gkclb90pc41.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSinZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15u3fw51gkc(){try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68124);
        // The sinus function is behaved well around the root at pi. The second
        // order derivative is zero, which means linear approximating methods
        // still converge quadratically.
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68125);UnivariateFunction f = new Sin();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68126);double result;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68127);UnivariateSolver solver = getSolver();

        __CLR4_4_11gkc1gkclb90pc41.R.inc(68128);result = solver.solve(100, f, 3, 4);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68129);Assert.assertEquals(result, FastMath.PI, solver.getAbsoluteAccuracy());
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68130);Assert.assertTrue(solver.getEvaluations() <= 6);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68131);result = solver.solve(100, f, 1, 4);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68132);Assert.assertEquals(result, FastMath.PI, solver.getAbsoluteAccuracy());
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68133);Assert.assertTrue(solver.getEvaluations() <= 7);
    }finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}

    @Test
    public void testQuinticZero() {__CLR4_4_11gkc1gkclb90pc41.R.globalSliceStart(getClass().getName(),68134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z16axu1gkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gkc1gkclb90pc41.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gkc1gkclb90pc41.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testQuinticZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z16axu1gkm(){try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68134);
        // The quintic function has zeros at 0, +-0.5 and +-1.
        // Around the root of 0 the function is well behaved, with a second
        // derivative of zero a 0.
        // The other roots are less well to find, in particular the root at 1,
        // because the function grows fast for x>1.
        // The function has extrema (first derivative is zero) at 0.27195613
        // and 0.82221643, intervals containing these values are harder for
        // the solvers.
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68135);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68136);double result;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68137);UnivariateSolver solver = getSolver();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68138);double atol = solver.getAbsoluteAccuracy();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68139);int[] counts = getQuinticEvalCounts();

        // Tests data: initial bounds, and expected solution, per test case.
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68140);double[][] testsData = {{-0.2,  0.2,  0.0},
                                {-0.1,  0.3,  0.0},
                                {-0.3,  0.45, 0.0},
                                { 0.3,  0.7,  0.5},
                                { 0.2,  0.6,  0.5},
                                { 0.05, 0.95, 0.5},
                                { 0.85, 1.25, 1.0},
                                { 0.8,  1.2,  1.0},
                                { 0.85, 1.75, 1.0},
                                { 0.55, 1.45, 1.0},
                                { 0.85, 5.0,  1.0},
                               };
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68141);int maxIter = 500;

        __CLR4_4_11gkc1gkclb90pc41.R.inc(68142);for(int i = 0; (((i < testsData.length)&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68143)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68144)==0&false)); i++) {{
            // Skip test, if needed.
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68145);if ((((counts[i] == -1)&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68146)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68147)==0&false))) {__CLR4_4_11gkc1gkclb90pc41.R.inc(68148);continue;

            // Compute solution.
            }__CLR4_4_11gkc1gkclb90pc41.R.inc(68149);double[] testData = testsData[i];
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68150);result = solver.solve(maxIter, f, testData[0], testData[1]);
            //System.out.println(
            //    "Root: " + result + " Evaluations: " + solver.getEvaluations());

            // Check solution.
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68151);Assert.assertEquals(result, testData[2], atol);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68152);Assert.assertTrue(solver.getEvaluations() <= counts[i] + 1);
        }
    }}finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}

    @Test
    public void testRootEndpoints() {__CLR4_4_11gkc1gkclb90pc41.R.globalSliceStart(getClass().getName(),68153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8912n1gl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gkc1gkclb90pc41.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gkc1gkclb90pc41.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testRootEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8912n1gl5(){try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68153);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68154);UnivariateFunction f = new XMinus5Function();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68155);UnivariateSolver solver = getSolver();

        // End-point is root. This should be a special case in the solver, and
        // the initial end-point should be returned exactly.
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68156);double result = solver.solve(100, f, 5.0, 6.0);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68157);Assert.assertEquals(5.0, result, 0.0);

        __CLR4_4_11gkc1gkclb90pc41.R.inc(68158);result = solver.solve(100, f, 4.0, 5.0);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68159);Assert.assertEquals(5.0, result, 0.0);

        __CLR4_4_11gkc1gkclb90pc41.R.inc(68160);result = solver.solve(100, f, 5.0, 6.0, 5.5);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68161);Assert.assertEquals(5.0, result, 0.0);

        __CLR4_4_11gkc1gkclb90pc41.R.inc(68162);result = solver.solve(100, f, 4.0, 5.0, 4.5);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68163);Assert.assertEquals(5.0, result, 0.0);
    }finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}

    @Test
    public void testBadEndpoints() {__CLR4_4_11gkc1gkclb90pc41.R.globalSliceStart(getClass().getName(),68164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17uujqm1glg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gkc1gkclb90pc41.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gkc1gkclb90pc41.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testBadEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17uujqm1glg(){try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68164);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68165);UnivariateFunction f = new Sin();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68166);UnivariateSolver solver = getSolver();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68167);try {  // bad interval
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68168);solver.solve(100, f, 1, -1);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68169);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68170);try {  // no bracket
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68171);solver.solve(100, f, 1, 1.5);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68172);Assert.fail("Expecting NoBracketingException - non-bracketing");
        } catch (NoBracketingException ex) {
            // expected
        }
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68173);try {  // no bracket
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68174);solver.solve(100, f, 1, 1.5, 1.2);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68175);Assert.fail("Expecting NoBracketingException - non-bracketing");
        } catch (NoBracketingException ex) {
            // expected
        }
    }finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}

    @Test
    public void testSolutionLeftSide() {__CLR4_4_11gkc1gkclb90pc41.R.globalSliceStart(getClass().getName(),68176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgaj5c1gls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gkc1gkclb90pc41.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gkc1gkclb90pc41.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSolutionLeftSide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgaj5c1gls(){try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68176);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68177);UnivariateFunction f = new Sin();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68178);UnivariateSolver solver = getSolver();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68179);double left = -1.5;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68180);double right = 0.05;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68181);for(int i = 0; (((i < 10)&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68182)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68183)==0&false)); i++) {{
            // Test whether the allowed solutions are taken into account.
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68184);double solution = getSolution(solver, 100, f, left, right, AllowedSolution.LEFT_SIDE);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68185);if ((((!Double.isNaN(solution))&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68186)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68187)==0&false))) {{
                __CLR4_4_11gkc1gkclb90pc41.R.inc(68188);Assert.assertTrue(solution <= 0.0);
            }

            // Prepare for next test.
            }__CLR4_4_11gkc1gkclb90pc41.R.inc(68189);left -= 0.1;
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68190);right += 0.3;
        }
    }}finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}

    @Test
    public void testSolutionRightSide() {__CLR4_4_11gkc1gkclb90pc41.R.globalSliceStart(getClass().getName(),68191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3u351gm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gkc1gkclb90pc41.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gkc1gkclb90pc41.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSolutionRightSide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3u351gm7(){try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68191);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68192);UnivariateFunction f = new Sin();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68193);UnivariateSolver solver = getSolver();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68194);double left = -1.5;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68195);double right = 0.05;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68196);for(int i = 0; (((i < 10)&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68197)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68198)==0&false)); i++) {{
            // Test whether the allowed solutions are taken into account.
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68199);double solution = getSolution(solver, 100, f, left, right, AllowedSolution.RIGHT_SIDE);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68200);if ((((!Double.isNaN(solution))&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68201)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68202)==0&false))) {{
                __CLR4_4_11gkc1gkclb90pc41.R.inc(68203);Assert.assertTrue(solution >= 0.0);
            }

            // Prepare for next test.
            }__CLR4_4_11gkc1gkclb90pc41.R.inc(68204);left -= 0.1;
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68205);right += 0.3;
        }
    }}finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}
    @Test
    public void testSolutionBelowSide() {__CLR4_4_11gkc1gkclb90pc41.R.globalSliceStart(getClass().getName(),68206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsywik1gmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gkc1gkclb90pc41.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gkc1gkclb90pc41.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSolutionBelowSide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsywik1gmm(){try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68206);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68207);UnivariateFunction f = new Sin();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68208);UnivariateSolver solver = getSolver();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68209);double left = -1.5;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68210);double right = 0.05;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68211);for(int i = 0; (((i < 10)&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68212)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68213)==0&false)); i++) {{
            // Test whether the allowed solutions are taken into account.
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68214);double solution = getSolution(solver, 100, f, left, right, AllowedSolution.BELOW_SIDE);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68215);if ((((!Double.isNaN(solution))&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68216)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68217)==0&false))) {{
                __CLR4_4_11gkc1gkclb90pc41.R.inc(68218);Assert.assertTrue(f.value(solution) <= 0.0);
            }

            // Prepare for next test.
            }__CLR4_4_11gkc1gkclb90pc41.R.inc(68219);left -= 0.1;
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68220);right += 0.3;
        }
    }}finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}

    @Test
    public void testSolutionAboveSide() {__CLR4_4_11gkc1gkclb90pc41.R.globalSliceStart(getClass().getName(),68221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa2ac01gn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gkc1gkclb90pc41.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gkc1gkclb90pc41.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSolutionAboveSide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa2ac01gn1(){try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68221);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68222);UnivariateFunction f = new Sin();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68223);UnivariateSolver solver = getSolver();
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68224);double left = -1.5;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68225);double right = 0.05;
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68226);for(int i = 0; (((i < 10)&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68227)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68228)==0&false)); i++) {{
            // Test whether the allowed solutions are taken into account.
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68229);double solution = getSolution(solver, 100, f, left, right, AllowedSolution.ABOVE_SIDE);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68230);if ((((!Double.isNaN(solution))&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68231)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68232)==0&false))) {{
                __CLR4_4_11gkc1gkclb90pc41.R.inc(68233);Assert.assertTrue(f.value(solution) >= 0.0);
            }

            // Prepare for next test.
            }__CLR4_4_11gkc1gkclb90pc41.R.inc(68234);left -= 0.1;
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68235);right += 0.3;
        }
    }}finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}

    private double getSolution(UnivariateSolver solver, int maxEval, UnivariateFunction f,
                               double left, double right, AllowedSolution allowedSolution) {try{__CLR4_4_11gkc1gkclb90pc41.R.inc(68236);
        __CLR4_4_11gkc1gkclb90pc41.R.inc(68237);try {
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68238);@SuppressWarnings("unchecked")
            BracketedUnivariateSolver<UnivariateFunction> bracketing =
            (BracketedUnivariateSolver<UnivariateFunction>) solver;
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68239);return bracketing.solve(100, f, left, right, allowedSolution);
        } catch (ClassCastException cce) {
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68240);double baseRoot = solver.solve(maxEval, f, left, right);
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68241);if (((((baseRoot <= left) || (baseRoot >= right))&&(__CLR4_4_11gkc1gkclb90pc41.R.iget(68242)!=0|true))||(__CLR4_4_11gkc1gkclb90pc41.R.iget(68243)==0&false))) {{
                // the solution slipped out of interval
                __CLR4_4_11gkc1gkclb90pc41.R.inc(68244);return Double.NaN;
            }
            }__CLR4_4_11gkc1gkclb90pc41.R.inc(68245);PegasusSolver bracketing =
                    new PegasusSolver(solver.getRelativeAccuracy(), solver.getAbsoluteAccuracy(),
                                      solver.getFunctionValueAccuracy());
            __CLR4_4_11gkc1gkclb90pc41.R.inc(68246);return UnivariateSolverUtils.forceSide(maxEval - solver.getEvaluations(),
                                                       f, bracketing, baseRoot, left, right,
                                                       allowedSolution);
        }
    }finally{__CLR4_4_11gkc1gkclb90pc41.R.flushNeeded();}}

}
