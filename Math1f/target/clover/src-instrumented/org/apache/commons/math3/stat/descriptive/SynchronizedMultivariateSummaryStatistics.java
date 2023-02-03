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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Implementation of
 * {@link org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics} that
 * is safe to use in a multithreaded environment.  Multiple threads can safely
 * operate on a single instance without causing runtime exceptions due to race
 * conditions.  In effect, this implementation makes modification and access
 * methods atomic operations for a single instance.  That is to say, as one
 * thread is computing a statistic from the instance, no other thread can modify
 * the instance nor compute another statistic.
 * @since 1.2
 * @version $Id$
 */
public class SynchronizedMultivariateSummaryStatistics
    extends MultivariateSummaryStatistics {public static class __CLR4_4_113ok13oklb90pamv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization UID */
    private static final long serialVersionUID = 7099834153347155363L;

    /**
     * Construct a SynchronizedMultivariateSummaryStatistics instance
     * @param k dimension of the data
     * @param isCovarianceBiasCorrected if true, the unbiased sample
     * covariance is computed, otherwise the biased population covariance
     * is computed
     */
    public SynchronizedMultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected) {
        super(k, isCovarianceBiasCorrected);__CLR4_4_113ok13oklb90pamv.R.inc(51429);try{__CLR4_4_113ok13oklb90pamv.R.inc(51428);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void addValue(double[] value) throws DimensionMismatchException {try{__CLR4_4_113ok13oklb90pamv.R.inc(51430);
      __CLR4_4_113ok13oklb90pamv.R.inc(51431);super.addValue(value);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized int getDimension() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51432);
        __CLR4_4_113ok13oklb90pamv.R.inc(51433);return super.getDimension();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized long getN() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51434);
        __CLR4_4_113ok13oklb90pamv.R.inc(51435);return super.getN();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getSum() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51436);
        __CLR4_4_113ok13oklb90pamv.R.inc(51437);return super.getSum();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getSumSq() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51438);
        __CLR4_4_113ok13oklb90pamv.R.inc(51439);return super.getSumSq();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getSumLog() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51440);
        __CLR4_4_113ok13oklb90pamv.R.inc(51441);return super.getSumLog();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getMean() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51442);
        __CLR4_4_113ok13oklb90pamv.R.inc(51443);return super.getMean();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getStandardDeviation() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51444);
        __CLR4_4_113ok13oklb90pamv.R.inc(51445);return super.getStandardDeviation();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized RealMatrix getCovariance() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51446);
        __CLR4_4_113ok13oklb90pamv.R.inc(51447);return super.getCovariance();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getMax() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51448);
        __CLR4_4_113ok13oklb90pamv.R.inc(51449);return super.getMax();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getMin() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51450);
        __CLR4_4_113ok13oklb90pamv.R.inc(51451);return super.getMin();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getGeometricMean() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51452);
        __CLR4_4_113ok13oklb90pamv.R.inc(51453);return super.getGeometricMean();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized String toString() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51454);
        __CLR4_4_113ok13oklb90pamv.R.inc(51455);return super.toString();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void clear() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51456);
        __CLR4_4_113ok13oklb90pamv.R.inc(51457);super.clear();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized boolean equals(Object object) {try{__CLR4_4_113ok13oklb90pamv.R.inc(51458);
        __CLR4_4_113ok13oklb90pamv.R.inc(51459);return super.equals(object);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized int hashCode() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51460);
        __CLR4_4_113ok13oklb90pamv.R.inc(51461);return super.hashCode();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic[] getSumImpl() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51462);
        __CLR4_4_113ok13oklb90pamv.R.inc(51463);return super.getSumImpl();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setSumImpl(StorelessUnivariateStatistic[] sumImpl)
    throws DimensionMismatchException, MathIllegalStateException {try{__CLR4_4_113ok13oklb90pamv.R.inc(51464);
        __CLR4_4_113ok13oklb90pamv.R.inc(51465);super.setSumImpl(sumImpl);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic[] getSumsqImpl() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51466);
        __CLR4_4_113ok13oklb90pamv.R.inc(51467);return super.getSumsqImpl();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setSumsqImpl(StorelessUnivariateStatistic[] sumsqImpl)
    throws DimensionMismatchException, MathIllegalStateException {try{__CLR4_4_113ok13oklb90pamv.R.inc(51468);
        __CLR4_4_113ok13oklb90pamv.R.inc(51469);super.setSumsqImpl(sumsqImpl);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic[] getMinImpl() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51470);
        __CLR4_4_113ok13oklb90pamv.R.inc(51471);return super.getMinImpl();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setMinImpl(StorelessUnivariateStatistic[] minImpl)
    throws DimensionMismatchException, MathIllegalStateException {try{__CLR4_4_113ok13oklb90pamv.R.inc(51472);
        __CLR4_4_113ok13oklb90pamv.R.inc(51473);super.setMinImpl(minImpl);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic[] getMaxImpl() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51474);
        __CLR4_4_113ok13oklb90pamv.R.inc(51475);return super.getMaxImpl();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setMaxImpl(StorelessUnivariateStatistic[] maxImpl)
    throws DimensionMismatchException, MathIllegalStateException{try{__CLR4_4_113ok13oklb90pamv.R.inc(51476);
        __CLR4_4_113ok13oklb90pamv.R.inc(51477);super.setMaxImpl(maxImpl);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic[] getSumLogImpl() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51478);
        __CLR4_4_113ok13oklb90pamv.R.inc(51479);return super.getSumLogImpl();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setSumLogImpl(StorelessUnivariateStatistic[] sumLogImpl)
    throws DimensionMismatchException, MathIllegalStateException {try{__CLR4_4_113ok13oklb90pamv.R.inc(51480);
        __CLR4_4_113ok13oklb90pamv.R.inc(51481);super.setSumLogImpl(sumLogImpl);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic[] getGeoMeanImpl() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51482);
        __CLR4_4_113ok13oklb90pamv.R.inc(51483);return super.getGeoMeanImpl();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setGeoMeanImpl(StorelessUnivariateStatistic[] geoMeanImpl)
    throws DimensionMismatchException, MathIllegalStateException {try{__CLR4_4_113ok13oklb90pamv.R.inc(51484);
        __CLR4_4_113ok13oklb90pamv.R.inc(51485);super.setGeoMeanImpl(geoMeanImpl);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic[] getMeanImpl() {try{__CLR4_4_113ok13oklb90pamv.R.inc(51486);
        __CLR4_4_113ok13oklb90pamv.R.inc(51487);return super.getMeanImpl();
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setMeanImpl(StorelessUnivariateStatistic[] meanImpl)
    throws DimensionMismatchException, MathIllegalStateException {try{__CLR4_4_113ok13oklb90pamv.R.inc(51488);
        __CLR4_4_113ok13oklb90pamv.R.inc(51489);super.setMeanImpl(meanImpl);
    }finally{__CLR4_4_113ok13oklb90pamv.R.flushNeeded();}}
}
