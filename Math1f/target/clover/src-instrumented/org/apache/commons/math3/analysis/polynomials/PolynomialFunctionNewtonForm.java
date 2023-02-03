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

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;

/**
 * Implements the representation of a real polynomial function in
 * Newton Form. For reference, see <b>Elementary Numerical Analysis</b>,
 * ISBN 0070124477, chapter 2.
 * <p>
 * The formula of polynomial in Newton form is
 *     p(x) = a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +
 *            a[n](x-c[0])(x-c[1])...(x-c[n-1])
 * Note that the length of a[] is one more than the length of c[]</p>
 *
 * @version $Id$
 * @since 1.2
 */
public class PolynomialFunctionNewtonForm implements UnivariateDifferentiableFunction {public static class __CLR4_4_13p03p0lb90p70a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The coefficients of the polynomial, ordered by degree -- i.e.
     * coefficients[0] is the constant term and coefficients[n] is the
     * coefficient of x^n where n is the degree of the polynomial.
     */
    private double coefficients[];

    /**
     * Centers of the Newton polynomial.
     */
    private final double c[];

    /**
     * When all c[i] = 0, a[] becomes normal polynomial coefficients,
     * i.e. a[i] = coefficients[i].
     */
    private final double a[];

    /**
     * Whether the polynomial coefficients are available.
     */
    private boolean coefficientsComputed;

    /**
     * Construct a Newton polynomial with the given a[] and c[]. The order of
     * centers are important in that if c[] shuffle, then values of a[] would
     * completely change, not just a permutation of old a[].
     * <p>
     * The constructor makes copy of the input arrays and assigns them.</p>
     *
     * @param a Coefficients in Newton form formula.
     * @param c Centers.
     * @throws NullArgumentException if any argument is {@code null}.
     * @throws NoDataException if any array has zero length.
     * @throws DimensionMismatchException if the size difference between
     * {@code a} and {@code c} is not equal to 1.
     */
    public PolynomialFunctionNewtonForm(double a[], double c[])
        throws NullArgumentException, NoDataException, DimensionMismatchException {try{__CLR4_4_13p03p0lb90p70a.R.inc(4788);

        __CLR4_4_13p03p0lb90p70a.R.inc(4789);verifyInputArray(a, c);
        __CLR4_4_13p03p0lb90p70a.R.inc(4790);this.a = new double[a.length];
        __CLR4_4_13p03p0lb90p70a.R.inc(4791);this.c = new double[c.length];
        __CLR4_4_13p03p0lb90p70a.R.inc(4792);System.arraycopy(a, 0, this.a, 0, a.length);
        __CLR4_4_13p03p0lb90p70a.R.inc(4793);System.arraycopy(c, 0, this.c, 0, c.length);
        __CLR4_4_13p03p0lb90p70a.R.inc(4794);coefficientsComputed = false;
    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * Calculate the function value at the given point.
     *
     * @param z Point at which the function value is to be computed.
     * @return the function value.
     */
    public double value(double z) {try{__CLR4_4_13p03p0lb90p70a.R.inc(4795);
       __CLR4_4_13p03p0lb90p70a.R.inc(4796);return evaluate(a, c, z);
    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    public DerivativeStructure value(final DerivativeStructure t) {try{__CLR4_4_13p03p0lb90p70a.R.inc(4797);
        __CLR4_4_13p03p0lb90p70a.R.inc(4798);verifyInputArray(a, c);

        __CLR4_4_13p03p0lb90p70a.R.inc(4799);final int n = c.length;
        __CLR4_4_13p03p0lb90p70a.R.inc(4800);DerivativeStructure value = new DerivativeStructure(t.getFreeParameters(), t.getOrder(), a[n]);
        __CLR4_4_13p03p0lb90p70a.R.inc(4801);for (int i = n - 1; (((i >= 0)&&(__CLR4_4_13p03p0lb90p70a.R.iget(4802)!=0|true))||(__CLR4_4_13p03p0lb90p70a.R.iget(4803)==0&false)); i--) {{
            __CLR4_4_13p03p0lb90p70a.R.inc(4804);value = t.subtract(c[i]).multiply(value).add(a[i]);
        }

        }__CLR4_4_13p03p0lb90p70a.R.inc(4805);return value;

    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * Returns the degree of the polynomial.
     *
     * @return the degree of the polynomial
     */
    public int degree() {try{__CLR4_4_13p03p0lb90p70a.R.inc(4806);
        __CLR4_4_13p03p0lb90p70a.R.inc(4807);return c.length;
    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * Returns a copy of coefficients in Newton form formula.
     * <p>
     * Changes made to the returned copy will not affect the polynomial.</p>
     *
     * @return a fresh copy of coefficients in Newton form formula
     */
    public double[] getNewtonCoefficients() {try{__CLR4_4_13p03p0lb90p70a.R.inc(4808);
        __CLR4_4_13p03p0lb90p70a.R.inc(4809);double[] out = new double[a.length];
        __CLR4_4_13p03p0lb90p70a.R.inc(4810);System.arraycopy(a, 0, out, 0, a.length);
        __CLR4_4_13p03p0lb90p70a.R.inc(4811);return out;
    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * Returns a copy of the centers array.
     * <p>
     * Changes made to the returned copy will not affect the polynomial.</p>
     *
     * @return a fresh copy of the centers array.
     */
    public double[] getCenters() {try{__CLR4_4_13p03p0lb90p70a.R.inc(4812);
        __CLR4_4_13p03p0lb90p70a.R.inc(4813);double[] out = new double[c.length];
        __CLR4_4_13p03p0lb90p70a.R.inc(4814);System.arraycopy(c, 0, out, 0, c.length);
        __CLR4_4_13p03p0lb90p70a.R.inc(4815);return out;
    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * Returns a copy of the coefficients array.
     * <p>
     * Changes made to the returned copy will not affect the polynomial.</p>
     *
     * @return a fresh copy of the coefficients array.
     */
    public double[] getCoefficients() {try{__CLR4_4_13p03p0lb90p70a.R.inc(4816);
        __CLR4_4_13p03p0lb90p70a.R.inc(4817);if ((((!coefficientsComputed)&&(__CLR4_4_13p03p0lb90p70a.R.iget(4818)!=0|true))||(__CLR4_4_13p03p0lb90p70a.R.iget(4819)==0&false))) {{
            __CLR4_4_13p03p0lb90p70a.R.inc(4820);computeCoefficients();
        }
        }__CLR4_4_13p03p0lb90p70a.R.inc(4821);double[] out = new double[coefficients.length];
        __CLR4_4_13p03p0lb90p70a.R.inc(4822);System.arraycopy(coefficients, 0, out, 0, coefficients.length);
        __CLR4_4_13p03p0lb90p70a.R.inc(4823);return out;
    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * Evaluate the Newton polynomial using nested multiplication. It is
     * also called <a href="http://mathworld.wolfram.com/HornersRule.html">
     * Horner's Rule</a> and takes O(N) time.
     *
     * @param a Coefficients in Newton form formula.
     * @param c Centers.
     * @param z Point at which the function value is to be computed.
     * @return the function value.
     * @throws NullArgumentException if any argument is {@code null}.
     * @throws NoDataException if any array has zero length.
     * @throws DimensionMismatchException if the size difference between
     * {@code a} and {@code c} is not equal to 1.
     */
    public static double evaluate(double a[], double c[], double z)
        throws NullArgumentException, DimensionMismatchException, NoDataException {try{__CLR4_4_13p03p0lb90p70a.R.inc(4824);
        __CLR4_4_13p03p0lb90p70a.R.inc(4825);verifyInputArray(a, c);

        __CLR4_4_13p03p0lb90p70a.R.inc(4826);final int n = c.length;
        __CLR4_4_13p03p0lb90p70a.R.inc(4827);double value = a[n];
        __CLR4_4_13p03p0lb90p70a.R.inc(4828);for (int i = n - 1; (((i >= 0)&&(__CLR4_4_13p03p0lb90p70a.R.iget(4829)!=0|true))||(__CLR4_4_13p03p0lb90p70a.R.iget(4830)==0&false)); i--) {{
            __CLR4_4_13p03p0lb90p70a.R.inc(4831);value = a[i] + (z - c[i]) * value;
        }

        }__CLR4_4_13p03p0lb90p70a.R.inc(4832);return value;
    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * Calculate the normal polynomial coefficients given the Newton form.
     * It also uses nested multiplication but takes O(N^2) time.
     */
    protected void computeCoefficients() {try{__CLR4_4_13p03p0lb90p70a.R.inc(4833);
        __CLR4_4_13p03p0lb90p70a.R.inc(4834);final int n = degree();

        __CLR4_4_13p03p0lb90p70a.R.inc(4835);coefficients = new double[n+1];
        __CLR4_4_13p03p0lb90p70a.R.inc(4836);for (int i = 0; (((i <= n)&&(__CLR4_4_13p03p0lb90p70a.R.iget(4837)!=0|true))||(__CLR4_4_13p03p0lb90p70a.R.iget(4838)==0&false)); i++) {{
            __CLR4_4_13p03p0lb90p70a.R.inc(4839);coefficients[i] = 0.0;
        }

        }__CLR4_4_13p03p0lb90p70a.R.inc(4840);coefficients[0] = a[n];
        __CLR4_4_13p03p0lb90p70a.R.inc(4841);for (int i = n-1; (((i >= 0)&&(__CLR4_4_13p03p0lb90p70a.R.iget(4842)!=0|true))||(__CLR4_4_13p03p0lb90p70a.R.iget(4843)==0&false)); i--) {{
            __CLR4_4_13p03p0lb90p70a.R.inc(4844);for (int j = n-i; (((j > 0)&&(__CLR4_4_13p03p0lb90p70a.R.iget(4845)!=0|true))||(__CLR4_4_13p03p0lb90p70a.R.iget(4846)==0&false)); j--) {{
                __CLR4_4_13p03p0lb90p70a.R.inc(4847);coefficients[j] = coefficients[j-1] - c[i] * coefficients[j];
            }
            }__CLR4_4_13p03p0lb90p70a.R.inc(4848);coefficients[0] = a[i] - c[i] * coefficients[0];
        }

        }__CLR4_4_13p03p0lb90p70a.R.inc(4849);coefficientsComputed = true;
    }finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

    /**
     * Verifies that the input arrays are valid.
     * <p>
     * The centers must be distinct for interpolation purposes, but not
     * for general use. Thus it is not verified here.</p>
     *
     * @param a the coefficients in Newton form formula
     * @param c the centers
     * @throws NullArgumentException if any argument is {@code null}.
     * @throws NoDataException if any array has zero length.
     * @throws DimensionMismatchException if the size difference between
     * {@code a} and {@code c} is not equal to 1.
     * @see org.apache.commons.math3.analysis.interpolation.DividedDifferenceInterpolator#computeDividedDifference(double[],
     * double[])
     */
    protected static void verifyInputArray(double a[], double c[])
        throws NullArgumentException, NoDataException, DimensionMismatchException {try{__CLR4_4_13p03p0lb90p70a.R.inc(4850);
        __CLR4_4_13p03p0lb90p70a.R.inc(4851);MathUtils.checkNotNull(a);
        __CLR4_4_13p03p0lb90p70a.R.inc(4852);MathUtils.checkNotNull(c);
        __CLR4_4_13p03p0lb90p70a.R.inc(4853);if ((((a.length == 0 || c.length == 0)&&(__CLR4_4_13p03p0lb90p70a.R.iget(4854)!=0|true))||(__CLR4_4_13p03p0lb90p70a.R.iget(4855)==0&false))) {{
            __CLR4_4_13p03p0lb90p70a.R.inc(4856);throw new NoDataException(LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
        }
        }__CLR4_4_13p03p0lb90p70a.R.inc(4857);if ((((a.length != c.length + 1)&&(__CLR4_4_13p03p0lb90p70a.R.iget(4858)!=0|true))||(__CLR4_4_13p03p0lb90p70a.R.iget(4859)==0&false))) {{
            __CLR4_4_13p03p0lb90p70a.R.inc(4860);throw new DimensionMismatchException(LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1,
                                                 a.length, c.length);
        }
    }}finally{__CLR4_4_13p03p0lb90p70a.R.flushNeeded();}}

}
