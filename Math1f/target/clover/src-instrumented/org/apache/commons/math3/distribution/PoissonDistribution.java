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
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the Poisson distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Poisson_distribution">Poisson distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/PoissonDistribution.html">Poisson distribution (MathWorld)</a>
 * @version $Id$
 */
public class PoissonDistribution extends AbstractIntegerDistribution {public static class __CLR4_4_18y08y0lb90p7kr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11742,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default maximum number of iterations for cumulative probability calculations.
     * @since 2.1
     */
    public static final int DEFAULT_MAX_ITERATIONS = 10000000;
    /**
     * Default convergence criterion.
     * @since 2.1
     */
    public static final double DEFAULT_EPSILON = 1e-12;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -3349935121172596109L;
    /** Distribution used to compute normal approximation. */
    private final NormalDistribution normal;
    /** Distribution needed for the {@link #sample()} method. */
    private final ExponentialDistribution exponential;
    /** Mean of the distribution. */
    private final double mean;

    /**
     * Maximum number of iterations for cumulative probability. Cumulative
     * probabilities are estimated using either Lanczos series approximation
     * of {@link Gamma#regularizedGammaP(double, double, double, int)}
     * or continued fraction approximation of
     * {@link Gamma#regularizedGammaQ(double, double, double, int)}.
     */
    private final int maxIterations;

    /** Convergence criterion for cumulative probability. */
    private final double epsilon;

    /**
     * Creates a new Poisson distribution with specified mean.
     *
     * @param p the Poisson mean
     * @throws NotStrictlyPositiveException if {@code p <= 0}.
     */
    public PoissonDistribution(double p) throws NotStrictlyPositiveException {
        this(p, DEFAULT_EPSILON, DEFAULT_MAX_ITERATIONS);__CLR4_4_18y08y0lb90p7kr.R.inc(11593);try{__CLR4_4_18y08y0lb90p7kr.R.inc(11592);
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * Creates a new Poisson distribution with specified mean, convergence
     * criterion and maximum number of iterations.
     *
     * @param p Poisson mean.
     * @param epsilon Convergence criterion for cumulative probabilities.
     * @param maxIterations the maximum number of iterations for cumulative
     * probabilities.
     * @throws NotStrictlyPositiveException if {@code p <= 0}.
     * @since 2.1
     */
    public PoissonDistribution(double p, double epsilon, int maxIterations)
    throws NotStrictlyPositiveException {
        this(new Well19937c(), p, epsilon, maxIterations);__CLR4_4_18y08y0lb90p7kr.R.inc(11595);try{__CLR4_4_18y08y0lb90p7kr.R.inc(11594);
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * Creates a new Poisson distribution with specified mean, convergence
     * criterion and maximum number of iterations.
     *
     * @param rng Random number generator.
     * @param p Poisson mean.
     * @param epsilon Convergence criterion for cumulative probabilities.
     * @param maxIterations the maximum number of iterations for cumulative
     * probabilities.
     * @throws NotStrictlyPositiveException if {@code p <= 0}.
     * @since 3.1
     */
    public PoissonDistribution(RandomGenerator rng,
                               double p,
                               double epsilon,
                               int maxIterations)
    throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_18y08y0lb90p7kr.R.inc(11597);try{__CLR4_4_18y08y0lb90p7kr.R.inc(11596);

        __CLR4_4_18y08y0lb90p7kr.R.inc(11598);if ((((p <= 0)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11599)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11600)==0&false))) {{
            __CLR4_4_18y08y0lb90p7kr.R.inc(11601);throw new NotStrictlyPositiveException(LocalizedFormats.MEAN, p);
        }
        }__CLR4_4_18y08y0lb90p7kr.R.inc(11602);mean = p;
        __CLR4_4_18y08y0lb90p7kr.R.inc(11603);this.epsilon = epsilon;
        __CLR4_4_18y08y0lb90p7kr.R.inc(11604);this.maxIterations = maxIterations;

        // Use the same RNG instance as the parent class.
        __CLR4_4_18y08y0lb90p7kr.R.inc(11605);normal = new NormalDistribution(rng, p, FastMath.sqrt(p),
                                        NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11606);exponential = new ExponentialDistribution(rng, 1,
                                                  ExponentialDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * Creates a new Poisson distribution with the specified mean and
     * convergence criterion.
     *
     * @param p Poisson mean.
     * @param epsilon Convergence criterion for cumulative probabilities.
     * @throws NotStrictlyPositiveException if {@code p <= 0}.
     * @since 2.1
     */
    public PoissonDistribution(double p, double epsilon)
    throws NotStrictlyPositiveException {
        this(p, epsilon, DEFAULT_MAX_ITERATIONS);__CLR4_4_18y08y0lb90p7kr.R.inc(11608);try{__CLR4_4_18y08y0lb90p7kr.R.inc(11607);
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * Creates a new Poisson distribution with the specified mean and maximum
     * number of iterations.
     *
     * @param p Poisson mean.
     * @param maxIterations Maximum number of iterations for cumulative
     * probabilities.
     * @since 2.1
     */
    public PoissonDistribution(double p, int maxIterations) {
        this(p, DEFAULT_EPSILON, maxIterations);__CLR4_4_18y08y0lb90p7kr.R.inc(11610);try{__CLR4_4_18y08y0lb90p7kr.R.inc(11609);
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * Get the mean for the distribution.
     *
     * @return the mean for the distribution.
     */
    public double getMean() {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11611);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11612);return mean;
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double probability(int x) {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11613);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11614);double ret;
        __CLR4_4_18y08y0lb90p7kr.R.inc(11615);if ((((x < 0 || x == Integer.MAX_VALUE)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11616)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11617)==0&false))) {{
            __CLR4_4_18y08y0lb90p7kr.R.inc(11618);ret = 0.0;
        } }else {__CLR4_4_18y08y0lb90p7kr.R.inc(11619);if ((((x == 0)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11620)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11621)==0&false))) {{
            __CLR4_4_18y08y0lb90p7kr.R.inc(11622);ret = FastMath.exp(-mean);
        } }else {{
            __CLR4_4_18y08y0lb90p7kr.R.inc(11623);ret = FastMath.exp(-SaddlePointExpansion.getStirlingError(x) -
                  SaddlePointExpansion.getDeviancePart(x, mean)) /
                  FastMath.sqrt(MathUtils.TWO_PI * x);
        }
        }}__CLR4_4_18y08y0lb90p7kr.R.inc(11624);return ret;
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(int x) {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11625);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11626);if ((((x < 0)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11627)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11628)==0&false))) {{
            __CLR4_4_18y08y0lb90p7kr.R.inc(11629);return 0;
        }
        }__CLR4_4_18y08y0lb90p7kr.R.inc(11630);if ((((x == Integer.MAX_VALUE)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11631)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11632)==0&false))) {{
            __CLR4_4_18y08y0lb90p7kr.R.inc(11633);return 1;
        }
        }__CLR4_4_18y08y0lb90p7kr.R.inc(11634);return Gamma.regularizedGammaQ((double) x + 1, mean, epsilon,
                                       maxIterations);
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * Calculates the Poisson distribution function using a normal
     * approximation. The {@code N(mean, sqrt(mean))} distribution is used
     * to approximate the Poisson distribution. The computation uses
     * "half-correction" (evaluating the normal distribution function at
     * {@code x + 0.5}).
     *
     * @param x Upper bound, inclusive.
     * @return the distribution function value calculated using a normal
     * approximation.
     */
    public double normalApproximateProbability(int x)  {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11635);
        // calculate the probability using half-correction
        __CLR4_4_18y08y0lb90p7kr.R.inc(11636);return normal.cumulativeProbability(x + 0.5);
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For mean parameter {@code p}, the mean is {@code p}.
     */
    public double getNumericalMean() {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11637);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11638);return getMean();
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For mean parameter {@code p}, the variance is {@code p}.
     */
    public double getNumericalVariance() {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11639);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11640);return getMean();
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the mean parameter.
     *
     * @return lower bound of the support (always 0)
     */
    public int getSupportLowerBound() {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11641);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11642);return 0;
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is positive infinity,
     * regardless of the parameter values. There is no integer infinity,
     * so this method returns {@code Integer.MAX_VALUE}.
     *
     * @return upper bound of the support (always {@code Integer.MAX_VALUE} for
     * positive infinity)
     */
    public int getSupportUpperBound() {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11643);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11644);return Integer.MAX_VALUE;
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11645);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11646);return true;
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * <strong>Algorithm Description</strong>:
     * <ul>
     *  <li>For small means, uses simulation of a Poisson process
     *   using Uniform deviates, as described
     *   <a href="http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm"> here</a>.
     *   The Poisson process (and hence value returned) is bounded by 1000 * mean.
     *  </li>
     *  <li>For large means, uses the rejection algorithm described in
     *   <quote>
     *    Devroye, Luc. (1981).<i>The Computer Generation of Poisson Random Variables</i>
     *    <strong>Computing</strong> vol. 26 pp. 197-207.
     *   </quote>
     *  </li>
     * </ul>
     * </p>
     *
     * @return a random value.
     * @since 2.2
     */
    @Override
    public int sample() {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11647);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11648);return (int) FastMath.min(nextPoisson(mean), Integer.MAX_VALUE);
    }finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}

    /**
     * @param meanPoisson Mean of the Poisson distribution.
     * @return the next sample.
     */
    private long nextPoisson(double meanPoisson) {try{__CLR4_4_18y08y0lb90p7kr.R.inc(11649);
        __CLR4_4_18y08y0lb90p7kr.R.inc(11650);final double pivot = 40.0d;
        __CLR4_4_18y08y0lb90p7kr.R.inc(11651);if ((((meanPoisson < pivot)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11652)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11653)==0&false))) {{
            __CLR4_4_18y08y0lb90p7kr.R.inc(11654);double p = FastMath.exp(-meanPoisson);
            __CLR4_4_18y08y0lb90p7kr.R.inc(11655);long n = 0;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11656);double r = 1.0d;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11657);double rnd = 1.0d;

            __CLR4_4_18y08y0lb90p7kr.R.inc(11658);while ((((n < 1000 * meanPoisson)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11659)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11660)==0&false))) {{
                __CLR4_4_18y08y0lb90p7kr.R.inc(11661);rnd = random.nextDouble();
                __CLR4_4_18y08y0lb90p7kr.R.inc(11662);r = r * rnd;
                __CLR4_4_18y08y0lb90p7kr.R.inc(11663);if ((((r >= p)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11664)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11665)==0&false))) {{
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11666);n++;
                } }else {{
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11667);return n;
                }
            }}
            }__CLR4_4_18y08y0lb90p7kr.R.inc(11668);return n;
        } }else {{
            __CLR4_4_18y08y0lb90p7kr.R.inc(11669);final double lambda = FastMath.floor(meanPoisson);
            __CLR4_4_18y08y0lb90p7kr.R.inc(11670);final double lambdaFractional = meanPoisson - lambda;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11671);final double logLambda = FastMath.log(lambda);
            __CLR4_4_18y08y0lb90p7kr.R.inc(11672);final double logLambdaFactorial = CombinatoricsUtils.factorialLog((int) lambda);
            __CLR4_4_18y08y0lb90p7kr.R.inc(11673);final long y2 = (((lambdaFractional < Double.MIN_VALUE )&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11674)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11675)==0&false))? 0 : nextPoisson(lambdaFractional);
            __CLR4_4_18y08y0lb90p7kr.R.inc(11676);final double delta = FastMath.sqrt(lambda * FastMath.log(32 * lambda / FastMath.PI + 1));
            __CLR4_4_18y08y0lb90p7kr.R.inc(11677);final double halfDelta = delta / 2;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11678);final double twolpd = 2 * lambda + delta;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11679);final double a1 = FastMath.sqrt(FastMath.PI * twolpd) * FastMath.exp(1 / 8 * lambda);
            __CLR4_4_18y08y0lb90p7kr.R.inc(11680);final double a2 = (twolpd / delta) * FastMath.exp(-delta * (1 + delta) / twolpd);
            __CLR4_4_18y08y0lb90p7kr.R.inc(11681);final double aSum = a1 + a2 + 1;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11682);final double p1 = a1 / aSum;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11683);final double p2 = a2 / aSum;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11684);final double c1 = 1 / (8 * lambda);

            __CLR4_4_18y08y0lb90p7kr.R.inc(11685);double x = 0;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11686);double y = 0;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11687);double v = 0;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11688);int a = 0;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11689);double t = 0;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11690);double qr = 0;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11691);double qa = 0;
            __CLR4_4_18y08y0lb90p7kr.R.inc(11692);for (;;) {{
                __CLR4_4_18y08y0lb90p7kr.R.inc(11693);final double u = random.nextDouble();
                __CLR4_4_18y08y0lb90p7kr.R.inc(11694);if ((((u <= p1)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11695)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11696)==0&false))) {{
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11697);final double n = random.nextGaussian();
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11698);x = n * FastMath.sqrt(lambda + halfDelta) - 0.5d;
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11699);if ((((x > delta || x < -lambda)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11700)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11701)==0&false))) {{
                        __CLR4_4_18y08y0lb90p7kr.R.inc(11702);continue;
                    }
                    }__CLR4_4_18y08y0lb90p7kr.R.inc(11703);y = (((x < 0 )&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11704)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11705)==0&false))? FastMath.floor(x) : FastMath.ceil(x);
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11706);final double e = exponential.sample();
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11707);v = -e - (n * n / 2) + c1;
                } }else {{
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11708);if ((((u > p1 + p2)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11709)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11710)==0&false))) {{
                        __CLR4_4_18y08y0lb90p7kr.R.inc(11711);y = lambda;
                        __CLR4_4_18y08y0lb90p7kr.R.inc(11712);break;
                    } }else {{
                        __CLR4_4_18y08y0lb90p7kr.R.inc(11713);x = delta + (twolpd / delta) * exponential.sample();
                        __CLR4_4_18y08y0lb90p7kr.R.inc(11714);y = FastMath.ceil(x);
                        __CLR4_4_18y08y0lb90p7kr.R.inc(11715);v = -exponential.sample() - delta * (x + 1) / twolpd;
                    }
                }}
                }__CLR4_4_18y08y0lb90p7kr.R.inc(11716);a = (((x < 0 )&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11717)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11718)==0&false))? 1 : 0;
                __CLR4_4_18y08y0lb90p7kr.R.inc(11719);t = y * (y + 1) / (2 * lambda);
                __CLR4_4_18y08y0lb90p7kr.R.inc(11720);if ((((v < -t && a == 0)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11721)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11722)==0&false))) {{
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11723);y = lambda + y;
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11724);break;
                }
                }__CLR4_4_18y08y0lb90p7kr.R.inc(11725);qr = t * ((2 * y + 1) / (6 * lambda) - 1);
                __CLR4_4_18y08y0lb90p7kr.R.inc(11726);qa = qr - (t * t) / (3 * (lambda + a * (y + 1)));
                __CLR4_4_18y08y0lb90p7kr.R.inc(11727);if ((((v < qa)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11728)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11729)==0&false))) {{
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11730);y = lambda + y;
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11731);break;
                }
                }__CLR4_4_18y08y0lb90p7kr.R.inc(11732);if ((((v > qr)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11733)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11734)==0&false))) {{
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11735);continue;
                }
                }__CLR4_4_18y08y0lb90p7kr.R.inc(11736);if ((((v < y * logLambda - CombinatoricsUtils.factorialLog((int) (y + lambda)) + logLambdaFactorial)&&(__CLR4_4_18y08y0lb90p7kr.R.iget(11737)!=0|true))||(__CLR4_4_18y08y0lb90p7kr.R.iget(11738)==0&false))) {{
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11739);y = lambda + y;
                    __CLR4_4_18y08y0lb90p7kr.R.inc(11740);break;
                }
            }}
            }__CLR4_4_18y08y0lb90p7kr.R.inc(11741);return y2 + (long) y;
        }
    }}finally{__CLR4_4_18y08y0lb90p7kr.R.flushNeeded();}}
}
