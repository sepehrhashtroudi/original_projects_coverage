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

import java.io.Serializable;
import java.text.NumberFormat;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.MathArrays;

/**
 * This class implements vectors in a three-dimensional space.
 * <p>Instance of this class are guaranteed to be immutable.</p>
 * @version $Id$
 * @since 1.2
 */
public class Vector3D implements Serializable, Vector<Euclidean3D> {public static class __CLR4_4_1e14e14lb90p8cc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,18369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Null vector (coordinates: 0, 0, 0). */
    public static final Vector3D ZERO   = new Vector3D(0, 0, 0);

    /** First canonical vector (coordinates: 1, 0, 0). */
    public static final Vector3D PLUS_I = new Vector3D(1, 0, 0);

    /** Opposite of the first canonical vector (coordinates: -1, 0, 0). */
    public static final Vector3D MINUS_I = new Vector3D(-1, 0, 0);

    /** Second canonical vector (coordinates: 0, 1, 0). */
    public static final Vector3D PLUS_J = new Vector3D(0, 1, 0);

    /** Opposite of the second canonical vector (coordinates: 0, -1, 0). */
    public static final Vector3D MINUS_J = new Vector3D(0, -1, 0);

    /** Third canonical vector (coordinates: 0, 0, 1). */
    public static final Vector3D PLUS_K = new Vector3D(0, 0, 1);

    /** Opposite of the third canonical vector (coordinates: 0, 0, -1).  */
    public static final Vector3D MINUS_K = new Vector3D(0, 0, -1);

    // CHECKSTYLE: stop ConstantName
    /** A vector with all coordinates set to NaN. */
    public static final Vector3D NaN = new Vector3D(Double.NaN, Double.NaN, Double.NaN);
    // CHECKSTYLE: resume ConstantName

    /** A vector with all coordinates set to positive infinity. */
    public static final Vector3D POSITIVE_INFINITY =
        new Vector3D(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);

    /** A vector with all coordinates set to negative infinity. */
    public static final Vector3D NEGATIVE_INFINITY =
        new Vector3D(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    /** Serializable version identifier. */
    private static final long serialVersionUID = 1313493323784566947L;

    /** Abscissa. */
    private final double x;

    /** Ordinate. */
    private final double y;

    /** Height. */
    private final double z;

    /** Simple constructor.
     * Build a vector from its coordinates
     * @param x abscissa
     * @param y ordinate
     * @param z height
     * @see #getX()
     * @see #getY()
     * @see #getZ()
     */
    public Vector3D(double x, double y, double z) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18184);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18185);this.x = x;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18186);this.y = y;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18187);this.z = z;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Simple constructor.
     * Build a vector from its coordinates
     * @param v coordinates array
     * @exception DimensionMismatchException if array does not have 3 elements
     * @see #toArray()
     */
    public Vector3D(double[] v) throws DimensionMismatchException {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18188);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18189);if ((((v.length != 3)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18190)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18191)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18192);throw new DimensionMismatchException(v.length, 3);
        }
        }__CLR4_4_1e14e14lb90p8cc.R.inc(18193);this.x = v[0];
        __CLR4_4_1e14e14lb90p8cc.R.inc(18194);this.y = v[1];
        __CLR4_4_1e14e14lb90p8cc.R.inc(18195);this.z = v[2];
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Simple constructor.
     * Build a vector from its azimuthal coordinates
     * @param alpha azimuth (&alpha;) around Z
     *              (0 is +X, &pi;/2 is +Y, &pi; is -X and 3&pi;/2 is -Y)
     * @param delta elevation (&delta;) above (XY) plane, from -&pi;/2 to +&pi;/2
     * @see #getAlpha()
     * @see #getDelta()
     */
    public Vector3D(double alpha, double delta) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18196);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18197);double cosDelta = FastMath.cos(delta);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18198);this.x = FastMath.cos(alpha) * cosDelta;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18199);this.y = FastMath.sin(alpha) * cosDelta;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18200);this.z = FastMath.sin(delta);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Multiplicative constructor
     * Build a vector from another one and a scale factor.
     * The vector built will be a * u
     * @param a scale factor
     * @param u base (unscaled) vector
     */
    public Vector3D(double a, Vector3D u) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18201);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18202);this.x = a * u.x;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18203);this.y = a * u.y;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18204);this.z = a * u.z;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Linear constructor
     * Build a vector from two other ones and corresponding scale factors.
     * The vector built will be a1 * u1 + a2 * u2
     * @param a1 first scale factor
     * @param u1 first base (unscaled) vector
     * @param a2 second scale factor
     * @param u2 second base (unscaled) vector
     */
    public Vector3D(double a1, Vector3D u1, double a2, Vector3D u2) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18205);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18206);this.x = MathArrays.linearCombination(a1, u1.x, a2, u2.x);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18207);this.y = MathArrays.linearCombination(a1, u1.y, a2, u2.y);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18208);this.z = MathArrays.linearCombination(a1, u1.z, a2, u2.z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

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
    public Vector3D(double a1, Vector3D u1, double a2, Vector3D u2,
                    double a3, Vector3D u3) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18209);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18210);this.x = MathArrays.linearCombination(a1, u1.x, a2, u2.x, a3, u3.x);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18211);this.y = MathArrays.linearCombination(a1, u1.y, a2, u2.y, a3, u3.y);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18212);this.z = MathArrays.linearCombination(a1, u1.z, a2, u2.z, a3, u3.z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

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
    public Vector3D(double a1, Vector3D u1, double a2, Vector3D u2,
                    double a3, Vector3D u3, double a4, Vector3D u4) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18213);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18214);this.x = MathArrays.linearCombination(a1, u1.x, a2, u2.x, a3, u3.x, a4, u4.x);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18215);this.y = MathArrays.linearCombination(a1, u1.y, a2, u2.y, a3, u3.y, a4, u4.y);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18216);this.z = MathArrays.linearCombination(a1, u1.z, a2, u2.z, a3, u3.z, a4, u4.z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Get the abscissa of the vector.
     * @return abscissa of the vector
     * @see #Vector3D(double, double, double)
     */
    public double getX() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18217);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18218);return x;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Get the ordinate of the vector.
     * @return ordinate of the vector
     * @see #Vector3D(double, double, double)
     */
    public double getY() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18219);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18220);return y;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Get the height of the vector.
     * @return height of the vector
     * @see #Vector3D(double, double, double)
     */
    public double getZ() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18221);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18222);return z;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Get the vector coordinates as a dimension 3 array.
     * @return vector coordinates
     * @see #Vector3D(double[])
     */
    public double[] toArray() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18223);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18224);return new double[] { x, y, z };
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Space getSpace() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18225);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18226);return Euclidean3D.getInstance();
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector3D getZero() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18227);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18228);return ZERO;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNorm1() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18229);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18230);return FastMath.abs(x) + FastMath.abs(y) + FastMath.abs(z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNorm() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18231);
        // there are no cancellation problems here, so we use the straightforward formula
        __CLR4_4_1e14e14lb90p8cc.R.inc(18232);return FastMath.sqrt (x * x + y * y + z * z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNormSq() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18233);
        // there are no cancellation problems here, so we use the straightforward formula
        __CLR4_4_1e14e14lb90p8cc.R.inc(18234);return x * x + y * y + z * z;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNormInf() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18235);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18236);return FastMath.max(FastMath.max(FastMath.abs(x), FastMath.abs(y)), FastMath.abs(z));
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Get the azimuth of the vector.
     * @return azimuth (&alpha;) of the vector, between -&pi; and +&pi;
     * @see #Vector3D(double, double)
     */
    public double getAlpha() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18237);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18238);return FastMath.atan2(y, x);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Get the elevation of the vector.
     * @return elevation (&delta;) of the vector, between -&pi;/2 and +&pi;/2
     * @see #Vector3D(double, double)
     */
    public double getDelta() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18239);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18240);return FastMath.asin(z / getNorm());
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector3D add(final Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18241);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18242);final Vector3D v3 = (Vector3D) v;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18243);return new Vector3D(x + v3.x, y + v3.y, z + v3.z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector3D add(double factor, final Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18244);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18245);return new Vector3D(1, this, factor, (Vector3D) v);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector3D subtract(final Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18246);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18247);final Vector3D v3 = (Vector3D) v;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18248);return new Vector3D(x - v3.x, y - v3.y, z - v3.z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector3D subtract(final double factor, final Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18249);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18250);return new Vector3D(1, this, -factor, (Vector3D) v);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector3D normalize() throws MathArithmeticException {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18251);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18252);double s = getNorm();
        __CLR4_4_1e14e14lb90p8cc.R.inc(18253);if ((((s == 0)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18254)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18255)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18256);throw new MathArithmeticException(LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR);
        }
        }__CLR4_4_1e14e14lb90p8cc.R.inc(18257);return scalarMultiply(1 / s);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Get a vector orthogonal to the instance.
     * <p>There are an infinite number of normalized vectors orthogonal
     * to the instance. This method picks up one of them almost
     * arbitrarily. It is useful when one needs to compute a reference
     * frame with one of the axes in a predefined direction. The
     * following example shows how to build a frame having the k axis
     * aligned with the known vector u :
     * <pre><code>
     *   Vector3D k = u.normalize();
     *   Vector3D i = k.orthogonal();
     *   Vector3D j = Vector3D.crossProduct(k, i);
     * </code></pre></p>
     * @return a new normalized vector orthogonal to the instance
     * @exception MathArithmeticException if the norm of the instance is null
     */
    public Vector3D orthogonal() throws MathArithmeticException {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18258);

        __CLR4_4_1e14e14lb90p8cc.R.inc(18259);double threshold = 0.6 * getNorm();
        __CLR4_4_1e14e14lb90p8cc.R.inc(18260);if ((((threshold == 0)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18261)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18262)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18263);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }

        }__CLR4_4_1e14e14lb90p8cc.R.inc(18264);if ((((FastMath.abs(x) <= threshold)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18265)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18266)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18267);double inverse  = 1 / FastMath.sqrt(y * y + z * z);
            __CLR4_4_1e14e14lb90p8cc.R.inc(18268);return new Vector3D(0, inverse * z, -inverse * y);
        } }else {__CLR4_4_1e14e14lb90p8cc.R.inc(18269);if ((((FastMath.abs(y) <= threshold)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18270)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18271)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18272);double inverse  = 1 / FastMath.sqrt(x * x + z * z);
            __CLR4_4_1e14e14lb90p8cc.R.inc(18273);return new Vector3D(-inverse * z, 0, inverse * x);
        }
        }}__CLR4_4_1e14e14lb90p8cc.R.inc(18274);double inverse  = 1 / FastMath.sqrt(x * x + y * y);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18275);return new Vector3D(inverse * y, -inverse * x, 0);

    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Compute the angular separation between two vectors.
     * <p>This method computes the angular separation between two
     * vectors using the dot product for well separated vectors and the
     * cross product for almost aligned vectors. This allows to have a
     * good accuracy in all cases, even for vectors very close to each
     * other.</p>
     * @param v1 first vector
     * @param v2 second vector
     * @return angular separation between v1 and v2
     * @exception MathArithmeticException if either vector has a null norm
     */
    public static double angle(Vector3D v1, Vector3D v2) throws MathArithmeticException {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18276);

        __CLR4_4_1e14e14lb90p8cc.R.inc(18277);double normProduct = v1.getNorm() * v2.getNorm();
        __CLR4_4_1e14e14lb90p8cc.R.inc(18278);if ((((normProduct == 0)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18279)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18280)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18281);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }

        }__CLR4_4_1e14e14lb90p8cc.R.inc(18282);double dot = v1.dotProduct(v2);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18283);double threshold = normProduct * 0.9999;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18284);if (((((dot < -threshold) || (dot > threshold))&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18285)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18286)==0&false))) {{
            // the vectors are almost aligned, compute using the sine
            __CLR4_4_1e14e14lb90p8cc.R.inc(18287);Vector3D v3 = crossProduct(v1, v2);
            __CLR4_4_1e14e14lb90p8cc.R.inc(18288);if ((((dot >= 0)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18289)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18290)==0&false))) {{
                __CLR4_4_1e14e14lb90p8cc.R.inc(18291);return FastMath.asin(v3.getNorm() / normProduct);
            }
            }__CLR4_4_1e14e14lb90p8cc.R.inc(18292);return FastMath.PI - FastMath.asin(v3.getNorm() / normProduct);
        }

        // the vectors are sufficiently separated to use the cosine
        }__CLR4_4_1e14e14lb90p8cc.R.inc(18293);return FastMath.acos(dot / normProduct);

    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector3D negate() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18294);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18295);return new Vector3D(-x, -y, -z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector3D scalarMultiply(double a) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18296);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18297);return new Vector3D(a * x, a * y, a * z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isNaN() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18298);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18299);return Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isInfinite() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18300);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18301);return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /**
     * Test for the equality of two 3D vectors.
     * <p>
     * If all coordinates of two 3D vectors are exactly the same, and none are
     * <code>Double.NaN</code>, the two 3D vectors are considered to be equal.
     * </p>
     * <p>
     * <code>NaN</code> coordinates are considered to affect globally the vector
     * and be equals to each other - i.e, if either (or all) coordinates of the
     * 3D vector are equal to <code>Double.NaN</code>, the 3D vector is equal to
     * {@link #NaN}.
     * </p>
     *
     * @param other Object to test for equality to this
     * @return true if two 3D vector objects are equal, false if
     *         object is null, not an instance of Vector3D, or
     *         not equal to this Vector3D instance
     *
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18302);

        __CLR4_4_1e14e14lb90p8cc.R.inc(18303);if ((((this == other)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18304)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18305)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18306);return true;
        }

        }__CLR4_4_1e14e14lb90p8cc.R.inc(18307);if ((((other instanceof Vector3D)&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18308)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18309)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18310);final Vector3D rhs = (Vector3D)other;
            __CLR4_4_1e14e14lb90p8cc.R.inc(18311);if ((((rhs.isNaN())&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18312)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18313)==0&false))) {{
                __CLR4_4_1e14e14lb90p8cc.R.inc(18314);return this.isNaN();
            }

            }__CLR4_4_1e14e14lb90p8cc.R.inc(18315);return (x == rhs.x) && (y == rhs.y) && (z == rhs.z);
        }
        }__CLR4_4_1e14e14lb90p8cc.R.inc(18316);return false;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /**
     * Get a hashCode for the 3D vector.
     * <p>
     * All NaN values have the same hash code.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18317);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18318);if ((((isNaN())&&(__CLR4_4_1e14e14lb90p8cc.R.iget(18319)!=0|true))||(__CLR4_4_1e14e14lb90p8cc.R.iget(18320)==0&false))) {{
            __CLR4_4_1e14e14lb90p8cc.R.inc(18321);return 642;
        }
        }__CLR4_4_1e14e14lb90p8cc.R.inc(18322);return 643 * (164 * MathUtils.hash(x) +  3 * MathUtils.hash(y) +  MathUtils.hash(z));
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc}
     * <p>
     * The implementation uses specific multiplication and addition
     * algorithms to preserve accuracy and reduce cancellation effects.
     * It should be very accurate even for nearly orthogonal vectors.
     * </p>
     * @see MathArrays#linearCombination(double, double, double, double, double, double)
     */
    public double dotProduct(final Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18323);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18324);final Vector3D v3 = (Vector3D) v;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18325);return MathArrays.linearCombination(x, v3.x, y, v3.y, z, v3.z);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Compute the cross-product of the instance with another vector.
     * @param v other vector
     * @return the cross product this ^ v as a new Vector3D
     */
    public Vector3D crossProduct(final Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18326);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18327);final Vector3D v3 = (Vector3D) v;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18328);return new Vector3D(MathArrays.linearCombination(y, v3.z, -z, v3.y),
                            MathArrays.linearCombination(z, v3.x, -x, v3.z),
                            MathArrays.linearCombination(x, v3.y, -y, v3.x));
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distance1(Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18329);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18330);final Vector3D v3 = (Vector3D) v;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18331);final double dx = FastMath.abs(v3.x - x);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18332);final double dy = FastMath.abs(v3.y - y);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18333);final double dz = FastMath.abs(v3.z - z);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18334);return dx + dy + dz;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distance(Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18335);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18336);final Vector3D v3 = (Vector3D) v;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18337);final double dx = v3.x - x;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18338);final double dy = v3.y - y;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18339);final double dz = v3.z - z;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18340);return FastMath.sqrt(dx * dx + dy * dy + dz * dz);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distanceInf(Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18341);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18342);final Vector3D v3 = (Vector3D) v;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18343);final double dx = FastMath.abs(v3.x - x);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18344);final double dy = FastMath.abs(v3.y - y);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18345);final double dz = FastMath.abs(v3.z - z);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18346);return FastMath.max(FastMath.max(dx, dy), dz);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distanceSq(Vector<Euclidean3D> v) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18347);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18348);final Vector3D v3 = (Vector3D) v;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18349);final double dx = v3.x - x;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18350);final double dy = v3.y - y;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18351);final double dz = v3.z - z;
        __CLR4_4_1e14e14lb90p8cc.R.inc(18352);return dx * dx + dy * dy + dz * dz;
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Compute the dot-product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @return the dot product v1.v2
     */
    public static double dotProduct(Vector3D v1, Vector3D v2) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18353);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18354);return v1.dotProduct(v2);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Compute the cross-product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @return the cross product v1 ^ v2 as a new Vector
     */
    public static Vector3D crossProduct(final Vector3D v1, final Vector3D v2) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18355);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18356);return v1.crossProduct(v2);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>1</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNorm1()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @return the distance between v1 and v2 according to the L<sub>1</sub> norm
     */
    public static double distance1(Vector3D v1, Vector3D v2) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18357);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18358);return v1.distance1(v2);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>2</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNorm()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @return the distance between v1 and v2 according to the L<sub>2</sub> norm
     */
    public static double distance(Vector3D v1, Vector3D v2) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18359);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18360);return v1.distance(v2);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>&infin;</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNormInf()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @return the distance between v1 and v2 according to the L<sub>&infin;</sub> norm
     */
    public static double distanceInf(Vector3D v1, Vector3D v2) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18361);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18362);return v1.distanceInf(v2);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Compute the square of the distance between two vectors.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNormSq()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @return the square of the distance between v1 and v2
     */
    public static double distanceSq(Vector3D v1, Vector3D v2) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18363);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18364);return v1.distanceSq(v2);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** Get a string representation of this vector.
     * @return a string representation of this vector
     */
    @Override
    public String toString() {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18365);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18366);return Vector3DFormat.getInstance().format(this);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString(final NumberFormat format) {try{__CLR4_4_1e14e14lb90p8cc.R.inc(18367);
        __CLR4_4_1e14e14lb90p8cc.R.inc(18368);return new Vector3DFormat(format).format(this);
    }finally{__CLR4_4_1e14e14lb90p8cc.R.flushNeeded();}}

}
