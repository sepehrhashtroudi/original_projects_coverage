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

import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.TestUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for Laguerre solver.
 * <p>
 * Laguerre's method is very efficient in solving polynomials. Test runs
 * show that for a default absolute accuracy of 1E-6, it generally takes
 * less than 5 iterations to find one root, provided solveAll() is not
 * invoked, and 15 to 20 iterations to find all roots for quintic function.
 *
 * @version $Id$
 */
public final class LaguerreSolverTest {static class __CLR4_4_11gu51gu5lb90pc4s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test of solver for the linear function.
     */
    @Test
    public void testLinearFunction() {__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceStart(getClass().getName(),68477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6bdje1gu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gu51gu5lb90pc4s.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.LaguerreSolverTest.testLinearFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6bdje1gu5(){try{__CLR4_4_11gu51gu5lb90pc4s.R.inc(68477);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68478);double min, max, expected, result, tolerance;

        // p(x) = 4x - 1
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68479);double coefficients[] = { -1.0, 4.0 };
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68480);PolynomialFunction f = new PolynomialFunction(coefficients);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68481);LaguerreSolver solver = new LaguerreSolver();

        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68482);min = 0.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68483);max = 1.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68484);expected = 0.25;
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68485);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68486);result = solver.solve(100, f, min, max);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68487);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gu51gu5lb90pc4s.R.flushNeeded();}}

    /**
     * Test of solver for the quadratic function.
     */
    @Test
    public void testQuadraticFunction() {__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceStart(getClass().getName(),68488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ocpph1gug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gu51gu5lb90pc4s.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.LaguerreSolverTest.testQuadraticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ocpph1gug(){try{__CLR4_4_11gu51gu5lb90pc4s.R.inc(68488);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68489);double min, max, expected, result, tolerance;

        // p(x) = 2x^2 + 5x - 3 = (x+3)(2x-1)
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68490);double coefficients[] = { -3.0, 5.0, 2.0 };
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68491);PolynomialFunction f = new PolynomialFunction(coefficients);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68492);LaguerreSolver solver = new LaguerreSolver();

        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68493);min = 0.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68494);max = 2.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68495);expected = 0.5;
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68496);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68497);result = solver.solve(100, f, min, max);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68498);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68499);min = -4.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68500);max = -1.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68501);expected = -3.0;
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68502);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68503);result = solver.solve(100, f, min, max);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68504);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gu51gu5lb90pc4s.R.flushNeeded();}}

    /**
     * Test of solver for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceStart(getClass().getName(),68505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1gux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gu51gu5lb90pc4s.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.LaguerreSolverTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1gux(){try{__CLR4_4_11gu51gu5lb90pc4s.R.inc(68505);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68506);double min, max, expected, result, tolerance;

        // p(x) = x^5 - x^4 - 12x^3 + x^2 - x - 12 = (x+1)(x+3)(x-4)(x^2-x+1)
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68507);double coefficients[] = { -12.0, -1.0, 1.0, -12.0, -1.0, 1.0 };
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68508);PolynomialFunction f = new PolynomialFunction(coefficients);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68509);LaguerreSolver solver = new LaguerreSolver();

        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68510);min = -2.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68511);max = 2.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68512);expected = -1.0;
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68513);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68514);result = solver.solve(100, f, min, max);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68515);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68516);min = -5.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68517);max = -2.5; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68518);expected = -3.0;
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68519);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68520);result = solver.solve(100, f, min, max);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68521);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68522);min = 3.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68523);max = 6.0; __CLR4_4_11gu51gu5lb90pc4s.R.inc(68524);expected = 4.0;
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68525);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68526);result = solver.solve(100, f, min, max);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68527);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11gu51gu5lb90pc4s.R.flushNeeded();}}

    /**
     * Test of solver for the quintic function using
     * {@link LaguerreSolver#solveAllComplex(double[],double) solveAllComplex}.
     */
    @Test
    public void testQuinticFunction2() {__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceStart(getClass().getName(),68528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ra01e1gvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gu51gu5lb90pc4s.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.LaguerreSolverTest.testQuinticFunction2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ra01e1gvk(){try{__CLR4_4_11gu51gu5lb90pc4s.R.inc(68528);
        // p(x) = x^5 + 4x^3 + x^2 + 4 = (x+1)(x^2-x+1)(x^2+4)
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68529);final double[] coefficients = { 4.0, 0.0, 1.0, 4.0, 0.0, 1.0 };
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68530);final LaguerreSolver solver = new LaguerreSolver();
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68531);final Complex[] result = solver.solveAllComplex(coefficients, 0);

        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68532);for (Complex expected : new Complex[] { new Complex(0, -2),
                                                new Complex(0, 2),
                                                new Complex(0.5, 0.5 * FastMath.sqrt(3)),
                                                new Complex(-1, 0),
                                                new Complex(0.5, -0.5 * FastMath.sqrt(3.0)) }) {{
            __CLR4_4_11gu51gu5lb90pc4s.R.inc(68533);final double tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                                                  FastMath.abs(expected.abs() * solver.getRelativeAccuracy()));
            __CLR4_4_11gu51gu5lb90pc4s.R.inc(68534);TestUtils.assertContains(result, expected, tolerance);
        }
    }}finally{__CLR4_4_11gu51gu5lb90pc4s.R.flushNeeded();}}

    /**
     * Test of parameters for the solver.
     */
    @Test
    public void testParameters() {__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceStart(getClass().getName(),68535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1gvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gu51gu5lb90pc4s.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gu51gu5lb90pc4s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.LaguerreSolverTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1gvr(){try{__CLR4_4_11gu51gu5lb90pc4s.R.inc(68535);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68536);double coefficients[] = { -3.0, 5.0, 2.0 };
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68537);PolynomialFunction f = new PolynomialFunction(coefficients);
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68538);LaguerreSolver solver = new LaguerreSolver();

        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68539);try {
            // bad interval
            __CLR4_4_11gu51gu5lb90pc4s.R.inc(68540);solver.solve(100, f, 1, -1);
            __CLR4_4_11gu51gu5lb90pc4s.R.inc(68541);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11gu51gu5lb90pc4s.R.inc(68542);try {
            // no bracketing
            __CLR4_4_11gu51gu5lb90pc4s.R.inc(68543);solver.solve(100, f, 2, 3);
            __CLR4_4_11gu51gu5lb90pc4s.R.inc(68544);Assert.fail("Expecting NoBracketingException - no bracketing");
        } catch (NoBracketingException ex) {
            // expected
        }
    }finally{__CLR4_4_11gu51gu5lb90pc4s.R.flushNeeded();}}
}
