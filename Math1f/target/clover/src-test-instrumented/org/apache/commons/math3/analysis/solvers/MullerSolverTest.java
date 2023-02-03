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
import org.apache.commons.math3.analysis.function.Expm1;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for {@link MullerSolver Muller} solver.
 * <p>
 * Muller's method converges almost quadratically near roots, but it can
 * be very slow in regions far away from zeros. Test runs show that for
 * reasonably good initial values, for a default absolute accuracy of 1E-6,
 * it generally takes 5 to 10 iterations for the solver to converge.
 * <p>
 * Tests for the exponential function illustrate the situations where
 * Muller solver performs poorly.
 *
 * @version $Id$
 */
public final class MullerSolverTest {static class __CLR4_4_11gxy1gxylb90pc4z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68684,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test of solver for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_11gxy1gxylb90pc4z.R.globalSliceStart(getClass().getName(),68614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71gxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gxy1gxylb90pc4z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gxy1gxylb90pc4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.MullerSolverTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71gxy(){try{__CLR4_4_11gxy1gxylb90pc4z.R.inc(68614);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68615);UnivariateFunction f = new Sin();
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68616);UnivariateSolver solver = new MullerSolver();
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68617);double min, max, expected, result, tolerance;

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68618);min = 3.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68619);max = 4.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68620);expected = FastMath.PI;
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68621);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68622);result = solver.solve(100, f, min, max);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68623);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68624);min = -1.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68625);max = 1.5; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68626);expected = 0.0;
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68627);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68628);result = solver.solve(100, f, min, max);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68629);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gxy1gxylb90pc4z.R.flushNeeded();}}

    /**
     * Test of solver for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11gxy1gxylb90pc4z.R.globalSliceStart(getClass().getName(),68630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1gye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gxy1gxylb90pc4z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gxy1gxylb90pc4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.MullerSolverTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1gye(){try{__CLR4_4_11gxy1gxylb90pc4z.R.inc(68630);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68631);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68632);UnivariateSolver solver = new MullerSolver();
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68633);double min, max, expected, result, tolerance;

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68634);min = -0.4; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68635);max = 0.2; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68636);expected = 0.0;
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68637);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68638);result = solver.solve(100, f, min, max);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68639);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68640);min = 0.75; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68641);max = 1.5; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68642);expected = 1.0;
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68643);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68644);result = solver.solve(100, f, min, max);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68645);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68646);min = -0.9; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68647);max = -0.2; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68648);expected = -0.5;
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68649);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68650);result = solver.solve(100, f, min, max);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68651);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gxy1gxylb90pc4z.R.flushNeeded();}}

    /**
     * Test of solver for the exponential function.
     * <p>
     * It takes 10 to 15 iterations for the last two tests to converge.
     * In fact, if not for the bisection alternative, the solver would
     * exceed the default maximal iteration of 100.
     */
    @Test
    public void testExpm1Function() {__CLR4_4_11gxy1gxylb90pc4z.R.globalSliceStart(getClass().getName(),68652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4oziq1gz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gxy1gxylb90pc4z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gxy1gxylb90pc4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.MullerSolverTest.testExpm1Function",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4oziq1gz0(){try{__CLR4_4_11gxy1gxylb90pc4z.R.inc(68652);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68653);UnivariateFunction f = new Expm1();
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68654);UnivariateSolver solver = new MullerSolver();
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68655);double min, max, expected, result, tolerance;

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68656);min = -1.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68657);max = 2.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68658);expected = 0.0;
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68659);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68660);result = solver.solve(100, f, min, max);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68661);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68662);min = -20.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68663);max = 10.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68664);expected = 0.0;
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68665);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68666);result = solver.solve(100, f, min, max);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68667);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68668);min = -50.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68669);max = 100.0; __CLR4_4_11gxy1gxylb90pc4z.R.inc(68670);expected = 0.0;
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68671);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68672);result = solver.solve(100, f, min, max);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68673);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gxy1gxylb90pc4z.R.flushNeeded();}}

    /**
     * Test of parameters for the solver.
     */
    @Test
    public void testParameters() {__CLR4_4_11gxy1gxylb90pc4z.R.globalSliceStart(getClass().getName(),68674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1gzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gxy1gxylb90pc4z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gxy1gxylb90pc4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.MullerSolverTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1gzm(){try{__CLR4_4_11gxy1gxylb90pc4z.R.inc(68674);
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68675);UnivariateFunction f = new Sin();
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68676);UnivariateSolver solver = new MullerSolver();

        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68677);try {
            // bad interval
            __CLR4_4_11gxy1gxylb90pc4z.R.inc(68678);double root = solver.solve(100, f, 1, -1);
            __CLR4_4_11gxy1gxylb90pc4z.R.inc(68679);System.out.println("root=" + root);
            __CLR4_4_11gxy1gxylb90pc4z.R.inc(68680);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11gxy1gxylb90pc4z.R.inc(68681);try {
            // no bracketing
            __CLR4_4_11gxy1gxylb90pc4z.R.inc(68682);solver.solve(100, f, 2, 3);
            __CLR4_4_11gxy1gxylb90pc4z.R.inc(68683);Assert.fail("Expecting NoBracketingException - no bracketing");
        } catch (NoBracketingException ex) {
            // expected
        }
    }finally{__CLR4_4_11gxy1gxylb90pc4z.R.flushNeeded();}}
}
