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
 * Implements <a href="http://mathworld.wolfram.com/SimpsonsRule.html">
 * Simpson's Rule</a> for integration of real univariate functions. For
 * reference, see <b>Introduction to Numerical Analysis</b>, ISBN 038795452X,
 * chapter 3.
 * <p>
 * This implementation employs the basic trapezoid rule to calculate Simpson's
 * rule.</p>
 *
 * @version $Id$
 * @since 1.2
 */
public class SimpsonIntegrator extends BaseAbstractUnivariateIntegrator {public static class __CLR4_4_120t20tlb90p6of{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2658,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Maximal number of iterations for Simpson. */
    public static final int SIMPSON_MAX_ITERATIONS_COUNT = 64;

    /**
     * Build a Simpson integrator with given accuracies and iterations counts.
     * @param relativeAccuracy relative accuracy of the result
     * @param absoluteAccuracy absolute accuracy of the result
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * (must be less than or equal to {@link #SIMPSON_MAX_ITERATIONS_COUNT})
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     * @exception NumberIsTooLargeException if maximal number of iterations
     * is greater than {@link #SIMPSON_MAX_ITERATIONS_COUNT}
     */
    public SimpsonIntegrator(final double relativeAccuracy,
                             final double absoluteAccuracy,
                             final int minimalIterationCount,
                             final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException {
        super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);__CLR4_4_120t20tlb90p6of.R.inc(2622);try{__CLR4_4_120t20tlb90p6of.R.inc(2621);
        __CLR4_4_120t20tlb90p6of.R.inc(2623);if ((((maximalIterationCount > SIMPSON_MAX_ITERATIONS_COUNT)&&(__CLR4_4_120t20tlb90p6of.R.iget(2624)!=0|true))||(__CLR4_4_120t20tlb90p6of.R.iget(2625)==0&false))) {{
            __CLR4_4_120t20tlb90p6of.R.inc(2626);throw new NumberIsTooLargeException(maximalIterationCount,
                                                SIMPSON_MAX_ITERATIONS_COUNT, false);
        }
    }}finally{__CLR4_4_120t20tlb90p6of.R.flushNeeded();}}

    /**
     * Build a Simpson integrator with given iteration counts.
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * (must be less than or equal to {@link #SIMPSON_MAX_ITERATIONS_COUNT})
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     * @exception NumberIsTooLargeException if maximal number of iterations
     * is greater than {@link #SIMPSON_MAX_ITERATIONS_COUNT}
     */
    public SimpsonIntegrator(final int minimalIterationCount,
                             final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException {
        super(minimalIterationCount, maximalIterationCount);__CLR4_4_120t20tlb90p6of.R.inc(2628);try{__CLR4_4_120t20tlb90p6of.R.inc(2627);
        __CLR4_4_120t20tlb90p6of.R.inc(2629);if ((((maximalIterationCount > SIMPSON_MAX_ITERATIONS_COUNT)&&(__CLR4_4_120t20tlb90p6of.R.iget(2630)!=0|true))||(__CLR4_4_120t20tlb90p6of.R.iget(2631)==0&false))) {{
            __CLR4_4_120t20tlb90p6of.R.inc(2632);throw new NumberIsTooLargeException(maximalIterationCount,
                                                SIMPSON_MAX_ITERATIONS_COUNT, false);
        }
    }}finally{__CLR4_4_120t20tlb90p6of.R.flushNeeded();}}

    /**
     * Construct an integrator with default settings.
     * (max iteration count set to {@link #SIMPSON_MAX_ITERATIONS_COUNT})
     */
    public SimpsonIntegrator() {
        super(DEFAULT_MIN_ITERATIONS_COUNT, SIMPSON_MAX_ITERATIONS_COUNT);__CLR4_4_120t20tlb90p6of.R.inc(2634);try{__CLR4_4_120t20tlb90p6of.R.inc(2633);
    }finally{__CLR4_4_120t20tlb90p6of.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double doIntegrate()
        throws TooManyEvaluationsException, MaxCountExceededException {try{__CLR4_4_120t20tlb90p6of.R.inc(2635);

        __CLR4_4_120t20tlb90p6of.R.inc(2636);TrapezoidIntegrator qtrap = new TrapezoidIntegrator();
        __CLR4_4_120t20tlb90p6of.R.inc(2637);if ((((getMinimalIterationCount() == 1)&&(__CLR4_4_120t20tlb90p6of.R.iget(2638)!=0|true))||(__CLR4_4_120t20tlb90p6of.R.iget(2639)==0&false))) {{
            __CLR4_4_120t20tlb90p6of.R.inc(2640);return (4 * qtrap.stage(this, 1) - qtrap.stage(this, 0)) / 3.0;
        }

        // Simpson's rule requires at least two trapezoid stages.
        }__CLR4_4_120t20tlb90p6of.R.inc(2641);double olds = 0;
        __CLR4_4_120t20tlb90p6of.R.inc(2642);double oldt = qtrap.stage(this, 0);
        __CLR4_4_120t20tlb90p6of.R.inc(2643);while (true) {{
            __CLR4_4_120t20tlb90p6of.R.inc(2644);final double t = qtrap.stage(this, iterations.getCount());
            __CLR4_4_120t20tlb90p6of.R.inc(2645);iterations.incrementCount();
            __CLR4_4_120t20tlb90p6of.R.inc(2646);final double s = (4 * t - oldt) / 3.0;
            __CLR4_4_120t20tlb90p6of.R.inc(2647);if ((((iterations.getCount() >= getMinimalIterationCount())&&(__CLR4_4_120t20tlb90p6of.R.iget(2648)!=0|true))||(__CLR4_4_120t20tlb90p6of.R.iget(2649)==0&false))) {{
                __CLR4_4_120t20tlb90p6of.R.inc(2650);final double delta = FastMath.abs(s - olds);
                __CLR4_4_120t20tlb90p6of.R.inc(2651);final double rLimit =
                    getRelativeAccuracy() * (FastMath.abs(olds) + FastMath.abs(s)) * 0.5;
                __CLR4_4_120t20tlb90p6of.R.inc(2652);if (((((delta <= rLimit) || (delta <= getAbsoluteAccuracy()))&&(__CLR4_4_120t20tlb90p6of.R.iget(2653)!=0|true))||(__CLR4_4_120t20tlb90p6of.R.iget(2654)==0&false))) {{
                    __CLR4_4_120t20tlb90p6of.R.inc(2655);return s;
                }
            }}
            }__CLR4_4_120t20tlb90p6of.R.inc(2656);olds = s;
            __CLR4_4_120t20tlb90p6of.R.inc(2657);oldt = t;
        }

    }}finally{__CLR4_4_120t20tlb90p6of.R.flushNeeded();}}

}
