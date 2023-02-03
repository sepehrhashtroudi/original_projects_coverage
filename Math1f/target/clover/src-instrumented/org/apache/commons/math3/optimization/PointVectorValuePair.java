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

package org.apache.commons.math3.optimization;

import java.io.Serializable;

import org.apache.commons.math3.util.Pair;

/**
 * This class holds a point and the vectorial value of an objective function at
 * that point.
 *
 * @see PointValuePair
 * @see org.apache.commons.math3.analysis.MultivariateVectorFunction
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@Deprecated
public class PointVectorValuePair extends Pair<double[], double[]> implements Serializable {public static class __CLR4_4_1vu5vu5lb90p9xa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,41294,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
        this(point, value, true);__CLR4_4_1vu5vu5lb90p9xa.R.inc(41262);try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41261);
    }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}

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
        super((((copyArray )&&(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41264)!=0|true))||(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41265)==0&false))?
              (((((point == null) )&&(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41266)!=0|true))||(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41267)==0&false))? null :
               point.clone()) :
              point,
              (((copyArray )&&(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41268)!=0|true))||(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41269)==0&false))?
              (((((value == null) )&&(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41270)!=0|true))||(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41271)==0&false))? null :
               value.clone()) :
              value);__CLR4_4_1vu5vu5lb90p9xa.R.inc(41272);try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41263);
    }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}

    /**
     * Gets the point.
     *
     * @return a copy of the stored point.
     */
    public double[] getPoint() {try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41273);
        __CLR4_4_1vu5vu5lb90p9xa.R.inc(41274);final double[] p = getKey();
        __CLR4_4_1vu5vu5lb90p9xa.R.inc(41275);return (((p == null )&&(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41276)!=0|true))||(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41277)==0&false))? null : p.clone();
    }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}

    /**
     * Gets a reference to the point.
     *
     * @return a reference to the internal array storing the point.
     */
    public double[] getPointRef() {try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41278);
        __CLR4_4_1vu5vu5lb90p9xa.R.inc(41279);return getKey();
    }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}

    /**
     * Gets the value of the objective function.
     *
     * @return a copy of the stored value of the objective function.
     */
    @Override
    public double[] getValue() {try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41280);
        __CLR4_4_1vu5vu5lb90p9xa.R.inc(41281);final double[] v = super.getValue();
        __CLR4_4_1vu5vu5lb90p9xa.R.inc(41282);return (((v == null )&&(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41283)!=0|true))||(__CLR4_4_1vu5vu5lb90p9xa.R.iget(41284)==0&false))? null : v.clone();
    }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}

    /**
     * Gets a reference to the value of the objective function.
     *
     * @return a reference to the internal array storing the value of
     * the objective function.
     */
    public double[] getValueRef() {try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41285);
        __CLR4_4_1vu5vu5lb90p9xa.R.inc(41286);return super.getValue();
    }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}

    /**
     * Replace the instance with a data transfer object for serialization.
     * @return data transfer object that will be serialized
     */
    private Object writeReplace() {try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41287);
        __CLR4_4_1vu5vu5lb90p9xa.R.inc(41288);return new DataTransferObject(getKey(), getValue());
    }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}

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
        public DataTransferObject(final double[] point, final double[] value) {try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41289);
            __CLR4_4_1vu5vu5lb90p9xa.R.inc(41290);this.point = point.clone();
            __CLR4_4_1vu5vu5lb90p9xa.R.inc(41291);this.value = value.clone();
        }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}

        /** Replace the deserialized data transfer object with a {@link PointValuePair}.
         * @return replacement {@link PointValuePair}
         */
        private Object readResolve() {try{__CLR4_4_1vu5vu5lb90p9xa.R.inc(41292);
            __CLR4_4_1vu5vu5lb90p9xa.R.inc(41293);return new PointVectorValuePair(point, value, false);
        }finally{__CLR4_4_1vu5vu5lb90p9xa.R.flushNeeded();}}
    }
}
