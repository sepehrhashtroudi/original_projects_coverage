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

import org.apache.commons.math3.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;

/**
 * <a href="http://en.wikipedia.org/wiki/Sinc_function">Sinc</a> function,
 * defined by
 * <pre><code>
 *   sinc(x) = 1            if x = 0,
 *             sin(x) / x   otherwise.
 * </code></pre>
 *
 * @since 3.0
 * @version $Id$
 */
public class Sinc implements UnivariateDifferentiableFunction, DifferentiableUnivariateFunction {public static class __CLR4_4_11qe1qelb90p6lo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Value below which the computations are done using Taylor series.
     * <p>
     * The Taylor series for sinc even order derivatives are:
     * <pre>
     * d^(2n)sinc/dx^(2n)     = Sum_(k>=0) (-1)^(n+k) / ((2k)!(2n+2k+1)) x^(2k)
     *                        = (-1)^n     [ 1/(2n+1) - x^2/(4n+6) + x^4/(48n+120) - x^6/(1440n+5040) + O(x^8) ]
     * </pre>
     * </p>
     * <p>
     * The Taylor series for sinc odd order derivatives are:
     * <pre>
     * d^(2n+1)sinc/dx^(2n+1) = Sum_(k>=0) (-1)^(n+k+1) / ((2k+1)!(2n+2k+3)) x^(2k+1)
     *                        = (-1)^(n+1) [ x/(2n+3) - x^3/(12n+30) + x^5/(240n+840) - x^7/(10080n+45360) + O(x^9) ]
     * </pre>
     * </p>
     * <p>
     * So the ratio of the fourth term with respect to the first term
     * is always smaller than x^6/720, for all derivative orders.
     * This implies that neglecting this term and using only the first three terms induces
     * a relative error bounded by x^6/720. The SHORTCUT value is chosen such that this
     * relative error is below double precision accuracy when |x| <= SHORTCUT.
     * </p>
     */
    private static final double SHORTCUT = 6.0e-3;
    /** For normalized sinc function. */
    private final boolean normalized;

    /**
     * The sinc function, {@code sin(x) / x}.
     */
    public Sinc() {
        this(false);__CLR4_4_11qe1qelb90p6lo.R.inc(2247);try{__CLR4_4_11qe1qelb90p6lo.R.inc(2246);
    }finally{__CLR4_4_11qe1qelb90p6lo.R.flushNeeded();}}

    /**
     * Instantiates the sinc function.
     *
     * @param normalized If {@code true}, the function is
     * <code> sin(&pi;x) / &pi;x</code>, otherwise {@code sin(x) / x}.
     */
    public Sinc(boolean normalized) {try{__CLR4_4_11qe1qelb90p6lo.R.inc(2248);
        __CLR4_4_11qe1qelb90p6lo.R.inc(2249);this.normalized = normalized;
    }finally{__CLR4_4_11qe1qelb90p6lo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double value(final double x) {try{__CLR4_4_11qe1qelb90p6lo.R.inc(2250);
        __CLR4_4_11qe1qelb90p6lo.R.inc(2251);final double scaledX = (((normalized )&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2252)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2253)==0&false))? FastMath.PI * x : x;
        __CLR4_4_11qe1qelb90p6lo.R.inc(2254);if ((((FastMath.abs(scaledX) <= SHORTCUT)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2255)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2256)==0&false))) {{
            // use Taylor series
            __CLR4_4_11qe1qelb90p6lo.R.inc(2257);final double scaledX2 = scaledX * scaledX;
            __CLR4_4_11qe1qelb90p6lo.R.inc(2258);return ((scaledX2 - 20) * scaledX2 + 120) / 120;
        } }else {{
            // use definition expression
            __CLR4_4_11qe1qelb90p6lo.R.inc(2259);return FastMath.sin(scaledX) / scaledX;
        }
    }}finally{__CLR4_4_11qe1qelb90p6lo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}
     */
    @Deprecated
    public UnivariateFunction derivative() {try{__CLR4_4_11qe1qelb90p6lo.R.inc(2260);
        __CLR4_4_11qe1qelb90p6lo.R.inc(2261);return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative();
    }finally{__CLR4_4_11qe1qelb90p6lo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.1
     */
    public DerivativeStructure value(final DerivativeStructure t)
        throws DimensionMismatchException {try{__CLR4_4_11qe1qelb90p6lo.R.inc(2262);

        __CLR4_4_11qe1qelb90p6lo.R.inc(2263);final double scaledX  = ((((normalized )&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2264)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2265)==0&false))? FastMath.PI : 1) * t.getValue();
        __CLR4_4_11qe1qelb90p6lo.R.inc(2266);final double scaledX2 = scaledX * scaledX;

        __CLR4_4_11qe1qelb90p6lo.R.inc(2267);double[] f = new double[t.getOrder() + 1];

        __CLR4_4_11qe1qelb90p6lo.R.inc(2268);if ((((FastMath.abs(scaledX) <= SHORTCUT)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2269)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2270)==0&false))) {{

            __CLR4_4_11qe1qelb90p6lo.R.inc(2271);for (int i = 0; (((i < f.length)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2272)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2273)==0&false)); ++i) {{
                __CLR4_4_11qe1qelb90p6lo.R.inc(2274);final int k = i / 2;
                __CLR4_4_11qe1qelb90p6lo.R.inc(2275);if (((((i & 0x1) == 0)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2276)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2277)==0&false))) {{
                    // even derivation order
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2278);f[i] = ((((((k & 0x1) == 0) )&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2279)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2280)==0&false))? 1 : -1) *
                           (1.0 / (i + 1) - scaledX2 * (1.0 / (2 * i + 6) - scaledX2 / (24 * i + 120)));
                } }else {{
                    // odd derivation order
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2281);f[i] = ((((((k & 0x1) == 0) )&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2282)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2283)==0&false))? -scaledX : scaledX) *
                           (1.0 / (i + 2) - scaledX2 * (1.0 / (6 * i + 24) - scaledX2 / (120 * i + 720)));
                }
            }}

        }} }else {{

            __CLR4_4_11qe1qelb90p6lo.R.inc(2284);final double inv = 1 / scaledX;
            __CLR4_4_11qe1qelb90p6lo.R.inc(2285);final double cos = FastMath.cos(scaledX);
            __CLR4_4_11qe1qelb90p6lo.R.inc(2286);final double sin = FastMath.sin(scaledX);

            __CLR4_4_11qe1qelb90p6lo.R.inc(2287);f[0] = inv * sin;

            // the nth order derivative of sinc has the form:
            // dn(sinc(x)/dxn = [S_n(x) sin(x) + C_n(x) cos(x)] / x^(n+1)
            // where S_n(x) is an even polynomial with degree n-1 or n (depending on parity)
            // and C_n(x) is an odd polynomial with degree n-1 or n (depending on parity)
            // S_0(x) = 1, S_1(x) = -1, S_2(x) = -x^2 + 2, S_3(x) = 3x^2 - 6...
            // C_0(x) = 0, C_1(x) = x, C_2(x) = -2x, C_3(x) = -x^3 + 6x...
            // the general recurrence relations for S_n and C_n are:
            // S_n(x) = x S_(n-1)'(x) - n S_(n-1)(x) - x C_(n-1)(x)
            // C_n(x) = x C_(n-1)'(x) - n C_(n-1)(x) + x S_(n-1)(x)
            // as per polynomials parity, we can store both S_n and C_n in the same array
            __CLR4_4_11qe1qelb90p6lo.R.inc(2288);final double[] sc = new double[f.length];
            __CLR4_4_11qe1qelb90p6lo.R.inc(2289);sc[0] = 1;

            __CLR4_4_11qe1qelb90p6lo.R.inc(2290);double coeff = inv;
            __CLR4_4_11qe1qelb90p6lo.R.inc(2291);for (int n = 1; (((n < f.length)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2292)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2293)==0&false)); ++n) {{

                __CLR4_4_11qe1qelb90p6lo.R.inc(2294);double s = 0;
                __CLR4_4_11qe1qelb90p6lo.R.inc(2295);double c = 0;

                // update and evaluate polynomials S_n(x) and C_n(x)
                __CLR4_4_11qe1qelb90p6lo.R.inc(2296);final int kStart;
                __CLR4_4_11qe1qelb90p6lo.R.inc(2297);if (((((n & 0x1) == 0)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2298)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2299)==0&false))) {{
                    // even derivation order, S_n is degree n and C_n is degree n-1
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2300);sc[n] = 0;
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2301);kStart = n;
                } }else {{
                    // odd derivation order, S_n is degree n-1 and C_n is degree n
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2302);sc[n] = sc[n - 1];
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2303);c = sc[n];
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2304);kStart = n - 1;
                }

                // in this loop, k is always even
                }__CLR4_4_11qe1qelb90p6lo.R.inc(2305);for (int k = kStart; (((k > 1)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2306)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2307)==0&false)); k -= 2) {{

                    // sine part
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2308);sc[k]     = (k - n) * sc[k] - sc[k - 1];
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2309);s         = s * scaledX2 + sc[k];

                    // cosine part
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2310);sc[k - 1] = (k - 1 - n) * sc[k - 1] + sc[k -2];
                    __CLR4_4_11qe1qelb90p6lo.R.inc(2311);c         = c * scaledX2 + sc[k - 1];

                }
                }__CLR4_4_11qe1qelb90p6lo.R.inc(2312);sc[0] *= -n;
                __CLR4_4_11qe1qelb90p6lo.R.inc(2313);s      = s * scaledX2 + sc[0];

                __CLR4_4_11qe1qelb90p6lo.R.inc(2314);coeff *= inv;
                __CLR4_4_11qe1qelb90p6lo.R.inc(2315);f[n]   = coeff * (s * sin + c * scaledX * cos);

            }

        }}

        }__CLR4_4_11qe1qelb90p6lo.R.inc(2316);if ((((normalized)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2317)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2318)==0&false))) {{
            __CLR4_4_11qe1qelb90p6lo.R.inc(2319);double scale = FastMath.PI;
            __CLR4_4_11qe1qelb90p6lo.R.inc(2320);for (int i = 1; (((i < f.length)&&(__CLR4_4_11qe1qelb90p6lo.R.iget(2321)!=0|true))||(__CLR4_4_11qe1qelb90p6lo.R.iget(2322)==0&false)); ++i) {{
                __CLR4_4_11qe1qelb90p6lo.R.inc(2323);f[i]  *= scale;
                __CLR4_4_11qe1qelb90p6lo.R.inc(2324);scale *= FastMath.PI;
            }
        }}

        }__CLR4_4_11qe1qelb90p6lo.R.inc(2325);return t.compose(f);

    }finally{__CLR4_4_11qe1qelb90p6lo.R.flushNeeded();}}

}
