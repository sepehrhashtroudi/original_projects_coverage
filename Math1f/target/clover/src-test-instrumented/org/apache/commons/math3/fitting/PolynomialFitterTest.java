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
package org.apache.commons.math3.fitting;

import java.util.Random;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.TestUtils;
import org.junit.Test;
import org.junit.Assert;

/**
 * Test for class {@link CurveFitter} where the function to fit is a
 * polynomial.
 */
public class PolynomialFitterTest {static class __CLR4_4_11l741l74lb90pcif{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74292,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testFit() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18nll6u1l74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testFit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18nll6u1l74(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74128);
        __CLR4_4_11l741l74lb90pcif.R.inc(74129);final RealDistribution rng = new UniformRealDistribution(-100, 100);
        __CLR4_4_11l741l74lb90pcif.R.inc(74130);rng.reseedRandomGenerator(64925784252L);

        __CLR4_4_11l741l74lb90pcif.R.inc(74131);final LevenbergMarquardtOptimizer optim = new LevenbergMarquardtOptimizer();
        __CLR4_4_11l741l74lb90pcif.R.inc(74132);final PolynomialFitter fitter = new PolynomialFitter(optim);
        __CLR4_4_11l741l74lb90pcif.R.inc(74133);final double[] coeff = { 12.9, -3.4, 2.1 }; // 12.9 - 3.4 x + 2.1 x^2
        __CLR4_4_11l741l74lb90pcif.R.inc(74134);final PolynomialFunction f = new PolynomialFunction(coeff);

        // Collect data from a known polynomial.
        __CLR4_4_11l741l74lb90pcif.R.inc(74135);for (int i = 0; (((i < 100)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74136)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74137)==0&false)); i++) {{
            __CLR4_4_11l741l74lb90pcif.R.inc(74138);final double x = rng.sample();
            __CLR4_4_11l741l74lb90pcif.R.inc(74139);fitter.addObservedPoint(x, f.value(x));
        }

        // Start fit from initial guesses that are far from the optimal values.
        }__CLR4_4_11l741l74lb90pcif.R.inc(74140);final double[] best = fitter.fit(new double[] { -1e-20, 3e15, -5e25 });

        __CLR4_4_11l741l74lb90pcif.R.inc(74141);TestUtils.assertEquals("best != coeff", coeff, best, 1e-12);
    }finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    @Test
    public void testNoError() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9ceis1l7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testNoError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9ceis1l7i(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74142);
        __CLR4_4_11l741l74lb90pcif.R.inc(74143);Random randomizer = new Random(64925784252l);
        __CLR4_4_11l741l74lb90pcif.R.inc(74144);for (int degree = 1; (((degree < 10)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74145)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74146)==0&false)); ++degree) {{
            __CLR4_4_11l741l74lb90pcif.R.inc(74147);PolynomialFunction p = buildRandomPolynomial(degree, randomizer);

            __CLR4_4_11l741l74lb90pcif.R.inc(74148);PolynomialFitter fitter = new PolynomialFitter(new LevenbergMarquardtOptimizer());
            __CLR4_4_11l741l74lb90pcif.R.inc(74149);for (int i = 0; (((i <= degree)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74150)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74151)==0&false)); ++i) {{
                __CLR4_4_11l741l74lb90pcif.R.inc(74152);fitter.addObservedPoint(1.0, i, p.value(i));
            }

            }__CLR4_4_11l741l74lb90pcif.R.inc(74153);final double[] init = new double[degree + 1];
            __CLR4_4_11l741l74lb90pcif.R.inc(74154);PolynomialFunction fitted = new PolynomialFunction(fitter.fit(init));

            __CLR4_4_11l741l74lb90pcif.R.inc(74155);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74156)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74157)==0&false)); x += 0.01) {{
                __CLR4_4_11l741l74lb90pcif.R.inc(74158);double error = FastMath.abs(p.value(x) - fitted.value(x)) /
                               (1.0 + FastMath.abs(p.value(x)));
                __CLR4_4_11l741l74lb90pcif.R.inc(74159);Assert.assertEquals(0.0, error, 1.0e-6);
            }
        }}
    }}finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    @Test
    public void testSmallError() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3hwa1l80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testSmallError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3hwa1l80(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74160);
        __CLR4_4_11l741l74lb90pcif.R.inc(74161);Random randomizer = new Random(53882150042l);
        __CLR4_4_11l741l74lb90pcif.R.inc(74162);double maxError = 0;
        __CLR4_4_11l741l74lb90pcif.R.inc(74163);for (int degree = 0; (((degree < 10)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74164)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74165)==0&false)); ++degree) {{
            __CLR4_4_11l741l74lb90pcif.R.inc(74166);PolynomialFunction p = buildRandomPolynomial(degree, randomizer);

            __CLR4_4_11l741l74lb90pcif.R.inc(74167);PolynomialFitter fitter = new PolynomialFitter(new LevenbergMarquardtOptimizer());
            __CLR4_4_11l741l74lb90pcif.R.inc(74168);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74169)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74170)==0&false)); x += 0.01) {{
                __CLR4_4_11l741l74lb90pcif.R.inc(74171);fitter.addObservedPoint(1.0, x,
                                        p.value(x) + 0.1 * randomizer.nextGaussian());
            }

            }__CLR4_4_11l741l74lb90pcif.R.inc(74172);final double[] init = new double[degree + 1];
            __CLR4_4_11l741l74lb90pcif.R.inc(74173);PolynomialFunction fitted = new PolynomialFunction(fitter.fit(init));

            __CLR4_4_11l741l74lb90pcif.R.inc(74174);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74175)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74176)==0&false)); x += 0.01) {{
                __CLR4_4_11l741l74lb90pcif.R.inc(74177);double error = FastMath.abs(p.value(x) - fitted.value(x)) /
                              (1.0 + FastMath.abs(p.value(x)));
                __CLR4_4_11l741l74lb90pcif.R.inc(74178);maxError = FastMath.max(maxError, error);
                __CLR4_4_11l741l74lb90pcif.R.inc(74179);Assert.assertTrue(FastMath.abs(error) < 0.1);
            }
        }}
        }__CLR4_4_11l741l74lb90pcif.R.inc(74180);Assert.assertTrue(maxError > 0.01);
    }finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    @Test
    public void testMath798() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3xlzx1l8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testMath798",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3xlzx1l8l(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74181);
        __CLR4_4_11l741l74lb90pcif.R.inc(74182);final double tol = 1e-14;
        __CLR4_4_11l741l74lb90pcif.R.inc(74183);final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(tol, tol);
        __CLR4_4_11l741l74lb90pcif.R.inc(74184);final double[] init = new double[] { 0, 0 };
        __CLR4_4_11l741l74lb90pcif.R.inc(74185);final int maxEval = 3;

        __CLR4_4_11l741l74lb90pcif.R.inc(74186);final double[] lm = doMath798(new LevenbergMarquardtOptimizer(checker), maxEval, init);
        __CLR4_4_11l741l74lb90pcif.R.inc(74187);final double[] gn = doMath798(new GaussNewtonOptimizer(checker), maxEval, init);

        __CLR4_4_11l741l74lb90pcif.R.inc(74188);for (int i = 0; (((i <= 1)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74189)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74190)==0&false)); i++) {{
            __CLR4_4_11l741l74lb90pcif.R.inc(74191);Assert.assertEquals(lm[i], gn[i], tol);
        }
    }}finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    /**
     * This test shows that the user can set the maximum number of iterations
     * to avoid running for too long.
     * But in the test case, the real problem is that the tolerance is way too
     * stringent.
     */
    @Test(expected=TooManyEvaluationsException.class)
    public void testMath798WithToleranceTooLow() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1on11ri1l8w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,55,57,56,87,105,116,104,84,111,108,101,114,97,110,99,101,84,111,111,76,111,119,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testMath798WithToleranceTooLow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1on11ri1l8w(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74192);
        __CLR4_4_11l741l74lb90pcif.R.inc(74193);final double tol = 1e-100;
        __CLR4_4_11l741l74lb90pcif.R.inc(74194);final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(tol, tol);
        __CLR4_4_11l741l74lb90pcif.R.inc(74195);final double[] init = new double[] { 0, 0 };
        __CLR4_4_11l741l74lb90pcif.R.inc(74196);final int maxEval = 10000; // Trying hard to fit.

        __CLR4_4_11l741l74lb90pcif.R.inc(74197);@SuppressWarnings("unused")
        final double[] gn = doMath798(new GaussNewtonOptimizer(checker), maxEval, init);
    }finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    /**
     * This test shows that the user can set the maximum number of iterations
     * to avoid running for too long.
     * Even if the real problem is that the tolerance is way too stringent, it
     * is possible to get the best solution so far, i.e. a checker will return
     * the point when the maximum iteration count has been reached.
     */
    @Test
    public void testMath798WithToleranceTooLowButNoException() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129hbof1l92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testMath798WithToleranceTooLowButNoException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129hbof1l92(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74198);
        __CLR4_4_11l741l74lb90pcif.R.inc(74199);final double tol = 1e-100;
        __CLR4_4_11l741l74lb90pcif.R.inc(74200);final double[] init = new double[] { 0, 0 };
        __CLR4_4_11l741l74lb90pcif.R.inc(74201);final int maxEval = 10000; // Trying hard to fit.
        __CLR4_4_11l741l74lb90pcif.R.inc(74202);final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(tol, tol, maxEval);

        __CLR4_4_11l741l74lb90pcif.R.inc(74203);final double[] lm = doMath798(new LevenbergMarquardtOptimizer(checker), maxEval, init);
        __CLR4_4_11l741l74lb90pcif.R.inc(74204);final double[] gn = doMath798(new GaussNewtonOptimizer(checker), maxEval, init);

        __CLR4_4_11l741l74lb90pcif.R.inc(74205);for (int i = 0; (((i <= 1)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74206)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74207)==0&false)); i++) {{
            __CLR4_4_11l741l74lb90pcif.R.inc(74208);Assert.assertEquals(lm[i], gn[i], 1e-15);
        }
    }}finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    /**
     * @param optimizer Optimizer.
     * @param maxEval Maximum number of function evaluations.
     * @param init First guess.
     * @return the solution found by the given optimizer.
     */
    private double[] doMath798(MultivariateVectorOptimizer optimizer,
                               int maxEval,
                               double[] init) {try{__CLR4_4_11l741l74lb90pcif.R.inc(74209);
        __CLR4_4_11l741l74lb90pcif.R.inc(74210);final CurveFitter<Parametric> fitter = new CurveFitter<Parametric>(optimizer);

        __CLR4_4_11l741l74lb90pcif.R.inc(74211);fitter.addObservedPoint(-0.2, -7.12442E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74212);fitter.addObservedPoint(-0.199, -4.33397E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74213);fitter.addObservedPoint(-0.198, -2.823E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74214);fitter.addObservedPoint(-0.197, -1.40405E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74215);fitter.addObservedPoint(-0.196, -7.80821E-15);
        __CLR4_4_11l741l74lb90pcif.R.inc(74216);fitter.addObservedPoint(-0.195, 6.20484E-14);
        __CLR4_4_11l741l74lb90pcif.R.inc(74217);fitter.addObservedPoint(-0.194, 7.24673E-14);
        __CLR4_4_11l741l74lb90pcif.R.inc(74218);fitter.addObservedPoint(-0.193, 1.47152E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74219);fitter.addObservedPoint(-0.192, 1.9629E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74220);fitter.addObservedPoint(-0.191, 2.12038E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74221);fitter.addObservedPoint(-0.19, 2.46906E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74222);fitter.addObservedPoint(-0.189, 2.77495E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74223);fitter.addObservedPoint(-0.188, 2.51281E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74224);fitter.addObservedPoint(-0.187, 2.64001E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74225);fitter.addObservedPoint(-0.186, 2.8882E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74226);fitter.addObservedPoint(-0.185, 3.13604E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74227);fitter.addObservedPoint(-0.184, 3.14248E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74228);fitter.addObservedPoint(-0.183, 3.1172E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74229);fitter.addObservedPoint(-0.182, 3.12912E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74230);fitter.addObservedPoint(-0.181, 3.06761E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74231);fitter.addObservedPoint(-0.18, 2.8559E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74232);fitter.addObservedPoint(-0.179, 2.86806E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74233);fitter.addObservedPoint(-0.178, 2.985E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74234);fitter.addObservedPoint(-0.177, 2.67148E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74235);fitter.addObservedPoint(-0.176, 2.94173E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74236);fitter.addObservedPoint(-0.175, 3.27528E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74237);fitter.addObservedPoint(-0.174, 3.33858E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74238);fitter.addObservedPoint(-0.173, 2.97511E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74239);fitter.addObservedPoint(-0.172, 2.8615E-13);
        __CLR4_4_11l741l74lb90pcif.R.inc(74240);fitter.addObservedPoint(-0.171, 2.84624E-13);

        __CLR4_4_11l741l74lb90pcif.R.inc(74241);final double[] coeff = fitter.fit(maxEval,
                                          new PolynomialFunction.Parametric(),
                                          init);
        __CLR4_4_11l741l74lb90pcif.R.inc(74242);return coeff;
    }finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    @Test
    public void testRedundantSolvable() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sq81q1lab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testRedundantSolvable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sq81q1lab(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74243);
        // Levenberg-Marquardt should handle redundant information gracefully
        __CLR4_4_11l741l74lb90pcif.R.inc(74244);checkUnsolvableProblem(new LevenbergMarquardtOptimizer(), true);
    }finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    @Test
    public void testRedundantUnsolvable() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rne3cr1lad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testRedundantUnsolvable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rne3cr1lad(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74245);
        // Gauss-Newton should not be able to solve redundant information
        __CLR4_4_11l741l74lb90pcif.R.inc(74246);checkUnsolvableProblem(new GaussNewtonOptimizer(true, new SimpleVectorValueChecker(1e-15, 1e-15)), false);
    }finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    @Test
    public void testLargeSample() {__CLR4_4_11l741l74lb90pcif.R.globalSliceStart(getClass().getName(),74247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wb2ka1laf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l741l74lb90pcif.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l741l74lb90pcif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.PolynomialFitterTest.testLargeSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wb2ka1laf(){try{__CLR4_4_11l741l74lb90pcif.R.inc(74247);
        __CLR4_4_11l741l74lb90pcif.R.inc(74248);Random randomizer = new Random(0x5551480dca5b369bl);
        __CLR4_4_11l741l74lb90pcif.R.inc(74249);double maxError = 0;
        __CLR4_4_11l741l74lb90pcif.R.inc(74250);for (int degree = 0; (((degree < 10)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74251)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74252)==0&false)); ++degree) {{
            __CLR4_4_11l741l74lb90pcif.R.inc(74253);PolynomialFunction p = buildRandomPolynomial(degree, randomizer);

            __CLR4_4_11l741l74lb90pcif.R.inc(74254);PolynomialFitter fitter = new PolynomialFitter(new LevenbergMarquardtOptimizer());
            __CLR4_4_11l741l74lb90pcif.R.inc(74255);for (int i = 0; (((i < 40000)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74256)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74257)==0&false)); ++i) {{
                __CLR4_4_11l741l74lb90pcif.R.inc(74258);double x = -1.0 + i / 20000.0;
                __CLR4_4_11l741l74lb90pcif.R.inc(74259);fitter.addObservedPoint(1.0, x,
                                        p.value(x) + 0.1 * randomizer.nextGaussian());
            }

            }__CLR4_4_11l741l74lb90pcif.R.inc(74260);final double[] init = new double[degree + 1];
            __CLR4_4_11l741l74lb90pcif.R.inc(74261);PolynomialFunction fitted = new PolynomialFunction(fitter.fit(init));

            __CLR4_4_11l741l74lb90pcif.R.inc(74262);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74263)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74264)==0&false)); x += 0.01) {{
                __CLR4_4_11l741l74lb90pcif.R.inc(74265);double error = FastMath.abs(p.value(x) - fitted.value(x)) /
                              (1.0 + FastMath.abs(p.value(x)));
                __CLR4_4_11l741l74lb90pcif.R.inc(74266);maxError = FastMath.max(maxError, error);
                __CLR4_4_11l741l74lb90pcif.R.inc(74267);Assert.assertTrue(FastMath.abs(error) < 0.01);
            }
        }}
        }__CLR4_4_11l741l74lb90pcif.R.inc(74268);Assert.assertTrue(maxError > 0.001);
    }finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    private void checkUnsolvableProblem(MultivariateVectorOptimizer optimizer,
                                        boolean solvable) {try{__CLR4_4_11l741l74lb90pcif.R.inc(74269);
        __CLR4_4_11l741l74lb90pcif.R.inc(74270);Random randomizer = new Random(1248788532l);
        __CLR4_4_11l741l74lb90pcif.R.inc(74271);for (int degree = 0; (((degree < 10)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74272)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74273)==0&false)); ++degree) {{
            __CLR4_4_11l741l74lb90pcif.R.inc(74274);PolynomialFunction p = buildRandomPolynomial(degree, randomizer);

            __CLR4_4_11l741l74lb90pcif.R.inc(74275);PolynomialFitter fitter = new PolynomialFitter(optimizer);

            // reusing the same point over and over again does not bring
            // information, the problem cannot be solved in this case for
            // degrees greater than 1 (but one point is sufficient for
            // degree 0)
            __CLR4_4_11l741l74lb90pcif.R.inc(74276);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74277)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74278)==0&false)); x += 0.01) {{
                __CLR4_4_11l741l74lb90pcif.R.inc(74279);fitter.addObservedPoint(1.0, 0.0, p.value(0.0));
            }

            }__CLR4_4_11l741l74lb90pcif.R.inc(74280);try {
                __CLR4_4_11l741l74lb90pcif.R.inc(74281);final double[] init = new double[degree + 1];
                __CLR4_4_11l741l74lb90pcif.R.inc(74282);fitter.fit(init);
                __CLR4_4_11l741l74lb90pcif.R.inc(74283);Assert.assertTrue(solvable || (degree == 0));
            } catch(ConvergenceException e) {
                __CLR4_4_11l741l74lb90pcif.R.inc(74284);Assert.assertTrue((! solvable) && (degree > 0));
            }
        }
    }}finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}

    private PolynomialFunction buildRandomPolynomial(int degree, Random randomizer) {try{__CLR4_4_11l741l74lb90pcif.R.inc(74285);
        __CLR4_4_11l741l74lb90pcif.R.inc(74286);final double[] coefficients = new double[degree + 1];
        __CLR4_4_11l741l74lb90pcif.R.inc(74287);for (int i = 0; (((i <= degree)&&(__CLR4_4_11l741l74lb90pcif.R.iget(74288)!=0|true))||(__CLR4_4_11l741l74lb90pcif.R.iget(74289)==0&false)); ++i) {{
            __CLR4_4_11l741l74lb90pcif.R.inc(74290);coefficients[i] = randomizer.nextGaussian();
        }
        }__CLR4_4_11l741l74lb90pcif.R.inc(74291);return new PolynomialFunction(coefficients);
    }finally{__CLR4_4_11l741l74lb90pcif.R.flushNeeded();}}
}
