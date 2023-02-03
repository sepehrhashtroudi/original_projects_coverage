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
package org.apache.commons.math3.stat;

import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.rank.Percentile;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;

/**
 * StatUtils provides static methods for computing statistics based on data
 * stored in double[] arrays.
 *
 * @version $Id$
 */
public final class StatUtils {public static class __CLR4_4_112a912a9lb90pajg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,49758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** sum */
    private static final UnivariateStatistic SUM = new Sum();

    /** sumSq */
    private static final UnivariateStatistic SUM_OF_SQUARES = new SumOfSquares();

    /** prod */
    private static final UnivariateStatistic PRODUCT = new Product();

    /** sumLog */
    private static final UnivariateStatistic SUM_OF_LOGS = new SumOfLogs();

    /** min */
    private static final UnivariateStatistic MIN = new Min();

    /** max */
    private static final UnivariateStatistic MAX = new Max();

    /** mean */
    private static final UnivariateStatistic MEAN = new Mean();

    /** variance */
    private static final Variance VARIANCE = new Variance();

    /** percentile */
    private static final Percentile PERCENTILE = new Percentile();

    /** geometric mean */
    private static final GeometricMean GEOMETRIC_MEAN = new GeometricMean();

    /**
     * Private Constructor
     */
    private StatUtils() {try{__CLR4_4_112a912a9lb90pajg.R.inc(49617);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sum of the values in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the input array
     * is null.</p>
     *
     * @param values  array of values to sum
     * @return the sum of the values or <code>Double.NaN</code> if the array
     * is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double sum(final double[] values)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49618);
        __CLR4_4_112a912a9lb90pajg.R.inc(49619);return SUM.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sum of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the sum of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    public static double sum(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49620);
        __CLR4_4_112a912a9lb90pajg.R.inc(49621);return SUM.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sum of the squares of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     *
     * @param values  input array
     * @return the sum of the squared values or <code>Double.NaN</code> if the
     * array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double sumSq(final double[] values) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49622);
        __CLR4_4_112a912a9lb90pajg.R.inc(49623);return SUM_OF_SQUARES.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sum of the squares of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the sum of the squares of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     * parameters are not valid
     */
    public static double sumSq(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49624);
        __CLR4_4_112a912a9lb90pajg.R.inc(49625);return SUM_OF_SQUARES.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the product of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @return the product of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double product(final double[] values)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49626);
        __CLR4_4_112a912a9lb90pajg.R.inc(49627);return PRODUCT.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the product of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the product of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     * parameters are not valid
     */
    public static double product(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49628);
        __CLR4_4_112a912a9lb90pajg.R.inc(49629);return PRODUCT.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sum of the natural logs of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.summary.SumOfLogs}.
     * </p>
     *
     * @param values the input array
     * @return the sum of the natural logs of the values or Double.NaN if
     * the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double sumLog(final double[] values)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49630);
        __CLR4_4_112a912a9lb90pajg.R.inc(49631);return SUM_OF_LOGS.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sum of the natural logs of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.summary.SumOfLogs}.
     * </p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the sum of the natural logs of the values or Double.NaN if
     * length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     * parameters are not valid
     */
    public static double sumLog(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49632);
        __CLR4_4_112a912a9lb90pajg.R.inc(49633);return SUM_OF_LOGS.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the arithmetic mean of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Mean} for
     * details on the computing algorithm.</p>
     *
     * @param values the input array
     * @return the mean of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double mean(final double[] values)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49634);
        __CLR4_4_112a912a9lb90pajg.R.inc(49635);return MEAN.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the arithmetic mean of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Mean} for
     * details on the computing algorithm.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the mean of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     * parameters are not valid
     */
    public static double mean(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49636);
        __CLR4_4_112a912a9lb90pajg.R.inc(49637);return MEAN.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the geometric mean of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.GeometricMean}
     * for details on the computing algorithm.</p>
     *
     * @param values the input array
     * @return the geometric mean of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double geometricMean(final double[] values)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49638);
        __CLR4_4_112a912a9lb90pajg.R.inc(49639);return GEOMETRIC_MEAN.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the geometric mean of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.GeometricMean}
     * for details on the computing algorithm.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the geometric mean of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     * parameters are not valid
     */
    public static double geometricMean(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49640);
        __CLR4_4_112a912a9lb90pajg.R.inc(49641);return GEOMETRIC_MEAN.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}


    /**
     * Returns the variance of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     *
     * <p>This method returns the bias-corrected sample variance (using {@code n - 1} in
     * the denominator).  Use {@link #populationVariance(double[])} for the non-bias-corrected
     * population variance.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for
     * details on the computing algorithm.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @return the variance of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double variance(final double[] values) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49642);
        __CLR4_4_112a912a9lb90pajg.R.inc(49643);return VARIANCE.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the variance of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     *
     * <p>This method returns the bias-corrected sample variance (using {@code n - 1} in
     * the denominator).  Use {@link #populationVariance(double[], int, int)} for the non-bias-corrected
     * population variance.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for
     * details on the computing algorithm.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null or the
     * array index parameters are not valid.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    public static double variance(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49644);
        __CLR4_4_112a912a9lb90pajg.R.inc(49645);return VARIANCE.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the variance of the entries in the specified portion of
     * the input array, using the precomputed mean value.  Returns
     * <code>Double.NaN</code> if the designated subarray is empty.
     *
     * <p>This method returns the bias-corrected sample variance (using {@code n - 1} in
     * the denominator).  Use {@link #populationVariance(double[], double, int, int)} for the non-bias-corrected
     * population variance.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for
     * details on the computing algorithm.</p>
     * <p>
     * The formula used assumes that the supplied mean value is the arithmetic
     * mean of the sample data, not a known population parameter.  This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null or the
     * array index parameters are not valid.</p>
     *
     * @param values the input array
     * @param mean the precomputed mean value
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    public static double variance(final double[] values, final double mean,
            final int begin, final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49646);
        __CLR4_4_112a912a9lb90pajg.R.inc(49647);return VARIANCE.evaluate(values, mean, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the variance of the entries in the input array, using the
     * precomputed mean value.  Returns <code>Double.NaN</code> if the array
     * is empty.
     *
     * <p>This method returns the bias-corrected sample variance (using {@code n - 1} in
     * the denominator).  Use {@link #populationVariance(double[], double)} for the non-bias-corrected
     * population variance.</p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for
     * details on the computing algorithm.</p>
     * <p>
     * The formula used assumes that the supplied mean value is the arithmetic
     * mean of the sample data, not a known population parameter.  This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param mean the precomputed mean value
     * @return the variance of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double variance(final double[] values, final double mean)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49648);
        __CLR4_4_112a912a9lb90pajg.R.inc(49649);return VARIANCE.evaluate(values, mean);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the <a href="http://en.wikibooks.org/wiki/Statistics/Summary/Variance">
     * population variance</a> of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for
     * details on the formula and computing algorithm.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @return the population variance of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double populationVariance(final double[] values)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49650);
        __CLR4_4_112a912a9lb90pajg.R.inc(49651);return new Variance(false).evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the <a href="http://en.wikibooks.org/wiki/Statistics/Summary/Variance">
     * population variance</a> of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for
     * details on the computing algorithm.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null or the
     * array index parameters are not valid.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the population variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    public static double populationVariance(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49652);
        __CLR4_4_112a912a9lb90pajg.R.inc(49653);return new Variance(false).evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the <a href="http://en.wikibooks.org/wiki/Statistics/Summary/Variance">
     * population variance</a> of the entries in the specified portion of
     * the input array, using the precomputed mean value.  Returns
     * <code>Double.NaN</code> if the designated subarray is empty.
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for
     * details on the computing algorithm.</p>
     * <p>
     * The formula used assumes that the supplied mean value is the arithmetic
     * mean of the sample data, not a known population parameter.  This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null or the
     * array index parameters are not valid.</p>
     *
     * @param values the input array
     * @param mean the precomputed mean value
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the population variance of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    public static double populationVariance(final double[] values, final double mean,
            final int begin, final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49654);
        __CLR4_4_112a912a9lb90pajg.R.inc(49655);return new Variance(false).evaluate(values, mean, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the <a href="http://en.wikibooks.org/wiki/Statistics/Summary/Variance">
     * population variance</a> of the entries in the input array, using the
     * precomputed mean value.  Returns <code>Double.NaN</code> if the array
     * is empty.
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for
     * details on the computing algorithm.</p>
     * <p>
     * The formula used assumes that the supplied mean value is the arithmetic
     * mean of the sample data, not a known population parameter.  This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param mean the precomputed mean value
     * @return the population variance of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double populationVariance(final double[] values, final double mean)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49656);
        __CLR4_4_112a912a9lb90pajg.R.inc(49657);return new Variance(false).evaluate(values, mean);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the maximum of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     * <p>
     * <ul>
     * <li>The result is <code>NaN</code> iff all values are <code>NaN</code>
     * (i.e. <code>NaN</code> values have no impact on the value of the statistic).</li>
     * <li>If any of the values equals <code>Double.POSITIVE_INFINITY</code>,
     * the result is <code>Double.POSITIVE_INFINITY.</code></li>
     * </ul></p>
     *
     * @param values the input array
     * @return the maximum of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double max(final double[] values) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49658);
        __CLR4_4_112a912a9lb90pajg.R.inc(49659);return MAX.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the maximum of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null or
     * the array index parameters are not valid.</p>
     * <p>
     * <ul>
     * <li>The result is <code>NaN</code> iff all values are <code>NaN</code>
     * (i.e. <code>NaN</code> values have no impact on the value of the statistic).</li>
     * <li>If any of the values equals <code>Double.POSITIVE_INFINITY</code>,
     * the result is <code>Double.POSITIVE_INFINITY.</code></li>
     * </ul></p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the maximum of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     * parameters are not valid
     */
    public static double max(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49660);
        __CLR4_4_112a912a9lb90pajg.R.inc(49661);return MAX.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

     /**
     * Returns the minimum of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     * <p>
     * <ul>
     * <li>The result is <code>NaN</code> iff all values are <code>NaN</code>
     * (i.e. <code>NaN</code> values have no impact on the value of the statistic).</li>
     * <li>If any of the values equals <code>Double.NEGATIVE_INFINITY</code>,
     * the result is <code>Double.NEGATIVE_INFINITY.</code></li>
     * </ul> </p>
     *
     * @param values the input array
     * @return the minimum of the values or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if the array is null
     */
    public static double min(final double[] values) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49662);
        __CLR4_4_112a912a9lb90pajg.R.inc(49663);return MIN.evaluate(values);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

     /**
     * Returns the minimum of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null or
     * the array index parameters are not valid.</p>
     * <p>
     * <ul>
     * <li>The result is <code>NaN</code> iff all values are <code>NaN</code>
     * (i.e. <code>NaN</code> values have no impact on the value of the statistic).</li>
     * <li>If any of the values equals <code>Double.NEGATIVE_INFINITY</code>,
     * the result is <code>Double.NEGATIVE_INFINITY.</code></li>
     * </ul></p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the minimum of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     * parameters are not valid
     */
    public static double min(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49664);
        __CLR4_4_112a912a9lb90pajg.R.inc(49665);return MIN.evaluate(values, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns an estimate of the <code>p</code>th percentile of the values
     * in the <code>values</code> array.
     * <p>
     * <ul>
     * <li>Returns <code>Double.NaN</code> if <code>values</code> has length
     * <code>0</code></li></p>
     * <li>Returns (for any value of <code>p</code>) <code>values[0]</code>
     *  if <code>values</code> has length <code>1</code></li>
     * <li>Throws <code>IllegalArgumentException</code> if <code>values</code>
     * is null  or p is not a valid quantile value (p must be greater than 0
     * and less than or equal to 100)</li>
     * </ul></p>
     * <p>
     * See {@link org.apache.commons.math3.stat.descriptive.rank.Percentile} for
     * a description of the percentile estimation algorithm used.</p>
     *
     * @param values input array of values
     * @param p the percentile value to compute
     * @return the percentile value or Double.NaN if the array is empty
     * @throws MathIllegalArgumentException if <code>values</code> is null
     * or p is invalid
     */
    public static double percentile(final double[] values, final double p)
    throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49666);
            __CLR4_4_112a912a9lb90pajg.R.inc(49667);return PERCENTILE.evaluate(values,p);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

     /**
     * Returns an estimate of the <code>p</code>th percentile of the values
     * in the <code>values</code> array, starting with the element in (0-based)
     * position <code>begin</code> in the array and including <code>length</code>
     * values.
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
     * See {@link org.apache.commons.math3.stat.descriptive.rank.Percentile} for
     * a description of the percentile estimation algorithm used.</p>
     *
     * @param values array of input values
     * @param p  the percentile to compute
     * @param begin  the first (0-based) element to include in the computation
     * @param length  the number of array elements to include
     * @return  the percentile value
     * @throws MathIllegalArgumentException if the parameters are not valid or the
     * input array is null
     */
    public static double percentile(final double[] values, final int begin,
            final int length, final double p) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49668);
        __CLR4_4_112a912a9lb90pajg.R.inc(49669);return PERCENTILE.evaluate(values, begin, length, p);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sum of the (signed) differences between corresponding elements of the
     * input arrays -- i.e., sum(sample1[i] - sample2[i]).
     *
     * @param sample1  the first array
     * @param sample2  the second array
     * @return sum of paired differences
     * @throws DimensionMismatchException if the arrays do not have the same
     * (positive) length.
     * @throws NoDataException if the sample arrays are empty.
     */
    public static double sumDifference(final double[] sample1, final double[] sample2)
    throws DimensionMismatchException, NoDataException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49670);
        __CLR4_4_112a912a9lb90pajg.R.inc(49671);int n = sample1.length;
        __CLR4_4_112a912a9lb90pajg.R.inc(49672);if ((((n != sample2.length)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49673)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49674)==0&false))) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49675);throw new DimensionMismatchException(n, sample2.length);
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49676);if ((((n <= 0)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49677)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49678)==0&false))) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49679);throw new NoDataException(LocalizedFormats.INSUFFICIENT_DIMENSION);
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49680);double result = 0;
        __CLR4_4_112a912a9lb90pajg.R.inc(49681);for (int i = 0; (((i < n)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49682)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49683)==0&false)); i++) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49684);result += sample1[i] - sample2[i];
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49685);return result;
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the mean of the (signed) differences between corresponding elements of the
     * input arrays -- i.e., sum(sample1[i] - sample2[i]) / sample1.length.
     *
     * @param sample1  the first array
     * @param sample2  the second array
     * @return mean of paired differences
     * @throws DimensionMismatchException if the arrays do not have the same
     * (positive) length.
     * @throws NoDataException if the sample arrays are empty.
     */
    public static double meanDifference(final double[] sample1, final double[] sample2)
    throws DimensionMismatchException, NoDataException{try{__CLR4_4_112a912a9lb90pajg.R.inc(49686);
        __CLR4_4_112a912a9lb90pajg.R.inc(49687);return sumDifference(sample1, sample2) / sample1.length;
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the variance of the (signed) differences between corresponding elements of the
     * input arrays -- i.e., var(sample1[i] - sample2[i]).
     *
     * @param sample1  the first array
     * @param sample2  the second array
     * @param meanDifference   the mean difference between corresponding entries
     * @see #meanDifference(double[],double[])
     * @return variance of paired differences
     * @throws DimensionMismatchException if the arrays do not have the same
     * length.
     * @throws NumberIsTooSmallException if the arrays length is less than 2.
     */
    public static double varianceDifference(final double[] sample1,
            final double[] sample2, double meanDifference) throws DimensionMismatchException,
            NumberIsTooSmallException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49688);
        __CLR4_4_112a912a9lb90pajg.R.inc(49689);double sum1 = 0d;
        __CLR4_4_112a912a9lb90pajg.R.inc(49690);double sum2 = 0d;
        __CLR4_4_112a912a9lb90pajg.R.inc(49691);double diff = 0d;
        __CLR4_4_112a912a9lb90pajg.R.inc(49692);int n = sample1.length;
        __CLR4_4_112a912a9lb90pajg.R.inc(49693);if ((((n != sample2.length)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49694)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49695)==0&false))) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49696);throw new DimensionMismatchException(n, sample2.length);
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49697);if ((((n < 2)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49698)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49699)==0&false))) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49700);throw new NumberIsTooSmallException(n, 2, true);
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49701);for (int i = 0; (((i < n)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49702)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49703)==0&false)); i++) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49704);diff = sample1[i] - sample2[i];
            __CLR4_4_112a912a9lb90pajg.R.inc(49705);sum1 += (diff - meanDifference) *(diff - meanDifference);
            __CLR4_4_112a912a9lb90pajg.R.inc(49706);sum2 += diff - meanDifference;
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49707);return (sum1 - (sum2 * sum2 / n)) / (n - 1);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Normalize (standardize) the sample, so it is has a mean of 0 and a standard deviation of 1.
     *
     * @param sample Sample to normalize.
     * @return normalized (standardized) sample.
     * @since 2.2
     */
    public static double[] normalize(final double[] sample) {try{__CLR4_4_112a912a9lb90pajg.R.inc(49708);
        __CLR4_4_112a912a9lb90pajg.R.inc(49709);DescriptiveStatistics stats = new DescriptiveStatistics();

        // Add the data from the series to stats
        __CLR4_4_112a912a9lb90pajg.R.inc(49710);for (int i = 0; (((i < sample.length)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49711)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49712)==0&false)); i++) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49713);stats.addValue(sample[i]);
        }

        // Compute mean and standard deviation
        }__CLR4_4_112a912a9lb90pajg.R.inc(49714);double mean = stats.getMean();
        __CLR4_4_112a912a9lb90pajg.R.inc(49715);double standardDeviation = stats.getStandardDeviation();

        // initialize the standardizedSample, which has the same length as the sample
        __CLR4_4_112a912a9lb90pajg.R.inc(49716);double[] standardizedSample = new double[sample.length];

        __CLR4_4_112a912a9lb90pajg.R.inc(49717);for (int i = 0; (((i < sample.length)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49718)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49719)==0&false)); i++) {{
            // z = (x- mean)/standardDeviation
            __CLR4_4_112a912a9lb90pajg.R.inc(49720);standardizedSample[i] = (sample[i] - mean) / standardDeviation;
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49721);return standardizedSample;
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sample mode(s).  The mode is the most frequently occurring
     * value in the sample. If there is a unique value with maximum frequency,
     * this value is returned as the only element of the output array. Otherwise,
     * the returned array contains the maximum frequency elements in increasing
     * order.  For example, if {@code sample} is {0, 12, 5, 6, 0, 13, 5, 17},
     * the returned array will have length two, with 0 in the first element and
     * 5 in the second.
     *
     * <p>NaN values are ignored when computing the mode - i.e., NaNs will never
     * appear in the output array.  If the sample includes only NaNs or has
     * length 0, an empty array is returned.</p>
     *
     * @param sample input data
     * @return array of array of the most frequently occurring element(s) sorted in ascending order.
     * @throws MathIllegalArgumentException if the indices are invalid or the array is null
     * @since 3.3
     */
    public static double[] mode(double[] sample) throws MathIllegalArgumentException {try{__CLR4_4_112a912a9lb90pajg.R.inc(49722);
        __CLR4_4_112a912a9lb90pajg.R.inc(49723);if ((((sample == null)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49724)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49725)==0&false))) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49726);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49727);return getMode(sample, 0, sample.length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Returns the sample mode(s).  The mode is the most frequently occurring
     * value in the sample. If there is a unique value with maximum frequency,
     * this value is returned as the only element of the output array. Otherwise,
     * the returned array contains the maximum frequency elements in increasing
     * order.  For example, if {@code sample} is {0, 12, 5, 6, 0, 13, 5, 17},
     * the returned array will have length two, with 0 in the first element and
     * 5 in the second.
     *
     * <p>NaN values are ignored when computing the mode - i.e., NaNs will never
     * appear in the output array.  If the sample includes only NaNs or has
     * length 0, an empty array is returned.</p>
     *
     * @param sample input data
     * @param begin index (0-based) of the first array element to include
     * @param length the number of elements to include
     *
     * @return array of array of the most frequently occurring element(s) sorted in ascending order.
     * @throws MathIllegalArgumentException if the indices are invalid or the array is null
     * @since 3.3
     */
    public static double[] mode(double[] sample, final int begin, final int length) {try{__CLR4_4_112a912a9lb90pajg.R.inc(49728);
        __CLR4_4_112a912a9lb90pajg.R.inc(49729);if ((((sample == null)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49730)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49731)==0&false))) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49732);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }

        }__CLR4_4_112a912a9lb90pajg.R.inc(49733);if ((((begin < 0)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49734)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49735)==0&false))) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49736);throw new NotPositiveException(LocalizedFormats.START_POSITION, Integer.valueOf(begin));
        }

        }__CLR4_4_112a912a9lb90pajg.R.inc(49737);if ((((length < 0)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49738)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49739)==0&false))) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49740);throw new NotPositiveException(LocalizedFormats.LENGTH, Integer.valueOf(length));
        }

        }__CLR4_4_112a912a9lb90pajg.R.inc(49741);return getMode(sample, begin, length);
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

    /**
     * Private helper method.
     * Assumes parameters have been validated.
     * @param values input data
     * @param begin index (0-based) of the first array element to include
     * @param length the number of elements to include
     * @return array of array of the most frequently occurring element(s) sorted in ascending order.
     */
    private static double[] getMode(double[] values, final int begin, final int length) {try{__CLR4_4_112a912a9lb90pajg.R.inc(49742);
        // Add the values to the frequency table
        __CLR4_4_112a912a9lb90pajg.R.inc(49743);Frequency freq = new Frequency();
        __CLR4_4_112a912a9lb90pajg.R.inc(49744);for (int i = begin; (((i < begin + length)&&(__CLR4_4_112a912a9lb90pajg.R.iget(49745)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49746)==0&false)); i++) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49747);final double value = values[i];
            __CLR4_4_112a912a9lb90pajg.R.inc(49748);if ((((!Double.isNaN(value))&&(__CLR4_4_112a912a9lb90pajg.R.iget(49749)!=0|true))||(__CLR4_4_112a912a9lb90pajg.R.iget(49750)==0&false))) {{
                __CLR4_4_112a912a9lb90pajg.R.inc(49751);freq.addValue(Double.valueOf(value));
            }
        }}
        }__CLR4_4_112a912a9lb90pajg.R.inc(49752);List<Comparable<?>> list = freq.getMode();
        // Convert the list to an array of primitive double
        __CLR4_4_112a912a9lb90pajg.R.inc(49753);double[] modes = new double[list.size()];
        __CLR4_4_112a912a9lb90pajg.R.inc(49754);int i = 0;
        __CLR4_4_112a912a9lb90pajg.R.inc(49755);for(Comparable<?> c : list) {{
            __CLR4_4_112a912a9lb90pajg.R.inc(49756);modes[i++] = ((Double) c).doubleValue();
        }
        }__CLR4_4_112a912a9lb90pajg.R.inc(49757);return modes;
    }finally{__CLR4_4_112a912a9lb90pajg.R.flushNeeded();}}

}
