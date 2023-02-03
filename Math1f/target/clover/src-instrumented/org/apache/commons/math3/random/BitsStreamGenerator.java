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

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.FastMath;

/** Base class for random number generators that generates bits streams.
 *
 * @version $Id$
 * @since 2.0
 */
public abstract class BitsStreamGenerator
    implements RandomGenerator,
               Serializable {public static class __CLR4_4_110h410h4lb90paa5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47353,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier */
    private static final long serialVersionUID = 20130104L;
    /** Next gaussian. */
    private double nextGaussian;

    /**
     * Creates a new random number generator.
     */
    public BitsStreamGenerator() {try{__CLR4_4_110h410h4lb90paa5.R.inc(47272);
        __CLR4_4_110h410h4lb90paa5.R.inc(47273);nextGaussian = Double.NaN;
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public abstract void setSeed(int seed);

    /** {@inheritDoc} */
    public abstract void setSeed(int[] seed);

    /** {@inheritDoc} */
    public abstract void setSeed(long seed);

    /** Generate next pseudorandom number.
     * <p>This method is the core generation algorithm. It is used by all the
     * public generation methods for the various primitive types {@link
     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},
     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},
     * {@link #next(int)} and {@link #nextLong()}.</p>
     * @param bits number of random bits to produce
     * @return random bits generated
     */
    protected abstract int next(int bits);

    /** {@inheritDoc} */
    public boolean nextBoolean() {try{__CLR4_4_110h410h4lb90paa5.R.inc(47274);
        __CLR4_4_110h410h4lb90paa5.R.inc(47275);return next(1) != 0;
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void nextBytes(byte[] bytes) {try{__CLR4_4_110h410h4lb90paa5.R.inc(47276);
        __CLR4_4_110h410h4lb90paa5.R.inc(47277);int i = 0;
        __CLR4_4_110h410h4lb90paa5.R.inc(47278);final int iEnd = bytes.length - 3;
        __CLR4_4_110h410h4lb90paa5.R.inc(47279);while ((((i < iEnd)&&(__CLR4_4_110h410h4lb90paa5.R.iget(47280)!=0|true))||(__CLR4_4_110h410h4lb90paa5.R.iget(47281)==0&false))) {{
            __CLR4_4_110h410h4lb90paa5.R.inc(47282);final int random = next(32);
            __CLR4_4_110h410h4lb90paa5.R.inc(47283);bytes[i]     = (byte) (random & 0xff);
            __CLR4_4_110h410h4lb90paa5.R.inc(47284);bytes[i + 1] = (byte) ((random >>  8) & 0xff);
            __CLR4_4_110h410h4lb90paa5.R.inc(47285);bytes[i + 2] = (byte) ((random >> 16) & 0xff);
            __CLR4_4_110h410h4lb90paa5.R.inc(47286);bytes[i + 3] = (byte) ((random >> 24) & 0xff);
            __CLR4_4_110h410h4lb90paa5.R.inc(47287);i += 4;
        }
        }__CLR4_4_110h410h4lb90paa5.R.inc(47288);int random = next(32);
        __CLR4_4_110h410h4lb90paa5.R.inc(47289);while ((((i < bytes.length)&&(__CLR4_4_110h410h4lb90paa5.R.iget(47290)!=0|true))||(__CLR4_4_110h410h4lb90paa5.R.iget(47291)==0&false))) {{
            __CLR4_4_110h410h4lb90paa5.R.inc(47292);bytes[i++] = (byte) (random & 0xff);
            __CLR4_4_110h410h4lb90paa5.R.inc(47293);random     = random >> 8;
        }
    }}finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double nextDouble() {try{__CLR4_4_110h410h4lb90paa5.R.inc(47294);
        __CLR4_4_110h410h4lb90paa5.R.inc(47295);final long high = ((long) next(26)) << 26;
        __CLR4_4_110h410h4lb90paa5.R.inc(47296);final int  low  = next(26);
        __CLR4_4_110h410h4lb90paa5.R.inc(47297);return (high | low) * 0x1.0p-52d;
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float nextFloat() {try{__CLR4_4_110h410h4lb90paa5.R.inc(47298);
        __CLR4_4_110h410h4lb90paa5.R.inc(47299);return next(23) * 0x1.0p-23f;
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double nextGaussian() {try{__CLR4_4_110h410h4lb90paa5.R.inc(47300);

        __CLR4_4_110h410h4lb90paa5.R.inc(47301);final double random;
        __CLR4_4_110h410h4lb90paa5.R.inc(47302);if ((((Double.isNaN(nextGaussian))&&(__CLR4_4_110h410h4lb90paa5.R.iget(47303)!=0|true))||(__CLR4_4_110h410h4lb90paa5.R.iget(47304)==0&false))) {{
            // generate a new pair of gaussian numbers
            __CLR4_4_110h410h4lb90paa5.R.inc(47305);final double x = nextDouble();
            __CLR4_4_110h410h4lb90paa5.R.inc(47306);final double y = nextDouble();
            __CLR4_4_110h410h4lb90paa5.R.inc(47307);final double alpha = 2 * FastMath.PI * x;
            __CLR4_4_110h410h4lb90paa5.R.inc(47308);final double r      = FastMath.sqrt(-2 * FastMath.log(y));
            __CLR4_4_110h410h4lb90paa5.R.inc(47309);random       = r * FastMath.cos(alpha);
            __CLR4_4_110h410h4lb90paa5.R.inc(47310);nextGaussian = r * FastMath.sin(alpha);
        } }else {{
            // use the second element of the pair already generated
            __CLR4_4_110h410h4lb90paa5.R.inc(47311);random = nextGaussian;
            __CLR4_4_110h410h4lb90paa5.R.inc(47312);nextGaussian = Double.NaN;
        }

        }__CLR4_4_110h410h4lb90paa5.R.inc(47313);return random;

    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int nextInt() {try{__CLR4_4_110h410h4lb90paa5.R.inc(47314);
        __CLR4_4_110h410h4lb90paa5.R.inc(47315);return next(32);
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>This default implementation is copied from Apache Harmony
     * java.util.Random (r929253).</p>
     *
     * <p>Implementation notes: <ul>
     * <li>If n is a power of 2, this method returns
     * {@code (int) ((n * (long) next(31)) >> 31)}.</li>
     *
     * <li>If n is not a power of 2, what is returned is {@code next(31) % n}
     * with {@code next(31)} values rejected (i.e. regenerated) until a
     * value that is larger than the remainder of {@code Integer.MAX_VALUE / n}
     * is generated. Rejection of this initial segment is necessary to ensure
     * a uniform distribution.</li></ul></p>
     */
    public int nextInt(int n) throws IllegalArgumentException {try{__CLR4_4_110h410h4lb90paa5.R.inc(47316);
        __CLR4_4_110h410h4lb90paa5.R.inc(47317);if ((((n > 0)&&(__CLR4_4_110h410h4lb90paa5.R.iget(47318)!=0|true))||(__CLR4_4_110h410h4lb90paa5.R.iget(47319)==0&false))) {{
            __CLR4_4_110h410h4lb90paa5.R.inc(47320);if (((((n & -n) == n)&&(__CLR4_4_110h410h4lb90paa5.R.iget(47321)!=0|true))||(__CLR4_4_110h410h4lb90paa5.R.iget(47322)==0&false))) {{
                __CLR4_4_110h410h4lb90paa5.R.inc(47323);return (int) ((n * (long) next(31)) >> 31);
            }
            }__CLR4_4_110h410h4lb90paa5.R.inc(47324);int bits;
            __CLR4_4_110h410h4lb90paa5.R.inc(47325);int val;
            __CLR4_4_110h410h4lb90paa5.R.inc(47326);do {{
                __CLR4_4_110h410h4lb90paa5.R.inc(47327);bits = next(31);
                __CLR4_4_110h410h4lb90paa5.R.inc(47328);val = bits % n;
            } }while ((((bits - val + (n - 1) < 0)&&(__CLR4_4_110h410h4lb90paa5.R.iget(47329)!=0|true))||(__CLR4_4_110h410h4lb90paa5.R.iget(47330)==0&false)));
            __CLR4_4_110h410h4lb90paa5.R.inc(47331);return val;
        }
        }__CLR4_4_110h410h4lb90paa5.R.inc(47332);throw new NotStrictlyPositiveException(n);
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public long nextLong() {try{__CLR4_4_110h410h4lb90paa5.R.inc(47333);
        __CLR4_4_110h410h4lb90paa5.R.inc(47334);final long high  = ((long) next(32)) << 32;
        __CLR4_4_110h410h4lb90paa5.R.inc(47335);final long  low  = ((long) next(32)) & 0xffffffffL;
        __CLR4_4_110h410h4lb90paa5.R.inc(47336);return high | low;
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /**
     * Returns a pseudorandom, uniformly distributed <tt>long</tt> value
     * between 0 (inclusive) and the specified value (exclusive), drawn from
     * this random number generator's sequence.
     *
     * @param n the bound on the random number to be returned.  Must be
     * positive.
     * @return  a pseudorandom, uniformly distributed <tt>long</tt>
     * value between 0 (inclusive) and n (exclusive).
     * @throws IllegalArgumentException  if n is not positive.
     */
    public long nextLong(long n) throws IllegalArgumentException {try{__CLR4_4_110h410h4lb90paa5.R.inc(47337);
        __CLR4_4_110h410h4lb90paa5.R.inc(47338);if ((((n > 0)&&(__CLR4_4_110h410h4lb90paa5.R.iget(47339)!=0|true))||(__CLR4_4_110h410h4lb90paa5.R.iget(47340)==0&false))) {{
            __CLR4_4_110h410h4lb90paa5.R.inc(47341);long bits;
            __CLR4_4_110h410h4lb90paa5.R.inc(47342);long val;
            __CLR4_4_110h410h4lb90paa5.R.inc(47343);do {{
                __CLR4_4_110h410h4lb90paa5.R.inc(47344);bits = ((long) next(31)) << 32;
                __CLR4_4_110h410h4lb90paa5.R.inc(47345);bits = bits | (((long) next(32)) & 0xffffffffL);
                __CLR4_4_110h410h4lb90paa5.R.inc(47346);val  = bits % n;
            } }while ((((bits - val + (n - 1) < 0)&&(__CLR4_4_110h410h4lb90paa5.R.iget(47347)!=0|true))||(__CLR4_4_110h410h4lb90paa5.R.iget(47348)==0&false)));
            __CLR4_4_110h410h4lb90paa5.R.inc(47349);return val;
        }
        }__CLR4_4_110h410h4lb90paa5.R.inc(47350);throw new NotStrictlyPositiveException(n);
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

    /**
     * Clears the cache used by the default implementation of
     * {@link #nextGaussian}.
     */
    public void clear() {try{__CLR4_4_110h410h4lb90paa5.R.inc(47351);
        __CLR4_4_110h410h4lb90paa5.R.inc(47352);nextGaussian = Double.NaN;
    }finally{__CLR4_4_110h410h4lb90paa5.R.flushNeeded();}}

}
