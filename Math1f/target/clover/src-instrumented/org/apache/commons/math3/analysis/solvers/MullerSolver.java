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

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;

/**
 * This class implements the <a href="http://mathworld.wolfram.com/MullersMethod.html">
 * Muller's Method</a> for root finding of real univariate functions. For
 * reference, see <b>Elementary Numerical Analysis</b>, ISBN 0070124477,
 * chapter 3.
 * <p>
 * Muller's method applies to both real and complex functions, but here we
 * restrict ourselves to real functions.
 * This class differs from {@link MullerSolver} in the way it avoids complex
 * operations.</p>
 * Muller's original method would have function evaluation at complex point.
 * Since our f(x) is real, we have to find ways to avoid that. Bracketing
 * condition is one way to go: by requiring bracketing in every iteration,
 * the newly computed approximation is guaranteed to be real.</p>
 * <p>
 * Normally Muller's method converges quadratically in the vicinity of a
 * zero, however it may be very slow in regions far away from zeros. For
 * example, f(x) = exp(x) - 1, min = -50, max = 100. In such case we use
 * bisection as a safety backup if it performs very poorly.</p>
 * <p>
 * The formulas here use divided differences directly.</p>
 *
 * @version $Id$
 * @since 1.2
 * @see MullerSolver2
 */
public class MullerSolver extends AbstractUnivariateSolver {public static class __CLR4_4_14gn4gnlb90p75e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5875,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default absolute accuracy. */
    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /**
     * Construct a solver with default accuracy (1e-6).
     */
    public MullerSolver() {
        this(DEFAULT_ABSOLUTE_ACCURACY);__CLR4_4_14gn4gnlb90p75e.R.inc(5784);try{__CLR4_4_14gn4gnlb90p75e.R.inc(5783);
    }finally{__CLR4_4_14gn4gnlb90p75e.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     */
    public MullerSolver(double absoluteAccuracy) {
        super(absoluteAccuracy);__CLR4_4_14gn4gnlb90p75e.R.inc(5786);try{__CLR4_4_14gn4gnlb90p75e.R.inc(5785);
    }finally{__CLR4_4_14gn4gnlb90p75e.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     */
    public MullerSolver(double relativeAccuracy,
                        double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_14gn4gnlb90p75e.R.inc(5788);try{__CLR4_4_14gn4gnlb90p75e.R.inc(5787);
    }finally{__CLR4_4_14gn4gnlb90p75e.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected double doSolve()
        throws TooManyEvaluationsException,
               NumberIsTooLargeException,
               NoBracketingException {try{__CLR4_4_14gn4gnlb90p75e.R.inc(5789);
        __CLR4_4_14gn4gnlb90p75e.R.inc(5790);final double min = getMin();
        __CLR4_4_14gn4gnlb90p75e.R.inc(5791);final double max = getMax();
        __CLR4_4_14gn4gnlb90p75e.R.inc(5792);final double initial = getStartValue();

        __CLR4_4_14gn4gnlb90p75e.R.inc(5793);final double functionValueAccuracy = getFunctionValueAccuracy();

        __CLR4_4_14gn4gnlb90p75e.R.inc(5794);verifySequence(min, initial, max);

        // check for zeros before verifying bracketing
        __CLR4_4_14gn4gnlb90p75e.R.inc(5795);final double fMin = computeObjectiveValue(min);
        __CLR4_4_14gn4gnlb90p75e.R.inc(5796);if ((((FastMath.abs(fMin) < functionValueAccuracy)&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5797)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5798)==0&false))) {{
            __CLR4_4_14gn4gnlb90p75e.R.inc(5799);return min;
        }
        }__CLR4_4_14gn4gnlb90p75e.R.inc(5800);final double fMax = computeObjectiveValue(max);
        __CLR4_4_14gn4gnlb90p75e.R.inc(5801);if ((((FastMath.abs(fMax) < functionValueAccuracy)&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5802)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5803)==0&false))) {{
            __CLR4_4_14gn4gnlb90p75e.R.inc(5804);return max;
        }
        }__CLR4_4_14gn4gnlb90p75e.R.inc(5805);final double fInitial = computeObjectiveValue(initial);
        __CLR4_4_14gn4gnlb90p75e.R.inc(5806);if ((((FastMath.abs(fInitial) <  functionValueAccuracy)&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5807)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5808)==0&false))) {{
            __CLR4_4_14gn4gnlb90p75e.R.inc(5809);return initial;
        }

        }__CLR4_4_14gn4gnlb90p75e.R.inc(5810);verifyBracketing(min, max);

        __CLR4_4_14gn4gnlb90p75e.R.inc(5811);if ((((isBracketing(min, initial))&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5812)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5813)==0&false))) {{
            __CLR4_4_14gn4gnlb90p75e.R.inc(5814);return solve(min, initial, fMin, fInitial);
        } }else {{
            __CLR4_4_14gn4gnlb90p75e.R.inc(5815);return solve(initial, max, fInitial, fMax);
        }
    }}finally{__CLR4_4_14gn4gnlb90p75e.R.flushNeeded();}}

    /**
     * Find a real root in the given interval.
     *
     * @param min Lower bound for the interval.
     * @param max Upper bound for the interval.
     * @param fMin function value at the lower bound.
     * @param fMax function value at the upper bound.
     * @return the point at which the function value is zero.
     * @throws TooManyEvaluationsException if the allowed number of calls to
     * the function to be solved has been exhausted.
     */
    private double solve(double min, double max,
                         double fMin, double fMax)
        throws TooManyEvaluationsException {try{__CLR4_4_14gn4gnlb90p75e.R.inc(5816);
        __CLR4_4_14gn4gnlb90p75e.R.inc(5817);final double relativeAccuracy = getRelativeAccuracy();
        __CLR4_4_14gn4gnlb90p75e.R.inc(5818);final double absoluteAccuracy = getAbsoluteAccuracy();
        __CLR4_4_14gn4gnlb90p75e.R.inc(5819);final double functionValueAccuracy = getFunctionValueAccuracy();

        // [x0, x2] is the bracketing interval in each iteration
        // x1 is the last approximation and an interpolation point in (x0, x2)
        // x is the new root approximation and new x1 for next round
        // d01, d12, d012 are divided differences

        __CLR4_4_14gn4gnlb90p75e.R.inc(5820);double x0 = min;
        __CLR4_4_14gn4gnlb90p75e.R.inc(5821);double y0 = fMin;
        __CLR4_4_14gn4gnlb90p75e.R.inc(5822);double x2 = max;
        __CLR4_4_14gn4gnlb90p75e.R.inc(5823);double y2 = fMax;
        __CLR4_4_14gn4gnlb90p75e.R.inc(5824);double x1 = 0.5 * (x0 + x2);
        __CLR4_4_14gn4gnlb90p75e.R.inc(5825);double y1 = computeObjectiveValue(x1);

        __CLR4_4_14gn4gnlb90p75e.R.inc(5826);double oldx = Double.POSITIVE_INFINITY;
        __CLR4_4_14gn4gnlb90p75e.R.inc(5827);while (true) {{
            // Muller's method employs quadratic interpolation through
            // x0, x1, x2 and x is the zero of the interpolating parabola.
            // Due to bracketing condition, this parabola must have two
            // real roots and we choose one in [x0, x2] to be x.
            __CLR4_4_14gn4gnlb90p75e.R.inc(5828);final double d01 = (y1 - y0) / (x1 - x0);
            __CLR4_4_14gn4gnlb90p75e.R.inc(5829);final double d12 = (y2 - y1) / (x2 - x1);
            __CLR4_4_14gn4gnlb90p75e.R.inc(5830);final double d012 = (d12 - d01) / (x2 - x0);
            __CLR4_4_14gn4gnlb90p75e.R.inc(5831);final double c1 = d01 + (x1 - x0) * d012;
            __CLR4_4_14gn4gnlb90p75e.R.inc(5832);final double delta = c1 * c1 - 4 * y1 * d012;
            __CLR4_4_14gn4gnlb90p75e.R.inc(5833);final double xplus = x1 + (-2.0 * y1) / (c1 + FastMath.sqrt(delta));
            __CLR4_4_14gn4gnlb90p75e.R.inc(5834);final double xminus = x1 + (-2.0 * y1) / (c1 - FastMath.sqrt(delta));
            // xplus and xminus are two roots of parabola and at least
            // one of them should lie in (x0, x2)
            __CLR4_4_14gn4gnlb90p75e.R.inc(5835);final double x = (((isSequence(x0, xplus, x2) )&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5836)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5837)==0&false))? xplus : xminus;
            __CLR4_4_14gn4gnlb90p75e.R.inc(5838);final double y = computeObjectiveValue(x);

            // check for convergence
            __CLR4_4_14gn4gnlb90p75e.R.inc(5839);final double tolerance = FastMath.max(relativeAccuracy * FastMath.abs(x), absoluteAccuracy);
            __CLR4_4_14gn4gnlb90p75e.R.inc(5840);if ((((FastMath.abs(x - oldx) <= tolerance ||
                FastMath.abs(y) <= functionValueAccuracy)&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5841)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5842)==0&false))) {{
                __CLR4_4_14gn4gnlb90p75e.R.inc(5843);return x;
            }

            // Bisect if convergence is too slow. Bisection would waste
            // our calculation of x, hopefully it won't happen often.
            // the real number equality test x == x1 is intentional and
            // completes the proximity tests above it
            }__CLR4_4_14gn4gnlb90p75e.R.inc(5844);boolean bisect = (x < x1 && (x1 - x0) > 0.95 * (x2 - x0)) ||
                             (x > x1 && (x2 - x1) > 0.95 * (x2 - x0)) ||
                             (x == x1);
            // prepare the new bracketing interval for next iteration
            __CLR4_4_14gn4gnlb90p75e.R.inc(5845);if ((((!bisect)&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5846)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5847)==0&false))) {{
                __CLR4_4_14gn4gnlb90p75e.R.inc(5848);x0 = (((x < x1 )&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5849)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5850)==0&false))? x0 : x1;
                __CLR4_4_14gn4gnlb90p75e.R.inc(5851);y0 = (((x < x1 )&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5852)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5853)==0&false))? y0 : y1;
                __CLR4_4_14gn4gnlb90p75e.R.inc(5854);x2 = (((x > x1 )&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5855)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5856)==0&false))? x2 : x1;
                __CLR4_4_14gn4gnlb90p75e.R.inc(5857);y2 = (((x > x1 )&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5858)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5859)==0&false))? y2 : y1;
                __CLR4_4_14gn4gnlb90p75e.R.inc(5860);x1 = x; __CLR4_4_14gn4gnlb90p75e.R.inc(5861);y1 = y;
                __CLR4_4_14gn4gnlb90p75e.R.inc(5862);oldx = x;
            } }else {{
                __CLR4_4_14gn4gnlb90p75e.R.inc(5863);double xm = 0.5 * (x0 + x2);
                __CLR4_4_14gn4gnlb90p75e.R.inc(5864);double ym = computeObjectiveValue(xm);
                __CLR4_4_14gn4gnlb90p75e.R.inc(5865);if ((((FastMath.signum(y0) + FastMath.signum(ym) == 0.0)&&(__CLR4_4_14gn4gnlb90p75e.R.iget(5866)!=0|true))||(__CLR4_4_14gn4gnlb90p75e.R.iget(5867)==0&false))) {{
                    __CLR4_4_14gn4gnlb90p75e.R.inc(5868);x2 = xm; __CLR4_4_14gn4gnlb90p75e.R.inc(5869);y2 = ym;
                } }else {{
                    __CLR4_4_14gn4gnlb90p75e.R.inc(5870);x0 = xm; __CLR4_4_14gn4gnlb90p75e.R.inc(5871);y0 = ym;
                }
                }__CLR4_4_14gn4gnlb90p75e.R.inc(5872);x1 = 0.5 * (x0 + x2);
                __CLR4_4_14gn4gnlb90p75e.R.inc(5873);y1 = computeObjectiveValue(x1);
                __CLR4_4_14gn4gnlb90p75e.R.inc(5874);oldx = Double.POSITIVE_INFINITY;
            }
        }}
    }}finally{__CLR4_4_14gn4gnlb90p75e.R.flushNeeded();}}
}
