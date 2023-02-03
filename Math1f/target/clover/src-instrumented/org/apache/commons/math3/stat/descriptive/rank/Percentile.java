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
package org.apache.commons.math3.stat.descriptive.rank;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * Provides percentile computation.
 * <p>
 * There are several commonly used methods for estimating percentiles (a.k.a.
 * quantiles) based on sample data.  For large samples, the different methods
 * agree closely, but when sample sizes are small, different methods will give
 * significantly different results.  The algorithm implemented here works as follows:
 * <ol>
 * <li>Let <code>n</code> be the length of the (sorted) array and
 * <code>0 < p <= 100</code> be the desired percentile.</li>
 * <li>If <code> n = 1 </code> return the unique array element (regardless of
 * the value of <code>p</code>); otherwise </li>
 * <li>Compute the estimated percentile position
 * <code> pos = p * (n + 1) / 100</code> and the difference, <code>d</code>
 * between <code>pos</code> and <code>floor(pos)</code> (i.e. the fractional
 * part of <code>pos</code>).</li>
 * <li> If <code>pos < 1</code> return the smallest element in the array.</li>
 * <li> Else if <code>pos >= n</code> return the largest element in the array.</li>
 * <li> Else let <code>lower</code> be the element in position
 * <code>floor(pos)</code> in the array and let <code>upper</code> be the
 * next element in the array.  Return <code>lower + d * (upper - lower)</code>
 * </li>
 * </ol></p>
 * <p>
 * To compute percentiles, the data must be at least partially ordered.  Input
 * arrays are copied and recursively partitioned using an ordering definition.
 * The ordering used by <code>Arrays.sort(double[])</code> is the one determined
 * by {@link java.lang.Double#compareTo(Double)}.  This ordering makes
 * <code>Double.NaN</code> larger than any other value (including
 * <code>Double.POSITIVE_INFINITY</code>).  Therefore, for example, the median
 * (50th percentile) of
 * <code>{0, 1, 2, 3, 4, Double.NaN}</code> evaluates to <code>2.5.</code></p>
 * <p>
 * Since percentile estimation usually involves interpolation between array
 * elements, arrays containing  <code>NaN</code> or infinite values will often
 * result in <code>NaN</code> or infinite values returned.</p>
 * <p>
 * Since 2.2, Percentile uses only selection instead of complete sorting
 * and caches selection algorithm state between calls to the various
 * {@code evaluate} methods. This greatly improves efficiency, both for a single
 * percentile and multiple percentile computations. To maximize performance when
 * multiple percentiles are computed based on the same data, users should set the
 * data array once using either one of the {@link #evaluate(double[], double)} or
 * {@link #setData(double[])} methods and thereafter {@link #evaluate(double)}
 * with just the percentile provided.
 * </p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 * @version $Id$
 */
public class Percentile extends AbstractUnivariateStatistic implements Serializable {public static class __CLR4_4_114g514g5lb90paox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -8091216485095130416L;

    /** Minimum size under which we use a simple insertion sort rather than Hoare's select. */
    private static final int MIN_SELECT_SIZE = 15;

    /** Maximum number of partitioning pivots cached (each level double the number of pivots). */
    private static final int MAX_CACHED_LEVELS = 10;

    /** Determines what percentile is computed when evaluate() is activated
     * with no quantile argument */
    private double quantile = 0.0;

    /** Cached pivots. */
    private int[] cachedPivots;

    /**
     * Constructs a Percentile with a default quantile
     * value of 50.0.
     */
    public Percentile() {
        // No try-catch or advertised exception here - arg is valid
        this(50.0);__CLR4_4_114g514g5lb90paox.R.inc(52422);try{__CLR4_4_114g514g5lb90paox.R.inc(52421);
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Constructs a Percentile with the specific quantile value.
     * @param p the quantile
     * @throws MathIllegalArgumentException  if p is not greater than 0 and less
     * than or equal to 100
     */
    public Percentile(final double p) throws MathIllegalArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52423);
        __CLR4_4_114g514g5lb90paox.R.inc(52424);setQuantile(p);
        __CLR4_4_114g514g5lb90paox.R.inc(52425);cachedPivots = null;
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code Percentile} identical
     * to the {@code original}
     *
     * @param original the {@code Percentile} instance to copy
     * @throws NullArgumentException if original is null
     */
    public Percentile(Percentile original) throws NullArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52426);
        __CLR4_4_114g514g5lb90paox.R.inc(52427);copy(original, this);
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setData(final double[] values) {try{__CLR4_4_114g514g5lb90paox.R.inc(52428);
        __CLR4_4_114g514g5lb90paox.R.inc(52429);if ((((values == null)&&(__CLR4_4_114g514g5lb90paox.R.iget(52430)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52431)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52432);cachedPivots = null;
        } }else {{
            __CLR4_4_114g514g5lb90paox.R.inc(52433);cachedPivots = new int[(0x1 << MAX_CACHED_LEVELS) - 1];
            __CLR4_4_114g514g5lb90paox.R.inc(52434);Arrays.fill(cachedPivots, -1);
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52435);super.setData(values);
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setData(final double[] values, final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52436);
        __CLR4_4_114g514g5lb90paox.R.inc(52437);if ((((values == null)&&(__CLR4_4_114g514g5lb90paox.R.iget(52438)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52439)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52440);cachedPivots = null;
        } }else {{
            __CLR4_4_114g514g5lb90paox.R.inc(52441);cachedPivots = new int[(0x1 << MAX_CACHED_LEVELS) - 1];
            __CLR4_4_114g514g5lb90paox.R.inc(52442);Arrays.fill(cachedPivots, -1);
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52443);super.setData(values, begin, length);
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Returns the result of evaluating the statistic over the stored data.
     * <p>
     * The stored array is the one which was set by previous calls to
     * {@link #setData(double[])}
     * </p>
     * @param p the percentile value to compute
     * @return the value of the statistic applied to the stored data
     * @throws MathIllegalArgumentException if p is not a valid quantile value
     * (p must be greater than 0 and less than or equal to 100)
     */
    public double evaluate(final double p) throws MathIllegalArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52444);
        __CLR4_4_114g514g5lb90paox.R.inc(52445);return evaluate(getDataRef(), p);
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Returns an estimate of the <code>p</code>th percentile of the values
     * in the <code>values</code> array.
     * <p>
     * Calls to this method do not modify the internal <code>quantile</code>
     * state of this statistic.</p>
     * <p>
     * <ul>
     * <li>Returns <code>Double.NaN</code> if <code>values</code> has length
     * <code>0</code></li>
     * <li>Returns (for any value of <code>p</code>) <code>values[0]</code>
     *  if <code>values</code> has length <code>1</code></li>
     * <li>Throws <code>MathIllegalArgumentException</code> if <code>values</code>
     * is null or p is not a valid quantile value (p must be greater than 0
     * and less than or equal to 100) </li>
     * </ul></p>
     * <p>
     * See {@link Percentile} for a description of the percentile estimation
     * algorithm used.</p>
     *
     * @param values input array of values
     * @param p the percentile value to compute
     * @return the percentile value or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if <code>values</code> is null
     *     or p is invalid
     */
    public double evaluate(final double[] values, final double p)
    throws MathIllegalArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52446);
        __CLR4_4_114g514g5lb90paox.R.inc(52447);test(values, 0, 0);
        __CLR4_4_114g514g5lb90paox.R.inc(52448);return evaluate(values, 0, values.length, p);
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Returns an estimate of the <code>quantile</code>th percentile of the
     * designated values in the <code>values</code> array.  The quantile
     * estimated is determined by the <code>quantile</code> property.
     * <p>
     * <ul>
     * <li>Returns <code>Double.NaN</code> if <code>length = 0</code></li>
     * <li>Returns (for any value of <code>quantile</code>)
     * <code>values[begin]</code> if <code>length = 1 </code></li>
     * <li>Throws <code>MathIllegalArgumentException</code> if <code>values</code>
     * is null, or <code>start</code> or <code>length</code> is invalid</li>
     * </ul></p>
     * <p>
     * See {@link Percentile} for a description of the percentile estimation
     * algorithm used.</p>
     *
     * @param values the input array
     * @param start index of the first array element to include
     * @param length the number of elements to include
     * @return the percentile value
     * @throws MathIllegalArgumentException if the parameters are not valid
     *
     */
    @Override
    public double evaluate(final double[] values, final int start, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52449);
        __CLR4_4_114g514g5lb90paox.R.inc(52450);return evaluate(values, start, length, quantile);
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

     /**
     * Returns an estimate of the <code>p</code>th percentile of the values
     * in the <code>values</code> array, starting with the element in (0-based)
     * position <code>begin</code> in the array and including <code>length</code>
     * values.
     * <p>
     * Calls to this method do not modify the internal <code>quantile</code>
     * state of this statistic.</p>
     * <p>
     * <ul>
     * <li>Returns <code>Double.NaN</code> if <code>length = 0</code></li>
     * <li>Returns (for any value of <code>p</code>) <code>values[begin]</code>
     *  if <code>length = 1 </code></li>
     * <li>Throws <code>MathIllegalArgumentException</code> if <code>values</code>
     *  is null , <code>begin</code> or <code>length</code> is invalid, or
     * <code>p</code> is not a valid quantile value (p must be greater than 0
     * and less than or equal to 100)</li>
     * </ul></p>
     * <p>
     * See {@link Percentile} for a description of the percentile estimation
     * algorithm used.</p>
     *
     * @param values array of input values
     * @param p  the percentile to compute
     * @param begin  the first (0-based) element to include in the computation
     * @param length  the number of array elements to include
     * @return  the percentile value
     * @throws MathIllegalArgumentException if the parameters are not valid or the
     * input array is null
     */
    public double evaluate(final double[] values, final int begin,
            final int length, final double p) throws MathIllegalArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52451);

        __CLR4_4_114g514g5lb90paox.R.inc(52452);test(values, begin, length);

        __CLR4_4_114g514g5lb90paox.R.inc(52453);if (((((p > 100) || (p <= 0))&&(__CLR4_4_114g514g5lb90paox.R.iget(52454)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52455)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52456);throw new OutOfRangeException(
                    LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE, p, 0, 100);
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52457);if ((((length == 0)&&(__CLR4_4_114g514g5lb90paox.R.iget(52458)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52459)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52460);return Double.NaN;
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52461);if ((((length == 1)&&(__CLR4_4_114g514g5lb90paox.R.iget(52462)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52463)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52464);return values[begin]; // always return single value for n = 1
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52465);double n = length;
        __CLR4_4_114g514g5lb90paox.R.inc(52466);double pos = p * (n + 1) / 100;
        __CLR4_4_114g514g5lb90paox.R.inc(52467);double fpos = FastMath.floor(pos);
        __CLR4_4_114g514g5lb90paox.R.inc(52468);int intPos = (int) fpos;
        __CLR4_4_114g514g5lb90paox.R.inc(52469);double dif = pos - fpos;
        __CLR4_4_114g514g5lb90paox.R.inc(52470);double[] work;
        __CLR4_4_114g514g5lb90paox.R.inc(52471);int[] pivotsHeap;
        __CLR4_4_114g514g5lb90paox.R.inc(52472);if ((((values == getDataRef())&&(__CLR4_4_114g514g5lb90paox.R.iget(52473)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52474)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52475);work = getDataRef();
            __CLR4_4_114g514g5lb90paox.R.inc(52476);pivotsHeap = cachedPivots;
        } }else {{
            __CLR4_4_114g514g5lb90paox.R.inc(52477);work = new double[length];
            __CLR4_4_114g514g5lb90paox.R.inc(52478);System.arraycopy(values, begin, work, 0, length);
            __CLR4_4_114g514g5lb90paox.R.inc(52479);pivotsHeap = new int[(0x1 << MAX_CACHED_LEVELS) - 1];
            __CLR4_4_114g514g5lb90paox.R.inc(52480);Arrays.fill(pivotsHeap, -1);
        }

        }__CLR4_4_114g514g5lb90paox.R.inc(52481);if ((((pos < 1)&&(__CLR4_4_114g514g5lb90paox.R.iget(52482)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52483)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52484);return select(work, pivotsHeap, 0);
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52485);if ((((pos >= n)&&(__CLR4_4_114g514g5lb90paox.R.iget(52486)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52487)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52488);return select(work, pivotsHeap, length - 1);
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52489);double lower = select(work, pivotsHeap, intPos - 1);
        __CLR4_4_114g514g5lb90paox.R.inc(52490);double upper = select(work, pivotsHeap, intPos);
        __CLR4_4_114g514g5lb90paox.R.inc(52491);return lower + dif * (upper - lower);
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Select the k<sup>th</sup> smallest element from work array
     * @param work work array (will be reorganized during the call)
     * @param pivotsHeap set of pivot index corresponding to elements that
     * are already at their sorted location, stored as an implicit heap
     * (i.e. a sorted binary tree stored in a flat array, where the
     * children of a node at index n are at indices 2n+1 for the left
     * child and 2n+2 for the right child, with 0-based indices)
     * @param k index of the desired element
     * @return k<sup>th</sup> smallest element
     */
    private double select(final double[] work, final int[] pivotsHeap, final int k) {try{__CLR4_4_114g514g5lb90paox.R.inc(52492);

        __CLR4_4_114g514g5lb90paox.R.inc(52493);int begin = 0;
        __CLR4_4_114g514g5lb90paox.R.inc(52494);int end   = work.length;
        __CLR4_4_114g514g5lb90paox.R.inc(52495);int node  = 0;

        __CLR4_4_114g514g5lb90paox.R.inc(52496);while ((((end - begin > MIN_SELECT_SIZE)&&(__CLR4_4_114g514g5lb90paox.R.iget(52497)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52498)==0&false))) {{

            __CLR4_4_114g514g5lb90paox.R.inc(52499);final int pivot;
            __CLR4_4_114g514g5lb90paox.R.inc(52500);if (((((node < pivotsHeap.length) && (pivotsHeap[node] >= 0))&&(__CLR4_4_114g514g5lb90paox.R.iget(52501)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52502)==0&false))) {{
                // the pivot has already been found in a previous call
                // and the array has already been partitioned around it
                __CLR4_4_114g514g5lb90paox.R.inc(52503);pivot = pivotsHeap[node];
            } }else {{
                // select a pivot and partition work array around it
                __CLR4_4_114g514g5lb90paox.R.inc(52504);pivot = partition(work, begin, end, medianOf3(work, begin, end));
                __CLR4_4_114g514g5lb90paox.R.inc(52505);if ((((node < pivotsHeap.length)&&(__CLR4_4_114g514g5lb90paox.R.iget(52506)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52507)==0&false))) {{
                    __CLR4_4_114g514g5lb90paox.R.inc(52508);pivotsHeap[node] =  pivot;
                }
            }}

            }__CLR4_4_114g514g5lb90paox.R.inc(52509);if ((((k == pivot)&&(__CLR4_4_114g514g5lb90paox.R.iget(52510)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52511)==0&false))) {{
                // the pivot was exactly the element we wanted
                __CLR4_4_114g514g5lb90paox.R.inc(52512);return work[k];
            } }else {__CLR4_4_114g514g5lb90paox.R.inc(52513);if ((((k < pivot)&&(__CLR4_4_114g514g5lb90paox.R.iget(52514)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52515)==0&false))) {{
                // the element is in the left partition
                __CLR4_4_114g514g5lb90paox.R.inc(52516);end  = pivot;
                __CLR4_4_114g514g5lb90paox.R.inc(52517);node = FastMath.min(2 * node + 1, pivotsHeap.length); // the min is here to avoid integer overflow
            } }else {{
                // the element is in the right partition
                __CLR4_4_114g514g5lb90paox.R.inc(52518);begin = pivot + 1;
                __CLR4_4_114g514g5lb90paox.R.inc(52519);node  = FastMath.min(2 * node + 2, pivotsHeap.length); // the min is here to avoid integer overflow
            }

        }}}

        // the element is somewhere in the small sub-array
        // sort the sub-array using insertion sort
        }__CLR4_4_114g514g5lb90paox.R.inc(52520);insertionSort(work, begin, end);
        __CLR4_4_114g514g5lb90paox.R.inc(52521);return work[k];

    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /** Select a pivot index as the median of three
     * @param work data array
     * @param begin index of the first element of the slice
     * @param end index after the last element of the slice
     * @return the index of the median element chosen between the
     * first, the middle and the last element of the array slice
     */
    int medianOf3(final double[] work, final int begin, final int end) {try{__CLR4_4_114g514g5lb90paox.R.inc(52522);

        __CLR4_4_114g514g5lb90paox.R.inc(52523);final int inclusiveEnd = end - 1;
        __CLR4_4_114g514g5lb90paox.R.inc(52524);final int    middle    = begin + (inclusiveEnd - begin) / 2;
        __CLR4_4_114g514g5lb90paox.R.inc(52525);final double wBegin    = work[begin];
        __CLR4_4_114g514g5lb90paox.R.inc(52526);final double wMiddle   = work[middle];
        __CLR4_4_114g514g5lb90paox.R.inc(52527);final double wEnd      = work[inclusiveEnd];

        __CLR4_4_114g514g5lb90paox.R.inc(52528);if ((((wBegin < wMiddle)&&(__CLR4_4_114g514g5lb90paox.R.iget(52529)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52530)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52531);if ((((wMiddle < wEnd)&&(__CLR4_4_114g514g5lb90paox.R.iget(52532)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52533)==0&false))) {{
                __CLR4_4_114g514g5lb90paox.R.inc(52534);return middle;
            } }else {{
                __CLR4_4_114g514g5lb90paox.R.inc(52535);return ((((wBegin < wEnd) )&&(__CLR4_4_114g514g5lb90paox.R.iget(52536)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52537)==0&false))? inclusiveEnd : begin;
            }
        }} }else {{
            __CLR4_4_114g514g5lb90paox.R.inc(52538);if ((((wBegin < wEnd)&&(__CLR4_4_114g514g5lb90paox.R.iget(52539)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52540)==0&false))) {{
                __CLR4_4_114g514g5lb90paox.R.inc(52541);return begin;
            } }else {{
                __CLR4_4_114g514g5lb90paox.R.inc(52542);return ((((wMiddle < wEnd) )&&(__CLR4_4_114g514g5lb90paox.R.iget(52543)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52544)==0&false))? inclusiveEnd : middle;
            }
        }}

    }}finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Partition an array slice around a pivot
     * <p>
     * Partitioning exchanges array elements such that all elements
     * smaller than pivot are before it and all elements larger than
     * pivot are after it
     * </p>
     * @param work data array
     * @param begin index of the first element of the slice
     * @param end index after the last element of the slice
     * @param pivot initial index of the pivot
     * @return index of the pivot after partition
     */
    private int partition(final double[] work, final int begin, final int end, final int pivot) {try{__CLR4_4_114g514g5lb90paox.R.inc(52545);

        __CLR4_4_114g514g5lb90paox.R.inc(52546);final double value = work[pivot];
        __CLR4_4_114g514g5lb90paox.R.inc(52547);work[pivot] = work[begin];

        __CLR4_4_114g514g5lb90paox.R.inc(52548);int i = begin + 1;
        __CLR4_4_114g514g5lb90paox.R.inc(52549);int j = end - 1;
        __CLR4_4_114g514g5lb90paox.R.inc(52550);while ((((i < j)&&(__CLR4_4_114g514g5lb90paox.R.iget(52551)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52552)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52553);while (((((i < j) && (work[j] > value))&&(__CLR4_4_114g514g5lb90paox.R.iget(52554)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52555)==0&false))) {{
                __CLR4_4_114g514g5lb90paox.R.inc(52556);--j;
            }
            }__CLR4_4_114g514g5lb90paox.R.inc(52557);while (((((i < j) && (work[i] < value))&&(__CLR4_4_114g514g5lb90paox.R.iget(52558)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52559)==0&false))) {{
                __CLR4_4_114g514g5lb90paox.R.inc(52560);++i;
            }

            }__CLR4_4_114g514g5lb90paox.R.inc(52561);if ((((i < j)&&(__CLR4_4_114g514g5lb90paox.R.iget(52562)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52563)==0&false))) {{
                __CLR4_4_114g514g5lb90paox.R.inc(52564);final double tmp = work[i];
                __CLR4_4_114g514g5lb90paox.R.inc(52565);work[i++] = work[j];
                __CLR4_4_114g514g5lb90paox.R.inc(52566);work[j--] = tmp;
            }
        }}

        }__CLR4_4_114g514g5lb90paox.R.inc(52567);if (((((i >= end) || (work[i] > value))&&(__CLR4_4_114g514g5lb90paox.R.iget(52568)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52569)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52570);--i;
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52571);work[begin] = work[i];
        __CLR4_4_114g514g5lb90paox.R.inc(52572);work[i]     = value;
        __CLR4_4_114g514g5lb90paox.R.inc(52573);return i;

    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Sort in place a (small) array slice using insertion sort
     * @param work array to sort
     * @param begin index of the first element of the slice to sort
     * @param end index after the last element of the slice to sort
     */
    private void insertionSort(final double[] work, final int begin, final int end) {try{__CLR4_4_114g514g5lb90paox.R.inc(52574);
        __CLR4_4_114g514g5lb90paox.R.inc(52575);for (int j = begin + 1; (((j < end)&&(__CLR4_4_114g514g5lb90paox.R.iget(52576)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52577)==0&false)); j++) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52578);final double saved = work[j];
            __CLR4_4_114g514g5lb90paox.R.inc(52579);int i = j - 1;
            __CLR4_4_114g514g5lb90paox.R.inc(52580);while (((((i >= begin) && (saved < work[i]))&&(__CLR4_4_114g514g5lb90paox.R.iget(52581)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52582)==0&false))) {{
                __CLR4_4_114g514g5lb90paox.R.inc(52583);work[i + 1] = work[i];
                __CLR4_4_114g514g5lb90paox.R.inc(52584);i--;
            }
            }__CLR4_4_114g514g5lb90paox.R.inc(52585);work[i + 1] = saved;
        }
    }}finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Returns the value of the quantile field (determines what percentile is
     * computed when evaluate() is called with no quantile argument).
     *
     * @return quantile
     */
    public double getQuantile() {try{__CLR4_4_114g514g5lb90paox.R.inc(52586);
        __CLR4_4_114g514g5lb90paox.R.inc(52587);return quantile;
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Sets the value of the quantile field (determines what percentile is
     * computed when evaluate() is called with no quantile argument).
     *
     * @param p a value between 0 < p <= 100
     * @throws MathIllegalArgumentException  if p is not greater than 0 and less
     * than or equal to 100
     */
    public void setQuantile(final double p) throws MathIllegalArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52588);
        __CLR4_4_114g514g5lb90paox.R.inc(52589);if ((((p <= 0 || p > 100)&&(__CLR4_4_114g514g5lb90paox.R.iget(52590)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52591)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52592);throw new OutOfRangeException(
                    LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE, p, 0, 100);
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52593);quantile = p;
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Percentile copy() {try{__CLR4_4_114g514g5lb90paox.R.inc(52594);
        __CLR4_4_114g514g5lb90paox.R.inc(52595);Percentile result = new Percentile();
        //No try-catch or advertised exception because args are guaranteed non-null
        __CLR4_4_114g514g5lb90paox.R.inc(52596);copy(this, result);
        __CLR4_4_114g514g5lb90paox.R.inc(52597);return result;
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source Percentile to copy
     * @param dest Percentile to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(Percentile source, Percentile dest)
        throws NullArgumentException {try{__CLR4_4_114g514g5lb90paox.R.inc(52598);
        __CLR4_4_114g514g5lb90paox.R.inc(52599);MathUtils.checkNotNull(source);
        __CLR4_4_114g514g5lb90paox.R.inc(52600);MathUtils.checkNotNull(dest);
        __CLR4_4_114g514g5lb90paox.R.inc(52601);dest.setData(source.getDataRef());
        __CLR4_4_114g514g5lb90paox.R.inc(52602);if ((((source.cachedPivots != null)&&(__CLR4_4_114g514g5lb90paox.R.iget(52603)!=0|true))||(__CLR4_4_114g514g5lb90paox.R.iget(52604)==0&false))) {{
            __CLR4_4_114g514g5lb90paox.R.inc(52605);System.arraycopy(source.cachedPivots, 0, dest.cachedPivots, 0, source.cachedPivots.length);
        }
        }__CLR4_4_114g514g5lb90paox.R.inc(52606);dest.quantile = source.quantile;
    }finally{__CLR4_4_114g514g5lb90paox.R.flushNeeded();}}

}
