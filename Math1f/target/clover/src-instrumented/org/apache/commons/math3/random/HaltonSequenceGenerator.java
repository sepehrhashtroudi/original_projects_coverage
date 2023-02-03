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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.MathUtils;

/**
 * Implementation of a Halton sequence.
 * <p>
 * A Halton sequence is a low-discrepancy sequence generating points in the interval [0, 1] according to
 * <pre>
 *   H(n) = d_0 / b + d_1 / b^2 .... d_j / b^j+1
 *
 *   with
 *
 *   n = d_j * b^j-1 + ... d_1 * b + d_0 * b^0
 * </pre>
 * For higher dimensions, subsequent prime numbers are used as base, e.g. { 2, 3, 5 } for a Halton sequence in R^3.
 * <p>
 * Halton sequences are known to suffer from linear correlation for larger prime numbers, thus the individual digits
 * are usually scrambled. This implementation already comes with support for up to 40 dimensions with optimal weight
 * numbers from <a href="http://etd.lib.fsu.edu/theses/available/etd-07062004-140409/unrestricted/dissertation1.pdf">
 * H. Chi: Scrambled quasirandom sequences and their applications</a>.
 * <p>
 * The generator supports two modes:
 * <ul>
 *   <li>sequential generation of points: {@link #nextVector()}</li>
 *   <li>random access to the i-th point in the sequence: {@link #skipTo(int)}</li>
 * </ul>
 *
 * @see <a href="http://en.wikipedia.org/wiki/Halton_sequence">Halton sequence (Wikipedia)</a>
 * @see <a href="https://lirias.kuleuven.be/bitstream/123456789/131168/1/mcm2005_bartv.pdf">
 * On the Halton sequence and its scramblings</a>
 * @version $Id$
 * @since 3.3
 */
public class HaltonSequenceGenerator implements RandomVectorGenerator {public static class __CLR4_4_110s110s1lb90pabm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The first 40 primes. */
    private static final int[] PRIMES = new int[] {
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
        71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139,
        149, 151, 157, 163, 167, 173
    };

    /** The optimal weights used for scrambling of the first 40 dimension. */
    private static final int[] WEIGHTS = new int[] {
        1, 2, 3, 3, 8, 11, 12, 14, 7, 18, 12, 13, 17, 18, 29, 14, 18, 43, 41,
        44, 40, 30, 47, 65, 71, 28, 40, 60, 79, 89, 56, 50, 52, 61, 108, 56,
        66, 63, 60, 66
    };

    /** Space dimension. */
    private final int dimension;

    /** The current index in the sequence. */
    private int count = 0;

    /** The base numbers for each component. */
    private final int[] base;

    /** The scrambling weights for each component. */
    private final int[] weight;

    /**
     * Construct a new Halton sequence generator for the given space dimension.
     *
     * @param dimension the space dimension
     * @throws OutOfRangeException if the space dimension is outside the allowed range of [1, 40]
     */
    public HaltonSequenceGenerator(final int dimension) throws OutOfRangeException {
        this(dimension, PRIMES, WEIGHTS);__CLR4_4_110s110s1lb90pabm.R.inc(47666);try{__CLR4_4_110s110s1lb90pabm.R.inc(47665);
    }finally{__CLR4_4_110s110s1lb90pabm.R.flushNeeded();}}

    /**
     * Construct a new Halton sequence generator with the given base numbers and weights for each dimension.
     * The length of the bases array defines the space dimension and is required to be &gt; 0.
     *
     * @param dimension the space dimension
     * @param bases the base number for each dimension, entries should be (pairwise) prime, may not be null
     * @param weights the weights used during scrambling, may be null in which case no scrambling will be performed
     * @throws NullArgumentException if base is null
     * @throws OutOfRangeException if the space dimension is outside the range [1, len], where
     *   len refers to the length of the bases array
     * @throws DimensionMismatchException if weights is non-null and the length of the input arrays differ
     */
    public HaltonSequenceGenerator(final int dimension, final int[] bases, final int[] weights)
            throws NullArgumentException, OutOfRangeException, DimensionMismatchException {try{__CLR4_4_110s110s1lb90pabm.R.inc(47667);

        __CLR4_4_110s110s1lb90pabm.R.inc(47668);MathUtils.checkNotNull(bases);

        __CLR4_4_110s110s1lb90pabm.R.inc(47669);if ((((dimension < 1 || dimension > bases.length)&&(__CLR4_4_110s110s1lb90pabm.R.iget(47670)!=0|true))||(__CLR4_4_110s110s1lb90pabm.R.iget(47671)==0&false))) {{
            __CLR4_4_110s110s1lb90pabm.R.inc(47672);throw new OutOfRangeException(dimension, 1, PRIMES.length);
        }

        }__CLR4_4_110s110s1lb90pabm.R.inc(47673);if ((((weights != null && weights.length != bases.length)&&(__CLR4_4_110s110s1lb90pabm.R.iget(47674)!=0|true))||(__CLR4_4_110s110s1lb90pabm.R.iget(47675)==0&false))) {{
            __CLR4_4_110s110s1lb90pabm.R.inc(47676);throw new DimensionMismatchException(weights.length, bases.length);
        }

        }__CLR4_4_110s110s1lb90pabm.R.inc(47677);this.dimension = dimension;
        __CLR4_4_110s110s1lb90pabm.R.inc(47678);this.base = bases.clone();
        __CLR4_4_110s110s1lb90pabm.R.inc(47679);this.weight = (((weights == null )&&(__CLR4_4_110s110s1lb90pabm.R.iget(47680)!=0|true))||(__CLR4_4_110s110s1lb90pabm.R.iget(47681)==0&false))? null : weights.clone();
        __CLR4_4_110s110s1lb90pabm.R.inc(47682);count = 0;
    }finally{__CLR4_4_110s110s1lb90pabm.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[] nextVector() {try{__CLR4_4_110s110s1lb90pabm.R.inc(47683);
        __CLR4_4_110s110s1lb90pabm.R.inc(47684);final double[] v = new double[dimension];
        __CLR4_4_110s110s1lb90pabm.R.inc(47685);for (int i = 0; (((i < dimension)&&(__CLR4_4_110s110s1lb90pabm.R.iget(47686)!=0|true))||(__CLR4_4_110s110s1lb90pabm.R.iget(47687)==0&false)); i++) {{
            __CLR4_4_110s110s1lb90pabm.R.inc(47688);int index = count;
            __CLR4_4_110s110s1lb90pabm.R.inc(47689);double f = 1.0 / base[i];

            __CLR4_4_110s110s1lb90pabm.R.inc(47690);int j = 0;
            __CLR4_4_110s110s1lb90pabm.R.inc(47691);while ((((index > 0)&&(__CLR4_4_110s110s1lb90pabm.R.iget(47692)!=0|true))||(__CLR4_4_110s110s1lb90pabm.R.iget(47693)==0&false))) {{
                __CLR4_4_110s110s1lb90pabm.R.inc(47694);final int digit = scramble(i, j, base[i], index % base[i]);
                __CLR4_4_110s110s1lb90pabm.R.inc(47695);v[i] += f * digit;
                __CLR4_4_110s110s1lb90pabm.R.inc(47696);index /= base[i]; // floor( index / base )
                __CLR4_4_110s110s1lb90pabm.R.inc(47697);f /= base[i];
            }
        }}
        }__CLR4_4_110s110s1lb90pabm.R.inc(47698);count++;
        __CLR4_4_110s110s1lb90pabm.R.inc(47699);return v;
    }finally{__CLR4_4_110s110s1lb90pabm.R.flushNeeded();}}

    /**
     * Performs scrambling of digit {@code d_j} according to the formula:
     * <pre>
     *   ( weight_i * d_j ) mod base
     * </pre>
     * Implementations can override this method to do a different scrambling.
     *
     * @param i the dimension index
     * @param j the digit index
     * @param b the base for this dimension
     * @param digit the j-th digit
     * @return the scrambled digit
     */
    protected int scramble(final int i, final int j, final int b, final int digit) {try{__CLR4_4_110s110s1lb90pabm.R.inc(47700);
        __CLR4_4_110s110s1lb90pabm.R.inc(47701);return (((weight != null )&&(__CLR4_4_110s110s1lb90pabm.R.iget(47702)!=0|true))||(__CLR4_4_110s110s1lb90pabm.R.iget(47703)==0&false))? (weight[i] * digit) % b : digit;
    }finally{__CLR4_4_110s110s1lb90pabm.R.flushNeeded();}}

    /**
     * Skip to the i-th point in the Halton sequence.
     * <p>
     * This operation can be performed in O(1).
     *
     * @param index the index in the sequence to skip to
     * @return the i-th point in the Halton sequence
     * @throws NotPositiveException if index &lt; 0
     */
    public double[] skipTo(final int index) throws NotPositiveException {try{__CLR4_4_110s110s1lb90pabm.R.inc(47704);
        __CLR4_4_110s110s1lb90pabm.R.inc(47705);count = index;
        __CLR4_4_110s110s1lb90pabm.R.inc(47706);return nextVector();
    }finally{__CLR4_4_110s110s1lb90pabm.R.flushNeeded();}}

    /**
     * Returns the index i of the next point in the Halton sequence that will be returned
     * by calling {@link #nextVector()}.
     *
     * @return the index of the next point
     */
    public int getNextIndex() {try{__CLR4_4_110s110s1lb90pabm.R.inc(47707);
        __CLR4_4_110s110s1lb90pabm.R.inc(47708);return count;
    }finally{__CLR4_4_110s110s1lb90pabm.R.flushNeeded();}}

}
