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
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.WeightedEvaluation;
import org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math3.util.MathUtils;

/**
 * Computes the variance of the available values.  By default, the unbiased
 * "sample variance" definitional formula is used:
 * <p>
 * variance = sum((x_i - mean)^2) / (n - 1) </p>
 * <p>
 * where mean is the {@link Mean} and <code>n</code> is the number
 * of sample observations.</p>
 * <p>
 * The definitional formula does not have good numerical properties, so
 * this implementation does not compute the statistic using the definitional
 * formula. <ul>
 * <li> The <code>getResult</code> method computes the variance using
 * updating formulas based on West's algorithm, as described in
 * <a href="http://doi.acm.org/10.1145/359146.359152"> Chan, T. F. and
 * J. G. Lewis 1979, <i>Communications of the ACM</i>,
 * vol. 22 no. 9, pp. 526-531.</a></li>
 * <li> The <code>evaluate</code> methods leverage the fact that they have the
 * full array of values in memory to execute a two-pass algorithm.
 * Specifically, these methods use the "corrected two-pass algorithm" from
 * Chan, Golub, Levesque, <i>Algorithms for Computing the Sample Variance</i>,
 * American Statistician, vol. 37, no. 3 (1983) pp. 242-247.</li></ul>
 * Note that adding values using <code>increment</code> or
 * <code>incrementAll</code> and then executing <code>getResult</code> will
 * sometimes give a different, less accurate, result than executing
 * <code>evaluate</code> with the full array of values. The former approach
 * should only be used when the full array of values is not available.</p>
 * <p>
 * The "population variance"  ( sum((x_i - mean)^2) / n ) can also
 * be computed using this statistic.  The <code>isBiasCorrected</code>
 * property determines whether the "population" or "sample" value is
 * returned by the <code>evaluate</code> and <code>getResult</code> methods.
 * To compute population variances, set this property to <code>false.</code>
 * </p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 * @version $Id$
 */
public class Variance extends AbstractStorelessUnivariateStatistic implements Serializable, WeightedEvaluation {public static class __CLR4_4_1145j145jlb90paob{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52200,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -9111962718267217978L;

    /** SecondMoment is used in incremental calculation of Variance*/
    protected SecondMoment moment = null;

    /**
     * Whether or not {@link #increment(double)} should increment
     * the internal second moment. When a Variance is constructed with an
     * external SecondMoment as a constructor parameter, this property is
     * set to false and increments must be applied to the second moment
     * directly.
     */
    protected boolean incMoment = true;

    /**
     * Whether or not bias correction is applied when computing the
     * value of the statistic. True means that bias is corrected.  See
     * {@link Variance} for details on the formula.
     */
    private boolean isBiasCorrected = true;

    /**
     * Constructs a Variance with default (true) <code>isBiasCorrected</code>
     * property.
     */
    public Variance() {try{__CLR4_4_1145j145jlb90paob.R.inc(52039);
        __CLR4_4_1145j145jlb90paob.R.inc(52040);moment = new SecondMoment();
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Constructs a Variance based on an external second moment.
     * When this constructor is used, the statistic may only be
     * incremented via the moment, i.e., {@link #increment(double)}
     * does nothing; whereas {@code m2.increment(value)} increments
     * both {@code m2} and the Variance instance constructed from it.
     *
     * @param m2 the SecondMoment (Third or Fourth moments work
     * here as well.)
     */
    public Variance(final SecondMoment m2) {try{__CLR4_4_1145j145jlb90paob.R.inc(52041);
        __CLR4_4_1145j145jlb90paob.R.inc(52042);incMoment = false;
        __CLR4_4_1145j145jlb90paob.R.inc(52043);this.moment = m2;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Constructs a Variance with the specified <code>isBiasCorrected</code>
     * property
     *
     * @param isBiasCorrected  setting for bias correction - true means
     * bias will be corrected and is equivalent to using the argumentless
     * constructor
     */
    public Variance(boolean isBiasCorrected) {try{__CLR4_4_1145j145jlb90paob.R.inc(52044);
        __CLR4_4_1145j145jlb90paob.R.inc(52045);moment = new SecondMoment();
        __CLR4_4_1145j145jlb90paob.R.inc(52046);this.isBiasCorrected = isBiasCorrected;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Constructs a Variance with the specified <code>isBiasCorrected</code>
     * property and the supplied external second moment.
     *
     * @param isBiasCorrected  setting for bias correction - true means
     * bias will be corrected
     * @param m2 the SecondMoment (Third or Fourth moments work
     * here as well.)
     */
    public Variance(boolean isBiasCorrected, SecondMoment m2) {try{__CLR4_4_1145j145jlb90paob.R.inc(52047);
        __CLR4_4_1145j145jlb90paob.R.inc(52048);incMoment = false;
        __CLR4_4_1145j145jlb90paob.R.inc(52049);this.moment = m2;
        __CLR4_4_1145j145jlb90paob.R.inc(52050);this.isBiasCorrected = isBiasCorrected;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code Variance} identical
     * to the {@code original}
     *
     * @param original the {@code Variance} instance to copy
     * @throws NullArgumentException if original is null
     */
    public Variance(Variance original) throws NullArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52051);
        __CLR4_4_1145j145jlb90paob.R.inc(52052);copy(original, this);
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>If all values are available, it is more accurate to use
     * {@link #evaluate(double[])} rather than adding values one at a time
     * using this method and then executing {@link #getResult}, since
     * <code>evaluate</code> leverages the fact that is has the full
     * list of values together to execute a two-pass algorithm.
     * See {@link Variance}.</p>
     *
     * <p>Note also that when {@link #Variance(SecondMoment)} is used to
     * create a Variance, this method does nothing. In that case, the
     * SecondMoment should be incremented directly.</p>
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_1145j145jlb90paob.R.inc(52053);
        __CLR4_4_1145j145jlb90paob.R.inc(52054);if ((((incMoment)&&(__CLR4_4_1145j145jlb90paob.R.iget(52055)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52056)==0&false))) {{
            __CLR4_4_1145j145jlb90paob.R.inc(52057);moment.increment(d);
        }
    }}finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_1145j145jlb90paob.R.inc(52058);
            __CLR4_4_1145j145jlb90paob.R.inc(52059);if ((((moment.n == 0)&&(__CLR4_4_1145j145jlb90paob.R.iget(52060)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52061)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52062);return Double.NaN;
            } }else {__CLR4_4_1145j145jlb90paob.R.inc(52063);if ((((moment.n == 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52064)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52065)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52066);return 0d;
            } }else {{
                __CLR4_4_1145j145jlb90paob.R.inc(52067);if ((((isBiasCorrected)&&(__CLR4_4_1145j145jlb90paob.R.iget(52068)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52069)==0&false))) {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52070);return moment.m2 / (moment.n - 1d);
                } }else {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52071);return moment.m2 / (moment.n);
                }
            }}
    }}}finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_1145j145jlb90paob.R.inc(52072);
        __CLR4_4_1145j145jlb90paob.R.inc(52073);return moment.getN();
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_1145j145jlb90paob.R.inc(52074);
        __CLR4_4_1145j145jlb90paob.R.inc(52075);if ((((incMoment)&&(__CLR4_4_1145j145jlb90paob.R.iget(52076)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52077)==0&false))) {{
            __CLR4_4_1145j145jlb90paob.R.inc(52078);moment.clear();
        }
    }}finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Returns the variance of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * See {@link Variance} for details on the computing algorithm.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @return the variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null
     */
    @Override
    public double evaluate(final double[] values) throws MathIllegalArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52079);
        __CLR4_4_1145j145jlb90paob.R.inc(52080);if ((((values == null)&&(__CLR4_4_1145j145jlb90paob.R.iget(52081)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52082)==0&false))) {{
            __CLR4_4_1145j145jlb90paob.R.inc(52083);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }
        }__CLR4_4_1145j145jlb90paob.R.inc(52084);return evaluate(values, 0, values.length);
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Returns the variance of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * See {@link Variance} for details on the computing algorithm.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    @Override
    public double evaluate(final double[] values, final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52085);

        __CLR4_4_1145j145jlb90paob.R.inc(52086);double var = Double.NaN;

        __CLR4_4_1145j145jlb90paob.R.inc(52087);if ((((test(values, begin, length))&&(__CLR4_4_1145j145jlb90paob.R.iget(52088)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52089)==0&false))) {{
            __CLR4_4_1145j145jlb90paob.R.inc(52090);clear();
            __CLR4_4_1145j145jlb90paob.R.inc(52091);if ((((length == 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52092)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52093)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52094);var = 0.0;
            } }else {__CLR4_4_1145j145jlb90paob.R.inc(52095);if ((((length > 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52096)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52097)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52098);Mean mean = new Mean();
                __CLR4_4_1145j145jlb90paob.R.inc(52099);double m = mean.evaluate(values, begin, length);
                __CLR4_4_1145j145jlb90paob.R.inc(52100);var = evaluate(values, m, begin, length);
            }
        }}}
        }__CLR4_4_1145j145jlb90paob.R.inc(52101);return var;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * <p>Returns the weighted variance of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.</p>
     * <p>
     * Uses the formula <pre>
     *   &Sigma;(weights[i]*(values[i] - weightedMean)<sup>2</sup>)/(&Sigma;(weights[i]) - 1)
     * </pre>
     * where weightedMean is the weighted mean</p>
     * <p>
     * This formula will not return the same result as the unweighted variance when all
     * weights are equal, unless all weights are equal to 1. The formula assumes that
     * weights are to be treated as "expansion values," as will be the case if for example
     * the weights represent frequency counts. To normalize weights so that the denominator
     * in the variance computation equals the length of the input vector minus one, use <pre>
     *   <code>evaluate(values, MathArrays.normalizeArray(weights, values.length)); </code>
     * </pre>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
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
     * <p>
     * Does not change the internal state of the statistic.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if either array is null.</p>
     *
     * @param values the input array
     * @param weights the weights array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the weighted variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the parameters are not valid
     * @since 2.1
     */
    public double evaluate(final double[] values, final double[] weights,
                           final int begin, final int length) throws MathIllegalArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52102);

        __CLR4_4_1145j145jlb90paob.R.inc(52103);double var = Double.NaN;

        __CLR4_4_1145j145jlb90paob.R.inc(52104);if ((((test(values, weights,begin, length))&&(__CLR4_4_1145j145jlb90paob.R.iget(52105)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52106)==0&false))) {{
            __CLR4_4_1145j145jlb90paob.R.inc(52107);clear();
            __CLR4_4_1145j145jlb90paob.R.inc(52108);if ((((length == 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52109)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52110)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52111);var = 0.0;
            } }else {__CLR4_4_1145j145jlb90paob.R.inc(52112);if ((((length > 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52113)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52114)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52115);Mean mean = new Mean();
                __CLR4_4_1145j145jlb90paob.R.inc(52116);double m = mean.evaluate(values, weights, begin, length);
                __CLR4_4_1145j145jlb90paob.R.inc(52117);var = evaluate(values, weights, m, begin, length);
            }
        }}}
        }__CLR4_4_1145j145jlb90paob.R.inc(52118);return var;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * <p>
     * Returns the weighted variance of the entries in the the input array.</p>
     * <p>
     * Uses the formula <pre>
     *   &Sigma;(weights[i]*(values[i] - weightedMean)<sup>2</sup>)/(&Sigma;(weights[i]) - 1)
     * </pre>
     * where weightedMean is the weighted mean</p>
     * <p>
     * This formula will not return the same result as the unweighted variance when all
     * weights are equal, unless all weights are equal to 1. The formula assumes that
     * weights are to be treated as "expansion values," as will be the case if for example
     * the weights represent frequency counts. To normalize weights so that the denominator
     * in the variance computation equals the length of the input vector minus one, use <pre>
     *   <code>evaluate(values, MathArrays.normalizeArray(weights, values.length)); </code>
     * </pre>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     * </ul></p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if either array is null.</p>
     *
     * @param values the input array
     * @param weights the weights array
     * @return the weighted variance of the values
     * @throws MathIllegalArgumentException if the parameters are not valid
     * @since 2.1
     */
    public double evaluate(final double[] values, final double[] weights)
    throws MathIllegalArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52119);
        __CLR4_4_1145j145jlb90paob.R.inc(52120);return evaluate(values, weights, 0, values.length);
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Returns the variance of the entries in the specified portion of
     * the input array, using the precomputed mean value.  Returns
     * <code>Double.NaN</code> if the designated subarray is empty.
     * <p>
     * See {@link Variance} for details on the computing algorithm.</p>
     * <p>
     * The formula used assumes that the supplied mean value is the arithmetic
     * mean of the sample data, not a known population parameter.  This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @param mean the precomputed mean value
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    public double evaluate(final double[] values, final double mean,
            final int begin, final int length) throws MathIllegalArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52121);

        __CLR4_4_1145j145jlb90paob.R.inc(52122);double var = Double.NaN;

        __CLR4_4_1145j145jlb90paob.R.inc(52123);if ((((test(values, begin, length))&&(__CLR4_4_1145j145jlb90paob.R.iget(52124)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52125)==0&false))) {{
            __CLR4_4_1145j145jlb90paob.R.inc(52126);if ((((length == 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52127)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52128)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52129);var = 0.0;
            } }else {__CLR4_4_1145j145jlb90paob.R.inc(52130);if ((((length > 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52131)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52132)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52133);double accum = 0.0;
                __CLR4_4_1145j145jlb90paob.R.inc(52134);double dev = 0.0;
                __CLR4_4_1145j145jlb90paob.R.inc(52135);double accum2 = 0.0;
                __CLR4_4_1145j145jlb90paob.R.inc(52136);for (int i = begin; (((i < begin + length)&&(__CLR4_4_1145j145jlb90paob.R.iget(52137)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52138)==0&false)); i++) {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52139);dev = values[i] - mean;
                    __CLR4_4_1145j145jlb90paob.R.inc(52140);accum += dev * dev;
                    __CLR4_4_1145j145jlb90paob.R.inc(52141);accum2 += dev;
                }
                }__CLR4_4_1145j145jlb90paob.R.inc(52142);double len = length;
                __CLR4_4_1145j145jlb90paob.R.inc(52143);if ((((isBiasCorrected)&&(__CLR4_4_1145j145jlb90paob.R.iget(52144)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52145)==0&false))) {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52146);var = (accum - (accum2 * accum2 / len)) / (len - 1.0);
                } }else {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52147);var = (accum - (accum2 * accum2 / len)) / len;
                }
            }}
        }}}
        }__CLR4_4_1145j145jlb90paob.R.inc(52148);return var;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Returns the variance of the entries in the input array, using the
     * precomputed mean value.  Returns <code>Double.NaN</code> if the array
     * is empty.
     * <p>
     * See {@link Variance} for details on the computing algorithm.</p>
     * <p>
     * If <code>isBiasCorrected</code> is <code>true</code> the formula used
     * assumes that the supplied mean value is the arithmetic mean of the
     * sample data, not a known population parameter.  If the mean is a known
     * population parameter, or if the "population" version of the variance is
     * desired, set <code>isBiasCorrected</code> to <code>false</code> before
     * invoking this method.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @param mean the precomputed mean value
     * @return the variance of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public double evaluate(final double[] values, final double mean) throws MathIllegalArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52149);
        __CLR4_4_1145j145jlb90paob.R.inc(52150);return evaluate(values, mean, 0, values.length);
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Returns the weighted variance of the entries in the specified portion of
     * the input array, using the precomputed weighted mean value.  Returns
     * <code>Double.NaN</code> if the designated subarray is empty.
     * <p>
     * Uses the formula <pre>
     *   &Sigma;(weights[i]*(values[i] - mean)<sup>2</sup>)/(&Sigma;(weights[i]) - 1)
     * </pre></p>
     * <p>
     * The formula used assumes that the supplied mean value is the weighted arithmetic
     * mean of the sample data, not a known population parameter. This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * This formula will not return the same result as the unweighted variance when all
     * weights are equal, unless all weights are equal to 1. The formula assumes that
     * weights are to be treated as "expansion values," as will be the case if for example
     * the weights represent frequency counts. To normalize weights so that the denominator
     * in the variance computation equals the length of the input vector minus one, use <pre>
     *   <code>evaluate(values, MathArrays.normalizeArray(weights, values.length), mean); </code>
     * </pre>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     *     <li>the start and length arguments do not determine a valid array</li>
     * </ul></p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @param weights the weights array
     * @param mean the precomputed weighted mean value
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the parameters are not valid
     * @since 2.1
     */
    public double evaluate(final double[] values, final double[] weights,
    final double mean, final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52151);

        __CLR4_4_1145j145jlb90paob.R.inc(52152);double var = Double.NaN;

        __CLR4_4_1145j145jlb90paob.R.inc(52153);if ((((test(values, weights, begin, length))&&(__CLR4_4_1145j145jlb90paob.R.iget(52154)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52155)==0&false))) {{
            __CLR4_4_1145j145jlb90paob.R.inc(52156);if ((((length == 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52157)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52158)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52159);var = 0.0;
            } }else {__CLR4_4_1145j145jlb90paob.R.inc(52160);if ((((length > 1)&&(__CLR4_4_1145j145jlb90paob.R.iget(52161)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52162)==0&false))) {{
                __CLR4_4_1145j145jlb90paob.R.inc(52163);double accum = 0.0;
                __CLR4_4_1145j145jlb90paob.R.inc(52164);double dev = 0.0;
                __CLR4_4_1145j145jlb90paob.R.inc(52165);double accum2 = 0.0;
                __CLR4_4_1145j145jlb90paob.R.inc(52166);for (int i = begin; (((i < begin + length)&&(__CLR4_4_1145j145jlb90paob.R.iget(52167)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52168)==0&false)); i++) {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52169);dev = values[i] - mean;
                    __CLR4_4_1145j145jlb90paob.R.inc(52170);accum += weights[i] * (dev * dev);
                    __CLR4_4_1145j145jlb90paob.R.inc(52171);accum2 += weights[i] * dev;
                }

                }__CLR4_4_1145j145jlb90paob.R.inc(52172);double sumWts = 0;
                __CLR4_4_1145j145jlb90paob.R.inc(52173);for (int i = begin; (((i < begin + length)&&(__CLR4_4_1145j145jlb90paob.R.iget(52174)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52175)==0&false)); i++) {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52176);sumWts += weights[i];
                }

                }__CLR4_4_1145j145jlb90paob.R.inc(52177);if ((((isBiasCorrected)&&(__CLR4_4_1145j145jlb90paob.R.iget(52178)!=0|true))||(__CLR4_4_1145j145jlb90paob.R.iget(52179)==0&false))) {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52180);var = (accum - (accum2 * accum2 / sumWts)) / (sumWts - 1.0);
                } }else {{
                    __CLR4_4_1145j145jlb90paob.R.inc(52181);var = (accum - (accum2 * accum2 / sumWts)) / sumWts;
                }
            }}
        }}}
        }__CLR4_4_1145j145jlb90paob.R.inc(52182);return var;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * <p>Returns the weighted variance of the values in the input array, using
     * the precomputed weighted mean value.</p>
     * <p>
     * Uses the formula <pre>
     *   &Sigma;(weights[i]*(values[i] - mean)<sup>2</sup>)/(&Sigma;(weights[i]) - 1)
     * </pre></p>
     * <p>
     * The formula used assumes that the supplied mean value is the weighted arithmetic
     * mean of the sample data, not a known population parameter. This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * This formula will not return the same result as the unweighted variance when all
     * weights are equal, unless all weights are equal to 1. The formula assumes that
     * weights are to be treated as "expansion values," as will be the case if for example
     * the weights represent frequency counts. To normalize weights so that the denominator
     * in the variance computation equals the length of the input vector minus one, use <pre>
     *   <code>evaluate(values, MathArrays.normalizeArray(weights, values.length), mean); </code>
     * </pre>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     * </ul></p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @param weights the weights array
     * @param mean the precomputed weighted mean value
     * @return the variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the parameters are not valid
     * @since 2.1
     */
    public double evaluate(final double[] values, final double[] weights, final double mean)
    throws MathIllegalArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52183);
        __CLR4_4_1145j145jlb90paob.R.inc(52184);return evaluate(values, weights, mean, 0, values.length);
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * @return Returns the isBiasCorrected.
     */
    public boolean isBiasCorrected() {try{__CLR4_4_1145j145jlb90paob.R.inc(52185);
        __CLR4_4_1145j145jlb90paob.R.inc(52186);return isBiasCorrected;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * @param biasCorrected The isBiasCorrected to set.
     */
    public void setBiasCorrected(boolean biasCorrected) {try{__CLR4_4_1145j145jlb90paob.R.inc(52187);
        __CLR4_4_1145j145jlb90paob.R.inc(52188);this.isBiasCorrected = biasCorrected;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Variance copy() {try{__CLR4_4_1145j145jlb90paob.R.inc(52189);
        __CLR4_4_1145j145jlb90paob.R.inc(52190);Variance result = new Variance();
        // No try-catch or advertised exception because parameters are guaranteed non-null
        __CLR4_4_1145j145jlb90paob.R.inc(52191);copy(this, result);
        __CLR4_4_1145j145jlb90paob.R.inc(52192);return result;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source Variance to copy
     * @param dest Variance to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(Variance source, Variance dest)
        throws NullArgumentException {try{__CLR4_4_1145j145jlb90paob.R.inc(52193);
        __CLR4_4_1145j145jlb90paob.R.inc(52194);MathUtils.checkNotNull(source);
        __CLR4_4_1145j145jlb90paob.R.inc(52195);MathUtils.checkNotNull(dest);
        __CLR4_4_1145j145jlb90paob.R.inc(52196);dest.setData(source.getDataRef());
        __CLR4_4_1145j145jlb90paob.R.inc(52197);dest.moment = source.moment.copy();
        __CLR4_4_1145j145jlb90paob.R.inc(52198);dest.isBiasCorrected = source.isBiasCorrected;
        __CLR4_4_1145j145jlb90paob.R.inc(52199);dest.incMoment = source.incMoment;
    }finally{__CLR4_4_1145j145jlb90paob.R.flushNeeded();}}
}
