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
package org.apache.commons.math3.geometry.euclidean.twod;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.Region.Location;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.util.FastMath;

/** This class represents a sub-hyperplane for {@link Line}.
 * @version $Id$
 * @since 3.0
 */
public class SubLine extends AbstractSubHyperplane<Euclidean2D, Euclidean1D> {public static class __CLR4_4_1eo7eo7lb90p8ea{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,19093,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Simple constructor.
     * @param hyperplane underlying hyperplane
     * @param remainingRegion remaining region of the hyperplane
     */
    public SubLine(final Hyperplane<Euclidean2D> hyperplane,
                   final Region<Euclidean1D> remainingRegion) {
        super(hyperplane, remainingRegion);__CLR4_4_1eo7eo7lb90p8ea.R.inc(19016);try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19015);
    }finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

    /** Create a sub-line from two endpoints.
     * @param start start point
     * @param end end point
     */
    public SubLine(final Vector2D start, final Vector2D end) {
        super(new Line(start, end), buildIntervalSet(start, end));__CLR4_4_1eo7eo7lb90p8ea.R.inc(19018);try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19017);
    }finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

    /** Create a sub-line from a segment.
     * @param segment single segment forming the sub-line
     */
    public SubLine(final Segment segment) {
        super(segment.getLine(), buildIntervalSet(segment.getStart(), segment.getEnd()));__CLR4_4_1eo7eo7lb90p8ea.R.inc(19020);try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19019);
    }finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

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
    public List<Segment> getSegments() {try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19021);

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19022);final Line line = (Line) getHyperplane();
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19023);final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19024);final List<Segment> segments = new ArrayList<Segment>(list.size());

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19025);for (final Interval interval : list) {{
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19026);final Vector2D start = line.toSpace(new Vector1D(interval.getInf()));
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19027);final Vector2D end   = line.toSpace(new Vector1D(interval.getSup()));
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19028);segments.add(new Segment(start, end, line));
        }

        }__CLR4_4_1eo7eo7lb90p8ea.R.inc(19029);return segments;

    }finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

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
    public Vector2D intersection(final SubLine subLine, final boolean includeEndPoints) {try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19030);

        // retrieve the underlying lines
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19031);Line line1 = (Line) getHyperplane();
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19032);Line line2 = (Line) subLine.getHyperplane();

        // compute the intersection on infinite line
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19033);Vector2D v2D = line1.intersection(line2);
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19034);if ((((v2D == null)&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19035)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19036)==0&false))) {{
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19037);return null;
        }

        // check location of point with respect to first sub-line
        }__CLR4_4_1eo7eo7lb90p8ea.R.inc(19038);Location loc1 = getRemainingRegion().checkPoint(line1.toSubSpace(v2D));

        // check location of point with respect to second sub-line
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19039);Location loc2 = subLine.getRemainingRegion().checkPoint(line2.toSubSpace(v2D));

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19040);if ((((includeEndPoints)&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19041)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19042)==0&false))) {{
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19043);return (((((loc1 != Location.OUTSIDE) && (loc2 != Location.OUTSIDE)) )&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19044)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19045)==0&false))? v2D : null;
        } }else {{
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19046);return (((((loc1 == Location.INSIDE) && (loc2 == Location.INSIDE)) )&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19047)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19048)==0&false))? v2D : null;
        }

    }}finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

    /** Build an interval set from two points.
     * @param start start point
     * @param end end point
     * @return an interval set
     */
    private static IntervalsSet buildIntervalSet(final Vector2D start, final Vector2D end) {try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19049);
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19050);final Line line = new Line(start, end);
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19051);return new IntervalsSet(line.toSubSpace(start).getX(),
                                line.toSubSpace(end).getX());
    }finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected AbstractSubHyperplane<Euclidean2D, Euclidean1D> buildNew(final Hyperplane<Euclidean2D> hyperplane,
                                                                       final Region<Euclidean1D> remainingRegion) {try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19052);
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19053);return new SubLine(hyperplane, remainingRegion);
    }finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Side side(final Hyperplane<Euclidean2D> hyperplane) {try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19054);

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19055);final Line    thisLine  = (Line) getHyperplane();
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19056);final Line    otherLine = (Line) hyperplane;
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19057);final Vector2D crossing  = thisLine.intersection(otherLine);

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19058);if ((((crossing == null)&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19059)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19060)==0&false))) {{
            // the lines are parallel,
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19061);final double global = otherLine.getOffset(thisLine);
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19062);return ((((global < -1.0e-10) )&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19063)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19064)==0&false))? Side.MINUS : (((((global > 1.0e-10) )&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19065)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19066)==0&false))? Side.PLUS : Side.HYPER);
        }

        // the lines do intersect
        }__CLR4_4_1eo7eo7lb90p8ea.R.inc(19067);final boolean direct = FastMath.sin(thisLine.getAngle() - otherLine.getAngle()) < 0;
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19068);final Vector1D x = thisLine.toSubSpace(crossing);
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19069);return getRemainingRegion().side(new OrientedPoint(x, direct));

    }finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public SplitSubHyperplane<Euclidean2D> split(final Hyperplane<Euclidean2D> hyperplane) {try{__CLR4_4_1eo7eo7lb90p8ea.R.inc(19070);

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19071);final Line    thisLine  = (Line) getHyperplane();
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19072);final Line    otherLine = (Line) hyperplane;
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19073);final Vector2D crossing  = thisLine.intersection(otherLine);

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19074);if ((((crossing == null)&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19075)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19076)==0&false))) {{
            // the lines are parallel
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19077);final double global = otherLine.getOffset(thisLine);
            __CLR4_4_1eo7eo7lb90p8ea.R.inc(19078);return ((((global < -1.0e-10) )&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19079)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19080)==0&false))?
                   new SplitSubHyperplane<Euclidean2D>(null, this) :
                   new SplitSubHyperplane<Euclidean2D>(this, null);
        }

        // the lines do intersect
        }__CLR4_4_1eo7eo7lb90p8ea.R.inc(19081);final boolean direct = FastMath.sin(thisLine.getAngle() - otherLine.getAngle()) < 0;
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19082);final Vector1D x      = thisLine.toSubSpace(crossing);
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19083);final SubHyperplane<Euclidean1D> subPlus  = new OrientedPoint(x, !direct).wholeHyperplane();
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19084);final SubHyperplane<Euclidean1D> subMinus = new OrientedPoint(x,  direct).wholeHyperplane();

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19085);final BSPTree<Euclidean1D> splitTree = getRemainingRegion().getTree(false).split(subMinus);
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19086);final BSPTree<Euclidean1D> plusTree  = (((getRemainingRegion().isEmpty(splitTree.getPlus()) )&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19087)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19088)==0&false))?
                                               new BSPTree<Euclidean1D>(Boolean.FALSE) :
                                               new BSPTree<Euclidean1D>(subPlus, new BSPTree<Euclidean1D>(Boolean.FALSE),
                                                                        splitTree.getPlus(), null);
        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19089);final BSPTree<Euclidean1D> minusTree = (((getRemainingRegion().isEmpty(splitTree.getMinus()) )&&(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19090)!=0|true))||(__CLR4_4_1eo7eo7lb90p8ea.R.iget(19091)==0&false))?
                                               new BSPTree<Euclidean1D>(Boolean.FALSE) :
                                               new BSPTree<Euclidean1D>(subMinus, new BSPTree<Euclidean1D>(Boolean.FALSE),
                                                                        splitTree.getMinus(), null);

        __CLR4_4_1eo7eo7lb90p8ea.R.inc(19092);return new SplitSubHyperplane<Euclidean2D>(new SubLine(thisLine.copySelf(), new IntervalsSet(plusTree)),
                                                   new SubLine(thisLine.copySelf(), new IntervalsSet(minusTree)));

    }finally{__CLR4_4_1eo7eo7lb90p8ea.R.flushNeeded();}}

}
