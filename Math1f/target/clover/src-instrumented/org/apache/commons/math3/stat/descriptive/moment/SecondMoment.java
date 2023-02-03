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
import org.apache.commons.math3.util.MathUtils;

/**
 * Computes a statistic related to the Second Central Moment.  Specifically,
 * what is computed is the sum of squared deviations from the sample mean.
 * <p>
 * The following recursive updating formula is used:</p>
 * <p>
 * Let <ul>
 * <li> dev = (current obs - previous mean) </li>
 * <li> n = number of observations (including current obs) </li>
 * </ul>
 * Then</p>
 * <p>
 * new value = old value + dev^2 * (n -1) / n.</p>
 * <p>
 * Returns <code>Double.NaN</code> if no data values have been added and
 * returns <code>0</code> if there is just one value in the data set.</p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 * @version $Id$
 */
public class SecondMoment extends FirstMoment implements Serializable {public static class __CLR4_4_113z113z1lb90panr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51832,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 3942403127395076445L;

    /** second moment of values that have been added */
    protected double m2;

    /**
     * Create a SecondMoment instance
     */
    public SecondMoment() {
        super();__CLR4_4_113z113z1lb90panr.R.inc(51806);try{__CLR4_4_113z113z1lb90panr.R.inc(51805);
        __CLR4_4_113z113z1lb90panr.R.inc(51807);m2 = Double.NaN;
    }finally{__CLR4_4_113z113z1lb90panr.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code SecondMoment} identical
     * to the {@code original}
     *
     * @param original the {@code SecondMoment} instance to copy
     * @throws NullArgumentException if original is null
     */
    public SecondMoment(SecondMoment original)
    throws NullArgumentException {
        super(original);__CLR4_4_113z113z1lb90panr.R.inc(51809);try{__CLR4_4_113z113z1lb90panr.R.inc(51808);
        __CLR4_4_113z113z1lb90panr.R.inc(51810);this.m2 = original.m2;
    }finally{__CLR4_4_113z113z1lb90panr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_113z113z1lb90panr.R.inc(51811);
        __CLR4_4_113z113z1lb90panr.R.inc(51812);if ((((n < 1)&&(__CLR4_4_113z113z1lb90panr.R.iget(51813)!=0|true))||(__CLR4_4_113z113z1lb90panr.R.iget(51814)==0&false))) {{
            __CLR4_4_113z113z1lb90panr.R.inc(51815);m1 = m2 = 0.0;
        }
        }__CLR4_4_113z113z1lb90panr.R.inc(51816);super.increment(d);
        __CLR4_4_113z113z1lb90panr.R.inc(51817);m2 += ((double) n - 1) * dev * nDev;
    }finally{__CLR4_4_113z113z1lb90panr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_113z113z1lb90panr.R.inc(51818);
        __CLR4_4_113z113z1lb90panr.R.inc(51819);super.clear();
        __CLR4_4_113z113z1lb90panr.R.inc(51820);m2 = Double.NaN;
    }finally{__CLR4_4_113z113z1lb90panr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_113z113z1lb90panr.R.inc(51821);
        __CLR4_4_113z113z1lb90panr.R.inc(51822);return m2;
    }finally{__CLR4_4_113z113z1lb90panr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public SecondMoment copy() {try{__CLR4_4_113z113z1lb90panr.R.inc(51823);
        __CLR4_4_113z113z1lb90panr.R.inc(51824);SecondMoment result = new SecondMoment();
        // no try-catch or advertised NAE because args are guaranteed non-null
        __CLR4_4_113z113z1lb90panr.R.inc(51825);copy(this, result);
        __CLR4_4_113z113z1lb90panr.R.inc(51826);return result;
    }finally{__CLR4_4_113z113z1lb90panr.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source SecondMoment to copy
     * @param dest SecondMoment to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(SecondMoment source, SecondMoment dest)
        throws NullArgumentException {try{__CLR4_4_113z113z1lb90panr.R.inc(51827);
        __CLR4_4_113z113z1lb90panr.R.inc(51828);MathUtils.checkNotNull(source);
        __CLR4_4_113z113z1lb90panr.R.inc(51829);MathUtils.checkNotNull(dest);
        __CLR4_4_113z113z1lb90panr.R.inc(51830);FirstMoment.copy(source, dest);
        __CLR4_4_113z113z1lb90panr.R.inc(51831);dest.m2 = source.m2;
    }finally{__CLR4_4_113z113z1lb90panr.R.flushNeeded();}}

}
