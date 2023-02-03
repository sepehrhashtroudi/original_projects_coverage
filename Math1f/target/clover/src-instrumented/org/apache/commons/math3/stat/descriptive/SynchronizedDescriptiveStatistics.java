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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.MathUtils;

/**
 * Implementation of
 * {@link org.apache.commons.math3.stat.descriptive.DescriptiveStatistics} that
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
public class SynchronizedDescriptiveStatistics extends DescriptiveStatistics {public static class __CLR4_4_113nk13nklb90pams{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51428,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization UID */
    private static final long serialVersionUID = 1L;

    /**
     * Construct an instance with infinite window
     */
    public SynchronizedDescriptiveStatistics() {
        // no try-catch or advertized IAE because arg is valid
        this(INFINITE_WINDOW);__CLR4_4_113nk13nklb90pams.R.inc(51393);try{__CLR4_4_113nk13nklb90pams.R.inc(51392);
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * Construct an instance with finite window
     * @param window the finite window size.
     * @throws MathIllegalArgumentException if window size is less than 1 but
     * not equal to {@link #INFINITE_WINDOW}
     */
    public SynchronizedDescriptiveStatistics(int window) throws MathIllegalArgumentException {
        super(window);__CLR4_4_113nk13nklb90pams.R.inc(51395);try{__CLR4_4_113nk13nklb90pams.R.inc(51394);
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * A copy constructor. Creates a deep-copy of the {@code original}.
     *
     * @param original the {@code SynchronizedDescriptiveStatistics} instance to copy
     * @throws NullArgumentException if original is null
     */
    public SynchronizedDescriptiveStatistics(SynchronizedDescriptiveStatistics original)
    throws NullArgumentException {try{__CLR4_4_113nk13nklb90pams.R.inc(51396);
        __CLR4_4_113nk13nklb90pams.R.inc(51397);copy(original, this);
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void addValue(double v) {try{__CLR4_4_113nk13nklb90pams.R.inc(51398);
        __CLR4_4_113nk13nklb90pams.R.inc(51399);super.addValue(v);
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double apply(UnivariateStatistic stat) {try{__CLR4_4_113nk13nklb90pams.R.inc(51400);
        __CLR4_4_113nk13nklb90pams.R.inc(51401);return super.apply(stat);
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void clear() {try{__CLR4_4_113nk13nklb90pams.R.inc(51402);
        __CLR4_4_113nk13nklb90pams.R.inc(51403);super.clear();
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getElement(int index) {try{__CLR4_4_113nk13nklb90pams.R.inc(51404);
        __CLR4_4_113nk13nklb90pams.R.inc(51405);return super.getElement(index);
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized long getN() {try{__CLR4_4_113nk13nklb90pams.R.inc(51406);
        __CLR4_4_113nk13nklb90pams.R.inc(51407);return super.getN();
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double getStandardDeviation() {try{__CLR4_4_113nk13nklb90pams.R.inc(51408);
        __CLR4_4_113nk13nklb90pams.R.inc(51409);return super.getStandardDeviation();
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized double[] getValues() {try{__CLR4_4_113nk13nklb90pams.R.inc(51410);
        __CLR4_4_113nk13nklb90pams.R.inc(51411);return super.getValues();
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized int getWindowSize() {try{__CLR4_4_113nk13nklb90pams.R.inc(51412);
        __CLR4_4_113nk13nklb90pams.R.inc(51413);return super.getWindowSize();
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void setWindowSize(int windowSize) throws MathIllegalArgumentException {try{__CLR4_4_113nk13nklb90pams.R.inc(51414);
        __CLR4_4_113nk13nklb90pams.R.inc(51415);super.setWindowSize(windowSize);
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized String toString() {try{__CLR4_4_113nk13nklb90pams.R.inc(51416);
        __CLR4_4_113nk13nklb90pams.R.inc(51417);return super.toString();
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * Returns a copy of this SynchronizedDescriptiveStatistics instance with the
     * same internal state.
     *
     * @return a copy of this
     */
    @Override
    public synchronized SynchronizedDescriptiveStatistics copy() {try{__CLR4_4_113nk13nklb90pams.R.inc(51418);
        __CLR4_4_113nk13nklb90pams.R.inc(51419);SynchronizedDescriptiveStatistics result =
            new SynchronizedDescriptiveStatistics();
        // No try-catch or advertised exception because arguments are guaranteed non-null
        __CLR4_4_113nk13nklb90pams.R.inc(51420);copy(this, result);
        __CLR4_4_113nk13nklb90pams.R.inc(51421);return result;
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     * <p>Acquires synchronization lock on source, then dest before copying.</p>
     *
     * @param source SynchronizedDescriptiveStatistics to copy
     * @param dest SynchronizedDescriptiveStatistics to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(SynchronizedDescriptiveStatistics source,
                            SynchronizedDescriptiveStatistics dest)
        throws NullArgumentException {try{__CLR4_4_113nk13nklb90pams.R.inc(51422);
        __CLR4_4_113nk13nklb90pams.R.inc(51423);MathUtils.checkNotNull(source);
        __CLR4_4_113nk13nklb90pams.R.inc(51424);MathUtils.checkNotNull(dest);
        __CLR4_4_113nk13nklb90pams.R.inc(51425);synchronized (source) {
            __CLR4_4_113nk13nklb90pams.R.inc(51426);synchronized (dest) {
                __CLR4_4_113nk13nklb90pams.R.inc(51427);DescriptiveStatistics.copy(source, dest);
            }
        }
    }finally{__CLR4_4_113nk13nklb90pams.R.flushNeeded();}}
}
