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

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory;
import org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * This algorithm divides the integration interval into equally-sized
 * sub-interval and on each of them performs a
 * <a href="http://mathworld.wolfram.com/Legendre-GaussQuadrature.html">
 * Legendre-Gauss</a> quadrature.
 * Because of its <em>non-adaptive</em> nature, this algorithm can
 * converge to a wrong value for the integral (for example, if the
 * function is significantly different from zero toward the ends of the
 * integration interval).
 * In particular, a change of variables aimed at estimating integrals
 * over infinite intervals as proposed
 * <a href="http://en.wikipedia.org/w/index.php?title=Numerical_integration#Integrals_over_infinite_intervals">
 *  here</a> should be avoided when using this class.
 *
 * @version $Id$
 * @since 3.1
 */

public class IterativeLegendreGaussIntegrator
    extends BaseAbstractUnivariateIntegrator {public static class __CLR4_4_11vn1vnlb90p6n1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Factory that computes the points and weights. */
    private static final GaussIntegratorFactory FACTORY
        = new GaussIntegratorFactory();
    /** Number of integration points (per interval). */
    private final int numberOfPoints;

    /**
     * Builds an integrator with given accuracies and iterations counts.
     *
     * @param n Number of integration points.
     * @param relativeAccuracy Relative accuracy of the result.
     * @param absoluteAccuracy Absolute accuracy of the result.
     * @param minimalIterationCount Minimum number of iterations.
     * @param maximalIterationCount Maximum number of iterations.
     * @throws NotStrictlyPositiveException if minimal number of iterations
     * or number of points are not strictly positive.
     * @throws NumberIsTooSmallException if maximal number of iterations
     * is smaller than or equal to the minimal number of iterations.
     */
    public IterativeLegendreGaussIntegrator(final int n,
                                            final double relativeAccuracy,
                                            final double absoluteAccuracy,
                                            final int minimalIterationCount,
                                            final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException {
        super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);__CLR4_4_11vn1vnlb90p6n1.R.inc(2436);try{__CLR4_4_11vn1vnlb90p6n1.R.inc(2435);
        __CLR4_4_11vn1vnlb90p6n1.R.inc(2437);if ((((n <= 0)&&(__CLR4_4_11vn1vnlb90p6n1.R.iget(2438)!=0|true))||(__CLR4_4_11vn1vnlb90p6n1.R.iget(2439)==0&false))) {{
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2440);throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_POINTS, n);
        }
       }__CLR4_4_11vn1vnlb90p6n1.R.inc(2441);numberOfPoints = n;
    }finally{__CLR4_4_11vn1vnlb90p6n1.R.flushNeeded();}}

    /**
     * Builds an integrator with given accuracies.
     *
     * @param n Number of integration points.
     * @param relativeAccuracy Relative accuracy of the result.
     * @param absoluteAccuracy Absolute accuracy of the result.
     * @throws NotStrictlyPositiveException if {@code n < 1}.
     */
    public IterativeLegendreGaussIntegrator(final int n,
                                            final double relativeAccuracy,
                                            final double absoluteAccuracy)
        throws NotStrictlyPositiveException {
        this(n, relativeAccuracy, absoluteAccuracy,
             DEFAULT_MIN_ITERATIONS_COUNT, DEFAULT_MAX_ITERATIONS_COUNT);__CLR4_4_11vn1vnlb90p6n1.R.inc(2443);try{__CLR4_4_11vn1vnlb90p6n1.R.inc(2442);
    }finally{__CLR4_4_11vn1vnlb90p6n1.R.flushNeeded();}}

    /**
     * Builds an integrator with given iteration counts.
     *
     * @param n Number of integration points.
     * @param minimalIterationCount Minimum number of iterations.
     * @param maximalIterationCount Maximum number of iterations.
     * @throws NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive.
     * @throws NumberIsTooSmallException if maximal number of iterations
     * is smaller than or equal to the minimal number of iterations.
     * @throws NotStrictlyPositiveException if {@code n < 1}.
     */
    public IterativeLegendreGaussIntegrator(final int n,
                                            final int minimalIterationCount,
                                            final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException {
        this(n, DEFAULT_RELATIVE_ACCURACY, DEFAULT_ABSOLUTE_ACCURACY,
             minimalIterationCount, maximalIterationCount);__CLR4_4_11vn1vnlb90p6n1.R.inc(2445);try{__CLR4_4_11vn1vnlb90p6n1.R.inc(2444);
    }finally{__CLR4_4_11vn1vnlb90p6n1.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double doIntegrate()
        throws MathIllegalArgumentException, TooManyEvaluationsException, MaxCountExceededException {try{__CLR4_4_11vn1vnlb90p6n1.R.inc(2446);
        // Compute first estimate with a single step.
        __CLR4_4_11vn1vnlb90p6n1.R.inc(2447);double oldt = stage(1);

        __CLR4_4_11vn1vnlb90p6n1.R.inc(2448);int n = 2;
        __CLR4_4_11vn1vnlb90p6n1.R.inc(2449);while (true) {{
            // Improve integral with a larger number of steps.
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2450);final double t = stage(n);

            // Estimate the error.
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2451);final double delta = FastMath.abs(t - oldt);
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2452);final double limit =
                FastMath.max(getAbsoluteAccuracy(),
                             getRelativeAccuracy() * (FastMath.abs(oldt) + FastMath.abs(t)) * 0.5);

            // check convergence
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2453);if ((((iterations.getCount() + 1 >= getMinimalIterationCount() &&
                delta <= limit)&&(__CLR4_4_11vn1vnlb90p6n1.R.iget(2454)!=0|true))||(__CLR4_4_11vn1vnlb90p6n1.R.iget(2455)==0&false))) {{
                __CLR4_4_11vn1vnlb90p6n1.R.inc(2456);return t;
            }

            // Prepare next iteration.
            }__CLR4_4_11vn1vnlb90p6n1.R.inc(2457);final double ratio = FastMath.min(4, FastMath.pow(delta / limit, 0.5 / numberOfPoints));
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2458);n = FastMath.max((int) (ratio * n), n + 1);
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2459);oldt = t;
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2460);iterations.incrementCount();
        }
    }}finally{__CLR4_4_11vn1vnlb90p6n1.R.flushNeeded();}}

    /**
     * Compute the n-th stage integral.
     *
     * @param n Number of steps.
     * @return the value of n-th stage integral.
     * @throws TooManyEvaluationsException if the maximum number of evaluations
     * is exceeded.
     */
    private double stage(final int n)
        throws TooManyEvaluationsException {try{__CLR4_4_11vn1vnlb90p6n1.R.inc(2461);
        // Function to be integrated is stored in the base class.
        __CLR4_4_11vn1vnlb90p6n1.R.inc(2462);final UnivariateFunction f = new UnivariateFunction() {
                public double value(double x)
                    throws MathIllegalArgumentException, TooManyEvaluationsException {try{__CLR4_4_11vn1vnlb90p6n1.R.inc(2463);
                    __CLR4_4_11vn1vnlb90p6n1.R.inc(2464);return computeObjectiveValue(x);
                }finally{__CLR4_4_11vn1vnlb90p6n1.R.flushNeeded();}}
            };

        __CLR4_4_11vn1vnlb90p6n1.R.inc(2465);final double min = getMin();
        __CLR4_4_11vn1vnlb90p6n1.R.inc(2466);final double max = getMax();
        __CLR4_4_11vn1vnlb90p6n1.R.inc(2467);final double step = (max - min) / n;

        __CLR4_4_11vn1vnlb90p6n1.R.inc(2468);double sum = 0;
        __CLR4_4_11vn1vnlb90p6n1.R.inc(2469);for (int i = 0; (((i < n)&&(__CLR4_4_11vn1vnlb90p6n1.R.iget(2470)!=0|true))||(__CLR4_4_11vn1vnlb90p6n1.R.iget(2471)==0&false)); i++) {{
            // Integrate over each sub-interval [a, b].
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2472);final double a = min + i * step;
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2473);final double b = a + step;
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2474);final GaussIntegrator g = FACTORY.legendreHighPrecision(numberOfPoints, a, b);
            __CLR4_4_11vn1vnlb90p6n1.R.inc(2475);sum += g.integrate(f);
        }

        }__CLR4_4_11vn1vnlb90p6n1.R.inc(2476);return sum;
    }finally{__CLR4_4_11vn1vnlb90p6n1.R.flushNeeded();}}
}
