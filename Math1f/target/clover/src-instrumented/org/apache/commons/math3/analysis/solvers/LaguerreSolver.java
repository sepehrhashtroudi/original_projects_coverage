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

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexUtils;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * Implements the <a href="http://mathworld.wolfram.com/LaguerresMethod.html">
 * Laguerre's Method</a> for root finding of real coefficient polynomials.
 * For reference, see
 * <quote>
 *  <b>A First Course in Numerical Analysis</b>
 *  ISBN 048641454X, chapter 8.
 * </quote>
 * Laguerre's method is global in the sense that it can start with any initial
 * approximation and be able to solve all roots from that point.
 * The algorithm requires a bracketing condition.
 *
 * @version $Id$
 * @since 1.2
 */
public class LaguerreSolver extends AbstractPolynomialSolver {public static class __CLR4_4_14cb4cblb90p74z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5783,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default absolute accuracy. */
    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;
    /** Complex solver. */
    private final ComplexSolver complexSolver = new ComplexSolver();

    /**
     * Construct a solver with default accuracy (1e-6).
     */
    public LaguerreSolver() {
        this(DEFAULT_ABSOLUTE_ACCURACY);__CLR4_4_14cb4cblb90p74z.R.inc(5628);try{__CLR4_4_14cb4cblb90p74z.R.inc(5627);
    }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     */
    public LaguerreSolver(double absoluteAccuracy) {
        super(absoluteAccuracy);__CLR4_4_14cb4cblb90p74z.R.inc(5630);try{__CLR4_4_14cb4cblb90p74z.R.inc(5629);
    }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     */
    public LaguerreSolver(double relativeAccuracy,
                          double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_14cb4cblb90p74z.R.inc(5632);try{__CLR4_4_14cb4cblb90p74z.R.inc(5631);
    }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     * @param functionValueAccuracy Function value accuracy.
     */
    public LaguerreSolver(double relativeAccuracy,
                          double absoluteAccuracy,
                          double functionValueAccuracy) {
        super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);__CLR4_4_14cb4cblb90p74z.R.inc(5634);try{__CLR4_4_14cb4cblb90p74z.R.inc(5633);
    }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double doSolve()
        throws TooManyEvaluationsException,
               NumberIsTooLargeException,
               NoBracketingException {try{__CLR4_4_14cb4cblb90p74z.R.inc(5635);
        __CLR4_4_14cb4cblb90p74z.R.inc(5636);final double min = getMin();
        __CLR4_4_14cb4cblb90p74z.R.inc(5637);final double max = getMax();
        __CLR4_4_14cb4cblb90p74z.R.inc(5638);final double initial = getStartValue();
        __CLR4_4_14cb4cblb90p74z.R.inc(5639);final double functionValueAccuracy = getFunctionValueAccuracy();

        __CLR4_4_14cb4cblb90p74z.R.inc(5640);verifySequence(min, initial, max);

        // Return the initial guess if it is good enough.
        __CLR4_4_14cb4cblb90p74z.R.inc(5641);final double yInitial = computeObjectiveValue(initial);
        __CLR4_4_14cb4cblb90p74z.R.inc(5642);if ((((FastMath.abs(yInitial) <= functionValueAccuracy)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5643)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5644)==0&false))) {{
            __CLR4_4_14cb4cblb90p74z.R.inc(5645);return initial;
        }

        // Return the first endpoint if it is good enough.
        }__CLR4_4_14cb4cblb90p74z.R.inc(5646);final double yMin = computeObjectiveValue(min);
        __CLR4_4_14cb4cblb90p74z.R.inc(5647);if ((((FastMath.abs(yMin) <= functionValueAccuracy)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5648)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5649)==0&false))) {{
            __CLR4_4_14cb4cblb90p74z.R.inc(5650);return min;
        }

        // Reduce interval if min and initial bracket the root.
        }__CLR4_4_14cb4cblb90p74z.R.inc(5651);if ((((yInitial * yMin < 0)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5652)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5653)==0&false))) {{
            __CLR4_4_14cb4cblb90p74z.R.inc(5654);return laguerre(min, initial, yMin, yInitial);
        }

        // Return the second endpoint if it is good enough.
        }__CLR4_4_14cb4cblb90p74z.R.inc(5655);final double yMax = computeObjectiveValue(max);
        __CLR4_4_14cb4cblb90p74z.R.inc(5656);if ((((FastMath.abs(yMax) <= functionValueAccuracy)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5657)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5658)==0&false))) {{
            __CLR4_4_14cb4cblb90p74z.R.inc(5659);return max;
        }

        // Reduce interval if initial and max bracket the root.
        }__CLR4_4_14cb4cblb90p74z.R.inc(5660);if ((((yInitial * yMax < 0)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5661)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5662)==0&false))) {{
            __CLR4_4_14cb4cblb90p74z.R.inc(5663);return laguerre(initial, max, yInitial, yMax);
        }

        }__CLR4_4_14cb4cblb90p74z.R.inc(5664);throw new NoBracketingException(min, max, yMin, yMax);
    }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}

    /**
     * Find a real root in the given interval.
     *
     * Despite the bracketing condition, the root returned by
     * {@link LaguerreSolver.ComplexSolver#solve(Complex[],Complex)} may
     * not be a real zero inside {@code [min, max]}.
     * For example, <code>p(x) = x<sup>3</sup> + 1,</code>
     * with {@code min = -2}, {@code max = 2}, {@code initial = 0}.
     * When it occurs, this code calls
     * {@link LaguerreSolver.ComplexSolver#solveAll(Complex[],Complex)}
     * in order to obtain all roots and picks up one real root.
     *
     * @param lo Lower bound of the search interval.
     * @param hi Higher bound of the search interval.
     * @param fLo Function value at the lower bound of the search interval.
     * @param fHi Function value at the higher bound of the search interval.
     * @return the point at which the function value is zero.
     * @deprecated This method should not be part of the public API: It will
     * be made private in version 4.0.
     */
    @Deprecated
    public double laguerre(double lo, double hi,
                           double fLo, double fHi) {try{__CLR4_4_14cb4cblb90p74z.R.inc(5665);
        __CLR4_4_14cb4cblb90p74z.R.inc(5666);final Complex c[] = ComplexUtils.convertToComplex(getCoefficients());

        __CLR4_4_14cb4cblb90p74z.R.inc(5667);final Complex initial = new Complex(0.5 * (lo + hi), 0);
        __CLR4_4_14cb4cblb90p74z.R.inc(5668);final Complex z = complexSolver.solve(c, initial);
        __CLR4_4_14cb4cblb90p74z.R.inc(5669);if ((((complexSolver.isRoot(lo, hi, z))&&(__CLR4_4_14cb4cblb90p74z.R.iget(5670)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5671)==0&false))) {{
            __CLR4_4_14cb4cblb90p74z.R.inc(5672);return z.getReal();
        } }else {{
            __CLR4_4_14cb4cblb90p74z.R.inc(5673);double r = Double.NaN;
            // Solve all roots and select the one we are seeking.
            __CLR4_4_14cb4cblb90p74z.R.inc(5674);Complex[] root = complexSolver.solveAll(c, initial);
            __CLR4_4_14cb4cblb90p74z.R.inc(5675);for (int i = 0; (((i < root.length)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5676)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5677)==0&false)); i++) {{
                __CLR4_4_14cb4cblb90p74z.R.inc(5678);if ((((complexSolver.isRoot(lo, hi, root[i]))&&(__CLR4_4_14cb4cblb90p74z.R.iget(5679)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5680)==0&false))) {{
                    __CLR4_4_14cb4cblb90p74z.R.inc(5681);r = root[i].getReal();
                    __CLR4_4_14cb4cblb90p74z.R.inc(5682);break;
                }
            }}
            }__CLR4_4_14cb4cblb90p74z.R.inc(5683);return r;
        }
    }}finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}

    /**
     * Find all complex roots for the polynomial with the given
     * coefficients, starting from the given initial value.
     * <br/>
     * Note: This method is not part of the API of {@link BaseUnivariateSolver}.
     *
     * @param coefficients Polynomial coefficients.
     * @param initial Start value.
     * @return the point at which the function value is zero.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximum number of evaluations is exceeded.
     * @throws NullArgumentException if the {@code coefficients} is
     * {@code null}.
     * @throws NoDataException if the {@code coefficients} array is empty.
     * @since 3.1
     */
    public Complex[] solveAllComplex(double[] coefficients,
                                     double initial)
        throws NullArgumentException,
               NoDataException,
               TooManyEvaluationsException {try{__CLR4_4_14cb4cblb90p74z.R.inc(5684);
        __CLR4_4_14cb4cblb90p74z.R.inc(5685);setup(Integer.MAX_VALUE,
              new PolynomialFunction(coefficients),
              Double.NEGATIVE_INFINITY,
              Double.POSITIVE_INFINITY,
              initial);
        __CLR4_4_14cb4cblb90p74z.R.inc(5686);return complexSolver.solveAll(ComplexUtils.convertToComplex(coefficients),
                                      new Complex(initial, 0d));
    }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}

    /**
     * Find a complex root for the polynomial with the given coefficients,
     * starting from the given initial value.
     * <br/>
     * Note: This method is not part of the API of {@link BaseUnivariateSolver}.
     *
     * @param coefficients Polynomial coefficients.
     * @param initial Start value.
     * @return the point at which the function value is zero.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximum number of evaluations is exceeded.
     * @throws NullArgumentException if the {@code coefficients} is
     * {@code null}.
     * @throws NoDataException if the {@code coefficients} array is empty.
     * @since 3.1
     */
    public Complex solveComplex(double[] coefficients,
                                double initial)
        throws NullArgumentException,
               NoDataException,
               TooManyEvaluationsException {try{__CLR4_4_14cb4cblb90p74z.R.inc(5687);
        __CLR4_4_14cb4cblb90p74z.R.inc(5688);setup(Integer.MAX_VALUE,
              new PolynomialFunction(coefficients),
              Double.NEGATIVE_INFINITY,
              Double.POSITIVE_INFINITY,
              initial);
        __CLR4_4_14cb4cblb90p74z.R.inc(5689);return complexSolver.solve(ComplexUtils.convertToComplex(coefficients),
                                   new Complex(initial, 0d));
    }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}

    /**
     * Class for searching all (complex) roots.
     */
    private class ComplexSolver {
        /**
         * Check whether the given complex root is actually a real zero
         * in the given interval, within the solver tolerance level.
         *
         * @param min Lower bound for the interval.
         * @param max Upper bound for the interval.
         * @param z Complex root.
         * @return {@code true} if z is a real zero.
         */
        public boolean isRoot(double min, double max, Complex z) {try{__CLR4_4_14cb4cblb90p74z.R.inc(5690);
            __CLR4_4_14cb4cblb90p74z.R.inc(5691);if ((((isSequence(min, z.getReal(), max))&&(__CLR4_4_14cb4cblb90p74z.R.iget(5692)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5693)==0&false))) {{
                __CLR4_4_14cb4cblb90p74z.R.inc(5694);double tolerance = FastMath.max(getRelativeAccuracy() * z.abs(), getAbsoluteAccuracy());
                __CLR4_4_14cb4cblb90p74z.R.inc(5695);return (FastMath.abs(z.getImaginary()) <= tolerance) ||
                     (z.abs() <= getFunctionValueAccuracy());
            }
            }__CLR4_4_14cb4cblb90p74z.R.inc(5696);return false;
        }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}

        /**
         * Find all complex roots for the polynomial with the given
         * coefficients, starting from the given initial value.
         *
         * @param coefficients Polynomial coefficients.
         * @param initial Start value.
         * @return the point at which the function value is zero.
         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
         * if the maximum number of evaluations is exceeded.
         * @throws NullArgumentException if the {@code coefficients} is
         * {@code null}.
         * @throws NoDataException if the {@code coefficients} array is empty.
         */
        public Complex[] solveAll(Complex coefficients[], Complex initial)
            throws NullArgumentException,
                   NoDataException,
                   TooManyEvaluationsException {try{__CLR4_4_14cb4cblb90p74z.R.inc(5697);
            __CLR4_4_14cb4cblb90p74z.R.inc(5698);if ((((coefficients == null)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5699)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5700)==0&false))) {{
                __CLR4_4_14cb4cblb90p74z.R.inc(5701);throw new NullArgumentException();
            }
            }__CLR4_4_14cb4cblb90p74z.R.inc(5702);final int n = coefficients.length - 1;
            __CLR4_4_14cb4cblb90p74z.R.inc(5703);if ((((n == 0)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5704)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5705)==0&false))) {{
                __CLR4_4_14cb4cblb90p74z.R.inc(5706);throw new NoDataException(LocalizedFormats.POLYNOMIAL);
            }
            // Coefficients for deflated polynomial.
            }__CLR4_4_14cb4cblb90p74z.R.inc(5707);final Complex c[] = new Complex[n + 1];
            __CLR4_4_14cb4cblb90p74z.R.inc(5708);for (int i = 0; (((i <= n)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5709)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5710)==0&false)); i++) {{
                __CLR4_4_14cb4cblb90p74z.R.inc(5711);c[i] = coefficients[i];
            }

            // Solve individual roots successively.
            }__CLR4_4_14cb4cblb90p74z.R.inc(5712);final Complex root[] = new Complex[n];
            __CLR4_4_14cb4cblb90p74z.R.inc(5713);for (int i = 0; (((i < n)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5714)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5715)==0&false)); i++) {{
                __CLR4_4_14cb4cblb90p74z.R.inc(5716);final Complex subarray[] = new Complex[n - i + 1];
                __CLR4_4_14cb4cblb90p74z.R.inc(5717);System.arraycopy(c, 0, subarray, 0, subarray.length);
                __CLR4_4_14cb4cblb90p74z.R.inc(5718);root[i] = solve(subarray, initial);
                // Polynomial deflation using synthetic division.
                __CLR4_4_14cb4cblb90p74z.R.inc(5719);Complex newc = c[n - i];
                __CLR4_4_14cb4cblb90p74z.R.inc(5720);Complex oldc = null;
                __CLR4_4_14cb4cblb90p74z.R.inc(5721);for (int j = n - i - 1; (((j >= 0)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5722)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5723)==0&false)); j--) {{
                    __CLR4_4_14cb4cblb90p74z.R.inc(5724);oldc = c[j];
                    __CLR4_4_14cb4cblb90p74z.R.inc(5725);c[j] = newc;
                    __CLR4_4_14cb4cblb90p74z.R.inc(5726);newc = oldc.add(newc.multiply(root[i]));
                }
            }}

            }__CLR4_4_14cb4cblb90p74z.R.inc(5727);return root;
        }finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}

        /**
         * Find a complex root for the polynomial with the given coefficients,
         * starting from the given initial value.
         *
         * @param coefficients Polynomial coefficients.
         * @param initial Start value.
         * @return the point at which the function value is zero.
         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
         * if the maximum number of evaluations is exceeded.
         * @throws NullArgumentException if the {@code coefficients} is
         * {@code null}.
         * @throws NoDataException if the {@code coefficients} array is empty.
         */
        public Complex solve(Complex coefficients[], Complex initial)
            throws NullArgumentException,
                   NoDataException,
                   TooManyEvaluationsException {try{__CLR4_4_14cb4cblb90p74z.R.inc(5728);
            __CLR4_4_14cb4cblb90p74z.R.inc(5729);if ((((coefficients == null)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5730)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5731)==0&false))) {{
                __CLR4_4_14cb4cblb90p74z.R.inc(5732);throw new NullArgumentException();
            }

            }__CLR4_4_14cb4cblb90p74z.R.inc(5733);final int n = coefficients.length - 1;
            __CLR4_4_14cb4cblb90p74z.R.inc(5734);if ((((n == 0)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5735)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5736)==0&false))) {{
                __CLR4_4_14cb4cblb90p74z.R.inc(5737);throw new NoDataException(LocalizedFormats.POLYNOMIAL);
            }

            }__CLR4_4_14cb4cblb90p74z.R.inc(5738);final double absoluteAccuracy = getAbsoluteAccuracy();
            __CLR4_4_14cb4cblb90p74z.R.inc(5739);final double relativeAccuracy = getRelativeAccuracy();
            __CLR4_4_14cb4cblb90p74z.R.inc(5740);final double functionValueAccuracy = getFunctionValueAccuracy();

            __CLR4_4_14cb4cblb90p74z.R.inc(5741);final Complex nC  = new Complex(n, 0);
            __CLR4_4_14cb4cblb90p74z.R.inc(5742);final Complex n1C = new Complex(n - 1, 0);

            __CLR4_4_14cb4cblb90p74z.R.inc(5743);Complex z = initial;
            __CLR4_4_14cb4cblb90p74z.R.inc(5744);Complex oldz = new Complex(Double.POSITIVE_INFINITY,
                                       Double.POSITIVE_INFINITY);
            __CLR4_4_14cb4cblb90p74z.R.inc(5745);while (true) {{
                // Compute pv (polynomial value), dv (derivative value), and
                // d2v (second derivative value) simultaneously.
                __CLR4_4_14cb4cblb90p74z.R.inc(5746);Complex pv = coefficients[n];
                __CLR4_4_14cb4cblb90p74z.R.inc(5747);Complex dv = Complex.ZERO;
                __CLR4_4_14cb4cblb90p74z.R.inc(5748);Complex d2v = Complex.ZERO;
                __CLR4_4_14cb4cblb90p74z.R.inc(5749);for (int j = n-1; (((j >= 0)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5750)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5751)==0&false)); j--) {{
                    __CLR4_4_14cb4cblb90p74z.R.inc(5752);d2v = dv.add(z.multiply(d2v));
                    __CLR4_4_14cb4cblb90p74z.R.inc(5753);dv = pv.add(z.multiply(dv));
                    __CLR4_4_14cb4cblb90p74z.R.inc(5754);pv = coefficients[j].add(z.multiply(pv));
                }
                }__CLR4_4_14cb4cblb90p74z.R.inc(5755);d2v = d2v.multiply(new Complex(2.0, 0.0));

                // Check for convergence.
                __CLR4_4_14cb4cblb90p74z.R.inc(5756);final double tolerance = FastMath.max(relativeAccuracy * z.abs(),
                                                      absoluteAccuracy);
                __CLR4_4_14cb4cblb90p74z.R.inc(5757);if (((((z.subtract(oldz)).abs() <= tolerance)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5758)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5759)==0&false))) {{
                    __CLR4_4_14cb4cblb90p74z.R.inc(5760);return z;
                }
                }__CLR4_4_14cb4cblb90p74z.R.inc(5761);if ((((pv.abs() <= functionValueAccuracy)&&(__CLR4_4_14cb4cblb90p74z.R.iget(5762)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5763)==0&false))) {{
                    __CLR4_4_14cb4cblb90p74z.R.inc(5764);return z;
                }

                // Now pv != 0, calculate the new approximation.
                }__CLR4_4_14cb4cblb90p74z.R.inc(5765);final Complex G = dv.divide(pv);
                __CLR4_4_14cb4cblb90p74z.R.inc(5766);final Complex G2 = G.multiply(G);
                __CLR4_4_14cb4cblb90p74z.R.inc(5767);final Complex H = G2.subtract(d2v.divide(pv));
                __CLR4_4_14cb4cblb90p74z.R.inc(5768);final Complex delta = n1C.multiply((nC.multiply(H)).subtract(G2));
                // Choose a denominator larger in magnitude.
                __CLR4_4_14cb4cblb90p74z.R.inc(5769);final Complex deltaSqrt = delta.sqrt();
                __CLR4_4_14cb4cblb90p74z.R.inc(5770);final Complex dplus = G.add(deltaSqrt);
                __CLR4_4_14cb4cblb90p74z.R.inc(5771);final Complex dminus = G.subtract(deltaSqrt);
                __CLR4_4_14cb4cblb90p74z.R.inc(5772);final Complex denominator = (((dplus.abs() > dminus.abs() )&&(__CLR4_4_14cb4cblb90p74z.R.iget(5773)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5774)==0&false))? dplus : dminus;
                // Perturb z if denominator is zero, for instance,
                // p(x) = x^3 + 1, z = 0.
                __CLR4_4_14cb4cblb90p74z.R.inc(5775);if ((((denominator.equals(new Complex(0.0, 0.0)))&&(__CLR4_4_14cb4cblb90p74z.R.iget(5776)!=0|true))||(__CLR4_4_14cb4cblb90p74z.R.iget(5777)==0&false))) {{
                    __CLR4_4_14cb4cblb90p74z.R.inc(5778);z = z.add(new Complex(absoluteAccuracy, absoluteAccuracy));
                    __CLR4_4_14cb4cblb90p74z.R.inc(5779);oldz = new Complex(Double.POSITIVE_INFINITY,
                                       Double.POSITIVE_INFINITY);
                } }else {{
                    __CLR4_4_14cb4cblb90p74z.R.inc(5780);oldz = z;
                    __CLR4_4_14cb4cblb90p74z.R.inc(5781);z = z.subtract(nC.divide(denominator));
                }
                }__CLR4_4_14cb4cblb90p74z.R.inc(5782);incrementEvaluationCount();
            }
        }}finally{__CLR4_4_14cb4cblb90p74z.R.flushNeeded();}}
    }
}
