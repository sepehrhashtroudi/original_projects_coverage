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
 * Computes the Kurtosis of the available values.
 * <p>
 * We use the following (unbiased) formula to define kurtosis:</p>
 *  <p>
 *  kurtosis = { [n(n+1) / (n -1)(n - 2)(n-3)] sum[(x_i - mean)^4] / std^4 } - [3(n-1)^2 / (n-2)(n-3)]
 *  </p><p>
 *  where n is the number of values, mean is the {@link Mean} and std is the
 * {@link StandardDeviation}</p>
 * <p>
 *  Note that this statistic is undefined for n < 4.  <code>Double.Nan</code>
 *  is returned when there is not sufficient data to compute the statistic.</p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.</p>
 *
 * @version $Id$
 */
public class Kurtosis extends AbstractStorelessUnivariateStatistic  implements Serializable {public static class __CLR4_4_113vk13vklb90pank{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51743,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 2784465764798260919L;

    /**Fourth Moment on which this statistic is based */
    protected FourthMoment moment;

    /**
     * Determines whether or not this statistic can be incremented or cleared.
     * <p>
     * Statistics based on (constructed from) external moments cannot
     * be incremented or cleared.</p>
    */
    protected boolean incMoment;

    /**
     * Construct a Kurtosis
     */
    public Kurtosis() {try{__CLR4_4_113vk13vklb90pank.R.inc(51680);
        __CLR4_4_113vk13vklb90pank.R.inc(51681);incMoment = true;
        __CLR4_4_113vk13vklb90pank.R.inc(51682);moment = new FourthMoment();
    }finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /**
     * Construct a Kurtosis from an external moment
     *
     * @param m4 external Moment
     */
    public Kurtosis(final FourthMoment m4) {try{__CLR4_4_113vk13vklb90pank.R.inc(51683);
        __CLR4_4_113vk13vklb90pank.R.inc(51684);incMoment = false;
        __CLR4_4_113vk13vklb90pank.R.inc(51685);this.moment = m4;
    }finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code Kurtosis} identical
     * to the {@code original}
     *
     * @param original the {@code Kurtosis} instance to copy
     * @throws NullArgumentException if original is null
     */
    public Kurtosis(Kurtosis original) throws NullArgumentException {try{__CLR4_4_113vk13vklb90pank.R.inc(51686);
        __CLR4_4_113vk13vklb90pank.R.inc(51687);copy(original, this);
    }finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>Note that when {@link #Kurtosis(FourthMoment)} is used to
     * create a Variance, this method does nothing. In that case, the
     * FourthMoment should be incremented directly.</p>
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_113vk13vklb90pank.R.inc(51688);
        __CLR4_4_113vk13vklb90pank.R.inc(51689);if ((((incMoment)&&(__CLR4_4_113vk13vklb90pank.R.iget(51690)!=0|true))||(__CLR4_4_113vk13vklb90pank.R.iget(51691)==0&false))) {{
            __CLR4_4_113vk13vklb90pank.R.inc(51692);moment.increment(d);
        }
    }}finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {try{__CLR4_4_113vk13vklb90pank.R.inc(51693);
        __CLR4_4_113vk13vklb90pank.R.inc(51694);double kurtosis = Double.NaN;
        __CLR4_4_113vk13vklb90pank.R.inc(51695);if ((((moment.getN() > 3)&&(__CLR4_4_113vk13vklb90pank.R.iget(51696)!=0|true))||(__CLR4_4_113vk13vklb90pank.R.iget(51697)==0&false))) {{
            __CLR4_4_113vk13vklb90pank.R.inc(51698);double variance = moment.m2 / (moment.n - 1);
                __CLR4_4_113vk13vklb90pank.R.inc(51699);if ((((moment.n <= 3 || variance < 10E-20)&&(__CLR4_4_113vk13vklb90pank.R.iget(51700)!=0|true))||(__CLR4_4_113vk13vklb90pank.R.iget(51701)==0&false))) {{
                    __CLR4_4_113vk13vklb90pank.R.inc(51702);kurtosis = 0.0;
                } }else {{
                    __CLR4_4_113vk13vklb90pank.R.inc(51703);double n = moment.n;
                    __CLR4_4_113vk13vklb90pank.R.inc(51704);kurtosis =
                        (n * (n + 1) * moment.getResult() -
                                3 * moment.m2 * moment.m2 * (n - 1)) /
                                ((n - 1) * (n -2) * (n -3) * variance * variance);
                }
        }}
        }__CLR4_4_113vk13vklb90pank.R.inc(51705);return kurtosis;
    }finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_113vk13vklb90pank.R.inc(51706);
        __CLR4_4_113vk13vklb90pank.R.inc(51707);if ((((incMoment)&&(__CLR4_4_113vk13vklb90pank.R.iget(51708)!=0|true))||(__CLR4_4_113vk13vklb90pank.R.iget(51709)==0&false))) {{
            __CLR4_4_113vk13vklb90pank.R.inc(51710);moment.clear();
        }
    }}finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_113vk13vklb90pank.R.inc(51711);
        __CLR4_4_113vk13vklb90pank.R.inc(51712);return moment.getN();
    }finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /* UnvariateStatistic Approach  */

    /**
     * Returns the kurtosis of the entries in the specified portion of the
     * input array.
     * <p>
     * See {@link Kurtosis} for details on the computing algorithm.</p>
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @return the kurtosis of the values or Double.NaN if length is less than 4
     * @throws MathIllegalArgumentException if the input array is null or the array
     * index parameters are not valid
     */
    @Override
    public double evaluate(final double[] values,final int begin, final int length)
    throws MathIllegalArgumentException {try{__CLR4_4_113vk13vklb90pank.R.inc(51713);
        // Initialize the kurtosis
        __CLR4_4_113vk13vklb90pank.R.inc(51714);double kurt = Double.NaN;

        __CLR4_4_113vk13vklb90pank.R.inc(51715);if ((((test(values, begin, length) && length > 3)&&(__CLR4_4_113vk13vklb90pank.R.iget(51716)!=0|true))||(__CLR4_4_113vk13vklb90pank.R.iget(51717)==0&false))) {{

            // Compute the mean and standard deviation
            __CLR4_4_113vk13vklb90pank.R.inc(51718);Variance variance = new Variance();
            __CLR4_4_113vk13vklb90pank.R.inc(51719);variance.incrementAll(values, begin, length);
            __CLR4_4_113vk13vklb90pank.R.inc(51720);double mean = variance.moment.m1;
            __CLR4_4_113vk13vklb90pank.R.inc(51721);double stdDev = FastMath.sqrt(variance.getResult());

            // Sum the ^4 of the distance from the mean divided by the
            // standard deviation
            __CLR4_4_113vk13vklb90pank.R.inc(51722);double accum3 = 0.0;
            __CLR4_4_113vk13vklb90pank.R.inc(51723);for (int i = begin; (((i < begin + length)&&(__CLR4_4_113vk13vklb90pank.R.iget(51724)!=0|true))||(__CLR4_4_113vk13vklb90pank.R.iget(51725)==0&false)); i++) {{
                __CLR4_4_113vk13vklb90pank.R.inc(51726);accum3 += FastMath.pow(values[i] - mean, 4.0);
            }
            }__CLR4_4_113vk13vklb90pank.R.inc(51727);accum3 /= FastMath.pow(stdDev, 4.0d);

            // Get N
            __CLR4_4_113vk13vklb90pank.R.inc(51728);double n0 = length;

            __CLR4_4_113vk13vklb90pank.R.inc(51729);double coefficientOne =
                (n0 * (n0 + 1)) / ((n0 - 1) * (n0 - 2) * (n0 - 3));
            __CLR4_4_113vk13vklb90pank.R.inc(51730);double termTwo =
                (3 * FastMath.pow(n0 - 1, 2.0)) / ((n0 - 2) * (n0 - 3));

            // Calculate kurtosis
            __CLR4_4_113vk13vklb90pank.R.inc(51731);kurt = (coefficientOne * accum3) - termTwo;
        }
        }__CLR4_4_113vk13vklb90pank.R.inc(51732);return kurt;
    }finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Kurtosis copy() {try{__CLR4_4_113vk13vklb90pank.R.inc(51733);
        __CLR4_4_113vk13vklb90pank.R.inc(51734);Kurtosis result = new Kurtosis();
        // No try-catch because args are guaranteed non-null
        __CLR4_4_113vk13vklb90pank.R.inc(51735);copy(this, result);
        __CLR4_4_113vk13vklb90pank.R.inc(51736);return result;
    }finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source Kurtosis to copy
     * @param dest Kurtosis to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(Kurtosis source, Kurtosis dest)
        throws NullArgumentException {try{__CLR4_4_113vk13vklb90pank.R.inc(51737);
        __CLR4_4_113vk13vklb90pank.R.inc(51738);MathUtils.checkNotNull(source);
        __CLR4_4_113vk13vklb90pank.R.inc(51739);MathUtils.checkNotNull(dest);
        __CLR4_4_113vk13vklb90pank.R.inc(51740);dest.setData(source.getDataRef());
        __CLR4_4_113vk13vklb90pank.R.inc(51741);dest.moment = source.moment.copy();
        __CLR4_4_113vk13vklb90pank.R.inc(51742);dest.incMoment = source.incMoment;
    }finally{__CLR4_4_113vk13vklb90pank.R.flushNeeded();}}

}
