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
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Erf;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the normal (gaussian) distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Normal_distribution">Normal distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/NormalDistribution.html">Normal distribution (MathWorld)</a>
 * @version $Id$
 */
public class NormalDistribution extends AbstractRealDistribution {public static class __CLR4_4_18sz8szlb90p7k0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11479,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 8589540077390120676L;
    /** &radic;(2 &pi;) */
    private static final double SQRT2PI = FastMath.sqrt(2 * FastMath.PI);
    /** &radic;(2) */
    private static final double SQRT2 = FastMath.sqrt(2.0);
    /** Mean of this distribution. */
    private final double mean;
    /** Standard deviation of this distribution. */
    private final double standardDeviation;
    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;

    /**
     * Create a normal distribution with mean equal to zero and standard
     * deviation equal to one.
     */
    public NormalDistribution() {
        this(0, 1);__CLR4_4_18sz8szlb90p7k0.R.inc(11412);try{__CLR4_4_18sz8szlb90p7k0.R.inc(11411);
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * Create a normal distribution using the given mean and standard deviation.
     *
     * @param mean Mean for this distribution.
     * @param sd Standard deviation for this distribution.
     * @throws NotStrictlyPositiveException if {@code sd <= 0}.
     */
    public NormalDistribution(double mean, double sd)
        throws NotStrictlyPositiveException {
        this(mean, sd, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_18sz8szlb90p7k0.R.inc(11414);try{__CLR4_4_18sz8szlb90p7k0.R.inc(11413);
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * Create a normal distribution using the given mean, standard deviation and
     * inverse cumulative distribution accuracy.
     *
     * @param mean Mean for this distribution.
     * @param sd Standard deviation for this distribution.
     * @param inverseCumAccuracy Inverse cumulative probability accuracy.
     * @throws NotStrictlyPositiveException if {@code sd <= 0}.
     * @since 2.1
     */
    public NormalDistribution(double mean, double sd, double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        this(new Well19937c(), mean, sd, inverseCumAccuracy);__CLR4_4_18sz8szlb90p7k0.R.inc(11416);try{__CLR4_4_18sz8szlb90p7k0.R.inc(11415);
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * Creates a normal distribution.
     *
     * @param rng Random number generator.
     * @param mean Mean for this distribution.
     * @param sd Standard deviation for this distribution.
     * @param inverseCumAccuracy Inverse cumulative probability accuracy.
     * @throws NotStrictlyPositiveException if {@code sd <= 0}.
     * @since 3.1
     */
    public NormalDistribution(RandomGenerator rng,
                              double mean,
                              double sd,
                              double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_18sz8szlb90p7k0.R.inc(11418);try{__CLR4_4_18sz8szlb90p7k0.R.inc(11417);

        __CLR4_4_18sz8szlb90p7k0.R.inc(11419);if ((((sd <= 0)&&(__CLR4_4_18sz8szlb90p7k0.R.iget(11420)!=0|true))||(__CLR4_4_18sz8szlb90p7k0.R.iget(11421)==0&false))) {{
            __CLR4_4_18sz8szlb90p7k0.R.inc(11422);throw new NotStrictlyPositiveException(LocalizedFormats.STANDARD_DEVIATION, sd);
        }

        }__CLR4_4_18sz8szlb90p7k0.R.inc(11423);this.mean = mean;
        __CLR4_4_18sz8szlb90p7k0.R.inc(11424);standardDeviation = sd;
        __CLR4_4_18sz8szlb90p7k0.R.inc(11425);solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * Access the mean.
     *
     * @return the mean for this distribution.
     */
    public double getMean() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11426);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11427);return mean;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * Access the standard deviation.
     *
     * @return the standard deviation for this distribution.
     */
    public double getStandardDeviation() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11428);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11429);return standardDeviation;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11430);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11431);final double x0 = x - mean;
        __CLR4_4_18sz8szlb90p7k0.R.inc(11432);final double x1 = x0 / standardDeviation;
        __CLR4_4_18sz8szlb90p7k0.R.inc(11433);return FastMath.exp(-0.5 * x1 * x1) / (standardDeviation * SQRT2PI);
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * If {@code x} is more than 40 standard deviations from the mean, 0 or 1
     * is returned, as in these cases the actual value is within
     * {@code Double.MIN_VALUE} of 0 or 1.
     */
    public double cumulativeProbability(double x)  {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11434);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11435);final double dev = x - mean;
        __CLR4_4_18sz8szlb90p7k0.R.inc(11436);if ((((FastMath.abs(dev) > 40 * standardDeviation)&&(__CLR4_4_18sz8szlb90p7k0.R.iget(11437)!=0|true))||(__CLR4_4_18sz8szlb90p7k0.R.iget(11438)==0&false))) {{
            __CLR4_4_18sz8szlb90p7k0.R.inc(11439);return (((dev < 0 )&&(__CLR4_4_18sz8szlb90p7k0.R.iget(11440)!=0|true))||(__CLR4_4_18sz8szlb90p7k0.R.iget(11441)==0&false))? 0.0d : 1.0d;
        }
        }__CLR4_4_18sz8szlb90p7k0.R.inc(11442);return 0.5 * (1 + Erf.erf(dev / (standardDeviation * SQRT2)));
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    @Override
    public double inverseCumulativeProbability(final double p) throws OutOfRangeException {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11443);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11444);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_18sz8szlb90p7k0.R.iget(11445)!=0|true))||(__CLR4_4_18sz8szlb90p7k0.R.iget(11446)==0&false))) {{
            __CLR4_4_18sz8szlb90p7k0.R.inc(11447);throw new OutOfRangeException(p, 0, 1);
        }
        }__CLR4_4_18sz8szlb90p7k0.R.inc(11448);return mean + standardDeviation * SQRT2 * Erf.erfInv(2 * p - 1);
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @deprecated See {@link RealDistribution#cumulativeProbability(double,double)}
     */
    @Override@Deprecated
    public double cumulativeProbability(double x0, double x1)
        throws NumberIsTooLargeException {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11449);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11450);return probability(x0, x1);
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double probability(double x0,
                              double x1)
        throws NumberIsTooLargeException {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11451);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11452);if ((((x0 > x1)&&(__CLR4_4_18sz8szlb90p7k0.R.iget(11453)!=0|true))||(__CLR4_4_18sz8szlb90p7k0.R.iget(11454)==0&false))) {{
            __CLR4_4_18sz8szlb90p7k0.R.inc(11455);throw new NumberIsTooLargeException(LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT,
                                                x0, x1, true);
        }
        }__CLR4_4_18sz8szlb90p7k0.R.inc(11456);final double denom = standardDeviation * SQRT2;
        __CLR4_4_18sz8szlb90p7k0.R.inc(11457);final double v0 = (x0 - mean) / denom;
        __CLR4_4_18sz8szlb90p7k0.R.inc(11458);final double v1 = (x1 - mean) / denom;
        __CLR4_4_18sz8szlb90p7k0.R.inc(11459);return 0.5 * Erf.erf(v0, v1);
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11460);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11461);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For mean parameter {@code mu}, the mean is {@code mu}.
     */
    public double getNumericalMean() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11462);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11463);return getMean();
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For standard deviation parameter {@code s}, the variance is {@code s^2}.
     */
    public double getNumericalVariance() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11464);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11465);final double s = getStandardDeviation();
        __CLR4_4_18sz8szlb90p7k0.R.inc(11466);return s * s;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always negative infinity
     * no matter the parameters.
     *
     * @return lower bound of the support (always
     * {@code Double.NEGATIVE_INFINITY})
     */
    public double getSupportLowerBound() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11467);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11468);return Double.NEGATIVE_INFINITY;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity
     * no matter the parameters.
     *
     * @return upper bound of the support (always
     * {@code Double.POSITIVE_INFINITY})
     */
    public double getSupportUpperBound() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11469);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11470);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11471);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11472);return false;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11473);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11474);return false;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11475);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11476);return true;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double sample()  {try{__CLR4_4_18sz8szlb90p7k0.R.inc(11477);
        __CLR4_4_18sz8szlb90p7k0.R.inc(11478);return standardDeviation * random.nextGaussian() + mean;
    }finally{__CLR4_4_18sz8szlb90p7k0.R.flushNeeded();}}
}
