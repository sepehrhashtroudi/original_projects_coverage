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

import java.io.Serializable;

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.Precision;

/**
 *  Value object representing the results of a univariate statistical summary.
 *
 * @version $Id$
 */
public class StatisticalSummaryValues implements Serializable,
    StatisticalSummary {public static class __CLR4_4_113fr13frlb90pamf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization id */
    private static final long serialVersionUID = -5108854841843722536L;

    /** The sample mean */
    private final double mean;

    /** The sample variance */
    private final double variance;

    /** The number of observations in the sample */
    private final long n;

    /** The maximum value */
    private final double max;

    /** The minimum value */
    private final double min;

    /** The sum of the sample values */
    private final double sum;

    /**
      * Constructor
      *
      * @param mean  the sample mean
      * @param variance  the sample variance
      * @param n  the number of observations in the sample
      * @param max  the maximum value
      * @param min  the minimum value
      * @param sum  the sum of the values
     */
    public StatisticalSummaryValues(double mean, double variance, long n,
        double max, double min, double sum) {
        super();__CLR4_4_113fr13frlb90pamf.R.inc(51112);try{__CLR4_4_113fr13frlb90pamf.R.inc(51111);
        __CLR4_4_113fr13frlb90pamf.R.inc(51113);this.mean = mean;
        __CLR4_4_113fr13frlb90pamf.R.inc(51114);this.variance = variance;
        __CLR4_4_113fr13frlb90pamf.R.inc(51115);this.n = n;
        __CLR4_4_113fr13frlb90pamf.R.inc(51116);this.max = max;
        __CLR4_4_113fr13frlb90pamf.R.inc(51117);this.min = min;
        __CLR4_4_113fr13frlb90pamf.R.inc(51118);this.sum = sum;
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * @return Returns the max.
     */
    public double getMax() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51119);
        __CLR4_4_113fr13frlb90pamf.R.inc(51120);return max;
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * @return Returns the mean.
     */
    public double getMean() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51121);
        __CLR4_4_113fr13frlb90pamf.R.inc(51122);return mean;
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * @return Returns the min.
     */
    public double getMin() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51123);
        __CLR4_4_113fr13frlb90pamf.R.inc(51124);return min;
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * @return Returns the number of values.
     */
    public long getN() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51125);
        __CLR4_4_113fr13frlb90pamf.R.inc(51126);return n;
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * @return Returns the sum.
     */
    public double getSum() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51127);
        __CLR4_4_113fr13frlb90pamf.R.inc(51128);return sum;
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * @return Returns the standard deviation
     */
    public double getStandardDeviation() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51129);
        __CLR4_4_113fr13frlb90pamf.R.inc(51130);return FastMath.sqrt(variance);
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * @return Returns the variance.
     */
    public double getVariance() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51131);
        __CLR4_4_113fr13frlb90pamf.R.inc(51132);return variance;
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * Returns true iff <code>object</code> is a
     * <code>StatisticalSummaryValues</code> instance and all statistics have
     *  the same values as this.
     *
     * @param object the object to test equality against.
     * @return true if object equals this
     */
    @Override
    public boolean equals(Object object) {try{__CLR4_4_113fr13frlb90pamf.R.inc(51133);
        __CLR4_4_113fr13frlb90pamf.R.inc(51134);if ((((object == this )&&(__CLR4_4_113fr13frlb90pamf.R.iget(51135)!=0|true))||(__CLR4_4_113fr13frlb90pamf.R.iget(51136)==0&false))) {{
            __CLR4_4_113fr13frlb90pamf.R.inc(51137);return true;
        }
        }__CLR4_4_113fr13frlb90pamf.R.inc(51138);if ((((object instanceof StatisticalSummaryValues == false)&&(__CLR4_4_113fr13frlb90pamf.R.iget(51139)!=0|true))||(__CLR4_4_113fr13frlb90pamf.R.iget(51140)==0&false))) {{
            __CLR4_4_113fr13frlb90pamf.R.inc(51141);return false;
        }
        }__CLR4_4_113fr13frlb90pamf.R.inc(51142);StatisticalSummaryValues stat = (StatisticalSummaryValues) object;
        __CLR4_4_113fr13frlb90pamf.R.inc(51143);return Precision.equalsIncludingNaN(stat.getMax(),      getMax())  &&
               Precision.equalsIncludingNaN(stat.getMean(),     getMean()) &&
               Precision.equalsIncludingNaN(stat.getMin(),      getMin())  &&
               Precision.equalsIncludingNaN(stat.getN(),        getN())    &&
               Precision.equalsIncludingNaN(stat.getSum(),      getSum())  &&
               Precision.equalsIncludingNaN(stat.getVariance(), getVariance());
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * Returns hash code based on values of statistics
     *
     * @return hash code
     */
    @Override
    public int hashCode() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51144);
        __CLR4_4_113fr13frlb90pamf.R.inc(51145);int result = 31 + MathUtils.hash(getMax());
        __CLR4_4_113fr13frlb90pamf.R.inc(51146);result = result * 31 + MathUtils.hash(getMean());
        __CLR4_4_113fr13frlb90pamf.R.inc(51147);result = result * 31 + MathUtils.hash(getMin());
        __CLR4_4_113fr13frlb90pamf.R.inc(51148);result = result * 31 + MathUtils.hash(getN());
        __CLR4_4_113fr13frlb90pamf.R.inc(51149);result = result * 31 + MathUtils.hash(getSum());
        __CLR4_4_113fr13frlb90pamf.R.inc(51150);result = result * 31 + MathUtils.hash(getVariance());
        __CLR4_4_113fr13frlb90pamf.R.inc(51151);return result;
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

    /**
     * Generates a text report displaying values of statistics.
     * Each statistic is displayed on a separate line.
     *
     * @return String with line feeds displaying statistics
     */
    @Override
    public String toString() {try{__CLR4_4_113fr13frlb90pamf.R.inc(51152);
        __CLR4_4_113fr13frlb90pamf.R.inc(51153);StringBuffer outBuffer = new StringBuffer();
        __CLR4_4_113fr13frlb90pamf.R.inc(51154);String endl = "\n";
        __CLR4_4_113fr13frlb90pamf.R.inc(51155);outBuffer.append("StatisticalSummaryValues:").append(endl);
        __CLR4_4_113fr13frlb90pamf.R.inc(51156);outBuffer.append("n: ").append(getN()).append(endl);
        __CLR4_4_113fr13frlb90pamf.R.inc(51157);outBuffer.append("min: ").append(getMin()).append(endl);
        __CLR4_4_113fr13frlb90pamf.R.inc(51158);outBuffer.append("max: ").append(getMax()).append(endl);
        __CLR4_4_113fr13frlb90pamf.R.inc(51159);outBuffer.append("mean: ").append(getMean()).append(endl);
        __CLR4_4_113fr13frlb90pamf.R.inc(51160);outBuffer.append("std dev: ").append(getStandardDeviation())
            .append(endl);
        __CLR4_4_113fr13frlb90pamf.R.inc(51161);outBuffer.append("variance: ").append(getVariance()).append(endl);
        __CLR4_4_113fr13frlb90pamf.R.inc(51162);outBuffer.append("sum: ").append(getSum()).append(endl);
        __CLR4_4_113fr13frlb90pamf.R.inc(51163);return outBuffer.toString();
    }finally{__CLR4_4_113fr13frlb90pamf.R.flushNeeded();}}

}
