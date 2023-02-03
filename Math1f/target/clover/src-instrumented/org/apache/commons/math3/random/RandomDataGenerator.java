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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Collection;

import org.apache.commons.math3.distribution.BetaDistribution;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.CauchyDistribution;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.distribution.ExponentialDistribution;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.distribution.GammaDistribution;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.distribution.PascalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.distribution.WeibullDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NotANumberException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathArrays;

/**
 * Implements the {@link RandomData} interface using a {@link RandomGenerator}
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
 * <strong>one</strong> <code>RandomDataImpl</code> instance repeatedly.</li>
 * <li>
 * The "secure" methods are *much* slower. These should be used only when a
 * cryptographically secure random sequence is required. A secure random
 * sequence is a sequence of pseudo-random values which, in addition to being
 * well-dispersed (so no subsequence of values is an any more likely than other
 * subsequence of the the same length), also has the additional property that
 * knowledge of values generated up to any point in the sequence does not make
 * it any easier to predict subsequent values.</li>
 * <li>
 * When a new <code>RandomDataImpl</code> is created, the underlying random
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
 * @since 3.1
 * @version $Id$
 */
public class RandomDataGenerator implements RandomData, Serializable {public static class __CLR4_4_111181118lb90padp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -626730818244969716L;

    /** underlying random number generator */
    private RandomGenerator rand = null;

    /** underlying secure random number generator */
    private RandomGenerator secRand = null;

    /**
     * Construct a RandomDataGenerator, using a default random generator as the source
     * of randomness.
     *
     * <p>The default generator is a {@link Well19937c} seeded
     * with {@code System.currentTimeMillis() + System.identityHashCode(this))}.
     * The generator is initialized and seeded on first use.</p>
     */
    public RandomDataGenerator() {try{__CLR4_4_111181118lb90padp.R.inc(47996);
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Construct a RandomDataGenerator using the supplied {@link RandomGenerator} as
     * the source of (non-secure) random data.
     *
     * @param rand the source of (non-secure) random data
     * (may be null, resulting in the default generator)
     */
    public RandomDataGenerator(RandomGenerator rand) {try{__CLR4_4_111181118lb90padp.R.inc(47997);
        __CLR4_4_111181118lb90padp.R.inc(47998);this.rand = rand;
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

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
    public String nextHexString(int len) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(47999);
        __CLR4_4_111181118lb90padp.R.inc(48000);if ((((len <= 0)&&(__CLR4_4_111181118lb90padp.R.iget(48001)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48002)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48003);throw new NotStrictlyPositiveException(LocalizedFormats.LENGTH, len);
        }

        // Get a random number generator
        }__CLR4_4_111181118lb90padp.R.inc(48004);RandomGenerator ran = getRandomGenerator();

        // Initialize output buffer
        __CLR4_4_111181118lb90padp.R.inc(48005);StringBuilder outBuffer = new StringBuilder();

        // Get int(len/2)+1 random bytes
        __CLR4_4_111181118lb90padp.R.inc(48006);byte[] randomBytes = new byte[(len / 2) + 1];
        __CLR4_4_111181118lb90padp.R.inc(48007);ran.nextBytes(randomBytes);

        // Convert each byte to 2 hex digits
        __CLR4_4_111181118lb90padp.R.inc(48008);for (int i = 0; (((i < randomBytes.length)&&(__CLR4_4_111181118lb90padp.R.iget(48009)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48010)==0&false)); i++) {{
            __CLR4_4_111181118lb90padp.R.inc(48011);Integer c = Integer.valueOf(randomBytes[i]);

            /*
             * Add 128 to byte value to make interval 0-255 before doing hex
             * conversion. This guarantees <= 2 hex digits from toHexString()
             * toHexString would otherwise add 2^32 to negative arguments.
             */
            __CLR4_4_111181118lb90padp.R.inc(48012);String hex = Integer.toHexString(c.intValue() + 128);

            // Make sure we add 2 hex digits for each byte
            __CLR4_4_111181118lb90padp.R.inc(48013);if ((((hex.length() == 1)&&(__CLR4_4_111181118lb90padp.R.iget(48014)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48015)==0&false))) {{
                __CLR4_4_111181118lb90padp.R.inc(48016);hex = "0" + hex;
            }
            }__CLR4_4_111181118lb90padp.R.inc(48017);outBuffer.append(hex);
        }
        }__CLR4_4_111181118lb90padp.R.inc(48018);return outBuffer.toString().substring(0, len);
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int nextInt(final int lower, final int upper) throws NumberIsTooLargeException {try{__CLR4_4_111181118lb90padp.R.inc(48019);
        __CLR4_4_111181118lb90padp.R.inc(48020);return new UniformIntegerDistribution(getRandomGenerator(), lower, upper).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /** {@inheritDoc} */
    public long nextLong(final long lower, final long upper) throws NumberIsTooLargeException {try{__CLR4_4_111181118lb90padp.R.inc(48021);
        __CLR4_4_111181118lb90padp.R.inc(48022);if ((((lower >= upper)&&(__CLR4_4_111181118lb90padp.R.iget(48023)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48024)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48025);throw new NumberIsTooLargeException(LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND,
                                                lower, upper, false);
        }
        }__CLR4_4_111181118lb90padp.R.inc(48026);final long max = (upper - lower) + 1;
        __CLR4_4_111181118lb90padp.R.inc(48027);if ((((max <= 0)&&(__CLR4_4_111181118lb90padp.R.iget(48028)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48029)==0&false))) {{
            // the range is too wide to fit in a positive long (larger than 2^63); as it covers
            // more than half the long range, we use directly a simple rejection method
            __CLR4_4_111181118lb90padp.R.inc(48030);final RandomGenerator rng = getRandomGenerator();
            __CLR4_4_111181118lb90padp.R.inc(48031);while (true) {{
                __CLR4_4_111181118lb90padp.R.inc(48032);final long r = rng.nextLong();
                __CLR4_4_111181118lb90padp.R.inc(48033);if ((((r >= lower && r <= upper)&&(__CLR4_4_111181118lb90padp.R.iget(48034)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48035)==0&false))) {{
                    __CLR4_4_111181118lb90padp.R.inc(48036);return r;
                }
            }}
        }} }else {__CLR4_4_111181118lb90padp.R.inc(48037);if ((((max < Integer.MAX_VALUE)&&(__CLR4_4_111181118lb90padp.R.iget(48038)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48039)==0&false))){{
            // we can shift the range and generate directly a positive int
            __CLR4_4_111181118lb90padp.R.inc(48040);return lower + getRandomGenerator().nextInt((int) max);
        } }else {{
            // we can shift the range and generate directly a positive long
            __CLR4_4_111181118lb90padp.R.inc(48041);return lower + nextLong(getRandomGenerator(), max);
        }
    }}}finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Returns a pseudorandom, uniformly distributed <tt>long</tt> value
     * between 0 (inclusive) and the specified value (exclusive), drawn from
     * this random number generator's sequence.
     *
     * @param rng random generator to use
     * @param n the bound on the random number to be returned.  Must be
     * positive.
     * @return  a pseudorandom, uniformly distributed <tt>long</tt>
     * value between 0 (inclusive) and n (exclusive).
     * @throws IllegalArgumentException  if n is not positive.
     */
    private static long nextLong(final RandomGenerator rng, final long n) throws IllegalArgumentException {try{__CLR4_4_111181118lb90padp.R.inc(48042);
        __CLR4_4_111181118lb90padp.R.inc(48043);if ((((n > 0)&&(__CLR4_4_111181118lb90padp.R.iget(48044)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48045)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48046);final byte[] byteArray = new byte[8];
            __CLR4_4_111181118lb90padp.R.inc(48047);long bits;
            __CLR4_4_111181118lb90padp.R.inc(48048);long val;
            __CLR4_4_111181118lb90padp.R.inc(48049);do {{
                __CLR4_4_111181118lb90padp.R.inc(48050);rng.nextBytes(byteArray);
                __CLR4_4_111181118lb90padp.R.inc(48051);bits = 0;
                __CLR4_4_111181118lb90padp.R.inc(48052);for (final byte b : byteArray) {{
                    __CLR4_4_111181118lb90padp.R.inc(48053);bits = (bits << 8) | (((long) b) & 0xffL);
                }
                }__CLR4_4_111181118lb90padp.R.inc(48054);bits = bits & 0x7fffffffffffffffL;
                __CLR4_4_111181118lb90padp.R.inc(48055);val  = bits % n;
            } }while ((((bits - val + (n - 1) < 0)&&(__CLR4_4_111181118lb90padp.R.iget(48056)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48057)==0&false)));
            __CLR4_4_111181118lb90padp.R.inc(48058);return val;
        }
        }__CLR4_4_111181118lb90padp.R.inc(48059);throw new NotStrictlyPositiveException(n);
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

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
     * @throws NotStrictlyPositiveException if {@code len <= 0}
     */
    public String nextSecureHexString(int len) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48060);
        __CLR4_4_111181118lb90padp.R.inc(48061);if ((((len <= 0)&&(__CLR4_4_111181118lb90padp.R.iget(48062)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48063)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48064);throw new NotStrictlyPositiveException(LocalizedFormats.LENGTH, len);
        }

        // Get SecureRandom and setup Digest provider
        }__CLR4_4_111181118lb90padp.R.inc(48065);final RandomGenerator secRan = getSecRan();
        __CLR4_4_111181118lb90padp.R.inc(48066);MessageDigest alg = null;
        __CLR4_4_111181118lb90padp.R.inc(48067);try {
            __CLR4_4_111181118lb90padp.R.inc(48068);alg = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException ex) {
            // this should never happen
            __CLR4_4_111181118lb90padp.R.inc(48069);throw new MathInternalError(ex);
        }
        __CLR4_4_111181118lb90padp.R.inc(48070);alg.reset();

        // Compute number of iterations required (40 bytes each)
        __CLR4_4_111181118lb90padp.R.inc(48071);int numIter = (len / 40) + 1;

        __CLR4_4_111181118lb90padp.R.inc(48072);StringBuilder outBuffer = new StringBuilder();
        __CLR4_4_111181118lb90padp.R.inc(48073);for (int iter = 1; (((iter < numIter + 1)&&(__CLR4_4_111181118lb90padp.R.iget(48074)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48075)==0&false)); iter++) {{
            __CLR4_4_111181118lb90padp.R.inc(48076);byte[] randomBytes = new byte[40];
            __CLR4_4_111181118lb90padp.R.inc(48077);secRan.nextBytes(randomBytes);
            __CLR4_4_111181118lb90padp.R.inc(48078);alg.update(randomBytes);

            // Compute hash -- will create 20-byte binary hash
            __CLR4_4_111181118lb90padp.R.inc(48079);byte[] hash = alg.digest();

            // Loop over the hash, converting each byte to 2 hex digits
            __CLR4_4_111181118lb90padp.R.inc(48080);for (int i = 0; (((i < hash.length)&&(__CLR4_4_111181118lb90padp.R.iget(48081)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48082)==0&false)); i++) {{
                __CLR4_4_111181118lb90padp.R.inc(48083);Integer c = Integer.valueOf(hash[i]);

                /*
                 * Add 128 to byte value to make interval 0-255 This guarantees
                 * <= 2 hex digits from toHexString() toHexString would
                 * otherwise add 2^32 to negative arguments
                 */
                __CLR4_4_111181118lb90padp.R.inc(48084);String hex = Integer.toHexString(c.intValue() + 128);

                // Keep strings uniform length -- guarantees 40 bytes
                __CLR4_4_111181118lb90padp.R.inc(48085);if ((((hex.length() == 1)&&(__CLR4_4_111181118lb90padp.R.iget(48086)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48087)==0&false))) {{
                    __CLR4_4_111181118lb90padp.R.inc(48088);hex = "0" + hex;
                }
                }__CLR4_4_111181118lb90padp.R.inc(48089);outBuffer.append(hex);
            }
        }}
        }__CLR4_4_111181118lb90padp.R.inc(48090);return outBuffer.toString().substring(0, len);
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**  {@inheritDoc} */
    public int nextSecureInt(final int lower, final int upper) throws NumberIsTooLargeException {try{__CLR4_4_111181118lb90padp.R.inc(48091);
        __CLR4_4_111181118lb90padp.R.inc(48092);return new UniformIntegerDistribution(getSecRan(), lower, upper).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /** {@inheritDoc} */
    public long nextSecureLong(final long lower, final long upper) throws NumberIsTooLargeException {try{__CLR4_4_111181118lb90padp.R.inc(48093);
        __CLR4_4_111181118lb90padp.R.inc(48094);if ((((lower >= upper)&&(__CLR4_4_111181118lb90padp.R.iget(48095)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48096)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48097);throw new NumberIsTooLargeException(LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND,
                                                lower, upper, false);
        }
        }__CLR4_4_111181118lb90padp.R.inc(48098);final RandomGenerator rng = getSecRan();
        __CLR4_4_111181118lb90padp.R.inc(48099);final long max = (upper - lower) + 1;
        __CLR4_4_111181118lb90padp.R.inc(48100);if ((((max <= 0)&&(__CLR4_4_111181118lb90padp.R.iget(48101)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48102)==0&false))) {{
            // the range is too wide to fit in a positive long (larger than 2^63); as it covers
            // more than half the long range, we use directly a simple rejection method
            __CLR4_4_111181118lb90padp.R.inc(48103);while (true) {{
                __CLR4_4_111181118lb90padp.R.inc(48104);final long r = rng.nextLong();
                __CLR4_4_111181118lb90padp.R.inc(48105);if ((((r >= lower && r <= upper)&&(__CLR4_4_111181118lb90padp.R.iget(48106)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48107)==0&false))) {{
                    __CLR4_4_111181118lb90padp.R.inc(48108);return r;
                }
            }}
        }} }else {__CLR4_4_111181118lb90padp.R.inc(48109);if ((((max < Integer.MAX_VALUE)&&(__CLR4_4_111181118lb90padp.R.iget(48110)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48111)==0&false))){{
            // we can shift the range and generate directly a positive int
            __CLR4_4_111181118lb90padp.R.inc(48112);return lower + rng.nextInt((int) max);
        } }else {{
            // we can shift the range and generate directly a positive long
            __CLR4_4_111181118lb90padp.R.inc(48113);return lower + nextLong(rng, max);
        }
    }}}finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

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
     * @throws NotStrictlyPositiveException if {@code len <= 0}
     */
    public long nextPoisson(double mean) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48114);
        __CLR4_4_111181118lb90padp.R.inc(48115);return new PoissonDistribution(getRandomGenerator(), mean,
                PoissonDistribution.DEFAULT_EPSILON,
                PoissonDistribution.DEFAULT_MAX_ITERATIONS).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double nextGaussian(double mu, double sigma) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48116);
        __CLR4_4_111181118lb90padp.R.inc(48117);if ((((sigma <= 0)&&(__CLR4_4_111181118lb90padp.R.iget(48118)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48119)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48120);throw new NotStrictlyPositiveException(LocalizedFormats.STANDARD_DEVIATION, sigma);
        }
        }__CLR4_4_111181118lb90padp.R.inc(48121);return sigma * getRandomGenerator().nextGaussian() + mu;
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

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
    public double nextExponential(double mean) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48122);
        __CLR4_4_111181118lb90padp.R.inc(48123);return new ExponentialDistribution(getRandomGenerator(), mean,
                ExponentialDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

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
     */
    public double nextGamma(double shape, double scale) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48124);
        __CLR4_4_111181118lb90padp.R.inc(48125);return new GammaDistribution(getRandomGenerator(),shape, scale,
                GammaDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link HypergeometricDistribution Hypergeometric Distribution}.
     *
     * @param populationSize the population size of the Hypergeometric distribution
     * @param numberOfSuccesses number of successes in the population of the Hypergeometric distribution
     * @param sampleSize the sample size of the Hypergeometric distribution
     * @return random value sampled from the Hypergeometric(numberOfSuccesses, sampleSize) distribution
     * @throws NumberIsTooLargeException  if {@code numberOfSuccesses > populationSize},
     * or {@code sampleSize > populationSize}.
     * @throws NotStrictlyPositiveException if {@code populationSize <= 0}.
     * @throws NotPositiveException  if {@code numberOfSuccesses < 0}.
     */
    public int nextHypergeometric(int populationSize, int numberOfSuccesses, int sampleSize) throws NotPositiveException, NotStrictlyPositiveException, NumberIsTooLargeException {try{__CLR4_4_111181118lb90padp.R.inc(48126);
        __CLR4_4_111181118lb90padp.R.inc(48127);return new HypergeometricDistribution(getRandomGenerator(),populationSize,
                numberOfSuccesses, sampleSize).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link PascalDistribution Pascal Distribution}.
     *
     * @param r the number of successes of the Pascal distribution
     * @param p the probability of success of the Pascal distribution
     * @return random value sampled from the Pascal(r, p) distribution
     * @throws NotStrictlyPositiveException if the number of successes is not positive
     * @throws OutOfRangeException if the probability of success is not in the
     * range {@code [0, 1]}.
     */
    public int nextPascal(int r, double p) throws NotStrictlyPositiveException, OutOfRangeException {try{__CLR4_4_111181118lb90padp.R.inc(48128);
        __CLR4_4_111181118lb90padp.R.inc(48129);return new PascalDistribution(getRandomGenerator(), r, p).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link TDistribution T Distribution}.
     *
     * @param df the degrees of freedom of the T distribution
     * @return random value from the T(df) distribution
     * @throws NotStrictlyPositiveException if {@code df <= 0}
     */
    public double nextT(double df) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48130);
        __CLR4_4_111181118lb90padp.R.inc(48131);return new TDistribution(getRandomGenerator(), df,
                TDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link WeibullDistribution Weibull Distribution}.
     *
     * @param shape the shape parameter of the Weibull distribution
     * @param scale the scale parameter of the Weibull distribution
     * @return random value sampled from the Weibull(shape, size) distribution
     * @throws NotStrictlyPositiveException if {@code shape <= 0} or
     * {@code scale <= 0}.
     */
    public double nextWeibull(double shape, double scale) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48132);
        __CLR4_4_111181118lb90padp.R.inc(48133);return new WeibullDistribution(getRandomGenerator(), shape, scale,
                WeibullDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link ZipfDistribution Zipf Distribution}.
     *
     * @param numberOfElements the number of elements of the ZipfDistribution
     * @param exponent the exponent of the ZipfDistribution
     * @return random value sampled from the Zipf(numberOfElements, exponent) distribution
     * @exception NotStrictlyPositiveException if {@code numberOfElements <= 0}
     * or {@code exponent <= 0}.
     */
    public int nextZipf(int numberOfElements, double exponent) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48134);
        __CLR4_4_111181118lb90padp.R.inc(48135);return new ZipfDistribution(getRandomGenerator(), numberOfElements, exponent).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link BetaDistribution Beta Distribution}.
     *
     * @param alpha first distribution shape parameter
     * @param beta second distribution shape parameter
     * @return random value sampled from the beta(alpha, beta) distribution
     */
    public double nextBeta(double alpha, double beta) {try{__CLR4_4_111181118lb90padp.R.inc(48136);
        __CLR4_4_111181118lb90padp.R.inc(48137);return new BetaDistribution(getRandomGenerator(), alpha, beta,
                BetaDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link BinomialDistribution Binomial Distribution}.
     *
     * @param numberOfTrials number of trials of the Binomial distribution
     * @param probabilityOfSuccess probability of success of the Binomial distribution
     * @return random value sampled from the Binomial(numberOfTrials, probabilityOfSuccess) distribution
     */
    public int nextBinomial(int numberOfTrials, double probabilityOfSuccess) {try{__CLR4_4_111181118lb90padp.R.inc(48138);
        __CLR4_4_111181118lb90padp.R.inc(48139);return new BinomialDistribution(getRandomGenerator(), numberOfTrials, probabilityOfSuccess).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link CauchyDistribution Cauchy Distribution}.
     *
     * @param median the median of the Cauchy distribution
     * @param scale the scale parameter of the Cauchy distribution
     * @return random value sampled from the Cauchy(median, scale) distribution
     */
    public double nextCauchy(double median, double scale) {try{__CLR4_4_111181118lb90padp.R.inc(48140);
        __CLR4_4_111181118lb90padp.R.inc(48141);return new CauchyDistribution(getRandomGenerator(), median, scale,
                CauchyDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link ChiSquaredDistribution ChiSquare Distribution}.
     *
     * @param df the degrees of freedom of the ChiSquare distribution
     * @return random value sampled from the ChiSquare(df) distribution
     */
    public double nextChiSquare(double df) {try{__CLR4_4_111181118lb90padp.R.inc(48142);
        __CLR4_4_111181118lb90padp.R.inc(48143);return new ChiSquaredDistribution(getRandomGenerator(), df,
                ChiSquaredDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Generates a random value from the {@link FDistribution F Distribution}.
     *
     * @param numeratorDf the numerator degrees of freedom of the F distribution
     * @param denominatorDf the denominator degrees of freedom of the F distribution
     * @return random value sampled from the F(numeratorDf, denominatorDf) distribution
     * @throws NotStrictlyPositiveException if
     * {@code numeratorDf <= 0} or {@code denominatorDf <= 0}.
     */
    public double nextF(double numeratorDf, double denominatorDf) throws NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48144);
        __CLR4_4_111181118lb90padp.R.inc(48145);return new FDistribution(getRandomGenerator(), numeratorDf, denominatorDf,
                FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>
     * <strong>Algorithm Description</strong>: scales the output of
     * Random.nextDouble(), but rejects 0 values (i.e., will generate another
     * random double if Random.nextDouble() returns 0). This is necessary to
     * provide a symmetric output interval (both endpoints excluded).
     * </p>
     * @throws NumberIsTooLargeException if {@code lower >= upper}
     * @throws NotFiniteNumberException if one of the bounds is infinite
     * @throws NotANumberException if one of the bounds is NaN
     */
    public double nextUniform(double lower, double upper)
        throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException {try{__CLR4_4_111181118lb90padp.R.inc(48146);
        __CLR4_4_111181118lb90padp.R.inc(48147);return nextUniform(lower, upper, false);
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

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
     *
     * @throws NumberIsTooLargeException if {@code lower >= upper}
     * @throws NotFiniteNumberException if one of the bounds is infinite
     * @throws NotANumberException if one of the bounds is NaN
     */
    public double nextUniform(double lower, double upper, boolean lowerInclusive)
        throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException {try{__CLR4_4_111181118lb90padp.R.inc(48148);

        __CLR4_4_111181118lb90padp.R.inc(48149);if ((((lower >= upper)&&(__CLR4_4_111181118lb90padp.R.iget(48150)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48151)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48152);throw new NumberIsTooLargeException(LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND,
                                                lower, upper, false);
        }

        }__CLR4_4_111181118lb90padp.R.inc(48153);if ((((Double.isInfinite(lower))&&(__CLR4_4_111181118lb90padp.R.iget(48154)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48155)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48156);throw new NotFiniteNumberException(LocalizedFormats.INFINITE_BOUND, lower);
        }
        }__CLR4_4_111181118lb90padp.R.inc(48157);if ((((Double.isInfinite(upper))&&(__CLR4_4_111181118lb90padp.R.iget(48158)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48159)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48160);throw new NotFiniteNumberException(LocalizedFormats.INFINITE_BOUND, upper);
        }

        }__CLR4_4_111181118lb90padp.R.inc(48161);if ((((Double.isNaN(lower) || Double.isNaN(upper))&&(__CLR4_4_111181118lb90padp.R.iget(48162)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48163)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48164);throw new NotANumberException();
        }

        }__CLR4_4_111181118lb90padp.R.inc(48165);final RandomGenerator generator = getRandomGenerator();

        // ensure nextDouble() isn't 0.0
        __CLR4_4_111181118lb90padp.R.inc(48166);double u = generator.nextDouble();
        __CLR4_4_111181118lb90padp.R.inc(48167);while ((((!lowerInclusive && u <= 0.0)&&(__CLR4_4_111181118lb90padp.R.iget(48168)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48169)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48170);u = generator.nextDouble();
        }

        }__CLR4_4_111181118lb90padp.R.inc(48171);return u * upper + (1.0 - u) * lower;
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * This method calls {@link MathArrays#shuffle(int[],RandomGenerator)
     * MathArrays.shuffle} in order to create a random shuffle of the set
     * of natural numbers {@code { 0, 1, ..., n - 1 }}.
     *
     * @throws NumberIsTooLargeException if {@code k > n}.
     * @throws NotStrictlyPositiveException if {@code k <= 0}.
     */
    public int[] nextPermutation(int n, int k)
        throws NumberIsTooLargeException, NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48172);
        __CLR4_4_111181118lb90padp.R.inc(48173);if ((((k > n)&&(__CLR4_4_111181118lb90padp.R.iget(48174)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48175)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48176);throw new NumberIsTooLargeException(LocalizedFormats.PERMUTATION_EXCEEDS_N,
                                                k, n, true);
        }
        }__CLR4_4_111181118lb90padp.R.inc(48177);if ((((k <= 0)&&(__CLR4_4_111181118lb90padp.R.iget(48178)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48179)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48180);throw new NotStrictlyPositiveException(LocalizedFormats.PERMUTATION_SIZE,
                                                   k);
        }

        }__CLR4_4_111181118lb90padp.R.inc(48181);int[] index = getNatural(n);
        __CLR4_4_111181118lb90padp.R.inc(48182);MathArrays.shuffle(index, getRandomGenerator());

        // Return a new array containing the first "k" entries of "index".
        __CLR4_4_111181118lb90padp.R.inc(48183);return MathArrays.copyOf(index, k);
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * This method calls {@link #nextPermutation(int,int) nextPermutation(c.size(), k)}
     * in order to sample the collection.
     */
    public Object[] nextSample(Collection<?> c, int k) throws NumberIsTooLargeException, NotStrictlyPositiveException {try{__CLR4_4_111181118lb90padp.R.inc(48184);

        __CLR4_4_111181118lb90padp.R.inc(48185);int len = c.size();
        __CLR4_4_111181118lb90padp.R.inc(48186);if ((((k > len)&&(__CLR4_4_111181118lb90padp.R.iget(48187)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48188)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48189);throw new NumberIsTooLargeException(LocalizedFormats.SAMPLE_SIZE_EXCEEDS_COLLECTION_SIZE,
                                                k, len, true);
        }
        }__CLR4_4_111181118lb90padp.R.inc(48190);if ((((k <= 0)&&(__CLR4_4_111181118lb90padp.R.iget(48191)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48192)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48193);throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES, k);
        }

        }__CLR4_4_111181118lb90padp.R.inc(48194);Object[] objects = c.toArray();
        __CLR4_4_111181118lb90padp.R.inc(48195);int[] index = nextPermutation(len, k);
        __CLR4_4_111181118lb90padp.R.inc(48196);Object[] result = new Object[k];
        __CLR4_4_111181118lb90padp.R.inc(48197);for (int i = 0; (((i < k)&&(__CLR4_4_111181118lb90padp.R.iget(48198)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48199)==0&false)); i++) {{
            __CLR4_4_111181118lb90padp.R.inc(48200);result[i] = objects[index[i]];
        }
        }__CLR4_4_111181118lb90padp.R.inc(48201);return result;
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}



    /**
     * Reseeds the random number generator with the supplied seed.
     * <p>
     * Will create and initialize if null.
     * </p>
     *
     * @param seed the seed value to use
     */
    public void reSeed(long seed) {try{__CLR4_4_111181118lb90padp.R.inc(48202);
       __CLR4_4_111181118lb90padp.R.inc(48203);getRandomGenerator().setSeed(seed);
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Reseeds the secure random number generator with the current time in
     * milliseconds.
     * <p>
     * Will create and initialize if null.
     * </p>
     */
    public void reSeedSecure() {try{__CLR4_4_111181118lb90padp.R.inc(48204);
        __CLR4_4_111181118lb90padp.R.inc(48205);getSecRan().setSeed(System.currentTimeMillis());
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Reseeds the secure random number generator with the supplied seed.
     * <p>
     * Will create and initialize if null.
     * </p>
     *
     * @param seed the seed value to use
     */
    public void reSeedSecure(long seed) {try{__CLR4_4_111181118lb90padp.R.inc(48206);
        __CLR4_4_111181118lb90padp.R.inc(48207);getSecRan().setSeed(seed);
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Reseeds the random number generator with
     * {@code System.currentTimeMillis() + System.identityHashCode(this))}.
     */
    public void reSeed() {try{__CLR4_4_111181118lb90padp.R.inc(48208);
        __CLR4_4_111181118lb90padp.R.inc(48209);getRandomGenerator().setSeed(System.currentTimeMillis() + System.identityHashCode(this));
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

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
     * @param algorithm the name of the PRNG algorithm
     * @param provider the name of the provider
     * @throws NoSuchAlgorithmException if the specified algorithm is not available
     * @throws NoSuchProviderException if the specified provider is not installed
     */
    public void setSecureAlgorithm(String algorithm, String provider)
            throws NoSuchAlgorithmException, NoSuchProviderException {try{__CLR4_4_111181118lb90padp.R.inc(48210);
        __CLR4_4_111181118lb90padp.R.inc(48211);secRand = RandomGeneratorFactory.createRandomGenerator(SecureRandom.getInstance(algorithm, provider));
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Returns the RandomGenerator used to generate non-secure random data.
     * <p>
     * Creates and initializes a default generator if null. Uses a {@link Well19937c}
     * generator with {@code System.currentTimeMillis() + System.identityHashCode(this))}
     * as the default seed.
     * </p>
     *
     * @return the Random used to generate random data
     * @since 3.2
     */
    public RandomGenerator getRandomGenerator() {try{__CLR4_4_111181118lb90padp.R.inc(48212);
        __CLR4_4_111181118lb90padp.R.inc(48213);if ((((rand == null)&&(__CLR4_4_111181118lb90padp.R.iget(48214)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48215)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48216);initRan();
        }
        }__CLR4_4_111181118lb90padp.R.inc(48217);return rand;
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Sets the default generator to a {@link Well19937c} generator seeded with
     * {@code System.currentTimeMillis() + System.identityHashCode(this))}.
     */
    private void initRan() {try{__CLR4_4_111181118lb90padp.R.inc(48218);
        __CLR4_4_111181118lb90padp.R.inc(48219);rand = new Well19937c(System.currentTimeMillis() + System.identityHashCode(this));
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Returns the SecureRandom used to generate secure random data.
     * <p>
     * Creates and initializes if null.  Uses
     * {@code System.currentTimeMillis() + System.identityHashCode(this)} as the default seed.
     * </p>
     *
     * @return the SecureRandom used to generate secure random data, wrapped in a
     * {@link RandomGenerator}.
     */
    private RandomGenerator getSecRan() {try{__CLR4_4_111181118lb90padp.R.inc(48220);
        __CLR4_4_111181118lb90padp.R.inc(48221);if ((((secRand == null)&&(__CLR4_4_111181118lb90padp.R.iget(48222)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48223)==0&false))) {{
            __CLR4_4_111181118lb90padp.R.inc(48224);secRand = RandomGeneratorFactory.createRandomGenerator(new SecureRandom());
            __CLR4_4_111181118lb90padp.R.inc(48225);secRand.setSeed(System.currentTimeMillis() + System.identityHashCode(this));
        }
        }__CLR4_4_111181118lb90padp.R.inc(48226);return secRand;
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}

    /**
     * Returns an array representing n.
     *
     * @param n the natural number to represent
     * @return array with entries = elements of n
     */
    private int[] getNatural(int n) {try{__CLR4_4_111181118lb90padp.R.inc(48227);
        __CLR4_4_111181118lb90padp.R.inc(48228);int[] natural = new int[n];
        __CLR4_4_111181118lb90padp.R.inc(48229);for (int i = 0; (((i < n)&&(__CLR4_4_111181118lb90padp.R.iget(48230)!=0|true))||(__CLR4_4_111181118lb90padp.R.iget(48231)==0&false)); i++) {{
            __CLR4_4_111181118lb90padp.R.inc(48232);natural[i] = i;
        }
        }__CLR4_4_111181118lb90padp.R.inc(48233);return natural;
    }finally{__CLR4_4_111181118lb90padp.R.flushNeeded();}}
}
