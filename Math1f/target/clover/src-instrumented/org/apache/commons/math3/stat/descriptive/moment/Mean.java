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
package org.apache.commons.math3.stat.descriptive.moment;

import java.io.Serializable;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.WeightedEvaluation;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.util.MathUtils;

/**
 * <p>Computes the arithmetic mean of a set of values. Uses the definitional
 * formula:</p>
 * <p>
 * mean = sum(x_i) / n
 * </p>
 * <p>where <code>n</code> is the number of observations.
 * </p>
 * <p>When {@link #increment(double)} is used to add data incrementally from a
 * stream of (unstored) values, the value of the statistic that
 * {@link #getResult()} returns is computed using the following recursive
 * updating algorithm: </p>
 * <ol>
 * <li>Initialize <code>m = </code> the first value</li>
 * <li>For each additional value, update using <br>
 *   <code>m = m + (new value - m) / (number of observations)</code></li>
 * </ol>
 * <p> If {@link #evaluate(double[])} is used to compute the mean of an array
 * of stored values, a two-pass, corrected algorithm is used, starting with
 * the definitional formula computed using the array of stored values and then
 * correcting this by adding the mean deviation of the data values from the
 * arithmetic mean. See, e.g. "Comparison of Several Algorithms for Computing
 * Sample Means and Variances," Robert F. Ling, Journal of the American
 * Statistical Association, Vol. 69, No. 348 (Dec., 1974), pp. 859-866. </p>
 * <p>
 *  Returns <code>Double.NaN</code> if the dataset is empty.
 * </p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.
 *
 * @version $Id$
 */
public class Mean extends AbstractStorelessUnivariateStatistic
    implements Serializable, WeightedEvaluation {public static class __CLR4_4_113xb13xblb90panp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51805,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -1296043746617791564L;

    /** First moment on which this statistic is based. */
    protected FirstMoment moment;

    /**
     * Determines whether or not this statistic can be incremented or cleared.
     * <p>
     * Statistics based on (constructed from) external moments cannot
     * be incremented or cleared.</p>
     */
    protected boolean incMoment;

    /** Constructs a Mean. */
    public Mean() {try{__CLR4_4_113xb13xblb90panp.R.inc(51743);
        __CLR4_4_113xb13xblb90panp.R.inc(51744);incMoment = true;
        __CLR4_4_113xb13xblb90panp.R.inc(51745);moment = new FirstMoment();
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * Constructs a Mean with an External Moment.
     *
     * @param m1 the moment
     */
    public Mean(final FirstMoment m1) {try{__CLR4_4_113xb13xblb90panp.R.inc(51746);
        __CLR4_4_113xb13xblb90panp.R.inc(51747);this.moment = m1;
        __CLR4_4_113xb13xblb90panp.R.inc(51748);incMoment = false;
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code Mean} identical
     * to the {@code original}
     *
     * @param original the {@code Mean} instance to copy
     * @throws NullArgumentException if original is null
     */
    public Mean(Mean original) throws NullArgumentException {try{__CLR4_4_113xb13xblb90panp.R.inc(51749);
        __CLR4_4_113xb13xblb90panp.R.inc(51750);copy(original, this);
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>Note that when {@link #Mean(FirstMoment)} is used to
     * create a Mean, this method does nothing. In that case, the
     * FirstMoment should be incremented directly.</p>
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_113xb13xblb90panp.R.inc(51751);
        __CLR4_4_113xb13xblb90panp.R.inc(51752);if ((((incMoment)&&(__CLR4_4_113xb13xblb90panp.R.iget(51753)!=0|true))||(__CLR4_4_113xb13xblb90panp.R.iget(51754)==0&false))) {{
            __CLR4_4_113xb13xblb90panp.R.inc(51755);moment.increment(d);
        }
    }}finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_113xb13xblb90panp.R.inc(51756);
        __CLR4_4_113xb13xblb90panp.R.inc(51757);if ((((incMoment)&&(__CLR4_4_113xb13xblb90panp.R.iget(51758)!=0|true))||(__CLR4_4_113xb13xblb90panp.R.iget(51759)==0&false))) {{
            __CLR4_4_113xb13xblb90panp.R.inc(51760);moment.clear();
        }
    }}finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_113xb13xblb90panp.R.inc(51761);
        __CLR4_4_113xb13xblb90panp.R.inc(51762);return moment.m1;
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_113xb13xblb90panp.R.inc(51763);
        __CLR4_4_113xb13xblb90panp.R.inc(51764);return moment.getN();
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * Returns the arithmetic mean of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     * <p>
     * See {@link Mean} for details on the computing algorithm.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the mean of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    @Override
    public double evaluate(final double[] values,final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_113xb13xblb90panp.R.inc(51765);
        __CLR4_4_113xb13xblb90panp.R.inc(51766);if ((((test(values, begin, length))&&(__CLR4_4_113xb13xblb90panp.R.iget(51767)!=0|true))||(__CLR4_4_113xb13xblb90panp.R.iget(51768)==0&false))) {{
            __CLR4_4_113xb13xblb90panp.R.inc(51769);Sum sum = new Sum();
            __CLR4_4_113xb13xblb90panp.R.inc(51770);double sampleSize = length;

            // Compute initial estimate using definitional formula
            __CLR4_4_113xb13xblb90panp.R.inc(51771);double xbar = sum.evaluate(values, begin, length) / sampleSize;

            // Compute correction factor in second pass
            __CLR4_4_113xb13xblb90panp.R.inc(51772);double correction = 0;
            __CLR4_4_113xb13xblb90panp.R.inc(51773);for (int i = begin; (((i < begin + length)&&(__CLR4_4_113xb13xblb90panp.R.iget(51774)!=0|true))||(__CLR4_4_113xb13xblb90panp.R.iget(51775)==0&false)); i++) {{
                __CLR4_4_113xb13xblb90panp.R.inc(51776);correction += values[i] - xbar;
            }
            }__CLR4_4_113xb13xblb90panp.R.inc(51777);return xbar + (correction/sampleSize);
        }
        }__CLR4_4_113xb13xblb90panp.R.inc(51778);return Double.NaN;
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * Returns the weighted arithmetic mean of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if either array is null.</p>
     * <p>
     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm
     * described above is used here, with weights applied in computing both the original
     * estimate and the correction factor.</p>
     * <p>
     * Throws <code>IllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     *     <li>the start and length arguments do not determine a valid array</li>
     * </ul></p>
     *
     * @param values the input array
     * @param weights the weights array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the mean of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the parameters are not valid
     * @since 2.1
     */
    public double evaluate(final double[] values, final double[] weights,
                           final int begin, final int length) throws MathIllegalArgumentException {try{__CLR4_4_113xb13xblb90panp.R.inc(51779);
        __CLR4_4_113xb13xblb90panp.R.inc(51780);if ((((test(values, weights, begin, length))&&(__CLR4_4_113xb13xblb90panp.R.iget(51781)!=0|true))||(__CLR4_4_113xb13xblb90panp.R.iget(51782)==0&false))) {{
            __CLR4_4_113xb13xblb90panp.R.inc(51783);Sum sum = new Sum();

            // Compute initial estimate using definitional formula
            __CLR4_4_113xb13xblb90panp.R.inc(51784);double sumw = sum.evaluate(weights,begin,length);
            __CLR4_4_113xb13xblb90panp.R.inc(51785);double xbarw = sum.evaluate(values, weights, begin, length) / sumw;

            // Compute correction factor in second pass
            __CLR4_4_113xb13xblb90panp.R.inc(51786);double correction = 0;
            __CLR4_4_113xb13xblb90panp.R.inc(51787);for (int i = begin; (((i < begin + length)&&(__CLR4_4_113xb13xblb90panp.R.iget(51788)!=0|true))||(__CLR4_4_113xb13xblb90panp.R.iget(51789)==0&false)); i++) {{
                __CLR4_4_113xb13xblb90panp.R.inc(51790);correction += weights[i] * (values[i] - xbarw);
            }
            }__CLR4_4_113xb13xblb90panp.R.inc(51791);return xbarw + (correction/sumw);
        }
        }__CLR4_4_113xb13xblb90panp.R.inc(51792);return Double.NaN;
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * Returns the weighted arithmetic mean of the entries in the input array.
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if either array is null.</p>
     * <p>
     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm
     * described above is used here, with weights applied in computing both the original
     * estimate and the correction factor.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     * </ul></p>
     *
     * @param values the input array
     * @param weights the weights array
     * @return the mean of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the parameters are not valid
     * @since 2.1
     */
    public double evaluate(final double[] values, final double[] weights)
    throws MathIllegalArgumentException {try{__CLR4_4_113xb13xblb90panp.R.inc(51793);
        __CLR4_4_113xb13xblb90panp.R.inc(51794);return evaluate(values, weights, 0, values.length);
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Mean copy() {try{__CLR4_4_113xb13xblb90panp.R.inc(51795);
        __CLR4_4_113xb13xblb90panp.R.inc(51796);Mean result = new Mean();
        // No try-catch or advertised exception because args are guaranteed non-null
        __CLR4_4_113xb13xblb90panp.R.inc(51797);copy(this, result);
        __CLR4_4_113xb13xblb90panp.R.inc(51798);return result;
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}


    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source Mean to copy
     * @param dest Mean to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(Mean source, Mean dest)
        throws NullArgumentException {try{__CLR4_4_113xb13xblb90panp.R.inc(51799);
        __CLR4_4_113xb13xblb90panp.R.inc(51800);MathUtils.checkNotNull(source);
        __CLR4_4_113xb13xblb90panp.R.inc(51801);MathUtils.checkNotNull(dest);
        __CLR4_4_113xb13xblb90panp.R.inc(51802);dest.setData(source.getDataRef());
        __CLR4_4_113xb13xblb90panp.R.inc(51803);dest.incMoment = source.incMoment;
        __CLR4_4_113xb13xblb90panp.R.inc(51804);dest.moment = source.moment.copy();
    }finally{__CLR4_4_113xb13xblb90panp.R.flushNeeded();}}
}
