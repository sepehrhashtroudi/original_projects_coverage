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

import java.awt.geom.AffineTransform;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.Embedding;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/** This class represents an oriented line in the 2D plane.

 * <p>An oriented line can be defined either by prolongating a line
 * segment between two points past these points, or by one point and
 * an angular direction (in trigonometric orientation).</p>

 * <p>Since it is oriented the two half planes at its two sides are
 * unambiguously identified as a left half plane and a right half
 * plane. This can be used to identify the interior and the exterior
 * in a simple way by local properties only when part of a line is
 * used to define part of a polygon boundary.</p>

 * <p>A line can also be used to completely define a reference frame
 * in the plane. It is sufficient to select one specific point in the
 * line (the orthogonal projection of the original reference frame on
 * the line) and to use the unit vector in the line direction and the
 * orthogonal vector oriented from left half plane to right half
 * plane. We define two coordinates by the process, the
 * <em>abscissa</em> along the line, and the <em>offset</em> across
 * the line. All points of the plane are uniquely identified by these
 * two coordinates. The line is the set of points at zero offset, the
 * left half plane is the set of points with negative offsets and the
 * right half plane is the set of points with positive offsets.</p>

 * @version $Id$
 * @since 3.0
 */
public class Line implements Hyperplane<Euclidean2D>, Embedding<Euclidean2D, Euclidean1D> {public static class __CLR4_4_1e7ce7clb90p8cx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,18542,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Angle with respect to the abscissa axis. */
    private double angle;

    /** Cosine of the line angle. */
    private double cos;

    /** Sine of the line angle. */
    private double sin;

    /** Offset of the frame origin. */
    private double originOffset;

    /** Build a line from two points.
     * <p>The line is oriented from p1 to p2</p>
     * @param p1 first point
     * @param p2 second point
     */
    public Line(final Vector2D p1, final Vector2D p2) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18408);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18409);reset(p1, p2);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Build a line from a point and an angle.
     * @param p point belonging to the line
     * @param angle angle of the line with respect to abscissa axis
     */
    public Line(final Vector2D p, final double angle) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18410);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18411);reset(p, angle);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Build a line from its internal characteristics.
     * @param angle angle of the line with respect to abscissa axis
     * @param cos cosine of the angle
     * @param sin sine of the angle
     * @param originOffset offset of the origin
     */
    private Line(final double angle, final double cos, final double sin, final double originOffset) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18412);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18413);this.angle        = angle;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18414);this.cos          = cos;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18415);this.sin          = sin;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18416);this.originOffset = originOffset;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Copy constructor.
     * <p>The created instance is completely independent from the
     * original instance, it is a deep copy.</p>
     * @param line line to copy
     */
    public Line(final Line line) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18417);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18418);angle        = MathUtils.normalizeAngle(line.angle, FastMath.PI);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18419);cos          = FastMath.cos(angle);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18420);sin          = FastMath.sin(angle);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18421);originOffset = line.originOffset;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Line copySelf() {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18422);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18423);return new Line(this);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Reset the instance as if built from two points.
     * <p>The line is oriented from p1 to p2</p>
     * @param p1 first point
     * @param p2 second point
     */
    public void reset(final Vector2D p1, final Vector2D p2) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18424);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18425);final double dx = p2.getX() - p1.getX();
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18426);final double dy = p2.getY() - p1.getY();
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18427);final double d = FastMath.hypot(dx, dy);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18428);if ((((d == 0.0)&&(__CLR4_4_1e7ce7clb90p8cx.R.iget(18429)!=0|true))||(__CLR4_4_1e7ce7clb90p8cx.R.iget(18430)==0&false))) {{
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18431);angle        = 0.0;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18432);cos          = 1.0;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18433);sin          = 0.0;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18434);originOffset = p1.getY();
        } }else {{
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18435);angle        = FastMath.PI + FastMath.atan2(-dy, -dx);
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18436);cos          = FastMath.cos(angle);
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18437);sin          = FastMath.sin(angle);
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18438);originOffset = (p2.getX() * p1.getY() - p1.getX() * p2.getY()) / d;
        }
    }}finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Reset the instance as if built from a line and an angle.
     * @param p point belonging to the line
     * @param alpha angle of the line with respect to abscissa axis
     */
    public void reset(final Vector2D p, final double alpha) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18439);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18440);this.angle   = MathUtils.normalizeAngle(alpha, FastMath.PI);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18441);cos          = FastMath.cos(this.angle);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18442);sin          = FastMath.sin(this.angle);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18443);originOffset = cos * p.getY() - sin * p.getX();
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Revert the instance.
     */
    public void revertSelf() {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18444);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18445);if ((((angle < FastMath.PI)&&(__CLR4_4_1e7ce7clb90p8cx.R.iget(18446)!=0|true))||(__CLR4_4_1e7ce7clb90p8cx.R.iget(18447)==0&false))) {{
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18448);angle += FastMath.PI;
        } }else {{
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18449);angle -= FastMath.PI;
        }
        }__CLR4_4_1e7ce7clb90p8cx.R.inc(18450);cos          = -cos;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18451);sin          = -sin;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18452);originOffset = -originOffset;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Get the reverse of the instance.
     * <p>Get a line with reversed orientation with respect to the
     * instance. A new object is built, the instance is untouched.</p>
     * @return a new line, with orientation opposite to the instance orientation
     */
    public Line getReverse() {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18453);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18454);return new Line(((((angle < FastMath.PI) )&&(__CLR4_4_1e7ce7clb90p8cx.R.iget(18455)!=0|true))||(__CLR4_4_1e7ce7clb90p8cx.R.iget(18456)==0&false))? (angle + FastMath.PI) : (angle - FastMath.PI),
                        -cos, -sin, -originOffset);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector1D toSubSpace(final Vector<Euclidean2D> point) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18457);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18458);Vector2D p2 = (Vector2D) point;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18459);return new Vector1D(cos * p2.getX() + sin * p2.getY());
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector2D toSpace(final Vector<Euclidean1D> point) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18460);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18461);final double abscissa = ((Vector1D) point).getX();
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18462);return new Vector2D(abscissa * cos - originOffset * sin,
                            abscissa * sin + originOffset * cos);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Get the intersection point of the instance and another line.
     * @param other other line
     * @return intersection point of the instance and the other line
     * or null if there are no intersection points
     */
    public Vector2D intersection(final Line other) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18463);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18464);final double d = sin * other.cos - other.sin * cos;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18465);if ((((FastMath.abs(d) < 1.0e-10)&&(__CLR4_4_1e7ce7clb90p8cx.R.iget(18466)!=0|true))||(__CLR4_4_1e7ce7clb90p8cx.R.iget(18467)==0&false))) {{
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18468);return null;
        }
        }__CLR4_4_1e7ce7clb90p8cx.R.inc(18469);return new Vector2D((cos * other.originOffset - other.cos * originOffset) / d,
                            (sin * other.originOffset - other.sin * originOffset) / d);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public SubLine wholeHyperplane() {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18470);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18471);return new SubLine(this, new IntervalsSet());
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Build a region covering the whole space.
     * @return a region containing the instance (really a {@link
     * PolygonsSet PolygonsSet} instance)
     */
    public PolygonsSet wholeSpace() {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18472);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18473);return new PolygonsSet();
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Get the offset (oriented distance) of a parallel line.
     * <p>This method should be called only for parallel lines otherwise
     * the result is not meaningful.</p>
     * <p>The offset is 0 if both lines are the same, it is
     * positive if the line is on the right side of the instance and
     * negative if it is on the left side, according to its natural
     * orientation.</p>
     * @param line line to check
     * @return offset of the line
     */
    public double getOffset(final Line line) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18474);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18475);return originOffset +
               (((((cos * line.cos + sin * line.sin > 0) )&&(__CLR4_4_1e7ce7clb90p8cx.R.iget(18476)!=0|true))||(__CLR4_4_1e7ce7clb90p8cx.R.iget(18477)==0&false))? -line.originOffset : line.originOffset);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getOffset(final Vector<Euclidean2D> point) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18478);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18479);Vector2D p2 = (Vector2D) point;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18480);return sin * p2.getX() - cos * p2.getY() + originOffset;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean sameOrientationAs(final Hyperplane<Euclidean2D> other) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18481);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18482);final Line otherL = (Line) other;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18483);return (sin * otherL.sin + cos * otherL.cos) >= 0.0;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Get one point from the plane.
     * @param abscissa desired abscissa for the point
     * @param offset desired offset for the point
     * @return one point in the plane, with given abscissa and offset
     * relative to the line
     */
    public Vector2D getPointAt(final Vector1D abscissa, final double offset) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18484);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18485);final double x       = abscissa.getX();
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18486);final double dOffset = offset - originOffset;
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18487);return new Vector2D(x * cos + dOffset * sin, x * sin - dOffset * cos);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Check if the line contains a point.
     * @param p point to check
     * @return true if p belongs to the line
     */
    public boolean contains(final Vector2D p) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18488);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18489);return FastMath.abs(getOffset(p)) < 1.0e-10;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Compute the distance between the instance and a point.
     * <p>This is a shortcut for invoking FastMath.abs(getOffset(p)),
     * and provides consistency with what is in the
     * org.apache.commons.math3.geometry.euclidean.threed.Line class.</p>
     *
     * @param p to check
     * @return distance between the instance and the point
     * @since 3.1
     */
    public double distance(final Vector2D p) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18490);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18491);return FastMath.abs(getOffset(p));
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Check the instance is parallel to another line.
     * @param line other line to check
     * @return true if the instance is parallel to the other line
     * (they can have either the same or opposite orientations)
     */
    public boolean isParallelTo(final Line line) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18492);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18493);return FastMath.abs(sin * line.cos - cos * line.sin) < 1.0e-10;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Translate the line to force it passing by a point.
     * @param p point by which the line should pass
     */
    public void translateToPoint(final Vector2D p) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18494);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18495);originOffset = cos * p.getY() - sin * p.getX();
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Get the angle of the line.
     * @return the angle of the line with respect to the abscissa axis
     */
    public double getAngle() {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18496);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18497);return MathUtils.normalizeAngle(angle, FastMath.PI);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Set the angle of the line.
     * @param angle new angle of the line with respect to the abscissa axis
     */
    public void setAngle(final double angle) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18498);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18499);this.angle = MathUtils.normalizeAngle(angle, FastMath.PI);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18500);cos        = FastMath.cos(this.angle);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18501);sin        = FastMath.sin(this.angle);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Get the offset of the origin.
     * @return the offset of the origin
     */
    public double getOriginOffset() {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18502);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18503);return originOffset;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Set the offset of the origin.
     * @param offset offset of the origin
     */
    public void setOriginOffset(final double offset) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18504);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18505);originOffset = offset;
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Get a {@link org.apache.commons.math3.geometry.partitioning.Transform
     * Transform} embedding an affine transform.
     * @param transform affine transform to embed (must be inversible
     * otherwise the {@link
     * org.apache.commons.math3.geometry.partitioning.Transform#apply(Hyperplane)
     * apply(Hyperplane)} method would work only for some lines, and
     * fail for other ones)
     * @return a new transform that can be applied to either {@link
     * Vector2D Vector2D}, {@link Line Line} or {@link
     * org.apache.commons.math3.geometry.partitioning.SubHyperplane
     * SubHyperplane} instances
     * @exception MathIllegalArgumentException if the transform is non invertible
     */
    public static Transform<Euclidean2D, Euclidean1D> getTransform(final AffineTransform transform)
        throws MathIllegalArgumentException {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18506);
        __CLR4_4_1e7ce7clb90p8cx.R.inc(18507);return new LineTransform(transform);
    }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    /** Class embedding an affine transform.
     * <p>This class is used in order to apply an affine transform to a
     * line. Using a specific object allow to perform some computations
     * on the transform only once even if the same transform is to be
     * applied to a large number of lines (for example to a large
     * polygon)./<p>
     */
    private static class LineTransform implements Transform<Euclidean2D, Euclidean1D> {

        // CHECKSTYLE: stop JavadocVariable check
        private double cXX;
        private double cXY;
        private double cX1;
        private double cYX;
        private double cYY;
        private double cY1;

        private double c1Y;
        private double c1X;
        private double c11;
        // CHECKSTYLE: resume JavadocVariable check

        /** Build an affine line transform from a n {@code AffineTransform}.
         * @param transform transform to use (must be invertible otherwise
         * the {@link LineTransform#apply(Hyperplane)} method would work
         * only for some lines, and fail for other ones)
         * @exception MathIllegalArgumentException if the transform is non invertible
         */
        public LineTransform(final AffineTransform transform) throws MathIllegalArgumentException {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18508);

            __CLR4_4_1e7ce7clb90p8cx.R.inc(18509);final double[] m = new double[6];
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18510);transform.getMatrix(m);
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18511);cXX = m[0];
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18512);cXY = m[2];
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18513);cX1 = m[4];
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18514);cYX = m[1];
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18515);cYY = m[3];
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18516);cY1 = m[5];

            __CLR4_4_1e7ce7clb90p8cx.R.inc(18517);c1Y = cXY * cY1 - cYY * cX1;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18518);c1X = cXX * cY1 - cYX * cX1;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18519);c11 = cXX * cYY - cYX * cXY;

            __CLR4_4_1e7ce7clb90p8cx.R.inc(18520);if ((((FastMath.abs(c11) < 1.0e-20)&&(__CLR4_4_1e7ce7clb90p8cx.R.iget(18521)!=0|true))||(__CLR4_4_1e7ce7clb90p8cx.R.iget(18522)==0&false))) {{
                __CLR4_4_1e7ce7clb90p8cx.R.inc(18523);throw new MathIllegalArgumentException(LocalizedFormats.NON_INVERTIBLE_TRANSFORM);
            }

        }}finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Vector2D apply(final Vector<Euclidean2D> point) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18524);
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18525);final Vector2D p2D = (Vector2D) point;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18526);final double  x   = p2D.getX();
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18527);final double  y   = p2D.getY();
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18528);return new Vector2D(cXX * x + cXY * y + cX1,
                               cYX * x + cYY * y + cY1);
        }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Line apply(final Hyperplane<Euclidean2D> hyperplane) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18529);
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18530);final Line   line    = (Line) hyperplane;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18531);final double rOffset = c1X * line.cos + c1Y * line.sin + c11 * line.originOffset;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18532);final double rCos    = cXX * line.cos + cXY * line.sin;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18533);final double rSin    = cYX * line.cos + cYY * line.sin;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18534);final double inv     = 1.0 / FastMath.sqrt(rSin * rSin + rCos * rCos);
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18535);return new Line(FastMath.PI + FastMath.atan2(-rSin, -rCos),
                            inv * rCos, inv * rSin,
                            inv * rOffset);
        }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

        /** {@inheritDoc} */
        public SubHyperplane<Euclidean1D> apply(final SubHyperplane<Euclidean1D> sub,
                                                final Hyperplane<Euclidean2D> original,
                                                final Hyperplane<Euclidean2D> transformed) {try{__CLR4_4_1e7ce7clb90p8cx.R.inc(18536);
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18537);final OrientedPoint op     = (OrientedPoint) sub.getHyperplane();
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18538);final Line originalLine    = (Line) original;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18539);final Line transformedLine = (Line) transformed;
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18540);final Vector1D newLoc =
                transformedLine.toSubSpace(apply(originalLine.toSpace(op.getLocation())));
            __CLR4_4_1e7ce7clb90p8cx.R.inc(18541);return new OrientedPoint(newLoc, op.isDirect()).wholeHyperplane();
        }finally{__CLR4_4_1e7ce7clb90p8cx.R.flushNeeded();}}

    }

}
