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
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.FastMath;

/**
 * <a href="http://en.wikipedia.org/wiki/Logit">
 *  Logit</a> function.
 * It is the inverse of the {@link Sigmoid sigmoid} function.
 *
 * @since 3.0
 * @version $Id$
 */
public class Logit implements UnivariateDifferentiableFunction, DifferentiableUnivariateFunction {public static class __CLR4_4_11m81m8lb90p6kb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2158,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Lower bound. */
    private final double lo;
    /** Higher bound. */
    private final double hi;

    /**
     * Usual logit function, where the lower bound is 0 and the higher
     * bound is 1.
     */
    public Logit() {
        this(0, 1);__CLR4_4_11m81m8lb90p6kb.R.inc(2097);try{__CLR4_4_11m81m8lb90p6kb.R.inc(2096);
    }finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}

    /**
     * Logit function.
     *
     * @param lo Lower bound of the function domain.
     * @param hi Higher bound of the function domain.
     */
    public Logit(double lo,
                 double hi) {try{__CLR4_4_11m81m8lb90p6kb.R.inc(2098);
        __CLR4_4_11m81m8lb90p6kb.R.inc(2099);this.lo = lo;
        __CLR4_4_11m81m8lb90p6kb.R.inc(2100);this.hi = hi;
    }finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double value(double x)
        throws OutOfRangeException {try{__CLR4_4_11m81m8lb90p6kb.R.inc(2101);
        __CLR4_4_11m81m8lb90p6kb.R.inc(2102);return value(x, lo, hi);
    }finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}

    /** {@inheritDoc}
     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}
     */
    @Deprecated
    public UnivariateFunction derivative() {try{__CLR4_4_11m81m8lb90p6kb.R.inc(2103);
        __CLR4_4_11m81m8lb90p6kb.R.inc(2104);return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative();
    }finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}

    /**
     * Parametric function where the input array contains the parameters of
     * the logit function, ordered as follows:
     * <ul>
     *  <li>Lower bound</li>
     *  <li>Higher bound</li>
     * </ul>
     */
    public static class Parametric implements ParametricUnivariateFunction {
        /**
         * Computes the value of the logit at {@code x}.
         *
         * @param x Value for which the function must be computed.
         * @param param Values of lower bound and higher bounds.
         * @return the value of the function.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 2.
         */
        public double value(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11m81m8lb90p6kb.R.inc(2105);
            __CLR4_4_11m81m8lb90p6kb.R.inc(2106);validateParameters(param);
            __CLR4_4_11m81m8lb90p6kb.R.inc(2107);return Logit.value(x, param[0], param[1]);
        }finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}

        /**
         * Computes the value of the gradient at {@code x}.
         * The components of the gradient vector are the partial
         * derivatives of the function with respect to each of the
         * <em>parameters</em> (lower bound and higher bound).
         *
         * @param x Value at which the gradient must be computed.
         * @param param Values for lower and higher bounds.
         * @return the gradient vector at {@code x}.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 2.
         */
        public double[] gradient(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11m81m8lb90p6kb.R.inc(2108);
            __CLR4_4_11m81m8lb90p6kb.R.inc(2109);validateParameters(param);

            __CLR4_4_11m81m8lb90p6kb.R.inc(2110);final double lo = param[0];
            __CLR4_4_11m81m8lb90p6kb.R.inc(2111);final double hi = param[1];

            __CLR4_4_11m81m8lb90p6kb.R.inc(2112);return new double[] { 1 / (lo - x), 1 / (hi - x) };
        }finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}

        /**
         * Validates parameters to ensure they are appropriate for the evaluation of
         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}
         * methods.
         *
         * @param param Values for lower and higher bounds.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 2.
         */
        private void validateParameters(double[] param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11m81m8lb90p6kb.R.inc(2113);
            __CLR4_4_11m81m8lb90p6kb.R.inc(2114);if ((((param == null)&&(__CLR4_4_11m81m8lb90p6kb.R.iget(2115)!=0|true))||(__CLR4_4_11m81m8lb90p6kb.R.iget(2116)==0&false))) {{
                __CLR4_4_11m81m8lb90p6kb.R.inc(2117);throw new NullArgumentException();
            }
            }__CLR4_4_11m81m8lb90p6kb.R.inc(2118);if ((((param.length != 2)&&(__CLR4_4_11m81m8lb90p6kb.R.iget(2119)!=0|true))||(__CLR4_4_11m81m8lb90p6kb.R.iget(2120)==0&false))) {{
                __CLR4_4_11m81m8lb90p6kb.R.inc(2121);throw new DimensionMismatchException(param.length, 2);
            }
        }}finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}
    }

    /**
     * @param x Value at which to compute the logit.
     * @param lo Lower bound.
     * @param hi Higher bound.
     * @return the value of the logit function at {@code x}.
     * @throws OutOfRangeException if {@code x < lo} or {@code x > hi}.
     */
    private static double value(double x,
                                double lo,
                                double hi)
        throws OutOfRangeException {try{__CLR4_4_11m81m8lb90p6kb.R.inc(2122);
        __CLR4_4_11m81m8lb90p6kb.R.inc(2123);if ((((x < lo || x > hi)&&(__CLR4_4_11m81m8lb90p6kb.R.iget(2124)!=0|true))||(__CLR4_4_11m81m8lb90p6kb.R.iget(2125)==0&false))) {{
            __CLR4_4_11m81m8lb90p6kb.R.inc(2126);throw new OutOfRangeException(x, lo, hi);
        }
        }__CLR4_4_11m81m8lb90p6kb.R.inc(2127);return FastMath.log((x - lo) / (hi - x));
    }finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.1
     * @exception OutOfRangeException if parameter is outside of function domain
     */
    public DerivativeStructure value(final DerivativeStructure t)
        throws OutOfRangeException {try{__CLR4_4_11m81m8lb90p6kb.R.inc(2128);
        __CLR4_4_11m81m8lb90p6kb.R.inc(2129);final double x = t.getValue();
        __CLR4_4_11m81m8lb90p6kb.R.inc(2130);if ((((x < lo || x > hi)&&(__CLR4_4_11m81m8lb90p6kb.R.iget(2131)!=0|true))||(__CLR4_4_11m81m8lb90p6kb.R.iget(2132)==0&false))) {{
            __CLR4_4_11m81m8lb90p6kb.R.inc(2133);throw new OutOfRangeException(x, lo, hi);
        }
        }__CLR4_4_11m81m8lb90p6kb.R.inc(2134);double[] f = new double[t.getOrder() + 1];

        // function value
        __CLR4_4_11m81m8lb90p6kb.R.inc(2135);f[0] = FastMath.log((x - lo) / (hi - x));

        __CLR4_4_11m81m8lb90p6kb.R.inc(2136);if ((((Double.isInfinite(f[0]))&&(__CLR4_4_11m81m8lb90p6kb.R.iget(2137)!=0|true))||(__CLR4_4_11m81m8lb90p6kb.R.iget(2138)==0&false))) {{

            __CLR4_4_11m81m8lb90p6kb.R.inc(2139);if ((((f.length > 1)&&(__CLR4_4_11m81m8lb90p6kb.R.iget(2140)!=0|true))||(__CLR4_4_11m81m8lb90p6kb.R.iget(2141)==0&false))) {{
                __CLR4_4_11m81m8lb90p6kb.R.inc(2142);f[1] = Double.POSITIVE_INFINITY;
            }
            // fill the array with infinities
            // (for x close to lo the signs will flip between -inf and +inf,
            //  for x close to hi the signs will always be +inf)
            // this is probably overkill, since the call to compose at the end
            // of the method will transform most infinities into NaN ...
            }__CLR4_4_11m81m8lb90p6kb.R.inc(2143);for (int i = 2; (((i < f.length)&&(__CLR4_4_11m81m8lb90p6kb.R.iget(2144)!=0|true))||(__CLR4_4_11m81m8lb90p6kb.R.iget(2145)==0&false)); ++i) {{
                __CLR4_4_11m81m8lb90p6kb.R.inc(2146);f[i] = f[i - 2];
            }

        }} }else {{

            // function derivatives
            __CLR4_4_11m81m8lb90p6kb.R.inc(2147);final double invL = 1.0 / (x - lo);
            __CLR4_4_11m81m8lb90p6kb.R.inc(2148);double xL = invL;
            __CLR4_4_11m81m8lb90p6kb.R.inc(2149);final double invH = 1.0 / (hi - x);
            __CLR4_4_11m81m8lb90p6kb.R.inc(2150);double xH = invH;
            __CLR4_4_11m81m8lb90p6kb.R.inc(2151);for (int i = 1; (((i < f.length)&&(__CLR4_4_11m81m8lb90p6kb.R.iget(2152)!=0|true))||(__CLR4_4_11m81m8lb90p6kb.R.iget(2153)==0&false)); ++i) {{
                __CLR4_4_11m81m8lb90p6kb.R.inc(2154);f[i] = xL + xH;
                __CLR4_4_11m81m8lb90p6kb.R.inc(2155);xL  *= -i * invL;
                __CLR4_4_11m81m8lb90p6kb.R.inc(2156);xH  *=  i * invH;
            }
        }}

        }__CLR4_4_11m81m8lb90p6kb.R.inc(2157);return t.compose(f);
    }finally{__CLR4_4_11m81m8lb90p6kb.R.flushNeeded();}}
}
