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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Abstract base class for all implementations of the
 * {@link UnivariateStatistic} interface.
 * <p>
 * Provides a default implementation of <code>evaluate(double[]),</code>
 * delegating to <code>evaluate(double[], int, int)</code> in the natural way.
 * </p>
 * <p>
 * Also includes a <code>test</code> method that performs generic parameter
 * validation for the <code>evaluate</code> methods.</p>
 *
 * @version $Id$
 */
public abstract class AbstractUnivariateStatistic
    implements UnivariateStatistic {static class __CLR4_4_112zw12zwlb90pall{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50634,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Stored data. */
    private double[] storedData;

    /**
     * Set the data array.
     * <p>
     * The stored value is a copy of the parameter array, not the array itself.
     * </p>
     * @param values data array to store (may be null to remove stored data)
     * @see #evaluate()
     */
    public void setData(final double[] values) {try{__CLR4_4_112zw12zwlb90pall.R.inc(50540);
        __CLR4_4_112zw12zwlb90pall.R.inc(50541);storedData = ((((values == null) )&&(__CLR4_4_112zw12zwlb90pall.R.iget(50542)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50543)==0&false))? null : values.clone();
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * Get a copy of the stored data array.
     * @return copy of the stored data array (may be null)
     */
    public double[] getData() {try{__CLR4_4_112zw12zwlb90pall.R.inc(50544);
        __CLR4_4_112zw12zwlb90pall.R.inc(50545);return ((((storedData == null) )&&(__CLR4_4_112zw12zwlb90pall.R.iget(50546)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50547)==0&false))? null : storedData.clone();
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * Get a reference to the stored data array.
     * @return reference to the stored data array (may be null)
     */
    protected double[] getDataRef() {try{__CLR4_4_112zw12zwlb90pall.R.inc(50548);
        __CLR4_4_112zw12zwlb90pall.R.inc(50549);return storedData;
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * Set the data array.  The input array is copied, not referenced.
     *
     * @param values data array to store
     * @param begin the index of the first element to include
     * @param length the number of elements to include
     * @throws MathIllegalArgumentException if values is null or the indices
     * are not valid
     * @see #evaluate()
     */
    public void setData(final double[] values, final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_112zw12zwlb90pall.R.inc(50550);
        __CLR4_4_112zw12zwlb90pall.R.inc(50551);if ((((values == null)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50552)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50553)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50554);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50555);if ((((begin < 0)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50556)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50557)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50558);throw new NotPositiveException(LocalizedFormats.START_POSITION, begin);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50559);if ((((length < 0)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50560)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50561)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50562);throw new NotPositiveException(LocalizedFormats.LENGTH, length);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50563);if ((((begin + length > values.length)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50564)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50565)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50566);throw new NumberIsTooLargeException(LocalizedFormats.SUBARRAY_ENDS_AFTER_ARRAY_END,
                                                begin + length, values.length, true);
        }
        }__CLR4_4_112zw12zwlb90pall.R.inc(50567);storedData = new double[length];
        __CLR4_4_112zw12zwlb90pall.R.inc(50568);System.arraycopy(values, begin, storedData, 0, length);
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * Returns the result of evaluating the statistic over the stored data.
     * <p>
     * The stored array is the one which was set by previous calls to {@link #setData(double[])}.
     * </p>
     * @return the value of the statistic applied to the stored data
     * @throws MathIllegalArgumentException if the stored data array is null
     */
    public double evaluate() throws MathIllegalArgumentException {try{__CLR4_4_112zw12zwlb90pall.R.inc(50569);
        __CLR4_4_112zw12zwlb90pall.R.inc(50570);return evaluate(storedData);
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double evaluate(final double[] values) throws MathIllegalArgumentException {try{__CLR4_4_112zw12zwlb90pall.R.inc(50571);
        __CLR4_4_112zw12zwlb90pall.R.inc(50572);test(values, 0, 0);
        __CLR4_4_112zw12zwlb90pall.R.inc(50573);return evaluate(values, 0, values.length);
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public abstract double evaluate(final double[] values, final int begin, final int length)
    throws MathIllegalArgumentException;

    /**
     * {@inheritDoc}
     */
    public abstract UnivariateStatistic copy();

    /**
     * This method is used by <code>evaluate(double[], int, int)</code> methods
     * to verify that the input parameters designate a subarray of positive length.
     * <p>
     * <ul>
     * <li>returns <code>true</code> iff the parameters designate a subarray of
     * positive length</li>
     * <li>throws <code>MathIllegalArgumentException</code> if the array is null or
     * or the indices are invalid</li>
     * <li>returns <code>false</li> if the array is non-null, but
     * <code>length</code> is 0.
     * </ul></p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return true if the parameters are valid and designate a subarray of positive length
     * @throws MathIllegalArgumentException if the indices are invalid or the array is null
     */
    protected boolean test(
        final double[] values,
        final int begin,
        final int length) throws MathIllegalArgumentException {try{__CLR4_4_112zw12zwlb90pall.R.inc(50574);
        __CLR4_4_112zw12zwlb90pall.R.inc(50575);return test(values, begin, length, false);
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * This method is used by <code>evaluate(double[], int, int)</code> methods
     * to verify that the input parameters designate a subarray of positive length.
     * <p>
     * <ul>
     * <li>returns <code>true</code> iff the parameters designate a subarray of
     * non-negative length</li>
     * <li>throws <code>IllegalArgumentException</code> if the array is null or
     * or the indices are invalid</li>
     * <li>returns <code>false</li> if the array is non-null, but
     * <code>length</code> is 0 unless <code>allowEmpty</code> is <code>true</code>
     * </ul></p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @param allowEmpty if <code>true</code> then zero length arrays are allowed
     * @return true if the parameters are valid
     * @throws MathIllegalArgumentException if the indices are invalid or the array is null
     * @since 3.0
     */
    protected boolean test(final double[] values, final int begin,
            final int length, final boolean allowEmpty) throws MathIllegalArgumentException {try{__CLR4_4_112zw12zwlb90pall.R.inc(50576);

        __CLR4_4_112zw12zwlb90pall.R.inc(50577);if ((((values == null)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50578)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50579)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50580);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50581);if ((((begin < 0)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50582)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50583)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50584);throw new NotPositiveException(LocalizedFormats.START_POSITION, begin);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50585);if ((((length < 0)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50586)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50587)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50588);throw new NotPositiveException(LocalizedFormats.LENGTH, length);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50589);if ((((begin + length > values.length)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50590)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50591)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50592);throw new NumberIsTooLargeException(LocalizedFormats.SUBARRAY_ENDS_AFTER_ARRAY_END,
                                                begin + length, values.length, true);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50593);if ((((length == 0 && !allowEmpty)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50594)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50595)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50596);return false;
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50597);return true;

    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * This method is used by <code>evaluate(double[], double[], int, int)</code> methods
     * to verify that the begin and length parameters designate a subarray of positive length
     * and the weights are all non-negative, non-NaN, finite, and not all zero.
     * <p>
     * <ul>
     * <li>returns <code>true</code> iff the parameters designate a subarray of
     * positive length and the weights array contains legitimate values.</li>
     * <li>throws <code>IllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     *     <li>the start and length arguments do not determine a valid array</li></ul>
     * </li>
     * <li>returns <code>false</li> if the array is non-null, but
     * <code>length</code> is 0.
     * </ul></p>
     *
     * @param values the input array
     * @param weights the weights array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return true if the parameters are valid and designate a subarray of positive length
     * @throws MathIllegalArgumentException if the indices are invalid or the array is null
     * @since 2.1
     */
    protected boolean test(
        final double[] values,
        final double[] weights,
        final int begin,
        final int length) throws MathIllegalArgumentException {try{__CLR4_4_112zw12zwlb90pall.R.inc(50598);
        __CLR4_4_112zw12zwlb90pall.R.inc(50599);return test(values, weights, begin, length, false);
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}

    /**
     * This method is used by <code>evaluate(double[], double[], int, int)</code> methods
     * to verify that the begin and length parameters designate a subarray of positive length
     * and the weights are all non-negative, non-NaN, finite, and not all zero.
     * <p>
     * <ul>
     * <li>returns <code>true</code> iff the parameters designate a subarray of
     * non-negative length and the weights array contains legitimate values.</li>
     * <li>throws <code>MathIllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     *     <li>the start and length arguments do not determine a valid array</li></ul>
     * </li>
     * <li>returns <code>false</li> if the array is non-null, but
     * <code>length</code> is 0 unless <code>allowEmpty</code> is <code>true</code>.
     * </ul></p>
     *
     * @param values the input array.
     * @param weights the weights array.
     * @param begin index of the first array element to include.
     * @param length the number of elements to include.
     * @param allowEmpty if {@code true} than allow zero length arrays to pass.
     * @return {@code true} if the parameters are valid.
     * @throws NullArgumentException if either of the arrays are null
     * @throws MathIllegalArgumentException if the array indices are not valid,
     * the weights array contains NaN, infinite or negative elements, or there
     * are no positive weights.
     * @since 3.0
     */
    protected boolean test(final double[] values, final double[] weights,
            final int begin, final int length, final boolean allowEmpty) throws MathIllegalArgumentException {try{__CLR4_4_112zw12zwlb90pall.R.inc(50600);

        __CLR4_4_112zw12zwlb90pall.R.inc(50601);if ((((weights == null || values == null)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50602)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50603)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50604);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50605);if ((((weights.length != values.length)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50606)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50607)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50608);throw new DimensionMismatchException(weights.length, values.length);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50609);boolean containsPositiveWeight = false;
        __CLR4_4_112zw12zwlb90pall.R.inc(50610);for (int i = begin; (((i < begin + length)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50611)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50612)==0&false)); i++) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50613);if ((((Double.isNaN(weights[i]))&&(__CLR4_4_112zw12zwlb90pall.R.iget(50614)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50615)==0&false))) {{
                __CLR4_4_112zw12zwlb90pall.R.inc(50616);throw new MathIllegalArgumentException(LocalizedFormats.NAN_ELEMENT_AT_INDEX, i);
            }
            }__CLR4_4_112zw12zwlb90pall.R.inc(50617);if ((((Double.isInfinite(weights[i]))&&(__CLR4_4_112zw12zwlb90pall.R.iget(50618)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50619)==0&false))) {{
                __CLR4_4_112zw12zwlb90pall.R.inc(50620);throw new MathIllegalArgumentException(LocalizedFormats.INFINITE_ARRAY_ELEMENT, weights[i], i);
            }
            }__CLR4_4_112zw12zwlb90pall.R.inc(50621);if ((((weights[i] < 0)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50622)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50623)==0&false))) {{
                __CLR4_4_112zw12zwlb90pall.R.inc(50624);throw new MathIllegalArgumentException(LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX, i, weights[i]);
            }
            }__CLR4_4_112zw12zwlb90pall.R.inc(50625);if ((((!containsPositiveWeight && weights[i] > 0.0)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50626)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50627)==0&false))) {{
                __CLR4_4_112zw12zwlb90pall.R.inc(50628);containsPositiveWeight = true;
            }
        }}

        }__CLR4_4_112zw12zwlb90pall.R.inc(50629);if ((((!containsPositiveWeight)&&(__CLR4_4_112zw12zwlb90pall.R.iget(50630)!=0|true))||(__CLR4_4_112zw12zwlb90pall.R.iget(50631)==0&false))) {{
            __CLR4_4_112zw12zwlb90pall.R.inc(50632);throw new MathIllegalArgumentException(LocalizedFormats.WEIGHT_AT_LEAST_ONE_NON_ZERO);
        }

        }__CLR4_4_112zw12zwlb90pall.R.inc(50633);return test(values, begin, length, allowEmpty);
    }finally{__CLR4_4_112zw12zwlb90pall.R.flushNeeded();}}
}

