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

import org.apache.commons.math3.util.FastMath;


/** This class implements a powerful pseudo-random number generator
 * developed by Makoto Matsumoto and Takuji Nishimura during
 * 1996-1997.

 * <p>This generator features an extremely long period
 * (2<sup>19937</sup>-1) and 623-dimensional equidistribution up to 32
 * bits accuracy. The home page for this generator is located at <a
 * href="http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/emt.html">
 * http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/emt.html</a>.</p>

 * <p>This generator is described in a paper by Makoto Matsumoto and
 * Takuji Nishimura in 1998: <a
 * href="http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/ARTICLES/mt.pdf">Mersenne
 * Twister: A 623-Dimensionally Equidistributed Uniform Pseudo-Random
 * Number Generator</a>, ACM Transactions on Modeling and Computer
 * Simulation, Vol. 8, No. 1, January 1998, pp 3--30</p>

 * <p>This class is mainly a Java port of the 2002-01-26 version of
 * the generator written in C by Makoto Matsumoto and Takuji
 * Nishimura. Here is their original copyright:</p>

 * <table border="0" width="80%" cellpadding="10" align="center" bgcolor="#E0E0E0">
 * <tr><td>Copyright (C) 1997 - 2002, Makoto Matsumoto and Takuji Nishimura,
 *     All rights reserved.</td></tr>

 * <tr><td>Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * <ol>
 *   <li>Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.</li>
 *   <li>Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.</li>
 *   <li>The names of its contributors may not be used to endorse or promote
 *       products derived from this software without specific prior written
 *       permission.</li>
 * </ol></td></tr>

 * <tr><td><strong>THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.</strong></td></tr>
 * </table>

 * @version $Id$
 * @since 2.0

 */
public class MersenneTwister extends BitsStreamGenerator implements Serializable {public static class __CLR4_4_110xd10xdlb90pacq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47959,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 8661194735290153518L;

    /** Size of the bytes pool. */
    private static final int   N     = 624;

    /** Period second parameter. */
    private static final int   M     = 397;

    /** X * MATRIX_A for X = {0, 1}. */
    private static final int[] MAG01 = { 0x0, 0x9908b0df };

    /** Bytes pool. */
    private int[] mt;

    /** Current index in the bytes pool. */
    private int   mti;

    /** Creates a new random number generator.
     * <p>The instance is initialized using the current time plus the
     * system identity hash code of this instance as the seed.</p>
     */
    public MersenneTwister() {try{__CLR4_4_110xd10xdlb90pacq.R.inc(47857);
        __CLR4_4_110xd10xdlb90pacq.R.inc(47858);mt = new int[N];
        __CLR4_4_110xd10xdlb90pacq.R.inc(47859);setSeed(System.currentTimeMillis() + System.identityHashCode(this));
    }finally{__CLR4_4_110xd10xdlb90pacq.R.flushNeeded();}}

    /** Creates a new random number generator using a single int seed.
     * @param seed the initial seed (32 bits integer)
     */
    public MersenneTwister(int seed) {try{__CLR4_4_110xd10xdlb90pacq.R.inc(47860);
        __CLR4_4_110xd10xdlb90pacq.R.inc(47861);mt = new int[N];
        __CLR4_4_110xd10xdlb90pacq.R.inc(47862);setSeed(seed);
    }finally{__CLR4_4_110xd10xdlb90pacq.R.flushNeeded();}}

    /** Creates a new random number generator using an int array seed.
     * @param seed the initial seed (32 bits integers array), if null
     * the seed of the generator will be related to the current time
     */
    public MersenneTwister(int[] seed) {try{__CLR4_4_110xd10xdlb90pacq.R.inc(47863);
        __CLR4_4_110xd10xdlb90pacq.R.inc(47864);mt = new int[N];
        __CLR4_4_110xd10xdlb90pacq.R.inc(47865);setSeed(seed);
    }finally{__CLR4_4_110xd10xdlb90pacq.R.flushNeeded();}}

    /** Creates a new random number generator using a single long seed.
     * @param seed the initial seed (64 bits integer)
     */
    public MersenneTwister(long seed) {try{__CLR4_4_110xd10xdlb90pacq.R.inc(47866);
        __CLR4_4_110xd10xdlb90pacq.R.inc(47867);mt = new int[N];
        __CLR4_4_110xd10xdlb90pacq.R.inc(47868);setSeed(seed);
    }finally{__CLR4_4_110xd10xdlb90pacq.R.flushNeeded();}}

    /** Reinitialize the generator as if just built with the given int seed.
     * <p>The state of the generator is exactly the same as a new
     * generator built with the same seed.</p>
     * @param seed the initial seed (32 bits integer)
     */
    @Override
    public void setSeed(int seed) {try{__CLR4_4_110xd10xdlb90pacq.R.inc(47869);
        // we use a long masked by 0xffffffffL as a poor man unsigned int
        __CLR4_4_110xd10xdlb90pacq.R.inc(47870);long longMT = seed;
        // NB: unlike original C code, we are working with java longs, the cast below makes masking unnecessary
        __CLR4_4_110xd10xdlb90pacq.R.inc(47871);mt[0]= (int) longMT;
        __CLR4_4_110xd10xdlb90pacq.R.inc(47872);for (mti = 1; (((mti < N)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47873)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47874)==0&false)); ++mti) {{
            // See Knuth TAOCP Vol2. 3rd Ed. P.106 for multiplier.
            // initializer from the 2002-01-09 C version by Makoto Matsumoto
            __CLR4_4_110xd10xdlb90pacq.R.inc(47875);longMT = (1812433253l * (longMT ^ (longMT >> 30)) + mti) & 0xffffffffL;
            __CLR4_4_110xd10xdlb90pacq.R.inc(47876);mt[mti]= (int) longMT;
        }

        }__CLR4_4_110xd10xdlb90pacq.R.inc(47877);clear(); // Clear normal deviate cache
    }finally{__CLR4_4_110xd10xdlb90pacq.R.flushNeeded();}}

    /** Reinitialize the generator as if just built with the given int array seed.
     * <p>The state of the generator is exactly the same as a new
     * generator built with the same seed.</p>
     * @param seed the initial seed (32 bits integers array), if null
     * the seed of the generator will be the current system time plus the
     * system identity hash code of this instance
     */
    @Override
    public void setSeed(int[] seed) {try{__CLR4_4_110xd10xdlb90pacq.R.inc(47878);

        __CLR4_4_110xd10xdlb90pacq.R.inc(47879);if ((((seed == null)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47880)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47881)==0&false))) {{
            __CLR4_4_110xd10xdlb90pacq.R.inc(47882);setSeed(System.currentTimeMillis() + System.identityHashCode(this));
            __CLR4_4_110xd10xdlb90pacq.R.inc(47883);return;
        }

        }__CLR4_4_110xd10xdlb90pacq.R.inc(47884);setSeed(19650218);
        __CLR4_4_110xd10xdlb90pacq.R.inc(47885);int i = 1;
        __CLR4_4_110xd10xdlb90pacq.R.inc(47886);int j = 0;

        __CLR4_4_110xd10xdlb90pacq.R.inc(47887);for (int k = FastMath.max(N, seed.length); (((k != 0)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47888)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47889)==0&false)); k--) {{
            __CLR4_4_110xd10xdlb90pacq.R.inc(47890);long l0 = (mt[i] & 0x7fffffffl)   | (((((mt[i]   < 0) )&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47891)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47892)==0&false))? 0x80000000l : 0x0l);
            __CLR4_4_110xd10xdlb90pacq.R.inc(47893);long l1 = (mt[i-1] & 0x7fffffffl) | (((((mt[i-1] < 0) )&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47894)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47895)==0&false))? 0x80000000l : 0x0l);
            __CLR4_4_110xd10xdlb90pacq.R.inc(47896);long l  = (l0 ^ ((l1 ^ (l1 >> 30)) * 1664525l)) + seed[j] + j; // non linear
            __CLR4_4_110xd10xdlb90pacq.R.inc(47897);mt[i]   = (int) (l & 0xffffffffl);
            __CLR4_4_110xd10xdlb90pacq.R.inc(47898);i++; __CLR4_4_110xd10xdlb90pacq.R.inc(47899);j++;
            __CLR4_4_110xd10xdlb90pacq.R.inc(47900);if ((((i >= N)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47901)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47902)==0&false))) {{
                __CLR4_4_110xd10xdlb90pacq.R.inc(47903);mt[0] = mt[N - 1];
                __CLR4_4_110xd10xdlb90pacq.R.inc(47904);i = 1;
            }
            }__CLR4_4_110xd10xdlb90pacq.R.inc(47905);if ((((j >= seed.length)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47906)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47907)==0&false))) {{
                __CLR4_4_110xd10xdlb90pacq.R.inc(47908);j = 0;
            }
        }}

        }__CLR4_4_110xd10xdlb90pacq.R.inc(47909);for (int k = N - 1; (((k != 0)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47910)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47911)==0&false)); k--) {{
            __CLR4_4_110xd10xdlb90pacq.R.inc(47912);long l0 = (mt[i] & 0x7fffffffl)   | (((((mt[i]   < 0) )&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47913)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47914)==0&false))? 0x80000000l : 0x0l);
            __CLR4_4_110xd10xdlb90pacq.R.inc(47915);long l1 = (mt[i-1] & 0x7fffffffl) | (((((mt[i-1] < 0) )&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47916)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47917)==0&false))? 0x80000000l : 0x0l);
            __CLR4_4_110xd10xdlb90pacq.R.inc(47918);long l  = (l0 ^ ((l1 ^ (l1 >> 30)) * 1566083941l)) - i; // non linear
            __CLR4_4_110xd10xdlb90pacq.R.inc(47919);mt[i]   = (int) (l & 0xffffffffL);
            __CLR4_4_110xd10xdlb90pacq.R.inc(47920);i++;
            __CLR4_4_110xd10xdlb90pacq.R.inc(47921);if ((((i >= N)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47922)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47923)==0&false))) {{
                __CLR4_4_110xd10xdlb90pacq.R.inc(47924);mt[0] = mt[N - 1];
                __CLR4_4_110xd10xdlb90pacq.R.inc(47925);i = 1;
            }
        }}

        }__CLR4_4_110xd10xdlb90pacq.R.inc(47926);mt[0] = 0x80000000; // MSB is 1; assuring non-zero initial array

        __CLR4_4_110xd10xdlb90pacq.R.inc(47927);clear(); // Clear normal deviate cache

    }finally{__CLR4_4_110xd10xdlb90pacq.R.flushNeeded();}}

    /** Reinitialize the generator as if just built with the given long seed.
     * <p>The state of the generator is exactly the same as a new
     * generator built with the same seed.</p>
     * @param seed the initial seed (64 bits integer)
     */
    @Override
    public void setSeed(long seed) {try{__CLR4_4_110xd10xdlb90pacq.R.inc(47928);
        __CLR4_4_110xd10xdlb90pacq.R.inc(47929);setSeed(new int[] { (int) (seed >>> 32), (int) (seed & 0xffffffffl) });
    }finally{__CLR4_4_110xd10xdlb90pacq.R.flushNeeded();}}

    /** Generate next pseudorandom number.
     * <p>This method is the core generation algorithm. It is used by all the
     * public generation methods for the various primitive types {@link
     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},
     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},
     * {@link #next(int)} and {@link #nextLong()}.</p>
     * @param bits number of random bits to produce
     * @return random bits generated
     */
    @Override
    protected int next(int bits) {try{__CLR4_4_110xd10xdlb90pacq.R.inc(47930);

        __CLR4_4_110xd10xdlb90pacq.R.inc(47931);int y;

        __CLR4_4_110xd10xdlb90pacq.R.inc(47932);if ((((mti >= N)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47933)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47934)==0&false))) {{ // generate N words at one time
            __CLR4_4_110xd10xdlb90pacq.R.inc(47935);int mtNext = mt[0];
            __CLR4_4_110xd10xdlb90pacq.R.inc(47936);for (int k = 0; (((k < N - M)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47937)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47938)==0&false)); ++k) {{
                __CLR4_4_110xd10xdlb90pacq.R.inc(47939);int mtCurr = mtNext;
                __CLR4_4_110xd10xdlb90pacq.R.inc(47940);mtNext = mt[k + 1];
                __CLR4_4_110xd10xdlb90pacq.R.inc(47941);y = (mtCurr & 0x80000000) | (mtNext & 0x7fffffff);
                __CLR4_4_110xd10xdlb90pacq.R.inc(47942);mt[k] = mt[k + M] ^ (y >>> 1) ^ MAG01[y & 0x1];
            }
            }__CLR4_4_110xd10xdlb90pacq.R.inc(47943);for (int k = N - M; (((k < N - 1)&&(__CLR4_4_110xd10xdlb90pacq.R.iget(47944)!=0|true))||(__CLR4_4_110xd10xdlb90pacq.R.iget(47945)==0&false)); ++k) {{
                __CLR4_4_110xd10xdlb90pacq.R.inc(47946);int mtCurr = mtNext;
                __CLR4_4_110xd10xdlb90pacq.R.inc(47947);mtNext = mt[k + 1];
                __CLR4_4_110xd10xdlb90pacq.R.inc(47948);y = (mtCurr & 0x80000000) | (mtNext & 0x7fffffff);
                __CLR4_4_110xd10xdlb90pacq.R.inc(47949);mt[k] = mt[k + (M - N)] ^ (y >>> 1) ^ MAG01[y & 0x1];
            }
            }__CLR4_4_110xd10xdlb90pacq.R.inc(47950);y = (mtNext & 0x80000000) | (mt[0] & 0x7fffffff);
            __CLR4_4_110xd10xdlb90pacq.R.inc(47951);mt[N - 1] = mt[M - 1] ^ (y >>> 1) ^ MAG01[y & 0x1];

            __CLR4_4_110xd10xdlb90pacq.R.inc(47952);mti = 0;
        }

        }__CLR4_4_110xd10xdlb90pacq.R.inc(47953);y = mt[mti++];

        // tempering
        __CLR4_4_110xd10xdlb90pacq.R.inc(47954);y ^=  y >>> 11;
        __CLR4_4_110xd10xdlb90pacq.R.inc(47955);y ^= (y <<   7) & 0x9d2c5680;
        __CLR4_4_110xd10xdlb90pacq.R.inc(47956);y ^= (y <<  15) & 0xefc60000;
        __CLR4_4_110xd10xdlb90pacq.R.inc(47957);y ^=  y >>> 18;

        __CLR4_4_110xd10xdlb90pacq.R.inc(47958);return y >>> (32 - bits);

    }finally{__CLR4_4_110xd10xdlb90pacq.R.flushNeeded();}}

}
