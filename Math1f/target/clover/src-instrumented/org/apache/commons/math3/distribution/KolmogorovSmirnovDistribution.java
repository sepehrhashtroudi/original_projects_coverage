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

package org.apache.commons.math3.distribution;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.BigFractionField;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.apache.commons.math3.linear.Array2DRowFieldMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.FieldMatrix;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Implementation of the Kolmogorov-Smirnov distribution.
 *
 * <p>
 * Treats the distribution of the two-sided {@code P(D_n < d)} where
 * {@code D_n = sup_x |G(x) - G_n (x)|} for the theoretical cdf {@code G} and
 * the empirical cdf {@code G_n}.
 * </p>
 * <p>
 * This implementation is based on [1] with certain quick decisions for extreme
 * values given in [2].
 * </p>
 * <p>
 * In short, when wanting to evaluate {@code P(D_n < d)}, the method in [1] is
 * to write {@code d = (k - h) / n} for positive integer {@code k} and
 * {@code 0 <= h < 1}. Then {@code P(D_n < d) = (n! / n^n) * t_kk}, where
 * {@code t_kk} is the {@code (k, k)}'th entry in the special matrix
 * {@code H^n}, i.e. {@code H} to the {@code n}'th power.
 * </p>
 * <p>
 * References:
 * <ul>
 * <li>[1] <a href="http://www.jstatsoft.org/v08/i18/">
 * Evaluating Kolmogorov's Distribution</a> by George Marsaglia, Wai
 * Wan Tsang, and Jingbo Wang</li>
 * <li>[2] <a href="http://www.jstatsoft.org/v39/i11/">
 * Computing the Two-Sided Kolmogorov-Smirnov Distribution</a> by Richard Simard
 * and Pierre L'Ecuyer</li>
 * </ul>
 * Note that [1] contains an error in computing h, refer to
 * <a href="https://issues.apache.org/jira/browse/MATH-437">MATH-437</a> for details.
 * </p>
 *
 * @see <a href="http://en.wikipedia.org/wiki/Kolmogorov-Smirnov_test">
 * Kolmogorov-Smirnov test (Wikipedia)</a>
 * @version $Id$
 */
public class KolmogorovSmirnovDistribution implements Serializable {public static class __CLR4_4_18hd8hdlb90p7is{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11115,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -4670676796862967187L;

    /** Number of observations. */
    private int n;

    /**
     * @param n Number of observations
     * @throws NotStrictlyPositiveException if {@code n <= 0}
     */
    public KolmogorovSmirnovDistribution(int n)
        throws NotStrictlyPositiveException {try{__CLR4_4_18hd8hdlb90p7is.R.inc(10993);
        __CLR4_4_18hd8hdlb90p7is.R.inc(10994);if ((((n <= 0)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(10995)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(10996)==0&false))) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(10997);throw new NotStrictlyPositiveException(LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES, n);
        }

        }__CLR4_4_18hd8hdlb90p7is.R.inc(10998);this.n = n;
    }finally{__CLR4_4_18hd8hdlb90p7is.R.flushNeeded();}}

    /**
     * Calculates {@code P(D_n < d)} using method described in [1] with quick
     * decisions for extreme values given in [2] (see above). The result is not
     * exact as with
     * {@link KolmogorovSmirnovDistribution#cdfExact(double)} because
     * calculations are based on {@code double} rather than
     * {@link org.apache.commons.math3.fraction.BigFraction}.
     *
     * @param d statistic
     * @return the two-sided probability of {@code P(D_n < d)}
     * @throws MathArithmeticException if algorithm fails to convert {@code h}
     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing
     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and
     * {@code 0 <= h < 1}.
     */
    public double cdf(double d) throws MathArithmeticException {try{__CLR4_4_18hd8hdlb90p7is.R.inc(10999);
        __CLR4_4_18hd8hdlb90p7is.R.inc(11000);return this.cdf(d, false);
    }finally{__CLR4_4_18hd8hdlb90p7is.R.flushNeeded();}}

    /**
     * Calculates {@code P(D_n < d)} using method described in [1] with quick
     * decisions for extreme values given in [2] (see above). The result is
     * exact in the sense that BigFraction/BigReal is used everywhere at the
     * expense of very slow execution time. Almost never choose this in real
     * applications unless you are very sure; this is almost solely for
     * verification purposes. Normally, you would choose
     * {@link KolmogorovSmirnovDistribution#cdf(double)}
     *
     * @param d statistic
     * @return the two-sided probability of {@code P(D_n < d)}
     * @throws MathArithmeticException if algorithm fails to convert {@code h}
     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing
     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and
     * {@code 0 <= h < 1}.
     */
    public double cdfExact(double d) throws MathArithmeticException {try{__CLR4_4_18hd8hdlb90p7is.R.inc(11001);
        __CLR4_4_18hd8hdlb90p7is.R.inc(11002);return this.cdf(d, true);
    }finally{__CLR4_4_18hd8hdlb90p7is.R.flushNeeded();}}

    /**
     * Calculates {@code P(D_n < d)} using method described in [1] with quick
     * decisions for extreme values given in [2] (see above).
     *
     * @param d statistic
     * @param exact whether the probability should be calculated exact using
     * {@link org.apache.commons.math3.fraction.BigFraction} everywhere at the
     * expense of very slow execution time, or if {@code double} should be used
     * convenient places to gain speed. Almost never choose {@code true} in real
     * applications unless you are very sure; {@code true} is almost solely for
     * verification purposes.
     * @return the two-sided probability of {@code P(D_n < d)}
     * @throws MathArithmeticException if algorithm fails to convert {@code h}
     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing
     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and
     * {@code 0 <= h < 1}.
     */
    public double cdf(double d, boolean exact) throws MathArithmeticException {try{__CLR4_4_18hd8hdlb90p7is.R.inc(11003);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11004);final double ninv = 1 / ((double) n);
        __CLR4_4_18hd8hdlb90p7is.R.inc(11005);final double ninvhalf = 0.5 * ninv;

        __CLR4_4_18hd8hdlb90p7is.R.inc(11006);if ((((d <= ninvhalf)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11007)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11008)==0&false))) {{

            __CLR4_4_18hd8hdlb90p7is.R.inc(11009);return 0;

        } }else {__CLR4_4_18hd8hdlb90p7is.R.inc(11010);if ((((ninvhalf < d && d <= ninv)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11011)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11012)==0&false))) {{

            __CLR4_4_18hd8hdlb90p7is.R.inc(11013);double res = 1;
            __CLR4_4_18hd8hdlb90p7is.R.inc(11014);double f = 2 * d - ninv;

            // n! f^n = n*f * (n-1)*f * ... * 1*x
            __CLR4_4_18hd8hdlb90p7is.R.inc(11015);for (int i = 1; (((i <= n)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11016)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11017)==0&false)); ++i) {{
                __CLR4_4_18hd8hdlb90p7is.R.inc(11018);res *= i * f;
            }

            }__CLR4_4_18hd8hdlb90p7is.R.inc(11019);return res;

        } }else {__CLR4_4_18hd8hdlb90p7is.R.inc(11020);if ((((1 - ninv <= d && d < 1)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11021)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11022)==0&false))) {{

            __CLR4_4_18hd8hdlb90p7is.R.inc(11023);return 1 - 2 * Math.pow(1 - d, n);

        } }else {__CLR4_4_18hd8hdlb90p7is.R.inc(11024);if ((((1 <= d)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11025)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11026)==0&false))) {{

            __CLR4_4_18hd8hdlb90p7is.R.inc(11027);return 1;
        }

        }}}}__CLR4_4_18hd8hdlb90p7is.R.inc(11028);return (((exact )&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11029)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11030)==0&false))? exactK(d) : roundedK(d);
    }finally{__CLR4_4_18hd8hdlb90p7is.R.flushNeeded();}}

    /**
     * Calculates the exact value of {@code P(D_n < d)} using method described
     * in [1] and {@link org.apache.commons.math3.fraction.BigFraction} (see
     * above).
     *
     * @param d statistic
     * @return the two-sided probability of {@code P(D_n < d)}
     * @throws MathArithmeticException if algorithm fails to convert {@code h}
     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing
     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and
     * {@code 0 <= h < 1}.
     */
    private double exactK(double d) throws MathArithmeticException {try{__CLR4_4_18hd8hdlb90p7is.R.inc(11031);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11032);final int k = (int) Math.ceil(n * d);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11033);final FieldMatrix<BigFraction> H = this.createH(d);
        __CLR4_4_18hd8hdlb90p7is.R.inc(11034);final FieldMatrix<BigFraction> Hpower = H.power(n);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11035);BigFraction pFrac = Hpower.getEntry(k - 1, k - 1);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11036);for (int i = 1; (((i <= n)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11037)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11038)==0&false)); ++i) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11039);pFrac = pFrac.multiply(i).divide(n);
        }

        /*
         * BigFraction.doubleValue converts numerator to double and the
         * denominator to double and divides afterwards. That gives NaN quite
         * easy. This does not (scale is the number of digits):
         */
        }__CLR4_4_18hd8hdlb90p7is.R.inc(11040);return pFrac.bigDecimalValue(20, BigDecimal.ROUND_HALF_UP).doubleValue();
    }finally{__CLR4_4_18hd8hdlb90p7is.R.flushNeeded();}}

    /**
     * Calculates {@code P(D_n < d)} using method described in [1] and doubles
     * (see above).
     *
     * @param d statistic
     * @return the two-sided probability of {@code P(D_n < d)}
     * @throws MathArithmeticException if algorithm fails to convert {@code h}
     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing
     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and
     * {@code 0 <= h < 1}.
     */
    private double roundedK(double d) throws MathArithmeticException {try{__CLR4_4_18hd8hdlb90p7is.R.inc(11041);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11042);final int k = (int) Math.ceil(n * d);
        __CLR4_4_18hd8hdlb90p7is.R.inc(11043);final FieldMatrix<BigFraction> HBigFraction = this.createH(d);
        __CLR4_4_18hd8hdlb90p7is.R.inc(11044);final int m = HBigFraction.getRowDimension();

        /*
         * Here the rounding part comes into play: use
         * RealMatrix instead of FieldMatrix<BigFraction>
         */
        __CLR4_4_18hd8hdlb90p7is.R.inc(11045);final RealMatrix H = new Array2DRowRealMatrix(m, m);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11046);for (int i = 0; (((i < m)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11047)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11048)==0&false)); ++i) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11049);for (int j = 0; (((j < m)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11050)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11051)==0&false)); ++j) {{
                __CLR4_4_18hd8hdlb90p7is.R.inc(11052);H.setEntry(i, j, HBigFraction.getEntry(i, j).doubleValue());
            }
        }}

        }__CLR4_4_18hd8hdlb90p7is.R.inc(11053);final RealMatrix Hpower = H.power(n);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11054);double pFrac = Hpower.getEntry(k - 1, k - 1);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11055);for (int i = 1; (((i <= n)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11056)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11057)==0&false)); ++i) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11058);pFrac *= (double) i / (double) n;
        }

        }__CLR4_4_18hd8hdlb90p7is.R.inc(11059);return pFrac;
    }finally{__CLR4_4_18hd8hdlb90p7is.R.flushNeeded();}}

    /***
     * Creates {@code H} of size {@code m x m} as described in [1] (see above).
     *
     * @param d statistic
     * @return H matrix
     * @throws NumberIsTooLargeException if fractional part is greater than 1
     * @throws FractionConversionException if algorithm fails to convert
     * {@code h} to a {@link org.apache.commons.math3.fraction.BigFraction} in
     * expressing {@code d} as {@code (k - h) / m} for integer {@code k, m} and
     * {@code 0 <= h < 1}.
     */
    private FieldMatrix<BigFraction> createH(double d)
            throws NumberIsTooLargeException, FractionConversionException {try{__CLR4_4_18hd8hdlb90p7is.R.inc(11060);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11061);int k = (int) Math.ceil(n * d);

        __CLR4_4_18hd8hdlb90p7is.R.inc(11062);int m = 2 * k - 1;
        __CLR4_4_18hd8hdlb90p7is.R.inc(11063);double hDouble = k - n * d;

        __CLR4_4_18hd8hdlb90p7is.R.inc(11064);if ((((hDouble >= 1)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11065)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11066)==0&false))) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11067);throw new NumberIsTooLargeException(hDouble, 1.0, false);
        }

        }__CLR4_4_18hd8hdlb90p7is.R.inc(11068);BigFraction h = null;

        __CLR4_4_18hd8hdlb90p7is.R.inc(11069);try {
            __CLR4_4_18hd8hdlb90p7is.R.inc(11070);h = new BigFraction(hDouble, 1.0e-20, 10000);
        } catch (FractionConversionException e1) {
            __CLR4_4_18hd8hdlb90p7is.R.inc(11071);try {
                __CLR4_4_18hd8hdlb90p7is.R.inc(11072);h = new BigFraction(hDouble, 1.0e-10, 10000);
            } catch (FractionConversionException e2) {
                __CLR4_4_18hd8hdlb90p7is.R.inc(11073);h = new BigFraction(hDouble, 1.0e-5, 10000);
            }
        }

        __CLR4_4_18hd8hdlb90p7is.R.inc(11074);final BigFraction[][] Hdata = new BigFraction[m][m];

        /*
         * Start by filling everything with either 0 or 1.
         */
        __CLR4_4_18hd8hdlb90p7is.R.inc(11075);for (int i = 0; (((i < m)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11076)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11077)==0&false)); ++i) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11078);for (int j = 0; (((j < m)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11079)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11080)==0&false)); ++j) {{
                __CLR4_4_18hd8hdlb90p7is.R.inc(11081);if ((((i - j + 1 < 0)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11082)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11083)==0&false))) {{
                    __CLR4_4_18hd8hdlb90p7is.R.inc(11084);Hdata[i][j] = BigFraction.ZERO;
                } }else {{
                    __CLR4_4_18hd8hdlb90p7is.R.inc(11085);Hdata[i][j] = BigFraction.ONE;
                }
            }}
        }}

        /*
         * Setting up power-array to avoid calculating the same value twice:
         * hPowers[0] = h^1 ... hPowers[m-1] = h^m
         */
        }__CLR4_4_18hd8hdlb90p7is.R.inc(11086);final BigFraction[] hPowers = new BigFraction[m];
        __CLR4_4_18hd8hdlb90p7is.R.inc(11087);hPowers[0] = h;
        __CLR4_4_18hd8hdlb90p7is.R.inc(11088);for (int i = 1; (((i < m)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11089)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11090)==0&false)); ++i) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11091);hPowers[i] = h.multiply(hPowers[i - 1]);
        }

        /*
         * First column and last row has special values (each other reversed).
         */
        }__CLR4_4_18hd8hdlb90p7is.R.inc(11092);for (int i = 0; (((i < m)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11093)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11094)==0&false)); ++i) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11095);Hdata[i][0] = Hdata[i][0].subtract(hPowers[i]);
            __CLR4_4_18hd8hdlb90p7is.R.inc(11096);Hdata[m - 1][i] = Hdata[m - 1][i].subtract(hPowers[m - i - 1]);
        }

        /*
         * [1] states: "For 1/2 < h < 1 the bottom left element of the matrix
         * should be (1 - 2*h^m + (2h - 1)^m )/m!" Since 0 <= h < 1, then if h >
         * 1/2 is sufficient to check:
         */
        }__CLR4_4_18hd8hdlb90p7is.R.inc(11097);if ((((h.compareTo(BigFraction.ONE_HALF) == 1)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11098)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11099)==0&false))) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11100);Hdata[m - 1][0] = Hdata[m - 1][0].add(h.multiply(2).subtract(1).pow(m));
        }

        /*
         * Aside from the first column and last row, the (i, j)-th element is
         * 1/(i - j + 1)! if i - j + 1 >= 0, else 0. 1's and 0's are already
         * put, so only division with (i - j + 1)! is needed in the elements
         * that have 1's. There is no need to calculate (i - j + 1)! and then
         * divide - small steps avoid overflows.
         *
         * Note that i - j + 1 > 0 <=> i + 1 > j instead of j'ing all the way to
         * m. Also note that it is started at g = 2 because dividing by 1 isn't
         * really necessary.
         */
        }__CLR4_4_18hd8hdlb90p7is.R.inc(11101);for (int i = 0; (((i < m)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11102)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11103)==0&false)); ++i) {{
            __CLR4_4_18hd8hdlb90p7is.R.inc(11104);for (int j = 0; (((j < i + 1)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11105)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11106)==0&false)); ++j) {{
                __CLR4_4_18hd8hdlb90p7is.R.inc(11107);if ((((i - j + 1 > 0)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11108)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11109)==0&false))) {{
                    __CLR4_4_18hd8hdlb90p7is.R.inc(11110);for (int g = 2; (((g <= i - j + 1)&&(__CLR4_4_18hd8hdlb90p7is.R.iget(11111)!=0|true))||(__CLR4_4_18hd8hdlb90p7is.R.iget(11112)==0&false)); ++g) {{
                        __CLR4_4_18hd8hdlb90p7is.R.inc(11113);Hdata[i][j] = Hdata[i][j].divide(g);
                    }
                }}
            }}
        }}

        }__CLR4_4_18hd8hdlb90p7is.R.inc(11114);return new Array2DRowFieldMatrix<BigFraction>(BigFractionField.getInstance(), Hdata);
    }finally{__CLR4_4_18hd8hdlb90p7is.R.flushNeeded();}}
}
