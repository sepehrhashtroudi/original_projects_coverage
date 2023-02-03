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
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * Returns the <a href="http://www.xycoon.com/geometric_mean.htm">
 * geometric mean </a> of the available values.
 * <p>
 * Uses a {@link SumOfLogs} instance to compute sum of logs and returns
 * <code> exp( 1/n  (sum of logs) ).</code>  Therefore, </p>
 * <ul>
 * <li>If any of values are < 0, the result is <code>NaN.</code></li>
 * <li>If all values are non-negative and less than
 * <code>Double.POSITIVE_INFINITY</code>,  but at least one value is 0, the
 * result is <code>0.</code></li>
 * <li>If both <code>Double.POSITIVE_INFINITY</code> and
 * <code>Double.NEGATIVE_INFINITY</code> are among the values, the result is
 * <code>NaN.</code></li>
 * </ul> </p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 *
 * @version $Id$
 */
public class GeometricMean extends AbstractStorelessUnivariateStatistic implements Serializable {public static class __CLR4_4_113ug13uglb90panf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -8178734905303459453L;

    /** Wrapped SumOfLogs instance */
    private StorelessUnivariateStatistic sumOfLogs;

    /**
     * Create a GeometricMean instance
     */
    public GeometricMean() {try{__CLR4_4_113ug13uglb90panf.R.inc(51640);
        __CLR4_4_113ug13uglb90panf.R.inc(51641);sumOfLogs = new SumOfLogs();
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code GeometricMean} identical
     * to the {@code original}
     *
     * @param original the {@code GeometricMean} instance to copy
     * @throws NullArgumentException if original is null
     */
    public GeometricMean(GeometricMean original) throws NullArgumentException {
        super();__CLR4_4_113ug13uglb90panf.R.inc(51643);try{__CLR4_4_113ug13uglb90panf.R.inc(51642);
        __CLR4_4_113ug13uglb90panf.R.inc(51644);copy(original, this);
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * Create a GeometricMean instance using the given SumOfLogs instance
     * @param sumOfLogs sum of logs instance to use for computation
     */
    public GeometricMean(SumOfLogs sumOfLogs) {try{__CLR4_4_113ug13uglb90panf.R.inc(51645);
        __CLR4_4_113ug13uglb90panf.R.inc(51646);this.sumOfLogs = sumOfLogs;
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometricMean copy() {try{__CLR4_4_113ug13uglb90panf.R.inc(51647);
        __CLR4_4_113ug13uglb90panf.R.inc(51648);GeometricMean result = new GeometricMean();
        // no try-catch or advertised exception because args guaranteed non-null
        __CLR4_4_113ug13uglb90panf.R.inc(51649);copy(this, result);
        __CLR4_4_113ug13uglb90panf.R.inc(51650);return result;
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_113ug13uglb90panf.R.inc(51651);
        __CLR4_4_113ug13uglb90panf.R.inc(51652);sumOfLogs.increment(d);
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_113ug13uglb90panf.R.inc(51653);
        __CLR4_4_113ug13uglb90panf.R.inc(51654);if ((((sumOfLogs.getN() > 0)&&(__CLR4_4_113ug13uglb90panf.R.iget(51655)!=0|true))||(__CLR4_4_113ug13uglb90panf.R.iget(51656)==0&false))) {{
            __CLR4_4_113ug13uglb90panf.R.inc(51657);return FastMath.exp(sumOfLogs.getResult() / sumOfLogs.getN());
        } }else {{
            __CLR4_4_113ug13uglb90panf.R.inc(51658);return Double.NaN;
        }
    }}finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_113ug13uglb90panf.R.inc(51659);
        __CLR4_4_113ug13uglb90panf.R.inc(51660);sumOfLogs.clear();
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * Returns the geometric mean of the entries in the specified portion
     * of the input array.
     * <p>
     * See {@link GeometricMean} for details on the computing algorithm.</p>
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     *
     * @param values input array containing the values
     * @param begin first array element to include
     * @param length the number of elements to include
     * @return the geometric mean or Double.NaN if length = 0 or
     * any of the values are &lt;= 0.
     * @throws MathIllegalArgumentException if the input array is null or the array
     * index parameters are not valid
     */
    @Override
    public double evaluate(
        final double[] values, final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_113ug13uglb90panf.R.inc(51661);
        __CLR4_4_113ug13uglb90panf.R.inc(51662);return FastMath.exp(
            sumOfLogs.evaluate(values, begin, length) / length);
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_113ug13uglb90panf.R.inc(51663);
        __CLR4_4_113ug13uglb90panf.R.inc(51664);return sumOfLogs.getN();
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * <p>Sets the implementation for the sum of logs.</p>
     * <p>This method must be activated before any data has been added - i.e.,
     * before {@link #increment(double) increment} has been used to add data;
     * otherwise an IllegalStateException will be thrown.</p>
     *
     * @param sumLogImpl the StorelessUnivariateStatistic instance to use
     * for computing the log sum
     * @throws MathIllegalStateException if data has already been added
     *  (i.e if n > 0)
     */
    public void setSumLogImpl(StorelessUnivariateStatistic sumLogImpl)
    throws MathIllegalStateException {try{__CLR4_4_113ug13uglb90panf.R.inc(51665);
        __CLR4_4_113ug13uglb90panf.R.inc(51666);checkEmpty();
        __CLR4_4_113ug13uglb90panf.R.inc(51667);this.sumOfLogs = sumLogImpl;
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * Returns the currently configured sum of logs implementation
     *
     * @return the StorelessUnivariateStatistic implementing the log sum
     */
    public StorelessUnivariateStatistic getSumLogImpl() {try{__CLR4_4_113ug13uglb90panf.R.inc(51668);
        __CLR4_4_113ug13uglb90panf.R.inc(51669);return sumOfLogs;
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source GeometricMean to copy
     * @param dest GeometricMean to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(GeometricMean source, GeometricMean dest)
        throws NullArgumentException {try{__CLR4_4_113ug13uglb90panf.R.inc(51670);
        __CLR4_4_113ug13uglb90panf.R.inc(51671);MathUtils.checkNotNull(source);
        __CLR4_4_113ug13uglb90panf.R.inc(51672);MathUtils.checkNotNull(dest);
        __CLR4_4_113ug13uglb90panf.R.inc(51673);dest.setData(source.getDataRef());
        __CLR4_4_113ug13uglb90panf.R.inc(51674);dest.sumOfLogs = source.sumOfLogs.copy();
    }finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}


    /**
     * Throws MathIllegalStateException if n > 0.
     * @throws MathIllegalStateException if data has been added to this statistic
     */
    private void checkEmpty() throws MathIllegalStateException {try{__CLR4_4_113ug13uglb90panf.R.inc(51675);
        __CLR4_4_113ug13uglb90panf.R.inc(51676);if ((((getN() > 0)&&(__CLR4_4_113ug13uglb90panf.R.iget(51677)!=0|true))||(__CLR4_4_113ug13uglb90panf.R.iget(51678)==0&false))) {{
            __CLR4_4_113ug13uglb90panf.R.inc(51679);throw new MathIllegalStateException(
                    LocalizedFormats.VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC,
                    getN());
        }
    }}finally{__CLR4_4_113ug13uglb90panf.R.flushNeeded();}}

}
