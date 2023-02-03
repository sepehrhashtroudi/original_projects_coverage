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

package org.apache.commons.math3.random;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Collection;

import org.apache.commons.math3.distribution.IntegerDistribution;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.exception.NotANumberException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;

/**
 * Generates random deviates and other random data using a {@link RandomGenerator}
 * instance to generate non-secure data and a {@link java.security.SecureRandom}
 * instance to provide data for the <code>nextSecureXxx</code> methods. If no
 * <code>RandomGenerator</code> is provided in the constructor, the default is
 * to use a {@link Well19937c} generator. To plug in a different
 * implementation, either implement <code>RandomGenerator</code> directly or
 * extend {@link AbstractRandomGenerator}.
 * <p>
 * Supports reseeding the underlying pseudo-random number generator (PRNG). The
 * <code>SecurityProvider</code> and <code>Algorithm</code> used by the
 * <code>SecureRandom</code> instance can also be reset.
 * </p>
 * <p>
 * For details on the default PRNGs, see {@link java.util.Random} and
 * {@link java.security.SecureRandom}.
 * </p>
 * <p>
 * <strong>Usage Notes</strong>:
 * <ul>
 * <li>
 * Instance variables are used to maintain <code>RandomGenerator</code> and
 * <code>SecureRandom</code> instances used in data generation. Therefore, to
 * generate a random sequence of values or strings, you should use just
 * <strong>one</strong> <code>RandomDataGenerator</code> instance repeatedly.</li>
 * <li>
 * The "secure" methods are *much* slower. These should be used only when a
 * cryptographically secure random sequence is required. A secure random
 * sequence is a sequence of pseudo-random values which, in addition to being
 * well-dispersed (so no subsequence of values is an any more likely than other
 * subsequence of the the same length), also has the additional property that
 * knowledge of values generated up to any point in the sequence does not make
 * it any easier to predict subsequent values.</li>
 * <li>
 * When a new <code>RandomDataGenerator</code> is created, the underlying random
 * number generators are <strong>not</strong> initialized. If you do not
 * explicitly seed the default non-secure generator, it is seeded with the
 * current time in milliseconds plus the system identity hash code on first use.
 * The same holds for the secure generator. If you provide a <code>RandomGenerator</code>
 * to the constructor, however, this generator is not reseeded by the constructor
 * nor is it reseeded on first use.</li>
 * <li>
 * The <code>reSeed</code> and <code>reSeedSecure</code> methods delegate to the
 * corresponding methods on the underlying <code>RandomGenerator</code> and
 * <code>SecureRandom</code> instances. Therefore, <code>reSeed(long)</code>
 * fully resets the initial state of the non-secure random number generator (so
 * that reseeding with a specific value always results in the same subsequent
 * random sequence); whereas reSeedSecure(long) does <strong>not</strong>
 * reinitialize the secure random number generator (so secure sequences started
 * with calls to reseedSecure(long) won't be identical).</li>
 * <li>
 * This implementation is not synchronized. The underlying <code>RandomGenerator</code>
 * or <code>SecureRandom</code> instances are not protected by synchronization and
 * are not guaranteed to be thread-safe.  Therefore, if an instance of this class
 * is concurrently utilized by multiple threads, it is the responsibility of
 * client code to synchronize access to seeding and data generation methods.
 * </li>
 * </ul>
 * </p>
 * @deprecated to be removed in 4.0.  Use {@link RandomDataGenerator} instead
 * @version $Id$
 */
@Deprecated
public class RandomDataImpl implements RandomData, Serializable {public static class __CLR4_4_1117u117ulb90pae3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48302,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -626730818244969716L;

    /** RandomDataGenerator delegate */
    private final RandomDataGenerator delegate;

    /**
     * Construct a RandomDataImpl, using a default random generator as the source
     * of randomness.
     *
     * <p>The default generator is a {@link Well19937c} seeded
     * with {@code System.currentTimeMillis() + System.identityHashCode(this))}.
     * The generator is initialized and seeded on first use.</p>
     */
    public RandomDataImpl() {try{__CLR4_4_1117u117ulb90pae3.R.inc(48234);
        __CLR4_4_1117u117ulb90pae3.R.inc(48235);delegate = new RandomDataGenerator();
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Construct a RandomDataImpl using the supplied {@link RandomGenerator} as
     * the source of (non-secure) random data.
     *
     * @param rand the source of (non-secure) random data
     * (may be null, resulting in the default generator)
     * @since 1.1
     */
    public RandomDataImpl(RandomGenerator rand) {try{__CLR4_4_1117u117ulb90pae3.R.inc(48236);
        __CLR4_4_1117u117ulb90pae3.R.inc(48237);delegate = new RandomDataGenerator(rand);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * @return the delegate object.
     * @deprecated To be removed in 4.0.
     */
    @Deprecated
    RandomDataGenerator getDelegate() {try{__CLR4_4_1117u117ulb90pae3.R.inc(48238);
        __CLR4_4_1117u117ulb90pae3.R.inc(48239);return delegate;
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * <strong>Algorithm Description:</strong> hex strings are generated using a
     * 2-step process.
     * <ol>
     * <li>{@code len / 2 + 1} binary bytes are generated using the underlying
     * Random</li>
     * <li>Each binary byte is translated into 2 hex digits</li>
     * </ol>
     * </p>
     *
     * @param len the desired string length.
     * @return the random string.
     * @throws NotStrictlyPositiveException if {@code len <= 0}.
     */
    public String nextHexString(int len) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48240);
        __CLR4_4_1117u117ulb90pae3.R.inc(48241);return delegate.nextHexString(len);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int nextInt(int lower, int upper) throws NumberIsTooLargeException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48242);
       __CLR4_4_1117u117ulb90pae3.R.inc(48243);return delegate.nextInt(lower, upper);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /** {@inheritDoc} */
    public long nextLong(long lower, long upper) throws NumberIsTooLargeException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48244);
        __CLR4_4_1117u117ulb90pae3.R.inc(48245);return delegate.nextLong(lower, upper);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * <strong>Algorithm Description:</strong> hex strings are generated in
     * 40-byte segments using a 3-step process.
     * <ol>
     * <li>
     * 20 random bytes are generated using the underlying
     * <code>SecureRandom</code>.</li>
     * <li>
     * SHA-1 hash is applied to yield a 20-byte binary digest.</li>
     * <li>
     * Each byte of the binary digest is converted to 2 hex digits.</li>
     * </ol>
     * </p>
     */
    public String nextSecureHexString(int len) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48246);
        __CLR4_4_1117u117ulb90pae3.R.inc(48247);return delegate.nextSecureHexString(len);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**  {@inheritDoc} */
    public int nextSecureInt(int lower, int upper) throws NumberIsTooLargeException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48248);
        __CLR4_4_1117u117ulb90pae3.R.inc(48249);return delegate.nextSecureInt(lower, upper);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /** {@inheritDoc} */
    public long nextSecureLong(long lower, long upper) throws NumberIsTooLargeException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48250);
        __CLR4_4_1117u117ulb90pae3.R.inc(48251);return delegate.nextSecureLong(lower,upper);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>
     * <strong>Algorithm Description</strong>:
     * <ul><li> For small means, uses simulation of a Poisson process
     * using Uniform deviates, as described
     * <a href="http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm"> here.</a>
     * The Poisson process (and hence value returned) is bounded by 1000 * mean.</li>
     *
     * <li> For large means, uses the rejection algorithm described in <br/>
     * Devroye, Luc. (1981).<i>The Computer Generation of Poisson Random Variables</i>
     * <strong>Computing</strong> vol. 26 pp. 197-207.</li></ul></p>
     */
    public long nextPoisson(double mean) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48252);
        __CLR4_4_1117u117ulb90pae3.R.inc(48253);return delegate.nextPoisson(mean);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double nextGaussian(double mu, double sigma) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48254);
        __CLR4_4_1117u117ulb90pae3.R.inc(48255);return delegate.nextGaussian(mu,sigma);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>
     * <strong>Algorithm Description</strong>: Uses the Algorithm SA (Ahrens)
     * from p. 876 in:
     * [1]: Ahrens, J. H. and Dieter, U. (1972). Computer methods for
     * sampling from the exponential and normal distributions.
     * Communications of the ACM, 15, 873-882.
     * </p>
     */
    public double nextExponential(double mean) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48256);
        __CLR4_4_1117u117ulb90pae3.R.inc(48257);return delegate.nextExponential(mean);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>
     * <strong>Algorithm Description</strong>: scales the output of
     * Random.nextDouble(), but rejects 0 values (i.e., will generate another
     * random double if Random.nextDouble() returns 0). This is necessary to
     * provide a symmetric output interval (both endpoints excluded).
     * </p>
     */
    public double nextUniform(double lower, double upper)
        throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48258);
        __CLR4_4_1117u117ulb90pae3.R.inc(48259);return delegate.nextUniform(lower, upper);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>
     * <strong>Algorithm Description</strong>: if the lower bound is excluded,
     * scales the output of Random.nextDouble(), but rejects 0 values (i.e.,
     * will generate another random double if Random.nextDouble() returns 0).
     * This is necessary to provide a symmetric output interval (both
     * endpoints excluded).
     * </p>
     * @since 3.0
     */
    public double nextUniform(double lower, double upper, boolean lowerInclusive)
        throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48260);
        __CLR4_4_1117u117ulb90pae3.R.inc(48261);return delegate.nextUniform(lower, upper, lowerInclusive);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.BetaDistribution Beta Distribution}.
     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}
     * to generate random values.
     *
     * @param alpha first distribution shape parameter
     * @param beta second distribution shape parameter
     * @return random value sampled from the beta(alpha, beta) distribution
     * @since 2.2
     */
    public double nextBeta(double alpha, double beta) {try{__CLR4_4_1117u117ulb90pae3.R.inc(48262);
        __CLR4_4_1117u117ulb90pae3.R.inc(48263);return delegate.nextBeta(alpha, beta);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.BinomialDistribution Binomial Distribution}.
     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}
     * to generate random values.
     *
     * @param numberOfTrials number of trials of the Binomial distribution
     * @param probabilityOfSuccess probability of success of the Binomial distribution
     * @return random value sampled from the Binomial(numberOfTrials, probabilityOfSuccess) distribution
     * @since 2.2
     */
    public int nextBinomial(int numberOfTrials, double probabilityOfSuccess) {try{__CLR4_4_1117u117ulb90pae3.R.inc(48264);
        __CLR4_4_1117u117ulb90pae3.R.inc(48265);return delegate.nextBinomial(numberOfTrials, probabilityOfSuccess);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.CauchyDistribution Cauchy Distribution}.
     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}
     * to generate random values.
     *
     * @param median the median of the Cauchy distribution
     * @param scale the scale parameter of the Cauchy distribution
     * @return random value sampled from the Cauchy(median, scale) distribution
     * @since 2.2
     */
    public double nextCauchy(double median, double scale) {try{__CLR4_4_1117u117ulb90pae3.R.inc(48266);
        __CLR4_4_1117u117ulb90pae3.R.inc(48267);return delegate.nextCauchy(median, scale);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.ChiSquaredDistribution ChiSquare Distribution}.
     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}
     * to generate random values.
     *
     * @param df the degrees of freedom of the ChiSquare distribution
     * @return random value sampled from the ChiSquare(df) distribution
     * @since 2.2
     */
    public double nextChiSquare(double df) {try{__CLR4_4_1117u117ulb90pae3.R.inc(48268);
       __CLR4_4_1117u117ulb90pae3.R.inc(48269);return delegate.nextChiSquare(df);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.FDistribution F Distribution}.
     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}
     * to generate random values.
     *
     * @param numeratorDf the numerator degrees of freedom of the F distribution
     * @param denominatorDf the denominator degrees of freedom of the F distribution
     * @return random value sampled from the F(numeratorDf, denominatorDf) distribution
     * @throws NotStrictlyPositiveException if
     * {@code numeratorDf <= 0} or {@code denominatorDf <= 0}.
     * @since 2.2
     */
    public double nextF(double numeratorDf, double denominatorDf) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48270);
        __CLR4_4_1117u117ulb90pae3.R.inc(48271);return delegate.nextF(numeratorDf, denominatorDf);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * <p>Generates a random value from the
     * {@link org.apache.commons.math3.distribution.GammaDistribution Gamma Distribution}.</p>
     *
     * <p>This implementation uses the following algorithms: </p>
     *
     * <p>For 0 < shape < 1: <br/>
     * Ahrens, J. H. and Dieter, U., <i>Computer methods for
     * sampling from gamma, beta, Poisson and binomial distributions.</i>
     * Computing, 12, 223-246, 1974.</p>
     *
     * <p>For shape >= 1: <br/>
     * Marsaglia and Tsang, <i>A Simple Method for Generating
     * Gamma Variables.</i> ACM Transactions on Mathematical Software,
     * Volume 26 Issue 3, September, 2000.</p>
     *
     * @param shape the median of the Gamma distribution
     * @param scale the scale parameter of the Gamma distribution
     * @return random value sampled from the Gamma(shape, scale) distribution
     * @throws NotStrictlyPositiveException if {@code shape <= 0} or
     * {@code scale <= 0}.
     * @since 2.2
     */
    public double nextGamma(double shape, double scale) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48272);
        __CLR4_4_1117u117ulb90pae3.R.inc(48273);return delegate.nextGamma(shape, scale);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.HypergeometricDistribution Hypergeometric Distribution}.
     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}
     * to generate random values.
     *
     * @param populationSize the population size of the Hypergeometric distribution
     * @param numberOfSuccesses number of successes in the population of the Hypergeometric distribution
     * @param sampleSize the sample size of the Hypergeometric distribution
     * @return random value sampled from the Hypergeometric(numberOfSuccesses, sampleSize) distribution
     * @throws NumberIsTooLargeException  if {@code numberOfSuccesses > populationSize},
     * or {@code sampleSize > populationSize}.
     * @throws NotStrictlyPositiveException if {@code populationSize <= 0}.
     * @throws NotPositiveException  if {@code numberOfSuccesses < 0}.
     * @since 2.2
     */
    public int nextHypergeometric(int populationSize, int numberOfSuccesses, int sampleSize)
        throws NotPositiveException, NotStrictlyPositiveException, NumberIsTooLargeException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48274);
        __CLR4_4_1117u117ulb90pae3.R.inc(48275);return delegate.nextHypergeometric(populationSize, numberOfSuccesses, sampleSize);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.PascalDistribution Pascal Distribution}.
     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}
     * to generate random values.
     *
     * @param r the number of successes of the Pascal distribution
     * @param p the probability of success of the Pascal distribution
     * @return random value sampled from the Pascal(r, p) distribution
     * @since 2.2
     * @throws NotStrictlyPositiveException if the number of successes is not positive
     * @throws OutOfRangeException if the probability of success is not in the
     * range {@code [0, 1]}.
     */
    public int nextPascal(int r, double p)
        throws NotStrictlyPositiveException, OutOfRangeException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48276);
        __CLR4_4_1117u117ulb90pae3.R.inc(48277);return delegate.nextPascal(r, p);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.TDistribution T Distribution}.
     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}
     * to generate random values.
     *
     * @param df the degrees of freedom of the T distribution
     * @return random value from the T(df) distribution
     * @since 2.2
     * @throws NotStrictlyPositiveException if {@code df <= 0}
     */
    public double nextT(double df) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48278);
        __CLR4_4_1117u117ulb90pae3.R.inc(48279);return delegate.nextT(df);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.WeibullDistribution Weibull Distribution}.
     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}
     * to generate random values.
     *
     * @param shape the shape parameter of the Weibull distribution
     * @param scale the scale parameter of the Weibull distribution
     * @return random value sampled from the Weibull(shape, size) distribution
     * @since 2.2
     * @throws NotStrictlyPositiveException if {@code shape <= 0} or
     * {@code scale <= 0}.
     */
    public double nextWeibull(double shape, double scale) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48280);
        __CLR4_4_1117u117ulb90pae3.R.inc(48281);return delegate.nextWeibull(shape, scale);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link org.apache.commons.math3.distribution.ZipfDistribution Zipf Distribution}.
     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}
     * to generate random values.
     *
     * @param numberOfElements the number of elements of the ZipfDistribution
     * @param exponent the exponent of the ZipfDistribution
     * @return random value sampled from the Zipf(numberOfElements, exponent) distribution
     * @since 2.2
     * @exception NotStrictlyPositiveException if {@code numberOfElements <= 0}
     * or {@code exponent <= 0}.
     */
    public int nextZipf(int numberOfElements, double exponent) throws NotStrictlyPositiveException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48282);
        __CLR4_4_1117u117ulb90pae3.R.inc(48283);return delegate.nextZipf(numberOfElements, exponent);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}


    /**
     * Reseeds the random number generator with the supplied seed.
     * <p>
     * Will create and initialize if null.
     * </p>
     *
     * @param seed
     *            the seed value to use
     */
    public void reSeed(long seed) {try{__CLR4_4_1117u117ulb90pae3.R.inc(48284);
        __CLR4_4_1117u117ulb90pae3.R.inc(48285);delegate.reSeed(seed);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Reseeds the secure random number generator with the current time in
     * milliseconds.
     * <p>
     * Will create and initialize if null.
     * </p>
     */
    public void reSeedSecure() {try{__CLR4_4_1117u117ulb90pae3.R.inc(48286);
        __CLR4_4_1117u117ulb90pae3.R.inc(48287);delegate.reSeedSecure();
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Reseeds the secure random number generator with the supplied seed.
     * <p>
     * Will create and initialize if null.
     * </p>
     *
     * @param seed
     *            the seed value to use
     */
    public void reSeedSecure(long seed) {try{__CLR4_4_1117u117ulb90pae3.R.inc(48288);
        __CLR4_4_1117u117ulb90pae3.R.inc(48289);delegate.reSeedSecure(seed);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Reseeds the random number generator with
     * {@code System.currentTimeMillis() + System.identityHashCode(this))}.
     */
    public void reSeed() {try{__CLR4_4_1117u117ulb90pae3.R.inc(48290);
        __CLR4_4_1117u117ulb90pae3.R.inc(48291);delegate.reSeed();
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Sets the PRNG algorithm for the underlying SecureRandom instance using
     * the Security Provider API. The Security Provider API is defined in <a
     * href =
     * "http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA">
     * Java Cryptography Architecture API Specification & Reference.</a>
     * <p>
     * <strong>USAGE NOTE:</strong> This method carries <i>significant</i>
     * overhead and may take several seconds to execute.
     * </p>
     *
     * @param algorithm
     *            the name of the PRNG algorithm
     * @param provider
     *            the name of the provider
     * @throws NoSuchAlgorithmException
     *             if the specified algorithm is not available
     * @throws NoSuchProviderException
     *             if the specified provider is not installed
     */
    public void setSecureAlgorithm(String algorithm, String provider)
            throws NoSuchAlgorithmException, NoSuchProviderException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48292);
       __CLR4_4_1117u117ulb90pae3.R.inc(48293);delegate.setSecureAlgorithm(algorithm, provider);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>
     * Uses a 2-cycle permutation shuffle. The shuffling process is described <a
     * href="http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html">
     * here</a>.
     * </p>
     */
    public int[] nextPermutation(int n, int k)
        throws NotStrictlyPositiveException, NumberIsTooLargeException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48294);
        __CLR4_4_1117u117ulb90pae3.R.inc(48295);return delegate.nextPermutation(n, k);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>
     * <strong>Algorithm Description</strong>: Uses a 2-cycle permutation
     * shuffle to generate a random permutation of <code>c.size()</code> and
     * then returns the elements whose indexes correspond to the elements of the
     * generated permutation. This technique is described, and proven to
     * generate random samples <a
     * href="http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html">
     * here</a>
     * </p>
     */
    public Object[] nextSample(Collection<?> c, int k)
        throws NotStrictlyPositiveException, NumberIsTooLargeException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48296);
        __CLR4_4_1117u117ulb90pae3.R.inc(48297);return delegate.nextSample(c, k);
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generate a random deviate from the given distribution using the
     * <a href="http://en.wikipedia.org/wiki/Inverse_transform_sampling"> inversion method.</a>
     *
     * @param distribution Continuous distribution to generate a random value from
     * @return a random value sampled from the given distribution
     * @throws MathIllegalArgumentException if the underlynig distribution throws one
     * @since 2.2
     * @deprecated use the distribution's sample() method
     */
    @Deprecated
    public double nextInversionDeviate(RealDistribution distribution)
        throws MathIllegalArgumentException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48298);
        __CLR4_4_1117u117ulb90pae3.R.inc(48299);return distribution.inverseCumulativeProbability(nextUniform(0, 1));

    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

    /**
     * Generate a random deviate from the given distribution using the
     * <a href="http://en.wikipedia.org/wiki/Inverse_transform_sampling"> inversion method.</a>
     *
     * @param distribution Integer distribution to generate a random value from
     * @return a random value sampled from the given distribution
     * @throws MathIllegalArgumentException if the underlynig distribution throws one
     * @since 2.2
     * @deprecated use the distribution's sample() method
     */
    @Deprecated
    public int nextInversionDeviate(IntegerDistribution distribution)
        throws MathIllegalArgumentException {try{__CLR4_4_1117u117ulb90pae3.R.inc(48300);
        __CLR4_4_1117u117ulb90pae3.R.inc(48301);return distribution.inverseCumulativeProbability(nextUniform(0, 1));
    }finally{__CLR4_4_1117u117ulb90pae3.R.flushNeeded();}}

}
