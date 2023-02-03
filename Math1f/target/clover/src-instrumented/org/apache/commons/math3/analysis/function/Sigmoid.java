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
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;

/**
 * <a href="http://en.wikipedia.org/wiki/Sigmoid_function">
 *  Sigmoid</a> function.
 * It is the inverse of the {@link Logit logit} function.
 * A more flexible version, the generalised logistic, is implemented
 * by the {@link Logistic} class.
 *
 * @since 3.0
 * @version $Id$
 */
public class Sigmoid implements UnivariateDifferentiableFunction, DifferentiableUnivariateFunction {public static class __CLR4_4_11om1omlb90p6l5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2238,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Lower asymptote. */
    private final double lo;
    /** Higher asymptote. */
    private final double hi;

    /**
     * Usual sigmoid function, where the lower asymptote is 0 and the higher
     * asymptote is 1.
     */
    public Sigmoid() {
        this(0, 1);__CLR4_4_11om1omlb90p6l5.R.inc(2183);try{__CLR4_4_11om1omlb90p6l5.R.inc(2182);
    }finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}

    /**
     * Sigmoid function.
     *
     * @param lo Lower asymptote.
     * @param hi Higher asymptote.
     */
    public Sigmoid(double lo,
                   double hi) {try{__CLR4_4_11om1omlb90p6l5.R.inc(2184);
        __CLR4_4_11om1omlb90p6l5.R.inc(2185);this.lo = lo;
        __CLR4_4_11om1omlb90p6l5.R.inc(2186);this.hi = hi;
    }finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}

    /** {@inheritDoc}
     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}
     */
    @Deprecated
    public UnivariateFunction derivative() {try{__CLR4_4_11om1omlb90p6l5.R.inc(2187);
        __CLR4_4_11om1omlb90p6l5.R.inc(2188);return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative();
    }finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double value(double x) {try{__CLR4_4_11om1omlb90p6l5.R.inc(2189);
        __CLR4_4_11om1omlb90p6l5.R.inc(2190);return value(x, lo, hi);
    }finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}

    /**
     * Parametric function where the input array contains the parameters of
     * the {@link Sigmoid#Sigmoid(double,double) sigmoid function}, ordered
     * as follows:
     * <ul>
     *  <li>Lower asymptote</li>
     *  <li>Higher asymptote</li>
     * </ul>
     */
    public static class Parametric implements ParametricUnivariateFunction {
        /**
         * Computes the value of the sigmoid at {@code x}.
         *
         * @param x Value for which the function must be computed.
         * @param param Values of lower asymptote and higher asymptote.
         * @return the value of the function.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 2.
         */
        public double value(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11om1omlb90p6l5.R.inc(2191);
            __CLR4_4_11om1omlb90p6l5.R.inc(2192);validateParameters(param);
            __CLR4_4_11om1omlb90p6l5.R.inc(2193);return Sigmoid.value(x, param[0], param[1]);
        }finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}

        /**
         * Computes the value of the gradient at {@code x}.
         * The components of the gradient vector are the partial
         * derivatives of the function with respect to each of the
         * <em>parameters</em> (lower asymptote and higher asymptote).
         *
         * @param x Value at which the gradient must be computed.
         * @param param Values for lower asymptote and higher asymptote.
         * @return the gradient vector at {@code x}.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 2.
         */
        public double[] gradient(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11om1omlb90p6l5.R.inc(2194);
            __CLR4_4_11om1omlb90p6l5.R.inc(2195);validateParameters(param);

            __CLR4_4_11om1omlb90p6l5.R.inc(2196);final double invExp1 = 1 / (1 + FastMath.exp(-x));

            __CLR4_4_11om1omlb90p6l5.R.inc(2197);return new double[] { 1 - invExp1, invExp1 };
        }finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}

        /**
         * Validates parameters to ensure they are appropriate for the evaluation of
         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}
         * methods.
         *
         * @param param Values for lower and higher asymptotes.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 2.
         */
        private void validateParameters(double[] param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11om1omlb90p6l5.R.inc(2198);
            __CLR4_4_11om1omlb90p6l5.R.inc(2199);if ((((param == null)&&(__CLR4_4_11om1omlb90p6l5.R.iget(2200)!=0|true))||(__CLR4_4_11om1omlb90p6l5.R.iget(2201)==0&false))) {{
                __CLR4_4_11om1omlb90p6l5.R.inc(2202);throw new NullArgumentException();
            }
            }__CLR4_4_11om1omlb90p6l5.R.inc(2203);if ((((param.length != 2)&&(__CLR4_4_11om1omlb90p6l5.R.iget(2204)!=0|true))||(__CLR4_4_11om1omlb90p6l5.R.iget(2205)==0&false))) {{
                __CLR4_4_11om1omlb90p6l5.R.inc(2206);throw new DimensionMismatchException(param.length, 2);
            }
        }}finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}
    }

    /**
     * @param x Value at which to compute the sigmoid.
     * @param lo Lower asymptote.
     * @param hi Higher asymptote.
     * @return the value of the sigmoid function at {@code x}.
     */
    private static double value(double x,
                                double lo,
                                double hi) {try{__CLR4_4_11om1omlb90p6l5.R.inc(2207);
        __CLR4_4_11om1omlb90p6l5.R.inc(2208);return lo + (hi - lo) / (1 + FastMath.exp(-x));
    }finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.1
     */
    public DerivativeStructure value(final DerivativeStructure t)
        throws DimensionMismatchException {try{__CLR4_4_11om1omlb90p6l5.R.inc(2209);

        __CLR4_4_11om1omlb90p6l5.R.inc(2210);double[] f = new double[t.getOrder() + 1];
        __CLR4_4_11om1omlb90p6l5.R.inc(2211);final double exp = FastMath.exp(-t.getValue());
        __CLR4_4_11om1omlb90p6l5.R.inc(2212);if ((((Double.isInfinite(exp))&&(__CLR4_4_11om1omlb90p6l5.R.iget(2213)!=0|true))||(__CLR4_4_11om1omlb90p6l5.R.iget(2214)==0&false))) {{

            // special handling near lower boundary, to avoid NaN
            __CLR4_4_11om1omlb90p6l5.R.inc(2215);f[0] = lo;
            __CLR4_4_11om1omlb90p6l5.R.inc(2216);Arrays.fill(f, 1, f.length, 0.0);

        } }else {{

            // the nth order derivative of sigmoid has the form:
            // dn(sigmoid(x)/dxn = P_n(exp(-x)) / (1+exp(-x))^(n+1)
            // where P_n(t) is a degree n polynomial with normalized higher term
            // P_0(t) = 1, P_1(t) = t, P_2(t) = t^2 - t, P_3(t) = t^3 - 4 t^2 + t...
            // the general recurrence relation for P_n is:
            // P_n(x) = n t P_(n-1)(t) - t (1 + t) P_(n-1)'(t)
            __CLR4_4_11om1omlb90p6l5.R.inc(2217);final double[] p = new double[f.length];

            __CLR4_4_11om1omlb90p6l5.R.inc(2218);final double inv   = 1 / (1 + exp);
            __CLR4_4_11om1omlb90p6l5.R.inc(2219);double coeff = hi - lo;
            __CLR4_4_11om1omlb90p6l5.R.inc(2220);for (int n = 0; (((n < f.length)&&(__CLR4_4_11om1omlb90p6l5.R.iget(2221)!=0|true))||(__CLR4_4_11om1omlb90p6l5.R.iget(2222)==0&false)); ++n) {{

                // update and evaluate polynomial P_n(t)
                __CLR4_4_11om1omlb90p6l5.R.inc(2223);double v = 0;
                __CLR4_4_11om1omlb90p6l5.R.inc(2224);p[n] = 1;
                __CLR4_4_11om1omlb90p6l5.R.inc(2225);for (int k = n; (((k >= 0)&&(__CLR4_4_11om1omlb90p6l5.R.iget(2226)!=0|true))||(__CLR4_4_11om1omlb90p6l5.R.iget(2227)==0&false)); --k) {{
                    __CLR4_4_11om1omlb90p6l5.R.inc(2228);v = v * exp + p[k];
                    __CLR4_4_11om1omlb90p6l5.R.inc(2229);if ((((k > 1)&&(__CLR4_4_11om1omlb90p6l5.R.iget(2230)!=0|true))||(__CLR4_4_11om1omlb90p6l5.R.iget(2231)==0&false))) {{
                        __CLR4_4_11om1omlb90p6l5.R.inc(2232);p[k - 1] = (n - k + 2) * p[k - 2] - (k - 1) * p[k - 1];
                    } }else {{
                        __CLR4_4_11om1omlb90p6l5.R.inc(2233);p[0] = 0;
                    }
                }}

                }__CLR4_4_11om1omlb90p6l5.R.inc(2234);coeff *= inv;
                __CLR4_4_11om1omlb90p6l5.R.inc(2235);f[n]   = coeff * v;

            }

            // fix function value
            }__CLR4_4_11om1omlb90p6l5.R.inc(2236);f[0] += lo;

        }

        }__CLR4_4_11om1omlb90p6l5.R.inc(2237);return t.compose(f);

    }finally{__CLR4_4_11om1omlb90p6l5.R.flushNeeded();}}

}
