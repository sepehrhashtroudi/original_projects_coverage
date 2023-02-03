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
package org.apache.commons.math3.stat.descriptive.summary;

import java.io.Serializable;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.WeightedEvaluation;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * Returns the product of the available values.
 * <p>
 * If there are no values in the dataset, then 1 is returned.
 *  If any of the values are
 * <code>NaN</code>, then <code>NaN</code> is returned.</p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 * @version $Id$
 */
public class Product extends AbstractStorelessUnivariateStatistic implements Serializable, WeightedEvaluation {public static class __CLR4_4_114lb14lblb90pap1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52656,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 2824226005990582538L;

    /**The number of values that have been added */
    private long n;

    /**
     * The current Running Product.
     */
    private double value;

    /**
     * Create a Product instance
     */
    public Product() {try{__CLR4_4_114lb14lblb90pap1.R.inc(52607);
        __CLR4_4_114lb14lblb90pap1.R.inc(52608);n = 0;
        __CLR4_4_114lb14lblb90pap1.R.inc(52609);value = 1;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code Product} identical
     * to the {@code original}
     *
     * @param original the {@code Product} instance to copy
     * @throws NullArgumentException  if original is null
     */
    public Product(Product original) throws NullArgumentException {try{__CLR4_4_114lb14lblb90pap1.R.inc(52610);
        __CLR4_4_114lb14lblb90pap1.R.inc(52611);copy(original, this);
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_114lb14lblb90pap1.R.inc(52612);
        __CLR4_4_114lb14lblb90pap1.R.inc(52613);value *= d;
        __CLR4_4_114lb14lblb90pap1.R.inc(52614);n++;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_114lb14lblb90pap1.R.inc(52615);
        __CLR4_4_114lb14lblb90pap1.R.inc(52616);return value;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_114lb14lblb90pap1.R.inc(52617);
        __CLR4_4_114lb14lblb90pap1.R.inc(52618);return n;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_114lb14lblb90pap1.R.inc(52619);
        __CLR4_4_114lb14lblb90pap1.R.inc(52620);value = 1;
        __CLR4_4_114lb14lblb90pap1.R.inc(52621);n = 0;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * Returns the product of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the product of the values or 1 if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    @Override
    public double evaluate(final double[] values, final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_114lb14lblb90pap1.R.inc(52622);
        __CLR4_4_114lb14lblb90pap1.R.inc(52623);double product = Double.NaN;
        __CLR4_4_114lb14lblb90pap1.R.inc(52624);if ((((test(values, begin, length, true))&&(__CLR4_4_114lb14lblb90pap1.R.iget(52625)!=0|true))||(__CLR4_4_114lb14lblb90pap1.R.iget(52626)==0&false))) {{
            __CLR4_4_114lb14lblb90pap1.R.inc(52627);product = 1.0;
            __CLR4_4_114lb14lblb90pap1.R.inc(52628);for (int i = begin; (((i < begin + length)&&(__CLR4_4_114lb14lblb90pap1.R.iget(52629)!=0|true))||(__CLR4_4_114lb14lblb90pap1.R.iget(52630)==0&false)); i++) {{
                __CLR4_4_114lb14lblb90pap1.R.inc(52631);product *= values[i];
            }
        }}
        }__CLR4_4_114lb14lblb90pap1.R.inc(52632);return product;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * <p>Returns the weighted product of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.</p>
     *
     * <p>Throws <code>MathIllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     *     <li>the start and length arguments do not determine a valid array</li>
     * </ul></p>
     *
     * <p>Uses the formula, <pre>
     *    weighted product = &prod;values[i]<sup>weights[i]</sup>
     * </pre>
     * that is, the weights are applied as exponents when computing the weighted product.</p>
     *
     * @param values the input array
     * @param weights the weights array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the product of the values or 1 if length = 0
     * @throws MathIllegalArgumentException if the parameters are not valid
     * @since 2.1
     */
    public double evaluate(final double[] values, final double[] weights,
        final int begin, final int length) throws MathIllegalArgumentException {try{__CLR4_4_114lb14lblb90pap1.R.inc(52633);
        __CLR4_4_114lb14lblb90pap1.R.inc(52634);double product = Double.NaN;
        __CLR4_4_114lb14lblb90pap1.R.inc(52635);if ((((test(values, weights, begin, length, true))&&(__CLR4_4_114lb14lblb90pap1.R.iget(52636)!=0|true))||(__CLR4_4_114lb14lblb90pap1.R.iget(52637)==0&false))) {{
            __CLR4_4_114lb14lblb90pap1.R.inc(52638);product = 1.0;
            __CLR4_4_114lb14lblb90pap1.R.inc(52639);for (int i = begin; (((i < begin + length)&&(__CLR4_4_114lb14lblb90pap1.R.iget(52640)!=0|true))||(__CLR4_4_114lb14lblb90pap1.R.iget(52641)==0&false)); i++) {{
                __CLR4_4_114lb14lblb90pap1.R.inc(52642);product *= FastMath.pow(values[i], weights[i]);
            }
        }}
        }__CLR4_4_114lb14lblb90pap1.R.inc(52643);return product;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * <p>Returns the weighted product of the entries in the input array.</p>
     *
     * <p>Throws <code>MathIllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     * </ul></p>
     *
     * <p>Uses the formula, <pre>
     *    weighted product = &prod;values[i]<sup>weights[i]</sup>
     * </pre>
     * that is, the weights are applied as exponents when computing the weighted product.</p>
     *
     * @param values the input array
     * @param weights the weights array
     * @return the product of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the parameters are not valid
     * @since 2.1
     */
    public double evaluate(final double[] values, final double[] weights)
    throws MathIllegalArgumentException {try{__CLR4_4_114lb14lblb90pap1.R.inc(52644);
        __CLR4_4_114lb14lblb90pap1.R.inc(52645);return evaluate(values, weights, 0, values.length);
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}


    /**
     * {@inheritDoc}
     */
    @Override
    public Product copy() {try{__CLR4_4_114lb14lblb90pap1.R.inc(52646);
        __CLR4_4_114lb14lblb90pap1.R.inc(52647);Product result = new Product();
        // No try-catch or advertised exception because args are valid
        __CLR4_4_114lb14lblb90pap1.R.inc(52648);copy(this, result);
        __CLR4_4_114lb14lblb90pap1.R.inc(52649);return result;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source Product to copy
     * @param dest Product to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(Product source, Product dest)
        throws NullArgumentException {try{__CLR4_4_114lb14lblb90pap1.R.inc(52650);
        __CLR4_4_114lb14lblb90pap1.R.inc(52651);MathUtils.checkNotNull(source);
        __CLR4_4_114lb14lblb90pap1.R.inc(52652);MathUtils.checkNotNull(dest);
        __CLR4_4_114lb14lblb90pap1.R.inc(52653);dest.setData(source.getDataRef());
        __CLR4_4_114lb14lblb90pap1.R.inc(52654);dest.n = source.n;
        __CLR4_4_114lb14lblb90pap1.R.inc(52655);dest.value = source.value;
    }finally{__CLR4_4_114lb14lblb90pap1.R.flushNeeded();}}

}
