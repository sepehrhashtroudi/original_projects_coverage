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
package org.apache.commons.math3.geometry.euclidean.oned;

import org.apache.commons.math3.geometry.partitioning.Region.Location;


/** This class represents a 1D interval.
 * @see IntervalsSet
 * @version $Id$
 * @since 3.0
 */
public class Interval {public static class __CLR4_4_1ca8ca8lb90p81o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15949,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The lower bound of the interval. */
    private final double lower;

    /** The upper bound of the interval. */
    private final double upper;

    /** Simple constructor.
     * @param lower lower bound of the interval
     * @param upper upper bound of the interval
     */
    public Interval(final double lower, final double upper) {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15920);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15921);this.lower = lower;
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15922);this.upper = upper;
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Get the lower bound of the interval.
     * @return lower bound of the interval
     * @since 3.1
     */
    public double getInf() {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15923);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15924);return lower;
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Get the lower bound of the interval.
     * @return lower bound of the interval
     * @deprecated as of 3.1, replaced by {@link #getInf()}
     */
    @Deprecated
    public double getLower() {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15925);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15926);return getInf();
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Get the upper bound of the interval.
     * @return upper bound of the interval
     * @since 3.1
     */
    public double getSup() {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15927);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15928);return upper;
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Get the upper bound of the interval.
     * @return upper bound of the interval
     * @deprecated as of 3.1, replaced by {@link #getSup()}
     */
    @Deprecated
    public double getUpper() {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15929);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15930);return getSup();
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Get the size of the interval.
     * @return size of the interval
     * @since 3.1
     */
    public double getSize() {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15931);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15932);return upper - lower;
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Get the length of the interval.
     * @return length of the interval
     * @deprecated as of 3.1, replaced by {@link #getSize()}
     */
    @Deprecated
    public double getLength() {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15933);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15934);return getSize();
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Get the barycenter of the interval.
     * @return barycenter of the interval
     * @since 3.1
     */
    public double getBarycenter() {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15935);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15936);return 0.5 * (lower + upper);
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Get the midpoint of the interval.
     * @return midpoint of the interval
     * @deprecated as of 3.1, replaced by {@link #getBarycenter()}
     */
    @Deprecated
    public double getMidPoint() {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15937);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15938);return getBarycenter();
    }finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

    /** Check a point with respect to the interval.
     * @param point point to check
     * @param tolerance tolerance below which points are considered to
     * belong to the boundary
     * @return a code representing the point status: either {@link
     * Location#INSIDE}, {@link Location#OUTSIDE} or {@link Location#BOUNDARY}
     * @since 3.1
     */
    public Location checkPoint(final double point, final double tolerance) {try{__CLR4_4_1ca8ca8lb90p81o.R.inc(15939);
        __CLR4_4_1ca8ca8lb90p81o.R.inc(15940);if ((((point < lower - tolerance || point > upper + tolerance)&&(__CLR4_4_1ca8ca8lb90p81o.R.iget(15941)!=0|true))||(__CLR4_4_1ca8ca8lb90p81o.R.iget(15942)==0&false))) {{
            __CLR4_4_1ca8ca8lb90p81o.R.inc(15943);return Location.OUTSIDE;
        } }else {__CLR4_4_1ca8ca8lb90p81o.R.inc(15944);if ((((point > lower + tolerance && point < upper - tolerance)&&(__CLR4_4_1ca8ca8lb90p81o.R.iget(15945)!=0|true))||(__CLR4_4_1ca8ca8lb90p81o.R.iget(15946)==0&false))) {{
            __CLR4_4_1ca8ca8lb90p81o.R.inc(15947);return Location.INSIDE;
        } }else {{
            __CLR4_4_1ca8ca8lb90p81o.R.inc(15948);return Location.BOUNDARY;
        }
    }}}finally{__CLR4_4_1ca8ca8lb90p81o.R.flushNeeded();}}

}
