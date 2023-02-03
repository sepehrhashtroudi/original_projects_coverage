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
 * Computes the skewness of the available values.
 * <p>
 * We use the following (unbiased) formula to define skewness:</p>
 * <p>
 * skewness = [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3 </p>
 * <p>
 * where n is the number of values, mean is the {@link Mean} and std is the
 * {@link StandardDeviation} </p>
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally. </p>
 *
 * @version $Id$
 */
public class Skewness extends AbstractStorelessUnivariateStatistic implements Serializable {public static class __CLR4_4_1141o141olb90panz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51968,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 7101857578996691352L;

    /** Third moment on which this statistic is based */
    protected ThirdMoment moment = null;

     /**
     * Determines whether or not this statistic can be incremented or cleared.
     * <p>
     * Statistics based on (constructed from) external moments cannot
     * be incremented or cleared.</p>
    */
    protected boolean incMoment;

    /**
     * Constructs a Skewness
     */
    public Skewness() {try{__CLR4_4_1141o141olb90panz.R.inc(51900);
        __CLR4_4_1141o141olb90panz.R.inc(51901);incMoment = true;
        __CLR4_4_1141o141olb90panz.R.inc(51902);moment = new ThirdMoment();
    }finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * Constructs a Skewness with an external moment
     * @param m3 external moment
     */
    public Skewness(final ThirdMoment m3) {try{__CLR4_4_1141o141olb90panz.R.inc(51903);
        __CLR4_4_1141o141olb90panz.R.inc(51904);incMoment = false;
        __CLR4_4_1141o141olb90panz.R.inc(51905);this.moment = m3;
    }finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * Copy constructor, creates a new {@code Skewness} identical
     * to the {@code original}
     *
     * @param original the {@code Skewness} instance to copy
     * @throws NullArgumentException if original is null
     */
    public Skewness(Skewness original) throws NullArgumentException {try{__CLR4_4_1141o141olb90panz.R.inc(51906);
        __CLR4_4_1141o141olb90panz.R.inc(51907);copy(original, this);
    }finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>Note that when {@link #Skewness(ThirdMoment)} is used to
     * create a Skewness, this method does nothing. In that case, the
     * ThirdMoment should be incremented directly.</p>
     */
    @Override
    public void increment(final double d) {try{__CLR4_4_1141o141olb90panz.R.inc(51908);
        __CLR4_4_1141o141olb90panz.R.inc(51909);if ((((incMoment)&&(__CLR4_4_1141o141olb90panz.R.iget(51910)!=0|true))||(__CLR4_4_1141o141olb90panz.R.iget(51911)==0&false))) {{
            __CLR4_4_1141o141olb90panz.R.inc(51912);moment.increment(d);
        }
    }}finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * Returns the value of the statistic based on the values that have been added.
     * <p>
     * See {@link Skewness} for the definition used in the computation.</p>
     *
     * @return the skewness of the available values.
     */
    @Override
    public double getResult() {try{__CLR4_4_1141o141olb90panz.R.inc(51913);

        __CLR4_4_1141o141olb90panz.R.inc(51914);if ((((moment.n < 3)&&(__CLR4_4_1141o141olb90panz.R.iget(51915)!=0|true))||(__CLR4_4_1141o141olb90panz.R.iget(51916)==0&false))) {{
            __CLR4_4_1141o141olb90panz.R.inc(51917);return Double.NaN;
        }
        }__CLR4_4_1141o141olb90panz.R.inc(51918);double variance = moment.m2 / (moment.n - 1);
        __CLR4_4_1141o141olb90panz.R.inc(51919);if ((((variance < 10E-20)&&(__CLR4_4_1141o141olb90panz.R.iget(51920)!=0|true))||(__CLR4_4_1141o141olb90panz.R.iget(51921)==0&false))) {{
            __CLR4_4_1141o141olb90panz.R.inc(51922);return 0.0d;
        } }else {{
            __CLR4_4_1141o141olb90panz.R.inc(51923);double n0 = moment.getN();
            __CLR4_4_1141o141olb90panz.R.inc(51924);return  (n0 * moment.m3) /
            ((n0 - 1) * (n0 -2) * FastMath.sqrt(variance) * variance);
        }
    }}finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public long getN() {try{__CLR4_4_1141o141olb90panz.R.inc(51925);
        __CLR4_4_1141o141olb90panz.R.inc(51926);return moment.getN();
    }finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {try{__CLR4_4_1141o141olb90panz.R.inc(51927);
        __CLR4_4_1141o141olb90panz.R.inc(51928);if ((((incMoment)&&(__CLR4_4_1141o141olb90panz.R.iget(51929)!=0|true))||(__CLR4_4_1141o141olb90panz.R.iget(51930)==0&false))) {{
            __CLR4_4_1141o141olb90panz.R.inc(51931);moment.clear();
        }
    }}finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * Returns the Skewness of the entries in the specifed portion of the
     * input array.
     * <p>
     * See {@link Skewness} for the definition used in the computation.</p>
     * <p>
     * Throws <code>IllegalArgumentException</code> if the array is null.</p>
     *
     * @param values the input array
     * @param begin the index of the first array element to include
     * @param length the number of elements to include
     * @return the skewness of the values or Double.NaN if length is less than
     * 3
     * @throws MathIllegalArgumentException if the array is null or the array index
     *  parameters are not valid
     */
    @Override
    public double evaluate(final double[] values,final int begin,
            final int length) throws MathIllegalArgumentException {try{__CLR4_4_1141o141olb90panz.R.inc(51932);

        // Initialize the skewness
        __CLR4_4_1141o141olb90panz.R.inc(51933);double skew = Double.NaN;

        __CLR4_4_1141o141olb90panz.R.inc(51934);if ((((test(values, begin, length) && length > 2 )&&(__CLR4_4_1141o141olb90panz.R.iget(51935)!=0|true))||(__CLR4_4_1141o141olb90panz.R.iget(51936)==0&false))){{
            __CLR4_4_1141o141olb90panz.R.inc(51937);Mean mean = new Mean();
            // Get the mean and the standard deviation
            __CLR4_4_1141o141olb90panz.R.inc(51938);double m = mean.evaluate(values, begin, length);

            // Calc the std, this is implemented here instead
            // of using the standardDeviation method eliminate
            // a duplicate pass to get the mean
            __CLR4_4_1141o141olb90panz.R.inc(51939);double accum = 0.0;
            __CLR4_4_1141o141olb90panz.R.inc(51940);double accum2 = 0.0;
            __CLR4_4_1141o141olb90panz.R.inc(51941);for (int i = begin; (((i < begin + length)&&(__CLR4_4_1141o141olb90panz.R.iget(51942)!=0|true))||(__CLR4_4_1141o141olb90panz.R.iget(51943)==0&false)); i++) {{
                __CLR4_4_1141o141olb90panz.R.inc(51944);final double d = values[i] - m;
                __CLR4_4_1141o141olb90panz.R.inc(51945);accum  += d * d;
                __CLR4_4_1141o141olb90panz.R.inc(51946);accum2 += d;
            }
            }__CLR4_4_1141o141olb90panz.R.inc(51947);final double variance = (accum - (accum2 * accum2 / length)) / (length - 1);

            __CLR4_4_1141o141olb90panz.R.inc(51948);double accum3 = 0.0;
            __CLR4_4_1141o141olb90panz.R.inc(51949);for (int i = begin; (((i < begin + length)&&(__CLR4_4_1141o141olb90panz.R.iget(51950)!=0|true))||(__CLR4_4_1141o141olb90panz.R.iget(51951)==0&false)); i++) {{
                __CLR4_4_1141o141olb90panz.R.inc(51952);final double d = values[i] - m;
                __CLR4_4_1141o141olb90panz.R.inc(51953);accum3 += d * d * d;
            }
            }__CLR4_4_1141o141olb90panz.R.inc(51954);accum3 /= variance * FastMath.sqrt(variance);

            // Get N
            __CLR4_4_1141o141olb90panz.R.inc(51955);double n0 = length;

            // Calculate skewness
            __CLR4_4_1141o141olb90panz.R.inc(51956);skew = (n0 / ((n0 - 1) * (n0 - 2))) * accum3;
        }
        }__CLR4_4_1141o141olb90panz.R.inc(51957);return skew;
    }finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Skewness copy() {try{__CLR4_4_1141o141olb90panz.R.inc(51958);
        __CLR4_4_1141o141olb90panz.R.inc(51959);Skewness result = new Skewness();
        // No try-catch or advertised exception because args are guaranteed non-null
        __CLR4_4_1141o141olb90panz.R.inc(51960);copy(this, result);
        __CLR4_4_1141o141olb90panz.R.inc(51961);return result;
    }finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}

    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source Skewness to copy
     * @param dest Skewness to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(Skewness source, Skewness dest)
        throws NullArgumentException {try{__CLR4_4_1141o141olb90panz.R.inc(51962);
        __CLR4_4_1141o141olb90panz.R.inc(51963);MathUtils.checkNotNull(source);
        __CLR4_4_1141o141olb90panz.R.inc(51964);MathUtils.checkNotNull(dest);
        __CLR4_4_1141o141olb90panz.R.inc(51965);dest.setData(source.getDataRef());
        __CLR4_4_1141o141olb90panz.R.inc(51966);dest.moment = new ThirdMoment(source.moment.copy());
        __CLR4_4_1141o141olb90panz.R.inc(51967);dest.incMoment = source.incMoment;
    }finally{__CLR4_4_1141o141olb90panz.R.flushNeeded();}}
}
