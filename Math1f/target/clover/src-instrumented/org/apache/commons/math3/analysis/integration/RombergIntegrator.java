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

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.util.FastMath;

/**
 * Implements the <a href="http://mathworld.wolfram.com/RombergIntegration.html">
 * Romberg Algorithm</a> for integration of real univariate functions. For
 * reference, see <b>Introduction to Numerical Analysis</b>, ISBN 038795452X,
 * chapter 3.
 * <p>
 * Romberg integration employs k successive refinements of the trapezoid
 * rule to remove error terms less than order O(N^(-2k)). Simpson's rule
 * is a special case of k = 2.</p>
 *
 * @version $Id$
 * @since 1.2
 */
public class RombergIntegrator extends BaseAbstractUnivariateIntegrator {public static class __CLR4_4_11zj1zjlb90p6o6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2621,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Maximal number of iterations for Romberg. */
    public static final int ROMBERG_MAX_ITERATIONS_COUNT = 32;

    /**
     * Build a Romberg integrator with given accuracies and iterations counts.
     * @param relativeAccuracy relative accuracy of the result
     * @param absoluteAccuracy absolute accuracy of the result
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * (must be less than or equal to {@link #ROMBERG_MAX_ITERATIONS_COUNT})
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     * @exception NumberIsTooLargeException if maximal number of iterations
     * is greater than {@link #ROMBERG_MAX_ITERATIONS_COUNT}
     */
    public RombergIntegrator(final double relativeAccuracy,
                             final double absoluteAccuracy,
                             final int minimalIterationCount,
                             final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException {
        super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);__CLR4_4_11zj1zjlb90p6o6.R.inc(2576);try{__CLR4_4_11zj1zjlb90p6o6.R.inc(2575);
        __CLR4_4_11zj1zjlb90p6o6.R.inc(2577);if ((((maximalIterationCount > ROMBERG_MAX_ITERATIONS_COUNT)&&(__CLR4_4_11zj1zjlb90p6o6.R.iget(2578)!=0|true))||(__CLR4_4_11zj1zjlb90p6o6.R.iget(2579)==0&false))) {{
            __CLR4_4_11zj1zjlb90p6o6.R.inc(2580);throw new NumberIsTooLargeException(maximalIterationCount,
                                                ROMBERG_MAX_ITERATIONS_COUNT, false);
        }
    }}finally{__CLR4_4_11zj1zjlb90p6o6.R.flushNeeded();}}

    /**
     * Build a Romberg integrator with given iteration counts.
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * (must be less than or equal to {@link #ROMBERG_MAX_ITERATIONS_COUNT})
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     * @exception NumberIsTooLargeException if maximal number of iterations
     * is greater than {@link #ROMBERG_MAX_ITERATIONS_COUNT}
     */
    public RombergIntegrator(final int minimalIterationCount,
                             final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException {
        super(minimalIterationCount, maximalIterationCount);__CLR4_4_11zj1zjlb90p6o6.R.inc(2582);try{__CLR4_4_11zj1zjlb90p6o6.R.inc(2581);
        __CLR4_4_11zj1zjlb90p6o6.R.inc(2583);if ((((maximalIterationCount > ROMBERG_MAX_ITERATIONS_COUNT)&&(__CLR4_4_11zj1zjlb90p6o6.R.iget(2584)!=0|true))||(__CLR4_4_11zj1zjlb90p6o6.R.iget(2585)==0&false))) {{
            __CLR4_4_11zj1zjlb90p6o6.R.inc(2586);throw new NumberIsTooLargeException(maximalIterationCount,
                                                ROMBERG_MAX_ITERATIONS_COUNT, false);
        }
    }}finally{__CLR4_4_11zj1zjlb90p6o6.R.flushNeeded();}}

    /**
     * Construct a Romberg integrator with default settings
     * (max iteration count set to {@link #ROMBERG_MAX_ITERATIONS_COUNT})
     */
    public RombergIntegrator() {
        super(DEFAULT_MIN_ITERATIONS_COUNT, ROMBERG_MAX_ITERATIONS_COUNT);__CLR4_4_11zj1zjlb90p6o6.R.inc(2588);try{__CLR4_4_11zj1zjlb90p6o6.R.inc(2587);
    }finally{__CLR4_4_11zj1zjlb90p6o6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double doIntegrate()
        throws TooManyEvaluationsException, MaxCountExceededException {try{__CLR4_4_11zj1zjlb90p6o6.R.inc(2589);

        __CLR4_4_11zj1zjlb90p6o6.R.inc(2590);final int m = iterations.getMaximalCount() + 1;
        __CLR4_4_11zj1zjlb90p6o6.R.inc(2591);double previousRow[] = new double[m];
        __CLR4_4_11zj1zjlb90p6o6.R.inc(2592);double currentRow[]  = new double[m];

        __CLR4_4_11zj1zjlb90p6o6.R.inc(2593);TrapezoidIntegrator qtrap = new TrapezoidIntegrator();
        __CLR4_4_11zj1zjlb90p6o6.R.inc(2594);currentRow[0] = qtrap.stage(this, 0);
        __CLR4_4_11zj1zjlb90p6o6.R.inc(2595);iterations.incrementCount();
        __CLR4_4_11zj1zjlb90p6o6.R.inc(2596);double olds = currentRow[0];
        __CLR4_4_11zj1zjlb90p6o6.R.inc(2597);while (true) {{

            __CLR4_4_11zj1zjlb90p6o6.R.inc(2598);final int i = iterations.getCount();

            // switch rows
            __CLR4_4_11zj1zjlb90p6o6.R.inc(2599);final double[] tmpRow = previousRow;
            __CLR4_4_11zj1zjlb90p6o6.R.inc(2600);previousRow = currentRow;
            __CLR4_4_11zj1zjlb90p6o6.R.inc(2601);currentRow = tmpRow;

            __CLR4_4_11zj1zjlb90p6o6.R.inc(2602);currentRow[0] = qtrap.stage(this, i);
            __CLR4_4_11zj1zjlb90p6o6.R.inc(2603);iterations.incrementCount();
            __CLR4_4_11zj1zjlb90p6o6.R.inc(2604);for (int j = 1; (((j <= i)&&(__CLR4_4_11zj1zjlb90p6o6.R.iget(2605)!=0|true))||(__CLR4_4_11zj1zjlb90p6o6.R.iget(2606)==0&false)); j++) {{
                // Richardson extrapolation coefficient
                __CLR4_4_11zj1zjlb90p6o6.R.inc(2607);final double r = (1L << (2 * j)) - 1;
                __CLR4_4_11zj1zjlb90p6o6.R.inc(2608);final double tIJm1 = currentRow[j - 1];
                __CLR4_4_11zj1zjlb90p6o6.R.inc(2609);currentRow[j] = tIJm1 + (tIJm1 - previousRow[j - 1]) / r;
            }
            }__CLR4_4_11zj1zjlb90p6o6.R.inc(2610);final double s = currentRow[i];
            __CLR4_4_11zj1zjlb90p6o6.R.inc(2611);if ((((i >= getMinimalIterationCount())&&(__CLR4_4_11zj1zjlb90p6o6.R.iget(2612)!=0|true))||(__CLR4_4_11zj1zjlb90p6o6.R.iget(2613)==0&false))) {{
                __CLR4_4_11zj1zjlb90p6o6.R.inc(2614);final double delta  = FastMath.abs(s - olds);
                __CLR4_4_11zj1zjlb90p6o6.R.inc(2615);final double rLimit = getRelativeAccuracy() * (FastMath.abs(olds) + FastMath.abs(s)) * 0.5;
                __CLR4_4_11zj1zjlb90p6o6.R.inc(2616);if (((((delta <= rLimit) || (delta <= getAbsoluteAccuracy()))&&(__CLR4_4_11zj1zjlb90p6o6.R.iget(2617)!=0|true))||(__CLR4_4_11zj1zjlb90p6o6.R.iget(2618)==0&false))) {{
                    __CLR4_4_11zj1zjlb90p6o6.R.inc(2619);return s;
                }
            }}
            }__CLR4_4_11zj1zjlb90p6o6.R.inc(2620);olds = s;
        }

    }}finally{__CLR4_4_11zj1zjlb90p6o6.R.flushNeeded();}}

}
