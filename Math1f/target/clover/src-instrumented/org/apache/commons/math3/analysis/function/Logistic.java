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

/**
 * <a href="http://en.wikipedia.org/wiki/Generalised_logistic_function">
 *  Generalised logistic</a> function.
 *
 * @since 3.0
 * @version $Id$
 */
public class Logistic implements UnivariateDifferentiableFunction, DifferentiableUnivariateFunction {public static class __CLR4_4_11kr1krlb90p6jw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Lower asymptote. */
    private final double a;
    /** Upper asymptote. */
    private final double k;
    /** Growth rate. */
    private final double b;
    /** Parameter that affects near which asymptote maximum growth occurs. */
    private final double oneOverN;
    /** Parameter that affects the position of the curve along the ordinate axis. */
    private final double q;
    /** Abscissa of maximum growth. */
    private final double m;

    /**
     * @param k If {@code b > 0}, value of the function for x going towards +&infin;.
     * If {@code b < 0}, value of the function for x going towards -&infin;.
     * @param m Abscissa of maximum growth.
     * @param b Growth rate.
     * @param q Parameter that affects the position of the curve along the
     * ordinate axis.
     * @param a If {@code b > 0}, value of the function for x going towards -&infin;.
     * If {@code b < 0}, value of the function for x going towards +&infin;.
     * @param n Parameter that affects near which asymptote the maximum
     * growth occurs.
     * @throws NotStrictlyPositiveException if {@code n <= 0}.
     */
    public Logistic(double k,
                    double m,
                    double b,
                    double q,
                    double a,
                    double n)
        throws NotStrictlyPositiveException {try{__CLR4_4_11kr1krlb90p6jw.R.inc(2043);
        __CLR4_4_11kr1krlb90p6jw.R.inc(2044);if ((((n <= 0)&&(__CLR4_4_11kr1krlb90p6jw.R.iget(2045)!=0|true))||(__CLR4_4_11kr1krlb90p6jw.R.iget(2046)==0&false))) {{
            __CLR4_4_11kr1krlb90p6jw.R.inc(2047);throw new NotStrictlyPositiveException(n);
        }

        }__CLR4_4_11kr1krlb90p6jw.R.inc(2048);this.k = k;
        __CLR4_4_11kr1krlb90p6jw.R.inc(2049);this.m = m;
        __CLR4_4_11kr1krlb90p6jw.R.inc(2050);this.b = b;
        __CLR4_4_11kr1krlb90p6jw.R.inc(2051);this.q = q;
        __CLR4_4_11kr1krlb90p6jw.R.inc(2052);this.a = a;
        __CLR4_4_11kr1krlb90p6jw.R.inc(2053);oneOverN = 1 / n;
    }finally{__CLR4_4_11kr1krlb90p6jw.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double value(double x) {try{__CLR4_4_11kr1krlb90p6jw.R.inc(2054);
        __CLR4_4_11kr1krlb90p6jw.R.inc(2055);return value(m - x, k, b, q, a, oneOverN);
    }finally{__CLR4_4_11kr1krlb90p6jw.R.flushNeeded();}}

    /** {@inheritDoc}
     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}
     */
    @Deprecated
    public UnivariateFunction derivative() {try{__CLR4_4_11kr1krlb90p6jw.R.inc(2056);
        __CLR4_4_11kr1krlb90p6jw.R.inc(2057);return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative();
    }finally{__CLR4_4_11kr1krlb90p6jw.R.flushNeeded();}}

    /**
     * Parametric function where the input array contains the parameters of
     * the {@link Logistic#Logistic(double,double,double,double,double,double)
     * logistic function}, ordered as follows:
     * <ul>
     *  <li>k</li>
     *  <li>m</li>
     *  <li>b</li>
     *  <li>q</li>
     *  <li>a</li>
     *  <li>n</li>
     * </ul>
     */
    public static class Parametric implements ParametricUnivariateFunction {
        /**
         * Computes the value of the sigmoid at {@code x}.
         *
         * @param x Value for which the function must be computed.
         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},
         * {@code a} and  {@code n}.
         * @return the value of the function.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 6.
         * @throws NotStrictlyPositiveException if {@code param[5] <= 0}.
         */
        public double value(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException,
                   NotStrictlyPositiveException {try{__CLR4_4_11kr1krlb90p6jw.R.inc(2058);
            __CLR4_4_11kr1krlb90p6jw.R.inc(2059);validateParameters(param);
            __CLR4_4_11kr1krlb90p6jw.R.inc(2060);return Logistic.value(param[1] - x, param[0],
                                  param[2], param[3],
                                  param[4], 1 / param[5]);
        }finally{__CLR4_4_11kr1krlb90p6jw.R.flushNeeded();}}

        /**
         * Computes the value of the gradient at {@code x}.
         * The components of the gradient vector are the partial
         * derivatives of the function with respect to each of the
         * <em>parameters</em>.
         *
         * @param x Value at which the gradient must be computed.
         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},
         * {@code a} and  {@code n}.
         * @return the gradient vector at {@code x}.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 6.
         * @throws NotStrictlyPositiveException if {@code param[5] <= 0}.
         */
        public double[] gradient(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException,
                   NotStrictlyPositiveException {try{__CLR4_4_11kr1krlb90p6jw.R.inc(2061);
            __CLR4_4_11kr1krlb90p6jw.R.inc(2062);validateParameters(param);

            __CLR4_4_11kr1krlb90p6jw.R.inc(2063);final double b = param[2];
            __CLR4_4_11kr1krlb90p6jw.R.inc(2064);final double q = param[3];

            __CLR4_4_11kr1krlb90p6jw.R.inc(2065);final double mMinusX = param[1] - x;
            __CLR4_4_11kr1krlb90p6jw.R.inc(2066);final double oneOverN = 1 / param[5];
            __CLR4_4_11kr1krlb90p6jw.R.inc(2067);final double exp = FastMath.exp(b * mMinusX);
            __CLR4_4_11kr1krlb90p6jw.R.inc(2068);final double qExp = q * exp;
            __CLR4_4_11kr1krlb90p6jw.R.inc(2069);final double qExp1 = qExp + 1;
            __CLR4_4_11kr1krlb90p6jw.R.inc(2070);final double factor1 = (param[0] - param[4]) * oneOverN / FastMath.pow(qExp1, oneOverN);
            __CLR4_4_11kr1krlb90p6jw.R.inc(2071);final double factor2 = -factor1 / qExp1;

            // Components of the gradient.
            __CLR4_4_11kr1krlb90p6jw.R.inc(2072);final double gk = Logistic.value(mMinusX, 1, b, q, 0, oneOverN);
            __CLR4_4_11kr1krlb90p6jw.R.inc(2073);final double gm = factor2 * b * qExp;
            __CLR4_4_11kr1krlb90p6jw.R.inc(2074);final double gb = factor2 * mMinusX * qExp;
            __CLR4_4_11kr1krlb90p6jw.R.inc(2075);final double gq = factor2 * exp;
            __CLR4_4_11kr1krlb90p6jw.R.inc(2076);final double ga = Logistic.value(mMinusX, 0, b, q, 1, oneOverN);
            __CLR4_4_11kr1krlb90p6jw.R.inc(2077);final double gn = factor1 * Math.log(qExp1) * oneOverN;

            __CLR4_4_11kr1krlb90p6jw.R.inc(2078);return new double[] { gk, gm, gb, gq, ga, gn };
        }finally{__CLR4_4_11kr1krlb90p6jw.R.flushNeeded();}}

        /**
         * Validates parameters to ensure they are appropriate for the evaluation of
         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}
         * methods.
         *
         * @param param Values for {@code k}, {@code m}, {@code b}, {@code q},
         * {@code a} and {@code n}.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 6.
         * @throws NotStrictlyPositiveException if {@code param[5] <= 0}.
         */
        private void validateParameters(double[] param)
            throws NullArgumentException,
                   DimensionMismatchException,
                   NotStrictlyPositiveException {try{__CLR4_4_11kr1krlb90p6jw.R.inc(2079);
            __CLR4_4_11kr1krlb90p6jw.R.inc(2080);if ((((param == null)&&(__CLR4_4_11kr1krlb90p6jw.R.iget(2081)!=0|true))||(__CLR4_4_11kr1krlb90p6jw.R.iget(2082)==0&false))) {{
                __CLR4_4_11kr1krlb90p6jw.R.inc(2083);throw new NullArgumentException();
            }
            }__CLR4_4_11kr1krlb90p6jw.R.inc(2084);if ((((param.length != 6)&&(__CLR4_4_11kr1krlb90p6jw.R.iget(2085)!=0|true))||(__CLR4_4_11kr1krlb90p6jw.R.iget(2086)==0&false))) {{
                __CLR4_4_11kr1krlb90p6jw.R.inc(2087);throw new DimensionMismatchException(param.length, 6);
            }
            }__CLR4_4_11kr1krlb90p6jw.R.inc(2088);if ((((param[5] <= 0)&&(__CLR4_4_11kr1krlb90p6jw.R.iget(2089)!=0|true))||(__CLR4_4_11kr1krlb90p6jw.R.iget(2090)==0&false))) {{
                __CLR4_4_11kr1krlb90p6jw.R.inc(2091);throw new NotStrictlyPositiveException(param[5]);
            }
        }}finally{__CLR4_4_11kr1krlb90p6jw.R.flushNeeded();}}
    }

    /**
     * @param mMinusX {@code m - x}.
     * @param k {@code k}.
     * @param b {@code b}.
     * @param q {@code q}.
     * @param a {@code a}.
     * @param oneOverN {@code 1 / n}.
     * @return the value of the function.
     */
    private static double value(double mMinusX,
                                double k,
                                double b,
                                double q,
                                double a,
                                double oneOverN) {try{__CLR4_4_11kr1krlb90p6jw.R.inc(2092);
        __CLR4_4_11kr1krlb90p6jw.R.inc(2093);return a + (k - a) / FastMath.pow(1 + q * FastMath.exp(b * mMinusX), oneOverN);
    }finally{__CLR4_4_11kr1krlb90p6jw.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.1
     */
    public DerivativeStructure value(final DerivativeStructure t) {try{__CLR4_4_11kr1krlb90p6jw.R.inc(2094);
        __CLR4_4_11kr1krlb90p6jw.R.inc(2095);return t.negate().add(m).multiply(b).exp().multiply(q).add(1).pow(oneOverN).reciprocal().multiply(k - a).add(a);
    }finally{__CLR4_4_11kr1krlb90p6jw.R.flushNeeded();}}

}
