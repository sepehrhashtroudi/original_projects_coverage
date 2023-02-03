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


/** This class implements the WELL44497a pseudo-random number generator
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
public class Well44497a extends AbstractWell {public static class __CLR4_4_111mo11molb90pafy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48797,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -3859207588353972099L;

    /** Number of bits in the pool. */
    private static final int K = 44497;

    /** First parameter of the algorithm. */
    private static final int M1 = 23;

    /** Second parameter of the algorithm. */
    private static final int M2 = 481;

    /** Third parameter of the algorithm. */
    private static final int M3 = 229;

    /** Creates a new random number generator.
     * <p>The instance is initialized using the current time as the
     * seed.</p>
     */
    public Well44497a() {
        super(K, M1, M2, M3);__CLR4_4_111mo11molb90pafy.R.inc(48769);try{__CLR4_4_111mo11molb90pafy.R.inc(48768);
    }finally{__CLR4_4_111mo11molb90pafy.R.flushNeeded();}}

    /** Creates a new random number generator using a single int seed.
     * @param seed the initial seed (32 bits integer)
     */
    public Well44497a(int seed) {
        super(K, M1, M2, M3, seed);__CLR4_4_111mo11molb90pafy.R.inc(48771);try{__CLR4_4_111mo11molb90pafy.R.inc(48770);
    }finally{__CLR4_4_111mo11molb90pafy.R.flushNeeded();}}

    /** Creates a new random number generator using an int array seed.
     * @param seed the initial seed (32 bits integers array), if null
     * the seed of the generator will be related to the current time
     */
    public Well44497a(int[] seed) {
        super(K, M1, M2, M3, seed);__CLR4_4_111mo11molb90pafy.R.inc(48773);try{__CLR4_4_111mo11molb90pafy.R.inc(48772);
    }finally{__CLR4_4_111mo11molb90pafy.R.flushNeeded();}}

    /** Creates a new random number generator using a single long seed.
     * @param seed the initial seed (64 bits integer)
     */
    public Well44497a(long seed) {
        super(K, M1, M2, M3, seed);__CLR4_4_111mo11molb90pafy.R.inc(48775);try{__CLR4_4_111mo11molb90pafy.R.inc(48774);
    }finally{__CLR4_4_111mo11molb90pafy.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected int next(final int bits) {try{__CLR4_4_111mo11molb90pafy.R.inc(48776);

        __CLR4_4_111mo11molb90pafy.R.inc(48777);final int indexRm1 = iRm1[index];
        __CLR4_4_111mo11molb90pafy.R.inc(48778);final int indexRm2 = iRm2[index];

        __CLR4_4_111mo11molb90pafy.R.inc(48779);final int v0       = v[index];
        __CLR4_4_111mo11molb90pafy.R.inc(48780);final int vM1      = v[i1[index]];
        __CLR4_4_111mo11molb90pafy.R.inc(48781);final int vM2      = v[i2[index]];
        __CLR4_4_111mo11molb90pafy.R.inc(48782);final int vM3      = v[i3[index]];

        // the values below include the errata of the original article
        __CLR4_4_111mo11molb90pafy.R.inc(48783);final int z0       = (0xFFFF8000 & v[indexRm1]) ^ (0x00007FFF & v[indexRm2]);
        __CLR4_4_111mo11molb90pafy.R.inc(48784);final int z1       = (v0 ^ (v0 << 24))  ^ (vM1 ^ (vM1 >>> 30));
        __CLR4_4_111mo11molb90pafy.R.inc(48785);final int z2       = (vM2 ^ (vM2 << 10)) ^ (vM3 << 26);
        __CLR4_4_111mo11molb90pafy.R.inc(48786);final int z3       = z1      ^ z2;
        __CLR4_4_111mo11molb90pafy.R.inc(48787);final int z2Prime  = ((z2 << 9) ^ (z2 >>> 23)) & 0xfbffffff;
        __CLR4_4_111mo11molb90pafy.R.inc(48788);final int z2Second = (((((z2 & 0x00020000) != 0) )&&(__CLR4_4_111mo11molb90pafy.R.iget(48789)!=0|true))||(__CLR4_4_111mo11molb90pafy.R.iget(48790)==0&false))? (z2Prime ^ 0xb729fcec) : z2Prime;
        __CLR4_4_111mo11molb90pafy.R.inc(48791);final int z4       = z0 ^ (z1 ^ (z1 >>> 20)) ^ z2Second ^ z3;

        __CLR4_4_111mo11molb90pafy.R.inc(48792);v[index]     = z3;
        __CLR4_4_111mo11molb90pafy.R.inc(48793);v[indexRm1]  = z4;
        __CLR4_4_111mo11molb90pafy.R.inc(48794);v[indexRm2] &= 0xFFFF8000;
        __CLR4_4_111mo11molb90pafy.R.inc(48795);index        = indexRm1;

        __CLR4_4_111mo11molb90pafy.R.inc(48796);return z4 >>> (32 - bits);

    }finally{__CLR4_4_111mo11molb90pafy.R.flushNeeded();}}
}
