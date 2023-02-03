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
 * Computes a statistic related to the Fourth Central Moment.  Specifically,
 * what is computed is the sum of
 * <p>
 * (x_i - xbar) ^ 4, </p>
 * <p>
 * where the x_i are the
 * sample observations and xbar is the sample mean. </p>
 * <p>
 * The following recursive updating formula is used: </p>
 * <p>
 * Let <ul>
 * <li> dev = (current obs - previous mean) </li>
 * <li> m2 = previous value of {@link SecondMoment} </li>
 * <li> m2 = previous value of {@link ThirdMoment} </li>
 * <li> n = number of observations (including current obs) </li>
 * </ul>
 * Then </p>
 * <p>
 * new value = old value - 4 * (dev/n) * m3 + 6 * (dev/n)^2 * m2 + <br>
 * [n^2 - 3 * (n-1)] * dev^4 * (n-1) / n^3 </p>
 * <p>
 * Returns <code>Double.NaN</code> if no data values have been added and
 * returns <code>0</code> if there is just one value in the data set. </p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally. </p>
 *
 * @version $Id$
 */
class FourthMoment extends ThirdMoment implements Serializable{public static class __CLR4_4_113tj13tjlb90panc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51640,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 4763990447117157611L;

    /** fourth moment of values that have been added */
    private double m4;

    /**
     * Create a FourthMoment instance
     */
    public FourthMoment() {
        super();__CLR4_4_113tj13tjlb90panc.R.inc(51608);try{__CLR4_4_113tj13tjlb90panc.R.inc(51607);
        __CLR4_4_113tj13tjlb90panc.R.inc(51609);m4 = Double.NaN;
    }finally{__CLR4_4_113tj13tjlb90panc.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code FourthMoment} identical
     * to the {@code original}
     *
     * @param original the {@code FourthMoment} instance to copy
     * @throws NullArgumentException if original is null
     */
     public FourthMoment(FourthMoment original) throws NullArgumentException {
         super();__CLR4_4_113tj13tjlb90panc.R.inc(51611);try{__CLR4_4_113tj13tjlb90panc.R.inc(51610);
         __CLR4_4_113tj13tjlb90panc.R.inc(51612);copy(original, this);
     }finally{__CLR4_4_113tj13tjlb90panc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
     @Override
    public void increment(final double d) {try{__CLR4_4_113tj13tjlb90panc.R.inc(51613);
        __CLR4_4_113tj13tjlb90panc.R.inc(51614);if ((((n < 1)&&(__CLR4_4_113tj13tjlb90panc.R.iget(51615)!=0|true))||(__CLR4_4_113tj13tjlb90panc.R.iget(51616)==0&false))) {{
            __CLR4_4_113tj13tjlb90panc.R.inc(51617);m4 = 0.0;
            __CLR4_4_113tj13tjlb90panc.R.inc(51618);m3 = 0.0;
            __CLR4_4_113tj13tjlb90panc.R.inc(51619);m2 = 0.0;
            __CLR4_4_113tj13tjlb90panc.R.inc(51620);m1 = 0.0;
        }

        }__CLR4_4_113tj13tjlb90panc.R.inc(51621);double prevM3 = m3;
        __CLR4_4_113tj13tjlb90panc.R.inc(51622);double prevM2 = m2;

        __CLR4_4_113tj13tjlb90panc.R.inc(51623);super.increment(d);

        __CLR4_4_113tj13tjlb90panc.R.inc(51624);double n0 = n;

        __CLR4_4_113tj13tjlb90panc.R.inc(51625);m4 = m4 - 4.0 * nDev * prevM3 + 6.0 * nDevSq * prevM2 +
            ((n0 * n0) - 3 * (n0 -1)) * (nDevSq * nDevSq * (n0 - 1) * n0);
    }finally{__CLR4_4_113tj13tjlb90panc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_113tj13tjlb90panc.R.inc(51626);
        __CLR4_4_113tj13tjlb90panc.R.inc(51627);return m4;
    }finally{__CLR4_4_113tj13tjlb90panc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_113tj13tjlb90panc.R.inc(51628);
        __CLR4_4_113tj13tjlb90panc.R.inc(51629);super.clear();
        __CLR4_4_113tj13tjlb90panc.R.inc(51630);m4 = Double.NaN;
    }finally{__CLR4_4_113tj13tjlb90panc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public FourthMoment copy() {try{__CLR4_4_113tj13tjlb90panc.R.inc(51631);
        __CLR4_4_113tj13tjlb90panc.R.inc(51632);FourthMoment result = new FourthMoment();
        // No try-catch or advertised exception because args are guaranteed non-null
        __CLR4_4_113tj13tjlb90panc.R.inc(51633);copy(this, result);
        __CLR4_4_113tj13tjlb90panc.R.inc(51634);return result;
    }finally{__CLR4_4_113tj13tjlb90panc.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source FourthMoment to copy
     * @param dest FourthMoment to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(FourthMoment source, FourthMoment dest)
        throws NullArgumentException {try{__CLR4_4_113tj13tjlb90panc.R.inc(51635);
        __CLR4_4_113tj13tjlb90panc.R.inc(51636);MathUtils.checkNotNull(source);
        __CLR4_4_113tj13tjlb90panc.R.inc(51637);MathUtils.checkNotNull(dest);
        __CLR4_4_113tj13tjlb90panc.R.inc(51638);ThirdMoment.copy(source, dest);
        __CLR4_4_113tj13tjlb90panc.R.inc(51639);dest.m4 = source.m4;
    }finally{__CLR4_4_113tj13tjlb90panc.R.flushNeeded();}}
}
