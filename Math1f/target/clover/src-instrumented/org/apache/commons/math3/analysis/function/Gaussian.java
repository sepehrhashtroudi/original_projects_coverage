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

package org.apache.commons.math3.analysis.function;

import java.util.Arrays;

import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/**
 * <a href="http://en.wikipedia.org/wiki/Gaussian_function">
 *  Gaussian</a> function.
 *
 * @since 3.0
 * @version $Id$
 */
public class Gaussian implements UnivariateDifferentiableFunction, DifferentiableUnivariateFunction {public static class __CLR4_4_11gb1gblb90p6ir{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,1966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Mean. */
    private final double mean;
    /** Inverse of the standard deviation. */
    private final double is;
    /** Inverse of twice the square of the standard deviation. */
    private final double i2s2;
    /** Normalization factor. */
    private final double norm;

    /**
     * Gaussian with given normalization factor, mean and standard deviation.
     *
     * @param norm Normalization factor.
     * @param mean Mean.
     * @param sigma Standard deviation.
     * @throws NotStrictlyPositiveException if {@code sigma <= 0}.
     */
    public Gaussian(double norm,
                    double mean,
                    double sigma)
        throws NotStrictlyPositiveException {try{__CLR4_4_11gb1gblb90p6ir.R.inc(1883);
        __CLR4_4_11gb1gblb90p6ir.R.inc(1884);if ((((sigma <= 0)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1885)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1886)==0&false))) {{
            __CLR4_4_11gb1gblb90p6ir.R.inc(1887);throw new NotStrictlyPositiveException(sigma);
        }

        }__CLR4_4_11gb1gblb90p6ir.R.inc(1888);this.norm = norm;
        __CLR4_4_11gb1gblb90p6ir.R.inc(1889);this.mean = mean;
        __CLR4_4_11gb1gblb90p6ir.R.inc(1890);this.is   = 1 / sigma;
        __CLR4_4_11gb1gblb90p6ir.R.inc(1891);this.i2s2 = 0.5 * is * is;
    }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

    /**
     * Normalized gaussian with given mean and standard deviation.
     *
     * @param mean Mean.
     * @param sigma Standard deviation.
     * @throws NotStrictlyPositiveException if {@code sigma <= 0}.
     */
    public Gaussian(double mean,
                    double sigma)
        throws NotStrictlyPositiveException {
        this(1 / (sigma * FastMath.sqrt(2 * Math.PI)), mean, sigma);__CLR4_4_11gb1gblb90p6ir.R.inc(1893);try{__CLR4_4_11gb1gblb90p6ir.R.inc(1892);
    }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

    /**
     * Normalized gaussian with zero mean and unit standard deviation.
     */
    public Gaussian() {
        this(0, 1);__CLR4_4_11gb1gblb90p6ir.R.inc(1895);try{__CLR4_4_11gb1gblb90p6ir.R.inc(1894);
    }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double value(double x) {try{__CLR4_4_11gb1gblb90p6ir.R.inc(1896);
        __CLR4_4_11gb1gblb90p6ir.R.inc(1897);return value(x - mean, norm, i2s2);
    }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

    /** {@inheritDoc}
     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}
     */
    @Deprecated
    public UnivariateFunction derivative() {try{__CLR4_4_11gb1gblb90p6ir.R.inc(1898);
        __CLR4_4_11gb1gblb90p6ir.R.inc(1899);return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative();
    }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

    /**
     * Parametric function where the input array contains the parameters of
     * the Gaussian, ordered as follows:
     * <ul>
     *  <li>Norm</li>
     *  <li>Mean</li>
     *  <li>Standard deviation</li>
     * </ul>
     */
    public static class Parametric implements ParametricUnivariateFunction {
        /**
         * Computes the value of the Gaussian at {@code x}.
         *
         * @param x Value for which the function must be computed.
         * @param param Values of norm, mean and standard deviation.
         * @return the value of the function.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 3.
         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.
         */
        public double value(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException,
                   NotStrictlyPositiveException {try{__CLR4_4_11gb1gblb90p6ir.R.inc(1900);
            __CLR4_4_11gb1gblb90p6ir.R.inc(1901);validateParameters(param);

            __CLR4_4_11gb1gblb90p6ir.R.inc(1902);final double diff = x - param[1];
            __CLR4_4_11gb1gblb90p6ir.R.inc(1903);final double i2s2 = 1 / (2 * param[2] * param[2]);
            __CLR4_4_11gb1gblb90p6ir.R.inc(1904);return Gaussian.value(diff, param[0], i2s2);
        }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

        /**
         * Computes the value of the gradient at {@code x}.
         * The components of the gradient vector are the partial
         * derivatives of the function with respect to each of the
         * <em>parameters</em> (norm, mean and standard deviation).
         *
         * @param x Value at which the gradient must be computed.
         * @param param Values of norm, mean and standard deviation.
         * @return the gradient vector at {@code x}.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 3.
         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.
         */
        public double[] gradient(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException,
                   NotStrictlyPositiveException {try{__CLR4_4_11gb1gblb90p6ir.R.inc(1905);
            __CLR4_4_11gb1gblb90p6ir.R.inc(1906);validateParameters(param);

            __CLR4_4_11gb1gblb90p6ir.R.inc(1907);final double norm = param[0];
            __CLR4_4_11gb1gblb90p6ir.R.inc(1908);final double diff = x - param[1];
            __CLR4_4_11gb1gblb90p6ir.R.inc(1909);final double sigma = param[2];
            __CLR4_4_11gb1gblb90p6ir.R.inc(1910);final double i2s2 = 1 / (2 * sigma * sigma);

            __CLR4_4_11gb1gblb90p6ir.R.inc(1911);final double n = Gaussian.value(diff, 1, i2s2);
            __CLR4_4_11gb1gblb90p6ir.R.inc(1912);final double m = norm * n * 2 * i2s2 * diff;
            __CLR4_4_11gb1gblb90p6ir.R.inc(1913);final double s = m * diff / sigma;

            __CLR4_4_11gb1gblb90p6ir.R.inc(1914);return new double[] { n, m, s };
        }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

        /**
         * Validates parameters to ensure they are appropriate for the evaluation of
         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}
         * methods.
         *
         * @param param Values of norm, mean and standard deviation.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 3.
         * @throws NotStrictlyPositiveException if {@code param[2]} is negative.
         */
        private void validateParameters(double[] param)
            throws NullArgumentException,
                   DimensionMismatchException,
                   NotStrictlyPositiveException {try{__CLR4_4_11gb1gblb90p6ir.R.inc(1915);
            __CLR4_4_11gb1gblb90p6ir.R.inc(1916);if ((((param == null)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1917)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1918)==0&false))) {{
                __CLR4_4_11gb1gblb90p6ir.R.inc(1919);throw new NullArgumentException();
            }
            }__CLR4_4_11gb1gblb90p6ir.R.inc(1920);if ((((param.length != 3)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1921)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1922)==0&false))) {{
                __CLR4_4_11gb1gblb90p6ir.R.inc(1923);throw new DimensionMismatchException(param.length, 3);
            }
            }__CLR4_4_11gb1gblb90p6ir.R.inc(1924);if ((((param[2] <= 0)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1925)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1926)==0&false))) {{
                __CLR4_4_11gb1gblb90p6ir.R.inc(1927);throw new NotStrictlyPositiveException(param[2]);
            }
        }}finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}
    }

    /**
     * @param xMinusMean {@code x - mean}.
     * @param norm Normalization factor.
     * @param i2s2 Inverse of twice the square of the standard deviation.
     * @return the value of the Gaussian at {@code x}.
     */
    private static double value(double xMinusMean,
                                double norm,
                                double i2s2) {try{__CLR4_4_11gb1gblb90p6ir.R.inc(1928);
        __CLR4_4_11gb1gblb90p6ir.R.inc(1929);return norm * FastMath.exp(-xMinusMean * xMinusMean * i2s2);
    }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.1
     */
    public DerivativeStructure value(final DerivativeStructure t)
        throws DimensionMismatchException {try{__CLR4_4_11gb1gblb90p6ir.R.inc(1930);

        __CLR4_4_11gb1gblb90p6ir.R.inc(1931);final double u = is * (t.getValue() - mean);
        __CLR4_4_11gb1gblb90p6ir.R.inc(1932);double[] f = new double[t.getOrder() + 1];

        // the nth order derivative of the Gaussian has the form:
        // dn(g(x)/dxn = (norm / s^n) P_n(u) exp(-u^2/2) with u=(x-m)/s
        // where P_n(u) is a degree n polynomial with same parity as n
        // P_0(u) = 1, P_1(u) = -u, P_2(u) = u^2 - 1, P_3(u) = -u^3 + 3 u...
        // the general recurrence relation for P_n is:
        // P_n(u) = P_(n-1)'(u) - u P_(n-1)(u)
        // as per polynomial parity, we can store coefficients of both P_(n-1) and P_n in the same array
        __CLR4_4_11gb1gblb90p6ir.R.inc(1933);final double[] p = new double[f.length];
        __CLR4_4_11gb1gblb90p6ir.R.inc(1934);p[0] = 1;
        __CLR4_4_11gb1gblb90p6ir.R.inc(1935);final double u2 = u * u;
        __CLR4_4_11gb1gblb90p6ir.R.inc(1936);double coeff = norm * FastMath.exp(-0.5 * u2);
        __CLR4_4_11gb1gblb90p6ir.R.inc(1937);if ((((coeff <= Precision.SAFE_MIN)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1938)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1939)==0&false))) {{
            __CLR4_4_11gb1gblb90p6ir.R.inc(1940);Arrays.fill(f, 0.0);
        } }else {{
            __CLR4_4_11gb1gblb90p6ir.R.inc(1941);f[0] = coeff;
            __CLR4_4_11gb1gblb90p6ir.R.inc(1942);for (int n = 1; (((n < f.length)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1943)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1944)==0&false)); ++n) {{

                // update and evaluate polynomial P_n(x)
                __CLR4_4_11gb1gblb90p6ir.R.inc(1945);double v = 0;
                __CLR4_4_11gb1gblb90p6ir.R.inc(1946);p[n] = -p[n - 1];
                __CLR4_4_11gb1gblb90p6ir.R.inc(1947);for (int k = n; (((k >= 0)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1948)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1949)==0&false)); k -= 2) {{
                    __CLR4_4_11gb1gblb90p6ir.R.inc(1950);v = v * u2 + p[k];
                    __CLR4_4_11gb1gblb90p6ir.R.inc(1951);if ((((k > 2)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1952)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1953)==0&false))) {{
                        __CLR4_4_11gb1gblb90p6ir.R.inc(1954);p[k - 2] = (k - 1) * p[k - 1] - p[k - 3];
                    } }else {__CLR4_4_11gb1gblb90p6ir.R.inc(1955);if ((((k == 2)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1956)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1957)==0&false))) {{
                        __CLR4_4_11gb1gblb90p6ir.R.inc(1958);p[0] = p[1];
                    }
                }}}
                }__CLR4_4_11gb1gblb90p6ir.R.inc(1959);if (((((n & 0x1) == 1)&&(__CLR4_4_11gb1gblb90p6ir.R.iget(1960)!=0|true))||(__CLR4_4_11gb1gblb90p6ir.R.iget(1961)==0&false))) {{
                    __CLR4_4_11gb1gblb90p6ir.R.inc(1962);v *= u;
                }

                }__CLR4_4_11gb1gblb90p6ir.R.inc(1963);coeff *= is;
                __CLR4_4_11gb1gblb90p6ir.R.inc(1964);f[n] = coeff * v;

            }
        }}

        }__CLR4_4_11gb1gblb90p6ir.R.inc(1965);return t.compose(f);

    }finally{__CLR4_4_11gb1gblb90p6ir.R.flushNeeded();}}

}
