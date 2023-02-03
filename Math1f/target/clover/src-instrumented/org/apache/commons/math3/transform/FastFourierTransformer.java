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
package org.apache.commons.math3.transform;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

/**
 * Implements the Fast Fourier Transform for transformation of one-dimensional
 * real or complex data sets. For reference, see <em>Applied Numerical Linear
 * Algebra</em>, ISBN 0898713897, chapter 6.
 * <p>
 * There are several variants of the discrete Fourier transform, with various
 * normalization conventions, which are specified by the parameter
 * {@link DftNormalization}.
 * <p>
 * The current implementation of the discrete Fourier transform as a fast
 * Fourier transform requires the length of the data set to be a power of 2.
 * This greatly simplifies and speeds up the code. Users can pad the data with
 * zeros to meet this requirement. There are other flavors of FFT, for
 * reference, see S. Winograd,
 * <i>On computing the discrete Fourier transform</i>, Mathematics of
 * Computation, 32 (1978), 175 - 199.
 *
 * @see DftNormalization
 * @version $Id$
 * @since 1.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FastFourierTransformer implements Serializable {public static class __CLR4_4_116m616m6lb90pate{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,55537,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    static final long serialVersionUID = 20120210L;

    /**
     * {@code W_SUB_N_R[i]} is the real part of
     * {@code exp(- 2 * i * pi / n)}:
     * {@code W_SUB_N_R[i] = cos(2 * pi/ n)}, where {@code n = 2^i}.
     */
    private static final double[] W_SUB_N_R =
            {  0x1.0p0, -0x1.0p0, 0x1.1a62633145c07p-54, 0x1.6a09e667f3bcdp-1
            , 0x1.d906bcf328d46p-1, 0x1.f6297cff75cbp-1, 0x1.fd88da3d12526p-1, 0x1.ff621e3796d7ep-1
            , 0x1.ffd886084cd0dp-1, 0x1.fff62169b92dbp-1, 0x1.fffd8858e8a92p-1, 0x1.ffff621621d02p-1
            , 0x1.ffffd88586ee6p-1, 0x1.fffff62161a34p-1, 0x1.fffffd8858675p-1, 0x1.ffffff621619cp-1
            , 0x1.ffffffd885867p-1, 0x1.fffffff62161ap-1, 0x1.fffffffd88586p-1, 0x1.ffffffff62162p-1
            , 0x1.ffffffffd8858p-1, 0x1.fffffffff6216p-1, 0x1.fffffffffd886p-1, 0x1.ffffffffff621p-1
            , 0x1.ffffffffffd88p-1, 0x1.fffffffffff62p-1, 0x1.fffffffffffd9p-1, 0x1.ffffffffffff6p-1
            , 0x1.ffffffffffffep-1, 0x1.fffffffffffffp-1, 0x1.0p0, 0x1.0p0
            , 0x1.0p0, 0x1.0p0, 0x1.0p0, 0x1.0p0
            , 0x1.0p0, 0x1.0p0, 0x1.0p0, 0x1.0p0
            , 0x1.0p0, 0x1.0p0, 0x1.0p0, 0x1.0p0
            , 0x1.0p0, 0x1.0p0, 0x1.0p0, 0x1.0p0
            , 0x1.0p0, 0x1.0p0, 0x1.0p0, 0x1.0p0
            , 0x1.0p0, 0x1.0p0, 0x1.0p0, 0x1.0p0
            , 0x1.0p0, 0x1.0p0, 0x1.0p0, 0x1.0p0
            , 0x1.0p0, 0x1.0p0, 0x1.0p0 };

    /**
     * {@code W_SUB_N_I[i]} is the imaginary part of
     * {@code exp(- 2 * i * pi / n)}:
     * {@code W_SUB_N_I[i] = -sin(2 * pi/ n)}, where {@code n = 2^i}.
     */
    private static final double[] W_SUB_N_I =
            {  0x1.1a62633145c07p-52, -0x1.1a62633145c07p-53, -0x1.0p0, -0x1.6a09e667f3bccp-1
            , -0x1.87de2a6aea963p-2, -0x1.8f8b83c69a60ap-3, -0x1.917a6bc29b42cp-4, -0x1.91f65f10dd814p-5
            , -0x1.92155f7a3667ep-6, -0x1.921d1fcdec784p-7, -0x1.921f0fe670071p-8, -0x1.921f8becca4bap-9
            , -0x1.921faaee6472dp-10, -0x1.921fb2aecb36p-11, -0x1.921fb49ee4ea6p-12, -0x1.921fb51aeb57bp-13
            , -0x1.921fb539ecf31p-14, -0x1.921fb541ad59ep-15, -0x1.921fb5439d73ap-16, -0x1.921fb544197ap-17
            , -0x1.921fb544387bap-18, -0x1.921fb544403c1p-19, -0x1.921fb544422c2p-20, -0x1.921fb54442a83p-21
            , -0x1.921fb54442c73p-22, -0x1.921fb54442cefp-23, -0x1.921fb54442d0ep-24, -0x1.921fb54442d15p-25
            , -0x1.921fb54442d17p-26, -0x1.921fb54442d18p-27, -0x1.921fb54442d18p-28, -0x1.921fb54442d18p-29
            , -0x1.921fb54442d18p-30, -0x1.921fb54442d18p-31, -0x1.921fb54442d18p-32, -0x1.921fb54442d18p-33
            , -0x1.921fb54442d18p-34, -0x1.921fb54442d18p-35, -0x1.921fb54442d18p-36, -0x1.921fb54442d18p-37
            , -0x1.921fb54442d18p-38, -0x1.921fb54442d18p-39, -0x1.921fb54442d18p-40, -0x1.921fb54442d18p-41
            , -0x1.921fb54442d18p-42, -0x1.921fb54442d18p-43, -0x1.921fb54442d18p-44, -0x1.921fb54442d18p-45
            , -0x1.921fb54442d18p-46, -0x1.921fb54442d18p-47, -0x1.921fb54442d18p-48, -0x1.921fb54442d18p-49
            , -0x1.921fb54442d18p-50, -0x1.921fb54442d18p-51, -0x1.921fb54442d18p-52, -0x1.921fb54442d18p-53
            , -0x1.921fb54442d18p-54, -0x1.921fb54442d18p-55, -0x1.921fb54442d18p-56, -0x1.921fb54442d18p-57
            , -0x1.921fb54442d18p-58, -0x1.921fb54442d18p-59, -0x1.921fb54442d18p-60 };

    /** The type of DFT to be performed. */
    private final DftNormalization normalization;

    /**
     * Creates a new instance of this class, with various normalization
     * conventions.
     *
     * @param normalization the type of normalization to be applied to the
     * transformed data
     */
    public FastFourierTransformer(final DftNormalization normalization) {try{__CLR4_4_116m616m6lb90pate.R.inc(55230);
        __CLR4_4_116m616m6lb90pate.R.inc(55231);this.normalization = normalization;
    }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Performs identical index bit reversal shuffles on two arrays of identical
     * size. Each element in the array is swapped with another element based on
     * the bit-reversal of the index. For example, in an array with length 16,
     * item at binary index 0011 (decimal 3) would be swapped with the item at
     * binary index 1100 (decimal 12).
     *
     * @param a the first array to be shuffled
     * @param b the second array to be shuffled
     */
    private static void bitReversalShuffle2(double[] a, double[] b) {try{__CLR4_4_116m616m6lb90pate.R.inc(55232);
        __CLR4_4_116m616m6lb90pate.R.inc(55233);final int n = a.length;
        assert (((b.length == n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55234)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55235)==0&false));
        __CLR4_4_116m616m6lb90pate.R.inc(55236);final int halfOfN = n >> 1;

        __CLR4_4_116m616m6lb90pate.R.inc(55237);int j = 0;
        __CLR4_4_116m616m6lb90pate.R.inc(55238);for (int i = 0; (((i < n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55239)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55240)==0&false)); i++) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55241);if ((((i < j)&&(__CLR4_4_116m616m6lb90pate.R.iget(55242)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55243)==0&false))) {{
                // swap indices i & j
                __CLR4_4_116m616m6lb90pate.R.inc(55244);double temp = a[i];
                __CLR4_4_116m616m6lb90pate.R.inc(55245);a[i] = a[j];
                __CLR4_4_116m616m6lb90pate.R.inc(55246);a[j] = temp;

                __CLR4_4_116m616m6lb90pate.R.inc(55247);temp = b[i];
                __CLR4_4_116m616m6lb90pate.R.inc(55248);b[i] = b[j];
                __CLR4_4_116m616m6lb90pate.R.inc(55249);b[j] = temp;
            }

            }__CLR4_4_116m616m6lb90pate.R.inc(55250);int k = halfOfN;
            __CLR4_4_116m616m6lb90pate.R.inc(55251);while ((((k <= j && k > 0)&&(__CLR4_4_116m616m6lb90pate.R.iget(55252)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55253)==0&false))) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55254);j -= k;
                __CLR4_4_116m616m6lb90pate.R.inc(55255);k >>= 1;
            }
            }__CLR4_4_116m616m6lb90pate.R.inc(55256);j += k;
        }
    }}finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Applies the proper normalization to the specified transformed data.
     *
     * @param dataRI the unscaled transformed data
     * @param normalization the normalization to be applied
     * @param type the type of transform (forward, inverse) which resulted in the specified data
     */
    private static void normalizeTransformedData(final double[][] dataRI,
        final DftNormalization normalization, final TransformType type) {try{__CLR4_4_116m616m6lb90pate.R.inc(55257);

        __CLR4_4_116m616m6lb90pate.R.inc(55258);final double[] dataR = dataRI[0];
        __CLR4_4_116m616m6lb90pate.R.inc(55259);final double[] dataI = dataRI[1];
        __CLR4_4_116m616m6lb90pate.R.inc(55260);final int n = dataR.length;
        assert (((dataI.length == n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55261)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55262)==0&false));

        boolean __CLB4_4_1_bool0=false;__CLR4_4_116m616m6lb90pate.R.inc(55263);switch (normalization) {
            case STANDARD:if (!__CLB4_4_1_bool0) {__CLR4_4_116m616m6lb90pate.R.inc(55264);__CLB4_4_1_bool0=true;}
                __CLR4_4_116m616m6lb90pate.R.inc(55265);if ((((type == TransformType.INVERSE)&&(__CLR4_4_116m616m6lb90pate.R.iget(55266)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55267)==0&false))) {{
                    __CLR4_4_116m616m6lb90pate.R.inc(55268);final double scaleFactor = 1.0 / ((double) n);
                    __CLR4_4_116m616m6lb90pate.R.inc(55269);for (int i = 0; (((i < n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55270)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55271)==0&false)); i++) {{
                        __CLR4_4_116m616m6lb90pate.R.inc(55272);dataR[i] *= scaleFactor;
                        __CLR4_4_116m616m6lb90pate.R.inc(55273);dataI[i] *= scaleFactor;
                    }
                }}
                }__CLR4_4_116m616m6lb90pate.R.inc(55274);break;
            case UNITARY:if (!__CLB4_4_1_bool0) {__CLR4_4_116m616m6lb90pate.R.inc(55275);__CLB4_4_1_bool0=true;}
                __CLR4_4_116m616m6lb90pate.R.inc(55276);final double scaleFactor = 1.0 / FastMath.sqrt(n);
                __CLR4_4_116m616m6lb90pate.R.inc(55277);for (int i = 0; (((i < n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55278)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55279)==0&false)); i++) {{
                    __CLR4_4_116m616m6lb90pate.R.inc(55280);dataR[i] *= scaleFactor;
                    __CLR4_4_116m616m6lb90pate.R.inc(55281);dataI[i] *= scaleFactor;
                }
                }__CLR4_4_116m616m6lb90pate.R.inc(55282);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_116m616m6lb90pate.R.inc(55283);__CLB4_4_1_bool0=true;}
                /*
                 * This should never occur in normal conditions. However this
                 * clause has been added as a safeguard if other types of
                 * normalizations are ever implemented, and the corresponding
                 * test is forgotten in the present switch.
                 */
                __CLR4_4_116m616m6lb90pate.R.inc(55284);throw new MathIllegalStateException();
        }
    }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Computes the standard transform of the specified complex data. The
     * computation is done in place. The input data is laid out as follows
     * <ul>
     *   <li>{@code dataRI[0][i]} is the real part of the {@code i}-th data point,</li>
     *   <li>{@code dataRI[1][i]} is the imaginary part of the {@code i}-th data point.</li>
     * </ul>
     *
     * @param dataRI the two dimensional array of real and imaginary parts of the data
     * @param normalization the normalization to be applied to the transformed data
     * @param type the type of transform (forward, inverse) to be performed
     * @throws DimensionMismatchException if the number of rows of the specified
     *   array is not two, or the array is not rectangular
     * @throws MathIllegalArgumentException if the number of data points is not
     *   a power of two
     */
    public static void transformInPlace(final double[][] dataRI,
        final DftNormalization normalization, final TransformType type) {try{__CLR4_4_116m616m6lb90pate.R.inc(55285);

        __CLR4_4_116m616m6lb90pate.R.inc(55286);if ((((dataRI.length != 2)&&(__CLR4_4_116m616m6lb90pate.R.iget(55287)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55288)==0&false))) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55289);throw new DimensionMismatchException(dataRI.length, 2);
        }
        }__CLR4_4_116m616m6lb90pate.R.inc(55290);final double[] dataR = dataRI[0];
        __CLR4_4_116m616m6lb90pate.R.inc(55291);final double[] dataI = dataRI[1];
        __CLR4_4_116m616m6lb90pate.R.inc(55292);if ((((dataR.length != dataI.length)&&(__CLR4_4_116m616m6lb90pate.R.iget(55293)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55294)==0&false))) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55295);throw new DimensionMismatchException(dataI.length, dataR.length);
        }

        }__CLR4_4_116m616m6lb90pate.R.inc(55296);final int n = dataR.length;
        __CLR4_4_116m616m6lb90pate.R.inc(55297);if ((((!ArithmeticUtils.isPowerOfTwo(n))&&(__CLR4_4_116m616m6lb90pate.R.iget(55298)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55299)==0&false))) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55300);throw new MathIllegalArgumentException(
                LocalizedFormats.NOT_POWER_OF_TWO_CONSIDER_PADDING,
                Integer.valueOf(n));
        }

        }__CLR4_4_116m616m6lb90pate.R.inc(55301);if ((((n == 1)&&(__CLR4_4_116m616m6lb90pate.R.iget(55302)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55303)==0&false))) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55304);return;
        } }else {__CLR4_4_116m616m6lb90pate.R.inc(55305);if ((((n == 2)&&(__CLR4_4_116m616m6lb90pate.R.iget(55306)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55307)==0&false))) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55308);final double srcR0 = dataR[0];
            __CLR4_4_116m616m6lb90pate.R.inc(55309);final double srcI0 = dataI[0];
            __CLR4_4_116m616m6lb90pate.R.inc(55310);final double srcR1 = dataR[1];
            __CLR4_4_116m616m6lb90pate.R.inc(55311);final double srcI1 = dataI[1];

            // X_0 = x_0 + x_1
            __CLR4_4_116m616m6lb90pate.R.inc(55312);dataR[0] = srcR0 + srcR1;
            __CLR4_4_116m616m6lb90pate.R.inc(55313);dataI[0] = srcI0 + srcI1;
            // X_1 = x_0 - x_1
            __CLR4_4_116m616m6lb90pate.R.inc(55314);dataR[1] = srcR0 - srcR1;
            __CLR4_4_116m616m6lb90pate.R.inc(55315);dataI[1] = srcI0 - srcI1;

            __CLR4_4_116m616m6lb90pate.R.inc(55316);normalizeTransformedData(dataRI, normalization, type);
            __CLR4_4_116m616m6lb90pate.R.inc(55317);return;
        }

        }}__CLR4_4_116m616m6lb90pate.R.inc(55318);bitReversalShuffle2(dataR, dataI);

        // Do 4-term DFT.
        __CLR4_4_116m616m6lb90pate.R.inc(55319);if ((((type == TransformType.INVERSE)&&(__CLR4_4_116m616m6lb90pate.R.iget(55320)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55321)==0&false))) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55322);for (int i0 = 0; (((i0 < n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55323)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55324)==0&false)); i0 += 4) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55325);final int i1 = i0 + 1;
                __CLR4_4_116m616m6lb90pate.R.inc(55326);final int i2 = i0 + 2;
                __CLR4_4_116m616m6lb90pate.R.inc(55327);final int i3 = i0 + 3;

                __CLR4_4_116m616m6lb90pate.R.inc(55328);final double srcR0 = dataR[i0];
                __CLR4_4_116m616m6lb90pate.R.inc(55329);final double srcI0 = dataI[i0];
                __CLR4_4_116m616m6lb90pate.R.inc(55330);final double srcR1 = dataR[i2];
                __CLR4_4_116m616m6lb90pate.R.inc(55331);final double srcI1 = dataI[i2];
                __CLR4_4_116m616m6lb90pate.R.inc(55332);final double srcR2 = dataR[i1];
                __CLR4_4_116m616m6lb90pate.R.inc(55333);final double srcI2 = dataI[i1];
                __CLR4_4_116m616m6lb90pate.R.inc(55334);final double srcR3 = dataR[i3];
                __CLR4_4_116m616m6lb90pate.R.inc(55335);final double srcI3 = dataI[i3];

                // 4-term DFT
                // X_0 = x_0 + x_1 + x_2 + x_3
                __CLR4_4_116m616m6lb90pate.R.inc(55336);dataR[i0] = srcR0 + srcR1 + srcR2 + srcR3;
                __CLR4_4_116m616m6lb90pate.R.inc(55337);dataI[i0] = srcI0 + srcI1 + srcI2 + srcI3;
                // X_1 = x_0 - x_2 + j * (x_3 - x_1)
                __CLR4_4_116m616m6lb90pate.R.inc(55338);dataR[i1] = srcR0 - srcR2 + (srcI3 - srcI1);
                __CLR4_4_116m616m6lb90pate.R.inc(55339);dataI[i1] = srcI0 - srcI2 + (srcR1 - srcR3);
                // X_2 = x_0 - x_1 + x_2 - x_3
                __CLR4_4_116m616m6lb90pate.R.inc(55340);dataR[i2] = srcR0 - srcR1 + srcR2 - srcR3;
                __CLR4_4_116m616m6lb90pate.R.inc(55341);dataI[i2] = srcI0 - srcI1 + srcI2 - srcI3;
                // X_3 = x_0 - x_2 + j * (x_1 - x_3)
                __CLR4_4_116m616m6lb90pate.R.inc(55342);dataR[i3] = srcR0 - srcR2 + (srcI1 - srcI3);
                __CLR4_4_116m616m6lb90pate.R.inc(55343);dataI[i3] = srcI0 - srcI2 + (srcR3 - srcR1);
            }
        }} }else {{
            __CLR4_4_116m616m6lb90pate.R.inc(55344);for (int i0 = 0; (((i0 < n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55345)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55346)==0&false)); i0 += 4) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55347);final int i1 = i0 + 1;
                __CLR4_4_116m616m6lb90pate.R.inc(55348);final int i2 = i0 + 2;
                __CLR4_4_116m616m6lb90pate.R.inc(55349);final int i3 = i0 + 3;

                __CLR4_4_116m616m6lb90pate.R.inc(55350);final double srcR0 = dataR[i0];
                __CLR4_4_116m616m6lb90pate.R.inc(55351);final double srcI0 = dataI[i0];
                __CLR4_4_116m616m6lb90pate.R.inc(55352);final double srcR1 = dataR[i2];
                __CLR4_4_116m616m6lb90pate.R.inc(55353);final double srcI1 = dataI[i2];
                __CLR4_4_116m616m6lb90pate.R.inc(55354);final double srcR2 = dataR[i1];
                __CLR4_4_116m616m6lb90pate.R.inc(55355);final double srcI2 = dataI[i1];
                __CLR4_4_116m616m6lb90pate.R.inc(55356);final double srcR3 = dataR[i3];
                __CLR4_4_116m616m6lb90pate.R.inc(55357);final double srcI3 = dataI[i3];

                // 4-term DFT
                // X_0 = x_0 + x_1 + x_2 + x_3
                __CLR4_4_116m616m6lb90pate.R.inc(55358);dataR[i0] = srcR0 + srcR1 + srcR2 + srcR3;
                __CLR4_4_116m616m6lb90pate.R.inc(55359);dataI[i0] = srcI0 + srcI1 + srcI2 + srcI3;
                // X_1 = x_0 - x_2 + j * (x_3 - x_1)
                __CLR4_4_116m616m6lb90pate.R.inc(55360);dataR[i1] = srcR0 - srcR2 + (srcI1 - srcI3);
                __CLR4_4_116m616m6lb90pate.R.inc(55361);dataI[i1] = srcI0 - srcI2 + (srcR3 - srcR1);
                // X_2 = x_0 - x_1 + x_2 - x_3
                __CLR4_4_116m616m6lb90pate.R.inc(55362);dataR[i2] = srcR0 - srcR1 + srcR2 - srcR3;
                __CLR4_4_116m616m6lb90pate.R.inc(55363);dataI[i2] = srcI0 - srcI1 + srcI2 - srcI3;
                // X_3 = x_0 - x_2 + j * (x_1 - x_3)
                __CLR4_4_116m616m6lb90pate.R.inc(55364);dataR[i3] = srcR0 - srcR2 + (srcI3 - srcI1);
                __CLR4_4_116m616m6lb90pate.R.inc(55365);dataI[i3] = srcI0 - srcI2 + (srcR1 - srcR3);
            }
        }}

        }__CLR4_4_116m616m6lb90pate.R.inc(55366);int lastN0 = 4;
        __CLR4_4_116m616m6lb90pate.R.inc(55367);int lastLogN0 = 2;
        __CLR4_4_116m616m6lb90pate.R.inc(55368);while ((((lastN0 < n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55369)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55370)==0&false))) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55371);int n0 = lastN0 << 1;
            __CLR4_4_116m616m6lb90pate.R.inc(55372);int logN0 = lastLogN0 + 1;
            __CLR4_4_116m616m6lb90pate.R.inc(55373);double wSubN0R = W_SUB_N_R[logN0];
            __CLR4_4_116m616m6lb90pate.R.inc(55374);double wSubN0I = W_SUB_N_I[logN0];
            __CLR4_4_116m616m6lb90pate.R.inc(55375);if ((((type == TransformType.INVERSE)&&(__CLR4_4_116m616m6lb90pate.R.iget(55376)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55377)==0&false))) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55378);wSubN0I = -wSubN0I;
            }

            // Combine even/odd transforms of size lastN0 into a transform of size N0 (lastN0 * 2).
            }__CLR4_4_116m616m6lb90pate.R.inc(55379);for (int destEvenStartIndex = 0; (((destEvenStartIndex < n)&&(__CLR4_4_116m616m6lb90pate.R.iget(55380)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55381)==0&false)); destEvenStartIndex += n0) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55382);int destOddStartIndex = destEvenStartIndex + lastN0;

                __CLR4_4_116m616m6lb90pate.R.inc(55383);double wSubN0ToRR = 1;
                __CLR4_4_116m616m6lb90pate.R.inc(55384);double wSubN0ToRI = 0;

                __CLR4_4_116m616m6lb90pate.R.inc(55385);for (int r = 0; (((r < lastN0)&&(__CLR4_4_116m616m6lb90pate.R.iget(55386)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55387)==0&false)); r++) {{
                    __CLR4_4_116m616m6lb90pate.R.inc(55388);double grR = dataR[destEvenStartIndex + r];
                    __CLR4_4_116m616m6lb90pate.R.inc(55389);double grI = dataI[destEvenStartIndex + r];
                    __CLR4_4_116m616m6lb90pate.R.inc(55390);double hrR = dataR[destOddStartIndex + r];
                    __CLR4_4_116m616m6lb90pate.R.inc(55391);double hrI = dataI[destOddStartIndex + r];

                    // dest[destEvenStartIndex + r] = Gr + WsubN0ToR * Hr
                    __CLR4_4_116m616m6lb90pate.R.inc(55392);dataR[destEvenStartIndex + r] = grR + wSubN0ToRR * hrR - wSubN0ToRI * hrI;
                    __CLR4_4_116m616m6lb90pate.R.inc(55393);dataI[destEvenStartIndex + r] = grI + wSubN0ToRR * hrI + wSubN0ToRI * hrR;
                    // dest[destOddStartIndex + r] = Gr - WsubN0ToR * Hr
                    __CLR4_4_116m616m6lb90pate.R.inc(55394);dataR[destOddStartIndex + r] = grR - (wSubN0ToRR * hrR - wSubN0ToRI * hrI);
                    __CLR4_4_116m616m6lb90pate.R.inc(55395);dataI[destOddStartIndex + r] = grI - (wSubN0ToRR * hrI + wSubN0ToRI * hrR);

                    // WsubN0ToR *= WsubN0R
                    __CLR4_4_116m616m6lb90pate.R.inc(55396);double nextWsubN0ToRR = wSubN0ToRR * wSubN0R - wSubN0ToRI * wSubN0I;
                    __CLR4_4_116m616m6lb90pate.R.inc(55397);double nextWsubN0ToRI = wSubN0ToRR * wSubN0I + wSubN0ToRI * wSubN0R;
                    __CLR4_4_116m616m6lb90pate.R.inc(55398);wSubN0ToRR = nextWsubN0ToRR;
                    __CLR4_4_116m616m6lb90pate.R.inc(55399);wSubN0ToRI = nextWsubN0ToRI;
                }
            }}

            }__CLR4_4_116m616m6lb90pate.R.inc(55400);lastN0 = n0;
            __CLR4_4_116m616m6lb90pate.R.inc(55401);lastLogN0 = logN0;
        }

        }__CLR4_4_116m616m6lb90pate.R.inc(55402);normalizeTransformedData(dataRI, normalization, type);
    }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Returns the (forward, inverse) transform of the specified real data set.
     *
     * @param f the real data array to be transformed
     * @param type the type of transform (forward, inverse) to be performed
     * @return the complex transformed array
     * @throws MathIllegalArgumentException if the length of the data array is not a power of two
     */
    public Complex[] transform(final double[] f, final TransformType type) {try{__CLR4_4_116m616m6lb90pate.R.inc(55403);
        __CLR4_4_116m616m6lb90pate.R.inc(55404);final double[][] dataRI = new double[][] {
            MathArrays.copyOf(f, f.length), new double[f.length]
        };

        __CLR4_4_116m616m6lb90pate.R.inc(55405);transformInPlace(dataRI, normalization, type);

        __CLR4_4_116m616m6lb90pate.R.inc(55406);return TransformUtils.createComplexArray(dataRI);
    }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Returns the (forward, inverse) transform of the specified real function,
     * sampled on the specified interval.
     *
     * @param f the function to be sampled and transformed
     * @param min the (inclusive) lower bound for the interval
     * @param max the (exclusive) upper bound for the interval
     * @param n the number of sample points
     * @param type the type of transform (forward, inverse) to be performed
     * @return the complex transformed array
     * @throws org.apache.commons.math3.exception.NumberIsTooLargeException
     *   if the lower bound is greater than, or equal to the upper bound
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     *   if the number of sample points {@code n} is negative
     * @throws MathIllegalArgumentException if the number of sample points
     *   {@code n} is not a power of two
     */
    public Complex[] transform(final UnivariateFunction f,
                               final double min, final double max, final int n,
                               final TransformType type) {try{__CLR4_4_116m616m6lb90pate.R.inc(55407);

        __CLR4_4_116m616m6lb90pate.R.inc(55408);final double[] data = FunctionUtils.sample(f, min, max, n);
        __CLR4_4_116m616m6lb90pate.R.inc(55409);return transform(data, type);
    }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Returns the (forward, inverse) transform of the specified complex data set.
     *
     * @param f the complex data array to be transformed
     * @param type the type of transform (forward, inverse) to be performed
     * @return the complex transformed array
     * @throws MathIllegalArgumentException if the length of the data array is not a power of two
     */
    public Complex[] transform(final Complex[] f, final TransformType type) {try{__CLR4_4_116m616m6lb90pate.R.inc(55410);
        __CLR4_4_116m616m6lb90pate.R.inc(55411);final double[][] dataRI = TransformUtils.createRealImaginaryArray(f);

        __CLR4_4_116m616m6lb90pate.R.inc(55412);transformInPlace(dataRI, normalization, type);

        __CLR4_4_116m616m6lb90pate.R.inc(55413);return TransformUtils.createComplexArray(dataRI);
    }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Performs a multi-dimensional Fourier transform on a given array. Use
     * {@link #transform(Complex[], TransformType)} in a row-column
     * implementation in any number of dimensions with
     * O(N&times;log(N)) complexity with
     * N = n<sub>1</sub> &times; n<sub>2</sub> &times;n<sub>3</sub> &times; ...
     * &times; n<sub>d</sub>, where n<sub>k</sub> is the number of elements in
     * dimension k, and d is the total number of dimensions.
     *
     * @param mdca Multi-Dimensional Complex Array, i.e. {@code Complex[][][][]}
     * @param type the type of transform (forward, inverse) to be performed
     * @return transform of {@code mdca} as a Multi-Dimensional Complex Array, i.e. {@code Complex[][][][]}
     * @throws IllegalArgumentException if any dimension is not a power of two
     * @deprecated see MATH-736
     */
    @Deprecated
    public Object mdfft(Object mdca, TransformType type) {try{__CLR4_4_116m616m6lb90pate.R.inc(55414);
        __CLR4_4_116m616m6lb90pate.R.inc(55415);MultiDimensionalComplexMatrix mdcm = (MultiDimensionalComplexMatrix)
                new MultiDimensionalComplexMatrix(mdca).clone();
        __CLR4_4_116m616m6lb90pate.R.inc(55416);int[] dimensionSize = mdcm.getDimensionSizes();
        //cycle through each dimension
        __CLR4_4_116m616m6lb90pate.R.inc(55417);for (int i = 0; (((i < dimensionSize.length)&&(__CLR4_4_116m616m6lb90pate.R.iget(55418)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55419)==0&false)); i++) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55420);mdfft(mdcm, type, i, new int[0]);
        }
        }__CLR4_4_116m616m6lb90pate.R.inc(55421);return mdcm.getArray();
    }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Performs one dimension of a multi-dimensional Fourier transform.
     *
     * @param mdcm input matrix
     * @param type the type of transform (forward, inverse) to be performed
     * @param d index of the dimension to process
     * @param subVector recursion subvector
     * @throws IllegalArgumentException if any dimension is not a power of two
     * @deprecated see MATH-736
     */
    @Deprecated
    private void mdfft(MultiDimensionalComplexMatrix mdcm,
            TransformType type, int d, int[] subVector) {try{__CLR4_4_116m616m6lb90pate.R.inc(55422);

        __CLR4_4_116m616m6lb90pate.R.inc(55423);int[] dimensionSize = mdcm.getDimensionSizes();
        //if done
        __CLR4_4_116m616m6lb90pate.R.inc(55424);if ((((subVector.length == dimensionSize.length)&&(__CLR4_4_116m616m6lb90pate.R.iget(55425)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55426)==0&false))) {{
            __CLR4_4_116m616m6lb90pate.R.inc(55427);Complex[] temp = new Complex[dimensionSize[d]];
            __CLR4_4_116m616m6lb90pate.R.inc(55428);for (int i = 0; (((i < dimensionSize[d])&&(__CLR4_4_116m616m6lb90pate.R.iget(55429)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55430)==0&false)); i++) {{
                //fft along dimension d
                __CLR4_4_116m616m6lb90pate.R.inc(55431);subVector[d] = i;
                __CLR4_4_116m616m6lb90pate.R.inc(55432);temp[i] = mdcm.get(subVector);
            }

            }__CLR4_4_116m616m6lb90pate.R.inc(55433);temp = transform(temp, type);

            __CLR4_4_116m616m6lb90pate.R.inc(55434);for (int i = 0; (((i < dimensionSize[d])&&(__CLR4_4_116m616m6lb90pate.R.iget(55435)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55436)==0&false)); i++) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55437);subVector[d] = i;
                __CLR4_4_116m616m6lb90pate.R.inc(55438);mdcm.set(temp[i], subVector);
            }
        }} }else {{
            __CLR4_4_116m616m6lb90pate.R.inc(55439);int[] vector = new int[subVector.length + 1];
            __CLR4_4_116m616m6lb90pate.R.inc(55440);System.arraycopy(subVector, 0, vector, 0, subVector.length);
            __CLR4_4_116m616m6lb90pate.R.inc(55441);if ((((subVector.length == d)&&(__CLR4_4_116m616m6lb90pate.R.iget(55442)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55443)==0&false))) {{
                //value is not important once the recursion is done.
                //then an fft will be applied along the dimension d.
                __CLR4_4_116m616m6lb90pate.R.inc(55444);vector[d] = 0;
                __CLR4_4_116m616m6lb90pate.R.inc(55445);mdfft(mdcm, type, d, vector);
            } }else {{
                __CLR4_4_116m616m6lb90pate.R.inc(55446);for (int i = 0; (((i < dimensionSize[subVector.length])&&(__CLR4_4_116m616m6lb90pate.R.iget(55447)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55448)==0&false)); i++) {{
                    __CLR4_4_116m616m6lb90pate.R.inc(55449);vector[subVector.length] = i;
                    //further split along the next dimension
                    __CLR4_4_116m616m6lb90pate.R.inc(55450);mdfft(mdcm, type, d, vector);
                }
            }}
        }}
    }}finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

    /**
     * Complex matrix implementation. Not designed for synchronized access may
     * eventually be replaced by jsr-83 of the java community process
     * http://jcp.org/en/jsr/detail?id=83
     * may require additional exception throws for other basic requirements.
     *
     * @deprecated see MATH-736
     */
    @Deprecated
    private static class MultiDimensionalComplexMatrix
        implements Cloneable {

        /** Size in all dimensions. */
        protected int[] dimensionSize;

        /** Storage array. */
        protected Object multiDimensionalComplexArray;

        /**
         * Simple constructor.
         *
         * @param multiDimensionalComplexArray array containing the matrix
         * elements
         */
        public MultiDimensionalComplexMatrix(
                Object multiDimensionalComplexArray) {try{__CLR4_4_116m616m6lb90pate.R.inc(55451);

            __CLR4_4_116m616m6lb90pate.R.inc(55452);this.multiDimensionalComplexArray = multiDimensionalComplexArray;

            // count dimensions
            __CLR4_4_116m616m6lb90pate.R.inc(55453);int numOfDimensions = 0;
            __CLR4_4_116m616m6lb90pate.R.inc(55454);for (Object lastDimension = multiDimensionalComplexArray;
                 (((lastDimension instanceof Object[])&&(__CLR4_4_116m616m6lb90pate.R.iget(55455)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55456)==0&false));) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55457);final Object[] array = (Object[]) lastDimension;
                __CLR4_4_116m616m6lb90pate.R.inc(55458);numOfDimensions++;
                __CLR4_4_116m616m6lb90pate.R.inc(55459);lastDimension = array[0];
            }

            // allocate array with exact count
            }__CLR4_4_116m616m6lb90pate.R.inc(55460);dimensionSize = new int[numOfDimensions];

            // fill array
            __CLR4_4_116m616m6lb90pate.R.inc(55461);numOfDimensions = 0;
            __CLR4_4_116m616m6lb90pate.R.inc(55462);for (Object lastDimension = multiDimensionalComplexArray;
                 (((lastDimension instanceof Object[])&&(__CLR4_4_116m616m6lb90pate.R.iget(55463)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55464)==0&false));) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55465);final Object[] array = (Object[]) lastDimension;
                __CLR4_4_116m616m6lb90pate.R.inc(55466);dimensionSize[numOfDimensions++] = array.length;
                __CLR4_4_116m616m6lb90pate.R.inc(55467);lastDimension = array[0];
            }

        }}finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

        /**
         * Get a matrix element.
         *
         * @param vector indices of the element
         * @return matrix element
         * @exception DimensionMismatchException if dimensions do not match
         */
        public Complex get(int... vector)
                throws DimensionMismatchException {try{__CLR4_4_116m616m6lb90pate.R.inc(55468);

            __CLR4_4_116m616m6lb90pate.R.inc(55469);if ((((vector == null)&&(__CLR4_4_116m616m6lb90pate.R.iget(55470)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55471)==0&false))) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55472);if ((((dimensionSize.length > 0)&&(__CLR4_4_116m616m6lb90pate.R.iget(55473)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55474)==0&false))) {{
                    __CLR4_4_116m616m6lb90pate.R.inc(55475);throw new DimensionMismatchException(
                            0,
                            dimensionSize.length);
                }
                }__CLR4_4_116m616m6lb90pate.R.inc(55476);return null;
            }
            }__CLR4_4_116m616m6lb90pate.R.inc(55477);if ((((vector.length != dimensionSize.length)&&(__CLR4_4_116m616m6lb90pate.R.iget(55478)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55479)==0&false))) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55480);throw new DimensionMismatchException(
                        vector.length,
                        dimensionSize.length);
            }

            }__CLR4_4_116m616m6lb90pate.R.inc(55481);Object lastDimension = multiDimensionalComplexArray;

            __CLR4_4_116m616m6lb90pate.R.inc(55482);for (int i = 0; (((i < dimensionSize.length)&&(__CLR4_4_116m616m6lb90pate.R.iget(55483)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55484)==0&false)); i++) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55485);lastDimension = ((Object[]) lastDimension)[vector[i]];
            }
            }__CLR4_4_116m616m6lb90pate.R.inc(55486);return (Complex) lastDimension;
        }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

        /**
         * Set a matrix element.
         *
         * @param magnitude magnitude of the element
         * @param vector indices of the element
         * @return the previous value
         * @exception DimensionMismatchException if dimensions do not match
         */
        public Complex set(Complex magnitude, int... vector)
                throws DimensionMismatchException {try{__CLR4_4_116m616m6lb90pate.R.inc(55487);

            __CLR4_4_116m616m6lb90pate.R.inc(55488);if ((((vector == null)&&(__CLR4_4_116m616m6lb90pate.R.iget(55489)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55490)==0&false))) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55491);if ((((dimensionSize.length > 0)&&(__CLR4_4_116m616m6lb90pate.R.iget(55492)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55493)==0&false))) {{
                    __CLR4_4_116m616m6lb90pate.R.inc(55494);throw new DimensionMismatchException(
                            0,
                            dimensionSize.length);
                }
                }__CLR4_4_116m616m6lb90pate.R.inc(55495);return null;
            }
            }__CLR4_4_116m616m6lb90pate.R.inc(55496);if ((((vector.length != dimensionSize.length)&&(__CLR4_4_116m616m6lb90pate.R.iget(55497)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55498)==0&false))) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55499);throw new DimensionMismatchException(
                        vector.length,
                        dimensionSize.length);
            }

            }__CLR4_4_116m616m6lb90pate.R.inc(55500);Object[] lastDimension = (Object[]) multiDimensionalComplexArray;
            __CLR4_4_116m616m6lb90pate.R.inc(55501);for (int i = 0; (((i < dimensionSize.length - 1)&&(__CLR4_4_116m616m6lb90pate.R.iget(55502)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55503)==0&false)); i++) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55504);lastDimension = (Object[]) lastDimension[vector[i]];
            }

            }__CLR4_4_116m616m6lb90pate.R.inc(55505);Complex lastValue = (Complex) lastDimension[vector[dimensionSize.length - 1]];
            __CLR4_4_116m616m6lb90pate.R.inc(55506);lastDimension[vector[dimensionSize.length - 1]] = magnitude;

            __CLR4_4_116m616m6lb90pate.R.inc(55507);return lastValue;
        }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

        /**
         * Get the size in all dimensions.
         *
         * @return size in all dimensions
         */
        public int[] getDimensionSizes() {try{__CLR4_4_116m616m6lb90pate.R.inc(55508);
            __CLR4_4_116m616m6lb90pate.R.inc(55509);return dimensionSize.clone();
        }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

        /**
         * Get the underlying storage array.
         *
         * @return underlying storage array
         */
        public Object getArray() {try{__CLR4_4_116m616m6lb90pate.R.inc(55510);
            __CLR4_4_116m616m6lb90pate.R.inc(55511);return multiDimensionalComplexArray;
        }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public Object clone() {try{__CLR4_4_116m616m6lb90pate.R.inc(55512);
            __CLR4_4_116m616m6lb90pate.R.inc(55513);MultiDimensionalComplexMatrix mdcm =
                    new MultiDimensionalComplexMatrix(Array.newInstance(
                    Complex.class, dimensionSize));
            __CLR4_4_116m616m6lb90pate.R.inc(55514);clone(mdcm);
            __CLR4_4_116m616m6lb90pate.R.inc(55515);return mdcm;
        }finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}

        /**
         * Copy contents of current array into mdcm.
         *
         * @param mdcm array where to copy data
         */
        private void clone(MultiDimensionalComplexMatrix mdcm) {try{__CLR4_4_116m616m6lb90pate.R.inc(55516);

            __CLR4_4_116m616m6lb90pate.R.inc(55517);int[] vector = new int[dimensionSize.length];
            __CLR4_4_116m616m6lb90pate.R.inc(55518);int size = 1;
            __CLR4_4_116m616m6lb90pate.R.inc(55519);for (int i = 0; (((i < dimensionSize.length)&&(__CLR4_4_116m616m6lb90pate.R.iget(55520)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55521)==0&false)); i++) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55522);size *= dimensionSize[i];
            }
            }__CLR4_4_116m616m6lb90pate.R.inc(55523);int[][] vectorList = new int[size][dimensionSize.length];
            __CLR4_4_116m616m6lb90pate.R.inc(55524);for (int[] nextVector : vectorList) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55525);System.arraycopy(vector, 0, nextVector, 0,
                                 dimensionSize.length);
                __CLR4_4_116m616m6lb90pate.R.inc(55526);for (int i = 0; (((i < dimensionSize.length)&&(__CLR4_4_116m616m6lb90pate.R.iget(55527)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55528)==0&false)); i++) {{
                    __CLR4_4_116m616m6lb90pate.R.inc(55529);vector[i]++;
                    __CLR4_4_116m616m6lb90pate.R.inc(55530);if ((((vector[i] < dimensionSize[i])&&(__CLR4_4_116m616m6lb90pate.R.iget(55531)!=0|true))||(__CLR4_4_116m616m6lb90pate.R.iget(55532)==0&false))) {{
                        __CLR4_4_116m616m6lb90pate.R.inc(55533);break;
                    } }else {{
                        __CLR4_4_116m616m6lb90pate.R.inc(55534);vector[i] = 0;
                    }
                }}
            }}

            }__CLR4_4_116m616m6lb90pate.R.inc(55535);for (int[] nextVector : vectorList) {{
                __CLR4_4_116m616m6lb90pate.R.inc(55536);mdcm.set(get(nextVector), nextVector);
            }
        }}finally{__CLR4_4_116m616m6lb90pate.R.flushNeeded();}}
    }
}
