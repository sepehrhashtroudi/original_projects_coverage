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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * Computes the sample standard deviation.  The standard deviation
 * is the positive square root of the variance.  This implementation wraps a
 * {@link Variance} instance.  The <code>isBiasCorrected</code> property of the
 * wrapped Variance instance is exposed, so that this class can be used to
 * compute both the "sample standard deviation" (the square root of the
 * bias-corrected "sample variance") or the "population standard deviation"
 * (the square root of the non-bias-corrected "population variance"). See
 * {@link Variance} for more information.
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 * @version $Id$
 */
public class StandardDeviation extends AbstractStorelessUnivariateStatistic
    implements Serializable {public static class __CLR4_4_1143k143klb90pao2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52007,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 5728716329662425188L;

    /** Wrapped Variance instance */
    private Variance variance = null;

    /**
     * Constructs a StandardDeviation.  Sets the underlying {@link Variance}
     * instance's <code>isBiasCorrected</code> property to true.
     */
    public StandardDeviation() {try{__CLR4_4_1143k143klb90pao2.R.inc(51968);
        __CLR4_4_1143k143klb90pao2.R.inc(51969);variance = new Variance();
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * Constructs a StandardDeviation from an external second moment.
     *
     * @param m2 the external moment
     */
    public StandardDeviation(final SecondMoment m2) {try{__CLR4_4_1143k143klb90pao2.R.inc(51970);
        __CLR4_4_1143k143klb90pao2.R.inc(51971);variance = new Variance(m2);
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code StandardDeviation} identical
     * to the {@code original}
     *
     * @param original the {@code StandardDeviation} instance to copy
     * @throws NullArgumentException if original is null
     */
    public StandardDeviation(StandardDeviation original) throws NullArgumentException {try{__CLR4_4_1143k143klb90pao2.R.inc(51972);
        __CLR4_4_1143k143klb90pao2.R.inc(51973);copy(original, this);
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * Contructs a StandardDeviation with the specified value for the
     * <code>isBiasCorrected</code> property.  If this property is set to
     * <code>true</code>, the {@link Variance} used in computing results will
     * use the bias-corrected, or "sample" formula.  See {@link Variance} for
     * details.
     *
     * @param isBiasCorrected  whether or not the variance computation will use
     * the bias-corrected formula
     */
    public StandardDeviation(boolean isBiasCorrected) {try{__CLR4_4_1143k143klb90pao2.R.inc(51974);
        __CLR4_4_1143k143klb90pao2.R.inc(51975);variance = new Variance(isBiasCorrected);
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * Contructs a StandardDeviation with the specified value for the
     * <code>isBiasCorrected</code> property and the supplied external moment.
     * If <code>isBiasCorrected</code> is set to <code>true</code>, the
     * {@link Variance} used in computing results will use the bias-corrected,
     * or "sample" formula.  See {@link Variance} for details.
     *
     * @param isBiasCorrected  whether or not the variance computation will use
     * the bias-corrected formula
      * @param m2 the external moment
     */
    public StandardDeviation(boolean isBiasCorrected, SecondMoment m2) {try{__CLR4_4_1143k143klb90pao2.R.inc(51976);
        __CLR4_4_1143k143klb90pao2.R.inc(51977);variance = new Variance(isBiasCorrected, m2);
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_1143k143klb90pao2.R.inc(51978);
        __CLR4_4_1143k143klb90pao2.R.inc(51979);variance.increment(d);
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_1143k143klb90pao2.R.inc(51980);
        __CLR4_4_1143k143klb90pao2.R.inc(51981);return variance.getN();
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_1143k143klb90pao2.R.inc(51982);
        __CLR4_4_1143k143klb90pao2.R.inc(51983);return FastMath.sqrt(variance.getResult());
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_1143k143klb90pao2.R.inc(51984);
        __CLR4_4_1143k143klb90pao2.R.inc(51985);variance.clear();
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * Returns the Standard Deviation of the entries in the input array, or
     * <code>Double.NaN</code> if the array is empty.
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @return the standard deviation of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null
     */
    @Override
    public double evaluate(final double[] values) throws MathIllegalArgumentException  {try{__CLR4_4_1143k143klb90pao2.R.inc(51986);
        __CLR4_4_1143k143klb90pao2.R.inc(51987);return FastMath.sqrt(variance.evaluate(values));
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * Returns the Standard Deviation of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample. </p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the standard deviation of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    @Override
    public double evaluate(final double[] values, final int begin, final int length)
    throws MathIllegalArgumentException  {try{__CLR4_4_1143k143klb90pao2.R.inc(51988);
       __CLR4_4_1143k143klb90pao2.R.inc(51989);return FastMath.sqrt(variance.evaluate(values, begin, length));
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * Returns the Standard Deviation of the entries in the specified portion of
     * the input array, using the precomputed mean value.  Returns
     * <code>Double.NaN</code> if the designated subarray is empty.
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * The formula used assumes that the supplied mean value is the arithmetic
     * mean of the sample data, not a known population parameter.  This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @param mean the precomputed mean value
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the standard deviation of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    public double evaluate(final double[] values, final double mean,
            final int begin, final int length) throws MathIllegalArgumentException  {try{__CLR4_4_1143k143klb90pao2.R.inc(51990);
        __CLR4_4_1143k143klb90pao2.R.inc(51991);return FastMath.sqrt(variance.evaluate(values, mean, begin, length));
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * Returns the Standard Deviation of the entries in the input array, using
     * the precomputed mean value.  Returns
     * <code>Double.NaN</code> if the designated subarray is empty.
     * <p>
     * Returns 0 for a single-value (i.e. length = 1) sample.</p>
     * <p>
     * The formula used assumes that the supplied mean value is the arithmetic
     * mean of the sample data, not a known population parameter.  This method
     * is supplied only to save computation when the mean has already been
     * computed.</p>
     * <p>
     * Throws <code>MathIllegalArgumentException</code> if the array is null.</p>
     * <p>
     * Does not change the internal state of the statistic.</p>
     *
     * @param values the input array
     * @param mean the precomputed mean value
     * @return the standard deviation of the values or Double.NaN if length = 0
     * @throws MathIllegalArgumentException if the array is null
     */
    public double evaluate(final double[] values, final double mean)
    throws MathIllegalArgumentException  {try{__CLR4_4_1143k143klb90pao2.R.inc(51992);
        __CLR4_4_1143k143klb90pao2.R.inc(51993);return FastMath.sqrt(variance.evaluate(values, mean));
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * @return Returns the isBiasCorrected.
     */
    public boolean isBiasCorrected() {try{__CLR4_4_1143k143klb90pao2.R.inc(51994);
        __CLR4_4_1143k143klb90pao2.R.inc(51995);return variance.isBiasCorrected();
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * @param isBiasCorrected The isBiasCorrected to set.
     */
    public void setBiasCorrected(boolean isBiasCorrected) {try{__CLR4_4_1143k143klb90pao2.R.inc(51996);
        __CLR4_4_1143k143klb90pao2.R.inc(51997);variance.setBiasCorrected(isBiasCorrected);
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public StandardDeviation copy() {try{__CLR4_4_1143k143klb90pao2.R.inc(51998);
        __CLR4_4_1143k143klb90pao2.R.inc(51999);StandardDeviation result = new StandardDeviation();
        // No try-catch or advertised exception because args are guaranteed non-null
        __CLR4_4_1143k143klb90pao2.R.inc(52000);copy(this, result);
        __CLR4_4_1143k143klb90pao2.R.inc(52001);return result;
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}


    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source StandardDeviation to copy
     * @param dest StandardDeviation to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(StandardDeviation source, StandardDeviation dest)
        throws NullArgumentException {try{__CLR4_4_1143k143klb90pao2.R.inc(52002);
        __CLR4_4_1143k143klb90pao2.R.inc(52003);MathUtils.checkNotNull(source);
        __CLR4_4_1143k143klb90pao2.R.inc(52004);MathUtils.checkNotNull(dest);
        __CLR4_4_1143k143klb90pao2.R.inc(52005);dest.setData(source.getDataRef());
        __CLR4_4_1143k143klb90pao2.R.inc(52006);dest.variance = source.variance.copy();
    }finally{__CLR4_4_1143k143klb90pao2.R.flushNeeded();}}

}
