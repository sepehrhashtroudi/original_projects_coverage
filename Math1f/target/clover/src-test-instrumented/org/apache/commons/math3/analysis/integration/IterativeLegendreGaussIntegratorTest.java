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
package org.apache.commons.math3.analysis.integration;

import java.util.Random;

import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.Gaussian;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


public class IterativeLegendreGaussIntegratorTest {static class __CLR4_4_11dzz1dzzlb90pbyl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64898,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSinFunction() {__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceStart(getClass().getName(),64799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71dzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dzz1dzzlb90pbyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71dzz(){try{__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64799);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64800);UnivariateFunction f = new Sin();
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64801);BaseAbstractUnivariateIntegrator integrator
            = new IterativeLegendreGaussIntegrator(5, 1.0e-14, 1.0e-10, 2, 15);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64802);double min, max, expected, result, tolerance;

        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64803);min = 0; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64804);max = FastMath.PI; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64805);expected = 2;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64806);tolerance = FastMath.max(integrator.getAbsoluteAccuracy(),
                             FastMath.abs(expected * integrator.getRelativeAccuracy()));
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64807);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64808);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64809);min = -FastMath.PI/3; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64810);max = 0; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64811);expected = -0.5;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64812);tolerance = FastMath.max(integrator.getAbsoluteAccuracy(),
                FastMath.abs(expected * integrator.getRelativeAccuracy()));
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64813);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64814);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11dzz1dzzlb90pbyl.R.flushNeeded();}}

    @Test
    public void testQuinticFunction() {__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceStart(getClass().getName(),64815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1e0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dzz1dzzlb90pbyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1e0f(){try{__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64815);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64816);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64817);UnivariateIntegrator integrator =
                new IterativeLegendreGaussIntegrator(3,
                                                     BaseAbstractUnivariateIntegrator.DEFAULT_RELATIVE_ACCURACY,
                                                     BaseAbstractUnivariateIntegrator.DEFAULT_ABSOLUTE_ACCURACY,
                                                     BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT,
                                                     64);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64818);double min, max, expected, result;

        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64819);min = 0; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64820);max = 1; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64821);expected = -1.0/48;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64822);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64823);Assert.assertEquals(expected, result, 1.0e-16);

        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64824);min = 0; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64825);max = 0.5; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64826);expected = 11.0/768;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64827);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64828);Assert.assertEquals(expected, result, 1.0e-16);

        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64829);min = -1; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64830);max = 4; __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64831);expected = 2048/3.0 - 78 + 1.0/48;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64832);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64833);Assert.assertEquals(expected, result, 1.0e-16);
    }finally{__CLR4_4_11dzz1dzzlb90pbyl.R.flushNeeded();}}

    @Test
    public void testExactIntegration() {__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceStart(getClass().getName(),64834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayd6du1e0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dzz1dzzlb90pbyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest.testExactIntegration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayd6du1e0y(){try{__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64834);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64835);Random random = new Random(86343623467878363l);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64836);for (int n = 2; (((n < 6)&&(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64837)!=0|true))||(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64838)==0&false)); ++n) {{
            __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64839);IterativeLegendreGaussIntegrator integrator =
                new IterativeLegendreGaussIntegrator(n,
                                                     BaseAbstractUnivariateIntegrator.DEFAULT_RELATIVE_ACCURACY,
                                                     BaseAbstractUnivariateIntegrator.DEFAULT_ABSOLUTE_ACCURACY,
                                                     BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT,
                                                     64);

            // an n points Gauss-Legendre integrator integrates 2n-1 degree polynoms exactly
            __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64840);for (int degree = 0; (((degree <= 2 * n - 1)&&(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64841)!=0|true))||(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64842)==0&false)); ++degree) {{
                __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64843);for (int i = 0; (((i < 10)&&(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64844)!=0|true))||(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64845)==0&false)); ++i) {{
                    __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64846);double[] coeff = new double[degree + 1];
                    __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64847);for (int k = 0; (((k < coeff.length)&&(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64848)!=0|true))||(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64849)==0&false)); ++k) {{
                        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64850);coeff[k] = 2 * random.nextDouble() - 1;
                    }
                    }__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64851);PolynomialFunction p = new PolynomialFunction(coeff);
                    __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64852);double result    = integrator.integrate(10000, p, -5.0, 15.0);
                    __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64853);double reference = exactIntegration(p, -5.0, 15.0);
                    __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64854);Assert.assertEquals(n + " " + degree + " " + i, reference, result, 1.0e-12 * (1.0 + FastMath.abs(reference)));
                }
            }}

        }}
    }}finally{__CLR4_4_11dzz1dzzlb90pbyl.R.flushNeeded();}}

    // Cf. MATH-995
    @Test
    public void testNormalDistributionWithLargeSigma() {__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceStart(getClass().getName(),64855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uaoms41e1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dzz1dzzlb90pbyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest.testNormalDistributionWithLargeSigma",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uaoms41e1j(){try{__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64855);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64856);final double sigma = 1000;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64857);final double mean = 0;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64858);final double factor = 1 / (sigma * FastMath.sqrt(2 * FastMath.PI));
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64859);final UnivariateFunction normal = new Gaussian(factor, mean, sigma);

        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64860);final double tol = 1e-2;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64861);final IterativeLegendreGaussIntegrator integrator =
            new IterativeLegendreGaussIntegrator(5, tol, tol);

        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64862);final double a = -5000;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64863);final double b = 5000;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64864);final double s = integrator.integrate(50, normal, a, b);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64865);Assert.assertEquals(1, s, 1e-5);
    }finally{__CLR4_4_11dzz1dzzlb90pbyl.R.flushNeeded();}}

    @Test
    public void testIssue464() {__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceStart(getClass().getName(),64866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11crlsi1e1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dzz1dzzlb90pbyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dzz1dzzlb90pbyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest.testIssue464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11crlsi1e1u(){try{__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64866);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64867);final double value = 0.2;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64868);UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64869);
                __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64870);return ((((x >= 0 && x <= 5) )&&(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64871)!=0|true))||(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64872)==0&false))? value : 0.0;
            }finally{__CLR4_4_11dzz1dzzlb90pbyl.R.flushNeeded();}}
        };
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64873);IterativeLegendreGaussIntegrator gauss
            = new IterativeLegendreGaussIntegrator(5, 3, 100);

        // due to the discontinuity, integration implies *many* calls
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64874);double maxX = 0.32462367623786328;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64875);Assert.assertEquals(maxX * value, gauss.integrate(Integer.MAX_VALUE, f, -10, maxX), 1.0e-7);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64876);Assert.assertTrue(gauss.getEvaluations() > 37000000);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64877);Assert.assertTrue(gauss.getIterations() < 30);

        // setting up limits prevents such large number of calls
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64878);try {
            __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64879);gauss.integrate(1000, f, -10, maxX);
            __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64880);Assert.fail("expected TooManyEvaluationsException");
        } catch (TooManyEvaluationsException tmee) {
            // expected
            __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64881);Assert.assertEquals(1000, tmee.getMax());
        }

        // integrating on the two sides should be simpler
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64882);double sum1 = gauss.integrate(1000, f, -10, 0);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64883);int eval1   = gauss.getEvaluations();
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64884);double sum2 = gauss.integrate(1000, f, 0, maxX);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64885);int eval2   = gauss.getEvaluations();
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64886);Assert.assertEquals(maxX * value, sum1 + sum2, 1.0e-7);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64887);Assert.assertTrue(eval1 + eval2 < 200);

    }finally{__CLR4_4_11dzz1dzzlb90pbyl.R.flushNeeded();}}

    private double exactIntegration(PolynomialFunction p, double a, double b) {try{__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64888);
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64889);final double[] coeffs = p.getCoefficients();
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64890);double yb = coeffs[coeffs.length - 1] / coeffs.length;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64891);double ya = yb;
        __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64892);for (int i = coeffs.length - 2; (((i >= 0)&&(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64893)!=0|true))||(__CLR4_4_11dzz1dzzlb90pbyl.R.iget(64894)==0&false)); --i) {{
            __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64895);yb = yb * b + coeffs[i] / (i + 1);
            __CLR4_4_11dzz1dzzlb90pbyl.R.inc(64896);ya = ya * a + coeffs[i] / (i + 1);
        }
        }__CLR4_4_11dzz1dzzlb90pbyl.R.inc(64897);return yb * b - ya * a;
    }finally{__CLR4_4_11dzz1dzzlb90pbyl.R.flushNeeded();}}
}
