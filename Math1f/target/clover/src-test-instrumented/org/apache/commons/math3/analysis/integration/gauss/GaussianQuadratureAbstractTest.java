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
package org.apache.commons.math3.analysis.integration.gauss;

import org.apache.commons.math3.analysis.function.Power;
import org.junit.Test;
import org.junit.Assert;

/**
 * Base class for standard testing of Gaussian quadrature rules,
 * which are exact for polynomials up to a certain degree. In this test, each
 * monomial in turn is tested against the specified quadrature rule.
 *
 * @version $Id$
 */
public abstract class GaussianQuadratureAbstractTest {static class __CLR4_4_11edl1edllb90pbzh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65307,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The maximum absolute error (for zero testing).
     */
    private final double eps;
    /**
     * The maximum relative error (in ulps).
     */
    private final double numUlps;
    /**
     * The quadrature rule under test.
     */
    private final GaussIntegrator integrator;
    /**
     * Maximum degree of monomials to be tested.
     */
    private final int maxDegree;

    /**
     * Creates a new instance of this abstract test with the specified
     * quadrature rule.
     * If the expected value is non-zero, equality of actual and expected values
     * is checked in the relative sense <center>
     * |x<sub>act</sub>&nbsp;-&nbsp;x<sub>exp</sub>|&nbsp;&le;&nbsp; n&nbsp;
     * <code>Math.ulp(</code>x<sub>exp</sub><code>)</code>, </center> where n is
     * the maximum relative error (in ulps). If the expected value is zero, the
     * test checks that <center> |x<sub>act</sub>|&nbsp;&le;&nbsp;&epsilon;,
     * </center> where &epsilon; is the maximum absolute error.
     *
     * @param integrator Quadrature rule under test.
     * @param maxDegree Maximum degree of monomials to be tested.
     * @param eps &epsilon;.
     * @param numUlps Value of the maximum relative error (in ulps).
     */
    public GaussianQuadratureAbstractTest(GaussIntegrator integrator,
                                          int maxDegree,
                                          double eps,
                                          double numUlps) {try{__CLR4_4_11edl1edllb90pbzh.R.inc(65289);
        __CLR4_4_11edl1edllb90pbzh.R.inc(65290);this.integrator = integrator;
        __CLR4_4_11edl1edllb90pbzh.R.inc(65291);this.maxDegree = maxDegree;
        __CLR4_4_11edl1edllb90pbzh.R.inc(65292);this.eps = eps;
        __CLR4_4_11edl1edllb90pbzh.R.inc(65293);this.numUlps = numUlps;
    }finally{__CLR4_4_11edl1edllb90pbzh.R.flushNeeded();}}

    /**
     * Returns the expected value of the integral of the specified monomial.
     * The integration is carried out on the natural interval of the quadrature
     * rule under test.
     *
     * @param n Degree of the monomial.
     * @return the expected value of the integral of x<sup>n</sup>.
     */
    public abstract double getExpectedValue(final int n);

    /**
     * Checks that the value of the integral of each monomial
     *   <code>x<sup>0</sup>, ... , x<sup>p</sup></code>
     * returned by the quadrature rule under test conforms with the expected
     * value.
     * Here {@code p} denotes the degree of the highest polynomial for which
     * exactness is to be expected.
     */
    @Test
    public void testAllMonomials() {__CLR4_4_11edl1edllb90pbzh.R.globalSliceStart(getClass().getName(),65294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vv3o2p1edq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11edl1edllb90pbzh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11edl1edllb90pbzh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.gauss.GaussianQuadratureAbstractTest.testAllMonomials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vv3o2p1edq(){try{__CLR4_4_11edl1edllb90pbzh.R.inc(65294);
        __CLR4_4_11edl1edllb90pbzh.R.inc(65295);for (int n = 0; (((n <= maxDegree)&&(__CLR4_4_11edl1edllb90pbzh.R.iget(65296)!=0|true))||(__CLR4_4_11edl1edllb90pbzh.R.iget(65297)==0&false)); n++) {{
            __CLR4_4_11edl1edllb90pbzh.R.inc(65298);final double expected = getExpectedValue(n);

            __CLR4_4_11edl1edllb90pbzh.R.inc(65299);final Power monomial = new Power(n);
            __CLR4_4_11edl1edllb90pbzh.R.inc(65300);final double actual = integrator.integrate(monomial);

            // System.out.println(n + "/" + maxDegree + " " + integrator.getNumberOfPoints()
            //                    + " " + expected + " " + actual + " " + Math.ulp(expected));
            __CLR4_4_11edl1edllb90pbzh.R.inc(65301);if ((((expected == 0)&&(__CLR4_4_11edl1edllb90pbzh.R.iget(65302)!=0|true))||(__CLR4_4_11edl1edllb90pbzh.R.iget(65303)==0&false))) {{
                __CLR4_4_11edl1edllb90pbzh.R.inc(65304);Assert.assertEquals("while integrating monomial x**" + n +
                                    " with a " +
                                    integrator.getNumberOfPoints() + "-point quadrature rule",
                                    expected, actual, eps);
            } }else {{
                __CLR4_4_11edl1edllb90pbzh.R.inc(65305);double err = Math.abs(actual - expected) / Math.ulp(expected);
                __CLR4_4_11edl1edllb90pbzh.R.inc(65306);Assert.assertEquals("while integrating monomial x**" + n + " with a " +
                                    + integrator.getNumberOfPoints() + "-point quadrature rule, " +
                                    " error was " + err + " ulps",
                                    expected, actual, Math.ulp(expected) * numUlps);
            }
        }}
    }}finally{__CLR4_4_11edl1edllb90pbzh.R.flushNeeded();}}
}
