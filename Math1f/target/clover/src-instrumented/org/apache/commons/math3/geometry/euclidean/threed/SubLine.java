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
package org.apache.commons.math3.geometry.euclidean.threed;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.Region.Location;

/** This class represents a subset of a {@link Line}.
 * @version $Id$
 * @since 3.0
 */
public class SubLine {public static class __CLR4_4_1dyjdyjlb90p8bo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,18126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Underlying line. */
    private final Line line;

    /** Remaining region of the hyperplane. */
    private final IntervalsSet remainingRegion;

    /** Simple constructor.
     * @param line underlying line
     * @param remainingRegion remaining region of the line
     */
    public SubLine(final Line line, final IntervalsSet remainingRegion) {try{__CLR4_4_1dyjdyjlb90p8bo.R.inc(18091);
        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18092);this.line            = line;
        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18093);this.remainingRegion = remainingRegion;
    }finally{__CLR4_4_1dyjdyjlb90p8bo.R.flushNeeded();}}

    /** Create a sub-line from two endpoints.
     * @param start start point
     * @param end end point
     * @exception MathIllegalArgumentException if the points are equal
     */
    public SubLine(final Vector3D start, final Vector3D end)
        throws MathIllegalArgumentException {
        this(new Line(start, end), buildIntervalSet(start, end));__CLR4_4_1dyjdyjlb90p8bo.R.inc(18095);try{__CLR4_4_1dyjdyjlb90p8bo.R.inc(18094);
    }finally{__CLR4_4_1dyjdyjlb90p8bo.R.flushNeeded();}}

    /** Create a sub-line from a segment.
     * @param segment single segment forming the sub-line
     * @exception MathIllegalArgumentException if the segment endpoints are equal
     */
    public SubLine(final Segment segment) throws MathIllegalArgumentException {
        this(segment.getLine(), buildIntervalSet(segment.getStart(), segment.getEnd()));__CLR4_4_1dyjdyjlb90p8bo.R.inc(18097);try{__CLR4_4_1dyjdyjlb90p8bo.R.inc(18096);
    }finally{__CLR4_4_1dyjdyjlb90p8bo.R.flushNeeded();}}

    /** Get the endpoints of the sub-line.
     * <p>
     * A subline may be any arbitrary number of disjoints segments, so the endpoints
     * are provided as a list of endpoint pairs. Each element of the list represents
     * one segment, and each segment contains a start point at index 0 and an end point
     * at index 1. If the sub-line is unbounded in the negative infinity direction,
     * the start point of the first segment will have infinite coordinates. If the
     * sub-line is unbounded in the positive infinity direction, the end point of the
     * last segment will have infinite coordinates. So a sub-line covering the whole
     * line will contain just one row and both elements of this row will have infinite
     * coordinates. If the sub-line is empty, the returned list will contain 0 segments.
     * </p>
     * @return list of segments endpoints
     */
    public List<Segment> getSegments() {try{__CLR4_4_1dyjdyjlb90p8bo.R.inc(18098);

        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18099);final List<Interval> list = remainingRegion.asList();
        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18100);final List<Segment> segments = new ArrayList<Segment>(list.size());

        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18101);for (final Interval interval : list) {{
            __CLR4_4_1dyjdyjlb90p8bo.R.inc(18102);final Vector3D start = line.toSpace(new Vector1D(interval.getInf()));
            __CLR4_4_1dyjdyjlb90p8bo.R.inc(18103);final Vector3D end   = line.toSpace(new Vector1D(interval.getSup()));
            __CLR4_4_1dyjdyjlb90p8bo.R.inc(18104);segments.add(new Segment(start, end, line));
        }

        }__CLR4_4_1dyjdyjlb90p8bo.R.inc(18105);return segments;

    }finally{__CLR4_4_1dyjdyjlb90p8bo.R.flushNeeded();}}

    /** Get the intersection of the instance and another sub-line.
     * <p>
     * This method is related to the {@link Line#intersection(Line)
     * intersection} method in the {@link Line Line} class, but in addition
     * to compute the point along infinite lines, it also checks the point
     * lies on both sub-line ranges.
     * </p>
     * @param subLine other sub-line which may intersect instance
     * @param includeEndPoints if true, endpoints are considered to belong to
     * instance (i.e. they are closed sets) and may be returned, otherwise endpoints
     * are considered to not belong to instance (i.e. they are open sets) and intersection
     * occurring on endpoints lead to null being returned
     * @return the intersection point if there is one, null if the sub-lines don't intersect
     */
    public Vector3D intersection(final SubLine subLine, final boolean includeEndPoints) {try{__CLR4_4_1dyjdyjlb90p8bo.R.inc(18106);

        // compute the intersection on infinite line
        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18107);Vector3D v1D = line.intersection(subLine.line);
        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18108);if ((((v1D == null)&&(__CLR4_4_1dyjdyjlb90p8bo.R.iget(18109)!=0|true))||(__CLR4_4_1dyjdyjlb90p8bo.R.iget(18110)==0&false))) {{
            __CLR4_4_1dyjdyjlb90p8bo.R.inc(18111);return null;
        }

        // check location of point with respect to first sub-line
        }__CLR4_4_1dyjdyjlb90p8bo.R.inc(18112);Location loc1 = remainingRegion.checkPoint(line.toSubSpace(v1D));

        // check location of point with respect to second sub-line
        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18113);Location loc2 = subLine.remainingRegion.checkPoint(subLine.line.toSubSpace(v1D));

        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18114);if ((((includeEndPoints)&&(__CLR4_4_1dyjdyjlb90p8bo.R.iget(18115)!=0|true))||(__CLR4_4_1dyjdyjlb90p8bo.R.iget(18116)==0&false))) {{
            __CLR4_4_1dyjdyjlb90p8bo.R.inc(18117);return (((((loc1 != Location.OUTSIDE) && (loc2 != Location.OUTSIDE)) )&&(__CLR4_4_1dyjdyjlb90p8bo.R.iget(18118)!=0|true))||(__CLR4_4_1dyjdyjlb90p8bo.R.iget(18119)==0&false))? v1D : null;
        } }else {{
            __CLR4_4_1dyjdyjlb90p8bo.R.inc(18120);return (((((loc1 == Location.INSIDE) && (loc2 == Location.INSIDE)) )&&(__CLR4_4_1dyjdyjlb90p8bo.R.iget(18121)!=0|true))||(__CLR4_4_1dyjdyjlb90p8bo.R.iget(18122)==0&false))? v1D : null;
        }

    }}finally{__CLR4_4_1dyjdyjlb90p8bo.R.flushNeeded();}}

    /** Build an interval set from two points.
     * @param start start point
     * @param end end point
     * @return an interval set
     * @exception MathIllegalArgumentException if the points are equal
     */
    private static IntervalsSet buildIntervalSet(final Vector3D start, final Vector3D end)
        throws MathIllegalArgumentException {try{__CLR4_4_1dyjdyjlb90p8bo.R.inc(18123);
        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18124);final Line line = new Line(start, end);
        __CLR4_4_1dyjdyjlb90p8bo.R.inc(18125);return new IntervalsSet(line.toSubSpace(start).getX(),
                                line.toSubSpace(end).getX());
    }finally{__CLR4_4_1dyjdyjlb90p8bo.R.flushNeeded();}}

}
