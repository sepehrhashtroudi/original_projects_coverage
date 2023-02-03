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

import org.apache.commons.math3.RealFieldElement;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

/**
 * This class is a re-implementation of {@link Rotation} using {@link RealFieldElement}.
 * <p>Instance of this class are guaranteed to be immutable.</p>
 *
 * @param <T> the type of the field elements
 * @version $Id$
 * @see FieldVector3D
 * @see RotationOrder
 * @since 3.2
 */

public class FieldRotation<T extends RealFieldElement<T>> implements Serializable {public static class __CLR4_4_1cj2cj2lb90p86w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,16703,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 20130224l;

    /** Scalar coordinate of the quaternion. */
    private final T q0;

    /** First coordinate of the vectorial part of the quaternion. */
    private final T q1;

    /** Second coordinate of the vectorial part of the quaternion. */
    private final T q2;

    /** Third coordinate of the vectorial part of the quaternion. */
    private final T q3;

    /** Build a rotation from the quaternion coordinates.
     * <p>A rotation can be built from a <em>normalized</em> quaternion,
     * i.e. a quaternion for which q<sub>0</sub><sup>2</sup> +
     * q<sub>1</sub><sup>2</sup> + q<sub>2</sub><sup>2</sup> +
     * q<sub>3</sub><sup>2</sup> = 1. If the quaternion is not normalized,
     * the constructor can normalize it in a preprocessing step.</p>
     * <p>Note that some conventions put the scalar part of the quaternion
     * as the 4<sup>th</sup> component and the vector part as the first three
     * components. This is <em>not</em> our convention. We put the scalar part
     * as the first component.</p>
     * @param q0 scalar part of the quaternion
     * @param q1 first coordinate of the vectorial part of the quaternion
     * @param q2 second coordinate of the vectorial part of the quaternion
     * @param q3 third coordinate of the vectorial part of the quaternion
     * @param needsNormalization if true, the coordinates are considered
     * not to be normalized, a normalization preprocessing step is performed
     * before using them
     */
    public FieldRotation(final T q0, final T q1, final T q2, final T q3, final boolean needsNormalization) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16238);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16239);if ((((needsNormalization)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16240)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16241)==0&false))) {{
            // normalization preprocessing
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16242);final T inv =
                    q0.multiply(q0).add(q1.multiply(q1)).add(q2.multiply(q2)).add(q3.multiply(q3)).sqrt().reciprocal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16243);this.q0 = inv.multiply(q0);
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16244);this.q1 = inv.multiply(q1);
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16245);this.q2 = inv.multiply(q2);
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16246);this.q3 = inv.multiply(q3);
        } }else {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16247);this.q0 = q0;
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16248);this.q1 = q1;
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16249);this.q2 = q2;
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16250);this.q3 = q3;
        }

    }}finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Build a rotation from an axis and an angle.
     * <p>We use the convention that angles are oriented according to
     * the effect of the rotation on vectors around the axis. That means
     * that if (i, j, k) is a direct frame and if we first provide +k as
     * the axis and &pi;/2 as the angle to this constructor, and then
     * {@link #applyTo(FieldVector3D) apply} the instance to +i, we will get
     * +j.</p>
     * <p>Another way to represent our convention is to say that a rotation
     * of angle &theta; about the unit vector (x, y, z) is the same as the
     * rotation build from quaternion components { cos(-&theta;/2),
     * x * sin(-&theta;/2), y * sin(-&theta;/2), z * sin(-&theta;/2) }.
     * Note the minus sign on the angle!</p>
     * <p>On the one hand this convention is consistent with a vectorial
     * perspective (moving vectors in fixed frames), on the other hand it
     * is different from conventions with a frame perspective (fixed vectors
     * viewed from different frames) like the ones used for example in spacecraft
     * attitude community or in the graphics community.</p>
     * @param axis axis around which to rotate
     * @param angle rotation angle.
     * @exception MathIllegalArgumentException if the axis norm is zero
     */
    public FieldRotation(final FieldVector3D<T> axis, final T angle)
        throws MathIllegalArgumentException {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16251);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16252);final T norm = axis.getNorm();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16253);if ((((norm.getReal() == 0)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16254)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16255)==0&false))) {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16256);throw new MathIllegalArgumentException(LocalizedFormats.ZERO_NORM_FOR_ROTATION_AXIS);
        }

        }__CLR4_4_1cj2cj2lb90p86w.R.inc(16257);final T halfAngle = angle.multiply(-0.5);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16258);final T coeff = halfAngle.sin().divide(norm);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16259);q0 = halfAngle.cos();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16260);q1 = coeff.multiply(axis.getX());
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16261);q2 = coeff.multiply(axis.getY());
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16262);q3 = coeff.multiply(axis.getZ());

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Build a rotation from a 3X3 matrix.

     * <p>Rotation matrices are orthogonal matrices, i.e. unit matrices
     * (which are matrices for which m.m<sup>T</sup> = I) with real
     * coefficients. The module of the determinant of unit matrices is
     * 1, among the orthogonal 3X3 matrices, only the ones having a
     * positive determinant (+1) are rotation matrices.</p>

     * <p>When a rotation is defined by a matrix with truncated values
     * (typically when it is extracted from a technical sheet where only
     * four to five significant digits are available), the matrix is not
     * orthogonal anymore. This constructor handles this case
     * transparently by using a copy of the given matrix and applying a
     * correction to the copy in order to perfect its orthogonality. If
     * the Frobenius norm of the correction needed is above the given
     * threshold, then the matrix is considered to be too far from a
     * true rotation matrix and an exception is thrown.<p>

     * @param m rotation matrix
     * @param threshold convergence threshold for the iterative
     * orthogonality correction (convergence is reached when the
     * difference between two steps of the Frobenius norm of the
     * correction is below this threshold)

     * @exception NotARotationMatrixException if the matrix is not a 3X3
     * matrix, or if it cannot be transformed into an orthogonal matrix
     * with the given threshold, or if the determinant of the resulting
     * orthogonal matrix is negative

     */
    public FieldRotation(final T[][] m, final double threshold)
        throws NotARotationMatrixException {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16263);

        // dimension check
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16264);if (((((m.length != 3) || (m[0].length != 3) ||
                (m[1].length != 3) || (m[2].length != 3))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16265)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16266)==0&false))) {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16267);throw new NotARotationMatrixException(
                                                  LocalizedFormats.ROTATION_MATRIX_DIMENSIONS,
                                                  m.length, m[0].length);
        }

        // compute a "close" orthogonal matrix
        }__CLR4_4_1cj2cj2lb90p86w.R.inc(16268);final T[][] ort = orthogonalizeMatrix(m, threshold);

        // check the sign of the determinant
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16269);final T d0 = ort[1][1].multiply(ort[2][2]).subtract(ort[2][1].multiply(ort[1][2]));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16270);final T d1 = ort[0][1].multiply(ort[2][2]).subtract(ort[2][1].multiply(ort[0][2]));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16271);final T d2 = ort[0][1].multiply(ort[1][2]).subtract(ort[1][1].multiply(ort[0][2]));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16272);final T det =
                ort[0][0].multiply(d0).subtract(ort[1][0].multiply(d1)).add(ort[2][0].multiply(d2));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16273);if ((((det.getReal() < 0.0)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16274)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16275)==0&false))) {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16276);throw new NotARotationMatrixException(
                                                  LocalizedFormats.CLOSEST_ORTHOGONAL_MATRIX_HAS_NEGATIVE_DETERMINANT,
                                                  det);
        }

        }__CLR4_4_1cj2cj2lb90p86w.R.inc(16277);final T[] quat = mat2quat(ort);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16278);q0 = quat[0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16279);q1 = quat[1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16280);q2 = quat[2];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16281);q3 = quat[3];

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Build the rotation that transforms a pair of vector into another pair.

     * <p>Except for possible scale factors, if the instance were applied to
     * the pair (u<sub>1</sub>, u<sub>2</sub>) it will produce the pair
     * (v<sub>1</sub>, v<sub>2</sub>).</p>

     * <p>If the angular separation between u<sub>1</sub> and u<sub>2</sub> is
     * not the same as the angular separation between v<sub>1</sub> and
     * v<sub>2</sub>, then a corrected v'<sub>2</sub> will be used rather than
     * v<sub>2</sub>, the corrected vector will be in the (v<sub>1</sub>,
     * v<sub>2</sub>) plane.</p>

     * @param u1 first vector of the origin pair
     * @param u2 second vector of the origin pair
     * @param v1 desired image of u1 by the rotation
     * @param v2 desired image of u2 by the rotation
     * @exception MathArithmeticException if the norm of one of the vectors is zero,
     * or if one of the pair is degenerated (i.e. the vectors of the pair are colinear)
     */
    public FieldRotation(FieldVector3D<T> u1, FieldVector3D<T> u2, FieldVector3D<T> v1, FieldVector3D<T> v2)
        throws MathArithmeticException {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16282);

        // build orthonormalized base from u1, u2
        // this fails when vectors are null or colinear, which is forbidden to define a rotation
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16283);final FieldVector3D<T> u3 = FieldVector3D.crossProduct(u1, u2).normalize();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16284);u2 = FieldVector3D.crossProduct(u3, u1).normalize();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16285);u1 = u1.normalize();

        // build an orthonormalized base from v1, v2
        // this fails when vectors are null or colinear, which is forbidden to define a rotation
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16286);final FieldVector3D<T> v3 = FieldVector3D.crossProduct(v1, v2).normalize();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16287);v2 = FieldVector3D.crossProduct(v3, v1).normalize();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16288);v1 = v1.normalize();

        // buid a matrix transforming the first base into the second one
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16289);final T[][] array = MathArrays.buildArray(u1.getX().getField(), 3, 3);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16290);array[0][0] = u1.getX().multiply(v1.getX()).add(u2.getX().multiply(v2.getX())).add(u3.getX().multiply(v3.getX()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16291);array[0][1] = u1.getY().multiply(v1.getX()).add(u2.getY().multiply(v2.getX())).add(u3.getY().multiply(v3.getX()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16292);array[0][2] = u1.getZ().multiply(v1.getX()).add(u2.getZ().multiply(v2.getX())).add(u3.getZ().multiply(v3.getX()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16293);array[1][0] = u1.getX().multiply(v1.getY()).add(u2.getX().multiply(v2.getY())).add(u3.getX().multiply(v3.getY()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16294);array[1][1] = u1.getY().multiply(v1.getY()).add(u2.getY().multiply(v2.getY())).add(u3.getY().multiply(v3.getY()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16295);array[1][2] = u1.getZ().multiply(v1.getY()).add(u2.getZ().multiply(v2.getY())).add(u3.getZ().multiply(v3.getY()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16296);array[2][0] = u1.getX().multiply(v1.getZ()).add(u2.getX().multiply(v2.getZ())).add(u3.getX().multiply(v3.getZ()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16297);array[2][1] = u1.getY().multiply(v1.getZ()).add(u2.getY().multiply(v2.getZ())).add(u3.getY().multiply(v3.getZ()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16298);array[2][2] = u1.getZ().multiply(v1.getZ()).add(u2.getZ().multiply(v2.getZ())).add(u3.getZ().multiply(v3.getZ()));

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16299);T[] quat = mat2quat(array);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16300);q0 = quat[0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16301);q1 = quat[1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16302);q2 = quat[2];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16303);q3 = quat[3];

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Build one of the rotations that transform one vector into another one.

     * <p>Except for a possible scale factor, if the instance were
     * applied to the vector u it will produce the vector v. There is an
     * infinite number of such rotations, this constructor choose the
     * one with the smallest associated angle (i.e. the one whose axis
     * is orthogonal to the (u, v) plane). If u and v are colinear, an
     * arbitrary rotation axis is chosen.</p>

     * @param u origin vector
     * @param v desired image of u by the rotation
     * @exception MathArithmeticException if the norm of one of the vectors is zero
     */
    public FieldRotation(final FieldVector3D<T> u, final FieldVector3D<T> v) throws MathArithmeticException {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16304);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16305);final T normProduct = u.getNorm().multiply(v.getNorm());
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16306);if ((((normProduct.getReal() == 0)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16307)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16308)==0&false))) {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16309);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR);
        }

        }__CLR4_4_1cj2cj2lb90p86w.R.inc(16310);final T dot = FieldVector3D.dotProduct(u, v);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16311);if ((((dot.getReal() < ((2.0e-15 - 1.0) * normProduct.getReal()))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16312)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16313)==0&false))) {{
            // special case u = -v: we select a PI angle rotation around
            // an arbitrary vector orthogonal to u
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16314);final FieldVector3D<T> w = u.orthogonal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16315);q0 = normProduct.getField().getZero();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16316);q1 = w.getX().negate();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16317);q2 = w.getY().negate();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16318);q3 = w.getZ().negate();
        } }else {{
            // general case: (u, v) defines a plane, we select
            // the shortest possible rotation: axis orthogonal to this plane
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16319);q0 = dot.divide(normProduct).add(1.0).multiply(0.5).sqrt();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16320);final T coeff = q0.multiply(normProduct).multiply(2.0).reciprocal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16321);final FieldVector3D<T> q = FieldVector3D.crossProduct(v, u);
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16322);q1 = coeff.multiply(q.getX());
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16323);q2 = coeff.multiply(q.getY());
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16324);q3 = coeff.multiply(q.getZ());
        }

    }}finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Build a rotation from three Cardan or Euler elementary rotations.

     * <p>Cardan rotations are three successive rotations around the
     * canonical axes X, Y and Z, each axis being used once. There are
     * 6 such sets of rotations (XYZ, XZY, YXZ, YZX, ZXY and ZYX). Euler
     * rotations are three successive rotations around the canonical
     * axes X, Y and Z, the first and last rotations being around the
     * same axis. There are 6 such sets of rotations (XYX, XZX, YXY,
     * YZY, ZXZ and ZYZ), the most popular one being ZXZ.</p>
     * <p>Beware that many people routinely use the term Euler angles even
     * for what really are Cardan angles (this confusion is especially
     * widespread in the aerospace business where Roll, Pitch and Yaw angles
     * are often wrongly tagged as Euler angles).</p>

     * @param order order of rotations to use
     * @param alpha1 angle of the first elementary rotation
     * @param alpha2 angle of the second elementary rotation
     * @param alpha3 angle of the third elementary rotation
     */
    public FieldRotation(final RotationOrder order, final T alpha1, final T alpha2, final T alpha3) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16325);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16326);final T one = alpha1.getField().getOne();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16327);final FieldRotation<T> r1 = new FieldRotation<T>(new FieldVector3D<T>(one, order.getA1()), alpha1);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16328);final FieldRotation<T> r2 = new FieldRotation<T>(new FieldVector3D<T>(one, order.getA2()), alpha2);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16329);final FieldRotation<T> r3 = new FieldRotation<T>(new FieldVector3D<T>(one, order.getA3()), alpha3);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16330);final FieldRotation<T> composed = r1.applyTo(r2.applyTo(r3));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16331);q0 = composed.q0;
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16332);q1 = composed.q1;
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16333);q2 = composed.q2;
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16334);q3 = composed.q3;
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Convert an orthogonal rotation matrix to a quaternion.
     * @param ort orthogonal rotation matrix
     * @return quaternion corresponding to the matrix
     */
    private T[] mat2quat(final T[][] ort) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16335);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16336);final T[] quat = MathArrays.buildArray(ort[0][0].getField(), 4);

        // There are different ways to compute the quaternions elements
        // from the matrix. They all involve computing one element from
        // the diagonal of the matrix, and computing the three other ones
        // using a formula involving a division by the first element,
        // which unfortunately can be zero. Since the norm of the
        // quaternion is 1, we know at least one element has an absolute
        // value greater or equal to 0.5, so it is always possible to
        // select the right formula and avoid division by zero and even
        // numerical inaccuracy. Checking the elements in turn and using
        // the first one greater than 0.45 is safe (this leads to a simple
        // test since qi = 0.45 implies 4 qi^2 - 1 = -0.19)
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16337);T s = ort[0][0].add(ort[1][1]).add(ort[2][2]);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16338);if ((((s.getReal() > -0.19)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16339)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16340)==0&false))) {{
            // compute q0 and deduce q1, q2 and q3
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16341);quat[0] = s.add(1.0).sqrt().multiply(0.5);
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16342);T inv = quat[0].reciprocal().multiply(0.25);
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16343);quat[1] = inv.multiply(ort[1][2].subtract(ort[2][1]));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16344);quat[2] = inv.multiply(ort[2][0].subtract(ort[0][2]));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16345);quat[3] = inv.multiply(ort[0][1].subtract(ort[1][0]));
        } }else {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16346);s = ort[0][0].subtract(ort[1][1]).subtract(ort[2][2]);
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16347);if ((((s.getReal() > -0.19)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16348)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16349)==0&false))) {{
                // compute q1 and deduce q0, q2 and q3
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16350);quat[1] = s.add(1.0).sqrt().multiply(0.5);
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16351);T inv = quat[1].reciprocal().multiply(0.25);
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16352);quat[0] = inv.multiply(ort[1][2].subtract(ort[2][1]));
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16353);quat[2] = inv.multiply(ort[0][1].add(ort[1][0]));
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16354);quat[3] = inv.multiply(ort[0][2].add(ort[2][0]));
            } }else {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16355);s = ort[1][1].subtract(ort[0][0]).subtract(ort[2][2]);
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16356);if ((((s.getReal() > -0.19)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16357)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16358)==0&false))) {{
                    // compute q2 and deduce q0, q1 and q3
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16359);quat[2] = s.add(1.0).sqrt().multiply(0.5);
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16360);T inv = quat[2].reciprocal().multiply(0.25);
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16361);quat[0] = inv.multiply(ort[2][0].subtract(ort[0][2]));
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16362);quat[1] = inv.multiply(ort[0][1].add(ort[1][0]));
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16363);quat[3] = inv.multiply(ort[2][1].add(ort[1][2]));
                } }else {{
                    // compute q3 and deduce q0, q1 and q2
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16364);s = ort[2][2].subtract(ort[0][0]).subtract(ort[1][1]);
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16365);quat[3] = s.add(1.0).sqrt().multiply(0.5);
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16366);T inv = quat[3].reciprocal().multiply(0.25);
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16367);quat[0] = inv.multiply(ort[0][1].subtract(ort[1][0]));
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16368);quat[1] = inv.multiply(ort[0][2].add(ort[2][0]));
                    __CLR4_4_1cj2cj2lb90p86w.R.inc(16369);quat[2] = inv.multiply(ort[2][1].add(ort[1][2]));
                }
            }}
        }}

        }__CLR4_4_1cj2cj2lb90p86w.R.inc(16370);return quat;

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Revert a rotation.
     * Build a rotation which reverse the effect of another
     * rotation. This means that if r(u) = v, then r.revert(v) = u. The
     * instance is not changed.
     * @return a new rotation whose effect is the reverse of the effect
     * of the instance
     */
    public FieldRotation<T> revert() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16371);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16372);return new FieldRotation<T>(q0.negate(), q1, q2, q3, false);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Get the scalar coordinate of the quaternion.
     * @return scalar coordinate of the quaternion
     */
    public T getQ0() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16373);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16374);return q0;
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Get the first coordinate of the vectorial part of the quaternion.
     * @return first coordinate of the vectorial part of the quaternion
     */
    public T getQ1() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16375);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16376);return q1;
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Get the second coordinate of the vectorial part of the quaternion.
     * @return second coordinate of the vectorial part of the quaternion
     */
    public T getQ2() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16377);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16378);return q2;
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Get the third coordinate of the vectorial part of the quaternion.
     * @return third coordinate of the vectorial part of the quaternion
     */
    public T getQ3() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16379);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16380);return q3;
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Get the normalized axis of the rotation.
     * @return normalized axis of the rotation
     * @see #FieldRotation(FieldVector3D, RealFieldElement)
     */
    public FieldVector3D<T> getAxis() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16381);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16382);final T squaredSine = q1.multiply(q1).add(q2.multiply(q2)).add(q3.multiply(q3));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16383);if ((((squaredSine.getReal() == 0)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16384)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16385)==0&false))) {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16386);final Field<T> field = squaredSine.getField();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16387);return new FieldVector3D<T>(field.getOne(), field.getZero(), field.getZero());
        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16388);if ((((q0.getReal() < 0)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16389)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16390)==0&false))) {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16391);T inverse = squaredSine.sqrt().reciprocal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16392);return new FieldVector3D<T>(q1.multiply(inverse), q2.multiply(inverse), q3.multiply(inverse));
        }
        }}__CLR4_4_1cj2cj2lb90p86w.R.inc(16393);final T inverse = squaredSine.sqrt().reciprocal().negate();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16394);return new FieldVector3D<T>(q1.multiply(inverse), q2.multiply(inverse), q3.multiply(inverse));
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Get the angle of the rotation.
     * @return angle of the rotation (between 0 and &pi;)
     * @see #FieldRotation(FieldVector3D, RealFieldElement)
     */
    public T getAngle() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16395);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16396);if (((((q0.getReal() < -0.1) || (q0.getReal() > 0.1))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16397)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16398)==0&false))) {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16399);return q1.multiply(q1).add(q2.multiply(q2)).add(q3.multiply(q3)).sqrt().asin().multiply(2);
        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16400);if ((((q0.getReal() < 0)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16401)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16402)==0&false))) {{
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16403);return q0.negate().acos().multiply(2);
        }
        }}__CLR4_4_1cj2cj2lb90p86w.R.inc(16404);return q0.acos().multiply(2);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Get the Cardan or Euler angles corresponding to the instance.

     * <p>The equations show that each rotation can be defined by two
     * different values of the Cardan or Euler angles set. For example
     * if Cardan angles are used, the rotation defined by the angles
     * a<sub>1</sub>, a<sub>2</sub> and a<sub>3</sub> is the same as
     * the rotation defined by the angles &pi; + a<sub>1</sub>, &pi;
     * - a<sub>2</sub> and &pi; + a<sub>3</sub>. This method implements
     * the following arbitrary choices:</p>
     * <ul>
     *   <li>for Cardan angles, the chosen set is the one for which the
     *   second angle is between -&pi;/2 and &pi;/2 (i.e its cosine is
     *   positive),</li>
     *   <li>for Euler angles, the chosen set is the one for which the
     *   second angle is between 0 and &pi; (i.e its sine is positive).</li>
     * </ul>

     * <p>Cardan and Euler angle have a very disappointing drawback: all
     * of them have singularities. This means that if the instance is
     * too close to the singularities corresponding to the given
     * rotation order, it will be impossible to retrieve the angles. For
     * Cardan angles, this is often called gimbal lock. There is
     * <em>nothing</em> to do to prevent this, it is an intrinsic problem
     * with Cardan and Euler representation (but not a problem with the
     * rotation itself, which is perfectly well defined). For Cardan
     * angles, singularities occur when the second angle is close to
     * -&pi;/2 or +&pi;/2, for Euler angle singularities occur when the
     * second angle is close to 0 or &pi;, this implies that the identity
     * rotation is always singular for Euler angles!</p>

     * @param order rotation order to use
     * @return an array of three angles, in the order specified by the set
     * @exception CardanEulerSingularityException if the rotation is
     * singular with respect to the angles set specified
     */
    public T[] getAngles(final RotationOrder order)
        throws CardanEulerSingularityException {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16405);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16406);if ((((order == RotationOrder.XYZ)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16407)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16408)==0&false))) {{

            // r (+K) coordinates are :
            //  sin (theta), -cos (theta) sin (phi), cos (theta) cos (phi)
            // (-r) (+I) coordinates are :
            // cos (psi) cos (theta), -sin (psi) cos (theta), sin (theta)
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16409);final // and we can choose to have theta in the interval [-PI/2 ; +PI/2]
            FieldVector3D<T> v1 = applyTo(vector(0, 0, 1));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16410);final FieldVector3D<T> v2 = applyInverseTo(vector(1, 0, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16411);if  (((((v2.getZ().getReal() < -0.9999999999) || (v2.getZ().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16412)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16413)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16414);throw new CardanEulerSingularityException(true);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16415);return buildArray(v1.getY().negate().atan2(v1.getZ()),
                              v2.getZ().asin(),
                              v2.getY().negate().atan2(v2.getX()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16416);if ((((order == RotationOrder.XZY)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16417)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16418)==0&false))) {{

            // r (+J) coordinates are :
            // -sin (psi), cos (psi) cos (phi), cos (psi) sin (phi)
            // (-r) (+I) coordinates are :
            // cos (theta) cos (psi), -sin (psi), sin (theta) cos (psi)
            // and we can choose to have psi in the interval [-PI/2 ; +PI/2]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16419);final FieldVector3D<T> v1 = applyTo(vector(0, 1, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16420);final FieldVector3D<T> v2 = applyInverseTo(vector(1, 0, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16421);if (((((v2.getY().getReal() < -0.9999999999) || (v2.getY().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16422)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16423)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16424);throw new CardanEulerSingularityException(true);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16425);return buildArray(v1.getZ().atan2(v1.getY()),
                              v2.getY().asin().negate(),
                              v2.getZ().atan2(v2.getX()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16426);if ((((order == RotationOrder.YXZ)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16427)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16428)==0&false))) {{

            // r (+K) coordinates are :
            //  cos (phi) sin (theta), -sin (phi), cos (phi) cos (theta)
            // (-r) (+J) coordinates are :
            // sin (psi) cos (phi), cos (psi) cos (phi), -sin (phi)
            // and we can choose to have phi in the interval [-PI/2 ; +PI/2]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16429);final FieldVector3D<T> v1 = applyTo(vector(0, 0, 1));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16430);final FieldVector3D<T> v2 = applyInverseTo(vector(0, 1, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16431);if (((((v2.getZ().getReal() < -0.9999999999) || (v2.getZ().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16432)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16433)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16434);throw new CardanEulerSingularityException(true);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16435);return buildArray(v1.getX().atan2(v1.getZ()),
                              v2.getZ().asin().negate(),
                              v2.getX().atan2(v2.getY()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16436);if ((((order == RotationOrder.YZX)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16437)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16438)==0&false))) {{

            // r (+I) coordinates are :
            // cos (psi) cos (theta), sin (psi), -cos (psi) sin (theta)
            // (-r) (+J) coordinates are :
            // sin (psi), cos (phi) cos (psi), -sin (phi) cos (psi)
            // and we can choose to have psi in the interval [-PI/2 ; +PI/2]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16439);final FieldVector3D<T> v1 = applyTo(vector(1, 0, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16440);final FieldVector3D<T> v2 = applyInverseTo(vector(0, 1, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16441);if (((((v2.getX().getReal() < -0.9999999999) || (v2.getX().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16442)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16443)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16444);throw new CardanEulerSingularityException(true);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16445);return buildArray(v1.getZ().negate().atan2(v1.getX()),
                              v2.getX().asin(),
                              v2.getZ().negate().atan2(v2.getY()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16446);if ((((order == RotationOrder.ZXY)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16447)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16448)==0&false))) {{

            // r (+J) coordinates are :
            // -cos (phi) sin (psi), cos (phi) cos (psi), sin (phi)
            // (-r) (+K) coordinates are :
            // -sin (theta) cos (phi), sin (phi), cos (theta) cos (phi)
            // and we can choose to have phi in the interval [-PI/2 ; +PI/2]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16449);final FieldVector3D<T> v1 = applyTo(vector(0, 1, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16450);final FieldVector3D<T> v2 = applyInverseTo(vector(0, 0, 1));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16451);if (((((v2.getY().getReal() < -0.9999999999) || (v2.getY().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16452)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16453)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16454);throw new CardanEulerSingularityException(true);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16455);return buildArray(v1.getX().negate().atan2(v1.getY()),
                              v2.getY().asin(),
                              v2.getX().negate().atan2(v2.getZ()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16456);if ((((order == RotationOrder.ZYX)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16457)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16458)==0&false))) {{

            // r (+I) coordinates are :
            //  cos (theta) cos (psi), cos (theta) sin (psi), -sin (theta)
            // (-r) (+K) coordinates are :
            // -sin (theta), sin (phi) cos (theta), cos (phi) cos (theta)
            // and we can choose to have theta in the interval [-PI/2 ; +PI/2]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16459);final FieldVector3D<T> v1 = applyTo(vector(1, 0, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16460);final FieldVector3D<T> v2 = applyInverseTo(vector(0, 0, 1));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16461);if (((((v2.getX().getReal() < -0.9999999999) || (v2.getX().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16462)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16463)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16464);throw new CardanEulerSingularityException(true);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16465);return buildArray(v1.getY().atan2(v1.getX()),
                              v2.getX().asin().negate(),
                              v2.getY().atan2(v2.getZ()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16466);if ((((order == RotationOrder.XYX)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16467)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16468)==0&false))) {{

            // r (+I) coordinates are :
            //  cos (theta), sin (phi1) sin (theta), -cos (phi1) sin (theta)
            // (-r) (+I) coordinates are :
            // cos (theta), sin (theta) sin (phi2), sin (theta) cos (phi2)
            // and we can choose to have theta in the interval [0 ; PI]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16469);final FieldVector3D<T> v1 = applyTo(vector(1, 0, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16470);final FieldVector3D<T> v2 = applyInverseTo(vector(1, 0, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16471);if (((((v2.getX().getReal() < -0.9999999999) || (v2.getX().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16472)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16473)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16474);throw new CardanEulerSingularityException(false);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16475);return buildArray(v1.getY().atan2(v1.getZ().negate()),
                              v2.getX().acos(),
                              v2.getY().atan2(v2.getZ()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16476);if ((((order == RotationOrder.XZX)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16477)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16478)==0&false))) {{

            // r (+I) coordinates are :
            //  cos (psi), cos (phi1) sin (psi), sin (phi1) sin (psi)
            // (-r) (+I) coordinates are :
            // cos (psi), -sin (psi) cos (phi2), sin (psi) sin (phi2)
            // and we can choose to have psi in the interval [0 ; PI]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16479);final FieldVector3D<T> v1 = applyTo(vector(1, 0, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16480);final FieldVector3D<T> v2 = applyInverseTo(vector(1, 0, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16481);if (((((v2.getX().getReal() < -0.9999999999) || (v2.getX().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16482)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16483)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16484);throw new CardanEulerSingularityException(false);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16485);return buildArray(v1.getZ().atan2(v1.getY()),
                              v2.getX().acos(),
                              v2.getZ().atan2(v2.getY().negate()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16486);if ((((order == RotationOrder.YXY)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16487)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16488)==0&false))) {{

            // r (+J) coordinates are :
            //  sin (theta1) sin (phi), cos (phi), cos (theta1) sin (phi)
            // (-r) (+J) coordinates are :
            // sin (phi) sin (theta2), cos (phi), -sin (phi) cos (theta2)
            // and we can choose to have phi in the interval [0 ; PI]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16489);final FieldVector3D<T> v1 = applyTo(vector(0, 1, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16490);final FieldVector3D<T> v2 = applyInverseTo(vector(0, 1, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16491);if (((((v2.getY().getReal() < -0.9999999999) || (v2.getY().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16492)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16493)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16494);throw new CardanEulerSingularityException(false);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16495);return buildArray(v1.getX().atan2(v1.getZ()),
                              v2.getY().acos(),
                              v2.getX().atan2(v2.getZ().negate()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16496);if ((((order == RotationOrder.YZY)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16497)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16498)==0&false))) {{

            // r (+J) coordinates are :
            //  -cos (theta1) sin (psi), cos (psi), sin (theta1) sin (psi)
            // (-r) (+J) coordinates are :
            // sin (psi) cos (theta2), cos (psi), sin (psi) sin (theta2)
            // and we can choose to have psi in the interval [0 ; PI]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16499);final FieldVector3D<T> v1 = applyTo(vector(0, 1, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16500);final FieldVector3D<T> v2 = applyInverseTo(vector(0, 1, 0));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16501);if (((((v2.getY().getReal() < -0.9999999999) || (v2.getY().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16502)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16503)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16504);throw new CardanEulerSingularityException(false);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16505);return buildArray(v1.getZ().atan2(v1.getX().negate()),
                              v2.getY().acos(),
                              v2.getZ().atan2(v2.getX()));

        } }else {__CLR4_4_1cj2cj2lb90p86w.R.inc(16506);if ((((order == RotationOrder.ZXZ)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16507)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16508)==0&false))) {{

            // r (+K) coordinates are :
            //  sin (psi1) sin (phi), -cos (psi1) sin (phi), cos (phi)
            // (-r) (+K) coordinates are :
            // sin (phi) sin (psi2), sin (phi) cos (psi2), cos (phi)
            // and we can choose to have phi in the interval [0 ; PI]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16509);final FieldVector3D<T> v1 = applyTo(vector(0, 0, 1));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16510);final FieldVector3D<T> v2 = applyInverseTo(vector(0, 0, 1));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16511);if (((((v2.getZ().getReal() < -0.9999999999) || (v2.getZ().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16512)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16513)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16514);throw new CardanEulerSingularityException(false);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16515);return buildArray(v1.getX().atan2(v1.getY().negate()),
                              v2.getZ().acos(),
                              v2.getX().atan2(v2.getY()));

        } }else {{ // last possibility is ZYZ

            // r (+K) coordinates are :
            //  cos (psi1) sin (theta), sin (psi1) sin (theta), cos (theta)
            // (-r) (+K) coordinates are :
            // -sin (theta) cos (psi2), sin (theta) sin (psi2), cos (theta)
            // and we can choose to have theta in the interval [0 ; PI]
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16516);final FieldVector3D<T> v1 = applyTo(vector(0, 0, 1));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16517);final FieldVector3D<T> v2 = applyInverseTo(vector(0, 0, 1));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16518);if (((((v2.getZ().getReal() < -0.9999999999) || (v2.getZ().getReal() > 0.9999999999))&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16519)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16520)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16521);throw new CardanEulerSingularityException(false);
            }
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16522);return buildArray(v1.getY().atan2(v1.getX()),
                              v2.getZ().acos(),
                              v2.getY().atan2(v2.getX().negate()));

        }

    }}}}}}}}}}}}finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Create a dimension 3 array.
     * @param a0 first array element
     * @param a1 second array element
     * @param a2 third array element
     * @return new array
     */
    private T[] buildArray(final T a0, final T a1, final T a2) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16523);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16524);final T[] array = MathArrays.buildArray(a0.getField(), 3);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16525);array[0] = a0;
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16526);array[1] = a1;
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16527);array[2] = a2;
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16528);return array;
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Create a constant vector.
     * @param x abscissa
     * @param y ordinate
     * @param z height
     * @return a constant vector
     */
    private FieldVector3D<T> vector(final double x, final double y, final double z) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16529);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16530);final T zero = q0.getField().getZero();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16531);return new FieldVector3D<T>(zero.add(x), zero.add(y), zero.add(z));
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Get the 3X3 matrix corresponding to the instance
     * @return the matrix corresponding to the instance
     */
    public T[][] getMatrix() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16532);

        // products
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16533);final T q0q0  = q0.multiply(q0);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16534);final T q0q1  = q0.multiply(q1);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16535);final T q0q2  = q0.multiply(q2);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16536);final T q0q3  = q0.multiply(q3);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16537);final T q1q1  = q1.multiply(q1);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16538);final T q1q2  = q1.multiply(q2);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16539);final T q1q3  = q1.multiply(q3);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16540);final T q2q2  = q2.multiply(q2);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16541);final T q2q3  = q2.multiply(q3);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16542);final T q3q3  = q3.multiply(q3);

        // create the matrix
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16543);final T[][] m = MathArrays.buildArray(q0.getField(), 3, 3);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16544);m [0][0] = q0q0.add(q1q1).multiply(2).subtract(1);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16545);m [1][0] = q1q2.subtract(q0q3).multiply(2);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16546);m [2][0] = q1q3.add(q0q2).multiply(2);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16547);m [0][1] = q1q2.add(q0q3).multiply(2);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16548);m [1][1] = q0q0.add(q2q2).multiply(2).subtract(1);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16549);m [2][1] = q2q3.subtract(q0q1).multiply(2);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16550);m [0][2] = q1q3.subtract(q0q2).multiply(2);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16551);m [1][2] = q2q3.add(q0q1).multiply(2);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16552);m [2][2] = q0q0.add(q3q3).multiply(2).subtract(1);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16553);return m;

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Convert to a constant vector without derivatives.
     * @return a constant vector
     */
    public Rotation toRotation() {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16554);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16555);return new Rotation(q0.getReal(), q1.getReal(), q2.getReal(), q3.getReal(), false);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the rotation to a vector.
     * @param u vector to apply the rotation to
     * @return a new vector which is the image of u by the rotation
     */
    public FieldVector3D<T> applyTo(final FieldVector3D<T> u) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16556);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16557);final T x = u.getX();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16558);final T y = u.getY();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16559);final T z = u.getZ();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16560);final T s = q1.multiply(x).add(q2.multiply(y)).add(q3.multiply(z));

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16561);return new FieldVector3D<T>(q0.multiply(x.multiply(q0).subtract(q2.multiply(z).subtract(q3.multiply(y)))).add(s.multiply(q1)).multiply(2).subtract(x),
                                    q0.multiply(y.multiply(q0).subtract(q3.multiply(x).subtract(q1.multiply(z)))).add(s.multiply(q2)).multiply(2).subtract(y),
                                    q0.multiply(z.multiply(q0).subtract(q1.multiply(y).subtract(q2.multiply(x)))).add(s.multiply(q3)).multiply(2).subtract(z));

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the rotation to a vector.
     * @param u vector to apply the rotation to
     * @return a new vector which is the image of u by the rotation
     */
    public FieldVector3D<T> applyTo(final Vector3D u) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16562);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16563);final double x = u.getX();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16564);final double y = u.getY();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16565);final double z = u.getZ();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16566);final T s = q1.multiply(x).add(q2.multiply(y)).add(q3.multiply(z));

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16567);return new FieldVector3D<T>(q0.multiply(q0.multiply(x).subtract(q2.multiply(z).subtract(q3.multiply(y)))).add(s.multiply(q1)).multiply(2).subtract(x),
                                    q0.multiply(q0.multiply(y).subtract(q3.multiply(x).subtract(q1.multiply(z)))).add(s.multiply(q2)).multiply(2).subtract(y),
                                    q0.multiply(q0.multiply(z).subtract(q1.multiply(y).subtract(q2.multiply(x)))).add(s.multiply(q3)).multiply(2).subtract(z));

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the rotation to a vector stored in an array.
     * @param in an array with three items which stores vector to rotate
     * @param out an array with three items to put result to (it can be the same
     * array as in)
     */
    public void applyTo(final T[] in, final T[] out) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16568);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16569);final T x = in[0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16570);final T y = in[1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16571);final T z = in[2];

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16572);final T s = q1.multiply(x).add(q2.multiply(y)).add(q3.multiply(z));

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16573);out[0] = q0.multiply(x.multiply(q0).subtract(q2.multiply(z).subtract(q3.multiply(y)))).add(s.multiply(q1)).multiply(2).subtract(x);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16574);out[1] = q0.multiply(y.multiply(q0).subtract(q3.multiply(x).subtract(q1.multiply(z)))).add(s.multiply(q2)).multiply(2).subtract(y);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16575);out[2] = q0.multiply(z.multiply(q0).subtract(q1.multiply(y).subtract(q2.multiply(x)))).add(s.multiply(q3)).multiply(2).subtract(z);

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the rotation to a vector stored in an array.
     * @param in an array with three items which stores vector to rotate
     * @param out an array with three items to put result to
     */
    public void applyTo(final double[] in, final T[] out) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16576);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16577);final double x = in[0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16578);final double y = in[1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16579);final double z = in[2];

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16580);final T s = q1.multiply(x).add(q2.multiply(y)).add(q3.multiply(z));

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16581);out[0] = q0.multiply(q0.multiply(x).subtract(q2.multiply(z).subtract(q3.multiply(y)))).add(s.multiply(q1)).multiply(2).subtract(x);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16582);out[1] = q0.multiply(q0.multiply(y).subtract(q3.multiply(x).subtract(q1.multiply(z)))).add(s.multiply(q2)).multiply(2).subtract(y);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16583);out[2] = q0.multiply(q0.multiply(z).subtract(q1.multiply(y).subtract(q2.multiply(x)))).add(s.multiply(q3)).multiply(2).subtract(z);

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply a rotation to a vector.
     * @param r rotation to apply
     * @param u vector to apply the rotation to
     * @param <T> the type of the field elements
     * @return a new vector which is the image of u by the rotation
     */
    public static <T extends RealFieldElement<T>> FieldVector3D<T> applyTo(final Rotation r, final FieldVector3D<T> u) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16584);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16585);final T x = u.getX();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16586);final T y = u.getY();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16587);final T z = u.getZ();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16588);final T s = x.multiply(r.getQ1()).add(y.multiply(r.getQ2())).add(z.multiply(r.getQ3()));

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16589);return new FieldVector3D<T>(x.multiply(r.getQ0()).subtract(z.multiply(r.getQ2()).subtract(y.multiply(r.getQ3()))).multiply(r.getQ0()).add(s.multiply(r.getQ1())).multiply(2).subtract(x),
                                    y.multiply(r.getQ0()).subtract(x.multiply(r.getQ3()).subtract(z.multiply(r.getQ1()))).multiply(r.getQ0()).add(s.multiply(r.getQ2())).multiply(2).subtract(y),
                                    z.multiply(r.getQ0()).subtract(y.multiply(r.getQ1()).subtract(x.multiply(r.getQ2()))).multiply(r.getQ0()).add(s.multiply(r.getQ3())).multiply(2).subtract(z));

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the inverse of the rotation to a vector.
     * @param u vector to apply the inverse of the rotation to
     * @return a new vector which such that u is its image by the rotation
     */
    public FieldVector3D<T> applyInverseTo(final FieldVector3D<T> u) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16590);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16591);final T x = u.getX();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16592);final T y = u.getY();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16593);final T z = u.getZ();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16594);final T s  = q1.multiply(x).add(q2.multiply(y)).add(q3.multiply(z));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16595);final T m0 = q0.negate();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16596);return new FieldVector3D<T>(m0.multiply(x.multiply(m0).subtract(q2.multiply(z).subtract(q3.multiply(y)))).add(s.multiply(q1)).multiply(2).subtract(x),
                                    m0.multiply(y.multiply(m0).subtract(q3.multiply(x).subtract(q1.multiply(z)))).add(s.multiply(q2)).multiply(2).subtract(y),
                                    m0.multiply(z.multiply(m0).subtract(q1.multiply(y).subtract(q2.multiply(x)))).add(s.multiply(q3)).multiply(2).subtract(z));

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the inverse of the rotation to a vector.
     * @param u vector to apply the inverse of the rotation to
     * @return a new vector which such that u is its image by the rotation
     */
    public FieldVector3D<T> applyInverseTo(final Vector3D u) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16597);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16598);final double x = u.getX();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16599);final double y = u.getY();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16600);final double z = u.getZ();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16601);final T s  = q1.multiply(x).add(q2.multiply(y)).add(q3.multiply(z));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16602);final T m0 = q0.negate();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16603);return new FieldVector3D<T>(m0.multiply(m0.multiply(x).subtract(q2.multiply(z).subtract(q3.multiply(y)))).add(s.multiply(q1)).multiply(2).subtract(x),
                                    m0.multiply(m0.multiply(y).subtract(q3.multiply(x).subtract(q1.multiply(z)))).add(s.multiply(q2)).multiply(2).subtract(y),
                                    m0.multiply(m0.multiply(z).subtract(q1.multiply(y).subtract(q2.multiply(x)))).add(s.multiply(q3)).multiply(2).subtract(z));

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the inverse of the rotation to a vector stored in an array.
     * @param in an array with three items which stores vector to rotate
     * @param out an array with three items to put result to (it can be the same
     * array as in)
     */
    public void applyInverseTo(final T[] in, final T[] out) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16604);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16605);final T x = in[0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16606);final T y = in[1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16607);final T z = in[2];

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16608);final T s = q1.multiply(x).add(q2.multiply(y)).add(q3.multiply(z));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16609);final T m0 = q0.negate();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16610);out[0] = m0.multiply(x.multiply(m0).subtract(q2.multiply(z).subtract(q3.multiply(y)))).add(s.multiply(q1)).multiply(2).subtract(x);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16611);out[1] = m0.multiply(y.multiply(m0).subtract(q3.multiply(x).subtract(q1.multiply(z)))).add(s.multiply(q2)).multiply(2).subtract(y);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16612);out[2] = m0.multiply(z.multiply(m0).subtract(q1.multiply(y).subtract(q2.multiply(x)))).add(s.multiply(q3)).multiply(2).subtract(z);

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the inverse of the rotation to a vector stored in an array.
     * @param in an array with three items which stores vector to rotate
     * @param out an array with three items to put result to
     */
    public void applyInverseTo(final double[] in, final T[] out) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16613);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16614);final double x = in[0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16615);final double y = in[1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16616);final double z = in[2];

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16617);final T s = q1.multiply(x).add(q2.multiply(y)).add(q3.multiply(z));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16618);final T m0 = q0.negate();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16619);out[0] = m0.multiply(m0.multiply(x).subtract(q2.multiply(z).subtract(q3.multiply(y)))).add(s.multiply(q1)).multiply(2).subtract(x);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16620);out[1] = m0.multiply(m0.multiply(y).subtract(q3.multiply(x).subtract(q1.multiply(z)))).add(s.multiply(q2)).multiply(2).subtract(y);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16621);out[2] = m0.multiply(m0.multiply(z).subtract(q1.multiply(y).subtract(q2.multiply(x)))).add(s.multiply(q3)).multiply(2).subtract(z);

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the inverse of a rotation to a vector.
     * @param r rotation to apply
     * @param u vector to apply the inverse of the rotation to
     * @param <T> the type of the field elements
     * @return a new vector which such that u is its image by the rotation
     */
    public static <T extends RealFieldElement<T>> FieldVector3D<T> applyInverseTo(final Rotation r, final FieldVector3D<T> u) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16622);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16623);final T x = u.getX();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16624);final T y = u.getY();
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16625);final T z = u.getZ();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16626);final T s  = x.multiply(r.getQ1()).add(y.multiply(r.getQ2())).add(z.multiply(r.getQ3()));
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16627);final double m0 = -r.getQ0();

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16628);return new FieldVector3D<T>(x.multiply(m0).subtract(z.multiply(r.getQ2()).subtract(y.multiply(r.getQ3()))).multiply(m0).add(s.multiply(r.getQ1())).multiply(2).subtract(x),
                                    y.multiply(m0).subtract(x.multiply(r.getQ3()).subtract(z.multiply(r.getQ1()))).multiply(m0).add(s.multiply(r.getQ2())).multiply(2).subtract(y),
                                    z.multiply(m0).subtract(y.multiply(r.getQ1()).subtract(x.multiply(r.getQ2()))).multiply(m0).add(s.multiply(r.getQ3())).multiply(2).subtract(z));

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the instance to another rotation.
     * Applying the instance to a rotation is computing the composition
     * in an order compliant with the following rule : let u be any
     * vector and v its image by r (i.e. r.applyTo(u) = v), let w be the image
     * of v by the instance (i.e. applyTo(v) = w), then w = comp.applyTo(u),
     * where comp = applyTo(r).
     * @param r rotation to apply the rotation to
     * @return a new rotation which is the composition of r by the instance
     */
    public FieldRotation<T> applyTo(final FieldRotation<T> r) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16629);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16630);return new FieldRotation<T>(r.q0.multiply(q0).subtract(r.q1.multiply(q1).add(r.q2.multiply(q2)).add(r.q3.multiply(q3))),
                                    r.q1.multiply(q0).add(r.q0.multiply(q1)).add(r.q2.multiply(q3).subtract(r.q3.multiply(q2))),
                                    r.q2.multiply(q0).add(r.q0.multiply(q2)).add(r.q3.multiply(q1).subtract(r.q1.multiply(q3))),
                                    r.q3.multiply(q0).add(r.q0.multiply(q3)).add(r.q1.multiply(q2).subtract(r.q2.multiply(q1))),
                                    false);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the instance to another rotation.
     * Applying the instance to a rotation is computing the composition
     * in an order compliant with the following rule : let u be any
     * vector and v its image by r (i.e. r.applyTo(u) = v), let w be the image
     * of v by the instance (i.e. applyTo(v) = w), then w = comp.applyTo(u),
     * where comp = applyTo(r).
     * @param r rotation to apply the rotation to
     * @return a new rotation which is the composition of r by the instance
     */
    public FieldRotation<T> applyTo(final Rotation r) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16631);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16632);return new FieldRotation<T>(q0.multiply(r.getQ0()).subtract(q1.multiply(r.getQ1()).add(q2.multiply(r.getQ2())).add(q3.multiply(r.getQ3()))),
                                    q0.multiply(r.getQ1()).add(q1.multiply(r.getQ0())).add(q3.multiply(r.getQ2()).subtract(q2.multiply(r.getQ3()))),
                                    q0.multiply(r.getQ2()).add(q2.multiply(r.getQ0())).add(q1.multiply(r.getQ3()).subtract(q3.multiply(r.getQ1()))),
                                    q0.multiply(r.getQ3()).add(q3.multiply(r.getQ0())).add(q2.multiply(r.getQ1()).subtract(q1.multiply(r.getQ2()))),
                                    false);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply a rotation to another rotation.
     * Applying a rotation to another rotation is computing the composition
     * in an order compliant with the following rule : let u be any
     * vector and v its image by rInner (i.e. rInner.applyTo(u) = v), let w be the image
     * of v by rOuter (i.e. rOuter.applyTo(v) = w), then w = comp.applyTo(u),
     * where comp = applyTo(rOuter, rInner).
     * @param r1 rotation to apply
     * @param rInner rotation to apply the rotation to
     * @param <T> the type of the field elements
     * @return a new rotation which is the composition of r by the instance
     */
    public static <T extends RealFieldElement<T>> FieldRotation<T> applyTo(final Rotation r1, final FieldRotation<T> rInner) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16633);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16634);return new FieldRotation<T>(rInner.q0.multiply(r1.getQ0()).subtract(rInner.q1.multiply(r1.getQ1()).add(rInner.q2.multiply(r1.getQ2())).add(rInner.q3.multiply(r1.getQ3()))),
                                    rInner.q1.multiply(r1.getQ0()).add(rInner.q0.multiply(r1.getQ1())).add(rInner.q2.multiply(r1.getQ3()).subtract(rInner.q3.multiply(r1.getQ2()))),
                                    rInner.q2.multiply(r1.getQ0()).add(rInner.q0.multiply(r1.getQ2())).add(rInner.q3.multiply(r1.getQ1()).subtract(rInner.q1.multiply(r1.getQ3()))),
                                    rInner.q3.multiply(r1.getQ0()).add(rInner.q0.multiply(r1.getQ3())).add(rInner.q1.multiply(r1.getQ2()).subtract(rInner.q2.multiply(r1.getQ1()))),
                                    false);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the inverse of the instance to another rotation.
     * Applying the inverse of the instance to a rotation is computing
     * the composition in an order compliant with the following rule :
     * let u be any vector and v its image by r (i.e. r.applyTo(u) = v),
     * let w be the inverse image of v by the instance
     * (i.e. applyInverseTo(v) = w), then w = comp.applyTo(u), where
     * comp = applyInverseTo(r).
     * @param r rotation to apply the rotation to
     * @return a new rotation which is the composition of r by the inverse
     * of the instance
     */
    public FieldRotation<T> applyInverseTo(final FieldRotation<T> r) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16635);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16636);return new FieldRotation<T>(r.q0.multiply(q0).add(r.q1.multiply(q1).add(r.q2.multiply(q2)).add(r.q3.multiply(q3))).negate(),
                                    r.q0.multiply(q1).add(r.q2.multiply(q3).subtract(r.q3.multiply(q2))).subtract(r.q1.multiply(q0)),
                                    r.q0.multiply(q2).add(r.q3.multiply(q1).subtract(r.q1.multiply(q3))).subtract(r.q2.multiply(q0)),
                                    r.q0.multiply(q3).add(r.q1.multiply(q2).subtract(r.q2.multiply(q1))).subtract(r.q3.multiply(q0)),
                                    false);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the inverse of the instance to another rotation.
     * Applying the inverse of the instance to a rotation is computing
     * the composition in an order compliant with the following rule :
     * let u be any vector and v its image by r (i.e. r.applyTo(u) = v),
     * let w be the inverse image of v by the instance
     * (i.e. applyInverseTo(v) = w), then w = comp.applyTo(u), where
     * comp = applyInverseTo(r).
     * @param r rotation to apply the rotation to
     * @return a new rotation which is the composition of r by the inverse
     * of the instance
     */
    public FieldRotation<T> applyInverseTo(final Rotation r) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16637);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16638);return new FieldRotation<T>(q0.multiply(r.getQ0()).add(q1.multiply(r.getQ1()).add(q2.multiply(r.getQ2())).add(q3.multiply(r.getQ3()))).negate(),
                                    q1.multiply(r.getQ0()).add(q3.multiply(r.getQ2()).subtract(q2.multiply(r.getQ3()))).subtract(q0.multiply(r.getQ1())),
                                    q2.multiply(r.getQ0()).add(q1.multiply(r.getQ3()).subtract(q3.multiply(r.getQ1()))).subtract(q0.multiply(r.getQ2())),
                                    q3.multiply(r.getQ0()).add(q2.multiply(r.getQ1()).subtract(q1.multiply(r.getQ2()))).subtract(q0.multiply(r.getQ3())),
                                    false);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Apply the inverse of a rotation to another rotation.
     * Applying the inverse of a rotation to another rotation is computing
     * the composition in an order compliant with the following rule :
     * let u be any vector and v its image by rInner (i.e. rInner.applyTo(u) = v),
     * let w be the inverse image of v by rOuter
     * (i.e. rOuter.applyInverseTo(v) = w), then w = comp.applyTo(u), where
     * comp = applyInverseTo(rOuter, rInner).
     * @param rOuter rotation to apply the rotation to
     * @param rInner rotation to apply the rotation to
     * @param <T> the type of the field elements
     * @return a new rotation which is the composition of r by the inverse
     * of the instance
     */
    public static <T extends RealFieldElement<T>> FieldRotation<T> applyInverseTo(final Rotation rOuter, final FieldRotation<T> rInner) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16639);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16640);return new FieldRotation<T>(rInner.q0.multiply(rOuter.getQ0()).add(rInner.q1.multiply(rOuter.getQ1()).add(rInner.q2.multiply(rOuter.getQ2())).add(rInner.q3.multiply(rOuter.getQ3()))).negate(),
                                    rInner.q0.multiply(rOuter.getQ1()).add(rInner.q2.multiply(rOuter.getQ3()).subtract(rInner.q3.multiply(rOuter.getQ2()))).subtract(rInner.q1.multiply(rOuter.getQ0())),
                                    rInner.q0.multiply(rOuter.getQ2()).add(rInner.q3.multiply(rOuter.getQ1()).subtract(rInner.q1.multiply(rOuter.getQ3()))).subtract(rInner.q2.multiply(rOuter.getQ0())),
                                    rInner.q0.multiply(rOuter.getQ3()).add(rInner.q1.multiply(rOuter.getQ2()).subtract(rInner.q2.multiply(rOuter.getQ1()))).subtract(rInner.q3.multiply(rOuter.getQ0())),
                                    false);
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Perfect orthogonality on a 3X3 matrix.
     * @param m initial matrix (not exactly orthogonal)
     * @param threshold convergence threshold for the iterative
     * orthogonality correction (convergence is reached when the
     * difference between two steps of the Frobenius norm of the
     * correction is below this threshold)
     * @return an orthogonal matrix close to m
     * @exception NotARotationMatrixException if the matrix cannot be
     * orthogonalized with the given threshold after 10 iterations
     */
    private T[][] orthogonalizeMatrix(final T[][] m, final double threshold)
        throws NotARotationMatrixException {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16641);

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16642);T x00 = m[0][0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16643);T x01 = m[0][1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16644);T x02 = m[0][2];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16645);T x10 = m[1][0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16646);T x11 = m[1][1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16647);T x12 = m[1][2];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16648);T x20 = m[2][0];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16649);T x21 = m[2][1];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16650);T x22 = m[2][2];
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16651);double fn = 0;
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16652);double fn1;

        __CLR4_4_1cj2cj2lb90p86w.R.inc(16653);final T[][] o = MathArrays.buildArray(m[0][0].getField(), 3, 3);

        // iterative correction: Xn+1 = Xn - 0.5 * (Xn.Mt.Xn - M)
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16654);int i = 0;
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16655);while ((((++i < 11)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16656)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16657)==0&false))) {{

            // Mt.Xn
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16658);final T mx00 = m[0][0].multiply(x00).add(m[1][0].multiply(x10)).add(m[2][0].multiply(x20));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16659);final T mx10 = m[0][1].multiply(x00).add(m[1][1].multiply(x10)).add(m[2][1].multiply(x20));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16660);final T mx20 = m[0][2].multiply(x00).add(m[1][2].multiply(x10)).add(m[2][2].multiply(x20));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16661);final T mx01 = m[0][0].multiply(x01).add(m[1][0].multiply(x11)).add(m[2][0].multiply(x21));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16662);final T mx11 = m[0][1].multiply(x01).add(m[1][1].multiply(x11)).add(m[2][1].multiply(x21));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16663);final T mx21 = m[0][2].multiply(x01).add(m[1][2].multiply(x11)).add(m[2][2].multiply(x21));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16664);final T mx02 = m[0][0].multiply(x02).add(m[1][0].multiply(x12)).add(m[2][0].multiply(x22));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16665);final T mx12 = m[0][1].multiply(x02).add(m[1][1].multiply(x12)).add(m[2][1].multiply(x22));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16666);final T mx22 = m[0][2].multiply(x02).add(m[1][2].multiply(x12)).add(m[2][2].multiply(x22));

            // Xn+1
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16667);o[0][0] = x00.subtract(x00.multiply(mx00).add(x01.multiply(mx10)).add(x02.multiply(mx20)).subtract(m[0][0]).multiply(0.5));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16668);o[0][1] = x01.subtract(x00.multiply(mx01).add(x01.multiply(mx11)).add(x02.multiply(mx21)).subtract(m[0][1]).multiply(0.5));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16669);o[0][2] = x02.subtract(x00.multiply(mx02).add(x01.multiply(mx12)).add(x02.multiply(mx22)).subtract(m[0][2]).multiply(0.5));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16670);o[1][0] = x10.subtract(x10.multiply(mx00).add(x11.multiply(mx10)).add(x12.multiply(mx20)).subtract(m[1][0]).multiply(0.5));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16671);o[1][1] = x11.subtract(x10.multiply(mx01).add(x11.multiply(mx11)).add(x12.multiply(mx21)).subtract(m[1][1]).multiply(0.5));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16672);o[1][2] = x12.subtract(x10.multiply(mx02).add(x11.multiply(mx12)).add(x12.multiply(mx22)).subtract(m[1][2]).multiply(0.5));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16673);o[2][0] = x20.subtract(x20.multiply(mx00).add(x21.multiply(mx10)).add(x22.multiply(mx20)).subtract(m[2][0]).multiply(0.5));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16674);o[2][1] = x21.subtract(x20.multiply(mx01).add(x21.multiply(mx11)).add(x22.multiply(mx21)).subtract(m[2][1]).multiply(0.5));
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16675);o[2][2] = x22.subtract(x20.multiply(mx02).add(x21.multiply(mx12)).add(x22.multiply(mx22)).subtract(m[2][2]).multiply(0.5));

            // correction on each elements
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16676);final double corr00 = o[0][0].getReal() - m[0][0].getReal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16677);final double corr01 = o[0][1].getReal() - m[0][1].getReal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16678);final double corr02 = o[0][2].getReal() - m[0][2].getReal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16679);final double corr10 = o[1][0].getReal() - m[1][0].getReal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16680);final double corr11 = o[1][1].getReal() - m[1][1].getReal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16681);final double corr12 = o[1][2].getReal() - m[1][2].getReal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16682);final double corr20 = o[2][0].getReal() - m[2][0].getReal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16683);final double corr21 = o[2][1].getReal() - m[2][1].getReal();
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16684);final double corr22 = o[2][2].getReal() - m[2][2].getReal();

            // Frobenius norm of the correction
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16685);fn1 = corr00 * corr00 + corr01 * corr01 + corr02 * corr02 +
                  corr10 * corr10 + corr11 * corr11 + corr12 * corr12 +
                  corr20 * corr20 + corr21 * corr21 + corr22 * corr22;

            // convergence test
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16686);if ((((FastMath.abs(fn1 - fn) <= threshold)&&(__CLR4_4_1cj2cj2lb90p86w.R.iget(16687)!=0|true))||(__CLR4_4_1cj2cj2lb90p86w.R.iget(16688)==0&false))) {{
                __CLR4_4_1cj2cj2lb90p86w.R.inc(16689);return o;
            }

            // prepare next iteration
            }__CLR4_4_1cj2cj2lb90p86w.R.inc(16690);x00 = o[0][0];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16691);x01 = o[0][1];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16692);x02 = o[0][2];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16693);x10 = o[1][0];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16694);x11 = o[1][1];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16695);x12 = o[1][2];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16696);x20 = o[2][0];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16697);x21 = o[2][1];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16698);x22 = o[2][2];
            __CLR4_4_1cj2cj2lb90p86w.R.inc(16699);fn  = fn1;

        }

        // the algorithm did not converge after 10 iterations
        }__CLR4_4_1cj2cj2lb90p86w.R.inc(16700);throw new NotARotationMatrixException(LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX,
                                              i - 1);

    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

    /** Compute the <i>distance</i> between two rotations.
     * <p>The <i>distance</i> is intended here as a way to check if two
     * rotations are almost similar (i.e. they transform vectors the same way)
     * or very different. It is mathematically defined as the angle of
     * the rotation r that prepended to one of the rotations gives the other
     * one:</p>
     * <pre>
     *        r<sub>1</sub>(r) = r<sub>2</sub>
     * </pre>
     * <p>This distance is an angle between 0 and &pi;. Its value is the smallest
     * possible upper bound of the angle in radians between r<sub>1</sub>(v)
     * and r<sub>2</sub>(v) for all possible vectors v. This upper bound is
     * reached for some v. The distance is equal to 0 if and only if the two
     * rotations are identical.</p>
     * <p>Comparing two rotations should always be done using this value rather
     * than for example comparing the components of the quaternions. It is much
     * more stable, and has a geometric meaning. Also comparing quaternions
     * components is error prone since for example quaternions (0.36, 0.48, -0.48, -0.64)
     * and (-0.36, -0.48, 0.48, 0.64) represent exactly the same rotation despite
     * their components are different (they are exact opposites).</p>
     * @param r1 first rotation
     * @param r2 second rotation
     * @param <T> the type of the field elements
     * @return <i>distance</i> between r1 and r2
     */
    public static <T extends RealFieldElement<T>> T distance(final FieldRotation<T> r1, final FieldRotation<T> r2) {try{__CLR4_4_1cj2cj2lb90p86w.R.inc(16701);
        __CLR4_4_1cj2cj2lb90p86w.R.inc(16702);return r1.applyInverseTo(r2).getAngle();
    }finally{__CLR4_4_1cj2cj2lb90p86w.R.flushNeeded();}}

}
