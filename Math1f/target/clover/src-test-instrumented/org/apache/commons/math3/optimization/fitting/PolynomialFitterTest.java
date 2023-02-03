/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.commons.math3.optimization.fitting;

import java.util.Random;

import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.optimization.SimpleVectorValueChecker;
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
public class PolynomialFitterTest {static class __CLR4_4_1259v259vlb90pe14{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,100311,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testFit() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18nll6u259v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testFit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18nll6u259v(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100147);
        __CLR4_4_1259v259vlb90pe14.R.inc(100148);final RealDistribution rng = new UniformRealDistribution(-100, 100);
        __CLR4_4_1259v259vlb90pe14.R.inc(100149);rng.reseedRandomGenerator(64925784252L);

        __CLR4_4_1259v259vlb90pe14.R.inc(100150);final LevenbergMarquardtOptimizer optim = new LevenbergMarquardtOptimizer();
        __CLR4_4_1259v259vlb90pe14.R.inc(100151);final PolynomialFitter fitter = new PolynomialFitter(optim);
        __CLR4_4_1259v259vlb90pe14.R.inc(100152);final double[] coeff = { 12.9, -3.4, 2.1 }; // 12.9 - 3.4 x + 2.1 x^2
        __CLR4_4_1259v259vlb90pe14.R.inc(100153);final PolynomialFunction f = new PolynomialFunction(coeff);

        // Collect data from a known polynomial.
        __CLR4_4_1259v259vlb90pe14.R.inc(100154);for (int i = 0; (((i < 100)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100155)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100156)==0&false)); i++) {{
            __CLR4_4_1259v259vlb90pe14.R.inc(100157);final double x = rng.sample();
            __CLR4_4_1259v259vlb90pe14.R.inc(100158);fitter.addObservedPoint(x, f.value(x));
        }

        // Start fit from initial guesses that are far from the optimal values.
        }__CLR4_4_1259v259vlb90pe14.R.inc(100159);final double[] best = fitter.fit(new double[] { -1e-20, 3e15, -5e25 });

        __CLR4_4_1259v259vlb90pe14.R.inc(100160);TestUtils.assertEquals("best != coeff", coeff, best, 1e-12);
    }finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    @Test
    public void testNoError() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9ceis25a9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testNoError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9ceis25a9(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100161);
        __CLR4_4_1259v259vlb90pe14.R.inc(100162);Random randomizer = new Random(64925784252l);
        __CLR4_4_1259v259vlb90pe14.R.inc(100163);for (int degree = 1; (((degree < 10)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100164)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100165)==0&false)); ++degree) {{
            __CLR4_4_1259v259vlb90pe14.R.inc(100166);PolynomialFunction p = buildRandomPolynomial(degree, randomizer);

            __CLR4_4_1259v259vlb90pe14.R.inc(100167);PolynomialFitter fitter = new PolynomialFitter(new LevenbergMarquardtOptimizer());
            __CLR4_4_1259v259vlb90pe14.R.inc(100168);for (int i = 0; (((i <= degree)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100169)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100170)==0&false)); ++i) {{
                __CLR4_4_1259v259vlb90pe14.R.inc(100171);fitter.addObservedPoint(1.0, i, p.value(i));
            }

            }__CLR4_4_1259v259vlb90pe14.R.inc(100172);final double[] init = new double[degree + 1];
            __CLR4_4_1259v259vlb90pe14.R.inc(100173);PolynomialFunction fitted = new PolynomialFunction(fitter.fit(init));

            __CLR4_4_1259v259vlb90pe14.R.inc(100174);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100175)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100176)==0&false)); x += 0.01) {{
                __CLR4_4_1259v259vlb90pe14.R.inc(100177);double error = FastMath.abs(p.value(x) - fitted.value(x)) /
                               (1.0 + FastMath.abs(p.value(x)));
                __CLR4_4_1259v259vlb90pe14.R.inc(100178);Assert.assertEquals(0.0, error, 1.0e-6);
            }
        }}
    }}finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    @Test
    public void testSmallError() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3hwa25ar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testSmallError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3hwa25ar(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100179);
        __CLR4_4_1259v259vlb90pe14.R.inc(100180);Random randomizer = new Random(53882150042l);
        __CLR4_4_1259v259vlb90pe14.R.inc(100181);double maxError = 0;
        __CLR4_4_1259v259vlb90pe14.R.inc(100182);for (int degree = 0; (((degree < 10)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100183)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100184)==0&false)); ++degree) {{
            __CLR4_4_1259v259vlb90pe14.R.inc(100185);PolynomialFunction p = buildRandomPolynomial(degree, randomizer);

            __CLR4_4_1259v259vlb90pe14.R.inc(100186);PolynomialFitter fitter = new PolynomialFitter(new LevenbergMarquardtOptimizer());
            __CLR4_4_1259v259vlb90pe14.R.inc(100187);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100188)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100189)==0&false)); x += 0.01) {{
                __CLR4_4_1259v259vlb90pe14.R.inc(100190);fitter.addObservedPoint(1.0, x,
                                        p.value(x) + 0.1 * randomizer.nextGaussian());
            }

            }__CLR4_4_1259v259vlb90pe14.R.inc(100191);final double[] init = new double[degree + 1];
            __CLR4_4_1259v259vlb90pe14.R.inc(100192);PolynomialFunction fitted = new PolynomialFunction(fitter.fit(init));

            __CLR4_4_1259v259vlb90pe14.R.inc(100193);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100194)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100195)==0&false)); x += 0.01) {{
                __CLR4_4_1259v259vlb90pe14.R.inc(100196);double error = FastMath.abs(p.value(x) - fitted.value(x)) /
                              (1.0 + FastMath.abs(p.value(x)));
                __CLR4_4_1259v259vlb90pe14.R.inc(100197);maxError = FastMath.max(maxError, error);
                __CLR4_4_1259v259vlb90pe14.R.inc(100198);Assert.assertTrue(FastMath.abs(error) < 0.1);
            }
        }}
        }__CLR4_4_1259v259vlb90pe14.R.inc(100199);Assert.assertTrue(maxError > 0.01);
    }finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    @Test
    public void testMath798() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3xlzx25bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testMath798",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3xlzx25bc(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100200);
        __CLR4_4_1259v259vlb90pe14.R.inc(100201);final double tol = 1e-14;
        __CLR4_4_1259v259vlb90pe14.R.inc(100202);final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(tol, tol);
        __CLR4_4_1259v259vlb90pe14.R.inc(100203);final double[] init = new double[] { 0, 0 };
        __CLR4_4_1259v259vlb90pe14.R.inc(100204);final int maxEval = 3;

        __CLR4_4_1259v259vlb90pe14.R.inc(100205);final double[] lm = doMath798(new LevenbergMarquardtOptimizer(checker), maxEval, init);
        __CLR4_4_1259v259vlb90pe14.R.inc(100206);final double[] gn = doMath798(new GaussNewtonOptimizer(checker), maxEval, init);

        __CLR4_4_1259v259vlb90pe14.R.inc(100207);for (int i = 0; (((i <= 1)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100208)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100209)==0&false)); i++) {{
            __CLR4_4_1259v259vlb90pe14.R.inc(100210);Assert.assertEquals(lm[i], gn[i], tol);
        }
    }}finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    /**
     * This test shows that the user can set the maximum number of iterations
     * to avoid running for too long.
     * But in the test case, the real problem is that the tolerance is way too
     * stringent.
     */
    @Test(expected=TooManyEvaluationsException.class)
    public void testMath798WithToleranceTooLow() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1on11ri25bn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,55,57,56,87,105,116,104,84,111,108,101,114,97,110,99,101,84,111,111,76,111,119,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testMath798WithToleranceTooLow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1on11ri25bn(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100211);
        __CLR4_4_1259v259vlb90pe14.R.inc(100212);final double tol = 1e-100;
        __CLR4_4_1259v259vlb90pe14.R.inc(100213);final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(tol, tol);
        __CLR4_4_1259v259vlb90pe14.R.inc(100214);final double[] init = new double[] { 0, 0 };
        __CLR4_4_1259v259vlb90pe14.R.inc(100215);final int maxEval = 10000; // Trying hard to fit.

        __CLR4_4_1259v259vlb90pe14.R.inc(100216);final double[] gn = doMath798(new GaussNewtonOptimizer(checker), maxEval, init);
    }finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    /**
     * This test shows that the user can set the maximum number of iterations
     * to avoid running for too long.
     * Even if the real problem is that the tolerance is way too stringent, it
     * is possible to get the best solution so far, i.e. a checker will return
     * the point when the maximum iteration count has been reached.
     */
    @Test
    public void testMath798WithToleranceTooLowButNoException() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129hbof25bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testMath798WithToleranceTooLowButNoException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129hbof25bt(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100217);
        __CLR4_4_1259v259vlb90pe14.R.inc(100218);final double tol = 1e-100;
        __CLR4_4_1259v259vlb90pe14.R.inc(100219);final double[] init = new double[] { 0, 0 };
        __CLR4_4_1259v259vlb90pe14.R.inc(100220);final int maxEval = 10000; // Trying hard to fit.
        __CLR4_4_1259v259vlb90pe14.R.inc(100221);final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(tol, tol, maxEval);

        __CLR4_4_1259v259vlb90pe14.R.inc(100222);final double[] lm = doMath798(new LevenbergMarquardtOptimizer(checker), maxEval, init);
        __CLR4_4_1259v259vlb90pe14.R.inc(100223);final double[] gn = doMath798(new GaussNewtonOptimizer(checker), maxEval, init);

        __CLR4_4_1259v259vlb90pe14.R.inc(100224);for (int i = 0; (((i <= 1)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100225)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100226)==0&false)); i++) {{
            __CLR4_4_1259v259vlb90pe14.R.inc(100227);Assert.assertEquals(lm[i], gn[i], 1e-15);
        }
    }}finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    /**
     * @param optimizer Optimizer.
     * @param maxEval Maximum number of function evaluations.
     * @param init First guess.
     * @return the solution found by the given optimizer.
     */
    private double[] doMath798(DifferentiableMultivariateVectorOptimizer optimizer,
                               int maxEval,
                               double[] init) {try{__CLR4_4_1259v259vlb90pe14.R.inc(100228);
        __CLR4_4_1259v259vlb90pe14.R.inc(100229);final CurveFitter<Parametric> fitter = new CurveFitter<Parametric>(optimizer);

        __CLR4_4_1259v259vlb90pe14.R.inc(100230);fitter.addObservedPoint(-0.2, -7.12442E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100231);fitter.addObservedPoint(-0.199, -4.33397E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100232);fitter.addObservedPoint(-0.198, -2.823E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100233);fitter.addObservedPoint(-0.197, -1.40405E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100234);fitter.addObservedPoint(-0.196, -7.80821E-15);
        __CLR4_4_1259v259vlb90pe14.R.inc(100235);fitter.addObservedPoint(-0.195, 6.20484E-14);
        __CLR4_4_1259v259vlb90pe14.R.inc(100236);fitter.addObservedPoint(-0.194, 7.24673E-14);
        __CLR4_4_1259v259vlb90pe14.R.inc(100237);fitter.addObservedPoint(-0.193, 1.47152E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100238);fitter.addObservedPoint(-0.192, 1.9629E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100239);fitter.addObservedPoint(-0.191, 2.12038E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100240);fitter.addObservedPoint(-0.19, 2.46906E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100241);fitter.addObservedPoint(-0.189, 2.77495E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100242);fitter.addObservedPoint(-0.188, 2.51281E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100243);fitter.addObservedPoint(-0.187, 2.64001E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100244);fitter.addObservedPoint(-0.186, 2.8882E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100245);fitter.addObservedPoint(-0.185, 3.13604E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100246);fitter.addObservedPoint(-0.184, 3.14248E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100247);fitter.addObservedPoint(-0.183, 3.1172E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100248);fitter.addObservedPoint(-0.182, 3.12912E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100249);fitter.addObservedPoint(-0.181, 3.06761E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100250);fitter.addObservedPoint(-0.18, 2.8559E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100251);fitter.addObservedPoint(-0.179, 2.86806E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100252);fitter.addObservedPoint(-0.178, 2.985E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100253);fitter.addObservedPoint(-0.177, 2.67148E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100254);fitter.addObservedPoint(-0.176, 2.94173E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100255);fitter.addObservedPoint(-0.175, 3.27528E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100256);fitter.addObservedPoint(-0.174, 3.33858E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100257);fitter.addObservedPoint(-0.173, 2.97511E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100258);fitter.addObservedPoint(-0.172, 2.8615E-13);
        __CLR4_4_1259v259vlb90pe14.R.inc(100259);fitter.addObservedPoint(-0.171, 2.84624E-13);

        __CLR4_4_1259v259vlb90pe14.R.inc(100260);final double[] coeff = fitter.fit(maxEval,
                                          new PolynomialFunction.Parametric(),
                                          init);
        __CLR4_4_1259v259vlb90pe14.R.inc(100261);return coeff;
    }finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    @Test
    public void testRedundantSolvable() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sq81q25d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testRedundantSolvable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sq81q25d2(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100262);
        // Levenberg-Marquardt should handle redundant information gracefully
        __CLR4_4_1259v259vlb90pe14.R.inc(100263);checkUnsolvableProblem(new LevenbergMarquardtOptimizer(), true);
    }finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    @Test
    public void testRedundantUnsolvable() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rne3cr25d4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testRedundantUnsolvable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rne3cr25d4(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100264);
        // Gauss-Newton should not be able to solve redundant information
        __CLR4_4_1259v259vlb90pe14.R.inc(100265);checkUnsolvableProblem(new GaussNewtonOptimizer(true, new SimpleVectorValueChecker(1e-15, 1e-15)), false);
    }finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    @Test
    public void testLargeSample() {__CLR4_4_1259v259vlb90pe14.R.globalSliceStart(getClass().getName(),100266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wb2ka25d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1259v259vlb90pe14.R.rethrow($CLV_t2$);}finally{__CLR4_4_1259v259vlb90pe14.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testLargeSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wb2ka25d6(){try{__CLR4_4_1259v259vlb90pe14.R.inc(100266);
        __CLR4_4_1259v259vlb90pe14.R.inc(100267);Random randomizer = new Random(0x5551480dca5b369bl);
        __CLR4_4_1259v259vlb90pe14.R.inc(100268);double maxError = 0;
        __CLR4_4_1259v259vlb90pe14.R.inc(100269);for (int degree = 0; (((degree < 10)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100270)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100271)==0&false)); ++degree) {{
            __CLR4_4_1259v259vlb90pe14.R.inc(100272);PolynomialFunction p = buildRandomPolynomial(degree, randomizer);

            __CLR4_4_1259v259vlb90pe14.R.inc(100273);PolynomialFitter fitter = new PolynomialFitter(new LevenbergMarquardtOptimizer());
            __CLR4_4_1259v259vlb90pe14.R.inc(100274);for (int i = 0; (((i < 40000)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100275)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100276)==0&false)); ++i) {{
                __CLR4_4_1259v259vlb90pe14.R.inc(100277);double x = -1.0 + i / 20000.0;
                __CLR4_4_1259v259vlb90pe14.R.inc(100278);fitter.addObservedPoint(1.0, x,
                                        p.value(x) + 0.1 * randomizer.nextGaussian());
            }

            }__CLR4_4_1259v259vlb90pe14.R.inc(100279);final double[] init = new double[degree + 1];
            __CLR4_4_1259v259vlb90pe14.R.inc(100280);PolynomialFunction fitted = new PolynomialFunction(fitter.fit(init));

            __CLR4_4_1259v259vlb90pe14.R.inc(100281);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100282)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100283)==0&false)); x += 0.01) {{
                __CLR4_4_1259v259vlb90pe14.R.inc(100284);double error = FastMath.abs(p.value(x) - fitted.value(x)) /
                              (1.0 + FastMath.abs(p.value(x)));
                __CLR4_4_1259v259vlb90pe14.R.inc(100285);maxError = FastMath.max(maxError, error);
                __CLR4_4_1259v259vlb90pe14.R.inc(100286);Assert.assertTrue(FastMath.abs(error) < 0.01);
            }
        }}
        }__CLR4_4_1259v259vlb90pe14.R.inc(100287);Assert.assertTrue(maxError > 0.001);
    }finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    private void checkUnsolvableProblem(DifferentiableMultivariateVectorOptimizer optimizer,
                                        boolean solvable) {try{__CLR4_4_1259v259vlb90pe14.R.inc(100288);
        __CLR4_4_1259v259vlb90pe14.R.inc(100289);Random randomizer = new Random(1248788532l);
        __CLR4_4_1259v259vlb90pe14.R.inc(100290);for (int degree = 0; (((degree < 10)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100291)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100292)==0&false)); ++degree) {{
            __CLR4_4_1259v259vlb90pe14.R.inc(100293);PolynomialFunction p = buildRandomPolynomial(degree, randomizer);

            __CLR4_4_1259v259vlb90pe14.R.inc(100294);PolynomialFitter fitter = new PolynomialFitter(optimizer);

            // reusing the same point over and over again does not bring
            // information, the problem cannot be solved in this case for
            // degrees greater than 1 (but one point is sufficient for
            // degree 0)
            __CLR4_4_1259v259vlb90pe14.R.inc(100295);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100296)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100297)==0&false)); x += 0.01) {{
                __CLR4_4_1259v259vlb90pe14.R.inc(100298);fitter.addObservedPoint(1.0, 0.0, p.value(0.0));
            }

            }__CLR4_4_1259v259vlb90pe14.R.inc(100299);try {
                __CLR4_4_1259v259vlb90pe14.R.inc(100300);final double[] init = new double[degree + 1];
                __CLR4_4_1259v259vlb90pe14.R.inc(100301);fitter.fit(init);
                __CLR4_4_1259v259vlb90pe14.R.inc(100302);Assert.assertTrue(solvable || (degree == 0));
            } catch(ConvergenceException e) {
                __CLR4_4_1259v259vlb90pe14.R.inc(100303);Assert.assertTrue((! solvable) && (degree > 0));
            }
        }
    }}finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}

    private PolynomialFunction buildRandomPolynomial(int degree, Random randomizer) {try{__CLR4_4_1259v259vlb90pe14.R.inc(100304);
        __CLR4_4_1259v259vlb90pe14.R.inc(100305);final double[] coefficients = new double[degree + 1];
        __CLR4_4_1259v259vlb90pe14.R.inc(100306);for (int i = 0; (((i <= degree)&&(__CLR4_4_1259v259vlb90pe14.R.iget(100307)!=0|true))||(__CLR4_4_1259v259vlb90pe14.R.iget(100308)==0&false)); ++i) {{
            __CLR4_4_1259v259vlb90pe14.R.inc(100309);coefficients[i] = randomizer.nextGaussian();
        }
        }__CLR4_4_1259v259vlb90pe14.R.inc(100310);return new PolynomialFunction(coefficients);
    }finally{__CLR4_4_1259v259vlb90pe14.R.flushNeeded();}}
}
