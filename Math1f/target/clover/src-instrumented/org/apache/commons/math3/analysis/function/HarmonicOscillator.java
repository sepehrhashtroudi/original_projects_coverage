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
import org.apache.commons.math3.util.FastMath;

/**
 * <a href="http://en.wikipedia.org/wiki/Harmonic_oscillator">
 *  simple harmonic oscillator</a> function.
 *
 * @since 3.0
 * @version $Id$
 */
public class HarmonicOscillator implements UnivariateDifferentiableFunction, DifferentiableUnivariateFunction {public static class __CLR4_4_11im1imlb90p6j1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2013,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Amplitude. */
    private final double amplitude;
    /** Angular frequency. */
    private final double omega;
    /** Phase. */
    private final double phase;

    /**
     * Harmonic oscillator function.
     *
     * @param amplitude Amplitude.
     * @param omega Angular frequency.
     * @param phase Phase.
     */
    public HarmonicOscillator(double amplitude,
                              double omega,
                              double phase) {try{__CLR4_4_11im1imlb90p6j1.R.inc(1966);
        __CLR4_4_11im1imlb90p6j1.R.inc(1967);this.amplitude = amplitude;
        __CLR4_4_11im1imlb90p6j1.R.inc(1968);this.omega = omega;
        __CLR4_4_11im1imlb90p6j1.R.inc(1969);this.phase = phase;
    }finally{__CLR4_4_11im1imlb90p6j1.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double value(double x) {try{__CLR4_4_11im1imlb90p6j1.R.inc(1970);
        __CLR4_4_11im1imlb90p6j1.R.inc(1971);return value(omega * x + phase, amplitude);
    }finally{__CLR4_4_11im1imlb90p6j1.R.flushNeeded();}}

    /** {@inheritDoc}
     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}
     */
    @Deprecated
    public UnivariateFunction derivative() {try{__CLR4_4_11im1imlb90p6j1.R.inc(1972);
        __CLR4_4_11im1imlb90p6j1.R.inc(1973);return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative();
    }finally{__CLR4_4_11im1imlb90p6j1.R.flushNeeded();}}

    /**
     * Parametric function where the input array contains the parameters of
     * the harmonic oscillator function, ordered as follows:
     * <ul>
     *  <li>Amplitude</li>
     *  <li>Angular frequency</li>
     *  <li>Phase</li>
     * </ul>
     */
    public static class Parametric implements ParametricUnivariateFunction {
        /**
         * Computes the value of the harmonic oscillator at {@code x}.
         *
         * @param x Value for which the function must be computed.
         * @param param Values of norm, mean and standard deviation.
         * @return the value of the function.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 3.
         */
        public double value(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11im1imlb90p6j1.R.inc(1974);
            __CLR4_4_11im1imlb90p6j1.R.inc(1975);validateParameters(param);
            __CLR4_4_11im1imlb90p6j1.R.inc(1976);return HarmonicOscillator.value(x * param[1] + param[2], param[0]);
        }finally{__CLR4_4_11im1imlb90p6j1.R.flushNeeded();}}

        /**
         * Computes the value of the gradient at {@code x}.
         * The components of the gradient vector are the partial
         * derivatives of the function with respect to each of the
         * <em>parameters</em> (amplitude, angular frequency and phase).
         *
         * @param x Value at which the gradient must be computed.
         * @param param Values of amplitude, angular frequency and phase.
         * @return the gradient vector at {@code x}.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 3.
         */
        public double[] gradient(double x, double ... param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11im1imlb90p6j1.R.inc(1977);
            __CLR4_4_11im1imlb90p6j1.R.inc(1978);validateParameters(param);

            __CLR4_4_11im1imlb90p6j1.R.inc(1979);final double amplitude = param[0];
            __CLR4_4_11im1imlb90p6j1.R.inc(1980);final double omega = param[1];
            __CLR4_4_11im1imlb90p6j1.R.inc(1981);final double phase = param[2];

            __CLR4_4_11im1imlb90p6j1.R.inc(1982);final double xTimesOmegaPlusPhase = omega * x + phase;
            __CLR4_4_11im1imlb90p6j1.R.inc(1983);final double a = HarmonicOscillator.value(xTimesOmegaPlusPhase, 1);
            __CLR4_4_11im1imlb90p6j1.R.inc(1984);final double p = -amplitude * FastMath.sin(xTimesOmegaPlusPhase);
            __CLR4_4_11im1imlb90p6j1.R.inc(1985);final double w = p * x;

            __CLR4_4_11im1imlb90p6j1.R.inc(1986);return new double[] { a, w, p };
        }finally{__CLR4_4_11im1imlb90p6j1.R.flushNeeded();}}

        /**
         * Validates parameters to ensure they are appropriate for the evaluation of
         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}
         * methods.
         *
         * @param param Values of norm, mean and standard deviation.
         * @throws NullArgumentException if {@code param} is {@code null}.
         * @throws DimensionMismatchException if the size of {@code param} is
         * not 3.
         */
        private void validateParameters(double[] param)
            throws NullArgumentException,
                   DimensionMismatchException {try{__CLR4_4_11im1imlb90p6j1.R.inc(1987);
            __CLR4_4_11im1imlb90p6j1.R.inc(1988);if ((((param == null)&&(__CLR4_4_11im1imlb90p6j1.R.iget(1989)!=0|true))||(__CLR4_4_11im1imlb90p6j1.R.iget(1990)==0&false))) {{
                __CLR4_4_11im1imlb90p6j1.R.inc(1991);throw new NullArgumentException();
            }
            }__CLR4_4_11im1imlb90p6j1.R.inc(1992);if ((((param.length != 3)&&(__CLR4_4_11im1imlb90p6j1.R.iget(1993)!=0|true))||(__CLR4_4_11im1imlb90p6j1.R.iget(1994)==0&false))) {{
                __CLR4_4_11im1imlb90p6j1.R.inc(1995);throw new DimensionMismatchException(param.length, 3);
            }
        }}finally{__CLR4_4_11im1imlb90p6j1.R.flushNeeded();}}
    }

    /**
     * @param xTimesOmegaPlusPhase {@code omega * x + phase}.
     * @param amplitude Amplitude.
     * @return the value of the harmonic oscillator function at {@code x}.
     */
    private static double value(double xTimesOmegaPlusPhase,
                                double amplitude) {try{__CLR4_4_11im1imlb90p6j1.R.inc(1996);
        __CLR4_4_11im1imlb90p6j1.R.inc(1997);return amplitude * FastMath.cos(xTimesOmegaPlusPhase);
    }finally{__CLR4_4_11im1imlb90p6j1.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.1
     */
    public DerivativeStructure value(final DerivativeStructure t)
        throws DimensionMismatchException {try{__CLR4_4_11im1imlb90p6j1.R.inc(1998);
        __CLR4_4_11im1imlb90p6j1.R.inc(1999);final double x = t.getValue();
        __CLR4_4_11im1imlb90p6j1.R.inc(2000);double[] f = new double[t.getOrder() + 1];

        __CLR4_4_11im1imlb90p6j1.R.inc(2001);final double alpha = omega * x + phase;
        __CLR4_4_11im1imlb90p6j1.R.inc(2002);f[0] = amplitude * FastMath.cos(alpha);
        __CLR4_4_11im1imlb90p6j1.R.inc(2003);if ((((f.length > 1)&&(__CLR4_4_11im1imlb90p6j1.R.iget(2004)!=0|true))||(__CLR4_4_11im1imlb90p6j1.R.iget(2005)==0&false))) {{
            __CLR4_4_11im1imlb90p6j1.R.inc(2006);f[1] = -amplitude * omega * FastMath.sin(alpha);
            __CLR4_4_11im1imlb90p6j1.R.inc(2007);final double mo2 = - omega * omega;
            __CLR4_4_11im1imlb90p6j1.R.inc(2008);for (int i = 2; (((i < f.length)&&(__CLR4_4_11im1imlb90p6j1.R.iget(2009)!=0|true))||(__CLR4_4_11im1imlb90p6j1.R.iget(2010)==0&false)); ++i) {{
                __CLR4_4_11im1imlb90p6j1.R.inc(2011);f[i] = mo2 * f[i - 2];
            }
        }}

        }__CLR4_4_11im1imlb90p6j1.R.inc(2012);return t.compose(f);

    }finally{__CLR4_4_11im1imlb90p6j1.R.flushNeeded();}}

}
