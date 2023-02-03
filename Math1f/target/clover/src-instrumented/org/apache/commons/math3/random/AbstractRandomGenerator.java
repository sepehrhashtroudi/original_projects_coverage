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

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.FastMath;

/**
 * Abstract class implementing the {@link  RandomGenerator} interface.
 * Default implementations for all methods other than {@link #nextDouble()} and
 * {@link #setSeed(long)} are provided.
 * <p>
 * All data generation methods are based on {@code code nextDouble()}.
 * Concrete implementations <strong>must</strong> override
 * this method and <strong>should</strong> provide better / more
 * performant implementations of the other methods if the underlying PRNG
 * supplies them.</p>
 *
 * @since 1.1
 * @version $Id$
 */
public abstract class AbstractRandomGenerator implements RandomGenerator {public static class __CLR4_4_110dx10dxlb90pa9p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Cached random normal value.  The default implementation for
     * {@link #nextGaussian} generates pairs of values and this field caches the
     * second value so that the full algorithm is not executed for every
     * activation.  The value {@code Double.NaN} signals that there is
     * no cached value.  Use {@link #clear} to clear the cached value.
     */
    private double cachedNormalDeviate = Double.NaN;

    /**
     * Construct a RandomGenerator.
     */
    public AbstractRandomGenerator() {
        super();__CLR4_4_110dx10dxlb90pa9p.R.inc(47158);try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47157);

    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

    /**
     * Clears the cache used by the default implementation of
     * {@link #nextGaussian}. Implementations that do not override the
     * default implementation of {@code nextGaussian} should call this
     * method in the implementation of {@link #setSeed(long)}
     */
    public void clear() {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47159);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47160);cachedNormalDeviate = Double.NaN;
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSeed(int seed) {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47161);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47162);setSeed((long) seed);
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSeed(int[] seed) {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47163);
        // the following number is the largest prime that fits in 32 bits (it is 2^32 - 5)
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47164);final long prime = 4294967291l;

        __CLR4_4_110dx10dxlb90pa9p.R.inc(47165);long combined = 0l;
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47166);for (int s : seed) {{
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47167);combined = combined * prime + s;
        }
        }__CLR4_4_110dx10dxlb90pa9p.R.inc(47168);setSeed(combined);
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

    /**
     * Sets the seed of the underlying random number generator using a
     * {@code long} seed.  Sequences of values generated starting with the
     * same seeds should be identical.
     * <p>
     * Implementations that do not override the default implementation of
     * {@code nextGaussian} should include a call to {@link #clear} in the
     * implementation of this method.</p>
     *
     * @param seed the seed value
     */
    public abstract void setSeed(long seed);

    /**
     * Generates random bytes and places them into a user-supplied
     * byte array.  The number of random bytes produced is equal to
     * the length of the byte array.
     * <p>
     * The default implementation fills the array with bytes extracted from
     * random integers generated using {@link #nextInt}.</p>
     *
     * @param bytes the non-null byte array in which to put the
     * random bytes
     */
    public void nextBytes(byte[] bytes) {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47169);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47170);int bytesOut = 0;
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47171);while ((((bytesOut < bytes.length)&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47172)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47173)==0&false))) {{
          __CLR4_4_110dx10dxlb90pa9p.R.inc(47174);int randInt = nextInt();
          __CLR4_4_110dx10dxlb90pa9p.R.inc(47175);for (int i = 0; (((i < 3)&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47176)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47177)==0&false)); i++) {{
              __CLR4_4_110dx10dxlb90pa9p.R.inc(47178);if ( (((i > 0)&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47179)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47180)==0&false))) {{
                  __CLR4_4_110dx10dxlb90pa9p.R.inc(47181);randInt = randInt >> 8;
              }
              }__CLR4_4_110dx10dxlb90pa9p.R.inc(47182);bytes[bytesOut++] = (byte) randInt;
              __CLR4_4_110dx10dxlb90pa9p.R.inc(47183);if ((((bytesOut == bytes.length)&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47184)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47185)==0&false))) {{
                  __CLR4_4_110dx10dxlb90pa9p.R.inc(47186);return;
              }
          }}
        }}
    }}finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

     /**
     * Returns the next pseudorandom, uniformly distributed {@code int}
     * value from this random number generator's sequence.
     * All 2<font size="-1"><sup>32</sup></font> possible {@code int} values
     * should be produced with  (approximately) equal probability.
     * <p>
     * The default implementation provided here returns
     * <pre>
     * <code>(int) (nextDouble() * Integer.MAX_VALUE)</code>
     * </pre></p>
     *
     * @return the next pseudorandom, uniformly distributed {@code int}
     *  value from this random number generator's sequence
     */
    public int nextInt() {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47187);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47188);return (int) ((2d * nextDouble() - 1d) * Integer.MAX_VALUE);
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

    /**
     * Returns a pseudorandom, uniformly distributed {@code int} value
     * between 0 (inclusive) and the specified value (exclusive), drawn from
     * this random number generator's sequence.
     * <p>
     * The default implementation returns
     * <pre>
     * <code>(int) (nextDouble() * n</code>
     * </pre></p>
     *
     * @param n the bound on the random number to be returned.  Must be
     * positive.
     * @return  a pseudorandom, uniformly distributed {@code int}
     * value between 0 (inclusive) and n (exclusive).
     * @throws NotStrictlyPositiveException if {@code n <= 0}.
     */
    public int nextInt(int n) {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47189);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47190);if ((((n <= 0 )&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47191)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47192)==0&false))) {{
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47193);throw new NotStrictlyPositiveException(n);
        }
        }__CLR4_4_110dx10dxlb90pa9p.R.inc(47194);int result = (int) (nextDouble() * n);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47195);return (((result < n )&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47196)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47197)==0&false))? result : n - 1;
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

     /**
     * Returns the next pseudorandom, uniformly distributed {@code long}
     * value from this random number generator's sequence.  All
     * 2<font size="-1"><sup>64</sup></font> possible {@code long} values
     * should be produced with (approximately) equal probability.
     * <p>
     * The default implementation returns
     * <pre>
     * <code>(long) (nextDouble() * Long.MAX_VALUE)</code>
     * </pre></p>
     *
     * @return  the next pseudorandom, uniformly distributed {@code long}
     *value from this random number generator's sequence
     */
    public long nextLong() {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47198);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47199);return (long) ((2d * nextDouble() - 1d) * Long.MAX_VALUE);
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

    /**
     * Returns the next pseudorandom, uniformly distributed
     * {@code boolean} value from this random number generator's
     * sequence.
     * <p>
     * The default implementation returns
     * <pre>
     * <code>nextDouble() <= 0.5</code>
     * </pre></p>
     *
     * @return  the next pseudorandom, uniformly distributed
     * {@code boolean} value from this random number generator's
     * sequence
     */
    public boolean nextBoolean() {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47200);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47201);return nextDouble() <= 0.5;
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

     /**
     * Returns the next pseudorandom, uniformly distributed {@code float}
     * value between {@code 0.0} and {@code 1.0} from this random
     * number generator's sequence.
     * <p>
     * The default implementation returns
     * <pre>
     * <code>(float) nextDouble() </code>
     * </pre></p>
     *
     * @return  the next pseudorandom, uniformly distributed {@code float}
     * value between {@code 0.0} and {@code 1.0} from this
     * random number generator's sequence
     */
    public float nextFloat() {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47202);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47203);return (float) nextDouble();
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}

    /**
     * Returns the next pseudorandom, uniformly distributed
     * {@code double} value between {@code 0.0} and
     * {@code 1.0} from this random number generator's sequence.
     * <p>
     * This method provides the underlying source of random data used by the
     * other methods.</p>
     *
     * @return  the next pseudorandom, uniformly distributed
     *  {@code double} value between {@code 0.0} and
     *  {@code 1.0} from this random number generator's sequence
     */
    public abstract double nextDouble();

    /**
     * Returns the next pseudorandom, Gaussian ("normally") distributed
     * {@code double} value with mean {@code 0.0} and standard
     * deviation {@code 1.0} from this random number generator's sequence.
     * <p>
     * The default implementation uses the <em>Polar Method</em>
     * due to G.E.P. Box, M.E. Muller and G. Marsaglia, as described in
     * D. Knuth, <u>The Art of Computer Programming</u>, 3.4.1C.</p>
     * <p>
     * The algorithm generates a pair of independent random values.  One of
     * these is cached for reuse, so the full algorithm is not executed on each
     * activation.  Implementations that do not override this method should
     * make sure to call {@link #clear} to clear the cached value in the
     * implementation of {@link #setSeed(long)}.</p>
     *
     * @return  the next pseudorandom, Gaussian ("normally") distributed
     * {@code double} value with mean {@code 0.0} and
     * standard deviation {@code 1.0} from this random number
     *  generator's sequence
     */
    public double nextGaussian() {try{__CLR4_4_110dx10dxlb90pa9p.R.inc(47204);
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47205);if ((((!Double.isNaN(cachedNormalDeviate))&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47206)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47207)==0&false))) {{
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47208);double dev = cachedNormalDeviate;
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47209);cachedNormalDeviate = Double.NaN;
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47210);return dev;
        }
        }__CLR4_4_110dx10dxlb90pa9p.R.inc(47211);double v1 = 0;
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47212);double v2 = 0;
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47213);double s = 1;
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47214);while ((((s >=1 )&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47215)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47216)==0&false))) {{
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47217);v1 = 2 * nextDouble() - 1;
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47218);v2 = 2 * nextDouble() - 1;
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47219);s = v1 * v1 + v2 * v2;
        }
        }__CLR4_4_110dx10dxlb90pa9p.R.inc(47220);if ((((s != 0)&&(__CLR4_4_110dx10dxlb90pa9p.R.iget(47221)!=0|true))||(__CLR4_4_110dx10dxlb90pa9p.R.iget(47222)==0&false))) {{
            __CLR4_4_110dx10dxlb90pa9p.R.inc(47223);s = FastMath.sqrt(-2 * FastMath.log(s) / s);
        }
        }__CLR4_4_110dx10dxlb90pa9p.R.inc(47224);cachedNormalDeviate = v2 * s;
        __CLR4_4_110dx10dxlb90pa9p.R.inc(47225);return v1 * s;
    }finally{__CLR4_4_110dx10dxlb90pa9p.R.flushNeeded();}}
}
