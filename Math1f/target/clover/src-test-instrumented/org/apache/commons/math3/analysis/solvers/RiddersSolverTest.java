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
 * Test case for {@link RiddersSolver Ridders} solver.
 * <p>
 * Ridders' method converges superlinearly, more specific, its rate of
 * convergence is sqrt(2). Test runs show that for a default absolute
 * accuracy of 1E-6, it generally takes less than 5 iterations for close
 * initial bracket and 5 to 10 iterations for distant initial bracket
 * to converge.
 *
 * @version $Id$
 */
public final class RiddersSolverTest {static class __CLR4_4_11h2g1h2glb90pc5e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68845,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test of solver for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_11h2g1h2glb90pc5e.R.globalSliceStart(getClass().getName(),68776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71h2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h2g1h2glb90pc5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h2g1h2glb90pc5e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.RiddersSolverTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71h2g(){try{__CLR4_4_11h2g1h2glb90pc5e.R.inc(68776);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68777);UnivariateFunction f = new Sin();
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68778);UnivariateSolver solver = new RiddersSolver();
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68779);double min, max, expected, result, tolerance;

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68780);min = 3.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68781);max = 4.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68782);expected = FastMath.PI;
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68783);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68784);result = solver.solve(100, f, min, max);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68785);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68786);min = -1.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68787);max = 1.5; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68788);expected = 0.0;
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68789);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68790);result = solver.solve(100, f, min, max);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68791);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11h2g1h2glb90pc5e.R.flushNeeded();}}

    /**
     * Test of solver for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11h2g1h2glb90pc5e.R.globalSliceStart(getClass().getName(),68792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1h2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h2g1h2glb90pc5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h2g1h2glb90pc5e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.RiddersSolverTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1h2w(){try{__CLR4_4_11h2g1h2glb90pc5e.R.inc(68792);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68793);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68794);UnivariateSolver solver = new RiddersSolver();
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68795);double min, max, expected, result, tolerance;

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68796);min = -0.4; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68797);max = 0.2; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68798);expected = 0.0;
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68799);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68800);result = solver.solve(100, f, min, max);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68801);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68802);min = 0.75; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68803);max = 1.5; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68804);expected = 1.0;
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68805);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68806);result = solver.solve(100, f, min, max);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68807);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68808);min = -0.9; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68809);max = -0.2; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68810);expected = -0.5;
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68811);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68812);result = solver.solve(100, f, min, max);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68813);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11h2g1h2glb90pc5e.R.flushNeeded();}}

    /**
     * Test of solver for the exponential function.
     */
    @Test
    public void testExpm1Function() {__CLR4_4_11h2g1h2glb90pc5e.R.globalSliceStart(getClass().getName(),68814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4oziq1h3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h2g1h2glb90pc5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h2g1h2glb90pc5e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.RiddersSolverTest.testExpm1Function",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4oziq1h3i(){try{__CLR4_4_11h2g1h2glb90pc5e.R.inc(68814);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68815);UnivariateFunction f = new Expm1();
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68816);UnivariateSolver solver = new RiddersSolver();
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68817);double min, max, expected, result, tolerance;

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68818);min = -1.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68819);max = 2.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68820);expected = 0.0;
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68821);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68822);result = solver.solve(100, f, min, max);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68823);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68824);min = -20.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68825);max = 10.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68826);expected = 0.0;
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68827);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68828);result = solver.solve(100, f, min, max);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68829);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68830);min = -50.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68831);max = 100.0; __CLR4_4_11h2g1h2glb90pc5e.R.inc(68832);expected = 0.0;
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68833);tolerance = FastMath.max(solver.getAbsoluteAccuracy(),
                    FastMath.abs(expected * solver.getRelativeAccuracy()));
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68834);result = solver.solve(100, f, min, max);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68835);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11h2g1h2glb90pc5e.R.flushNeeded();}}

    /**
     * Test of parameters for the solver.
     */
    @Test
    public void testParameters() {__CLR4_4_11h2g1h2glb90pc5e.R.globalSliceStart(getClass().getName(),68836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1h44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h2g1h2glb90pc5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h2g1h2glb90pc5e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.RiddersSolverTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1h44(){try{__CLR4_4_11h2g1h2glb90pc5e.R.inc(68836);
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68837);UnivariateFunction f = new Sin();
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68838);UnivariateSolver solver = new RiddersSolver();

        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68839);try {
            // bad interval
            __CLR4_4_11h2g1h2glb90pc5e.R.inc(68840);solver.solve(100, f, 1, -1);
            __CLR4_4_11h2g1h2glb90pc5e.R.inc(68841);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11h2g1h2glb90pc5e.R.inc(68842);try {
            // no bracketing
            __CLR4_4_11h2g1h2glb90pc5e.R.inc(68843);solver.solve(100, f, 2, 3);
            __CLR4_4_11h2g1h2glb90pc5e.R.inc(68844);Assert.fail("Expecting NoBracketingException - no bracketing");
        } catch (NoBracketingException ex) {
            // expected
        }
    }finally{__CLR4_4_11h2g1h2glb90pc5e.R.flushNeeded();}}
}
