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


/** This abstract class implements the WELL class of pseudo-random number generator
 * from Fran&ccedil;ois Panneton, Pierre L'Ecuyer and Makoto Matsumoto.

 * <p>This generator is described in a paper by Fran&ccedil;ois Panneton,
 * Pierre L'Ecuyer and Makoto Matsumoto <a
 * href="http://www.iro.umontreal.ca/~lecuyer/myftp/papers/wellrng.pdf">Improved
 * Long-Period Generators Based on Linear Recurrences Modulo 2</a> ACM
 * Transactions on Mathematical Software, 32, 1 (2006). The errata for the paper
 * are in <a href="http://www.iro.umontreal.ca/~lecuyer/myftp/papers/wellrng-errata.txt">wellrng-errata.txt</a>.</p>

 * @see <a href="http://www.iro.umontreal.ca/~panneton/WELLRNG.html">WELL Random number generator</a>
 * @version $Id$
 * @since 2.2

 */
public abstract class AbstractWell extends BitsStreamGenerator implements Serializable {public static class __CLR4_4_110fu10fulb90pa9x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47272,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -817701723016583596L;

    /** Current index in the bytes pool. */
    protected int index;

    /** Bytes pool. */
    protected final int[] v;

    /** Index indirection table giving for each index its predecessor taking table size into account. */
    protected final int[] iRm1;

    /** Index indirection table giving for each index its second predecessor taking table size into account. */
    protected final int[] iRm2;

    /** Index indirection table giving for each index the value index + m1 taking table size into account. */
    protected final int[] i1;

    /** Index indirection table giving for each index the value index + m2 taking table size into account. */
    protected final int[] i2;

    /** Index indirection table giving for each index the value index + m3 taking table size into account. */
    protected final int[] i3;

    /** Creates a new random number generator.
     * <p>The instance is initialized using the current time plus the
     * system identity hash code of this instance as the seed.</p>
     * @param k number of bits in the pool (not necessarily a multiple of 32)
     * @param m1 first parameter of the algorithm
     * @param m2 second parameter of the algorithm
     * @param m3 third parameter of the algorithm
     */
    protected AbstractWell(final int k, final int m1, final int m2, final int m3) {
        this(k, m1, m2, m3, null);__CLR4_4_110fu10fulb90pa9x.R.inc(47227);try{__CLR4_4_110fu10fulb90pa9x.R.inc(47226);
    }finally{__CLR4_4_110fu10fulb90pa9x.R.flushNeeded();}}

    /** Creates a new random number generator using a single int seed.
     * @param k number of bits in the pool (not necessarily a multiple of 32)
     * @param m1 first parameter of the algorithm
     * @param m2 second parameter of the algorithm
     * @param m3 third parameter of the algorithm
     * @param seed the initial seed (32 bits integer)
     */
    protected AbstractWell(final int k, final int m1, final int m2, final int m3, final int seed) {
        this(k, m1, m2, m3, new int[] { seed });__CLR4_4_110fu10fulb90pa9x.R.inc(47229);try{__CLR4_4_110fu10fulb90pa9x.R.inc(47228);
    }finally{__CLR4_4_110fu10fulb90pa9x.R.flushNeeded();}}

    /** Creates a new random number generator using an int array seed.
     * @param k number of bits in the pool (not necessarily a multiple of 32)
     * @param m1 first parameter of the algorithm
     * @param m2 second parameter of the algorithm
     * @param m3 third parameter of the algorithm
     * @param seed the initial seed (32 bits integers array), if null
     * the seed of the generator will be related to the current time
     */
    protected AbstractWell(final int k, final int m1, final int m2, final int m3, final int[] seed) {try{__CLR4_4_110fu10fulb90pa9x.R.inc(47230);

        // the bits pool contains k bits, k = r w - p where r is the number
        // of w bits blocks, w is the block size (always 32 in the original paper)
        // and p is the number of unused bits in the last block
        __CLR4_4_110fu10fulb90pa9x.R.inc(47231);final int w = 32;
        __CLR4_4_110fu10fulb90pa9x.R.inc(47232);final int r = (k + w - 1) / w;
        __CLR4_4_110fu10fulb90pa9x.R.inc(47233);this.v      = new int[r];
        __CLR4_4_110fu10fulb90pa9x.R.inc(47234);this.index  = 0;

        // precompute indirection index tables. These tables are used for optimizing access
        // they allow saving computations like "(j + r - 2) % r" with costly modulo operations
        __CLR4_4_110fu10fulb90pa9x.R.inc(47235);iRm1 = new int[r];
        __CLR4_4_110fu10fulb90pa9x.R.inc(47236);iRm2 = new int[r];
        __CLR4_4_110fu10fulb90pa9x.R.inc(47237);i1   = new int[r];
        __CLR4_4_110fu10fulb90pa9x.R.inc(47238);i2   = new int[r];
        __CLR4_4_110fu10fulb90pa9x.R.inc(47239);i3   = new int[r];
        __CLR4_4_110fu10fulb90pa9x.R.inc(47240);for (int j = 0; (((j < r)&&(__CLR4_4_110fu10fulb90pa9x.R.iget(47241)!=0|true))||(__CLR4_4_110fu10fulb90pa9x.R.iget(47242)==0&false)); ++j) {{
            __CLR4_4_110fu10fulb90pa9x.R.inc(47243);iRm1[j] = (j + r - 1) % r;
            __CLR4_4_110fu10fulb90pa9x.R.inc(47244);iRm2[j] = (j + r - 2) % r;
            __CLR4_4_110fu10fulb90pa9x.R.inc(47245);i1[j]   = (j + m1)    % r;
            __CLR4_4_110fu10fulb90pa9x.R.inc(47246);i2[j]   = (j + m2)    % r;
            __CLR4_4_110fu10fulb90pa9x.R.inc(47247);i3[j]   = (j + m3)    % r;
        }

        // initialize the pool content
        }__CLR4_4_110fu10fulb90pa9x.R.inc(47248);setSeed(seed);

    }finally{__CLR4_4_110fu10fulb90pa9x.R.flushNeeded();}}

    /** Creates a new random number generator using a single long seed.
     * @param k number of bits in the pool (not necessarily a multiple of 32)
     * @param m1 first parameter of the algorithm
     * @param m2 second parameter of the algorithm
     * @param m3 third parameter of the algorithm
     * @param seed the initial seed (64 bits integer)
     */
    protected AbstractWell(final int k, final int m1, final int m2, final int m3, final long seed) {
        this(k, m1, m2, m3, new int[] { (int) (seed >>> 32), (int) (seed & 0xffffffffl) });__CLR4_4_110fu10fulb90pa9x.R.inc(47250);try{__CLR4_4_110fu10fulb90pa9x.R.inc(47249);
    }finally{__CLR4_4_110fu10fulb90pa9x.R.flushNeeded();}}

    /** Reinitialize the generator as if just built with the given int seed.
     * <p>The state of the generator is exactly the same as a new
     * generator built with the same seed.</p>
     * @param seed the initial seed (32 bits integer)
     */
    @Override
    public void setSeed(final int seed) {try{__CLR4_4_110fu10fulb90pa9x.R.inc(47251);
        __CLR4_4_110fu10fulb90pa9x.R.inc(47252);setSeed(new int[] { seed });
    }finally{__CLR4_4_110fu10fulb90pa9x.R.flushNeeded();}}

    /** Reinitialize the generator as if just built with the given int array seed.
     * <p>The state of the generator is exactly the same as a new
     * generator built with the same seed.</p>
     * @param seed the initial seed (32 bits integers array). If null
     * the seed of the generator will be the system time plus the system identity
     * hash code of the instance.
     */
    @Override
    public void setSeed(final int[] seed) {try{__CLR4_4_110fu10fulb90pa9x.R.inc(47253);
        __CLR4_4_110fu10fulb90pa9x.R.inc(47254);if ((((seed == null)&&(__CLR4_4_110fu10fulb90pa9x.R.iget(47255)!=0|true))||(__CLR4_4_110fu10fulb90pa9x.R.iget(47256)==0&false))) {{
            __CLR4_4_110fu10fulb90pa9x.R.inc(47257);setSeed(System.currentTimeMillis() + System.identityHashCode(this));
            __CLR4_4_110fu10fulb90pa9x.R.inc(47258);return;
        }

        }__CLR4_4_110fu10fulb90pa9x.R.inc(47259);System.arraycopy(seed, 0, v, 0, Math.min(seed.length, v.length));

        __CLR4_4_110fu10fulb90pa9x.R.inc(47260);if ((((seed.length < v.length)&&(__CLR4_4_110fu10fulb90pa9x.R.iget(47261)!=0|true))||(__CLR4_4_110fu10fulb90pa9x.R.iget(47262)==0&false))) {{
            __CLR4_4_110fu10fulb90pa9x.R.inc(47263);for (int i = seed.length; (((i < v.length)&&(__CLR4_4_110fu10fulb90pa9x.R.iget(47264)!=0|true))||(__CLR4_4_110fu10fulb90pa9x.R.iget(47265)==0&false)); ++i) {{
                __CLR4_4_110fu10fulb90pa9x.R.inc(47266);final long l = v[i - seed.length];
                __CLR4_4_110fu10fulb90pa9x.R.inc(47267);v[i] = (int) ((1812433253l * (l ^ (l >> 30)) + i) & 0xffffffffL);
            }
        }}

        }__CLR4_4_110fu10fulb90pa9x.R.inc(47268);index = 0;
        __CLR4_4_110fu10fulb90pa9x.R.inc(47269);clear();  // Clear normal deviate cache
    }finally{__CLR4_4_110fu10fulb90pa9x.R.flushNeeded();}}

    /** Reinitialize the generator as if just built with the given long seed.
     * <p>The state of the generator is exactly the same as a new
     * generator built with the same seed.</p>
     * @param seed the initial seed (64 bits integer)
     */
    @Override
    public void setSeed(final long seed) {try{__CLR4_4_110fu10fulb90pa9x.R.inc(47270);
        __CLR4_4_110fu10fulb90pa9x.R.inc(47271);setSeed(new int[] { (int) (seed >>> 32), (int) (seed & 0xffffffffl) });
    }finally{__CLR4_4_110fu10fulb90pa9x.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected abstract int next(final int bits);

}
