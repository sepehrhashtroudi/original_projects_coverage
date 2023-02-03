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
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.math3.exception.NullArgumentException;

/**
 * <p>
 * An aggregator for {@code SummaryStatistics} from several data sets or
 * data set partitions.  In its simplest usage mode, the client creates an
 * instance via the zero-argument constructor, then uses
 * {@link #createContributingStatistics()} to obtain a {@code SummaryStatistics}
 * for each individual data set / partition.  The per-set statistics objects
 * are used as normal, and at any time the aggregate statistics for all the
 * contributors can be obtained from this object.
 * </p><p>
 * Clients with specialized requirements can use alternative constructors to
 * control the statistics implementations and initial values used by the
 * contributing and the internal aggregate {@code SummaryStatistics} objects.
 * </p><p>
 * A static {@link #aggregate(Collection)} method is also included that computes
 * aggregate statistics directly from a Collection of SummaryStatistics instances.
 * </p><p>
 * When {@link #createContributingStatistics()} is used to create SummaryStatistics
 * instances to be aggregated concurrently, the created instances'
 * {@link SummaryStatistics#addValue(double)} methods must synchronize on the aggregating
 * instance maintained by this class.  In multithreaded environments, if the functionality
 * provided by {@link #aggregate(Collection)} is adequate, that method should be used
 * to avoid unnecessary computation and synchronization delays.</p>
 *
 * @since 2.0
 * @version $Id$
 *
 */
public class AggregateSummaryStatistics implements StatisticalSummary,
        Serializable {public static class __CLR4_4_1132i132ilb90palq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50753,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    /** Serializable version identifier */
    private static final long serialVersionUID = -8207112444016386906L;

    /**
     * A SummaryStatistics serving as a prototype for creating SummaryStatistics
     * contributing to this aggregate
     */
    private final SummaryStatistics statisticsPrototype;

    /**
     * The SummaryStatistics in which aggregate statistics are accumulated.
     */
    private final SummaryStatistics statistics;

    /**
     * Initializes a new AggregateSummaryStatistics with default statistics
     * implementations.
     *
     */
    public AggregateSummaryStatistics() {
        // No try-catch or throws NAE because arg is guaranteed non-null
        this(new SummaryStatistics());__CLR4_4_1132i132ilb90palq.R.inc(50635);try{__CLR4_4_1132i132ilb90palq.R.inc(50634);
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Initializes a new AggregateSummaryStatistics with the specified statistics
     * object as a prototype for contributing statistics and for the internal
     * aggregate statistics.  This provides for customized statistics implementations
     * to be used by contributing and aggregate statistics.
     *
     * @param prototypeStatistics a {@code SummaryStatistics} serving as a
     *      prototype both for the internal aggregate statistics and for
     *      contributing statistics obtained via the
     *      {@code createContributingStatistics()} method.  Being a prototype
     *      means that other objects are initialized by copying this object's state.
     *      If {@code null}, a new, default statistics object is used.  Any statistic
     *      values in the prototype are propagated to contributing statistics
     *      objects and (once) into these aggregate statistics.
     * @throws NullArgumentException if prototypeStatistics is null
     * @see #createContributingStatistics()
     */
    public AggregateSummaryStatistics(SummaryStatistics prototypeStatistics) throws NullArgumentException {
        this(prototypeStatistics,
             (((prototypeStatistics == null )&&(__CLR4_4_1132i132ilb90palq.R.iget(50637)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50638)==0&false))? null : new SummaryStatistics(prototypeStatistics));__CLR4_4_1132i132ilb90palq.R.inc(50639);try{__CLR4_4_1132i132ilb90palq.R.inc(50636);
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Initializes a new AggregateSummaryStatistics with the specified statistics
     * object as a prototype for contributing statistics and for the internal
     * aggregate statistics.  This provides for different statistics implementations
     * to be used by contributing and aggregate statistics and for an initial
     * state to be supplied for the aggregate statistics.
     *
     * @param prototypeStatistics a {@code SummaryStatistics} serving as a
     *      prototype both for the internal aggregate statistics and for
     *      contributing statistics obtained via the
     *      {@code createContributingStatistics()} method.  Being a prototype
     *      means that other objects are initialized by copying this object's state.
     *      If {@code null}, a new, default statistics object is used.  Any statistic
     *      values in the prototype are propagated to contributing statistics
     *      objects, but not into these aggregate statistics.
     * @param initialStatistics a {@code SummaryStatistics} to serve as the
     *      internal aggregate statistics object.  If {@code null}, a new, default
     *      statistics object is used.
     * @see #createContributingStatistics()
     */
    public AggregateSummaryStatistics(SummaryStatistics prototypeStatistics,
                                      SummaryStatistics initialStatistics) {try{__CLR4_4_1132i132ilb90palq.R.inc(50640);
        __CLR4_4_1132i132ilb90palq.R.inc(50641);this.statisticsPrototype =
            ((((prototypeStatistics == null) )&&(__CLR4_4_1132i132ilb90palq.R.iget(50642)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50643)==0&false))? new SummaryStatistics() : prototypeStatistics;
        __CLR4_4_1132i132ilb90palq.R.inc(50644);this.statistics =
            ((((initialStatistics == null) )&&(__CLR4_4_1132i132ilb90palq.R.iget(50645)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50646)==0&false))? new SummaryStatistics() : initialStatistics;
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * {@inheritDoc}.  This version returns the maximum over all the aggregated
     * data.
     *
     * @see StatisticalSummary#getMax()
     */
    public double getMax() {try{__CLR4_4_1132i132ilb90palq.R.inc(50647);
        __CLR4_4_1132i132ilb90palq.R.inc(50648);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50649);return statistics.getMax();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * {@inheritDoc}.  This version returns the mean of all the aggregated data.
     *
     * @see StatisticalSummary#getMean()
     */
    public double getMean() {try{__CLR4_4_1132i132ilb90palq.R.inc(50650);
        __CLR4_4_1132i132ilb90palq.R.inc(50651);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50652);return statistics.getMean();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * {@inheritDoc}.  This version returns the minimum over all the aggregated
     * data.
     *
     * @see StatisticalSummary#getMin()
     */
    public double getMin() {try{__CLR4_4_1132i132ilb90palq.R.inc(50653);
        __CLR4_4_1132i132ilb90palq.R.inc(50654);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50655);return statistics.getMin();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * {@inheritDoc}.  This version returns a count of all the aggregated data.
     *
     * @see StatisticalSummary#getN()
     */
    public long getN() {try{__CLR4_4_1132i132ilb90palq.R.inc(50656);
        __CLR4_4_1132i132ilb90palq.R.inc(50657);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50658);return statistics.getN();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * {@inheritDoc}.  This version returns the standard deviation of all the
     * aggregated data.
     *
     * @see StatisticalSummary#getStandardDeviation()
     */
    public double getStandardDeviation() {try{__CLR4_4_1132i132ilb90palq.R.inc(50659);
        __CLR4_4_1132i132ilb90palq.R.inc(50660);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50661);return statistics.getStandardDeviation();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * {@inheritDoc}.  This version returns a sum of all the aggregated data.
     *
     * @see StatisticalSummary#getSum()
     */
    public double getSum() {try{__CLR4_4_1132i132ilb90palq.R.inc(50662);
        __CLR4_4_1132i132ilb90palq.R.inc(50663);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50664);return statistics.getSum();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * {@inheritDoc}.  This version returns the variance of all the aggregated
     * data.
     *
     * @see StatisticalSummary#getVariance()
     */
    public double getVariance() {try{__CLR4_4_1132i132ilb90palq.R.inc(50665);
        __CLR4_4_1132i132ilb90palq.R.inc(50666);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50667);return statistics.getVariance();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Returns the sum of the logs of all the aggregated data.
     *
     * @return the sum of logs
     * @see SummaryStatistics#getSumOfLogs()
     */
    public double getSumOfLogs() {try{__CLR4_4_1132i132ilb90palq.R.inc(50668);
        __CLR4_4_1132i132ilb90palq.R.inc(50669);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50670);return statistics.getSumOfLogs();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Returns the geometric mean of all the aggregated data.
     *
     * @return the geometric mean
     * @see SummaryStatistics#getGeometricMean()
     */
    public double getGeometricMean() {try{__CLR4_4_1132i132ilb90palq.R.inc(50671);
        __CLR4_4_1132i132ilb90palq.R.inc(50672);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50673);return statistics.getGeometricMean();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Returns the sum of the squares of all the aggregated data.
     *
     * @return The sum of squares
     * @see SummaryStatistics#getSumsq()
     */
    public double getSumsq() {try{__CLR4_4_1132i132ilb90palq.R.inc(50674);
        __CLR4_4_1132i132ilb90palq.R.inc(50675);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50676);return statistics.getSumsq();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Returns a statistic related to the Second Central Moment.  Specifically,
     * what is returned is the sum of squared deviations from the sample mean
     * among the all of the aggregated data.
     *
     * @return second central moment statistic
     * @see SummaryStatistics#getSecondMoment()
     */
    public double getSecondMoment() {try{__CLR4_4_1132i132ilb90palq.R.inc(50677);
        __CLR4_4_1132i132ilb90palq.R.inc(50678);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50679);return statistics.getSecondMoment();
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Return a {@link StatisticalSummaryValues} instance reporting current
     * aggregate statistics.
     *
     * @return Current values of aggregate statistics
     */
    public StatisticalSummary getSummary() {try{__CLR4_4_1132i132ilb90palq.R.inc(50680);
        __CLR4_4_1132i132ilb90palq.R.inc(50681);synchronized (statistics) {
            __CLR4_4_1132i132ilb90palq.R.inc(50682);return new StatisticalSummaryValues(getMean(), getVariance(), getN(),
                    getMax(), getMin(), getSum());
        }
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Creates and returns a {@code SummaryStatistics} whose data will be
     * aggregated with those of this {@code AggregateSummaryStatistics}.
     *
     * @return a {@code SummaryStatistics} whose data will be aggregated with
     *      those of this {@code AggregateSummaryStatistics}.  The initial state
     *      is a copy of the configured prototype statistics.
     */
    public SummaryStatistics createContributingStatistics() {try{__CLR4_4_1132i132ilb90palq.R.inc(50683);
        __CLR4_4_1132i132ilb90palq.R.inc(50684);SummaryStatistics contributingStatistics
                = new AggregatingSummaryStatistics(statistics);

        // No try - catch or advertising NAE because neither argument will ever be null
        __CLR4_4_1132i132ilb90palq.R.inc(50685);SummaryStatistics.copy(statisticsPrototype, contributingStatistics);

        __CLR4_4_1132i132ilb90palq.R.inc(50686);return contributingStatistics;
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * Computes aggregate summary statistics. This method can be used to combine statistics
     * computed over partitions or subsamples - i.e., the StatisticalSummaryValues returned
     * should contain the same values that would have been obtained by computing a single
     * StatisticalSummary over the combined dataset.
     * <p>
     * Returns null if the collection is empty or null.
     * </p>
     *
     * @param statistics collection of SummaryStatistics to aggregate
     * @return summary statistics for the combined dataset
     */
    public static StatisticalSummaryValues aggregate(Collection<SummaryStatistics> statistics) {try{__CLR4_4_1132i132ilb90palq.R.inc(50687);
        __CLR4_4_1132i132ilb90palq.R.inc(50688);if ((((statistics == null)&&(__CLR4_4_1132i132ilb90palq.R.iget(50689)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50690)==0&false))) {{
            __CLR4_4_1132i132ilb90palq.R.inc(50691);return null;
        }
        }__CLR4_4_1132i132ilb90palq.R.inc(50692);Iterator<SummaryStatistics> iterator = statistics.iterator();
        __CLR4_4_1132i132ilb90palq.R.inc(50693);if ((((!iterator.hasNext())&&(__CLR4_4_1132i132ilb90palq.R.iget(50694)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50695)==0&false))) {{
            __CLR4_4_1132i132ilb90palq.R.inc(50696);return null;
        }
        }__CLR4_4_1132i132ilb90palq.R.inc(50697);SummaryStatistics current = iterator.next();
        __CLR4_4_1132i132ilb90palq.R.inc(50698);long n = current.getN();
        __CLR4_4_1132i132ilb90palq.R.inc(50699);double min = current.getMin();
        __CLR4_4_1132i132ilb90palq.R.inc(50700);double sum = current.getSum();
        __CLR4_4_1132i132ilb90palq.R.inc(50701);double max = current.getMax();
        __CLR4_4_1132i132ilb90palq.R.inc(50702);double m2 = current.getSecondMoment();
        __CLR4_4_1132i132ilb90palq.R.inc(50703);double mean = current.getMean();
        __CLR4_4_1132i132ilb90palq.R.inc(50704);while ((((iterator.hasNext())&&(__CLR4_4_1132i132ilb90palq.R.iget(50705)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50706)==0&false))) {{
            __CLR4_4_1132i132ilb90palq.R.inc(50707);current = iterator.next();
            __CLR4_4_1132i132ilb90palq.R.inc(50708);if ((((current.getMin() < min || Double.isNaN(min))&&(__CLR4_4_1132i132ilb90palq.R.iget(50709)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50710)==0&false))) {{
                __CLR4_4_1132i132ilb90palq.R.inc(50711);min = current.getMin();
            }
            }__CLR4_4_1132i132ilb90palq.R.inc(50712);if ((((current.getMax() > max || Double.isNaN(max))&&(__CLR4_4_1132i132ilb90palq.R.iget(50713)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50714)==0&false))) {{
                __CLR4_4_1132i132ilb90palq.R.inc(50715);max = current.getMax();
            }
            }__CLR4_4_1132i132ilb90palq.R.inc(50716);sum += current.getSum();
            __CLR4_4_1132i132ilb90palq.R.inc(50717);final double oldN = n;
            __CLR4_4_1132i132ilb90palq.R.inc(50718);final double curN = current.getN();
            __CLR4_4_1132i132ilb90palq.R.inc(50719);n += curN;
            __CLR4_4_1132i132ilb90palq.R.inc(50720);final double meanDiff = current.getMean() - mean;
            __CLR4_4_1132i132ilb90palq.R.inc(50721);mean = sum / n;
            __CLR4_4_1132i132ilb90palq.R.inc(50722);m2 = m2 + current.getSecondMoment() + meanDiff * meanDiff * oldN * curN / n;
        }
        }__CLR4_4_1132i132ilb90palq.R.inc(50723);final double variance;
        __CLR4_4_1132i132ilb90palq.R.inc(50724);if ((((n == 0)&&(__CLR4_4_1132i132ilb90palq.R.iget(50725)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50726)==0&false))) {{
            __CLR4_4_1132i132ilb90palq.R.inc(50727);variance = Double.NaN;
        } }else {__CLR4_4_1132i132ilb90palq.R.inc(50728);if ((((n == 1)&&(__CLR4_4_1132i132ilb90palq.R.iget(50729)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50730)==0&false))) {{
            __CLR4_4_1132i132ilb90palq.R.inc(50731);variance = 0d;
        } }else {{
            __CLR4_4_1132i132ilb90palq.R.inc(50732);variance = m2 / (n - 1);
        }
        }}__CLR4_4_1132i132ilb90palq.R.inc(50733);return new StatisticalSummaryValues(mean, variance, n, max, min, sum);
    }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

    /**
     * A SummaryStatistics that also forwards all values added to it to a second
     * {@code SummaryStatistics} for aggregation.
     *
     * @since 2.0
     */
    private static class AggregatingSummaryStatistics extends SummaryStatistics {

        /**
         * The serialization version of this class
         */
        private static final long serialVersionUID = 1L;

        /**
         * An additional SummaryStatistics into which values added to these
         * statistics (and possibly others) are aggregated
         */
        private final SummaryStatistics aggregateStatistics;

        /**
         * Initializes a new AggregatingSummaryStatistics with the specified
         * aggregate statistics object
         *
         * @param aggregateStatistics a {@code SummaryStatistics} into which
         *      values added to this statistics object should be aggregated
         */
        public AggregatingSummaryStatistics(SummaryStatistics aggregateStatistics) {try{__CLR4_4_1132i132ilb90palq.R.inc(50734);
            __CLR4_4_1132i132ilb90palq.R.inc(50735);this.aggregateStatistics = aggregateStatistics;
        }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

        /**
         * {@inheritDoc}.  This version adds the provided value to the configured
         * aggregate after adding it to these statistics.
         *
         * @see SummaryStatistics#addValue(double)
         */
        @Override
        public void addValue(double value) {try{__CLR4_4_1132i132ilb90palq.R.inc(50736);
            __CLR4_4_1132i132ilb90palq.R.inc(50737);super.addValue(value);
            __CLR4_4_1132i132ilb90palq.R.inc(50738);synchronized (aggregateStatistics) {
                __CLR4_4_1132i132ilb90palq.R.inc(50739);aggregateStatistics.addValue(value);
            }
        }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

        /**
         * Returns true iff <code>object</code> is a
         * <code>SummaryStatistics</code> instance and all statistics have the
         * same values as this.
         * @param object the object to test equality against.
         * @return true if object equals this
         */
        @Override
        public boolean equals(Object object) {try{__CLR4_4_1132i132ilb90palq.R.inc(50740);
            __CLR4_4_1132i132ilb90palq.R.inc(50741);if ((((object == this)&&(__CLR4_4_1132i132ilb90palq.R.iget(50742)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50743)==0&false))) {{
                __CLR4_4_1132i132ilb90palq.R.inc(50744);return true;
            }
            }__CLR4_4_1132i132ilb90palq.R.inc(50745);if ((((object instanceof AggregatingSummaryStatistics == false)&&(__CLR4_4_1132i132ilb90palq.R.iget(50746)!=0|true))||(__CLR4_4_1132i132ilb90palq.R.iget(50747)==0&false))) {{
                __CLR4_4_1132i132ilb90palq.R.inc(50748);return false;
            }
            }__CLR4_4_1132i132ilb90palq.R.inc(50749);AggregatingSummaryStatistics stat = (AggregatingSummaryStatistics)object;
            __CLR4_4_1132i132ilb90palq.R.inc(50750);return super.equals(stat) &&
                   aggregateStatistics.equals(stat.aggregateStatistics);
        }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}

        /**
         * Returns hash code based on values of statistics
         * @return hash code
         */
        @Override
        public int hashCode() {try{__CLR4_4_1132i132ilb90palq.R.inc(50751);
            __CLR4_4_1132i132ilb90palq.R.inc(50752);return 123 + super.hashCode() + aggregateStatistics.hashCode();
        }finally{__CLR4_4_1132i132ilb90palq.R.flushNeeded();}}
    }
}
