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
package org.apache.commons.math3.analysis.polynomials;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Implements the representation of a real polynomial function in
 * <a href="http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html">
 * Lagrange Form</a>. For reference, see <b>Introduction to Numerical
 * Analysis</b>, ISBN 038795452X, chapter 2.
 * <p>
 * The approximated function should be smooth enough for Lagrange polynomial
 * to work well. Otherwise, consider using splines instead.</p>
 *
 * @version $Id$
 * @since 1.2
 */
public class PolynomialFunctionLagrangeForm implements UnivariateFunction {public static class __CLR4_4_13lf3lflb90p6zy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4788,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The coefficients of the polynomial, ordered by degree -- i.e.
     * coefficients[0] is the constant term and coefficients[n] is the
     * coefficient of x^n where n is the degree of the polynomial.
     */
    private double coefficients[];
    /**
     * Interpolating points (abscissas).
     */
    private final double x[];
    /**
     * Function values at interpolating points.
     */
    private final double y[];
    /**
     * Whether the polynomial coefficients are available.
     */
    private boolean coefficientsComputed;

    /**
     * Construct a Lagrange polynomial with the given abscissas and function
     * values. The order of interpolating points are not important.
     * <p>
     * The constructor makes copy of the input arrays and assigns them.</p>
     *
     * @param x interpolating points
     * @param y function values at interpolating points
     * @throws DimensionMismatchException if the array lengths are different.
     * @throws NumberIsTooSmallException if the number of points is less than 2.
     * @throws NonMonotonicSequenceException
     * if two abscissae have the same value.
     */
    public PolynomialFunctionLagrangeForm(double x[], double y[])
        throws DimensionMismatchException, NumberIsTooSmallException, NonMonotonicSequenceException {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4659);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4660);this.x = new double[x.length];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4661);this.y = new double[y.length];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4662);System.arraycopy(x, 0, this.x, 0, x.length);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4663);System.arraycopy(y, 0, this.y, 0, y.length);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4664);coefficientsComputed = false;

        __CLR4_4_13lf3lflb90p6zy.R.inc(4665);if ((((!verifyInterpolationArray(x, y, false))&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4666)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4667)==0&false))) {{
            __CLR4_4_13lf3lflb90p6zy.R.inc(4668);MathArrays.sortInPlace(this.x, this.y);
            // Second check in case some abscissa is duplicated.
            __CLR4_4_13lf3lflb90p6zy.R.inc(4669);verifyInterpolationArray(this.x, this.y, true);
        }
    }}finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Calculate the function value at the given point.
     *
     * @param z Point at which the function value is to be computed.
     * @return the function value.
     * @throws DimensionMismatchException if {@code x} and {@code y} have
     * different lengths.
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     * if {@code x} is not sorted in strictly increasing order.
     * @throws NumberIsTooSmallException if the size of {@code x} is less
     * than 2.
     */
    public double value(double z) {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4670);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4671);return evaluateInternal(x, y, z);
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Returns the degree of the polynomial.
     *
     * @return the degree of the polynomial
     */
    public int degree() {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4672);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4673);return x.length - 1;
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Returns a copy of the interpolating points array.
     * <p>
     * Changes made to the returned copy will not affect the polynomial.</p>
     *
     * @return a fresh copy of the interpolating points array
     */
    public double[] getInterpolatingPoints() {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4674);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4675);double[] out = new double[x.length];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4676);System.arraycopy(x, 0, out, 0, x.length);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4677);return out;
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Returns a copy of the interpolating values array.
     * <p>
     * Changes made to the returned copy will not affect the polynomial.</p>
     *
     * @return a fresh copy of the interpolating values array
     */
    public double[] getInterpolatingValues() {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4678);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4679);double[] out = new double[y.length];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4680);System.arraycopy(y, 0, out, 0, y.length);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4681);return out;
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Returns a copy of the coefficients array.
     * <p>
     * Changes made to the returned copy will not affect the polynomial.</p>
     * <p>
     * Note that coefficients computation can be ill-conditioned. Use with caution
     * and only when it is necessary.</p>
     *
     * @return a fresh copy of the coefficients array
     */
    public double[] getCoefficients() {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4682);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4683);if ((((!coefficientsComputed)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4684)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4685)==0&false))) {{
            __CLR4_4_13lf3lflb90p6zy.R.inc(4686);computeCoefficients();
        }
        }__CLR4_4_13lf3lflb90p6zy.R.inc(4687);double[] out = new double[coefficients.length];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4688);System.arraycopy(coefficients, 0, out, 0, coefficients.length);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4689);return out;
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Evaluate the Lagrange polynomial using
     * <a href="http://mathworld.wolfram.com/NevillesAlgorithm.html">
     * Neville's Algorithm</a>. It takes O(n^2) time.
     *
     * @param x Interpolating points array.
     * @param y Interpolating values array.
     * @param z Point at which the function value is to be computed.
     * @return the function value.
     * @throws DimensionMismatchException if {@code x} and {@code y} have
     * different lengths.
     * @throws NonMonotonicSequenceException
     * if {@code x} is not sorted in strictly increasing order.
     * @throws NumberIsTooSmallException if the size of {@code x} is less
     * than 2.
     */
    public static double evaluate(double x[], double y[], double z)
        throws DimensionMismatchException, NumberIsTooSmallException, NonMonotonicSequenceException {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4690);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4691);if ((((verifyInterpolationArray(x, y, false))&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4692)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4693)==0&false))) {{
            __CLR4_4_13lf3lflb90p6zy.R.inc(4694);return evaluateInternal(x, y, z);
        }

        // Array is not sorted.
        }__CLR4_4_13lf3lflb90p6zy.R.inc(4695);final double[] xNew = new double[x.length];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4696);final double[] yNew = new double[y.length];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4697);System.arraycopy(x, 0, xNew, 0, x.length);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4698);System.arraycopy(y, 0, yNew, 0, y.length);

        __CLR4_4_13lf3lflb90p6zy.R.inc(4699);MathArrays.sortInPlace(xNew, yNew);
        // Second check in case some abscissa is duplicated.
        __CLR4_4_13lf3lflb90p6zy.R.inc(4700);verifyInterpolationArray(xNew, yNew, true);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4701);return evaluateInternal(xNew, yNew, z);
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Evaluate the Lagrange polynomial using
     * <a href="http://mathworld.wolfram.com/NevillesAlgorithm.html">
     * Neville's Algorithm</a>. It takes O(n^2) time.
     *
     * @param x Interpolating points array.
     * @param y Interpolating values array.
     * @param z Point at which the function value is to be computed.
     * @return the function value.
     * @throws DimensionMismatchException if {@code x} and {@code y} have
     * different lengths.
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     * if {@code x} is not sorted in strictly increasing order.
     * @throws NumberIsTooSmallException if the size of {@code x} is less
     * than 2.
     */
    private static double evaluateInternal(double x[], double y[], double z) {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4702);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4703);int nearest = 0;
        __CLR4_4_13lf3lflb90p6zy.R.inc(4704);final int n = x.length;
        __CLR4_4_13lf3lflb90p6zy.R.inc(4705);final double[] c = new double[n];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4706);final double[] d = new double[n];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4707);double min_dist = Double.POSITIVE_INFINITY;
        __CLR4_4_13lf3lflb90p6zy.R.inc(4708);for (int i = 0; (((i < n)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4709)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4710)==0&false)); i++) {{
            // initialize the difference arrays
            __CLR4_4_13lf3lflb90p6zy.R.inc(4711);c[i] = y[i];
            __CLR4_4_13lf3lflb90p6zy.R.inc(4712);d[i] = y[i];
            // find out the abscissa closest to z
            __CLR4_4_13lf3lflb90p6zy.R.inc(4713);final double dist = FastMath.abs(z - x[i]);
            __CLR4_4_13lf3lflb90p6zy.R.inc(4714);if ((((dist < min_dist)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4715)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4716)==0&false))) {{
                __CLR4_4_13lf3lflb90p6zy.R.inc(4717);nearest = i;
                __CLR4_4_13lf3lflb90p6zy.R.inc(4718);min_dist = dist;
            }
        }}

        // initial approximation to the function value at z
        }__CLR4_4_13lf3lflb90p6zy.R.inc(4719);double value = y[nearest];

        __CLR4_4_13lf3lflb90p6zy.R.inc(4720);for (int i = 1; (((i < n)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4721)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4722)==0&false)); i++) {{
            __CLR4_4_13lf3lflb90p6zy.R.inc(4723);for (int j = 0; (((j < n-i)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4724)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4725)==0&false)); j++) {{
                __CLR4_4_13lf3lflb90p6zy.R.inc(4726);final double tc = x[j] - z;
                __CLR4_4_13lf3lflb90p6zy.R.inc(4727);final double td = x[i+j] - z;
                __CLR4_4_13lf3lflb90p6zy.R.inc(4728);final double divider = x[j] - x[i+j];
                // update the difference arrays
                __CLR4_4_13lf3lflb90p6zy.R.inc(4729);final double w = (c[j+1] - d[j]) / divider;
                __CLR4_4_13lf3lflb90p6zy.R.inc(4730);c[j] = tc * w;
                __CLR4_4_13lf3lflb90p6zy.R.inc(4731);d[j] = td * w;
            }
            // sum up the difference terms to get the final value
            }__CLR4_4_13lf3lflb90p6zy.R.inc(4732);if ((((nearest < 0.5*(n-i+1))&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4733)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4734)==0&false))) {{
                __CLR4_4_13lf3lflb90p6zy.R.inc(4735);value += c[nearest];    // fork down
            } }else {{
                __CLR4_4_13lf3lflb90p6zy.R.inc(4736);nearest--;
                __CLR4_4_13lf3lflb90p6zy.R.inc(4737);value += d[nearest];    // fork up
            }
        }}

        }__CLR4_4_13lf3lflb90p6zy.R.inc(4738);return value;
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Calculate the coefficients of Lagrange polynomial from the
     * interpolation data. It takes O(n^2) time.
     * Note that this computation can be ill-conditioned: Use with caution
     * and only when it is necessary.
     */
    protected void computeCoefficients() {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4739);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4740);final int n = degree() + 1;
        __CLR4_4_13lf3lflb90p6zy.R.inc(4741);coefficients = new double[n];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4742);for (int i = 0; (((i < n)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4743)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4744)==0&false)); i++) {{
            __CLR4_4_13lf3lflb90p6zy.R.inc(4745);coefficients[i] = 0.0;
        }

        // c[] are the coefficients of P(x) = (x-x[0])(x-x[1])...(x-x[n-1])
        }__CLR4_4_13lf3lflb90p6zy.R.inc(4746);final double[] c = new double[n+1];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4747);c[0] = 1.0;
        __CLR4_4_13lf3lflb90p6zy.R.inc(4748);for (int i = 0; (((i < n)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4749)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4750)==0&false)); i++) {{
            __CLR4_4_13lf3lflb90p6zy.R.inc(4751);for (int j = i; (((j > 0)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4752)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4753)==0&false)); j--) {{
                __CLR4_4_13lf3lflb90p6zy.R.inc(4754);c[j] = c[j-1] - c[j] * x[i];
            }
            }__CLR4_4_13lf3lflb90p6zy.R.inc(4755);c[0] *= -x[i];
            __CLR4_4_13lf3lflb90p6zy.R.inc(4756);c[i+1] = 1;
        }

        }__CLR4_4_13lf3lflb90p6zy.R.inc(4757);final double[] tc = new double[n];
        __CLR4_4_13lf3lflb90p6zy.R.inc(4758);for (int i = 0; (((i < n)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4759)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4760)==0&false)); i++) {{
            // d = (x[i]-x[0])...(x[i]-x[i-1])(x[i]-x[i+1])...(x[i]-x[n-1])
            __CLR4_4_13lf3lflb90p6zy.R.inc(4761);double d = 1;
            __CLR4_4_13lf3lflb90p6zy.R.inc(4762);for (int j = 0; (((j < n)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4763)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4764)==0&false)); j++) {{
                __CLR4_4_13lf3lflb90p6zy.R.inc(4765);if ((((i != j)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4766)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4767)==0&false))) {{
                    __CLR4_4_13lf3lflb90p6zy.R.inc(4768);d *= x[i] - x[j];
                }
            }}
            }__CLR4_4_13lf3lflb90p6zy.R.inc(4769);final double t = y[i] / d;
            // Lagrange polynomial is the sum of n terms, each of which is a
            // polynomial of degree n-1. tc[] are the coefficients of the i-th
            // numerator Pi(x) = (x-x[0])...(x-x[i-1])(x-x[i+1])...(x-x[n-1]).
            __CLR4_4_13lf3lflb90p6zy.R.inc(4770);tc[n-1] = c[n];     // actually c[n] = 1
            __CLR4_4_13lf3lflb90p6zy.R.inc(4771);coefficients[n-1] += t * tc[n-1];
            __CLR4_4_13lf3lflb90p6zy.R.inc(4772);for (int j = n-2; (((j >= 0)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4773)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4774)==0&false)); j--) {{
                __CLR4_4_13lf3lflb90p6zy.R.inc(4775);tc[j] = c[j+1] + tc[j+1] * x[i];
                __CLR4_4_13lf3lflb90p6zy.R.inc(4776);coefficients[j] += t * tc[j];
            }
        }}

        }__CLR4_4_13lf3lflb90p6zy.R.inc(4777);coefficientsComputed = true;
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}

    /**
     * Check that the interpolation arrays are valid.
     * The arrays features checked by this method are that both arrays have the
     * same length and this length is at least 2.
     *
     * @param x Interpolating points array.
     * @param y Interpolating values array.
     * @param abort Whether to throw an exception if {@code x} is not sorted.
     * @throws DimensionMismatchException if the array lengths are different.
     * @throws NumberIsTooSmallException if the number of points is less than 2.
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     * if {@code x} is not sorted in strictly increasing order and {@code abort}
     * is {@code true}.
     * @return {@code false} if the {@code x} is not sorted in increasing order,
     * {@code true} otherwise.
     * @see #evaluate(double[], double[], double)
     * @see #computeCoefficients()
     */
    public static boolean verifyInterpolationArray(double x[], double y[], boolean abort)
        throws DimensionMismatchException, NumberIsTooSmallException, NonMonotonicSequenceException {try{__CLR4_4_13lf3lflb90p6zy.R.inc(4778);
        __CLR4_4_13lf3lflb90p6zy.R.inc(4779);if ((((x.length != y.length)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4780)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4781)==0&false))) {{
            __CLR4_4_13lf3lflb90p6zy.R.inc(4782);throw new DimensionMismatchException(x.length, y.length);
        }
        }__CLR4_4_13lf3lflb90p6zy.R.inc(4783);if ((((x.length < 2)&&(__CLR4_4_13lf3lflb90p6zy.R.iget(4784)!=0|true))||(__CLR4_4_13lf3lflb90p6zy.R.iget(4785)==0&false))) {{
            __CLR4_4_13lf3lflb90p6zy.R.inc(4786);throw new NumberIsTooSmallException(LocalizedFormats.WRONG_NUMBER_OF_POINTS, 2, x.length, true);
        }

        }__CLR4_4_13lf3lflb90p6zy.R.inc(4787);return MathArrays.checkOrder(x, MathArrays.OrderDirection.INCREASING, true, abort);
    }finally{__CLR4_4_13lf3lflb90p6zy.R.flushNeeded();}}
}
