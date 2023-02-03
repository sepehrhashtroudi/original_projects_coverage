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
package org.apache.commons.math3.optim;

import java.io.Serializable;
import org.apache.commons.math3.util.Pair;

/**
 * This class holds a point and the vectorial value of an objective function at
 * that point.
 *
 * @see PointValuePair
 * @see org.apache.commons.math3.analysis.MultivariateVectorFunction
 * @version $Id$
 * @since 3.0
 */
public class PointVectorValuePair extends Pair<double[], double[]> implements Serializable {public static class __CLR4_4_1rkxrkxlb90p9ld{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,35778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable UID. */
    private static final long serialVersionUID = 20120513L;

    /**
     * Builds a point/objective function value pair.
     *
     * @param point Point coordinates. This instance will store
     * a copy of the array, not the array passed as argument.
     * @param value Value of the objective function at the point.
     */
    public PointVectorValuePair(final double[] point,
                                final double[] value) {
        this(point, value, true);__CLR4_4_1rkxrkxlb90p9ld.R.inc(35746);try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35745);
    }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}

    /**
     * Build a point/objective function value pair.
     *
     * @param point Point coordinates.
     * @param value Value of the objective function at the point.
     * @param copyArray if {@code true}, the input arrays will be copied,
     * otherwise they will be referenced.
     */
    public PointVectorValuePair(final double[] point,
                                final double[] value,
                                final boolean copyArray) {
        super((((copyArray )&&(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35748)!=0|true))||(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35749)==0&false))?
              (((((point == null) )&&(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35750)!=0|true))||(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35751)==0&false))? null :
               point.clone()) :
              point,
              (((copyArray )&&(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35752)!=0|true))||(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35753)==0&false))?
              (((((value == null) )&&(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35754)!=0|true))||(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35755)==0&false))? null :
               value.clone()) :
              value);__CLR4_4_1rkxrkxlb90p9ld.R.inc(35756);try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35747);
    }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}

    /**
     * Gets the point.
     *
     * @return a copy of the stored point.
     */
    public double[] getPoint() {try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35757);
        __CLR4_4_1rkxrkxlb90p9ld.R.inc(35758);final double[] p = getKey();
        __CLR4_4_1rkxrkxlb90p9ld.R.inc(35759);return (((p == null )&&(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35760)!=0|true))||(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35761)==0&false))? null : p.clone();
    }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}

    /**
     * Gets a reference to the point.
     *
     * @return a reference to the internal array storing the point.
     */
    public double[] getPointRef() {try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35762);
        __CLR4_4_1rkxrkxlb90p9ld.R.inc(35763);return getKey();
    }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}

    /**
     * Gets the value of the objective function.
     *
     * @return a copy of the stored value of the objective function.
     */
    @Override
    public double[] getValue() {try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35764);
        __CLR4_4_1rkxrkxlb90p9ld.R.inc(35765);final double[] v = super.getValue();
        __CLR4_4_1rkxrkxlb90p9ld.R.inc(35766);return (((v == null )&&(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35767)!=0|true))||(__CLR4_4_1rkxrkxlb90p9ld.R.iget(35768)==0&false))? null : v.clone();
    }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}

    /**
     * Gets a reference to the value of the objective function.
     *
     * @return a reference to the internal array storing the value of
     * the objective function.
     */
    public double[] getValueRef() {try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35769);
        __CLR4_4_1rkxrkxlb90p9ld.R.inc(35770);return super.getValue();
    }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}

    /**
     * Replace the instance with a data transfer object for serialization.
     * @return data transfer object that will be serialized
     */
    private Object writeReplace() {try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35771);
        __CLR4_4_1rkxrkxlb90p9ld.R.inc(35772);return new DataTransferObject(getKey(), getValue());
    }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}

    /** Internal class used only for serialization. */
    private static class DataTransferObject implements Serializable {
        /** Serializable UID. */
        private static final long serialVersionUID = 20120513L;
        /**
         * Point coordinates.
         * @Serial
         */
        private final double[] point;
        /**
         * Value of the objective function at the point.
         * @Serial
         */
        private final double[] value;

        /** Simple constructor.
         * @param point Point coordinates.
         * @param value Value of the objective function at the point.
         */
        public DataTransferObject(final double[] point, final double[] value) {try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35773);
            __CLR4_4_1rkxrkxlb90p9ld.R.inc(35774);this.point = point.clone();
            __CLR4_4_1rkxrkxlb90p9ld.R.inc(35775);this.value = value.clone();
        }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}

        /** Replace the deserialized data transfer object with a {@link PointValuePair}.
         * @return replacement {@link PointValuePair}
         */
        private Object readResolve() {try{__CLR4_4_1rkxrkxlb90p9ld.R.inc(35776);
            __CLR4_4_1rkxrkxlb90p9ld.R.inc(35777);return new PointVectorValuePair(point, value, false);
        }finally{__CLR4_4_1rkxrkxlb90p9ld.R.flushNeeded();}}
    }
}
