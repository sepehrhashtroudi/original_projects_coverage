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
package org.apache.commons.math3.analysis.interpolation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableVectorFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.CombinatoricsUtils;

/** Polynomial interpolator using both sample values and sample derivatives.
 * <p>
 * The interpolation polynomials match all sample points, including both values
 * and provided derivatives. There is one polynomial for each component of
 * the values vector. All polynomials have the same degree. The degree of the
 * polynomials depends on the number of points and number of derivatives at each
 * point. For example the interpolation polynomials for n sample points without
 * any derivatives all have degree n-1. The interpolation polynomials for n
 * sample points with the two extreme points having value and first derivative
 * and the remaining points having value only all have degree n+1. The
 * interpolation polynomial for n sample points with value, first and second
 * derivative for all points all have degree 3n-1.
 * </p>
 *
 * @version $Id$
 * @since 3.1
 */
public class HermiteInterpolator implements UnivariateDifferentiableVectorFunction {public static class __CLR4_4_12r52r5lb90p6tg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3662,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Sample abscissae. */
    private final List<Double> abscissae;

    /** Top diagonal of the divided differences array. */
    private final List<double[]> topDiagonal;

    /** Bottom diagonal of the divided differences array. */
    private final List<double[]> bottomDiagonal;

    /** Create an empty interpolator.
     */
    public HermiteInterpolator() {try{__CLR4_4_12r52r5lb90p6tg.R.inc(3569);
        __CLR4_4_12r52r5lb90p6tg.R.inc(3570);this.abscissae      = new ArrayList<Double>();
        __CLR4_4_12r52r5lb90p6tg.R.inc(3571);this.topDiagonal    = new ArrayList<double[]>();
        __CLR4_4_12r52r5lb90p6tg.R.inc(3572);this.bottomDiagonal = new ArrayList<double[]>();
    }finally{__CLR4_4_12r52r5lb90p6tg.R.flushNeeded();}}

    /** Add a sample point.
     * <p>
     * This method must be called once for each sample point. It is allowed to
     * mix some calls with values only with calls with values and first
     * derivatives.
     * </p>
     * <p>
     * The point abscissae for all calls <em>must</em> be different.
     * </p>
     * @param x abscissa of the sample point
     * @param value value and derivatives of the sample point
     * (if only one row is passed, it is the value, if two rows are
     * passed the first one is the value and the second the derivative
     * and so on)
     * @exception ZeroException if the abscissa difference between added point
     * and a previous point is zero (i.e. the two points are at same abscissa)
     * @exception MathArithmeticException if the number of derivatives is larger
     * than 20, which prevents computation of a factorial
     */
    public void addSamplePoint(final double x, final double[] ... value)
        throws ZeroException, MathArithmeticException {try{__CLR4_4_12r52r5lb90p6tg.R.inc(3573);

        __CLR4_4_12r52r5lb90p6tg.R.inc(3574);for (int i = 0; (((i < value.length)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3575)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3576)==0&false)); ++i) {{

            __CLR4_4_12r52r5lb90p6tg.R.inc(3577);final double[] y = value[i].clone();
            __CLR4_4_12r52r5lb90p6tg.R.inc(3578);if ((((i > 1)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3579)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3580)==0&false))) {{
                __CLR4_4_12r52r5lb90p6tg.R.inc(3581);double inv = 1.0 / CombinatoricsUtils.factorial(i);
                __CLR4_4_12r52r5lb90p6tg.R.inc(3582);for (int j = 0; (((j < y.length)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3583)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3584)==0&false)); ++j) {{
                    __CLR4_4_12r52r5lb90p6tg.R.inc(3585);y[j] *= inv;
                }
            }}

            // update the bottom diagonal of the divided differences array
            }__CLR4_4_12r52r5lb90p6tg.R.inc(3586);final int n = abscissae.size();
            __CLR4_4_12r52r5lb90p6tg.R.inc(3587);bottomDiagonal.add(n - i, y);
            __CLR4_4_12r52r5lb90p6tg.R.inc(3588);double[] bottom0 = y;
            __CLR4_4_12r52r5lb90p6tg.R.inc(3589);for (int j = i; (((j < n)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3590)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3591)==0&false)); ++j) {{
                __CLR4_4_12r52r5lb90p6tg.R.inc(3592);final double[] bottom1 = bottomDiagonal.get(n - (j + 1));
                __CLR4_4_12r52r5lb90p6tg.R.inc(3593);final double inv = 1.0 / (x - abscissae.get(n - (j + 1)));
                __CLR4_4_12r52r5lb90p6tg.R.inc(3594);if ((((Double.isInfinite(inv))&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3595)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3596)==0&false))) {{
                    __CLR4_4_12r52r5lb90p6tg.R.inc(3597);throw new ZeroException(LocalizedFormats.DUPLICATED_ABSCISSA_DIVISION_BY_ZERO, x);
                }
                }__CLR4_4_12r52r5lb90p6tg.R.inc(3598);for (int k = 0; (((k < y.length)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3599)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3600)==0&false)); ++k) {{
                    __CLR4_4_12r52r5lb90p6tg.R.inc(3601);bottom1[k] = inv * (bottom0[k] - bottom1[k]);
                }
                }__CLR4_4_12r52r5lb90p6tg.R.inc(3602);bottom0 = bottom1;
            }

            // update the top diagonal of the divided differences array
            }__CLR4_4_12r52r5lb90p6tg.R.inc(3603);topDiagonal.add(bottom0.clone());

            // update the abscissae array
            __CLR4_4_12r52r5lb90p6tg.R.inc(3604);abscissae.add(x);

        }

    }}finally{__CLR4_4_12r52r5lb90p6tg.R.flushNeeded();}}

    /** Compute the interpolation polynomials.
     * @return interpolation polynomials array
     * @exception NoDataException if sample is empty
     */
    public PolynomialFunction[] getPolynomials()
        throws NoDataException {try{__CLR4_4_12r52r5lb90p6tg.R.inc(3605);

        // safety check
        __CLR4_4_12r52r5lb90p6tg.R.inc(3606);checkInterpolation();

        // iteration initialization
        __CLR4_4_12r52r5lb90p6tg.R.inc(3607);final PolynomialFunction zero = polynomial(0);
        __CLR4_4_12r52r5lb90p6tg.R.inc(3608);PolynomialFunction[] polynomials = new PolynomialFunction[topDiagonal.get(0).length];
        __CLR4_4_12r52r5lb90p6tg.R.inc(3609);for (int i = 0; (((i < polynomials.length)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3610)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3611)==0&false)); ++i) {{
            __CLR4_4_12r52r5lb90p6tg.R.inc(3612);polynomials[i] = zero;
        }
        }__CLR4_4_12r52r5lb90p6tg.R.inc(3613);PolynomialFunction coeff = polynomial(1);

        // build the polynomials by iterating on the top diagonal of the divided differences array
        __CLR4_4_12r52r5lb90p6tg.R.inc(3614);for (int i = 0; (((i < topDiagonal.size())&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3615)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3616)==0&false)); ++i) {{
            __CLR4_4_12r52r5lb90p6tg.R.inc(3617);double[] tdi = topDiagonal.get(i);
            __CLR4_4_12r52r5lb90p6tg.R.inc(3618);for (int k = 0; (((k < polynomials.length)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3619)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3620)==0&false)); ++k) {{
                __CLR4_4_12r52r5lb90p6tg.R.inc(3621);polynomials[k] = polynomials[k].add(coeff.multiply(polynomial(tdi[k])));
            }
            }__CLR4_4_12r52r5lb90p6tg.R.inc(3622);coeff = coeff.multiply(polynomial(-abscissae.get(i), 1.0));
        }

        }__CLR4_4_12r52r5lb90p6tg.R.inc(3623);return polynomials;

    }finally{__CLR4_4_12r52r5lb90p6tg.R.flushNeeded();}}

    /** Interpolate value at a specified abscissa.
     * <p>
     * Calling this method is equivalent to call the {@link PolynomialFunction#value(double)
     * value} methods of all polynomials returned by {@link #getPolynomials() getPolynomials},
     * except it does not build the intermediate polynomials, so this method is faster and
     * numerically more stable.
     * </p>
     * @param x interpolation abscissa
     * @return interpolated value
     * @exception NoDataException if sample is empty
     */
    public double[] value(double x)
        throws NoDataException {try{__CLR4_4_12r52r5lb90p6tg.R.inc(3624);

        // safety check
        __CLR4_4_12r52r5lb90p6tg.R.inc(3625);checkInterpolation();

        __CLR4_4_12r52r5lb90p6tg.R.inc(3626);final double[] value = new double[topDiagonal.get(0).length];
        __CLR4_4_12r52r5lb90p6tg.R.inc(3627);double valueCoeff = 1;
        __CLR4_4_12r52r5lb90p6tg.R.inc(3628);for (int i = 0; (((i < topDiagonal.size())&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3629)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3630)==0&false)); ++i) {{
            __CLR4_4_12r52r5lb90p6tg.R.inc(3631);double[] dividedDifference = topDiagonal.get(i);
            __CLR4_4_12r52r5lb90p6tg.R.inc(3632);for (int k = 0; (((k < value.length)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3633)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3634)==0&false)); ++k) {{
                __CLR4_4_12r52r5lb90p6tg.R.inc(3635);value[k] += dividedDifference[k] * valueCoeff;
            }
            }__CLR4_4_12r52r5lb90p6tg.R.inc(3636);final double deltaX = x - abscissae.get(i);
            __CLR4_4_12r52r5lb90p6tg.R.inc(3637);valueCoeff *= deltaX;
        }

        }__CLR4_4_12r52r5lb90p6tg.R.inc(3638);return value;

    }finally{__CLR4_4_12r52r5lb90p6tg.R.flushNeeded();}}

    /** Interpolate value at a specified abscissa.
     * <p>
     * Calling this method is equivalent to call the {@link
     * PolynomialFunction#value(DerivativeStructure) value} methods of all polynomials
     * returned by {@link #getPolynomials() getPolynomials}, except it does not build the
     * intermediate polynomials, so this method is faster and numerically more stable.
     * </p>
     * @param x interpolation abscissa
     * @return interpolated value
     * @exception NoDataException if sample is empty
     */
    public DerivativeStructure[] value(final DerivativeStructure x)
        throws NoDataException {try{__CLR4_4_12r52r5lb90p6tg.R.inc(3639);

        // safety check
        __CLR4_4_12r52r5lb90p6tg.R.inc(3640);checkInterpolation();

        __CLR4_4_12r52r5lb90p6tg.R.inc(3641);final DerivativeStructure[] value = new DerivativeStructure[topDiagonal.get(0).length];
        __CLR4_4_12r52r5lb90p6tg.R.inc(3642);Arrays.fill(value, x.getField().getZero());
        __CLR4_4_12r52r5lb90p6tg.R.inc(3643);DerivativeStructure valueCoeff = x.getField().getOne();
        __CLR4_4_12r52r5lb90p6tg.R.inc(3644);for (int i = 0; (((i < topDiagonal.size())&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3645)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3646)==0&false)); ++i) {{
            __CLR4_4_12r52r5lb90p6tg.R.inc(3647);double[] dividedDifference = topDiagonal.get(i);
            __CLR4_4_12r52r5lb90p6tg.R.inc(3648);for (int k = 0; (((k < value.length)&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3649)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3650)==0&false)); ++k) {{
                __CLR4_4_12r52r5lb90p6tg.R.inc(3651);value[k] = value[k].add(valueCoeff.multiply(dividedDifference[k]));
            }
            }__CLR4_4_12r52r5lb90p6tg.R.inc(3652);final DerivativeStructure deltaX = x.subtract(abscissae.get(i));
            __CLR4_4_12r52r5lb90p6tg.R.inc(3653);valueCoeff = valueCoeff.multiply(deltaX);
        }

        }__CLR4_4_12r52r5lb90p6tg.R.inc(3654);return value;

    }finally{__CLR4_4_12r52r5lb90p6tg.R.flushNeeded();}}

    /** Check interpolation can be performed.
     * @exception NoDataException if interpolation cannot be performed
     * because sample is empty
     */
    private void checkInterpolation() throws NoDataException {try{__CLR4_4_12r52r5lb90p6tg.R.inc(3655);
        __CLR4_4_12r52r5lb90p6tg.R.inc(3656);if ((((abscissae.isEmpty())&&(__CLR4_4_12r52r5lb90p6tg.R.iget(3657)!=0|true))||(__CLR4_4_12r52r5lb90p6tg.R.iget(3658)==0&false))) {{
            __CLR4_4_12r52r5lb90p6tg.R.inc(3659);throw new NoDataException(LocalizedFormats.EMPTY_INTERPOLATION_SAMPLE);
        }
    }}finally{__CLR4_4_12r52r5lb90p6tg.R.flushNeeded();}}

    /** Create a polynomial from its coefficients.
     * @param c polynomials coefficients
     * @return polynomial
     */
    private PolynomialFunction polynomial(double ... c) {try{__CLR4_4_12r52r5lb90p6tg.R.inc(3660);
        __CLR4_4_12r52r5lb90p6tg.R.inc(3661);return new PolynomialFunction(c);
    }finally{__CLR4_4_12r52r5lb90p6tg.R.flushNeeded();}}

}
