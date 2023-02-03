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

import java.text.NumberFormat;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/** This class represents a 2D vector.
 * <p>Instances of this class are guaranteed to be immutable.</p>
 * @version $Id$
 * @since 3.0
 */
public class Vector2D implements Vector<Euclidean2D> {public static class __CLR4_4_1eqdeqdlb90p8em{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,19214,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Origin (coordinates: 0, 0). */
    public static final Vector2D ZERO   = new Vector2D(0, 0);

    // CHECKSTYLE: stop ConstantName
    /** A vector with all coordinates set to NaN. */
    public static final Vector2D NaN = new Vector2D(Double.NaN, Double.NaN);
    // CHECKSTYLE: resume ConstantName

    /** A vector with all coordinates set to positive infinity. */
    public static final Vector2D POSITIVE_INFINITY =
        new Vector2D(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);

    /** A vector with all coordinates set to negative infinity. */
    public static final Vector2D NEGATIVE_INFINITY =
        new Vector2D(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    /** Serializable UID. */
    private static final long serialVersionUID = 266938651998679754L;

    /** Abscissa. */
    private final double x;

    /** Ordinate. */
    private final double y;

    /** Simple constructor.
     * Build a vector from its coordinates
     * @param x abscissa
     * @param y ordinate
     * @see #getX()
     * @see #getY()
     */
    public Vector2D(double x, double y) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19093);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19094);this.x = x;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19095);this.y = y;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Simple constructor.
     * Build a vector from its coordinates
     * @param v coordinates array
     * @exception DimensionMismatchException if array does not have 2 elements
     * @see #toArray()
     */
    public Vector2D(double[] v) throws DimensionMismatchException {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19096);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19097);if ((((v.length != 2)&&(__CLR4_4_1eqdeqdlb90p8em.R.iget(19098)!=0|true))||(__CLR4_4_1eqdeqdlb90p8em.R.iget(19099)==0&false))) {{
            __CLR4_4_1eqdeqdlb90p8em.R.inc(19100);throw new DimensionMismatchException(v.length, 2);
        }
        }__CLR4_4_1eqdeqdlb90p8em.R.inc(19101);this.x = v[0];
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19102);this.y = v[1];
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Multiplicative constructor
     * Build a vector from another one and a scale factor.
     * The vector built will be a * u
     * @param a scale factor
     * @param u base (unscaled) vector
     */
    public Vector2D(double a, Vector2D u) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19103);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19104);this.x = a * u.x;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19105);this.y = a * u.y;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Linear constructor
     * Build a vector from two other ones and corresponding scale factors.
     * The vector built will be a1 * u1 + a2 * u2
     * @param a1 first scale factor
     * @param u1 first base (unscaled) vector
     * @param a2 second scale factor
     * @param u2 second base (unscaled) vector
     */
    public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19106);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19107);this.x = a1 * u1.x + a2 * u2.x;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19108);this.y = a1 * u1.y + a2 * u2.y;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Linear constructor
     * Build a vector from three other ones and corresponding scale factors.
     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3
     * @param a1 first scale factor
     * @param u1 first base (unscaled) vector
     * @param a2 second scale factor
     * @param u2 second base (unscaled) vector
     * @param a3 third scale factor
     * @param u3 third base (unscaled) vector
     */
    public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2,
                   double a3, Vector2D u3) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19109);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19110);this.x = a1 * u1.x + a2 * u2.x + a3 * u3.x;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19111);this.y = a1 * u1.y + a2 * u2.y + a3 * u3.y;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Linear constructor
     * Build a vector from four other ones and corresponding scale factors.
     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4
     * @param a1 first scale factor
     * @param u1 first base (unscaled) vector
     * @param a2 second scale factor
     * @param u2 second base (unscaled) vector
     * @param a3 third scale factor
     * @param u3 third base (unscaled) vector
     * @param a4 fourth scale factor
     * @param u4 fourth base (unscaled) vector
     */
    public Vector2D(double a1, Vector2D u1, double a2, Vector2D u2,
                   double a3, Vector2D u3, double a4, Vector2D u4) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19112);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19113);this.x = a1 * u1.x + a2 * u2.x + a3 * u3.x + a4 * u4.x;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19114);this.y = a1 * u1.y + a2 * u2.y + a3 * u3.y + a4 * u4.y;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Get the abscissa of the vector.
     * @return abscissa of the vector
     * @see #Vector2D(double, double)
     */
    public double getX() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19115);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19116);return x;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Get the ordinate of the vector.
     * @return ordinate of the vector
     * @see #Vector2D(double, double)
     */
    public double getY() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19117);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19118);return y;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Get the vector coordinates as a dimension 2 array.
     * @return vector coordinates
     * @see #Vector2D(double[])
     */
    public double[] toArray() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19119);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19120);return new double[] { x, y };
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Space getSpace() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19121);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19122);return Euclidean2D.getInstance();
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector2D getZero() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19123);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19124);return ZERO;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNorm1() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19125);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19126);return FastMath.abs(x) + FastMath.abs(y);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNorm() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19127);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19128);return FastMath.sqrt (x * x + y * y);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNormSq() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19129);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19130);return x * x + y * y;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNormInf() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19131);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19132);return FastMath.max(FastMath.abs(x), FastMath.abs(y));
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector2D add(Vector<Euclidean2D> v) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19133);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19134);Vector2D v2 = (Vector2D) v;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19135);return new Vector2D(x + v2.getX(), y + v2.getY());
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector2D add(double factor, Vector<Euclidean2D> v) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19136);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19137);Vector2D v2 = (Vector2D) v;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19138);return new Vector2D(x + factor * v2.getX(), y + factor * v2.getY());
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector2D subtract(Vector<Euclidean2D> p) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19139);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19140);Vector2D p3 = (Vector2D) p;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19141);return new Vector2D(x - p3.x, y - p3.y);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector2D subtract(double factor, Vector<Euclidean2D> v) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19142);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19143);Vector2D v2 = (Vector2D) v;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19144);return new Vector2D(x - factor * v2.getX(), y - factor * v2.getY());
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector2D normalize() throws MathArithmeticException {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19145);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19146);double s = getNorm();
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19147);if ((((s == 0)&&(__CLR4_4_1eqdeqdlb90p8em.R.iget(19148)!=0|true))||(__CLR4_4_1eqdeqdlb90p8em.R.iget(19149)==0&false))) {{
            __CLR4_4_1eqdeqdlb90p8em.R.inc(19150);throw new MathArithmeticException(LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR);
        }
        }__CLR4_4_1eqdeqdlb90p8em.R.inc(19151);return scalarMultiply(1 / s);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}
    /** {@inheritDoc} */
    public Vector2D negate() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19152);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19153);return new Vector2D(-x, -y);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector2D scalarMultiply(double a) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19154);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19155);return new Vector2D(a * x, a * y);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isNaN() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19156);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19157);return Double.isNaN(x) || Double.isNaN(y);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isInfinite() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19158);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19159);return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y));
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distance1(Vector<Euclidean2D> p) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19160);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19161);Vector2D p3 = (Vector2D) p;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19162);final double dx = FastMath.abs(p3.x - x);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19163);final double dy = FastMath.abs(p3.y - y);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19164);return dx + dy;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distance(Vector<Euclidean2D> p) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19165);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19166);Vector2D p3 = (Vector2D) p;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19167);final double dx = p3.x - x;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19168);final double dy = p3.y - y;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19169);return FastMath.sqrt(dx * dx + dy * dy);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distanceInf(Vector<Euclidean2D> p) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19170);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19171);Vector2D p3 = (Vector2D) p;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19172);final double dx = FastMath.abs(p3.x - x);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19173);final double dy = FastMath.abs(p3.y - y);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19174);return FastMath.max(dx, dy);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distanceSq(Vector<Euclidean2D> p) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19175);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19176);Vector2D p3 = (Vector2D) p;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19177);final double dx = p3.x - x;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19178);final double dy = p3.y - y;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19179);return dx * dx + dy * dy;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double dotProduct(final Vector<Euclidean2D> v) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19180);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19181);final Vector2D v2 = (Vector2D) v;
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19182);return x * v2.x + y * v2.y;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>2</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>p1.subtract(p2).getNorm()</code> except that no intermediate
     * vector is built</p>
     * @param p1 first vector
     * @param p2 second vector
     * @return the distance between p1 and p2 according to the L<sub>2</sub> norm
     */
    public static double distance(Vector2D p1, Vector2D p2) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19183);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19184);return p1.distance(p2);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>&infin;</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>p1.subtract(p2).getNormInf()</code> except that no intermediate
     * vector is built</p>
     * @param p1 first vector
     * @param p2 second vector
     * @return the distance between p1 and p2 according to the L<sub>&infin;</sub> norm
     */
    public static double distanceInf(Vector2D p1, Vector2D p2) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19185);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19186);return p1.distanceInf(p2);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Compute the square of the distance between two vectors.
     * <p>Calling this method is equivalent to calling:
     * <code>p1.subtract(p2).getNormSq()</code> except that no intermediate
     * vector is built</p>
     * @param p1 first vector
     * @param p2 second vector
     * @return the square of the distance between p1 and p2
     */
    public static double distanceSq(Vector2D p1, Vector2D p2) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19187);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19188);return p1.distanceSq(p2);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /**
     * Test for the equality of two 2D vectors.
     * <p>
     * If all coordinates of two 2D vectors are exactly the same, and none are
     * <code>Double.NaN</code>, the two 2D vectors are considered to be equal.
     * </p>
     * <p>
     * <code>NaN</code> coordinates are considered to affect globally the vector
     * and be equals to each other - i.e, if either (or all) coordinates of the
     * 2D vector are equal to <code>Double.NaN</code>, the 2D vector is equal to
     * {@link #NaN}.
     * </p>
     *
     * @param other Object to test for equality to this
     * @return true if two 2D vector objects are equal, false if
     *         object is null, not an instance of Vector2D, or
     *         not equal to this Vector2D instance
     *
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19189);

        __CLR4_4_1eqdeqdlb90p8em.R.inc(19190);if ((((this == other)&&(__CLR4_4_1eqdeqdlb90p8em.R.iget(19191)!=0|true))||(__CLR4_4_1eqdeqdlb90p8em.R.iget(19192)==0&false))) {{
            __CLR4_4_1eqdeqdlb90p8em.R.inc(19193);return true;
        }

        }__CLR4_4_1eqdeqdlb90p8em.R.inc(19194);if ((((other instanceof Vector2D)&&(__CLR4_4_1eqdeqdlb90p8em.R.iget(19195)!=0|true))||(__CLR4_4_1eqdeqdlb90p8em.R.iget(19196)==0&false))) {{
            __CLR4_4_1eqdeqdlb90p8em.R.inc(19197);final Vector2D rhs = (Vector2D)other;
            __CLR4_4_1eqdeqdlb90p8em.R.inc(19198);if ((((rhs.isNaN())&&(__CLR4_4_1eqdeqdlb90p8em.R.iget(19199)!=0|true))||(__CLR4_4_1eqdeqdlb90p8em.R.iget(19200)==0&false))) {{
                __CLR4_4_1eqdeqdlb90p8em.R.inc(19201);return this.isNaN();
            }

            }__CLR4_4_1eqdeqdlb90p8em.R.inc(19202);return (x == rhs.x) && (y == rhs.y);
        }
        }__CLR4_4_1eqdeqdlb90p8em.R.inc(19203);return false;
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /**
     * Get a hashCode for the 2D vector.
     * <p>
     * All NaN values have the same hash code.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19204);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19205);if ((((isNaN())&&(__CLR4_4_1eqdeqdlb90p8em.R.iget(19206)!=0|true))||(__CLR4_4_1eqdeqdlb90p8em.R.iget(19207)==0&false))) {{
            __CLR4_4_1eqdeqdlb90p8em.R.inc(19208);return 542;
        }
        }__CLR4_4_1eqdeqdlb90p8em.R.inc(19209);return 122 * (76 * MathUtils.hash(x) +  MathUtils.hash(y));
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** Get a string representation of this vector.
     * @return a string representation of this vector
     */
    @Override
    public String toString() {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19210);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19211);return Vector2DFormat.getInstance().format(this);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString(final NumberFormat format) {try{__CLR4_4_1eqdeqdlb90p8em.R.inc(19212);
        __CLR4_4_1eqdeqdlb90p8em.R.inc(19213);return new Vector2DFormat(format).format(this);
    }finally{__CLR4_4_1eqdeqdlb90p8em.R.flushNeeded();}}

}
