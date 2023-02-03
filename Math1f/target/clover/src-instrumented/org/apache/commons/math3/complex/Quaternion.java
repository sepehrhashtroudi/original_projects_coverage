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

package org.apache.commons.math3.complex;

import java.io.Serializable;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * This class implements <a href="http://mathworld.wolfram.com/Quaternion.html">
 * quaternions</a> (Hamilton's hypercomplex numbers).
 * <br/>
 * Instance of this class are guaranteed to be immutable.
 *
 * @since 3.1
 * @version $Id$
 */
public final class Quaternion implements Serializable {public static class __CLR4_4_1582582lb90p797{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,6881,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Identity quaternion. */
    public static final Quaternion IDENTITY = new Quaternion(1, 0, 0, 0);
    /** Zero quaternion. */
    public static final Quaternion ZERO = new Quaternion(0, 0, 0, 0);
    /** i */
    public static final Quaternion I = new Quaternion(0, 1, 0, 0);
    /** j */
    public static final Quaternion J = new Quaternion(0, 0, 1, 0);
    /** k */
    public static final Quaternion K = new Quaternion(0, 0, 0, 1);

    /** Serializable version identifier. */
    private static final long serialVersionUID = 20092012L;

    /** First component (scalar part). */
    private final double q0;
    /** Second component (first vector part). */
    private final double q1;
    /** Third component (second vector part). */
    private final double q2;
    /** Fourth component (third vector part). */
    private final double q3;

    /**
     * Builds a quaternion from its components.
     *
     * @param a Scalar component.
     * @param b First vector component.
     * @param c Second vector component.
     * @param d Third vector component.
     */
    public Quaternion(final double a,
                      final double b,
                      final double c,
                      final double d) {try{__CLR4_4_1582582lb90p797.R.inc(6770);
        __CLR4_4_1582582lb90p797.R.inc(6771);this.q0 = a;
        __CLR4_4_1582582lb90p797.R.inc(6772);this.q1 = b;
        __CLR4_4_1582582lb90p797.R.inc(6773);this.q2 = c;
        __CLR4_4_1582582lb90p797.R.inc(6774);this.q3 = d;
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Builds a quaternion from scalar and vector parts.
     *
     * @param scalar Scalar part of the quaternion.
     * @param v Components of the vector part of the quaternion.
     *
     * @throws DimensionMismatchException if the array length is not 3.
     */
    public Quaternion(final double scalar,
                      final double[] v)
        throws DimensionMismatchException {try{__CLR4_4_1582582lb90p797.R.inc(6775);
        __CLR4_4_1582582lb90p797.R.inc(6776);if ((((v.length != 3)&&(__CLR4_4_1582582lb90p797.R.iget(6777)!=0|true))||(__CLR4_4_1582582lb90p797.R.iget(6778)==0&false))) {{
            __CLR4_4_1582582lb90p797.R.inc(6779);throw new DimensionMismatchException(v.length, 3);
        }
        }__CLR4_4_1582582lb90p797.R.inc(6780);this.q0 = scalar;
        __CLR4_4_1582582lb90p797.R.inc(6781);this.q1 = v[0];
        __CLR4_4_1582582lb90p797.R.inc(6782);this.q2 = v[1];
        __CLR4_4_1582582lb90p797.R.inc(6783);this.q3 = v[2];
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Builds a pure quaternion from a vector (assuming that the scalar
     * part is zero).
     *
     * @param v Components of the vector part of the pure quaternion.
     */
    public Quaternion(final double[] v) {
        this(0, v);__CLR4_4_1582582lb90p797.R.inc(6785);try{__CLR4_4_1582582lb90p797.R.inc(6784);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Returns the conjugate quaternion of the instance.
     *
     * @return the conjugate quaternion
     */
    public Quaternion getConjugate() {try{__CLR4_4_1582582lb90p797.R.inc(6786);
        __CLR4_4_1582582lb90p797.R.inc(6787);return new Quaternion(q0, -q1, -q2, -q3);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Returns the Hamilton product of two quaternions.
     *
     * @param q1 First quaternion.
     * @param q2 Second quaternion.
     * @return the product {@code q1} and {@code q2}, in that order.
     */
    public static Quaternion multiply(final Quaternion q1, final Quaternion q2) {try{__CLR4_4_1582582lb90p797.R.inc(6788);
        // Components of the first quaternion.
        __CLR4_4_1582582lb90p797.R.inc(6789);final double q1a = q1.getQ0();
        __CLR4_4_1582582lb90p797.R.inc(6790);final double q1b = q1.getQ1();
        __CLR4_4_1582582lb90p797.R.inc(6791);final double q1c = q1.getQ2();
        __CLR4_4_1582582lb90p797.R.inc(6792);final double q1d = q1.getQ3();

        // Components of the second quaternion.
        __CLR4_4_1582582lb90p797.R.inc(6793);final double q2a = q2.getQ0();
        __CLR4_4_1582582lb90p797.R.inc(6794);final double q2b = q2.getQ1();
        __CLR4_4_1582582lb90p797.R.inc(6795);final double q2c = q2.getQ2();
        __CLR4_4_1582582lb90p797.R.inc(6796);final double q2d = q2.getQ3();

        // Components of the product.
        __CLR4_4_1582582lb90p797.R.inc(6797);final double w = q1a * q2a - q1b * q2b - q1c * q2c - q1d * q2d;
        __CLR4_4_1582582lb90p797.R.inc(6798);final double x = q1a * q2b + q1b * q2a + q1c * q2d - q1d * q2c;
        __CLR4_4_1582582lb90p797.R.inc(6799);final double y = q1a * q2c - q1b * q2d + q1c * q2a + q1d * q2b;
        __CLR4_4_1582582lb90p797.R.inc(6800);final double z = q1a * q2d + q1b * q2c - q1c * q2b + q1d * q2a;

        __CLR4_4_1582582lb90p797.R.inc(6801);return new Quaternion(w, x, y, z);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Returns the Hamilton product of the instance by a quaternion.
     *
     * @param q Quaternion.
     * @return the product of this instance with {@code q}, in that order.
     */
    public Quaternion multiply(final Quaternion q) {try{__CLR4_4_1582582lb90p797.R.inc(6802);
        __CLR4_4_1582582lb90p797.R.inc(6803);return multiply(this, q);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Computes the sum of two quaternions.
     *
     * @param q1 Quaternion.
     * @param q2 Quaternion.
     * @return the sum of {@code q1} and {@code q2}.
     */
    public static Quaternion add(final Quaternion q1,
                                 final Quaternion q2) {try{__CLR4_4_1582582lb90p797.R.inc(6804);
        __CLR4_4_1582582lb90p797.R.inc(6805);return new Quaternion(q1.getQ0() + q2.getQ0(),
                              q1.getQ1() + q2.getQ1(),
                              q1.getQ2() + q2.getQ2(),
                              q1.getQ3() + q2.getQ3());
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Computes the sum of the instance and another quaternion.
     *
     * @param q Quaternion.
     * @return the sum of this instance and {@code q}
     */
    public Quaternion add(final Quaternion q) {try{__CLR4_4_1582582lb90p797.R.inc(6806);
        __CLR4_4_1582582lb90p797.R.inc(6807);return add(this, q);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Subtracts two quaternions.
     *
     * @param q1 First Quaternion.
     * @param q2 Second quaternion.
     * @return the difference between {@code q1} and {@code q2}.
     */
    public static Quaternion subtract(final Quaternion q1,
                                      final Quaternion q2) {try{__CLR4_4_1582582lb90p797.R.inc(6808);
        __CLR4_4_1582582lb90p797.R.inc(6809);return new Quaternion(q1.getQ0() - q2.getQ0(),
                              q1.getQ1() - q2.getQ1(),
                              q1.getQ2() - q2.getQ2(),
                              q1.getQ3() - q2.getQ3());
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Subtracts a quaternion from the instance.
     *
     * @param q Quaternion.
     * @return the difference between this instance and {@code q}.
     */
    public Quaternion subtract(final Quaternion q) {try{__CLR4_4_1582582lb90p797.R.inc(6810);
        __CLR4_4_1582582lb90p797.R.inc(6811);return subtract(this, q);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Computes the dot-product of two quaternions.
     *
     * @param q1 Quaternion.
     * @param q2 Quaternion.
     * @return the dot product of {@code q1} and {@code q2}.
     */
    public static double dotProduct(final Quaternion q1,
                                    final Quaternion q2) {try{__CLR4_4_1582582lb90p797.R.inc(6812);
        __CLR4_4_1582582lb90p797.R.inc(6813);return q1.getQ0() * q2.getQ0() +
            q1.getQ1() * q2.getQ1() +
            q1.getQ2() * q2.getQ2() +
            q1.getQ3() * q2.getQ3();
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Computes the dot-product of the instance by a quaternion.
     *
     * @param q Quaternion.
     * @return the dot product of this instance and {@code q}.
     */
    public double dotProduct(final Quaternion q) {try{__CLR4_4_1582582lb90p797.R.inc(6814);
        __CLR4_4_1582582lb90p797.R.inc(6815);return dotProduct(this, q);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Computes the norm of the quaternion.
     *
     * @return the norm.
     */
    public double getNorm() {try{__CLR4_4_1582582lb90p797.R.inc(6816);
        __CLR4_4_1582582lb90p797.R.inc(6817);return FastMath.sqrt(q0 * q0 +
                             q1 * q1 +
                             q2 * q2 +
                             q3 * q3);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Computes the normalized quaternion (the versor of the instance).
     * The norm of the quaternion must not be zero.
     *
     * @return a normalized quaternion.
     * @throws ZeroException if the norm of the quaternion is zero.
     */
    public Quaternion normalize() {try{__CLR4_4_1582582lb90p797.R.inc(6818);
        __CLR4_4_1582582lb90p797.R.inc(6819);final double norm = getNorm();

        __CLR4_4_1582582lb90p797.R.inc(6820);if ((((norm < Precision.SAFE_MIN)&&(__CLR4_4_1582582lb90p797.R.iget(6821)!=0|true))||(__CLR4_4_1582582lb90p797.R.iget(6822)==0&false))) {{
            __CLR4_4_1582582lb90p797.R.inc(6823);throw new ZeroException(LocalizedFormats.NORM, norm);
        }

        }__CLR4_4_1582582lb90p797.R.inc(6824);return new Quaternion(q0 / norm,
                              q1 / norm,
                              q2 / norm,
                              q3 / norm);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1582582lb90p797.R.inc(6825);
        __CLR4_4_1582582lb90p797.R.inc(6826);if ((((this == other)&&(__CLR4_4_1582582lb90p797.R.iget(6827)!=0|true))||(__CLR4_4_1582582lb90p797.R.iget(6828)==0&false))) {{
            __CLR4_4_1582582lb90p797.R.inc(6829);return true;
        }
        }__CLR4_4_1582582lb90p797.R.inc(6830);if ((((other instanceof Quaternion)&&(__CLR4_4_1582582lb90p797.R.iget(6831)!=0|true))||(__CLR4_4_1582582lb90p797.R.iget(6832)==0&false))) {{
            __CLR4_4_1582582lb90p797.R.inc(6833);final Quaternion q = (Quaternion) other;
            __CLR4_4_1582582lb90p797.R.inc(6834);return q0 == q.getQ0() &&
                q1 == q.getQ1() &&
                q2 == q.getQ2() &&
                q3 == q.getQ3();
        }

        }__CLR4_4_1582582lb90p797.R.inc(6835);return false;
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_1582582lb90p797.R.inc(6836);
        // "Effective Java" (second edition, p. 47).
        __CLR4_4_1582582lb90p797.R.inc(6837);int result = 17;
        __CLR4_4_1582582lb90p797.R.inc(6838);for (double comp : new double[] { q0, q1, q2, q3 }) {{
            __CLR4_4_1582582lb90p797.R.inc(6839);final int c = MathUtils.hash(comp);
            __CLR4_4_1582582lb90p797.R.inc(6840);result = 31 * result + c;
        }
        }__CLR4_4_1582582lb90p797.R.inc(6841);return result;
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Checks whether this instance is equal to another quaternion
     * within a given tolerance.
     *
     * @param q Quaternion with which to compare the current quaternion.
     * @param eps Tolerance.
     * @return {@code true} if the each of the components are equal
     * within the allowed absolute error.
     */
    public boolean equals(final Quaternion q,
                          final double eps) {try{__CLR4_4_1582582lb90p797.R.inc(6842);
        __CLR4_4_1582582lb90p797.R.inc(6843);return Precision.equals(q0, q.getQ0(), eps) &&
            Precision.equals(q1, q.getQ1(), eps) &&
            Precision.equals(q2, q.getQ2(), eps) &&
            Precision.equals(q3, q.getQ3(), eps);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Checks whether the instance is a unit quaternion within a given
     * tolerance.
     *
     * @param eps Tolerance (absolute error).
     * @return {@code true} if the norm is 1 within the given tolerance,
     * {@code false} otherwise
     */
    public boolean isUnitQuaternion(double eps) {try{__CLR4_4_1582582lb90p797.R.inc(6844);
        __CLR4_4_1582582lb90p797.R.inc(6845);return Precision.equals(getNorm(), 1d, eps);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Checks whether the instance is a pure quaternion within a given
     * tolerance.
     *
     * @param eps Tolerance (absolute error).
     * @return {@code true} if the scalar part of the quaternion is zero.
     */
    public boolean isPureQuaternion(double eps) {try{__CLR4_4_1582582lb90p797.R.inc(6846);
        __CLR4_4_1582582lb90p797.R.inc(6847);return FastMath.abs(getQ0()) <= eps;
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Returns the polar form of the quaternion.
     *
     * @return the unit quaternion with positive scalar part.
     */
    public Quaternion getPositivePolarForm() {try{__CLR4_4_1582582lb90p797.R.inc(6848);
        __CLR4_4_1582582lb90p797.R.inc(6849);if ((((getQ0() < 0)&&(__CLR4_4_1582582lb90p797.R.iget(6850)!=0|true))||(__CLR4_4_1582582lb90p797.R.iget(6851)==0&false))) {{
            __CLR4_4_1582582lb90p797.R.inc(6852);final Quaternion unitQ = normalize();
            // The quaternion of rotation (normalized quaternion) q and -q
            // are equivalent (i.e. represent the same rotation).
            __CLR4_4_1582582lb90p797.R.inc(6853);return new Quaternion(-unitQ.getQ0(),
                                  -unitQ.getQ1(),
                                  -unitQ.getQ2(),
                                  -unitQ.getQ3());
        } }else {{
            __CLR4_4_1582582lb90p797.R.inc(6854);return this.normalize();
        }
    }}finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Returns the inverse of this instance.
     * The norm of the quaternion must not be zero.
     *
     * @return the inverse.
     * @throws ZeroException if the norm (squared) of the quaternion is zero.
     */
    public Quaternion getInverse() {try{__CLR4_4_1582582lb90p797.R.inc(6855);
        __CLR4_4_1582582lb90p797.R.inc(6856);final double squareNorm = q0 * q0 + q1 * q1 + q2 * q2 + q3 * q3;
        __CLR4_4_1582582lb90p797.R.inc(6857);if ((((squareNorm < Precision.SAFE_MIN)&&(__CLR4_4_1582582lb90p797.R.iget(6858)!=0|true))||(__CLR4_4_1582582lb90p797.R.iget(6859)==0&false))) {{
            __CLR4_4_1582582lb90p797.R.inc(6860);throw new ZeroException(LocalizedFormats.NORM, squareNorm);
        }

        }__CLR4_4_1582582lb90p797.R.inc(6861);return new Quaternion(q0 / squareNorm,
                              -q1 / squareNorm,
                              -q2 / squareNorm,
                              -q3 / squareNorm);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Gets the first component of the quaternion (scalar part).
     *
     * @return the scalar part.
     */
    public double getQ0() {try{__CLR4_4_1582582lb90p797.R.inc(6862);
        __CLR4_4_1582582lb90p797.R.inc(6863);return q0;
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Gets the second component of the quaternion (first component
     * of the vector part).
     *
     * @return the first component of the vector part.
     */
    public double getQ1() {try{__CLR4_4_1582582lb90p797.R.inc(6864);
        __CLR4_4_1582582lb90p797.R.inc(6865);return q1;
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Gets the third component of the quaternion (second component
     * of the vector part).
     *
     * @return the second component of the vector part.
     */
    public double getQ2() {try{__CLR4_4_1582582lb90p797.R.inc(6866);
        __CLR4_4_1582582lb90p797.R.inc(6867);return q2;
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Gets the fourth component of the quaternion (third component
     * of the vector part).
     *
     * @return the third component of the vector part.
     */
    public double getQ3() {try{__CLR4_4_1582582lb90p797.R.inc(6868);
        __CLR4_4_1582582lb90p797.R.inc(6869);return q3;
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Gets the scalar part of the quaternion.
     *
     * @return the scalar part.
     * @see #getQ0()
     */
    public double getScalarPart() {try{__CLR4_4_1582582lb90p797.R.inc(6870);
        __CLR4_4_1582582lb90p797.R.inc(6871);return getQ0();
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Gets the three components of the vector part of the quaternion.
     *
     * @return the vector part.
     * @see #getQ1()
     * @see #getQ2()
     * @see #getQ3()
     */
    public double[] getVectorPart() {try{__CLR4_4_1582582lb90p797.R.inc(6872);
        __CLR4_4_1582582lb90p797.R.inc(6873);return new double[] { getQ1(), getQ2(), getQ3() };
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * Multiplies the instance by a scalar.
     *
     * @param alpha Scalar factor.
     * @return a scaled quaternion.
     */
    public Quaternion multiply(final double alpha) {try{__CLR4_4_1582582lb90p797.R.inc(6874);
        __CLR4_4_1582582lb90p797.R.inc(6875);return new Quaternion(alpha * q0,
                              alpha * q1,
                              alpha * q2,
                              alpha * q3);
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_1582582lb90p797.R.inc(6876);
        __CLR4_4_1582582lb90p797.R.inc(6877);final String sp = " ";
        __CLR4_4_1582582lb90p797.R.inc(6878);final StringBuilder s = new StringBuilder();
        __CLR4_4_1582582lb90p797.R.inc(6879);s.append("[")
            .append(q0).append(sp)
            .append(q1).append(sp)
            .append(q2).append(sp)
            .append(q3)
            .append("]");

        __CLR4_4_1582582lb90p797.R.inc(6880);return s.toString();
    }finally{__CLR4_4_1582582lb90p797.R.flushNeeded();}}
}
