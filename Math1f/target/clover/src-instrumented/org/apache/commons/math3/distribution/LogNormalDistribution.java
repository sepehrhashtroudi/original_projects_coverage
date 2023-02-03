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

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Erf;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the log-normal (gaussian) distribution.
 *
 * <p>
 * <strong>Parameters:</strong>
 * {@code X} is log-normally distributed if its natural logarithm {@code log(X)}
 * is normally distributed. The probability distribution function of {@code X}
 * is given by (for {@code x > 0})
 * </p>
 * <p>
 * {@code exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)}
 * </p>
 * <ul>
 * <li>{@code m} is the <em>scale</em> parameter: this is the mean of the
 * normally distributed natural logarithm of this distribution,</li>
 * <li>{@code s} is the <em>shape</em> parameter: this is the standard
 * deviation of the normally distributed natural logarithm of this
 * distribution.
 * </ul>
 *
 * @see <a href="http://en.wikipedia.org/wiki/Log-normal_distribution">
 * Log-normal distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/LogNormalDistribution.html">
 * Log Normal distribution (MathWorld)</a>
 *
 * @version $Id$
 * @since 3.0
 */
public class LogNormalDistribution extends AbstractRealDistribution {public static class __CLR4_4_18lz8lzlb90p7j8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11236,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default inverse cumulative probability accuracy. */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 20120112;

    /** &radic;(2 &pi;) */
    private static final double SQRT2PI = FastMath.sqrt(2 * FastMath.PI);

    /** &radic;(2) */
    private static final double SQRT2 = FastMath.sqrt(2.0);

    /** The scale parameter of this distribution. */
    private final double scale;

    /** The shape parameter of this distribution. */
    private final double shape;

    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;

    /**
     * Create a log-normal distribution, where the mean and standard deviation
     * of the {@link NormalDistribution normally distributed} natural
     * logarithm of the log-normal distribution are equal to zero and one
     * respectively. In other words, the scale of the returned distribution is
     * {@code 0}, while its shape is {@code 1}.
     */
    public LogNormalDistribution() {
        this(0, 1);__CLR4_4_18lz8lzlb90p7j8.R.inc(11160);try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11159);
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * Create a log-normal distribution using the specified scale and shape.
     *
     * @param scale the scale parameter of this distribution
     * @param shape the shape parameter of this distribution
     * @throws NotStrictlyPositiveException if {@code shape <= 0}.
     */
    public LogNormalDistribution(double scale, double shape)
        throws NotStrictlyPositiveException {
        this(scale, shape, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_18lz8lzlb90p7j8.R.inc(11162);try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11161);
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * Create a log-normal distribution using the specified scale, shape and
     * inverse cumulative distribution accuracy.
     *
     * @param scale the scale parameter of this distribution
     * @param shape the shape parameter of this distribution
     * @param inverseCumAccuracy Inverse cumulative probability accuracy.
     * @throws NotStrictlyPositiveException if {@code shape <= 0}.
     */
    public LogNormalDistribution(double scale, double shape, double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        this(new Well19937c(), scale, shape, inverseCumAccuracy);__CLR4_4_18lz8lzlb90p7j8.R.inc(11164);try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11163);
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * Creates a log-normal distribution.
     *
     * @param rng Random number generator.
     * @param scale Scale parameter of this distribution.
     * @param shape Shape parameter of this distribution.
     * @param inverseCumAccuracy Inverse cumulative probability accuracy.
     * @throws NotStrictlyPositiveException if {@code shape <= 0}.
     * @since 3.1
     */
    public LogNormalDistribution(RandomGenerator rng,
                                 double scale,
                                 double shape,
                                 double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_18lz8lzlb90p7j8.R.inc(11166);try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11165);

        __CLR4_4_18lz8lzlb90p7j8.R.inc(11167);if ((((shape <= 0)&&(__CLR4_4_18lz8lzlb90p7j8.R.iget(11168)!=0|true))||(__CLR4_4_18lz8lzlb90p7j8.R.iget(11169)==0&false))) {{
            __CLR4_4_18lz8lzlb90p7j8.R.inc(11170);throw new NotStrictlyPositiveException(LocalizedFormats.SHAPE, shape);
        }

        }__CLR4_4_18lz8lzlb90p7j8.R.inc(11171);this.scale = scale;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11172);this.shape = shape;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11173);this.solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * Returns the scale parameter of this distribution.
     *
     * @return the scale parameter
     */
    public double getScale() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11174);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11175);return scale;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * Returns the shape parameter of this distribution.
     *
     * @return the shape parameter
     */
    public double getShape() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11176);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11177);return shape;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For scale {@code m}, and shape {@code s} of this distribution, the PDF
     * is given by
     * <ul>
     * <li>{@code 0} if {@code x <= 0},</li>
     * <li>{@code exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)}
     * otherwise.</li>
     * </ul>
     */
    public double density(double x) {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11178);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11179);if ((((x <= 0)&&(__CLR4_4_18lz8lzlb90p7j8.R.iget(11180)!=0|true))||(__CLR4_4_18lz8lzlb90p7j8.R.iget(11181)==0&false))) {{
            __CLR4_4_18lz8lzlb90p7j8.R.inc(11182);return 0;
        }
        }__CLR4_4_18lz8lzlb90p7j8.R.inc(11183);final double x0 = FastMath.log(x) - scale;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11184);final double x1 = x0 / shape;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11185);return FastMath.exp(-0.5 * x1 * x1) / (shape * SQRT2PI * x);
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For scale {@code m}, and shape {@code s} of this distribution, the CDF
     * is given by
     * <ul>
     * <li>{@code 0} if {@code x <= 0},</li>
     * <li>{@code 0} if {@code ln(x) - m < 0} and {@code m - ln(x) > 40 * s}, as
     * in these cases the actual value is within {@code Double.MIN_VALUE} of 0,
     * <li>{@code 1} if {@code ln(x) - m >= 0} and {@code ln(x) - m > 40 * s},
     * as in these cases the actual value is within {@code Double.MIN_VALUE} of
     * 1,</li>
     * <li>{@code 0.5 + 0.5 * erf((ln(x) - m) / (s * sqrt(2))} otherwise.</li>
     * </ul>
     */
    public double cumulativeProbability(double x)  {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11186);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11187);if ((((x <= 0)&&(__CLR4_4_18lz8lzlb90p7j8.R.iget(11188)!=0|true))||(__CLR4_4_18lz8lzlb90p7j8.R.iget(11189)==0&false))) {{
            __CLR4_4_18lz8lzlb90p7j8.R.inc(11190);return 0;
        }
        }__CLR4_4_18lz8lzlb90p7j8.R.inc(11191);final double dev = FastMath.log(x) - scale;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11192);if ((((FastMath.abs(dev) > 40 * shape)&&(__CLR4_4_18lz8lzlb90p7j8.R.iget(11193)!=0|true))||(__CLR4_4_18lz8lzlb90p7j8.R.iget(11194)==0&false))) {{
            __CLR4_4_18lz8lzlb90p7j8.R.inc(11195);return (((dev < 0 )&&(__CLR4_4_18lz8lzlb90p7j8.R.iget(11196)!=0|true))||(__CLR4_4_18lz8lzlb90p7j8.R.iget(11197)==0&false))? 0.0d : 1.0d;
        }
        }__CLR4_4_18lz8lzlb90p7j8.R.inc(11198);return 0.5 + 0.5 * Erf.erf(dev / (shape * SQRT2));
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @deprecated See {@link RealDistribution#cumulativeProbability(double,double)}
     */
    @Override@Deprecated
    public double cumulativeProbability(double x0, double x1)
        throws NumberIsTooLargeException {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11199);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11200);return probability(x0, x1);
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double probability(double x0,
                              double x1)
        throws NumberIsTooLargeException {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11201);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11202);if ((((x0 > x1)&&(__CLR4_4_18lz8lzlb90p7j8.R.iget(11203)!=0|true))||(__CLR4_4_18lz8lzlb90p7j8.R.iget(11204)==0&false))) {{
            __CLR4_4_18lz8lzlb90p7j8.R.inc(11205);throw new NumberIsTooLargeException(LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT,
                                                x0, x1, true);
        }
        }__CLR4_4_18lz8lzlb90p7j8.R.inc(11206);if ((((x0 <= 0 || x1 <= 0)&&(__CLR4_4_18lz8lzlb90p7j8.R.iget(11207)!=0|true))||(__CLR4_4_18lz8lzlb90p7j8.R.iget(11208)==0&false))) {{
            __CLR4_4_18lz8lzlb90p7j8.R.inc(11209);return super.probability(x0, x1);
        }
        }__CLR4_4_18lz8lzlb90p7j8.R.inc(11210);final double denom = shape * SQRT2;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11211);final double v0 = (FastMath.log(x0) - scale) / denom;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11212);final double v1 = (FastMath.log(x1) - scale) / denom;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11213);return 0.5 * Erf.erf(v0, v1);
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11214);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11215);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For scale {@code m} and shape {@code s}, the mean is
     * {@code exp(m + s^2 / 2)}.
     */
    public double getNumericalMean() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11216);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11217);double s = shape;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11218);return FastMath.exp(scale + (s * s / 2));
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For scale {@code m} and shape {@code s}, the variance is
     * {@code (exp(s^2) - 1) * exp(2 * m + s^2)}.
     */
    public double getNumericalVariance() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11219);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11220);final double s = shape;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11221);final double ss = s * s;
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11222);return (FastMath.exp(ss) - 1) * FastMath.exp(2 * scale + ss);
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the parameters.
     *
     * @return lower bound of the support (always 0)
     */
    public double getSupportLowerBound() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11223);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11224);return 0;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity
     * no matter the parameters.
     *
     * @return upper bound of the support (always
     * {@code Double.POSITIVE_INFINITY})
     */
    public double getSupportUpperBound() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11225);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11226);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11227);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11228);return true;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11229);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11230);return false;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11231);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11232);return true;
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double sample()  {try{__CLR4_4_18lz8lzlb90p7j8.R.inc(11233);
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11234);final double n = random.nextGaussian();
        __CLR4_4_18lz8lzlb90p7j8.R.inc(11235);return FastMath.exp(scale + shape * n);
    }finally{__CLR4_4_18lz8lzlb90p7j8.R.flushNeeded();}}
}
