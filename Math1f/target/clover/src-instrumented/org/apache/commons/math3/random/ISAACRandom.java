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

/**
 * <a href="http://burtleburtle.net/bob/rand/isaacafa.html">
 *  ISAAC: a fast cryptographic pseudo-random number generator</a>
 * <br/>
 * ISAAC (Indirection, Shift, Accumulate, Add, and Count) generates 32-bit
 * random numbers.
 * ISAAC has been designed to be cryptographically secure and is inspired
 * by RC4.
 * Cycles are guaranteed to be at least 2<sup>40</sup> values long, and they
 * are 2<sup>8295</sup> values long on average.
 * The results are uniformly distributed, unbiased, and unpredictable unless
 * you know the seed.
 * <br/>
 * This code is based (with minor changes and improvements) on the original
 * implementation of the algorithm by Bob Jenkins.
 * <br/>
 *
 * @version $Id$
 * @since 3.0
 */
public class ISAACRandom extends BitsStreamGenerator implements Serializable {public static class __CLR4_4_110t910t9lb90pac2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47853,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier */
    private static final long serialVersionUID = 7288197941165002400L;
    /** Log of size of rsl[] and mem[] */
    private static final int SIZE_L = 8;
    /** Size of rsl[] and mem[] */
    private static final int SIZE = 1 << SIZE_L;
    /** Half-size of rsl[] and mem[] */
    private static final int H_SIZE = SIZE >> 1;
    /** For pseudo-random lookup */
    private static final int MASK = SIZE - 1 << 2;
    /** The golden ratio */
    private static final int GLD_RATIO = 0x9e3779b9;
    /** The results given to the user */
    private final int[] rsl = new int[SIZE];
    /** The internal state */
    private final int[] mem = new int[SIZE];
    /** Count through the results in rsl[] */
    private int count;
    /** Accumulator */
    private int isaacA;
    /** The last result */
    private int isaacB;
    /** Counter, guarantees cycle is at least 2^40 */
    private int isaacC;
    /** Service variable. */
    private final int[] arr = new int[8];
    /** Service variable. */
    private int isaacX;
    /** Service variable. */
    private int isaacI;
    /** Service variable. */
    private int isaacJ;


    /**
     * Creates a new ISAAC random number generator.
     * <br/>
     * The instance is initialized using a combination of the
     * current time and system hash code of the instance as the seed.
     */
    public ISAACRandom() {try{__CLR4_4_110t910t9lb90pac2.R.inc(47709);
        __CLR4_4_110t910t9lb90pac2.R.inc(47710);setSeed(System.currentTimeMillis() + System.identityHashCode(this));
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /**
     * Creates a new ISAAC random number generator using a single long seed.
     *
     * @param seed Initial seed.
     */
    public ISAACRandom(long seed) {try{__CLR4_4_110t910t9lb90pac2.R.inc(47711);
        __CLR4_4_110t910t9lb90pac2.R.inc(47712);setSeed(seed);
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /**
     * Creates a new ISAAC random number generator using an int array seed.
     *
     * @param seed Initial seed. If {@code null}, the seed will be related
     * to the current time.
     */
    public ISAACRandom(int[] seed) {try{__CLR4_4_110t910t9lb90pac2.R.inc(47713);
        __CLR4_4_110t910t9lb90pac2.R.inc(47714);setSeed(seed);
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSeed(int seed) {try{__CLR4_4_110t910t9lb90pac2.R.inc(47715);
        __CLR4_4_110t910t9lb90pac2.R.inc(47716);setSeed(new int[]{seed});
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSeed(long seed) {try{__CLR4_4_110t910t9lb90pac2.R.inc(47717);
        __CLR4_4_110t910t9lb90pac2.R.inc(47718);setSeed(new int[]{(int) (seed >>> 32), (int) (seed & 0xffffffffL)});
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSeed(int[] seed) {try{__CLR4_4_110t910t9lb90pac2.R.inc(47719);
        __CLR4_4_110t910t9lb90pac2.R.inc(47720);if ((((seed == null)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47721)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47722)==0&false))) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47723);setSeed(System.currentTimeMillis() + System.identityHashCode(this));
            __CLR4_4_110t910t9lb90pac2.R.inc(47724);return;
        }
        }__CLR4_4_110t910t9lb90pac2.R.inc(47725);final int seedLen = seed.length;
        __CLR4_4_110t910t9lb90pac2.R.inc(47726);final int rslLen = rsl.length;
        __CLR4_4_110t910t9lb90pac2.R.inc(47727);System.arraycopy(seed, 0, rsl, 0, Math.min(seedLen, rslLen));
        __CLR4_4_110t910t9lb90pac2.R.inc(47728);if ((((seedLen < rslLen)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47729)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47730)==0&false))) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47731);for (int j = seedLen; (((j < rslLen)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47732)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47733)==0&false)); j++) {{
                __CLR4_4_110t910t9lb90pac2.R.inc(47734);long k = rsl[j - seedLen];
                __CLR4_4_110t910t9lb90pac2.R.inc(47735);rsl[j] = (int) (0x6c078965L * (k ^ k >> 30) + j & 0xffffffffL);
            }
        }}
        }__CLR4_4_110t910t9lb90pac2.R.inc(47736);initState();
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected int next(int bits) {try{__CLR4_4_110t910t9lb90pac2.R.inc(47737);
        __CLR4_4_110t910t9lb90pac2.R.inc(47738);if ((((count < 0)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47739)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47740)==0&false))) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47741);isaac();
            __CLR4_4_110t910t9lb90pac2.R.inc(47742);count = SIZE - 1;
        }
        }__CLR4_4_110t910t9lb90pac2.R.inc(47743);return rsl[count--] >>> 32 - bits;
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** Generate 256 results */
    private void isaac() {try{__CLR4_4_110t910t9lb90pac2.R.inc(47744);
        __CLR4_4_110t910t9lb90pac2.R.inc(47745);isaacI = 0;
        __CLR4_4_110t910t9lb90pac2.R.inc(47746);isaacJ = H_SIZE;
        __CLR4_4_110t910t9lb90pac2.R.inc(47747);isaacB += ++isaacC;
        __CLR4_4_110t910t9lb90pac2.R.inc(47748);while ((((isaacI < H_SIZE)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47749)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47750)==0&false))) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47751);isaac2();
        }
        }__CLR4_4_110t910t9lb90pac2.R.inc(47752);isaacJ = 0;
        __CLR4_4_110t910t9lb90pac2.R.inc(47753);while ((((isaacJ < H_SIZE)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47754)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47755)==0&false))) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47756);isaac2();
        }
    }}finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** Intermediate internal loop. */
    private void isaac2() {try{__CLR4_4_110t910t9lb90pac2.R.inc(47757);
        __CLR4_4_110t910t9lb90pac2.R.inc(47758);isaacX = mem[isaacI];
        __CLR4_4_110t910t9lb90pac2.R.inc(47759);isaacA ^= isaacA << 13;
        __CLR4_4_110t910t9lb90pac2.R.inc(47760);isaacA += mem[isaacJ++];
        __CLR4_4_110t910t9lb90pac2.R.inc(47761);isaac3();
        __CLR4_4_110t910t9lb90pac2.R.inc(47762);isaacX = mem[isaacI];
        __CLR4_4_110t910t9lb90pac2.R.inc(47763);isaacA ^= isaacA >>> 6;
        __CLR4_4_110t910t9lb90pac2.R.inc(47764);isaacA += mem[isaacJ++];
        __CLR4_4_110t910t9lb90pac2.R.inc(47765);isaac3();
        __CLR4_4_110t910t9lb90pac2.R.inc(47766);isaacX = mem[isaacI];
        __CLR4_4_110t910t9lb90pac2.R.inc(47767);isaacA ^= isaacA << 2;
        __CLR4_4_110t910t9lb90pac2.R.inc(47768);isaacA += mem[isaacJ++];
        __CLR4_4_110t910t9lb90pac2.R.inc(47769);isaac3();
        __CLR4_4_110t910t9lb90pac2.R.inc(47770);isaacX = mem[isaacI];
        __CLR4_4_110t910t9lb90pac2.R.inc(47771);isaacA ^= isaacA >>> 16;
        __CLR4_4_110t910t9lb90pac2.R.inc(47772);isaacA += mem[isaacJ++];
        __CLR4_4_110t910t9lb90pac2.R.inc(47773);isaac3();
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** Lowest level internal loop. */
    private void isaac3() {try{__CLR4_4_110t910t9lb90pac2.R.inc(47774);
        __CLR4_4_110t910t9lb90pac2.R.inc(47775);mem[isaacI] = mem[(isaacX & MASK) >> 2] + isaacA + isaacB;
        __CLR4_4_110t910t9lb90pac2.R.inc(47776);isaacB = mem[(mem[isaacI] >> SIZE_L & MASK) >> 2] + isaacX;
        __CLR4_4_110t910t9lb90pac2.R.inc(47777);rsl[isaacI++] = isaacB;
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** Initialize, or reinitialize, this instance of rand. */
    private void initState() {try{__CLR4_4_110t910t9lb90pac2.R.inc(47778);
        __CLR4_4_110t910t9lb90pac2.R.inc(47779);isaacA = 0;
        __CLR4_4_110t910t9lb90pac2.R.inc(47780);isaacB = 0;
        __CLR4_4_110t910t9lb90pac2.R.inc(47781);isaacC = 0;
        __CLR4_4_110t910t9lb90pac2.R.inc(47782);for (int j = 0; (((j < arr.length)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47783)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47784)==0&false)); j++) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47785);arr[j] = GLD_RATIO;
        }
        }__CLR4_4_110t910t9lb90pac2.R.inc(47786);for (int j = 0; (((j < 4)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47787)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47788)==0&false)); j++) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47789);shuffle();
        }
        // fill in mem[] with messy stuff
        }__CLR4_4_110t910t9lb90pac2.R.inc(47790);for (int j = 0; (((j < SIZE)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47791)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47792)==0&false)); j += 8) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47793);arr[0] += rsl[j];
            __CLR4_4_110t910t9lb90pac2.R.inc(47794);arr[1] += rsl[j + 1];
            __CLR4_4_110t910t9lb90pac2.R.inc(47795);arr[2] += rsl[j + 2];
            __CLR4_4_110t910t9lb90pac2.R.inc(47796);arr[3] += rsl[j + 3];
            __CLR4_4_110t910t9lb90pac2.R.inc(47797);arr[4] += rsl[j + 4];
            __CLR4_4_110t910t9lb90pac2.R.inc(47798);arr[5] += rsl[j + 5];
            __CLR4_4_110t910t9lb90pac2.R.inc(47799);arr[6] += rsl[j + 6];
            __CLR4_4_110t910t9lb90pac2.R.inc(47800);arr[7] += rsl[j + 7];
            __CLR4_4_110t910t9lb90pac2.R.inc(47801);shuffle();
            __CLR4_4_110t910t9lb90pac2.R.inc(47802);setState(j);
        }
        // second pass makes all of seed affect all of mem
        }__CLR4_4_110t910t9lb90pac2.R.inc(47803);for (int j = 0; (((j < SIZE)&&(__CLR4_4_110t910t9lb90pac2.R.iget(47804)!=0|true))||(__CLR4_4_110t910t9lb90pac2.R.iget(47805)==0&false)); j += 8) {{
            __CLR4_4_110t910t9lb90pac2.R.inc(47806);arr[0] += mem[j];
            __CLR4_4_110t910t9lb90pac2.R.inc(47807);arr[1] += mem[j + 1];
            __CLR4_4_110t910t9lb90pac2.R.inc(47808);arr[2] += mem[j + 2];
            __CLR4_4_110t910t9lb90pac2.R.inc(47809);arr[3] += mem[j + 3];
            __CLR4_4_110t910t9lb90pac2.R.inc(47810);arr[4] += mem[j + 4];
            __CLR4_4_110t910t9lb90pac2.R.inc(47811);arr[5] += mem[j + 5];
            __CLR4_4_110t910t9lb90pac2.R.inc(47812);arr[6] += mem[j + 6];
            __CLR4_4_110t910t9lb90pac2.R.inc(47813);arr[7] += mem[j + 7];
            __CLR4_4_110t910t9lb90pac2.R.inc(47814);shuffle();
            __CLR4_4_110t910t9lb90pac2.R.inc(47815);setState(j);
        }
        }__CLR4_4_110t910t9lb90pac2.R.inc(47816);isaac();
        __CLR4_4_110t910t9lb90pac2.R.inc(47817);count = SIZE - 1;
        __CLR4_4_110t910t9lb90pac2.R.inc(47818);clear();
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** Shuffle array. */
    private void shuffle() {try{__CLR4_4_110t910t9lb90pac2.R.inc(47819);
        __CLR4_4_110t910t9lb90pac2.R.inc(47820);arr[0] ^= arr[1] << 11;
        __CLR4_4_110t910t9lb90pac2.R.inc(47821);arr[3] += arr[0];
        __CLR4_4_110t910t9lb90pac2.R.inc(47822);arr[1] += arr[2];
        __CLR4_4_110t910t9lb90pac2.R.inc(47823);arr[1] ^= arr[2] >>> 2;
        __CLR4_4_110t910t9lb90pac2.R.inc(47824);arr[4] += arr[1];
        __CLR4_4_110t910t9lb90pac2.R.inc(47825);arr[2] += arr[3];
        __CLR4_4_110t910t9lb90pac2.R.inc(47826);arr[2] ^= arr[3] << 8;
        __CLR4_4_110t910t9lb90pac2.R.inc(47827);arr[5] += arr[2];
        __CLR4_4_110t910t9lb90pac2.R.inc(47828);arr[3] += arr[4];
        __CLR4_4_110t910t9lb90pac2.R.inc(47829);arr[3] ^= arr[4] >>> 16;
        __CLR4_4_110t910t9lb90pac2.R.inc(47830);arr[6] += arr[3];
        __CLR4_4_110t910t9lb90pac2.R.inc(47831);arr[4] += arr[5];
        __CLR4_4_110t910t9lb90pac2.R.inc(47832);arr[4] ^= arr[5] << 10;
        __CLR4_4_110t910t9lb90pac2.R.inc(47833);arr[7] += arr[4];
        __CLR4_4_110t910t9lb90pac2.R.inc(47834);arr[5] += arr[6];
        __CLR4_4_110t910t9lb90pac2.R.inc(47835);arr[5] ^= arr[6] >>> 4;
        __CLR4_4_110t910t9lb90pac2.R.inc(47836);arr[0] += arr[5];
        __CLR4_4_110t910t9lb90pac2.R.inc(47837);arr[6] += arr[7];
        __CLR4_4_110t910t9lb90pac2.R.inc(47838);arr[6] ^= arr[7] << 8;
        __CLR4_4_110t910t9lb90pac2.R.inc(47839);arr[1] += arr[6];
        __CLR4_4_110t910t9lb90pac2.R.inc(47840);arr[7] += arr[0];
        __CLR4_4_110t910t9lb90pac2.R.inc(47841);arr[7] ^= arr[0] >>> 9;
        __CLR4_4_110t910t9lb90pac2.R.inc(47842);arr[2] += arr[7];
        __CLR4_4_110t910t9lb90pac2.R.inc(47843);arr[0] += arr[1];
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}

    /** Set the state by copying the internal arrays.
     *
     * @param start First index into {@link #mem} array.
     */
    private void setState(int start) {try{__CLR4_4_110t910t9lb90pac2.R.inc(47844);
        __CLR4_4_110t910t9lb90pac2.R.inc(47845);mem[start] = arr[0];
        __CLR4_4_110t910t9lb90pac2.R.inc(47846);mem[start + 1] = arr[1];
        __CLR4_4_110t910t9lb90pac2.R.inc(47847);mem[start + 2] = arr[2];
        __CLR4_4_110t910t9lb90pac2.R.inc(47848);mem[start + 3] = arr[3];
        __CLR4_4_110t910t9lb90pac2.R.inc(47849);mem[start + 4] = arr[4];
        __CLR4_4_110t910t9lb90pac2.R.inc(47850);mem[start + 5] = arr[5];
        __CLR4_4_110t910t9lb90pac2.R.inc(47851);mem[start + 6] = arr[6];
        __CLR4_4_110t910t9lb90pac2.R.inc(47852);mem[start + 7] = arr[7];
    }finally{__CLR4_4_110t910t9lb90pac2.R.flushNeeded();}}
}
