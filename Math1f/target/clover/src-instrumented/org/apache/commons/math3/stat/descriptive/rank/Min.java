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
package org.apache.commons.math3.stat.descriptive.rank;

import java.io.Serializable;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math3.util.MathUtils;

/**
 * Returns the minimum of the available values.
 * <p>
 * <ul>
 * <li>The result is <code>NaN</code> iff all values are <code>NaN</code>
 * (i.e. <code>NaN</code> values have no impact on the value of the statistic).</li>
 * <li>If any of the values equals <code>Double.NEGATIVE_INFINITY</code>,
 * the result is <code>Double.NEGATIVE_INFINITY.</code></li>
 * </ul></p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 * @version $Id$
 */
public class Min extends AbstractStorelessUnivariateStatistic implements Serializable {public static class __CLR4_4_114ex14exlb90paoq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -2941995784909003131L;

    /**Number of values that have been added */
    private long n;

    /**Current value of the statistic */
    private double value;

    /**
     * Create a Min instance
     */
    public Min() {try{__CLR4_4_114ex14exlb90paoq.R.inc(52377);
        __CLR4_4_114ex14exlb90paoq.R.inc(52378);n = 0;
        __CLR4_4_114ex14exlb90paoq.R.inc(52379);value = Double.NaN;
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code Min} identical
     * to the {@code original}
     *
     * @param original the {@code Min} instance to copy
     * @throws NullArgumentException if original is null
     */
    public Min(Min original) throws NullArgumentException {try{__CLR4_4_114ex14exlb90paoq.R.inc(52380);
        __CLR4_4_114ex14exlb90paoq.R.inc(52381);copy(original, this);
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_114ex14exlb90paoq.R.inc(52382);
        __CLR4_4_114ex14exlb90paoq.R.inc(52383);if ((((d < value || Double.isNaN(value))&&(__CLR4_4_114ex14exlb90paoq.R.iget(52384)!=0|true))||(__CLR4_4_114ex14exlb90paoq.R.iget(52385)==0&false))) {{
            __CLR4_4_114ex14exlb90paoq.R.inc(52386);value = d;
        }
        }__CLR4_4_114ex14exlb90paoq.R.inc(52387);n++;
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_114ex14exlb90paoq.R.inc(52388);
        __CLR4_4_114ex14exlb90paoq.R.inc(52389);value = Double.NaN;
        __CLR4_4_114ex14exlb90paoq.R.inc(52390);n = 0;
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_114ex14exlb90paoq.R.inc(52391);
        __CLR4_4_114ex14exlb90paoq.R.inc(52392);return value;
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_114ex14exlb90paoq.R.inc(52393);
        __CLR4_4_114ex14exlb90paoq.R.inc(52394);return n;
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}

    /**
     * Returns the minimum of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null or
     * the array index parameters are not valid.</p>
     * <p>
     * <ul>
     * <li>The result is <code>NaN</code> iff all values are <code>NaN</code>
     * (i.e. <code>NaN</code> values have no impact on the value of the statistic).</li>
     * <li>If any of the values equals <code>Double.NEGATIVE_INFINITY</code>,
     * the result is <code>Double.NEGATIVE_INFINITY.</code></li>
     * </ul> </p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the minimum of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    @Override
    public double evaluate(final double[] values,final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_114ex14exlb90paoq.R.inc(52395);
        __CLR4_4_114ex14exlb90paoq.R.inc(52396);double min = Double.NaN;
        __CLR4_4_114ex14exlb90paoq.R.inc(52397);if ((((test(values, begin, length))&&(__CLR4_4_114ex14exlb90paoq.R.iget(52398)!=0|true))||(__CLR4_4_114ex14exlb90paoq.R.iget(52399)==0&false))) {{
            __CLR4_4_114ex14exlb90paoq.R.inc(52400);min = values[begin];
            __CLR4_4_114ex14exlb90paoq.R.inc(52401);for (int i = begin; (((i < begin + length)&&(__CLR4_4_114ex14exlb90paoq.R.iget(52402)!=0|true))||(__CLR4_4_114ex14exlb90paoq.R.iget(52403)==0&false)); i++) {{
                __CLR4_4_114ex14exlb90paoq.R.inc(52404);if ((((!Double.isNaN(values[i]))&&(__CLR4_4_114ex14exlb90paoq.R.iget(52405)!=0|true))||(__CLR4_4_114ex14exlb90paoq.R.iget(52406)==0&false))) {{
                    __CLR4_4_114ex14exlb90paoq.R.inc(52407);min = ((((min < values[i]) )&&(__CLR4_4_114ex14exlb90paoq.R.iget(52408)!=0|true))||(__CLR4_4_114ex14exlb90paoq.R.iget(52409)==0&false))? min : values[i];
                }
            }}
        }}
        }__CLR4_4_114ex14exlb90paoq.R.inc(52410);return min;
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Min copy() {try{__CLR4_4_114ex14exlb90paoq.R.inc(52411);
        __CLR4_4_114ex14exlb90paoq.R.inc(52412);Min result = new Min();
        // No try-catch or advertised exception - args are non-null
        __CLR4_4_114ex14exlb90paoq.R.inc(52413);copy(this, result);
        __CLR4_4_114ex14exlb90paoq.R.inc(52414);return result;
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source Min to copy
     * @param dest Min to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(Min source, Min dest)
        throws NullArgumentException {try{__CLR4_4_114ex14exlb90paoq.R.inc(52415);
        __CLR4_4_114ex14exlb90paoq.R.inc(52416);MathUtils.checkNotNull(source);
        __CLR4_4_114ex14exlb90paoq.R.inc(52417);MathUtils.checkNotNull(dest);
        __CLR4_4_114ex14exlb90paoq.R.inc(52418);dest.setData(source.getDataRef());
        __CLR4_4_114ex14exlb90paoq.R.inc(52419);dest.n = source.n;
        __CLR4_4_114ex14exlb90paoq.R.inc(52420);dest.value = source.value;
    }finally{__CLR4_4_114ex14exlb90paoq.R.flushNeeded();}}
}
