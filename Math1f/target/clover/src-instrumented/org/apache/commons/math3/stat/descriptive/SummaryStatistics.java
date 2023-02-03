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

import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;

/**
 * <p>
 * Computes summary statistics for a stream of data values added using the
 * {@link #addValue(double) addValue} method. The data values are not stored in
 * memory, so this class can be used to compute statistics for very large data
 * streams.
 * </p>
 * <p>
 * The {@link StorelessUnivariateStatistic} instances used to maintain summary
 * state and compute statistics are configurable via setters. For example, the
 * default implementation for the variance can be overridden by calling
 * {@link #setVarianceImpl(StorelessUnivariateStatistic)}. Actual parameters to
 * these methods must implement the {@link StorelessUnivariateStatistic}
 * interface and configuration must be completed before <code>addValue</code>
 * is called. No configuration is necessary to use the default, commons-math
 * provided implementations.
 * </p>
 * <p>
 * Note: This class is not thread-safe. Use
 * {@link SynchronizedSummaryStatistics} if concurrent access from multiple
 * threads is required.
 * </p>
 * @version $Id$
 */
public class SummaryStatistics implements StatisticalSummary, Serializable {public static class __CLR4_4_113h813h8lb90pamp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization UID */
    private static final long serialVersionUID = -2021321786743555871L;

    /** count of values that have been added */
    private long n = 0;

    /** SecondMoment is used to compute the mean and variance */
    private SecondMoment secondMoment = new SecondMoment();

    /** sum of values that have been added */
    private Sum sum = new Sum();

    /** sum of the square of each value that has been added */
    private SumOfSquares sumsq = new SumOfSquares();

    /** min of values that have been added */
    private Min min = new Min();

    /** max of values that have been added */
    private Max max = new Max();

    /** sumLog of values that have been added */
    private SumOfLogs sumLog = new SumOfLogs();

    /** geoMean of values that have been added */
    private GeometricMean geoMean = new GeometricMean(sumLog);

    /** mean of values that have been added */
    private Mean mean = new Mean(secondMoment);

    /** variance of values that have been added */
    private Variance variance = new Variance(secondMoment);

    /** Sum statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic sumImpl = sum;

    /** Sum of squares statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic sumsqImpl = sumsq;

    /** Minimum statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic minImpl = min;

    /** Maximum statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic maxImpl = max;

    /** Sum of log statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic sumLogImpl = sumLog;

    /** Geometric mean statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic geoMeanImpl = geoMean;

    /** Mean statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic meanImpl = mean;

    /** Variance statistic implementation - can be reset by setter. */
    private StorelessUnivariateStatistic varianceImpl = variance;

    /**
     * Construct a SummaryStatistics instance
     */
    public SummaryStatistics() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51164);
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * A copy constructor. Creates a deep-copy of the {@code original}.
     *
     * @param original the {@code SummaryStatistics} instance to copy
     * @throws NullArgumentException if original is null
     */
    public SummaryStatistics(SummaryStatistics original) throws NullArgumentException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51165);
        __CLR4_4_113h813h8lb90pamp.R.inc(51166);copy(original, this);
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Return a {@link StatisticalSummaryValues} instance reporting current
     * statistics.
     * @return Current values of statistics
     */
    public StatisticalSummary getSummary() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51167);
        __CLR4_4_113h813h8lb90pamp.R.inc(51168);return new StatisticalSummaryValues(getMean(), getVariance(), getN(),
                getMax(), getMin(), getSum());
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Add a value to the data
     * @param value the value to add
     */
    public void addValue(double value) {try{__CLR4_4_113h813h8lb90pamp.R.inc(51169);
        __CLR4_4_113h813h8lb90pamp.R.inc(51170);sumImpl.increment(value);
        __CLR4_4_113h813h8lb90pamp.R.inc(51171);sumsqImpl.increment(value);
        __CLR4_4_113h813h8lb90pamp.R.inc(51172);minImpl.increment(value);
        __CLR4_4_113h813h8lb90pamp.R.inc(51173);maxImpl.increment(value);
        __CLR4_4_113h813h8lb90pamp.R.inc(51174);sumLogImpl.increment(value);
        __CLR4_4_113h813h8lb90pamp.R.inc(51175);secondMoment.increment(value);
        // If mean, variance or geomean have been overridden,
        // need to increment these
        __CLR4_4_113h813h8lb90pamp.R.inc(51176);if ((((meanImpl != mean)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51177)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51178)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51179);meanImpl.increment(value);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51180);if ((((varianceImpl != variance)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51181)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51182)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51183);varianceImpl.increment(value);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51184);if ((((geoMeanImpl != geoMean)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51185)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51186)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51187);geoMeanImpl.increment(value);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51188);n++;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the number of available values
     * @return The number of available values
     */
    public long getN() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51189);
        __CLR4_4_113h813h8lb90pamp.R.inc(51190);return n;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the sum of the values that have been added
     * @return The sum or <code>Double.NaN</code> if no values have been added
     */
    public double getSum() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51191);
        __CLR4_4_113h813h8lb90pamp.R.inc(51192);return sumImpl.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the sum of the squares of the values that have been added.
     * <p>
     * Double.NaN is returned if no values have been added.
     * </p>
     * @return The sum of squares
     */
    public double getSumsq() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51193);
        __CLR4_4_113h813h8lb90pamp.R.inc(51194);return sumsqImpl.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the mean of the values that have been added.
     * <p>
     * Double.NaN is returned if no values have been added.
     * </p>
     * @return the mean
     */
    public double getMean() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51195);
        __CLR4_4_113h813h8lb90pamp.R.inc(51196);return meanImpl.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the standard deviation of the values that have been added.
     * <p>
     * Double.NaN is returned if no values have been added.
     * </p>
     * @return the standard deviation
     */
    public double getStandardDeviation() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51197);
        __CLR4_4_113h813h8lb90pamp.R.inc(51198);double stdDev = Double.NaN;
        __CLR4_4_113h813h8lb90pamp.R.inc(51199);if ((((getN() > 0)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51200)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51201)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51202);if ((((getN() > 1)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51203)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51204)==0&false))) {{
                __CLR4_4_113h813h8lb90pamp.R.inc(51205);stdDev = FastMath.sqrt(getVariance());
            } }else {{
                __CLR4_4_113h813h8lb90pamp.R.inc(51206);stdDev = 0.0;
            }
        }}
        }__CLR4_4_113h813h8lb90pamp.R.inc(51207);return stdDev;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the (sample) variance of the available values.
     *
     * <p>This method returns the bias-corrected sample variance (using {@code n - 1} in
     * the denominator).  Use {@link #getPopulationVariance()} for the non-bias-corrected
     * population variance.</p>
     *
     * <p>Double.NaN is returned if no values have been added.</p>
     *
     * @return the variance
     */
    public double getVariance() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51208);
        __CLR4_4_113h813h8lb90pamp.R.inc(51209);return varianceImpl.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the <a href="http://en.wikibooks.org/wiki/Statistics/Summary/Variance">
     * population variance</a> of the values that have been added.
     *
     * <p>Double.NaN is returned if no values have been added.</p>
     *
     * @return the population variance
     */
    public double getPopulationVariance() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51210);
        __CLR4_4_113h813h8lb90pamp.R.inc(51211);Variance populationVariance = new Variance(secondMoment);
        __CLR4_4_113h813h8lb90pamp.R.inc(51212);populationVariance.setBiasCorrected(false);
        __CLR4_4_113h813h8lb90pamp.R.inc(51213);return populationVariance.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the maximum of the values that have been added.
     * <p>
     * Double.NaN is returned if no values have been added.
     * </p>
     * @return the maximum
     */
    public double getMax() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51214);
        __CLR4_4_113h813h8lb90pamp.R.inc(51215);return maxImpl.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the minimum of the values that have been added.
     * <p>
     * Double.NaN is returned if no values have been added.
     * </p>
     * @return the minimum
     */
    public double getMin() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51216);
        __CLR4_4_113h813h8lb90pamp.R.inc(51217);return minImpl.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the geometric mean of the values that have been added.
     * <p>
     * Double.NaN is returned if no values have been added.
     * </p>
     * @return the geometric mean
     */
    public double getGeometricMean() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51218);
        __CLR4_4_113h813h8lb90pamp.R.inc(51219);return geoMeanImpl.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the sum of the logs of the values that have been added.
     * <p>
     * Double.NaN is returned if no values have been added.
     * </p>
     * @return the sum of logs
     * @since 1.2
     */
    public double getSumOfLogs() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51220);
        __CLR4_4_113h813h8lb90pamp.R.inc(51221);return sumLogImpl.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns a statistic related to the Second Central Moment.  Specifically,
     * what is returned is the sum of squared deviations from the sample mean
     * among the values that have been added.
     * <p>
     * Returns <code>Double.NaN</code> if no data values have been added and
     * returns <code>0</code> if there is just one value in the data set.</p>
     * <p>
     * @return second central moment statistic
     * @since 2.0
     */
    public double getSecondMoment() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51222);
        __CLR4_4_113h813h8lb90pamp.R.inc(51223);return secondMoment.getResult();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Generates a text report displaying summary statistics from values that
     * have been added.
     * @return String with line feeds displaying statistics
     * @since 1.2
     */
    @Override
    public String toString() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51224);
        __CLR4_4_113h813h8lb90pamp.R.inc(51225);StringBuilder outBuffer = new StringBuilder();
        __CLR4_4_113h813h8lb90pamp.R.inc(51226);String endl = "\n";
        __CLR4_4_113h813h8lb90pamp.R.inc(51227);outBuffer.append("SummaryStatistics:").append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51228);outBuffer.append("n: ").append(getN()).append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51229);outBuffer.append("min: ").append(getMin()).append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51230);outBuffer.append("max: ").append(getMax()).append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51231);outBuffer.append("mean: ").append(getMean()).append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51232);outBuffer.append("geometric mean: ").append(getGeometricMean())
            .append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51233);outBuffer.append("variance: ").append(getVariance()).append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51234);outBuffer.append("sum of squares: ").append(getSumsq()).append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51235);outBuffer.append("standard deviation: ").append(getStandardDeviation())
            .append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51236);outBuffer.append("sum of logs: ").append(getSumOfLogs()).append(endl);
        __CLR4_4_113h813h8lb90pamp.R.inc(51237);return outBuffer.toString();
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Resets all statistics and storage
     */
    public void clear() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51238);
        __CLR4_4_113h813h8lb90pamp.R.inc(51239);this.n = 0;
        __CLR4_4_113h813h8lb90pamp.R.inc(51240);minImpl.clear();
        __CLR4_4_113h813h8lb90pamp.R.inc(51241);maxImpl.clear();
        __CLR4_4_113h813h8lb90pamp.R.inc(51242);sumImpl.clear();
        __CLR4_4_113h813h8lb90pamp.R.inc(51243);sumLogImpl.clear();
        __CLR4_4_113h813h8lb90pamp.R.inc(51244);sumsqImpl.clear();
        __CLR4_4_113h813h8lb90pamp.R.inc(51245);geoMeanImpl.clear();
        __CLR4_4_113h813h8lb90pamp.R.inc(51246);secondMoment.clear();
        __CLR4_4_113h813h8lb90pamp.R.inc(51247);if ((((meanImpl != mean)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51248)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51249)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51250);meanImpl.clear();
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51251);if ((((varianceImpl != variance)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51252)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51253)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51254);varianceImpl.clear();
        }
    }}finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns true iff <code>object</code> is a
     * <code>SummaryStatistics</code> instance and all statistics have the
     * same values as this.
     * @param object the object to test equality against.
     * @return true if object equals this
     */
    @Override
    public boolean equals(Object object) {try{__CLR4_4_113h813h8lb90pamp.R.inc(51255);
        __CLR4_4_113h813h8lb90pamp.R.inc(51256);if ((((object == this)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51257)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51258)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51259);return true;
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51260);if ((((object instanceof SummaryStatistics == false)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51261)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51262)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51263);return false;
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51264);SummaryStatistics stat = (SummaryStatistics)object;
        __CLR4_4_113h813h8lb90pamp.R.inc(51265);return Precision.equalsIncludingNaN(stat.getGeometricMean(), getGeometricMean()) &&
               Precision.equalsIncludingNaN(stat.getMax(),           getMax())           &&
               Precision.equalsIncludingNaN(stat.getMean(),          getMean())          &&
               Precision.equalsIncludingNaN(stat.getMin(),           getMin())           &&
               Precision.equalsIncludingNaN(stat.getN(),             getN())             &&
               Precision.equalsIncludingNaN(stat.getSum(),           getSum())           &&
               Precision.equalsIncludingNaN(stat.getSumsq(),         getSumsq())         &&
               Precision.equalsIncludingNaN(stat.getVariance(),      getVariance());
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns hash code based on values of statistics
     * @return hash code
     */
    @Override
    public int hashCode() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51266);
        __CLR4_4_113h813h8lb90pamp.R.inc(51267);int result = 31 + MathUtils.hash(getGeometricMean());
        __CLR4_4_113h813h8lb90pamp.R.inc(51268);result = result * 31 + MathUtils.hash(getGeometricMean());
        __CLR4_4_113h813h8lb90pamp.R.inc(51269);result = result * 31 + MathUtils.hash(getMax());
        __CLR4_4_113h813h8lb90pamp.R.inc(51270);result = result * 31 + MathUtils.hash(getMean());
        __CLR4_4_113h813h8lb90pamp.R.inc(51271);result = result * 31 + MathUtils.hash(getMin());
        __CLR4_4_113h813h8lb90pamp.R.inc(51272);result = result * 31 + MathUtils.hash(getN());
        __CLR4_4_113h813h8lb90pamp.R.inc(51273);result = result * 31 + MathUtils.hash(getSum());
        __CLR4_4_113h813h8lb90pamp.R.inc(51274);result = result * 31 + MathUtils.hash(getSumsq());
        __CLR4_4_113h813h8lb90pamp.R.inc(51275);result = result * 31 + MathUtils.hash(getVariance());
        __CLR4_4_113h813h8lb90pamp.R.inc(51276);return result;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    // Getters and setters for statistics implementations
    /**
     * Returns the currently configured Sum implementation
     * @return the StorelessUnivariateStatistic implementing the sum
     * @since 1.2
     */
    public StorelessUnivariateStatistic getSumImpl() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51277);
        __CLR4_4_113h813h8lb90pamp.R.inc(51278);return sumImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * <p>
     * Sets the implementation for the Sum.
     * </p>
     * <p>
     * This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.
     * </p>
     * @param sumImpl the StorelessUnivariateStatistic instance to use for
     *        computing the Sum
     * @throws MathIllegalStateException if data has already been added (i.e if n >0)
     * @since 1.2
     */
    public void setSumImpl(StorelessUnivariateStatistic sumImpl)
    throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51279);
        __CLR4_4_113h813h8lb90pamp.R.inc(51280);checkEmpty();
        __CLR4_4_113h813h8lb90pamp.R.inc(51281);this.sumImpl = sumImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the currently configured sum of squares implementation
     * @return the StorelessUnivariateStatistic implementing the sum of squares
     * @since 1.2
     */
    public StorelessUnivariateStatistic getSumsqImpl() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51282);
        __CLR4_4_113h813h8lb90pamp.R.inc(51283);return sumsqImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * <p>
     * Sets the implementation for the sum of squares.
     * </p>
     * <p>
     * This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.
     * </p>
     * @param sumsqImpl the StorelessUnivariateStatistic instance to use for
     *        computing the sum of squares
     * @throws MathIllegalStateException if data has already been added (i.e if n > 0)
     * @since 1.2
     */
    public void setSumsqImpl(StorelessUnivariateStatistic sumsqImpl)
    throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51284);
        __CLR4_4_113h813h8lb90pamp.R.inc(51285);checkEmpty();
        __CLR4_4_113h813h8lb90pamp.R.inc(51286);this.sumsqImpl = sumsqImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the currently configured minimum implementation
     * @return the StorelessUnivariateStatistic implementing the minimum
     * @since 1.2
     */
    public StorelessUnivariateStatistic getMinImpl() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51287);
        __CLR4_4_113h813h8lb90pamp.R.inc(51288);return minImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * <p>
     * Sets the implementation for the minimum.
     * </p>
     * <p>
     * This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.
     * </p>
     * @param minImpl the StorelessUnivariateStatistic instance to use for
     *        computing the minimum
     * @throws MathIllegalStateException if data has already been added (i.e if n > 0)
     * @since 1.2
     */
    public void setMinImpl(StorelessUnivariateStatistic minImpl)
    throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51289);
        __CLR4_4_113h813h8lb90pamp.R.inc(51290);checkEmpty();
        __CLR4_4_113h813h8lb90pamp.R.inc(51291);this.minImpl = minImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the currently configured maximum implementation
     * @return the StorelessUnivariateStatistic implementing the maximum
     * @since 1.2
     */
    public StorelessUnivariateStatistic getMaxImpl() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51292);
        __CLR4_4_113h813h8lb90pamp.R.inc(51293);return maxImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * <p>
     * Sets the implementation for the maximum.
     * </p>
     * <p>
     * This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.
     * </p>
     * @param maxImpl the StorelessUnivariateStatistic instance to use for
     *        computing the maximum
     * @throws MathIllegalStateException if data has already been added (i.e if n > 0)
     * @since 1.2
     */
    public void setMaxImpl(StorelessUnivariateStatistic maxImpl)
    throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51294);
        __CLR4_4_113h813h8lb90pamp.R.inc(51295);checkEmpty();
        __CLR4_4_113h813h8lb90pamp.R.inc(51296);this.maxImpl = maxImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the currently configured sum of logs implementation
     * @return the StorelessUnivariateStatistic implementing the log sum
     * @since 1.2
     */
    public StorelessUnivariateStatistic getSumLogImpl() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51297);
        __CLR4_4_113h813h8lb90pamp.R.inc(51298);return sumLogImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * <p>
     * Sets the implementation for the sum of logs.
     * </p>
     * <p>
     * This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.
     * </p>
     * @param sumLogImpl the StorelessUnivariateStatistic instance to use for
     *        computing the log sum
     * @throws MathIllegalStateException if data has already been added (i.e if n > 0)
     * @since 1.2
     */
    public void setSumLogImpl(StorelessUnivariateStatistic sumLogImpl)
    throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51299);
        __CLR4_4_113h813h8lb90pamp.R.inc(51300);checkEmpty();
        __CLR4_4_113h813h8lb90pamp.R.inc(51301);this.sumLogImpl = sumLogImpl;
        __CLR4_4_113h813h8lb90pamp.R.inc(51302);geoMean.setSumLogImpl(sumLogImpl);
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the currently configured geometric mean implementation
     * @return the StorelessUnivariateStatistic implementing the geometric mean
     * @since 1.2
     */
    public StorelessUnivariateStatistic getGeoMeanImpl() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51303);
        __CLR4_4_113h813h8lb90pamp.R.inc(51304);return geoMeanImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * <p>
     * Sets the implementation for the geometric mean.
     * </p>
     * <p>
     * This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.
     * </p>
     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use for
     *        computing the geometric mean
     * @throws MathIllegalStateException if data has already been added (i.e if n > 0)
     * @since 1.2
     */
    public void setGeoMeanImpl(StorelessUnivariateStatistic geoMeanImpl)
    throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51305);
        __CLR4_4_113h813h8lb90pamp.R.inc(51306);checkEmpty();
        __CLR4_4_113h813h8lb90pamp.R.inc(51307);this.geoMeanImpl = geoMeanImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the currently configured mean implementation
     * @return the StorelessUnivariateStatistic implementing the mean
     * @since 1.2
     */
    public StorelessUnivariateStatistic getMeanImpl() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51308);
        __CLR4_4_113h813h8lb90pamp.R.inc(51309);return meanImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * <p>
     * Sets the implementation for the mean.
     * </p>
     * <p>
     * This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.
     * </p>
     * @param meanImpl the StorelessUnivariateStatistic instance to use for
     *        computing the mean
     * @throws MathIllegalStateException if data has already been added (i.e if n > 0)
     * @since 1.2
     */
    public void setMeanImpl(StorelessUnivariateStatistic meanImpl)
    throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51310);
        __CLR4_4_113h813h8lb90pamp.R.inc(51311);checkEmpty();
        __CLR4_4_113h813h8lb90pamp.R.inc(51312);this.meanImpl = meanImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns the currently configured variance implementation
     * @return the StorelessUnivariateStatistic implementing the variance
     * @since 1.2
     */
    public StorelessUnivariateStatistic getVarianceImpl() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51313);
        __CLR4_4_113h813h8lb90pamp.R.inc(51314);return varianceImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * <p>
     * Sets the implementation for the variance.
     * </p>
     * <p>
     * This method must be activated before any data has been added - i.e.,
     * before {@link #addValue(double) addValue} has been used to add data;
     * otherwise an IllegalStateException will be thrown.
     * </p>
     * @param varianceImpl the StorelessUnivariateStatistic instance to use for
     *        computing the variance
     * @throws MathIllegalStateException if data has already been added (i.e if n > 0)
     * @since 1.2
     */
    public void setVarianceImpl(StorelessUnivariateStatistic varianceImpl)
    throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51315);
        __CLR4_4_113h813h8lb90pamp.R.inc(51316);checkEmpty();
        __CLR4_4_113h813h8lb90pamp.R.inc(51317);this.varianceImpl = varianceImpl;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Throws IllegalStateException if n > 0.
     * @throws MathIllegalStateException if data has been added
     */
    private void checkEmpty() throws MathIllegalStateException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51318);
        __CLR4_4_113h813h8lb90pamp.R.inc(51319);if ((((n > 0)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51320)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51321)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51322);throw new MathIllegalStateException(
                LocalizedFormats.VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC, n);
        }
    }}finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Returns a copy of this SummaryStatistics instance with the same internal state.
     *
     * @return a copy of this
     */
    public SummaryStatistics copy() {try{__CLR4_4_113h813h8lb90pamp.R.inc(51323);
        __CLR4_4_113h813h8lb90pamp.R.inc(51324);SummaryStatistics result = new SummaryStatistics();
        // No try-catch or advertised exception because arguments are guaranteed non-null
        __CLR4_4_113h813h8lb90pamp.R.inc(51325);copy(this, result);
        __CLR4_4_113h813h8lb90pamp.R.inc(51326);return result;
    }finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source SummaryStatistics to copy
     * @param dest SummaryStatistics to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(SummaryStatistics source, SummaryStatistics dest)
        throws NullArgumentException {try{__CLR4_4_113h813h8lb90pamp.R.inc(51327);
        __CLR4_4_113h813h8lb90pamp.R.inc(51328);MathUtils.checkNotNull(source);
        __CLR4_4_113h813h8lb90pamp.R.inc(51329);MathUtils.checkNotNull(dest);
        __CLR4_4_113h813h8lb90pamp.R.inc(51330);dest.maxImpl = source.maxImpl.copy();
        __CLR4_4_113h813h8lb90pamp.R.inc(51331);dest.minImpl = source.minImpl.copy();
        __CLR4_4_113h813h8lb90pamp.R.inc(51332);dest.sumImpl = source.sumImpl.copy();
        __CLR4_4_113h813h8lb90pamp.R.inc(51333);dest.sumLogImpl = source.sumLogImpl.copy();
        __CLR4_4_113h813h8lb90pamp.R.inc(51334);dest.sumsqImpl = source.sumsqImpl.copy();
        __CLR4_4_113h813h8lb90pamp.R.inc(51335);dest.secondMoment = source.secondMoment.copy();
        __CLR4_4_113h813h8lb90pamp.R.inc(51336);dest.n = source.n;

        // Keep commons-math supplied statistics with embedded moments in synch
        __CLR4_4_113h813h8lb90pamp.R.inc(51337);if ((((source.getVarianceImpl() instanceof Variance)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51338)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51339)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51340);dest.varianceImpl = new Variance(dest.secondMoment);
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51341);dest.varianceImpl = source.varianceImpl.copy();
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51342);if ((((source.meanImpl instanceof Mean)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51343)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51344)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51345);dest.meanImpl = new Mean(dest.secondMoment);
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51346);dest.meanImpl = source.meanImpl.copy();
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51347);if ((((source.getGeoMeanImpl() instanceof GeometricMean)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51348)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51349)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51350);dest.geoMeanImpl = new GeometricMean((SumOfLogs) dest.sumLogImpl);
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51351);dest.geoMeanImpl = source.geoMeanImpl.copy();
        }

        // Make sure that if stat == statImpl in source, same
        // holds in dest; otherwise copy stat
        }__CLR4_4_113h813h8lb90pamp.R.inc(51352);if ((((source.geoMean == source.geoMeanImpl)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51353)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51354)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51355);dest.geoMean = (GeometricMean) dest.geoMeanImpl;
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51356);GeometricMean.copy(source.geoMean, dest.geoMean);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51357);if ((((source.max == source.maxImpl)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51358)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51359)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51360);dest.max = (Max) dest.maxImpl;
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51361);Max.copy(source.max, dest.max);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51362);if ((((source.mean == source.meanImpl)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51363)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51364)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51365);dest.mean = (Mean) dest.meanImpl;
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51366);Mean.copy(source.mean, dest.mean);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51367);if ((((source.min == source.minImpl)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51368)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51369)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51370);dest.min = (Min) dest.minImpl;
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51371);Min.copy(source.min, dest.min);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51372);if ((((source.sum == source.sumImpl)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51373)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51374)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51375);dest.sum = (Sum) dest.sumImpl;
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51376);Sum.copy(source.sum, dest.sum);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51377);if ((((source.variance == source.varianceImpl)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51378)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51379)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51380);dest.variance = (Variance) dest.varianceImpl;
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51381);Variance.copy(source.variance, dest.variance);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51382);if ((((source.sumLog == source.sumLogImpl)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51383)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51384)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51385);dest.sumLog = (SumOfLogs) dest.sumLogImpl;
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51386);SumOfLogs.copy(source.sumLog, dest.sumLog);
        }
        }__CLR4_4_113h813h8lb90pamp.R.inc(51387);if ((((source.sumsq == source.sumsqImpl)&&(__CLR4_4_113h813h8lb90pamp.R.iget(51388)!=0|true))||(__CLR4_4_113h813h8lb90pamp.R.iget(51389)==0&false))) {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51390);dest.sumsq = (SumOfSquares) dest.sumsqImpl;
        } }else {{
            __CLR4_4_113h813h8lb90pamp.R.inc(51391);SumOfSquares.copy(source.sumsq, dest.sumsq);
        }
    }}finally{__CLR4_4_113h813h8lb90pamp.R.flushNeeded();}}
}
