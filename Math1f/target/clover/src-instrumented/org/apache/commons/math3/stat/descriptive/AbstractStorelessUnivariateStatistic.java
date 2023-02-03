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

import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.Precision;

/**
 *
 * Abstract implementation of the {@link StorelessUnivariateStatistic} interface.
 * <p>
 * Provides default <code>evaluate()</code> and <code>incrementAll(double[])</code>
 * implementations.</p>
 * <p>
 * <strong>Note that these implementations are not synchronized.</strong></p>
 *
 * @version $Id$
 */
public abstract class AbstractStorelessUnivariateStatistic
    extends AbstractUnivariateStatistic
    implements StorelessUnivariateStatistic {static class __CLR4_4_112yr12yrlb90palh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * This default implementation calls {@link #clear}, then invokes
     * {@link #increment} in a loop over the the input array, and then uses
     * {@link #getResult} to compute the return value.
     * <p>
     * Note that this implementation changes the internal state of the
     * statistic.  Its side effects are the same as invoking {@link #clear} and
     * then {@link #incrementAll(double[])}.</p>
     * <p>
     * Implementations may override this method with a more efficient and
     * possibly more accurate implementation that works directly with the
     * input array.</p>
     * <p>
     * If the array is null, a MathIllegalArgumentException is thrown.</p>
     * @param values input array
     * @return the value of the statistic applied to the input array
     * @throws MathIllegalArgumentException if values is null
     * @see org.apache.commons.math3.stat.descriptive.UnivariateStatistic#evaluate(double[])
     */
    @Override
    public double evaluate(final double[] values) throws MathIllegalArgumentException {try{__CLR4_4_112yr12yrlb90palh.R.inc(50499);
        __CLR4_4_112yr12yrlb90palh.R.inc(50500);if ((((values == null)&&(__CLR4_4_112yr12yrlb90palh.R.iget(50501)!=0|true))||(__CLR4_4_112yr12yrlb90palh.R.iget(50502)==0&false))) {{
            __CLR4_4_112yr12yrlb90palh.R.inc(50503);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }
        }__CLR4_4_112yr12yrlb90palh.R.inc(50504);return evaluate(values, 0, values.length);
    }finally{__CLR4_4_112yr12yrlb90palh.R.flushNeeded();}}

    /**
     * This default implementation calls {@link #clear}, then invokes
     * {@link #increment} in a loop over the specified portion of the input
     * array, and then uses {@link #getResult} to compute the return value.
     * <p>
     * Note that this implementation changes the internal state of the
     * statistic.  Its side effects are the same as invoking {@link #clear} and
     * then {@link #incrementAll(double[], int, int)}.</p>
     * <p>
     * Implementations may override this method with a more efficient and
     * possibly more accurate implementation that works directly with the
     * input array.</p>
     * <p>
     * If the array is null or the index parameters are not valid, an
     * MathIllegalArgumentException is thrown.</p>
     * @param values the input array
     * @param begin the index of the first element to include
     * @param length the number of elements to include
     * @return the value of the statistic applied to the included array entries
     * @throws MathIllegalArgumentException if the array is null or the indices are not valid
     * @see org.apache.commons.math3.stat.descriptive.UnivariateStatistic#evaluate(double[], int, int)
     */
    @Override
    public double evaluate(final double[] values, final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_112yr12yrlb90palh.R.inc(50505);
        __CLR4_4_112yr12yrlb90palh.R.inc(50506);if ((((test(values, begin, length))&&(__CLR4_4_112yr12yrlb90palh.R.iget(50507)!=0|true))||(__CLR4_4_112yr12yrlb90palh.R.iget(50508)==0&false))) {{
            __CLR4_4_112yr12yrlb90palh.R.inc(50509);clear();
            __CLR4_4_112yr12yrlb90palh.R.inc(50510);incrementAll(values, begin, length);
        }
        }__CLR4_4_112yr12yrlb90palh.R.inc(50511);return getResult();
    }finally{__CLR4_4_112yr12yrlb90palh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract StorelessUnivariateStatistic copy();

    /**
     * {@inheritDoc}
     */
    public abstract void clear();

    /**
     * {@inheritDoc}
     */
    public abstract double getResult();

    /**
     * {@inheritDoc}
     */
    public abstract void increment(final double d);

    /**
     * This default implementation just calls {@link #increment} in a loop over
     * the input array.
     * <p>
     * Throws IllegalArgumentException if the input values array is null.</p>
     *
     * @param values values to add
     * @throws MathIllegalArgumentException if values is null
     * @see org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic#incrementAll(double[])
     */
    public void incrementAll(double[] values) throws MathIllegalArgumentException {try{__CLR4_4_112yr12yrlb90palh.R.inc(50512);
        __CLR4_4_112yr12yrlb90palh.R.inc(50513);if ((((values == null)&&(__CLR4_4_112yr12yrlb90palh.R.iget(50514)!=0|true))||(__CLR4_4_112yr12yrlb90palh.R.iget(50515)==0&false))) {{
            __CLR4_4_112yr12yrlb90palh.R.inc(50516);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }
        }__CLR4_4_112yr12yrlb90palh.R.inc(50517);incrementAll(values, 0, values.length);
    }finally{__CLR4_4_112yr12yrlb90palh.R.flushNeeded();}}

    /**
     * This default implementation just calls {@link #increment} in a loop over
     * the specified portion of the input array.
     * <p>
     * Throws IllegalArgumentException if the input values array is null.</p>
     *
     * @param values  array holding values to add
     * @param begin   index of the first array element to add
     * @param length  number of array elements to add
     * @throws MathIllegalArgumentException if values is null
     * @see org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic#incrementAll(double[], int, int)
     */
    public void incrementAll(double[] values, int begin, int length) throws MathIllegalArgumentException {try{__CLR4_4_112yr12yrlb90palh.R.inc(50518);
        __CLR4_4_112yr12yrlb90palh.R.inc(50519);if ((((test(values, begin, length))&&(__CLR4_4_112yr12yrlb90palh.R.iget(50520)!=0|true))||(__CLR4_4_112yr12yrlb90palh.R.iget(50521)==0&false))) {{
            __CLR4_4_112yr12yrlb90palh.R.inc(50522);int k = begin + length;
            __CLR4_4_112yr12yrlb90palh.R.inc(50523);for (int i = begin; (((i < k)&&(__CLR4_4_112yr12yrlb90palh.R.iget(50524)!=0|true))||(__CLR4_4_112yr12yrlb90palh.R.iget(50525)==0&false)); i++) {{
                __CLR4_4_112yr12yrlb90palh.R.inc(50526);increment(values[i]);
            }
        }}
    }}finally{__CLR4_4_112yr12yrlb90palh.R.flushNeeded();}}

    /**
     * Returns true iff <code>object</code> is an
     * <code>AbstractStorelessUnivariateStatistic</code> returning the same
     * values as this for <code>getResult()</code> and <code>getN()</code>
     * @param object object to test equality against.
     * @return true if object returns the same value as this
     */
    @Override
    public boolean equals(Object object) {try{__CLR4_4_112yr12yrlb90palh.R.inc(50527);
        __CLR4_4_112yr12yrlb90palh.R.inc(50528);if ((((object == this )&&(__CLR4_4_112yr12yrlb90palh.R.iget(50529)!=0|true))||(__CLR4_4_112yr12yrlb90palh.R.iget(50530)==0&false))) {{
            __CLR4_4_112yr12yrlb90palh.R.inc(50531);return true;
        }
       }__CLR4_4_112yr12yrlb90palh.R.inc(50532);if ((((object instanceof AbstractStorelessUnivariateStatistic == false)&&(__CLR4_4_112yr12yrlb90palh.R.iget(50533)!=0|true))||(__CLR4_4_112yr12yrlb90palh.R.iget(50534)==0&false))) {{
            __CLR4_4_112yr12yrlb90palh.R.inc(50535);return false;
        }
        }__CLR4_4_112yr12yrlb90palh.R.inc(50536);AbstractStorelessUnivariateStatistic stat = (AbstractStorelessUnivariateStatistic) object;
        __CLR4_4_112yr12yrlb90palh.R.inc(50537);return Precision.equalsIncludingNaN(stat.getResult(), this.getResult()) &&
               Precision.equalsIncludingNaN(stat.getN(), this.getN());
    }finally{__CLR4_4_112yr12yrlb90palh.R.flushNeeded();}}

    /**
     * Returns hash code based on getResult() and getN()
     *
     * @return hash code
     */
    @Override
    public int hashCode() {try{__CLR4_4_112yr12yrlb90palh.R.inc(50538);
        __CLR4_4_112yr12yrlb90palh.R.inc(50539);return 31* (31 + MathUtils.hash(getResult())) + MathUtils.hash(getN());
    }finally{__CLR4_4_112yr12yrlb90palh.R.flushNeeded();}}

}
