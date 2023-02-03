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

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

/**
 * This class implements rotations in a three-dimensional space.
 *
 * <p>Rotations can be represented by several different mathematical
 * entities (matrices, axe and angle, Cardan or Euler angles,
 * quaternions). This class presents an higher level abstraction, more
 * user-oriented and hiding this implementation details. Well, for the
 * curious, we use quaternions for the internal representation. The
 * user can build a rotation from any of these representations, and
 * any of these representations can be retrieved from a
 * <code>Rotation</code> instance (see the various constructors and
 * getters). In addition, a rotation can also be built implicitly
 * from a set of vectors and their image.</p>
 * <p>This implies that this class can be used to convert from one
 * representation to another one. For example, converting a rotation
 * matrix into a set of Cardan angles from can be done using the
 * following single line of code:</p>
 * <pre>
 * double[] angles = new Rotation(matrix, 1.0e-10).getAngles(RotationOrder.XYZ);
 * </pre>
 * <p>Focus is oriented on what a rotation <em>do</em> rather than on its
 * underlying representation. Once it has been built, and regardless of its
 * internal representation, a rotation is an <em>operator</em> which basically
 * transforms three dimensional {@link Vector3D vectors} into other three
 * dimensional {@link Vector3D vectors}. Depending on the application, the
 * meaning of these vectors may vary and the semantics of the rotation also.</p>
 * <p>For example in an spacecraft attitude simulation tool, users will often
 * consider the vectors are fixed (say the Earth direction for example) and the
 * frames change. The rotation transforms the coordinates of the vector in inertial
 * frame into the coordinates of the same vector in satellite frame. In this
 * case, the rotation implicitly defines the relation between the two frames.</p>
 * <p>Another example could be a telescope control application, where the rotation
 * would transform the sighting direction at rest into the desired observing
 * direction when the telescope is pointed towards an object of interest. In this
 * case the rotation transforms the direction at rest in a topocentric frame
 * into the sighting direction in the same topocentric frame. This implies in this
 * case the frame is fixed and the vector moves.</p>
 * <p>In many case, both approaches will be combined. In our telescope example,
 * we will probably also need to transform the observing direction in the topocentric
 * frame into the observing direction in inertial frame taking into account the observatory
 * location and the Earth rotation, which would essentially be an application of the
 * first approach.</p>
 *
 * <p>These examples show that a rotation is what the user wants it to be. This
 * class does not push the user towards one specific definition and hence does not
 * provide methods like <code>projectVectorIntoDestinationFrame</code> or
 * <code>computeTransformedDirection</code>. It provides simpler and more generic
 * methods: {@link #applyTo(Vector3D) applyTo(Vector3D)} and {@link
 * #applyInverseTo(Vector3D) applyInverseTo(Vector3D)}.</p>
 *
 * <p>Since a rotation is basically a vectorial operator, several rotations can be
 * composed together and the composite operation <code>r = r<sub>1</sub> o
 * r<sub>2</sub></code> (which means that for each vector <code>u</code>,
 * <code>r(u) = r<sub>1</sub>(r<sub>2</sub>(u))</code>) is also a rotation. Hence
 * we can consider that in addition to vectors, a rotation can be applied to other
 * rotations as well (or to itself). With our previous notations, we would say we
 * can apply <code>r<sub>1</sub></code> to <code>r<sub>2</sub></code> and the result
 * we get is <code>r = r<sub>1</sub> o r<sub>2</sub></code>. For this purpose, the
 * class provides the methods: {@link #applyTo(Rotation) applyTo(Rotation)} and
 * {@link #applyInverseTo(Rotation) applyInverseTo(Rotation)}.</p>
 *
 * <p>Rotations are guaranteed to be immutable objects.</p>
 *
 * @version $Id$
 * @see Vector3D
 * @see RotationOrder
 * @since 1.2
 */

public class Rotation implements Serializable {public static class __CLR4_4_1dj6dj6lb90p8ax{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,17936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** Identity rotation. */
  public static final Rotation IDENTITY = new Rotation(1.0, 0.0, 0.0, 0.0, false);

  /** Serializable version identifier */
  private static final long serialVersionUID = -2153622329907944313L;

  /** Scalar coordinate of the quaternion. */
  private final double q0;

  /** First coordinate of the vectorial part of the quaternion. */
  private final double q1;

  /** Second coordinate of the vectorial part of the quaternion. */
  private final double q2;

  /** Third coordinate of the vectorial part of the quaternion. */
  private final double q3;

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
  public Rotation(double q0, double q1, double q2, double q3,
                  boolean needsNormalization) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17538);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17539);if ((((needsNormalization)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17540)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17541)==0&false))) {{
      // normalization preprocessing
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17542);double inv = 1.0 / FastMath.sqrt(q0 * q0 + q1 * q1 + q2 * q2 + q3 * q3);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17543);q0 *= inv;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17544);q1 *= inv;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17545);q2 *= inv;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17546);q3 *= inv;
    }

    }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17547);this.q0 = q0;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17548);this.q1 = q1;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17549);this.q2 = q2;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17550);this.q3 = q3;

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Build a rotation from an axis and an angle.
   * <p>We use the convention that angles are oriented according to
   * the effect of the rotation on vectors around the axis. That means
   * that if (i, j, k) is a direct frame and if we first provide +k as
   * the axis and &pi;/2 as the angle to this constructor, and then
   * {@link #applyTo(Vector3D) apply} the instance to +i, we will get
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
  public Rotation(Vector3D axis, double angle) throws MathIllegalArgumentException {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17551);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17552);double norm = axis.getNorm();
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17553);if ((((norm == 0)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17554)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17555)==0&false))) {{
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17556);throw new MathIllegalArgumentException(LocalizedFormats.ZERO_NORM_FOR_ROTATION_AXIS);
    }

    }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17557);double halfAngle = -0.5 * angle;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17558);double coeff = FastMath.sin(halfAngle) / norm;

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17559);q0 = FastMath.cos (halfAngle);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17560);q1 = coeff * axis.getX();
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17561);q2 = coeff * axis.getY();
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17562);q3 = coeff * axis.getZ();

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

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
  public Rotation(double[][] m, double threshold)
    throws NotARotationMatrixException {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17563);

    // dimension check
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17564);if (((((m.length != 3) || (m[0].length != 3) ||
        (m[1].length != 3) || (m[2].length != 3))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17565)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17566)==0&false))) {{
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17567);throw new NotARotationMatrixException(
              LocalizedFormats.ROTATION_MATRIX_DIMENSIONS,
              m.length, m[0].length);
    }

    // compute a "close" orthogonal matrix
    }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17568);double[][] ort = orthogonalizeMatrix(m, threshold);

    // check the sign of the determinant
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17569);double det = ort[0][0] * (ort[1][1] * ort[2][2] - ort[2][1] * ort[1][2]) -
                 ort[1][0] * (ort[0][1] * ort[2][2] - ort[2][1] * ort[0][2]) +
                 ort[2][0] * (ort[0][1] * ort[1][2] - ort[1][1] * ort[0][2]);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17570);if ((((det < 0.0)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17571)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17572)==0&false))) {{
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17573);throw new NotARotationMatrixException(
              LocalizedFormats.CLOSEST_ORTHOGONAL_MATRIX_HAS_NEGATIVE_DETERMINANT,
              det);
    }

    }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17574);double[] quat = mat2quat(ort);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17575);q0 = quat[0];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17576);q1 = quat[1];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17577);q2 = quat[2];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17578);q3 = quat[3];

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

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
  public Rotation(Vector3D u1, Vector3D u2, Vector3D v1, Vector3D v2)
      throws MathArithmeticException {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17579);

      // build orthonormalized base from u1, u2
      // this fails when vectors are null or colinear, which is forbidden to define a rotation
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17580);final Vector3D u3 = u1.crossProduct(u2).normalize();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17581);u2 = u3.crossProduct(u1).normalize();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17582);u1 = u1.normalize();

      // build an orthonormalized base from v1, v2
      // this fails when vectors are null or colinear, which is forbidden to define a rotation
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17583);final Vector3D v3 = v1.crossProduct(v2).normalize();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17584);v2 = v3.crossProduct(v1).normalize();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17585);v1 = v1.normalize();

      // buid a matrix transforming the first base into the second one
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17586);final double[][] m = new double[][] {
          {
              MathArrays.linearCombination(u1.getX(), v1.getX(), u2.getX(), v2.getX(), u3.getX(), v3.getX()),
              MathArrays.linearCombination(u1.getY(), v1.getX(), u2.getY(), v2.getX(), u3.getY(), v3.getX()),
              MathArrays.linearCombination(u1.getZ(), v1.getX(), u2.getZ(), v2.getX(), u3.getZ(), v3.getX())
          },
          {
              MathArrays.linearCombination(u1.getX(), v1.getY(), u2.getX(), v2.getY(), u3.getX(), v3.getY()),
              MathArrays.linearCombination(u1.getY(), v1.getY(), u2.getY(), v2.getY(), u3.getY(), v3.getY()),
              MathArrays.linearCombination(u1.getZ(), v1.getY(), u2.getZ(), v2.getY(), u3.getZ(), v3.getY())
          },
          {
              MathArrays.linearCombination(u1.getX(), v1.getZ(), u2.getX(), v2.getZ(), u3.getX(), v3.getZ()),
              MathArrays.linearCombination(u1.getY(), v1.getZ(), u2.getY(), v2.getZ(), u3.getY(), v3.getZ()),
              MathArrays.linearCombination(u1.getZ(), v1.getZ(), u2.getZ(), v2.getZ(), u3.getZ(), v3.getZ())
          }
      };

      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17587);double[] quat = mat2quat(m);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17588);q0 = quat[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17589);q1 = quat[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17590);q2 = quat[2];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17591);q3 = quat[3];

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

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
  public Rotation(Vector3D u, Vector3D v) throws MathArithmeticException {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17592);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17593);double normProduct = u.getNorm() * v.getNorm();
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17594);if ((((normProduct == 0)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17595)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17596)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17597);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR);
    }

    }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17598);double dot = u.dotProduct(v);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17599);if ((((dot < ((2.0e-15 - 1.0) * normProduct))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17600)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17601)==0&false))) {{
      // special case u = -v: we select a PI angle rotation around
      // an arbitrary vector orthogonal to u
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17602);Vector3D w = u.orthogonal();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17603);q0 = 0.0;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17604);q1 = -w.getX();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17605);q2 = -w.getY();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17606);q3 = -w.getZ();
    } }else {{
      // general case: (u, v) defines a plane, we select
      // the shortest possible rotation: axis orthogonal to this plane
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17607);q0 = FastMath.sqrt(0.5 * (1.0 + dot / normProduct));
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17608);double coeff = 1.0 / (2.0 * q0 * normProduct);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17609);Vector3D q = v.crossProduct(u);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17610);q1 = coeff * q.getX();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17611);q2 = coeff * q.getY();
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17612);q3 = coeff * q.getZ();
    }

  }}finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

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
  public Rotation(RotationOrder order,
                  double alpha1, double alpha2, double alpha3) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17613);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17614);Rotation r1 = new Rotation(order.getA1(), alpha1);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17615);Rotation r2 = new Rotation(order.getA2(), alpha2);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17616);Rotation r3 = new Rotation(order.getA3(), alpha3);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17617);Rotation composed = r1.applyTo(r2.applyTo(r3));
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17618);q0 = composed.q0;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17619);q1 = composed.q1;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17620);q2 = composed.q2;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17621);q3 = composed.q3;
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Convert an orthogonal rotation matrix to a quaternion.
   * @param ort orthogonal rotation matrix
   * @return quaternion corresponding to the matrix
   */
  private static double[] mat2quat(final double[][] ort) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17622);

      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17623);final double[] quat = new double[4];

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
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17624);double s = ort[0][0] + ort[1][1] + ort[2][2];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17625);if ((((s > -0.19)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17626)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17627)==0&false))) {{
          // compute q0 and deduce q1, q2 and q3
          __CLR4_4_1dj6dj6lb90p8ax.R.inc(17628);quat[0] = 0.5 * FastMath.sqrt(s + 1.0);
          __CLR4_4_1dj6dj6lb90p8ax.R.inc(17629);double inv = 0.25 / quat[0];
          __CLR4_4_1dj6dj6lb90p8ax.R.inc(17630);quat[1] = inv * (ort[1][2] - ort[2][1]);
          __CLR4_4_1dj6dj6lb90p8ax.R.inc(17631);quat[2] = inv * (ort[2][0] - ort[0][2]);
          __CLR4_4_1dj6dj6lb90p8ax.R.inc(17632);quat[3] = inv * (ort[0][1] - ort[1][0]);
      } }else {{
          __CLR4_4_1dj6dj6lb90p8ax.R.inc(17633);s = ort[0][0] - ort[1][1] - ort[2][2];
          __CLR4_4_1dj6dj6lb90p8ax.R.inc(17634);if ((((s > -0.19)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17635)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17636)==0&false))) {{
              // compute q1 and deduce q0, q2 and q3
              __CLR4_4_1dj6dj6lb90p8ax.R.inc(17637);quat[1] = 0.5 * FastMath.sqrt(s + 1.0);
              __CLR4_4_1dj6dj6lb90p8ax.R.inc(17638);double inv = 0.25 / quat[1];
              __CLR4_4_1dj6dj6lb90p8ax.R.inc(17639);quat[0] = inv * (ort[1][2] - ort[2][1]);
              __CLR4_4_1dj6dj6lb90p8ax.R.inc(17640);quat[2] = inv * (ort[0][1] + ort[1][0]);
              __CLR4_4_1dj6dj6lb90p8ax.R.inc(17641);quat[3] = inv * (ort[0][2] + ort[2][0]);
          } }else {{
              __CLR4_4_1dj6dj6lb90p8ax.R.inc(17642);s = ort[1][1] - ort[0][0] - ort[2][2];
              __CLR4_4_1dj6dj6lb90p8ax.R.inc(17643);if ((((s > -0.19)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17644)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17645)==0&false))) {{
                  // compute q2 and deduce q0, q1 and q3
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17646);quat[2] = 0.5 * FastMath.sqrt(s + 1.0);
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17647);double inv = 0.25 / quat[2];
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17648);quat[0] = inv * (ort[2][0] - ort[0][2]);
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17649);quat[1] = inv * (ort[0][1] + ort[1][0]);
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17650);quat[3] = inv * (ort[2][1] + ort[1][2]);
              } }else {{
                  // compute q3 and deduce q0, q1 and q2
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17651);s = ort[2][2] - ort[0][0] - ort[1][1];
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17652);quat[3] = 0.5 * FastMath.sqrt(s + 1.0);
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17653);double inv = 0.25 / quat[3];
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17654);quat[0] = inv * (ort[0][1] - ort[1][0]);
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17655);quat[1] = inv * (ort[0][2] + ort[2][0]);
                  __CLR4_4_1dj6dj6lb90p8ax.R.inc(17656);quat[2] = inv * (ort[2][1] + ort[1][2]);
              }
          }}
      }}

      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17657);return quat;

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Revert a rotation.
   * Build a rotation which reverse the effect of another
   * rotation. This means that if r(u) = v, then r.revert(v) = u. The
   * instance is not changed.
   * @return a new rotation whose effect is the reverse of the effect
   * of the instance
   */
  public Rotation revert() {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17658);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17659);return new Rotation(-q0, q1, q2, q3, false);
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Get the scalar coordinate of the quaternion.
   * @return scalar coordinate of the quaternion
   */
  public double getQ0() {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17660);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17661);return q0;
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Get the first coordinate of the vectorial part of the quaternion.
   * @return first coordinate of the vectorial part of the quaternion
   */
  public double getQ1() {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17662);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17663);return q1;
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Get the second coordinate of the vectorial part of the quaternion.
   * @return second coordinate of the vectorial part of the quaternion
   */
  public double getQ2() {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17664);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17665);return q2;
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Get the third coordinate of the vectorial part of the quaternion.
   * @return third coordinate of the vectorial part of the quaternion
   */
  public double getQ3() {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17666);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17667);return q3;
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Get the normalized axis of the rotation.
   * @return normalized axis of the rotation
   * @see #Rotation(Vector3D, double)
   */
  public Vector3D getAxis() {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17668);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17669);double squaredSine = q1 * q1 + q2 * q2 + q3 * q3;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17670);if ((((squaredSine == 0)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17671)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17672)==0&false))) {{
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17673);return new Vector3D(1, 0, 0);
    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17674);if ((((q0 < 0)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17675)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17676)==0&false))) {{
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17677);double inverse = 1 / FastMath.sqrt(squaredSine);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17678);return new Vector3D(q1 * inverse, q2 * inverse, q3 * inverse);
    }
    }}__CLR4_4_1dj6dj6lb90p8ax.R.inc(17679);double inverse = -1 / FastMath.sqrt(squaredSine);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17680);return new Vector3D(q1 * inverse, q2 * inverse, q3 * inverse);
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Get the angle of the rotation.
   * @return angle of the rotation (between 0 and &pi;)
   * @see #Rotation(Vector3D, double)
   */
  public double getAngle() {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17681);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17682);if (((((q0 < -0.1) || (q0 > 0.1))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17683)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17684)==0&false))) {{
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17685);return 2 * FastMath.asin(FastMath.sqrt(q1 * q1 + q2 * q2 + q3 * q3));
    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17686);if ((((q0 < 0)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17687)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17688)==0&false))) {{
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17689);return 2 * FastMath.acos(-q0);
    }
    }}__CLR4_4_1dj6dj6lb90p8ax.R.inc(17690);return 2 * FastMath.acos(q0);
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

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
  public double[] getAngles(RotationOrder order)
    throws CardanEulerSingularityException {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17691);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17692);if ((((order == RotationOrder.XYZ)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17693)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17694)==0&false))) {{

      // r (Vector3D.plusK) coordinates are :
      //  sin (theta), -cos (theta) sin (phi), cos (theta) cos (phi)
      // (-r) (Vector3D.plusI) coordinates are :
      // cos (psi) cos (theta), -sin (psi) cos (theta), sin (theta)
      // and we can choose to have theta in the interval [-PI/2 ; +PI/2]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17695);Vector3D v1 = applyTo(Vector3D.PLUS_K);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17696);Vector3D v2 = applyInverseTo(Vector3D.PLUS_I);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17697);if  (((((v2.getZ() < -0.9999999999) || (v2.getZ() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17698)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17699)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17700);throw new CardanEulerSingularityException(true);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17701);return new double[] {
        FastMath.atan2(-(v1.getY()), v1.getZ()),
        FastMath.asin(v2.getZ()),
        FastMath.atan2(-(v2.getY()), v2.getX())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17702);if ((((order == RotationOrder.XZY)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17703)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17704)==0&false))) {{

      // r (Vector3D.plusJ) coordinates are :
      // -sin (psi), cos (psi) cos (phi), cos (psi) sin (phi)
      // (-r) (Vector3D.plusI) coordinates are :
      // cos (theta) cos (psi), -sin (psi), sin (theta) cos (psi)
      // and we can choose to have psi in the interval [-PI/2 ; +PI/2]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17705);Vector3D v1 = applyTo(Vector3D.PLUS_J);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17706);Vector3D v2 = applyInverseTo(Vector3D.PLUS_I);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17707);if (((((v2.getY() < -0.9999999999) || (v2.getY() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17708)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17709)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17710);throw new CardanEulerSingularityException(true);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17711);return new double[] {
        FastMath.atan2(v1.getZ(), v1.getY()),
       -FastMath.asin(v2.getY()),
        FastMath.atan2(v2.getZ(), v2.getX())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17712);if ((((order == RotationOrder.YXZ)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17713)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17714)==0&false))) {{

      // r (Vector3D.plusK) coordinates are :
      //  cos (phi) sin (theta), -sin (phi), cos (phi) cos (theta)
      // (-r) (Vector3D.plusJ) coordinates are :
      // sin (psi) cos (phi), cos (psi) cos (phi), -sin (phi)
      // and we can choose to have phi in the interval [-PI/2 ; +PI/2]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17715);Vector3D v1 = applyTo(Vector3D.PLUS_K);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17716);Vector3D v2 = applyInverseTo(Vector3D.PLUS_J);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17717);if (((((v2.getZ() < -0.9999999999) || (v2.getZ() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17718)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17719)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17720);throw new CardanEulerSingularityException(true);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17721);return new double[] {
        FastMath.atan2(v1.getX(), v1.getZ()),
       -FastMath.asin(v2.getZ()),
        FastMath.atan2(v2.getX(), v2.getY())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17722);if ((((order == RotationOrder.YZX)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17723)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17724)==0&false))) {{

      // r (Vector3D.plusI) coordinates are :
      // cos (psi) cos (theta), sin (psi), -cos (psi) sin (theta)
      // (-r) (Vector3D.plusJ) coordinates are :
      // sin (psi), cos (phi) cos (psi), -sin (phi) cos (psi)
      // and we can choose to have psi in the interval [-PI/2 ; +PI/2]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17725);Vector3D v1 = applyTo(Vector3D.PLUS_I);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17726);Vector3D v2 = applyInverseTo(Vector3D.PLUS_J);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17727);if (((((v2.getX() < -0.9999999999) || (v2.getX() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17728)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17729)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17730);throw new CardanEulerSingularityException(true);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17731);return new double[] {
        FastMath.atan2(-(v1.getZ()), v1.getX()),
        FastMath.asin(v2.getX()),
        FastMath.atan2(-(v2.getZ()), v2.getY())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17732);if ((((order == RotationOrder.ZXY)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17733)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17734)==0&false))) {{

      // r (Vector3D.plusJ) coordinates are :
      // -cos (phi) sin (psi), cos (phi) cos (psi), sin (phi)
      // (-r) (Vector3D.plusK) coordinates are :
      // -sin (theta) cos (phi), sin (phi), cos (theta) cos (phi)
      // and we can choose to have phi in the interval [-PI/2 ; +PI/2]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17735);Vector3D v1 = applyTo(Vector3D.PLUS_J);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17736);Vector3D v2 = applyInverseTo(Vector3D.PLUS_K);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17737);if (((((v2.getY() < -0.9999999999) || (v2.getY() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17738)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17739)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17740);throw new CardanEulerSingularityException(true);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17741);return new double[] {
        FastMath.atan2(-(v1.getX()), v1.getY()),
        FastMath.asin(v2.getY()),
        FastMath.atan2(-(v2.getX()), v2.getZ())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17742);if ((((order == RotationOrder.ZYX)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17743)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17744)==0&false))) {{

      // r (Vector3D.plusI) coordinates are :
      //  cos (theta) cos (psi), cos (theta) sin (psi), -sin (theta)
      // (-r) (Vector3D.plusK) coordinates are :
      // -sin (theta), sin (phi) cos (theta), cos (phi) cos (theta)
      // and we can choose to have theta in the interval [-PI/2 ; +PI/2]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17745);Vector3D v1 = applyTo(Vector3D.PLUS_I);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17746);Vector3D v2 = applyInverseTo(Vector3D.PLUS_K);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17747);if (((((v2.getX() < -0.9999999999) || (v2.getX() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17748)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17749)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17750);throw new CardanEulerSingularityException(true);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17751);return new double[] {
        FastMath.atan2(v1.getY(), v1.getX()),
       -FastMath.asin(v2.getX()),
        FastMath.atan2(v2.getY(), v2.getZ())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17752);if ((((order == RotationOrder.XYX)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17753)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17754)==0&false))) {{

      // r (Vector3D.plusI) coordinates are :
      //  cos (theta), sin (phi1) sin (theta), -cos (phi1) sin (theta)
      // (-r) (Vector3D.plusI) coordinates are :
      // cos (theta), sin (theta) sin (phi2), sin (theta) cos (phi2)
      // and we can choose to have theta in the interval [0 ; PI]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17755);Vector3D v1 = applyTo(Vector3D.PLUS_I);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17756);Vector3D v2 = applyInverseTo(Vector3D.PLUS_I);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17757);if (((((v2.getX() < -0.9999999999) || (v2.getX() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17758)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17759)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17760);throw new CardanEulerSingularityException(false);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17761);return new double[] {
        FastMath.atan2(v1.getY(), -v1.getZ()),
        FastMath.acos(v2.getX()),
        FastMath.atan2(v2.getY(), v2.getZ())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17762);if ((((order == RotationOrder.XZX)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17763)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17764)==0&false))) {{

      // r (Vector3D.plusI) coordinates are :
      //  cos (psi), cos (phi1) sin (psi), sin (phi1) sin (psi)
      // (-r) (Vector3D.plusI) coordinates are :
      // cos (psi), -sin (psi) cos (phi2), sin (psi) sin (phi2)
      // and we can choose to have psi in the interval [0 ; PI]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17765);Vector3D v1 = applyTo(Vector3D.PLUS_I);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17766);Vector3D v2 = applyInverseTo(Vector3D.PLUS_I);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17767);if (((((v2.getX() < -0.9999999999) || (v2.getX() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17768)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17769)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17770);throw new CardanEulerSingularityException(false);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17771);return new double[] {
        FastMath.atan2(v1.getZ(), v1.getY()),
        FastMath.acos(v2.getX()),
        FastMath.atan2(v2.getZ(), -v2.getY())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17772);if ((((order == RotationOrder.YXY)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17773)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17774)==0&false))) {{

      // r (Vector3D.plusJ) coordinates are :
      //  sin (theta1) sin (phi), cos (phi), cos (theta1) sin (phi)
      // (-r) (Vector3D.plusJ) coordinates are :
      // sin (phi) sin (theta2), cos (phi), -sin (phi) cos (theta2)
      // and we can choose to have phi in the interval [0 ; PI]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17775);Vector3D v1 = applyTo(Vector3D.PLUS_J);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17776);Vector3D v2 = applyInverseTo(Vector3D.PLUS_J);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17777);if (((((v2.getY() < -0.9999999999) || (v2.getY() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17778)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17779)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17780);throw new CardanEulerSingularityException(false);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17781);return new double[] {
        FastMath.atan2(v1.getX(), v1.getZ()),
        FastMath.acos(v2.getY()),
        FastMath.atan2(v2.getX(), -v2.getZ())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17782);if ((((order == RotationOrder.YZY)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17783)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17784)==0&false))) {{

      // r (Vector3D.plusJ) coordinates are :
      //  -cos (theta1) sin (psi), cos (psi), sin (theta1) sin (psi)
      // (-r) (Vector3D.plusJ) coordinates are :
      // sin (psi) cos (theta2), cos (psi), sin (psi) sin (theta2)
      // and we can choose to have psi in the interval [0 ; PI]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17785);Vector3D v1 = applyTo(Vector3D.PLUS_J);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17786);Vector3D v2 = applyInverseTo(Vector3D.PLUS_J);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17787);if (((((v2.getY() < -0.9999999999) || (v2.getY() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17788)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17789)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17790);throw new CardanEulerSingularityException(false);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17791);return new double[] {
        FastMath.atan2(v1.getZ(), -v1.getX()),
        FastMath.acos(v2.getY()),
        FastMath.atan2(v2.getZ(), v2.getX())
      };

    } }else {__CLR4_4_1dj6dj6lb90p8ax.R.inc(17792);if ((((order == RotationOrder.ZXZ)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17793)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17794)==0&false))) {{

      // r (Vector3D.plusK) coordinates are :
      //  sin (psi1) sin (phi), -cos (psi1) sin (phi), cos (phi)
      // (-r) (Vector3D.plusK) coordinates are :
      // sin (phi) sin (psi2), sin (phi) cos (psi2), cos (phi)
      // and we can choose to have phi in the interval [0 ; PI]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17795);Vector3D v1 = applyTo(Vector3D.PLUS_K);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17796);Vector3D v2 = applyInverseTo(Vector3D.PLUS_K);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17797);if (((((v2.getZ() < -0.9999999999) || (v2.getZ() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17798)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17799)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17800);throw new CardanEulerSingularityException(false);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17801);return new double[] {
        FastMath.atan2(v1.getX(), -v1.getY()),
        FastMath.acos(v2.getZ()),
        FastMath.atan2(v2.getX(), v2.getY())
      };

    } }else {{ // last possibility is ZYZ

      // r (Vector3D.plusK) coordinates are :
      //  cos (psi1) sin (theta), sin (psi1) sin (theta), cos (theta)
      // (-r) (Vector3D.plusK) coordinates are :
      // -sin (theta) cos (psi2), sin (theta) sin (psi2), cos (theta)
      // and we can choose to have theta in the interval [0 ; PI]
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17802);Vector3D v1 = applyTo(Vector3D.PLUS_K);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17803);Vector3D v2 = applyInverseTo(Vector3D.PLUS_K);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17804);if (((((v2.getZ() < -0.9999999999) || (v2.getZ() > 0.9999999999))&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17805)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17806)==0&false))) {{
        __CLR4_4_1dj6dj6lb90p8ax.R.inc(17807);throw new CardanEulerSingularityException(false);
      }
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17808);return new double[] {
        FastMath.atan2(v1.getY(), v1.getX()),
        FastMath.acos(v2.getZ()),
        FastMath.atan2(v2.getY(), -v2.getX())
      };

    }

  }}}}}}}}}}}}finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Get the 3X3 matrix corresponding to the instance
   * @return the matrix corresponding to the instance
   */
  public double[][] getMatrix() {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17809);

    // products
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17810);double q0q0  = q0 * q0;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17811);double q0q1  = q0 * q1;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17812);double q0q2  = q0 * q2;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17813);double q0q3  = q0 * q3;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17814);double q1q1  = q1 * q1;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17815);double q1q2  = q1 * q2;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17816);double q1q3  = q1 * q3;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17817);double q2q2  = q2 * q2;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17818);double q2q3  = q2 * q3;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17819);double q3q3  = q3 * q3;

    // create the matrix
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17820);double[][] m = new double[3][];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17821);m[0] = new double[3];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17822);m[1] = new double[3];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17823);m[2] = new double[3];

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17824);m [0][0] = 2.0 * (q0q0 + q1q1) - 1.0;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17825);m [1][0] = 2.0 * (q1q2 - q0q3);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17826);m [2][0] = 2.0 * (q1q3 + q0q2);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17827);m [0][1] = 2.0 * (q1q2 + q0q3);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17828);m [1][1] = 2.0 * (q0q0 + q2q2) - 1.0;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17829);m [2][1] = 2.0 * (q2q3 - q0q1);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17830);m [0][2] = 2.0 * (q1q3 - q0q2);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17831);m [1][2] = 2.0 * (q2q3 + q0q1);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17832);m [2][2] = 2.0 * (q0q0 + q3q3) - 1.0;

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17833);return m;

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Apply the rotation to a vector.
   * @param u vector to apply the rotation to
   * @return a new vector which is the image of u by the rotation
   */
  public Vector3D applyTo(Vector3D u) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17834);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17835);double x = u.getX();
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17836);double y = u.getY();
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17837);double z = u.getZ();

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17838);double s = q1 * x + q2 * y + q3 * z;

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17839);return new Vector3D(2 * (q0 * (x * q0 - (q2 * z - q3 * y)) + s * q1) - x,
                        2 * (q0 * (y * q0 - (q3 * x - q1 * z)) + s * q2) - y,
                        2 * (q0 * (z * q0 - (q1 * y - q2 * x)) + s * q3) - z);

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Apply the rotation to a vector stored in an array.
   * @param in an array with three items which stores vector to rotate
   * @param out an array with three items to put result to (it can be the same
   * array as in)
   */
  public void applyTo(final double[] in, final double[] out) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17840);

      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17841);final double x = in[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17842);final double y = in[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17843);final double z = in[2];

      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17844);final double s = q1 * x + q2 * y + q3 * z;

      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17845);out[0] = 2 * (q0 * (x * q0 - (q2 * z - q3 * y)) + s * q1) - x;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17846);out[1] = 2 * (q0 * (y * q0 - (q3 * x - q1 * z)) + s * q2) - y;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17847);out[2] = 2 * (q0 * (z * q0 - (q1 * y - q2 * x)) + s * q3) - z;

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Apply the inverse of the rotation to a vector.
   * @param u vector to apply the inverse of the rotation to
   * @return a new vector which such that u is its image by the rotation
   */
  public Vector3D applyInverseTo(Vector3D u) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17848);

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17849);double x = u.getX();
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17850);double y = u.getY();
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17851);double z = u.getZ();

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17852);double s = q1 * x + q2 * y + q3 * z;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17853);double m0 = -q0;

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17854);return new Vector3D(2 * (m0 * (x * m0 - (q2 * z - q3 * y)) + s * q1) - x,
                        2 * (m0 * (y * m0 - (q3 * x - q1 * z)) + s * q2) - y,
                        2 * (m0 * (z * m0 - (q1 * y - q2 * x)) + s * q3) - z);

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Apply the inverse of the rotation to a vector stored in an array.
   * @param in an array with three items which stores vector to rotate
   * @param out an array with three items to put result to (it can be the same
   * array as in)
   */
  public void applyInverseTo(final double[] in, final double[] out) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17855);

      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17856);final double x = in[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17857);final double y = in[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17858);final double z = in[2];

      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17859);final double s = q1 * x + q2 * y + q3 * z;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17860);final double m0 = -q0;

      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17861);out[0] = 2 * (m0 * (x * m0 - (q2 * z - q3 * y)) + s * q1) - x;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17862);out[1] = 2 * (m0 * (y * m0 - (q3 * x - q1 * z)) + s * q2) - y;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17863);out[2] = 2 * (m0 * (z * m0 - (q1 * y - q2 * x)) + s * q3) - z;

  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

  /** Apply the instance to another rotation.
   * Applying the instance to a rotation is computing the composition
   * in an order compliant with the following rule : let u be any
   * vector and v its image by r (i.e. r.applyTo(u) = v), let w be the image
   * of v by the instance (i.e. applyTo(v) = w), then w = comp.applyTo(u),
   * where comp = applyTo(r).
   * @param r rotation to apply the rotation to
   * @return a new rotation which is the composition of r by the instance
   */
  public Rotation applyTo(Rotation r) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17864);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17865);return new Rotation(r.q0 * q0 - (r.q1 * q1 + r.q2 * q2 + r.q3 * q3),
                        r.q1 * q0 + r.q0 * q1 + (r.q2 * q3 - r.q3 * q2),
                        r.q2 * q0 + r.q0 * q2 + (r.q3 * q1 - r.q1 * q3),
                        r.q3 * q0 + r.q0 * q3 + (r.q1 * q2 - r.q2 * q1),
                        false);
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

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
  public Rotation applyInverseTo(Rotation r) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17866);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17867);return new Rotation(-r.q0 * q0 - (r.q1 * q1 + r.q2 * q2 + r.q3 * q3),
                        -r.q1 * q0 + r.q0 * q1 + (r.q2 * q3 - r.q3 * q2),
                        -r.q2 * q0 + r.q0 * q2 + (r.q3 * q1 - r.q1 * q3),
                        -r.q3 * q0 + r.q0 * q3 + (r.q1 * q2 - r.q2 * q1),
                        false);
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

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
  private double[][] orthogonalizeMatrix(double[][] m, double threshold)
    throws NotARotationMatrixException {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17868);
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17869);double[] m0 = m[0];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17870);double[] m1 = m[1];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17871);double[] m2 = m[2];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17872);double x00 = m0[0];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17873);double x01 = m0[1];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17874);double x02 = m0[2];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17875);double x10 = m1[0];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17876);double x11 = m1[1];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17877);double x12 = m1[2];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17878);double x20 = m2[0];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17879);double x21 = m2[1];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17880);double x22 = m2[2];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17881);double fn = 0;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17882);double fn1;

    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17883);double[][] o = new double[3][3];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17884);double[] o0 = o[0];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17885);double[] o1 = o[1];
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17886);double[] o2 = o[2];

    // iterative correction: Xn+1 = Xn - 0.5 * (Xn.Mt.Xn - M)
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17887);int i = 0;
    __CLR4_4_1dj6dj6lb90p8ax.R.inc(17888);while ((((++i < 11)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17889)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17890)==0&false))) {{

      // Mt.Xn
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17891);double mx00 = m0[0] * x00 + m1[0] * x10 + m2[0] * x20;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17892);double mx10 = m0[1] * x00 + m1[1] * x10 + m2[1] * x20;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17893);double mx20 = m0[2] * x00 + m1[2] * x10 + m2[2] * x20;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17894);double mx01 = m0[0] * x01 + m1[0] * x11 + m2[0] * x21;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17895);double mx11 = m0[1] * x01 + m1[1] * x11 + m2[1] * x21;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17896);double mx21 = m0[2] * x01 + m1[2] * x11 + m2[2] * x21;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17897);double mx02 = m0[0] * x02 + m1[0] * x12 + m2[0] * x22;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17898);double mx12 = m0[1] * x02 + m1[1] * x12 + m2[1] * x22;
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17899);double mx22 = m0[2] * x02 + m1[2] * x12 + m2[2] * x22;

      // Xn+1
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17900);o0[0] = x00 - 0.5 * (x00 * mx00 + x01 * mx10 + x02 * mx20 - m0[0]);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17901);o0[1] = x01 - 0.5 * (x00 * mx01 + x01 * mx11 + x02 * mx21 - m0[1]);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17902);o0[2] = x02 - 0.5 * (x00 * mx02 + x01 * mx12 + x02 * mx22 - m0[2]);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17903);o1[0] = x10 - 0.5 * (x10 * mx00 + x11 * mx10 + x12 * mx20 - m1[0]);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17904);o1[1] = x11 - 0.5 * (x10 * mx01 + x11 * mx11 + x12 * mx21 - m1[1]);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17905);o1[2] = x12 - 0.5 * (x10 * mx02 + x11 * mx12 + x12 * mx22 - m1[2]);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17906);o2[0] = x20 - 0.5 * (x20 * mx00 + x21 * mx10 + x22 * mx20 - m2[0]);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17907);o2[1] = x21 - 0.5 * (x20 * mx01 + x21 * mx11 + x22 * mx21 - m2[1]);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17908);o2[2] = x22 - 0.5 * (x20 * mx02 + x21 * mx12 + x22 * mx22 - m2[2]);

      // correction on each elements
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17909);double corr00 = o0[0] - m0[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17910);double corr01 = o0[1] - m0[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17911);double corr02 = o0[2] - m0[2];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17912);double corr10 = o1[0] - m1[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17913);double corr11 = o1[1] - m1[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17914);double corr12 = o1[2] - m1[2];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17915);double corr20 = o2[0] - m2[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17916);double corr21 = o2[1] - m2[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17917);double corr22 = o2[2] - m2[2];

      // Frobenius norm of the correction
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17918);fn1 = corr00 * corr00 + corr01 * corr01 + corr02 * corr02 +
            corr10 * corr10 + corr11 * corr11 + corr12 * corr12 +
            corr20 * corr20 + corr21 * corr21 + corr22 * corr22;

      // convergence test
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17919);if ((((FastMath.abs(fn1 - fn) <= threshold)&&(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17920)!=0|true))||(__CLR4_4_1dj6dj6lb90p8ax.R.iget(17921)==0&false))) {{
          __CLR4_4_1dj6dj6lb90p8ax.R.inc(17922);return o;
      }

      // prepare next iteration
      }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17923);x00 = o0[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17924);x01 = o0[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17925);x02 = o0[2];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17926);x10 = o1[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17927);x11 = o1[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17928);x12 = o1[2];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17929);x20 = o2[0];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17930);x21 = o2[1];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17931);x22 = o2[2];
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17932);fn  = fn1;

    }

    // the algorithm did not converge after 10 iterations
    }__CLR4_4_1dj6dj6lb90p8ax.R.inc(17933);throw new NotARotationMatrixException(
            LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX,
            i - 1);
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

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
   * @return <i>distance</i> between r1 and r2
   */
  public static double distance(Rotation r1, Rotation r2) {try{__CLR4_4_1dj6dj6lb90p8ax.R.inc(17934);
      __CLR4_4_1dj6dj6lb90p8ax.R.inc(17935);return r1.applyInverseTo(r2).getAngle();
  }finally{__CLR4_4_1dj6dj6lb90p8ax.R.flushNeeded();}}

}
