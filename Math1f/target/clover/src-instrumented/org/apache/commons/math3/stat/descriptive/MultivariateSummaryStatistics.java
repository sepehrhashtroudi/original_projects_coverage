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
import java.util.Arrays;

import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.VectorialCovariance;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;

/**
 * <p>Computes summary statistics for a stream of n-tuples added using the
 * {@link #addValue(double[]) addValue} method. The data values are not stored
 * in memory, so this class can be used to compute statistics for very large
 * n-tuple streams.</p>
 *
 * <p>The {@link StorelessUnivariateStatistic} instances used to maintain
 * summary state and compute statistics are configurable via setters.
 * For example, the default implementation for the mean can be overridden by
 * calling {@link #setMeanImpl(StorelessUnivariateStatistic[])}. Actual
 * parameters to these methods must implement the
 * {@link StorelessUnivariateStatistic} interface and configuration must be
 * completed before <code>addValue</code> is called. No configuration is
 * necessary to use the default, commons-math provided implementations.</p>
 *
 * <p>To compute statistics for a stream of n-tuples, construct a
 * MultivariateStatistics instance with dimension n and then use
 * {@link #addValue(double[])} to add n-tuples. The <code>getXxx</code>
 * methods where Xxx is a statistic return an array of <code>double</code>
 * values, where for <code>i = 0,...,n-1</code> the i<sup>th</sup> array element is the
 * value of the given statistic for data range consisting of the i<sup>th</sup> element of
 * each of the input n-tuples.  For example, if <code>addValue</code> is called
 * with actual parameters {0, 1, 2}, then {3, 4, 5} and finally {6, 7, 8},
 * <code>getSum</code> will return a three-element array with values
 * {0+3+6, 1+4+7, 2+5+8}</p>
 *
 * <p>Note: This class is not thread-safe. Use
 * {@link SynchronizedMultivariateSummaryStatistics} if concurrent access from multiple
 * threads is required.</p>
 *
 * @since 1.2
 * @version $Id$
 */
public class MultivariateSummaryStatistics
    implements StatisticalMultivariateSummary, Serializable {public static class __CLR4_4_113ap13aplb90pama{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51111,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization UID */
    private static final long serialVersionUID = 2271900808994826718L;

    /** Dimension of the data. */
    private int k;

    /** Count of values that have been added */
    private long n = 0;

    /** Sum statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic[] sumImpl;

    /** Sum of squares statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic[] sumSqImpl;

    /** Minimum statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic[] minImpl;

    /** Maximum statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic[] maxImpl;

    /** Sum of log statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic[] sumLogImpl;

    /** Geometric mean statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic[] geoMeanImpl;

    /** Mean statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic[] meanImpl;

    /** Covariance statistic implementation - cannot be reset. */
    private VectorialCovariance covarianceImpl;

    /**
     * Construct a MultivariateSummaryStatistics instance
     * @param k dimension of the data
     * @param isCovarianceBiasCorrected if true, the unbiased sample
     * covariance is computed, otherwise the biased population covariance
     * is computed
     */
    public MultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected) {try{__CLR4_4_113ap13aplb90pama.R.inc(50929);
        __CLR4_4_113ap13aplb90pama.R.inc(50930);this.k = k;

        __CLR4_4_113ap13aplb90pama.R.inc(50931);sumImpl     = new StorelessUnivariateStatistic[k];
        __CLR4_4_113ap13aplb90pama.R.inc(50932);sumSqImpl   = new StorelessUnivariateStatistic[k];
        __CLR4_4_113ap13aplb90pama.R.inc(50933);minImpl     = new StorelessUnivariateStatistic[k];
        __CLR4_4_113ap13aplb90pama.R.inc(50934);maxImpl     = new StorelessUnivariateStatistic[k];
        __CLR4_4_113ap13aplb90pama.R.inc(50935);sumLogImpl  = new StorelessUnivariateStatistic[k];
        __CLR4_4_113ap13aplb90pama.R.inc(50936);geoMeanImpl = new StorelessUnivariateStatistic[k];
        __CLR4_4_113ap13aplb90pama.R.inc(50937);meanImpl    = new StorelessUnivariateStatistic[k];

        __CLR4_4_113ap13aplb90pama.R.inc(50938);for (int i = 0; (((i < k)&&(__CLR4_4_113ap13aplb90pama.R.iget(50939)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(50940)==0&false)); ++i) {{
            __CLR4_4_113ap13aplb90pama.R.inc(50941);sumImpl[i]     = new Sum();
            __CLR4_4_113ap13aplb90pama.R.inc(50942);sumSqImpl[i]   = new SumOfSquares();
            __CLR4_4_113ap13aplb90pama.R.inc(50943);minImpl[i]     = new Min();
            __CLR4_4_113ap13aplb90pama.R.inc(50944);maxImpl[i]     = new Max();
            __CLR4_4_113ap13aplb90pama.R.inc(50945);sumLogImpl[i]  = new SumOfLogs();
            __CLR4_4_113ap13aplb90pama.R.inc(50946);geoMeanImpl[i] = new GeometricMean();
            __CLR4_4_113ap13aplb90pama.R.inc(50947);meanImpl[i]    = new Mean();
        }

        }__CLR4_4_113ap13aplb90pama.R.inc(50948);covarianceImpl =
            new VectorialCovariance(k, isCovarianceBiasCorrected);

    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Add an n-tuple to the data
     *
     * @param value  the n-tuple to add
     * @throws DimensionMismatchException if the length of the array
     * does not match the one used at construction
     */
    public void addValue(double[] value) throws DimensionMismatchException {try{__CLR4_4_113ap13aplb90pama.R.inc(50949);
        __CLR4_4_113ap13aplb90pama.R.inc(50950);checkDimension(value.length);
        __CLR4_4_113ap13aplb90pama.R.inc(50951);for (int i = 0; (((i < k)&&(__CLR4_4_113ap13aplb90pama.R.iget(50952)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(50953)==0&false)); ++i) {{
            __CLR4_4_113ap13aplb90pama.R.inc(50954);double v = value[i];
            __CLR4_4_113ap13aplb90pama.R.inc(50955);sumImpl[i].increment(v);
            __CLR4_4_113ap13aplb90pama.R.inc(50956);sumSqImpl[i].increment(v);
            __CLR4_4_113ap13aplb90pama.R.inc(50957);minImpl[i].increment(v);
            __CLR4_4_113ap13aplb90pama.R.inc(50958);maxImpl[i].increment(v);
            __CLR4_4_113ap13aplb90pama.R.inc(50959);sumLogImpl[i].increment(v);
            __CLR4_4_113ap13aplb90pama.R.inc(50960);geoMeanImpl[i].increment(v);
            __CLR4_4_113ap13aplb90pama.R.inc(50961);meanImpl[i].increment(v);
        }
        }__CLR4_4_113ap13aplb90pama.R.inc(50962);covarianceImpl.increment(value);
        __CLR4_4_113ap13aplb90pama.R.inc(50963);n++;
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the dimension of the data
     * @return The dimension of the data
     */
    public int getDimension() {try{__CLR4_4_113ap13aplb90pama.R.inc(50964);
        __CLR4_4_113ap13aplb90pama.R.inc(50965);return k;
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the number of available values
     * @return The number of available values
     */
    public long getN() {try{__CLR4_4_113ap13aplb90pama.R.inc(50966);
        __CLR4_4_113ap13aplb90pama.R.inc(50967);return n;
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array of the results of a statistic.
     * @param stats univariate statistic array
     * @return results array
     */
    private double[] getResults(StorelessUnivariateStatistic[] stats) {try{__CLR4_4_113ap13aplb90pama.R.inc(50968);
        __CLR4_4_113ap13aplb90pama.R.inc(50969);double[] results = new double[stats.length];
        __CLR4_4_113ap13aplb90pama.R.inc(50970);for (int i = 0; (((i < results.length)&&(__CLR4_4_113ap13aplb90pama.R.iget(50971)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(50972)==0&false)); ++i) {{
            __CLR4_4_113ap13aplb90pama.R.inc(50973);results[i] = stats[i].getResult();
        }
        }__CLR4_4_113ap13aplb90pama.R.inc(50974);return results;
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array whose i<sup>th</sup> entry is the sum of the
     * i<sup>th</sup> entries of the arrays that have been added using
     * {@link #addValue(double[])}
     *
     * @return the array of component sums
     */
    public double[] getSum() {try{__CLR4_4_113ap13aplb90pama.R.inc(50975);
        __CLR4_4_113ap13aplb90pama.R.inc(50976);return getResults(sumImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array whose i<sup>th</sup> entry is the sum of squares of the
     * i<sup>th</sup> entries of the arrays that have been added using
     * {@link #addValue(double[])}
     *
     * @return the array of component sums of squares
     */
    public double[] getSumSq() {try{__CLR4_4_113ap13aplb90pama.R.inc(50977);
        __CLR4_4_113ap13aplb90pama.R.inc(50978);return getResults(sumSqImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array whose i<sup>th</sup> entry is the sum of logs of the
     * i<sup>th</sup> entries of the arrays that have been added using
     * {@link #addValue(double[])}
     *
     * @return the array of component log sums
     */
    public double[] getSumLog() {try{__CLR4_4_113ap13aplb90pama.R.inc(50979);
        __CLR4_4_113ap13aplb90pama.R.inc(50980);return getResults(sumLogImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array whose i<sup>th</sup> entry is the mean of the
     * i<sup>th</sup> entries of the arrays that have been added using
     * {@link #addValue(double[])}
     *
     * @return the array of component means
     */
    public double[] getMean() {try{__CLR4_4_113ap13aplb90pama.R.inc(50981);
        __CLR4_4_113ap13aplb90pama.R.inc(50982);return getResults(meanImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array whose i<sup>th</sup> entry is the standard deviation of the
     * i<sup>th</sup> entries of the arrays that have been added using
     * {@link #addValue(double[])}
     *
     * @return the array of component standard deviations
     */
    public double[] getStandardDeviation() {try{__CLR4_4_113ap13aplb90pama.R.inc(50983);
        __CLR4_4_113ap13aplb90pama.R.inc(50984);double[] stdDev = new double[k];
        __CLR4_4_113ap13aplb90pama.R.inc(50985);if ((((getN() < 1)&&(__CLR4_4_113ap13aplb90pama.R.iget(50986)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(50987)==0&false))) {{
            __CLR4_4_113ap13aplb90pama.R.inc(50988);Arrays.fill(stdDev, Double.NaN);
        } }else {__CLR4_4_113ap13aplb90pama.R.inc(50989);if ((((getN() < 2)&&(__CLR4_4_113ap13aplb90pama.R.iget(50990)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(50991)==0&false))) {{
            __CLR4_4_113ap13aplb90pama.R.inc(50992);Arrays.fill(stdDev, 0.0);
        } }else {{
            __CLR4_4_113ap13aplb90pama.R.inc(50993);RealMatrix matrix = covarianceImpl.getResult();
            __CLR4_4_113ap13aplb90pama.R.inc(50994);for (int i = 0; (((i < k)&&(__CLR4_4_113ap13aplb90pama.R.iget(50995)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(50996)==0&false)); ++i) {{
                __CLR4_4_113ap13aplb90pama.R.inc(50997);stdDev[i] = FastMath.sqrt(matrix.getEntry(i, i));
            }
        }}
        }}__CLR4_4_113ap13aplb90pama.R.inc(50998);return stdDev;
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the covariance matrix of the values that have been added.
     *
     * @return the covariance matrix
     */
    public RealMatrix getCovariance() {try{__CLR4_4_113ap13aplb90pama.R.inc(50999);
        __CLR4_4_113ap13aplb90pama.R.inc(51000);return covarianceImpl.getResult();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array whose i<sup>th</sup> entry is the maximum of the
     * i<sup>th</sup> entries of the arrays that have been added using
     * {@link #addValue(double[])}
     *
     * @return the array of component maxima
     */
    public double[] getMax() {try{__CLR4_4_113ap13aplb90pama.R.inc(51001);
        __CLR4_4_113ap13aplb90pama.R.inc(51002);return getResults(maxImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array whose i<sup>th</sup> entry is the minimum of the
     * i<sup>th</sup> entries of the arrays that have been added using
     * {@link #addValue(double[])}
     *
     * @return the array of component minima
     */
    public double[] getMin() {try{__CLR4_4_113ap13aplb90pama.R.inc(51003);
        __CLR4_4_113ap13aplb90pama.R.inc(51004);return getResults(minImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns an array whose i<sup>th</sup> entry is the geometric mean of the
     * i<sup>th</sup> entries of the arrays that have been added using
     * {@link #addValue(double[])}
     *
     * @return the array of component geometric means
     */
    public double[] getGeometricMean() {try{__CLR4_4_113ap13aplb90pama.R.inc(51005);
        __CLR4_4_113ap13aplb90pama.R.inc(51006);return getResults(geoMeanImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Generates a text report displaying
     * summary statistics from values that
     * have been added.
     * @return String with line feeds displaying statistics
     */
    @Override
    public String toString() {try{__CLR4_4_113ap13aplb90pama.R.inc(51007);
        __CLR4_4_113ap13aplb90pama.R.inc(51008);final String separator = ", ";
        __CLR4_4_113ap13aplb90pama.R.inc(51009);final String suffix = System.getProperty("line.separator");
        __CLR4_4_113ap13aplb90pama.R.inc(51010);StringBuilder outBuffer = new StringBuilder();
        __CLR4_4_113ap13aplb90pama.R.inc(51011);outBuffer.append("MultivariateSummaryStatistics:" + suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51012);outBuffer.append("n: " + getN() + suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51013);append(outBuffer, getMin(), "min: ", separator, suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51014);append(outBuffer, getMax(), "max: ", separator, suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51015);append(outBuffer, getMean(), "mean: ", separator, suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51016);append(outBuffer, getGeometricMean(), "geometric mean: ", separator, suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51017);append(outBuffer, getSumSq(), "sum of squares: ", separator, suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51018);append(outBuffer, getSumLog(), "sum of logarithms: ", separator, suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51019);append(outBuffer, getStandardDeviation(), "standard deviation: ", separator, suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51020);outBuffer.append("covariance: " + getCovariance().toString() + suffix);
        __CLR4_4_113ap13aplb90pama.R.inc(51021);return outBuffer.toString();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Append a text representation of an array to a buffer.
     * @param buffer buffer to fill
     * @param data data array
     * @param prefix text prefix
     * @param separator elements separator
     * @param suffix text suffix
     */
    private void append(StringBuilder buffer, double[] data,
                        String prefix, String separator, String suffix) {try{__CLR4_4_113ap13aplb90pama.R.inc(51022);
        __CLR4_4_113ap13aplb90pama.R.inc(51023);buffer.append(prefix);
        __CLR4_4_113ap13aplb90pama.R.inc(51024);for (int i = 0; (((i < data.length)&&(__CLR4_4_113ap13aplb90pama.R.iget(51025)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(51026)==0&false)); ++i) {{
            __CLR4_4_113ap13aplb90pama.R.inc(51027);if ((((i > 0)&&(__CLR4_4_113ap13aplb90pama.R.iget(51028)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(51029)==0&false))) {{
                __CLR4_4_113ap13aplb90pama.R.inc(51030);buffer.append(separator);
            }
            }__CLR4_4_113ap13aplb90pama.R.inc(51031);buffer.append(data[i]);
        }
        }__CLR4_4_113ap13aplb90pama.R.inc(51032);buffer.append(suffix);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Resets all statistics and storage
     */
    public void clear() {try{__CLR4_4_113ap13aplb90pama.R.inc(51033);
        __CLR4_4_113ap13aplb90pama.R.inc(51034);this.n = 0;
        __CLR4_4_113ap13aplb90pama.R.inc(51035);for (int i = 0; (((i < k)&&(__CLR4_4_113ap13aplb90pama.R.iget(51036)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(51037)==0&false)); ++i) {{
            __CLR4_4_113ap13aplb90pama.R.inc(51038);minImpl[i].clear();
            __CLR4_4_113ap13aplb90pama.R.inc(51039);maxImpl[i].clear();
            __CLR4_4_113ap13aplb90pama.R.inc(51040);sumImpl[i].clear();
            __CLR4_4_113ap13aplb90pama.R.inc(51041);sumLogImpl[i].clear();
            __CLR4_4_113ap13aplb90pama.R.inc(51042);sumSqImpl[i].clear();
            __CLR4_4_113ap13aplb90pama.R.inc(51043);geoMeanImpl[i].clear();
            __CLR4_4_113ap13aplb90pama.R.inc(51044);meanImpl[i].clear();
        }
        }__CLR4_4_113ap13aplb90pama.R.inc(51045);covarianceImpl.clear();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns true iff <code>object</code> is a <code>MultivariateSummaryStatistics</code>
     * instance and all statistics have the same values as this.
     * @param object the object to test equality against.
     * @return true if object equals this
     */
    @Override
    public boolean equals(Object object) {try{__CLR4_4_113ap13aplb90pama.R.inc(51046);
        __CLR4_4_113ap13aplb90pama.R.inc(51047);if ((((object == this )&&(__CLR4_4_113ap13aplb90pama.R.iget(51048)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(51049)==0&false))) {{
            __CLR4_4_113ap13aplb90pama.R.inc(51050);return true;
        }
        }__CLR4_4_113ap13aplb90pama.R.inc(51051);if ((((object instanceof MultivariateSummaryStatistics == false)&&(__CLR4_4_113ap13aplb90pama.R.iget(51052)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(51053)==0&false))) {{
            __CLR4_4_113ap13aplb90pama.R.inc(51054);return false;
        }
        }__CLR4_4_113ap13aplb90pama.R.inc(51055);MultivariateSummaryStatistics stat = (MultivariateSummaryStatistics) object;
        __CLR4_4_113ap13aplb90pama.R.inc(51056);return MathArrays.equalsIncludingNaN(stat.getGeometricMean(), getGeometricMean()) &&
               MathArrays.equalsIncludingNaN(stat.getMax(),           getMax())           &&
               MathArrays.equalsIncludingNaN(stat.getMean(),          getMean())          &&
               MathArrays.equalsIncludingNaN(stat.getMin(),           getMin())           &&
               Precision.equalsIncludingNaN(stat.getN(),             getN())             &&
               MathArrays.equalsIncludingNaN(stat.getSum(),           getSum())           &&
               MathArrays.equalsIncludingNaN(stat.getSumSq(),         getSumSq())         &&
               MathArrays.equalsIncludingNaN(stat.getSumLog(),        getSumLog())        &&
               stat.getCovariance().equals( getCovariance());
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns hash code based on values of statistics
     *
     * @return hash code
     */
    @Override
    public int hashCode() {try{__CLR4_4_113ap13aplb90pama.R.inc(51057);
        __CLR4_4_113ap13aplb90pama.R.inc(51058);int result = 31 + MathUtils.hash(getGeometricMean());
        __CLR4_4_113ap13aplb90pama.R.inc(51059);result = result * 31 + MathUtils.hash(getGeometricMean());
        __CLR4_4_113ap13aplb90pama.R.inc(51060);result = result * 31 + MathUtils.hash(getMax());
        __CLR4_4_113ap13aplb90pama.R.inc(51061);result = result * 31 + MathUtils.hash(getMean());
        __CLR4_4_113ap13aplb90pama.R.inc(51062);result = result * 31 + MathUtils.hash(getMin());
        __CLR4_4_113ap13aplb90pama.R.inc(51063);result = result * 31 + MathUtils.hash(getN());
        __CLR4_4_113ap13aplb90pama.R.inc(51064);result = result * 31 + MathUtils.hash(getSum());
        __CLR4_4_113ap13aplb90pama.R.inc(51065);result = result * 31 + MathUtils.hash(getSumSq());
        __CLR4_4_113ap13aplb90pama.R.inc(51066);result = result * 31 + MathUtils.hash(getSumLog());
        __CLR4_4_113ap13aplb90pama.R.inc(51067);result = result * 31 + getCovariance().hashCode();
        __CLR4_4_113ap13aplb90pama.R.inc(51068);return result;
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    // Getters and setters for statistics implementations
    /**
     * Sets statistics implementations.
     * @param newImpl new implementations for statistics
     * @param oldImpl old implementations for statistics
     * @throws DimensionMismatchException if the array dimension
     * does not match the one used at construction
     * @throws MathIllegalStateException if data has already been added
     * (i.e. if n > 0)
     */
    private void setImpl(StorelessUnivariateStatistic[] newImpl,
                         StorelessUnivariateStatistic[] oldImpl) throws MathIllegalStateException,
                         DimensionMismatchException {try{__CLR4_4_113ap13aplb90pama.R.inc(51069);
        __CLR4_4_113ap13aplb90pama.R.inc(51070);checkEmpty();
        __CLR4_4_113ap13aplb90pama.R.inc(51071);checkDimension(newImpl.length);
        __CLR4_4_113ap13aplb90pama.R.inc(51072);System.arraycopy(newImpl, 0, oldImpl, 0, newImpl.length);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the currently configured Sum implementation
     *
     * @return the StorelessUnivariateStatistic implementing the sum
     */
    public StorelessUnivariateStatistic[] getSumImpl() {try{__CLR4_4_113ap13aplb90pama.R.inc(51073);
        __CLR4_4_113ap13aplb90pama.R.inc(51074);return sumImpl.clone();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the Sum.</p>
     * <p>This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double[]) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.</p>
     *
     * @param sumImpl the StorelessUnivariateStatistic instance to use
     * for computing the Sum
     * @throws DimensionMismatchException if the array dimension
     * does not match the one used at construction
     * @throws MathIllegalStateException if data has already been added
     *  (i.e if n > 0)
     */
    public void setSumImpl(StorelessUnivariateStatistic[] sumImpl)
    throws MathIllegalStateException, DimensionMismatchException {try{__CLR4_4_113ap13aplb90pama.R.inc(51075);
        __CLR4_4_113ap13aplb90pama.R.inc(51076);setImpl(sumImpl, this.sumImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the currently configured sum of squares implementation
     *
     * @return the StorelessUnivariateStatistic implementing the sum of squares
     */
    public StorelessUnivariateStatistic[] getSumsqImpl() {try{__CLR4_4_113ap13aplb90pama.R.inc(51077);
        __CLR4_4_113ap13aplb90pama.R.inc(51078);return sumSqImpl.clone();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the sum of squares.</p>
     * <p>This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double[]) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.</p>
     *
     * @param sumsqImpl the StorelessUnivariateStatistic instance to use
     * for computing the sum of squares
     * @throws DimensionMismatchException if the array dimension
     * does not match the one used at construction
     * @throws MathIllegalStateException if data has already been added
     *  (i.e if n > 0)
     */
    public void setSumsqImpl(StorelessUnivariateStatistic[] sumsqImpl)
    throws MathIllegalStateException, DimensionMismatchException {try{__CLR4_4_113ap13aplb90pama.R.inc(51079);
        __CLR4_4_113ap13aplb90pama.R.inc(51080);setImpl(sumsqImpl, this.sumSqImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the currently configured minimum implementation
     *
     * @return the StorelessUnivariateStatistic implementing the minimum
     */
    public StorelessUnivariateStatistic[] getMinImpl() {try{__CLR4_4_113ap13aplb90pama.R.inc(51081);
        __CLR4_4_113ap13aplb90pama.R.inc(51082);return minImpl.clone();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the minimum.</p>
     * <p>This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double[]) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.</p>
     *
     * @param minImpl the StorelessUnivariateStatistic instance to use
     * for computing the minimum
     * @throws DimensionMismatchException if the array dimension
     * does not match the one used at construction
     * @throws MathIllegalStateException if data has already been added
     *  (i.e if n > 0)
     */
    public void setMinImpl(StorelessUnivariateStatistic[] minImpl)
    throws MathIllegalStateException, DimensionMismatchException {try{__CLR4_4_113ap13aplb90pama.R.inc(51083);
        __CLR4_4_113ap13aplb90pama.R.inc(51084);setImpl(minImpl, this.minImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the currently configured maximum implementation
     *
     * @return the StorelessUnivariateStatistic implementing the maximum
     */
    public StorelessUnivariateStatistic[] getMaxImpl() {try{__CLR4_4_113ap13aplb90pama.R.inc(51085);
        __CLR4_4_113ap13aplb90pama.R.inc(51086);return maxImpl.clone();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the maximum.</p>
     * <p>This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double[]) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.</p>
     *
     * @param maxImpl the StorelessUnivariateStatistic instance to use
     * for computing the maximum
     * @throws DimensionMismatchException if the array dimension
     * does not match the one used at construction
     * @throws MathIllegalStateException if data has already been added
     *  (i.e if n > 0)
     */
    public void setMaxImpl(StorelessUnivariateStatistic[] maxImpl)
    throws MathIllegalStateException, DimensionMismatchException{try{__CLR4_4_113ap13aplb90pama.R.inc(51087);
        __CLR4_4_113ap13aplb90pama.R.inc(51088);setImpl(maxImpl, this.maxImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the currently configured sum of logs implementation
     *
     * @return the StorelessUnivariateStatistic implementing the log sum
     */
    public StorelessUnivariateStatistic[] getSumLogImpl() {try{__CLR4_4_113ap13aplb90pama.R.inc(51089);
        __CLR4_4_113ap13aplb90pama.R.inc(51090);return sumLogImpl.clone();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the sum of logs.</p>
     * <p>This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double[]) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.</p>
     *
     * @param sumLogImpl the StorelessUnivariateStatistic instance to use
     * for computing the log sum
     * @throws DimensionMismatchException if the array dimension
     * does not match the one used at construction
     * @throws MathIllegalStateException if data has already been added
     *  (i.e if n > 0)
     */
    public void setSumLogImpl(StorelessUnivariateStatistic[] sumLogImpl)
    throws MathIllegalStateException, DimensionMismatchException{try{__CLR4_4_113ap13aplb90pama.R.inc(51091);
        __CLR4_4_113ap13aplb90pama.R.inc(51092);setImpl(sumLogImpl, this.sumLogImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the currently configured geometric mean implementation
     *
     * @return the StorelessUnivariateStatistic implementing the geometric mean
     */
    public StorelessUnivariateStatistic[] getGeoMeanImpl() {try{__CLR4_4_113ap13aplb90pama.R.inc(51093);
        __CLR4_4_113ap13aplb90pama.R.inc(51094);return geoMeanImpl.clone();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the geometric mean.</p>
     * <p>This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double[]) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.</p>
     *
     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use
     * for computing the geometric mean
     * @throws DimensionMismatchException if the array dimension
     * does not match the one used at construction
     * @throws MathIllegalStateException if data has already been added
     *  (i.e if n > 0)
     */
    public void setGeoMeanImpl(StorelessUnivariateStatistic[] geoMeanImpl)
    throws MathIllegalStateException, DimensionMismatchException {try{__CLR4_4_113ap13aplb90pama.R.inc(51095);
        __CLR4_4_113ap13aplb90pama.R.inc(51096);setImpl(geoMeanImpl, this.geoMeanImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Returns the currently configured mean implementation
     *
     * @return the StorelessUnivariateStatistic implementing the mean
     */
    public StorelessUnivariateStatistic[] getMeanImpl() {try{__CLR4_4_113ap13aplb90pama.R.inc(51097);
        __CLR4_4_113ap13aplb90pama.R.inc(51098);return meanImpl.clone();
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the mean.</p>
     * <p>This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double[]) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.</p>
     *
     * @param meanImpl the StorelessUnivariateStatistic instance to use
     * for computing the mean
     * @throws DimensionMismatchException if the array dimension
     * does not match the one used at construction
     * @throws MathIllegalStateException if data has already been added
     *  (i.e if n > 0)
     */
    public void setMeanImpl(StorelessUnivariateStatistic[] meanImpl)
    throws MathIllegalStateException, DimensionMismatchException{try{__CLR4_4_113ap13aplb90pama.R.inc(51099);
        __CLR4_4_113ap13aplb90pama.R.inc(51100);setImpl(meanImpl, this.meanImpl);
    }finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Throws MathIllegalStateException if the statistic is not empty.
     * @throws MathIllegalStateException if n > 0.
     */
    private void checkEmpty() throws MathIllegalStateException {try{__CLR4_4_113ap13aplb90pama.R.inc(51101);
        __CLR4_4_113ap13aplb90pama.R.inc(51102);if ((((n > 0)&&(__CLR4_4_113ap13aplb90pama.R.iget(51103)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(51104)==0&false))) {{
            __CLR4_4_113ap13aplb90pama.R.inc(51105);throw new MathIllegalStateException(
                    LocalizedFormats.VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC, n);
        }
    }}finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}

    /**
     * Throws DimensionMismatchException if dimension != k.
     * @param dimension dimension to check
     * @throws DimensionMismatchException if dimension != k
     */
    private void checkDimension(int dimension) throws DimensionMismatchException {try{__CLR4_4_113ap13aplb90pama.R.inc(51106);
        __CLR4_4_113ap13aplb90pama.R.inc(51107);if ((((dimension != k)&&(__CLR4_4_113ap13aplb90pama.R.iget(51108)!=0|true))||(__CLR4_4_113ap13aplb90pama.R.iget(51109)==0&false))) {{
            __CLR4_4_113ap13aplb90pama.R.inc(51110);throw new DimensionMismatchException(dimension, k);
        }
    }}finally{__CLR4_4_113ap13aplb90pama.R.flushNeeded();}}
}
