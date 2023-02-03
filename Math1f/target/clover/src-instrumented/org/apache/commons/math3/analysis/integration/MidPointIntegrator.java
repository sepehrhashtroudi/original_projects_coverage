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
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.util.FastMath;

/**
 * Implements the <a href="http://en.wikipedia.org/wiki/Midpoint_method">
 * Midpoint Rule</a> for integration of real univariate functions. For
 * reference, see <b>Numerical Mathematics</b>, ISBN 0387989595,
 * chapter 9.2.
 * <p>
 * The function should be integrable.</p>
 *
 * @version $Id$
 * @since 3.3
 */
public class MidPointIntegrator extends BaseAbstractUnivariateIntegrator {public static class __CLR4_4_11yb1yblb90p6nw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Maximum number of iterations for midpoint. */
    public static final int MIDPOINT_MAX_ITERATIONS_COUNT = 64;

    /**
     * Build a midpoint integrator with given accuracies and iterations counts.
     * @param relativeAccuracy relative accuracy of the result
     * @param absoluteAccuracy absolute accuracy of the result
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * (must be less than or equal to {@link #MIDPOINT_MAX_ITERATIONS_COUNT}
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     * @exception NumberIsTooLargeException if maximal number of iterations
     * is greater than {@link #MIDPOINT_MAX_ITERATIONS_COUNT}
     */
    public MidPointIntegrator(final double relativeAccuracy,
                              final double absoluteAccuracy,
                              final int minimalIterationCount,
                              final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException {
        super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);__CLR4_4_11yb1yblb90p6nw.R.inc(2532);try{__CLR4_4_11yb1yblb90p6nw.R.inc(2531);
        __CLR4_4_11yb1yblb90p6nw.R.inc(2533);if ((((maximalIterationCount > MIDPOINT_MAX_ITERATIONS_COUNT)&&(__CLR4_4_11yb1yblb90p6nw.R.iget(2534)!=0|true))||(__CLR4_4_11yb1yblb90p6nw.R.iget(2535)==0&false))) {{
            __CLR4_4_11yb1yblb90p6nw.R.inc(2536);throw new NumberIsTooLargeException(maximalIterationCount,
                                                MIDPOINT_MAX_ITERATIONS_COUNT, false);
        }
    }}finally{__CLR4_4_11yb1yblb90p6nw.R.flushNeeded();}}

    /**
     * Build a midpoint integrator with given iteration counts.
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * (must be less than or equal to {@link #MIDPOINT_MAX_ITERATIONS_COUNT}
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     * @exception NumberIsTooLargeException if maximal number of iterations
     * is greater than {@link #MIDPOINT_MAX_ITERATIONS_COUNT}
     */
    public MidPointIntegrator(final int minimalIterationCount,
                              final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException {
        super(minimalIterationCount, maximalIterationCount);__CLR4_4_11yb1yblb90p6nw.R.inc(2538);try{__CLR4_4_11yb1yblb90p6nw.R.inc(2537);
        __CLR4_4_11yb1yblb90p6nw.R.inc(2539);if ((((maximalIterationCount > MIDPOINT_MAX_ITERATIONS_COUNT)&&(__CLR4_4_11yb1yblb90p6nw.R.iget(2540)!=0|true))||(__CLR4_4_11yb1yblb90p6nw.R.iget(2541)==0&false))) {{
            __CLR4_4_11yb1yblb90p6nw.R.inc(2542);throw new NumberIsTooLargeException(maximalIterationCount,
                                                MIDPOINT_MAX_ITERATIONS_COUNT, false);
        }
    }}finally{__CLR4_4_11yb1yblb90p6nw.R.flushNeeded();}}

    /**
     * Construct a midpoint integrator with default settings.
     * (max iteration count set to {@link #MIDPOINT_MAX_ITERATIONS_COUNT})
     */
    public MidPointIntegrator() {
        super(DEFAULT_MIN_ITERATIONS_COUNT, MIDPOINT_MAX_ITERATIONS_COUNT);__CLR4_4_11yb1yblb90p6nw.R.inc(2544);try{__CLR4_4_11yb1yblb90p6nw.R.inc(2543);
    }finally{__CLR4_4_11yb1yblb90p6nw.R.flushNeeded();}}

    /**
     * Compute the n-th stage integral of midpoint rule.
     * This function should only be called by API <code>integrate()</code> in the package.
     * To save time it does not verify arguments - caller does.
     * <p>
     * The interval is divided equally into 2^n sections rather than an
     * arbitrary m sections because this configuration can best utilize the
     * already computed values.</p>
     *
     * @param n the stage of 1/2 refinement. Must be larger than 0.
     * @param previousStageResult Result from the previous call to the
     * {@code stage} method.
     * @param min Lower bound of the integration interval.
     * @param diffMaxMin Difference between the lower bound and upper bound
     * of the integration interval.
     * @return the value of n-th stage integral
     * @throws TooManyEvaluationsException if the maximal number of evaluations
     * is exceeded.
     */
    private double stage(final int n,
                         double previousStageResult,
                         double min,
                         double diffMaxMin)
        throws TooManyEvaluationsException {try{__CLR4_4_11yb1yblb90p6nw.R.inc(2545);

        // number of new points in this stage
        __CLR4_4_11yb1yblb90p6nw.R.inc(2546);final long np = 1L << (n - 1);
        __CLR4_4_11yb1yblb90p6nw.R.inc(2547);double sum = 0;

        // spacing between adjacent new points
        __CLR4_4_11yb1yblb90p6nw.R.inc(2548);final double spacing = diffMaxMin / np;

        // the first new point
        __CLR4_4_11yb1yblb90p6nw.R.inc(2549);double x = min + 0.5 * spacing;
        __CLR4_4_11yb1yblb90p6nw.R.inc(2550);for (long i = 0; (((i < np)&&(__CLR4_4_11yb1yblb90p6nw.R.iget(2551)!=0|true))||(__CLR4_4_11yb1yblb90p6nw.R.iget(2552)==0&false)); i++) {{
            __CLR4_4_11yb1yblb90p6nw.R.inc(2553);sum += computeObjectiveValue(x);
            __CLR4_4_11yb1yblb90p6nw.R.inc(2554);x += spacing;
        }
        // add the new sum to previously calculated result
        }__CLR4_4_11yb1yblb90p6nw.R.inc(2555);return 0.5 * (previousStageResult + sum * spacing);
    }finally{__CLR4_4_11yb1yblb90p6nw.R.flushNeeded();}}


    /** {@inheritDoc} */
    @Override
    protected double doIntegrate()
        throws MathIllegalArgumentException, TooManyEvaluationsException, MaxCountExceededException {try{__CLR4_4_11yb1yblb90p6nw.R.inc(2556);

        __CLR4_4_11yb1yblb90p6nw.R.inc(2557);final double min = getMin();
        __CLR4_4_11yb1yblb90p6nw.R.inc(2558);final double diff = getMax() - min;
        __CLR4_4_11yb1yblb90p6nw.R.inc(2559);final double midPoint = min + 0.5 * diff;

        __CLR4_4_11yb1yblb90p6nw.R.inc(2560);double oldt = diff * computeObjectiveValue(midPoint);

        __CLR4_4_11yb1yblb90p6nw.R.inc(2561);while (true) {{
            __CLR4_4_11yb1yblb90p6nw.R.inc(2562);iterations.incrementCount();
            __CLR4_4_11yb1yblb90p6nw.R.inc(2563);final int i = iterations.getCount();
            __CLR4_4_11yb1yblb90p6nw.R.inc(2564);final double t = stage(i, oldt, min, diff);
            __CLR4_4_11yb1yblb90p6nw.R.inc(2565);if ((((i >= getMinimalIterationCount())&&(__CLR4_4_11yb1yblb90p6nw.R.iget(2566)!=0|true))||(__CLR4_4_11yb1yblb90p6nw.R.iget(2567)==0&false))) {{
                __CLR4_4_11yb1yblb90p6nw.R.inc(2568);final double delta = FastMath.abs(t - oldt);
                __CLR4_4_11yb1yblb90p6nw.R.inc(2569);final double rLimit =
                        getRelativeAccuracy() * (FastMath.abs(oldt) + FastMath.abs(t)) * 0.5;
                __CLR4_4_11yb1yblb90p6nw.R.inc(2570);if (((((delta <= rLimit) || (delta <= getAbsoluteAccuracy()))&&(__CLR4_4_11yb1yblb90p6nw.R.iget(2571)!=0|true))||(__CLR4_4_11yb1yblb90p6nw.R.iget(2572)==0&false))) {{
                    __CLR4_4_11yb1yblb90p6nw.R.inc(2573);return t;
                }
            }}
            }__CLR4_4_11yb1yblb90p6nw.R.inc(2574);oldt = t;
        }

    }}finally{__CLR4_4_11yb1yblb90p6nw.R.flushNeeded();}}

}
