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

import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the Weibull distribution. This implementation uses the
 * two parameter form of the distribution defined by
 * <a href="http://mathworld.wolfram.com/WeibullDistribution.html">
 * Weibull Distribution</a>, equations (1) and (2).
 *
 * @see <a href="http://en.wikipedia.org/wiki/Weibull_distribution">Weibull distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/WeibullDistribution.html">Weibull distribution (MathWorld)</a>
 * @since 1.1 (changed to concrete class in 3.0)
 * @version $Id$
 */
public class WeibullDistribution extends AbstractRealDistribution {public static class __CLR4_4_19b89b8lb90p7m2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12157,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 8589540077390120676L;
    /** The shape parameter. */
    private final double shape;
    /** The scale parameter. */
    private final double scale;
    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;
    /** Cached numerical mean */
    private double numericalMean = Double.NaN;
    /** Whether or not the numerical mean has been calculated */
    private boolean numericalMeanIsCalculated = false;
    /** Cached numerical variance */
    private double numericalVariance = Double.NaN;
    /** Whether or not the numerical variance has been calculated */
    private boolean numericalVarianceIsCalculated = false;

    /**
     * Create a Weibull distribution with the given shape and scale and a
     * location equal to zero.
     *
     * @param alpha Shape parameter.
     * @param beta Scale parameter.
     * @throws NotStrictlyPositiveException if {@code alpha <= 0} or
     * {@code beta <= 0}.
     */
    public WeibullDistribution(double alpha, double beta)
        throws NotStrictlyPositiveException {
        this(alpha, beta, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_19b89b8lb90p7m2.R.inc(12069);try{__CLR4_4_19b89b8lb90p7m2.R.inc(12068);
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * Create a Weibull distribution with the given shape, scale and inverse
     * cumulative probability accuracy and a location equal to zero.
     *
     * @param alpha Shape parameter.
     * @param beta Scale parameter.
     * @param inverseCumAccuracy Maximum absolute error in inverse
     * cumulative probability estimates
     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code alpha <= 0} or
     * {@code beta <= 0}.
     * @since 2.1
     */
    public WeibullDistribution(double alpha, double beta,
                               double inverseCumAccuracy) {
        this(new Well19937c(), alpha, beta, inverseCumAccuracy);__CLR4_4_19b89b8lb90p7m2.R.inc(12071);try{__CLR4_4_19b89b8lb90p7m2.R.inc(12070);
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * Creates a Weibull distribution.
     *
     * @param rng Random number generator.
     * @param alpha Shape parameter.
     * @param beta Scale parameter.
     * @param inverseCumAccuracy Maximum absolute error in inverse
     * cumulative probability estimates
     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code alpha <= 0} or
     * {@code beta <= 0}.
     * @since 3.1
     */
    public WeibullDistribution(RandomGenerator rng,
                               double alpha,
                               double beta,
                               double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_19b89b8lb90p7m2.R.inc(12073);try{__CLR4_4_19b89b8lb90p7m2.R.inc(12072);

        __CLR4_4_19b89b8lb90p7m2.R.inc(12074);if ((((alpha <= 0)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12075)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12076)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12077);throw new NotStrictlyPositiveException(LocalizedFormats.SHAPE,
                                                   alpha);
        }
        }__CLR4_4_19b89b8lb90p7m2.R.inc(12078);if ((((beta <= 0)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12079)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12080)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12081);throw new NotStrictlyPositiveException(LocalizedFormats.SCALE,
                                                   beta);
        }
        }__CLR4_4_19b89b8lb90p7m2.R.inc(12082);scale = beta;
        __CLR4_4_19b89b8lb90p7m2.R.inc(12083);shape = alpha;
        __CLR4_4_19b89b8lb90p7m2.R.inc(12084);solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * Access the shape parameter, {@code alpha}.
     *
     * @return the shape parameter, {@code alpha}.
     */
    public double getShape() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12085);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12086);return shape;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * Access the scale parameter, {@code beta}.
     *
     * @return the scale parameter, {@code beta}.
     */
    public double getScale() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12087);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12088);return scale;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12089);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12090);if ((((x < 0)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12091)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12092)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12093);return 0;
        }

        }__CLR4_4_19b89b8lb90p7m2.R.inc(12094);final double xscale = x / scale;
        __CLR4_4_19b89b8lb90p7m2.R.inc(12095);final double xscalepow = FastMath.pow(xscale, shape - 1);

        /*
         * FastMath.pow(x / scale, shape) =
         * FastMath.pow(xscale, shape) =
         * FastMath.pow(xscale, shape - 1) * xscale
         */
        __CLR4_4_19b89b8lb90p7m2.R.inc(12096);final double xscalepowshape = xscalepow * xscale;

        __CLR4_4_19b89b8lb90p7m2.R.inc(12097);return (shape / scale) * xscalepow * FastMath.exp(-xscalepowshape);
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(double x) {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12098);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12099);double ret;
        __CLR4_4_19b89b8lb90p7m2.R.inc(12100);if ((((x <= 0.0)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12101)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12102)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12103);ret = 0.0;
        } }else {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12104);ret = 1.0 - FastMath.exp(-FastMath.pow(x / scale, shape));
        }
        }__CLR4_4_19b89b8lb90p7m2.R.inc(12105);return ret;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * Returns {@code 0} when {@code p == 0} and
     * {@code Double.POSITIVE_INFINITY} when {@code p == 1}.
     */
    @Override
    public double inverseCumulativeProbability(double p) {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12106);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12107);double ret;
        __CLR4_4_19b89b8lb90p7m2.R.inc(12108);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12109)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12110)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12111);throw new OutOfRangeException(p, 0.0, 1.0);
        } }else {__CLR4_4_19b89b8lb90p7m2.R.inc(12112);if ((((p == 0)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12113)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12114)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12115);ret = 0.0;
        } }else  {__CLR4_4_19b89b8lb90p7m2.R.inc(12116);if ((((p == 1)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12117)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12118)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12119);ret = Double.POSITIVE_INFINITY;
        } }else {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12120);ret = scale * FastMath.pow(-FastMath.log(1.0 - p), 1.0 / shape);
        }
        }}}__CLR4_4_19b89b8lb90p7m2.R.inc(12121);return ret;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * Return the absolute accuracy setting of the solver used to estimate
     * inverse cumulative probabilities.
     *
     * @return the solver absolute accuracy.
     * @since 2.1
     */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12122);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12123);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The mean is {@code scale * Gamma(1 + (1 / shape))}, where {@code Gamma()}
     * is the Gamma-function.
     */
    public double getNumericalMean() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12124);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12125);if ((((!numericalMeanIsCalculated)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12126)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12127)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12128);numericalMean = calculateNumericalMean();
            __CLR4_4_19b89b8lb90p7m2.R.inc(12129);numericalMeanIsCalculated = true;
        }
        }__CLR4_4_19b89b8lb90p7m2.R.inc(12130);return numericalMean;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * used by {@link #getNumericalMean()}
     *
     * @return the mean of this distribution
     */
    protected double calculateNumericalMean() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12131);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12132);final double sh = getShape();
        __CLR4_4_19b89b8lb90p7m2.R.inc(12133);final double sc = getScale();

        __CLR4_4_19b89b8lb90p7m2.R.inc(12134);return sc * FastMath.exp(Gamma.logGamma(1 + (1 / sh)));
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The variance is {@code scale^2 * Gamma(1 + (2 / shape)) - mean^2}
     * where {@code Gamma()} is the Gamma-function.
     */
    public double getNumericalVariance() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12135);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12136);if ((((!numericalVarianceIsCalculated)&&(__CLR4_4_19b89b8lb90p7m2.R.iget(12137)!=0|true))||(__CLR4_4_19b89b8lb90p7m2.R.iget(12138)==0&false))) {{
            __CLR4_4_19b89b8lb90p7m2.R.inc(12139);numericalVariance = calculateNumericalVariance();
            __CLR4_4_19b89b8lb90p7m2.R.inc(12140);numericalVarianceIsCalculated = true;
        }
        }__CLR4_4_19b89b8lb90p7m2.R.inc(12141);return numericalVariance;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * used by {@link #getNumericalVariance()}
     *
     * @return the variance of this distribution
     */
    protected double calculateNumericalVariance() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12142);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12143);final double sh = getShape();
        __CLR4_4_19b89b8lb90p7m2.R.inc(12144);final double sc = getScale();
        __CLR4_4_19b89b8lb90p7m2.R.inc(12145);final double mn = getNumericalMean();

        __CLR4_4_19b89b8lb90p7m2.R.inc(12146);return (sc * sc) * FastMath.exp(Gamma.logGamma(1 + (2 / sh))) -
               (mn * mn);
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the parameters.
     *
     * @return lower bound of the support (always 0)
     */
    public double getSupportLowerBound() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12147);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12148);return 0;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity
     * no matter the parameters.
     *
     * @return upper bound of the support (always
     * {@code Double.POSITIVE_INFINITY})
     */
    public double getSupportUpperBound() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12149);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12150);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12151);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12152);return true;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12153);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12154);return false;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_19b89b8lb90p7m2.R.inc(12155);
        __CLR4_4_19b89b8lb90p7m2.R.inc(12156);return true;
    }finally{__CLR4_4_19b89b8lb90p7m2.R.flushNeeded();}}
}

