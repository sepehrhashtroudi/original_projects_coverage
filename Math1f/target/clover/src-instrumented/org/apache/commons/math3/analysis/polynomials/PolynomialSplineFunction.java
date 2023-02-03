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

import java.util.Arrays;

import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Represents a polynomial spline function.
 * <p>
 * A <strong>polynomial spline function</strong> consists of a set of
 * <i>interpolating polynomials</i> and an ascending array of domain
 * <i>knot points</i>, determining the intervals over which the spline function
 * is defined by the constituent polynomials.  The polynomials are assumed to
 * have been computed to match the values of another function at the knot
 * points.  The value consistency constraints are not currently enforced by
 * <code>PolynomialSplineFunction</code> itself, but are assumed to hold among
 * the polynomials and knot points passed to the constructor.</p>
 * <p>
 * N.B.:  The polynomials in the <code>polynomials</code> property must be
 * centered on the knot points to compute the spline function values.
 * See below.</p>
 * <p>
 * The domain of the polynomial spline function is
 * <code>[smallest knot, largest knot]</code>.  Attempts to evaluate the
 * function at values outside of this range generate IllegalArgumentExceptions.
 * </p>
 * <p>
 * The value of the polynomial spline function for an argument <code>x</code>
 * is computed as follows:
 * <ol>
 * <li>The knot array is searched to find the segment to which <code>x</code>
 * belongs.  If <code>x</code> is less than the smallest knot point or greater
 * than the largest one, an <code>IllegalArgumentException</code>
 * is thrown.</li>
 * <li> Let <code>j</code> be the index of the largest knot point that is less
 * than or equal to <code>x</code>.  The value returned is <br>
 * <code>polynomials[j](x - knot[j])</code></li></ol></p>
 *
 * @version $Id$
 */
public class PolynomialSplineFunction implements UnivariateDifferentiableFunction, DifferentiableUnivariateFunction {public static class __CLR4_4_13r13r1lb90p70m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Spline segment interval delimiters (knots).
     * Size is n + 1 for n segments.
     */
    private final double knots[];
    /**
     * The polynomial functions that make up the spline.  The first element
     * determines the value of the spline over the first subinterval, the
     * second over the second, etc.   Spline function values are determined by
     * evaluating these functions at {@code (x - knot[i])} where i is the
     * knot segment to which x belongs.
     */
    private final PolynomialFunction polynomials[];
    /**
     * Number of spline segments. It is equal to the number of polynomials and
     * to the number of partition points - 1.
     */
    private final int n;


    /**
     * Construct a polynomial spline function with the given segment delimiters
     * and interpolating polynomials.
     * The constructor copies both arrays and assigns the copies to the knots
     * and polynomials properties, respectively.
     *
     * @param knots Spline segment interval delimiters.
     * @param polynomials Polynomial functions that make up the spline.
     * @throws NullArgumentException if either of the input arrays is {@code null}.
     * @throws NumberIsTooSmallException if knots has length less than 2.
     * @throws DimensionMismatchException if {@code polynomials.length != knots.length - 1}.
     * @throws NonMonotonicSequenceException if the {@code knots} array is not strictly increasing.
     *
     */
    public PolynomialSplineFunction(double knots[], PolynomialFunction polynomials[])
        throws NullArgumentException, NumberIsTooSmallException,
               DimensionMismatchException, NonMonotonicSequenceException{try{__CLR4_4_13r13r1lb90p70m.R.inc(4861);
        __CLR4_4_13r13r1lb90p70m.R.inc(4862);if ((((knots == null ||
            polynomials == null)&&(__CLR4_4_13r13r1lb90p70m.R.iget(4863)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4864)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4865);throw new NullArgumentException();
        }
        }__CLR4_4_13r13r1lb90p70m.R.inc(4866);if ((((knots.length < 2)&&(__CLR4_4_13r13r1lb90p70m.R.iget(4867)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4868)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4869);throw new NumberIsTooSmallException(LocalizedFormats.NOT_ENOUGH_POINTS_IN_SPLINE_PARTITION,
                                                2, knots.length, false);
        }
        }__CLR4_4_13r13r1lb90p70m.R.inc(4870);if ((((knots.length - 1 != polynomials.length)&&(__CLR4_4_13r13r1lb90p70m.R.iget(4871)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4872)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4873);throw new DimensionMismatchException(polynomials.length, knots.length);
        }
        }__CLR4_4_13r13r1lb90p70m.R.inc(4874);MathArrays.checkOrder(knots);

        __CLR4_4_13r13r1lb90p70m.R.inc(4875);this.n = knots.length -1;
        __CLR4_4_13r13r1lb90p70m.R.inc(4876);this.knots = new double[n + 1];
        __CLR4_4_13r13r1lb90p70m.R.inc(4877);System.arraycopy(knots, 0, this.knots, 0, n + 1);
        __CLR4_4_13r13r1lb90p70m.R.inc(4878);this.polynomials = new PolynomialFunction[n];
        __CLR4_4_13r13r1lb90p70m.R.inc(4879);System.arraycopy(polynomials, 0, this.polynomials, 0, n);
    }finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}

    /**
     * Compute the value for the function.
     * See {@link PolynomialSplineFunction} for details on the algorithm for
     * computing the value of the function.
     *
     * @param v Point for which the function value should be computed.
     * @return the value.
     * @throws OutOfRangeException if {@code v} is outside of the domain of the
     * spline function (smaller than the smallest knot point or larger than the
     * largest knot point).
     */
    public double value(double v) {try{__CLR4_4_13r13r1lb90p70m.R.inc(4880);
        __CLR4_4_13r13r1lb90p70m.R.inc(4881);if ((((v < knots[0] || v > knots[n])&&(__CLR4_4_13r13r1lb90p70m.R.iget(4882)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4883)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4884);throw new OutOfRangeException(v, knots[0], knots[n]);
        }
        }__CLR4_4_13r13r1lb90p70m.R.inc(4885);int i = Arrays.binarySearch(knots, v);
        __CLR4_4_13r13r1lb90p70m.R.inc(4886);if ((((i < 0)&&(__CLR4_4_13r13r1lb90p70m.R.iget(4887)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4888)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4889);i = -i - 2;
        }
        // This will handle the case where v is the last knot value
        // There are only n-1 polynomials, so if v is the last knot
        // then we will use the last polynomial to calculate the value.
        }__CLR4_4_13r13r1lb90p70m.R.inc(4890);if ( (((i >= polynomials.length )&&(__CLR4_4_13r13r1lb90p70m.R.iget(4891)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4892)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4893);i--;
        }
        }__CLR4_4_13r13r1lb90p70m.R.inc(4894);return polynomials[i].value(v - knots[i]);
    }finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}

    /**
     * Get the derivative of the polynomial spline function.
     *
     * @return the derivative function.
     */
    public UnivariateFunction derivative() {try{__CLR4_4_13r13r1lb90p70m.R.inc(4895);
        __CLR4_4_13r13r1lb90p70m.R.inc(4896);return polynomialSplineDerivative();
    }finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}

    /**
     * Get the derivative of the polynomial spline function.
     *
     * @return the derivative function.
     */
    public PolynomialSplineFunction polynomialSplineDerivative() {try{__CLR4_4_13r13r1lb90p70m.R.inc(4897);
        __CLR4_4_13r13r1lb90p70m.R.inc(4898);PolynomialFunction derivativePolynomials[] = new PolynomialFunction[n];
        __CLR4_4_13r13r1lb90p70m.R.inc(4899);for (int i = 0; (((i < n)&&(__CLR4_4_13r13r1lb90p70m.R.iget(4900)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4901)==0&false)); i++) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4902);derivativePolynomials[i] = polynomials[i].polynomialDerivative();
        }
        }__CLR4_4_13r13r1lb90p70m.R.inc(4903);return new PolynomialSplineFunction(knots, derivativePolynomials);
    }finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}


    /** {@inheritDoc}
     * @since 3.1
     */
    public DerivativeStructure value(final DerivativeStructure t) {try{__CLR4_4_13r13r1lb90p70m.R.inc(4904);
        __CLR4_4_13r13r1lb90p70m.R.inc(4905);final double t0 = t.getValue();
        __CLR4_4_13r13r1lb90p70m.R.inc(4906);if ((((t0 < knots[0] || t0 > knots[n])&&(__CLR4_4_13r13r1lb90p70m.R.iget(4907)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4908)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4909);throw new OutOfRangeException(t0, knots[0], knots[n]);
        }
        }__CLR4_4_13r13r1lb90p70m.R.inc(4910);int i = Arrays.binarySearch(knots, t0);
        __CLR4_4_13r13r1lb90p70m.R.inc(4911);if ((((i < 0)&&(__CLR4_4_13r13r1lb90p70m.R.iget(4912)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4913)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4914);i = -i - 2;
        }
        // This will handle the case where t is the last knot value
        // There are only n-1 polynomials, so if t is the last knot
        // then we will use the last polynomial to calculate the value.
        }__CLR4_4_13r13r1lb90p70m.R.inc(4915);if ( (((i >= polynomials.length )&&(__CLR4_4_13r13r1lb90p70m.R.iget(4916)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4917)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4918);i--;
        }
        }__CLR4_4_13r13r1lb90p70m.R.inc(4919);return polynomials[i].value(t.subtract(knots[i]));
    }finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}

    /**
     * Get the number of spline segments.
     * It is also the number of polynomials and the number of knot points - 1.
     *
     * @return the number of spline segments.
     */
    public int getN() {try{__CLR4_4_13r13r1lb90p70m.R.inc(4920);
        __CLR4_4_13r13r1lb90p70m.R.inc(4921);return n;
    }finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}

    /**
     * Get a copy of the interpolating polynomials array.
     * It returns a fresh copy of the array. Changes made to the copy will
     * not affect the polynomials property.
     *
     * @return the interpolating polynomials.
     */
    public PolynomialFunction[] getPolynomials() {try{__CLR4_4_13r13r1lb90p70m.R.inc(4922);
        __CLR4_4_13r13r1lb90p70m.R.inc(4923);PolynomialFunction p[] = new PolynomialFunction[n];
        __CLR4_4_13r13r1lb90p70m.R.inc(4924);System.arraycopy(polynomials, 0, p, 0, n);
        __CLR4_4_13r13r1lb90p70m.R.inc(4925);return p;
    }finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}

    /**
     * Get an array copy of the knot points.
     * It returns a fresh copy of the array. Changes made to the copy
     * will not affect the knots property.
     *
     * @return the knot points.
     */
    public double[] getKnots() {try{__CLR4_4_13r13r1lb90p70m.R.inc(4926);
        __CLR4_4_13r13r1lb90p70m.R.inc(4927);double out[] = new double[n + 1];
        __CLR4_4_13r13r1lb90p70m.R.inc(4928);System.arraycopy(knots, 0, out, 0, n + 1);
        __CLR4_4_13r13r1lb90p70m.R.inc(4929);return out;
    }finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}

    /**
     * Indicates whether a point is within the interpolation range.
     *
     * @param x Point.
     * @return {@code true} if {@code x} is a valid point.
     */
    public boolean isValidPoint(double x) {try{__CLR4_4_13r13r1lb90p70m.R.inc(4930);
        __CLR4_4_13r13r1lb90p70m.R.inc(4931);if ((((x < knots[0] ||
            x > knots[n])&&(__CLR4_4_13r13r1lb90p70m.R.iget(4932)!=0|true))||(__CLR4_4_13r13r1lb90p70m.R.iget(4933)==0&false))) {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4934);return false;
        } }else {{
            __CLR4_4_13r13r1lb90p70m.R.inc(4935);return true;
        }
    }}finally{__CLR4_4_13r13r1lb90p70m.R.flushNeeded();}}
}
