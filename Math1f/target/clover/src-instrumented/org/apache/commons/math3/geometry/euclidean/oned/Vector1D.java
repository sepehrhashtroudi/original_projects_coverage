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

import java.text.NumberFormat;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/** This class represents a 1D vector.
 * <p>Instances of this class are guaranteed to be immutable.</p>
 * @version $Id$
 * @since 3.0
 */
public class Vector1D implements Vector<Euclidean1D> {public static class __CLR4_4_1cf2cf2lb90p82k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,16195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Origin (coordinates: 0). */
    public static final Vector1D ZERO = new Vector1D(0.0);

    /** Unit (coordinates: 1). */
    public static final Vector1D ONE  = new Vector1D(1.0);

    // CHECKSTYLE: stop ConstantName
    /** A vector with all coordinates set to NaN. */
    public static final Vector1D NaN = new Vector1D(Double.NaN);
    // CHECKSTYLE: resume ConstantName

    /** A vector with all coordinates set to positive infinity. */
    public static final Vector1D POSITIVE_INFINITY =
        new Vector1D(Double.POSITIVE_INFINITY);

    /** A vector with all coordinates set to negative infinity. */
    public static final Vector1D NEGATIVE_INFINITY =
        new Vector1D(Double.NEGATIVE_INFINITY);

    /** Serializable UID. */
    private static final long serialVersionUID = 7556674948671647925L;

    /** Abscissa. */
    private final double x;

    /** Simple constructor.
     * Build a vector from its coordinates
     * @param x abscissa
     * @see #getX()
     */
    public Vector1D(double x) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16094);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16095);this.x = x;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** Multiplicative constructor
     * Build a vector from another one and a scale factor.
     * The vector built will be a * u
     * @param a scale factor
     * @param u base (unscaled) vector
     */
    public Vector1D(double a, Vector1D u) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16096);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16097);this.x = a * u.x;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** Linear constructor
     * Build a vector from two other ones and corresponding scale factors.
     * The vector built will be a1 * u1 + a2 * u2
     * @param a1 first scale factor
     * @param u1 first base (unscaled) vector
     * @param a2 second scale factor
     * @param u2 second base (unscaled) vector
     */
    public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16098);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16099);this.x = a1 * u1.x + a2 * u2.x;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

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
    public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2,
                   double a3, Vector1D u3) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16100);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16101);this.x = a1 * u1.x + a2 * u2.x + a3 * u3.x;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

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
    public Vector1D(double a1, Vector1D u1, double a2, Vector1D u2,
                   double a3, Vector1D u3, double a4, Vector1D u4) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16102);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16103);this.x = a1 * u1.x + a2 * u2.x + a3 * u3.x + a4 * u4.x;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** Get the abscissa of the vector.
     * @return abscissa of the vector
     * @see #Vector1D(double)
     */
    public double getX() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16104);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16105);return x;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Space getSpace() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16106);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16107);return Euclidean1D.getInstance();
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector1D getZero() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16108);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16109);return ZERO;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNorm1() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16110);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16111);return FastMath.abs(x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNorm() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16112);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16113);return FastMath.abs(x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNormSq() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16114);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16115);return x * x;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNormInf() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16116);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16117);return FastMath.abs(x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector1D add(Vector<Euclidean1D> v) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16118);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16119);Vector1D v1 = (Vector1D) v;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16120);return new Vector1D(x + v1.getX());
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector1D add(double factor, Vector<Euclidean1D> v) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16121);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16122);Vector1D v1 = (Vector1D) v;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16123);return new Vector1D(x + factor * v1.getX());
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector1D subtract(Vector<Euclidean1D> p) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16124);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16125);Vector1D p3 = (Vector1D) p;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16126);return new Vector1D(x - p3.x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector1D subtract(double factor, Vector<Euclidean1D> v) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16127);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16128);Vector1D v1 = (Vector1D) v;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16129);return new Vector1D(x - factor * v1.getX());
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector1D normalize() throws MathArithmeticException {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16130);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16131);double s = getNorm();
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16132);if ((((s == 0)&&(__CLR4_4_1cf2cf2lb90p82k.R.iget(16133)!=0|true))||(__CLR4_4_1cf2cf2lb90p82k.R.iget(16134)==0&false))) {{
            __CLR4_4_1cf2cf2lb90p82k.R.inc(16135);throw new MathArithmeticException(LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR);
        }
        }__CLR4_4_1cf2cf2lb90p82k.R.inc(16136);return scalarMultiply(1 / s);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}
    /** {@inheritDoc} */
    public Vector1D negate() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16137);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16138);return new Vector1D(-x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector1D scalarMultiply(double a) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16139);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16140);return new Vector1D(a * x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isNaN() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16141);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16142);return Double.isNaN(x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isInfinite() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16143);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16144);return !isNaN() && Double.isInfinite(x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distance1(Vector<Euclidean1D> p) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16145);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16146);Vector1D p3 = (Vector1D) p;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16147);final double dx = FastMath.abs(p3.x - x);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16148);return dx;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distance(Vector<Euclidean1D> p) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16149);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16150);Vector1D p3 = (Vector1D) p;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16151);final double dx = p3.x - x;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16152);return FastMath.abs(dx);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distanceInf(Vector<Euclidean1D> p) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16153);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16154);Vector1D p3 = (Vector1D) p;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16155);final double dx = FastMath.abs(p3.x - x);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16156);return dx;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distanceSq(Vector<Euclidean1D> p) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16157);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16158);Vector1D p3 = (Vector1D) p;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16159);final double dx = p3.x - x;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16160);return dx * dx;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double dotProduct(final Vector<Euclidean1D> v) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16161);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16162);final Vector1D v1 = (Vector1D) v;
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16163);return x * v1.x;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>2</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>p1.subtract(p2).getNorm()</code> except that no intermediate
     * vector is built</p>
     * @param p1 first vector
     * @param p2 second vector
     * @return the distance between p1 and p2 according to the L<sub>2</sub> norm
     */
    public static double distance(Vector1D p1, Vector1D p2) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16164);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16165);return p1.distance(p2);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>&infin;</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>p1.subtract(p2).getNormInf()</code> except that no intermediate
     * vector is built</p>
     * @param p1 first vector
     * @param p2 second vector
     * @return the distance between p1 and p2 according to the L<sub>&infin;</sub> norm
     */
    public static double distanceInf(Vector1D p1, Vector1D p2) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16166);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16167);return p1.distanceInf(p2);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** Compute the square of the distance between two vectors.
     * <p>Calling this method is equivalent to calling:
     * <code>p1.subtract(p2).getNormSq()</code> except that no intermediate
     * vector is built</p>
     * @param p1 first vector
     * @param p2 second vector
     * @return the square of the distance between p1 and p2
     */
    public static double distanceSq(Vector1D p1, Vector1D p2) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16168);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16169);return p1.distanceSq(p2);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /**
     * Test for the equality of two 1D vectors.
     * <p>
     * If all coordinates of two 1D vectors are exactly the same, and none are
     * <code>Double.NaN</code>, the two 1D vectors are considered to be equal.
     * </p>
     * <p>
     * <code>NaN</code> coordinates are considered to affect globally the vector
     * and be equals to each other - i.e, if either (or all) coordinates of the
     * 1D vector are equal to <code>Double.NaN</code>, the 1D vector is equal to
     * {@link #NaN}.
     * </p>
     *
     * @param other Object to test for equality to this
     * @return true if two 1D vector objects are equal, false if
     *         object is null, not an instance of Vector1D, or
     *         not equal to this Vector1D instance
     *
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16170);

        __CLR4_4_1cf2cf2lb90p82k.R.inc(16171);if ((((this == other)&&(__CLR4_4_1cf2cf2lb90p82k.R.iget(16172)!=0|true))||(__CLR4_4_1cf2cf2lb90p82k.R.iget(16173)==0&false))) {{
            __CLR4_4_1cf2cf2lb90p82k.R.inc(16174);return true;
        }

        }__CLR4_4_1cf2cf2lb90p82k.R.inc(16175);if ((((other instanceof Vector1D)&&(__CLR4_4_1cf2cf2lb90p82k.R.iget(16176)!=0|true))||(__CLR4_4_1cf2cf2lb90p82k.R.iget(16177)==0&false))) {{
            __CLR4_4_1cf2cf2lb90p82k.R.inc(16178);final Vector1D rhs = (Vector1D)other;
            __CLR4_4_1cf2cf2lb90p82k.R.inc(16179);if ((((rhs.isNaN())&&(__CLR4_4_1cf2cf2lb90p82k.R.iget(16180)!=0|true))||(__CLR4_4_1cf2cf2lb90p82k.R.iget(16181)==0&false))) {{
                __CLR4_4_1cf2cf2lb90p82k.R.inc(16182);return this.isNaN();
            }

            }__CLR4_4_1cf2cf2lb90p82k.R.inc(16183);return x == rhs.x;
        }
        }__CLR4_4_1cf2cf2lb90p82k.R.inc(16184);return false;
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /**
     * Get a hashCode for the 1D vector.
     * <p>
     * All NaN values have the same hash code.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16185);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16186);if ((((isNaN())&&(__CLR4_4_1cf2cf2lb90p82k.R.iget(16187)!=0|true))||(__CLR4_4_1cf2cf2lb90p82k.R.iget(16188)==0&false))) {{
            __CLR4_4_1cf2cf2lb90p82k.R.inc(16189);return 7785;
        }
        }__CLR4_4_1cf2cf2lb90p82k.R.inc(16190);return 997 * MathUtils.hash(x);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** Get a string representation of this vector.
     * @return a string representation of this vector
     */
    @Override
    public String toString() {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16191);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16192);return Vector1DFormat.getInstance().format(this);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString(final NumberFormat format) {try{__CLR4_4_1cf2cf2lb90p82k.R.inc(16193);
        __CLR4_4_1cf2cf2lb90p82k.R.inc(16194);return new Vector1DFormat(format).format(this);
    }finally{__CLR4_4_1cf2cf2lb90p82k.R.flushNeeded();}}

}
