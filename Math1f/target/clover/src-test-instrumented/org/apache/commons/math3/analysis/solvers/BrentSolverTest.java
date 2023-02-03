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

import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.MonitoredFunction;
import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.analysis.function.Constant;
import org.apache.commons.math3.analysis.function.Inverse;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.Sqrt;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for {@link BrentSolver Brent} solver.
 * Because Brent-Dekker is guaranteed to converge in less than the default
 * maximum iteration count due to bisection fallback, it is quite hard to
 * debug. I include measured iteration counts plus one in order to detect
 * regressions. On average Brent-Dekker should use 4..5 iterations for the
 * default absolute accuracy of 10E-8 for sinus and the quintic function around
 * zero, and 5..10 iterations for the other zeros.
 *
 * @version $Id$
 */
public final class BrentSolverTest {static class __CLR4_4_11gr51gr5lb90pc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68473,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testSinZero() {__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceStart(getClass().getName(),68369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15u3fw51gr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gr51gr5lb90pc4l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BrentSolverTest.testSinZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15u3fw51gr5(){try{__CLR4_4_11gr51gr5lb90pc4l.R.inc(68369);
        // The sinus function is behaved well around the root at pi. The second
        // order derivative is zero, which means linar approximating methods will
        // still converge quadratically.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68370);UnivariateFunction f = new Sin();
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68371);double result;
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68372);UnivariateSolver solver = new BrentSolver();
        // Somewhat benign interval. The function is monotone.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68373);result = solver.solve(100, f, 3, 4);
        // System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68374);Assert.assertEquals(result, FastMath.PI, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68375);Assert.assertTrue(solver.getEvaluations() <= 7);
        // Larger and somewhat less benign interval. The function is grows first.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68376);result = solver.solve(100, f, 1, 4);
        // System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68377);Assert.assertEquals(result, FastMath.PI, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68378);Assert.assertTrue(solver.getEvaluations() <= 8);
    }finally{__CLR4_4_11gr51gr5lb90pc4l.R.flushNeeded();}}

    @Test
    public void testQuinticZero() {__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceStart(getClass().getName(),68379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z16axu1grf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gr51gr5lb90pc4l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BrentSolverTest.testQuinticZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z16axu1grf(){try{__CLR4_4_11gr51gr5lb90pc4l.R.inc(68379);
        // The quintic function has zeros at 0, +-0.5 and +-1.
        // Around the root of 0 the function is well behaved, with a second derivative
        // of zero a 0.
        // The other roots are less well to find, in particular the root at 1, because
        // the function grows fast for x>1.
        // The function has extrema (first derivative is zero) at 0.27195613 and 0.82221643,
        // intervals containing these values are harder for the solvers.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68380);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68381);double result;
        // Brent-Dekker solver.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68382);UnivariateSolver solver = new BrentSolver();
        // Symmetric bracket around 0. Test whether solvers can handle hitting
        // the root in the first iteration.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68383);result = solver.solve(100, f, -0.2, 0.2);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68384);Assert.assertEquals(result, 0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68385);Assert.assertTrue(solver.getEvaluations() <= 3);
        // 1 iterations on i586 JDK 1.4.1.
        // Asymmetric bracket around 0, just for fun. Contains extremum.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68386);result = solver.solve(100, f, -0.1, 0.3);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68387);Assert.assertEquals(result, 0, solver.getAbsoluteAccuracy());
        // 5 iterations on i586 JDK 1.4.1.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68388);Assert.assertTrue(solver.getEvaluations() <= 7);
        // Large bracket around 0. Contains two extrema.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68389);result = solver.solve(100, f, -0.3, 0.45);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68390);Assert.assertEquals(result, 0, solver.getAbsoluteAccuracy());
        // 6 iterations on i586 JDK 1.4.1.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68391);Assert.assertTrue(solver.getEvaluations() <= 8);
        // Benign bracket around 0.5, function is monotonous.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68392);result = solver.solve(100, f, 0.3, 0.7);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68393);Assert.assertEquals(result, 0.5, solver.getAbsoluteAccuracy());
        // 6 iterations on i586 JDK 1.4.1.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68394);Assert.assertTrue(solver.getEvaluations() <= 9);
        // Less benign bracket around 0.5, contains one extremum.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68395);result = solver.solve(100, f, 0.2, 0.6);
        // System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68396);Assert.assertEquals(result, 0.5, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68397);Assert.assertTrue(solver.getEvaluations() <= 10);
        // Large, less benign bracket around 0.5, contains both extrema.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68398);result = solver.solve(100, f, 0.05, 0.95);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68399);Assert.assertEquals(result, 0.5, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68400);Assert.assertTrue(solver.getEvaluations() <= 11);
        // Relatively benign bracket around 1, function is monotonous. Fast growth for x>1
        // is still a problem.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68401);result = solver.solve(100, f, 0.85, 1.25);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68402);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68403);Assert.assertTrue(solver.getEvaluations() <= 11);
        // Less benign bracket around 1 with extremum.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68404);result = solver.solve(100, f, 0.8, 1.2);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68405);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68406);Assert.assertTrue(solver.getEvaluations() <= 11);
        // Large bracket around 1. Monotonous.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68407);result = solver.solve(100, f, 0.85, 1.75);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68408);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68409);Assert.assertTrue(solver.getEvaluations() <= 13);
        // Large bracket around 1. Interval contains extremum.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68410);result = solver.solve(100, f, 0.55, 1.45);
        //System.out.println(
        //    "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68411);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68412);Assert.assertTrue(solver.getEvaluations() <= 10);
        // Very large bracket around 1 for testing fast growth behaviour.
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68413);result = solver.solve(100, f, 0.85, 5);
        //System.out.println(
       //     "Root: " + result + " Evaluations: " + solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68414);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68415);Assert.assertTrue(solver.getEvaluations() <= 15);

        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68416);try {
            __CLR4_4_11gr51gr5lb90pc4l.R.inc(68417);result = solver.solve(5, f, 0.85, 5);
            __CLR4_4_11gr51gr5lb90pc4l.R.inc(68418);Assert.fail("Expected TooManyEvaluationsException");
        } catch (TooManyEvaluationsException e) {
            // Expected.
        }
    }finally{__CLR4_4_11gr51gr5lb90pc4l.R.flushNeeded();}}

    @Test
    public void testRootEndpoints() {__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceStart(getClass().getName(),68419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8912n1gsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gr51gr5lb90pc4l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BrentSolverTest.testRootEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8912n1gsj(){try{__CLR4_4_11gr51gr5lb90pc4l.R.inc(68419);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68420);UnivariateFunction f = new Sin();
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68421);BrentSolver solver = new BrentSolver();

        // endpoint is root
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68422);double result = solver.solve(100, f, FastMath.PI, 4);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68423);Assert.assertEquals(FastMath.PI, result, solver.getAbsoluteAccuracy());

        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68424);result = solver.solve(100, f, 3, FastMath.PI);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68425);Assert.assertEquals(FastMath.PI, result, solver.getAbsoluteAccuracy());

        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68426);result = solver.solve(100, f, FastMath.PI, 4, 3.5);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68427);Assert.assertEquals(FastMath.PI, result, solver.getAbsoluteAccuracy());

        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68428);result = solver.solve(100, f, 3, FastMath.PI, 3.07);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68429);Assert.assertEquals(FastMath.PI, result, solver.getAbsoluteAccuracy());
    }finally{__CLR4_4_11gr51gr5lb90pc4l.R.flushNeeded();}}

    @Test
    public void testBadEndpoints() {__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceStart(getClass().getName(),68430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17uujqm1gsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gr51gr5lb90pc4l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BrentSolverTest.testBadEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17uujqm1gsu(){try{__CLR4_4_11gr51gr5lb90pc4l.R.inc(68430);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68431);UnivariateFunction f = new Sin();
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68432);BrentSolver solver = new BrentSolver();
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68433);try {  // bad interval
            __CLR4_4_11gr51gr5lb90pc4l.R.inc(68434);solver.solve(100, f, 1, -1);
            __CLR4_4_11gr51gr5lb90pc4l.R.inc(68435);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68436);try {  // no bracket
            __CLR4_4_11gr51gr5lb90pc4l.R.inc(68437);solver.solve(100, f, 1, 1.5);
            __CLR4_4_11gr51gr5lb90pc4l.R.inc(68438);Assert.fail("Expecting NoBracketingException - non-bracketing");
        } catch (NoBracketingException ex) {
            // expected
        }
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68439);try {  // no bracket
            __CLR4_4_11gr51gr5lb90pc4l.R.inc(68440);solver.solve(100, f, 1, 1.5, 1.2);
            __CLR4_4_11gr51gr5lb90pc4l.R.inc(68441);Assert.fail("Expecting NoBracketingException - non-bracketing");
        } catch (NoBracketingException ex) {
            // expected
        }
    }finally{__CLR4_4_11gr51gr5lb90pc4l.R.flushNeeded();}}

    @Test
    public void testInitialGuess() {__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceStart(getClass().getName(),68442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1io0sb01gt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gr51gr5lb90pc4l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BrentSolverTest.testInitialGuess",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1io0sb01gt6(){try{__CLR4_4_11gr51gr5lb90pc4l.R.inc(68442);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68443);MonitoredFunction f = new MonitoredFunction(new QuinticFunction());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68444);BrentSolver solver = new BrentSolver();
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68445);double result;

        // no guess
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68446);result = solver.solve(100, f, 0.6, 7.0);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68447);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68448);int referenceCallsCount = f.getCallsCount();
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68449);Assert.assertTrue(referenceCallsCount >= 13);

        // invalid guess (it *is* a root, but outside of the range)
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68450);try {
          __CLR4_4_11gr51gr5lb90pc4l.R.inc(68451);result = solver.solve(100, f, 0.6, 7.0, 0.0);
          __CLR4_4_11gr51gr5lb90pc4l.R.inc(68452);Assert.fail("a NumberIsTooLargeException was expected");
        } catch (NumberIsTooLargeException iae) {
            // expected behaviour
        }

        // bad guess
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68453);f.setCallsCount(0);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68454);result = solver.solve(100, f, 0.6, 7.0, 0.61);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68455);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68456);Assert.assertTrue(f.getCallsCount() > referenceCallsCount);

        // good guess
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68457);f.setCallsCount(0);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68458);result = solver.solve(100, f, 0.6, 7.0, 0.999999);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68459);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68460);Assert.assertTrue(f.getCallsCount() < referenceCallsCount);

        // perfect guess
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68461);f.setCallsCount(0);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68462);result = solver.solve(100, f, 0.6, 7.0, 1.0);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68463);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68464);Assert.assertEquals(1, solver.getEvaluations());
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68465);Assert.assertEquals(1, f.getCallsCount());
    }finally{__CLR4_4_11gr51gr5lb90pc4l.R.flushNeeded();}}

    @Test
    public void testMath832() {__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceStart(getClass().getName(),68466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131en2c1gtu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gr51gr5lb90pc4l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gr51gr5lb90pc4l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.BrentSolverTest.testMath832",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131en2c1gtu(){try{__CLR4_4_11gr51gr5lb90pc4l.R.inc(68466);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68467);final UnivariateFunction f = new UnivariateFunction() {
                private final UnivariateDifferentiableFunction sqrt = new Sqrt();
                private final UnivariateDifferentiableFunction inv = new Inverse();
                private final UnivariateDifferentiableFunction func
                    = FunctionUtils.add(FunctionUtils.multiply(new Constant(1e2), sqrt),
                                        FunctionUtils.multiply(new Constant(1e6), inv),
                                        FunctionUtils.multiply(new Constant(1e4),
                                                               FunctionUtils.compose(inv, sqrt)));

                public double value(double x) {try{__CLR4_4_11gr51gr5lb90pc4l.R.inc(68468);
                    __CLR4_4_11gr51gr5lb90pc4l.R.inc(68469);return func.value(new DerivativeStructure(1, 1, 0, x)).getPartialDerivative(1);
                }finally{__CLR4_4_11gr51gr5lb90pc4l.R.flushNeeded();}}

            };

        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68470);BrentSolver solver = new BrentSolver();
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68471);final double result = solver.solve(99, f, 1, 1e30, 1 + 1e-10);
        __CLR4_4_11gr51gr5lb90pc4l.R.inc(68472);Assert.assertEquals(804.93558250, result, 1e-8);
    }finally{__CLR4_4_11gr51gr5lb90pc4l.R.flushNeeded();}}
}
