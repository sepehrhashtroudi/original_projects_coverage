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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.Embedding;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/** The class represent lines in a three dimensional space.

 * <p>Each oriented line is intrinsically associated with an abscissa
 * which is a coordinate on the line. The point at abscissa 0 is the
 * orthogonal projection of the origin on the line, another equivalent
 * way to express this is to say that it is the point of the line
 * which is closest to the origin. Abscissa increases in the line
 * direction.</p>

 * @version $Id$
 * @since 3.0
 */
public class Line implements Embedding<Euclidean3D, Euclidean1D> {public static class __CLR4_4_1d5kd5klb90p88f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,17114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Line direction. */
    private Vector3D direction;

    /** Line point closest to the origin. */
    private Vector3D zero;

    /** Build a line from two points.
     * @param p1 first point belonging to the line (this can be any point)
     * @param p2 second point belonging to the line (this can be any point, different from p1)
     * @exception MathIllegalArgumentException if the points are equal
     */
    public Line(final Vector3D p1, final Vector3D p2) throws MathIllegalArgumentException {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17048);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17049);reset(p1, p2);
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Copy constructor.
     * <p>The created instance is completely independent from the
     * original instance, it is a deep copy.</p>
     * @param line line to copy
     */
    public Line(final Line line) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17050);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17051);this.direction = line.direction;
        __CLR4_4_1d5kd5klb90p88f.R.inc(17052);this.zero      = line.zero;
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Reset the instance as if built from two points.
     * @param p1 first point belonging to the line (this can be any point)
     * @param p2 second point belonging to the line (this can be any point, different from p1)
     * @exception MathIllegalArgumentException if the points are equal
     */
    public void reset(final Vector3D p1, final Vector3D p2) throws MathIllegalArgumentException {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17053);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17054);final Vector3D delta = p2.subtract(p1);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17055);final double norm2 = delta.getNormSq();
        __CLR4_4_1d5kd5klb90p88f.R.inc(17056);if ((((norm2 == 0.0)&&(__CLR4_4_1d5kd5klb90p88f.R.iget(17057)!=0|true))||(__CLR4_4_1d5kd5klb90p88f.R.iget(17058)==0&false))) {{
            __CLR4_4_1d5kd5klb90p88f.R.inc(17059);throw new MathIllegalArgumentException(LocalizedFormats.ZERO_NORM);
        }
        }__CLR4_4_1d5kd5klb90p88f.R.inc(17060);this.direction = new Vector3D(1.0 / FastMath.sqrt(norm2), delta);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17061);zero = new Vector3D(1.0, p1, -p1.dotProduct(delta) / norm2, delta);
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Get a line with reversed direction.
     * @return a new instance, with reversed direction
     */
    public Line revert() {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17062);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17063);final Line reverted = new Line(this);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17064);reverted.direction = reverted.direction.negate();
        __CLR4_4_1d5kd5klb90p88f.R.inc(17065);return reverted;
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Get the normalized direction vector.
     * @return normalized direction vector
     */
    public Vector3D getDirection() {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17066);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17067);return direction;
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Get the line point closest to the origin.
     * @return line point closest to the origin
     */
    public Vector3D getOrigin() {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17068);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17069);return zero;
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Get the abscissa of a point with respect to the line.
     * <p>The abscissa is 0 if the projection of the point and the
     * projection of the frame origin on the line are the same
     * point.</p>
     * @param point point to check
     * @return abscissa of the point
     */
    public double getAbscissa(final Vector3D point) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17070);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17071);return point.subtract(zero).dotProduct(direction);
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Get one point from the line.
     * @param abscissa desired abscissa for the point
     * @return one point belonging to the line, at specified abscissa
     */
    public Vector3D pointAt(final double abscissa) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17072);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17073);return new Vector3D(1.0, zero, abscissa, direction);
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** {@inheritDoc}
     * @see #getAbscissa(Vector3D)
     */
    public Vector1D toSubSpace(final Vector<Euclidean3D> point) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17074);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17075);return new Vector1D(getAbscissa((Vector3D) point));
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** {@inheritDoc}
     * @see #pointAt(double)
     */
    public Vector3D toSpace(final Vector<Euclidean1D> point) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17076);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17077);return pointAt(((Vector1D) point).getX());
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Check if the instance is similar to another line.
     * <p>Lines are considered similar if they contain the same
     * points. This does not mean they are equal since they can have
     * opposite directions.</p>
     * @param line line to which instance should be compared
     * @return true if the lines are similar
     */
    public boolean isSimilarTo(final Line line) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17078);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17079);final double angle = Vector3D.angle(direction, line.direction);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17080);return ((angle < 1.0e-10) || (angle > (FastMath.PI - 1.0e-10))) && contains(line.zero);
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Check if the instance contains a point.
     * @param p point to check
     * @return true if p belongs to the line
     */
    public boolean contains(final Vector3D p) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17081);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17082);return distance(p) < 1.0e-10;
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Compute the distance between the instance and a point.
     * @param p to check
     * @return distance between the instance and the point
     */
    public double distance(final Vector3D p) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17083);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17084);final Vector3D d = p.subtract(zero);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17085);final Vector3D n = new Vector3D(1.0, d, -d.dotProduct(direction), direction);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17086);return n.getNorm();
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Compute the shortest distance between the instance and another line.
     * @param line line to check against the instance
     * @return shortest distance between the instance and the line
     */
    public double distance(final Line line) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17087);

        __CLR4_4_1d5kd5klb90p88f.R.inc(17088);final Vector3D normal = Vector3D.crossProduct(direction, line.direction);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17089);final double n = normal.getNorm();
        __CLR4_4_1d5kd5klb90p88f.R.inc(17090);if ((((n < Precision.SAFE_MIN)&&(__CLR4_4_1d5kd5klb90p88f.R.iget(17091)!=0|true))||(__CLR4_4_1d5kd5klb90p88f.R.iget(17092)==0&false))) {{
            // lines are parallel
            __CLR4_4_1d5kd5klb90p88f.R.inc(17093);return distance(line.zero);
        }

        // signed separation of the two parallel planes that contains the lines
        }__CLR4_4_1d5kd5klb90p88f.R.inc(17094);final double offset = line.zero.subtract(zero).dotProduct(normal) / n;

        __CLR4_4_1d5kd5klb90p88f.R.inc(17095);return FastMath.abs(offset);

    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Compute the point of the instance closest to another line.
     * @param line line to check against the instance
     * @return point of the instance closest to another line
     */
    public Vector3D closestPoint(final Line line) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17096);

        __CLR4_4_1d5kd5klb90p88f.R.inc(17097);final double cos = direction.dotProduct(line.direction);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17098);final double n = 1 - cos * cos;
        __CLR4_4_1d5kd5klb90p88f.R.inc(17099);if ((((n < Precision.EPSILON)&&(__CLR4_4_1d5kd5klb90p88f.R.iget(17100)!=0|true))||(__CLR4_4_1d5kd5klb90p88f.R.iget(17101)==0&false))) {{
            // the lines are parallel
            __CLR4_4_1d5kd5klb90p88f.R.inc(17102);return zero;
        }

        }__CLR4_4_1d5kd5klb90p88f.R.inc(17103);final Vector3D delta0 = line.zero.subtract(zero);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17104);final double a        = delta0.dotProduct(direction);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17105);final double b        = delta0.dotProduct(line.direction);

        __CLR4_4_1d5kd5klb90p88f.R.inc(17106);return new Vector3D(1, zero, (a - b * cos) / n, direction);

    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Get the intersection point of the instance and another line.
     * @param line other line
     * @return intersection point of the instance and the other line
     * or null if there are no intersection points
     */
    public Vector3D intersection(final Line line) {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17107);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17108);final Vector3D closest = closestPoint(line);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17109);return (((line.contains(closest) )&&(__CLR4_4_1d5kd5klb90p88f.R.iget(17110)!=0|true))||(__CLR4_4_1d5kd5klb90p88f.R.iget(17111)==0&false))? closest : null;
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

    /** Build a sub-line covering the whole line.
     * @return a sub-line covering the whole line
     */
    public SubLine wholeLine() {try{__CLR4_4_1d5kd5klb90p88f.R.inc(17112);
        __CLR4_4_1d5kd5klb90p88f.R.inc(17113);return new SubLine(this, new IntervalsSet());
    }finally{__CLR4_4_1d5kd5klb90p88f.R.flushNeeded();}}

}
