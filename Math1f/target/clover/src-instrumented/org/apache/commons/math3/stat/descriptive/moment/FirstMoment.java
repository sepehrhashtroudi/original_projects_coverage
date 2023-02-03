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

import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math3.util.MathUtils;

/**
 * Computes the first moment (arithmetic mean).  Uses the definitional formula:
 * <p>
 * mean = sum(x_i) / n </p>
 * <p>
 * where <code>n</code> is the number of observations. </p>
 * <p>
 * To limit numeric errors, the value of the statistic is computed using the
 * following recursive updating algorithm: </p>
 * <p>
 * <ol>
 * <li>Initialize <code>m = </code> the first value</li>
 * <li>For each additional value, update using <br>
 *   <code>m = m + (new value - m) / (number of observations)</code></li>
 * </ol></p>
 * <p>
 *  Returns <code>Double.NaN</code> if the dataset is empty.</p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 * @version $Id$
 */
class FirstMoment extends AbstractStorelessUnivariateStatistic
    implements Serializable {public static class __CLR4_4_113sg13sglb90pan8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 6112755307178490473L;


    /** Count of values that have been added */
    protected long n;

    /** First moment of values that have been added */
    protected double m1;

    /**
     * Deviation of most recently added value from previous first moment.
     * Retained to prevent repeated computation in higher order moments.
     */
    protected double dev;

    /**
     * Deviation of most recently added value from previous first moment,
     * normalized by previous sample size.  Retained to prevent repeated
     * computation in higher order moments
     */
    protected double nDev;

    /**
     * Create a FirstMoment instance
     */
    public FirstMoment() {try{__CLR4_4_113sg13sglb90pan8.R.inc(51568);
        __CLR4_4_113sg13sglb90pan8.R.inc(51569);n = 0;
        __CLR4_4_113sg13sglb90pan8.R.inc(51570);m1 = Double.NaN;
        __CLR4_4_113sg13sglb90pan8.R.inc(51571);dev = Double.NaN;
        __CLR4_4_113sg13sglb90pan8.R.inc(51572);nDev = Double.NaN;
    }finally{__CLR4_4_113sg13sglb90pan8.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code FirstMoment} identical
     * to the {@code original}
     *
     * @param original the {@code FirstMoment} instance to copy
     * @throws NullArgumentException if original is null
     */
     public FirstMoment(FirstMoment original) throws NullArgumentException {
         super();__CLR4_4_113sg13sglb90pan8.R.inc(51574);try{__CLR4_4_113sg13sglb90pan8.R.inc(51573);
         __CLR4_4_113sg13sglb90pan8.R.inc(51575);copy(original, this);
     }finally{__CLR4_4_113sg13sglb90pan8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
     @Override
    public void increment(final double d) {try{__CLR4_4_113sg13sglb90pan8.R.inc(51576);
        __CLR4_4_113sg13sglb90pan8.R.inc(51577);if ((((n == 0)&&(__CLR4_4_113sg13sglb90pan8.R.iget(51578)!=0|true))||(__CLR4_4_113sg13sglb90pan8.R.iget(51579)==0&false))) {{
            __CLR4_4_113sg13sglb90pan8.R.inc(51580);m1 = 0.0;
        }
        }__CLR4_4_113sg13sglb90pan8.R.inc(51581);n++;
        __CLR4_4_113sg13sglb90pan8.R.inc(51582);double n0 = n;
        __CLR4_4_113sg13sglb90pan8.R.inc(51583);dev = d - m1;
        __CLR4_4_113sg13sglb90pan8.R.inc(51584);nDev = dev / n0;
        __CLR4_4_113sg13sglb90pan8.R.inc(51585);m1 += nDev;
    }finally{__CLR4_4_113sg13sglb90pan8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_113sg13sglb90pan8.R.inc(51586);
        __CLR4_4_113sg13sglb90pan8.R.inc(51587);m1 = Double.NaN;
        __CLR4_4_113sg13sglb90pan8.R.inc(51588);n = 0;
        __CLR4_4_113sg13sglb90pan8.R.inc(51589);dev = Double.NaN;
        __CLR4_4_113sg13sglb90pan8.R.inc(51590);nDev = Double.NaN;
    }finally{__CLR4_4_113sg13sglb90pan8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_113sg13sglb90pan8.R.inc(51591);
        __CLR4_4_113sg13sglb90pan8.R.inc(51592);return m1;
    }finally{__CLR4_4_113sg13sglb90pan8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_113sg13sglb90pan8.R.inc(51593);
        __CLR4_4_113sg13sglb90pan8.R.inc(51594);return n;
    }finally{__CLR4_4_113sg13sglb90pan8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstMoment copy() {try{__CLR4_4_113sg13sglb90pan8.R.inc(51595);
        __CLR4_4_113sg13sglb90pan8.R.inc(51596);FirstMoment result = new FirstMoment();
        // No try-catch or advertised exception because args are guaranteed non-null
        __CLR4_4_113sg13sglb90pan8.R.inc(51597);copy(this, result);
        __CLR4_4_113sg13sglb90pan8.R.inc(51598);return result;
    }finally{__CLR4_4_113sg13sglb90pan8.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source FirstMoment to copy
     * @param dest FirstMoment to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(FirstMoment source, FirstMoment dest)
        throws NullArgumentException {try{__CLR4_4_113sg13sglb90pan8.R.inc(51599);
        __CLR4_4_113sg13sglb90pan8.R.inc(51600);MathUtils.checkNotNull(source);
        __CLR4_4_113sg13sglb90pan8.R.inc(51601);MathUtils.checkNotNull(dest);
        __CLR4_4_113sg13sglb90pan8.R.inc(51602);dest.setData(source.getDataRef());
        __CLR4_4_113sg13sglb90pan8.R.inc(51603);dest.n = source.n;
        __CLR4_4_113sg13sglb90pan8.R.inc(51604);dest.m1 = source.m1;
        __CLR4_4_113sg13sglb90pan8.R.inc(51605);dest.dev = source.dev;
        __CLR4_4_113sg13sglb90pan8.R.inc(51606);dest.nDev = source.nDev;
    }finally{__CLR4_4_113sg13sglb90pan8.R.flushNeeded();}}
}
