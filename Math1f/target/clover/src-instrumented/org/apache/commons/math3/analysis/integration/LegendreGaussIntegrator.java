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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * Implements the <a href="http://mathworld.wolfram.com/Legendre-GaussQuadrature.html">
 * Legendre-Gauss</a> quadrature formula.
 * <p>
 * Legendre-Gauss integrators are efficient integrators that can
 * accurately integrate functions with few function evaluations. A
 * Legendre-Gauss integrator using an n-points quadrature formula can
 * integrate 2n-1 degree polynomials exactly.
 * </p>
 * <p>
 * These integrators evaluate the function on n carefully chosen
 * abscissas in each step interval (mapped to the canonical [-1,1] interval).
 * The evaluation abscissas are not evenly spaced and none of them are
 * at the interval endpoints. This implies the function integrated can be
 * undefined at integration interval endpoints.
 * </p>
 * <p>
 * The evaluation abscissas x<sub>i</sub> are the roots of the degree n
 * Legendre polynomial. The weights a<sub>i</sub> of the quadrature formula
 * integrals from -1 to +1 &int; Li<sup>2</sup> where Li (x) =
 * &prod; (x-x<sub>k</sub>)/(x<sub>i</sub>-x<sub>k</sub>) for k != i.
 * </p>
 * <p>
 * @version $Id$
 * @since 1.2
 * @deprecated As of 3.1 (to be removed in 4.0). Please use
 * {@link IterativeLegendreGaussIntegrator} instead.
 */
@java.lang.SuppressWarnings({"fallthrough"}) @Deprecated
public class LegendreGaussIntegrator extends BaseAbstractUnivariateIntegrator {public static class __CLR4_4_11wt1wtlb90p6nl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2531,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Abscissas for the 2 points method. */
    private static final double[] ABSCISSAS_2 = {
        -1.0 / FastMath.sqrt(3.0),
         1.0 / FastMath.sqrt(3.0)
    };

    /** Weights for the 2 points method. */
    private static final double[] WEIGHTS_2 = {
        1.0,
        1.0
    };

    /** Abscissas for the 3 points method. */
    private static final double[] ABSCISSAS_3 = {
        -FastMath.sqrt(0.6),
         0.0,
         FastMath.sqrt(0.6)
    };

    /** Weights for the 3 points method. */
    private static final double[] WEIGHTS_3 = {
        5.0 / 9.0,
        8.0 / 9.0,
        5.0 / 9.0
    };

    /** Abscissas for the 4 points method. */
    private static final double[] ABSCISSAS_4 = {
        -FastMath.sqrt((15.0 + 2.0 * FastMath.sqrt(30.0)) / 35.0),
        -FastMath.sqrt((15.0 - 2.0 * FastMath.sqrt(30.0)) / 35.0),
         FastMath.sqrt((15.0 - 2.0 * FastMath.sqrt(30.0)) / 35.0),
         FastMath.sqrt((15.0 + 2.0 * FastMath.sqrt(30.0)) / 35.0)
    };

    /** Weights for the 4 points method. */
    private static final double[] WEIGHTS_4 = {
        (90.0 - 5.0 * FastMath.sqrt(30.0)) / 180.0,
        (90.0 + 5.0 * FastMath.sqrt(30.0)) / 180.0,
        (90.0 + 5.0 * FastMath.sqrt(30.0)) / 180.0,
        (90.0 - 5.0 * FastMath.sqrt(30.0)) / 180.0
    };

    /** Abscissas for the 5 points method. */
    private static final double[] ABSCISSAS_5 = {
        -FastMath.sqrt((35.0 + 2.0 * FastMath.sqrt(70.0)) / 63.0),
        -FastMath.sqrt((35.0 - 2.0 * FastMath.sqrt(70.0)) / 63.0),
         0.0,
         FastMath.sqrt((35.0 - 2.0 * FastMath.sqrt(70.0)) / 63.0),
         FastMath.sqrt((35.0 + 2.0 * FastMath.sqrt(70.0)) / 63.0)
    };

    /** Weights for the 5 points method. */
    private static final double[] WEIGHTS_5 = {
        (322.0 - 13.0 * FastMath.sqrt(70.0)) / 900.0,
        (322.0 + 13.0 * FastMath.sqrt(70.0)) / 900.0,
        128.0 / 225.0,
        (322.0 + 13.0 * FastMath.sqrt(70.0)) / 900.0,
        (322.0 - 13.0 * FastMath.sqrt(70.0)) / 900.0
    };

    /** Abscissas for the current method. */
    private final double[] abscissas;

    /** Weights for the current method. */
    private final double[] weights;

    /**
     * Build a Legendre-Gauss integrator with given accuracies and iterations counts.
     * @param n number of points desired (must be between 2 and 5 inclusive)
     * @param relativeAccuracy relative accuracy of the result
     * @param absoluteAccuracy absolute accuracy of the result
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * @exception MathIllegalArgumentException if number of points is out of [2; 5]
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     */
    public LegendreGaussIntegrator(final int n,
                                   final double relativeAccuracy,
                                   final double absoluteAccuracy,
                                   final int minimalIterationCount,
                                   final int maximalIterationCount)
        throws MathIllegalArgumentException, NotStrictlyPositiveException, NumberIsTooSmallException {
        super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);__CLR4_4_11wt1wtlb90p6nl.R.inc(2478);try{__CLR4_4_11wt1wtlb90p6nl.R.inc(2477);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_11wt1wtlb90p6nl.R.inc(2479);switch(n) {
        case 2 :if (!__CLB4_4_1_bool0) {__CLR4_4_11wt1wtlb90p6nl.R.inc(2480);__CLB4_4_1_bool0=true;}
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2481);abscissas = ABSCISSAS_2;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2482);weights   = WEIGHTS_2;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2483);break;
        case 3 :if (!__CLB4_4_1_bool0) {__CLR4_4_11wt1wtlb90p6nl.R.inc(2484);__CLB4_4_1_bool0=true;}
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2485);abscissas = ABSCISSAS_3;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2486);weights   = WEIGHTS_3;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2487);break;
        case 4 :if (!__CLB4_4_1_bool0) {__CLR4_4_11wt1wtlb90p6nl.R.inc(2488);__CLB4_4_1_bool0=true;}
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2489);abscissas = ABSCISSAS_4;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2490);weights   = WEIGHTS_4;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2491);break;
        case 5 :if (!__CLB4_4_1_bool0) {__CLR4_4_11wt1wtlb90p6nl.R.inc(2492);__CLB4_4_1_bool0=true;}
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2493);abscissas = ABSCISSAS_5;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2494);weights   = WEIGHTS_5;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2495);break;
        default :if (!__CLB4_4_1_bool0) {__CLR4_4_11wt1wtlb90p6nl.R.inc(2496);__CLB4_4_1_bool0=true;}
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2497);throw new MathIllegalArgumentException(
                    LocalizedFormats.N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED,
                    n, 2, 5);
        }

    }finally{__CLR4_4_11wt1wtlb90p6nl.R.flushNeeded();}}

    /**
     * Build a Legendre-Gauss integrator with given accuracies.
     * @param n number of points desired (must be between 2 and 5 inclusive)
     * @param relativeAccuracy relative accuracy of the result
     * @param absoluteAccuracy absolute accuracy of the result
     * @exception MathIllegalArgumentException if number of points is out of [2; 5]
     */
    public LegendreGaussIntegrator(final int n,
                                   final double relativeAccuracy,
                                   final double absoluteAccuracy)
        throws MathIllegalArgumentException {
        this(n, relativeAccuracy, absoluteAccuracy,
             DEFAULT_MIN_ITERATIONS_COUNT, DEFAULT_MAX_ITERATIONS_COUNT);__CLR4_4_11wt1wtlb90p6nl.R.inc(2499);try{__CLR4_4_11wt1wtlb90p6nl.R.inc(2498);
    }finally{__CLR4_4_11wt1wtlb90p6nl.R.flushNeeded();}}

    /**
     * Build a Legendre-Gauss integrator with given iteration counts.
     * @param n number of points desired (must be between 2 and 5 inclusive)
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * @exception MathIllegalArgumentException if number of points is out of [2; 5]
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     */
    public LegendreGaussIntegrator(final int n,
                                   final int minimalIterationCount,
                                   final int maximalIterationCount)
        throws MathIllegalArgumentException {
        this(n, DEFAULT_RELATIVE_ACCURACY, DEFAULT_ABSOLUTE_ACCURACY,
             minimalIterationCount, maximalIterationCount);__CLR4_4_11wt1wtlb90p6nl.R.inc(2501);try{__CLR4_4_11wt1wtlb90p6nl.R.inc(2500);
    }finally{__CLR4_4_11wt1wtlb90p6nl.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double doIntegrate()
        throws MathIllegalArgumentException, TooManyEvaluationsException, MaxCountExceededException {try{__CLR4_4_11wt1wtlb90p6nl.R.inc(2502);

        // compute first estimate with a single step
        __CLR4_4_11wt1wtlb90p6nl.R.inc(2503);double oldt = stage(1);

        __CLR4_4_11wt1wtlb90p6nl.R.inc(2504);int n = 2;
        __CLR4_4_11wt1wtlb90p6nl.R.inc(2505);while (true) {{

            // improve integral with a larger number of steps
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2506);final double t = stage(n);

            // estimate error
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2507);final double delta = FastMath.abs(t - oldt);
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2508);final double limit =
                FastMath.max(getAbsoluteAccuracy(),
                             getRelativeAccuracy() * (FastMath.abs(oldt) + FastMath.abs(t)) * 0.5);

            // check convergence
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2509);if (((((iterations.getCount() + 1 >= getMinimalIterationCount()) && (delta <= limit))&&(__CLR4_4_11wt1wtlb90p6nl.R.iget(2510)!=0|true))||(__CLR4_4_11wt1wtlb90p6nl.R.iget(2511)==0&false))) {{
                __CLR4_4_11wt1wtlb90p6nl.R.inc(2512);return t;
            }

            // prepare next iteration
            }__CLR4_4_11wt1wtlb90p6nl.R.inc(2513);double ratio = FastMath.min(4, FastMath.pow(delta / limit, 0.5 / abscissas.length));
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2514);n = FastMath.max((int) (ratio * n), n + 1);
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2515);oldt = t;
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2516);iterations.incrementCount();

        }

    }}finally{__CLR4_4_11wt1wtlb90p6nl.R.flushNeeded();}}

    /**
     * Compute the n-th stage integral.
     * @param n number of steps
     * @return the value of n-th stage integral
     * @throws TooManyEvaluationsException if the maximum number of evaluations
     * is exceeded.
     */
    private double stage(final int n)
        throws TooManyEvaluationsException {try{__CLR4_4_11wt1wtlb90p6nl.R.inc(2517);

        // set up the step for the current stage
        __CLR4_4_11wt1wtlb90p6nl.R.inc(2518);final double step     = (getMax() - getMin()) / n;
        __CLR4_4_11wt1wtlb90p6nl.R.inc(2519);final double halfStep = step / 2.0;

        // integrate over all elementary steps
        __CLR4_4_11wt1wtlb90p6nl.R.inc(2520);double midPoint = getMin() + halfStep;
        __CLR4_4_11wt1wtlb90p6nl.R.inc(2521);double sum = 0.0;
        __CLR4_4_11wt1wtlb90p6nl.R.inc(2522);for (int i = 0; (((i < n)&&(__CLR4_4_11wt1wtlb90p6nl.R.iget(2523)!=0|true))||(__CLR4_4_11wt1wtlb90p6nl.R.iget(2524)==0&false)); ++i) {{
            __CLR4_4_11wt1wtlb90p6nl.R.inc(2525);for (int j = 0; (((j < abscissas.length)&&(__CLR4_4_11wt1wtlb90p6nl.R.iget(2526)!=0|true))||(__CLR4_4_11wt1wtlb90p6nl.R.iget(2527)==0&false)); ++j) {{
                __CLR4_4_11wt1wtlb90p6nl.R.inc(2528);sum += weights[j] * computeObjectiveValue(midPoint + halfStep * abscissas[j]);
            }
            }__CLR4_4_11wt1wtlb90p6nl.R.inc(2529);midPoint += step;
        }

        }__CLR4_4_11wt1wtlb90p6nl.R.inc(2530);return halfStep * sum;

    }finally{__CLR4_4_11wt1wtlb90p6nl.R.flushNeeded();}}

}
