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
package org.apache.commons.math3.stat.descriptive;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Skewness;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.rank.Percentile;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.ResizableDoubleArray;
import org.apache.commons.math3.util.FastMath;


/**
 * Maintains a dataset of values of a single variable and computes descriptive
 * statistics based on stored data. The {@link #getWindowSize() windowSize}
 * property sets a limit on the number of values that can be stored in the
 * dataset.  The default value, INFINITE_WINDOW, puts no limit on the size of
 * the dataset.  This value should be used with caution, as the backing store
 * will grow without bound in this case.  For very large datasets,
 * {@link SummaryStatistics}, which does not store the dataset, should be used
 * instead of this class. If <code>windowSize</code> is not INFINITE_WINDOW and
 * more values are added than can be stored in the dataset, new values are
 * added in a "rolling" manner, with new values replacing the "oldest" values
 * in the dataset.
 *
 * <p>Note: this class is not threadsafe.  Use
 * {@link SynchronizedDescriptiveStatistics} if concurrent access from multiple
 * threads is required.</p>
 *
 * @version $Id$
 */
public class DescriptiveStatistics implements StatisticalSummary, Serializable {public static class __CLR4_4_1135t135tlb90palz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Represents an infinite window size.  When the {@link #getWindowSize()}
     * returns this value, there is no limit to the number of data values
     * that can be stored in the dataset.
     */
    public static final int INFINITE_WINDOW = -1;

    /** Serialization UID */
    private static final long serialVersionUID = 4133067267405273064L;

    /** Name of the setQuantile method. */
    private static final String SET_QUANTILE_METHOD_NAME = "setQuantile";

    /** hold the window size **/
    protected int windowSize = INFINITE_WINDOW;

    /**
     *  Stored data values
     */
    private ResizableDoubleArray eDA = new ResizableDoubleArray();

    /** Mean statistic implementation - can be reset by setter. */
    private UnivariateStatistic meanImpl = new Mean();

    /** Geometric mean statistic implementation - can be reset by setter. */
    private UnivariateStatistic geometricMeanImpl = new GeometricMean();

    /** Kurtosis statistic implementation - can be reset by setter. */
    private UnivariateStatistic kurtosisImpl = new Kurtosis();

    /** Maximum statistic implementation - can be reset by setter. */
    private UnivariateStatistic maxImpl = new Max();

    /** Minimum statistic implementation - can be reset by setter. */
    private UnivariateStatistic minImpl = new Min();

    /** Percentile statistic implementation - can be reset by setter. */
    private UnivariateStatistic percentileImpl = new Percentile();

    /** Skewness statistic implementation - can be reset by setter. */
    private UnivariateStatistic skewnessImpl = new Skewness();

    /** Variance statistic implementation - can be reset by setter. */
    private UnivariateStatistic varianceImpl = new Variance();

    /** Sum of squares statistic implementation - can be reset by setter. */
    private UnivariateStatistic sumsqImpl = new SumOfSquares();

    /** Sum statistic implementation - can be reset by setter. */
    private UnivariateStatistic sumImpl = new Sum();

    /**
     * Construct a DescriptiveStatistics instance with an infinite window
     */
    public DescriptiveStatistics() {try{__CLR4_4_1135t135tlb90palz.R.inc(50753);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Construct a DescriptiveStatistics instance with the specified window
     *
     * @param window the window size.
     * @throws MathIllegalArgumentException if window size is less than 1 but
     * not equal to {@link #INFINITE_WINDOW}
     */
    public DescriptiveStatistics(int window) throws MathIllegalArgumentException {try{__CLR4_4_1135t135tlb90palz.R.inc(50754);
        __CLR4_4_1135t135tlb90palz.R.inc(50755);setWindowSize(window);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Construct a DescriptiveStatistics instance with an infinite window
     * and the initial data values in double[] initialDoubleArray.
     * If initialDoubleArray is null, then this constructor corresponds to
     * DescriptiveStatistics()
     *
     * @param initialDoubleArray the initial double[].
     */
    public DescriptiveStatistics(double[] initialDoubleArray) {try{__CLR4_4_1135t135tlb90palz.R.inc(50756);
        __CLR4_4_1135t135tlb90palz.R.inc(50757);if ((((initialDoubleArray != null)&&(__CLR4_4_1135t135tlb90palz.R.iget(50758)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50759)==0&false))) {{
            __CLR4_4_1135t135tlb90palz.R.inc(50760);eDA = new ResizableDoubleArray(initialDoubleArray);
        }
    }}finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Copy constructor.  Construct a new DescriptiveStatistics instance that
     * is a copy of original.
     *
     * @param original DescriptiveStatistics instance to copy
     * @throws NullArgumentException if original is null
     */
    public DescriptiveStatistics(DescriptiveStatistics original) throws NullArgumentException {try{__CLR4_4_1135t135tlb90palz.R.inc(50761);
        __CLR4_4_1135t135tlb90palz.R.inc(50762);copy(original, this);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Adds the value to the dataset. If the dataset is at the maximum size
     * (i.e., the number of stored elements equals the currently configured
     * windowSize), the first (oldest) element in the dataset is discarded
     * to make room for the new value.
     *
     * @param v the value to be added
     */
    public void addValue(double v) {try{__CLR4_4_1135t135tlb90palz.R.inc(50763);
        __CLR4_4_1135t135tlb90palz.R.inc(50764);if ((((windowSize != INFINITE_WINDOW)&&(__CLR4_4_1135t135tlb90palz.R.iget(50765)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50766)==0&false))) {{
            __CLR4_4_1135t135tlb90palz.R.inc(50767);if ((((getN() == windowSize)&&(__CLR4_4_1135t135tlb90palz.R.iget(50768)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50769)==0&false))) {{
                __CLR4_4_1135t135tlb90palz.R.inc(50770);eDA.addElementRolling(v);
            } }else {__CLR4_4_1135t135tlb90palz.R.inc(50771);if ((((getN() < windowSize)&&(__CLR4_4_1135t135tlb90palz.R.iget(50772)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50773)==0&false))) {{
                __CLR4_4_1135t135tlb90palz.R.inc(50774);eDA.addElement(v);
            }
        }}} }else {{
            __CLR4_4_1135t135tlb90palz.R.inc(50775);eDA.addElement(v);
        }
    }}finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Removes the most recent value from the dataset.
     *
     * @throws MathIllegalStateException if there are no elements stored
     */
    public void removeMostRecentValue() throws MathIllegalStateException {try{__CLR4_4_1135t135tlb90palz.R.inc(50776);
        __CLR4_4_1135t135tlb90palz.R.inc(50777);try {
            __CLR4_4_1135t135tlb90palz.R.inc(50778);eDA.discardMostRecentElements(1);
        } catch (MathIllegalArgumentException ex) {
            __CLR4_4_1135t135tlb90palz.R.inc(50779);throw new MathIllegalStateException(LocalizedFormats.NO_DATA);
        }
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Replaces the most recently stored value with the given value.
     * There must be at least one element stored to call this method.
     *
     * @param v the value to replace the most recent stored value
     * @return replaced value
     * @throws MathIllegalStateException if there are no elements stored
     */
    public double replaceMostRecentValue(double v) throws MathIllegalStateException {try{__CLR4_4_1135t135tlb90palz.R.inc(50780);
        __CLR4_4_1135t135tlb90palz.R.inc(50781);return eDA.substituteMostRecentElement(v);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the <a href="http://www.xycoon.com/arithmetic_mean.htm">
     * arithmetic mean </a> of the available values
     * @return The mean or Double.NaN if no values have been added.
     */
    public double getMean() {try{__CLR4_4_1135t135tlb90palz.R.inc(50782);
        __CLR4_4_1135t135tlb90palz.R.inc(50783);return apply(meanImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the <a href="http://www.xycoon.com/geometric_mean.htm">
     * geometric mean </a> of the available values
     * @return The geometricMean, Double.NaN if no values have been added,
     * or if the product of the available values is less than or equal to 0.
     */
    public double getGeometricMean() {try{__CLR4_4_1135t135tlb90palz.R.inc(50784);
        __CLR4_4_1135t135tlb90palz.R.inc(50785);return apply(geometricMeanImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the (sample) variance of the available values.
     *
     * <p>This method returns the bias-corrected sample variance (using {@code n - 1} in
     * the denominator).  Use {@link #getPopulationVariance()} for the non-bias-corrected
     * population variance.</p>
     *
     * @return The variance, Double.NaN if no values have been added
     * or 0.0 for a single value set.
     */
    public double getVariance() {try{__CLR4_4_1135t135tlb90palz.R.inc(50786);
        __CLR4_4_1135t135tlb90palz.R.inc(50787);return apply(varianceImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the <a href="http://en.wikibooks.org/wiki/Statistics/Summary/Variance">
     * population variance</a> of the available values.
     *
     * @return The population variance, Double.NaN if no values have been added,
     * or 0.0 for a single value set.
     */
    public double getPopulationVariance() {try{__CLR4_4_1135t135tlb90palz.R.inc(50788);
        __CLR4_4_1135t135tlb90palz.R.inc(50789);return apply(new Variance(false));
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the standard deviation of the available values.
     * @return The standard deviation, Double.NaN if no values have been added
     * or 0.0 for a single value set.
     */
    public double getStandardDeviation() {try{__CLR4_4_1135t135tlb90palz.R.inc(50790);
        __CLR4_4_1135t135tlb90palz.R.inc(50791);double stdDev = Double.NaN;
        __CLR4_4_1135t135tlb90palz.R.inc(50792);if ((((getN() > 0)&&(__CLR4_4_1135t135tlb90palz.R.iget(50793)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50794)==0&false))) {{
            __CLR4_4_1135t135tlb90palz.R.inc(50795);if ((((getN() > 1)&&(__CLR4_4_1135t135tlb90palz.R.iget(50796)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50797)==0&false))) {{
                __CLR4_4_1135t135tlb90palz.R.inc(50798);stdDev = FastMath.sqrt(getVariance());
            } }else {{
                __CLR4_4_1135t135tlb90palz.R.inc(50799);stdDev = 0.0;
            }
        }}
        }__CLR4_4_1135t135tlb90palz.R.inc(50800);return stdDev;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the skewness of the available values. Skewness is a
     * measure of the asymmetry of a given distribution.
     * @return The skewness, Double.NaN if no values have been added
     * or 0.0 for a value set &lt;=2.
     */
    public double getSkewness() {try{__CLR4_4_1135t135tlb90palz.R.inc(50801);
        __CLR4_4_1135t135tlb90palz.R.inc(50802);return apply(skewnessImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the Kurtosis of the available values. Kurtosis is a
     * measure of the "peakedness" of a distribution
     * @return The kurtosis, Double.NaN if no values have been added, or 0.0
     * for a value set &lt;=3.
     */
    public double getKurtosis() {try{__CLR4_4_1135t135tlb90palz.R.inc(50803);
        __CLR4_4_1135t135tlb90palz.R.inc(50804);return apply(kurtosisImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the maximum of the available values
     * @return The max or Double.NaN if no values have been added.
     */
    public double getMax() {try{__CLR4_4_1135t135tlb90palz.R.inc(50805);
        __CLR4_4_1135t135tlb90palz.R.inc(50806);return apply(maxImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
    * Returns the minimum of the available values
    * @return The min or Double.NaN if no values have been added.
    */
    public double getMin() {try{__CLR4_4_1135t135tlb90palz.R.inc(50807);
        __CLR4_4_1135t135tlb90palz.R.inc(50808);return apply(minImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the number of available values
     * @return The number of available values
     */
    public long getN() {try{__CLR4_4_1135t135tlb90palz.R.inc(50809);
        __CLR4_4_1135t135tlb90palz.R.inc(50810);return eDA.getNumElements();
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the sum of the values that have been added to Univariate.
     * @return The sum or Double.NaN if no values have been added
     */
    public double getSum() {try{__CLR4_4_1135t135tlb90palz.R.inc(50811);
        __CLR4_4_1135t135tlb90palz.R.inc(50812);return apply(sumImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the sum of the squares of the available values.
     * @return The sum of the squares or Double.NaN if no
     * values have been added.
     */
    public double getSumsq() {try{__CLR4_4_1135t135tlb90palz.R.inc(50813);
        __CLR4_4_1135t135tlb90palz.R.inc(50814);return apply(sumsqImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Resets all statistics and storage
     */
    public void clear() {try{__CLR4_4_1135t135tlb90palz.R.inc(50815);
        __CLR4_4_1135t135tlb90palz.R.inc(50816);eDA.clear();
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}


    /**
     * Returns the maximum number of values that can be stored in the
     * dataset, or INFINITE_WINDOW (-1) if there is no limit.
     *
     * @return The current window size or -1 if its Infinite.
     */
    public int getWindowSize() {try{__CLR4_4_1135t135tlb90palz.R.inc(50817);
        __CLR4_4_1135t135tlb90palz.R.inc(50818);return windowSize;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * WindowSize controls the number of values that contribute to the
     * reported statistics.  For example, if windowSize is set to 3 and the
     * values {1,2,3,4,5} have been added <strong> in that order</strong> then
     * the <i>available values</i> are {3,4,5} and all reported statistics will
     * be based on these values. If {@code windowSize} is decreased as a result
     * of this call and there are more than the new value of elements in the
     * current dataset, values from the front of the array are discarded to
     * reduce the dataset to {@code windowSize} elements.
     *
     * @param windowSize sets the size of the window.
     * @throws MathIllegalArgumentException if window size is less than 1 but
     * not equal to {@link #INFINITE_WINDOW}
     */
    public void setWindowSize(int windowSize) throws MathIllegalArgumentException {try{__CLR4_4_1135t135tlb90palz.R.inc(50819);
        __CLR4_4_1135t135tlb90palz.R.inc(50820);if ((((windowSize < 1 && windowSize != INFINITE_WINDOW)&&(__CLR4_4_1135t135tlb90palz.R.iget(50821)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50822)==0&false))) {{
            __CLR4_4_1135t135tlb90palz.R.inc(50823);throw new MathIllegalArgumentException(
                    LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE, windowSize);
        }

        }__CLR4_4_1135t135tlb90palz.R.inc(50824);this.windowSize = windowSize;

        // We need to check to see if we need to discard elements
        // from the front of the array.  If the windowSize is less than
        // the current number of elements.
        __CLR4_4_1135t135tlb90palz.R.inc(50825);if ((((windowSize != INFINITE_WINDOW && windowSize < eDA.getNumElements())&&(__CLR4_4_1135t135tlb90palz.R.iget(50826)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50827)==0&false))) {{
            __CLR4_4_1135t135tlb90palz.R.inc(50828);eDA.discardFrontElements(eDA.getNumElements() - windowSize);
        }
    }}finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the current set of values in an array of double primitives.
     * The order of addition is preserved.  The returned array is a fresh
     * copy of the underlying data -- i.e., it is not a reference to the
     * stored data.
     *
     * @return returns the current set of numbers in the order in which they
     *         were added to this set
     */
    public double[] getValues() {try{__CLR4_4_1135t135tlb90palz.R.inc(50829);
        __CLR4_4_1135t135tlb90palz.R.inc(50830);return eDA.getElements();
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the current set of values in an array of double primitives,
     * sorted in ascending order.  The returned array is a fresh
     * copy of the underlying data -- i.e., it is not a reference to the
     * stored data.
     * @return returns the current set of
     * numbers sorted in ascending order
     */
    public double[] getSortedValues() {try{__CLR4_4_1135t135tlb90palz.R.inc(50831);
        __CLR4_4_1135t135tlb90palz.R.inc(50832);double[] sort = getValues();
        __CLR4_4_1135t135tlb90palz.R.inc(50833);Arrays.sort(sort);
        __CLR4_4_1135t135tlb90palz.R.inc(50834);return sort;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the element at the specified index
     * @param index The Index of the element
     * @return return the element at the specified index
     */
    public double getElement(int index) {try{__CLR4_4_1135t135tlb90palz.R.inc(50835);
        __CLR4_4_1135t135tlb90palz.R.inc(50836);return eDA.getElement(index);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns an estimate for the pth percentile of the stored values.
     * <p>
     * The implementation provided here follows the first estimation procedure presented
     * <a href="http://www.itl.nist.gov/div898/handbook/prc/section2/prc252.htm">here.</a>
     * </p><p>
     * <strong>Preconditions</strong>:<ul>
     * <li><code>0 &lt; p &le; 100</code> (otherwise an
     * <code>MathIllegalArgumentException</code> is thrown)</li>
     * <li>at least one value must be stored (returns <code>Double.NaN
     *     </code> otherwise)</li>
     * </ul></p>
     *
     * @param p the requested percentile (scaled from 0 - 100)
     * @return An estimate for the pth percentile of the stored data
     * @throws MathIllegalStateException if percentile implementation has been
     *  overridden and the supplied implementation does not support setQuantile
     * @throws MathIllegalArgumentException if p is not a valid quantile
     */
    public double getPercentile(double p) throws MathIllegalStateException, MathIllegalArgumentException {try{__CLR4_4_1135t135tlb90palz.R.inc(50837);
        __CLR4_4_1135t135tlb90palz.R.inc(50838);if ((((percentileImpl instanceof Percentile)&&(__CLR4_4_1135t135tlb90palz.R.iget(50839)!=0|true))||(__CLR4_4_1135t135tlb90palz.R.iget(50840)==0&false))) {{
            __CLR4_4_1135t135tlb90palz.R.inc(50841);((Percentile) percentileImpl).setQuantile(p);
        } }else {{
            __CLR4_4_1135t135tlb90palz.R.inc(50842);try {
                __CLR4_4_1135t135tlb90palz.R.inc(50843);percentileImpl.getClass().getMethod(SET_QUANTILE_METHOD_NAME,
                        new Class[] {Double.TYPE}).invoke(percentileImpl,
                                new Object[] {Double.valueOf(p)});
            } catch (NoSuchMethodException e1) { // Setter guard should prevent
                __CLR4_4_1135t135tlb90palz.R.inc(50844);throw new MathIllegalStateException(
                      LocalizedFormats.PERCENTILE_IMPLEMENTATION_UNSUPPORTED_METHOD,
                      percentileImpl.getClass().getName(), SET_QUANTILE_METHOD_NAME);
            } catch (IllegalAccessException e2) {
                __CLR4_4_1135t135tlb90palz.R.inc(50845);throw new MathIllegalStateException(
                      LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD,
                      SET_QUANTILE_METHOD_NAME, percentileImpl.getClass().getName());
            } catch (InvocationTargetException e3) {
                __CLR4_4_1135t135tlb90palz.R.inc(50846);throw new IllegalStateException(e3.getCause());
            }
        }
        }__CLR4_4_1135t135tlb90palz.R.inc(50847);return apply(percentileImpl);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Generates a text report displaying univariate statistics from values
     * that have been added.  Each statistic is displayed on a separate
     * line.
     *
     * @return String with line feeds displaying statistics
     */
    @Override
    public String toString() {try{__CLR4_4_1135t135tlb90palz.R.inc(50848);
        __CLR4_4_1135t135tlb90palz.R.inc(50849);StringBuilder outBuffer = new StringBuilder();
        __CLR4_4_1135t135tlb90palz.R.inc(50850);String endl = "\n";
        __CLR4_4_1135t135tlb90palz.R.inc(50851);outBuffer.append("DescriptiveStatistics:").append(endl);
        __CLR4_4_1135t135tlb90palz.R.inc(50852);outBuffer.append("n: ").append(getN()).append(endl);
        __CLR4_4_1135t135tlb90palz.R.inc(50853);outBuffer.append("min: ").append(getMin()).append(endl);
        __CLR4_4_1135t135tlb90palz.R.inc(50854);outBuffer.append("max: ").append(getMax()).append(endl);
        __CLR4_4_1135t135tlb90palz.R.inc(50855);outBuffer.append("mean: ").append(getMean()).append(endl);
        __CLR4_4_1135t135tlb90palz.R.inc(50856);outBuffer.append("std dev: ").append(getStandardDeviation())
            .append(endl);
        __CLR4_4_1135t135tlb90palz.R.inc(50857);try {
            // No catch for MIAE because actual parameter is valid below
            __CLR4_4_1135t135tlb90palz.R.inc(50858);outBuffer.append("median: ").append(getPercentile(50)).append(endl);
        } catch (MathIllegalStateException ex) {
            __CLR4_4_1135t135tlb90palz.R.inc(50859);outBuffer.append("median: unavailable").append(endl);
        }
        __CLR4_4_1135t135tlb90palz.R.inc(50860);outBuffer.append("skewness: ").append(getSkewness()).append(endl);
        __CLR4_4_1135t135tlb90palz.R.inc(50861);outBuffer.append("kurtosis: ").append(getKurtosis()).append(endl);
        __CLR4_4_1135t135tlb90palz.R.inc(50862);return outBuffer.toString();
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Apply the given statistic to the data associated with this set of statistics.
     * @param stat the statistic to apply
     * @return the computed value of the statistic.
     */
    public double apply(UnivariateStatistic stat) {try{__CLR4_4_1135t135tlb90palz.R.inc(50863);
        // No try-catch or advertised exception here because arguments are guaranteed valid
        __CLR4_4_1135t135tlb90palz.R.inc(50864);return eDA.compute(stat);
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    // Implementation getters and setter

    /**
     * Returns the currently configured mean implementation.
     *
     * @return the UnivariateStatistic implementing the mean
     * @since 1.2
     */
    public synchronized UnivariateStatistic getMeanImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50865);
        __CLR4_4_1135t135tlb90palz.R.inc(50866);return meanImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the mean.</p>
     *
     * @param meanImpl the UnivariateStatistic instance to use
     * for computing the mean
     * @since 1.2
     */
    public synchronized void setMeanImpl(UnivariateStatistic meanImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50867);
        __CLR4_4_1135t135tlb90palz.R.inc(50868);this.meanImpl = meanImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured geometric mean implementation.
     *
     * @return the UnivariateStatistic implementing the geometric mean
     * @since 1.2
     */
    public synchronized UnivariateStatistic getGeometricMeanImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50869);
        __CLR4_4_1135t135tlb90palz.R.inc(50870);return geometricMeanImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the gemoetric mean.</p>
     *
     * @param geometricMeanImpl the UnivariateStatistic instance to use
     * for computing the geometric mean
     * @since 1.2
     */
    public synchronized void setGeometricMeanImpl(
            UnivariateStatistic geometricMeanImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50871);
        __CLR4_4_1135t135tlb90palz.R.inc(50872);this.geometricMeanImpl = geometricMeanImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured kurtosis implementation.
     *
     * @return the UnivariateStatistic implementing the kurtosis
     * @since 1.2
     */
    public synchronized UnivariateStatistic getKurtosisImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50873);
        __CLR4_4_1135t135tlb90palz.R.inc(50874);return kurtosisImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the kurtosis.</p>
     *
     * @param kurtosisImpl the UnivariateStatistic instance to use
     * for computing the kurtosis
     * @since 1.2
     */
    public synchronized void setKurtosisImpl(UnivariateStatistic kurtosisImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50875);
        __CLR4_4_1135t135tlb90palz.R.inc(50876);this.kurtosisImpl = kurtosisImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured maximum implementation.
     *
     * @return the UnivariateStatistic implementing the maximum
     * @since 1.2
     */
    public synchronized UnivariateStatistic getMaxImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50877);
        __CLR4_4_1135t135tlb90palz.R.inc(50878);return maxImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the maximum.</p>
     *
     * @param maxImpl the UnivariateStatistic instance to use
     * for computing the maximum
     * @since 1.2
     */
    public synchronized void setMaxImpl(UnivariateStatistic maxImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50879);
        __CLR4_4_1135t135tlb90palz.R.inc(50880);this.maxImpl = maxImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured minimum implementation.
     *
     * @return the UnivariateStatistic implementing the minimum
     * @since 1.2
     */
    public synchronized UnivariateStatistic getMinImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50881);
        __CLR4_4_1135t135tlb90palz.R.inc(50882);return minImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the minimum.</p>
     *
     * @param minImpl the UnivariateStatistic instance to use
     * for computing the minimum
     * @since 1.2
     */
    public synchronized void setMinImpl(UnivariateStatistic minImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50883);
        __CLR4_4_1135t135tlb90palz.R.inc(50884);this.minImpl = minImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured percentile implementation.
     *
     * @return the UnivariateStatistic implementing the percentile
     * @since 1.2
     */
    public synchronized UnivariateStatistic getPercentileImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50885);
        __CLR4_4_1135t135tlb90palz.R.inc(50886);return percentileImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Sets the implementation to be used by {@link #getPercentile(double)}.
     * The supplied <code>UnivariateStatistic</code> must provide a
     * <code>setQuantile(double)</code> method; otherwise
     * <code>IllegalArgumentException</code> is thrown.
     *
     * @param percentileImpl the percentileImpl to set
     * @throws MathIllegalArgumentException if the supplied implementation does not
     *  provide a <code>setQuantile</code> method
     * @since 1.2
     */
    public synchronized void setPercentileImpl(UnivariateStatistic percentileImpl)
    throws MathIllegalArgumentException {try{__CLR4_4_1135t135tlb90palz.R.inc(50887);
        __CLR4_4_1135t135tlb90palz.R.inc(50888);try {
            __CLR4_4_1135t135tlb90palz.R.inc(50889);percentileImpl.getClass().getMethod(SET_QUANTILE_METHOD_NAME,
                    new Class[] {Double.TYPE}).invoke(percentileImpl,
                            new Object[] {Double.valueOf(50.0d)});
        } catch (NoSuchMethodException e1) {
            __CLR4_4_1135t135tlb90palz.R.inc(50890);throw new MathIllegalArgumentException(
                  LocalizedFormats.PERCENTILE_IMPLEMENTATION_UNSUPPORTED_METHOD,
                  percentileImpl.getClass().getName(), SET_QUANTILE_METHOD_NAME);
        } catch (IllegalAccessException e2) {
            __CLR4_4_1135t135tlb90palz.R.inc(50891);throw new MathIllegalArgumentException(
                  LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD,
                  SET_QUANTILE_METHOD_NAME, percentileImpl.getClass().getName());
        } catch (InvocationTargetException e3) {
            __CLR4_4_1135t135tlb90palz.R.inc(50892);throw new IllegalArgumentException(e3.getCause());
        }
        __CLR4_4_1135t135tlb90palz.R.inc(50893);this.percentileImpl = percentileImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured skewness implementation.
     *
     * @return the UnivariateStatistic implementing the skewness
     * @since 1.2
     */
    public synchronized UnivariateStatistic getSkewnessImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50894);
        __CLR4_4_1135t135tlb90palz.R.inc(50895);return skewnessImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the skewness.</p>
     *
     * @param skewnessImpl the UnivariateStatistic instance to use
     * for computing the skewness
     * @since 1.2
     */
    public synchronized void setSkewnessImpl(
            UnivariateStatistic skewnessImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50896);
        __CLR4_4_1135t135tlb90palz.R.inc(50897);this.skewnessImpl = skewnessImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured variance implementation.
     *
     * @return the UnivariateStatistic implementing the variance
     * @since 1.2
     */
    public synchronized UnivariateStatistic getVarianceImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50898);
        __CLR4_4_1135t135tlb90palz.R.inc(50899);return varianceImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the variance.</p>
     *
     * @param varianceImpl the UnivariateStatistic instance to use
     * for computing the variance
     * @since 1.2
     */
    public synchronized void setVarianceImpl(
            UnivariateStatistic varianceImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50900);
        __CLR4_4_1135t135tlb90palz.R.inc(50901);this.varianceImpl = varianceImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured sum of squares implementation.
     *
     * @return the UnivariateStatistic implementing the sum of squares
     * @since 1.2
     */
    public synchronized UnivariateStatistic getSumsqImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50902);
        __CLR4_4_1135t135tlb90palz.R.inc(50903);return sumsqImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the sum of squares.</p>
     *
     * @param sumsqImpl the UnivariateStatistic instance to use
     * for computing the sum of squares
     * @since 1.2
     */
    public synchronized void setSumsqImpl(UnivariateStatistic sumsqImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50904);
        __CLR4_4_1135t135tlb90palz.R.inc(50905);this.sumsqImpl = sumsqImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns the currently configured sum implementation.
     *
     * @return the UnivariateStatistic implementing the sum
     * @since 1.2
     */
    public synchronized UnivariateStatistic getSumImpl() {try{__CLR4_4_1135t135tlb90palz.R.inc(50906);
        __CLR4_4_1135t135tlb90palz.R.inc(50907);return sumImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the sum.</p>
     *
     * @param sumImpl the UnivariateStatistic instance to use
     * for computing the sum
     * @since 1.2
     */
    public synchronized void setSumImpl(UnivariateStatistic sumImpl) {try{__CLR4_4_1135t135tlb90palz.R.inc(50908);
        __CLR4_4_1135t135tlb90palz.R.inc(50909);this.sumImpl = sumImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Returns a copy of this DescriptiveStatistics instance with the same internal state.
     *
     * @return a copy of this
     */
    public DescriptiveStatistics copy() {try{__CLR4_4_1135t135tlb90palz.R.inc(50910);
        __CLR4_4_1135t135tlb90palz.R.inc(50911);DescriptiveStatistics result = new DescriptiveStatistics();
        // No try-catch or advertised exception because parms are guaranteed valid
        __CLR4_4_1135t135tlb90palz.R.inc(50912);copy(this, result);
        __CLR4_4_1135t135tlb90palz.R.inc(50913);return result;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source DescriptiveStatistics to copy
     * @param dest DescriptiveStatistics to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(DescriptiveStatistics source, DescriptiveStatistics dest)
        throws NullArgumentException {try{__CLR4_4_1135t135tlb90palz.R.inc(50914);
        __CLR4_4_1135t135tlb90palz.R.inc(50915);MathUtils.checkNotNull(source);
        __CLR4_4_1135t135tlb90palz.R.inc(50916);MathUtils.checkNotNull(dest);
        // Copy data and window size
        __CLR4_4_1135t135tlb90palz.R.inc(50917);dest.eDA = source.eDA.copy();
        __CLR4_4_1135t135tlb90palz.R.inc(50918);dest.windowSize = source.windowSize;

        // Copy implementations
        __CLR4_4_1135t135tlb90palz.R.inc(50919);dest.maxImpl = source.maxImpl.copy();
        __CLR4_4_1135t135tlb90palz.R.inc(50920);dest.meanImpl = source.meanImpl.copy();
        __CLR4_4_1135t135tlb90palz.R.inc(50921);dest.minImpl = source.minImpl.copy();
        __CLR4_4_1135t135tlb90palz.R.inc(50922);dest.sumImpl = source.sumImpl.copy();
        __CLR4_4_1135t135tlb90palz.R.inc(50923);dest.varianceImpl = source.varianceImpl.copy();
        __CLR4_4_1135t135tlb90palz.R.inc(50924);dest.sumsqImpl = source.sumsqImpl.copy();
        __CLR4_4_1135t135tlb90palz.R.inc(50925);dest.geometricMeanImpl = source.geometricMeanImpl.copy();
        __CLR4_4_1135t135tlb90palz.R.inc(50926);dest.kurtosisImpl = source.kurtosisImpl;
        __CLR4_4_1135t135tlb90palz.R.inc(50927);dest.skewnessImpl = source.skewnessImpl;
        __CLR4_4_1135t135tlb90palz.R.inc(50928);dest.percentileImpl = source.percentileImpl;
    }finally{__CLR4_4_1135t135tlb90palz.R.flushNeeded();}}
}
