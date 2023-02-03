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
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the Pareto distribution.
 *
 * <p>
 * <strong>Parameters:</strong>
 * The probability distribution function of {@code X} is given by (for {@code x >= k}):
 * <pre>
 *  \u03b1 * k^\u03b1 / x^(\u03b1 + 1)
 * </pre>
 * <p>
 * <ul>
 * <li>{@code k} is the <em>scale</em> parameter: this is the minimum possible value of {@code X},</li>
 * <li>{@code \u03b1} is the <em>shape</em> parameter: this is the Pareto index</li>
 * </ul>
 *
 * @see <a href="http://en.wikipedia.org/wiki/Pareto_distribution">
 * Pareto distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/ParetoDistribution.html">
 * Pareto distribution (MathWorld)</a>
 *
 * @version $Id$
 * @since 3.3
 */
public class ParetoDistribution extends AbstractRealDistribution {public static class __CLR4_4_18uv8uvlb90p7k8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11544,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default inverse cumulative probability accuracy. */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 20130424;

    /** The scale parameter of this distribution. */
    private final double scale;

    /** The shape parameter of this distribution. */
    private final double shape;

    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;

    /**
     * Create a Pareto distribution with a scale of {@code 1} and a shape of {@code 1}.
     */
    public ParetoDistribution() {
        this(1, 1);__CLR4_4_18uv8uvlb90p7k8.R.inc(11480);try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11479);
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * Create a Pareto distribution using the specified scale and shape.
     *
     * @param scale the scale parameter of this distribution
     * @param shape the shape parameter of this distribution
     * @throws NotStrictlyPositiveException if {@code scale <= 0} or {@code shape <= 0}.
     */
    public ParetoDistribution(double scale, double shape)
        throws NotStrictlyPositiveException {
        this(scale, shape, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_18uv8uvlb90p7k8.R.inc(11482);try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11481);
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * Create a Pareto distribution using the specified scale, shape and
     * inverse cumulative distribution accuracy.
     *
     * @param scale the scale parameter of this distribution
     * @param shape the shape parameter of this distribution
     * @param inverseCumAccuracy Inverse cumulative probability accuracy.
     * @throws NotStrictlyPositiveException if {@code scale <= 0} or {@code shape <= 0}.
     */
    public ParetoDistribution(double scale, double shape, double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        this(new Well19937c(), scale, shape, inverseCumAccuracy);__CLR4_4_18uv8uvlb90p7k8.R.inc(11484);try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11483);
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * Creates a log-normal distribution.
     *
     * @param rng Random number generator.
     * @param scale Scale parameter of this distribution.
     * @param shape Shape parameter of this distribution.
     * @param inverseCumAccuracy Inverse cumulative probability accuracy.
     * @throws NotStrictlyPositiveException if {@code scale <= 0} or {@code shape <= 0}.
     */
    public ParetoDistribution(RandomGenerator rng,
                              double scale,
                              double shape,
                              double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_18uv8uvlb90p7k8.R.inc(11486);try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11485);

        __CLR4_4_18uv8uvlb90p7k8.R.inc(11487);if ((((scale <= 0)&&(__CLR4_4_18uv8uvlb90p7k8.R.iget(11488)!=0|true))||(__CLR4_4_18uv8uvlb90p7k8.R.iget(11489)==0&false))) {{
            __CLR4_4_18uv8uvlb90p7k8.R.inc(11490);throw new NotStrictlyPositiveException(LocalizedFormats.SCALE, scale);
        }

        }__CLR4_4_18uv8uvlb90p7k8.R.inc(11491);if ((((shape <= 0)&&(__CLR4_4_18uv8uvlb90p7k8.R.iget(11492)!=0|true))||(__CLR4_4_18uv8uvlb90p7k8.R.iget(11493)==0&false))) {{
            __CLR4_4_18uv8uvlb90p7k8.R.inc(11494);throw new NotStrictlyPositiveException(LocalizedFormats.SHAPE, shape);
        }

        }__CLR4_4_18uv8uvlb90p7k8.R.inc(11495);this.scale = scale;
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11496);this.shape = shape;
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11497);this.solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * Returns the scale parameter of this distribution.
     *
     * @return the scale parameter
     */
    public double getScale() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11498);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11499);return scale;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * Returns the shape parameter of this distribution.
     *
     * @return the shape parameter
     */
    public double getShape() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11500);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11501);return shape;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * For scale {@code k}, and shape {@code \u03b1} of this distribution, the PDF
     * is given by
     * <ul>
     * <li>{@code 0} if {@code x < k},</li>
     * <li>{@code \u03b1 * k^\u03b1 / x^(\u03b1 + 1)} otherwise.</li>
     * </ul>
     */
    public double density(double x) {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11502);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11503);if ((((x < scale)&&(__CLR4_4_18uv8uvlb90p7k8.R.iget(11504)!=0|true))||(__CLR4_4_18uv8uvlb90p7k8.R.iget(11505)==0&false))) {{
            __CLR4_4_18uv8uvlb90p7k8.R.inc(11506);return 0;
        }
        }__CLR4_4_18uv8uvlb90p7k8.R.inc(11507);return FastMath.pow(scale, shape) / FastMath.pow(x, shape + 1) * shape;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * For scale {@code k}, and shape {@code \u03b1} of this distribution, the CDF is given by
     * <ul>
     * <li>{@code 0} if {@code x < k},</li>
     * <li>{@code 1 - (k / x)^\u03b1} otherwise.</li>
     * </ul>
     */
    public double cumulativeProbability(double x)  {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11508);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11509);if ((((x <= scale)&&(__CLR4_4_18uv8uvlb90p7k8.R.iget(11510)!=0|true))||(__CLR4_4_18uv8uvlb90p7k8.R.iget(11511)==0&false))) {{
            __CLR4_4_18uv8uvlb90p7k8.R.inc(11512);return 0;
        }
        }__CLR4_4_18uv8uvlb90p7k8.R.inc(11513);return 1 - FastMath.pow(scale / x, shape);
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @deprecated See {@link RealDistribution#cumulativeProbability(double,double)}
     */
    @Override
    @Deprecated
    public double cumulativeProbability(double x0, double x1)
        throws NumberIsTooLargeException {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11514);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11515);return probability(x0, x1);
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11516);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11517);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * For scale {@code k} and shape {@code \u03b1}, the mean is given by
     * <ul>
     * <li>{@code \u221e} if {@code \u03b1 <= 1},</li>
     * <li>{@code \u03b1 * k / (\u03b1 - 1)} otherwise.</li>
     * </ul>
     */
    public double getNumericalMean() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11518);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11519);if ((((shape <= 1)&&(__CLR4_4_18uv8uvlb90p7k8.R.iget(11520)!=0|true))||(__CLR4_4_18uv8uvlb90p7k8.R.iget(11521)==0&false))) {{
            __CLR4_4_18uv8uvlb90p7k8.R.inc(11522);return Double.POSITIVE_INFINITY;
        }
        }__CLR4_4_18uv8uvlb90p7k8.R.inc(11523);return shape * scale / (shape - 1);
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * For scale {@code k} and shape {@code \u03b1}, the variance is given by
     * <ul>
     * <li>{@code \u221e} if {@code 1 < \u03b1 <= 2},</li>
     * <li>{@code k^2 * \u03b1 / ((\u03b1 - 1)^2 * (\u03b1 - 2))} otherwise.</li>
     * </ul>
     */
    public double getNumericalVariance() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11524);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11525);if ((((shape <= 2)&&(__CLR4_4_18uv8uvlb90p7k8.R.iget(11526)!=0|true))||(__CLR4_4_18uv8uvlb90p7k8.R.iget(11527)==0&false))) {{
            __CLR4_4_18uv8uvlb90p7k8.R.inc(11528);return Double.POSITIVE_INFINITY;
        }
        }__CLR4_4_18uv8uvlb90p7k8.R.inc(11529);double s = shape - 1;
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11530);return scale * scale * shape / (s * s) / (shape - 2);
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * The lower bound of the support is equal to the scale parameter {@code k}.
     *
     * @return lower bound of the support
     */
    public double getSupportLowerBound() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11531);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11532);return scale;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * The upper bound of the support is always positive infinity no matter the parameters.
     *
     * @return upper bound of the support (always {@code Double.POSITIVE_INFINITY})
     */
    public double getSupportUpperBound() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11533);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11534);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11535);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11536);return true;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11537);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11538);return false;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11539);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11540);return true;
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double sample()  {try{__CLR4_4_18uv8uvlb90p7k8.R.inc(11541);
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11542);final double n = random.nextDouble();
        __CLR4_4_18uv8uvlb90p7k8.R.inc(11543);return scale / FastMath.pow(n, 1 / shape);
    }finally{__CLR4_4_18uv8uvlb90p7k8.R.flushNeeded();}}
}
