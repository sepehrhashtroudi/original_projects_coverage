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

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.Embedding;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.util.FastMath;

/** The class represent planes in a three dimensional space.
 * @version $Id$
 * @since 3.0
 */
public class Plane implements Hyperplane<Euclidean3D>, Embedding<Euclidean3D, Euclidean2D> {public static class __CLR4_4_1dazdazlb90p89a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,17372,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Offset of the origin with respect to the plane. */
    private double originOffset;

    /** Origin of the plane frame. */
    private Vector3D origin;

    /** First vector of the plane frame (in plane). */
    private Vector3D u;

    /** Second vector of the plane frame (in plane). */
    private Vector3D v;

    /** Third vector of the plane frame (plane normal). */
    private Vector3D w;

    /** Build a plane normal to a given direction and containing the origin.
     * @param normal normal direction to the plane
     * @exception MathArithmeticException if the normal norm is too small
     */
    public Plane(final Vector3D normal) throws MathArithmeticException {try{__CLR4_4_1dazdazlb90p89a.R.inc(17243);
        __CLR4_4_1dazdazlb90p89a.R.inc(17244);setNormal(normal);
        __CLR4_4_1dazdazlb90p89a.R.inc(17245);originOffset = 0;
        __CLR4_4_1dazdazlb90p89a.R.inc(17246);setFrame();
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Build a plane from a point and a normal.
     * @param p point belonging to the plane
     * @param normal normal direction to the plane
     * @exception MathArithmeticException if the normal norm is too small
     */
    public Plane(final Vector3D p, final Vector3D normal) throws MathArithmeticException {try{__CLR4_4_1dazdazlb90p89a.R.inc(17247);
        __CLR4_4_1dazdazlb90p89a.R.inc(17248);setNormal(normal);
        __CLR4_4_1dazdazlb90p89a.R.inc(17249);originOffset = -p.dotProduct(w);
        __CLR4_4_1dazdazlb90p89a.R.inc(17250);setFrame();
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Build a plane from three points.
     * <p>The plane is oriented in the direction of
     * {@code (p2-p1) ^ (p3-p1)}</p>
     * @param p1 first point belonging to the plane
     * @param p2 second point belonging to the plane
     * @param p3 third point belonging to the plane
     * @exception MathArithmeticException if the points do not constitute a plane
     */
    public Plane(final Vector3D p1, final Vector3D p2, final Vector3D p3)
        throws MathArithmeticException {
        this(p1, p2.subtract(p1).crossProduct(p3.subtract(p1)));__CLR4_4_1dazdazlb90p89a.R.inc(17252);try{__CLR4_4_1dazdazlb90p89a.R.inc(17251);
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Copy constructor.
     * <p>The instance created is completely independant of the original
     * one. A deep copy is used, none of the underlying object are
     * shared.</p>
     * @param plane plane to copy
     */
    public Plane(final Plane plane) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17253);
        __CLR4_4_1dazdazlb90p89a.R.inc(17254);originOffset = plane.originOffset;
        __CLR4_4_1dazdazlb90p89a.R.inc(17255);origin = plane.origin;
        __CLR4_4_1dazdazlb90p89a.R.inc(17256);u      = plane.u;
        __CLR4_4_1dazdazlb90p89a.R.inc(17257);v      = plane.v;
        __CLR4_4_1dazdazlb90p89a.R.inc(17258);w      = plane.w;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Copy the instance.
     * <p>The instance created is completely independant of the original
     * one. A deep copy is used, none of the underlying objects are
     * shared (except for immutable objects).</p>
     * @return a new hyperplane, copy of the instance
     */
    public Plane copySelf() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17259);
        __CLR4_4_1dazdazlb90p89a.R.inc(17260);return new Plane(this);
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Reset the instance as if built from a point and a normal.
     * @param p point belonging to the plane
     * @param normal normal direction to the plane
     * @exception MathArithmeticException if the normal norm is too small
     */
    public void reset(final Vector3D p, final Vector3D normal) throws MathArithmeticException {try{__CLR4_4_1dazdazlb90p89a.R.inc(17261);
        __CLR4_4_1dazdazlb90p89a.R.inc(17262);setNormal(normal);
        __CLR4_4_1dazdazlb90p89a.R.inc(17263);originOffset = -p.dotProduct(w);
        __CLR4_4_1dazdazlb90p89a.R.inc(17264);setFrame();
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Reset the instance from another one.
     * <p>The updated instance is completely independant of the original
     * one. A deep reset is used none of the underlying object is
     * shared.</p>
     * @param original plane to reset from
     */
    public void reset(final Plane original) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17265);
        __CLR4_4_1dazdazlb90p89a.R.inc(17266);originOffset = original.originOffset;
        __CLR4_4_1dazdazlb90p89a.R.inc(17267);origin       = original.origin;
        __CLR4_4_1dazdazlb90p89a.R.inc(17268);u            = original.u;
        __CLR4_4_1dazdazlb90p89a.R.inc(17269);v            = original.v;
        __CLR4_4_1dazdazlb90p89a.R.inc(17270);w            = original.w;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Set the normal vactor.
     * @param normal normal direction to the plane (will be copied)
     * @exception MathArithmeticException if the normal norm is too small
     */
    private void setNormal(final Vector3D normal) throws MathArithmeticException {try{__CLR4_4_1dazdazlb90p89a.R.inc(17271);
        __CLR4_4_1dazdazlb90p89a.R.inc(17272);final double norm = normal.getNorm();
        __CLR4_4_1dazdazlb90p89a.R.inc(17273);if ((((norm < 1.0e-10)&&(__CLR4_4_1dazdazlb90p89a.R.iget(17274)!=0|true))||(__CLR4_4_1dazdazlb90p89a.R.iget(17275)==0&false))) {{
            __CLR4_4_1dazdazlb90p89a.R.inc(17276);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }
        }__CLR4_4_1dazdazlb90p89a.R.inc(17277);w = new Vector3D(1.0 / norm, normal);
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Reset the plane frame.
     */
    private void setFrame() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17278);
        __CLR4_4_1dazdazlb90p89a.R.inc(17279);origin = new Vector3D(-originOffset, w);
        __CLR4_4_1dazdazlb90p89a.R.inc(17280);u = w.orthogonal();
        __CLR4_4_1dazdazlb90p89a.R.inc(17281);v = Vector3D.crossProduct(w, u);
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get the origin point of the plane frame.
     * <p>The point returned is the orthogonal projection of the
     * 3D-space origin in the plane.</p>
     * @return the origin point of the plane frame (point closest to the
     * 3D-space origin)
     */
    public Vector3D getOrigin() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17282);
        __CLR4_4_1dazdazlb90p89a.R.inc(17283);return origin;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get the normalized normal vector.
     * <p>The frame defined by ({@link #getU getU}, {@link #getV getV},
     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized
     * frame).</p>
     * @return normalized normal vector
     * @see #getU
     * @see #getV
     */
    public Vector3D getNormal() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17284);
        __CLR4_4_1dazdazlb90p89a.R.inc(17285);return w;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get the plane first canonical vector.
     * <p>The frame defined by ({@link #getU getU}, {@link #getV getV},
     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized
     * frame).</p>
     * @return normalized first canonical vector
     * @see #getV
     * @see #getNormal
     */
    public Vector3D getU() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17286);
        __CLR4_4_1dazdazlb90p89a.R.inc(17287);return u;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get the plane second canonical vector.
     * <p>The frame defined by ({@link #getU getU}, {@link #getV getV},
     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized
     * frame).</p>
     * @return normalized second canonical vector
     * @see #getU
     * @see #getNormal
     */
    public Vector3D getV() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17288);
        __CLR4_4_1dazdazlb90p89a.R.inc(17289);return v;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Revert the plane.
     * <p>Replace the instance by a similar plane with opposite orientation.</p>
     * <p>The new plane frame is chosen in such a way that a 3D point that had
     * {@code (x, y)} in-plane coordinates and {@code z} offset with
     * respect to the plane and is unaffected by the change will have
     * {@code (y, x)} in-plane coordinates and {@code -z} offset with
     * respect to the new plane. This means that the {@code u} and {@code v}
     * vectors returned by the {@link #getU} and {@link #getV} methods are exchanged,
     * and the {@code w} vector returned by the {@link #getNormal} method is
     * reversed.</p>
     */
    public void revertSelf() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17290);
        __CLR4_4_1dazdazlb90p89a.R.inc(17291);final Vector3D tmp = u;
        __CLR4_4_1dazdazlb90p89a.R.inc(17292);u = v;
        __CLR4_4_1dazdazlb90p89a.R.inc(17293);v = tmp;
        __CLR4_4_1dazdazlb90p89a.R.inc(17294);w = w.negate();
        __CLR4_4_1dazdazlb90p89a.R.inc(17295);originOffset = -originOffset;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Transform a 3D space point into an in-plane point.
     * @param point point of the space (must be a {@link Vector3D
     * Vector3D} instance)
     * @return in-plane point (really a {@link
     * org.apache.commons.math3.geometry.euclidean.twod.Vector2D Vector2D} instance)
     * @see #toSpace
     */
    public Vector2D toSubSpace(final Vector<Euclidean3D> point) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17296);
        __CLR4_4_1dazdazlb90p89a.R.inc(17297);return new Vector2D(point.dotProduct(u), point.dotProduct(v));
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Transform an in-plane point into a 3D space point.
     * @param point in-plane point (must be a {@link
     * org.apache.commons.math3.geometry.euclidean.twod.Vector2D Vector2D} instance)
     * @return 3D space point (really a {@link Vector3D Vector3D} instance)
     * @see #toSubSpace
     */
    public Vector3D toSpace(final Vector<Euclidean2D> point) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17298);
        __CLR4_4_1dazdazlb90p89a.R.inc(17299);final Vector2D p2D = (Vector2D) point;
        __CLR4_4_1dazdazlb90p89a.R.inc(17300);return new Vector3D(p2D.getX(), u, p2D.getY(), v, -originOffset, w);
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get one point from the 3D-space.
     * @param inPlane desired in-plane coordinates for the point in the
     * plane
     * @param offset desired offset for the point
     * @return one point in the 3D-space, with given coordinates and offset
     * relative to the plane
     */
    public Vector3D getPointAt(final Vector2D inPlane, final double offset) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17301);
        __CLR4_4_1dazdazlb90p89a.R.inc(17302);return new Vector3D(inPlane.getX(), u, inPlane.getY(), v, offset - originOffset, w);
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Check if the instance is similar to another plane.
     * <p>Planes are considered similar if they contain the same
     * points. This does not mean they are equal since they can have
     * opposite normals.</p>
     * @param plane plane to which the instance is compared
     * @return true if the planes are similar
     */
    public boolean isSimilarTo(final Plane plane) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17303);
        __CLR4_4_1dazdazlb90p89a.R.inc(17304);final double angle = Vector3D.angle(w, plane.w);
        __CLR4_4_1dazdazlb90p89a.R.inc(17305);return ((angle < 1.0e-10) && (FastMath.abs(originOffset - plane.originOffset) < 1.0e-10)) ||
               ((angle > (FastMath.PI - 1.0e-10)) && (FastMath.abs(originOffset + plane.originOffset) < 1.0e-10));
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Rotate the plane around the specified point.
     * <p>The instance is not modified, a new instance is created.</p>
     * @param center rotation center
     * @param rotation vectorial rotation operator
     * @return a new plane
     */
    public Plane rotate(final Vector3D center, final Rotation rotation) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17306);

        __CLR4_4_1dazdazlb90p89a.R.inc(17307);final Vector3D delta = origin.subtract(center);
        __CLR4_4_1dazdazlb90p89a.R.inc(17308);final Plane plane = new Plane(center.add(rotation.applyTo(delta)),
                                      rotation.applyTo(w));

        // make sure the frame is transformed as desired
        __CLR4_4_1dazdazlb90p89a.R.inc(17309);plane.u = rotation.applyTo(u);
        __CLR4_4_1dazdazlb90p89a.R.inc(17310);plane.v = rotation.applyTo(v);

        __CLR4_4_1dazdazlb90p89a.R.inc(17311);return plane;

    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Translate the plane by the specified amount.
     * <p>The instance is not modified, a new instance is created.</p>
     * @param translation translation to apply
     * @return a new plane
     */
    public Plane translate(final Vector3D translation) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17312);

        __CLR4_4_1dazdazlb90p89a.R.inc(17313);final Plane plane = new Plane(origin.add(translation), w);

        // make sure the frame is transformed as desired
        __CLR4_4_1dazdazlb90p89a.R.inc(17314);plane.u = u;
        __CLR4_4_1dazdazlb90p89a.R.inc(17315);plane.v = v;

        __CLR4_4_1dazdazlb90p89a.R.inc(17316);return plane;

    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get the intersection of a line with the instance.
     * @param line line intersecting the instance
     * @return intersection point between between the line and the
     * instance (null if the line is parallel to the instance)
     */
    public Vector3D intersection(final Line line) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17317);
        __CLR4_4_1dazdazlb90p89a.R.inc(17318);final Vector3D direction = line.getDirection();
        __CLR4_4_1dazdazlb90p89a.R.inc(17319);final double   dot       = w.dotProduct(direction);
        __CLR4_4_1dazdazlb90p89a.R.inc(17320);if ((((FastMath.abs(dot) < 1.0e-10)&&(__CLR4_4_1dazdazlb90p89a.R.iget(17321)!=0|true))||(__CLR4_4_1dazdazlb90p89a.R.iget(17322)==0&false))) {{
            __CLR4_4_1dazdazlb90p89a.R.inc(17323);return null;
        }
        }__CLR4_4_1dazdazlb90p89a.R.inc(17324);final Vector3D point = line.toSpace(Vector1D.ZERO);
        __CLR4_4_1dazdazlb90p89a.R.inc(17325);final double   k     = -(originOffset + w.dotProduct(point)) / dot;
        __CLR4_4_1dazdazlb90p89a.R.inc(17326);return new Vector3D(1.0, point, k, direction);
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Build the line shared by the instance and another plane.
     * @param other other plane
     * @return line at the intersection of the instance and the
     * other plane (really a {@link Line Line} instance)
     */
    public Line intersection(final Plane other) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17327);
        __CLR4_4_1dazdazlb90p89a.R.inc(17328);final Vector3D direction = Vector3D.crossProduct(w, other.w);
        __CLR4_4_1dazdazlb90p89a.R.inc(17329);if ((((direction.getNorm() < 1.0e-10)&&(__CLR4_4_1dazdazlb90p89a.R.iget(17330)!=0|true))||(__CLR4_4_1dazdazlb90p89a.R.iget(17331)==0&false))) {{
            __CLR4_4_1dazdazlb90p89a.R.inc(17332);return null;
        }
        }__CLR4_4_1dazdazlb90p89a.R.inc(17333);final Vector3D point = intersection(this, other, new Plane(direction));
        __CLR4_4_1dazdazlb90p89a.R.inc(17334);return new Line(point, point.add(direction));
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get the intersection point of three planes.
     * @param plane1 first plane1
     * @param plane2 second plane2
     * @param plane3 third plane2
     * @return intersection point of three planes, null if some planes are parallel
     */
    public static Vector3D intersection(final Plane plane1, final Plane plane2, final Plane plane3) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17335);

        // coefficients of the three planes linear equations
        __CLR4_4_1dazdazlb90p89a.R.inc(17336);final double a1 = plane1.w.getX();
        __CLR4_4_1dazdazlb90p89a.R.inc(17337);final double b1 = plane1.w.getY();
        __CLR4_4_1dazdazlb90p89a.R.inc(17338);final double c1 = plane1.w.getZ();
        __CLR4_4_1dazdazlb90p89a.R.inc(17339);final double d1 = plane1.originOffset;

        __CLR4_4_1dazdazlb90p89a.R.inc(17340);final double a2 = plane2.w.getX();
        __CLR4_4_1dazdazlb90p89a.R.inc(17341);final double b2 = plane2.w.getY();
        __CLR4_4_1dazdazlb90p89a.R.inc(17342);final double c2 = plane2.w.getZ();
        __CLR4_4_1dazdazlb90p89a.R.inc(17343);final double d2 = plane2.originOffset;

        __CLR4_4_1dazdazlb90p89a.R.inc(17344);final double a3 = plane3.w.getX();
        __CLR4_4_1dazdazlb90p89a.R.inc(17345);final double b3 = plane3.w.getY();
        __CLR4_4_1dazdazlb90p89a.R.inc(17346);final double c3 = plane3.w.getZ();
        __CLR4_4_1dazdazlb90p89a.R.inc(17347);final double d3 = plane3.originOffset;

        // direct Cramer resolution of the linear system
        // (this is still feasible for a 3x3 system)
        __CLR4_4_1dazdazlb90p89a.R.inc(17348);final double a23         = b2 * c3 - b3 * c2;
        __CLR4_4_1dazdazlb90p89a.R.inc(17349);final double b23         = c2 * a3 - c3 * a2;
        __CLR4_4_1dazdazlb90p89a.R.inc(17350);final double c23         = a2 * b3 - a3 * b2;
        __CLR4_4_1dazdazlb90p89a.R.inc(17351);final double determinant = a1 * a23 + b1 * b23 + c1 * c23;
        __CLR4_4_1dazdazlb90p89a.R.inc(17352);if ((((FastMath.abs(determinant) < 1.0e-10)&&(__CLR4_4_1dazdazlb90p89a.R.iget(17353)!=0|true))||(__CLR4_4_1dazdazlb90p89a.R.iget(17354)==0&false))) {{
            __CLR4_4_1dazdazlb90p89a.R.inc(17355);return null;
        }

        }__CLR4_4_1dazdazlb90p89a.R.inc(17356);final double r = 1.0 / determinant;
        __CLR4_4_1dazdazlb90p89a.R.inc(17357);return new Vector3D(
                            (-a23 * d1 - (c1 * b3 - c3 * b1) * d2 - (c2 * b1 - c1 * b2) * d3) * r,
                            (-b23 * d1 - (c3 * a1 - c1 * a3) * d2 - (c1 * a2 - c2 * a1) * d3) * r,
                            (-c23 * d1 - (b1 * a3 - b3 * a1) * d2 - (b2 * a1 - b1 * a2) * d3) * r);

    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Build a region covering the whole hyperplane.
     * @return a region covering the whole hyperplane
     */
    public SubPlane wholeHyperplane() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17358);
        __CLR4_4_1dazdazlb90p89a.R.inc(17359);return new SubPlane(this, new PolygonsSet());
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Build a region covering the whole space.
     * @return a region containing the instance (really a {@link
     * PolyhedronsSet PolyhedronsSet} instance)
     */
    public PolyhedronsSet wholeSpace() {try{__CLR4_4_1dazdazlb90p89a.R.inc(17360);
        __CLR4_4_1dazdazlb90p89a.R.inc(17361);return new PolyhedronsSet();
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Check if the instance contains a point.
     * @param p point to check
     * @return true if p belongs to the plane
     */
    public boolean contains(final Vector3D p) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17362);
        __CLR4_4_1dazdazlb90p89a.R.inc(17363);return FastMath.abs(getOffset(p)) < 1.0e-10;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get the offset (oriented distance) of a parallel plane.
     * <p>This method should be called only for parallel planes otherwise
     * the result is not meaningful.</p>
     * <p>The offset is 0 if both planes are the same, it is
     * positive if the plane is on the plus side of the instance and
     * negative if it is on the minus side, according to its natural
     * orientation.</p>
     * @param plane plane to check
     * @return offset of the plane
     */
    public double getOffset(final Plane plane) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17364);
        __CLR4_4_1dazdazlb90p89a.R.inc(17365);return originOffset + ((((sameOrientationAs(plane) )&&(__CLR4_4_1dazdazlb90p89a.R.iget(17366)!=0|true))||(__CLR4_4_1dazdazlb90p89a.R.iget(17367)==0&false))? -plane.originOffset : plane.originOffset);
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Get the offset (oriented distance) of a point.
     * <p>The offset is 0 if the point is on the underlying hyperplane,
     * it is positive if the point is on one particular side of the
     * hyperplane, and it is negative if the point is on the other side,
     * according to the hyperplane natural orientation.</p>
     * @param point point to check
     * @return offset of the point
     */
    public double getOffset(final Vector<Euclidean3D> point) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17368);
        __CLR4_4_1dazdazlb90p89a.R.inc(17369);return point.dotProduct(w) + originOffset;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

    /** Check if the instance has the same orientation as another hyperplane.
     * @param other other hyperplane to check against the instance
     * @return true if the instance and the other hyperplane have
     * the same orientation
     */
    public boolean sameOrientationAs(final Hyperplane<Euclidean3D> other) {try{__CLR4_4_1dazdazlb90p89a.R.inc(17370);
        __CLR4_4_1dazdazlb90p89a.R.inc(17371);return (((Plane) other).w).dotProduct(w) > 0.0;
    }finally{__CLR4_4_1dazdazlb90p89a.R.flushNeeded();}}

}
