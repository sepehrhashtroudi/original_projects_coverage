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
 * Test case for {@link MullerSolver2 Muller} solver.
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
public final class MullerSolver2Test {static class __CLR4_4_11gw11gw1lb90pc4v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68614,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test of solver for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_11gw11gw1lb90pc4v.R.globalSliceStart(getClass().getName(),68545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71gw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gw11gw1lb90pc4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gw11gw1lb90pc4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.MullerSolver2Test.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71gw1(){try{__CLR4_4_11gw11gw1lb90pc4v.R.inc(68545);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68546);UnivariateFunction f = new Sin();
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68547);UnivariateSolver solver = new MullerSolver2();
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68548);double min, max, expected, result, tolerance;

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68549);min = 3.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68550);max = 4.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68551);expected = FastMath.PI;
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68552);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68553);result = solver.solve(100, f, min, max);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68554);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68555);min = -1.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68556);max = 1.5; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68557);expected = 0.0;
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68558);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68559);result = solver.solve(100, f, min, max);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68560);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gw11gw1lb90pc4v.R.flushNeeded();}}

    /**
     * Test of solver for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11gw11gw1lb90pc4v.R.globalSliceStart(getClass().getName(),68561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1gwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gw11gw1lb90pc4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gw11gw1lb90pc4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.MullerSolver2Test.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1gwh(){try{__CLR4_4_11gw11gw1lb90pc4v.R.inc(68561);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68562);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68563);UnivariateSolver solver = new MullerSolver2();
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68564);double min, max, expected, result, tolerance;

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68565);min = -0.4; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68566);max = 0.2; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68567);expected = 0.0;
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68568);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68569);result = solver.solve(100, f, min, max);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68570);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68571);min = 0.75; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68572);max = 1.5; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68573);expected = 1.0;
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68574);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68575);result = solver.solve(100, f, min, max);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68576);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68577);min = -0.9; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68578);max = -0.2; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68579);expected = -0.5;
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68580);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68581);result = solver.solve(100, f, min, max);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68582);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gw11gw1lb90pc4v.R.flushNeeded();}}

    /**
     * Test of solver for the exponential function.
     * <p>
     * It takes 25 to 50 iterations for the last two tests to converge.
     */
    @Test
    public void testExpm1Function() {__CLR4_4_11gw11gw1lb90pc4v.R.globalSliceStart(getClass().getName(),68583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4oziq1gx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gw11gw1lb90pc4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gw11gw1lb90pc4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.MullerSolver2Test.testExpm1Function",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4oziq1gx3(){try{__CLR4_4_11gw11gw1lb90pc4v.R.inc(68583);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68584);UnivariateFunction f = new Expm1();
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68585);UnivariateSolver solver = new MullerSolver2();
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68586);double min, max, expected, result, tolerance;

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68587);min = -1.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68588);max = 2.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68589);expected = 0.0;
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68590);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68591);result = solver.solve(100, f, min, max);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68592);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68593);min = -20.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68594);max = 10.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68595);expected = 0.0;
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68596);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68597);result = solver.solve(100, f, min, max);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68598);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68599);min = -50.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68600);max = 100.0; __CLR4_4_11gw11gw1lb90pc4v.R.inc(68601);expected = 0.0;
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68602);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68603);result = solver.solve(100, f, min, max);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68604);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gw11gw1lb90pc4v.R.flushNeeded();}}

    /**
     * Test of parameters for the solver.
     */
    @Test
    public void testParameters() {__CLR4_4_11gw11gw1lb90pc4v.R.globalSliceStart(getClass().getName(),68605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1gxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gw11gw1lb90pc4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gw11gw1lb90pc4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.MullerSolver2Test.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1gxp(){try{__CLR4_4_11gw11gw1lb90pc4v.R.inc(68605);
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68606);UnivariateFunction f = new Sin();
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68607);UnivariateSolver solver = new MullerSolver2();

        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68608);try {
            // bad interval
            __CLR4_4_11gw11gw1lb90pc4v.R.inc(68609);solver.solve(100, f, 1, -1);
            __CLR4_4_11gw11gw1lb90pc4v.R.inc(68610);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11gw11gw1lb90pc4v.R.inc(68611);try {
            // no bracketing
            __CLR4_4_11gw11gw1lb90pc4v.R.inc(68612);solver.solve(100, f, 2, 3);
            __CLR4_4_11gw11gw1lb90pc4v.R.inc(68613);Assert.fail("Expecting NoBracketingException - no bracketing");
        } catch (NoBracketingException ex) {
            // expected
        }
    }finally{__CLR4_4_11gw11gw1lb90pc4v.R.flushNeeded();}}
}
