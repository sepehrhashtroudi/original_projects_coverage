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


/** This class implements the WELL512a pseudo-random number generator
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
public class Well512a extends AbstractWell {public static class __CLR4_4_111oc11oclb90pagd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48850,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -6104179812103820574L;

    /** Number of bits in the pool. */
    private static final int K = 512;

    /** First parameter of the algorithm. */
    private static final int M1 = 13;

    /** Second parameter of the algorithm. */
    private static final int M2 = 9;

    /** Third parameter of the algorithm. */
    private static final int M3 = 5;

    /** Creates a new random number generator.
     * <p>The instance is initialized using the current time as the
     * seed.</p>
     */
    public Well512a() {
        super(K, M1, M2, M3);__CLR4_4_111oc11oclb90pagd.R.inc(48829);try{__CLR4_4_111oc11oclb90pagd.R.inc(48828);
    }finally{__CLR4_4_111oc11oclb90pagd.R.flushNeeded();}}

    /** Creates a new random number generator using a single int seed.
     * @param seed the initial seed (32 bits integer)
     */
    public Well512a(int seed) {
        super(K, M1, M2, M3, seed);__CLR4_4_111oc11oclb90pagd.R.inc(48831);try{__CLR4_4_111oc11oclb90pagd.R.inc(48830);
    }finally{__CLR4_4_111oc11oclb90pagd.R.flushNeeded();}}

    /** Creates a new random number generator using an int array seed.
     * @param seed the initial seed (32 bits integers array), if null
     * the seed of the generator will be related to the current time
     */
    public Well512a(int[] seed) {
        super(K, M1, M2, M3, seed);__CLR4_4_111oc11oclb90pagd.R.inc(48833);try{__CLR4_4_111oc11oclb90pagd.R.inc(48832);
    }finally{__CLR4_4_111oc11oclb90pagd.R.flushNeeded();}}

    /** Creates a new random number generator using a single long seed.
     * @param seed the initial seed (64 bits integer)
     */
    public Well512a(long seed) {
        super(K, M1, M2, M3, seed);__CLR4_4_111oc11oclb90pagd.R.inc(48835);try{__CLR4_4_111oc11oclb90pagd.R.inc(48834);
    }finally{__CLR4_4_111oc11oclb90pagd.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected int next(final int bits) {try{__CLR4_4_111oc11oclb90pagd.R.inc(48836);

        __CLR4_4_111oc11oclb90pagd.R.inc(48837);final int indexRm1 = iRm1[index];

        __CLR4_4_111oc11oclb90pagd.R.inc(48838);final int vi = v[index];
        __CLR4_4_111oc11oclb90pagd.R.inc(48839);final int vi1 = v[i1[index]];
        __CLR4_4_111oc11oclb90pagd.R.inc(48840);final int vi2 = v[i2[index]];
        __CLR4_4_111oc11oclb90pagd.R.inc(48841);final int z0 = v[indexRm1];

        // the values below include the errata of the original article
        __CLR4_4_111oc11oclb90pagd.R.inc(48842);final int z1 = (vi ^ (vi << 16))   ^ (vi1 ^ (vi1 << 15));
        __CLR4_4_111oc11oclb90pagd.R.inc(48843);final int z2 = vi2 ^ (vi2 >>> 11);
        __CLR4_4_111oc11oclb90pagd.R.inc(48844);final int z3 = z1 ^ z2;
        __CLR4_4_111oc11oclb90pagd.R.inc(48845);final int z4 = (z0 ^ (z0 << 2)) ^ (z1 ^ (z1 << 18)) ^ (z2 << 28) ^ (z3 ^ ((z3 << 5) & 0xda442d24));

        __CLR4_4_111oc11oclb90pagd.R.inc(48846);v[index] = z3;
        __CLR4_4_111oc11oclb90pagd.R.inc(48847);v[indexRm1]  = z4;
        __CLR4_4_111oc11oclb90pagd.R.inc(48848);index    = indexRm1;

        __CLR4_4_111oc11oclb90pagd.R.inc(48849);return z4 >>> (32 - bits);

    }finally{__CLR4_4_111oc11oclb90pagd.R.flushNeeded();}}

}
