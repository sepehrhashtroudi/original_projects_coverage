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
 * Computes a statistic related to the Third Central Moment.  Specifically,
 * what is computed is the sum of cubed deviations from the sample mean.
 * <p>
 * The following recursive updating formula is used:</p>
 * <p>
 * Let <ul>
 * <li> dev = (current obs - previous mean) </li>
 * <li> m2 = previous value of {@link SecondMoment} </li>
 * <li> n = number of observations (including current obs) </li>
 * </ul>
 * Then</p>
 * <p>
 * new value = old value - 3 * (dev/n) * m2 + (n-1) * (n -2) * (dev^3/n^2)</p>
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
class ThirdMoment extends SecondMoment implements Serializable {public static class __CLR4_4_1144n144nlb90pao4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52039,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -7818711964045118679L;

    /** third moment of values that have been added */
    protected double m3;

     /**
     * Square of deviation of most recently added value from previous first
     * moment, normalized by previous sample size.  Retained to prevent
     * repeated computation in higher order moments.  nDevSq = nDev * nDev.
     */
    protected double nDevSq;

    /**
     * Create a FourthMoment instance
     */
    public ThirdMoment() {
        super();__CLR4_4_1144n144nlb90pao4.R.inc(52008);try{__CLR4_4_1144n144nlb90pao4.R.inc(52007);
        __CLR4_4_1144n144nlb90pao4.R.inc(52009);m3 = Double.NaN;
        __CLR4_4_1144n144nlb90pao4.R.inc(52010);nDevSq = Double.NaN;
    }finally{__CLR4_4_1144n144nlb90pao4.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code ThirdMoment} identical
     * to the {@code original}
     *
     * @param original the {@code ThirdMoment} instance to copy
     * @throws NullArgumentException if orginal is null
     */
    public ThirdMoment(ThirdMoment original) throws NullArgumentException {try{__CLR4_4_1144n144nlb90pao4.R.inc(52011);
        __CLR4_4_1144n144nlb90pao4.R.inc(52012);copy(original, this);
    }finally{__CLR4_4_1144n144nlb90pao4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_1144n144nlb90pao4.R.inc(52013);
        __CLR4_4_1144n144nlb90pao4.R.inc(52014);if ((((n < 1)&&(__CLR4_4_1144n144nlb90pao4.R.iget(52015)!=0|true))||(__CLR4_4_1144n144nlb90pao4.R.iget(52016)==0&false))) {{
            __CLR4_4_1144n144nlb90pao4.R.inc(52017);m3 = m2 = m1 = 0.0;
        }

        }__CLR4_4_1144n144nlb90pao4.R.inc(52018);double prevM2 = m2;
        __CLR4_4_1144n144nlb90pao4.R.inc(52019);super.increment(d);
        __CLR4_4_1144n144nlb90pao4.R.inc(52020);nDevSq = nDev * nDev;
        __CLR4_4_1144n144nlb90pao4.R.inc(52021);double n0 = n;
        __CLR4_4_1144n144nlb90pao4.R.inc(52022);m3 = m3 - 3.0 * nDev * prevM2 + (n0 - 1) * (n0 - 2) * nDevSq * dev;
    }finally{__CLR4_4_1144n144nlb90pao4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_1144n144nlb90pao4.R.inc(52023);
        __CLR4_4_1144n144nlb90pao4.R.inc(52024);return m3;
    }finally{__CLR4_4_1144n144nlb90pao4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_1144n144nlb90pao4.R.inc(52025);
        __CLR4_4_1144n144nlb90pao4.R.inc(52026);super.clear();
        __CLR4_4_1144n144nlb90pao4.R.inc(52027);m3 = Double.NaN;
        __CLR4_4_1144n144nlb90pao4.R.inc(52028);nDevSq = Double.NaN;
    }finally{__CLR4_4_1144n144nlb90pao4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdMoment copy() {try{__CLR4_4_1144n144nlb90pao4.R.inc(52029);
        __CLR4_4_1144n144nlb90pao4.R.inc(52030);ThirdMoment result = new ThirdMoment();
        // No try-catch or advertised exception because args are guaranteed non-null
        __CLR4_4_1144n144nlb90pao4.R.inc(52031);copy(this, result);
        __CLR4_4_1144n144nlb90pao4.R.inc(52032);return result;
    }finally{__CLR4_4_1144n144nlb90pao4.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source ThirdMoment to copy
     * @param dest ThirdMoment to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(ThirdMoment source, ThirdMoment dest)
        throws NullArgumentException {try{__CLR4_4_1144n144nlb90pao4.R.inc(52033);
        __CLR4_4_1144n144nlb90pao4.R.inc(52034);MathUtils.checkNotNull(source);
        __CLR4_4_1144n144nlb90pao4.R.inc(52035);MathUtils.checkNotNull(dest);
        __CLR4_4_1144n144nlb90pao4.R.inc(52036);SecondMoment.copy(source, dest);
        __CLR4_4_1144n144nlb90pao4.R.inc(52037);dest.m3 = source.m3;
        __CLR4_4_1144n144nlb90pao4.R.inc(52038);dest.nDevSq = source.nDevSq;
    }finally{__CLR4_4_1144n144nlb90pao4.R.flushNeeded();}}

}
