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
import java.util.List;

import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.MathUtils;

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
 * @param <T> Type of the field elements.
 *
 * @version $Id$
 * @since 3.2
 */
public class FieldHermiteInterpolator<T extends FieldElement<T>> {public static class __CLR4_4_12ok2oklb90p6t0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3569,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Sample abscissae. */
    private final List<T> abscissae;

    /** Top diagonal of the divided differences array. */
    private final List<T[]> topDiagonal;

    /** Bottom diagonal of the divided differences array. */
    private final List<T[]> bottomDiagonal;

    /** Create an empty interpolator.
     */
    public FieldHermiteInterpolator() {try{__CLR4_4_12ok2oklb90p6t0.R.inc(3476);
        __CLR4_4_12ok2oklb90p6t0.R.inc(3477);this.abscissae      = new ArrayList<T>();
        __CLR4_4_12ok2oklb90p6t0.R.inc(3478);this.topDiagonal    = new ArrayList<T[]>();
        __CLR4_4_12ok2oklb90p6t0.R.inc(3479);this.bottomDiagonal = new ArrayList<T[]>();
    }finally{__CLR4_4_12ok2oklb90p6t0.R.flushNeeded();}}

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
     * @throws DimensionMismatchException if derivative structures are inconsistent
     * @throws NullArgumentException if x is null
     */
    public void addSamplePoint(final T x, final T[] ... value)
        throws ZeroException, MathArithmeticException,
               DimensionMismatchException, NullArgumentException {try{__CLR4_4_12ok2oklb90p6t0.R.inc(3480);

        __CLR4_4_12ok2oklb90p6t0.R.inc(3481);MathUtils.checkNotNull(x);
        __CLR4_4_12ok2oklb90p6t0.R.inc(3482);T factorial = x.getField().getOne();
        __CLR4_4_12ok2oklb90p6t0.R.inc(3483);for (int i = 0; (((i < value.length)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3484)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3485)==0&false)); ++i) {{

            __CLR4_4_12ok2oklb90p6t0.R.inc(3486);final T[] y = value[i].clone();
            __CLR4_4_12ok2oklb90p6t0.R.inc(3487);if ((((i > 1)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3488)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3489)==0&false))) {{
                __CLR4_4_12ok2oklb90p6t0.R.inc(3490);factorial = factorial.multiply(i);
                __CLR4_4_12ok2oklb90p6t0.R.inc(3491);final T inv = factorial.reciprocal();
                __CLR4_4_12ok2oklb90p6t0.R.inc(3492);for (int j = 0; (((j < y.length)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3493)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3494)==0&false)); ++j) {{
                    __CLR4_4_12ok2oklb90p6t0.R.inc(3495);y[j] = y[j].multiply(inv);
                }
            }}

            // update the bottom diagonal of the divided differences array
            }__CLR4_4_12ok2oklb90p6t0.R.inc(3496);final int n = abscissae.size();
            __CLR4_4_12ok2oklb90p6t0.R.inc(3497);bottomDiagonal.add(n - i, y);
            __CLR4_4_12ok2oklb90p6t0.R.inc(3498);T[] bottom0 = y;
            __CLR4_4_12ok2oklb90p6t0.R.inc(3499);for (int j = i; (((j < n)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3500)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3501)==0&false)); ++j) {{
                __CLR4_4_12ok2oklb90p6t0.R.inc(3502);final T[] bottom1 = bottomDiagonal.get(n - (j + 1));
                __CLR4_4_12ok2oklb90p6t0.R.inc(3503);if ((((x.equals(abscissae.get(n - (j + 1))))&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3504)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3505)==0&false))) {{
                    __CLR4_4_12ok2oklb90p6t0.R.inc(3506);throw new ZeroException(LocalizedFormats.DUPLICATED_ABSCISSA_DIVISION_BY_ZERO, x);
                }
                }__CLR4_4_12ok2oklb90p6t0.R.inc(3507);final T inv = x.subtract(abscissae.get(n - (j + 1))).reciprocal();
                __CLR4_4_12ok2oklb90p6t0.R.inc(3508);for (int k = 0; (((k < y.length)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3509)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3510)==0&false)); ++k) {{
                    __CLR4_4_12ok2oklb90p6t0.R.inc(3511);bottom1[k] = inv.multiply(bottom0[k].subtract(bottom1[k]));
                }
                }__CLR4_4_12ok2oklb90p6t0.R.inc(3512);bottom0 = bottom1;
            }

            // update the top diagonal of the divided differences array
            }__CLR4_4_12ok2oklb90p6t0.R.inc(3513);topDiagonal.add(bottom0.clone());

            // update the abscissae array
            __CLR4_4_12ok2oklb90p6t0.R.inc(3514);abscissae.add(x);

        }

    }}finally{__CLR4_4_12ok2oklb90p6t0.R.flushNeeded();}}

    /** Interpolate value at a specified abscissa.
     * @param x interpolation abscissa
     * @return interpolated value
     * @exception NoDataException if sample is empty
     * @throws NullArgumentException if x is null
     */
    public T[] value(T x) throws NoDataException, NullArgumentException {try{__CLR4_4_12ok2oklb90p6t0.R.inc(3515);

        // safety check
        __CLR4_4_12ok2oklb90p6t0.R.inc(3516);MathUtils.checkNotNull(x);
        __CLR4_4_12ok2oklb90p6t0.R.inc(3517);if ((((abscissae.isEmpty())&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3518)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3519)==0&false))) {{
            __CLR4_4_12ok2oklb90p6t0.R.inc(3520);throw new NoDataException(LocalizedFormats.EMPTY_INTERPOLATION_SAMPLE);
        }

        }__CLR4_4_12ok2oklb90p6t0.R.inc(3521);final T[] value = MathArrays.buildArray(x.getField(), topDiagonal.get(0).length);
        __CLR4_4_12ok2oklb90p6t0.R.inc(3522);T valueCoeff = x.getField().getOne();
        __CLR4_4_12ok2oklb90p6t0.R.inc(3523);for (int i = 0; (((i < topDiagonal.size())&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3524)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3525)==0&false)); ++i) {{
            __CLR4_4_12ok2oklb90p6t0.R.inc(3526);T[] dividedDifference = topDiagonal.get(i);
            __CLR4_4_12ok2oklb90p6t0.R.inc(3527);for (int k = 0; (((k < value.length)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3528)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3529)==0&false)); ++k) {{
                __CLR4_4_12ok2oklb90p6t0.R.inc(3530);value[k] = value[k].add(dividedDifference[k].multiply(valueCoeff));
            }
            }__CLR4_4_12ok2oklb90p6t0.R.inc(3531);final T deltaX = x.subtract(abscissae.get(i));
            __CLR4_4_12ok2oklb90p6t0.R.inc(3532);valueCoeff = valueCoeff.multiply(deltaX);
        }

        }__CLR4_4_12ok2oklb90p6t0.R.inc(3533);return value;

    }finally{__CLR4_4_12ok2oklb90p6t0.R.flushNeeded();}}

    /** Interpolate value and first derivatives at a specified abscissa.
     * @param x interpolation abscissa
     * @param order maximum derivation order
     * @return interpolated value and derivatives (value in row 0,
     * 1<sup>st</sup> derivative in row 1, ... n<sup>th</sup> derivative in row n)
     * @exception NoDataException if sample is empty
     * @throws NullArgumentException if x is null
     */
    public T[][] derivatives(T x, int order) throws NoDataException, NullArgumentException {try{__CLR4_4_12ok2oklb90p6t0.R.inc(3534);

        // safety check
        __CLR4_4_12ok2oklb90p6t0.R.inc(3535);MathUtils.checkNotNull(x);
        __CLR4_4_12ok2oklb90p6t0.R.inc(3536);if ((((abscissae.isEmpty())&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3537)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3538)==0&false))) {{
            __CLR4_4_12ok2oklb90p6t0.R.inc(3539);throw new NoDataException(LocalizedFormats.EMPTY_INTERPOLATION_SAMPLE);
        }

        }__CLR4_4_12ok2oklb90p6t0.R.inc(3540);final T zero = x.getField().getZero();
        __CLR4_4_12ok2oklb90p6t0.R.inc(3541);final T one  = x.getField().getOne();
        __CLR4_4_12ok2oklb90p6t0.R.inc(3542);final T[] tj = MathArrays.buildArray(x.getField(), order + 1);
        __CLR4_4_12ok2oklb90p6t0.R.inc(3543);tj[0] = zero;
        __CLR4_4_12ok2oklb90p6t0.R.inc(3544);for (int i = 0; (((i < order)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3545)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3546)==0&false)); ++i) {{
            __CLR4_4_12ok2oklb90p6t0.R.inc(3547);tj[i + 1] = tj[i].add(one);
        }

        }__CLR4_4_12ok2oklb90p6t0.R.inc(3548);final T[][] derivatives =
                MathArrays.buildArray(x.getField(), order + 1, topDiagonal.get(0).length);
        __CLR4_4_12ok2oklb90p6t0.R.inc(3549);final T[] valueCoeff = MathArrays.buildArray(x.getField(), order + 1);
        __CLR4_4_12ok2oklb90p6t0.R.inc(3550);valueCoeff[0] = x.getField().getOne();
        __CLR4_4_12ok2oklb90p6t0.R.inc(3551);for (int i = 0; (((i < topDiagonal.size())&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3552)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3553)==0&false)); ++i) {{
            __CLR4_4_12ok2oklb90p6t0.R.inc(3554);T[] dividedDifference = topDiagonal.get(i);
            __CLR4_4_12ok2oklb90p6t0.R.inc(3555);final T deltaX = x.subtract(abscissae.get(i));
            __CLR4_4_12ok2oklb90p6t0.R.inc(3556);for (int j = order; (((j >= 0)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3557)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3558)==0&false)); --j) {{
                __CLR4_4_12ok2oklb90p6t0.R.inc(3559);for (int k = 0; (((k < derivatives[j].length)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3560)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3561)==0&false)); ++k) {{
                    __CLR4_4_12ok2oklb90p6t0.R.inc(3562);derivatives[j][k] =
                            derivatives[j][k].add(dividedDifference[k].multiply(valueCoeff[j]));
                }
                }__CLR4_4_12ok2oklb90p6t0.R.inc(3563);valueCoeff[j] = valueCoeff[j].multiply(deltaX);
                __CLR4_4_12ok2oklb90p6t0.R.inc(3564);if ((((j > 0)&&(__CLR4_4_12ok2oklb90p6t0.R.iget(3565)!=0|true))||(__CLR4_4_12ok2oklb90p6t0.R.iget(3566)==0&false))) {{
                    __CLR4_4_12ok2oklb90p6t0.R.inc(3567);valueCoeff[j] = valueCoeff[j].add(tj[j].multiply(valueCoeff[j - 1]));
                }
            }}
        }}

        }__CLR4_4_12ok2oklb90p6t0.R.inc(3568);return derivatives;

    }finally{__CLR4_4_12ok2oklb90p6t0.R.flushNeeded();}}

}
