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
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * <p>
 * Implementation of the Pascal distribution. The Pascal distribution is a
 * special case of the Negative Binomial distribution where the number of
 * successes parameter is an integer.
 * </p>
 * <p>
 * There are various ways to express the probability mass and distribution
 * functions for the Pascal distribution. The present implementation represents
 * the distribution of the number of failures before {@code r} successes occur.
 * This is the convention adopted in e.g.
 * <a href="http://mathworld.wolfram.com/NegativeBinomialDistribution.html">MathWorld</a>,
 * but <em>not</em> in
 * <a href="http://en.wikipedia.org/wiki/Negative_binomial_distribution">Wikipedia</a>.
 * </p>
 * <p>
 * For a random variable {@code X} whose values are distributed according to this
 * distribution, the probability mass function is given by<br/>
 * {@code P(X = k) = C(k + r - 1, r - 1) * p^r * (1 - p)^k,}<br/>
 * where {@code r} is the number of successes, {@code p} is the probability of
 * success, and {@code X} is the total number of failures. {@code C(n, k)} is
 * the binomial coefficient ({@code n} choose {@code k}). The mean and variance
 * of {@code X} are<br/>
 * {@code E(X) = (1 - p) * r / p, var(X) = (1 - p) * r / p^2.}<br/>
 * Finally, the cumulative distribution function is given by<br/>
 * {@code P(X <= k) = I(p, r, k + 1)},
 * where I is the regularized incomplete Beta function.
 * </p>
 *
 * @see <a href="http://en.wikipedia.org/wiki/Negative_binomial_distribution">
 * Negative binomial distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/NegativeBinomialDistribution.html">
 * Negative binomial distribution (MathWorld)</a>
 * @version $Id$
 * @since 1.2 (changed to concrete class in 3.0)
 */
public class PascalDistribution extends AbstractIntegerDistribution {public static class __CLR4_4_18wo8wolb90p7kg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11592,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 6751309484392813623L;
    /** The number of successes. */
    private final int numberOfSuccesses;
    /** The probability of success. */
    private final double probabilityOfSuccess;

    /**
     * Create a Pascal distribution with the given number of successes and
     * probability of success.
     *
     * @param r Number of successes.
     * @param p Probability of success.
     * @throws NotStrictlyPositiveException if the number of successes is not positive
     * @throws OutOfRangeException if the probability of success is not in the
     * range {@code [0, 1]}.
     */
    public PascalDistribution(int r, double p)
        throws NotStrictlyPositiveException, OutOfRangeException {
        this(new Well19937c(), r, p);__CLR4_4_18wo8wolb90p7kg.R.inc(11545);try{__CLR4_4_18wo8wolb90p7kg.R.inc(11544);
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /**
     * Create a Pascal distribution with the given number of successes and
     * probability of success.
     *
     * @param rng Random number generator.
     * @param r Number of successes.
     * @param p Probability of success.
     * @throws NotStrictlyPositiveException if the number of successes is not positive
     * @throws OutOfRangeException if the probability of success is not in the
     * range {@code [0, 1]}.
     * @since 3.1
     */
    public PascalDistribution(RandomGenerator rng,
                              int r,
                              double p)
        throws NotStrictlyPositiveException, OutOfRangeException {
        super(rng);__CLR4_4_18wo8wolb90p7kg.R.inc(11547);try{__CLR4_4_18wo8wolb90p7kg.R.inc(11546);

        __CLR4_4_18wo8wolb90p7kg.R.inc(11548);if ((((r <= 0)&&(__CLR4_4_18wo8wolb90p7kg.R.iget(11549)!=0|true))||(__CLR4_4_18wo8wolb90p7kg.R.iget(11550)==0&false))) {{
            __CLR4_4_18wo8wolb90p7kg.R.inc(11551);throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SUCCESSES,
                                                   r);
        }
        }__CLR4_4_18wo8wolb90p7kg.R.inc(11552);if ((((p < 0 || p > 1)&&(__CLR4_4_18wo8wolb90p7kg.R.iget(11553)!=0|true))||(__CLR4_4_18wo8wolb90p7kg.R.iget(11554)==0&false))) {{
            __CLR4_4_18wo8wolb90p7kg.R.inc(11555);throw new OutOfRangeException(p, 0, 1);
        }

        }__CLR4_4_18wo8wolb90p7kg.R.inc(11556);numberOfSuccesses = r;
        __CLR4_4_18wo8wolb90p7kg.R.inc(11557);probabilityOfSuccess = p;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /**
     * Access the number of successes for this distribution.
     *
     * @return the number of successes.
     */
    public int getNumberOfSuccesses() {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11558);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11559);return numberOfSuccesses;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /**
     * Access the probability of success for this distribution.
     *
     * @return the probability of success.
     */
    public double getProbabilityOfSuccess() {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11560);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11561);return probabilityOfSuccess;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double probability(int x) {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11562);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11563);double ret;
        __CLR4_4_18wo8wolb90p7kg.R.inc(11564);if ((((x < 0)&&(__CLR4_4_18wo8wolb90p7kg.R.iget(11565)!=0|true))||(__CLR4_4_18wo8wolb90p7kg.R.iget(11566)==0&false))) {{
            __CLR4_4_18wo8wolb90p7kg.R.inc(11567);ret = 0.0;
        } }else {{
            __CLR4_4_18wo8wolb90p7kg.R.inc(11568);ret = CombinatoricsUtils.binomialCoefficientDouble(x +
                  numberOfSuccesses - 1, numberOfSuccesses - 1) *
                  FastMath.pow(probabilityOfSuccess, numberOfSuccesses) *
                  FastMath.pow(1.0 - probabilityOfSuccess, x);
        }
        }__CLR4_4_18wo8wolb90p7kg.R.inc(11569);return ret;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(int x) {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11570);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11571);double ret;
        __CLR4_4_18wo8wolb90p7kg.R.inc(11572);if ((((x < 0)&&(__CLR4_4_18wo8wolb90p7kg.R.iget(11573)!=0|true))||(__CLR4_4_18wo8wolb90p7kg.R.iget(11574)==0&false))) {{
            __CLR4_4_18wo8wolb90p7kg.R.inc(11575);ret = 0.0;
        } }else {{
            __CLR4_4_18wo8wolb90p7kg.R.inc(11576);ret = Beta.regularizedBeta(probabilityOfSuccess,
                    numberOfSuccesses, x + 1.0);
        }
        }__CLR4_4_18wo8wolb90p7kg.R.inc(11577);return ret;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For number of successes {@code r} and probability of success {@code p},
     * the mean is {@code r * (1 - p) / p}.
     */
    public double getNumericalMean() {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11578);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11579);final double p = getProbabilityOfSuccess();
        __CLR4_4_18wo8wolb90p7kg.R.inc(11580);final double r = getNumberOfSuccesses();
        __CLR4_4_18wo8wolb90p7kg.R.inc(11581);return (r * (1 - p)) / p;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For number of successes {@code r} and probability of success {@code p},
     * the variance is {@code r * (1 - p) / p^2}.
     */
    public double getNumericalVariance() {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11582);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11583);final double p = getProbabilityOfSuccess();
        __CLR4_4_18wo8wolb90p7kg.R.inc(11584);final double r = getNumberOfSuccesses();
        __CLR4_4_18wo8wolb90p7kg.R.inc(11585);return r * (1 - p) / (p * p);
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the parameters.
     *
     * @return lower bound of the support (always 0)
     */
    public int getSupportLowerBound() {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11586);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11587);return 0;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity no matter the
     * parameters. Positive infinity is symbolized by {@code Integer.MAX_VALUE}.
     *
     * @return upper bound of the support (always {@code Integer.MAX_VALUE}
     * for positive infinity)
     */
    public int getSupportUpperBound() {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11588);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11589);return Integer.MAX_VALUE;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_18wo8wolb90p7kg.R.inc(11590);
        __CLR4_4_18wo8wolb90p7kg.R.inc(11591);return true;
    }finally{__CLR4_4_18wo8wolb90p7kg.R.flushNeeded();}}
}
