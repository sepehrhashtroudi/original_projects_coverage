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

import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.MathUtils;

/**
 * Implementation of
 * {@link org.apache.commons.math3.stat.descriptive.SummaryStatistics} that
 * is safe to use in a multithreaded environment.  Multiple threads can safely
 * operate on a single instance without causing runtime exceptions due to race
 * conditions.  In effect, this implementation makes modification and access
 * methods atomic operations for a single instance.  That is to say, as one
 * thread is computing a statistic from the instance, no other thread can modify
 * the instance nor compute another statistic.
 *
 * @since 1.2
 * @version $Id$
 */
public class SynchronizedSummaryStatistics extends SummaryStatistics {public static class __CLR4_4_113qa13qalb90pan2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51568,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization UID */
    private static final long serialVersionUID = 1909861009042253704L;

    /**
     * Construct a SynchronizedSummaryStatistics instance
     */
    public SynchronizedSummaryStatistics() {
        super();__CLR4_4_113qa13qalb90pan2.R.inc(51491);try{__CLR4_4_113qa13qalb90pan2.R.inc(51490);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * A copy constructor. Creates a deep-copy of the {@code original}.
     *
     * @param original the {@code SynchronizedSummaryStatistics} instance to copy
     * @throws NullArgumentException if original is null
     */
    public SynchronizedSummaryStatistics(SynchronizedSummaryStatistics original)
    throws NullArgumentException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51492);
        __CLR4_4_113qa13qalb90pan2.R.inc(51493);copy(original, this);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StatisticalSummary getSummary() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51494);
        __CLR4_4_113qa13qalb90pan2.R.inc(51495);return super.getSummary();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void addValue(double value) {try{__CLR4_4_113qa13qalb90pan2.R.inc(51496);
        __CLR4_4_113qa13qalb90pan2.R.inc(51497);super.addValue(value);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized long getN() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51498);
        __CLR4_4_113qa13qalb90pan2.R.inc(51499);return super.getN();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getSum() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51500);
        __CLR4_4_113qa13qalb90pan2.R.inc(51501);return super.getSum();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getSumsq() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51502);
        __CLR4_4_113qa13qalb90pan2.R.inc(51503);return super.getSumsq();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getMean() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51504);
        __CLR4_4_113qa13qalb90pan2.R.inc(51505);return super.getMean();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getStandardDeviation() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51506);
        __CLR4_4_113qa13qalb90pan2.R.inc(51507);return super.getStandardDeviation();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getVariance() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51508);
        __CLR4_4_113qa13qalb90pan2.R.inc(51509);return super.getVariance();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getPopulationVariance() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51510);
        __CLR4_4_113qa13qalb90pan2.R.inc(51511);return super.getPopulationVariance();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getMax() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51512);
        __CLR4_4_113qa13qalb90pan2.R.inc(51513);return super.getMax();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getMin() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51514);
        __CLR4_4_113qa13qalb90pan2.R.inc(51515);return super.getMin();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getGeometricMean() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51516);
        __CLR4_4_113qa13qalb90pan2.R.inc(51517);return super.getGeometricMean();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized String toString() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51518);
        __CLR4_4_113qa13qalb90pan2.R.inc(51519);return super.toString();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void clear() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51520);
        __CLR4_4_113qa13qalb90pan2.R.inc(51521);super.clear();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized boolean equals(Object object) {try{__CLR4_4_113qa13qalb90pan2.R.inc(51522);
        __CLR4_4_113qa13qalb90pan2.R.inc(51523);return super.equals(object);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized int hashCode() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51524);
        __CLR4_4_113qa13qalb90pan2.R.inc(51525);return super.hashCode();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic getSumImpl() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51526);
        __CLR4_4_113qa13qalb90pan2.R.inc(51527);return super.getSumImpl();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setSumImpl(StorelessUnivariateStatistic sumImpl)
    throws MathIllegalStateException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51528);
        __CLR4_4_113qa13qalb90pan2.R.inc(51529);super.setSumImpl(sumImpl);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic getSumsqImpl() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51530);
        __CLR4_4_113qa13qalb90pan2.R.inc(51531);return super.getSumsqImpl();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setSumsqImpl(StorelessUnivariateStatistic sumsqImpl)
    throws MathIllegalStateException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51532);
        __CLR4_4_113qa13qalb90pan2.R.inc(51533);super.setSumsqImpl(sumsqImpl);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic getMinImpl() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51534);
        __CLR4_4_113qa13qalb90pan2.R.inc(51535);return super.getMinImpl();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setMinImpl(StorelessUnivariateStatistic minImpl)
    throws MathIllegalStateException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51536);
        __CLR4_4_113qa13qalb90pan2.R.inc(51537);super.setMinImpl(minImpl);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic getMaxImpl() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51538);
        __CLR4_4_113qa13qalb90pan2.R.inc(51539);return super.getMaxImpl();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setMaxImpl(StorelessUnivariateStatistic maxImpl)
    throws MathIllegalStateException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51540);
        __CLR4_4_113qa13qalb90pan2.R.inc(51541);super.setMaxImpl(maxImpl);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic getSumLogImpl() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51542);
        __CLR4_4_113qa13qalb90pan2.R.inc(51543);return super.getSumLogImpl();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setSumLogImpl(StorelessUnivariateStatistic sumLogImpl)
    throws MathIllegalStateException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51544);
        __CLR4_4_113qa13qalb90pan2.R.inc(51545);super.setSumLogImpl(sumLogImpl);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic getGeoMeanImpl() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51546);
        __CLR4_4_113qa13qalb90pan2.R.inc(51547);return super.getGeoMeanImpl();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setGeoMeanImpl(StorelessUnivariateStatistic geoMeanImpl)
    throws MathIllegalStateException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51548);
        __CLR4_4_113qa13qalb90pan2.R.inc(51549);super.setGeoMeanImpl(geoMeanImpl);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic getMeanImpl() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51550);
        __CLR4_4_113qa13qalb90pan2.R.inc(51551);return super.getMeanImpl();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setMeanImpl(StorelessUnivariateStatistic meanImpl)
    throws MathIllegalStateException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51552);
        __CLR4_4_113qa13qalb90pan2.R.inc(51553);super.setMeanImpl(meanImpl);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized StorelessUnivariateStatistic getVarianceImpl() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51554);
        __CLR4_4_113qa13qalb90pan2.R.inc(51555);return super.getVarianceImpl();
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setVarianceImpl(StorelessUnivariateStatistic varianceImpl)
    throws MathIllegalStateException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51556);
        __CLR4_4_113qa13qalb90pan2.R.inc(51557);super.setVarianceImpl(varianceImpl);
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * Returns a copy of this SynchronizedSummaryStatistics instance with the
     * same internal state.
     *
     * @return a copy of this
     */
    @Override
    public synchronized SynchronizedSummaryStatistics copy() {try{__CLR4_4_113qa13qalb90pan2.R.inc(51558);
        __CLR4_4_113qa13qalb90pan2.R.inc(51559);SynchronizedSummaryStatistics result =
            new SynchronizedSummaryStatistics();
        // No try-catch or advertised exception because arguments are guaranteed non-null
        __CLR4_4_113qa13qalb90pan2.R.inc(51560);copy(this, result);
        __CLR4_4_113qa13qalb90pan2.R.inc(51561);return result;
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     * <p>Acquires synchronization lock on source, then dest before copying.</p>
     *
     * @param source SynchronizedSummaryStatistics to copy
     * @param dest SynchronizedSummaryStatistics to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(SynchronizedSummaryStatistics source,
                            SynchronizedSummaryStatistics dest)
        throws NullArgumentException {try{__CLR4_4_113qa13qalb90pan2.R.inc(51562);
        __CLR4_4_113qa13qalb90pan2.R.inc(51563);MathUtils.checkNotNull(source);
        __CLR4_4_113qa13qalb90pan2.R.inc(51564);MathUtils.checkNotNull(dest);
        __CLR4_4_113qa13qalb90pan2.R.inc(51565);synchronized (source) {
            __CLR4_4_113qa13qalb90pan2.R.inc(51566);synchronized (dest) {
                __CLR4_4_113qa13qalb90pan2.R.inc(51567);SummaryStatistics.copy(source, dest);
            }
        }
    }finally{__CLR4_4_113qa13qalb90pan2.R.flushNeeded();}}

}
